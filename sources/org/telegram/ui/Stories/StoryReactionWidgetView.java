package org.telegram.ui.Stories;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.Reactions.ReactionImageHolder;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.Reactions.ReactionsUtils;
import org.telegram.ui.EmojiAnimationsOverlay;

public final class StoryReactionWidgetView extends StoryMediaAreasView.AreaView {
    public final AnimatedTextView.AnimatedTextDrawable animatedTextDrawable;
    public boolean hasCounter;
    public final ReactionImageHolder holder;
    public final ImageReceiver preloadSmallReaction;
    public final AnimatedFloat progressToCount;
    public final StoryReactionWidgetBackground storyReactionWidgetBackground;
    public final ReactionsLayoutInBubble.VisibleReaction visibleReaction;

    public StoryReactionWidgetView(Context context, StoryMediaAreasView storyMediaAreasView, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, EmojiAnimationsOverlay emojiAnimationsOverlay) {
        TLRPC.TL_availableReaction tL_availableReaction;
        super(context, storyMediaAreasView, tL_mediaAreaSuggestedReaction);
        StoryReactionWidgetBackground storyReactionWidgetBackground = new StoryReactionWidgetBackground(this);
        this.storyReactionWidgetBackground = storyReactionWidgetBackground;
        ReactionImageHolder reactionImageHolder = new ReactionImageHolder(this);
        this.holder = reactionImageHolder;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.preloadSmallReaction = imageReceiver;
        this.progressToCount = new AnimatedFloat(this);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
        this.animatedTextDrawable = animatedTextDrawable;
        ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_mediaAreaSuggestedReaction.reaction);
        this.visibleReaction = visibleReactionFromTL;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            storyReactionWidgetBackground.setMirror(true, false);
        }
        storyReactionWidgetBackground.updateShadowLayer(getScaleX());
        reactionImageHolder.setVisibleReaction(visibleReactionFromTL);
        emojiAnimationsOverlay.preload(visibleReactionFromTL);
        if (visibleReactionFromTL.emojicon != null && (tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(visibleReactionFromTL.emojicon)) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        animatedTextDrawable.setGravity(17);
        animatedTextDrawable.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(18.0f));
        animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
        if (tL_mediaAreaSuggestedReaction.dark) {
            int i = storyReactionWidgetBackground.style + 1;
            storyReactionWidgetBackground.style = i;
            if (i >= 2) {
                storyReactionWidgetBackground.style = 0;
            }
            animatedTextDrawable.setTextColor(-1);
        }
    }

    @Override
    public final void customDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        StoryReactionWidgetBackground storyReactionWidgetBackground = this.storyReactionWidgetBackground;
        storyReactionWidgetBackground.setBounds(0, 0, measuredWidth, measuredHeight);
        storyReactionWidgetBackground.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float fCenterX = storyReactionWidgetBackground.getBounds().centerX() - measuredWidth2;
        float fCenterY = storyReactionWidgetBackground.getBounds().centerY() - measuredWidth2;
        float fCenterX2 = storyReactionWidgetBackground.getBounds().centerX() + measuredWidth2;
        float fCenterY2 = storyReactionWidgetBackground.getBounds().centerY() + measuredWidth2;
        float fHeight = (storyReactionWidgetBackground.getBounds().height() * 0.427f) + storyReactionWidgetBackground.getBounds().top;
        float f = fHeight - measuredWidth2;
        float f2 = fHeight + measuredWidth2;
        float f3 = this.progressToCount.set(this.hasCounter ? 1.0f : 0.0f);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) fCenterX, (int) AndroidUtilities.lerp(fCenterY, f, f3), (int) fCenterX2, (int) AndroidUtilities.lerp(fCenterY2, f2, f3));
        int i = storyReactionWidgetBackground.style == 1 ? -1 : -16777216;
        ReactionImageHolder reactionImageHolder = this.holder;
        if (reactionImageHolder.lastColorForFilter != i) {
            reactionImageHolder.lastColorForFilter = i;
            reactionImageHolder.colorFilter = new PorterDuffColorFilter(reactionImageHolder.lastColorForFilter, PorterDuff.Mode.SRC_ATOP);
            View view = reactionImageHolder.parent;
            if (view != null) {
                view.invalidate();
            }
        }
        reactionImageHolder.bounds.set(rect);
        reactionImageHolder.draw(canvas);
        float fHeight2 = (storyReactionWidgetBackground.getBounds().height() * 0.839f) + storyReactionWidgetBackground.getBounds().top;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.animatedTextDrawable;
        animatedTextDrawable.setBounds(storyReactionWidgetBackground.getBounds().left, (int) (fHeight2 - AndroidUtilities.dp(10.0f)), storyReactionWidgetBackground.getBounds().right, (int) (AndroidUtilities.dp(10.0f) + fHeight2));
        canvas.save();
        canvas.scale(f3, f3, storyReactionWidgetBackground.getBounds().centerX(), fHeight2);
        animatedTextDrawable.draw(canvas);
        canvas.restore();
    }

    public AnimatedEmojiDrawable getAnimatedEmojiDrawable() {
        return this.holder.animatedEmojiDrawable;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.holder.onAttachedToWindow(true);
        this.preloadSmallReaction.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.holder.onAttachedToWindow(false);
        this.preloadSmallReaction.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.animatedTextDrawable.setTextSize(Math.min(AndroidUtilities.dp(18.0f), getMeasuredHeight() * 0.156f));
    }

    @Override
    public void setScaleX(float f) {
        if (getScaleX() != f) {
            this.storyReactionWidgetBackground.updateShadowLayer(f);
            super.setScaleX(f);
        }
    }

    public final void setViews(TL_stories.StoryViews storyViews, boolean z) {
        AnimatedFloat animatedFloat = this.progressToCount;
        if (storyViews != null) {
            for (int i = 0; i < storyViews.reactions.size(); i++) {
                if (ReactionsUtils.compare(storyViews.reactions.get(i).reaction, this.visibleReaction)) {
                    boolean z2 = z && this.hasCounter;
                    this.hasCounter = storyViews.reactions.get(i).count > 0;
                    this.animatedTextDrawable.setText(AndroidUtilities.formatWholeNumber(storyViews.reactions.get(i).count, 0), z2);
                    if (z) {
                        return;
                    }
                    animatedFloat.set(this.hasCounter ? 1.0f : 0.0f, true);
                    return;
                }
            }
        }
        this.hasCounter = false;
        invalidate();
        if (z) {
            return;
        }
        animatedFloat.set(this.hasCounter ? 1.0f : 0.0f, true);
    }
}
