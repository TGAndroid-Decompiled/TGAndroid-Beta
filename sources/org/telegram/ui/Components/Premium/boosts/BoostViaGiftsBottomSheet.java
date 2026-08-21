package org.telegram.ui.Components.Premium.boosts;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.boosts.adapters.BoostAdapter;
import org.telegram.ui.Components.Premium.boosts.cells.ActionBtnCell;
import org.telegram.ui.Components.Premium.boosts.cells.AddChannelCell;
import org.telegram.ui.Components.Premium.boosts.cells.BaseCell;
import org.telegram.ui.Components.Premium.boosts.cells.BoostTypeCell;
import org.telegram.ui.Components.Premium.boosts.cells.ChatCell;
import org.telegram.ui.Components.Premium.boosts.cells.DateEndCell;
import org.telegram.ui.Components.Premium.boosts.cells.DurationCell;
import org.telegram.ui.Components.Premium.boosts.cells.EnterPrizeCell;
import org.telegram.ui.Components.Premium.boosts.cells.ParticipantsTypeCell;
import org.telegram.ui.Components.Premium.boosts.cells.StarGiveawayOptionCell;
import org.telegram.ui.Components.Premium.boosts.cells.SwitcherCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;

public class BoostViaGiftsBottomSheet extends BottomSheetWithRecyclerListView implements SelectorBottomSheet.SelectedObjectsListener, NotificationCenter.NotificationCenterDelegate {
    private ActionBtnCell actionBtn;
    private ActionListener actionListener;
    private BoostAdapter adapter;
    private String additionalPrize;
    private final TLRPC.Chat currentChat;
    private final List giftCodeOptions;
    private final Runnable hideKeyboardRunnable;
    private boolean isAdditionalPrizeSelected;
    private boolean isShowWinnersSelected;
    private final ArrayList items;
    private Runnable onCloseClick;
    private final TL_stories.PrepaidGiveaway prepaidGiveaway;
    private int selectedBoostSubType;
    private int selectedBoostType;
    private final List selectedChats;
    private final List selectedCountries;
    private long selectedEndDate;
    private int selectedMonths;
    private int selectedParticipantsType;
    private int selectedSliderIndex;
    private long selectedStars;
    private int selectedStarsSliderIndex;
    private final List selectedUsers;
    private final List sliderStarsValues;
    private final List sliderValues;
    private boolean starOptionsExpanded;
    private final List starsNotExtended;
    private int top;

    public interface ActionListener {
        void onAddChat(List list);

        void onSelectCountries(List list);

        void onSelectUser(List list);
    }

    @Override
    protected boolean needPaddingShadow() {
        return false;
    }

    @Override
    public void onShowToast(String str) {
        SelectorBottomSheet.SelectedObjectsListener.CC.$default$onShowToast(this, str);
    }

