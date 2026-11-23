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
    public static final ArrayList f37831s = new ArrayList();
    public int f37832a;
    public int f37833b;
    public Paint f37834c;
    public Paint d;
    public int f37835e;
    public int f37836f;
    public final CharacterStyle f37838i;
    public final float f37839j;
    public final float f37840k;
    public Rect f37842m;
    public float f37843n;
    public final long f37846q;
    public final ArrayList f37837g = new ArrayList();
    public int h = 0;
    public final Path f37841l = new Path();
    public long f37844o = -1;
    public long f37845p = -1;
    public final boolean f37847r = !org.telegram.messenger.qc.e(360928);

    public n80(CharacterStyle characterStyle, org.telegram.ui.ActionBar.h6 h6Var, float f10, float f11, int i7) {
        this.f37838i = characterStyle;
        d(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ce, h6Var));
        this.f37839j = f10;
        this.f37840k = f11;
        this.f37846q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int L;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f10;
        float min;
        boolean z14 = this.f37847r;
        if (z14) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(4.0f);
        }
        if (this.f37832a != L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f37834c == null) {
            Paint paint = new Paint(1);
            this.f37834c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f37834c.setColor(this.f37833b);
            this.f37835e = Color.alpha(this.f37833b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f37833b);
            this.f37836f = Color.alpha(this.f37833b);
        }
        if (z10) {
            this.f37832a = L;
            if (L <= 0) {
                this.f37834c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f37834c.setPathEffect(new CornerPathEffect(this.f37832a));
                this.d.setPathEffect(new CornerPathEffect(this.f37832a));
            }
        }
        Rect rect = this.f37842m;
        float f11 = this.f37840k;
        float f12 = this.f37839j;
        ArrayList arrayList = this.f37837g;
        if (rect == null && this.h > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            ((h80) arrayList.get(0)).computeBounds(rectF, false);
            this.f37842m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i7 = 1; i7 < this.h; i7++) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                ((h80) arrayList.get(i7)).computeBounds(rectF2, false);
                Rect rect2 = this.f37842m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f37842m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f37842m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f37842m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f10 = f12;
            this.f37843n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f37842m.top - f11, 2.0d) + Math.pow(this.f37842m.left - f12, 2.0d), Math.pow(this.f37842m.top - f11, 2.0d) + Math.pow(this.f37842m.right - f12, 2.0d)), Math.max(Math.pow(this.f37842m.bottom - f11, 2.0d) + Math.pow(this.f37842m.left - f12, 2.0d), Math.pow(this.f37842m.bottom - f11, 2.0d) + Math.pow(this.f37842m.right - f12, 2.0d))));
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
        if (this.f37844o < 0) {
            this.f37844o = elapsedRealtime;
        }
        float interpolation = nr.f37960f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f37844o)) / ((float) this.f37846q)));
        long j3 = this.f37845p;
        if (j3 < 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j3)) / 100.0f));
        }
        float f13 = 1.0f - min;
        this.f37834c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f37835e * 0.2f * f13));
        this.f37834c.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
        for (int i11 = z11; i11 < this.h; i11++) {
            ((h80) arrayList.get(i11)).a();
            canvas.drawPath((Path) arrayList.get(i11), this.f37834c);
        }
        this.d.setAlpha((int) (this.f37836f * 0.8f * f13));
        this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
        int i12 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
        if (i12 < 0) {
            float f14 = interpolation * this.f37843n;
            canvas.save();
            Path path = this.f37841l;
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
        if (i12 >= 0 && this.f37845p < 0) {
            return z11;
        }
        return z13;
    }

    public final h80 b() {
        h80 h80Var;
        ArrayList arrayList = f37831s;
        if (!arrayList.isEmpty()) {
            h80Var = (h80) arrayList.remove(0);
        } else {
            h80Var = new h80(0);
        }
        h80Var.f39315c = !this.f37847r;
        h80Var.reset();
        ArrayList arrayList2 = this.f37837g;
        arrayList2.add(h80Var);
        this.h = arrayList2.size();
        return h80Var;
    }

    public final void c() {
        ArrayList arrayList = this.f37837g;
        if (arrayList.isEmpty()) {
            return;
        }
        f37831s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i7) {
        this.f37833b = i7;
        Paint paint = this.f37834c;
        if (paint != null) {
            paint.setColor(i7);
            this.f37835e = Color.alpha(i7);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i7);
            this.f37836f = Color.alpha(i7);
        }
    }
}
