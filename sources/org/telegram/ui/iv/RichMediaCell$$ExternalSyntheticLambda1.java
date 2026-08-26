package org.telegram.ui.iv;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.CommentButton;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.Stories.PaidReactionButton;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.Stories.SelfStoryViewsPage;
import org.telegram.ui.Stories.SelfStoryViewsView;
import org.telegram.ui.Stories.StoriesIntro;
import org.telegram.ui.Stories.StoryCaptionView;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.recyclerview.ChatListItemAnimator;
import org.telegram.ui.web.BotWebViewContainer;

public final class RichMediaCell$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public RichMediaCell$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                RichMediaCell richMediaCell = (RichMediaCell) this.f$0;
                richMediaCell.getClass();
                richMediaCell.pageOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                richMediaCell.requestLayout();
                richMediaCell.invalidate();
                break;
            case 1:
                StarsReactionsSheet.StarsSlider starsSlider = (StarsReactionsSheet.StarsSlider) this.f$0;
                starsSlider.getClass();
                starsSlider.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                starsSlider.invalidate();
                break;
            case 2:
                CommentButton commentButton = (CommentButton) this.f$0;
                commentButton.getClass();
                commentButton.countScale = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                commentButton.invalidate();
                break;
            case 3:
                DialogStoriesCell.StoryCell storyCell = (DialogStoriesCell.StoryCell) this.f$0;
                storyCell.params.progressToSegments = AndroidUtilities.lerp(0.0f, 1.0f - DialogStoriesCell.this.collapsedProgress2, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                storyCell.invalidate();
                break;
            case 4:
                PeerStoriesView.AnonymousClass10 anonymousClass10 = (PeerStoriesView.AnonymousClass10) this.f$0;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anonymousClass10.listView.setAlpha(fFloatValue);
                anonymousClass10.shadowView.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, fFloatValue));
                anonymousClass10.invalidate();
                break;
            case 5:
                ((LiveCommentsView) this.f$0).invalidate();
                break;
            case 6:
                LiveCommentsView.LiveCommentView liveCommentView = (LiveCommentsView.LiveCommentView) this.f$0;
                liveCommentView.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = liveCommentView.background;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(liveCommentView.backgroundViewAlpha, 1.0f, fFloatValue2) * 255.0f));
                    liveCommentView.layout.invalidate();
                }
                break;
            case 7:
                BaseChartView.AnonymousClass4 anonymousClass4 = (BaseChartView.AnonymousClass4) this.f$0;
                anonymousClass4.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                LiveCommentsView.LiveCommentView liveCommentView2 = (LiveCommentsView.LiveCommentView) anonymousClass4.this$0;
                Drawable drawable2 = liveCommentView2.background;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, liveCommentView2.backgroundViewAlpha, fFloatValue3) * 255.0f));
                    liveCommentView2.layout.invalidate();
                }
                break;
            case 8:
                LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.f$0;
                liveStoryPipOverlay.getClass();
                liveStoryPipOverlay.controlsView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                PaidReactionButton.PaidReactionButtonEffectsView paidReactionButtonEffectsView = (PaidReactionButton.PaidReactionButtonEffectsView) this.f$0;
                paidReactionButtonEffectsView.getClass();
                paidReactionButtonEffectsView.focus = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paidReactionButtonEffectsView.invalidate();
                break;
            case 10:
                PeerStoriesView.PeerHeaderView peerHeaderView = (PeerStoriesView.PeerHeaderView) this.f$0;
                peerHeaderView.getClass();
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = peerHeaderView.subtitleView;
                textViewArr[0].setAlpha(fFloatValue4);
                float f = 1.0f - fFloatValue4;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f);
                textViewArr[1].setAlpha(f);
                textViewArr[1].setTranslationY(fFloatValue4 * AndroidUtilities.dp(4.0f));
                break;
            case 11:
                ((ProfileStoriesView) this.f$0).lambda$animateBounce$3(valueAnimator);
                break;
            case 12:
                SelfStoryViewsPage.HeaderView headerView = (SelfStoryViewsPage.HeaderView) this.f$0;
                headerView.animationProgress = ((Float) headerView.animator.getAnimatedValue()).floatValue();
                headerView.invalidate();
                break;
            case 13:
                SelfStoryViewsView selfStoryViewsView = (SelfStoryViewsView) this.f$0;
                selfStoryViewsView.getClass();
                selfStoryViewsView.progressToKeyboard = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                selfStoryViewsView.viewPagerContainer.setTranslationY(((-selfStoryViewsView.bottomPadding) + selfStoryViewsView.getMeasuredHeight()) - selfStoryViewsView.selfStoriesViewsOffset);
                break;
            case 14:
                StoriesIntro storiesIntro = (StoriesIntro) this.f$0;
                storiesIntro.getClass();
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = storiesIntro.items;
                StoriesIntro.StoriesIntroItemView storiesIntroItemView = (StoriesIntro.StoriesIntroItemView) arrayList.get(storiesIntro.current);
                storiesIntroItemView.progress = fFloatValue5;
                storiesIntroItemView.invalidate();
                int i = storiesIntro.prev;
                if (i != -1) {
                    StoriesIntro.StoriesIntroItemView storiesIntroItemView2 = (StoriesIntro.StoriesIntroItemView) arrayList.get(i);
                    storiesIntroItemView2.progress = 1.0f - fFloatValue5;
                    storiesIntroItemView2.invalidate();
                }
                break;
            case 15:
                StoryCaptionView.StoryCaptionTextView storyCaptionTextView = (StoryCaptionView.StoryCaptionTextView) this.f$0;
                storyCaptionTextView.getClass();
                storyCaptionTextView.updateT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storyCaptionTextView.invalidate();
                storyCaptionTextView.requestLayout();
                StoryCaptionView.this.requestLayout();
                break;
            case 16:
                ((BotPreviewsEditContainer) this.f$0).lambda$updateTabs$3(valueAnimator);
                break;
            case 17:
                ((ChatListItemAnimator) this.f$0).lambda$runPendingAnimations$0(valueAnimator);
                break;
            default:
                ChatMessageCell.AnonymousClass3 anonymousClass3 = (ChatMessageCell.AnonymousClass3) this.f$0;
                ((BackupImageView) ((BotWebViewContainer.AnonymousClass1) anonymousClass3.this$0)).imageReceiver.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                anonymousClass3.invalidate();
                break;
        }
    }
}
