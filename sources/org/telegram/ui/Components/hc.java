package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class hc extends FrameLayout {
    public final e6 f24804a;
    public final e6 f24805b;
    public final Paint f24806c;
    public final RectF d;
    public final long e;
    public final ic f24807f;

    public hc(ic icVar, Activity activity) {
        super(activity);
        this.f24807f = icVar;
        tr trVar = tr.h;
        this.f24804a = new e6(this, 320L, trVar);
        this.f24805b = new e6(this, 320L, trVar);
        Paint paint = new Paint(1);
        this.f24806c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.e = System.currentTimeMillis();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        ic icVar = this.f24807f;
        float d = this.f24804a.d(icVar.f25068a, false);
        if (icVar.f25068a >= 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e = this.f24805b.e(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RectF rectF = this.d;
        rectF.set(width - AndroidUtilities.dpf2(13.0f), height - AndroidUtilities.dpf2(13.0f), AndroidUtilities.dpf2(13.0f) + width, AndroidUtilities.dpf2(13.0f) + height);
        float currentTimeMillis = (((float) (System.currentTimeMillis() - this.e)) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i10 = 0; i10 < 4; i10++) {
            u1.a aVar = wp.h;
            int i11 = i10 * 1350;
            aVar.getInterpolation((currentTimeMillis - i11) / 667.0f);
            max += aVar.getInterpolation((currentTimeMillis - (i11 + 667)) / 667.0f) * 250.0f;
        }
        int l1 = org.telegram.ui.ActionBar.h6.l1((1.0f - e) * 1.0f, -1);
        Paint paint = this.f24806c;
        paint.setColor(l1);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, d) * (-360.0f), false, paint);
        if (d < 1.0f && e < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
