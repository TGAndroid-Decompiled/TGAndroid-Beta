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
public final class fa0 {
    public static final ArrayList f26414s = new ArrayList();
    public int f26415a;
    public int f26416b;
    public Paint f26417c;
    public Paint d;
    public int f26418e;
    public int f26419f;
    public final CharacterStyle f26421i;
    public final float f26422j;
    public final float f26423k;
    public Rect f26425m;
    public float f26426n;
    public final long f26429q;
    public final ArrayList f26420g = new ArrayList();
    public int h = 0;
    public final Path f26424l = new Path();
    public long f26427o = -1;
    public long f26428p = -1;
    public final boolean f26430r = !LiteMode.isEnabled(360928);

    public fa0(CharacterStyle characterStyle, org.telegram.ui.ActionBar.d6 d6Var, float f7, float f10, int i10) {
        this.f26421i = characterStyle;
        d(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ld, d6Var));
        this.f26422j = f7;
        this.f26423k = f10;
        this.f26429q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        float min;
        boolean z14 = this.f26430r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f26415a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f26417c == null) {
            Paint paint = new Paint(1);
            this.f26417c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f26417c.setColor(this.f26416b);
            this.f26418e = Color.alpha(this.f26416b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f26416b);
            this.f26419f = Color.alpha(this.f26416b);
        }
        if (z10) {
            this.f26415a = dp;
            if (dp <= 0) {
                this.f26417c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f26417c.setPathEffect(new CornerPathEffect(this.f26415a));
                this.d.setPathEffect(new CornerPathEffect(this.f26415a));
            }
        }
        Rect rect = this.f26425m;
        float f10 = this.f26423k;
        float f11 = this.f26422j;
        ArrayList arrayList = this.f26420g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((y90) arrayList.get(0)).computeBounds(rectF, false);
            this.f26425m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((y90) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f26425m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f26425m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f26425m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f26425m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f7 = f11;
            this.f26426n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f26425m.top - f10, 2.0d) + Math.pow(this.f26425m.left - f11, 2.0d), Math.pow(this.f26425m.top - f10, 2.0d) + Math.pow(this.f26425m.right - f11, 2.0d)), Math.max(Math.pow(this.f26425m.bottom - f10, 2.0d) + Math.pow(this.f26425m.left - f11, 2.0d), Math.pow(this.f26425m.bottom - f10, 2.0d) + Math.pow(this.f26425m.right - f11, 2.0d))));
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
            if (this.f26427o < 0) {
                this.f26427o = elapsedRealtime;
            }
            float interpolation = is.f27500f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f26427o)) / ((float) this.f26429q)));
            long j3 = this.f26428p;
            if (j3 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j3)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f26417c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f26418e * 0.2f * f12));
            this.f26417c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = z11; i12 < this.h; i12++) {
                ((y90) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f26417c);
            }
            this.d.setAlpha((int) (this.f26419f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f26426n;
                canvas.save();
                Path path = this.f26424l;
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
            if (i13 < 0 || this.f26428p >= 0) {
                return z13;
            }
        }
        return z11;
    }

    public final y90 b() {
        y90 y90Var;
        ArrayList arrayList = f26414s;
        if (!arrayList.isEmpty()) {
            y90Var = (y90) arrayList.remove(0);
        } else {
            y90Var = new y90(0);
        }
        y90Var.f28123c = !this.f26430r;
        y90Var.reset();
        ArrayList arrayList2 = this.f26420g;
        arrayList2.add(y90Var);
        this.h = arrayList2.size();
        return y90Var;
    }

    public final void c() {
        ArrayList arrayList = this.f26420g;
        if (arrayList.isEmpty()) {
            return;
        }
        f26414s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f26416b = i10;
        Paint paint = this.f26417c;
        if (paint != null) {
            paint.setColor(i10);
            this.f26418e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f26419f = Color.alpha(i10);
        }
    }
}
