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
import org.telegram.messenger.AndroidUtilities;
public final class ug0 extends o9 implements uu0 {
    public final int C;
    public RadialProgress2 D;
    public ValueAnimator E;
    public float F;
    public long G;
    public boolean H;
    public final int I;
    public final Paint J;
    public Runnable K;
    public final ah0 L;

    public ug0(ah0 ah0Var, Context context, int i9, Paint paint) {
        super(context);
        this.L = ah0Var;
        this.C = AndroidUtilities.dp(64.0f);
        this.G = -1L;
        this.I = i9;
        this.J = paint;
        setLayerNum(ah0Var.f26802h1);
    }

    @Override
    public final void g(Runnable runnable) {
        this.K = runnable;
    }

    @Override
    public final void invalidate(int i9, int i10, int i11, int i12) {
        super.invalidate(i9, i10, i11, i12);
        Runnable runnable = this.K;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        b90 b90Var;
        long j10;
        ah0 ah0Var = this.L;
        float[] fArr = ah0Var.K0;
        Path path = ah0Var.I0;
        ArrayList arrayList = ah0Var.X0;
        RectF rectF = ah0Var.J0;
        org.telegram.ui.nu0 nu0Var = ah0Var.f26798d1;
        if (nu0Var == null || !nu0Var.f40824n) {
            if (this.D != null) {
                int k10 = ah0Var.f26814z0.k(this.I);
                if (ah0Var.f26799e1) {
                    k10--;
                }
                Drawable drawable = getImageReceiver().getDrawable();
                long j11 = 0;
                if (k10 >= arrayList.size() || arrayList.get(k10) == null ? !(drawable == null || (this.H && (!(drawable instanceof x5) || ((x5) drawable).d[4] <= 0))) : ((Float) arrayList.get(k10)).floatValue() >= 1.0f) {
                    if (this.E == null) {
                        RadialProgress2 radialProgress2 = this.D;
                        if (radialProgress2.f26470c) {
                            b90Var = radialProgress2.f26475j;
                        } else {
                            b90Var = radialProgress2.f26474i;
                        }
                        if (b90Var.f27116w < 1.0f) {
                            radialProgress2.o(1.0f, true);
                            j11 = 100;
                        }
                        this.F = this.D.E;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.E = ofFloat;
                        ofFloat.setStartDelay(j11);
                        this.E.setDuration(this.F * 250.0f);
                        this.E.setInterpolator(gr.f28844f);
                        this.E.addUpdateListener(new q60(this, 4));
                        this.E.addListener(new mh.o2(this, k10, 7));
                        this.E.start();
                    }
                } else {
                    if (this.G < 0) {
                        this.G = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.G;
                        if (this.H) {
                            j10 = 250;
                        } else {
                            j10 = 750;
                        }
                        if (currentTimeMillis <= 250 + j10 && currentTimeMillis > j10) {
                            this.D.E = gr.f28844f.getInterpolation(((float) (currentTimeMillis - j10)) / 250.0f);
                        }
                    }
                    if (ah0Var.f26797c1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                }
                int i9 = ah0Var.f26803i1;
                if (i9 == 0 && ah0Var.f26804j1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.J);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i10 = ah0Var.f26804j1;
                    Paint paint = this.J;
                    if (i9 == i10) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f10 = ah0Var.f26803i1;
                        canvas2.drawRoundRect(rectF, f10, f10, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i11 = 0; i11 < 4; i11++) {
                            fArr[i11] = ah0Var.f26803i1;
                            fArr[i11 + 4] = ah0Var.f26804j1;
                        }
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas2.drawPath(path, paint);
                    }
                }
            } else {
                canvas2 = canvas;
            }
            super.onDraw(canvas);
            RadialProgress2 radialProgress22 = this.D;
            if (radialProgress22 != null && radialProgress22.E > 0.0f) {
                radialProgress22.draw(canvas2);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        int i13;
        super.onSizeChanged(i9, i10, i11, i12);
        if (this.D != null) {
            if (this.L.f26810v0.getOccupyStatusBar()) {
                i13 = AndroidUtilities.statusBarHeight;
            } else {
                i13 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i13;
            int dp2 = AndroidUtilities.dp2(80.0f);
            RadialProgress2 radialProgress2 = this.D;
            int i14 = this.C;
            int i15 = (i10 - currentActionBarHeight) - dp2;
            radialProgress2.q((i9 - i14) / 2, j3.r0.d(i15, i14, 2, currentActionBarHeight), (i9 + i14) / 2, ((i15 + i14) / 2) + currentActionBarHeight);
        }
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.K;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        ah0 ah0Var = this.L;
        if (ah0Var.f26797c1) {
            ah0Var.invalidate();
        }
        Runnable runnable = this.K;
        if (runnable != null) {
            runnable.run();
        }
    }
}
