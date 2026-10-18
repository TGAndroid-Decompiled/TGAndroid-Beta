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
public final class y90 {
    public static final ArrayList f32587s = new ArrayList();
    public int f32588a;
    public int f32589b;
    public Paint f32590c;
    public Paint d;
    public int e;
    public int f32591f;
    public final CharacterStyle f32593i;
    public final float f32594j;
    public final float f32595k;
    public Rect f32597m;
    public float f32598n;
    public final long f32601q;
    public final ArrayList f32592g = new ArrayList();
    public int h = 0;
    public final Path f32596l = new Path();
    public long f32599o = -1;
    public long f32600p = -1;
    public final boolean f32602r = !LiteMode.isEnabled(360928);

    public y90(CharacterStyle characterStyle, org.telegram.ui.ActionBar.d6 d6Var, float f7, float f10, int i10) {
        this.f32593i = characterStyle;
        d(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ld, d6Var));
        this.f32594j = f7;
        this.f32595k = f10;
        this.f32601q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        float min;
        boolean z14 = this.f32602r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f32588a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f32590c == null) {
            Paint paint = new Paint(1);
            this.f32590c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f32590c.setColor(this.f32589b);
            this.e = Color.alpha(this.f32589b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f32589b);
            this.f32591f = Color.alpha(this.f32589b);
        }
        if (z10) {
            this.f32588a = dp;
            if (dp <= 0) {
                this.f32590c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f32590c.setPathEffect(new CornerPathEffect(this.f32588a));
                this.d.setPathEffect(new CornerPathEffect(this.f32588a));
            }
        }
        Rect rect = this.f32597m;
        float f10 = this.f32595k;
        float f11 = this.f32594j;
        ArrayList arrayList = this.f32592g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((r90) arrayList.get(0)).computeBounds(rectF, false);
            this.f32597m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((r90) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f32597m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f32597m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f32597m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f32597m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f7 = f11;
            this.f32598n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f32597m.top - f10, 2.0d) + Math.pow(this.f32597m.left - f11, 2.0d), Math.pow(this.f32597m.top - f10, 2.0d) + Math.pow(this.f32597m.right - f11, 2.0d)), Math.max(Math.pow(this.f32597m.bottom - f10, 2.0d) + Math.pow(this.f32597m.left - f11, 2.0d), Math.pow(this.f32597m.bottom - f10, 2.0d) + Math.pow(this.f32597m.right - f11, 2.0d))));
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
            if (this.f32599o < 0) {
                this.f32599o = elapsedRealtime;
            }
            float interpolation = bs.f25037f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f32599o)) / ((float) this.f32601q)));
            long j10 = this.f32600p;
            if (j10 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j10)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f32590c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * f12));
            this.f32590c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = z11; i12 < this.h; i12++) {
                ((r90) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f32590c);
            }
            this.d.setAlpha((int) (this.f32591f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f32598n;
                canvas.save();
                Path path = this.f32596l;
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
            if (i13 < 0 || this.f32600p >= 0) {
                return z13;
            }
        }
        return z11;
    }

    public final r90 b() {
        r90 r90Var;
        ArrayList arrayList = f32587s;
        if (!arrayList.isEmpty()) {
            r90Var = (r90) arrayList.remove(0);
        } else {
            r90Var = new r90(0);
        }
        r90Var.f25991c = !this.f32602r;
        r90Var.reset();
        ArrayList arrayList2 = this.f32592g;
        arrayList2.add(r90Var);
        this.h = arrayList2.size();
        return r90Var;
    }

    public final void c() {
        ArrayList arrayList = this.f32592g;
        if (arrayList.isEmpty()) {
            return;
        }
        f32587s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f32589b = i10;
        Paint paint = this.f32590c;
        if (paint != null) {
            paint.setColor(i10);
            this.e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f32591f = Color.alpha(i10);
        }
    }
}
