package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class vb extends FrameLayout {
    public final c6 f40617a;
    public final c6 f40618b;
    public final Paint f40619c;
    public final RectF d;
    public final long f40620e;
    public final wb f40621f;

    public vb(wb wbVar, Activity activity) {
        super(activity);
        this.f40621f = wbVar;
        kr krVar = kr.h;
        this.f40617a = new c6(this, 320L, krVar);
        this.f40618b = new c6(this, 320L, krVar);
        Paint paint = new Paint(1);
        this.f40619c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.f40620e = System.currentTimeMillis();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i7;
        wb wbVar = this.f40621f;
        float e10 = this.f40617a.e(false, wbVar.f41567a);
        if (wbVar.f41567a >= 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d = this.f40618b.d(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RectF rectF = this.d;
        rectF.set(width - org.telegram.messenger.g0.N(13.0f), height - org.telegram.messenger.g0.N(13.0f), org.telegram.messenger.g0.N(13.0f) + width, org.telegram.messenger.g0.N(13.0f) + height);
        float currentTimeMillis = (((float) (System.currentTimeMillis() - this.f40620e)) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i10 = 0; i10 < 4; i10++) {
            x1.a aVar = rp.h;
            aVar.getInterpolation((currentTimeMillis - (i10 * 1350)) / 667.0f);
            max += aVar.getInterpolation((currentTimeMillis - (i7 + 667)) / 667.0f) * 250.0f;
        }
        int r12 = org.telegram.ui.ActionBar.n6.r1((1.0f - d) * 1.0f, -1);
        Paint paint = this.f40619c;
        paint.setColor(r12);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, e10) * (-360.0f), false, paint);
        if (e10 < 1.0f && d < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
