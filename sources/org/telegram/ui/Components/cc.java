package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class cc extends FrameLayout {
    public final d6 f27427a;
    public final d6 f27428b;
    public final Paint f27429c;
    public final RectF d;
    public final long f27430e;
    public final dc f27431f;

    public cc(dc dcVar, Activity activity) {
        super(activity);
        this.f27431f = dcVar;
        jr jrVar = jr.h;
        this.f27427a = new d6(this, 320L, jrVar);
        this.f27428b = new d6(this, 320L, jrVar);
        Paint paint = new Paint(1);
        this.f27429c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.f27430e = System.currentTimeMillis();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        dc dcVar = this.f27431f;
        float d = this.f27427a.d(dcVar.f27730a, false);
        if (dcVar.f27730a >= 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e10 = this.f27428b.e(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RectF rectF = this.d;
        rectF.set(width - AndroidUtilities.dpf2(13.0f), height - AndroidUtilities.dpf2(13.0f), AndroidUtilities.dpf2(13.0f) + width, AndroidUtilities.dpf2(13.0f) + height);
        float currentTimeMillis = (((float) (System.currentTimeMillis() - this.f27430e)) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i10 = 0; i10 < 4; i10++) {
            u1.a aVar = np.h;
            int i11 = i10 * 1350;
            aVar.getInterpolation((currentTimeMillis - i11) / 667.0f);
            max += aVar.getInterpolation((currentTimeMillis - (i11 + 667)) / 667.0f) * 250.0f;
        }
        int l1 = org.telegram.ui.ActionBar.g6.l1((1.0f - e10) * 1.0f, -1);
        Paint paint = this.f27429c;
        paint.setColor(l1);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, d) * (-360.0f), false, paint);
        if (d < 1.0f && e10 < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
