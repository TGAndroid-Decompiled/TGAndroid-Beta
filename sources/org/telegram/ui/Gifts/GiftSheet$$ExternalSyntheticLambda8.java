package org.telegram.ui.Gifts;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSlider;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MessagesSearchAdapter;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda263;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda264;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.GuardBotReplaceSheet;
import org.telegram.ui.Components.HashtagHistoryView;
import org.telegram.ui.Components.HashtagsSearchAdapter;
import org.telegram.ui.Components.HintView$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.PasscodeView$9$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.PostsSearchContainer;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet;
import org.telegram.ui.Components.poll.sheets.PollStatisticsBottomSheet;
import org.telegram.ui.ContactAddActivity;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.CreateGroupCallSheet;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.EnableTopicsActivity;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda6;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda54;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.PaintView;

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
        SharedMediaLayout.AnonymousClass13 anonymousClass13 = page.parent;
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
                    UItem uItemOfFactory = UItem.ofFactory(GiftSheet.GiftCell.Factory.class);
                    uItemOfFactory.spanCount = 1;
                    uItemOfFactory.intValue = 0;
                    uItemOfFactory.object = savedStarGift;
                    uItemOfFactory.accent = true;
                    uItemOfFactory.collapsed = false;
                    uItemOfFactory.red = z;
                    uItemOfFactory.reordering = page.reordering && (page.list != anonymousClass13.list || savedStarGift.pinned_to_top);
                    arrayList.add(uItemOfFactory);
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
                    UItem uItemAsFlicker = UItem.asFlicker(i5, 34);
                    uItemAsFlicker.spanCount = 1;
                    arrayList.add(uItemAsFlicker);
                }
            }
        }
        if (anonymousClass13.list == page.list) {
            int iDp = AndroidUtilities.dp(20.0f);
            UItem uItem = new UItem(28);
            uItem.intValue = iDp;
            arrayList.add(uItem);
            if (anonymousClass13.dialogId == UserConfig.getInstance(page.currentAccount).getClientUserId()) {
                int color = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, page.resourcesProvider);
                String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                int iDp2 = AndroidUtilities.dp(24.0f);
                int i6 = ProfileGiftsContainer.TextFactory.$r8$clinit;
                UItem uItemOfFactory2 = UItem.ofFactory(ProfileGiftsContainer.TextFactory.class);
                uItemOfFactory2.text = string;
                uItemOfFactory2.intValue = 17;
                uItemOfFactory2.longValue = color;
                uItemOfFactory2.floatValue = 14.0f;
                uItemOfFactory2.pad = iDp2;
                uItemOfFactory2.iconResId = 0;
                uItemOfFactory2.accent = false;
                arrayList.add(uItemOfFactory2);
            }
            int iDp3 = AndroidUtilities.dp(82.0f);
            UItem uItem2 = new UItem(28);
            uItem2.intValue = iDp3;
            arrayList.add(uItem2);
        } else if (!arrayList.isEmpty()) {
            int iDp4 = AndroidUtilities.dp(82.0f);
            UItem uItem3 = new UItem(28);
            uItem3.intValue = iDp4;
            arrayList.add(uItem3);
        }
        if (!arrayList.isEmpty()) {
            int iDp5 = AndroidUtilities.dp(page.hasTabs ? 42.0f : 12.0f);
            UItem uItem4 = new UItem(28);
            uItem4.intValue = iDp5;
            arrayList.add(0, uItem4);
        }
        if (page.listView.getSpanCount() != iMax) {
            AndroidUtilities.runOnUIThread(new ProfileGiftsContainer$$ExternalSyntheticLambda7(page, iMax, 1));
        }
        anonymousClass13.updateTabsY();
        anonymousClass13.post(new IntroActivity$$ExternalSyntheticLambda6(anonymousClass13, 2));
    }

    private final void run$org$telegram$ui$Gifts$ProfileGiftsContainer$SelectGiftsBottomSheet$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        int i;
        ArrayList arrayList = (ArrayList) obj;
        ProfileGiftsContainer.SelectGiftsBottomSheet selectGiftsBottomSheet = (ProfileGiftsContainer.SelectGiftsBottomSheet) this.f$0;
        StarsController.GiftsList giftsList = selectGiftsBottomSheet.list;
        if (giftsList == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(16.0f);
        UItem uItem = new UItem(28);
        uItem.intValue = iDp;
        arrayList.add(uItem);
        boolean z = giftsList.loading;
        ArrayList arrayList2 = giftsList.gifts;
        if (!z || !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            boolean z2 = false;
            int i2 = 0;
            loop0: while (true) {
                i = 3;
                while (true) {
                    if (i2 >= size) {
                        break loop0;
                    }
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                    if (!savedStarGift.collection_id.contains(Integer.valueOf(selectGiftsBottomSheet.collectionId))) {
                        int i3 = GiftSheet.GiftCell.Factory.$r8$clinit;
                        UItem uItemOfFactory = UItem.ofFactory(GiftSheet.GiftCell.Factory.class);
                        uItemOfFactory.spanCount = 1;
                        uItemOfFactory.intValue = z2 ? 1 : 0;
                        uItemOfFactory.object = savedStarGift;
                        uItemOfFactory.accent = true;
                        uItemOfFactory.collapsed = true;
                        uItemOfFactory.red = z2;
                        HashSet hashSet = selectGiftsBottomSheet.selectedGiftIds;
                        int i4 = savedStarGift.msg_id;
                        uItemOfFactory.setChecked(hashSet.contains(Long.valueOf(i4 == 0 ? savedStarGift.saved_id : i4)));
                        uItemOfFactory.spanCount = 1;
                        arrayList.add(uItemOfFactory);
                        i--;
                        i2 = i2;
                        z2 = false;
                        z2 = false;
                        if (i == 0) {
                            break;
                        }
                    }
                }
            }
            if (giftsList.loading || !giftsList.endReached) {
                int i5 = 0;
                while (true) {
                    if (i5 >= (i <= 0 ? 3 : i)) {
                        break;
                    }
                    i5++;
                    UItem uItemAsFlicker = UItem.asFlicker(i5, 34);
                    uItemAsFlicker.spanCount = 1;
                    arrayList.add(uItemAsFlicker);
                }
            }
        } else {
            UItem uItemAsFlicker2 = UItem.asFlicker(1, 34);
            uItemAsFlicker2.spanCount = 1;
            arrayList.add(uItemAsFlicker2);
            UItem uItemAsFlicker3 = UItem.asFlicker(2, 34);
            uItemAsFlicker3.spanCount = 1;
            arrayList.add(uItemAsFlicker3);
            UItem uItemAsFlicker4 = UItem.asFlicker(3, 34);
            uItemAsFlicker4.spanCount = 1;
            arrayList.add(uItemAsFlicker4);
            UItem uItemAsFlicker5 = UItem.asFlicker(4, 34);
            uItemAsFlicker5.spanCount = 1;
            arrayList.add(uItemAsFlicker5);
            UItem uItemAsFlicker6 = UItem.asFlicker(5, 34);
            uItemAsFlicker6.spanCount = 1;
            arrayList.add(uItemAsFlicker6);
            UItem uItemAsFlicker7 = UItem.asFlicker(6, 34);
            uItemAsFlicker7.spanCount = 1;
            arrayList.add(uItemAsFlicker7);
            UItem uItemAsFlicker8 = UItem.asFlicker(7, 34);
            uItemAsFlicker8.spanCount = 1;
            arrayList.add(uItemAsFlicker8);
            UItem uItemAsFlicker9 = UItem.asFlicker(8, 34);
            uItemAsFlicker9.spanCount = 1;
            arrayList.add(uItemAsFlicker9);
            UItem uItemAsFlicker10 = UItem.asFlicker(9, 34);
            uItemAsFlicker10.spanCount = 1;
            arrayList.add(uItemAsFlicker10);
        }
        int iDp2 = AndroidUtilities.dp(68.0f);
        UItem uItem2 = new UItem(28);
        uItem2.intValue = iDp2;
        arrayList.add(uItem2);
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
        StoriesController.SearchStoriesList searchStoriesList;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int i = 6;
        final int i2 = 0;
        Object obj3 = this.f$0;
        final int i3 = 1;
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
                        UItem uItemAsFlicker = UItem.asFlicker(1, 34);
                        uItemAsFlicker.spanCount = 1;
                        arrayList.add(uItemAsFlicker);
                        UItem uItemAsFlicker2 = UItem.asFlicker(2, 34);
                        uItemAsFlicker2.spanCount = 1;
                        arrayList.add(uItemAsFlicker2);
                        UItem uItemAsFlicker3 = UItem.asFlicker(3, 34);
                        uItemAsFlicker3.spanCount = 1;
                        arrayList.add(uItemAsFlicker3);
                    } else {
                        int size = arrayList2.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj4 = arrayList2.get(i4);
                            i4++;
                            GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = (GiftPremiumBottomSheet$GiftTier) obj4;
                            int i5 = GiftSheet.GiftCell.Factory.$r8$clinit;
                            UItem uItemOfFactory = UItem.ofFactory(GiftSheet.GiftCell.Factory.class);
                            uItemOfFactory.spanCount = 1;
                            uItemOfFactory.object = giftPremiumBottomSheet$GiftTier;
                            arrayList.add(uItemOfFactory);
                        }
                    }
                    z = true;
                }
                int i6 = giftSheet.currentAccount;
                StarsController starsController = StarsController.getInstance(i6, false);
                ArrayList arrayList3 = giftSheet.birthday ? starsController.birthdaySortedGifts : starsController.sortedGifts;
                if (giftSheet.userSettings != null) {
                    arrayList3 = (ArrayList) Collection.EL.stream(arrayList3).filter(new ChatActivity$$ExternalSyntheticLambda263(giftSheet, 3)).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda264()));
                }
                if (j < 0) {
                    arrayList3 = (ArrayList) Collection.EL.stream(arrayList3).filter(new GiftSheet$$ExternalSyntheticLambda20(i2)).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda264()));
                }
                long clientUserId = UserConfig.getInstance(i6).getClientUserId();
                StarsController.GiftsList giftsList = giftSheet.myGifts;
                if (j == clientUserId || giftsList == null) {
                    z2 = false;
                } else {
                    ArrayList arrayList4 = giftsList.gifts;
                    int size2 = arrayList4.size();
                    while (true) {
                        if (i2 < size2) {
                            Object obj5 = arrayList4.get(i2);
                            i2 += i3;
                            if (((TL_stars.SavedStarGift) obj5).gift instanceof TL_stars.TL_starGiftUnique) {
                                z2 = true;
                            } else {
                                i3 = 1;
                            }
                        } else {
                            z2 = false;
                        }
                    }
                }
                if (!MessagesController.getInstance(i6).stargiftsBlocked && (!arrayList3.isEmpty() || ((disallowedGiftsSettings3 = giftSheet.userSettings) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && giftsList != null && !giftsList.gifts.isEmpty()))) {
                    if (z) {
                        int iDp = AndroidUtilities.dp(16.0f);
                        UItem uItem = new UItem(28);
                        uItem.intValue = iDp;
                        arrayList.add(uItem);
                    } else {
                        arrayList.add(UItem.asCustom(anonymousClass1));
                    }
                    arrayList.add(UItem.asCustom(giftSheet.starsHeaderView));
                    TreeSet treeSet = new TreeSet();
                    TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = giftSheet.userSettings;
                    if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                            treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList3.get(i7)).stars));
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
                    int i8 = giftSheet.selectedTab;
                    GiftSheet$$ExternalSyntheticLambda7 giftSheet$$ExternalSyntheticLambda7 = new GiftSheet$$ExternalSyntheticLambda7(giftSheet, 1);
                    int i9 = GiftSheet.Tabs.Factory.$r8$clinit;
                    UItem uItemOfFactory2 = UItem.ofFactory(GiftSheet.Tabs.Factory.class);
                    uItemOfFactory2.id = 1;
                    uItemOfFactory2.object = arrayList5;
                    uItemOfFactory2.intValue = i8;
                    uItemOfFactory2.object2 = giftSheet$$ExternalSyntheticLambda7;
                    arrayList.add(uItemOfFactory2);
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
                        int i10 = 0;
                        while (i10 < size3) {
                            Object obj6 = arrayList6.get(i10);
                            i10++;
                            TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj6).gift;
                            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                                arrayList3.add(starGift2);
                            }
                        }
                    }
                    int i11 = 0;
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList3.get(i12);
                        int i13 = giftSheet.selectedTab;
                        if (i13 == giftSheet.TAB_ALL || i13 == giftSheet.TAB_MY_GIFTS || (i13 == giftSheet.TAB_COLLECTIBLES && (starGift3.availability_resale > 0 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                            if (starGift3.sold_out || starGift3.availability_resale <= 0 || i13 == giftSheet.TAB_COLLECTIBLES) {
                                starGift = starGift3;
                            } else {
                                UItem uItemAsStarGift = GiftSheet.GiftCell.Factory.asStarGift(i13, starGift3, i13 == giftSheet.TAB_MY_GIFTS, starGift3.limited && (disallowedGiftsSettings2 = giftSheet.userSettings) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                                starGift = starGift3;
                                arrayList.add(uItemAsStarGift);
                                i11++;
                            }
                            int i14 = giftSheet.selectedTab;
                            arrayList.add(GiftSheet.GiftCell.Factory.asStarGift(i14, starGift, i14 == giftSheet.TAB_MY_GIFTS, starGift.limited && (disallowedGiftsSettings = giftSheet.userSettings) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                            i11++;
                        }
                    }
                    int i15 = giftSheet.selectedTab;
                    int i16 = giftSheet.TAB_MY_GIFTS;
                    if (i15 == i16 && giftsList != null && !giftsList.endReached) {
                        giftsList.load();
                        UItem uItemAsFlicker4 = UItem.asFlicker(4, 34);
                        uItemAsFlicker4.spanCount = 1;
                        arrayList.add(uItemAsFlicker4);
                        UItem uItemAsFlicker5 = UItem.asFlicker(5, 34);
                        uItemAsFlicker5.spanCount = 1;
                        arrayList.add(uItemAsFlicker5);
                        UItem uItemAsFlicker6 = UItem.asFlicker(6, 34);
                        uItemAsFlicker6.spanCount = 1;
                        arrayList.add(uItemAsFlicker6);
                    } else if (i15 != i16 && starsController.giftsLoading) {
                        UItem uItemAsFlicker7 = UItem.asFlicker(4, 34);
                        uItemAsFlicker7.spanCount = 1;
                        arrayList.add(uItemAsFlicker7);
                        UItem uItemAsFlicker8 = UItem.asFlicker(5, 34);
                        uItemAsFlicker8.spanCount = 1;
                        arrayList.add(uItemAsFlicker8);
                        UItem uItemAsFlicker9 = UItem.asFlicker(6, 34);
                        uItemAsFlicker9.spanCount = 1;
                        arrayList.add(uItemAsFlicker9);
                    }
                    int iDp2 = AndroidUtilities.dp(i11 >= 9 ? 40.0f : 300.0f);
                    UItem uItem2 = new UItem(28);
                    uItem2.intValue = iDp2;
                    arrayList.add(uItem2);
                    break;
                } else {
                    TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = giftSheet.userSettings;
                    if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList3.isEmpty()) {
                        int iDp3 = AndroidUtilities.dp(300.0f);
                        UItem uItem3 = new UItem(28);
                        uItem3.intValue = iDp3;
                        arrayList.add(uItem3);
                        break;
                    }
                }
                break;
            case 1:
                FragmentContextView fragmentContextView = (FragmentContextView) obj3;
                fragmentContextView.getClass();
                fragmentContextView.slidingSpeed = !((Boolean) obj2).booleanValue();
                MediaController mediaController = MediaController.getInstance();
                boolean z5 = fragmentContextView.isMusic;
                ActionBarMenuSlider.SpeedSlider speedSlider = fragmentContextView.speedSlider;
                float fFloatValue = ((Float) obj).floatValue();
                speedSlider.getClass();
                mediaController.setPlaybackSpeed(z5, (fFloatValue * 2.8f) + 0.2f);
                break;
            case 2:
                ((ArrayList) obj).add(UItem.asCustom(-1, ((GuardBotReplaceSheet) obj3).contentLayout));
                break;
            case 3:
                ArrayList arrayList7 = (ArrayList) obj;
                HashtagHistoryView hashtagHistoryView = (HashtagHistoryView) obj3;
                hashtagHistoryView.getClass();
                ArrayList arrayList8 = new ArrayList(0);
                hashtagHistoryView.history = arrayList8;
                arrayList8.addAll(HashtagSearchController.getInstance(hashtagHistoryView.currentAccount).history);
                if (!hashtagHistoryView.history.isEmpty()) {
                    for (int i17 = 0; i17 < hashtagHistoryView.history.size(); i17++) {
                        String str = (String) hashtagHistoryView.history.get(i17);
                        if (str.startsWith("#") || str.startsWith("$")) {
                            arrayList7.add(UItem.asButton(i17 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
                        }
                    }
                    arrayList7.add(UItem.asButton(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
                    break;
                }
                break;
            case 4:
                ArrayList arrayList9 = (ArrayList) obj;
                HashtagsSearchAdapter hashtagsSearchAdapter = (HashtagsSearchAdapter) obj3;
                boolean z6 = hashtagsSearchAdapter.hasList && (searchStoriesList = hashtagsSearchAdapter.list) != null && searchStoriesList.messageObjects.size() > 0;
                if (z6) {
                    StoriesController.SearchStoriesList searchStoriesList2 = hashtagsSearchAdapter.list;
                    int i18 = MessagesSearchAdapter.StoriesView.Factory.$r8$clinit;
                    UItem uItemOfFactory3 = UItem.ofFactory(MessagesSearchAdapter.StoriesView.Factory.class);
                    uItemOfFactory3.object = searchStoriesList2;
                    arrayList9.add(uItemOfFactory3);
                }
                hashtagsSearchAdapter.hadStories = z6;
                while (true) {
                    ArrayList arrayList10 = hashtagsSearchAdapter.messages;
                    if (i2 >= arrayList10.size()) {
                        if (hashtagsSearchAdapter.loading || !hashtagsSearchAdapter.endReached) {
                            arrayList9.add(UItem.asFlicker(-2, 1));
                            arrayList9.add(UItem.asFlicker(-3, 1));
                            arrayList9.add(UItem.asFlicker(-4, 1));
                        }
                        if (!hashtagsSearchAdapter.hadStories && z6) {
                            AndroidUtilities.runOnUIThread(new HintView$1$$ExternalSyntheticLambda0(hashtagsSearchAdapter, 13));
                            break;
                        }
                    } else {
                        int i19 = i2 + 1;
                        MessageObject messageObject = (MessageObject) arrayList10.get(i2);
                        UItem uItem4 = new UItem(33);
                        uItem4.id = i19;
                        uItem4.object = messageObject;
                        arrayList9.add(uItem4);
                        i2 = i19;
                    }
                }
                break;
            case 5:
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                ItemOptions.DimView dimView = (ItemOptions.DimView) obj3;
                ItemOptions itemOptions = ItemOptions.this;
                itemOptions.scrimView.setAlpha(1.0f);
                if (itemOptions.blur) {
                    dimView.blurBitmap = bitmap;
                }
                BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = itemOptions.scrimBlur3SourceBitmap;
                if (blurredBackgroundSourceBitmap != null) {
                    blurredBackgroundSourceBitmap.setBitmap(bitmap2);
                    Blur3Utils.checkBitmapSourceMatrixScale(itemOptions.scrimBlur3SourceBitmap, dimView);
                    ViewGroup viewGroup = itemOptions.layout;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                    }
                }
                break;
            case 6:
                PaintView.AnonymousClass26 anonymousClass26 = (PaintView.AnonymousClass26) obj3;
                anonymousClass26.videoWidth = ((Integer) obj).intValue();
                anonymousClass26.videoHeight = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new PasscodeView$9$$ExternalSyntheticLambda0(anonymousClass26, i3), 60L);
                break;
            case 7:
                ArrayList arrayList11 = (ArrayList) obj;
                PostsSearchContainer postsSearchContainer = (PostsSearchContainer) obj3;
                if (postsSearchContainer.flood == null) {
                    arrayList11.add(UItem.asFlicker(-1, 7));
                    arrayList11.add(UItem.asFlicker(-2, 7));
                    arrayList11.add(UItem.asFlicker(-3, 7));
                    postsSearchContainer.isEmpty = false;
                } else {
                    boolean zIsEmpty = TextUtils.isEmpty(postsSearchContainer.lastQuery);
                    ArrayList arrayList12 = postsSearchContainer.messages;
                    if (zIsEmpty) {
                        ArrayList arrayList13 = postsSearchContainer.newsMessages;
                        if (!arrayList13.isEmpty()) {
                            String string = LocaleController.getString(R.string.SearchPostsHeaderNews);
                            UItem uItem5 = new UItem(31);
                            uItem5.text = string;
                            arrayList11.add(uItem5);
                        }
                        int size4 = arrayList13.size();
                        while (i2 < size4) {
                            Object obj7 = arrayList13.get(i2);
                            i2++;
                            UItem uItem6 = new UItem(33);
                            uItem6.object = (MessageObject) obj7;
                            arrayList11.add(uItem6);
                        }
                    } else {
                        if (!arrayList12.isEmpty()) {
                            String string2 = LocaleController.getString(R.string.SearchPostsHeaderFound);
                            UItem uItem7 = new UItem(31);
                            uItem7.text = string2;
                            arrayList11.add(uItem7);
                        }
                        int size5 = arrayList12.size();
                        while (i2 < size5) {
                            Object obj8 = arrayList12.get(i2);
                            i2++;
                            UItem uItem8 = new UItem(33);
                            uItem8.object = (MessageObject) obj8;
                            arrayList11.add(uItem8);
                        }
                    }
                    if (postsSearchContainer.loading || ((postsSearchContainer.floodLoading && !postsSearchContainer.wasEmptyOnFloodLoad) || (!zIsEmpty && !arrayList12.isEmpty() && !postsSearchContainer.endReached))) {
                        arrayList11.add(UItem.asFlicker(postsSearchContainer.queryid * 3, 7));
                        arrayList11.add(UItem.asFlicker((postsSearchContainer.queryid * 3) + 1, 7));
                        arrayList11.add(UItem.asFlicker((postsSearchContainer.queryid * 3) + 2, 7));
                    }
                    postsSearchContainer.isEmpty = arrayList11.isEmpty();
                }
                break;
            case 8:
                ScrimOptions scrimOptions = (ScrimOptions) obj3;
                scrimOptions.blurBitmap = (Bitmap) obj;
                Paint paint = new Paint(1);
                scrimOptions.blurBitmapPaint = paint;
                Bitmap bitmap3 = scrimOptions.blurBitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                scrimOptions.blurBitmapShader = bitmapShader;
                paint.setShader(bitmapShader);
                scrimOptions.blurMatrix = new Matrix();
                BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap2 = scrimOptions.iBlur3SourceBitmap;
                blurredBackgroundSourceBitmap2.setBitmap((Bitmap) obj2);
                Blur3Utils.checkBitmapSourceMatrixScale(blurredBackgroundSourceBitmap2, scrimOptions.windowView);
                ViewGroup viewGroup2 = scrimOptions.optionsView;
                if (viewGroup2 != null) {
                    viewGroup2.invalidate();
                }
                break;
            case 9:
                CharSequence charSequence = (CharSequence) obj;
                StickersAlert stickersAlert = (StickersAlert) obj3;
                stickersAlert.titleTextView.setText(charSequence);
                TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
                tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(stickersAlert.stickerSet.set);
                tL_stickers_renameStickerSet.title = charSequence.toString();
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new StarsController$$ExternalSyntheticLambda54(i3, (Utilities.Callback) obj2));
                break;
            case 10:
                ((TranslateAlert2) obj3).lambda$translateAlt$6((String) obj, (Boolean) obj2);
                break;
            case 11:
                ((UniversalFragment) obj3).fillItems$1((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 12:
                ArrayList arrayList14 = (ArrayList) obj;
                CountrySelectBottomSheet countrySelectBottomSheet = (CountrySelectBottomSheet) obj3;
                ArrayList arrayList15 = countrySelectBottomSheet.countriesLetters;
                if (arrayList15 != null && !arrayList15.isEmpty()) {
                    int iDp4 = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
                    int iDp5 = AndroidUtilities.dp(88.0f) + countrySelectBottomSheet.selectedCountriesHeight;
                    arrayList14.add(UItem.asSpace(0, iDp5));
                    int iDp6 = iDp4 - iDp5;
                    int size6 = arrayList15.size();
                    int i20 = 0;
                    while (i20 < size6) {
                        Object obj9 = arrayList15.get(i20);
                        i20++;
                        for (TLRPC.TL_help_country tL_help_country : (List) countrySelectBottomSheet.countriesMap.get((String) obj9)) {
                            if (TextUtils.isEmpty(countrySelectBottomSheet.query) || SelectorBottomSheet.matchLocal(tL_help_country, AndroidUtilities.translitSafe(countrySelectBottomSheet.query).toLowerCase())) {
                                iDp6 -= AndroidUtilities.dp(44.0f);
                                boolean zContainsKey = countrySelectBottomSheet.selectedCountries.containsKey(tL_help_country.iso2);
                                int i21 = CountrySelectBottomSheet.Factory.$r8$clinit;
                                UItem uItemOfFactory4 = UItem.ofFactory(CountrySelectBottomSheet.Factory.class);
                                uItemOfFactory4.text = tL_help_country.iso2;
                                uItemOfFactory4.object = tL_help_country;
                                uItemOfFactory4.checked = zContainsKey;
                                arrayList14.add(uItemOfFactory4);
                            }
                        }
                    }
                    arrayList14.add(UItem.asSpace(1, Math.max(0, iDp6)));
                    break;
                }
                break;
            case 13:
                ArrayList arrayList16 = (ArrayList) obj;
                StatisticActivity.ChartViewData chartViewData = ((PollStatisticsBottomSheet) obj3).chartViewData;
                if (chartViewData != null) {
                    int iDp7 = AndroidUtilities.dp(12.0f);
                    UItem uItem9 = new UItem(28);
                    uItem9.intValue = iDp7;
                    arrayList16.add(uItem9);
                    arrayList16.add(UItem.asChart(0, 0, chartViewData));
                }
                break;
            case 14:
                ((ArticleViewer$$ExternalSyntheticLambda21) obj3).run((TL_stats.TL_statsPollStats) obj);
                break;
            case 15:
                ArrayList arrayList17 = (ArrayList) obj;
                ContactAddActivity contactAddActivity = (ContactAddActivity) obj3;
                TLRPC.User user = contactAddActivity.getMessagesController().getUser(Long.valueOf(contactAddActivity.user_id));
                arrayList17.add(UItem.asCustom(contactAddActivity.infoLayout));
                arrayList17.add(UItem.asCustom(contactAddActivity.firstNameField));
                arrayList17.add(UItem.asCustom(contactAddActivity.lastNameField));
                TLRPC.User user2 = contactAddActivity.getMessagesController().getUser(Long.valueOf(contactAddActivity.user_id));
                if (TextUtils.isEmpty((user2 == null || TextUtils.isEmpty(user2.phone)) ? contactAddActivity.phone : user2.phone)) {
                    SpannableStringBuilder spannableStringBuilderReplaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user));
                    UItem uItem10 = new UItem(7);
                    uItem10.text = spannableStringBuilderReplaceCharSequence;
                    arrayList17.add(uItem10);
                } else if (contactAddActivity.needAddException) {
                    SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)));
                    UItem uItem11 = new UItem(7);
                    uItem11.text = spannableStringBuilderReplaceTags;
                    arrayList17.add(uItem11);
                } else {
                    UItem uItem12 = new UItem(7);
                    uItem12.text = null;
                    arrayList17.add(uItem12);
                }
                if (contactAddActivity.addContact && contactAddActivity.needAddException) {
                    UItem uItemAsCheck = UItem.asCheck(2, LocaleController.getString(R.string.AddContactShareNumber));
                    uItemAsCheck.setChecked(contactAddActivity.checkShare);
                    arrayList17.add(uItemAsCheck);
                    String string3 = LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user));
                    UItem uItem13 = new UItem(7);
                    uItem13.text = string3;
                    arrayList17.add(uItem13);
                }
                arrayList17.add(UItem.asCustom(contactAddActivity.noteField));
                String string4 = LocaleController.getString(R.string.AddNotesInfo);
                UItem uItem14 = new UItem(7);
                uItem14.text = string4;
                arrayList17.add(uItem14);
                if (!contactAddActivity.addContact) {
                    TLRPC.UserFull userFull = contactAddActivity.getMessagesController().getUserFull(contactAddActivity.user_id);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList17.add(UItem.asCustom(contactAddActivity.suggestBirthday));
                    }
                    arrayList17.add(UItem.asCustom(contactAddActivity.suggestPhoto));
                    arrayList17.add(UItem.asCustom(contactAddActivity.setAvatarCell));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList17.add(UItem.asCustom(contactAddActivity.oldPhotoCell));
                    }
                    UItem uItem15 = new UItem(7);
                    uItem15.text = null;
                    arrayList17.add(uItem15);
                    UItem uItemAsButton = UItem.asButton(1, LocaleController.getString(R.string.DeleteContact));
                    uItemAsButton.red = true;
                    arrayList17.add(uItemAsButton);
                }
                UItem uItem16 = new UItem(7);
                uItem16.text = null;
                arrayList17.add(uItem16);
                if (contactAddActivity.firstSet) {
                    AndroidUtilities.runOnUIThread(new ContactAddActivity$$ExternalSyntheticLambda13(contactAddActivity, user, i3));
                    contactAddActivity.firstSet = false;
                    AndroidUtilities.runOnUIThread(new ContactAddActivity$$ExternalSyntheticLambda1(contactAddActivity, i3), 200L);
                }
                break;
            case 16:
                Bitmap bitmap4 = (Bitmap) obj;
                Bitmap bitmap5 = (Bitmap) obj2;
                ContentPreviewViewer contentPreviewViewer = (ContentPreviewViewer) obj3;
                contentPreviewViewer.centerImage.setVisible(true, false);
                contentPreviewViewer.blurrBitmap = bitmap4;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                Matrix matrix = new Matrix();
                matrix.setScale(15.0f, 15.0f);
                bitmapShader2.setLocalMatrix(matrix);
                if (Build.VERSION.SDK_INT >= 33) {
                    bitmapShader2.setFilterMode(2);
                }
                Paint paint2 = contentPreviewViewer.paint;
                paint2.setFilterBitmap(true);
                paint2.setShader(bitmapShader2);
                BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap3 = contentPreviewViewer.scrimBlur3SourceBitmap;
                blurredBackgroundSourceBitmap3.setBitmap(bitmap5);
                Blur3Utils.checkBitmapSourceMatrixScale(blurredBackgroundSourceBitmap3, contentPreviewViewer.windowView);
                contentPreviewViewer.scrimBlur3Factory.invalidateAllLinkedViews();
                contentPreviewViewer.preparingBitmap = false;
                IntroActivity.AnonymousClass1 anonymousClass2 = contentPreviewViewer.containerView;
                if (anonymousClass2 != null) {
                    anonymousClass2.invalidate();
                }
                break;
            case 17:
                CharSequence charSequence2 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                ContentPreviewViewer.AnonymousClass1 anonymousClass3 = (ContentPreviewViewer.AnonymousClass1) obj3;
                ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.this;
                ContentPreviewViewer.ContentPreviewViewerDelegate contentPreviewViewerDelegate = contentPreviewViewer2.delegate;
                if (contentPreviewViewerDelegate != null) {
                    contentPreviewViewerDelegate.newStickerPackSelected(charSequence2, TextUtils.join("", contentPreviewViewer2.selectedEmojis), callback != null ? new OAuthSheet$$ExternalSyntheticLambda13(i, anonymousClass3, callback) : null);
                    if (callback == null) {
                        contentPreviewViewer2.dismissPopupWindow();
                    }
                }
                break;
            case 18:
                ((CreateGroupCallSheet) obj3).fillItems$32((ArrayList) obj);
                break;
            case 19:
                DialogsActivity dialogsActivity = (DialogsActivity) obj3;
                dialogsActivity.deviceSize = (Long) obj;
                dialogsActivity.updateDialogsHint();
                break;
            case 20:
                ((Runnable) obj3).run();
                break;
            case 21:
                ArrayList arrayList18 = (ArrayList) obj;
                final EnableTopicsActivity enableTopicsActivity = (EnableTopicsActivity) obj3;
                String string5 = LocaleController.getString(R.string.TopicsInfo);
                int i22 = R.raw.topics_top;
                UItem uItem17 = new UItem(2);
                uItem17.text = string5;
                uItem17.iconResId = i22;
                arrayList18.add(uItem17);
                UItem uItemAsCheck2 = UItem.asCheck(1, LocaleController.getString(R.string.TopicsEnable));
                uItemAsCheck2.setChecked(enableTopicsActivity.forum);
                arrayList18.add(uItemAsCheck2);
                if (enableTopicsActivity.forum) {
                    UItem uItem18 = new UItem(7);
                    uItem18.text = null;
                    arrayList18.add(uItem18);
                    String string6 = LocaleController.getString(R.string.TopicsLayout);
                    UItem uItem19 = new UItem(0);
                    uItem19.text = string6;
                    arrayList18.add(uItem19);
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i2) {
                                case 0:
                                    EnableTopicsActivity enableTopicsActivity2 = enableTopicsActivity;
                                    EnableTopicsActivity.TopicsLayoutSwitcher topicsLayoutSwitcher = (EnableTopicsActivity.TopicsLayoutSwitcher) view.getParent();
                                    enableTopicsActivity2.isTabs = true;
                                    topicsLayoutSwitcher.setChecked(true, true);
                                    OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18 = enableTopicsActivity2.onForumChanged;
                                    if (oAuthSheet$$ExternalSyntheticLambda18 != null) {
                                        oAuthSheet$$ExternalSyntheticLambda18.run(Boolean.valueOf(enableTopicsActivity2.forum), Boolean.valueOf(enableTopicsActivity2.isTabs));
                                    }
                                    if (enableTopicsActivity2.isTabs && enableTopicsActivity2.getParentLayout() != null) {
                                        for (BaseFragment baseFragment : ((ActionBarLayout) enableTopicsActivity2.getParentLayout()).getFragmentStack()) {
                                            if (baseFragment instanceof DialogsActivity) {
                                                DialogsActivity.AnonymousClass27 anonymousClass27 = ((DialogsActivity) baseFragment).rightSlidingDialogContainer;
                                                if (anonymousClass27.hasFragment()) {
                                                    anonymousClass27.finishPreview();
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    EnableTopicsActivity enableTopicsActivity3 = enableTopicsActivity;
                                    EnableTopicsActivity.TopicsLayoutSwitcher topicsLayoutSwitcher2 = (EnableTopicsActivity.TopicsLayoutSwitcher) view.getParent();
                                    enableTopicsActivity3.isTabs = false;
                                    topicsLayoutSwitcher2.setChecked(false, true);
                                    OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda19 = enableTopicsActivity3.onForumChanged;
                                    if (oAuthSheet$$ExternalSyntheticLambda19 != null) {
                                        oAuthSheet$$ExternalSyntheticLambda19.run(Boolean.valueOf(enableTopicsActivity3.forum), Boolean.valueOf(enableTopicsActivity3.isTabs));
                                    }
                                    if (enableTopicsActivity3.isTabs && enableTopicsActivity3.getParentLayout() != null) {
                                        for (BaseFragment baseFragment2 : ((ActionBarLayout) enableTopicsActivity3.getParentLayout()).getFragmentStack()) {
                                            if (baseFragment2 instanceof DialogsActivity) {
                                                DialogsActivity.AnonymousClass27 anonymousClass28 = ((DialogsActivity) baseFragment2).rightSlidingDialogContainer;
                                                if (anonymousClass28.hasFragment()) {
                                                    anonymousClass28.finishPreview();
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i3) {
                                case 0:
                                    EnableTopicsActivity enableTopicsActivity2 = enableTopicsActivity;
                                    EnableTopicsActivity.TopicsLayoutSwitcher topicsLayoutSwitcher = (EnableTopicsActivity.TopicsLayoutSwitcher) view.getParent();
                                    enableTopicsActivity2.isTabs = true;
                                    topicsLayoutSwitcher.setChecked(true, true);
                                    OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18 = enableTopicsActivity2.onForumChanged;
                                    if (oAuthSheet$$ExternalSyntheticLambda18 != null) {
                                        oAuthSheet$$ExternalSyntheticLambda18.run(Boolean.valueOf(enableTopicsActivity2.forum), Boolean.valueOf(enableTopicsActivity2.isTabs));
                                    }
                                    if (enableTopicsActivity2.isTabs && enableTopicsActivity2.getParentLayout() != null) {
                                        for (BaseFragment baseFragment : ((ActionBarLayout) enableTopicsActivity2.getParentLayout()).getFragmentStack()) {
                                            if (baseFragment instanceof DialogsActivity) {
                                                DialogsActivity.AnonymousClass27 anonymousClass27 = ((DialogsActivity) baseFragment).rightSlidingDialogContainer;
                                                if (anonymousClass27.hasFragment()) {
                                                    anonymousClass27.finishPreview();
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    EnableTopicsActivity enableTopicsActivity3 = enableTopicsActivity;
                                    EnableTopicsActivity.TopicsLayoutSwitcher topicsLayoutSwitcher2 = (EnableTopicsActivity.TopicsLayoutSwitcher) view.getParent();
                                    enableTopicsActivity3.isTabs = false;
                                    topicsLayoutSwitcher2.setChecked(false, true);
                                    OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda19 = enableTopicsActivity3.onForumChanged;
                                    if (oAuthSheet$$ExternalSyntheticLambda19 != null) {
                                        oAuthSheet$$ExternalSyntheticLambda19.run(Boolean.valueOf(enableTopicsActivity3.forum), Boolean.valueOf(enableTopicsActivity3.isTabs));
                                    }
                                    if (enableTopicsActivity3.isTabs && enableTopicsActivity3.getParentLayout() != null) {
                                        for (BaseFragment baseFragment2 : ((ActionBarLayout) enableTopicsActivity3.getParentLayout()).getFragmentStack()) {
                                            if (baseFragment2 instanceof DialogsActivity) {
                                                DialogsActivity.AnonymousClass27 anonymousClass28 = ((DialogsActivity) baseFragment2).rightSlidingDialogContainer;
                                                if (anonymousClass28.hasFragment()) {
                                                    anonymousClass28.finishPreview();
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    int i23 = EnableTopicsActivity.TopicsLayoutSwitcher.Factory.$r8$clinit;
                    UItem uItemOfFactory5 = UItem.ofFactory(EnableTopicsActivity.TopicsLayoutSwitcher.Factory.class);
                    uItemOfFactory5.id = 2;
                    uItemOfFactory5.object = onClickListener;
                    uItemOfFactory5.object2 = onClickListener2;
                    uItemOfFactory5.setChecked(enableTopicsActivity.isTabs);
                    arrayList18.add(uItemOfFactory5);
                    String string7 = LocaleController.getString(R.string.TopicsLayoutInfo);
                    UItem uItem20 = new UItem(7);
                    uItem20.text = string7;
                    arrayList18.add(uItem20);
                }
                break;
            case 22:
                ArrayList arrayList19 = (ArrayList) obj;
                AcquiredGiftsSheet acquiredGiftsSheet = (AcquiredGiftsSheet) obj3;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = acquiredGiftsSheet.gifts;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        IntroActivity$$ExternalSyntheticLambda1 introActivity$$ExternalSyntheticLambda1 = new IntroActivity$$ExternalSyntheticLambda1(11, acquiredGiftsSheet, tL_StarGiftAuctionAcquiredGift);
                        int i24 = AcquiredGiftsSheet.AcquiredGiftsCell.Factory.$r8$clinit;
                        UItem uItemOfFactory6 = UItem.ofFactory(AcquiredGiftsSheet.AcquiredGiftsCell.Factory.class);
                        uItemOfFactory6.object = tL_StarGiftAuctionAcquiredGift;
                        uItemOfFactory6.object2 = acquiredGiftsSheet.auction;
                        uItemOfFactory6.clickCallback = introActivity$$ExternalSyntheticLambda1;
                        arrayList19.add(uItemOfFactory6);
                    }
                    int iDp8 = AndroidUtilities.dp(16.0f);
                    UItem uItem21 = new UItem(28);
                    uItem21.intValue = iDp8;
                    arrayList19.add(uItem21);
                    break;
                }
                break;
            case 23:
                ((ArrayList) obj).add(((ActiveAuctionsSheet) obj3).headerItem);
                break;
            case 24:
                ArrayList arrayList20 = (ArrayList) obj;
                arrayList20.add(((AuctionBidSheet) obj3).headerItem);
                int iDp9 = AndroidUtilities.dp(16.0f);
                UItem uItem22 = new UItem(28);
                uItem22.intValue = iDp9;
                arrayList20.add(uItem22);
                break;
            case 25:
                ((ArrayList) obj).add(UItem.asCustom(-1, ((AuctionJoinSheet) obj3).linearLayout));
                break;
            case 26:
                ((ArrayList) obj).add(UItem.asCustom(-1, ((AuctionWearingSheet) obj3).linearLayout));
                break;
            case 27:
                run$org$telegram$ui$Gifts$ProfileGiftsContainer$Page$$ExternalSyntheticLambda1(obj, obj2);
                break;
            case 28:
                run$org$telegram$ui$Gifts$ProfileGiftsContainer$SelectGiftsBottomSheet$$ExternalSyntheticLambda0(obj, obj2);
                break;
            default:
                ArrayList arrayList21 = (ArrayList) obj;
                ResaleGiftsFragment resaleGiftsFragment = (ResaleGiftsFragment) obj3;
                ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = resaleGiftsFragment.list;
                ArrayList arrayList22 = resaleGiftsList.gifts;
                int size7 = arrayList22.size();
                int i25 = 0;
                while (i25 < size7) {
                    Object obj10 = arrayList22.get(i25);
                    i25++;
                    arrayList21.add(GiftSheet.GiftCell.Factory.asStarGift(0, (TL_stars.TL_starGiftUnique) obj10, false, false, false, true, false));
                }
                if (resaleGiftsList.loading || !resaleGiftsList.endReached) {
                    UItem uItemAsFlicker10 = UItem.asFlicker(-1, 34);
                    uItemAsFlicker10.spanCount = 1;
                    arrayList21.add(uItemAsFlicker10);
                    UItem uItemAsFlicker11 = UItem.asFlicker(-2, 34);
                    uItemAsFlicker11.spanCount = 1;
                    arrayList21.add(uItemAsFlicker11);
                    UItem uItemAsFlicker12 = UItem.asFlicker(-3, 34);
                    uItemAsFlicker12.spanCount = 1;
                    arrayList21.add(uItemAsFlicker12);
                    if (resaleGiftsList.gifts.isEmpty()) {
                        UItem uItemAsFlicker13 = UItem.asFlicker(-4, 34);
                        uItemAsFlicker13.spanCount = 1;
                        arrayList21.add(uItemAsFlicker13);
                        UItem uItemAsFlicker14 = UItem.asFlicker(-5, 34);
                        uItemAsFlicker14.spanCount = 1;
                        arrayList21.add(uItemAsFlicker14);
                        UItem uItemAsFlicker15 = UItem.asFlicker(-6, 34);
                        uItemAsFlicker15.spanCount = 1;
                        arrayList21.add(uItemAsFlicker15);
                        UItem uItemAsFlicker16 = UItem.asFlicker(-7, 34);
                        uItemAsFlicker16.spanCount = 1;
                        arrayList21.add(uItemAsFlicker16);
                        UItem uItemAsFlicker17 = UItem.asFlicker(-8, 34);
                        uItemAsFlicker17.spanCount = 1;
                        arrayList21.add(uItemAsFlicker17);
                        UItem uItemAsFlicker18 = UItem.asFlicker(-9, 34);
                        uItemAsFlicker18.spanCount = 1;
                        arrayList21.add(uItemAsFlicker18);
                        UItem uItemAsFlicker19 = UItem.asFlicker(-10, 34);
                        uItemAsFlicker19.spanCount = 1;
                        arrayList21.add(uItemAsFlicker19);
                        UItem uItemAsFlicker20 = UItem.asFlicker(-11, 34);
                        uItemAsFlicker20.spanCount = 1;
                        arrayList21.add(uItemAsFlicker20);
                        UItem uItemAsFlicker21 = UItem.asFlicker(-12, 34);
                        uItemAsFlicker21.spanCount = 1;
                        arrayList21.add(uItemAsFlicker21);
                        UItem uItemAsFlicker22 = UItem.asFlicker(-13, 34);
                        uItemAsFlicker22.spanCount = 1;
                        arrayList21.add(uItemAsFlicker22);
                        UItem uItemAsFlicker23 = UItem.asFlicker(-14, 34);
                        uItemAsFlicker23.spanCount = 1;
                        arrayList21.add(uItemAsFlicker23);
                        UItem uItemAsFlicker24 = UItem.asFlicker(-15, 34);
                        uItemAsFlicker24.spanCount = 1;
                        arrayList21.add(uItemAsFlicker24);
                    }
                }
                boolean z7 = arrayList21.isEmpty() && !resaleGiftsList.loading;
                if (resaleGiftsFragment.emptyViewVisible != z7) {
                    resaleGiftsFragment.emptyViewVisible = z7;
                    resaleGiftsFragment.emptyView.setVisibility(0);
                    resaleGiftsFragment.emptyView.animate().alpha(z7 ? 1.0f : 0.0f).scaleX(z7 ? 1.0f : 0.95f).scaleY(z7 ? 1.0f : 0.95f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).setListener(new ResaleGiftsFragment.AnonymousClass11(resaleGiftsFragment, z7, i3)).start();
                    break;
                }
                break;
        }
    }
}
