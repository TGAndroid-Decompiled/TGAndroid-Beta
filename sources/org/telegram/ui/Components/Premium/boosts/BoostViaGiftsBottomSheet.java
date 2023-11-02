package org.telegram.ui.Components.Premium.boosts;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DefaultItemAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_help_country;
import org.telegram.tgnet.TLRPC$TL_premiumGiftCodeOption;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.tl.TL_stories$TL_prepaidGiveaway;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
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
import org.telegram.ui.Components.Premium.boosts.cells.ParticipantsTypeCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SlideChooseView;
public class BoostViaGiftsBottomSheet extends BottomSheetWithRecyclerListView implements SelectorBottomSheet.SelectedObjectsListener {
    private ActionBtnCell actionBtn;
    private ActionListener actionListener;
    private BoostAdapter adapter;
    private final TLRPC$Chat currentChat;
    private final List<TLRPC$TL_premiumGiftCodeOption> giftCodeOptions;
    private final ArrayList<BoostAdapter.Item> items;
    private Runnable onCloseClick;
    private final TL_stories$TL_prepaidGiveaway prepaidGiveaway;
    private int selectedBoostType;
    private final List<TLObject> selectedChats;
    private final List<TLObject> selectedCountries;
    private long selectedEndDate;
    private int selectedMonths;
    private int selectedParticipantsType;
    private int selectedSliderIndex;
    private final List<TLObject> selectedUsers;
    private final List<Integer> sliderValues;
    private int top;

    public interface ActionListener {
        void onAddChat(List<TLObject> list);

        void onSelectCountries(List<TLObject> list);

        void onSelectUser(List<TLObject> list);
    }

    @Override
    protected boolean needPaddingShadow() {
        return false;
    }

    @Override
    public void onShowToast(String str) {
        SelectorBottomSheet.SelectedObjectsListener.CC.$default$onShowToast(this, str);
    }

