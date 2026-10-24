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
public final class x90 {
    public static final ArrayList f32538s = new ArrayList();
    public int f32539a;
    public int f32540b;
    public Paint f32541c;
    public Paint d;
    public int e;
    public int f32542f;
    public final CharacterStyle f32544i;
    public final float f32545j;
    public final float f32546k;
    public Rect f32548m;
    public float f32549n;
    public final long f32552q;
    public final ArrayList f32543g = new ArrayList();
    public int h = 0;
    public final Path f32547l = new Path();
    public long f32550o = -1;
    public long f32551p = -1;
    public final boolean f32553r = !LiteMode.isEnabled(360928);

    public x90(CharacterStyle characterStyle, org.telegram.ui.ActionBar.g6 g6Var, float f7, float f10, int i10) {
        this.f32544i = characterStyle;
        d(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ld, g6Var));
        this.f32545j = f7;
        this.f32546k = f10;
        this.f32552q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        float min;
        boolean z14 = this.f32553r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f32539a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f32541c == null) {
            Paint paint = new Paint(1);
            this.f32541c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f32541c.setColor(this.f32540b);
            this.e = Color.alpha(this.f32540b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f32540b);
            this.f32542f = Color.alpha(this.f32540b);
        }
        if (z10) {
            this.f32539a = dp;
            if (dp <= 0) {
                this.f32541c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f32541c.setPathEffect(new CornerPathEffect(this.f32539a));
                this.d.setPathEffect(new CornerPathEffect(this.f32539a));
            }
        }
        Rect rect = this.f32548m;
        float f10 = this.f32546k;
        float f11 = this.f32545j;
        ArrayList arrayList = this.f32543g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((q90) arrayList.get(0)).computeBounds(rectF, false);
            this.f32548m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((q90) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f32548m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f32548m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f32548m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f32548m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f7 = f11;
            this.f32549n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f32548m.top - f10, 2.0d) + Math.pow(this.f32548m.left - f11, 2.0d), Math.pow(this.f32548m.top - f10, 2.0d) + Math.pow(this.f32548m.right - f11, 2.0d)), Math.max(Math.pow(this.f32548m.bottom - f10, 2.0d) + Math.pow(this.f32548m.left - f11, 2.0d), Math.pow(this.f32548m.bottom - f10, 2.0d) + Math.pow(this.f32548m.right - f11, 2.0d))));
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
            if (this.f32550o < 0) {
                this.f32550o = elapsedRealtime;
            }
            float interpolation = zr.f33337f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f32550o)) / ((float) this.f32552q)));
            long j10 = this.f32551p;
            if (j10 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j10)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f32541c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * f12));
            this.f32541c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = z11; i12 < this.h; i12++) {
                ((q90) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f32541c);
            }
            this.d.setAlpha((int) (this.f32542f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f32549n;
                canvas.save();
                Path path = this.f32547l;
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
            if (i13 < 0 || this.f32551p >= 0) {
                return z13;
            }
        }
        return z11;
    }

    public final q90 b() {
        q90 q90Var;
        ArrayList arrayList = f32538s;
        if (!arrayList.isEmpty()) {
            q90Var = (q90) arrayList.remove(0);
        } else {
            q90Var = new q90(0);
        }
        q90Var.f25079c = !this.f32553r;
        q90Var.reset();
        ArrayList arrayList2 = this.f32543g;
        arrayList2.add(q90Var);
        this.h = arrayList2.size();
        return q90Var;
    }

    public final void c() {
        ArrayList arrayList = this.f32543g;
        if (arrayList.isEmpty()) {
            return;
        }
        f32538s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f32540b = i10;
        Paint paint = this.f32541c;
        if (paint != null) {
            paint.setColor(i10);
            this.e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f32542f = Color.alpha(i10);
        }
    }
}
