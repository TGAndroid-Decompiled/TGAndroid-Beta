package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class jl extends org.telegram.ui.Components.p9 {
    public final int D = 0;
    public Object E;
    public Object F;
    public Object G;

    public jl(Context context) {
        super(context);
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.D) {
            case 1:
                ih.k kVar = (ih.k) this.F;
                Path path = (Path) this.E;
                super.draw(canvas);
                if (((org.telegram.ui.Components.mo) this.G).h) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.f27785a.getImageX(), this.f27785a.getImageY(), this.f27785a.getImageX2(), this.f27785a.getImageY2());
                    path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    kVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    kVar.setBounds((int) this.f27785a.getImageX(), (int) this.f27785a.getImageY(), (int) this.f27785a.getImageX2(), (int) this.f27785a.getImageY2());
                    kVar.draw(canvas);
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
        switch (this.D) {
            case 0:
                float[] fArr = (float[]) this.G;
                ih.k kVar = (ih.k) this.F;
                Path path = (Path) this.E;
                super.onDraw(canvas);
                if (this.f27790r) {
                    canvas.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    int[] roundRadius = this.f27785a.getRoundRadius();
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
                    kVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    kVar.setBounds(0, 0, getWidth(), getHeight());
                    kVar.draw(canvas);
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
                org.telegram.ui.Components.voip.h hVar = (org.telegram.ui.Components.voip.h) this.F;
                super.onDraw(canvas);
                org.telegram.ui.Components.x50 x50Var = (org.telegram.ui.Components.x50) this.G;
                if (x50Var.f30565p0) {
                    int i10 = x50Var.K0;
                    hVar.f29656f = i10;
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f14 = i10;
                    rectF2.set(0.0f, 0.0f, f14, f14);
                    float width = rectF2.width() / 2.0f;
                    canvas.drawRoundRect(rectF2, width, width, (Paint) this.E);
                    rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                    hVar.a(width, canvas, rectF2, null);
                    invalidate();
                    return;
                }
                return;
        }
    }

    public jl(org.telegram.ui.Components.mo moVar, Context context, ih.k kVar) {
        super(context);
        this.G = moVar;
        this.F = kVar;
        this.E = new Path();
    }

    public jl(org.telegram.ui.Components.x50 x50Var, Context context, Paint paint) {
        super(context);
        this.G = x50Var;
        this.E = paint;
        this.F = new org.telegram.ui.Components.voip.h();
    }
}
