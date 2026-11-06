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
public final class nf0 extends l9 implements ot0 {
    public final int G;
    public RadialProgress2 H;
    public ValueAnimator I;
    public float J;
    public long K;
    public boolean L;
    public final int M;
    public final Paint N;
    public Runnable O;
    public final sf0 P;

    public nf0(sf0 sf0Var, Context context, int i7, Paint paint) {
        super(context);
        this.P = sf0Var;
        this.G = org.telegram.messenger.g0.L(64.0f);
        this.K = -1L;
        this.M = i7;
        this.N = paint;
        setLayerNum(sf0Var.l1);
    }

    @Override
    public final void f(Runnable runnable) {
        this.O = runnable;
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        Runnable runnable = this.O;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        p80 p80Var;
        long j3;
        sf0 sf0Var = this.P;
        float[] fArr = sf0Var.O0;
        Path path = sf0Var.M0;
        ArrayList arrayList = sf0Var.f38069b1;
        RectF rectF = sf0Var.N0;
        org.telegram.ui.er0 er0Var = sf0Var.f38075h1;
        if (er0Var == null || !er0Var.f45389n) {
            if (this.H != null) {
                int k10 = sf0Var.D0.k(this.M);
                if (sf0Var.f38076i1) {
                    k10--;
                }
                Drawable t6 = getImageReceiver().t();
                long j10 = 0;
                if (k10 >= arrayList.size() || arrayList.get(k10) == null ? !(t6 == null || (this.L && (!(t6 instanceof v5) || ((v5) t6).d[4] <= 0))) : ((Float) arrayList.get(k10)).floatValue() >= 1.0f) {
                    if (this.I == null) {
                        RadialProgress2 radialProgress2 = this.H;
                        if (radialProgress2.f31473c) {
                            p80Var = radialProgress2.f31478j;
                        } else {
                            p80Var = radialProgress2.f31477i;
                        }
                        if (p80Var.f36940w < 1.0f) {
                            radialProgress2.p(true, 1.0f);
                            j10 = 100;
                        }
                        this.J = this.H.E;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.I = ofFloat;
                        ofFloat.setStartDelay(j10);
                        this.I.setDuration(this.J * 250.0f);
                        this.I.setInterpolator(xq.f40310f);
                        this.I.addUpdateListener(new c60(this, 3));
                        this.I.addListener(new hi.m2(this, k10, 11));
                        this.I.start();
                    }
                } else {
                    if (this.K < 0) {
                        this.K = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.K;
                        if (this.L) {
                            j3 = 250;
                        } else {
                            j3 = 750;
                        }
                        if (currentTimeMillis <= 250 + j3 && currentTimeMillis > j3) {
                            this.H.E = xq.f40310f.getInterpolation(((float) (currentTimeMillis - j3)) / 250.0f);
                        }
                    }
                    if (sf0Var.f38074g1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                }
                int i7 = sf0Var.f38079m1;
                if (i7 == 0 && sf0Var.n1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.N);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i10 = sf0Var.n1;
                    Paint paint = this.N;
                    if (i7 == i10) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f10 = sf0Var.f38079m1;
                        canvas2.drawRoundRect(rectF, f10, f10, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i11 = 0; i11 < 4; i11++) {
                            fArr[i11] = sf0Var.f38079m1;
                            fArr[i11 + 4] = sf0Var.n1;
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
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        int i13;
        super.onSizeChanged(i7, i10, i11, i12);
        if (this.H != null) {
            if (this.P.f38086z0.getOccupyStatusBar()) {
                i13 = org.telegram.messenger.g0.f22531m;
            } else {
                i13 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i13;
            int M = org.telegram.messenger.g0.M(80.0f);
            RadialProgress2 radialProgress2 = this.H;
            int i14 = this.G;
            int i15 = (i10 - currentActionBarHeight) - M;
            radialProgress2.r((i7 - i14) / 2, jg.g.D(i15, i14, 2, currentActionBarHeight), (i7 + i14) / 2, ((i15 + i14) / 2) + currentActionBarHeight);
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
        sf0 sf0Var = this.P;
        if (sf0Var.f38074g1) {
            sf0Var.invalidate();
        }
        Runnable runnable = this.O;
        if (runnable != null) {
            runnable.run();
        }
    }
}
