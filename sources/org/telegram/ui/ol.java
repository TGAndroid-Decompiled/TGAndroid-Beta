package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class ol extends org.telegram.ui.Components.w9 {
    public final int G = 0;
    public Object H;
    public Object I;
    public Object J;

    public ol(Context context) {
        super(context);
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.G) {
            case 1:
                uh.h hVar = (uh.h) this.I;
                Path path = (Path) this.H;
                super.draw(canvas);
                if (((org.telegram.ui.Components.vo) this.J).h) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.f28728a.getImageX(), this.f28728a.getImageY(), this.f28728a.getImageX2(), this.f28728a.getImageY2());
                    path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    hVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    hVar.setBounds((int) this.f28728a.getImageX(), (int) this.f28728a.getImageY(), (int) this.f28728a.getImageX2(), (int) this.f28728a.getImageY2());
                    hVar.draw(canvas);
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
                uh.h hVar = (uh.h) this.I;
                Path path = (Path) this.H;
                super.onDraw(canvas);
                if (this.f28733r) {
                    canvas.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    int[] roundRadius = this.f28728a.getRoundRadius();
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
                    hVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    hVar.setBounds(0, 0, getWidth(), getHeight());
                    hVar.draw(canvas);
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
                org.telegram.ui.Components.voip.h hVar2 = (org.telegram.ui.Components.voip.h) this.I;
                super.onDraw(canvas);
                org.telegram.ui.Components.f60 f60Var = (org.telegram.ui.Components.f60) this.J;
                if (f60Var.f22899s0) {
                    int i10 = f60Var.N0;
                    hVar2.f28147f = i10;
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f13 = i10;
                    rectF2.set(0.0f, 0.0f, f13, f13);
                    float width = rectF2.width() / 2.0f;
                    canvas.drawRoundRect(rectF2, width, width, (Paint) this.H);
                    rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                    hVar2.a(width, canvas, rectF2, null);
                    invalidate();
                    return;
                }
                return;
        }
    }

    public ol(org.telegram.ui.Components.vo voVar, Context context, uh.h hVar) {
        super(context);
        this.J = voVar;
        this.I = hVar;
        this.H = new Path();
    }

    public ol(org.telegram.ui.Components.f60 f60Var, Context context, Paint paint) {
        super(context);
        this.J = f60Var;
        this.H = paint;
        this.I = new org.telegram.ui.Components.voip.h();
    }
}
