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
public final class x70 {
    public static final ArrayList f40239s = new ArrayList();
    public int f40240a;
    public int f40241b;
    public Paint f40242c;
    public Paint d;
    public int f40243e;
    public int f40244f;
    public final CharacterStyle f40246i;
    public final float f40247j;
    public final float f40248k;
    public Rect f40250m;
    public float f40251n;
    public final long f40254q;
    public final ArrayList f40245g = new ArrayList();
    public int h = 0;
    public final Path f40249l = new Path();
    public long f40252o = -1;
    public long f40253p = -1;
    public final boolean f40255r = !org.telegram.messenger.sc.e(360928);

    public x70(CharacterStyle characterStyle, org.telegram.ui.ActionBar.f6 f6Var, float f10, float f11, int i7) {
        this.f40246i = characterStyle;
        d(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28269ze, f6Var));
        this.f40247j = f10;
        this.f40248k = f11;
        this.f40254q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int L;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        float min;
        boolean z13 = this.f40255r;
        if (z13) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(4.0f);
        }
        if (this.f40240a != L) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f40242c == null) {
            Paint paint = new Paint(1);
            this.f40242c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f40242c.setColor(this.f40241b);
            this.f40243e = Color.alpha(this.f40241b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f40241b);
            this.f40244f = Color.alpha(this.f40241b);
        }
        if (z9) {
            this.f40240a = L;
            if (L <= 0) {
                this.f40242c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f40242c.setPathEffect(new CornerPathEffect(this.f40240a));
                this.d.setPathEffect(new CornerPathEffect(this.f40240a));
            }
        }
        Rect rect = this.f40250m;
        float f11 = this.f40248k;
        float f12 = this.f40247j;
        ArrayList arrayList = this.f40245g;
        if (rect == null && this.h > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            ((r70) arrayList.get(0)).computeBounds(rectF, false);
            this.f40250m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i7 = 1; i7 < this.h; i7++) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                ((r70) arrayList.get(i7)).computeBounds(rectF2, false);
                Rect rect2 = this.f40250m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f40250m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f40250m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f40250m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z10 = 0;
            z11 = z13;
            z12 = true;
            f10 = f12;
            this.f40251n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f40250m.top - f11, 2.0d) + Math.pow(this.f40250m.left - f12, 2.0d), Math.pow(this.f40250m.top - f11, 2.0d) + Math.pow(this.f40250m.right - f12, 2.0d)), Math.max(Math.pow(this.f40250m.bottom - f11, 2.0d) + Math.pow(this.f40250m.left - f12, 2.0d), Math.pow(this.f40250m.bottom - f11, 2.0d) + Math.pow(this.f40250m.right - f12, 2.0d))));
        } else {
            z10 = 0;
            z11 = z13;
            z12 = true;
            f10 = f12;
        }
        if (z11) {
            for (int i10 = z10; i10 < this.h; i10++) {
                canvas.drawPath((Path) arrayList.get(i10), this.d);
            }
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f40252o < 0) {
                this.f40252o = elapsedRealtime;
            }
            float interpolation = xq.f40366f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f40252o)) / ((float) this.f40254q)));
            long j3 = this.f40253p;
            if (j3 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j3)) / 100.0f));
            }
            float f13 = 1.0f - min;
            this.f40242c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f40243e * 0.2f * f13));
            this.f40242c.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
            for (int i11 = z10; i11 < this.h; i11++) {
                ((r70) arrayList.get(i11)).a();
                canvas.drawPath((Path) arrayList.get(i11), this.f40242c);
            }
            this.d.setAlpha((int) (this.f40244f * 0.8f * f13));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
            int i12 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i12 < 0) {
                float f14 = interpolation * this.f40251n;
                canvas.save();
                Path path = this.f40249l;
                path.reset();
                path.addCircle(f10, f11, f14, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i13 = z10; i13 < this.h; i13++) {
                    canvas.drawPath((Path) arrayList.get(i13), this.d);
                }
                canvas.restore();
            } else {
                for (int i14 = z10; i14 < this.h; i14++) {
                    canvas.drawPath((Path) arrayList.get(i14), this.d);
                }
            }
            if (i12 < 0 || this.f40253p >= 0) {
                return z12;
            }
        }
        return z10;
    }

    public final r70 b() {
        r70 r70Var;
        ArrayList arrayList = f40239s;
        if (!arrayList.isEmpty()) {
            r70Var = (r70) arrayList.remove(0);
        } else {
            r70Var = new r70(0);
        }
        r70Var.f31890c = !this.f40255r;
        r70Var.reset();
        ArrayList arrayList2 = this.f40245g;
        arrayList2.add(r70Var);
        this.h = arrayList2.size();
        return r70Var;
    }

    public final void c() {
        ArrayList arrayList = this.f40245g;
        if (arrayList.isEmpty()) {
            return;
        }
        f40239s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i7) {
        this.f40241b = i7;
        Paint paint = this.f40242c;
        if (paint != null) {
            paint.setColor(i7);
            this.f40243e = Color.alpha(i7);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i7);
            this.f40244f = Color.alpha(i7);
        }
    }
}
