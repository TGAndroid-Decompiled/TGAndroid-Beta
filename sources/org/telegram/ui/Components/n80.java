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
public final class n80 {
    public static final ArrayList f37832s = new ArrayList();
    public int f37833a;
    public int f37834b;
    public Paint f37835c;
    public Paint d;
    public int f37836e;
    public int f37837f;
    public final CharacterStyle f37839i;
    public final float f37840j;
    public final float f37841k;
    public Rect f37843m;
    public float f37844n;
    public final long f37847q;
    public final ArrayList f37838g = new ArrayList();
    public int h = 0;
    public final Path f37842l = new Path();
    public long f37845o = -1;
    public long f37846p = -1;
    public final boolean f37848r = !org.telegram.messenger.qc.e(360928);

    public n80(CharacterStyle characterStyle, org.telegram.ui.ActionBar.h6 h6Var, float f10, float f11, int i7) {
        this.f37839i = characterStyle;
        d(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ce, h6Var));
        this.f37840j = f10;
        this.f37841k = f11;
        this.f37847q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int L;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f10;
        float min;
        boolean z14 = this.f37848r;
        if (z14) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(4.0f);
        }
        if (this.f37833a != L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f37835c == null) {
            Paint paint = new Paint(1);
            this.f37835c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f37835c.setColor(this.f37834b);
            this.f37836e = Color.alpha(this.f37834b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f37834b);
            this.f37837f = Color.alpha(this.f37834b);
        }
        if (z10) {
            this.f37833a = L;
            if (L <= 0) {
                this.f37835c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f37835c.setPathEffect(new CornerPathEffect(this.f37833a));
                this.d.setPathEffect(new CornerPathEffect(this.f37833a));
            }
        }
        Rect rect = this.f37843m;
        float f11 = this.f37841k;
        float f12 = this.f37840j;
        ArrayList arrayList = this.f37838g;
        if (rect == null && this.h > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            ((h80) arrayList.get(0)).computeBounds(rectF, false);
            this.f37843m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i7 = 1; i7 < this.h; i7++) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                ((h80) arrayList.get(i7)).computeBounds(rectF2, false);
                Rect rect2 = this.f37843m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f37843m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f37843m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f37843m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f10 = f12;
            this.f37844n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f37843m.top - f11, 2.0d) + Math.pow(this.f37843m.left - f12, 2.0d), Math.pow(this.f37843m.top - f11, 2.0d) + Math.pow(this.f37843m.right - f12, 2.0d)), Math.max(Math.pow(this.f37843m.bottom - f11, 2.0d) + Math.pow(this.f37843m.left - f12, 2.0d), Math.pow(this.f37843m.bottom - f11, 2.0d) + Math.pow(this.f37843m.right - f12, 2.0d))));
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
        if (this.f37845o < 0) {
            this.f37845o = elapsedRealtime;
        }
        float interpolation = nr.f37961f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f37845o)) / ((float) this.f37847q)));
        long j3 = this.f37846p;
        if (j3 < 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j3)) / 100.0f));
        }
        float f13 = 1.0f - min;
        this.f37835c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f37836e * 0.2f * f13));
        this.f37835c.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
        for (int i11 = z11; i11 < this.h; i11++) {
            ((h80) arrayList.get(i11)).a();
            canvas.drawPath((Path) arrayList.get(i11), this.f37835c);
        }
        this.d.setAlpha((int) (this.f37837f * 0.8f * f13));
        this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
        int i12 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
        if (i12 < 0) {
            float f14 = interpolation * this.f37844n;
            canvas.save();
            Path path = this.f37842l;
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
        if (i12 >= 0 && this.f37846p < 0) {
            return z11;
        }
        return z13;
    }

    public final h80 b() {
        h80 h80Var;
        ArrayList arrayList = f37832s;
        if (!arrayList.isEmpty()) {
            h80Var = (h80) arrayList.remove(0);
        } else {
            h80Var = new h80(0);
        }
        h80Var.f39316c = !this.f37848r;
        h80Var.reset();
        ArrayList arrayList2 = this.f37838g;
        arrayList2.add(h80Var);
        this.h = arrayList2.size();
        return h80Var;
    }

    public final void c() {
        ArrayList arrayList = this.f37838g;
        if (arrayList.isEmpty()) {
            return;
        }
        f37832s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i7) {
        this.f37834b = i7;
        Paint paint = this.f37835c;
        if (paint != null) {
            paint.setColor(i7);
            this.f37836e = Color.alpha(i7);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i7);
            this.f37837f = Color.alpha(i7);
        }
    }
}
