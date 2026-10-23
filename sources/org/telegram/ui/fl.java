package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class fl extends org.telegram.ui.Components.w9 {
    public final int G = 0;
    public Object H;
    public Object I;
    public Object J;

    public fl(Context context) {
        super(context);
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.G) {
            case 1:
                wh.g gVar = (wh.g) this.I;
                Path path = (Path) this.H;
                super.draw(canvas);
                if (((org.telegram.ui.Components.ap) this.J).h) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.f32195a.getImageX(), this.f32195a.getImageY(), this.f32195a.getImageX2(), this.f32195a.getImageY2());
                    path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    gVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    gVar.setBounds((int) this.f32195a.getImageX(), (int) this.f32195a.getImageY(), (int) this.f32195a.getImageX2(), (int) this.f32195a.getImageY2());
                    gVar.draw(canvas);
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
        switch (this.G) {
            case 0:
                float[] fArr = (float[]) this.J;
                wh.g gVar = (wh.g) this.I;
                Path path = (Path) this.H;
                super.onDraw(canvas);
                if (this.f32200r) {
                    canvas.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    int[] roundRadius = this.f32195a.getRoundRadius();
                    float f7 = roundRadius[0];
                    fArr[1] = f7;
                    fArr[0] = f7;
                    float f10 = roundRadius[1];
                    fArr[3] = f10;
                    fArr[2] = f10;
                    float f11 = roundRadius[2];
                    fArr[5] = f11;
                    fArr[4] = f11;
                    float f12 = roundRadius[3];
                    fArr[7] = f12;
                    fArr[6] = f12;
                    path.rewind();
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    canvas.clipPath(path);
                    gVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    gVar.setBounds(0, 0, getWidth(), getHeight());
                    gVar.draw(canvas);
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
                org.telegram.ui.Components.voip.h hVar = (org.telegram.ui.Components.voip.h) this.I;
                super.onDraw(canvas);
                org.telegram.ui.Components.n60 n60Var = (org.telegram.ui.Components.n60) this.J;
                if (n60Var.f28883x0) {
                    int i10 = n60Var.X0;
                    hVar.f31613f = i10;
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f13 = i10;
                    rectF2.set(0.0f, 0.0f, f13, f13);
                    float width = rectF2.width() / 2.0f;
                    canvas.drawRoundRect(rectF2, width, width, (Paint) this.H);
                    rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                    hVar.a(width, canvas, rectF2, null);
                    invalidate();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.voip.h hVar2 = (org.telegram.ui.Components.voip.h) this.I;
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.m60) this.J).f28533l0) {
                    float min = Math.min(getWidth(), getHeight()) * 0.5f;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.drawRoundRect(rectF3, min, min, (Paint) this.H);
                    rectF3.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                    hVar2.f31613f = getWidth();
                    hVar2.a(min, canvas, rectF3, null);
                    invalidate();
                    return;
                }
                return;
        }
    }

    public fl(org.telegram.ui.Components.ap apVar, Context context, wh.g gVar) {
        super(context);
        this.J = apVar;
        this.I = gVar;
        this.H = new Path();
    }

    public fl(org.telegram.ui.Components.m60 m60Var, Context context, Paint paint) {
        super(context);
        this.J = m60Var;
        this.H = paint;
        this.I = new org.telegram.ui.Components.voip.h();
    }

    public fl(org.telegram.ui.Components.n60 n60Var, Context context, Paint paint) {
        super(context);
        this.J = n60Var;
        this.H = paint;
        this.I = new org.telegram.ui.Components.voip.h();
    }
}
