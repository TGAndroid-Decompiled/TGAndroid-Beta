package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

public final class cl extends org.telegram.ui.Components.n9 {
    public final int C = 0;
    public Object D;
    public Object E;
    public Object F;

    public cl(Context context) {
        super(context);
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.C) {
            case 1:
                eh.k kVar = (eh.k) this.E;
                Path path = (Path) this.D;
                super.draw(canvas);
                if (((org.telegram.ui.Components.eo) this.F).h) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.f30898a.getImageX(), this.f30898a.getImageY(), this.f30898a.getImageX2(), this.f30898a.getImageY2());
                    path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    kVar.h(i0.b.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    kVar.setBounds((int) this.f30898a.getImageX(), (int) this.f30898a.getImageY(), (int) this.f30898a.getImageX2(), (int) this.f30898a.getImageY2());
                    kVar.draw(canvas);
                    invalidate();
                    canvas.restore();
                }
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.C) {
            case 0:
                float[] fArr = (float[]) this.F;
                eh.k kVar = (eh.k) this.E;
                Path path = (Path) this.D;
                super.onDraw(canvas);
                if (this.f30904r) {
                    canvas.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    int[] roundRadius = this.f30898a.getRoundRadius();
                    float f10 = roundRadius[0];
                    fArr[1] = f10;
                    fArr[0] = f10;
                    float f11 = roundRadius[1];
                    fArr[3] = f11;
                    fArr[2] = f11;
                    float f12 = roundRadius[2];
                    fArr[5] = f12;
                    fArr[4] = f12;
                    float f13 = roundRadius[3];
                    fArr[7] = f13;
                    fArr[6] = f13;
                    path.rewind();
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    canvas.clipPath(path);
                    kVar.h(i0.b.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    kVar.setBounds(0, 0, getWidth(), getHeight());
                    kVar.draw(canvas);
                    canvas.restore();
                    invalidate();
                }
                break;
            case 1:
            default:
                super.onDraw(canvas);
                break;
            case 2:
                org.telegram.ui.Components.voip.h hVar = (org.telegram.ui.Components.voip.h) this.E;
                super.onDraw(canvas);
                org.telegram.ui.Components.k50 k50Var = (org.telegram.ui.Components.k50) this.F;
                if (k50Var.f29986o0) {
                    int i10 = k50Var.J0;
                    hVar.f33591f = i10;
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f14 = i10;
                    rectF2.set(0.0f, 0.0f, f14, f14);
                    float fWidth = rectF2.width() / 2.0f;
                    canvas.drawRoundRect(rectF2, fWidth, fWidth, (Paint) this.D);
                    rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                    hVar.a(fWidth, canvas, rectF2, null);
                    invalidate();
                }
                break;
        }
    }

    public cl(org.telegram.ui.Components.eo eoVar, Context context, eh.k kVar) {
        super(context);
        this.F = eoVar;
        this.E = kVar;
        this.D = new Path();
    }

    public cl(org.telegram.ui.Components.k50 k50Var, Context context, Paint paint) {
        super(context);
        this.F = k50Var;
        this.D = paint;
        this.E = new org.telegram.ui.Components.voip.h();
    }
}
