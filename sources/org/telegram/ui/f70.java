package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

public final class f70 extends ReplacementSpan {

    public final Paint f37951a;

    public final ImageReceiver f37952b;

    public final float f37953c;
    public float d;

    public final View f37954e;

    public boolean f37955f;
    public float h;

    public int f37956n;

    public f70(View view, float f10, int i10) {
        f5 f5Var = new f5(this, 2);
        this.f37955f = true;
        this.f37956n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f37952b = imageReceiver;
        imageReceiver.setCurrentAccount(i10);
        this.f37953c = f10;
        Paint paint = new Paint(1);
        this.f37951a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        View view2 = this.f37954e;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(f5Var);
            if (this.f37954e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                imageReceiver.onDetachedFromWindow();
            }
        }
        View view3 = this.f37954e;
        if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        this.f37954e = view;
        imageReceiver.setParentView(view);
        if (view != null) {
            view.addOnAttachStateChangeListener(f5Var);
        }
    }

    public final void a(float f10) {
        float fDp = AndroidUtilities.dp(f10);
        this.d = fDp;
        this.f37952b.setRoundRadius((int) fDp);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        boolean z10 = this.f37955f;
        Paint paint2 = this.f37951a;
        if (z10 && this.f37956n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.f37956n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.g6.l1(this.f37956n / 255.0f, 855638016));
        }
        float f11 = this.h + f10;
        float fDp = (((i12 + i14) / 2.0f) + 0.0f) - (AndroidUtilities.dp(this.f37953c) / 2.0f);
        if (this.f37955f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f11, fDp, AndroidUtilities.dp(this.f37953c) + f11, AndroidUtilities.dp(this.f37953c) + fDp);
            float f12 = this.d;
            canvas.drawRoundRect(rectF, f12, f12, paint2);
        }
        float fDp2 = AndroidUtilities.dp(this.f37953c);
        float fDp3 = AndroidUtilities.dp(this.f37953c);
        ImageReceiver imageReceiver = this.f37952b;
        imageReceiver.setImageCoords(f11, fDp, fDp2, fDp3);
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.draw(canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.f37953c);
    }
}
