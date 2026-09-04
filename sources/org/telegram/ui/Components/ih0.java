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
public final class ih0 extends x9 implements lv0 {
    public final int G;
    public RadialProgress2 H;
    public ValueAnimator I;
    public float J;
    public long K;
    public boolean L;
    public final int M;
    public final Paint N;
    public Runnable O;
    public final oh0 P;

    public ih0(oh0 oh0Var, Context context, int i10, Paint paint) {
        super(context);
        this.P = oh0Var;
        this.G = AndroidUtilities.dp(64.0f);
        this.K = -1L;
        this.M = i10;
        this.N = paint;
        setLayerNum(oh0Var.l1);
    }

    @Override
    public final void g(Runnable runnable) {
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
        t90 t90Var;
        long j3;
        oh0 oh0Var = this.P;
        float[] fArr = oh0Var.O0;
        Path path = oh0Var.M0;
        ArrayList arrayList = oh0Var.f29055b1;
        RectF rectF = oh0Var.N0;
        org.telegram.ui.ov0 ov0Var = oh0Var.f29061h1;
        if (ov0Var == null || !ov0Var.f39337n) {
            if (this.H != null) {
                int k10 = oh0Var.D0.k(this.M);
                if (oh0Var.f29062i1) {
                    k10--;
                }
                Drawable drawable = getImageReceiver().getDrawable();
                long j10 = 0;
                if (k10 >= arrayList.size() || arrayList.get(k10) == null ? !(drawable == null || (this.L && (!(drawable instanceof d6) || ((d6) drawable).d[4] <= 0))) : ((Float) arrayList.get(k10)).floatValue() >= 1.0f) {
                    if (this.I == null) {
                        RadialProgress2 radialProgress2 = this.H;
                        if (radialProgress2.f24072c) {
                            t90Var = radialProgress2.f24077j;
                        } else {
                            t90Var = radialProgress2.f24076i;
                        }
                        if (t90Var.f30578w < 1.0f) {
                            radialProgress2.o(1.0f, true);
                            j10 = 100;
                        }
                        this.J = this.H.E;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.I = ofFloat;
                        ofFloat.setStartDelay(j10);
                        this.I.setDuration(this.J * 250.0f);
                        this.I.setInterpolator(pr.f29466f);
                        this.I.addUpdateListener(new h70(this, 4));
                        this.I.addListener(new fi.v2(this, k10, 8));
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
                            this.H.E = pr.f29466f.getInterpolation(((float) (currentTimeMillis - j3)) / 250.0f);
                        }
                    }
                    if (oh0Var.f29060g1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                }
                int i10 = oh0Var.f29065m1;
                if (i10 == 0 && oh0Var.f29066n1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.N);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i11 = oh0Var.f29066n1;
                    Paint paint = this.N;
                    if (i10 == i11) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f7 = oh0Var.f29065m1;
                        canvas2.drawRoundRect(rectF, f7, f7, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i12 = 0; i12 < 4; i12++) {
                            fArr[i12] = oh0Var.f29065m1;
                            fArr[i12 + 4] = oh0Var.f29066n1;
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
            if (this.P.f29073z0.getOccupyStatusBar()) {
                i14 = AndroidUtilities.statusBarHeight;
            } else {
                i14 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i14;
            int dp2 = AndroidUtilities.dp2(80.0f);
            RadialProgress2 radialProgress2 = this.H;
            int i15 = this.G;
            int i16 = (i11 - currentActionBarHeight) - dp2;
            radialProgress2.q((i10 - i15) / 2, i2.g.C(i16, i15, 2, currentActionBarHeight), (i10 + i15) / 2, ((i16 + i15) / 2) + currentActionBarHeight);
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
        oh0 oh0Var = this.P;
        if (oh0Var.f29060g1) {
            oh0Var.invalidate();
        }
        Runnable runnable = this.O;
        if (runnable != null) {
            runnable.run();
        }
    }
}
