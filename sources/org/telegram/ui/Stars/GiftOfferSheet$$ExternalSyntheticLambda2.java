package org.telegram.ui.Stars;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.widget.TooltipPopup;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessBotButton;
import org.telegram.ui.Business.BusinessBotButton$$ExternalSyntheticLambda1;
import org.telegram.ui.Business.ChatbotSheet;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell;
import org.telegram.ui.Gifts.ActiveAuctionsSheet;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Gifts.AuctionJoinSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Gifts.ProfileGiftsContainer$Page$$ExternalSyntheticLambda24;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda17;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.SelfStoryViewsPage;
import org.telegram.ui.Stories.SelfStoryViewsView;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;
import org.telegram.ui.iv.RichCommand;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda53;
import org.telegram.ui.iv.RichTextCell;

public final class GiftOfferSheet$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public GiftOfferSheet$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                if (((GiftOfferSheet) this.f$0).inputAmount.currency == AmountUtils$Currency.STARS) {
                    new StarsIntroActivity.StarsOptionsSheet((Context) this.f$1, (Theme.ResourcesProvider) this.f$2).show();
                }
                break;
            case 1:
                BusinessBotButton businessBotButton = (BusinessBotButton) this.f$0;
                businessBotButton.getClass();
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(((ChatActivity) this.f$1).getLayoutContainer(), (Theme.ResourcesProvider) this.f$2, businessBotButton.menuView);
                itemOptionsMakeOptions.add(R.drawable.msg_cancel, (CharSequence) LocaleController.getString(R.string.BizBotRemove), true, (Runnable) new BusinessBotButton$$ExternalSyntheticLambda1(businessBotButton, 1)).makeMultiline(false);
                if (businessBotButton.manageUrl != null) {
                    itemOptionsMakeOptions.add(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new BusinessBotButton$$ExternalSyntheticLambda1(businessBotButton, 2));
                }
                itemOptionsMakeOptions.translate(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                itemOptionsMakeOptions.setDimAlpha(0);
                itemOptionsMakeOptions.show();
                break;
            case 2:
                ((ChatbotSheet) this.f$0).lambda$new$4((TL_account.TL_connectedBot) this.f$1, (OAuthSheet$$ExternalSyntheticLambda6) this.f$2);
                break;
            case 3:
                ((LPhotoPaintView) this.f$0).lambda$new$10((Context) this.f$1, (Bitmap) this.f$2, view);
                break;
            case 4:
                ((SelectorSearchCell) this.f$0).lambda$updateSpans$0((HashSet) this.f$1, (Runnable) this.f$2, view);
                break;
            case 5:
                ((ActiveAuctionsSheet) this.f$0).lambda$new$0((Context) this.f$1, (GiftAuctionController.Auction) this.f$2);
                break;
            case 6:
                ((AuctionBidSheet) this.f$0).lambda$new$2((boolean[]) this.f$1, (Theme.ResourcesProvider) this.f$2);
                break;
            case 7:
                ((AuctionJoinSheet) this.f$0).lambda$new$14((Context) this.f$1, (Theme.ResourcesProvider) this.f$2);
                break;
            case 8:
                ((AuctionJoinSheet) this.f$0).lambda$new$5((boolean[]) this.f$1, (Theme.ResourcesProvider) this.f$2);
                break;
            case 9:
                ProfileGiftsContainer.Page page = (ProfileGiftsContainer.Page) this.f$0;
                page.getClass();
                ((ItemOptions) this.f$1).dismiss();
                page.parent.openEnterNameAlert(null, new ProfileGiftsContainer$Page$$ExternalSyntheticLambda24(page, (TL_stars.SavedStarGift) this.f$2, 0));
                break;
            case 10:
                StarsController$$ExternalSyntheticLambda34 starsController$$ExternalSyntheticLambda34 = (StarsController$$ExternalSyntheticLambda34) this.f$0;
                final BottomSheet bottomSheet = (BottomSheet) this.f$1;
                bottomSheet.setCanDismissWithSwipe(false);
                final ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) this.f$2;
                buttonWithCounterView.setLoading(true);
                final int i = 1;
                starsController$$ExternalSyntheticLambda34.run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i) {
                            case 0:
                                boolean zBooleanValue = bool.booleanValue();
                                final BottomSheet bottomSheet2 = bottomSheet;
                                if (!zBooleanValue) {
                                    final ButtonWithCounterView buttonWithCounterView2 = buttonWithCounterView;
                                    final int i2 = 0;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i2) {
                                                case 0:
                                                    bottomSheet2.setCanDismissWithSwipe(false);
                                                    buttonWithCounterView2.setLoading(false);
                                                    break;
                                                default:
                                                    bottomSheet2.setCanDismissWithSwipe(false);
                                                    buttonWithCounterView2.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                } else {
                                    bottomSheet2.lambda$showGiftOfferSheet$15();
                                }
                                break;
                            default:
                                boolean zBooleanValue2 = bool.booleanValue();
                                final BottomSheet bottomSheet3 = bottomSheet;
                                if (!zBooleanValue2) {
                                    final ButtonWithCounterView buttonWithCounterView3 = buttonWithCounterView;
                                    final int i3 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i3) {
                                                case 0:
                                                    bottomSheet3.setCanDismissWithSwipe(false);
                                                    buttonWithCounterView3.setLoading(false);
                                                    break;
                                                default:
                                                    bottomSheet3.setCanDismissWithSwipe(false);
                                                    buttonWithCounterView3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                } else {
                                    bottomSheet3.lambda$showGiftOfferSheet$15();
                                }
                                break;
                        }
                    }
                });
                break;
            case 11:
                StarsController$$ExternalSyntheticLambda48 starsController$$ExternalSyntheticLambda48 = (StarsController$$ExternalSyntheticLambda48) this.f$0;
                final BottomSheet bottomSheet2 = (BottomSheet) this.f$1;
                bottomSheet2.setCanDismissWithSwipe(false);
                final ButtonWithCounterView buttonWithCounterView2 = (ButtonWithCounterView) this.f$2;
                buttonWithCounterView2.setLoading(true);
                final int i2 = 0;
                starsController$$ExternalSyntheticLambda48.run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i2) {
                            case 0:
                                boolean zBooleanValue = bool.booleanValue();
                                final BottomSheet bottomSheet3 = bottomSheet2;
                                if (!zBooleanValue) {
                                    final ButtonWithCounterView buttonWithCounterView3 = buttonWithCounterView2;
                                    final int i3 = 0;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i3) {
                                                case 0:
                                                    bottomSheet3.setCanDismissWithSwipe(false);
                                                    buttonWithCounterView3.setLoading(false);
                                                    break;
                                                default:
                                                    bottomSheet3.setCanDismissWithSwipe(false);
                                                    buttonWithCounterView3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                } else {
                                    bottomSheet3.lambda$showGiftOfferSheet$15();
                                }
                                break;
                            default:
                                boolean zBooleanValue2 = bool.booleanValue();
                                final BottomSheet bottomSheet4 = bottomSheet2;
                                if (!zBooleanValue2) {
                                    final ButtonWithCounterView buttonWithCounterView4 = buttonWithCounterView2;
                                    final int i4 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i4) {
                                                case 0:
                                                    bottomSheet4.setCanDismissWithSwipe(false);
                                                    buttonWithCounterView4.setLoading(false);
                                                    break;
                                                default:
                                                    bottomSheet4.setCanDismissWithSwipe(false);
                                                    buttonWithCounterView4.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                } else {
                                    bottomSheet4.lambda$showGiftOfferSheet$15();
                                }
                                break;
                        }
                    }
                });
                break;
            case 12:
                ((RichEditor$$ExternalSyntheticLambda53) this.f$0).run(Long.valueOf(((long[]) this.f$1)[0]));
                ((BottomSheet) this.f$2).lambda$showGiftOfferSheet$15();
                break;
            case 13:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                ((ActionBarMenuSubItem) this.f$1).performHapticFeedback(3);
                BulletinFactory bulletinFactoryGlobal = BulletinFactory.global();
                if (bulletinFactoryGlobal != null) {
                    bulletinFactoryGlobal.createSimpleBulletin(R.raw.ic_save_to_gallery, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new LivePlayer$$ExternalSyntheticLambda17(25, anonymousClass8, (StoryViewer) this.f$2))).show();
                }
                break;
            case 14:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = ((PeerStoriesView.AnonymousClass8) this.f$0).this$0;
                anonymousClass1.editPrivacy((StoryPrivacyBottomSheet.StoryPrivacy) this.f$1, (TL_stories.StoryItem) this.f$2);
                PeerStoriesView.AnonymousClass8 anonymousClass9 = anonymousClass1.popupMenu;
                if (anonymousClass9 != null) {
                    anonymousClass9.dismiss();
                }
                break;
            case 15:
                SelfStoryViewsPage.AnonymousClass4 anonymousClass4 = (SelfStoryViewsPage.AnonymousClass4) this.f$0;
                SendGiftSheet.AnonymousClass8 anonymousClass10 = new SendGiftSheet.AnonymousClass8(anonymousClass4, 5);
                SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass2 = anonymousClass4.this$0;
                new EmojiPacksAlert(anonymousClass10, anonymousClass2.getContext(), anonymousClass2.resourcesProvider, (ArrayList<TLRPC.InputStickerSet>) this.f$1).show();
                ((ItemOptions) this.f$2).dismiss();
                break;
            case 16:
                CommunityAddOptionsSheet communityAddOptionsSheet = (CommunityAddOptionsSheet) this.f$0;
                boolean z = communityAddOptionsSheet.isHidden;
                TLRPC.Chat chat = (TLRPC.Chat) this.f$2;
                communityAddOptionsSheet.apply((Utilities.Callback) this.f$1, z, (chat == null || ChatObject.canAddChatToCommunity(chat)) ? false : true);
                break;
            default:
                ((TooltipPopup) this.f$0).hide();
                ((RichTextCell) this.f$1).selectCommand((RichCommand) this.f$2);
                break;
        }
    }
}
