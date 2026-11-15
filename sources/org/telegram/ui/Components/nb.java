package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class nb extends FrameLayout {
    public final u5 f37520a;
    public final u5 f37521b;
    public final Paint f37522c;
    public final RectF d;
    public final long f37523e;
    public final ob f37524f;

    public nb(ob obVar, Activity activity) {
        super(activity);
        this.f37524f = obVar;
        er erVar = er.h;
        this.f37520a = new u5(this, 320L, erVar);
        this.f37521b = new u5(this, 320L, erVar);
        Paint paint = new Paint(1);
        this.f37522c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.f37523e = System.currentTimeMillis();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i7;
        ob obVar = this.f37524f;
        float e10 = this.f37520a.e(false, obVar.f37909a);
        if (obVar.f37909a >= 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d = this.f37521b.d(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RectF rectF = this.d;
        rectF.set(width - org.telegram.messenger.g0.N(13.0f), height - org.telegram.messenger.g0.N(13.0f), org.telegram.messenger.g0.N(13.0f) + width, org.telegram.messenger.g0.N(13.0f) + height);
        float currentTimeMillis = (((float) (System.currentTimeMillis() - this.f37523e)) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i10 = 0; i10 < 4; i10++) {
            x1.a aVar = lp.h;
            aVar.getInterpolation((currentTimeMillis - (i10 * 1350)) / 667.0f);
            max += aVar.getInterpolation((currentTimeMillis - (i7 + 667)) / 667.0f) * 250.0f;
        }
        int r12 = org.telegram.ui.ActionBar.j6.r1((1.0f - d) * 1.0f, -1);
        Paint paint = this.f37522c;
        paint.setColor(r12);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, e10) * (-360.0f), false, paint);
        if (e10 < 1.0f && d < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
