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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;

public final class q80 {

    public static final ArrayList f31834s = new ArrayList();

    public int f31835a;

    public int f31836b;

    public Paint f31837c;
    public Paint d;

    public int f31838e;

    public int f31839f;

    public final CharacterStyle f31841i;

    public final float f31842j;

    public final float f31843k;

    public Rect f31845m;

    public float f31846n;

    public final long f31849q;

    public final ArrayList f31840g = new ArrayList();
    public int h = 0;

    public final Path f31844l = new Path();

    public long f31847o = -1;

    public long f31848p = -1;

    public final boolean f31850r = !LiteMode.isEnabled(360928);

    public q80(CharacterStyle characterStyle, org.telegram.ui.ActionBar.c6 c6Var, float f10, float f11, int i10) {
        this.f31841i = characterStyle;
        d(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ld, c6Var));
        this.f31842j = f10;
        this.f31843k = f11;
        this.f31849q = (long) Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        boolean z10;
        boolean z11;
        boolean z12 = this.f31850r;
        int iDp = z12 ? 0 : AndroidUtilities.dp(4.0f);
        boolean z13 = this.f31835a != iDp;
        if (this.f31837c == null) {
            Paint paint = new Paint(1);
            this.f31837c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f31837c.setColor(this.f31836b);
            this.f31838e = Color.alpha(this.f31836b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f31836b);
            this.f31839f = Color.alpha(this.f31836b);
        }
        if (z13) {
            this.f31835a = iDp;
            if (iDp <= 0) {
                this.f31837c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f31837c.setPathEffect(new CornerPathEffect(this.f31835a));
                this.d.setPathEffect(new CornerPathEffect(this.f31835a));
            }
        }
        Rect rect = this.f31845m;
        float f10 = this.f31843k;
        float f11 = this.f31842j;
        ArrayList arrayList = this.f31840g;
        if (rect != null || this.h <= 0) {
            z10 = false;
            z11 = true;
        } else {
            j80 j80Var = (j80) arrayList.get(0);
            RectF rectF = AndroidUtilities.rectTmp;
            j80Var.computeBounds(rectF, false);
            this.f31845m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                j80 j80Var2 = (j80) arrayList.get(i10);
                RectF rectF2 = AndroidUtilities.rectTmp;
                j80Var2.computeBounds(rectF2, false);
                Rect rect2 = this.f31845m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f31845m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f31845m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f31845m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z10 = false;
            z11 = true;
            this.f31846n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f31845m.top - f10, 2.0d) + Math.pow(this.f31845m.left - f11, 2.0d), Math.pow(this.f31845m.top - f10, 2.0d) + Math.pow(this.f31845m.right - f11, 2.0d)), Math.max(Math.pow(this.f31845m.bottom - f10, 2.0d) + Math.pow(this.f31845m.left - f11, 2.0d), Math.pow(this.f31845m.bottom - f10, 2.0d) + Math.pow(this.f31845m.right - f11, 2.0d))));
        }
        if (z12) {
            for (int i11 = 0; i11 < this.h; i11++) {
                canvas.drawPath((Path) arrayList.get(i11), this.d);
            }
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f31847o < 0) {
                this.f31847o = jElapsedRealtime;
            }
            float interpolation = er.f28122f.getInterpolation(Math.min(1.0f, (jElapsedRealtime - this.f31847o) / this.f31849q));
            long j10 = this.f31848p;
            float fMin = 1.0f - (j10 < 0 ? 0.0f : Math.min(1.0f, Math.max(0.0f, ((jElapsedRealtime - 75) - j10) / 100.0f)));
            this.f31837c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f31838e * 0.2f * fMin));
            this.f31837c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = 0; i12 < this.h; i12++) {
                ((j80) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f31837c);
            }
            this.d.setAlpha((int) (this.f31839f * 0.8f * fMin));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            if (interpolation < 1.0f) {
                float f12 = interpolation * this.f31846n;
                canvas.save();
                Path path = this.f31844l;
                path.reset();
                path.addCircle(f11, f10, f12, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i13 = 0; i13 < this.h; i13++) {
                    canvas.drawPath((Path) arrayList.get(i13), this.d);
                }
                canvas.restore();
            } else {
                for (int i14 = 0; i14 < this.h; i14++) {
                    canvas.drawPath((Path) arrayList.get(i14), this.d);
                }
            }
            if (interpolation < 1.0f || this.f31848p >= 0) {
                return z11;
            }
        }
        return z10;
    }

    public final j80 b() {
        ArrayList arrayList = f31834s;
        j80 j80Var = !arrayList.isEmpty() ? (j80) arrayList.remove(0) : new j80(0);
        j80Var.f29462c = !this.f31850r;
        j80Var.reset();
        ArrayList arrayList2 = this.f31840g;
        arrayList2.add(j80Var);
        this.h = arrayList2.size();
        return j80Var;
    }

    public final void c() {
        ArrayList arrayList = this.f31840g;
        if (arrayList.isEmpty()) {
            return;
        }
        f31834s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f31836b = i10;
        Paint paint = this.f31837c;
        if (paint != null) {
            paint.setColor(i10);
            this.f31838e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f31839f = Color.alpha(i10);
        }
    }
}
