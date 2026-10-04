package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zn0 extends View {
    public yn0 f33575a;
    public final e6 f33576b;
    public final ch.d f33577c;
    public zg.o0 d;
    public boolean f33578e;
    public final Path f33579f;
    public final RectF h;
    public final RectF f33580n;
    public boolean f33581r;
    public final ao0 f33582s;

    public zn0(ao0 ao0Var, Context context) {
        super(context);
        this.f33582s = ao0Var;
        this.f33576b = new e6(this, 0L, 260L, tr.h);
        this.f33579f = new Path();
        this.h = new RectF();
        this.f33580n = new RectF();
        w7.b6.a(this);
        ah.c cVar = ao0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.x(ao0Var.f24619w);
            c10.C(AndroidUtilities.dp(5.0f));
            ch.d w10 = c10.w();
            w10.z(AndroidUtilities.dp(6.0f));
            w10.y(AndroidUtilities.dp(4.0f));
            this.f33577c = w10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f33578e == z10) {
            return;
        }
        this.f33578e = z10;
        yn0 yn0Var = this.f33575a;
        if (yn0Var != null) {
            yn0Var.f53464p = z10;
            e6 e6Var = this.f33576b;
            if (z11) {
                yn0Var.f53457i = yn0Var.N;
                yn0Var.f53455g = yn0Var.O;
                yn0Var.h = yn0Var.P;
                e6Var.d(0.0f, true);
            } else {
                e6Var.d(1.0f, true);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f33581r) {
            yn0 yn0Var = this.f33575a;
            if (yn0Var != null) {
                yn0Var.a();
            }
            this.f33581r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f33581r) {
            yn0 yn0Var = this.f33575a;
            if (yn0Var != null) {
                yn0Var.b();
            }
            this.f33581r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        ao0 ao0Var = this.f33582s;
        Paint paint = ao0Var.f24620x;
        int width = (getWidth() - this.f33575a.A) / 2;
        int height = getHeight();
        yn0 yn0Var = this.f33575a;
        int i11 = yn0Var.B;
        int i12 = (height - i11) / 2;
        ch.d dVar = this.f33577c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, yn0Var.A + width, i11 + i12);
            RectF rectF = this.f33580n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f33579f;
            if (!equals) {
                rectF2.set(rectF);
                zg.p0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.d6 d6Var = ao0Var.f24613c;
            if (d6Var == null ? org.telegram.ui.ActionBar.i6.I.q() : d6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f33575a.d(canvas, width, i12, this.f33576b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        yn0 yn0Var = this.f33575a;
        if (yn0Var != null) {
            dp = yn0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
