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
    public static final ArrayList f40214s = new ArrayList();
    public int f40215a;
    public int f40216b;
    public Paint f40217c;
    public Paint d;
    public int f40218e;
    public int f40219f;
    public final CharacterStyle f40221i;
    public final float f40222j;
    public final float f40223k;
    public Rect f40225m;
    public float f40226n;
    public final long f40229q;
    public final ArrayList f40220g = new ArrayList();
    public int h = 0;
    public final Path f40224l = new Path();
    public long f40227o = -1;
    public long f40228p = -1;
    public final boolean f40230r = !org.telegram.messenger.sc.e(360928);

    public x70(CharacterStyle characterStyle, org.telegram.ui.ActionBar.h6 h6Var, float f10, float f11, int i7) {
        this.f40221i = characterStyle;
        d(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28307ze, h6Var));
        this.f40222j = f10;
        this.f40223k = f11;
        this.f40229q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int L;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        float min;
        boolean z13 = this.f40230r;
        if (z13) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(4.0f);
        }
        if (this.f40215a != L) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f40217c == null) {
            Paint paint = new Paint(1);
            this.f40217c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f40217c.setColor(this.f40216b);
            this.f40218e = Color.alpha(this.f40216b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f40216b);
            this.f40219f = Color.alpha(this.f40216b);
        }
        if (z9) {
            this.f40215a = L;
            if (L <= 0) {
                this.f40217c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f40217c.setPathEffect(new CornerPathEffect(this.f40215a));
                this.d.setPathEffect(new CornerPathEffect(this.f40215a));
            }
        }
        Rect rect = this.f40225m;
        float f11 = this.f40223k;
        float f12 = this.f40222j;
        ArrayList arrayList = this.f40220g;
        if (rect == null && this.h > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            ((r70) arrayList.get(0)).computeBounds(rectF, false);
            this.f40225m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i7 = 1; i7 < this.h; i7++) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                ((r70) arrayList.get(i7)).computeBounds(rectF2, false);
                Rect rect2 = this.f40225m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f40225m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f40225m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f40225m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z10 = 0;
            z11 = z13;
            z12 = true;
            f10 = f12;
            this.f40226n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f40225m.top - f11, 2.0d) + Math.pow(this.f40225m.left - f12, 2.0d), Math.pow(this.f40225m.top - f11, 2.0d) + Math.pow(this.f40225m.right - f12, 2.0d)), Math.max(Math.pow(this.f40225m.bottom - f11, 2.0d) + Math.pow(this.f40225m.left - f12, 2.0d), Math.pow(this.f40225m.bottom - f11, 2.0d) + Math.pow(this.f40225m.right - f12, 2.0d))));
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
            return z10;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f40227o < 0) {
            this.f40227o = elapsedRealtime;
        }
        float interpolation = wq.f40046f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f40227o)) / ((float) this.f40229q)));
        long j3 = this.f40228p;
        if (j3 < 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j3)) / 100.0f));
        }
        float f13 = 1.0f - min;
        this.f40217c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f40218e * 0.2f * f13));
        this.f40217c.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
        for (int i11 = z10; i11 < this.h; i11++) {
            ((r70) arrayList.get(i11)).a();
            canvas.drawPath((Path) arrayList.get(i11), this.f40217c);
        }
        this.d.setAlpha((int) (this.f40219f * 0.8f * f13));
        this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
        int i12 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
        if (i12 < 0) {
            float f14 = interpolation * this.f40226n;
            canvas.save();
            Path path = this.f40224l;
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
        if (i12 >= 0 && this.f40228p < 0) {
            return z10;
        }
        return z12;
    }

    public final r70 b() {
        r70 r70Var;
        ArrayList arrayList = f40214s;
        if (!arrayList.isEmpty()) {
            r70Var = (r70) arrayList.remove(0);
        } else {
            r70Var = new r70(0);
        }
        r70Var.f31965c = !this.f40230r;
        r70Var.reset();
        ArrayList arrayList2 = this.f40220g;
        arrayList2.add(r70Var);
        this.h = arrayList2.size();
        return r70Var;
    }

    public final void c() {
        ArrayList arrayList = this.f40220g;
        if (arrayList.isEmpty()) {
            return;
        }
        f40214s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i7) {
        this.f40216b = i7;
        Paint paint = this.f40217c;
        if (paint != null) {
            paint.setColor(i7);
            this.f40218e = Color.alpha(i7);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i7);
            this.f40219f = Color.alpha(i7);
        }
    }
}
