package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ef;
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.gr;
public final class r5 extends org.telegram.ui.Components.g9 {
    public final Paint G;
    public long H;
    public Drawable I;
    public Drawable J;
    public final v5 K;

    public r5(v5 v5Var, Context context) {
        super(context);
        this.K = v5Var;
        this.G = new Paint(1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        ef efVar;
        Drawable drawable;
        float floatValue;
        org.telegram.ui.Components.f5 f5Var = this.e;
        if (f5Var != null) {
            imageReceiver = f5Var.f25975k;
        } else {
            imageReceiver = this.f26292a;
        }
        if (imageReceiver != null) {
            if (this.f26294c != -1 && this.d != -1) {
                int height = getHeight();
                int i10 = this.d;
                imageReceiver.y0((getWidth() - this.f26294c) / 2, (height - i10) / 2, this.f26294c, i10);
                int height2 = getHeight();
                int i11 = this.d;
                this.f26293b.y0((getWidth() - this.f26294c) / 2, (height2 - i11) / 2, this.f26294c, i11);
            } else {
                imageReceiver.y0(0.0f, 0.0f, getWidth(), getHeight());
                this.f26293b.y0(0.0f, 0.0f, getWidth(), getHeight());
            }
            imageReceiver.h(canvas, null);
            v5 v5Var = this.K;
            if (v5Var.N) {
                Rect rect = v5.f23306a0;
                this.f26293b.h(canvas, null);
                if (v5Var.M == null) {
                    if (v5Var.L == null) {
                        nh.i iVar = new nh.i();
                        v5Var.L = iVar;
                        iVar.h(i0.b.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    }
                    v5Var.L.setBounds(0, 0, getWidth(), getHeight());
                    v5Var.L.draw(canvas);
                }
                invalidate();
            }
            float f7 = v5Var.T;
            int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            if (i12 != 0 && v5Var.R != null) {
                Paint paint = this.G;
                paint.setAlpha((int) (gr.f26495f.getInterpolation(1.0f - f7) * 255.0f));
                canvas.drawBitmap(v5Var.R, 0.0f, 0.0f, paint);
                long min = Math.min(16L, System.currentTimeMillis() - this.H);
                Float f10 = v5Var.S;
                if (f10 == null) {
                    floatValue = 250.0f;
                } else {
                    floatValue = f10.floatValue();
                }
                v5Var.T = f1.e((float) min, floatValue, v5Var.T, 1.0f);
                this.H = System.currentTimeMillis();
                invalidate();
                if (v5Var.M != null) {
                    v5Var.f23308b.invalidate();
                }
            } else if (i12 == 0 && (bitmap = v5Var.R) != null) {
                bitmap.recycle();
                v5Var.R = null;
                v5Var.S = null;
                invalidate();
            }
            if (v5Var.f23313s) {
                t5 t5Var = v5Var.U;
                if ((t5Var == null || !((bm) ((org.telegram.ui.Components.t) t5Var).f30389b).f24836s) && (efVar = v5Var.G) != null && efVar.d()) {
                    if (v5Var.G.i()) {
                        if (this.J == null) {
                            this.J = getContext().getResources().getDrawable(2131231745).mutate();
                        }
                        drawable = this.J;
                    } else {
                        if (this.I == null) {
                            this.I = getContext().getResources().getDrawable(2131231746).mutate();
                        }
                        drawable = this.I;
                    }
                    drawable.setBounds((int) (imageReceiver.K0 + org.telegram.messenger.i0.L(8.0f)), (int) (imageReceiver.L0 + org.telegram.messenger.i0.L(8.0f)), (int) (imageReceiver.K0 + org.telegram.messenger.i0.L(30.0f)), (int) (imageReceiver.L0 + org.telegram.messenger.i0.L(26.0f)));
                    drawable.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        super.onMeasure(i10, i11);
        v5 v5Var = this.K;
        ef efVar = v5Var.G;
        if (efVar != null && efVar.M) {
            z10 = true;
        } else {
            z10 = false;
        }
        v5Var.h(z10);
    }
}
