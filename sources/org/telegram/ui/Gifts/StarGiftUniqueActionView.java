package org.telegram.ui.Gifts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Stars.StarGiftUniqueActionLayout;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;

public final class StarGiftUniqueActionView extends View {
    public Drawable background;
    public final StarGiftUniqueActionLayout layout;
    public float layoutX;
    public float layoutY;
    public final Theme.ResourcesProvider resourcesProvider;

    public StarGiftUniqueActionView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        StarGiftUniqueActionLayout starGiftUniqueActionLayout = new StarGiftUniqueActionLayout(resourcesProvider, this, i);
        this.layout = starGiftUniqueActionLayout;
        starGiftUniqueActionLayout.messageDrawable.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public StarGiftUniqueActionLayout getLayout() {
        return this.layout;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        StarGiftUniqueActionLayout starGiftUniqueActionLayout = this.layout;
        starGiftUniqueActionLayout.attached = true;
        if (starGiftUniqueActionLayout.action != null) {
            starGiftUniqueActionLayout.imageReceiver.onAttachedToWindow();
            starGiftUniqueActionLayout.emoji.attach();
            starGiftUniqueActionLayout.messageDrawable.avatarReceiver.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        StarGiftUniqueActionLayout starGiftUniqueActionLayout = this.layout;
        starGiftUniqueActionLayout.attached = false;
        starGiftUniqueActionLayout.imageReceiver.onDetachedFromWindow();
        starGiftUniqueActionLayout.emoji.detach();
        GiftMessageDrawable giftMessageDrawable = starGiftUniqueActionLayout.messageDrawable;
        giftMessageDrawable.avatarReceiver.onDetachedFromWindow();
        AnimatedEmojiSpan.release((View) null, giftMessageDrawable.emojiGroupedSpans);
        giftMessageDrawable.emojiGroupedSpans = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(0.0f, getY(), getMeasuredWidth(), height);
        } else {
            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, getMeasuredWidth(), height, 0.0f, getY());
        }
        StarGiftUniqueActionLayout starGiftUniqueActionLayout = this.layout;
        this.layoutX = (getWidth() - ((int) starGiftUniqueActionLayout.animatorVisualWidth.factor)) / 2.0f;
        float fDp = starGiftUniqueActionLayout.animatorVisualWidth.factor + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - fDp) / 2.0f;
        float fDp2 = this.layoutY - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, fDp2, fDp + width, starGiftUniqueActionLayout.height + fDp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.background.setBounds(rect);
        this.background.draw(canvas);
        canvas.save();
        canvas.translate(this.layoutX, this.layoutY);
        starGiftUniqueActionLayout.draw(canvas);
        starGiftUniqueActionLayout.drawOutbounds(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        StarGiftUniqueActionLayout starGiftUniqueActionLayout = this.layout;
        int i3 = (int) starGiftUniqueActionLayout.animatorVisualWidth.factor;
        int i4 = starGiftUniqueActionLayout.height;
        this.layoutX = (size - i3) / 2.0f;
        float paddingTop = getPaddingTop();
        this.layoutY = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + i4);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.layout.onTouchEvent(this.layoutX, this.layoutY, motionEvent);
    }

    public final void set(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z) {
        StarGiftUniqueActionLayout starGiftUniqueActionLayout = this.layout;
        starGiftUniqueActionLayout.widthExpanded = false;
        starGiftUniqueActionLayout.action = null;
        starGiftUniqueActionLayout.currentMessageObject = null;
        starGiftUniqueActionLayout.repost = false;
        starGiftUniqueActionLayout.backdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        starGiftUniqueActionLayout.pattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = starGiftUniqueActionLayout.model;
        starGiftUniqueActionLayout.model = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = starGiftUniqueActionLayout.backgroundPaint;
        starGiftUniqueActionLayout.gradient = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = starGiftUniqueActionLayout.pattern;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = starGiftUniqueActionLayout.emoji;
        if (stargiftattributepattern != null) {
            swapAnimatedEmojiDrawable.set(stargiftattributepattern.document, swapAnimatedEmojiDrawable.cacheType, false);
        } else {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = starGiftUniqueActionLayout.model;
        ImageReceiver imageReceiver = starGiftUniqueActionLayout.imageReceiver;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            StarsIntroActivity.setGiftImage(imageReceiver, starGiftUniqueActionLayout.model.document, 110);
        }
        boolean z2 = tL_starGiftUnique.burned;
        starGiftUniqueActionLayout.burned = z2;
        GiftSheet.RibbonDrawable ribbonDrawable = starGiftUniqueActionLayout.ribbon;
        if (z2) {
            int color = Theme.getColor(Theme.key_text_RedBold, starGiftUniqueActionLayout.resourcesProvider);
            ribbonDrawable.paint.setShader(null);
            ribbonDrawable.paint.setColor(color);
            ribbonDrawable.setText(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            ribbonDrawable.setBackdrop(starGiftUniqueActionLayout.backdrop, true, false);
            ribbonDrawable.setText(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (starGiftUniqueActionLayout.attached) {
            imageReceiver.onAttachedToWindow();
            swapAnimatedEmojiDrawable.attach();
            starGiftUniqueActionLayout.messageDrawable.avatarReceiver.onAttachedToWindow();
        }
        starGiftUniqueActionLayout.width = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            starGiftUniqueActionLayout.width = (int) (starGiftUniqueActionLayout.width * 1.2f);
        }
        starGiftUniqueActionLayout.width -= AndroidUtilities.dp(8.0f);
        starGiftUniqueActionLayout.setInternal2(tL_starGiftUnique, j, tL_textWithEntities, str);
        FactorAnimator factorAnimator = starGiftUniqueActionLayout.animatorVisualWidth;
        if (z) {
            int iRound = Math.round(factorAnimator.isAnimating ? factorAnimator.toFactor : factorAnimator.factor);
            int i = starGiftUniqueActionLayout.width;
            if (iRound != i) {
                factorAnimator.animateTo(i);
            }
        } else {
            factorAnimator.forceFactor(starGiftUniqueActionLayout.width);
        }
        requestLayout();
        invalidate();
    }

    public void setLayoutBackground(Drawable drawable) {
        this.background = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.layout.messageDrawable;
    }
}