    public BoostViaGiftsBottomSheet(final BaseFragment baseFragment, boolean z, boolean z2, long j, final TL_stories$TL_prepaidGiveaway tL_stories$TL_prepaidGiveaway) {
        super(baseFragment, z, z2);
        ArrayList<BoostAdapter.Item> arrayList = new ArrayList<>();
        this.items = arrayList;
        this.sliderValues = BoostRepository.isGoogleBillingAvailable() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.selectedChats = new ArrayList();
        this.selectedUsers = new ArrayList();
        this.selectedCountries = new ArrayList();
        this.giftCodeOptions = new ArrayList();
        this.selectedBoostType = BoostTypeCell.TYPE_GIVEAWAY;
        this.selectedParticipantsType = ParticipantsTypeCell.TYPE_ALL;
        this.selectedMonths = 12;
        this.selectedEndDate = BoostDialogs.getThreeDaysAfterToday();
        this.selectedSliderIndex = 2;
        this.prepaidGiveaway = tL_stories$TL_prepaidGiveaway;
        this.topPadding = 0.3f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        updateTitle();
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        ((ViewGroup.MarginLayoutParams) this.actionBar.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.actionBar.getLayoutParams()).rightMargin = 0;
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, AndroidUtilities.dp(68.0f));
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                BoostViaGiftsBottomSheet.this.lambda$new$1(baseFragment, view, i2);
            }
        });
        this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        this.adapter.setItems(arrayList, this.recyclerListView, new SlideChooseView.Callback() {
            @Override
            public final void onOptionSelected(int i2) {
                BoostViaGiftsBottomSheet.this.lambda$new$2(i2);
            }

            @Override
            public void onTouchEnd() {
                SlideChooseView.Callback.CC.$default$onTouchEnd(this);
            }
        }, new ChatCell.ChatDeleteListener() {
            @Override
            public final void onChatDeleted(TLRPC$Chat tLRPC$Chat) {
                BoostViaGiftsBottomSheet.this.lambda$new$3(tLRPC$Chat);
            }
        });
        updateRows(false, false);
        ActionBtnCell actionBtnCell = new ActionBtnCell(getContext(), this.resourcesProvider);
        this.actionBtn = actionBtnCell;
        actionBtnCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BoostViaGiftsBottomSheet.this.lambda$new$14(baseFragment, tL_stories$TL_prepaidGiveaway, view);
            }
        });
        updateActionButton(false);
        this.containerView.addView(this.actionBtn, LayoutHelper.createFrame(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        loadOptions();
    }

    public void lambda$new$1(BaseFragment baseFragment, View view, int i) {
        ActionListener actionListener;
        ActionListener actionListener2;
        if (view instanceof BaseCell) {
            if (view instanceof BoostTypeCell) {
                int selectedType = ((BoostTypeCell) view).getSelectedType();
                if (selectedType == BoostTypeCell.TYPE_SPECIFIC_USERS) {
                    ActionListener actionListener3 = this.actionListener;
                    if (actionListener3 != null) {
                        actionListener3.onSelectUser(this.selectedUsers);
                    }
                } else {
                    ((BaseCell) view).markChecked(this.recyclerListView);
                    this.selectedBoostType = selectedType;
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
            if (this.selectedParticipantsType == selectedType2 && (actionListener2 = this.actionListener) != null) {
                actionListener2.onSelectCountries(this.selectedCountries);
            }
            this.selectedParticipantsType = selectedType2;
        } else if (view instanceof DurationCell) {
            this.selectedMonths = ((TLRPC$TL_premiumGiftCodeOption) ((DurationCell) view).getGifCode()).months;
            updateRows(false, false);
        } else if (view instanceof DateEndCell) {
            BoostDialogs.showDatePicker(baseFragment.getContext(), this.selectedEndDate, new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i2) {
                    BoostViaGiftsBottomSheet.this.lambda$new$0(z, i2);
                }
            }, this.resourcesProvider);
        } else if (!(view instanceof AddChannelCell) || (actionListener = this.actionListener) == null) {
        } else {
            actionListener.onAddChat(this.selectedChats);
        }
    }

    public void lambda$new$0(boolean z, int i) {
        this.selectedEndDate = i * 1000;
        updateRows(false, true);
    }

    public void lambda$new$2(int i) {
        this.selectedSliderIndex = i;
        this.actionBtn.updateCounter(getSelectedSliderValueWithBoosts());
        updateRows(false, false);
        this.adapter.updateBoostCounter(getSelectedSliderValueWithBoosts());
    }

    public void lambda$new$3(TLRPC$Chat tLRPC$Chat) {
        this.selectedChats.remove(tLRPC$Chat);
        updateRows(true, true);
    }

    public void lambda$new$14(BaseFragment baseFragment, final TL_stories$TL_prepaidGiveaway tL_stories$TL_prepaidGiveaway, View view) {
        if (this.actionBtn.isLoading()) {
            return;
        }
        if (this.selectedBoostType == BoostTypeCell.TYPE_SPECIFIC_USERS) {
            List<TLRPC$TL_premiumGiftCodeOption> filterGiftOptions = BoostRepository.filterGiftOptions(this.giftCodeOptions, this.selectedUsers.size());
            for (int i = 0; i < filterGiftOptions.size(); i++) {
                TLRPC$TL_premiumGiftCodeOption tLRPC$TL_premiumGiftCodeOption = filterGiftOptions.get(i);
                if (tLRPC$TL_premiumGiftCodeOption.months == this.selectedMonths && this.selectedUsers.size() > 0) {
                    if (BoostRepository.isGoogleBillingAvailable() && BoostDialogs.checkReduceUsers(getContext(), this.resourcesProvider, this.giftCodeOptions, tLRPC$TL_premiumGiftCodeOption)) {
                        return;
                    }
                    this.actionBtn.updateLoading(true);
                    BoostRepository.payGiftCode(this.selectedUsers, tLRPC$TL_premiumGiftCodeOption, this.currentChat, baseFragment, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            BoostViaGiftsBottomSheet.this.lambda$new$5((Void) obj);
                        }
                    }, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            BoostViaGiftsBottomSheet.this.lambda$new$6((TLRPC$TL_error) obj);
                        }
                    });
                    return;
                }
            }
            return;
        }
        List<TLRPC$TL_premiumGiftCodeOption> filterGiftOptions2 = BoostRepository.filterGiftOptions(this.giftCodeOptions, getSelectedSliderValue());
        if (isPreparedGiveaway()) {
            int prepareServerDate = BoostRepository.prepareServerDate(this.selectedEndDate);
            boolean z = this.selectedParticipantsType == ParticipantsTypeCell.TYPE_NEW;
            this.actionBtn.updateLoading(true);
            BoostRepository.launchPreparedGiveaway(tL_stories$TL_prepaidGiveaway, this.selectedChats, this.selectedCountries, this.currentChat, prepareServerDate, z, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    BoostViaGiftsBottomSheet.this.lambda$new$8(tL_stories$TL_prepaidGiveaway, (Void) obj);
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    BoostViaGiftsBottomSheet.this.lambda$new$9((TLRPC$TL_error) obj);
                }
            });
            return;
        }
        for (int i2 = 0; i2 < filterGiftOptions2.size(); i2++) {
            TLRPC$TL_premiumGiftCodeOption tLRPC$TL_premiumGiftCodeOption2 = filterGiftOptions2.get(i2);
            if (tLRPC$TL_premiumGiftCodeOption2.months == this.selectedMonths) {
                if (BoostRepository.isGoogleBillingAvailable() && BoostDialogs.checkReduceQuantity(this.sliderValues, getContext(), this.resourcesProvider, this.giftCodeOptions, tLRPC$TL_premiumGiftCodeOption2, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        BoostViaGiftsBottomSheet.this.lambda$new$10((TLRPC$TL_premiumGiftCodeOption) obj);
                    }
                })) {
                    return;
                }
                boolean z2 = this.selectedParticipantsType == ParticipantsTypeCell.TYPE_NEW;
                int prepareServerDate2 = BoostRepository.prepareServerDate(this.selectedEndDate);
                this.actionBtn.updateLoading(true);
                BoostRepository.payGiveAway(this.selectedChats, this.selectedCountries, tLRPC$TL_premiumGiftCodeOption2, this.currentChat, prepareServerDate2, z2, baseFragment, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        BoostViaGiftsBottomSheet.this.lambda$new$12((Void) obj);
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        BoostViaGiftsBottomSheet.this.lambda$new$13((TLRPC$TL_error) obj);
                    }
                });
                return;
            }
        }
    }

    public void lambda$new$5(Void r3) {
        dismiss();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BoostViaGiftsBottomSheet.this.lambda$new$4();
            }
        }, 220L);
    }

    public void lambda$new$4() {
        NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, this.currentChat, Boolean.FALSE);
    }

    public void lambda$new$6(TLRPC$TL_error tLRPC$TL_error) {
        this.actionBtn.updateLoading(false);
        BoostDialogs.showToastError(getContext(), tLRPC$TL_error);
    }

    public void lambda$new$8(final TL_stories$TL_prepaidGiveaway tL_stories$TL_prepaidGiveaway, Void r4) {
        dismiss();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BoostViaGiftsBottomSheet.this.lambda$new$7(tL_stories$TL_prepaidGiveaway);
            }
        }, 220L);
    }

    public void lambda$new$7(TL_stories$TL_prepaidGiveaway tL_stories$TL_prepaidGiveaway) {
        NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, this.currentChat, Boolean.TRUE, tL_stories$TL_prepaidGiveaway);
    }

    public void lambda$new$9(TLRPC$TL_error tLRPC$TL_error) {
        this.actionBtn.updateLoading(false);
        BoostDialogs.showToastError(getContext(), tLRPC$TL_error);
    }

    public void lambda$new$10(TLRPC$TL_premiumGiftCodeOption tLRPC$TL_premiumGiftCodeOption) {
        this.selectedSliderIndex = this.sliderValues.indexOf(Integer.valueOf(tLRPC$TL_premiumGiftCodeOption.users));
        updateRows(true, true);
        updateActionButton(true);
    }

    public void lambda$new$12(Void r3) {
        dismiss();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BoostViaGiftsBottomSheet.this.lambda$new$11();
            }
        }, 220L);
    }

    public void lambda$new$11() {
        NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, this.currentChat, Boolean.TRUE);
    }

    public void lambda$new$13(TLRPC$TL_error tLRPC$TL_error) {
        this.actionBtn.updateLoading(false);
        BoostDialogs.showToastError(getContext(), tLRPC$TL_error);
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
    }

    private void loadOptions() {
        BoostRepository.loadGiftOptions(this.currentChat, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BoostViaGiftsBottomSheet.this.lambda$loadOptions$15((List) obj);
            }
        });
    }

    public void lambda$loadOptions$15(List list) {
        this.giftCodeOptions.clear();
        this.giftCodeOptions.addAll(list);
        updateRows(true, true);
    }

    private void updateActionButton(boolean z) {
        if (isPreparedGiveaway()) {
            this.actionBtn.setStartGiveAwayStyle(this.prepaidGiveaway.quantity * BoostRepository.giveawayBoostsPerPremium(), z);
        } else if (this.selectedBoostType == BoostTypeCell.TYPE_GIVEAWAY) {
            this.actionBtn.setStartGiveAwayStyle(getSelectedSliderValueWithBoosts(), z);
        } else {
            this.actionBtn.setGiftPremiumStyle(this.selectedUsers.size() * BoostRepository.giveawayBoostsPerPremium(), z, this.selectedUsers.size() > 0);
        }
    }

    private boolean isGiveaway() {
        return this.selectedBoostType == BoostTypeCell.TYPE_GIVEAWAY;
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
        return this.sliderValues.get(this.selectedSliderIndex).intValue();
    }

    private int getSelectedSliderValueWithBoosts() {
        return this.sliderValues.get(this.selectedSliderIndex).intValue() * BoostRepository.giveawayBoostsPerPremium();
    }

    private boolean isPreparedGiveaway() {
        return this.prepaidGiveaway != null;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void updateRows(boolean z, boolean z2) {
        ArrayList<? extends AdapterWithDiffUtils.Item> arrayList = new ArrayList<>(this.items);
        this.items.clear();
        this.items.add(BoostAdapter.Item.asHeader());
        if (isPreparedGiveaway()) {
            this.items.add(BoostAdapter.Item.asSingleBoost(this.prepaidGiveaway));
        } else {
            this.items.add(BoostAdapter.Item.asBoost(BoostTypeCell.TYPE_GIVEAWAY, this.selectedUsers.size(), null, this.selectedBoostType));
            this.items.add(BoostAdapter.Item.asBoost(BoostTypeCell.TYPE_SPECIFIC_USERS, this.selectedUsers.size(), this.selectedUsers.size() > 0 ? this.selectedUsers.get(0) : null, this.selectedBoostType));
        }
        this.items.add(BoostAdapter.Item.asDivider());
        if (this.selectedBoostType == BoostTypeCell.TYPE_GIVEAWAY) {
            if (!isPreparedGiveaway()) {
                this.items.add(BoostAdapter.Item.asSubTitleWithCounter(LocaleController.getString("BoostingQuantityPrizes", R.string.BoostingQuantityPrizes), getSelectedSliderValueWithBoosts()));
                this.items.add(BoostAdapter.Item.asSlider(this.sliderValues, this.selectedSliderIndex));
                this.items.add(BoostAdapter.Item.asDivider(LocaleController.getString("BoostingChooseHowMany", R.string.BoostingChooseHowMany), false));
            }
            this.items.add(BoostAdapter.Item.asSubTitle(LocaleController.getString("BoostingChannelsIncludedGiveaway", R.string.BoostingChannelsIncludedGiveaway)));
            if (isPreparedGiveaway()) {
                this.items.add(BoostAdapter.Item.asChat(this.currentChat, false, this.prepaidGiveaway.quantity * BoostRepository.giveawayBoostsPerPremium()));
            } else {
                this.items.add(BoostAdapter.Item.asChat(this.currentChat, false, getSelectedSliderValueWithBoosts()));
            }
            for (TLObject tLObject : this.selectedChats) {
                if (tLObject instanceof TLRPC$Chat) {
                    this.items.add(BoostAdapter.Item.asChat((TLRPC$Chat) tLObject, true, getSelectedSliderValueWithBoosts()));
                }
                if (tLObject instanceof TLRPC$InputPeer) {
                    this.items.add(BoostAdapter.Item.asPeer((TLRPC$InputPeer) tLObject, true, getSelectedSliderValueWithBoosts()));
                }
            }
            if (this.selectedChats.size() < BoostRepository.giveawayAddPeersMax()) {
                this.items.add(BoostAdapter.Item.asAddChannel());
            }
            this.items.add(BoostAdapter.Item.asDivider(LocaleController.getString("BoostingChooseChannelsNeedToJoin", R.string.BoostingChooseChannelsNeedToJoin), false));
            this.items.add(BoostAdapter.Item.asSubTitle(LocaleController.getString("BoostingEligibleUsers", R.string.BoostingEligibleUsers)));
            this.items.add(BoostAdapter.Item.asParticipants(ParticipantsTypeCell.TYPE_ALL, this.selectedParticipantsType, true, this.selectedCountries));
            this.items.add(BoostAdapter.Item.asParticipants(ParticipantsTypeCell.TYPE_NEW, this.selectedParticipantsType, false, this.selectedCountries));
            this.items.add(BoostAdapter.Item.asDivider(LocaleController.getString("BoostingChooseLimitGiveaway", R.string.BoostingChooseLimitGiveaway), false));
            this.items.add(BoostAdapter.Item.asSubTitle(LocaleController.getString("BoostingDateWhenGiveawayEnds", R.string.BoostingDateWhenGiveawayEnds)));
            this.items.add(BoostAdapter.Item.asDateEnd(this.selectedEndDate));
            if (!isPreparedGiveaway()) {
                this.items.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString("BoostingChooseRandom", getSelectedSliderValue(), new Object[0]), false));
            }
        }
        if (!isPreparedGiveaway()) {
            this.items.add(BoostAdapter.Item.asSubTitle(LocaleController.getString("BoostingDurationOfPremium", R.string.BoostingDurationOfPremium)));
            List<TLRPC$TL_premiumGiftCodeOption> filterGiftOptions = BoostRepository.filterGiftOptions(this.giftCodeOptions, isGiveaway() ? getSelectedSliderValue() : this.selectedUsers.size());
            int i = 0;
            while (i < filterGiftOptions.size()) {
                TLRPC$TL_premiumGiftCodeOption tLRPC$TL_premiumGiftCodeOption = filterGiftOptions.get(i);
                this.items.add(BoostAdapter.Item.asDuration(tLRPC$TL_premiumGiftCodeOption, tLRPC$TL_premiumGiftCodeOption.months, isGiveaway() ? getSelectedSliderValue() : this.selectedUsers.size(), tLRPC$TL_premiumGiftCodeOption.amount, this.selectedMonths, tLRPC$TL_premiumGiftCodeOption.currency, i != filterGiftOptions.size() - 1));
                i++;
            }
        }
        this.items.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceSingleTag(isPreparedGiveaway() ? LocaleController.formatPluralString("BoostingChooseRandom", this.prepaidGiveaway.quantity, new Object[0]) + "\n\n" + LocaleController.getString("BoostingStoriesFeaturesAndTerms", R.string.BoostingStoriesFeaturesAndTerms) : LocaleController.getString("BoostingStoriesFeaturesAndTerms", R.string.BoostingStoriesFeaturesAndTerms), Theme.key_chat_messageLinkIn, 0, new Runnable() {
            @Override
            public final void run() {
                BoostViaGiftsBottomSheet.this.lambda$updateRows$18();
            }
        }, this.resourcesProvider), true));
        BoostAdapter boostAdapter = this.adapter;
        if (boostAdapter != null && z2) {
            if (z) {
                boostAdapter.setItems(arrayList, this.items);
            } else {
                boostAdapter.notifyDataSetChanged();
            }
        }
    }

    public void lambda$updateRows$18() {
        PremiumPreviewBottomSheet premiumPreviewBottomSheet = new PremiumPreviewBottomSheet(getBaseFragment(), this.currentAccount, null, this.resourcesProvider);
        premiumPreviewBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                BoostViaGiftsBottomSheet.this.lambda$updateRows$16(dialogInterface);
            }
        });
        premiumPreviewBottomSheet.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                BoostViaGiftsBottomSheet.this.lambda$updateRows$17(dialogInterface);
            }
        });
        premiumPreviewBottomSheet.show();
    }

    public void lambda$updateRows$16(DialogInterface dialogInterface) {
        this.adapter.setPausedStars(false);
    }

    public void lambda$updateRows$17(DialogInterface dialogInterface) {
        this.adapter.setPausedStars(true);
    }

    @Override
    protected CharSequence getTitle() {
        if (this.selectedBoostType == BoostTypeCell.TYPE_SPECIFIC_USERS) {
            return LocaleController.getString("GiftPremium", R.string.GiftPremium);
        }
        return LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter() {
        BoostAdapter boostAdapter = new BoostAdapter(this.resourcesProvider);
        this.adapter = boostAdapter;
        return boostAdapter;
    }

    @Override
    public void onChatsSelected(List<TLRPC$Chat> list) {
        this.selectedChats.clear();
        this.selectedChats.addAll(list);
        updateRows(true, true);
    }

    @Override
    public void onUsersSelected(List<TLRPC$User> list) {
        this.selectedUsers.clear();
        this.selectedUsers.addAll(list);
        if (list.isEmpty()) {
            this.selectedBoostType = BoostTypeCell.TYPE_GIVEAWAY;
        } else {
            this.selectedBoostType = BoostTypeCell.TYPE_SPECIFIC_USERS;
        }
        this.selectedSliderIndex = 0;
        updateRows(false, true);
        updateActionButton(true);
        updateTitle();
    }

    @Override
    public void onCountrySelected(List<TLRPC$TL_help_country> list) {
        this.selectedCountries.clear();
        this.selectedCountries.addAll(list);
        updateRows(false, true);
    }
}
