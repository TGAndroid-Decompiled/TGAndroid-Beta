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

public final class wg0 extends n9 implements wu0 {
    public final int C;
    public RadialProgress2 D;
    public ValueAnimator E;
    public float F;
    public long G;
    public boolean H;
    public final int I;
    public final Paint J;
    public Runnable K;
    public final ch0 L;

    public wg0(ch0 ch0Var, Context context, int i10, Paint paint) {
        super(context);
        this.L = ch0Var;
        this.C = AndroidUtilities.dp(64.0f);
        this.G = -1L;
        this.I = i10;
        this.J = paint;
        setLayerNum(ch0Var.f27439h1);
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
        ch0 ch0Var = this.L;
        float[] fArr = ch0Var.K0;
        Path path = ch0Var.I0;
        ArrayList arrayList = ch0Var.X0;
        RectF rectF = ch0Var.J0;
        org.telegram.ui.ou0 ou0Var = ch0Var.f27435d1;
        if (ou0Var == null || !ou0Var.f41180n) {
            if (this.D != null) {
                int iK = ch0Var.f27451z0.k(this.I);
                if (ch0Var.f27436e1) {
                    iK--;
                }
                Drawable drawable = getImageReceiver().getDrawable();
                long j10 = 0;
                int i10 = 4;
                if (iK >= arrayList.size() || arrayList.get(iK) == null ? drawable == null || (this.H && (!(drawable instanceof x5) || ((x5) drawable).d[4] <= 0)) : ((Float) arrayList.get(iK)).floatValue() < 1.0f) {
                    if (this.G < 0) {
                        this.G = System.currentTimeMillis();
                    } else {
                        long jCurrentTimeMillis = System.currentTimeMillis() - this.G;
                        long j11 = this.H ? 250L : 750L;
                        if (jCurrentTimeMillis <= 250 + j11 && jCurrentTimeMillis > j11) {
                            this.D.E = er.f28122f.getInterpolation((jCurrentTimeMillis - j11) / 250.0f);
                        }
                    }
                    if (ch0Var.f27434c1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                } else if (this.E == null) {
                    RadialProgress2 radialProgress2 = this.D;
                    if ((radialProgress2.f26466c ? radialProgress2.f26471j : radialProgress2.f26470i).f28314w < 1.0f) {
                        radialProgress2.o(1.0f, true);
                        j10 = 100;
                    }
                    this.F = this.D.E;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.E = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.setStartDelay(j10);
                    this.E.setDuration((long) (this.F * 250.0f));
                    this.E.setInterpolator(er.f28122f);
                    this.E.addUpdateListener(new v60(this, i10));
                    this.E.addListener(new nh.n2(this, iK, 7));
                    this.E.start();
                }
                int i11 = ch0Var.f27440i1;
                if (i11 == 0 && ch0Var.f27441j1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.J);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i12 = ch0Var.f27441j1;
                    Paint paint = this.J;
                    if (i11 == i12) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f10 = ch0Var.f27440i1;
                        canvas2.drawRoundRect(rectF, f10, f10, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i13 = 0; i13 < 4; i13++) {
                            fArr[i13] = ch0Var.f27440i1;
                            fArr[i13 + 4] = ch0Var.f27441j1;
                        }
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas2.drawPath(path, paint);
                    }
                }
            } else {
                canvas2 = canvas;
            }
            super.onDraw(canvas);
            RadialProgress2 radialProgress3 = this.D;
            if (radialProgress3 == null || radialProgress3.E <= 0.0f) {
                return;
            }
            radialProgress3.draw(canvas2);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.D != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.L.f27447v0.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            int iDp2 = AndroidUtilities.dp2(80.0f);
            RadialProgress2 radialProgress2 = this.D;
            int i14 = this.C;
            int i15 = (i11 - currentActionBarHeight) - iDp2;
            radialProgress2.q((i10 - i14) / 2, i0.a.B(i15, i14, 2, currentActionBarHeight), (i10 + i14) / 2, ((i15 + i14) / 2) + currentActionBarHeight);
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
        ch0 ch0Var = this.L;
        if (ch0Var.f27434c1) {
            ch0Var.invalidate();
        }
        Runnable runnable = this.K;
        if (runnable != null) {
            runnable.run();
        }
    }
}
