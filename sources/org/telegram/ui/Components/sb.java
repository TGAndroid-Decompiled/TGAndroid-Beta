package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class sb extends FrameLayout {
    public final w5 f37947a;
    public final w5 f37948b;
    public final Paint f37949c;
    public final RectF d;
    public final long f37950e;
    public final tb f37951f;

    public sb(tb tbVar, Activity activity) {
        super(activity);
        this.f37951f = tbVar;
        xq xqVar = xq.h;
        this.f37947a = new w5(this, 320L, xqVar);
        this.f37948b = new w5(this, 320L, xqVar);
        Paint paint = new Paint(1);
        this.f37949c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.f37950e = System.currentTimeMillis();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z9;
        int i7;
        tb tbVar = this.f37951f;
        float e10 = this.f37947a.e(false, tbVar.f38306a);
        if (tbVar.f38306a >= 1.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        float d = this.f37948b.d(z9);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RectF rectF = this.d;
        rectF.set(width - org.telegram.messenger.g0.N(13.0f), height - org.telegram.messenger.g0.N(13.0f), org.telegram.messenger.g0.N(13.0f) + width, org.telegram.messenger.g0.N(13.0f) + height);
        float currentTimeMillis = (((float) (System.currentTimeMillis() - this.f37950e)) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i10 = 0; i10 < 4; i10++) {
            x1.a aVar = cp.h;
            aVar.getInterpolation((currentTimeMillis - (i10 * 1350)) / 667.0f);
            max += aVar.getInterpolation((currentTimeMillis - (i7 + 667)) / 667.0f) * 250.0f;
        }
        int r12 = org.telegram.ui.ActionBar.k6.r1((1.0f - d) * 1.0f, -1);
        Paint paint = this.f37949c;
        paint.setColor(r12);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, e10) * (-360.0f), false, paint);
        if (e10 < 1.0f && d < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
