package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class gc extends FrameLayout {
    public final e6 f26362a;
    public final e6 f26363b;
    public final Paint f26364c;
    public final RectF d;
    public final long f26365e;
    public final hc f26366f;

    public gc(hc hcVar, Activity activity) {
        super(activity);
        this.f26366f = hcVar;
        pr prVar = pr.h;
        this.f26362a = new e6(this, 320L, prVar);
        this.f26363b = new e6(this, 320L, prVar);
        Paint paint = new Paint(1);
        this.f26364c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.f26365e = System.currentTimeMillis();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        hc hcVar = this.f26366f;
        float d = this.f26362a.d(hcVar.f26729a, false);
        if (hcVar.f26729a >= 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e7 = this.f26363b.e(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RectF rectF = this.d;
        rectF.set(width - AndroidUtilities.dpf2(13.0f), height - AndroidUtilities.dpf2(13.0f), AndroidUtilities.dpf2(13.0f) + width, AndroidUtilities.dpf2(13.0f) + height);
        float currentTimeMillis = (((float) (System.currentTimeMillis() - this.f26365e)) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i10 = 0; i10 < 4; i10++) {
            u1.a aVar = sp.h;
            int i11 = i10 * 1350;
            aVar.getInterpolation((currentTimeMillis - i11) / 667.0f);
            max += aVar.getInterpolation((currentTimeMillis - (i11 + 667)) / 667.0f) * 250.0f;
        }
        int l1 = org.telegram.ui.ActionBar.j6.l1((1.0f - e7) * 1.0f, -1);
        Paint paint = this.f26364c;
        paint.setColor(l1);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, d) * (-360.0f), false, paint);
        if (d < 1.0f && e7 < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
