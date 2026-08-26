package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.PhotoEditRadioCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.Views.StoryLinkPreviewDialog;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostRepository$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet;
import org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftLinkBottomSheet;
import org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftSentBottomSheet;
import org.telegram.ui.Components.Premium.boosts.adapters.GiftInfoAdapter;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorHeaderCell;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda10;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.UsersSelectActivity;

public final class SearchField$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public SearchField$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onClick(View view) {
        final int i = 0;
        final int i2 = 1;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                UsersSelectActivity.AnonymousClass4 anonymousClass4 = ((SearchField) obj).searchEditText;
                anonymousClass4.setText("");
                AndroidUtilities.showKeyboard(anonymousClass4);
                break;
            case 1:
                ((ImportingAlert) obj).lambda$new$1$7(view);
                break;
            case 2:
                ((JoinCallAlert) obj).lambda$new$8$7();
                break;
            case 3:
                JoinCallByUrlAlert joinCallByUrlAlert = (JoinCallByUrlAlert) obj;
                joinCallByUrlAlert.joinAfterDismiss = true;
                joinCallByUrlAlert.lambda$showGiftOfferSheet$15();
                break;
            case 4:
                ((JoinGroupAlert) obj).lambda$new$0$46(view);
                break;
            case 5:
                ((ActionBarMenu) obj).onItemClick(2);
                break;
            case 6:
                MessagePrivateSeenView messagePrivateSeenView = (MessagePrivateSeenView) obj;
                MessagePrivateSeenView.showSheet(messagePrivateSeenView.getContext(), messagePrivateSeenView.currentAccount, messagePrivateSeenView.dialogId, false, messagePrivateSeenView.dismiss, new HintView$1$$ExternalSyntheticLambda0(messagePrivateSeenView, 21), messagePrivateSeenView.resourcesProvider);
                break;
            case 7:
                ((OverlayActionBarLayoutDialog) obj).onBackPressed();
                break;
            case 8:
                ((ColorPickerBottomSheet) obj).lambda$new$1$35(view);
                break;
            case 9:
                ((ChatActivity$$ExternalSyntheticLambda17) obj).run();
                break;
            case 10:
                ((StoryLinkPreviewDialog) obj).onBackPressed();
                break;
            case 11:
                ((PermanentLinkBottomSheet) obj).lambda$showGiftOfferSheet$15();
                break;
            case 12:
                PhotoFilterView.ToolsAdapter toolsAdapter = (PhotoFilterView.ToolsAdapter) obj;
                toolsAdapter.getClass();
                PhotoEditRadioCell photoEditRadioCell = (PhotoEditRadioCell) view;
                int iIntValue = ((Integer) photoEditRadioCell.getTag()).intValue();
                PhotoFilterView photoFilterView = PhotoFilterView.this;
                if (iIntValue == photoFilterView.tintShadowsTool) {
                    photoFilterView.tintShadowsColor = photoEditRadioCell.getCurrentColor();
                } else {
                    photoFilterView.tintHighlightsColor = photoEditRadioCell.getCurrentColor();
                }
                FilterGLThread filterGLThread = photoFilterView.eglThread;
                if (filterGLThread != null) {
                    filterGLThread.requestRender(false, false, false);
                }
                photoFilterView.updateFiltersEmpty();
                break;
            case 13:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((PhotoViewerWebView.YoutubeProxy) obj).this$0.currentWebpage.url)));
                break;
            case 14:
                PipVideoOverlay pipVideoOverlay = (PipVideoOverlay) obj;
                PhotoViewer photoViewer = pipVideoOverlay.photoViewer;
                if (photoViewer != null) {
                    PhotoViewerWebView photoViewerWebView = pipVideoOverlay.photoViewerWebView;
                    if (photoViewerWebView == null) {
                        VideoPlayer videoPlayer = photoViewer.videoPlayer;
                        if (videoPlayer != null) {
                            if (videoPlayer.isPlaying()) {
                                videoPlayer.pause();
                            } else {
                                videoPlayer.play();
                            }
                        }
                    } else if (photoViewerWebView.isPlaying) {
                        photoViewerWebView.pauseVideo();
                    } else {
                        photoViewerWebView.playVideo();
                    }
                    PipVideoOverlay.instance.updatePlayButtonInternal();
                    break;
                }
                break;
            case 15:
                PollVotesAlert.Adapter.AnonymousClass1 anonymousClass1 = (PollVotesAlert.Adapter.AnonymousClass1) obj;
                PollVotesAlert.VotesList votesList = (PollVotesAlert.VotesList) anonymousClass1.getTag(R.id.object_tag);
                if (votesList.votes.size() > 15) {
                    boolean z = votesList.collapsed;
                    votesList.collapsed = !z;
                    if (!z) {
                        votesList.collapsedCount = 10;
                    }
                    PollVotesAlert.Adapter adapter = PollVotesAlert.Adapter.this;
                    PollVotesAlert.this.animateSectionUpdates(anonymousClass1);
                    PollVotesAlert.this.listAdapter.update(true);
                    break;
                }
                break;
            case 16:
                ((LinkSpanDrawable.LinksTextView) obj).performClick();
                break;
            case 17:
                PremiumPreviewBottomSheet premiumPreviewBottomSheet = (PremiumPreviewBottomSheet) obj;
                premiumPreviewBottomSheet.getClass();
                PremiumPreviewFragment.sentPremiumButtonClick();
                PremiumPreviewFragment.buyPremium(premiumPreviewBottomSheet.fragment, null, "profile", null);
                break;
            case 18:
                final PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet = (PremiumPreviewGiftLinkBottomSheet) obj;
                ButtonWithCounterView buttonWithCounterView = premiumPreviewGiftLinkBottomSheet.actionBtn.button;
                if (!buttonWithCounterView.loading) {
                    buttonWithCounterView.setLoading(true);
                    Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj2) {
                            switch (i) {
                                case 0:
                                    PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet2 = premiumPreviewGiftLinkBottomSheet;
                                    premiumPreviewGiftLinkBottomSheet2.actionBtn.button.setLoading(false);
                                    premiumPreviewGiftLinkBottomSheet2.lambda$showGiftOfferSheet$15();
                                    AndroidUtilities.runOnUIThread(new PremiumPreviewGiftLinkBottomSheet$$ExternalSyntheticLambda0(premiumPreviewGiftLinkBottomSheet2, 1), 200L);
                                    break;
                                default:
                                    premiumPreviewGiftLinkBottomSheet.lambda$init$3((TLRPC.TL_error) obj2);
                                    break;
                            }
                        }
                    };
                    Utilities.Callback callback2 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj2) {
                            switch (i2) {
                                case 0:
                                    PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet2 = premiumPreviewGiftLinkBottomSheet;
                                    premiumPreviewGiftLinkBottomSheet2.actionBtn.button.setLoading(false);
                                    premiumPreviewGiftLinkBottomSheet2.lambda$showGiftOfferSheet$15();
                                    AndroidUtilities.runOnUIThread(new PremiumPreviewGiftLinkBottomSheet$$ExternalSyntheticLambda0(premiumPreviewGiftLinkBottomSheet2, 1), 200L);
                                    break;
                                default:
                                    premiumPreviewGiftLinkBottomSheet.lambda$init$3((TLRPC.TL_error) obj2);
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = premiumPreviewGiftLinkBottomSheet.slug;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new BoostRepository$$ExternalSyntheticLambda6(callback2, callback, i2), 2);
                    break;
                }
                break;
            case 19:
                ((PremiumPreviewGiftSentBottomSheet) obj).lambda$init$0(view);
                break;
            case 20:
                GiftInfoAdapter giftInfoAdapter = (GiftInfoAdapter) obj;
                giftInfoAdapter.getClass();
                GiftInfoBottomSheet.this.lambda$showGiftOfferSheet$15();
                break;
            case 21:
                Runnable runnable = ((SelectorHeaderCell) obj).onCloseClickListener;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 22:
                CustomEmojiReactionsWindow customEmojiReactionsWindow = (CustomEmojiReactionsWindow) obj;
                if (customEmojiReactionsWindow.enterTransitionFinished) {
                    customEmojiReactionsWindow.dismiss();
                }
                break;
            case 23:
                ((ScrimOptions) obj).onBackPressed();
                break;
            case 24:
                ((EmojiView.DraggableScrollSlidingTabStrip) obj).delegate.onPageSelected(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 25:
                SearchDownloadsContainer searchDownloadsContainer = SearchDownloadsContainer.this;
                Activity activity = searchDownloadsContainer.parentActivity;
                int i3 = DownloadsInfoBottomSheet.$r8$clinit;
                BaseFragment baseFragment = searchDownloadsContainer.parentFragment;
                if (baseFragment != null && activity != null) {
                    new DownloadsInfoBottomSheet(activity, baseFragment).show();
                    break;
                }
                break;
            case 26:
                SearchTagsList searchTagsList = (SearchTagsList) obj;
                searchTagsList.getClass();
                new PremiumFeatureBottomSheet(searchTagsList.fragment, 24, true).show();
                break;
            case 27:
                ((SearchViewPager) obj).showActionMode(false);
                break;
            case 28:
                ShareTopView shareTopView = ShareTopView.this;
                if (!shareTopView.foundUrls.isEmpty()) {
                    shareTopView.dismissedMessage = TextUtils.join(" ", shareTopView.foundUrls).toString();
                    shareTopView.previewEnabled = false;
                    shareTopView.cancelLinkRequest();
                    shareTopView.loadedWebPage = null;
                    if (shareTopView.currentMode != 0) {
                        shareTopView.currentMode = 0;
                        ShareTopView.OnModeChangeListener onModeChangeListener = shareTopView.modeChangeListener;
                        if (onModeChangeListener != null) {
                            ((DialogsActivity$$ExternalSyntheticLambda10) onModeChangeListener).onModeChanged(0);
                        }
                    }
                    break;
                }
                break;
            default:
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                BaseFragment baseFragment2 = sharedMediaLayout.profileActivity;
                if (baseFragment2 != null && baseFragment2.getParentLayout() != null) {
                    ((ActionBarLayout) sharedMediaLayout.profileActivity.getParentLayout()).expandPreviewFragment();
                    break;
                }
                break;
        }
    }
}
