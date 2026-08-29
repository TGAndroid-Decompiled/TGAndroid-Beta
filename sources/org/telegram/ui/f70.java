package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class f70 extends ReplacementSpan {
    public final Paint f38010a;
    public final ImageReceiver f38011b;
    public final float f38012c;
    public float d;
    public final View f38013e;
    public boolean f38014f;
    public float h;
    public int f38015n;

    public f70(View view, float f9, int i10) {
        f5 f5Var = new f5(this, 2);
        this.f38014f = true;
        this.f38015n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f38011b = imageReceiver;
        imageReceiver.setCurrentAccount(i10);
        this.f38012c = f9;
        Paint paint = new Paint(1);
        this.f38010a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        View view2 = this.f38013e;
        if (view2 != view) {
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(f5Var);
                if (this.f38013e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.onDetachedFromWindow();
                }
            }
            View view3 = this.f38013e;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.onAttachedToWindow();
            }
            this.f38013e = view;
            imageReceiver.setParentView(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(f5Var);
            }
        }
    }

    public final void a(float f9) {
        float dp = AndroidUtilities.dp(f9);
        this.d = dp;
        this.f38011b.setRoundRadius((int) dp);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        boolean z10 = this.f38014f;
        Paint paint2 = this.f38010a;
        if (z10 && this.f38015n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.f38015n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.g6.l1(this.f38015n / 255.0f, 855638016));
        }
        float f10 = this.h + f9;
        float dp = (((i12 + i14) / 2.0f) + 0.0f) - (AndroidUtilities.dp(this.f38012c) / 2.0f);
        if (this.f38014f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f10, dp, AndroidUtilities.dp(this.f38012c) + f10, AndroidUtilities.dp(this.f38012c) + dp);
            float f11 = this.d;
            canvas.drawRoundRect(rectF, f11, f11, paint2);
        }
        ImageReceiver imageReceiver = this.f38011b;
        imageReceiver.setImageCoords(f10, dp, AndroidUtilities.dp(this.f38012c), AndroidUtilities.dp(this.f38012c));
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.draw(canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.f38012c);
    }
}
