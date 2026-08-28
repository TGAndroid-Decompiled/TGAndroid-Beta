package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class c70 extends ReplacementSpan {
    public final Paint f37080a;
    public final ImageReceiver f37081b;
    public final float f37082c;
    public float d;
    public final View f37083e;
    public boolean f37084f;
    public float h;
    public int f37085n;

    public c70(View view, float f10, int i9) {
        e5 e5Var = new e5(this, 2);
        this.f37084f = true;
        this.f37085n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f37081b = imageReceiver;
        imageReceiver.setCurrentAccount(i9);
        this.f37082c = f10;
        Paint paint = new Paint(1);
        this.f37080a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        View view2 = this.f37083e;
        if (view2 != view) {
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(e5Var);
                if (this.f37083e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.onDetachedFromWindow();
                }
            }
            View view3 = this.f37083e;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.onAttachedToWindow();
            }
            this.f37083e = view;
            imageReceiver.setParentView(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(e5Var);
            }
        }
    }

    public final void a(float f10) {
        float dp = AndroidUtilities.dp(f10);
        this.d = dp;
        this.f37081b.setRoundRadius((int) dp);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        boolean z10 = this.f37084f;
        Paint paint2 = this.f37080a;
        if (z10 && this.f37085n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.f37085n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.f6.l1(this.f37085n / 255.0f, 855638016));
        }
        float f11 = this.h + f10;
        float dp = (((i11 + i13) / 2.0f) + 0.0f) - (AndroidUtilities.dp(this.f37082c) / 2.0f);
        if (this.f37084f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f11, dp, AndroidUtilities.dp(this.f37082c) + f11, AndroidUtilities.dp(this.f37082c) + dp);
            float f12 = this.d;
            canvas.drawRoundRect(rectF, f12, f12, paint2);
        }
        ImageReceiver imageReceiver = this.f37081b;
        imageReceiver.setImageCoords(f11, dp, AndroidUtilities.dp(this.f37082c), AndroidUtilities.dp(this.f37082c));
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.draw(canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.f37082c);
    }
}
