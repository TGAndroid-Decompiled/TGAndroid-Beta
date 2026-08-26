package org.telegram.ui.Gifts;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorCountryCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell;
import org.telegram.ui.Components.Reactions.ChatSelectionReactionMenuOverlay;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.conference.GroupCallActivityButtonsLayout;
import org.telegram.ui.Components.conference.message.GroupCallMessageCell;
import org.telegram.ui.Components.inset.KeyboardState;
import org.telegram.ui.Components.poll.PollAddOptionFieldLayout;
import org.telegram.ui.Components.poll.RecentVotersCell;
import org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet;
import org.telegram.ui.Components.voip.GroupCallRenderersContainer;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Components.voip.VoIPNotificationsLayout;
import org.telegram.ui.Components.voip.VoIPStatusTextView;
import org.telegram.ui.Components.voip.VoIPTimerView;
import org.telegram.ui.Components.voip.VoIpBitmapTextView;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public final class GiftSheet$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public GiftSheet$$ExternalSyntheticLambda9(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                UniversalAdapter universalAdapter = ((GiftSheet) this.f$0).adapter;
                if (universalAdapter != null) {
                    universalAdapter.update(false);
                }
                break;
            case 1:
                ((OAuthSheet$$ExternalSyntheticLambda1) this.f$0).run(Collections.EMPTY_LIST);
                break;
            case 2:
                GiftInfoBottomSheet giftInfoBottomSheet = GiftInfoBottomSheet.this;
                PremiumPreviewBottomSheet premiumPreviewBottomSheet = new PremiumPreviewBottomSheet(giftInfoBottomSheet.getBaseFragment(), ((BottomSheet) giftInfoBottomSheet).currentAccount, null, null, null, ((BottomSheet) giftInfoBottomSheet).resourcesProvider);
                premiumPreviewBottomSheet.animateConfetti = true;
                premiumPreviewBottomSheet.isOutboundGift = true;
                giftInfoBottomSheet.getBaseFragment().showDialog(premiumPreviewBottomSheet);
                break;
            case 3:
                ((SelectorCountryCell) this.f$0).setCountryInternal();
                break;
            case 4:
                SelectorSearchCell.this.fullScroll(130);
                break;
            case 5:
                ChatSelectionReactionMenuOverlay.AnonymousClass3 anonymousClass3 = (ChatSelectionReactionMenuOverlay.AnonymousClass3) this.f$0;
                ChatSelectionReactionMenuOverlay.AnonymousClass2 anonymousClass2 = ChatSelectionReactionMenuOverlay.this.reactionsContainerLayout;
                if (anonymousClass2 != null) {
                    anonymousClass2.dismissParent(true);
                }
                anonymousClass3.hideMenu();
                break;
            case 6:
                ((ValueAnimator) this.f$0).start();
                break;
            case 7:
                BaseFragment baseFragment = CustomEmojiReactionsWindow.this.baseFragment;
                if (baseFragment instanceof ChatActivity) {
                    baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 11, false));
                } else {
                    BaseFragment lastFragment = LaunchActivity.getLastFragment();
                    if (lastFragment != null) {
                        lastFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 11, false));
                    }
                }
                break;
            case 8:
                ((GroupCallActivityButtonsLayout) this.f$0).invalidate();
                break;
            case 9:
                GroupCallMessageCell groupCallMessageCell = (GroupCallMessageCell) this.f$0;
                GroupCallMessage groupCallMessage = groupCallMessageCell.groupCallMessage;
                if (groupCallMessage != null) {
                    groupCallMessageCell.isSendDelayedAnimator.setValue(groupCallMessage.isSendDelayed(), true);
                    groupCallMessageCell.isSendErrorAnimator.setValue(groupCallMessageCell.groupCallMessage.isSendError(), true);
                }
                break;
            case 10:
                KeyboardState keyboardState = (KeyboardState) this.f$0;
                KeyboardState.State state = keyboardState.state;
                if (state == KeyboardState.State.STATE_ANIMATING_TO_FULLY_HIDDEN) {
                    keyboardState.setState(KeyboardState.State.STATE_FULLY_HIDDEN, true);
                } else if (state == KeyboardState.State.STATE_ANIMATING_TO_FULLY_VISIBLE) {
                    keyboardState.setState(KeyboardState.State.STATE_FULLY_VISIBLE, true);
                }
                break;
            case 11:
                AndroidUtilities.showKeyboard(((PollAddOptionFieldLayout) this.f$0).textView);
                break;
            case 12:
                PollAddOptionFieldLayout pollAddOptionFieldLayout = (PollAddOptionFieldLayout) ((AuctionBidSheet.AnonymousClass4) this.f$0).val$drawable;
                ChatMessageCell chatMessageCell = pollAddOptionFieldLayout.cellToWatch;
                if (chatMessageCell != null && chatMessageCell.getDelegate() != null) {
                    pollAddOptionFieldLayout.cellToWatch.getDelegate().forceUpdate(pollAddOptionFieldLayout.cellToWatch, false);
                    break;
                }
                break;
            case 13:
                ((RecentVotersCell) this.f$0).listView.adapter.update(true);
                break;
            case 14:
                ((RecentVotersCell.VotesList) this.f$0).load();
                break;
            case 15:
                ((CountrySelectBottomSheet) this.f$0).adapter.update(true);
                break;
            case 16:
                ((GroupCallRenderersContainer) this.f$0).lambda$setVisibleParticipant$9();
                break;
            case 17:
                RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.f$0;
                rTMPStreamPipOverlay.isShowingControls = false;
                rTMPStreamPipOverlay.toggleControls(false);
                rTMPStreamPipOverlay.postedDismissControls = false;
                break;
            case 18:
                RTMPStreamPipOverlay rTMPStreamPipOverlay2 = RTMPStreamPipOverlay.this;
                rTMPStreamPipOverlay2.contentFrameLayout.invalidate();
                if (!rTMPStreamPipOverlay2.contentFrameLayout.isInLayout()) {
                    rTMPStreamPipOverlay2.contentFrameLayout.requestLayout();
                    rTMPStreamPipOverlay2.contentView.requestLayout();
                    rTMPStreamPipOverlay2.textureView.requestLayout();
                    break;
                }
                break;
            case 19:
                RTMPStreamPipOverlay.this.bindTextureView(false);
                break;
            case 20:
                VoIPNotificationsLayout voIPNotificationsLayout = (VoIPNotificationsLayout) this.f$0;
                voIPNotificationsLayout.lockAnimation = false;
                ArrayList arrayList = voIPNotificationsLayout.viewToAdd;
                boolean zIsEmpty = arrayList.isEmpty();
                ArrayList arrayList2 = voIPNotificationsLayout.viewToRemove;
                if (!zIsEmpty || !arrayList2.isEmpty()) {
                    if (voIPNotificationsLayout.getParent() != null) {
                        TransitionManager.beginDelayedTransition(voIPNotificationsLayout, voIPNotificationsLayout.transitionSet);
                    }
                    int i = 0;
                    while (i < arrayList.size()) {
                        VoIPNotificationsLayout.NotificationView notificationView = (VoIPNotificationsLayout.NotificationView) arrayList.get(i);
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            if (notificationView.tag.equals(((VoIPNotificationsLayout.NotificationView) arrayList2.get(i2)).tag)) {
                                arrayList.remove(i);
                                arrayList2.remove(i2);
                                i--;
                            }
                            break;
                        }
                        i++;
                    }
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        voIPNotificationsLayout.addView((View) arrayList.get(i3), LayoutHelper.createLinear(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        voIPNotificationsLayout.removeView((View) arrayList2.get(i4));
                    }
                    HashMap map = voIPNotificationsLayout.viewsByTag;
                    map.clear();
                    for (int i5 = 0; i5 < voIPNotificationsLayout.getChildCount(); i5++) {
                        VoIPNotificationsLayout.NotificationView notificationView2 = (VoIPNotificationsLayout.NotificationView) voIPNotificationsLayout.getChildAt(i5);
                        map.put(notificationView2.tag, notificationView2);
                    }
                    arrayList.clear();
                    arrayList2.clear();
                    voIPNotificationsLayout.lockAnimation = true;
                    AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda9(voIPNotificationsLayout, 20), 700L);
                    Runnable runnable = voIPNotificationsLayout.onViewsUpdated;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                break;
            case 21:
                TextView[] textViewArr = ((VoIPStatusTextView) this.f$0).textView;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 22:
                TextView[] textViewArr2 = ((VoIPStatusTextView) ((ChatListItemAnimator.AnonymousClass3) this.f$0).this$0).textView;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                break;
            case 23:
                VoIPTimerView voIPTimerView = (VoIPTimerView) this.f$0;
                if (voIPTimerView.getVisibility() == 0) {
                    voIPTimerView.updateTimer();
                }
                break;
            case 24:
                VoIpBitmapTextView voIpBitmapTextView = (VoIpBitmapTextView) this.f$0;
                voIpBitmapTextView.bitmap = Bitmap.createBitmap(voIpBitmapTextView.getMeasuredWidth(), voIpBitmapTextView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(voIpBitmapTextView.bitmap).drawText(voIpBitmapTextView.text, voIpBitmapTextView.getMeasuredWidth() / 2, (int) ((voIpBitmapTextView.getMeasuredHeight() / 2) - ((voIpBitmapTextView.textPaint.ascent() + voIpBitmapTextView.textPaint.descent()) / 2.0f)), voIpBitmapTextView.textPaint);
                voIpBitmapTextView.postInvalidate();
                break;
            case 25:
                MemberRequestsDelegate.PreviewDialog previewDialog = (MemberRequestsDelegate.PreviewDialog) this.f$0;
                previewDialog.updateBackgroundBitmap();
                previewDialog.runAnimation(true);
                break;
            case 26:
                AuctionBidSheet auctionBidSheet = (AuctionBidSheet) this.f$0;
                auctionBidSheet.selfBidderFutureGift.setTranslationX(auctionBidSheet.selfBidderHeader.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                break;
            case 27:
                ((AuctionWearingSheet) this.f$0).lambda$openCrafting$8();
                break;
            case 28:
                ((GiftSheet.CardBackground) this.f$0).invalidate();
                break;
            default:
                GiftSheet.StarsBackground starsBackground = (GiftSheet.StarsBackground) this.f$0;
                StarsReactionsSheet.Particles particles = starsBackground.particles;
                if (particles != null) {
                    particles.process();
                    starsBackground.invalidateSelf();
                }
                break;
        }
    }
}
