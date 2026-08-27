package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class ub extends FrameLayout {

    public final y5 f33027a;

    public final y5 f33028b;

    public final Paint f33029c;
    public final RectF d;

    public final long f33030e;

    public final vb f33031f;

    public ub(vb vbVar, Activity activity) {
        super(activity);
        this.f33031f = vbVar;
        er erVar = er.h;
        this.f33027a = new y5(this, 320L, erVar);
        this.f33028b = new y5(this, 320L, erVar);
        Paint paint = new Paint(1);
        this.f33029c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.f33030e = System.currentTimeMillis();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        vb vbVar = this.f33031f;
        float fD = this.f33027a.d(vbVar.f33340a, false);
        float fE = this.f33028b.e(vbVar.f33340a >= 1.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float fDpf2 = width - AndroidUtilities.dpf2(13.0f);
        float fDpf3 = height - AndroidUtilities.dpf2(13.0f);
        float fDpf4 = AndroidUtilities.dpf2(13.0f) + width;
        float fDpf5 = AndroidUtilities.dpf2(13.0f) + height;
        RectF rectF = this.d;
        rectF.set(fDpf2, fDpf3, fDpf4, fDpf5);
        float fCurrentTimeMillis = ((System.currentTimeMillis() - this.f33030e) * 0.45f) % 5400.0f;
        float fMax = Math.max(0.0f, ((1520.0f * fCurrentTimeMillis) / 5400.0f) - 20.0f);
        for (int i10 = 0; i10 < 4; i10++) {
            u1.a aVar = hp.h;
            int i11 = i10 * 1350;
            aVar.getInterpolation((fCurrentTimeMillis - i11) / 667.0f);
            fMax += aVar.getInterpolation((fCurrentTimeMillis - (i11 + 667)) / 667.0f) * 250.0f;
        }
        int iL1 = org.telegram.ui.ActionBar.g6.l1((1.0f - fE) * 1.0f, -1);
        Paint paint = this.f33029c;
        paint.setColor(iL1);
        canvas.drawArc(rectF, (-90.0f) - fMax, Math.max(0.02f, fD) * (-360.0f), false, paint);
        if (fD < 1.0f && fE < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
