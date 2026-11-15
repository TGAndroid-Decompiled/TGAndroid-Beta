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
public final class a80 {
    public static final ArrayList f32915s = new ArrayList();
    public int f32916a;
    public int f32917b;
    public Paint f32918c;
    public Paint d;
    public int f32919e;
    public int f32920f;
    public final CharacterStyle f32922i;
    public final float f32923j;
    public final float f32924k;
    public Rect f32926m;
    public float f32927n;
    public final long f32930q;
    public final ArrayList f32921g = new ArrayList();
    public int h = 0;
    public final Path f32925l = new Path();
    public long f32928o = -1;
    public long f32929p = -1;
    public final boolean f32931r = !org.telegram.messenger.qc.e(360928);

    public a80(CharacterStyle characterStyle, org.telegram.ui.ActionBar.e6 e6Var, float f10, float f11, int i7) {
        this.f32922i = characterStyle;
        d(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ce, e6Var));
        this.f32923j = f10;
        this.f32924k = f11;
        this.f32930q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int L;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f10;
        float min;
        boolean z14 = this.f32931r;
        if (z14) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(4.0f);
        }
        if (this.f32916a != L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f32918c == null) {
            Paint paint = new Paint(1);
            this.f32918c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f32918c.setColor(this.f32917b);
            this.f32919e = Color.alpha(this.f32917b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f32917b);
            this.f32920f = Color.alpha(this.f32917b);
        }
        if (z10) {
            this.f32916a = L;
            if (L <= 0) {
                this.f32918c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f32918c.setPathEffect(new CornerPathEffect(this.f32916a));
                this.d.setPathEffect(new CornerPathEffect(this.f32916a));
            }
        }
        Rect rect = this.f32926m;
        float f11 = this.f32924k;
        float f12 = this.f32923j;
        ArrayList arrayList = this.f32921g;
        if (rect == null && this.h > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            ((u70) arrayList.get(0)).computeBounds(rectF, false);
            this.f32926m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i7 = 1; i7 < this.h; i7++) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                ((u70) arrayList.get(i7)).computeBounds(rectF2, false);
                Rect rect2 = this.f32926m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f32926m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f32926m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f32926m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f10 = f12;
            this.f32927n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f32926m.top - f11, 2.0d) + Math.pow(this.f32926m.left - f12, 2.0d), Math.pow(this.f32926m.top - f11, 2.0d) + Math.pow(this.f32926m.right - f12, 2.0d)), Math.max(Math.pow(this.f32926m.bottom - f11, 2.0d) + Math.pow(this.f32926m.left - f12, 2.0d), Math.pow(this.f32926m.bottom - f11, 2.0d) + Math.pow(this.f32926m.right - f12, 2.0d))));
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
            return z11;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f32928o < 0) {
            this.f32928o = elapsedRealtime;
        }
        float interpolation = er.f34419f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f32928o)) / ((float) this.f32930q)));
        long j3 = this.f32929p;
        if (j3 < 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j3)) / 100.0f));
        }
        float f13 = 1.0f - min;
        this.f32918c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f32919e * 0.2f * f13));
        this.f32918c.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
        for (int i11 = z11; i11 < this.h; i11++) {
            ((u70) arrayList.get(i11)).a();
            canvas.drawPath((Path) arrayList.get(i11), this.f32918c);
        }
        this.d.setAlpha((int) (this.f32920f * 0.8f * f13));
        this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
        int i12 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
        if (i12 < 0) {
            float f14 = interpolation * this.f32927n;
            canvas.save();
            Path path = this.f32925l;
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
        if (i12 >= 0 && this.f32929p < 0) {
            return z11;
        }
        return z13;
    }

    public final u70 b() {
        u70 u70Var;
        ArrayList arrayList = f32915s;
        if (!arrayList.isEmpty()) {
            u70Var = (u70) arrayList.remove(0);
        } else {
            u70Var = new u70(0);
        }
        u70Var.f35683c = !this.f32931r;
        u70Var.reset();
        ArrayList arrayList2 = this.f32921g;
        arrayList2.add(u70Var);
        this.h = arrayList2.size();
        return u70Var;
    }

    public final void c() {
        ArrayList arrayList = this.f32921g;
        if (arrayList.isEmpty()) {
            return;
        }
        f32915s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i7) {
        this.f32917b = i7;
        Paint paint = this.f32918c;
        if (paint != null) {
            paint.setColor(i7);
            this.f32919e = Color.alpha(i7);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i7);
            this.f32920f = Color.alpha(i7);
        }
    }
}
