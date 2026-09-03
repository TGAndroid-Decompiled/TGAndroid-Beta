package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yb extends FrameLayout {
    public final z5 f33448a;
    public final z5 f33449b;
    public final Paint f33450c;
    public final RectF d;
    public final long f33451e;
    public final zb f33452f;

    public yb(zb zbVar, Activity activity) {
        super(activity);
        this.f33452f = zbVar;
        pr prVar = pr.h;
        this.f33448a = new z5(this, 320L, prVar);
        this.f33449b = new z5(this, 320L, prVar);
        Paint paint = new Paint(1);
        this.f33450c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.f33451e = System.currentTimeMillis();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z4;
        zb zbVar = this.f33452f;
        float d = this.f33448a.d(zbVar.f33893a, false);
        if (zbVar.f33893a >= 1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        float e6 = this.f33449b.e(z4);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RectF rectF = this.d;
        rectF.set(width - AndroidUtilities.dpf2(13.0f), height - AndroidUtilities.dpf2(13.0f), AndroidUtilities.dpf2(13.0f) + width, AndroidUtilities.dpf2(13.0f) + height);
        float currentTimeMillis = (((float) (System.currentTimeMillis() - this.f33451e)) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i10 = 0; i10 < 4; i10++) {
            u1.a aVar = tp.h;
            int i11 = i10 * 1350;
            aVar.getInterpolation((currentTimeMillis - i11) / 667.0f);
            max += aVar.getInterpolation((currentTimeMillis - (i11 + 667)) / 667.0f) * 250.0f;
        }
        int l1 = org.telegram.ui.ActionBar.k6.l1((1.0f - e6) * 1.0f, -1);
        Paint paint = this.f33450c;
        paint.setColor(l1);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, d) * (-360.0f), false, paint);
        if (d < 1.0f && e6 < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
