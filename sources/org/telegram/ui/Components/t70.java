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
public final class t70 {
    public static final ArrayList f38321s = new ArrayList();
    public int f38322a;
    public int f38323b;
    public Paint f38324c;
    public Paint d;
    public int f38325e;
    public int f38326f;
    public final CharacterStyle f38328i;
    public final float f38329j;
    public final float f38330k;
    public Rect f38332m;
    public float f38333n;
    public final long f38336q;
    public final ArrayList f38327g = new ArrayList();
    public int h = 0;
    public final Path f38331l = new Path();
    public long f38334o = -1;
    public long f38335p = -1;
    public final boolean f38337r = !org.telegram.messenger.lc.e(360928);

    public t70(CharacterStyle characterStyle, org.telegram.ui.ActionBar.e6 e6Var, float f10, float f11, int i3) {
        this.f38328i = characterStyle;
        d(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28298ze, e6Var));
        this.f38329j = f10;
        this.f38330k = f11;
        this.f38336q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int L;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f10;
        float min;
        boolean z14 = this.f38337r;
        if (z14) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(4.0f);
        }
        if (this.f38322a != L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f38324c == null) {
            Paint paint = new Paint(1);
            this.f38324c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f38324c.setColor(this.f38323b);
            this.f38325e = Color.alpha(this.f38323b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f38323b);
            this.f38326f = Color.alpha(this.f38323b);
        }
        if (z10) {
            this.f38322a = L;
            if (L <= 0) {
                this.f38324c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f38324c.setPathEffect(new CornerPathEffect(this.f38322a));
                this.d.setPathEffect(new CornerPathEffect(this.f38322a));
            }
        }
        Rect rect = this.f38332m;
        float f11 = this.f38330k;
        float f12 = this.f38329j;
        ArrayList arrayList = this.f38327g;
        if (rect == null && this.h > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            ((n70) arrayList.get(0)).computeBounds(rectF, false);
            this.f38332m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i3 = 1; i3 < this.h; i3++) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                ((n70) arrayList.get(i3)).computeBounds(rectF2, false);
                Rect rect2 = this.f38332m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f38332m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f38332m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f38332m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f10 = f12;
            this.f38333n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f38332m.top - f11, 2.0d) + Math.pow(this.f38332m.left - f12, 2.0d), Math.pow(this.f38332m.top - f11, 2.0d) + Math.pow(this.f38332m.right - f12, 2.0d)), Math.max(Math.pow(this.f38332m.bottom - f11, 2.0d) + Math.pow(this.f38332m.left - f12, 2.0d), Math.pow(this.f38332m.bottom - f11, 2.0d) + Math.pow(this.f38332m.right - f12, 2.0d))));
        } else {
            z11 = 0;
            z12 = z14;
            z13 = true;
            f10 = f12;
        }
        if (z12) {
            for (int i10 = z11; i10 < this.h; i10++) {
                canvas.drawPath((Path) arrayList.get(i10), this.d);
            }
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f38334o < 0) {
                this.f38334o = elapsedRealtime;
            }
            float interpolation = xq.f40452f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f38334o)) / ((float) this.f38336q)));
            long j10 = this.f38335p;
            if (j10 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j10)) / 100.0f));
            }
            float f13 = 1.0f - min;
            this.f38324c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f38325e * 0.2f * f13));
            this.f38324c.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
            for (int i11 = z11; i11 < this.h; i11++) {
                ((n70) arrayList.get(i11)).a();
                canvas.drawPath((Path) arrayList.get(i11), this.f38324c);
            }
            this.d.setAlpha((int) (this.f38326f * 0.8f * f13));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
            int i12 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i12 < 0) {
                float f14 = interpolation * this.f38333n;
                canvas.save();
                Path path = this.f38331l;
                path.reset();
                path.addCircle(f10, f11, f14, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i13 = z11; i13 < this.h; i13++) {
                    canvas.drawPath((Path) arrayList.get(i13), this.d);
                }
                canvas.restore();
            } else {
                for (int i14 = z11; i14 < this.h; i14++) {
                    canvas.drawPath((Path) arrayList.get(i14), this.d);
                }
            }
            if (i12 < 0 || this.f38335p >= 0) {
                return z13;
            }
        }
        return z11;
    }

    public final n70 b() {
        n70 n70Var;
        ArrayList arrayList = f38321s;
        if (!arrayList.isEmpty()) {
            n70Var = (n70) arrayList.remove(0);
        } else {
            n70Var = new n70(0);
        }
        n70Var.f32362c = !this.f38337r;
        n70Var.reset();
        ArrayList arrayList2 = this.f38327g;
        arrayList2.add(n70Var);
        this.h = arrayList2.size();
        return n70Var;
    }

    public final void c() {
        ArrayList arrayList = this.f38327g;
        if (arrayList.isEmpty()) {
            return;
        }
        f38321s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i3) {
        this.f38323b = i3;
        Paint paint = this.f38324c;
        if (paint != null) {
            paint.setColor(i3);
            this.f38325e = Color.alpha(i3);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i3);
            this.f38326f = Color.alpha(i3);
        }
    }
}
