package org.telegram.ui.Components.Paint.Views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Reactions.ReactionImageHolder;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RectOld;
import org.telegram.ui.Components.Size;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.Stories.StoryReactionWidgetBackground;

public final class ReactionWidgetEntityView extends EntityView {
    public final Size baseSize;
    public final AnimatedFloat crossfadeBackgrounds;
    public ReactionsLayoutInBubble.VisibleReaction currentReaction;
    public float drawScale;
    public boolean mirror;
    public ReactionImageHolder nextReactionHolder;
    public StoryReactionWidgetBackground outBackground;
    public final AnimatedFloat progressToNext;
    public ReactionImageHolder reactionHolder;
    public StoryReactionWidgetBackground storyReactionWidgetBackground;

    public ReactionWidgetEntityView(Context context, PointF pointF, Size size) {
        String str;
        super(context, pointF);
        this.storyReactionWidgetBackground = new StoryReactionWidgetBackground(this);
        this.outBackground = new StoryReactionWidgetBackground(this);
        this.reactionHolder = new ReactionImageHolder(this);
        this.nextReactionHolder = new ReactionImageHolder(this);
        AnimatedFloat animatedFloat = new AnimatedFloat(this);
        this.progressToNext = animatedFloat;
        AnimatedFloat animatedFloat2 = new AnimatedFloat(this);
        this.crossfadeBackgrounds = animatedFloat2;
        this.drawScale = 1.0f;
        this.baseSize = size;
        animatedFloat2.set(1.0f, true);
        animatedFloat.set(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        ReactionImageHolder reactionImageHolder = this.reactionHolder;
        for (int i = 0; i < reactionsList.size(); i++) {
            if (reactionsList.get(i).title.equals("Red Heart")) {
                str = reactionsList.get(i).reaction;
                ReactionsLayoutInBubble.VisibleReaction visibleReactionFromEmojicon = ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(str);
                this.currentReaction = visibleReactionFromEmojicon;
                reactionImageHolder.setVisibleReaction(visibleReactionFromEmojicon);
                updatePosition();
            }
        }
        str = reactionsList.get(0).reaction;
        ReactionsLayoutInBubble.VisibleReaction visibleReactionFromEmojicon2 = ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(str);
        this.currentReaction = visibleReactionFromEmojicon2;
        reactionImageHolder.setVisibleReaction(visibleReactionFromEmojicon2);
        updatePosition();
    }

    public final void changeStyle(boolean z) {
        if (z) {
            this.outBackground = this.storyReactionWidgetBackground;
            StoryReactionWidgetBackground storyReactionWidgetBackground = new StoryReactionWidgetBackground(this);
            this.storyReactionWidgetBackground = storyReactionWidgetBackground;
            if (this.outBackground.style != 1) {
                int i = storyReactionWidgetBackground.style + 1;
                storyReactionWidgetBackground.style = i;
                if (i >= 2) {
                    storyReactionWidgetBackground.style = 0;
                }
            }
            storyReactionWidgetBackground.setMirror(this.mirror, false);
            this.storyReactionWidgetBackground.updateShadowLayer(getScaleX());
            this.crossfadeBackgrounds.set(0.0f, true);
        } else {
            StoryReactionWidgetBackground storyReactionWidgetBackground2 = this.storyReactionWidgetBackground;
            int i2 = storyReactionWidgetBackground2.style + 1;
            storyReactionWidgetBackground2.style = i2;
            if (i2 >= 2) {
                storyReactionWidgetBackground2.style = 0;
            }
        }
        invalidate();
    }

    @Override
    public final EntityView.SelectionView createSelectionView() {
        return new RoundView.RoundViewSelectionView(this, getContext());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int padding = getPadding();
        float f = this.crossfadeBackgrounds.set(1.0f, false);
        if (f == 1.0f) {
            this.outBackground = null;
        }
        canvas.save();
        float f2 = this.drawScale;
        canvas.scale(f2, f2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        StoryReactionWidgetBackground storyReactionWidgetBackground = this.outBackground;
        Size size = this.baseSize;
        if (storyReactionWidgetBackground != null) {
            storyReactionWidgetBackground.alpha = (int) ((1.0f - f) * 255.0f);
            storyReactionWidgetBackground.setBounds(padding, padding, ((int) size.width) - padding, ((int) size.height) - padding);
            this.outBackground.draw(canvas);
        }
        StoryReactionWidgetBackground storyReactionWidgetBackground2 = this.storyReactionWidgetBackground;
        storyReactionWidgetBackground2.alpha = (int) (f * 255.0f);
        storyReactionWidgetBackground2.setBounds(padding, padding, ((int) size.width) - padding, ((int) size.height) - padding);
        this.storyReactionWidgetBackground.draw(canvas);
        float fWidth = this.storyReactionWidgetBackground.getBounds().width() * 0.61f;
        Rect rect = AndroidUtilities.rectTmp2;
        float f3 = fWidth / 2.0f;
        rect.set((int) (this.storyReactionWidgetBackground.getBounds().centerX() - f3), (int) (this.storyReactionWidgetBackground.getBounds().centerY() - f3), (int) (this.storyReactionWidgetBackground.getBounds().centerX() + f3), (int) (this.storyReactionWidgetBackground.getBounds().centerY() + f3));
        float f4 = this.progressToNext.set(1.0f, false);
        this.reactionHolder.bounds.set(rect);
        this.nextReactionHolder.bounds.set(rect);
        ReactionImageHolder reactionImageHolder = this.reactionHolder;
        int i = this.storyReactionWidgetBackground.style == 1 ? -1 : -16777216;
        if (reactionImageHolder.lastColorForFilter != i) {
            reactionImageHolder.lastColorForFilter = i;
            reactionImageHolder.colorFilter = new PorterDuffColorFilter(reactionImageHolder.lastColorForFilter, PorterDuff.Mode.SRC_ATOP);
            View view = reactionImageHolder.parent;
            if (view != null) {
                view.invalidate();
            }
        }
        if (f4 == 1.0f) {
            this.reactionHolder.draw(canvas);
        } else {
            canvas.save();
            float f5 = 1.0f - f4;
            canvas.scale(f5, f5, rect.centerX(), rect.top);
            ReactionImageHolder reactionImageHolder2 = this.nextReactionHolder;
            reactionImageHolder2.alpha = f5;
            reactionImageHolder2.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(f4, f4, rect.centerX(), rect.bottom);
            ReactionImageHolder reactionImageHolder3 = this.reactionHolder;
            reactionImageHolder3.alpha = f4;
            reactionImageHolder3.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ReactionsLayoutInBubble.VisibleReaction getCurrentReaction() {
        return this.currentReaction;
    }

    @Override
    public float getMaxScale() {
        return 1.8f;
    }

    @Override
    public float getMinScale() {
        return 0.5f;
    }

    public int getPadding() {
        return (int) ((this.baseSize.height - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override
    public RectOld getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new RectOld();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f = scale / 2.0f;
        float f2 = scale * scaleX;
        return new RectOld((getPositionX() - f) * scaleX, (getPositionY() - f) * scaleX, f2, f2);
    }

    public final boolean isDark() {
        return this.storyReactionWidgetBackground.style == 1;
    }

    public final boolean isMirrored() {
        return this.mirror;
    }

    public final void mirror(boolean z) {
        boolean z2 = false;
        boolean z3 = !this.mirror;
        this.mirror = z3;
        if (!z) {
            this.storyReactionWidgetBackground.setMirror(z3, z);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(14, this, zArr));
        valueAnimatorOfFloat.addListener(new ChatActivity.AnonymousClass74(this, zArr, z2, 22));
        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        valueAnimatorOfFloat.setDuration(350L);
        valueAnimatorOfFloat.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.reactionHolder.onAttachedToWindow(true);
        this.nextReactionHolder.onAttachedToWindow(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.reactionHolder.onAttachedToWindow(false);
        this.nextReactionHolder.onAttachedToWindow(false);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        Size size = this.baseSize;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) size.width, 1073741824), View.MeasureSpec.makeMeasureSpec((int) size.height, 1073741824));
    }

    public final void setCurrentReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z) {
        if (Objects.equals(this.currentReaction, visibleReaction)) {
            return;
        }
        if (!z) {
            this.currentReaction = visibleReaction;
            this.reactionHolder.setVisibleReaction(visibleReaction);
            invalidate();
            return;
        }
        this.currentReaction = visibleReaction;
        this.nextReactionHolder.setVisibleReaction(visibleReaction);
        ReactionImageHolder reactionImageHolder = this.reactionHolder;
        this.reactionHolder = this.nextReactionHolder;
        this.nextReactionHolder = reactionImageHolder;
        this.progressToNext.set(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f) {
        if (getScaleX() != f) {
            super.setScaleX(f);
            this.storyReactionWidgetBackground.updateShadowLayer(f);
            invalidate();
        }
    }

    @Override
    public final void updatePosition() {
        Size size = this.baseSize;
        float f = size.width / 2.0f;
        float f2 = size.height / 2.0f;
        setX(getPositionX() - f);
        setY(getPositionY() - f2);
        EntityView.SelectionView selectionView = this.selectionView;
        if (selectionView != null) {
            selectionView.updatePosition();
        }
    }
}
