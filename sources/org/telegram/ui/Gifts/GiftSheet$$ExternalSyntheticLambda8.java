package org.telegram.ui.Gifts;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.gms.internal.mlkit_vision_common.zzke;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda5;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Business.AwayMessagesActivity;
import org.telegram.ui.Business.BusinessIntroActivity;
import org.telegram.ui.Business.BusinessRecipientsHelper;
import org.telegram.ui.Business.ChatbotSheet;
import org.telegram.ui.Business.ChatbotSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Business.GreetMessagesActivity;
import org.telegram.ui.Business.LocationActivity;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Business.OpeningHoursDayActivity;
import org.telegram.ui.Business.TimezoneSelector;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda426;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet;
import org.telegram.ui.Components.poll.sheets.PollStatisticsBottomSheet;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.BagRandomizer;
import org.telegram.ui.Stars.BalanceCloud$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.ExplainStarsSheet;
import org.telegram.ui.Stars.GiftOfferSheet;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.bots.BotStorage$$ExternalSyntheticLambda6;

public final class GiftSheet$$ExternalSyntheticLambda8 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;

    public GiftSheet$$ExternalSyntheticLambda8(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final void run$org$telegram$ui$Gifts$ProfileGiftsContainer$Page$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        int i;
        int i2;
        ArrayList arrayList = (ArrayList) obj;
        ProfileGiftsContainer.Page page = (ProfileGiftsContainer.Page) this.f$0;
        StarsController.GiftsList giftsList = page.list;
        if (giftsList == null) {
            return;
        }
        if ((!giftsList.sort_by_date || giftsList.includeFlags != 783) && giftsList.gifts.size() <= 0) {
            StarsController.GiftsList giftsList2 = page.list;
            if (giftsList2.endReached && !giftsList2.loading) {
                return;
            }
        }
        StarsController.GiftsList giftsList3 = page.list;
        int iMax = Math.max(1, (giftsList3 == null || (i2 = giftsList3.totalCount) == 0) ? 3 : Math.min(3, i2));
        StarsController.GiftsList giftsList4 = page.list;
        ProfileGiftsContainer profileGiftsContainer = page.parent;
        if (giftsList4 != null) {
            ArrayList arrayList2 = giftsList4.gifts;
            int size = arrayList2.size();
            int i3 = 0;
            loop0: while (true) {
                i = 3;
                while (true) {
                    if (i3 >= size) {
                        break loop0;
                    }
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                    boolean z = page.isCollection;
                    int i4 = GiftSheet.GiftCell.Factory.$r8$clinit;
                    UItem spanCount = UItem.ofFactory(GiftSheet.GiftCell.Factory.class).setSpanCount(1);
                    spanCount.intValue = 0;
                    spanCount.object = savedStarGift;
                    spanCount.accent = true;
                    spanCount.collapsed = false;
                    spanCount.red = z;
                    arrayList.add(spanCount.setReordering(page.reordering && (page.list != profileGiftsContainer.list || savedStarGift.pinned_to_top)));
                    i--;
                    if (i == 0) {
                    }
                }
            }
            StarsController.GiftsList giftsList5 = page.list;
            if (giftsList5.loading || !giftsList5.endReached) {
                int i5 = 0;
                while (true) {
                    if (i5 >= (i <= 0 ? 3 : i)) {
                        break;
                    }
                    i5++;
                    zzlb.m(i5, 34, arrayList);
                }
            }
        }
        if (profileGiftsContainer.list == page.list) {
            arrayList.add(UItem.asSpace(AndroidUtilities.dp(20.0f)));
            if (profileGiftsContainer.dialogId == UserConfig.getInstance(page.currentAccount).getClientUserId()) {
                int color = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, page.resourcesProvider);
                String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                int iDp = AndroidUtilities.dp(24.0f);
                int i6 = ProfileGiftsContainer.TextFactory.$r8$clinit;
                UItem uItemOfFactory = UItem.ofFactory(ProfileGiftsContainer.TextFactory.class);
                uItemOfFactory.text = string;
                uItemOfFactory.intValue = 17;
                uItemOfFactory.longValue = color;
                uItemOfFactory.floatValue = 14.0f;
                uItemOfFactory.pad = iDp;
                uItemOfFactory.iconResId = 0;
                uItemOfFactory.accent = false;
                arrayList.add(uItemOfFactory);
            }
            arrayList.add(UItem.asSpace(AndroidUtilities.dp(82.0f)));
        } else if (!arrayList.isEmpty()) {
            arrayList.add(UItem.asSpace(AndroidUtilities.dp(82.0f)));
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(0, UItem.asSpace(AndroidUtilities.dp(page.hasTabs ? 42.0f : 12.0f)));
        }
        if (page.listView.getSpanCount() != iMax) {
            AndroidUtilities.runOnUIThread(new ProfileGiftsContainer$$ExternalSyntheticLambda16(page, iMax, 1));
        }
        if (profileGiftsContainer != null) {
            profileGiftsContainer.updateTabsY();
            profileGiftsContainer.post(new ProfileGiftsContainer$$ExternalSyntheticLambda8(profileGiftsContainer, 3));
        }
    }

    private final void run$org$telegram$ui$Gifts$ResaleGiftsFragment$$ExternalSyntheticLambda3(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        ResaleGiftsFragment resaleGiftsFragment = (ResaleGiftsFragment) this.f$0;
        ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = resaleGiftsFragment.list;
        ArrayList arrayList2 = resaleGiftsList.gifts;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList2.get(i);
            i++;
            arrayList.add(GiftSheet.GiftCell.Factory.asStarGift(0, (TL_stars.TL_starGiftUnique) obj3, false, false, false, true, false));
        }
        if (resaleGiftsList.loading || !resaleGiftsList.endReached) {
            zzlb.m(-1, 34, arrayList);
            zzlb.m(-2, 34, arrayList);
            zzlb.m(-3, 34, arrayList);
            if (resaleGiftsList.gifts.isEmpty()) {
                zzlb.m(-4, 34, arrayList);
                zzlb.m(-5, 34, arrayList);
                zzlb.m(-6, 34, arrayList);
                zzlb.m(-7, 34, arrayList);
                zzlb.m(-8, 34, arrayList);
                zzlb.m(-9, 34, arrayList);
                zzlb.m(-10, 34, arrayList);
                zzlb.m(-11, 34, arrayList);
                zzlb.m(-12, 34, arrayList);
                zzlb.m(-13, 34, arrayList);
                zzlb.m(-14, 34, arrayList);
                zzlb.m(-15, 34, arrayList);
            }
        }
        boolean z = arrayList.isEmpty() && !resaleGiftsList.loading;
        if (resaleGiftsFragment.emptyViewVisible == z) {
            return;
        }
        resaleGiftsFragment.emptyViewVisible = z;
        resaleGiftsFragment.emptyView.setVisibility(0);
        resaleGiftsFragment.emptyView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.95f).scaleY(z ? 1.0f : 0.95f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).setListener(new ResaleGiftsFragment.AnonymousClass11(resaleGiftsFragment, z, 1)).start();
    }

    private final void run$org$telegram$ui$Stars$ExplainStarsSheet$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        ExplainStarsSheet explainStarsSheet = (ExplainStarsSheet) this.f$0;
        arrayList.add(UItem.asCustom(explainStarsSheet.headerView));
        int i = R.drawable.msg_gift_premium;
        String string = LocaleController.getString(R.string.ExplainStarsFeature1Title);
        String string2 = LocaleController.getString(R.string.ExplainStarsFeature1Text);
        int i2 = ExplainStarsSheet.FeatureCell.Factory.$r8$clinit;
        UItem uItemOfFactory = UItem.ofFactory(ExplainStarsSheet.FeatureCell.Factory.class);
        uItemOfFactory.selectable = false;
        uItemOfFactory.intValue = i;
        uItemOfFactory.text = string;
        uItemOfFactory.subtext = string2;
        arrayList.add(uItemOfFactory);
        int i3 = R.drawable.msg_bot;
        String string3 = LocaleController.getString(R.string.ExplainStarsFeature2Title);
        CharSequence charSequenceReplaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new BalanceCloud$$ExternalSyntheticLambda1(explainStarsSheet, 2)), true);
        UItem uItemOfFactory2 = UItem.ofFactory(ExplainStarsSheet.FeatureCell.Factory.class);
        uItemOfFactory2.selectable = false;
        uItemOfFactory2.intValue = i3;
        uItemOfFactory2.text = string3;
        uItemOfFactory2.subtext = charSequenceReplaceArrows;
        arrayList.add(uItemOfFactory2);
        int i4 = R.drawable.menu_unlock;
        String string4 = LocaleController.getString(R.string.ExplainStarsFeature3Title);
        String string5 = LocaleController.getString(R.string.ExplainStarsFeature3Text);
        UItem uItemOfFactory3 = UItem.ofFactory(ExplainStarsSheet.FeatureCell.Factory.class);
        uItemOfFactory3.selectable = false;
        uItemOfFactory3.intValue = i4;
        uItemOfFactory3.text = string4;
        uItemOfFactory3.subtext = string5;
        arrayList.add(uItemOfFactory3);
        int i5 = R.drawable.menu_feature_paid;
        String string6 = LocaleController.getString(R.string.ExplainStarsFeature4Title);
        String string7 = LocaleController.getString(R.string.ExplainStarsFeature4Text);
        UItem uItemOfFactory4 = UItem.ofFactory(ExplainStarsSheet.FeatureCell.Factory.class);
        uItemOfFactory4.selectable = false;
        uItemOfFactory4.intValue = i5;
        uItemOfFactory4.text = string6;
        uItemOfFactory4.subtext = string7;
        arrayList.add(uItemOfFactory4);
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(68.0f)));
    }

    private final void run$org$telegram$ui$Stars$StarGiftPreviewSheet$$ExternalSyntheticLambda10(Object obj, Object obj2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i = 1;
        ArrayList arrayList3 = (ArrayList) obj;
        StarGiftPreviewSheet starGiftPreviewSheet = (StarGiftPreviewSheet) this.f$0;
        ArrayList arrayList4 = starGiftPreviewSheet.models;
        if (arrayList4 == null || (arrayList = starGiftPreviewSheet.backdrops) == null || (arrayList2 = starGiftPreviewSheet.patterns) == null) {
            return;
        }
        arrayList3.add(UItem.asSpace(AndroidUtilities.dp(315.0f)));
        BagRandomizer bagRandomizer = starGiftPreviewSheet.rBackdrops;
        bagRandomizer.currentIndex = 0;
        bagRandomizer.next();
        BagRandomizer bagRandomizer2 = starGiftPreviewSheet.rPatterns;
        bagRandomizer2.currentIndex = 0;
        bagRandomizer2.next();
        BagRandomizer bagRandomizer3 = starGiftPreviewSheet.rModels;
        bagRandomizer3.currentIndex = 0;
        bagRandomizer3.next();
        int i2 = starGiftPreviewSheet.tabsSelectorView.selectedTab;
        if (i2 == 0) {
            boolean z = starGiftPreviewSheet.crafting;
            arrayList3.add(UItem.asCenterShadow(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList4.size()))));
            int size = arrayList4.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj3 = arrayList4.get(i3);
                i3 += i;
                StarGiftPreviewSheet.Attributes attributes = new StarGiftPreviewSheet.Attributes((TL_stars.starGiftAttributeBackdrop) bagRandomizer.next(), (TL_stars.starGiftAttributePattern) bagRandomizer2.next(), (TL_stars.starGiftAttributeModel) obj3);
                int i4 = StarGiftPreviewSheet.GiftAttributeCell.Factory.$r8$clinit;
                UItem spanCount = UItem.ofFactory(StarGiftPreviewSheet.GiftAttributeCell.Factory.class).setSpanCount(1);
                spanCount.intValue = i2;
                spanCount.object = attributes;
                arrayList3.add(spanCount);
                i = 1;
            }
            ArrayList arrayList5 = starGiftPreviewSheet.simpleModels;
            if (arrayList5.isEmpty()) {
                return;
            }
            arrayList3.add(UItem.asCenterShadow(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList4.size()))));
            int size2 = arrayList5.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj4 = arrayList5.get(i5);
                i5++;
                StarGiftPreviewSheet.Attributes attributes2 = new StarGiftPreviewSheet.Attributes((TL_stars.starGiftAttributeBackdrop) bagRandomizer.next(), (TL_stars.starGiftAttributePattern) bagRandomizer2.next(), (TL_stars.starGiftAttributeModel) obj4);
                int i6 = StarGiftPreviewSheet.GiftAttributeCell.Factory.$r8$clinit;
                UItem spanCount2 = UItem.ofFactory(StarGiftPreviewSheet.GiftAttributeCell.Factory.class).setSpanCount(1);
                spanCount2.intValue = i2;
                spanCount2.object = attributes2;
                arrayList3.add(spanCount2);
            }
            return;
        }
        int i7 = 1;
        if (i2 == 1) {
            arrayList3.add(UItem.asCenterShadow(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList.size()))));
            int size3 = arrayList.size();
            int i8 = 0;
            while (i8 < size3) {
                Object obj5 = arrayList.get(i8);
                i8 += i7;
                StarGiftPreviewSheet.Attributes attributes3 = new StarGiftPreviewSheet.Attributes((TL_stars.starGiftAttributeBackdrop) obj5, (TL_stars.starGiftAttributePattern) bagRandomizer2.next(), (TL_stars.starGiftAttributeModel) bagRandomizer3.next());
                int i9 = StarGiftPreviewSheet.GiftAttributeCell.Factory.$r8$clinit;
                UItem spanCount3 = UItem.ofFactory(StarGiftPreviewSheet.GiftAttributeCell.Factory.class).setSpanCount(i7);
                spanCount3.intValue = i2;
                spanCount3.object = attributes3;
                arrayList3.add(spanCount3);
                i7 = 1;
            }
            return;
        }
        if (i2 == 2) {
            arrayList3.add(UItem.asCenterShadow(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList2.size()))));
            int size4 = arrayList2.size();
            int i10 = 0;
            while (i10 < size4) {
                Object obj6 = arrayList2.get(i10);
                i10++;
                StarGiftPreviewSheet.Attributes attributes4 = new StarGiftPreviewSheet.Attributes((TL_stars.starGiftAttributeBackdrop) bagRandomizer.next(), (TL_stars.starGiftAttributePattern) obj6, (TL_stars.starGiftAttributeModel) bagRandomizer3.next());
                int i11 = StarGiftPreviewSheet.GiftAttributeCell.Factory.$r8$clinit;
                UItem spanCount4 = UItem.ofFactory(StarGiftPreviewSheet.GiftAttributeCell.Factory.class).setSpanCount(1);
                spanCount4.intValue = i2;
                spanCount4.object = attributes4;
                arrayList3.add(spanCount4);
            }
        }
    }

    private final void run$org$telegram$ui$Stars$StarsController$$ExternalSyntheticLambda138(Object obj, Object obj2) {
        Long l = (Long) obj;
        Boolean bool = (Boolean) obj2;
        Utilities.Callback2 callback2 = (Utilities.Callback2) this.f$0;
        if (callback2 != null) {
            callback2.run(l, bool);
        }
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        TL_stars.StarGift starGift;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        UniversalAdapter universalAdapter;
        final int i = 4;
        final int i2 = 3;
        final int i3 = 2;
        final int i4 = 1;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                GiftSheet giftSheet = (GiftSheet) obj3;
                GiftSheet.AnonymousClass1 anonymousClass1 = giftSheet.topView;
                long j = giftSheet.dialogId;
                boolean z3 = giftSheet.self;
                if (z3 || j < 0 || ((disallowedGiftsSettings4 = giftSheet.userSettings) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
                    z = false;
                } else {
                    arrayList.add(UItem.asCustom(anonymousClass1));
                    arrayList.add(UItem.asCustom(giftSheet.premiumHeaderView));
                    ArrayList arrayList2 = giftSheet.premiumTiers;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        zzlb.m(1, 34, arrayList);
                        zzlb.m(2, 34, arrayList);
                        zzlb.m(3, 34, arrayList);
                    } else {
                        int size = arrayList2.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj4 = arrayList2.get(i5);
                            i5++;
                            GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = (GiftPremiumBottomSheet$GiftTier) obj4;
                            int i6 = GiftSheet.GiftCell.Factory.$r8$clinit;
                            UItem spanCount = UItem.ofFactory(GiftSheet.GiftCell.Factory.class).setSpanCount(1);
                            spanCount.object = giftPremiumBottomSheet$GiftTier;
                            arrayList.add(spanCount);
                        }
                    }
                    z = true;
                }
                int i7 = giftSheet.currentAccount;
                int i8 = 0;
                StarsController starsController = StarsController.getInstance(i7, false);
                ArrayList arrayList3 = giftSheet.birthday ? starsController.birthdaySortedGifts : starsController.sortedGifts;
                if (giftSheet.userSettings != null) {
                    arrayList3 = (ArrayList) Collection.EL.stream(arrayList3).filter(new BotStorage$$ExternalSyntheticLambda6(giftSheet, i3)).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda426()));
                }
                if (j < 0) {
                    arrayList3 = (ArrayList) Collection.EL.stream(arrayList3).filter(new GiftSheet$$ExternalSyntheticLambda20()).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda426()));
                }
                long clientUserId = UserConfig.getInstance(i7).getClientUserId();
                StarsController.GiftsList giftsList = giftSheet.myGifts;
                if (j == clientUserId || giftsList == null) {
                    z2 = false;
                } else {
                    ArrayList arrayList4 = giftsList.gifts;
                    int size2 = arrayList4.size();
                    while (true) {
                        if (i8 < size2) {
                            Object obj5 = arrayList4.get(i8);
                            i8++;
                            if (((TL_stars.SavedStarGift) obj5).gift instanceof TL_stars.TL_starGiftUnique) {
                                z2 = true;
                            }
                        } else {
                            z2 = false;
                        }
                    }
                }
                if (!MessagesController.getInstance(i7).stargiftsBlocked && (!arrayList3.isEmpty() || ((disallowedGiftsSettings3 = giftSheet.userSettings) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && giftsList != null && !giftsList.gifts.isEmpty()))) {
                    if (z) {
                        arrayList.add(UItem.asSpace(AndroidUtilities.dp(16.0f)));
                    } else {
                        arrayList.add(UItem.asCustom(anonymousClass1));
                    }
                    arrayList.add(UItem.asCustom(giftSheet.starsHeaderView));
                    TreeSet treeSet = new TreeSet();
                    TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = giftSheet.userSettings;
                    if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                        for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                            treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList3.get(i9)).stars));
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    giftSheet.TAB_MY_GIFTS = -1;
                    giftSheet.TAB_ALL = -1;
                    if (!arrayList3.isEmpty()) {
                        giftSheet.TAB_ALL = arrayList5.size();
                        arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
                    }
                    TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = giftSheet.userSettings;
                    if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z2) {
                        giftSheet.TAB_MY_GIFTS = arrayList5.size();
                        arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
                    }
                    giftSheet.TAB_COLLECTIBLES = arrayList5.size();
                    arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
                    int i10 = giftSheet.selectedTab;
                    GiftSheet$$ExternalSyntheticLambda7 giftSheet$$ExternalSyntheticLambda7 = new GiftSheet$$ExternalSyntheticLambda7(giftSheet, i4);
                    int i11 = GiftSheet.Tabs.Factory.$r8$clinit;
                    UItem uItemOfFactory = UItem.ofFactory(GiftSheet.Tabs.Factory.class);
                    uItemOfFactory.id = 1;
                    uItemOfFactory.object = arrayList5;
                    uItemOfFactory.intValue = i10;
                    uItemOfFactory.object2 = giftSheet$$ExternalSyntheticLambda7;
                    arrayList.add(uItemOfFactory);
                    boolean z4 = giftSheet.selectedTab == giftSheet.TAB_COLLECTIBLES && !z3 && j >= 0;
                    if (z4 != giftSheet.shownCollectiblesInfo) {
                        giftSheet.shownCollectiblesInfo = z4;
                        ViewPropertyAnimator duration = giftSheet.subtitleStarsView.animate().alpha(!z4 ? 1.0f : 0.0f).scaleX(!z4 ? 1.0f : 0.85f).scaleY(!z4 ? 1.0f : 0.85f).setDuration(380L);
                        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                        duration.setInterpolator(cubicBezierInterpolator).start();
                        giftSheet.subtitleCollectiblesStarsView.animate().alpha(z4 ? 1.0f : 0.0f).scaleX(z4 ? 1.0f : 0.85f).scaleY(z4 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(cubicBezierInterpolator).start();
                    }
                    if (giftsList != null && giftSheet.selectedTab == giftSheet.TAB_MY_GIFTS) {
                        arrayList3 = new ArrayList();
                        ArrayList arrayList6 = giftsList.gifts;
                        int size3 = arrayList6.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            Object obj6 = arrayList6.get(i12);
                            i12++;
                            TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj6).gift;
                            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                                arrayList3.add(starGift2);
                            }
                        }
                    }
                    int i13 = 0;
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList3.get(i14);
                        int i15 = giftSheet.selectedTab;
                        if (i15 == giftSheet.TAB_ALL || i15 == giftSheet.TAB_MY_GIFTS || (i15 == giftSheet.TAB_COLLECTIBLES && (starGift3.availability_resale > 0 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                            if (starGift3.sold_out || starGift3.availability_resale <= 0 || i15 == giftSheet.TAB_COLLECTIBLES) {
                                starGift = starGift3;
                            } else {
                                UItem uItemAsStarGift = GiftSheet.GiftCell.Factory.asStarGift(i15, starGift3, i15 == giftSheet.TAB_MY_GIFTS, starGift3.limited && (disallowedGiftsSettings2 = giftSheet.userSettings) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                                starGift = starGift3;
                                arrayList.add(uItemAsStarGift);
                                i13++;
                            }
                            int i16 = giftSheet.selectedTab;
                            arrayList.add(GiftSheet.GiftCell.Factory.asStarGift(i16, starGift, i16 == giftSheet.TAB_MY_GIFTS, starGift.limited && (disallowedGiftsSettings = giftSheet.userSettings) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                            i13++;
                        }
                    }
                    int i17 = giftSheet.selectedTab;
                    int i18 = giftSheet.TAB_MY_GIFTS;
                    if (i17 == i18 && giftsList != null && !giftsList.endReached) {
                        giftsList.load();
                        arrayList.add(UItem.asFlicker(4, 34).setSpanCount(1));
                        zzlb.m(5, 34, arrayList);
                        zzlb.m(6, 34, arrayList);
                    } else if (i17 != i18 && starsController.giftsLoading) {
                        zzlb.m(4, 34, arrayList);
                        zzlb.m(5, 34, arrayList);
                        zzlb.m(6, 34, arrayList);
                    }
                    arrayList.add(UItem.asSpace(AndroidUtilities.dp(i13 < 9 ? 300.0f : 40.0f)));
                    break;
                } else {
                    TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = giftSheet.userSettings;
                    if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList3.isEmpty()) {
                        arrayList.add(UItem.asSpace(AndroidUtilities.dp(300.0f)));
                        break;
                    }
                }
                break;
            case 1:
                ((DialogsSearchAdapter) obj3).openSponsoredOptions((ProfileSearchCell) obj, (TLRPC.TL_sponsoredPeer) obj2);
                break;
            case 2:
                ((AwayMessagesActivity) obj3).fillItems$1((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 3:
                BusinessIntroActivity businessIntroActivity = (BusinessIntroActivity) obj3;
                businessIntroActivity.chatAttachAlert.lambda$showGiftOfferSheet$15();
                businessIntroActivity.inputStickerPath = (String) obj;
                businessIntroActivity.inputSticker = (TLRPC.InputDocument) obj2;
                businessIntroActivity.stickerRandom = false;
                AndroidUtilities.cancelRunOnUIThread(businessIntroActivity.updateRandomStickerRunnable);
                businessIntroActivity.greetingsView.setSticker(businessIntroActivity.inputStickerPath);
                businessIntroActivity.checkDone$1(true);
                UniversalRecyclerView universalRecyclerView = businessIntroActivity.listView;
                if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
                    universalAdapter.update(true);
                    break;
                }
                break;
            case 4:
                ArrayList arrayList7 = (ArrayList) obj;
                UniversalAdapter universalAdapter2 = (UniversalAdapter) obj2;
                ChatbotSheet chatbotSheet = (ChatbotSheet) obj3;
                chatbotSheet.getClass();
                universalAdapter2.itemsOffset = 1;
                arrayList7.add(UItem.asCustomShadow(-5, chatbotSheet.topView));
                TL_account.TL_connectedBot tL_connectedBot = chatbotSheet.bot;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        zzke.m(R.string.SessionBotConnectedFrom, arrayList7);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList7.add(UItem.asButton(1, LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            arrayList7.add(UItem.asButton(2, LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 2)) {
                            arrayList7.add(UItem.asButton(3, LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false)));
                        }
                        arrayList7.add(UItem.asShadow(null));
                    }
                    universalAdapter2.whiteSectionStart();
                    zzke.m(R.string.BusinessBotChats2, arrayList7);
                    arrayList7.add(UItem.asRadio(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2)).setChecked(chatbotSheet.exclude));
                    arrayList7.add(UItem.asRadio(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2)).setChecked(!chatbotSheet.exclude));
                    universalAdapter2.whiteSectionEnd();
                    arrayList7.add(UItem.asShadow(null));
                    BusinessRecipientsHelper businessRecipientsHelper = chatbotSheet.recipientsHelper;
                    if (businessRecipientsHelper != null) {
                        businessRecipientsHelper.fillItems(arrayList7, universalAdapter2, true);
                    }
                    zzkf.m(R.string.BusinessBotChatsInfo2, arrayList7);
                }
                break;
            case 5:
                ArrayList arrayList8 = (ArrayList) obj;
                UniversalAdapter universalAdapter3 = (UniversalAdapter) obj2;
                final ChatbotsActivity chatbotsActivity = (ChatbotsActivity) obj3;
                arrayList8.add(UItem.asTopView(LocaleController.getString(R.string.BusinessBots2), LocaleController.getString(R.string.BusinessBots2Info), 120, "tg_superplaceholders_android_2", "🤖🏝️"));
                if (chatbotsActivity.selectedBot != null) {
                    universalAdapter3.whiteSectionStart();
                    final int i19 = 0;
                    arrayList8.add(UItem.asAddChat(Long.valueOf(chatbotsActivity.selectedBot.id)).setChecked(true).setCloseIcon(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i19) {
                                case 0:
                                    ChatbotsActivity chatbotsActivity2 = chatbotsActivity;
                                    chatbotsActivity2.selectedBot = null;
                                    chatbotsActivity2.listView.adapter.update(true);
                                    chatbotsActivity2.checkDone$5(true);
                                    break;
                                case 1:
                                    ChatbotsActivity chatbotsActivity3 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights = chatbotsActivity3.rights;
                                    if (tL_businessBotRights.reply && tL_businessBotRights.read_messages && tL_businessBotRights.delete_received_messages && tL_businessBotRights.delete_sent_messages) {
                                        tL_businessBotRights.delete_sent_messages = false;
                                        tL_businessBotRights.delete_received_messages = false;
                                        tL_businessBotRights.read_messages = false;
                                        tL_businessBotRights.reply = false;
                                    } else {
                                        tL_businessBotRights.delete_sent_messages = true;
                                        tL_businessBotRights.delete_received_messages = true;
                                        tL_businessBotRights.read_messages = true;
                                        tL_businessBotRights.reply = true;
                                    }
                                    chatbotsActivity3.listView.adapter.update(true);
                                    chatbotsActivity3.checkDone$5(true);
                                    break;
                                case 2:
                                    ChatbotsActivity chatbotsActivity4 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = chatbotsActivity4.rights;
                                    if (tL_businessBotRights2.edit_name && tL_businessBotRights2.edit_bio && tL_businessBotRights2.edit_profile_photo && tL_businessBotRights2.edit_username) {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        chatbotsActivity4.listView.adapter.update(true);
                                        chatbotsActivity4.checkDone$5(true);
                                    } else {
                                        chatbotsActivity4.checkAlert(-14, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity4, 3));
                                    }
                                    break;
                                case 3:
                                    ChatbotsActivity chatbotsActivity5 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = chatbotsActivity5.rights;
                                    if (tL_businessBotRights3.view_gifts && tL_businessBotRights3.sell_gifts && tL_businessBotRights3.change_gift_settings && tL_businessBotRights3.transfer_and_upgrade_gifts && tL_businessBotRights3.transfer_stars) {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        chatbotsActivity5.listView.adapter.update(true);
                                        chatbotsActivity5.checkDone$5(true);
                                    } else {
                                        chatbotsActivity5.checkAlert(-17, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity5, 2));
                                    }
                                    break;
                                default:
                                    ChatbotsActivity chatbotsActivity6 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = chatbotsActivity6.rights;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    chatbotsActivity6.listView.adapter.update(true);
                                    chatbotsActivity6.checkDone$5(true);
                                    break;
                            }
                        }
                    }));
                    universalAdapter3.whiteSectionEnd();
                } else {
                    universalAdapter3.whiteSectionStart();
                    arrayList8.add(UItem.asCustom(chatbotsActivity.editTextContainer));
                    LongSparseArray longSparseArray = chatbotsActivity.foundBots;
                    longSparseArray.clear();
                    boolean z5 = false;
                    for (int i20 = 0; i20 < chatbotsActivity.searchHelper.getLocalServerSearch().size(); i20++) {
                        TLObject tLObject = chatbotsActivity.searchHelper.getLocalServerSearch().get(i20);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                arrayList8.add(UItem.asAddChat(Long.valueOf(user.id), chatbotsActivity.lastQuery));
                                longSparseArray.put(user.id, user);
                                z5 = true;
                            }
                        }
                    }
                    for (int i21 = 0; i21 < chatbotsActivity.searchHelper.getGlobalSearch().size(); i21++) {
                        TLObject tLObject2 = chatbotsActivity.searchHelper.getGlobalSearch().get(i21);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                arrayList8.add(UItem.asAddChat(Long.valueOf(user2.id), chatbotsActivity.lastQuery));
                                longSparseArray.put(user2.id, user2);
                                z5 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(chatbotsActivity.editText.getText().toString()) || chatbotsActivity.searchHelper.isSearchInProgress() || chatbotsActivity.scheduledLoading)) {
                        arrayList8.add(UItem.asCustom(chatbotsActivity.emptyView));
                        z5 = true;
                    }
                    chatbotsActivity.editTextDivider.setVisibility(z5 ? 0 : 8);
                    universalAdapter3.whiteSectionEnd();
                }
                arrayList8.add(UItem.asShadow(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                universalAdapter3.whiteSectionStart();
                arrayList8.add(UItem.asHeader(LocaleController.getString(R.string.BusinessBotChats2)).setEnabled(chatbotsActivity.selectedBot != null));
                arrayList8.add(UItem.asRadio(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2)).setChecked(chatbotsActivity.exclude).setEnabled(chatbotsActivity.selectedBot != null));
                arrayList8.add(UItem.asRadio(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2)).setChecked(!chatbotsActivity.exclude).setEnabled(chatbotsActivity.selectedBot != null));
                universalAdapter3.whiteSectionEnd();
                arrayList8.add(UItem.asShadow(null));
                chatbotsActivity.recipientsHelper.fillItems(arrayList8, universalAdapter3, chatbotsActivity.selectedBot != null);
                zzkf.m(R.string.BusinessBotChatsInfo2, arrayList8);
                if (chatbotsActivity.selectedBot != null) {
                    universalAdapter3.whiteSectionStart();
                    zzke.m(R.string.BusinessBotPermissions, arrayList8);
                    String string = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = chatbotsActivity.rights;
                    sb.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb.append("/5");
                    UItem uItemAsExpandableSwitch = UItem.asExpandableSwitch(-4, string, sb.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = chatbotsActivity.rights;
                    arrayList8.add(uItemAsExpandableSwitch.setChecked(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages).setCollapsed(!chatbotsActivity.expandedMessagesSection).setClickCallback(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i4) {
                                case 0:
                                    ChatbotsActivity chatbotsActivity2 = chatbotsActivity;
                                    chatbotsActivity2.selectedBot = null;
                                    chatbotsActivity2.listView.adapter.update(true);
                                    chatbotsActivity2.checkDone$5(true);
                                    break;
                                case 1:
                                    ChatbotsActivity chatbotsActivity3 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = chatbotsActivity3.rights;
                                    if (tL_businessBotRights3.reply && tL_businessBotRights3.read_messages && tL_businessBotRights3.delete_received_messages && tL_businessBotRights3.delete_sent_messages) {
                                        tL_businessBotRights3.delete_sent_messages = false;
                                        tL_businessBotRights3.delete_received_messages = false;
                                        tL_businessBotRights3.read_messages = false;
                                        tL_businessBotRights3.reply = false;
                                    } else {
                                        tL_businessBotRights3.delete_sent_messages = true;
                                        tL_businessBotRights3.delete_received_messages = true;
                                        tL_businessBotRights3.read_messages = true;
                                        tL_businessBotRights3.reply = true;
                                    }
                                    chatbotsActivity3.listView.adapter.update(true);
                                    chatbotsActivity3.checkDone$5(true);
                                    break;
                                case 2:
                                    ChatbotsActivity chatbotsActivity4 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = chatbotsActivity4.rights;
                                    if (tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username) {
                                        tL_businessBotRights4.edit_username = false;
                                        tL_businessBotRights4.edit_profile_photo = false;
                                        tL_businessBotRights4.edit_bio = false;
                                        tL_businessBotRights4.edit_name = false;
                                        chatbotsActivity4.listView.adapter.update(true);
                                        chatbotsActivity4.checkDone$5(true);
                                    } else {
                                        chatbotsActivity4.checkAlert(-14, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity4, 3));
                                    }
                                    break;
                                case 3:
                                    ChatbotsActivity chatbotsActivity5 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights5 = chatbotsActivity5.rights;
                                    if (tL_businessBotRights5.view_gifts && tL_businessBotRights5.sell_gifts && tL_businessBotRights5.change_gift_settings && tL_businessBotRights5.transfer_and_upgrade_gifts && tL_businessBotRights5.transfer_stars) {
                                        tL_businessBotRights5.transfer_stars = false;
                                        tL_businessBotRights5.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights5.change_gift_settings = false;
                                        tL_businessBotRights5.sell_gifts = false;
                                        tL_businessBotRights5.view_gifts = false;
                                        chatbotsActivity5.listView.adapter.update(true);
                                        chatbotsActivity5.checkDone$5(true);
                                    } else {
                                        chatbotsActivity5.checkAlert(-17, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity5, 2));
                                    }
                                    break;
                                default:
                                    ChatbotsActivity chatbotsActivity6 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights6 = chatbotsActivity6.rights;
                                    tL_businessBotRights6.manage_stories = !tL_businessBotRights6.manage_stories;
                                    chatbotsActivity6.listView.adapter.update(true);
                                    chatbotsActivity6.checkDone$5(true);
                                    break;
                            }
                        }
                    }));
                    if (chatbotsActivity.expandedMessagesSection) {
                        arrayList8.add(UItem.asRoundCheckbox(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead)).setChecked(true).setEnabled(false).setPad(1));
                        arrayList8.add(UItem.asRoundCheckbox(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply)).setChecked(chatbotsActivity.rights.reply).setPad(1));
                        arrayList8.add(UItem.asRoundCheckbox(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead)).setChecked(chatbotsActivity.rights.read_messages).setPad(1));
                        arrayList8.add(UItem.asRoundCheckbox(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent)).setChecked(chatbotsActivity.rights.delete_sent_messages).setPad(1));
                        arrayList8.add(UItem.asRoundCheckbox(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived)).setChecked(chatbotsActivity.rights.delete_received_messages).setPad(1));
                    }
                    String string2 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = chatbotsActivity.rights;
                    sb2.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb2.append("/4");
                    UItem uItemAsExpandableSwitch2 = UItem.asExpandableSwitch(-10, string2, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = chatbotsActivity.rights;
                    arrayList8.add(uItemAsExpandableSwitch2.setChecked(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username).setCollapsed(!chatbotsActivity.expandedProfileSection).setClickCallback(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i3) {
                                case 0:
                                    ChatbotsActivity chatbotsActivity2 = chatbotsActivity;
                                    chatbotsActivity2.selectedBot = null;
                                    chatbotsActivity2.listView.adapter.update(true);
                                    chatbotsActivity2.checkDone$5(true);
                                    break;
                                case 1:
                                    ChatbotsActivity chatbotsActivity3 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights5 = chatbotsActivity3.rights;
                                    if (tL_businessBotRights5.reply && tL_businessBotRights5.read_messages && tL_businessBotRights5.delete_received_messages && tL_businessBotRights5.delete_sent_messages) {
                                        tL_businessBotRights5.delete_sent_messages = false;
                                        tL_businessBotRights5.delete_received_messages = false;
                                        tL_businessBotRights5.read_messages = false;
                                        tL_businessBotRights5.reply = false;
                                    } else {
                                        tL_businessBotRights5.delete_sent_messages = true;
                                        tL_businessBotRights5.delete_received_messages = true;
                                        tL_businessBotRights5.read_messages = true;
                                        tL_businessBotRights5.reply = true;
                                    }
                                    chatbotsActivity3.listView.adapter.update(true);
                                    chatbotsActivity3.checkDone$5(true);
                                    break;
                                case 2:
                                    ChatbotsActivity chatbotsActivity4 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights6 = chatbotsActivity4.rights;
                                    if (tL_businessBotRights6.edit_name && tL_businessBotRights6.edit_bio && tL_businessBotRights6.edit_profile_photo && tL_businessBotRights6.edit_username) {
                                        tL_businessBotRights6.edit_username = false;
                                        tL_businessBotRights6.edit_profile_photo = false;
                                        tL_businessBotRights6.edit_bio = false;
                                        tL_businessBotRights6.edit_name = false;
                                        chatbotsActivity4.listView.adapter.update(true);
                                        chatbotsActivity4.checkDone$5(true);
                                    } else {
                                        chatbotsActivity4.checkAlert(-14, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity4, 3));
                                    }
                                    break;
                                case 3:
                                    ChatbotsActivity chatbotsActivity5 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights7 = chatbotsActivity5.rights;
                                    if (tL_businessBotRights7.view_gifts && tL_businessBotRights7.sell_gifts && tL_businessBotRights7.change_gift_settings && tL_businessBotRights7.transfer_and_upgrade_gifts && tL_businessBotRights7.transfer_stars) {
                                        tL_businessBotRights7.transfer_stars = false;
                                        tL_businessBotRights7.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights7.change_gift_settings = false;
                                        tL_businessBotRights7.sell_gifts = false;
                                        tL_businessBotRights7.view_gifts = false;
                                        chatbotsActivity5.listView.adapter.update(true);
                                        chatbotsActivity5.checkDone$5(true);
                                    } else {
                                        chatbotsActivity5.checkAlert(-17, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity5, 2));
                                    }
                                    break;
                                default:
                                    ChatbotsActivity chatbotsActivity6 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights8 = chatbotsActivity6.rights;
                                    tL_businessBotRights8.manage_stories = !tL_businessBotRights8.manage_stories;
                                    chatbotsActivity6.listView.adapter.update(true);
                                    chatbotsActivity6.checkDone$5(true);
                                    break;
                            }
                        }
                    }));
                    if (chatbotsActivity.expandedProfileSection) {
                        arrayList8.add(UItem.asRoundCheckbox(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName)).setChecked(chatbotsActivity.rights.edit_name).setPad(1));
                        arrayList8.add(UItem.asRoundCheckbox(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio)).setChecked(chatbotsActivity.rights.edit_bio).setPad(1));
                        arrayList8.add(UItem.asRoundCheckbox(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture)).setChecked(chatbotsActivity.rights.edit_profile_photo).setPad(1));
                        arrayList8.add(UItem.asRoundCheckbox(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername)).setChecked(chatbotsActivity.rights.edit_username).setPad(1));
                    }
                    String string3 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = chatbotsActivity.rights;
                    sb3.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb3.append("/5");
                    UItem uItemAsExpandableSwitch3 = UItem.asExpandableSwitch(-15, string3, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = chatbotsActivity.rights;
                    arrayList8.add(uItemAsExpandableSwitch3.setChecked(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars).setCollapsed(!chatbotsActivity.expandedGiftsSection).setClickCallback(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i2) {
                                case 0:
                                    ChatbotsActivity chatbotsActivity2 = chatbotsActivity;
                                    chatbotsActivity2.selectedBot = null;
                                    chatbotsActivity2.listView.adapter.update(true);
                                    chatbotsActivity2.checkDone$5(true);
                                    break;
                                case 1:
                                    ChatbotsActivity chatbotsActivity3 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights7 = chatbotsActivity3.rights;
                                    if (tL_businessBotRights7.reply && tL_businessBotRights7.read_messages && tL_businessBotRights7.delete_received_messages && tL_businessBotRights7.delete_sent_messages) {
                                        tL_businessBotRights7.delete_sent_messages = false;
                                        tL_businessBotRights7.delete_received_messages = false;
                                        tL_businessBotRights7.read_messages = false;
                                        tL_businessBotRights7.reply = false;
                                    } else {
                                        tL_businessBotRights7.delete_sent_messages = true;
                                        tL_businessBotRights7.delete_received_messages = true;
                                        tL_businessBotRights7.read_messages = true;
                                        tL_businessBotRights7.reply = true;
                                    }
                                    chatbotsActivity3.listView.adapter.update(true);
                                    chatbotsActivity3.checkDone$5(true);
                                    break;
                                case 2:
                                    ChatbotsActivity chatbotsActivity4 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights8 = chatbotsActivity4.rights;
                                    if (tL_businessBotRights8.edit_name && tL_businessBotRights8.edit_bio && tL_businessBotRights8.edit_profile_photo && tL_businessBotRights8.edit_username) {
                                        tL_businessBotRights8.edit_username = false;
                                        tL_businessBotRights8.edit_profile_photo = false;
                                        tL_businessBotRights8.edit_bio = false;
                                        tL_businessBotRights8.edit_name = false;
                                        chatbotsActivity4.listView.adapter.update(true);
                                        chatbotsActivity4.checkDone$5(true);
                                    } else {
                                        chatbotsActivity4.checkAlert(-14, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity4, 3));
                                    }
                                    break;
                                case 3:
                                    ChatbotsActivity chatbotsActivity5 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights9 = chatbotsActivity5.rights;
                                    if (tL_businessBotRights9.view_gifts && tL_businessBotRights9.sell_gifts && tL_businessBotRights9.change_gift_settings && tL_businessBotRights9.transfer_and_upgrade_gifts && tL_businessBotRights9.transfer_stars) {
                                        tL_businessBotRights9.transfer_stars = false;
                                        tL_businessBotRights9.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights9.change_gift_settings = false;
                                        tL_businessBotRights9.sell_gifts = false;
                                        tL_businessBotRights9.view_gifts = false;
                                        chatbotsActivity5.listView.adapter.update(true);
                                        chatbotsActivity5.checkDone$5(true);
                                    } else {
                                        chatbotsActivity5.checkAlert(-17, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity5, 2));
                                    }
                                    break;
                                default:
                                    ChatbotsActivity chatbotsActivity6 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights10 = chatbotsActivity6.rights;
                                    tL_businessBotRights10.manage_stories = !tL_businessBotRights10.manage_stories;
                                    chatbotsActivity6.listView.adapter.update(true);
                                    chatbotsActivity6.checkDone$5(true);
                                    break;
                            }
                        }
                    }));
                    if (chatbotsActivity.expandedGiftsSection) {
                        arrayList8.add(UItem.asRoundCheckbox(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView)).setChecked(chatbotsActivity.rights.view_gifts).setPad(1));
                        arrayList8.add(UItem.asRoundCheckbox(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell)).setChecked(chatbotsActivity.rights.sell_gifts).setPad(1));
                        arrayList8.add(UItem.asRoundCheckbox(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings)).setChecked(chatbotsActivity.rights.change_gift_settings).setPad(1));
                        arrayList8.add(UItem.asRoundCheckbox(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer)).setChecked(chatbotsActivity.rights.transfer_and_upgrade_gifts).setPad(1));
                        arrayList8.add(UItem.asRoundCheckbox(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars)).setChecked(chatbotsActivity.rights.transfer_stars).setPad(1));
                    }
                    arrayList8.add(UItem.asExpandableSwitch(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), "").setChecked(chatbotsActivity.rights.manage_stories).setClickCallback(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i) {
                                case 0:
                                    ChatbotsActivity chatbotsActivity2 = chatbotsActivity;
                                    chatbotsActivity2.selectedBot = null;
                                    chatbotsActivity2.listView.adapter.update(true);
                                    chatbotsActivity2.checkDone$5(true);
                                    break;
                                case 1:
                                    ChatbotsActivity chatbotsActivity3 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights7 = chatbotsActivity3.rights;
                                    if (tL_businessBotRights7.reply && tL_businessBotRights7.read_messages && tL_businessBotRights7.delete_received_messages && tL_businessBotRights7.delete_sent_messages) {
                                        tL_businessBotRights7.delete_sent_messages = false;
                                        tL_businessBotRights7.delete_received_messages = false;
                                        tL_businessBotRights7.read_messages = false;
                                        tL_businessBotRights7.reply = false;
                                    } else {
                                        tL_businessBotRights7.delete_sent_messages = true;
                                        tL_businessBotRights7.delete_received_messages = true;
                                        tL_businessBotRights7.read_messages = true;
                                        tL_businessBotRights7.reply = true;
                                    }
                                    chatbotsActivity3.listView.adapter.update(true);
                                    chatbotsActivity3.checkDone$5(true);
                                    break;
                                case 2:
                                    ChatbotsActivity chatbotsActivity4 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights8 = chatbotsActivity4.rights;
                                    if (tL_businessBotRights8.edit_name && tL_businessBotRights8.edit_bio && tL_businessBotRights8.edit_profile_photo && tL_businessBotRights8.edit_username) {
                                        tL_businessBotRights8.edit_username = false;
                                        tL_businessBotRights8.edit_profile_photo = false;
                                        tL_businessBotRights8.edit_bio = false;
                                        tL_businessBotRights8.edit_name = false;
                                        chatbotsActivity4.listView.adapter.update(true);
                                        chatbotsActivity4.checkDone$5(true);
                                    } else {
                                        chatbotsActivity4.checkAlert(-14, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity4, 3));
                                    }
                                    break;
                                case 3:
                                    ChatbotsActivity chatbotsActivity5 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights9 = chatbotsActivity5.rights;
                                    if (tL_businessBotRights9.view_gifts && tL_businessBotRights9.sell_gifts && tL_businessBotRights9.change_gift_settings && tL_businessBotRights9.transfer_and_upgrade_gifts && tL_businessBotRights9.transfer_stars) {
                                        tL_businessBotRights9.transfer_stars = false;
                                        tL_businessBotRights9.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights9.change_gift_settings = false;
                                        tL_businessBotRights9.sell_gifts = false;
                                        tL_businessBotRights9.view_gifts = false;
                                        chatbotsActivity5.listView.adapter.update(true);
                                        chatbotsActivity5.checkDone$5(true);
                                    } else {
                                        chatbotsActivity5.checkAlert(-17, true, new ChatbotsActivity$$ExternalSyntheticLambda5(chatbotsActivity5, 2));
                                    }
                                    break;
                                default:
                                    ChatbotsActivity chatbotsActivity6 = chatbotsActivity;
                                    TL_account.TL_businessBotRights tL_businessBotRights10 = chatbotsActivity6.rights;
                                    tL_businessBotRights10.manage_stories = !tL_businessBotRights10.manage_stories;
                                    chatbotsActivity6.listView.adapter.update(true);
                                    chatbotsActivity6.checkDone$5(true);
                                    break;
                            }
                        }
                    }));
                    universalAdapter3.whiteSectionEnd();
                    arrayList8.add(UItem.asShadow(-4, null));
                    arrayList8.add(UItem.asShadow(-5, null));
                    arrayList8.add(UItem.asShadow(-6, null));
                    arrayList8.add(UItem.asShadow(-7, null));
                }
                break;
            case 6:
                ((GreetMessagesActivity) obj3).fillItems$2((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 7:
                ArrayList arrayList9 = (ArrayList) obj;
                LocationActivity locationActivity = (LocationActivity) obj3;
                locationActivity.getClass();
                arrayList9.add(UItem.asTopView(LocaleController.getString(R.string.BusinessLocation), LocaleController.getString(R.string.BusinessLocationInfo), R.raw.biz_map));
                arrayList9.add(UItem.asCustom(locationActivity.editTextContainer));
                arrayList9.add(UItem.asShadow(null));
                arrayList9.add(UItem.asCheck(1, LocaleController.getString(R.string.BusinessLocationMap)).setChecked(locationActivity.geo != null));
                if (locationActivity.geo != null) {
                    arrayList9.add(UItem.asCustom(locationActivity.mapPreviewContainer));
                }
                arrayList9.add(UItem.asShadow(null));
                boolean z6 = (locationActivity.currentLocation == null || (locationActivity.geo == null && TextUtils.isEmpty(locationActivity.address))) ? false : true;
                locationActivity.clearVisible = z6;
                if (z6) {
                    arrayList9.add(UItem.asButton(2, LocaleController.getString(R.string.BusinessLocationClear)).red());
                    arrayList9.add(UItem.asShadow(null));
                }
                locationActivity.checkDone$2(true);
                break;
            case 8:
                ((OpeningHoursActivity) obj3).fillItems$4((ArrayList) obj);
                break;
            case 9:
                ArrayList arrayList10 = (ArrayList) obj;
                OpeningHoursDayActivity openingHoursDayActivity = (OpeningHoursDayActivity) obj3;
                openingHoursDayActivity.getClass();
                arrayList10.add(UItem.asRippleCheck(-1, LocaleController.getString(R.string.BusinessHoursDayOpen)).setChecked(openingHoursDayActivity.enabled));
                arrayList10.add(UItem.asShadow(null));
                if (openingHoursDayActivity.enabled) {
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList11 = openingHoursDayActivity.periods;
                        if (i22 >= arrayList11.size()) {
                            if (openingHoursDayActivity.showAddButton()) {
                                arrayList10.add(UItem.asShadow(null));
                                arrayList10.add(UItem.asButton(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd)).accent());
                            }
                            zzkf.m(R.string.BusinessHoursDayInfo, arrayList10);
                        } else {
                            if (i22 > 0) {
                                arrayList10.add(UItem.asShadow(null));
                            }
                            OpeningHoursActivity.Period period = (OpeningHoursActivity.Period) arrayList11.get(i22);
                            if (!openingHoursDayActivity.is24()) {
                                int i23 = i22 * 3;
                                arrayList10.add(UItem.asButton(i23, LocaleController.getString(R.string.BusinessHoursDayOpenHour), OpeningHoursActivity.Period.timeToString(period.start)));
                                arrayList10.add(UItem.asButton(i23 + 1, LocaleController.getString(R.string.BusinessHoursDayCloseHour), OpeningHoursActivity.Period.timeToString(period.end)));
                                arrayList10.add(UItem.asButton(i23 + 2, LocaleController.getString(R.string.Remove)).red());
                            }
                            i22++;
                        }
                    }
                }
                break;
            case 10:
                ((TimezoneSelector) obj3).fillItems$6((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 11:
                PaintView.AnonymousClass26 anonymousClass26 = (PaintView.AnonymousClass26) obj3;
                anonymousClass26.videoWidth = ((Integer) obj).intValue();
                anonymousClass26.videoHeight = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new ChatbotSheet$$ExternalSyntheticLambda0(anonymousClass26, 22), 60L);
                break;
            case 12:
                ArrayList arrayList12 = (ArrayList) obj;
                CountrySelectBottomSheet countrySelectBottomSheet = (CountrySelectBottomSheet) obj3;
                ArrayList arrayList13 = countrySelectBottomSheet.countriesLetters;
                if (arrayList13 != null && !arrayList13.isEmpty()) {
                    int iDp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
                    int iDp2 = AndroidUtilities.dp(88.0f) + countrySelectBottomSheet.selectedCountriesHeight;
                    arrayList12.add(UItem.asSpace(0, iDp2));
                    int iDp3 = iDp - iDp2;
                    int size4 = arrayList13.size();
                    int i24 = 0;
                    while (i24 < size4) {
                        Object obj7 = arrayList13.get(i24);
                        i24++;
                        for (TLRPC.TL_help_country tL_help_country : (List) countrySelectBottomSheet.countriesMap.get((String) obj7)) {
                            if (TextUtils.isEmpty(countrySelectBottomSheet.query) || SelectorBottomSheet.matchLocal(tL_help_country, AndroidUtilities.translitSafe(countrySelectBottomSheet.query).toLowerCase())) {
                                iDp3 -= AndroidUtilities.dp(44.0f);
                                boolean zContainsKey = countrySelectBottomSheet.selectedCountries.containsKey(tL_help_country.iso2);
                                int i25 = CountrySelectBottomSheet.Factory.$r8$clinit;
                                UItem uItemOfFactory2 = UItem.ofFactory(CountrySelectBottomSheet.Factory.class);
                                uItemOfFactory2.text = tL_help_country.iso2;
                                uItemOfFactory2.object = tL_help_country;
                                uItemOfFactory2.checked = zContainsKey;
                                arrayList12.add(uItemOfFactory2);
                            }
                        }
                    }
                    arrayList12.add(UItem.asSpace(1, Math.max(0, iDp3)));
                    break;
                }
                break;
            case 13:
                ArrayList arrayList14 = (ArrayList) obj;
                StatisticActivity.ChartViewData chartViewData = ((PollStatisticsBottomSheet) obj3).chartViewData;
                if (chartViewData != null) {
                    arrayList14.add(UItem.asSpace(AndroidUtilities.dp(12.0f)));
                    arrayList14.add(UItem.asChart(0, 0, chartViewData));
                }
                break;
            case 14:
                ((OAuthSheet$$ExternalSyntheticLambda1) obj3).run((TL_stats.TL_statsPollStats) obj);
                break;
            case 15:
                ArrayList arrayList15 = (ArrayList) obj;
                AcquiredGiftsSheet acquiredGiftsSheet = (AcquiredGiftsSheet) obj3;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = acquiredGiftsSheet.gifts;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        AlertDialog$$ExternalSyntheticLambda5 alertDialog$$ExternalSyntheticLambda5 = new AlertDialog$$ExternalSyntheticLambda5(28, acquiredGiftsSheet, tL_StarGiftAuctionAcquiredGift);
                        int i26 = AcquiredGiftsSheet.AcquiredGiftsCell.Factory.$r8$clinit;
                        UItem uItemOfFactory3 = UItem.ofFactory(AcquiredGiftsSheet.AcquiredGiftsCell.Factory.class);
                        uItemOfFactory3.object = tL_StarGiftAuctionAcquiredGift;
                        uItemOfFactory3.object2 = acquiredGiftsSheet.auction;
                        uItemOfFactory3.clickCallback = alertDialog$$ExternalSyntheticLambda5;
                        arrayList15.add(uItemOfFactory3);
                    }
                    arrayList15.add(UItem.asSpace(AndroidUtilities.dp(16.0f)));
                    break;
                }
                break;
            case 16:
                ((ArrayList) obj).add(((ActiveAuctionsSheet) obj3).headerItem);
                break;
            case 17:
                ArrayList arrayList16 = (ArrayList) obj;
                arrayList16.add(((AuctionBidSheet) obj3).headerItem);
                arrayList16.add(UItem.asSpace(AndroidUtilities.dp(16.0f)));
                break;
            case 18:
                ((ArrayList) obj).add(UItem.asCustom(-1, ((AuctionJoinSheet) obj3).linearLayout));
                break;
            case 19:
                ((ArrayList) obj).add(UItem.asCustom(-1, ((AuctionWearingSheet) obj3).linearLayout));
                break;
            case 20:
                run$org$telegram$ui$Gifts$ProfileGiftsContainer$Page$$ExternalSyntheticLambda1(obj, obj2);
                break;
            case 21:
                ArrayList arrayList17 = (ArrayList) obj;
                ProfileGiftsContainer.SelectGiftsBottomSheet selectGiftsBottomSheet = (ProfileGiftsContainer.SelectGiftsBottomSheet) obj3;
                StarsController.GiftsList giftsList2 = selectGiftsBottomSheet.list;
                if (giftsList2 != null) {
                    arrayList17.add(UItem.asSpace(AndroidUtilities.dp(16.0f)));
                    boolean z7 = giftsList2.loading;
                    ArrayList arrayList18 = giftsList2.gifts;
                    if (z7 && arrayList18.isEmpty()) {
                        zzlb.m(1, 34, arrayList17);
                        zzlb.m(2, 34, arrayList17);
                        zzlb.m(3, 34, arrayList17);
                        zzlb.m(4, 34, arrayList17);
                        zzlb.m(5, 34, arrayList17);
                        zzlb.m(6, 34, arrayList17);
                        zzlb.m(7, 34, arrayList17);
                        zzlb.m(8, 34, arrayList17);
                        zzlb.m(9, 34, arrayList17);
                    } else {
                        int size5 = arrayList18.size();
                        int i27 = 0;
                        int i28 = 3;
                        while (i27 < size5) {
                            Object obj8 = arrayList18.get(i27);
                            i27++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj8;
                            if (!savedStarGift.collection_id.contains(Integer.valueOf(selectGiftsBottomSheet.collectionId))) {
                                int i29 = GiftSheet.GiftCell.Factory.$r8$clinit;
                                UItem spanCount2 = UItem.ofFactory(GiftSheet.GiftCell.Factory.class).setSpanCount(1);
                                spanCount2.intValue = 0;
                                spanCount2.object = savedStarGift;
                                spanCount2.accent = true;
                                spanCount2.collapsed = true;
                                spanCount2.red = false;
                                HashSet hashSet = selectGiftsBottomSheet.selectedGiftIds;
                                int i30 = savedStarGift.msg_id;
                                StarsController.GiftsList giftsList3 = giftsList2;
                                arrayList17.add(spanCount2.setChecked(hashSet.contains(Long.valueOf(i30 == 0 ? savedStarGift.saved_id : i30))).setSpanCount(1));
                                i28--;
                                giftsList2 = giftsList3;
                                if (i28 == 0) {
                                    i28 = 3;
                                }
                            }
                        }
                        StarsController.GiftsList giftsList4 = giftsList2;
                        if (giftsList4.loading || !giftsList4.endReached) {
                            int i31 = 0;
                            while (true) {
                                if (i31 < (i28 <= 0 ? 3 : i28)) {
                                    i31++;
                                    zzlb.m(i31, 34, arrayList17);
                                }
                            }
                        }
                    }
                    arrayList17.add(UItem.asSpace(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 22:
                run$org$telegram$ui$Gifts$ResaleGiftsFragment$$ExternalSyntheticLambda3(obj, obj2);
                break;
            case 23:
                ((ResaleGiftsFragment.SelectGiftSheet) obj3).fillItems$21((ArrayList) obj);
                break;
            case 24:
                ((BotStarsActivity) obj3).fillItems$8((ArrayList) obj);
                break;
            case 25:
                run$org$telegram$ui$Stars$ExplainStarsSheet$$ExternalSyntheticLambda1(obj, obj2);
                break;
            case 26:
                ArrayList arrayList19 = (ArrayList) obj;
                UItem uItem = ((GiftOfferSheet) obj3).mainItem;
                if (uItem != null) {
                    arrayList19.add(uItem);
                }
                break;
            case 27:
                run$org$telegram$ui$Stars$StarGiftPreviewSheet$$ExternalSyntheticLambda10(obj, obj2);
                break;
            case 28:
                run$org$telegram$ui$Stars$StarsController$$ExternalSyntheticLambda138(obj, obj2);
                break;
            default:
                ((StarsIntroActivity) obj3).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
        }
    }
}
