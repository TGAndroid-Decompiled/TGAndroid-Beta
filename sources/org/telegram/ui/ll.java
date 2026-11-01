package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
public final class ll extends org.telegram.ui.Components.g9 {
    public final int G = 0;
    public Object H;
    public Object I;
    public Object J;

    public ll(Context context) {
        super(context);
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.G) {
            case 1:
                nh.i iVar = (nh.i) this.I;
                Path path = (Path) this.H;
                super.draw(canvas);
                if (((org.telegram.ui.Components.io) this.J).h) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.i0.P;
                    ImageReceiver imageReceiver = this.f26357a;
                    rectF.set(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), this.f26357a.A());
                    path.addRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    iVar.h(i0.b.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    ImageReceiver imageReceiver2 = this.f26357a;
                    iVar.setBounds((int) imageReceiver2.K0, (int) imageReceiver2.L0, (int) imageReceiver2.y(), (int) this.f26357a.A());
                    iVar.draw(canvas);
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
                nh.i iVar = (nh.i) this.I;
                Path path = (Path) this.H;
                super.onDraw(canvas);
                if (this.f26362r) {
                    canvas.save();
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    int[] iArr = this.f26357a.W0;
                    float f7 = iArr[0];
                    fArr[1] = f7;
                    fArr[0] = f7;
                    float f10 = iArr[1];
                    fArr[3] = f10;
                    fArr[2] = f10;
                    float f11 = iArr[2];
                    fArr[5] = f11;
                    fArr[4] = f11;
                    float f12 = iArr[3];
                    fArr[7] = f12;
                    fArr[6] = f12;
                    path.rewind();
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    canvas.clipPath(path);
                    iVar.h(i0.b.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    iVar.setBounds(0, 0, getWidth(), getHeight());
                    iVar.draw(canvas);
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
                org.telegram.ui.Components.voip.g gVar = (org.telegram.ui.Components.voip.g) this.I;
                super.onDraw(canvas);
                org.telegram.ui.Components.e50 e50Var = (org.telegram.ui.Components.e50) this.J;
                if (e50Var.f25732w0) {
                    int i10 = e50Var.W0;
                    gVar.f31494f = i10;
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    float f13 = i10;
                    rectF2.set(0.0f, 0.0f, f13, f13);
                    float width = rectF2.width() / 2.0f;
                    canvas.drawRoundRect(rectF2, width, width, (Paint) this.H);
                    rectF2.inset(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
                    gVar.a(width, canvas, rectF2, null);
                    invalidate();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.voip.g gVar2 = (org.telegram.ui.Components.voip.g) this.I;
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.d50) this.J).f25391l0) {
                    float min = Math.min(getWidth(), getHeight()) * 0.5f;
                    RectF rectF3 = org.telegram.messenger.i0.P;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.drawRoundRect(rectF3, min, min, (Paint) this.H);
                    rectF3.inset(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
                    gVar2.f31494f = getWidth();
                    gVar2.a(min, canvas, rectF3, null);
                    invalidate();
                    return;
                }
                return;
        }
    }

    public ll(org.telegram.ui.Components.io ioVar, Context context, nh.i iVar) {
        super(context);
        this.J = ioVar;
        this.I = iVar;
        this.H = new Path();
    }

    public ll(org.telegram.ui.Components.d50 d50Var, Context context, Paint paint) {
        super(context);
        this.J = d50Var;
        this.H = paint;
        this.I = new org.telegram.ui.Components.voip.g();
    }

    public ll(org.telegram.ui.Components.e50 e50Var, Context context, Paint paint) {
        super(context);
        this.J = e50Var;
        this.H = paint;
        this.I = new org.telegram.ui.Components.voip.g();
    }
}
