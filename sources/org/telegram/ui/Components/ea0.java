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
    public static final ArrayList f24351s = new ArrayList();
    public int f24352a;
    public int f24353b;
    public Paint f24354c;
    public Paint d;
    public int e;
    public int f24355f;
    public final CharacterStyle f24357i;
    public final float f24358j;
    public final float f24359k;
    public Rect f24361m;
    public float f24362n;
    public final long f24365q;
    public final ArrayList f24356g = new ArrayList();
    public int h = 0;
    public final Path f24360l = new Path();
    public long f24363o = -1;
    public long f24364p = -1;
    public final boolean f24366r = !LiteMode.isEnabled(360928);

    public ea0(CharacterStyle characterStyle, org.telegram.ui.ActionBar.c6 c6Var, float f7, float f10, int i10) {
        this.f24357i = characterStyle;
        d(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ld, c6Var));
        this.f24358j = f7;
        this.f24359k = f10;
        this.f24365q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        float min;
        boolean z14 = this.f24366r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f24352a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f24354c == null) {
            Paint paint = new Paint(1);
            this.f24354c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f24354c.setColor(this.f24353b);
            this.e = Color.alpha(this.f24353b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f24353b);
            this.f24355f = Color.alpha(this.f24353b);
        }
        if (z10) {
            this.f24352a = dp;
            if (dp <= 0) {
                this.f24354c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f24354c.setPathEffect(new CornerPathEffect(this.f24352a));
                this.d.setPathEffect(new CornerPathEffect(this.f24352a));
            }
        }
        Rect rect = this.f24361m;
        float f10 = this.f24359k;
        float f11 = this.f24358j;
        ArrayList arrayList = this.f24356g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((x90) arrayList.get(0)).computeBounds(rectF, false);
            this.f24361m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((x90) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f24361m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f24361m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f24361m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f24361m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f7 = f11;
            this.f24362n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f24361m.top - f10, 2.0d) + Math.pow(this.f24361m.left - f11, 2.0d), Math.pow(this.f24361m.top - f10, 2.0d) + Math.pow(this.f24361m.right - f11, 2.0d)), Math.max(Math.pow(this.f24361m.bottom - f10, 2.0d) + Math.pow(this.f24361m.left - f11, 2.0d), Math.pow(this.f24361m.bottom - f10, 2.0d) + Math.pow(this.f24361m.right - f11, 2.0d))));
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
            if (this.f24363o < 0) {
                this.f24363o = elapsedRealtime;
            }
            float interpolation = es.f24465f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f24363o)) / ((float) this.f24365q)));
            long j10 = this.f24364p;
            if (j10 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j10)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f24354c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * f12));
            this.f24354c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = z11; i12 < this.h; i12++) {
                ((x90) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f24354c);
            }
            this.d.setAlpha((int) (this.f24355f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f24362n;
                canvas.save();
                Path path = this.f24360l;
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
            if (i13 < 0 || this.f24364p >= 0) {
                return z13;
            }
        }
        return z11;
    }

    public final x90 b() {
        x90 x90Var;
        ArrayList arrayList = f24351s;
        if (!arrayList.isEmpty()) {
            x90Var = (x90) arrayList.remove(0);
        } else {
            x90Var = new x90(0);
        }
        x90Var.f25385c = !this.f24366r;
        x90Var.reset();
        ArrayList arrayList2 = this.f24356g;
        arrayList2.add(x90Var);
        this.h = arrayList2.size();
        return x90Var;
    }

    public final void c() {
        ArrayList arrayList = this.f24356g;
        if (arrayList.isEmpty()) {
            return;
        }
        f24351s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f24353b = i10;
        Paint paint = this.f24354c;
        if (paint != null) {
            paint.setColor(i10);
            this.e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f24355f = Color.alpha(i10);
        }
    }
}
