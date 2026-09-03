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
public final class qh0 extends p9 implements nv0 {
    public final int D;
    public RadialProgress2 E;
    public ValueAnimator F;
    public float G;
    public long H;
    public boolean I;
    public final int J;
    public final Paint K;
    public Runnable L;
    public final wh0 M;

    public qh0(wh0 wh0Var, Context context, int i10, Paint paint) {
        super(context);
        this.M = wh0Var;
        this.D = AndroidUtilities.dp(64.0f);
        this.H = -1L;
        this.J = i10;
        this.K = paint;
        setLayerNum(wh0Var.f30267i1);
    }

    @Override
    public final void g(Runnable runnable) {
        this.L = runnable;
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        Runnable runnable = this.L;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        v90 v90Var;
        long j10;
        wh0 wh0Var = this.M;
        float[] fArr = wh0Var.L0;
        Path path = wh0Var.J0;
        ArrayList arrayList = wh0Var.Y0;
        RectF rectF = wh0Var.K0;
        org.telegram.ui.cv0 cv0Var = wh0Var.f30263e1;
        if (cv0Var == null || !cv0Var.f33235n) {
            if (this.E != null) {
                int k10 = wh0Var.A0.k(this.J);
                if (wh0Var.f30264f1) {
                    k10--;
                }
                Drawable drawable = getImageReceiver().getDrawable();
                long j11 = 0;
                if (k10 >= arrayList.size() || arrayList.get(k10) == null ? !(drawable == null || (this.I && (!(drawable instanceof y5) || ((y5) drawable).d[4] <= 0))) : ((Float) arrayList.get(k10)).floatValue() >= 1.0f) {
                    if (this.F == null) {
                        RadialProgress2 radialProgress2 = this.E;
                        if (radialProgress2.f23087c) {
                            v90Var = radialProgress2.f23091j;
                        } else {
                            v90Var = radialProgress2.f23090i;
                        }
                        if (v90Var.f29437w < 1.0f) {
                            radialProgress2.o(1.0f, true);
                            j11 = 100;
                        }
                        this.G = this.E.E;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.F = ofFloat;
                        ofFloat.setStartDelay(j11);
                        this.F.setDuration(this.G * 250.0f);
                        this.F.setInterpolator(mr.f27122f);
                        this.F.addUpdateListener(new j70(this, 4));
                        this.F.addListener(new org.telegram.ui.Cells.a4(this, k10, 5));
                        this.F.start();
                    }
                } else {
                    if (this.H < 0) {
                        this.H = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.H;
                        if (this.I) {
                            j10 = 250;
                        } else {
                            j10 = 750;
                        }
                        if (currentTimeMillis <= 250 + j10 && currentTimeMillis > j10) {
                            this.E.E = mr.f27122f.getInterpolation(((float) (currentTimeMillis - j10)) / 250.0f);
                        }
                    }
                    if (wh0Var.f30262d1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                }
                int i10 = wh0Var.f30268j1;
                if (i10 == 0 && wh0Var.f30269k1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.K);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i11 = wh0Var.f30269k1;
                    Paint paint = this.K;
                    if (i10 == i11) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f10 = wh0Var.f30268j1;
                        canvas2.drawRoundRect(rectF, f10, f10, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i12 = 0; i12 < 4; i12++) {
                            fArr[i12] = wh0Var.f30268j1;
                            fArr[i12 + 4] = wh0Var.f30269k1;
                        }
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas2.drawPath(path, paint);
                    }
                }
            } else {
                canvas2 = canvas;
            }
            super.onDraw(canvas);
            RadialProgress2 radialProgress22 = this.E;
            if (radialProgress22 != null && radialProgress22.E > 0.0f) {
                radialProgress22.draw(canvas2);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.E != null) {
            if (this.M.f30275w0.getOccupyStatusBar()) {
                i14 = AndroidUtilities.statusBarHeight;
            } else {
                i14 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i14;
            int dp2 = AndroidUtilities.dp2(80.0f);
            RadialProgress2 radialProgress2 = this.E;
            int i15 = this.D;
            int i16 = (i11 - currentActionBarHeight) - dp2;
            radialProgress2.q((i10 - i15) / 2, kf.k0.d(i16, i15, 2, currentActionBarHeight), (i10 + i15) / 2, ((i16 + i15) / 2) + currentActionBarHeight);
        }
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.L;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        wh0 wh0Var = this.M;
        if (wh0Var.f30262d1) {
            wh0Var.invalidate();
        }
        Runnable runnable = this.L;
        if (runnable != null) {
            runnable.run();
        }
    }
}
