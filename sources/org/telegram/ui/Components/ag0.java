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
public final class ag0 extends q9 implements xt0 {
    public final int H;
    public RadialProgress2 I;
    public ValueAnimator J;
    public float K;
    public long L;
    public boolean M;
    public final int N;
    public final Paint O;
    public Runnable P;
    public final fg0 Q;

    public ag0(fg0 fg0Var, Context context, int i7, Paint paint) {
        super(context);
        this.Q = fg0Var;
        this.H = org.telegram.messenger.g0.L(64.0f);
        this.L = -1L;
        this.N = i7;
        this.O = paint;
        setLayerNum(fg0Var.f35089m1);
    }

    @Override
    public final void e(Runnable runnable) {
        this.P = runnable;
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        d90 d90Var;
        long j3;
        fg0 fg0Var = this.Q;
        float[] fArr = fg0Var.P0;
        Path path = fg0Var.N0;
        ArrayList arrayList = fg0Var.f35080c1;
        RectF rectF = fg0Var.O0;
        org.telegram.ui.fr0 fr0Var = fg0Var.f35086i1;
        if (fr0Var == null || !fr0Var.f47797n) {
            if (this.I != null) {
                int k10 = fg0Var.E0.k(this.N);
                if (fg0Var.f35087j1) {
                    k10--;
                }
                Drawable t6 = getImageReceiver().t();
                long j10 = 0;
                if (k10 >= arrayList.size() || arrayList.get(k10) == null ? !(t6 == null || (this.M && (!(t6 instanceof b6) || ((b6) t6).d[4] <= 0))) : ((Float) arrayList.get(k10)).floatValue() >= 1.0f) {
                    if (this.J == null) {
                        RadialProgress2 radialProgress2 = this.I;
                        if (radialProgress2.f33054c) {
                            d90Var = radialProgress2.f33059j;
                        } else {
                            d90Var = radialProgress2.f33058i;
                        }
                        if (d90Var.f34345w < 1.0f) {
                            radialProgress2.p(true, 1.0f);
                            j10 = 100;
                        }
                        this.K = this.I.E;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.J = ofFloat;
                        ofFloat.setStartDelay(j10);
                        this.J.setDuration(this.K * 250.0f);
                        this.J.setInterpolator(lr.f37208f);
                        this.J.addUpdateListener(new e60(this, 5));
                        this.J.addListener(new ki.f2(this, k10, 11));
                        this.J.start();
                    }
                } else {
                    if (this.L < 0) {
                        this.L = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.L;
                        if (this.M) {
                            j3 = 250;
                        } else {
                            j3 = 750;
                        }
                        if (currentTimeMillis <= 250 + j3 && currentTimeMillis > j3) {
                            this.I.E = lr.f37208f.getInterpolation(((float) (currentTimeMillis - j3)) / 250.0f);
                        }
                    }
                    if (fg0Var.f35085h1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                }
                int i7 = fg0Var.n1;
                if (i7 == 0 && fg0Var.f35090o1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.O);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i10 = fg0Var.f35090o1;
                    Paint paint = this.O;
                    if (i7 == i10) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f10 = fg0Var.n1;
                        canvas2.drawRoundRect(rectF, f10, f10, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i11 = 0; i11 < 4; i11++) {
                            fArr[i11] = fg0Var.n1;
                            fArr[i11 + 4] = fg0Var.f35090o1;
                        }
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas2.drawPath(path, paint);
                    }
                }
            } else {
                canvas2 = canvas;
            }
            super.onDraw(canvas);
            RadialProgress2 radialProgress22 = this.I;
            if (radialProgress22 != null && radialProgress22.E > 0.0f) {
                radialProgress22.draw(canvas2);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        int i13;
        super.onSizeChanged(i7, i10, i11, i12);
        if (this.I != null) {
            if (this.Q.A0.getOccupyStatusBar()) {
                i13 = org.telegram.messenger.g0.f24115m;
            } else {
                i13 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i13;
            int M = org.telegram.messenger.g0.M(80.0f);
            RadialProgress2 radialProgress2 = this.I;
            int i14 = this.H;
            int i15 = (i10 - currentActionBarHeight) - M;
            radialProgress2.r((i7 - i14) / 2, i5.c.e(i15, i14, 2, currentActionBarHeight), (i7 + i14) / 2, ((i15 + i14) / 2) + currentActionBarHeight);
        }
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        fg0 fg0Var = this.Q;
        if (fg0Var.f35085h1) {
            fg0Var.invalidate();
        }
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }
}
