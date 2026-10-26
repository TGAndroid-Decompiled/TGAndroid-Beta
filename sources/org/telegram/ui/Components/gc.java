package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class gc extends FrameLayout {
    public final h6 f28531a;
    public final h6 f28532b;
    public final Paint f28533c;
    public final RectF d;
    public final long e;
    public final hc f28534f;

    public gc(hc hcVar, Activity activity) {
        super(activity);
        this.f28534f = hcVar;
        ds dsVar = ds.h;
        this.f28531a = new h6(this, 320L, dsVar);
        this.f28532b = new h6(this, 320L, dsVar);
        Paint paint = new Paint(1);
        this.f28533c = paint;
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
        int i10;
        hc hcVar = this.f28534f;
        float d = this.f28531a.d(hcVar.f28911a, false);
        if (hcVar.f28911a >= 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e = this.f28532b.e(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RectF rectF = this.d;
        rectF.set(width - AndroidUtilities.dpf2(13.0f), height - AndroidUtilities.dpf2(13.0f), AndroidUtilities.dpf2(13.0f) + width, AndroidUtilities.dpf2(13.0f) + height);
        float currentTimeMillis = (((float) (System.currentTimeMillis() - this.e)) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i11 = 0; i11 < 4; i11++) {
            u1.a aVar = gq.h;
            aVar.getInterpolation((currentTimeMillis - (i11 * 1350)) / 667.0f);
            max += aVar.getInterpolation((currentTimeMillis - (i10 + 667)) / 667.0f) * 250.0f;
        }
        int o12 = org.telegram.ui.ActionBar.y6.o1((1.0f - e) * 1.0f, -1);
        Paint paint = this.f28533c;
        paint.setColor(o12);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, d) * (-360.0f), false, paint);
        if (d < 1.0f && e < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
