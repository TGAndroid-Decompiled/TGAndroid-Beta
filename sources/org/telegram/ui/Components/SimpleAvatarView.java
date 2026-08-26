package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.Theme;

public final class SimpleAvatarView extends View {
    public ValueAnimator animator;
    public final AvatarDrawable avatarDrawable;
    public final ImageReceiver avatarImage;
    public boolean isAvatarHidden;
    public final Paint selectPaint;
    public float selectProgress;

    public SimpleAvatarView(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.avatarImage = imageReceiver;
        this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        Paint paint = new Paint(1);
        this.selectPaint = paint;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    public final boolean isSelected() {
        return this.selectProgress == 1.0f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.avatarImage.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.avatarImage.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f = (this.selectProgress * 0.1f) + 0.9f;
        canvas.scale(f, f);
        Paint paint = this.selectPaint;
        paint.setColor(Theme.getColor(null, Theme.key_dialogTextBlue, false));
        paint.setAlpha((int) (Color.alpha(paint.getColor()) * this.selectProgress));
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
        canvas.drawArc(rectF, -90.0f, this.selectProgress * 360.0f, false, paint);
        canvas.restore();
        if (this.isAvatarHidden) {
            return;
        }
        float strokeWidth2 = paint.getStrokeWidth() * 2.5f * this.selectProgress;
        ImageReceiver imageReceiver = this.avatarImage;
        float f2 = 2.0f * strokeWidth2;
        imageReceiver.setImageCoords(strokeWidth2, strokeWidth2, getWidth() - f2, getHeight() - f2);
        imageReceiver.draw(canvas);
    }

    public void setAvatar(TLObject tLObject) {
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(tLObject);
        this.avatarImage.setForUserOrChat(tLObject, avatarDrawable);
    }

    public void setHideAvatar(boolean z) {
        this.isAvatarHidden = z;
        invalidate();
    }

    public final void setSelected(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z2) {
            this.selectProgress = z ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.selectProgress, z ? 1.0f : 0.0f).setDuration(200L);
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        duration.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 20));
        duration.addListener(new Tooltip.AnonymousClass1(this, 6));
        duration.start();
        this.animator = duration;
    }
}
