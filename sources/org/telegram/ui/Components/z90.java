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
public final class z90 {
    public static final ArrayList f33171s = new ArrayList();
    public int f33172a;
    public int f33173b;
    public Paint f33174c;
    public Paint d;
    public int e;
    public int f33175f;
    public final CharacterStyle f33177i;
    public final float f33178j;
    public final float f33179k;
    public Rect f33181m;
    public float f33182n;
    public final long f33185q;
    public final ArrayList f33176g = new ArrayList();
    public int h = 0;
    public final Path f33180l = new Path();
    public long f33183o = -1;
    public long f33184p = -1;
    public final boolean f33186r = !LiteMode.isEnabled(360928);

    public z90(CharacterStyle characterStyle, org.telegram.ui.ActionBar.g6 g6Var, float f7, float f10, int i10) {
        this.f33177i = characterStyle;
        d(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ld, g6Var));
        this.f33178j = f7;
        this.f33179k = f10;
        this.f33185q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        float min;
        boolean z14 = this.f33186r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f33172a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f33174c == null) {
            Paint paint = new Paint(1);
            this.f33174c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f33174c.setColor(this.f33173b);
            this.e = Color.alpha(this.f33173b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f33173b);
            this.f33175f = Color.alpha(this.f33173b);
        }
        if (z10) {
            this.f33172a = dp;
            if (dp <= 0) {
                this.f33174c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f33174c.setPathEffect(new CornerPathEffect(this.f33172a));
                this.d.setPathEffect(new CornerPathEffect(this.f33172a));
            }
        }
        Rect rect = this.f33181m;
        float f10 = this.f33179k;
        float f11 = this.f33178j;
        ArrayList arrayList = this.f33176g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((s90) arrayList.get(0)).computeBounds(rectF, false);
            this.f33181m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((s90) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f33181m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f33181m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f33181m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f33181m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f7 = f11;
            this.f33182n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f33181m.top - f10, 2.0d) + Math.pow(this.f33181m.left - f11, 2.0d), Math.pow(this.f33181m.top - f10, 2.0d) + Math.pow(this.f33181m.right - f11, 2.0d)), Math.max(Math.pow(this.f33181m.bottom - f10, 2.0d) + Math.pow(this.f33181m.left - f11, 2.0d), Math.pow(this.f33181m.bottom - f10, 2.0d) + Math.pow(this.f33181m.right - f11, 2.0d))));
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
            if (this.f33183o < 0) {
                this.f33183o = elapsedRealtime;
            }
            float interpolation = bs.f25133f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f33183o)) / ((float) this.f33185q)));
            long j10 = this.f33184p;
            if (j10 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j10)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f33174c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * f12));
            this.f33174c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = z11; i12 < this.h; i12++) {
                ((s90) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f33174c);
            }
            this.d.setAlpha((int) (this.f33175f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f33182n;
                canvas.save();
                Path path = this.f33180l;
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
            if (i13 < 0 || this.f33184p >= 0) {
                return z13;
            }
        }
        return z11;
    }

    public final s90 b() {
        s90 s90Var;
        ArrayList arrayList = f33171s;
        if (!arrayList.isEmpty()) {
            s90Var = (s90) arrayList.remove(0);
        } else {
            s90Var = new s90(0);
        }
        s90Var.f25718c = !this.f33186r;
        s90Var.reset();
        ArrayList arrayList2 = this.f33176g;
        arrayList2.add(s90Var);
        this.h = arrayList2.size();
        return s90Var;
    }

    public final void c() {
        ArrayList arrayList = this.f33176g;
        if (arrayList.isEmpty()) {
            return;
        }
        f33171s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f33173b = i10;
        Paint paint = this.f33174c;
        if (paint != null) {
            paint.setColor(i10);
            this.e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f33175f = Color.alpha(i10);
        }
    }
}
