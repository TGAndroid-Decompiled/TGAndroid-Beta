package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yb extends FrameLayout {
    public final z5 f33427a;
    public final z5 f33428b;
    public final Paint f33429c;
    public final RectF d;
    public final long f33430e;
    public final zb f33431f;

    public yb(zb zbVar, Activity activity) {
        super(activity);
        this.f33431f = zbVar;
        pr prVar = pr.h;
        this.f33427a = new z5(this, 320L, prVar);
        this.f33428b = new z5(this, 320L, prVar);
        Paint paint = new Paint(1);
        this.f33429c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.f33430e = System.currentTimeMillis();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z4;
        zb zbVar = this.f33431f;
        float d = this.f33427a.d(zbVar.f33850a, false);
        if (zbVar.f33850a >= 1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        float e6 = this.f33428b.e(z4);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RectF rectF = this.d;
        rectF.set(width - AndroidUtilities.dpf2(13.0f), height - AndroidUtilities.dpf2(13.0f), AndroidUtilities.dpf2(13.0f) + width, AndroidUtilities.dpf2(13.0f) + height);
        float currentTimeMillis = (((float) (System.currentTimeMillis() - this.f33430e)) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i10 = 0; i10 < 4; i10++) {
            u1.a aVar = tp.h;
            int i11 = i10 * 1350;
            aVar.getInterpolation((currentTimeMillis - i11) / 667.0f);
            max += aVar.getInterpolation((currentTimeMillis - (i11 + 667)) / 667.0f) * 250.0f;
        }
        int l1 = org.telegram.ui.ActionBar.k6.l1((1.0f - e6) * 1.0f, -1);
        Paint paint = this.f33429c;
        paint.setColor(l1);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, d) * (-360.0f), false, paint);
        if (d < 1.0f && e6 < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
