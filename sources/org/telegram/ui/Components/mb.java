package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class mb extends FrameLayout {
    public final t5 f28405a;
    public final t5 f28406b;
    public final Paint f28407c;
    public final RectF d;
    public final long e;
    public final nb f28408f;

    public mb(nb nbVar, Activity activity) {
        super(activity);
        this.f28408f = nbVar;
        gr grVar = gr.h;
        this.f28405a = new t5(this, 320L, grVar);
        this.f28406b = new t5(this, 320L, grVar);
        Paint paint = new Paint(1);
        this.f28407c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.e = System.currentTimeMillis();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i10;
        nb nbVar = this.f28408f;
        float e = this.f28405a.e(false, nbVar.f28734a);
        if (nbVar.f28734a >= 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d = this.f28406b.d(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RectF rectF = this.d;
        rectF.set(width - org.telegram.messenger.i0.N(13.0f), height - org.telegram.messenger.i0.N(13.0f), org.telegram.messenger.i0.N(13.0f) + width, org.telegram.messenger.i0.N(13.0f) + height);
        float currentTimeMillis = (((float) (System.currentTimeMillis() - this.e)) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i11 = 0; i11 < 4; i11++) {
            u1.a aVar = kp.h;
            aVar.getInterpolation((currentTimeMillis - (i11 * 1350)) / 667.0f);
            max += aVar.getInterpolation((currentTimeMillis - (i10 + 667)) / 667.0f) * 250.0f;
        }
        int r12 = org.telegram.ui.ActionBar.t6.r1((1.0f - d) * 1.0f, -1);
        Paint paint = this.f28407c;
        paint.setColor(r12);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, e) * (-360.0f), false, paint);
        if (e < 1.0f && d < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
