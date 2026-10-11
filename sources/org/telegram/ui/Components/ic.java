package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ic extends FrameLayout {
    public final g6 f27270a;
    public final g6 f27271b;
    public final Paint f27272c;
    public final RectF d;
    public final long f27273e;
    public final jc f27274f;

    public ic(jc jcVar, Activity activity) {
        super(activity);
        this.f27274f = jcVar;
        is isVar = is.h;
        this.f27270a = new g6(this, 320L, isVar);
        this.f27271b = new g6(this, 320L, isVar);
        Paint paint = new Paint(1);
        this.f27272c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.f27273e = System.currentTimeMillis();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i10;
        jc jcVar = this.f27274f;
        float d = this.f27270a.d(jcVar.f27664a, false);
        if (jcVar.f27664a >= 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e7 = this.f27271b.e(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RectF rectF = this.d;
        rectF.set(width - AndroidUtilities.dpf2(13.0f), height - AndroidUtilities.dpf2(13.0f), AndroidUtilities.dpf2(13.0f) + width, AndroidUtilities.dpf2(13.0f) + height);
        float currentTimeMillis = (((float) (System.currentTimeMillis() - this.f27273e)) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i11 = 0; i11 < 4; i11++) {
            u1.a aVar = jq.h;
            aVar.getInterpolation((currentTimeMillis - (i11 * 1350)) / 667.0f);
            max += aVar.getInterpolation((currentTimeMillis - (i10 + 667)) / 667.0f) * 250.0f;
        }
        int m12 = org.telegram.ui.ActionBar.h6.m1((1.0f - e7) * 1.0f, -1);
        Paint paint = this.f27272c;
        paint.setColor(m12);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, d) * (-360.0f), false, paint);
        if (d < 1.0f && e7 < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
