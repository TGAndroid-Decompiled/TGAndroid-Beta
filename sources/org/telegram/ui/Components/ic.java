package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ic extends FrameLayout {
    public final g6 f27121a;
    public final g6 f27122b;
    public final Paint f27123c;
    public final RectF d;
    public final long f27124e;
    public final jc f27125f;

    public ic(jc jcVar, Activity activity) {
        super(activity);
        this.f27125f = jcVar;
        js jsVar = js.h;
        this.f27121a = new g6(this, 320L, jsVar);
        this.f27122b = new g6(this, 320L, jsVar);
        Paint paint = new Paint(1);
        this.f27123c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.f27124e = System.currentTimeMillis();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i10;
        jc jcVar = this.f27125f;
        float d = this.f27121a.d(jcVar.f27441a, false);
        if (jcVar.f27441a >= 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e7 = this.f27122b.e(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RectF rectF = this.d;
        rectF.set(width - AndroidUtilities.dpf2(13.0f), height - AndroidUtilities.dpf2(13.0f), AndroidUtilities.dpf2(13.0f) + width, AndroidUtilities.dpf2(13.0f) + height);
        float currentTimeMillis = (((float) (System.currentTimeMillis() - this.f27124e)) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i11 = 0; i11 < 4; i11++) {
            u1.a aVar = lq.h;
            aVar.getInterpolation((currentTimeMillis - (i11 * 1350)) / 667.0f);
            max += aVar.getInterpolation((currentTimeMillis - (i10 + 667)) / 667.0f) * 250.0f;
        }
        int m12 = org.telegram.ui.ActionBar.h6.m1((1.0f - e7) * 1.0f, -1);
        Paint paint = this.f27123c;
        paint.setColor(m12);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, d) * (-360.0f), false, paint);
        if (d < 1.0f && e7 < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
