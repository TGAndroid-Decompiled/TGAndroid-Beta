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
public final class ga0 {
    public static final ArrayList f26655s = new ArrayList();
    public int f26656a;
    public int f26657b;
    public Paint f26658c;
    public Paint d;
    public int f26659e;
    public int f26660f;
    public final CharacterStyle f26662i;
    public final float f26663j;
    public final float f26664k;
    public Rect f26666m;
    public float f26667n;
    public final long f26670q;
    public final ArrayList f26661g = new ArrayList();
    public int h = 0;
    public final Path f26665l = new Path();
    public long f26668o = -1;
    public long f26669p = -1;
    public final boolean f26671r = !LiteMode.isEnabled(360928);

    public ga0(CharacterStyle characterStyle, org.telegram.ui.ActionBar.d6 d6Var, float f7, float f10, int i10) {
        this.f26662i = characterStyle;
        d(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ld, d6Var));
        this.f26663j = f7;
        this.f26664k = f10;
        this.f26670q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        float min;
        boolean z14 = this.f26671r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f26656a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f26658c == null) {
            Paint paint = new Paint(1);
            this.f26658c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f26658c.setColor(this.f26657b);
            this.f26659e = Color.alpha(this.f26657b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f26657b);
            this.f26660f = Color.alpha(this.f26657b);
        }
        if (z10) {
            this.f26656a = dp;
            if (dp <= 0) {
                this.f26658c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f26658c.setPathEffect(new CornerPathEffect(this.f26656a));
                this.d.setPathEffect(new CornerPathEffect(this.f26656a));
            }
        }
        Rect rect = this.f26666m;
        float f10 = this.f26664k;
        float f11 = this.f26663j;
        ArrayList arrayList = this.f26661g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((z90) arrayList.get(0)).computeBounds(rectF, false);
            this.f26666m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((z90) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f26666m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f26666m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f26666m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f26666m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f7 = f11;
            this.f26667n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f26666m.top - f10, 2.0d) + Math.pow(this.f26666m.left - f11, 2.0d), Math.pow(this.f26666m.top - f10, 2.0d) + Math.pow(this.f26666m.right - f11, 2.0d)), Math.max(Math.pow(this.f26666m.bottom - f10, 2.0d) + Math.pow(this.f26666m.left - f11, 2.0d), Math.pow(this.f26666m.bottom - f10, 2.0d) + Math.pow(this.f26666m.right - f11, 2.0d))));
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
            if (this.f26668o < 0) {
                this.f26668o = elapsedRealtime;
            }
            float interpolation = is.f27451f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f26668o)) / ((float) this.f26670q)));
            long j3 = this.f26669p;
            if (j3 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j3)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f26658c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f26659e * 0.2f * f12));
            this.f26658c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = z11; i12 < this.h; i12++) {
                ((z90) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f26658c);
            }
            this.d.setAlpha((int) (this.f26660f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f26667n;
                canvas.save();
                Path path = this.f26665l;
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
            if (i13 < 0 || this.f26669p >= 0) {
                return z13;
            }
        }
        return z11;
    }

    public final z90 b() {
        z90 z90Var;
        ArrayList arrayList = f26655s;
        if (!arrayList.isEmpty()) {
            z90Var = (z90) arrayList.remove(0);
        } else {
            z90Var = new z90(0);
        }
        z90Var.f28062c = !this.f26671r;
        z90Var.reset();
        ArrayList arrayList2 = this.f26661g;
        arrayList2.add(z90Var);
        this.h = arrayList2.size();
        return z90Var;
    }

    public final void c() {
        ArrayList arrayList = this.f26661g;
        if (arrayList.isEmpty()) {
            return;
        }
        f26655s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f26657b = i10;
        Paint paint = this.f26658c;
        if (paint != null) {
            paint.setColor(i10);
            this.f26659e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f26660f = Color.alpha(i10);
        }
    }
}
