package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class b80 extends ReplacementSpan {
    public final Paint f34228a;
    public final ImageReceiver f34229b;
    public final float f34230c;
    public float d;
    public final View e;
    public boolean f34231f;
    public float h;
    public int f34232n;

    public b80(View view, float f7, int i10) {
        j5 j5Var = new j5(this, 2);
        this.f34231f = true;
        this.f34232n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f34229b = imageReceiver;
        imageReceiver.setCurrentAccount(i10);
        this.f34230c = f7;
        Paint paint = new Paint(1);
        this.f34228a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        View view2 = this.e;
        if (view2 != view) {
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(j5Var);
                if (this.e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.onDetachedFromWindow();
                }
            }
            View view3 = this.e;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.onAttachedToWindow();
            }
            this.e = view;
            imageReceiver.setParentView(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(j5Var);
            }
        }
    }

    public final void a(float f7) {
        float dp = AndroidUtilities.dp(f7);
        this.d = dp;
        this.f34229b.setRoundRadius((int) dp);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        boolean z10 = this.f34231f;
        Paint paint2 = this.f34228a;
        if (z10 && this.f34232n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.f34232n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.g6.m1(this.f34232n / 255.0f, 855638016));
        }
        float f10 = this.h + f7;
        float dp = (((i12 + i14) / 2.0f) + 0.0f) - (AndroidUtilities.dp(this.f34230c) / 2.0f);
        if (this.f34231f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f10, dp, AndroidUtilities.dp(this.f34230c) + f10, AndroidUtilities.dp(this.f34230c) + dp);
            float f11 = this.d;
            canvas.drawRoundRect(rectF, f11, f11, paint2);
        }
        ImageReceiver imageReceiver = this.f34229b;
        imageReceiver.setImageCoords(f10, dp, AndroidUtilities.dp(this.f34230c), AndroidUtilities.dp(this.f34230c));
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.draw(canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.f34230c);
    }
}
