package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.Theme;

public final class ImageReceiverSpan extends ReplacementSpan {
    public final ImageReceiver imageReceiver;
    public final View parent;
    public float radius;
    public boolean shadowEnabled;
    public final Paint shadowPaint;
    public int shadowPaintAlpha;
    public final float sz;
    public float translateX;

    public ImageReceiverSpan(View view, float f, int i) {
        AvatarSpan.AnonymousClass1 anonymousClass1 = new AvatarSpan.AnonymousClass1(this, 13);
        this.shadowEnabled = true;
        this.shadowPaintAlpha = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.imageReceiver = imageReceiver;
        imageReceiver.setCurrentAccount(i);
        this.sz = f;
        Paint paint = new Paint(1);
        this.shadowPaint = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        View view2 = this.parent;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(anonymousClass1);
            if (this.parent.isAttachedToWindow() && !view.isAttachedToWindow()) {
                imageReceiver.onDetachedFromWindow();
            }
        }
        View view3 = this.parent;
        if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        this.parent = view;
        imageReceiver.setParentView(view);
        if (view != null) {
            view.addOnAttachStateChangeListener(anonymousClass1);
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        boolean z = this.shadowEnabled;
        Paint paint2 = this.shadowPaint;
        if (z && this.shadowPaintAlpha != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.shadowPaintAlpha = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), Theme.multAlpha(this.shadowPaintAlpha / 255.0f, 855638016));
        }
        float f2 = this.translateX + f;
        float f3 = this.sz;
        float fDp = (((i3 + i5) / 2.0f) + 0.0f) - (AndroidUtilities.dp(f3) / 2.0f);
        if (this.shadowEnabled) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f2, fDp, AndroidUtilities.dp(f3) + f2, AndroidUtilities.dp(f3) + fDp);
            float f4 = this.radius;
            canvas.drawRoundRect(rectF, f4, f4, paint2);
        }
        ImageReceiver imageReceiver = this.imageReceiver;
        imageReceiver.setImageCoords(f2, fDp, AndroidUtilities.dp(f3), AndroidUtilities.dp(f3));
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.draw(canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.sz);
    }
}
