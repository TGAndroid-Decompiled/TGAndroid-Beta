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
public final class k80 {
    public static final ArrayList f36675s = new ArrayList();
    public int f36676a;
    public int f36677b;
    public Paint f36678c;
    public Paint d;
    public int f36679e;
    public int f36680f;
    public final CharacterStyle f36682i;
    public final float f36683j;
    public final float f36684k;
    public Rect f36686m;
    public float f36687n;
    public final long f36690q;
    public final ArrayList f36681g = new ArrayList();
    public int h = 0;
    public final Path f36685l = new Path();
    public long f36688o = -1;
    public long f36689p = -1;
    public final boolean f36691r = !org.telegram.messenger.pc.e(360928);

    public k80(CharacterStyle characterStyle, org.telegram.ui.ActionBar.i6 i6Var, float f10, float f11, int i7) {
        this.f36682i = characterStyle;
        d(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ce, i6Var));
        this.f36683j = f10;
        this.f36684k = f11;
        this.f36690q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int L;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f10;
        float min;
        boolean z14 = this.f36691r;
        if (z14) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(4.0f);
        }
        if (this.f36676a != L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f36678c == null) {
            Paint paint = new Paint(1);
            this.f36678c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f36678c.setColor(this.f36677b);
            this.f36679e = Color.alpha(this.f36677b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f36677b);
            this.f36680f = Color.alpha(this.f36677b);
        }
        if (z10) {
            this.f36676a = L;
            if (L <= 0) {
                this.f36678c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f36678c.setPathEffect(new CornerPathEffect(this.f36676a));
                this.d.setPathEffect(new CornerPathEffect(this.f36676a));
            }
        }
        Rect rect = this.f36686m;
        float f11 = this.f36684k;
        float f12 = this.f36683j;
        ArrayList arrayList = this.f36681g;
        if (rect == null && this.h > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            ((e80) arrayList.get(0)).computeBounds(rectF, false);
            this.f36686m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i7 = 1; i7 < this.h; i7++) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                ((e80) arrayList.get(i7)).computeBounds(rectF2, false);
                Rect rect2 = this.f36686m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f36686m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f36686m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f36686m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f10 = f12;
            this.f36687n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f36686m.top - f11, 2.0d) + Math.pow(this.f36686m.left - f12, 2.0d), Math.pow(this.f36686m.top - f11, 2.0d) + Math.pow(this.f36686m.right - f12, 2.0d)), Math.max(Math.pow(this.f36686m.bottom - f11, 2.0d) + Math.pow(this.f36686m.left - f12, 2.0d), Math.pow(this.f36686m.bottom - f11, 2.0d) + Math.pow(this.f36686m.right - f12, 2.0d))));
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
        if (this.f36688o < 0) {
            this.f36688o = elapsedRealtime;
        }
        float interpolation = kr.f36858f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f36688o)) / ((float) this.f36690q)));
        long j3 = this.f36689p;
        if (j3 < 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j3)) / 100.0f));
        }
        float f13 = 1.0f - min;
        this.f36678c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f36679e * 0.2f * f13));
        this.f36678c.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
        for (int i11 = z11; i11 < this.h; i11++) {
            ((e80) arrayList.get(i11)).a();
            canvas.drawPath((Path) arrayList.get(i11), this.f36678c);
        }
        this.d.setAlpha((int) (this.f36680f * 0.8f * f13));
        this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
        int i12 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
        if (i12 < 0) {
            float f14 = interpolation * this.f36687n;
            canvas.save();
            Path path = this.f36685l;
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
        if (i12 >= 0 && this.f36689p < 0) {
            return z11;
        }
        return z13;
    }

    public final e80 b() {
        e80 e80Var;
        ArrayList arrayList = f36675s;
        if (!arrayList.isEmpty()) {
            e80Var = (e80) arrayList.remove(0);
        } else {
            e80Var = new e80(0);
        }
        e80Var.f38246c = !this.f36691r;
        e80Var.reset();
        ArrayList arrayList2 = this.f36681g;
        arrayList2.add(e80Var);
        this.h = arrayList2.size();
        return e80Var;
    }

    public final void c() {
        ArrayList arrayList = this.f36681g;
        if (arrayList.isEmpty()) {
            return;
        }
        f36675s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i7) {
        this.f36677b = i7;
        Paint paint = this.f36678c;
        if (paint != null) {
            paint.setColor(i7);
            this.f36679e = Color.alpha(i7);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i7);
            this.f36680f = Color.alpha(i7);
        }
    }
}
