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
public final class z80 {
    public static final ArrayList f35278s = new ArrayList();
    public int f35279a;
    public int f35280b;
    public Paint f35281c;
    public Paint d;
    public int f35282e;
    public int f35283f;
    public final CharacterStyle f35285i;
    public final float f35286j;
    public final float f35287k;
    public Rect f35289m;
    public float f35290n;
    public final long f35293q;
    public final ArrayList f35284g = new ArrayList();
    public int h = 0;
    public final Path f35288l = new Path();
    public long f35291o = -1;
    public long f35292p = -1;
    public final boolean f35294r = !LiteMode.isEnabled(360928);

    public z80(CharacterStyle characterStyle, org.telegram.ui.ActionBar.c6 c6Var, float f9, float f10, int i10) {
        this.f35285i = characterStyle;
        d(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ld, c6Var));
        this.f35286j = f9;
        this.f35287k = f10;
        this.f35293q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        float f9;
        boolean z12;
        boolean z13;
        float min;
        boolean z14 = this.f35294r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f35279a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f35281c == null) {
            Paint paint = new Paint(1);
            this.f35281c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f35281c.setColor(this.f35280b);
            this.f35282e = Color.alpha(this.f35280b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f35280b);
            this.f35283f = Color.alpha(this.f35280b);
        }
        if (z10) {
            this.f35279a = dp;
            if (dp <= 0) {
                this.f35281c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f35281c.setPathEffect(new CornerPathEffect(this.f35279a));
                this.d.setPathEffect(new CornerPathEffect(this.f35279a));
            }
        }
        Rect rect = this.f35289m;
        float f10 = this.f35287k;
        float f11 = this.f35286j;
        ArrayList arrayList = this.f35284g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((s80) arrayList.get(0)).computeBounds(rectF, false);
            this.f35289m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((s80) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f35289m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f35289m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f35289m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f35289m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = z14;
            z12 = false;
            f9 = f11;
            z13 = true;
            this.f35290n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f35289m.top - f10, 2.0d) + Math.pow(this.f35289m.left - f11, 2.0d), Math.pow(this.f35289m.top - f10, 2.0d) + Math.pow(this.f35289m.right - f11, 2.0d)), Math.max(Math.pow(this.f35289m.bottom - f10, 2.0d) + Math.pow(this.f35289m.left - f11, 2.0d), Math.pow(this.f35289m.bottom - f10, 2.0d) + Math.pow(this.f35289m.right - f11, 2.0d))));
        } else {
            z11 = z14;
            f9 = f11;
            z12 = false;
            z13 = true;
        }
        if (z11) {
            for (int i11 = 0; i11 < this.h; i11++) {
                canvas.drawPath((Path) arrayList.get(i11), this.d);
            }
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f35291o < 0) {
                this.f35291o = elapsedRealtime;
            }
            float interpolation = jr.f29800f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f35291o)) / ((float) this.f35293q)));
            long j10 = this.f35292p;
            if (j10 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j10)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f35281c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f35282e * 0.2f * f12));
            this.f35281c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = 0; i12 < this.h; i12++) {
                ((s80) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f35281c);
            }
            this.d.setAlpha((int) (this.f35283f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f35290n;
                canvas.save();
                Path path = this.f35288l;
                path.reset();
                path.addCircle(f9, f10, f13, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i14 = 0; i14 < this.h; i14++) {
                    canvas.drawPath((Path) arrayList.get(i14), this.d);
                }
                canvas.restore();
            } else {
                for (int i15 = 0; i15 < this.h; i15++) {
                    canvas.drawPath((Path) arrayList.get(i15), this.d);
                }
            }
            if (i13 < 0 || this.f35292p >= 0) {
                return z13;
            }
        }
        return z12;
    }

    public final s80 b() {
        s80 s80Var;
        ArrayList arrayList = f35278s;
        if (!arrayList.isEmpty()) {
            s80Var = (s80) arrayList.remove(0);
        } else {
            s80Var = new s80(0);
        }
        s80Var.f31451c = !this.f35294r;
        s80Var.reset();
        ArrayList arrayList2 = this.f35284g;
        arrayList2.add(s80Var);
        this.h = arrayList2.size();
        return s80Var;
    }

    public final void c() {
        ArrayList arrayList = this.f35284g;
        if (arrayList.isEmpty()) {
            return;
        }
        f35278s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f35280b = i10;
        Paint paint = this.f35281c;
        if (paint != null) {
            paint.setColor(i10);
            this.f35282e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f35283f = Color.alpha(i10);
        }
    }
}
