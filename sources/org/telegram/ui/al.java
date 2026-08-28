package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class al extends org.telegram.ui.Components.o9 {
    public final int C = 0;
    public Object D;
    public Object E;
    public Object F;

    public al(Context context) {
        super(context);
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.C) {
            case 1:
                dh.l lVar = (dh.l) this.E;
                Path path = (Path) this.D;
                super.draw(canvas);
                if (((org.telegram.ui.Components.go) this.F).h) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.f31328a.getImageX(), this.f31328a.getImageY(), this.f31328a.getImageX2(), this.f31328a.getImageY2());
                    path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    lVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    lVar.setBounds((int) this.f31328a.getImageX(), (int) this.f31328a.getImageY(), (int) this.f31328a.getImageX2(), (int) this.f31328a.getImageY2());
                    lVar.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.C) {
            case 0:
                float[] fArr = (float[]) this.F;
                dh.l lVar = (dh.l) this.E;
                Path path = (Path) this.D;
                super.onDraw(canvas);
                if (this.f31334r) {
                    canvas.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    int[] roundRadius = this.f31328a.getRoundRadius();
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
                    lVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    lVar.setBounds(0, 0, getWidth(), getHeight());
                    lVar.draw(canvas);
                    canvas.restore();
                    invalidate();
                    return;
                }
                return;
            case 1:
            default:
                super.onDraw(canvas);
                return;
            case 2:
                org.telegram.ui.Components.voip.h hVar = (org.telegram.ui.Components.voip.h) this.E;
                super.onDraw(canvas);
                org.telegram.ui.Components.f50 f50Var = (org.telegram.ui.Components.f50) this.F;
                if (f50Var.f28291o0) {
                    int i9 = f50Var.J0;
                    hVar.f33541f = i9;
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f14 = i9;
                    rectF2.set(0.0f, 0.0f, f14, f14);
                    float width = rectF2.width() / 2.0f;
                    canvas.drawRoundRect(rectF2, width, width, (Paint) this.D);
                    rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                    hVar.a(width, canvas, rectF2, null);
                    invalidate();
                    return;
                }
                return;
        }
    }

    public al(org.telegram.ui.Components.go goVar, Context context, dh.l lVar) {
        super(context);
        this.F = goVar;
        this.E = lVar;
        this.D = new Path();
    }

    public al(org.telegram.ui.Components.f50 f50Var, Context context, Paint paint) {
        super(context);
        this.F = f50Var;
        this.D = paint;
        this.E = new org.telegram.ui.Components.voip.h();
    }
}
