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
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet;
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

    public void lambda$new$0() {
        AndroidUtilities.hideKeyboard(this.recyclerListView);
    }

    public BoostViaGiftsBottomSheet(final BaseFragment baseFragment, boolean z, boolean z2, final long j, final TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(baseFragment, z, z2);
        int i;
        List asList;
        List asList2;
        ArrayList arrayList = new ArrayList();
        this.items = arrayList;
        if (BoostRepository.isGoogleBillingAvailable()) {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
            i = 7;
        } else {
            i = 7;
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.sliderValues = asList;
        if (BoostRepository.isGoogleBillingAvailable()) {
            Integer[] numArr = new Integer[i];
            numArr[0] = 1;
            numArr[1] = 3;
            numArr[2] = 5;
            numArr[3] = 7;
            numArr[4] = 10;
            numArr[5] = 25;
            numArr[6] = 50;
            asList2 = Arrays.asList(numArr);
        } else {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.sliderStarsValues = asList2;
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
                BoostViaGiftsBottomSheet.this.lambda$new$0();
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
        int i2 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i2, 0, i2, AndroidUtilities.dp(68.0f));
        this.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
                if (i3 == 1) {
                    AndroidUtilities.hideKeyboard(recyclerView);
                }
            }
        });
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i3) {
                BoostViaGiftsBottomSheet.this.lambda$new$2(baseFragment, view, i3);
            }
        });
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        this.currentChat = chat;
        this.adapter.setItems(chat, arrayList, this.recyclerListView, new SlideChooseView.Callback() {
            @Override
            public final void onOptionSelected(int i3) {
                BoostViaGiftsBottomSheet.this.lambda$new$3(i3);
            }

            @Override
            public void onTouchEnd() {
                SlideChooseView.Callback.CC.$default$onTouchEnd(this);
            }
        }, new ChatCell.ChatDeleteListener() {
            @Override
            public final void onChatDeleted(TLRPC.Chat chat2) {
                BoostViaGiftsBottomSheet.this.lambda$new$4(chat2);
            }
        }, new EnterPrizeCell.AfterTextChangedListener() {
            @Override
            public final void afterTextChanged(String str) {
                BoostViaGiftsBottomSheet.this.lambda$new$5(str);
            }
        });
        updateRows(false, false);
        ActionBtnCell actionBtnCell = new ActionBtnCell(getContext(), this.resourcesProvider);
        this.actionBtn = actionBtnCell;
        actionBtnCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BoostViaGiftsBottomSheet.this.lambda$new$20(prepaidGiveaway, j, baseFragment, view);
            }
        });
        updateActionButton(false);
        this.containerView.addView(this.actionBtn, LayoutHelper.createFrame(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        loadOptions();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public void lambda$new$2(BaseFragment baseFragment, View view, int i) {
        ActionListener actionListener;
        if (view instanceof SwitcherCell) {
            SwitcherCell switcherCell = (SwitcherCell) view;
            int type = switcherCell.getType();
            boolean z = !switcherCell.isChecked();
            switcherCell.setChecked(z);
            if (type == SwitcherCell.TYPE_WINNERS) {
                this.isShowWinnersSelected = z;
                updateRows(false, false);
            } else if (type == SwitcherCell.TYPE_ADDITION_PRIZE) {
                switcherCell.setDivider(z);
                this.isAdditionalPrizeSelected = z;
                updateRows(false, false);
                this.adapter.notifyAdditionalPrizeItem(z);
                this.adapter.notifyAllVisibleTextDividers();
                if (!this.isAdditionalPrizeSelected) {
                    AndroidUtilities.runOnUIThread(this.hideKeyboardRunnable, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(this.hideKeyboardRunnable);
                }
            }
        }
        if (view instanceof BaseCell) {
            if (view instanceof BoostTypeCell) {
                int selectedType = ((BoostTypeCell) view).getSelectedType();
                if (selectedType == BoostTypeCell.TYPE_PREMIUM || selectedType == BoostTypeCell.TYPE_STARS) {
                    if (selectedType == BoostTypeCell.TYPE_PREMIUM && this.selectedBoostType == selectedType) {
                        ActionListener actionListener2 = this.actionListener;
                        if (actionListener2 != null) {
                            actionListener2.onSelectUser(this.selectedUsers);
                            return;
                        }
                        return;
                    }
                    this.selectedBoostType = selectedType;
                    updateRows(true, true);
                    updateActionButton(true);
                    updateTitle();
                } else if (selectedType == BoostTypeCell.TYPE_SPECIFIC_USERS) {
                    ActionListener actionListener3 = this.actionListener;
                    if (actionListener3 != null) {
                        actionListener3.onSelectUser(this.selectedUsers);
                    }
                } else {
                    this.selectedBoostSubType = selectedType;
                    updateRows(true, true);
                    updateActionButton(true);
                    updateTitle();
                }
            } else {
                ((BaseCell) view).markChecked(this.recyclerListView);
            }
        }
        if (view instanceof ParticipantsTypeCell) {
            int selectedType2 = ((ParticipantsTypeCell) view).getSelectedType();
            if (this.selectedParticipantsType == selectedType2 && (actionListener = this.actionListener) != null) {
                actionListener.onSelectCountries(this.selectedCountries);
            }
            this.selectedParticipantsType = selectedType2;
            updateRows(false, false);
            return;
        }
        if (view instanceof DurationCell) {
            this.selectedMonths = ((TLRPC.TL_premiumGiftCodeOption) ((DurationCell) view).getGifCode()).months;
            updateRows(false, false);
            this.adapter.notifyAllVisibleTextDividers();
            return;
        }
        if (view instanceof DateEndCell) {
            BoostDialogs.showDatePicker(baseFragment.getContext(), this.selectedEndDate, new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z2, int i2) {
                    BoostViaGiftsBottomSheet.this.lambda$new$1(z2, i2);
                }
            }, this.resourcesProvider);
            return;
        }
        if (view instanceof AddChannelCell) {
            ActionListener actionListener4 = this.actionListener;
            if (actionListener4 != null) {
                actionListener4.onAddChat(this.selectedChats);
                return;
            }
            return;
        }
        if (view instanceof StarGiveawayOptionCell) {
            TL_stars.TL_starsGiveawayOption option = ((StarGiveawayOptionCell) view).getOption();
            if (option != null) {
                this.selectedStars = option.stars;
                updateRows(true, true);
                updateActionButton(true);
                updateTitle();
                return;
            }
            return;
        }
        if (view instanceof StarsIntroActivity.ExpandView) {
            this.starOptionsExpanded = true;
            updateRows(true, true);
        }
    }

    public void lambda$new$1(boolean z, int i) {
        this.selectedEndDate = i * 1000;
        updateRows(false, true);
    }

    public void lambda$new$3(int i) {
        if (this.selectedBoostType == BoostTypeCell.TYPE_PREMIUM) {
            this.selectedSliderIndex = i;
        } else {
            this.selectedStarsSliderIndex = i;
        }
        this.actionBtn.updateCounter(getSelectedSliderValueWithBoosts());
        if (this.selectedBoostType == BoostTypeCell.TYPE_STARS) {
            updateRows(true, true);
        } else {
            updateRows(false, false);
        }
        this.adapter.updateBoostCounter(getSelectedSliderValueWithBoosts());
    }

    public void lambda$new$4(TLRPC.Chat chat) {
        this.selectedChats.remove(chat);
        updateRows(true, true);
    }

    public void lambda$new$5(String str) {
        this.additionalPrize = str;
        updateRows(false, false);
        updateRows(true, true);
    }

    public void lambda$new$20(final TL_stories.PrepaidGiveaway prepaidGiveaway, final long j, BaseFragment baseFragment, View view) {
        if (this.actionBtn.isLoading()) {
            return;
        }
        if (isPreparedGiveaway()) {
            final TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
            final long j2 = tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L;
            BoostDialogs.showStartGiveawayDialog(new Runnable() {
                @Override
                public final void run() {
                    BoostViaGiftsBottomSheet.this.lambda$new$10(prepaidGiveaway, tL_prepaidStarsGiveaway, j, j2);
                }
            });
            return;
        }
        if (this.selectedBoostType == BoostTypeCell.TYPE_STARS) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.instance;
            }
            Activity activity = findActivity;
            if (activity == null || activity.isFinishing()) {
                return;
            }
            final TL_stars.TL_starsGiveawayOption selectedStarsOption = getSelectedStarsOption();
            int selectedSliderValue = getSelectedSliderValue();
            if (selectedStarsOption == null) {
                return;
            }
            this.actionBtn.button.setLoading(true);
            StarsController.getInstance(this.currentAccount).buyGiveaway(activity, this.currentChat, this.selectedChats, selectedStarsOption, selectedSliderValue, this.selectedCountries, BoostRepository.prepareServerDate(this.selectedEndDate), this.isShowWinnersSelected, this.selectedParticipantsType == ParticipantsTypeCell.TYPE_NEW, this.isAdditionalPrizeSelected, this.additionalPrize, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    BoostViaGiftsBottomSheet.this.lambda$new$12(selectedStarsOption, (Boolean) obj, (String) obj2);
                }
            });
            return;
        }
        if (this.selectedBoostSubType == BoostTypeCell.TYPE_SPECIFIC_USERS) {
            List filterGiftOptions = BoostRepository.filterGiftOptions(this.giftCodeOptions, this.selectedUsers.size());
            for (int i = 0; i < filterGiftOptions.size(); i++) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) filterGiftOptions.get(i);
                if (tL_premiumGiftCodeOption.months == this.selectedMonths && this.selectedUsers.size() > 0) {
                    if (BoostRepository.isGoogleBillingAvailable() && BoostDialogs.checkReduceUsers(getContext(), this.resourcesProvider, this.giftCodeOptions, tL_premiumGiftCodeOption)) {
                        return;
                    }
                    this.actionBtn.updateLoading(true);
                    BoostRepository.payGiftCode(this.selectedUsers, tL_premiumGiftCodeOption, this.currentChat, null, baseFragment, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            BoostViaGiftsBottomSheet.this.lambda$new$14((Void) obj);
                        }
                    }, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            BoostViaGiftsBottomSheet.this.lambda$new$15((TLRPC.TL_error) obj);
                        }
                    });
                    return;
                }
            }
            return;
        }
        List filterGiftOptions2 = BoostRepository.filterGiftOptions(this.giftCodeOptions, getSelectedSliderValue());
        for (int i2 = 0; i2 < filterGiftOptions2.size(); i2++) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) filterGiftOptions2.get(i2);
            if (tL_premiumGiftCodeOption2.months == this.selectedMonths) {
                if (BoostRepository.isGoogleBillingAvailable() && BoostDialogs.checkReduceQuantity(this.sliderValues, getContext(), this.resourcesProvider, this.giftCodeOptions, tL_premiumGiftCodeOption2, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        BoostViaGiftsBottomSheet.this.lambda$new$16((TLRPC.TL_premiumGiftCodeOption) obj);
                    }
                })) {
                    return;
                }
                boolean z = this.selectedParticipantsType == ParticipantsTypeCell.TYPE_NEW;
                int prepareServerDate = BoostRepository.prepareServerDate(this.selectedEndDate);
                this.actionBtn.updateLoading(true);
                BoostRepository.payGiveAway(this.selectedChats, this.selectedCountries, tL_premiumGiftCodeOption2, this.currentChat, prepareServerDate, z, baseFragment, this.isShowWinnersSelected, this.isAdditionalPrizeSelected, this.additionalPrize, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        BoostViaGiftsBottomSheet.this.lambda$new$18((Void) obj);
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        BoostViaGiftsBottomSheet.this.lambda$new$19((TLRPC.TL_error) obj);
                    }
                });
                return;
            }
        }
    }

    public void lambda$new$10(final TL_stories.PrepaidGiveaway prepaidGiveaway, final TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, final long j, final long j2) {
        int prepareServerDate = BoostRepository.prepareServerDate(this.selectedEndDate);
        boolean z = this.selectedParticipantsType == ParticipantsTypeCell.TYPE_NEW;
        this.actionBtn.updateLoading(true);
        BoostRepository.launchPreparedGiveaway(prepaidGiveaway, this.selectedChats, this.selectedCountries, this.currentChat, prepareServerDate, z, this.isShowWinnersSelected, this.isAdditionalPrizeSelected, prepaidGiveaway.quantity, this.additionalPrize, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BoostViaGiftsBottomSheet.this.lambda$new$8(tL_prepaidStarsGiveaway, j, j2, prepaidGiveaway, (Void) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BoostViaGiftsBottomSheet.this.lambda$new$9((TLRPC.TL_error) obj);
            }
        });
    }

    public void lambda$new$8(TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j, final long j2, final TL_stories.PrepaidGiveaway prepaidGiveaway, Void r7) {
        lambda$new$0();
        if (tL_prepaidStarsGiveaway != null) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                final ChatActivity of = ChatActivity.of(j);
                of.whenFullyVisible(new Runnable() {
                    @Override
                    public final void run() {
                        BoostViaGiftsBottomSheet.lambda$new$6(ChatActivity.this, j2);
                    }
                });
                safeLastFragment.presentFragment(of);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BoostViaGiftsBottomSheet.this.lambda$new$7(prepaidGiveaway);
            }
        }, 220L);
    }

    public static void lambda$new$6(ChatActivity chatActivity, long j) {
        BulletinFactory.of(chatActivity).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) j))).show(true);
    }

    public void lambda$new$7(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, this.currentChat, Boolean.TRUE, prepaidGiveaway);
    }

    public void lambda$new$9(TLRPC.TL_error tL_error) {
        this.actionBtn.updateLoading(false);
        BoostDialogs.showToastError(getContext(), tL_error);
    }

    public void lambda$new$12(final TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, Boolean bool, String str) {
        this.actionBtn.button.setLoading(false);
        if (getContext() == null) {
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        FireworksOverlay fireworksOverlay = LaunchActivity.instance.getFireworksOverlay();
        if (safeLastFragment == null) {
            return;
        }
        if (!bool.booleanValue()) {
            if (str != null) {
                lambda$new$0();
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str)).show();
                return;
            }
            return;
        }
        lambda$new$0();
        final ChatActivity of = ChatActivity.of(-this.currentChat.id);
        safeLastFragment.presentFragment(of);
        safeLastFragment.whenFullyVisible(new Runnable() {
            @Override
            public final void run() {
                BoostViaGiftsBottomSheet.lambda$new$11(ChatActivity.this, tL_starsGiveawayOption);
            }
        });
        if (fireworksOverlay != null) {
            fireworksOverlay.start(true);
        }
    }

    public static void lambda$new$11(ChatActivity chatActivity, TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption) {
        BulletinFactory.of(chatActivity).createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) tL_starsGiveawayOption.stars))).setDuration(5000).show(true);
    }

    public void lambda$new$14(Void r3) {
        lambda$new$0();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BoostViaGiftsBottomSheet.this.lambda$new$13();
            }
        }, 220L);
    }

    public void lambda$new$13() {
        NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, this.currentChat, Boolean.FALSE);
    }

    public void lambda$new$15(TLRPC.TL_error tL_error) {
        this.actionBtn.updateLoading(false);
        BoostDialogs.showToastError(getContext(), tL_error);
    }

    public void lambda$new$16(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption) {
        this.selectedSliderIndex = this.sliderValues.indexOf(Integer.valueOf(tL_premiumGiftCodeOption.users));
        updateRows(true, true);
        updateActionButton(true);
    }

    public void lambda$new$18(Void r3) {
        lambda$new$0();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BoostViaGiftsBottomSheet.this.lambda$new$17();
            }
        }, 220L);
    }

    public void lambda$new$17() {
        NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, this.currentChat, Boolean.TRUE);
    }

    public void lambda$new$19(TLRPC.TL_error tL_error) {
        this.actionBtn.updateLoading(false);
        BoostDialogs.showToastError(getContext(), tL_error);
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
    public void lambda$new$0() {
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
                BoostViaGiftsBottomSheet.this.lambda$loadOptions$21((List) obj);
            }
        });
    }

    public void lambda$loadOptions$21(List list) {
        this.giftCodeOptions.clear();
        this.giftCodeOptions.addAll(list);
        updateRows(true, true);
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
        if (this.selectedBoostType == BoostTypeCell.TYPE_PREMIUM) {
            return ((Integer) this.sliderValues.get(this.selectedSliderIndex)).intValue() * BoostRepository.giveawayBoostsPerPremium();
        }
        TL_stars.TL_starsGiveawayOption selectedStarsOption = getSelectedStarsOption();
        return selectedStarsOption != null ? selectedStarsOption.yearly_boosts : getSelectedSliderValue() * BoostRepository.giveawayBoostsPerPremium();
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
            return Math.round(((float) j) / ((float) getSelectedPerUserStars()));
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
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList(this.items);
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
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.currentChat);
        if (this.selectedBoostType == BoostTypeCell.TYPE_STARS) {
            if (!isPreparedGiveaway()) {
                BoostAdapter.Item asSubTitleWithCounter = BoostAdapter.Item.asSubTitleWithCounter(LocaleController.getString(R.string.BoostingStarsOptions), getSelectedSliderValueWithBoosts());
                this.items.add(asSubTitleWithCounter);
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
                            arrayList2 = arrayList3;
                            this.items.add(BoostAdapter.Item.asOption(selectedStarsOption, this.starOptionsExpanded ? i2 : i2 + 2, getSelectedPerUserStars(selectedStarsOption.stars), this.selectedStars == selectedStarsOption.stars, true));
                            i2++;
                            arrayList3 = arrayList2;
                            i = 1;
                        }
                    }
                    arrayList2 = arrayList3;
                    i2++;
                    arrayList3 = arrayList2;
                    i = 1;
                }
                arrayList = arrayList3;
                if (!this.starOptionsExpanded && i3 < starsOptions.size()) {
                    this.items.add(BoostAdapter.Item.asExpandOptions());
                }
                if (i3 <= 0) {
                    this.items.add(BoostAdapter.Item.asOption(null, 0, 1L, false, true));
                    this.items.add(BoostAdapter.Item.asOption(null, 1, 1L, false, true));
                    this.items.add(BoostAdapter.Item.asOption(null, 2, 1L, false, false));
                }
                asSubTitleWithCounter.intValue = getSelectedSliderValueWithBoosts();
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
                arrayList = arrayList3;
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
            this.items.add(BoostAdapter.Item.asDivider(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), false));
        } else {
            arrayList = arrayList3;
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
                this.items.add(BoostAdapter.Item.asDivider(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), false));
            }
            if (!isPreparedGiveaway()) {
                this.items.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingDurationOfPremium)));
                List filterGiftOptions = BoostRepository.filterGiftOptions(this.giftCodeOptions, isGiveaway() ? getSelectedSliderValue() : this.selectedUsers.size());
                int i5 = 0;
                while (i5 < filterGiftOptions.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) filterGiftOptions.get(i5);
                    this.items.add(BoostAdapter.Item.asDuration(tL_premiumGiftCodeOption, tL_premiumGiftCodeOption.months, isGiveaway() ? getSelectedSliderValue() : this.selectedUsers.size(), tL_premiumGiftCodeOption.amount, this.selectedMonths, tL_premiumGiftCodeOption.currency, i5 != filterGiftOptions.size() - 1));
                    i5++;
                }
            }
            if (!isPreparedGiveaway()) {
                this.items.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BoostingStoriesFeaturesAndTerms), Theme.key_chat_messageLinkIn, 0, new Runnable() {
                    @Override
                    public final void run() {
                        BoostViaGiftsBottomSheet.this.lambda$updateRows$24();
                    }
                }, this.resourcesProvider), true));
            }
        }
        if (this.selectedBoostType == BoostTypeCell.TYPE_STARS || this.selectedBoostSubType == BoostTypeCell.TYPE_GIVEAWAY) {
            ArrayList arrayList4 = this.items;
            String string = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
            boolean z6 = this.isAdditionalPrizeSelected;
            arrayList4.add(BoostAdapter.Item.asSwitcher(string, z6, z6, SwitcherCell.TYPE_ADDITION_PRIZE));
            if (this.isAdditionalPrizeSelected) {
                int selectedSliderValue = isPreparedGiveaway() ? this.prepaidGiveaway.quantity : getSelectedSliderValue();
                this.items.add(BoostAdapter.Item.asEnterPrize(selectedSliderValue));
                String formatPluralString = LocaleController.formatPluralString("BoldMonths", this.selectedMonths, new Object[0]);
                if (this.selectedBoostType == BoostTypeCell.TYPE_STARS) {
                    if (this.additionalPrize.isEmpty()) {
                        this.items.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountHint", (int) this.selectedStars, new Object[0])), false));
                    } else {
                        this.items.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountNameHint", (int) this.selectedStars, Integer.valueOf(selectedSliderValue), this.additionalPrize)), false));
                    }
                } else if (this.additionalPrize.isEmpty()) {
                    this.items.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountHint", selectedSliderValue, formatPluralString)), false));
                } else {
                    this.items.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountNameHint", selectedSliderValue, this.additionalPrize, formatPluralString)), false));
                }
            } else {
                this.items.add(BoostAdapter.Item.asDivider(LocaleController.getString(this.selectedBoostType == BoostTypeCell.TYPE_STARS ? R.string.BoostingStarsGiveawayAdditionPrizeHint : R.string.BoostingGiveawayAdditionPrizeHint), false));
            }
            this.items.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
            this.items.add(BoostAdapter.Item.asDateEnd(this.selectedEndDate));
            if (this.selectedBoostType == BoostTypeCell.TYPE_STARS) {
                if (!isPreparedGiveaway()) {
                    this.items.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", getSelectedSliderValue(), LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.selectedStars, new Object[0])), false));
                } else {
                    this.items.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", this.prepaidGiveaway.quantity, LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.selectedStars, new Object[0])), false));
                }
                z4 = false;
            } else {
                if (!isPreparedGiveaway()) {
                    z4 = false;
                    this.items.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", getSelectedSliderValue(), new Object[0]), false));
                } else {
                    z4 = false;
                    this.items.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", this.prepaidGiveaway.quantity, new Object[0]), false));
                }
            }
            this.items.add(BoostAdapter.Item.asSwitcher(LocaleController.getString(R.string.BoostingGiveawayShowWinners), this.isShowWinnersSelected, z4, SwitcherCell.TYPE_WINNERS));
            if (!isPreparedGiveaway()) {
                this.items.add(BoostAdapter.Item.asDivider(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint), z4));
            } else {
                ArrayList arrayList5 = this.items;
                StringBuilder sb = new StringBuilder();
                sb.append(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint));
                sb.append(this.selectedBoostType != BoostTypeCell.TYPE_STARS ? "\n\n" + LocaleController.getString(R.string.BoostingStoriesFeaturesAndTerms) : "");
                arrayList5.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceSingleTag(sb.toString(), Theme.key_chat_messageLinkIn, 0, new Runnable() {
                    @Override
                    public final void run() {
                        BoostViaGiftsBottomSheet.this.lambda$updateRows$27();
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

    public void lambda$updateRows$24() {
        PremiumPreviewBottomSheet premiumPreviewBottomSheet = new PremiumPreviewBottomSheet(getBaseFragment(), this.currentAccount, null, this.resourcesProvider);
        premiumPreviewBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                BoostViaGiftsBottomSheet.this.lambda$updateRows$22(dialogInterface);
            }
        });
        premiumPreviewBottomSheet.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                BoostViaGiftsBottomSheet.this.lambda$updateRows$23(dialogInterface);
            }
        });
        premiumPreviewBottomSheet.show();
    }

    public void lambda$updateRows$22(DialogInterface dialogInterface) {
        this.adapter.setPausedStars(false);
    }

    public void lambda$updateRows$23(DialogInterface dialogInterface) {
        this.adapter.setPausedStars(true);
    }

    public void lambda$updateRows$27() {
        PremiumPreviewBottomSheet premiumPreviewBottomSheet = new PremiumPreviewBottomSheet(getBaseFragment(), this.currentAccount, null, this.resourcesProvider);
        premiumPreviewBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                BoostViaGiftsBottomSheet.this.lambda$updateRows$25(dialogInterface);
            }
        });
        premiumPreviewBottomSheet.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                BoostViaGiftsBottomSheet.this.lambda$updateRows$26(dialogInterface);
            }
        });
        premiumPreviewBottomSheet.show();
    }

    public void lambda$updateRows$25(DialogInterface dialogInterface) {
        this.adapter.setPausedStars(false);
    }

    public void lambda$updateRows$26(DialogInterface dialogInterface) {
        this.adapter.setPausedStars(true);
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
