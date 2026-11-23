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
    public static final ArrayList f37787s = new ArrayList();
    public int f37788a;
    public int f37789b;
    public Paint f37790c;
    public Paint d;
    public int f37791e;
    public int f37792f;
    public final CharacterStyle f37794i;
    public final float f37795j;
    public final float f37796k;
    public Rect f37798m;
    public float f37799n;
    public final long f37802q;
    public final ArrayList f37793g = new ArrayList();
    public int h = 0;
    public final Path f37797l = new Path();
    public long f37800o = -1;
    public long f37801p = -1;
    public final boolean f37803r = !org.telegram.messenger.qc.e(360928);

    public n80(CharacterStyle characterStyle, org.telegram.ui.ActionBar.h6 h6Var, float f10, float f11, int i7) {
        this.f37794i = characterStyle;
        d(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ce, h6Var));
        this.f37795j = f10;
        this.f37796k = f11;
        this.f37802q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int L;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f10;
        float min;
        boolean z14 = this.f37803r;
        if (z14) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(4.0f);
        }
        if (this.f37788a != L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f37790c == null) {
            Paint paint = new Paint(1);
            this.f37790c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f37790c.setColor(this.f37789b);
            this.f37791e = Color.alpha(this.f37789b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f37789b);
            this.f37792f = Color.alpha(this.f37789b);
        }
        if (z10) {
            this.f37788a = L;
            if (L <= 0) {
                this.f37790c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f37790c.setPathEffect(new CornerPathEffect(this.f37788a));
                this.d.setPathEffect(new CornerPathEffect(this.f37788a));
            }
        }
        Rect rect = this.f37798m;
        float f11 = this.f37796k;
        float f12 = this.f37795j;
        ArrayList arrayList = this.f37793g;
        if (rect == null && this.h > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            ((h80) arrayList.get(0)).computeBounds(rectF, false);
            this.f37798m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i7 = 1; i7 < this.h; i7++) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                ((h80) arrayList.get(i7)).computeBounds(rectF2, false);
                Rect rect2 = this.f37798m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f37798m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f37798m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f37798m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f10 = f12;
            this.f37799n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f37798m.top - f11, 2.0d) + Math.pow(this.f37798m.left - f12, 2.0d), Math.pow(this.f37798m.top - f11, 2.0d) + Math.pow(this.f37798m.right - f12, 2.0d)), Math.max(Math.pow(this.f37798m.bottom - f11, 2.0d) + Math.pow(this.f37798m.left - f12, 2.0d), Math.pow(this.f37798m.bottom - f11, 2.0d) + Math.pow(this.f37798m.right - f12, 2.0d))));
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
        if (this.f37800o < 0) {
            this.f37800o = elapsedRealtime;
        }
        float interpolation = nr.f37917f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f37800o)) / ((float) this.f37802q)));
        long j3 = this.f37801p;
        if (j3 < 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j3)) / 100.0f));
        }
        float f13 = 1.0f - min;
        this.f37790c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f37791e * 0.2f * f13));
        this.f37790c.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
        for (int i11 = z11; i11 < this.h; i11++) {
            ((h80) arrayList.get(i11)).a();
            canvas.drawPath((Path) arrayList.get(i11), this.f37790c);
        }
        this.d.setAlpha((int) (this.f37792f * 0.8f * f13));
        this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
        int i12 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
        if (i12 < 0) {
            float f14 = interpolation * this.f37799n;
            canvas.save();
            Path path = this.f37797l;
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
        if (i12 >= 0 && this.f37801p < 0) {
            return z11;
        }
        return z13;
    }

    public final h80 b() {
        h80 h80Var;
        ArrayList arrayList = f37787s;
        if (!arrayList.isEmpty()) {
            h80Var = (h80) arrayList.remove(0);
        } else {
            h80Var = new h80(0);
        }
        h80Var.f39271c = !this.f37803r;
        h80Var.reset();
        ArrayList arrayList2 = this.f37793g;
        arrayList2.add(h80Var);
        this.h = arrayList2.size();
        return h80Var;
    }

    public final void c() {
        ArrayList arrayList = this.f37793g;
        if (arrayList.isEmpty()) {
            return;
        }
        f37787s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i7) {
        this.f37789b = i7;
        Paint paint = this.f37790c;
        if (paint != null) {
            paint.setColor(i7);
            this.f37791e = Color.alpha(i7);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i7);
            this.f37792f = Color.alpha(i7);
        }
    }
}
