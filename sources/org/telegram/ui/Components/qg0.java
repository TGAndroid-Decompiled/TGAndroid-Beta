package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class qg0 extends g9 implements su0 {
    public final int G;
    public RadialProgress2 H;
    public ValueAnimator I;
    public float J;
    public long K;
    public boolean L;
    public final int M;
    public final Paint N;
    public Runnable O;
    public final vg0 P;

    public qg0(vg0 vg0Var, Context context, int i10, Paint paint) {
        super(context);
        this.P = vg0Var;
        this.G = org.telegram.messenger.i0.L(64.0f);
        this.K = -1L;
        this.M = i10;
        this.N = paint;
        setLayerNum(vg0Var.l1);
    }

    @Override
    public final void f(Runnable runnable) {
        this.O = runnable;
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        Runnable runnable = this.O;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        i90 i90Var;
        long j10;
        vg0 vg0Var = this.P;
        float[] fArr = vg0Var.O0;
        Path path = vg0Var.M0;
        ArrayList arrayList = vg0Var.f31286b1;
        RectF rectF = vg0Var.N0;
        org.telegram.ui.ps0 ps0Var = vg0Var.f31292h1;
        if (ps0Var == null || !ps0Var.f40600n) {
            if (this.H != null) {
                int k10 = vg0Var.D0.k(this.M);
                if (vg0Var.f31293i1) {
                    k10--;
                }
                Drawable t10 = getImageReceiver().t();
                long j11 = 0;
                if (k10 >= arrayList.size() || arrayList.get(k10) == null ? !(t10 == null || (this.L && (!(t10 instanceof s5) || ((s5) t10).d[4] <= 0))) : ((Float) arrayList.get(k10)).floatValue() >= 1.0f) {
                    if (this.I == null) {
                        RadialProgress2 radialProgress2 = this.H;
                        if (radialProgress2.f24126c) {
                            i90Var = radialProgress2.f24130j;
                        } else {
                            i90Var = radialProgress2.f24129i;
                        }
                        if (i90Var.f27053w < 1.0f) {
                            radialProgress2.p(true, 1.0f);
                            j11 = 100;
                        }
                        this.J = this.H.E;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.I = ofFloat;
                        ofFloat.setStartDelay(j11);
                        this.I.setDuration(this.J * 250.0f);
                        this.I.setInterpolator(gr.f26523f);
                        this.I.addUpdateListener(new r60(this, 4));
                        this.I.addListener(new bi.d5(this, k10, 10));
                        this.I.start();
                    }
                } else {
                    if (this.K < 0) {
                        this.K = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.K;
                        if (this.L) {
                            j10 = 250;
                        } else {
                            j10 = 750;
                        }
                        if (currentTimeMillis <= 250 + j10 && currentTimeMillis > j10) {
                            this.H.E = gr.f26523f.getInterpolation(((float) (currentTimeMillis - j10)) / 250.0f);
                        }
                    }
                    if (vg0Var.f31291g1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                }
                int i10 = vg0Var.f31296m1;
                if (i10 == 0 && vg0Var.f31297n1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.N);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i11 = vg0Var.f31297n1;
                    Paint paint = this.N;
                    if (i10 == i11) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f7 = vg0Var.f31296m1;
                        canvas2.drawRoundRect(rectF, f7, f7, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i12 = 0; i12 < 4; i12++) {
                            fArr[i12] = vg0Var.f31296m1;
                            fArr[i12 + 4] = vg0Var.f31297n1;
                        }
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas2.drawPath(path, paint);
                    }
                }
            } else {
                canvas2 = canvas;
            }
            super.onDraw(canvas);
            RadialProgress2 radialProgress22 = this.H;
            if (radialProgress22 != null && radialProgress22.E > 0.0f) {
                radialProgress22.draw(canvas2);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.H != null) {
            if (this.P.f31304z0.getOccupyStatusBar()) {
                i14 = org.telegram.messenger.i0.f16166m;
            } else {
                i14 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i14;
            int M = org.telegram.messenger.i0.M(80.0f);
            RadialProgress2 radialProgress2 = this.H;
            int i15 = this.G;
            int i16 = (i11 - currentActionBarHeight) - M;
            radialProgress2.r((i10 - i15) / 2, i0.a.u(i16, i15, 2, currentActionBarHeight), (i10 + i15) / 2, ((i16 + i15) / 2) + currentActionBarHeight);
        }
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.O;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        vg0 vg0Var = this.P;
        if (vg0Var.f31291g1) {
            vg0Var.invalidate();
        }
        Runnable runnable = this.O;
        if (runnable != null) {
            runnable.run();
        }
    }
}
