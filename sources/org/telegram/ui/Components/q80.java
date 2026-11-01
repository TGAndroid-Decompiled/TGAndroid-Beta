package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.view.ViewConfiguration;
import java.util.ArrayList;
public final class q80 {
    public static final ArrayList f29665s = new ArrayList();
    public int f29666a;
    public int f29667b;
    public Paint f29668c;
    public Paint d;
    public int e;
    public int f29669f;
    public final CharacterStyle f29671i;
    public final float f29672j;
    public final float f29673k;
    public Rect f29675m;
    public float f29676n;
    public final long f29679q;
    public final ArrayList f29670g = new ArrayList();
    public int h = 0;
    public final Path f29674l = new Path();
    public long f29677o = -1;
    public long f29678p = -1;
    public final boolean f29680r = !org.telegram.messenger.tc.e(360928);

    public q80(CharacterStyle characterStyle, org.telegram.ui.ActionBar.p6 p6Var, float f7, float f10, int i10) {
        this.f29671i = characterStyle;
        d(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21337ze, p6Var));
        this.f29672j = f7;
        this.f29673k = f10;
        this.f29679q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int L;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        float min;
        boolean z14 = this.f29680r;
        if (z14) {
            L = 0;
        } else {
            L = org.telegram.messenger.i0.L(4.0f);
        }
        if (this.f29666a != L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f29668c == null) {
            Paint paint = new Paint(1);
            this.f29668c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f29668c.setColor(this.f29667b);
            this.e = Color.alpha(this.f29667b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f29667b);
            this.f29669f = Color.alpha(this.f29667b);
        }
        if (z10) {
            this.f29666a = L;
            if (L <= 0) {
                this.f29668c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f29668c.setPathEffect(new CornerPathEffect(this.f29666a));
                this.d.setPathEffect(new CornerPathEffect(this.f29666a));
            }
        }
        Rect rect = this.f29675m;
        float f10 = this.f29673k;
        float f11 = this.f29672j;
        ArrayList arrayList = this.f29670g;
        if (rect == null && this.h > 0) {
            RectF rectF = org.telegram.messenger.i0.P;
            ((k80) arrayList.get(0)).computeBounds(rectF, false);
            this.f29675m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = org.telegram.messenger.i0.P;
                ((k80) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f29675m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f29675m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f29675m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f29675m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f7 = f11;
            this.f29676n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f29675m.top - f10, 2.0d) + Math.pow(this.f29675m.left - f11, 2.0d), Math.pow(this.f29675m.top - f10, 2.0d) + Math.pow(this.f29675m.right - f11, 2.0d)), Math.max(Math.pow(this.f29675m.bottom - f10, 2.0d) + Math.pow(this.f29675m.left - f11, 2.0d), Math.pow(this.f29675m.bottom - f10, 2.0d) + Math.pow(this.f29675m.right - f11, 2.0d))));
        } else {
            z11 = 0;
            z12 = z14;
            z13 = true;
            f7 = f11;
        }
        if (z12) {
            for (int i11 = z11; i11 < this.h; i11++) {
                canvas.drawPath((Path) arrayList.get(i11), this.d);
            }
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f29677o < 0) {
                this.f29677o = elapsedRealtime;
            }
            float interpolation = gr.f26523f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f29677o)) / ((float) this.f29679q)));
            long j10 = this.f29678p;
            if (j10 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j10)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f29668c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * f12));
            this.f29668c.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.i0.L(5.0f));
            for (int i12 = z11; i12 < this.h; i12++) {
                ((k80) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f29668c);
            }
            this.d.setAlpha((int) (this.f29669f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.i0.L(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f29676n;
                canvas.save();
                Path path = this.f29674l;
                path.reset();
                path.addCircle(f7, f10, f13, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i14 = z11; i14 < this.h; i14++) {
                    canvas.drawPath((Path) arrayList.get(i14), this.d);
                }
                canvas.restore();
            } else {
                for (int i15 = z11; i15 < this.h; i15++) {
                    canvas.drawPath((Path) arrayList.get(i15), this.d);
                }
            }
            if (i13 < 0 || this.f29678p >= 0) {
                return z13;
            }
        }
        return z11;
    }

    public final k80 b() {
        k80 k80Var;
        ArrayList arrayList = f29665s;
        if (!arrayList.isEmpty()) {
            k80Var = (k80) arrayList.remove(0);
        } else {
            k80Var = new k80(0);
        }
        k80Var.f27550c = !this.f29680r;
        k80Var.reset();
        ArrayList arrayList2 = this.f29670g;
        arrayList2.add(k80Var);
        this.h = arrayList2.size();
        return k80Var;
    }

    public final void c() {
        ArrayList arrayList = this.f29670g;
        if (arrayList.isEmpty()) {
            return;
        }
        f29665s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f29667b = i10;
        Paint paint = this.f29668c;
        if (paint != null) {
            paint.setColor(i10);
            this.e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f29669f = Color.alpha(i10);
        }
    }
}
