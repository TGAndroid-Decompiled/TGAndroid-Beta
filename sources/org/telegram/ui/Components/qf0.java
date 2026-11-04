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
public final class qf0 extends k9 implements nt0 {
    public final int H;
    public RadialProgress2 I;
    public ValueAnimator J;
    public float K;
    public long L;
    public boolean M;
    public final int N;
    public final Paint O;
    public Runnable P;
    public final vf0 Q;

    public qf0(vf0 vf0Var, Context context, int i3, Paint paint) {
        super(context);
        this.Q = vf0Var;
        this.H = org.telegram.messenger.g0.L(64.0f);
        this.L = -1L;
        this.N = i3;
        this.O = paint;
        setLayerNum(vf0Var.m1);
    }

    @Override
    public final void f(Runnable runnable) {
        this.P = runnable;
    }

    @Override
    public final void invalidate(int i3, int i10, int i11, int i12) {
        super.invalidate(i3, i10, i11, i12);
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        m80 m80Var;
        long j10;
        vf0 vf0Var = this.Q;
        float[] fArr = vf0Var.P0;
        Path path = vf0Var.N0;
        ArrayList arrayList = vf0Var.f39094c1;
        RectF rectF = vf0Var.O0;
        org.telegram.ui.vq0 vq0Var = vf0Var.f39100i1;
        if (vq0Var == null || !vq0Var.f50591n) {
            if (this.I != null) {
                int k10 = vf0Var.E0.k(this.N);
                if (vf0Var.f39101j1) {
                    k10--;
                }
                Drawable t10 = getImageReceiver().t();
                long j11 = 0;
                if (k10 >= arrayList.size() || arrayList.get(k10) == null ? !(t10 == null || (this.M && (!(t10 instanceof t5) || ((t5) t10).d[4] <= 0))) : ((Float) arrayList.get(k10)).floatValue() >= 1.0f) {
                    if (this.J == null) {
                        RadialProgress2 radialProgress2 = this.I;
                        if (radialProgress2.f31550c) {
                            m80Var = radialProgress2.f31555j;
                        } else {
                            m80Var = radialProgress2.f31554i;
                        }
                        if (m80Var.f36088w < 1.0f) {
                            radialProgress2.p(true, 1.0f);
                            j11 = 100;
                        }
                        this.K = this.I.E;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.J = ofFloat;
                        ofFloat.setStartDelay(j11);
                        this.J.setDuration(this.K * 250.0f);
                        this.J.setInterpolator(xq.f40452f);
                        this.J.addUpdateListener(new y50(this, 4));
                        this.J.addListener(new ii.m2(this, k10, 11));
                        this.J.start();
                    }
                } else {
                    if (this.L < 0) {
                        this.L = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.L;
                        if (this.M) {
                            j10 = 250;
                        } else {
                            j10 = 750;
                        }
                        if (currentTimeMillis <= 250 + j10 && currentTimeMillis > j10) {
                            this.I.E = xq.f40452f.getInterpolation(((float) (currentTimeMillis - j10)) / 250.0f);
                        }
                    }
                    if (vf0Var.f39099h1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                }
                int i3 = vf0Var.f39103n1;
                if (i3 == 0 && vf0Var.f39104o1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.O);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i10 = vf0Var.f39104o1;
                    Paint paint = this.O;
                    if (i3 == i10) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f10 = vf0Var.f39103n1;
                        canvas2.drawRoundRect(rectF, f10, f10, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i11 = 0; i11 < 4; i11++) {
                            fArr[i11] = vf0Var.f39103n1;
                            fArr[i11 + 4] = vf0Var.f39104o1;
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
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        int i13;
        super.onSizeChanged(i3, i10, i11, i12);
        if (this.I != null) {
            if (this.Q.A0.getOccupyStatusBar()) {
                i13 = org.telegram.messenger.g0.f22602m;
            } else {
                i13 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i13;
            int M = org.telegram.messenger.g0.M(80.0f);
            RadialProgress2 radialProgress2 = this.I;
            int i14 = this.H;
            int i15 = (i10 - currentActionBarHeight) - M;
            radialProgress2.r((i3 - i14) / 2, k2.p1.e(i15, i14, 2, currentActionBarHeight), (i3 + i14) / 2, ((i15 + i14) / 2) + currentActionBarHeight);
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
        vf0 vf0Var = this.Q;
        if (vf0Var.f39099h1) {
            vf0Var.invalidate();
        }
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }
}
