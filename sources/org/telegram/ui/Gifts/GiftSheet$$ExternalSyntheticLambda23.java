package org.telegram.ui.Gifts;

import android.animation.ValueAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet;
import org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftLinkBottomSheet;
import org.telegram.ui.Components.Premium.boosts.ReassignBoostBottomSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.SuperRipple$$ExternalSyntheticLambda7;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.bots.BotStorage;
import org.telegram.ui.web.BotWebViewContainer;

public final class GiftSheet$$ExternalSyntheticLambda23 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public GiftSheet$$ExternalSyntheticLambda23(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void run(Object obj) {
        String string;
        Object obj2 = this.f$3;
        Object[] objArr = 0;
        int i = 1;
        Object obj3 = this.f$1;
        Object obj4 = this.f$2;
        Object obj5 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                GiftSheet giftSheet = (GiftSheet) obj5;
                giftSheet.getClass();
                ((Browser.Progress) obj3).end();
                Utilities.Callback callback = (Utilities.Callback) obj4;
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                giftSheet.lambda$showGiftOfferSheet$15();
                if (tL_error == null) {
                    giftSheet.lambda$showGiftOfferSheet$15();
                } else {
                    AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda26(objArr == true ? 1 : 0, (GiftSheet.AnonymousClass8) obj2, tL_error));
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                Runnable[] runnableArr = (Runnable[]) obj5;
                AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) obj3;
                ValueAnimator valueAnimator = valueAnimatorArr[0];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                TextView textView = (TextView) obj4;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(textView.getAlpha(), bool.booleanValue() ? 1.0f : 0.0f);
                valueAnimatorArr[0] = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new SuperRipple$$ExternalSyntheticLambda7(i, textView, (TextView) obj2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    AndroidUtilities.runOnUIThread(runnableArr[0], 5320L);
                }
                break;
            case 2:
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get()) {
                    BaseFragment baseFragment = (BaseFragment) obj4;
                    if (baseFragment.getParentActivity() != null) {
                        String str = (String) obj2;
                        if (tL_payments_checkedGiftCode.from_id == null) {
                            TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                            tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                            TLRPC.User currentUser = baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).getCurrentUser() : null;
                            if (currentUser == null || currentUser.self) {
                                currentUser = new TLRPC.TL_user();
                            }
                            TLRPC.User user = currentUser;
                            boolean z = tL_payments_checkedGiftCode.used_date != 0;
                            BaseFragment lastFragment = LaunchActivity.getLastFragment();
                            if (lastFragment != null && PremiumPreviewGiftLinkBottomSheet.instance == null) {
                                PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet = new PremiumPreviewGiftLinkBottomSheet(lastFragment, UserConfig.selectedAccount, user, new GiftPremiumBottomSheet$GiftTier(tL_premiumGiftOption), str, z, lastFragment.getResourceProvider());
                                premiumPreviewGiftLinkBottomSheet.show();
                                PremiumPreviewGiftLinkBottomSheet.instance = premiumPreviewGiftLinkBottomSheet;
                            }
                        } else {
                            baseFragment.showDialog(new GiftInfoBottomSheet(baseFragment, tL_payments_checkedGiftCode, str));
                        }
                        Browser.Progress progress = (Browser.Progress) obj3;
                        if (progress != null) {
                            progress.end();
                        }
                        break;
                    }
                }
                break;
            case 3:
                ((ReassignBoostBottomSheet) obj5).lambda$new$1((TLRPC.Chat) obj3, (ArrayList) obj4, (HashSet) obj2, (TL_stories.TL_premium_myBoosts) obj);
                break;
            case 4:
                Long l = (Long) obj;
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj3;
                SendMessagesHelper.getInstance(peerStoriesView.currentAccount).sendSticker(tL_document, (String) obj4, peerStoriesView.dialogId, null, null, peerStoriesView.currentStory.storyItem, null, null, true, 0, 0, false, this.f$3, null, l.longValue(), peerStoriesView.chatActivityEnterView.getSendMonoForumPeerId(), peerStoriesView.chatActivityEnterView.getSendMessageSuggestionParams());
                peerStoriesView.chatActivityEnterView.addStickerToRecent(tL_document);
                peerStoriesView.chatActivityEnterView.setFieldText("");
                peerStoriesView.afterMessageSend(l.longValue() <= 0);
                break;
            case 5:
                StoriesController.StoryAlbum storyAlbum = (StoriesController.StoryAlbum) obj;
                boolean zContains = ((HashSet) obj3).contains(Integer.valueOf(storyAlbum.album_id));
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = ((PeerStoriesView.AnonymousClass8) obj5).this$0;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj4;
                if (zContains) {
                    StoriesController storiesController = anonymousClass1.storiesController;
                    long j = anonymousClass1.dialogId;
                    int i2 = storyAlbum.album_id;
                    storiesController.getClass();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(storyItem);
                    storiesController.addStoriesToAlbum(i2, j, arrayList);
                    string = LocaleController.formatString(R.string.StoryAddedToAlbumX, storyAlbum.title);
                } else {
                    StoriesController storiesController2 = anonymousClass1.storiesController;
                    long j2 = anonymousClass1.dialogId;
                    int i3 = storyAlbum.album_id;
                    storiesController2.getClass();
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(storyItem);
                    storiesController2.removeStoriesFromAlbum(i3, j2, arrayList2);
                    string = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, storyAlbum.title);
                }
                BulletinFactory.of(anonymousClass1.storyContainer, (DarkThemeResourceProvider) obj2).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(string)).show();
                PeerStoriesView.AnonymousClass8 anonymousClass8 = anonymousClass1.popupMenu;
                if (anonymousClass8 != null) {
                    anonymousClass8.dismiss();
                }
                break;
            default:
                ((BotWebViewContainer) obj5).lambda$restoreStorageKey$58("secure_storage_failed", (String) obj3, (BotStorage) obj4, (String) obj2, "secure_storage_key_restored", (String) obj);
                break;
        }
    }

    public GiftSheet$$ExternalSyntheticLambda23(AtomicBoolean atomicBoolean, BaseFragment baseFragment, String str, Browser.Progress progress) {
        this.$r8$classId = 2;
        this.f$0 = atomicBoolean;
        this.f$2 = baseFragment;
        this.f$3 = str;
        this.f$1 = progress;
    }
}
