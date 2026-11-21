package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
public final class qk extends org.telegram.ui.Components.q9 {
    public final int H = 0;
    public Object I;
    public Object J;
    public Object K;

    public qk(Context context) {
        super(context);
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.H) {
            case 1:
                xh.f fVar = (xh.f) this.J;
                Path path = (Path) this.I;
                super.draw(canvas);
                if (((org.telegram.ui.Components.so) this.K).h) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    ImageReceiver imageReceiver = this.f38842a;
                    rectF.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), this.f38842a.A());
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    fVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    ImageReceiver imageReceiver2 = this.f38842a;
                    fVar.setBounds((int) imageReceiver2.L0, (int) imageReceiver2.M0, (int) imageReceiver2.y(), (int) this.f38842a.A());
                    fVar.draw(canvas);
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
        switch (this.H) {
            case 0:
                float[] fArr = (float[]) this.K;
                xh.f fVar = (xh.f) this.J;
                Path path = (Path) this.I;
                super.onDraw(canvas);
                if (this.f38848r) {
                    canvas.save();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    int[] iArr = this.f38842a.X0;
                    float f10 = iArr[0];
                    fArr[1] = f10;
                    fArr[0] = f10;
                    float f11 = iArr[1];
                    fArr[3] = f11;
                    fArr[2] = f11;
                    float f12 = iArr[2];
                    fArr[5] = f12;
                    fArr[4] = f12;
                    float f13 = iArr[3];
                    fArr[7] = f13;
                    fArr[6] = f13;
                    path.rewind();
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    canvas.clipPath(path);
                    fVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    fVar.setBounds(0, 0, getWidth(), getHeight());
                    fVar.draw(canvas);
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
                org.telegram.ui.Components.voip.n nVar = (org.telegram.ui.Components.voip.n) this.J;
                super.onDraw(canvas);
                org.telegram.ui.Components.c50 c50Var = (org.telegram.ui.Components.c50) this.K;
                if (c50Var.f34061x0) {
                    int i7 = c50Var.X0;
                    nVar.f41185f = i7;
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f14 = i7;
                    rectF2.set(0.0f, 0.0f, f14, f14);
                    float width = rectF2.width() / 2.0f;
                    canvas.drawRoundRect(rectF2, width, width, (Paint) this.I);
                    rectF2.inset(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    nVar.a(width, canvas, rectF2, null);
                    invalidate();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.voip.n nVar2 = (org.telegram.ui.Components.voip.n) this.J;
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.b50) this.K).f33758n0) {
                    float min = Math.min(getWidth(), getHeight()) * 0.5f;
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.drawRoundRect(rectF3, min, min, (Paint) this.I);
                    rectF3.inset(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    nVar2.f41185f = getWidth();
                    nVar2.a(min, canvas, rectF3, null);
                    invalidate();
                    return;
                }
                return;
        }
    }

    public qk(org.telegram.ui.Components.so soVar, Context context, xh.f fVar) {
        super(context);
        this.K = soVar;
        this.J = fVar;
        this.I = new Path();
    }

    public qk(org.telegram.ui.Components.b50 b50Var, Context context, Paint paint) {
        super(context);
        this.K = b50Var;
        this.I = paint;
        this.J = new org.telegram.ui.Components.voip.n();
    }

    public qk(org.telegram.ui.Components.c50 c50Var, Context context, Paint paint) {
        super(context);
        this.K = c50Var;
        this.I = paint;
        this.J = new org.telegram.ui.Components.voip.n();
    }
}
