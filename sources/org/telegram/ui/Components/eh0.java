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
public final class eh0 extends t9 implements ev0 {
    public final int C;
    public RadialProgress2 D;
    public ValueAnimator E;
    public float F;
    public long G;
    public boolean H;
    public final int I;
    public final Paint J;
    public Runnable K;
    public final kh0 L;

    public eh0(kh0 kh0Var, Context context, int i10, Paint paint) {
        super(context);
        this.L = kh0Var;
        this.C = AndroidUtilities.dp(64.0f);
        this.G = -1L;
        this.I = i10;
        this.J = paint;
        setLayerNum(kh0Var.f30053h1);
    }

    @Override
    public final void g(Runnable runnable) {
        this.K = runnable;
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        Runnable runnable = this.K;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        o90 o90Var;
        long j10;
        kh0 kh0Var = this.L;
        float[] fArr = kh0Var.K0;
        Path path = kh0Var.I0;
        ArrayList arrayList = kh0Var.X0;
        RectF rectF = kh0Var.J0;
        org.telegram.ui.lu0 lu0Var = kh0Var.f30049d1;
        if (lu0Var == null || !lu0Var.f40300n) {
            if (this.D != null) {
                int k9 = kh0Var.f30065z0.k(this.I);
                if (kh0Var.f30050e1) {
                    k9--;
                }
                Drawable drawable = getImageReceiver().getDrawable();
                long j11 = 0;
                if (k9 >= arrayList.size() || arrayList.get(k9) == null ? !(drawable == null || (this.H && (!(drawable instanceof c6) || ((c6) drawable).d[4] <= 0))) : ((Float) arrayList.get(k9)).floatValue() >= 1.0f) {
                    if (this.E == null) {
                        RadialProgress2 radialProgress2 = this.D;
                        if (radialProgress2.f26481c) {
                            o90Var = radialProgress2.f26486j;
                        } else {
                            o90Var = radialProgress2.f26485i;
                        }
                        if (o90Var.f31316w < 1.0f) {
                            radialProgress2.o(1.0f, true);
                            j11 = 100;
                        }
                        this.F = this.D.E;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.E = ofFloat;
                        ofFloat.setStartDelay(j11);
                        this.E.setDuration(this.F * 250.0f);
                        this.E.setInterpolator(jr.f29800f);
                        this.E.addUpdateListener(new d70(this, 4));
                        this.E.addListener(new org.telegram.ui.Cells.z3(this, k9, 5));
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
                            this.D.E = jr.f29800f.getInterpolation(((float) (currentTimeMillis - j10)) / 250.0f);
                        }
                    }
                    if (kh0Var.f30048c1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                }
                int i10 = kh0Var.f30054i1;
                if (i10 == 0 && kh0Var.f30055j1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.J);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i11 = kh0Var.f30055j1;
                    Paint paint = this.J;
                    if (i10 == i11) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f9 = kh0Var.f30054i1;
                        canvas2.drawRoundRect(rectF, f9, f9, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i12 = 0; i12 < 4; i12++) {
                            fArr[i12] = kh0Var.f30054i1;
                            fArr[i12 + 4] = kh0Var.f30055j1;
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
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.D != null) {
            if (this.L.f30061v0.getOccupyStatusBar()) {
                i14 = AndroidUtilities.statusBarHeight;
            } else {
                i14 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i14;
            int dp2 = AndroidUtilities.dp2(80.0f);
            RadialProgress2 radialProgress2 = this.D;
            int i15 = this.C;
            int i16 = (i11 - currentActionBarHeight) - dp2;
            radialProgress2.q((i10 - i15) / 2, j7.l1.e(i16, i15, 2, currentActionBarHeight), (i10 + i15) / 2, ((i16 + i15) / 2) + currentActionBarHeight);
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
        kh0 kh0Var = this.L;
        if (kh0Var.f30048c1) {
            kh0Var.invalidate();
        }
        Runnable runnable = this.K;
        if (runnable != null) {
            runnable.run();
        }
    }
}
