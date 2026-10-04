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
public final class r90 {
    public static final ArrayList f30298s = new ArrayList();
    public int f30299a;
    public int f30300b;
    public Paint f30301c;
    public Paint d;
    public int f30302e;
    public int f30303f;
    public final CharacterStyle f30305i;
    public final float f30306j;
    public final float f30307k;
    public Rect f30309m;
    public float f30310n;
    public final long f30313q;
    public final ArrayList f30304g = new ArrayList();
    public int h = 0;
    public final Path f30308l = new Path();
    public long f30311o = -1;
    public long f30312p = -1;
    public final boolean f30314r = !LiteMode.isEnabled(360928);

    public r90(CharacterStyle characterStyle, org.telegram.ui.ActionBar.d6 d6Var, float f7, float f10, int i10) {
        this.f30305i = characterStyle;
        d(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Ld, d6Var));
        this.f30306j = f7;
        this.f30307k = f10;
        this.f30313q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        float f7;
        boolean z12;
        boolean z13;
        float min;
        boolean z14 = this.f30314r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f30299a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f30301c == null) {
            Paint paint = new Paint(1);
            this.f30301c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f30301c.setColor(this.f30300b);
            this.f30302e = Color.alpha(this.f30300b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f30300b);
            this.f30303f = Color.alpha(this.f30300b);
        }
        if (z10) {
            this.f30299a = dp;
            if (dp <= 0) {
                this.f30301c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f30301c.setPathEffect(new CornerPathEffect(this.f30299a));
                this.d.setPathEffect(new CornerPathEffect(this.f30299a));
            }
        }
        Rect rect = this.f30309m;
        float f10 = this.f30307k;
        float f11 = this.f30306j;
        ArrayList arrayList = this.f30304g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((k90) arrayList.get(0)).computeBounds(rectF, false);
            this.f30309m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((k90) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f30309m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f30309m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f30309m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f30309m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = z14;
            z12 = false;
            f7 = f11;
            z13 = true;
            this.f30310n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f30309m.top - f10, 2.0d) + Math.pow(this.f30309m.left - f11, 2.0d), Math.pow(this.f30309m.top - f10, 2.0d) + Math.pow(this.f30309m.right - f11, 2.0d)), Math.max(Math.pow(this.f30309m.bottom - f10, 2.0d) + Math.pow(this.f30309m.left - f11, 2.0d), Math.pow(this.f30309m.bottom - f10, 2.0d) + Math.pow(this.f30309m.right - f11, 2.0d))));
        } else {
            z11 = z14;
            f7 = f11;
            z12 = false;
            z13 = true;
        }
        if (z11) {
            for (int i11 = 0; i11 < this.h; i11++) {
                canvas.drawPath((Path) arrayList.get(i11), this.d);
            }
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f30311o < 0) {
                this.f30311o = elapsedRealtime;
            }
            float interpolation = tr.f31140f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f30311o)) / ((float) this.f30313q)));
            long j3 = this.f30312p;
            if (j3 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j3)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f30301c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f30302e * 0.2f * f12));
            this.f30301c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = 0; i12 < this.h; i12++) {
                ((k90) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f30301c);
            }
            this.d.setAlpha((int) (this.f30303f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f30310n;
                canvas.save();
                Path path = this.f30308l;
                path.reset();
                path.addCircle(f7, f10, f13, Path.Direction.CW);
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
            if (i13 < 0 || this.f30312p >= 0) {
                return z13;
            }
        }
        return z12;
    }

    public final k90 b() {
        k90 k90Var;
        ArrayList arrayList = f30298s;
        if (!arrayList.isEmpty()) {
            k90Var = (k90) arrayList.remove(0);
        } else {
            k90Var = new k90(0);
        }
        k90Var.f32961c = !this.f30314r;
        k90Var.reset();
        ArrayList arrayList2 = this.f30304g;
        arrayList2.add(k90Var);
        this.h = arrayList2.size();
        return k90Var;
    }

    public final void c() {
        ArrayList arrayList = this.f30304g;
        if (arrayList.isEmpty()) {
            return;
        }
        f30298s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f30300b = i10;
        Paint paint = this.f30301c;
        if (paint != null) {
            paint.setColor(i10);
            this.f30302e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f30303f = Color.alpha(i10);
        }
    }
}
