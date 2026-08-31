package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class q70 extends ReplacementSpan {
    public final Paint f40361a;
    public final ImageReceiver f40362b;
    public final float f40363c;
    public float d;
    public final View f40364e;
    public boolean f40365f;
    public float h;
    public int f40366n;

    public q70(View view, float f10, int i10) {
        h5 h5Var = new h5(this, 2);
        this.f40365f = true;
        this.f40366n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f40362b = imageReceiver;
        imageReceiver.setCurrentAccount(i10);
        this.f40363c = f10;
        Paint paint = new Paint(1);
        this.f40361a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        View view2 = this.f40364e;
        if (view2 != view) {
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(h5Var);
                if (this.f40364e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.onDetachedFromWindow();
                }
            }
            View view3 = this.f40364e;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.onAttachedToWindow();
            }
            this.f40364e = view;
            imageReceiver.setParentView(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(h5Var);
            }
        }
    }

    public final void a(float f10) {
        float dp = AndroidUtilities.dp(f10);
        this.d = dp;
        this.f40362b.setRoundRadius((int) dp);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        boolean z4 = this.f40365f;
        Paint paint2 = this.f40361a;
        if (z4 && this.f40366n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.f40366n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.k6.l1(this.f40366n / 255.0f, 855638016));
        }
        float f11 = this.h + f10;
        float dp = (((i12 + i14) / 2.0f) + 0.0f) - (AndroidUtilities.dp(this.f40363c) / 2.0f);
        if (this.f40365f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f11, dp, AndroidUtilities.dp(this.f40363c) + f11, AndroidUtilities.dp(this.f40363c) + dp);
            float f12 = this.d;
            canvas.drawRoundRect(rectF, f12, f12, paint2);
        }
        ImageReceiver imageReceiver = this.f40362b;
        imageReceiver.setImageCoords(f11, dp, AndroidUtilities.dp(this.f40363c), AndroidUtilities.dp(this.f40363c));
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.draw(canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.f40363c);
    }
}
