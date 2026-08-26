package org.telegram.ui.Components.Premium.boosts;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.AccountIdentifiers;
import com.google.zxing.BinaryBitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController$$ExternalSyntheticLambda8;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda54;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda0;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda206;
import org.telegram.ui.ChatActivity$106$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.boosts.adapters.BoostAdapter;
import org.telegram.ui.Components.Premium.boosts.cells.ActionBtnCell;
import org.telegram.ui.Components.Premium.boosts.cells.AddChannelCell;
import org.telegram.ui.Components.Premium.boosts.cells.BaseCell;
import org.telegram.ui.Components.Premium.boosts.cells.BoostTypeCell;
import org.telegram.ui.Components.Premium.boosts.cells.DateEndCell;
import org.telegram.ui.Components.Premium.boosts.cells.DurationCell;
import org.telegram.ui.Components.Premium.boosts.cells.ParticipantsTypeCell;
import org.telegram.ui.Components.Premium.boosts.cells.StarGiveawayOptionCell;
import org.telegram.ui.Components.Premium.boosts.cells.SwitcherCell;
import org.telegram.ui.Components.ProfileGooeyView$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda15;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda51;
import org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda23;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.PassportActivity$3$$ExternalSyntheticLambda3;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.bots.BotWebViewSheet;

public final class BoostViaGiftsBottomSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    public final ActionBtnCell actionBtn;
    public BinaryBitmap actionListener;
    public BoostAdapter adapter;
    public String additionalPrize;
    public final TLRPC.Chat currentChat;
    public final ArrayList giftCodeOptions;
    public final BoostViaGiftsBottomSheet$$ExternalSyntheticLambda0 hideKeyboardRunnable;
    public boolean isAdditionalPrizeSelected;
    public boolean isShowWinnersSelected;
    public final ArrayList items;
    public BoostPagerBottomSheet$$ExternalSyntheticLambda0 onCloseClick;
    public final TL_stories.PrepaidGiveaway prepaidGiveaway;
    public int selectedBoostSubType;
    public int selectedBoostType;
    public final ArrayList selectedChats;
    public final ArrayList selectedCountries;
    public long selectedEndDate;
    public int selectedMonths;
    public int selectedParticipantsType;
    public int selectedSliderIndex;
    public long selectedStars;
    public int selectedStarsSliderIndex;
    public final ArrayList selectedUsers;
    public final List sliderValues;
    public boolean starOptionsExpanded;
    public int top;

    public final class AnonymousClass1 extends RecyclerView.OnScrollListener {
        @Override
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 1) {
                AndroidUtilities.hideKeyboard(recyclerView);
            }
        }
    }

    public BoostViaGiftsBottomSheet(long j, TL_stories.PrepaidGiveaway prepaidGiveaway, BaseFragment baseFragment) {
        super(baseFragment, false);
        int i = 0;
        this.items = new ArrayList();
        int i2 = 5;
        this.sliderValues = BoostRepository.isGoogleBillingAvailable() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        if (BoostRepository.isGoogleBillingAvailable()) {
            Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        Arrays.asList(750, 10000, 50000);
        this.selectedChats = new ArrayList();
        this.selectedUsers = new ArrayList();
        this.selectedCountries = new ArrayList();
        this.giftCodeOptions = new ArrayList();
        int i3 = BoostTypeCell.$r8$clinit;
        this.selectedBoostType = 2;
        this.selectedBoostSubType = 0;
        int i4 = ParticipantsTypeCell.$r8$clinit;
        this.selectedParticipantsType = 0;
        this.selectedMonths = 12;
        long time = new Date().getTime() + 259200000;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i5 = calendar.get(12);
        while (i5 % 5 != 0) {
            i5++;
        }
        calendar.set(12, i5);
        this.selectedEndDate = calendar.getTimeInMillis();
        this.selectedSliderIndex = 2;
        this.selectedStarsSliderIndex = 2;
        this.additionalPrize = "";
        this.isShowWinnersSelected = true;
        this.hideKeyboardRunnable = new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda0(this, i);
        this.prepaidGiveaway = prepaidGiveaway;
        this.topPadding = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        updateTitle$1();
        ((ViewGroup.MarginLayoutParams) this.actionBar.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.actionBar.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i6 = BoostTypeCell.$r8$clinit;
            this.selectedBoostType = 3;
        }
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.delayAnimations = false;
        defaultItemAnimator.mSupportsChangeAnimations = false;
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i7 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i7, 0, i7, AndroidUtilities.dp(68.0f));
        this.recyclerListView.setOnScrollListener(new AnonymousClass1());
        this.recyclerListView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(11, this, baseFragment));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        this.currentChat = chat;
        BoostAdapter boostAdapter = this.adapter;
        ArrayList arrayList = this.items;
        RecyclerListView recyclerListView2 = this.recyclerListView;
        BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2 boostViaGiftsBottomSheet$$ExternalSyntheticLambda2 = new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2(this);
        BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2 boostViaGiftsBottomSheet$$ExternalSyntheticLambda3 = new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2(this);
        BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2 boostViaGiftsBottomSheet$$ExternalSyntheticLambda4 = new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2(this);
        boostAdapter.items = arrayList;
        boostAdapter.currentChat = chat;
        boostAdapter.recyclerListView = recyclerListView2;
        boostAdapter.sliderCallback = boostViaGiftsBottomSheet$$ExternalSyntheticLambda2;
        boostAdapter.chatDeleteListener = boostViaGiftsBottomSheet$$ExternalSyntheticLambda3;
        boostAdapter.afterTextChangedListener = boostViaGiftsBottomSheet$$ExternalSyntheticLambda4;
        updateRows(false, false);
        ActionBtnCell actionBtnCell = new ActionBtnCell(getContext(), this.resourcesProvider);
        this.actionBtn = actionBtnCell;
        actionBtnCell.setOnClickListener(new DialogsActivity$$ExternalSyntheticLambda51(this, prepaidGiveaway, j, baseFragment));
        updateActionButton(false);
        this.containerView.addView(actionBtnCell, LayoutHelper.createFrame(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        BoostRepository.loadGiftOptions(this.currentAccount, chat, new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13(this, i2));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        BoostAdapter boostAdapter = new BoostAdapter(this.resourcesProvider);
        this.adapter = boostAdapter;
        return boostAdapter;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        RecyclerListView recyclerListView;
        if (i == NotificationCenter.starGiveawayOptionsLoaded && (recyclerListView = this.recyclerListView) != null && recyclerListView.mIsAttached) {
            updateRows(true, true);
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        BoostPagerBottomSheet$$ExternalSyntheticLambda0 boostPagerBottomSheet$$ExternalSyntheticLambda0 = this.onCloseClick;
        if (boostPagerBottomSheet$$ExternalSyntheticLambda0 != null) {
            boostPagerBottomSheet$$ExternalSyntheticLambda0.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public final ArrayList getPerUserStarsValues(long j) {
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

    public final int getSelectedSliderValue() {
        int i = this.selectedBoostType;
        int i2 = BoostTypeCell.$r8$clinit;
        if (i == 2) {
            return ((Integer) this.sliderValues.get(this.selectedSliderIndex)).intValue();
        }
        List sliderValues = getSliderValues();
        int i3 = this.selectedStarsSliderIndex;
        if (i3 < 0 || i3 >= sliderValues.size()) {
            this.selectedStarsSliderIndex = 0;
        }
        if (this.selectedStarsSliderIndex >= sliderValues.size()) {
            return 0;
        }
        return ((Integer) sliderValues.get(this.selectedStarsSliderIndex)).intValue();
    }

    public final int getSelectedSliderValueWithBoosts() {
        int selectedSliderValue;
        long j;
        int i = this.selectedBoostType;
        int i2 = BoostTypeCell.$r8$clinit;
        if (i == 2) {
            selectedSliderValue = ((Integer) this.sliderValues.get(this.selectedSliderIndex)).intValue();
            j = MessagesController.getInstance(UserConfig.selectedAccount).giveawayBoostsPerPremium;
        } else {
            TL_stars.TL_starsGiveawayOption selectedStarsOption = getSelectedStarsOption(this.selectedStars);
            if (selectedStarsOption != null) {
                return selectedStarsOption.yearly_boosts;
            }
            selectedSliderValue = getSelectedSliderValue();
            j = MessagesController.getInstance(UserConfig.selectedAccount).giveawayBoostsPerPremium;
        }
        return selectedSliderValue * ((int) j);
    }

    public final TL_stars.TL_starsGiveawayOption getSelectedStarsOption(long j) {
        ArrayList giveawayOptions = StarsController.getInstance(this.currentAccount, false).getGiveawayOptions();
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

    public final List getSliderValues() {
        int i = this.selectedBoostType;
        int i2 = BoostTypeCell.$r8$clinit;
        if (i == 2) {
            return this.sliderValues;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption selectedStarsOption = getSelectedStarsOption(this.selectedStars);
        if (selectedStarsOption != null) {
            for (int i3 = 0; i3 < selectedStarsOption.winners.size(); i3++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = selectedStarsOption.winners.get(i3);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    @Override
    public final CharSequence getTitle() {
        int i = this.selectedBoostSubType;
        int i2 = BoostTypeCell.$r8$clinit;
        return i == 1 ? LocaleController.getString(R.string.GiftPremium) : LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }

    public final boolean isPreparedGiveaway() {
        return this.prepaidGiveaway != null;
    }

    public final void lambda$new$2(BaseFragment baseFragment, View view) {
        BinaryBitmap binaryBitmap;
        if (view instanceof SwitcherCell) {
            SwitcherCell switcherCell = (SwitcherCell) view;
            int type = switcherCell.getType();
            boolean z = switcherCell.checkBox.isChecked;
            boolean z2 = !z;
            switcherCell.setChecked(z2);
            int i = SwitcherCell.$r8$clinit;
            if (type == 0) {
                this.isShowWinnersSelected = z2;
                updateRows(false, false);
            } else if (type == 1) {
                switcherCell.setDivider(z2);
                this.isAdditionalPrizeSelected = z2;
                updateRows(false, false);
                BoostAdapter boostAdapter = this.adapter;
                for (int i2 = 0; i2 < boostAdapter.items.size(); i2++) {
                    BoostAdapter.Item item = (BoostAdapter.Item) boostAdapter.items.get(i2);
                    if (item.viewType == 15) {
                        int i3 = item.subType;
                        int i4 = SwitcherCell.$r8$clinit;
                        if (i3 == 1) {
                            RecyclerView.AdapterDataObservable adapterDataObservable = boostAdapter.mObservable;
                            if (z) {
                                adapterDataObservable.notifyItemRangeRemoved(i2 + 1, 1);
                                break;
                            } else {
                                adapterDataObservable.notifyItemRangeInserted(i2 + 1, 1);
                                break;
                            }
                        }
                    }
                }
                BoostAdapter boostAdapter2 = this.adapter;
                for (int i5 = 0; i5 < boostAdapter2.items.size(); i5++) {
                    if (((BoostAdapter.Item) boostAdapter2.items.get(i5)).viewType == 7) {
                        boostAdapter2.notifyItemChanged(i5);
                    }
                }
                boolean z3 = this.isAdditionalPrizeSelected;
                BoostViaGiftsBottomSheet$$ExternalSyntheticLambda0 boostViaGiftsBottomSheet$$ExternalSyntheticLambda0 = this.hideKeyboardRunnable;
                if (z3) {
                    AndroidUtilities.cancelRunOnUIThread(boostViaGiftsBottomSheet$$ExternalSyntheticLambda0);
                } else {
                    AndroidUtilities.runOnUIThread(boostViaGiftsBottomSheet$$ExternalSyntheticLambda0, 250L);
                }
            }
        }
        if (view instanceof BaseCell) {
            if (!(view instanceof BoostTypeCell)) {
                BaseCell baseCell = (BaseCell) view;
                if (baseCell.needCheck()) {
                    int i6 = 0;
                    while (true) {
                        RecyclerListView recyclerListView = this.recyclerListView;
                        if (i6 >= recyclerListView.getChildCount()) {
                            break;
                        }
                        View childAt = recyclerListView.getChildAt(i6);
                        if (childAt.getClass().isInstance(baseCell)) {
                            ((BaseCell) childAt).setChecked(childAt == baseCell, true);
                        }
                        i6++;
                    }
                }
            } else {
                int selectedType = ((BoostTypeCell) view).getSelectedType();
                int i7 = BoostTypeCell.$r8$clinit;
                ArrayList arrayList = this.selectedUsers;
                if (selectedType == 2 || selectedType == 3) {
                    if (selectedType == 2 && this.selectedBoostType == selectedType) {
                        BinaryBitmap binaryBitmap2 = this.actionListener;
                        if (binaryBitmap2 != null) {
                            ((SelectorBottomSheet) binaryBitmap2.binarizer).prepare(1, arrayList);
                            ((BoostPagerBottomSheet) binaryBitmap2.matrix).viewPager.scrollToPosition$1(1);
                            return;
                        }
                        return;
                    }
                    this.selectedBoostType = selectedType;
                    updateRows(true, true);
                    updateActionButton(true);
                    updateTitle$1();
                } else if (selectedType == 1) {
                    BinaryBitmap binaryBitmap3 = this.actionListener;
                    if (binaryBitmap3 != null) {
                        ((SelectorBottomSheet) binaryBitmap3.binarizer).prepare(1, arrayList);
                        ((BoostPagerBottomSheet) binaryBitmap3.matrix).viewPager.scrollToPosition$1(1);
                    }
                } else {
                    this.selectedBoostSubType = selectedType;
                    updateRows(true, true);
                    updateActionButton(true);
                    updateTitle$1();
                }
            }
        }
        if (view instanceof ParticipantsTypeCell) {
            int selectedType2 = ((ParticipantsTypeCell) view).getSelectedType();
            if (this.selectedParticipantsType == selectedType2 && (binaryBitmap = this.actionListener) != null) {
                ((SelectorBottomSheet) binaryBitmap.binarizer).prepare(3, this.selectedCountries);
                ((BoostPagerBottomSheet) binaryBitmap.matrix).viewPager.scrollToPosition$1(1);
            }
            this.selectedParticipantsType = selectedType2;
            updateRows(false, false);
            return;
        }
        if (view instanceof DurationCell) {
            this.selectedMonths = ((TLRPC.TL_premiumGiftCodeOption) ((DurationCell) view).getGifCode()).months;
            updateRows(false, false);
            BoostAdapter boostAdapter3 = this.adapter;
            for (int i8 = 0; i8 < boostAdapter3.items.size(); i8++) {
                if (((BoostAdapter.Item) boostAdapter3.items.get(i8)).viewType == 7) {
                    boostAdapter3.notifyItemChanged(i8);
                }
            }
            return;
        }
        if (!(view instanceof DateEndCell)) {
            if (view instanceof AddChannelCell) {
                BinaryBitmap binaryBitmap4 = this.actionListener;
                if (binaryBitmap4 != null) {
                    ((SelectorBottomSheet) binaryBitmap4.binarizer).prepare(2, this.selectedChats);
                    ((BoostPagerBottomSheet) binaryBitmap4.matrix).viewPager.scrollToPosition$1(1);
                    return;
                }
                return;
            }
            if (!(view instanceof StarGiveawayOptionCell)) {
                if (view instanceof StarsIntroActivity.ExpandView) {
                    this.starOptionsExpanded = true;
                    updateRows(true, true);
                    return;
                }
                return;
            }
            TL_stars.TL_starsGiveawayOption option = ((StarGiveawayOptionCell) view).getOption();
            if (option != null) {
                this.selectedStars = option.stars;
                updateRows(true, true);
                updateActionButton(true);
                updateTitle$1();
                return;
            }
            return;
        }
        Context context = baseFragment.getContext();
        long j = this.selectedEndDate;
        BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2 boostViaGiftsBottomSheet$$ExternalSyntheticLambda2 = new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2(this);
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        AlertsCreator.ScheduleDatePickerColors scheduleDatePickerColors = new AlertsCreator.ScheduleDatePickerColors(resourcesProvider);
        BottomSheet.Builder builder = new BottomSheet.Builder(context, resourcesProvider);
        BottomSheet bottomSheet = builder.bottomSheet;
        bottomSheet.applyBottomPadding = false;
        NumberPicker numberPicker = new NumberPicker(context, 18, resourcesProvider);
        int i9 = scheduleDatePickerColors.textColor;
        numberPicker.setTextColor(i9);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        BoostDialogs.AnonymousClass1 anonymousClass1 = new BoostDialogs.AnonymousClass1(context, 18, resourcesProvider);
        anonymousClass1.setWrapSelectorWheel(true);
        anonymousClass1.setAllItemsCount(24);
        anonymousClass1.setItemCount(5);
        anonymousClass1.setTextColor(i9);
        anonymousClass1.setTextOffset(-AndroidUtilities.dp(10.0f));
        anonymousClass1.setTag("HOUR");
        BoostDialogs.AnonymousClass2 anonymousClass2 = new BoostDialogs.AnonymousClass2(context, 18, resourcesProvider);
        anonymousClass2.setWrapSelectorWheel(true);
        anonymousClass2.setAllItemsCount(60);
        anonymousClass2.setItemCount(5);
        anonymousClass2.setTextColor(i9);
        anonymousClass2.setTextOffset(-AndroidUtilities.dp(34.0f));
        AlertsCreator.AnonymousClass35 anonymousClass35 = new AlertsCreator.AnonymousClass35(context, scheduleDatePickerColors, numberPicker, anonymousClass1, anonymousClass2);
        anonymousClass35.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        anonymousClass35.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(20.0f, i9, 1, textView);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        anonymousClass35.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i10 = calendar.get(1);
        BoostDialogs.AnonymousClass4 anonymousClass4 = new BoostDialogs.AnonymousClass4(context);
        long j2 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        int i11 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) j2);
        int i12 = calendar2.get(11);
        int i13 = calendar.get(12);
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0.5f, 0, 270));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(i11 - 1);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setTag("DAY");
        numberPicker.setFormatter(new GroupCallActivity$$ExternalSyntheticLambda23(jCurrentTimeMillis, calendar, i10, 1));
        ChatActivity$106$$ExternalSyntheticLambda2 chatActivity$106$$ExternalSyntheticLambda2 = new ChatActivity$106$$ExternalSyntheticLambda2(anonymousClass35, anonymousClass1, anonymousClass2, i12, i13, numberPicker);
        numberPicker.setOnValueChangedListener(chatActivity$106$$ExternalSyntheticLambda2);
        anonymousClass1.setMinValue(0);
        anonymousClass1.setMaxValue(23);
        linearLayout.addView(anonymousClass1, LayoutHelper.createLinear(0.2f, 0, 270));
        anonymousClass1.setFormatter(new ShareAlert$$ExternalSyntheticLambda15(21));
        anonymousClass1.setOnValueChangedListener(chatActivity$106$$ExternalSyntheticLambda2);
        anonymousClass2.setMinValue(0);
        anonymousClass2.setMaxValue(11);
        anonymousClass2.setValue(0);
        anonymousClass2.setFormatter(new ShareAlert$$ExternalSyntheticLambda15(22));
        linearLayout.addView(anonymousClass2, LayoutHelper.createLinear(0.3f, 0, 270));
        anonymousClass2.setOnValueChangedListener(chatActivity$106$$ExternalSyntheticLambda2);
        if (j > 0) {
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j);
            anonymousClass2.setValue(calendar.get(12) / 5);
            anonymousClass1.setValue(calendar.get(11));
            numberPicker.setValue(timeInMillis);
            numberPicker.getValue();
            chatActivity$106$$ExternalSyntheticLambda2.onValueChange(numberPicker, numberPicker.getValue());
            anonymousClass1.getValue();
            chatActivity$106$$ExternalSyntheticLambda2.onValueChange(anonymousClass1, anonymousClass1.getValue());
        }
        anonymousClass4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        anonymousClass4.setGravity(17);
        anonymousClass4.setTextColor(scheduleDatePickerColors.buttonTextColor);
        anonymousClass4.setTextSize(1, 14.0f);
        anonymousClass4.setTypeface(AndroidUtilities.bold());
        int i14 = scheduleDatePickerColors.buttonBackgroundColor;
        anonymousClass4.setBackground(Theme.AdaptiveRipple.createRect(new float[]{8.0f}, i14, Theme.AdaptiveRipple.calcRippleColor(i14)));
        anonymousClass4.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
        anonymousClass35.addView(anonymousClass4, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        anonymousClass4.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda1(calendar, numberPicker, anonymousClass1, anonymousClass2, boostViaGiftsBottomSheet$$ExternalSyntheticLambda2, builder, 4));
        bottomSheet.customView = anonymousClass35;
        bottomSheet.show();
        int i15 = scheduleDatePickerColors.backgroundColor;
        bottomSheet.setBackgroundColor(i15);
        bottomSheet.fixNavigationBar(i15);
        AndroidUtilities.setLightStatusBar(bottomSheet, ColorUtils.calculateLuminance(i15) > 0.699999988079071d);
    }

    public final void lambda$new$20(long j, TL_stories.PrepaidGiveaway prepaidGiveaway, BaseFragment baseFragment) {
        String str;
        BoostViaGiftsBottomSheet boostViaGiftsBottomSheet = this;
        int i = 24;
        int i2 = 11;
        ActionBtnCell actionBtnCell = boostViaGiftsBottomSheet.actionBtn;
        if (actionBtnCell.button.loading) {
            return;
        }
        if (boostViaGiftsBottomSheet.isPreparedGiveaway()) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
            MediaController$$ExternalSyntheticLambda8 mediaController$$ExternalSyntheticLambda8 = new MediaController$$ExternalSyntheticLambda8(boostViaGiftsBottomSheet, prepaidGiveaway, tL_prepaidStarsGiveaway, j, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, 8);
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(lastFragment.getContext(), 0, lastFragment.getResourceProvider());
            String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
            builder.setPositiveButton(LocaleController.getString(R.string.Start), new ProfileGooeyView$$ExternalSyntheticLambda0(mediaController$$ExternalSyntheticLambda8, 15));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ShareAlert$$ExternalSyntheticLambda15(23));
            builder.show();
            return;
        }
        int i3 = boostViaGiftsBottomSheet.selectedBoostType;
        int i4 = BoostTypeCell.$r8$clinit;
        ArrayList arrayList = boostViaGiftsBottomSheet.selectedCountries;
        ArrayList arrayList2 = boostViaGiftsBottomSheet.selectedChats;
        ButtonWithCounterView buttonWithCounterView = actionBtnCell.button;
        TLRPC.Chat chat = boostViaGiftsBottomSheet.currentChat;
        if (i3 == 3) {
            Activity activityFindActivity = AndroidUtilities.findActivity(boostViaGiftsBottomSheet.getContext());
            if (activityFindActivity == null) {
                activityFindActivity = LaunchActivity.instance;
            }
            if (activityFindActivity == null || activityFindActivity.isFinishing()) {
                return;
            }
            TL_stars.TL_starsGiveawayOption selectedStarsOption = boostViaGiftsBottomSheet.getSelectedStarsOption(boostViaGiftsBottomSheet.selectedStars);
            int selectedSliderValue = boostViaGiftsBottomSheet.getSelectedSliderValue();
            if (selectedStarsOption == null) {
                return;
            }
            buttonWithCounterView.setLoading(true);
            int i5 = boostViaGiftsBottomSheet.selectedParticipantsType;
            int i6 = ParticipantsTypeCell.$r8$clinit;
            boolean z = i5 == 1;
            StarsController starsController = StarsController.getInstance(boostViaGiftsBottomSheet.currentAccount, false);
            long jCurrentTimeMillis = boostViaGiftsBottomSheet.selectedEndDate;
            if (jCurrentTimeMillis < System.currentTimeMillis() + 120000) {
                jCurrentTimeMillis = System.currentTimeMillis() + 120000;
            }
            int i7 = (int) (jCurrentTimeMillis / 1000);
            boolean z2 = boostViaGiftsBottomSheet.isShowWinnersSelected;
            boolean z3 = boostViaGiftsBottomSheet.isAdditionalPrizeSelected;
            String str2 = boostViaGiftsBottomSheet.additionalPrize;
            OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18 = new OAuthSheet$$ExternalSyntheticLambda18(i2, boostViaGiftsBottomSheet, selectedStarsOption);
            int i8 = starsController.currentAccount;
            if (!MessagesController.getInstance(i8).starsPurchaseAvailable()) {
                BaseFragment lastFragment2 = LaunchActivity.getLastFragment();
                if (lastFragment2 == null || lastFragment2.getContext() == null) {
                    StarsController.showNoSupportDialog(activityFindActivity, null);
                    return;
                } else {
                    StarsController.showNoSupportDialog(lastFragment2.getContext(), lastFragment2.getResourceProvider());
                    return;
                }
            }
            TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
            tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z;
            tL_inputStorePaymentStarsGiveaway.winners_are_visible = z2;
            tL_inputStorePaymentStarsGiveaway.stars = selectedStarsOption.stars;
            MessagesController.getInstance(i8);
            tL_inputStorePaymentStarsGiveaway.boost_peer = MessagesController.getInputPeer(chat);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputStorePaymentStarsGiveaway.flags |= 2;
                int size = arrayList2.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList2.get(i9);
                    i9++;
                    Activity activity = activityFindActivity;
                    ArrayList<TLRPC.InputPeer> arrayList3 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                    MessagesController.getInstance(i8);
                    arrayList3.add(MessagesController.getInputPeer((TLObject) obj));
                    activityFindActivity = activity;
                }
            }
            Activity activity2 = activityFindActivity;
            int size2 = arrayList.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj2)).iso2);
            }
            if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                tL_inputStorePaymentStarsGiveaway.flags |= 4;
            }
            if (z3) {
                tL_inputStorePaymentStarsGiveaway.flags |= 16;
                tL_inputStorePaymentStarsGiveaway.prize_description = str2;
            }
            tL_inputStorePaymentStarsGiveaway.random_id = SendMessagesHelper.getInstance(i8).getNextRandomId();
            tL_inputStorePaymentStarsGiveaway.until_date = i7;
            tL_inputStorePaymentStarsGiveaway.currency = selectedStarsOption.currency;
            tL_inputStorePaymentStarsGiveaway.amount = selectedStarsOption.amount;
            tL_inputStorePaymentStarsGiveaway.users = selectedSliderValue;
            if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && (str = selectedStarsOption.store_product) != null) {
                AccountIdentifiers accountIdentifiers = new AccountIdentifiers();
                accountIdentifiers.zzb = "inapp";
                accountIdentifiers.zza = str;
                BillingController.getInstance().queryProductDetails(Arrays.asList(accountIdentifiers.build()), new ArticleViewer$$ExternalSyntheticLambda54(starsController, oAuthSheet$$ExternalSyntheticLambda18, tL_inputStorePaymentStarsGiveaway, activity2, 19));
                return;
            }
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(StarsController.getResourceProvider(), false);
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i8).sendRequest(tL_payments_getPaymentForm, new StarGiftSheet$$ExternalSyntheticLambda7(starsController, oAuthSheet$$ExternalSyntheticLambda18, tL_inputInvoiceStars, 3));
            return;
        }
        int i11 = boostViaGiftsBottomSheet.selectedBoostSubType;
        ArrayList arrayList4 = boostViaGiftsBottomSheet.giftCodeOptions;
        if (i11 == 1) {
            ArrayList arrayList5 = boostViaGiftsBottomSheet.selectedUsers;
            ArrayList arrayListFilterGiftOptions = BoostRepository.filterGiftOptions(arrayList5.size(), arrayList4);
            for (int i12 = 0; i12 < arrayListFilterGiftOptions.size(); i12++) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) arrayListFilterGiftOptions.get(i12);
                if (tL_premiumGiftCodeOption.months == boostViaGiftsBottomSheet.selectedMonths && arrayList5.size() > 0) {
                    if (BoostRepository.isGoogleBillingAvailable()) {
                        Context context = boostViaGiftsBottomSheet.getContext();
                        Theme.ResourcesProvider resourcesProvider = boostViaGiftsBottomSheet.resourcesProvider;
                        if (tL_premiumGiftCodeOption.store_product == null) {
                            ArrayList arrayList6 = new ArrayList();
                            int size3 = arrayList4.size();
                            int i13 = 0;
                            while (i13 < size3) {
                                Object obj3 = arrayList4.get(i13);
                                i13++;
                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj3;
                                if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                    arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                }
                            }
                            String strJoin = TextUtils.join(", ", arrayList6);
                            int i14 = tL_premiumGiftCodeOption.users;
                            AlertDialog.Builder builder2 = new AlertDialog.Builder(context, 0, resourcesProvider);
                            String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                            AlertDialog alertDialog2 = builder2.alertDialog;
                            alertDialog2.title = string2;
                            alertDialog2.message = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i14, strJoin));
                            builder2.setPositiveButton(LocaleController.getString("OK", R.string.OK), new ShareAlert$$ExternalSyntheticLambda15(i));
                            builder2.show();
                            return;
                        }
                    }
                    buttonWithCounterView.setLoading(true);
                    BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13 boostViaGiftsBottomSheet$$ExternalSyntheticLambda13 = new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13(boostViaGiftsBottomSheet, 0);
                    BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13 boostViaGiftsBottomSheet$$ExternalSyntheticLambda14 = new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13(boostViaGiftsBottomSheet, 1);
                    int i15 = UserConfig.selectedAccount;
                    HashMap map = BoostRepository.cachedGiftOptions;
                    if (map != null) {
                        map.remove(Integer.valueOf(i15));
                    }
                    boolean zIsGoogleBillingAvailable = BoostRepository.isGoogleBillingAvailable();
                    TLRPC.Chat chat2 = boostViaGiftsBottomSheet.currentChat;
                    if (zIsGoogleBillingAvailable) {
                        BoostRepository.payGiftCodeByGoogle(arrayList5, tL_premiumGiftCodeOption, chat2, null, baseFragment, boostViaGiftsBottomSheet$$ExternalSyntheticLambda13, boostViaGiftsBottomSheet$$ExternalSyntheticLambda14);
                        return;
                    } else {
                        BoostRepository.payGiftCodeByInvoice(arrayList5, tL_premiumGiftCodeOption, chat2, null, baseFragment, boostViaGiftsBottomSheet$$ExternalSyntheticLambda13, boostViaGiftsBottomSheet$$ExternalSyntheticLambda14);
                        return;
                    }
                }
            }
            return;
        }
        ArrayList arrayListFilterGiftOptions2 = BoostRepository.filterGiftOptions(boostViaGiftsBottomSheet.getSelectedSliderValue(), arrayList4);
        int i16 = 0;
        while (i16 < arrayListFilterGiftOptions2.size()) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) arrayListFilterGiftOptions2.get(i16);
            if (tL_premiumGiftCodeOption3.months == boostViaGiftsBottomSheet.selectedMonths) {
                if (BoostRepository.isGoogleBillingAvailable()) {
                    Context context2 = boostViaGiftsBottomSheet.getContext();
                    Theme.ResourcesProvider resourcesProvider2 = boostViaGiftsBottomSheet.resourcesProvider;
                    BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13 boostViaGiftsBottomSheet$$ExternalSyntheticLambda15 = new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13(boostViaGiftsBottomSheet, 2);
                    if (tL_premiumGiftCodeOption3.store_product == null) {
                        ArrayList arrayList7 = new ArrayList();
                        int size4 = arrayList4.size();
                        int i17 = 0;
                        while (i17 < size4) {
                            Object obj4 = arrayList4.get(i17);
                            i17++;
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                            if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && boostViaGiftsBottomSheet.sliderValues.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                arrayList7.add(tL_premiumGiftCodeOption4);
                            }
                        }
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                        int size5 = arrayList7.size();
                        int i18 = 0;
                        while (i18 < size5) {
                            Object obj5 = arrayList7.get(i18);
                            i18++;
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                            int i19 = tL_premiumGiftCodeOption3.users;
                            int i20 = tL_premiumGiftCodeOption6.users;
                            if (i19 > i20 && i20 > tL_premiumGiftCodeOption5.users) {
                                tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                            }
                        }
                        String pluralString = LocaleController.formatPluralString("GiftMonths", tL_premiumGiftCodeOption5.months, new Object[0]);
                        int i21 = tL_premiumGiftCodeOption3.users;
                        int i22 = tL_premiumGiftCodeOption5.users;
                        AlertDialog.Builder builder3 = new AlertDialog.Builder(context2, 0, resourcesProvider2);
                        String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                        AlertDialog alertDialog3 = builder3.alertDialog;
                        alertDialog3.title = string3;
                        alertDialog3.message = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i21, pluralString, Integer.valueOf(i22)));
                        builder3.setPositiveButton(LocaleController.getString("Reduce", R.string.Reduce), new RateCallLayout$$ExternalSyntheticLambda1(i2, boostViaGiftsBottomSheet$$ExternalSyntheticLambda15, tL_premiumGiftCodeOption5));
                        builder3.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new ShareAlert$$ExternalSyntheticLambda15(i));
                        builder3.show();
                        return;
                    }
                }
                int i23 = boostViaGiftsBottomSheet.selectedParticipantsType;
                int i24 = ParticipantsTypeCell.$r8$clinit;
                boolean z4 = i23 == 1;
                long jCurrentTimeMillis2 = boostViaGiftsBottomSheet.selectedEndDate;
                if (jCurrentTimeMillis2 < System.currentTimeMillis() + 120000) {
                    jCurrentTimeMillis2 = System.currentTimeMillis() + 120000;
                }
                int i25 = (int) (jCurrentTimeMillis2 / 1000);
                buttonWithCounterView.setLoading(true);
                boolean z5 = boostViaGiftsBottomSheet.isShowWinnersSelected;
                boolean z6 = boostViaGiftsBottomSheet.isAdditionalPrizeSelected;
                String str3 = boostViaGiftsBottomSheet.additionalPrize;
                BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13 boostViaGiftsBottomSheet$$ExternalSyntheticLambda16 = new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13(boostViaGiftsBottomSheet, 3);
                BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13 boostViaGiftsBottomSheet$$ExternalSyntheticLambda17 = new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13(boostViaGiftsBottomSheet, 4);
                if (BoostRepository.isGoogleBillingAvailable()) {
                    BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13 boostViaGiftsBottomSheet$$ExternalSyntheticLambda18 = boostViaGiftsBottomSheet$$ExternalSyntheticLambda17;
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z4;
                    tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z5;
                    tL_inputStorePaymentPremiumGiveaway.prize_description = str3;
                    tL_inputStorePaymentPremiumGiveaway.until_date = i25;
                    int i26 = tL_inputStorePaymentPremiumGiveaway.flags;
                    tL_inputStorePaymentPremiumGiveaway.flags = i26 | 6;
                    if (z6) {
                        tL_inputStorePaymentPremiumGiveaway.flags = i26 | 22;
                    }
                    tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                    int i27 = 0;
                    for (int size6 = arrayList2.size(); i27 < size6; size6 = size6) {
                        Object obj6 = arrayList2.get(i27);
                        i27++;
                        TLObject tLObject = (TLObject) obj6;
                        if (tLObject instanceof TLRPC.Chat) {
                            tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).id));
                        }
                        boostViaGiftsBottomSheet$$ExternalSyntheticLambda18 = boostViaGiftsBottomSheet$$ExternalSyntheticLambda18;
                    }
                    BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13 boostViaGiftsBottomSheet$$ExternalSyntheticLambda19 = boostViaGiftsBottomSheet$$ExternalSyntheticLambda18;
                    tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.id);
                    int size7 = arrayList.size();
                    int i28 = 0;
                    while (i28 < size7) {
                        Object obj7 = arrayList.get(i28);
                        i28++;
                        tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj7)).iso2);
                    }
                    AccountIdentifiers accountIdentifiers2 = new AccountIdentifiers();
                    accountIdentifiers2.zzb = "inapp";
                    accountIdentifiers2.zza = tL_premiumGiftCodeOption3.store_product;
                    BillingController.getInstance().queryProductDetails(Arrays.asList(accountIdentifiers2.build()), new PassportActivity$3$$ExternalSyntheticLambda3(tL_inputStorePaymentPremiumGiveaway, tL_premiumGiftCodeOption3, connectionsManager, boostViaGiftsBottomSheet$$ExternalSyntheticLambda19, boostViaGiftsBottomSheet$$ExternalSyntheticLambda16, baseFragment, 2));
                    return;
                }
                MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z4;
                tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z5;
                tL_inputStorePaymentPremiumGiveaway2.prize_description = str3;
                tL_inputStorePaymentPremiumGiveaway2.until_date = i25;
                int i29 = tL_inputStorePaymentPremiumGiveaway2.flags;
                tL_inputStorePaymentPremiumGiveaway2.flags = i29 | 6;
                if (z6) {
                    tL_inputStorePaymentPremiumGiveaway2.flags = i29 | 22;
                }
                tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                int size8 = arrayList2.size();
                int i30 = 0;
                while (i30 < size8) {
                    Object obj8 = arrayList2.get(i30);
                    int i31 = i30 + 1;
                    TLObject tLObject2 = (TLObject) obj8;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).id));
                    }
                    i30 = i31;
                }
                tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.id);
                tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.id);
                tL_inputStorePaymentPremiumGiveaway2.currency = tL_premiumGiftCodeOption3.currency;
                tL_inputStorePaymentPremiumGiveaway2.amount = tL_premiumGiftCodeOption3.amount;
                int size9 = arrayList.size();
                int i32 = 0;
                while (i32 < size9) {
                    Object obj9 = arrayList.get(i32);
                    i32++;
                    tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj9)).iso2);
                }
                tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway2;
                tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                JSONObject jSONObjectMakeThemeParams2 = BotWebViewSheet.makeThemeParams(baseFragment.getResourceProvider(), false);
                if (jSONObjectMakeThemeParams2 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = jSONObjectMakeThemeParams2.toString();
                    tL_payments_getPaymentForm2.flags |= 1;
                }
                tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                connectionsManager2.sendRequest(tL_payments_getPaymentForm2, new ChatActivity$$ExternalSyntheticLambda206(boostViaGiftsBottomSheet$$ExternalSyntheticLambda17, messagesController2, tL_inputInvoicePremiumGiftCode, baseFragment, boostViaGiftsBottomSheet$$ExternalSyntheticLambda16, 5));
                return;
            }
            i16++;
            boostViaGiftsBottomSheet = this;
        }
    }

    public final void lambda$updateRows$24() {
        PremiumPreviewBottomSheet premiumPreviewBottomSheet = new PremiumPreviewBottomSheet(this.baseFragment, this.currentAccount, null, null, null, this.resourcesProvider);
        int i = 0;
        premiumPreviewBottomSheet.setOnDismissListener(new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda8(this, i));
        premiumPreviewBottomSheet.setOnShowListener(new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda9(this, i));
        premiumPreviewBottomSheet.show();
    }

    public final void lambda$updateRows$27() {
        PremiumPreviewBottomSheet premiumPreviewBottomSheet = new PremiumPreviewBottomSheet(this.baseFragment, this.currentAccount, null, null, null, this.resourcesProvider);
        int i = 1;
        premiumPreviewBottomSheet.setOnDismissListener(new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda8(this, i));
        premiumPreviewBottomSheet.setOnShowListener(new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda9(this, i));
        premiumPreviewBottomSheet.show();
    }

    @Override
    public final void onPreDraw(Canvas canvas, int i) {
        this.top = i;
    }

    public final void updateActionButton(boolean z) {
        boolean zIsPreparedGiveaway = isPreparedGiveaway();
        ActionBtnCell actionBtnCell = this.actionBtn;
        if (zIsPreparedGiveaway) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.prepaidGiveaway;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                actionBtnCell.setStartGiveAwayStyle(prepaidGiveaway.quantity, z);
                return;
            } else {
                actionBtnCell.setStartGiveAwayStyle(prepaidGiveaway.quantity * ((int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayBoostsPerPremium), z);
                return;
            }
        }
        int i = this.selectedBoostSubType;
        int i2 = BoostTypeCell.$r8$clinit;
        if (i == 0) {
            actionBtnCell.setStartGiveAwayStyle(getSelectedSliderValueWithBoosts(), z);
            return;
        }
        ArrayList arrayList = this.selectedUsers;
        int size = arrayList.size() * ((int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayBoostsPerPremium);
        boolean z2 = arrayList.size() > 0;
        actionBtnCell.drawDivider = true;
        ButtonWithCounterView buttonWithCounterView = actionBtnCell.button;
        buttonWithCounterView.withCounterIcon();
        buttonWithCounterView.setShowZero(true);
        buttonWithCounterView.setEnabled(z2);
        buttonWithCounterView.setCount(size, z);
        buttonWithCounterView.setText(LocaleController.getString(R.string.GiftPremium), z, true);
        actionBtnCell.backgroundView.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, actionBtnCell.resourcesProvider));
    }

    public final void updateRows(boolean z, boolean z2) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z3;
        int i;
        ?? r7;
        int i2;
        boolean z4;
        int i3;
        ?? r10;
        String strM;
        int selectedSliderValue;
        String pluralString;
        BoostAdapter boostAdapter;
        ?? r8;
        ?? r9;
        long jLongValue;
        ArrayList arrayList = this.items;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int i4 = this.selectedBoostType;
        int i5 = BoostTypeCell.$r8$clinit;
        int i6 = 1;
        boolean z5 = i4 == 3;
        BoostAdapter.Item item = new BoostAdapter.Item(0, false);
        item.boolValue = z5;
        arrayList.add(item);
        boolean zIsPreparedGiveaway = isPreparedGiveaway();
        ArrayList arrayList3 = this.selectedUsers;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.prepaidGiveaway;
        if (zIsPreparedGiveaway) {
            BoostAdapter.Item item2 = new BoostAdapter.Item(14, false);
            item2.user = prepaidGiveaway2;
            arrayList.add(item2);
        } else {
            int size = arrayList3.size();
            BoostAdapter.Item item3 = new BoostAdapter.Item(2, this.selectedBoostType == 2);
            item3.subType = 2;
            item3.intValue = size;
            item3.user = null;
            arrayList.add(item3);
            int size2 = arrayList3.size();
            BoostAdapter.Item item4 = new BoostAdapter.Item(2, this.selectedBoostType == 3);
            item4.subType = 3;
            item4.intValue = size2;
            item4.user = null;
            arrayList.add(item4);
        }
        arrayList.add(new BoostAdapter.Item(4, false));
        TLRPC.Chat chat = this.currentChat;
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        int i7 = this.selectedBoostType;
        ArrayList arrayList4 = this.selectedCountries;
        ArrayList arrayList5 = this.selectedChats;
        if (i7 != 3) {
            prepaidGiveaway = prepaidGiveaway2;
            z3 = zIsChannelAndNotMegaGroup;
            if (this.selectedBoostSubType == 0) {
                if (!isPreparedGiveaway()) {
                    String string = LocaleController.getString(R.string.BoostingQuantityPrizes);
                    int selectedSliderValueWithBoosts = getSelectedSliderValueWithBoosts();
                    BoostAdapter.Item item5 = new BoostAdapter.Item(13, false);
                    item5.text = string;
                    item5.intValue = selectedSliderValueWithBoosts;
                    arrayList.add(item5);
                    int i8 = this.selectedSliderIndex;
                    BoostAdapter.Item item6 = new BoostAdapter.Item(5, false);
                    item6.values = this.sliderValues;
                    item6.intValue = i8;
                    arrayList.add(item6);
                    arrayList.add(BoostAdapter.Item.asDivider(LocaleController.getString(R.string.BoostingChooseHowMany), false));
                }
                arrayList.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
                if (!isPreparedGiveaway()) {
                    arrayList.add(BoostAdapter.Item.asChat(chat, getSelectedSliderValueWithBoosts(), false));
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    arrayList.add(BoostAdapter.Item.asChat(chat, prepaidGiveaway.quantity, false));
                } else {
                    arrayList.add(BoostAdapter.Item.asChat(chat, prepaidGiveaway.quantity * ((int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayBoostsPerPremium), false));
                }
                int size3 = arrayList5.size();
                int i9 = 0;
                while (i9 < size3) {
                    Object obj = arrayList5.get(i9);
                    i9++;
                    TLObject tLObject = (TLObject) obj;
                    if (tLObject instanceof TLRPC.Chat) {
                        arrayList.add(BoostAdapter.Item.asChat((TLRPC.Chat) tLObject, getSelectedSliderValueWithBoosts(), true));
                    }
                    if (tLObject instanceof TLRPC.InputPeer) {
                        int selectedSliderValueWithBoosts2 = getSelectedSliderValueWithBoosts();
                        BoostAdapter.Item item7 = new BoostAdapter.Item(9, false);
                        item7.peer = (TLRPC.InputPeer) tLObject;
                        item7.chat = null;
                        item7.boolValue = true;
                        item7.intValue = selectedSliderValueWithBoosts2;
                        arrayList.add(item7);
                    }
                }
                if (arrayList5.size() < MessagesController.getInstance(UserConfig.selectedAccount).giveawayAddPeersMax) {
                    r7 = 0;
                    arrayList.add(new BoostAdapter.Item(8, false));
                } else {
                    r7 = 0;
                }
                arrayList.add(BoostAdapter.Item.asDivider(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r7));
                arrayList.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingEligibleUsers)));
                int i10 = ParticipantsTypeCell.$r8$clinit;
                arrayList.add(BoostAdapter.Item.asParticipants(r7, this.selectedParticipantsType, true, arrayList4));
                arrayList.add(BoostAdapter.Item.asParticipants(1, this.selectedParticipantsType, r7, arrayList4));
                arrayList.add(BoostAdapter.Item.asDivider(LocaleController.getString(z3 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r7));
            }
            if (!isPreparedGiveaway()) {
                arrayList.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingDurationOfPremium)));
                int i11 = this.selectedBoostSubType;
                int i12 = BoostTypeCell.$r8$clinit;
                ArrayList arrayListFilterGiftOptions = BoostRepository.filterGiftOptions(i11 == 0 ? getSelectedSliderValue() : arrayList3.size(), this.giftCodeOptions);
                int i13 = 0;
                while (i13 < arrayListFilterGiftOptions.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) arrayListFilterGiftOptions.get(i13);
                    int i14 = tL_premiumGiftCodeOption.months;
                    int i15 = this.selectedBoostSubType;
                    int i16 = BoostTypeCell.$r8$clinit;
                    int selectedSliderValue2 = i15 == 0 ? getSelectedSliderValue() : arrayList3.size();
                    long j = tL_premiumGiftCodeOption.amount;
                    int i17 = this.selectedMonths;
                    String str = tL_premiumGiftCodeOption.currency;
                    boolean z6 = i13 != arrayListFilterGiftOptions.size() + (-1);
                    ArrayList arrayList6 = arrayListFilterGiftOptions;
                    int i18 = i13;
                    BoostAdapter.Item item8 = new BoostAdapter.Item(12, i14 == i17);
                    item8.intValue = i14;
                    item8.intValue2 = selectedSliderValue2;
                    item8.longValue = j;
                    item8.boolValue = z6;
                    item8.text = str;
                    item8.object = tL_premiumGiftCodeOption;
                    arrayList.add(item8);
                    i13 = i18 + 1;
                    arrayListFilterGiftOptions = arrayList6;
                }
            }
            if (!isPreparedGiveaway()) {
                i = 3;
                arrayList.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BoostingStoriesFeaturesAndTerms), Theme.key_chat_messageLinkIn, 0, new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda0(this, i), this.resourcesProvider), true));
            }
            i2 = this.selectedBoostType;
            int i19 = BoostTypeCell.$r8$clinit;
            if (i2 != i || this.selectedBoostSubType == 0) {
                String string2 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
                boolean z7 = this.isAdditionalPrizeSelected;
                int i20 = SwitcherCell.$r8$clinit;
                BoostAdapter.Item item9 = new BoostAdapter.Item(15, z7);
                item9.text = string2;
                item9.boolValue = z7;
                item9.subType = 1;
                arrayList.add(item9);
                if (this.isAdditionalPrizeSelected) {
                    if (isPreparedGiveaway()) {
                        selectedSliderValue = prepaidGiveaway.quantity;
                    } else {
                        selectedSliderValue = getSelectedSliderValue();
                    }
                    z4 = false;
                    BoostAdapter.Item item10 = new BoostAdapter.Item(16, false);
                    item10.intValue = selectedSliderValue;
                    arrayList.add(item10);
                    pluralString = LocaleController.formatPluralString("BoldMonths", this.selectedMonths, new Object[0]);
                    if (this.selectedBoostType == 3) {
                        if (this.additionalPrize.isEmpty()) {
                            arrayList.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountHint", (int) this.selectedStars, new Object[0])), false));
                        } else {
                            arrayList.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountNameHint", (int) this.selectedStars, Integer.valueOf(selectedSliderValue), this.additionalPrize)), false));
                        }
                    } else if (this.additionalPrize.isEmpty()) {
                        arrayList.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountHint", selectedSliderValue, pluralString)), false));
                    } else {
                        arrayList.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountNameHint", selectedSliderValue, this.additionalPrize, pluralString)), false));
                    }
                } else {
                    z4 = false;
                    if (this.selectedBoostType == 3) {
                        i3 = R.string.BoostingStarsGiveawayAdditionPrizeHint;
                    } else {
                        i3 = R.string.BoostingGiveawayAdditionPrizeHint;
                    }
                    arrayList.add(BoostAdapter.Item.asDivider(LocaleController.getString(i3), false));
                }
                arrayList.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
                long j2 = this.selectedEndDate;
                BoostAdapter.Item item11 = new BoostAdapter.Item(10, z4);
                item11.longValue = j2;
                arrayList.add(item11);
                if (this.selectedBoostType == 3) {
                    if (isPreparedGiveaway()) {
                        r10 = 0;
                        arrayList.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(z3 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", prepaidGiveaway.quantity, LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.selectedStars, new Object[0])), false));
                    } else {
                        r10 = 0;
                        arrayList.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(z3 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", getSelectedSliderValue(), LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.selectedStars, new Object[0])), false));
                    }
                } else {
                    r10 = 0;
                    r10 = 0;
                    if (isPreparedGiveaway()) {
                        arrayList.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(z3 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", prepaidGiveaway.quantity, new Object[0]), false));
                    } else {
                        arrayList.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(z3 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", getSelectedSliderValue(), new Object[0]), false));
                    }
                }
                String string3 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
                BoostAdapter.Item item12 = new BoostAdapter.Item(15, this.isShowWinnersSelected);
                item12.text = string3;
                item12.boolValue = r10;
                item12.subType = r10;
                arrayList.add(item12);
                if (isPreparedGiveaway()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint));
                    if (this.selectedBoostType != 3) {
                        strM = NotificationsController$$ExternalSyntheticOutline1.m(new StringBuilder("\n\n"), R.string.BoostingStoriesFeaturesAndTerms);
                    } else {
                        strM = "";
                    }
                    sb.append(strM);
                    arrayList.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceSingleTag(sb.toString(), Theme.key_chat_messageLinkIn, 0, new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda0(this, 4), this.resourcesProvider), true));
                } else {
                    arrayList.add(BoostAdapter.Item.asDivider(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint), r10));
                }
            }
            boostAdapter = this.adapter;
            if (boostAdapter == null && z2) {
                if (z) {
                    boostAdapter.setItems(arrayList2, arrayList);
                } else {
                    boostAdapter.mObservable.notifyChanged();
                }
            }
            return;
        }
        if (isPreparedGiveaway()) {
            prepaidGiveaway = prepaidGiveaway2;
            z3 = zIsChannelAndNotMegaGroup;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                this.selectedStars = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
            }
        } else {
            String string4 = LocaleController.getString(R.string.BoostingStarsOptions);
            int selectedSliderValueWithBoosts3 = getSelectedSliderValueWithBoosts();
            BoostAdapter.Item item13 = new BoostAdapter.Item(13, false);
            item13.text = string4;
            item13.intValue = selectedSliderValueWithBoosts3;
            arrayList.add(item13);
            ArrayList giveawayOptions = StarsController.getInstance(this.currentAccount, false).getGiveawayOptions();
            ArrayList arrayList7 = new ArrayList();
            if (giveawayOptions != null) {
                int i21 = 0;
                while (i21 < giveawayOptions.size()) {
                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) giveawayOptions.get(i21);
                    TL_stories.PrepaidGiveaway prepaidGiveaway3 = prepaidGiveaway2;
                    if (tL_starsGiveawayOption != null && !arrayList7.contains(Long.valueOf(tL_starsGiveawayOption.stars))) {
                        arrayList7.add(Long.valueOf(tL_starsGiveawayOption.stars));
                    }
                    i21++;
                    prepaidGiveaway2 = prepaidGiveaway3;
                }
            }
            TL_stories.PrepaidGiveaway prepaidGiveaway4 = prepaidGiveaway2;
            int i22 = 0;
            int i23 = 0;
            while (true) {
                z3 = zIsChannelAndNotMegaGroup;
                if (i22 >= arrayList7.size()) {
                    break;
                }
                TL_stars.TL_starsGiveawayOption selectedStarsOption = getSelectedStarsOption(((Long) arrayList7.get(i22)).longValue());
                if (!selectedStarsOption.missingStorePrice) {
                    if (this.selectedStars == 0 && selectedStarsOption.isDefault) {
                        this.selectedStars = selectedStarsOption.stars;
                    }
                    if (!selectedStarsOption.extended || this.starOptionsExpanded) {
                        int i24 = i23 + i6;
                        int i25 = this.starOptionsExpanded ? i22 : i22 + 2;
                        long j3 = selectedStarsOption.stars;
                        ArrayList perUserStarsValues = getPerUserStarsValues(j3);
                        if (perUserStarsValues.isEmpty()) {
                            float f = j3;
                            ArrayList perUserStarsValues2 = getPerUserStarsValues(this.selectedStars);
                            int i26 = this.selectedStarsSliderIndex;
                            if (i26 < 0 || i26 >= perUserStarsValues2.size()) {
                                this.selectedStarsSliderIndex = 0;
                            }
                            jLongValue = Math.round(f / (this.selectedStarsSliderIndex >= perUserStarsValues2.size() ? 1L : ((Long) perUserStarsValues2.get(this.selectedStarsSliderIndex)).longValue()));
                        } else {
                            jLongValue = ((Long) perUserStarsValues.get(Utilities.clamp(this.selectedStarsSliderIndex, perUserStarsValues.size() - 1, 0))).longValue();
                        }
                        BoostAdapter.Item item14 = new BoostAdapter.Item(17, this.selectedStars == selectedStarsOption.stars);
                        item14.intValue = i25;
                        item14.longValue = jLongValue;
                        item14.object = selectedStarsOption;
                        item14.boolValue = true;
                        arrayList.add(item14);
                        i23 = i24;
                    }
                }
                i22++;
                zIsChannelAndNotMegaGroup = z3;
                arrayList7 = arrayList7;
                i6 = 1;
            }
            ArrayList arrayList8 = arrayList7;
            if (this.starOptionsExpanded || i23 >= arrayList8.size()) {
                r9 = 0;
            } else {
                r9 = 0;
                arrayList.add(new BoostAdapter.Item(18, false));
            }
            if (i23 <= 0) {
                BoostAdapter.Item item15 = new BoostAdapter.Item(17, r9);
                item15.intValue = r9;
                item15.longValue = 1L;
                item15.object = null;
                item15.boolValue = true;
                arrayList.add(item15);
                BoostAdapter.Item item16 = new BoostAdapter.Item(17, r9);
                item16.intValue = 1;
                item16.longValue = 1L;
                item16.object = null;
                item16.boolValue = true;
                arrayList.add(item16);
                BoostAdapter.Item item17 = new BoostAdapter.Item(17, r9);
                item17.intValue = 2;
                item17.longValue = 1L;
                item17.object = null;
                item17.boolValue = r9;
                arrayList.add(item17);
            }
            item13.intValue = getSelectedSliderValueWithBoosts();
            arrayList.add(BoostAdapter.Item.asDivider(LocaleController.getString(R.string.BoostingStarsOptionsInfo), r9));
            List sliderValues = getSliderValues();
            int i27 = this.selectedStarsSliderIndex;
            if (i27 < 0 || i27 >= sliderValues.size()) {
                this.selectedStarsSliderIndex = r9;
            }
            if (sliderValues.size() > 1) {
                arrayList.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingStarsQuantityPrizes)));
                List sliderValues2 = getSliderValues();
                int i28 = this.selectedStarsSliderIndex;
                BoostAdapter.Item item18 = new BoostAdapter.Item(5, false);
                item18.values = sliderValues2;
                item18.intValue = i28;
                arrayList.add(item18);
                arrayList.add(BoostAdapter.Item.asDivider(LocaleController.getString(R.string.BoostingStarsQuantityPrizesInfo), false));
            }
            prepaidGiveaway = prepaidGiveaway4;
        }
        arrayList.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
        if (!isPreparedGiveaway()) {
            arrayList.add(BoostAdapter.Item.asChat(chat, getSelectedSliderValueWithBoosts(), false));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            arrayList.add(BoostAdapter.Item.asChat(chat, prepaidGiveaway.quantity, false));
        } else {
            arrayList.add(BoostAdapter.Item.asChat(chat, prepaidGiveaway.quantity * ((int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayBoostsPerPremium), false));
        }
        int size4 = arrayList5.size();
        int i29 = 0;
        while (i29 < size4) {
            Object obj2 = arrayList5.get(i29);
            i29++;
            TLObject tLObject2 = (TLObject) obj2;
            if (tLObject2 instanceof TLRPC.Chat) {
                arrayList.add(BoostAdapter.Item.asChat((TLRPC.Chat) tLObject2, getSelectedSliderValueWithBoosts(), true));
            }
            if (tLObject2 instanceof TLRPC.InputPeer) {
                int selectedSliderValueWithBoosts4 = getSelectedSliderValueWithBoosts();
                BoostAdapter.Item item19 = new BoostAdapter.Item(9, false);
                item19.peer = (TLRPC.InputPeer) tLObject2;
                item19.chat = null;
                item19.boolValue = true;
                item19.intValue = selectedSliderValueWithBoosts4;
                arrayList.add(item19);
            }
        }
        if (arrayList5.size() < MessagesController.getInstance(UserConfig.selectedAccount).giveawayAddPeersMax) {
            r8 = 0;
            arrayList.add(new BoostAdapter.Item(8, false));
        } else {
            r8 = 0;
        }
        arrayList.add(BoostAdapter.Item.asDivider(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r8));
        arrayList.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingEligibleUsers)));
        int i30 = ParticipantsTypeCell.$r8$clinit;
        arrayList.add(BoostAdapter.Item.asParticipants(r8, this.selectedParticipantsType, true, arrayList4));
        arrayList.add(BoostAdapter.Item.asParticipants(1, this.selectedParticipantsType, r8, arrayList4));
        arrayList.add(BoostAdapter.Item.asDivider(LocaleController.getString(z3 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r8));
        i = 3;
        i2 = this.selectedBoostType;
        int i110 = BoostTypeCell.$r8$clinit;
        if (i2 != i) {
            String string5 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
            boolean z8 = this.isAdditionalPrizeSelected;
            int i210 = SwitcherCell.$r8$clinit;
            BoostAdapter.Item item20 = new BoostAdapter.Item(15, z8);
            item20.text = string5;
            item20.boolValue = z8;
            item20.subType = 1;
            arrayList.add(item20);
            if (this.isAdditionalPrizeSelected) {
                if (isPreparedGiveaway()) {
                    selectedSliderValue = prepaidGiveaway.quantity;
                } else {
                    selectedSliderValue = getSelectedSliderValue();
                }
                z4 = false;
                BoostAdapter.Item item110 = new BoostAdapter.Item(16, false);
                item110.intValue = selectedSliderValue;
                arrayList.add(item110);
                pluralString = LocaleController.formatPluralString("BoldMonths", this.selectedMonths, new Object[0]);
                if (this.selectedBoostType == 3) {
                    if (this.additionalPrize.isEmpty()) {
                        arrayList.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountHint", (int) this.selectedStars, new Object[0])), false));
                    } else {
                        arrayList.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountNameHint", (int) this.selectedStars, Integer.valueOf(selectedSliderValue), this.additionalPrize)), false));
                    }
                } else if (this.additionalPrize.isEmpty()) {
                    arrayList.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountHint", selectedSliderValue, pluralString)), false));
                } else {
                    arrayList.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountNameHint", selectedSliderValue, this.additionalPrize, pluralString)), false));
                }
            } else {
                z4 = false;
                if (this.selectedBoostType == 3) {
                    i3 = R.string.BoostingStarsGiveawayAdditionPrizeHint;
                } else {
                    i3 = R.string.BoostingGiveawayAdditionPrizeHint;
                }
                arrayList.add(BoostAdapter.Item.asDivider(LocaleController.getString(i3), false));
            }
            arrayList.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
            long j4 = this.selectedEndDate;
            BoostAdapter.Item item111 = new BoostAdapter.Item(10, z4);
            item111.longValue = j4;
            arrayList.add(item111);
            if (this.selectedBoostType == 3) {
                if (isPreparedGiveaway()) {
                    r10 = 0;
                    arrayList.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(z3 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", getSelectedSliderValue(), LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.selectedStars, new Object[0])), false));
                } else {
                    r10 = 0;
                    arrayList.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(z3 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", prepaidGiveaway.quantity, LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.selectedStars, new Object[0])), false));
                }
            } else {
                r10 = 0;
                r10 = 0;
                if (isPreparedGiveaway()) {
                    arrayList.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(z3 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", getSelectedSliderValue(), new Object[0]), false));
                } else {
                    arrayList.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(z3 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", prepaidGiveaway.quantity, new Object[0]), false));
                }
            }
            String string6 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
            BoostAdapter.Item item112 = new BoostAdapter.Item(15, this.isShowWinnersSelected);
            item112.text = string6;
            item112.boolValue = r10;
            item112.subType = r10;
            arrayList.add(item112);
            if (isPreparedGiveaway()) {
                arrayList.add(BoostAdapter.Item.asDivider(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint), r10));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint));
                if (this.selectedBoostType != 3) {
                    strM = NotificationsController$$ExternalSyntheticOutline1.m(new StringBuilder("\n\n"), R.string.BoostingStoriesFeaturesAndTerms);
                } else {
                    strM = "";
                }
                sb2.append(strM);
                arrayList.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceSingleTag(sb2.toString(), Theme.key_chat_messageLinkIn, 0, new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda0(this, 4), this.resourcesProvider), true));
            }
        } else {
            String string7 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
            boolean z9 = this.isAdditionalPrizeSelected;
            int i211 = SwitcherCell.$r8$clinit;
            BoostAdapter.Item item21 = new BoostAdapter.Item(15, z9);
            item21.text = string7;
            item21.boolValue = z9;
            item21.subType = 1;
            arrayList.add(item21);
            if (this.isAdditionalPrizeSelected) {
                if (isPreparedGiveaway()) {
                    selectedSliderValue = prepaidGiveaway.quantity;
                } else {
                    selectedSliderValue = getSelectedSliderValue();
                }
                z4 = false;
                BoostAdapter.Item item113 = new BoostAdapter.Item(16, false);
                item113.intValue = selectedSliderValue;
                arrayList.add(item113);
                pluralString = LocaleController.formatPluralString("BoldMonths", this.selectedMonths, new Object[0]);
                if (this.selectedBoostType == 3) {
                    if (this.additionalPrize.isEmpty()) {
                        arrayList.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountHint", (int) this.selectedStars, new Object[0])), false));
                    } else {
                        arrayList.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountNameHint", (int) this.selectedStars, Integer.valueOf(selectedSliderValue), this.additionalPrize)), false));
                    }
                } else if (this.additionalPrize.isEmpty()) {
                    arrayList.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountHint", selectedSliderValue, pluralString)), false));
                } else {
                    arrayList.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountNameHint", selectedSliderValue, this.additionalPrize, pluralString)), false));
                }
            } else {
                z4 = false;
                if (this.selectedBoostType == 3) {
                    i3 = R.string.BoostingStarsGiveawayAdditionPrizeHint;
                } else {
                    i3 = R.string.BoostingGiveawayAdditionPrizeHint;
                }
                arrayList.add(BoostAdapter.Item.asDivider(LocaleController.getString(i3), false));
            }
            arrayList.add(BoostAdapter.Item.asSubTitle(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
            long j5 = this.selectedEndDate;
            BoostAdapter.Item item114 = new BoostAdapter.Item(10, z4);
            item114.longValue = j5;
            arrayList.add(item114);
            if (this.selectedBoostType == 3) {
                if (isPreparedGiveaway()) {
                    r10 = 0;
                    arrayList.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(z3 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", getSelectedSliderValue(), LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.selectedStars, new Object[0])), false));
                } else {
                    r10 = 0;
                    arrayList.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(z3 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", prepaidGiveaway.quantity, LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.selectedStars, new Object[0])), false));
                }
            } else {
                r10 = 0;
                r10 = 0;
                if (isPreparedGiveaway()) {
                    arrayList.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(z3 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", getSelectedSliderValue(), new Object[0]), false));
                } else {
                    arrayList.add(BoostAdapter.Item.asDivider(LocaleController.formatPluralString(z3 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", prepaidGiveaway.quantity, new Object[0]), false));
                }
            }
            String string8 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
            BoostAdapter.Item item115 = new BoostAdapter.Item(15, this.isShowWinnersSelected);
            item115.text = string8;
            item115.boolValue = r10;
            item115.subType = r10;
            arrayList.add(item115);
            if (isPreparedGiveaway()) {
                arrayList.add(BoostAdapter.Item.asDivider(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint), r10));
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint));
                if (this.selectedBoostType != 3) {
                    strM = NotificationsController$$ExternalSyntheticOutline1.m(new StringBuilder("\n\n"), R.string.BoostingStoriesFeaturesAndTerms);
                } else {
                    strM = "";
                }
                sb3.append(strM);
                arrayList.add(BoostAdapter.Item.asDivider(AndroidUtilities.replaceSingleTag(sb3.toString(), Theme.key_chat_messageLinkIn, 0, new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda0(this, 4), this.resourcesProvider), true));
            }
        }
        boostAdapter = this.adapter;
        if (boostAdapter == null) {
            return;
        }
        if (z) {
            boostAdapter.setItems(arrayList2, arrayList);
        } else {
            boostAdapter.mObservable.notifyChanged();
        }
    }
}
