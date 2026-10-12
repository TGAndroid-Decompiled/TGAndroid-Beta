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
public final class ea0 {
    public static final ArrayList f24652s = new ArrayList();
    public int f24653a;
    public int f24654b;
    public Paint f24655c;
    public Paint d;
    public int e;
    public int f24656f;
    public final CharacterStyle f24658i;
    public final float f24659j;
    public final float f24660k;
    public Rect f24662m;
    public float f24663n;
    public final long f24666q;
    public final ArrayList f24657g = new ArrayList();
    public int h = 0;
    public final Path f24661l = new Path();
    public long f24664o = -1;
    public long f24665p = -1;
    public final boolean f24667r = !LiteMode.isEnabled(360928);

    public ea0(CharacterStyle characterStyle, org.telegram.ui.ActionBar.c6 c6Var, float f7, float f10, int i10) {
        this.f24658i = characterStyle;
        d(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ld, c6Var));
        this.f24659j = f7;
        this.f24660k = f10;
        this.f24666q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        float min;
        boolean z14 = this.f24667r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f24653a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f24655c == null) {
            Paint paint = new Paint(1);
            this.f24655c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f24655c.setColor(this.f24654b);
            this.e = Color.alpha(this.f24654b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f24654b);
            this.f24656f = Color.alpha(this.f24654b);
        }
        if (z10) {
            this.f24653a = dp;
            if (dp <= 0) {
                this.f24655c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f24655c.setPathEffect(new CornerPathEffect(this.f24653a));
                this.d.setPathEffect(new CornerPathEffect(this.f24653a));
            }
        }
        Rect rect = this.f24662m;
        float f10 = this.f24660k;
        float f11 = this.f24659j;
        ArrayList arrayList = this.f24657g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((x90) arrayList.get(0)).computeBounds(rectF, false);
            this.f24662m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((x90) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f24662m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f24662m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f24662m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f24662m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f7 = f11;
            this.f24663n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f24662m.top - f10, 2.0d) + Math.pow(this.f24662m.left - f11, 2.0d), Math.pow(this.f24662m.top - f10, 2.0d) + Math.pow(this.f24662m.right - f11, 2.0d)), Math.max(Math.pow(this.f24662m.bottom - f10, 2.0d) + Math.pow(this.f24662m.left - f11, 2.0d), Math.pow(this.f24662m.bottom - f10, 2.0d) + Math.pow(this.f24662m.right - f11, 2.0d))));
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
            if (this.f24664o < 0) {
                this.f24664o = elapsedRealtime;
            }
            float interpolation = es.f24771f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f24664o)) / ((float) this.f24666q)));
            long j10 = this.f24665p;
            if (j10 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j10)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f24655c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * f12));
            this.f24655c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = z11; i12 < this.h; i12++) {
                ((x90) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f24655c);
            }
            this.d.setAlpha((int) (this.f24656f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f24663n;
                canvas.save();
                Path path = this.f24661l;
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
            if (i13 < 0 || this.f24665p >= 0) {
                return z13;
            }
        }
        return z11;
    }

    public final x90 b() {
        x90 x90Var;
        ArrayList arrayList = f24652s;
        if (!arrayList.isEmpty()) {
            x90Var = (x90) arrayList.remove(0);
        } else {
            x90Var = new x90(0);
        }
        x90Var.f25734c = !this.f24667r;
        x90Var.reset();
        ArrayList arrayList2 = this.f24657g;
        arrayList2.add(x90Var);
        this.h = arrayList2.size();
        return x90Var;
    }

    public final void c() {
        ArrayList arrayList = this.f24657g;
        if (arrayList.isEmpty()) {
            return;
        }
        f24652s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f24654b = i10;
        Paint paint = this.f24655c;
        if (paint != null) {
            paint.setColor(i10);
            this.e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f24656f = Color.alpha(i10);
        }
    }
}
