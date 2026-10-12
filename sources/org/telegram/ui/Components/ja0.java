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
public final class ja0 {
    public static final ArrayList f27428s = new ArrayList();
    public int f27429a;
    public int f27430b;
    public Paint f27431c;
    public Paint d;
    public int f27432e;
    public int f27433f;
    public final CharacterStyle f27435i;
    public final float f27436j;
    public final float f27437k;
    public Rect f27439m;
    public float f27440n;
    public final long f27443q;
    public final ArrayList f27434g = new ArrayList();
    public int h = 0;
    public final Path f27438l = new Path();
    public long f27441o = -1;
    public long f27442p = -1;
    public final boolean f27444r = !LiteMode.isEnabled(360928);

    public ja0(CharacterStyle characterStyle, org.telegram.ui.ActionBar.c6 c6Var, float f7, float f10, int i10) {
        this.f27435i = characterStyle;
        d(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ld, c6Var));
        this.f27436j = f7;
        this.f27437k = f10;
        this.f27443q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        float min;
        boolean z14 = this.f27444r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f27429a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f27431c == null) {
            Paint paint = new Paint(1);
            this.f27431c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f27431c.setColor(this.f27430b);
            this.f27432e = Color.alpha(this.f27430b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f27430b);
            this.f27433f = Color.alpha(this.f27430b);
        }
        if (z10) {
            this.f27429a = dp;
            if (dp <= 0) {
                this.f27431c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f27431c.setPathEffect(new CornerPathEffect(this.f27429a));
                this.d.setPathEffect(new CornerPathEffect(this.f27429a));
            }
        }
        Rect rect = this.f27439m;
        float f10 = this.f27437k;
        float f11 = this.f27436j;
        ArrayList arrayList = this.f27434g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((ca0) arrayList.get(0)).computeBounds(rectF, false);
            this.f27439m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((ca0) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f27439m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f27439m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f27439m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f27439m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f7 = f11;
            this.f27440n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f27439m.top - f10, 2.0d) + Math.pow(this.f27439m.left - f11, 2.0d), Math.pow(this.f27439m.top - f10, 2.0d) + Math.pow(this.f27439m.right - f11, 2.0d)), Math.max(Math.pow(this.f27439m.bottom - f10, 2.0d) + Math.pow(this.f27439m.left - f11, 2.0d), Math.pow(this.f27439m.bottom - f10, 2.0d) + Math.pow(this.f27439m.right - f11, 2.0d))));
        } else {
            z11 = 0;
            z12 = z14;
            z13 = true;
            f7 = f11;
        }
        if (z12) {
            for (int i11 = z11; i11 < this.h; i11++) {
                canvas.drawPath((Path) arrayList.get(i11), this.d);
            }
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f27441o < 0) {
                this.f27441o = elapsedRealtime;
            }
            float interpolation = js.f27627f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f27441o)) / ((float) this.f27443q)));
            long j3 = this.f27442p;
            if (j3 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j3)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f27431c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f27432e * 0.2f * f12));
            this.f27431c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = z11; i12 < this.h; i12++) {
                ((ca0) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f27431c);
            }
            this.d.setAlpha((int) (this.f27433f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f27440n;
                canvas.save();
                Path path = this.f27438l;
                path.reset();
                path.addCircle(f7, f10, f13, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i14 = z11; i14 < this.h; i14++) {
                    canvas.drawPath((Path) arrayList.get(i14), this.d);
                }
                canvas.restore();
            } else {
                for (int i15 = z11; i15 < this.h; i15++) {
                    canvas.drawPath((Path) arrayList.get(i15), this.d);
                }
            }
            if (i13 < 0 || this.f27442p >= 0) {
                return z13;
            }
        }
        return z11;
    }

    public final ca0 b() {
        ca0 ca0Var;
        ArrayList arrayList = f27428s;
        if (!arrayList.isEmpty()) {
            ca0Var = (ca0) arrayList.remove(0);
        } else {
            ca0Var = new ca0(0);
        }
        ca0Var.f28647c = !this.f27444r;
        ca0Var.reset();
        ArrayList arrayList2 = this.f27434g;
        arrayList2.add(ca0Var);
        this.h = arrayList2.size();
        return ca0Var;
    }

    public final void c() {
        ArrayList arrayList = this.f27434g;
        if (arrayList.isEmpty()) {
            return;
        }
        f27428s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f27430b = i10;
        Paint paint = this.f27431c;
        if (paint != null) {
            paint.setColor(i10);
            this.f27432e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f27433f = Color.alpha(i10);
        }
    }
}
