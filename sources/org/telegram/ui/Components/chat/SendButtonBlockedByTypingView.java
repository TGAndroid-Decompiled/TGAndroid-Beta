package org.telegram.ui.Components.chat;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.TypingDotsDrawable;

public final class SendButtonBlockedByTypingView extends View {
    public final int $r8$classId = 0;
    public final Object animatorStopAllowed;
    public final Paint paint;
    public final Object resourcesProvider;
    public final Object typingDotsDrawable;

    public SendButtonBlockedByTypingView(Activity activity, Theme.ResourcesProvider resourcesProvider) {
        super(activity);
        this.animatorStopAllowed = new BoolAnimator(380L, this, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.paint = new Paint(1);
        this.resourcesProvider = resourcesProvider;
        TypingDotsDrawable typingDotsDrawable = new TypingDotsDrawable(true);
        this.typingDotsDrawable = typingDotsDrawable;
        typingDotsDrawable.setCallback(this);
        Paint paint = typingDotsDrawable.currentPaint;
        if (paint != null) {
            paint.setColor(-1);
        }
        typingDotsDrawable.ignoreAnimationLocks = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.$r8$classId) {
            case 0:
                super.onAttachedToWindow();
                ((TypingDotsDrawable) this.typingDotsDrawable).start();
                break;
            case 1:
                super.onAttachedToWindow();
                ((ImageReceiver) this.animatorStopAllowed).onAttachedToWindow();
                ((ImageReceiver) this.resourcesProvider).onAttachedToWindow();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.$r8$classId) {
            case 0:
                super.onDetachedFromWindow();
                ((TypingDotsDrawable) this.typingDotsDrawable).stop();
                break;
            case 1:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.animatorStopAllowed).onDetachedFromWindow();
                ((ImageReceiver) this.resourcesProvider).onDetachedFromWindow();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.$r8$classId) {
            case 0:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                Paint paint = this.paint;
                paint.setColor(Theme.getColor(Theme.key_chat_messagePanelSend, (Theme.ResourcesProvider) this.resourcesProvider));
                canvas.drawCircle(width, height, AndroidUtilities.dp(19.0f), paint);
                float f = ((BoolAnimator) this.animatorStopAllowed).floatValue;
                float f2 = 1.0f - f;
                if (f2 > 0.0f) {
                    DrawableUtils.drawWithScale(canvas, (TypingDotsDrawable) this.typingDotsDrawable, f2 * 1.35f);
                    invalidate();
                }
                if (f > 0.0f) {
                    float fDp = AndroidUtilities.dp(6.666f) * f;
                    float fDp2 = AndroidUtilities.dp(2.666f) * f;
                    canvas.drawRoundRect(width - fDp, height - fDp, width + fDp, height + fDp, fDp2, fDp2, Theme.fillingPaint(-1));
                }
                break;
            case 1:
                int width2 = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
                int height2 = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
                ImageReceiver imageReceiver = (ImageReceiver) this.animatorStopAllowed;
                float f3 = height2;
                imageReceiver.setImageCoords(width2, f3, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver.draw(canvas);
                canvas.save();
                canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
                canvas.drawPath((Path) this.typingDotsDrawable, this.paint);
                canvas.restore();
                ImageReceiver imageReceiver2 = (ImageReceiver) this.resourcesProvider;
                imageReceiver2.setImageCoords(AndroidUtilities.dp(96.0f) + width2, f3, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver2.draw(canvas);
                break;
            default:
                super.onDraw(canvas);
                RectF rectF = (RectF) this.typingDotsDrawable;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.paint);
                rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, (Paint) this.resourcesProvider);
                rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, (Paint) this.animatorStopAllowed);
                break;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        switch (this.$r8$classId) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.$r8$classId) {
            case 0:
                super.onSizeChanged(i, i2, i3, i4);
                DrawableUtils.setBounds((TypingDotsDrawable) this.typingDotsDrawable, i / 2.0f, i2 / 2.0f, 17);
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.$r8$classId) {
            case 0:
                return super.verifyDrawable(drawable) || (drawable == ((TypingDotsDrawable) this.typingDotsDrawable) && !((BoolAnimator) this.animatorStopAllowed).value);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public SendButtonBlockedByTypingView(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.typingDotsDrawable = path;
        Paint paint = new Paint(1);
        this.paint = paint;
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable.setInfo(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.animatorStopAllowed = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
        AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable2.setInfo(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.resourcesProvider = imageReceiver2;
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver2.setForUserOrChat(tLObject2, avatarDrawable2);
        paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText7, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        path.rewind();
        path.moveTo(0.0f, -AndroidUtilities.dp(8.0f));
        path.lineTo(AndroidUtilities.dp(6.166f), 0.0f);
        path.lineTo(0.0f, AndroidUtilities.dp(8.0f));
    }

    public SendButtonBlockedByTypingView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        Paint paint = new Paint(1);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        this.animatorStopAllowed = paint2;
        Paint paint3 = new Paint(1);
        this.resourcesProvider = paint3;
        this.typingDotsDrawable = new RectF();
        paint2.setColor(-1);
        paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
        paint3.setColor(Theme.getColor(Theme.key_color_red, resourcesProvider));
    }
}