    public BoostViaGiftsBottomSheet(final BaseFragment baseFragment, boolean z, boolean z2, final long j, final TL_stories.PrepaidGiveaway prepaidGiveaway) {
        List listAsList;
        super(baseFragment, z, z2);
        ArrayList arrayList = new ArrayList();
        this.items = arrayList;
        this.sliderValues = BoostRepository.isGoogleBillingAvailable() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        if (BoostRepository.isGoogleBillingAvailable()) {
            listAsList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            listAsList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.sliderStarsValues = listAsList;
        this.starsNotExtended = Arrays.asList(750, 10000, 50000);
        this.selectedChats = new ArrayList();
        this.selectedUsers = new ArrayList();
        this.selectedCountries = new ArrayList();
        this.giftCodeOptions = new ArrayList();
        this.selectedBoostType = BoostTypeCell.TYPE_PREMIUM;
        this.selectedBoostSubType = BoostTypeCell.TYPE_GIVEAWAY;
        this.selectedParticipantsType = ParticipantsTypeCell.TYPE_ALL;
        this.selectedMonths = 12;
        this.selectedEndDate = BoostDialogs.getThreeDaysAfterToday();
        this.selectedSliderIndex = 2;
        this.selectedStarsSliderIndex = 2;
        this.additionalPrize = "";
        this.isShowWinnersSelected = true;
        this.hideKeyboardRunnable = new Runnable() {
            @Override
            public final void run() {
                AndroidUtilities.hideKeyboard(this.f$0.recyclerListView);
            }
        };
        this.prepaidGiveaway = prepaidGiveaway;
        this.topPadding = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        updateTitle();
        ((ViewGroup.MarginLayoutParams) this.actionBar.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.actionBar.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            this.selectedBoostType = BoostTypeCell.TYPE_STARS;
        }
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, AndroidUtilities.dp(68.0f));
        this.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                if (i2 == 1) {
                    AndroidUtilities.hideKeyboard(recyclerView);
                }
            }
        });
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                BoostViaGiftsBottomSheet.$r8$lambda$nKcwxS4D2AMPFehyMFUYQ2vUyos(this.f$0, baseFragment, view, i2);
            }
        });
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        this.currentChat = chat;
        this.adapter.setItems(chat, arrayList, this.recyclerListView, new SlideChooseView.Callback() {
            @Override
            public final void onOptionSelected(int i2) {
                BoostViaGiftsBottomSheet.m2634$r8$lambda$9sicDQhv4jz2gJRm7Od1nh7NtE(this.f$0, i2);
            }

            @Override
            public void onTouchEnd() {
                SlideChooseView.Callback.CC.$default$onTouchEnd(this);
            }
        }, new ChatCell.ChatDeleteListener() {
            @Override
            public final void onChatDeleted(TLRPC.Chat chat2) {
                BoostViaGiftsBottomSheet.m2639$r8$lambda$KydXvLavnzYW94jGjRNO7o2ZM8(this.f$0, chat2);
            }
        }, new EnterPrizeCell.AfterTextChangedListener() {
            @Override
            public final void afterTextChanged(String str) {
                BoostViaGiftsBottomSheet.$r8$lambda$gQpph1_gDDRwNLcXh6ivjPkILM8(this.f$0, str);
            }
        });
        updateRows(false, false);
        ActionBtnCell actionBtnCell = new ActionBtnCell(getContext(), this.resourcesProvider);
        this.actionBtn = actionBtnCell;
        actionBtnCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BoostViaGiftsBottomSheet.m2640$r8$lambda$PRItOfs7H08UfDJljjQkmFMFmw(this.f$0, prepaidGiveaway, j, baseFragment, view);
            }
        });
        updateActionButton(false);
        this.containerView.addView(this.actionBtn, LayoutHelper.createFrame(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        loadOptions();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void $r8$lambda$nKcwxS4D2AMPFehyMFUYQ2vUyos(final BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, BaseFragment baseFragment, View view, int i) {
        ActionListener actionListener;
        boostViaGiftsBottomSheet.getClass();
        if (view instanceof SwitcherCell) {
            SwitcherCell switcherCell = (SwitcherCell) view;
            int type = switcherCell.getType();
            boolean z = !switcherCell.isChecked();
            switcherCell.setChecked(z);
            if (type == SwitcherCell.TYPE_WINNERS) {
                boostViaGiftsBottomSheet.isShowWinnersSelected = z;
                boostViaGiftsBottomSheet.updateRows(false, false);
            } else if (type == SwitcherCell.TYPE_ADDITION_PRIZE) {
                switcherCell.setDivider(z);
                boostViaGiftsBottomSheet.isAdditionalPrizeSelected = z;
                boostViaGiftsBottomSheet.updateRows(false, false);
                boostViaGiftsBottomSheet.adapter.notifyAdditionalPrizeItem(z);
                boostViaGiftsBottomSheet.adapter.notifyAllVisibleTextDividers();
                if (!boostViaGiftsBottomSheet.isAdditionalPrizeSelected) {
                    AndroidUtilities.runOnUIThread(boostViaGiftsBottomSheet.hideKeyboardRunnable, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(boostViaGiftsBottomSheet.hideKeyboardRunnable);
                }
            }
        }
        if (view instanceof BaseCell) {
            if (view instanceof BoostTypeCell) {
                int selectedType = ((BoostTypeCell) view).getSelectedType();
                if (selectedType == BoostTypeCell.TYPE_PREMIUM || selectedType == BoostTypeCell.TYPE_STARS) {
                    if (selectedType == BoostTypeCell.TYPE_PREMIUM && boostViaGiftsBottomSheet.selectedBoostType == selectedType) {
                        ActionListener actionListener2 = boostViaGiftsBottomSheet.actionListener;
                        if (actionListener2 != null) {
                            actionListener2.onSelectUser(boostViaGiftsBottomSheet.selectedUsers);
                            return;
                        }
                        return;
                    }
                    boostViaGiftsBottomSheet.selectedBoostType = selectedType;
                    boostViaGiftsBottomSheet.updateRows(true, true);
                    boostViaGiftsBottomSheet.updateActionButton(true);
                    boostViaGiftsBottomSheet.updateTitle();
                } else if (selectedType == BoostTypeCell.TYPE_SPECIFIC_USERS) {
                    ActionListener actionListener3 = boostViaGiftsBottomSheet.actionListener;
                    if (actionListener3 != null) {
                        actionListener3.onSelectUser(boostViaGiftsBottomSheet.selectedUsers);
                    }
                } else {
                    boostViaGiftsBottomSheet.selectedBoostSubType = selectedType;
                    boostViaGiftsBottomSheet.updateRows(true, true);
                    boostViaGiftsBottomSheet.updateActionButton(true);
                    boostViaGiftsBottomSheet.updateTitle();
                }
            } else {
                ((BaseCell) view).markChecked(boostViaGiftsBottomSheet.recyclerListView);
            }
        }
        if (view instanceof ParticipantsTypeCell) {
            int selectedType2 = ((ParticipantsTypeCell) view).getSelectedType();
            if (boostViaGiftsBottomSheet.selectedParticipantsType == selectedType2 && (actionListener = boostViaGiftsBottomSheet.actionListener) != null) {
                actionListener.onSelectCountries(boostViaGiftsBottomSheet.selectedCountries);
            }
            boostViaGiftsBottomSheet.selectedParticipantsType = selectedType2;
            boostViaGiftsBottomSheet.updateRows(false, false);
            return;
        }
        if (view instanceof DurationCell) {
            boostViaGiftsBottomSheet.selectedMonths = ((TLRPC.TL_premiumGiftCodeOption) ((DurationCell) view).getGifCode()).months;
            boostViaGiftsBottomSheet.updateRows(false, false);
            boostViaGiftsBottomSheet.adapter.notifyAllVisibleTextDividers();
            return;
        }
        if (view instanceof DateEndCell) {
            BoostDialogs.showDatePicker(baseFragment.getContext(), boostViaGiftsBottomSheet.selectedEndDate, new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z2, int i2, int i3) {
                    BoostViaGiftsBottomSheet.$r8$lambda$mpJXItGJFQlhRBpfsu2FGOcGXx8(this.f$0, z2, i2, i3);
                }
            }, boostViaGiftsBottomSheet.resourcesProvider);
            return;
        }
        if (view instanceof AddChannelCell) {
            ActionListener actionListener4 = boostViaGiftsBottomSheet.actionListener;
            if (actionListener4 != null) {
                actionListener4.onAddChat(boostViaGiftsBottomSheet.selectedChats);
                return;
            }
            return;
        }
        if (view instanceof StarGiveawayOptionCell) {
            TL_stars.TL_starsGiveawayOption option = ((StarGiveawayOptionCell) view).getOption();
            if (option != null) {
                boostViaGiftsBottomSheet.selectedStars = option.stars;
                boostViaGiftsBottomSheet.updateRows(true, true);
                boostViaGiftsBottomSheet.updateActionButton(true);
                boostViaGiftsBottomSheet.updateTitle();
                return;
            }
            return;
        }
        if (view instanceof StarsIntroActivity.ExpandView) {
            boostViaGiftsBottomSheet.starOptionsExpanded = true;
            boostViaGiftsBottomSheet.updateRows(true, true);
        }
    }

    public static void $r8$lambda$mpJXItGJFQlhRBpfsu2FGOcGXx8(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, boolean z, int i, int i2) {
        boostViaGiftsBottomSheet.selectedEndDate = ((long) i) * 1000;
        boostViaGiftsBottomSheet.updateRows(false, true);
    }

    public static void m2634$r8$lambda$9sicDQhv4jz2gJRm7Od1nh7NtE(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, int i) {
        if (boostViaGiftsBottomSheet.selectedBoostType == BoostTypeCell.TYPE_PREMIUM) {
            boostViaGiftsBottomSheet.selectedSliderIndex = i;
        } else {
            boostViaGiftsBottomSheet.selectedStarsSliderIndex = i;
        }
        boostViaGiftsBottomSheet.actionBtn.updateCounter(boostViaGiftsBottomSheet.getSelectedSliderValueWithBoosts());
        if (boostViaGiftsBottomSheet.selectedBoostType == BoostTypeCell.TYPE_STARS) {
            boostViaGiftsBottomSheet.updateRows(true, true);
        } else {
            boostViaGiftsBottomSheet.updateRows(false, false);
        }
        boostViaGiftsBottomSheet.adapter.updateBoostCounter(boostViaGiftsBottomSheet.getSelectedSliderValueWithBoosts());
    }

    public static void m2639$r8$lambda$KydXvLavnzYW94jGjRNO7o2ZM8(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, TLRPC.Chat chat) {
        boostViaGiftsBottomSheet.selectedChats.remove(chat);
        boostViaGiftsBottomSheet.updateRows(true, true);
    }

    public static void $r8$lambda$gQpph1_gDDRwNLcXh6ivjPkILM8(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, String str) {
        boostViaGiftsBottomSheet.additionalPrize = str;
        boostViaGiftsBottomSheet.updateRows(false, false);
        boostViaGiftsBottomSheet.updateRows(true, true);
    }

    public static void m2640$r8$lambda$PRItOfs7H08UfDJljjQkmFMFmw(final BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, final TL_stories.PrepaidGiveaway prepaidGiveaway, final long j, BaseFragment baseFragment, View view) {
        if (boostViaGiftsBottomSheet.actionBtn.isLoading()) {
            return;
        }
        if (boostViaGiftsBottomSheet.isPreparedGiveaway()) {
            final TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
            final long j2 = tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L;
            BoostDialogs.showStartGiveawayDialog(new Runnable() {
                @Override
                public final void run() {
                    BoostViaGiftsBottomSheet.m2636$r8$lambda$7x7WIhUZU4CwXrwbL0ONB70TDE(this.f$0, prepaidGiveaway, tL_prepaidStarsGiveaway, j, j2);
                }
            });
            return;
        }
        if (boostViaGiftsBottomSheet.selectedBoostType == BoostTypeCell.TYPE_STARS) {
            Activity activityFindActivity = AndroidUtilities.findActivity(boostViaGiftsBottomSheet.getContext());
            if (activityFindActivity == null) {
                activityFindActivity = LaunchActivity.instance;
            }
            Activity activity = activityFindActivity;
            if (activity == null || activity.isFinishing()) {
                return;
            }
            final TL_stars.TL_starsGiveawayOption selectedStarsOption = boostViaGiftsBottomSheet.getSelectedStarsOption();
            int selectedSliderValue = boostViaGiftsBottomSheet.getSelectedSliderValue();
            if (selectedStarsOption == null) {
                return;
            }
            boostViaGiftsBottomSheet.actionBtn.button.setLoading(true);
            StarsController.getInstance(boostViaGiftsBottomSheet.currentAccount).buyGiveaway(activity, boostViaGiftsBottomSheet.currentChat, boostViaGiftsBottomSheet.selectedChats, selectedStarsOption, selectedSliderValue, boostViaGiftsBottomSheet.selectedCountries, BoostRepository.prepareServerDate(boostViaGiftsBottomSheet.selectedEndDate), boostViaGiftsBottomSheet.isShowWinnersSelected, boostViaGiftsBottomSheet.selectedParticipantsType == ParticipantsTypeCell.TYPE_NEW, boostViaGiftsBottomSheet.isAdditionalPrizeSelected, boostViaGiftsBottomSheet.additionalPrize, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    BoostViaGiftsBottomSheet.$r8$lambda$eOabwdDs2TTK7h1bpk3s6Kk4zz8(this.f$0, selectedStarsOption, (Boolean) obj, (String) obj2);
                }
            });
            return;
        }
        if (boostViaGiftsBottomSheet.selectedBoostSubType == BoostTypeCell.TYPE_SPECIFIC_USERS) {
            List listFilterGiftOptions = BoostRepository.filterGiftOptions(boostViaGiftsBottomSheet.giftCodeOptions, boostViaGiftsBottomSheet.selectedUsers.size());
            for (int i = 0; i < listFilterGiftOptions.size(); i++) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) listFilterGiftOptions.get(i);
                if (tL_premiumGiftCodeOption.months == boostViaGiftsBottomSheet.selectedMonths && boostViaGiftsBottomSheet.selectedUsers.size() > 0) {
                    if (BoostRepository.isGoogleBillingAvailable() && BoostDialogs.checkReduceUsers(boostViaGiftsBottomSheet.getContext(), boostViaGiftsBottomSheet.resourcesProvider, boostViaGiftsBottomSheet.giftCodeOptions, tL_premiumGiftCodeOption)) {
                        return;
                    }
                    boostViaGiftsBottomSheet.actionBtn.updateLoading(true);
                    BoostRepository.payGiftCode(boostViaGiftsBottomSheet.selectedUsers, tL_premiumGiftCodeOption, boostViaGiftsBottomSheet.currentChat, null, baseFragment, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            BoostViaGiftsBottomSheet.$r8$lambda$06I96SDwhu8JHD4iaukwlYPVr8U(this.f$0, (Void) obj);
                        }
                    }, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            BoostViaGiftsBottomSheet.$r8$lambda$e5DBxQROw0eJLTP9lK5DLnngDzo(this.f$0, (TLRPC.TL_error) obj);
                        }
                    });
                    return;
                }
            }
            return;
        }
        List listFilterGiftOptions2 = BoostRepository.filterGiftOptions(boostViaGiftsBottomSheet.giftCodeOptions, boostViaGiftsBottomSheet.getSelectedSliderValue());
        for (int i2 = 0; i2 < listFilterGiftOptions2.size(); i2++) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) listFilterGiftOptions2.get(i2);
            if (tL_premiumGiftCodeOption2.months == boostViaGiftsBottomSheet.selectedMonths) {
                if (BoostRepository.isGoogleBillingAvailable() && BoostDialogs.checkReduceQuantity(boostViaGiftsBottomSheet.sliderValues, boostViaGiftsBottomSheet.getContext(), boostViaGiftsBottomSheet.resourcesProvider, boostViaGiftsBottomSheet.giftCodeOptions, tL_premiumGiftCodeOption2, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        BoostViaGiftsBottomSheet.$r8$lambda$FpdSGqb9_E5eIX6uGvIG3aahFYw(this.f$0, (TLRPC.TL_premiumGiftCodeOption) obj);
                    }
                })) {
                    return;
                }
                boolean z = boostViaGiftsBottomSheet.selectedParticipantsType == ParticipantsTypeCell.TYPE_NEW;
                int iPrepareServerDate = BoostRepository.prepareServerDate(boostViaGiftsBottomSheet.selectedEndDate);
                boostViaGiftsBottomSheet.actionBtn.updateLoading(true);
                BoostRepository.payGiveAway(boostViaGiftsBottomSheet.selectedChats, boostViaGiftsBottomSheet.selectedCountries, tL_premiumGiftCodeOption2, boostViaGiftsBottomSheet.currentChat, iPrepareServerDate, z, baseFragment, boostViaGiftsBottomSheet.isShowWinnersSelected, boostViaGiftsBottomSheet.isAdditionalPrizeSelected, boostViaGiftsBottomSheet.additionalPrize, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        BoostViaGiftsBottomSheet.$r8$lambda$A0RIum1NUgXrNdXM535FHuku4Ng(this.f$0, (Void) obj);
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        BoostViaGiftsBottomSheet.m2645$r8$lambda$twPkYp4Q9SVzO6OpMuy7OIIiY(this.f$0, (TLRPC.TL_error) obj);
                    }
                });
                return;
            }
        }
    }

    public static void m2636$r8$lambda$7x7WIhUZU4CwXrwbL0ONB70TDE(final BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, final TL_stories.PrepaidGiveaway prepaidGiveaway, final TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, final long j, final long j2) {
        int iPrepareServerDate = BoostRepository.prepareServerDate(boostViaGiftsBottomSheet.selectedEndDate);
        boolean z = boostViaGiftsBottomSheet.selectedParticipantsType == ParticipantsTypeCell.TYPE_NEW;
        boostViaGiftsBottomSheet.actionBtn.updateLoading(true);
        BoostRepository.launchPreparedGiveaway(prepaidGiveaway, boostViaGiftsBottomSheet.selectedChats, boostViaGiftsBottomSheet.selectedCountries, boostViaGiftsBottomSheet.currentChat, iPrepareServerDate, z, boostViaGiftsBottomSheet.isShowWinnersSelected, boostViaGiftsBottomSheet.isAdditionalPrizeSelected, prepaidGiveaway.quantity, boostViaGiftsBottomSheet.additionalPrize, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BoostViaGiftsBottomSheet.$r8$lambda$OdjsBUL1WI7RhKYNpZjcAk3aZ7g(this.f$0, tL_prepaidStarsGiveaway, j, j2, prepaidGiveaway, (Void) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BoostViaGiftsBottomSheet.m2637$r8$lambda$EzFbEqpt97TJVqwHL9hS3ts20(this.f$0, (TLRPC.TL_error) obj);
            }
        });
    }

    public static void $r8$lambda$OdjsBUL1WI7RhKYNpZjcAk3aZ7g(final BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j, final long j2, final TL_stories.PrepaidGiveaway prepaidGiveaway, Void r7) {
        boostViaGiftsBottomSheet.dismiss();
        if (tL_prepaidStarsGiveaway != null) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                final ChatActivity chatActivityOf = ChatActivity.of(j);
                chatActivityOf.whenFullyVisible(new Runnable() {
                    @Override
                    public final void run() {
                        BulletinFactory.of(chatActivityOf).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) j2))).show(true);
                    }
                });
                safeLastFragment.presentFragment(chatActivityOf);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BoostViaGiftsBottomSheet.$r8$lambda$eAxkePVcgc80rDqgq2W5h1gjUzk(this.f$0, prepaidGiveaway);
            }
        }, 220L);
    }

    public static void $r8$lambda$eAxkePVcgc80rDqgq2W5h1gjUzk(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        boostViaGiftsBottomSheet.getClass();
        NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationName(NotificationCenter.boostByChannelCreated, boostViaGiftsBottomSheet.currentChat, Boolean.TRUE, prepaidGiveaway);
    }

    public static void m2637$r8$lambda$EzFbEqpt97TJVqwHL9hS3ts20(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, TLRPC.TL_error tL_error) {
        boostViaGiftsBottomSheet.actionBtn.updateLoading(false);
        BoostDialogs.showToastError(boostViaGiftsBottomSheet.getContext(), tL_error);
    }

    public static void $r8$lambda$eOabwdDs2TTK7h1bpk3s6Kk4zz8(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, final TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, Boolean bool, String str) {
        boostViaGiftsBottomSheet.actionBtn.button.setLoading(false);
        if (boostViaGiftsBottomSheet.getContext() == null) {
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        FireworksOverlay fireworksOverlay = LaunchActivity.instance.getFireworksOverlay();
        if (safeLastFragment == null) {
            return;
        }
        if (!bool.booleanValue()) {
            if (str != null) {
                boostViaGiftsBottomSheet.dismiss();
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str)).show();
                return;
            }
            return;
        }
        boostViaGiftsBottomSheet.dismiss();
        final ChatActivity chatActivityOf = ChatActivity.of(-boostViaGiftsBottomSheet.currentChat.id);
        safeLastFragment.presentFragment(chatActivityOf);
        safeLastFragment.whenFullyVisible(new Runnable() {
            @Override
            public final void run() {
                BulletinFactory.of(chatActivityOf).createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) tL_starsGiveawayOption.stars))).setDuration(5000).show(true);
            }
        });
        if (fireworksOverlay != null) {
            fireworksOverlay.start(true);
        }
    }

    public static void $r8$lambda$06I96SDwhu8JHD4iaukwlYPVr8U(final BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, Void r3) {
        boostViaGiftsBottomSheet.dismiss();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BoostViaGiftsBottomSheet.$r8$lambda$LOrnA_m5vHKU68P_PWq3ODdPYyc(this.f$0);
            }
        }, 220L);
    }

    public static void $r8$lambda$LOrnA_m5vHKU68P_PWq3ODdPYyc(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet) {
        boostViaGiftsBottomSheet.getClass();
        NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationName(NotificationCenter.boostByChannelCreated, boostViaGiftsBottomSheet.currentChat, Boolean.FALSE);
    }

    public static void $r8$lambda$e5DBxQROw0eJLTP9lK5DLnngDzo(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, TLRPC.TL_error tL_error) {
        boostViaGiftsBottomSheet.actionBtn.updateLoading(false);
        BoostDialogs.showToastError(boostViaGiftsBottomSheet.getContext(), tL_error);
    }

    public static void $r8$lambda$FpdSGqb9_E5eIX6uGvIG3aahFYw(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption) {
        boostViaGiftsBottomSheet.selectedSliderIndex = boostViaGiftsBottomSheet.sliderValues.indexOf(Integer.valueOf(tL_premiumGiftCodeOption.users));
        boostViaGiftsBottomSheet.updateRows(true, true);
        boostViaGiftsBottomSheet.updateActionButton(true);
    }

    public static void $r8$lambda$A0RIum1NUgXrNdXM535FHuku4Ng(final BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, Void r3) {
        boostViaGiftsBottomSheet.dismiss();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BoostViaGiftsBottomSheet.$r8$lambda$msH_3bWWMWnE6U5I03TlIED1PwY(this.f$0);
            }
        }, 220L);
    }

    public static void $r8$lambda$msH_3bWWMWnE6U5I03TlIED1PwY(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet) {
        boostViaGiftsBottomSheet.getClass();
        NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationName(NotificationCenter.boostByChannelCreated, boostViaGiftsBottomSheet.currentChat, Boolean.TRUE);
    }

    public static void m2645$r8$lambda$twPkYp4Q9SVzO6OpMuy7OIIiY(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, TLRPC.TL_error tL_error) {
        boostViaGiftsBottomSheet.actionBtn.updateLoading(false);
        BoostDialogs.showToastError(boostViaGiftsBottomSheet.getContext(), tL_error);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        RecyclerListView recyclerListView;
        if (i == NotificationCenter.starGiveawayOptionsLoaded && (recyclerListView = this.recyclerListView) != null && recyclerListView.isAttachedToWindow()) {
            updateRows(true, true);
        }
    }

    public void setOnCloseClick(Runnable runnable) {
        this.onCloseClick = runnable;
    }

    @Override
    public void dismiss() {
        Runnable runnable = this.onCloseClick;
        if (runnable != null) {
            runnable.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    private void loadOptions() {
        BoostRepository.loadGiftOptions(this.currentAccount, this.currentChat, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BoostViaGiftsBottomSheet.m2638$r8$lambda$Kq_qLB8NBwFwbhTzYAJBFwtWSI(this.f$0, (List) obj);
            }
        });
    }

    public static void m2638$r8$lambda$Kq_qLB8NBwFwbhTzYAJBFwtWSI(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, List list) {
        boostViaGiftsBottomSheet.giftCodeOptions.clear();
        boostViaGiftsBottomSheet.giftCodeOptions.addAll(list);
        boostViaGiftsBottomSheet.updateRows(true, true);
    }

    private void updateActionButton(boolean z) {
        if (isPreparedGiveaway()) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.prepaidGiveaway;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                this.actionBtn.setStartGiveAwayStyle(prepaidGiveaway.quantity, z);
                return;
            } else {
                this.actionBtn.setStartGiveAwayStyle(prepaidGiveaway.quantity * BoostRepository.giveawayBoostsPerPremium(), z);
                return;
            }
        }
        if (this.selectedBoostSubType == BoostTypeCell.TYPE_GIVEAWAY) {
            this.actionBtn.setStartGiveAwayStyle(getSelectedSliderValueWithBoosts(), z);
        } else {
            this.actionBtn.setGiftPremiumStyle(this.selectedUsers.size() * BoostRepository.giveawayBoostsPerPremium(), z, this.selectedUsers.size() > 0);
        }
    }

    private boolean isGiveaway() {
        return this.selectedBoostSubType == BoostTypeCell.TYPE_GIVEAWAY;
    }

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    @Override
    protected void onPreDraw(Canvas canvas, int i, float f) {
        this.top = i;
    }

    public int getTop() {
        return Math.max(-AndroidUtilities.dp(16.0f), this.top - (this.actionBar.getVisibility() == 0 ? AndroidUtilities.statusBarHeight + AndroidUtilities.dp(16.0f) : 0));
    }

    private int getSelectedSliderValue() {
        if (this.selectedBoostType == BoostTypeCell.TYPE_PREMIUM) {
            return ((Integer) this.sliderValues.get(this.selectedSliderIndex)).intValue();
        }
        List sliderValues = getSliderValues();
        int i = this.selectedStarsSliderIndex;
        if (i < 0 || i >= sliderValues.size()) {
            this.selectedStarsSliderIndex = 0;
        }
        if (this.selectedStarsSliderIndex >= sliderValues.size()) {
            return 0;
        }
        return ((Integer) sliderValues.get(this.selectedStarsSliderIndex)).intValue();
    }

    private int getSelectedSliderValueWithBoosts() {
        int selectedSliderValue;
        int iGiveawayBoostsPerPremium;
        if (this.selectedBoostType == BoostTypeCell.TYPE_PREMIUM) {
            selectedSliderValue = ((Integer) this.sliderValues.get(this.selectedSliderIndex)).intValue();
            iGiveawayBoostsPerPremium = BoostRepository.giveawayBoostsPerPremium();
        } else {
            TL_stars.TL_starsGiveawayOption selectedStarsOption = getSelectedStarsOption();
            if (selectedStarsOption != null) {
                return selectedStarsOption.yearly_boosts;
            }
            selectedSliderValue = getSelectedSliderValue();
            iGiveawayBoostsPerPremium = BoostRepository.giveawayBoostsPerPremium();
        }
        return selectedSliderValue * iGiveawayBoostsPerPremium;
    }

    private long getSelectedPerUserStars() {
        List perUserStarsValues = getPerUserStarsValues();
        int i = this.selectedStarsSliderIndex;
        if (i < 0 || i >= perUserStarsValues.size()) {
            this.selectedStarsSliderIndex = 0;
        }
        if (this.selectedStarsSliderIndex >= perUserStarsValues.size()) {
            return 1L;
        }
        return ((Long) perUserStarsValues.get(this.selectedStarsSliderIndex)).longValue();
    }

    private long getSelectedPerUserStars(long j) {
        List perUserStarsValues = getPerUserStarsValues(j);
        if (perUserStarsValues.isEmpty()) {
            return Math.round(j / getSelectedPerUserStars());
        }
        return ((Long) perUserStarsValues.get(Utilities.clamp(this.selectedStarsSliderIndex, perUserStarsValues.size() - 1, 0))).longValue();
    }

    public TL_stars.TL_starsGiveawayOption getSelectedStarsOption() {
        return getSelectedStarsOption(this.selectedStars);
    }

    public TL_stars.TL_starsGiveawayOption getSelectedStarsOption(long j) {
        ArrayList giveawayOptions = StarsController.getInstance(this.currentAccount).getGiveawayOptions();
        if (giveawayOptions == null) {
            return null;
        }
        for (int i = 0; i < giveawayOptions.size(); i++) {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) giveawayOptions.get(i);
            if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j) {
                return tL_starsGiveawayOption;
            }
        }
        return null;
    }

    private List getSliderValues() {
        if (this.selectedBoostType == BoostTypeCell.TYPE_PREMIUM) {
            return this.sliderValues;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption selectedStarsOption = getSelectedStarsOption();
        if (selectedStarsOption != null) {
            for (int i = 0; i < selectedStarsOption.winners.size(); i++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = selectedStarsOption.winners.get(i);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    private List getPerUserStarsValues() {
        return getPerUserStarsValues(this.selectedStars);
    }

    private List getPerUserStarsValues(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption selectedStarsOption = getSelectedStarsOption(j);
        if (selectedStarsOption != null) {
            for (int i = 0; i < selectedStarsOption.winners.size(); i++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = selectedStarsOption.winners.get(i);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    private List getStarsOptions() {
        ArrayList giveawayOptions = StarsController.getInstance(this.currentAccount).getGiveawayOptions();
        ArrayList arrayList = new ArrayList();
        if (giveawayOptions != null) {
            for (int i = 0; i < giveawayOptions.size(); i++) {
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) giveawayOptions.get(i);
                if (tL_starsGiveawayOption != null && !arrayList.contains(Long.valueOf(tL_starsGiveawayOption.stars))) {
                    arrayList.add(Long.valueOf(tL_starsGiveawayOption.stars));
                }
            }
        }
        return arrayList;
    }

    private boolean isPreparedGiveaway() {
        return this.prepaidGiveaway != null;
    }

    private void updateRows(boolean z, boolean z2) {
        ArrayList arrayList;
        boolean z3;
        boolean z4;
        boolean z5;
        ArrayList arrayList2 = new ArrayList(this.items);
        this.items.clear();
        int i = 1;
        this.items.add(BoostAdapter.Item.asHeader(this.selectedBoostType == BoostTypeCell.TYPE_STARS));
        if (isPreparedGiveaway()) {
            this.items.add(BoostAdapter.Item.asSingleBoost(this.prepaidGiveaway));
        } else {
            this.items.add(BoostAdapter.Item.asBoost(BoostTypeCell.TYPE_PREMIUM, this.selectedUsers.size(), null, this.selectedBoostType));
            this.items.add(BoostAdapter.Item.asBoost(BoostTypeCell.TYPE_STARS, this.selectedUsers.size(), null, this.selectedBoostType));
        }
        this.items.add(BoostAdapter.Item.asDivider());
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.currentChat);
        if (this.selectedBoostType == BoostTypeCell.TYPE_STARS) {
            if (!isPreparedGiveaway()) {
                BoostAdapter.Item itemAsSubTitleWithCounter = BoostAdapter.Item.asSubTitleWithCounter(LocaleController.getString(R.string.BoostingStarsOptions), getSelectedSliderValueWithBoosts());
                this.items.add(itemAsSubTitleWithCounter);
                List starsOptions = getStarsOptions();
                int i2 = 0;
                int i3 = 0;
                while (i2 < starsOptions.size()) {
                    TL_stars.TL_starsGiveawayOption selectedStarsOption = getSelectedStarsOption(((Long) starsOptions.get(i2)).longValue());
                    if (!selectedStarsOption.missingStorePrice) {
                        if (this.selectedStars == 0 && selectedStarsOption.isDefault) {
                            this.selectedStars = selectedStarsOption.stars;
                        }
                        if (!selectedStarsOption.extended || this.starOptionsExpanded) {
                            i3 += i;
                            this.items.add(BoostAdapter.Item.asOption(selectedStarsOption, this.starOptionsExpanded ? i2 : i2 + 2, getSelectedPerUserStars(selectedStarsOption.stars), this.selectedStars == selectedStarsOption.stars, true));
                        }
                    }
                    i2++;
                    arrayList2 = arrayList2;
                    i = 1;
                }
                arrayList = arrayList2;
                if (!this.starOptionsExpanded && i3 < starsOptions.size()) {
                    this.items.add(BoostAdapter.Item.asExpandOptions());
                }
                if (i3 <= 0) {
                    this.items.add(BoostAdapter.Item.asOption(null, 0, 1L, false, true));
                    this.items.add(BoostAdapter.Item.asOption(null, 1, 1L, false, true));
                    this.items.add(BoostAdapter.Item.asOption(null, 2, 1L, false, false));
                }
                itemAsSubTitleWithCounter.intValue = getSelectedSliderValueWithBoosts();
                this.items.add(BoostAdapter.Item.asDivider(LocaleController.getString(R.string.BoostingStarsOptionsInfo), false));
                List sliderValues = getSliderValues();
                int i4 = this.selectedStarsSliderIndex;
                if (i4 < 0 || i4 >= sliderValues.size()) {
                    this.selectedStarsSliderIndex = 0;
                }
                if (sliderValues.size() > 1) {
                    this.items.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingStarsQuantityPrizes)));
                    this.items.add(BoostAdapter.Item.asSlider(getSliderValues(), this.selectedStarsSliderIndex));
                    this.items.add(BoostAdapter.Item.asDivider(LocaleController.getString(R.string.BoostingStarsQuantityPrizesInfo), false));
                }
            } else {
                arrayList = arrayList2;
                TL_stories.PrepaidGiveaway prepaidGiveaway = this.prepaidGiveaway;
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    this.selectedStars = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
                }
            }
            this.items.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
            if (isPreparedGiveaway()) {
                TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.prepaidGiveaway;
                if (prepaidGiveaway2 instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    this.items.add(BoostAdapter.Item.asChat(this.currentChat, false, prepaidGiveaway2.quantity));
                } else {
                    this.items.add(BoostAdapter.Item.asChat(this.currentChat, false, prepaidGiveaway2.quantity * BoostRepository.giveawayBoostsPerPremium()));
                }
            } else {
                this.items.add(BoostAdapter.Item.asChat(this.currentChat, false, getSelectedSliderValueWithBoosts()));
            }
            for (TLObject tLObject : this.selectedChats) {
                if (tLObject instanceof TLRPC.Chat) {
                    z5 = true;
                    this.items.add(BoostAdapter.Item.asChat((TLRPC.Chat) tLObject, true, getSelectedSliderValueWithBoosts()));
                } else {
                    z5 = true;
                }
                if (tLObject instanceof TLRPC.InputPeer) {
                    this.items.add(BoostAdapter.Item.asPeer((TLRPC.InputPeer) tLObject, z5, getSelectedSliderValueWithBoosts()));
                }
            }
            if (this.selectedChats.size() < BoostRepository.giveawayAddPeersMax()) {
                this.items.add(BoostAdapter.Item.asAddChannel());
            }
            this.items.add(BoostAdapter.Item.asDivider(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), false));
            this.items.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingEligibleUsers)));
            this.items.add(BoostAdapter.Item.asParticipants(ParticipantsTypeCell.TYPE_ALL, this.selectedParticipantsType, true, this.selectedCountries));
            this.items.add(BoostAdapter.Item.asParticipants(ParticipantsTypeCell.TYPE_NEW, this.selectedParticipantsType, false, this.selectedCountries));
            this.items.add(BoostAdapter.Item.asDivider(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), false));
        } else {
            arrayList = arrayList2;
            if (this.selectedBoostSubType == BoostTypeCell.TYPE_GIVEAWAY) {
                if (!isPreparedGiveaway()) {
                    this.items.add(BoostAdapter.Item.asSubTitleWithCounter(LocaleController.getString(R.string.BoostingQuantityPrizes), getSelectedSliderValueWithBoosts()));
                    this.items.add(BoostAdapter.Item.asSlider(this.sliderValues, this.selectedSliderIndex));
                    this.items.add(BoostAdapter.Item.asDivider(LocaleController.getString(R.string.BoostingChooseHowMany), false));
                }
                this.items.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
                if (isPreparedGiveaway()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway3 = this.prepaidGiveaway;
                    if (prepaidGiveaway3 instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        this.items.add(BoostAdapter.Item.asChat(this.currentChat, false, prepaidGiveaway3.quantity));
                    } else {
                        this.items.add(BoostAdapter.Item.asChat(this.currentChat, false, prepaidGiveaway3.quantity * BoostRepository.giveawayBoostsPerPremium()));
                    }
                } else {
                    this.items.add(BoostAdapter.Item.asChat(this.currentChat, false, getSelectedSliderValueWithBoosts()));
                }
                for (TLObject tLObject2 : this.selectedChats) {
                    if (tLObject2 instanceof TLRPC.Chat) {
                        z3 = true;
                        this.items.add(BoostAdapter.Item.asChat((TLRPC.Chat) tLObject2, true, getSelectedSliderValueWithBoosts()));
                    } else {
                        z3 = true;
                    }
                    if (tLObject2 instanceof TLRPC.InputPeer) {
                        this.items.add(BoostAdapter.Item.asPeer((TLRPC.InputPeer) tLObject2, z3, getSelectedSliderValueWithBoosts()));
                    }
                }
                if (this.selectedChats.size() < BoostRepository.giveawayAddPeersMax()) {
                    this.items.add(BoostAdapter.Item.asAddChannel());
                }
                this.items.add(BoostAdapter.Item.asDivider(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), false));
                this.items.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingEligibleUsers)));
                this.items.add(BoostAdapter.Item.asParticipants(ParticipantsTypeCell.TYPE_ALL, this.selectedParticipantsType, true, this.selectedCountries));
                this.items.add(BoostAdapter.Item.asParticipants(ParticipantsTypeCell.TYPE_NEW, this.selectedParticipantsType, false, this.selectedCountries));
                this.items.add(BoostAdapter.Item.asDivider(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), false));
            }
            if (!isPreparedGiveaway()) {
                this.items.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingDurationOfPremium)));
                List listFilterGiftOptions = BoostRepository.filterGiftOptions(this.giftCodeOptions, isGiveaway() ? getSelectedSliderValue() : this.selectedUsers.size());
                int i5 = 0;
                while (i5 < listFilterGiftOptions.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) listFilterGiftOptions.get(i5);
                    this.items.add(BoostAdapter.Item.asDuration(tL_premiumGiftCodeOption, tL_premiumGiftCodeOption.months, isGiveaway() ? getSelectedSliderValue() : this.selectedUsers.size(), tL_premiumGiftCodeOption.amount, this.selectedMonths, tL_premiumGiftCodeOption.currency, i5 != listFilterGiftOptions.size() + (-1)));
                    i5++;
                }
            }
            if (!isPreparedGiveaway()) {
                this.items.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BoostingStoriesFeaturesAndTerms), Theme.key_chat_messageLinkIn, 0, new Runnable() {
                    @Override
                    public final void run() {
                        BoostViaGiftsBottomSheet.m2646$r8$lambda$x0JBU7LysW7QGFvzdlBW0PonuI(this.f$0);
                    }
                }, this.resourcesProvider), true));
            }
        }
        if (this.selectedBoostType == BoostTypeCell.TYPE_STARS || this.selectedBoostSubType == BoostTypeCell.TYPE_GIVEAWAY) {
            ArrayList arrayList3 = this.items;
            String string = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
            boolean z6 = this.isAdditionalPrizeSelected;
            arrayList3.add(BoostAdapter.Item.asSwitcher(string, z6, z6, SwitcherCell.TYPE_ADDITION_PRIZE));
            if (this.isAdditionalPrizeSelected) {
                int selectedSliderValue = isPreparedGiveaway() ? this.prepaidGiveaway.quantity : getSelectedSliderValue();
                this.items.add(BoostAdapter.Item.asEnterPrize(selectedSliderValue));
                String pluralString = LocaleController.formatPluralString("BoldMonths", this.selectedMonths, new Object[0]);
                if (this.selectedBoostType == BoostTypeCell.TYPE_STARS) {
                    if (this.additionalPrize.isEmpty()) {
                        this.items.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountHint", (int) this.selectedStars, new Object[0])), false));
                    } else {
                        this.items.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountNameHint", (int) this.selectedStars, Integer.valueOf(selectedSliderValue), this.additionalPrize)), false));
                    }
                } else if (this.additionalPrize.isEmpty()) {
                    this.items.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountHint", selectedSliderValue, pluralString)), false));
                } else {
                    this.items.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountNameHint", selectedSliderValue, this.additionalPrize, pluralString)), false));
                }
            } else {
                this.items.add(BoostAdapter.Item.asDivider(LocaleController.getString(this.selectedBoostType == BoostTypeCell.TYPE_STARS ? R.string.BoostingStarsGiveawayAdditionPrizeHint : R.string.BoostingGiveawayAdditionPrizeHint), false));
            }
            this.items.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
            this.items.add(BoostAdapter.Item.asDateEnd(this.selectedEndDate));
            if (this.selectedBoostType == BoostTypeCell.TYPE_STARS) {
                if (!isPreparedGiveaway()) {
                    this.items.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(zIsChannelAndNotMegaGroup ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", getSelectedSliderValue(), LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.selectedStars, new Object[0])), false));
                } else {
                    this.items.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(zIsChannelAndNotMegaGroup ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", this.prepaidGiveaway.quantity, LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.selectedStars, new Object[0])), false));
                }
                z4 = false;
            } else if (!isPreparedGiveaway()) {
                z4 = false;
                this.items.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(zIsChannelAndNotMegaGroup ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", getSelectedSliderValue(), new Object[0]), false));
            } else {
                z4 = false;
                this.items.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(zIsChannelAndNotMegaGroup ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", this.prepaidGiveaway.quantity, new Object[0]), false));
            }
            this.items.add(BoostAdapter.Item.asSwitcher(LocaleController.getString(R.string.BoostingGiveawayShowWinners), this.isShowWinnersSelected, z4, SwitcherCell.TYPE_WINNERS));
            if (!isPreparedGiveaway()) {
                this.items.add(BoostAdapter.Item.asDivider(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint), z4));
            } else {
                ArrayList arrayList4 = this.items;
                StringBuilder sb = new StringBuilder();
                sb.append(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint));
                sb.append(this.selectedBoostType != BoostTypeCell.TYPE_STARS ? "\n\n" + LocaleController.getString(R.string.BoostingStoriesFeaturesAndTerms) : "");
                arrayList4.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceSingleTag(sb.toString(), Theme.key_chat_messageLinkIn, 0, new Runnable() {
                    @Override
                    public final void run() {
                        BoostViaGiftsBottomSheet.$r8$lambda$xXcYV6uTaClVckMo61dLZL9mXhA(this.f$0);
                    }
                }, this.resourcesProvider), true));
            }
        }
        BoostAdapter boostAdapter = this.adapter;
        if (boostAdapter != null && z2) {
            if (z) {
                boostAdapter.setItems(arrayList, this.items);
            } else {
                boostAdapter.notifyDataSetChanged();
            }
        }
    }

    public static void m2646$r8$lambda$x0JBU7LysW7QGFvzdlBW0PonuI(final BoostViaGiftsBottomSheet boostViaGiftsBottomSheet) {
        PremiumPreviewBottomSheet premiumPreviewBottomSheet = new PremiumPreviewBottomSheet(boostViaGiftsBottomSheet.getBaseFragment(), boostViaGiftsBottomSheet.currentAccount, null, boostViaGiftsBottomSheet.resourcesProvider);
        premiumPreviewBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.adapter.setPausedStars(false);
            }
        });
        premiumPreviewBottomSheet.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                this.f$0.adapter.setPausedStars(true);
            }
        });
        premiumPreviewBottomSheet.show();
    }

    public static void $r8$lambda$xXcYV6uTaClVckMo61dLZL9mXhA(final BoostViaGiftsBottomSheet boostViaGiftsBottomSheet) {
        PremiumPreviewBottomSheet premiumPreviewBottomSheet = new PremiumPreviewBottomSheet(boostViaGiftsBottomSheet.getBaseFragment(), boostViaGiftsBottomSheet.currentAccount, null, boostViaGiftsBottomSheet.resourcesProvider);
        premiumPreviewBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.adapter.setPausedStars(false);
            }
        });
        premiumPreviewBottomSheet.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                this.f$0.adapter.setPausedStars(true);
            }
        });
        premiumPreviewBottomSheet.show();
    }

    @Override
    protected CharSequence getTitle() {
        if (this.selectedBoostSubType == BoostTypeCell.TYPE_SPECIFIC_USERS) {
            return LocaleController.getString(R.string.GiftPremium);
        }
        return LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        BoostAdapter boostAdapter = new BoostAdapter(this.resourcesProvider);
        this.adapter = boostAdapter;
        return boostAdapter;
    }

    @Override
    public void onChatsSelected(List list, boolean z) {
        this.selectedChats.clear();
        this.selectedChats.addAll(list);
        updateRows(z, true);
    }

    @Override
    public void onUsersSelected(List list) {
        this.selectedUsers.clear();
        this.selectedUsers.addAll(list);
        if (list.isEmpty()) {
            this.selectedBoostSubType = BoostTypeCell.TYPE_GIVEAWAY;
        } else {
            this.selectedBoostSubType = BoostTypeCell.TYPE_SPECIFIC_USERS;
        }
        this.selectedSliderIndex = 0;
        updateRows(false, true);
        updateActionButton(true);
        updateTitle();
    }

    @Override
    public void onCountrySelected(List list) {
        this.selectedCountries.clear();
        this.selectedCountries.addAll(list);
        updateRows(false, true);
    }
}
