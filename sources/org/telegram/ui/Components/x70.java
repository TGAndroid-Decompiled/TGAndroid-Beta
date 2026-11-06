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
    public static final ArrayList f40218s = new ArrayList();
    public int f40219a;
    public int f40220b;
    public Paint f40221c;
    public Paint d;
    public int f40222e;
    public int f40223f;
    public final CharacterStyle f40225i;
    public final float f40226j;
    public final float f40227k;
    public Rect f40229m;
    public float f40230n;
    public final long f40233q;
    public final ArrayList f40224g = new ArrayList();
    public int h = 0;
    public final Path f40228l = new Path();
    public long f40231o = -1;
    public long f40232p = -1;
    public final boolean f40234r = !org.telegram.messenger.rc.e(360928);

    public x70(CharacterStyle characterStyle, org.telegram.ui.ActionBar.f6 f6Var, float f10, float f11, int i7) {
        this.f40225i = characterStyle;
        d(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28266ze, f6Var));
        this.f40226j = f10;
        this.f40227k = f11;
        this.f40233q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int L;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        float min;
        boolean z13 = this.f40234r;
        if (z13) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(4.0f);
        }
        if (this.f40219a != L) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f40221c == null) {
            Paint paint = new Paint(1);
            this.f40221c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f40221c.setColor(this.f40220b);
            this.f40222e = Color.alpha(this.f40220b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f40220b);
            this.f40223f = Color.alpha(this.f40220b);
        }
        if (z9) {
            this.f40219a = L;
            if (L <= 0) {
                this.f40221c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f40221c.setPathEffect(new CornerPathEffect(this.f40219a));
                this.d.setPathEffect(new CornerPathEffect(this.f40219a));
            }
        }
        Rect rect = this.f40229m;
        float f11 = this.f40227k;
        float f12 = this.f40226j;
        ArrayList arrayList = this.f40224g;
        if (rect == null && this.h > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            ((r70) arrayList.get(0)).computeBounds(rectF, false);
            this.f40229m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i7 = 1; i7 < this.h; i7++) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                ((r70) arrayList.get(i7)).computeBounds(rectF2, false);
                Rect rect2 = this.f40229m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f40229m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f40229m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f40229m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z10 = 0;
            z11 = z13;
            z12 = true;
            f10 = f12;
            this.f40230n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f40229m.top - f11, 2.0d) + Math.pow(this.f40229m.left - f12, 2.0d), Math.pow(this.f40229m.top - f11, 2.0d) + Math.pow(this.f40229m.right - f12, 2.0d)), Math.max(Math.pow(this.f40229m.bottom - f11, 2.0d) + Math.pow(this.f40229m.left - f12, 2.0d), Math.pow(this.f40229m.bottom - f11, 2.0d) + Math.pow(this.f40229m.right - f12, 2.0d))));
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
            if (this.f40231o < 0) {
                this.f40231o = elapsedRealtime;
            }
            float interpolation = xq.f40345f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f40231o)) / ((float) this.f40233q)));
            long j3 = this.f40232p;
            if (j3 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j3)) / 100.0f));
            }
            float f13 = 1.0f - min;
            this.f40221c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f40222e * 0.2f * f13));
            this.f40221c.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
            for (int i11 = z10; i11 < this.h; i11++) {
                ((r70) arrayList.get(i11)).a();
                canvas.drawPath((Path) arrayList.get(i11), this.f40221c);
            }
            this.d.setAlpha((int) (this.f40223f * 0.8f * f13));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
            int i12 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i12 < 0) {
                float f14 = interpolation * this.f40230n;
                canvas.save();
                Path path = this.f40228l;
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
            if (i12 < 0 || this.f40232p >= 0) {
                return z12;
            }
        }
        return z10;
    }

    public final r70 b() {
        r70 r70Var;
        ArrayList arrayList = f40218s;
        if (!arrayList.isEmpty()) {
            r70Var = (r70) arrayList.remove(0);
        } else {
            r70Var = new r70(0);
        }
        r70Var.f31881c = !this.f40234r;
        r70Var.reset();
        ArrayList arrayList2 = this.f40224g;
        arrayList2.add(r70Var);
        this.h = arrayList2.size();
        return r70Var;
    }

    public final void c() {
        ArrayList arrayList = this.f40224g;
        if (arrayList.isEmpty()) {
            return;
        }
        f40218s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i7) {
        this.f40220b = i7;
        Paint paint = this.f40221c;
        if (paint != null) {
            paint.setColor(i7);
            this.f40222e = Color.alpha(i7);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i7);
            this.f40223f = Color.alpha(i7);
        }
    }
}
