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
public final class e90 {
    public static final ArrayList f25644s = new ArrayList();
    public int f25645a;
    public int f25646b;
    public Paint f25647c;
    public Paint d;
    public int f25648e;
    public int f25649f;
    public final CharacterStyle f25651i;
    public final float f25652j;
    public final float f25653k;
    public Rect f25655m;
    public float f25656n;
    public final long f25659q;
    public final ArrayList f25650g = new ArrayList();
    public int h = 0;
    public final Path f25654l = new Path();
    public long f25657o = -1;
    public long f25658p = -1;
    public final boolean f25660r = !LiteMode.isEnabled(360928);

    public e90(CharacterStyle characterStyle, org.telegram.ui.ActionBar.f6 f6Var, float f7, float f10, int i10) {
        this.f25651i = characterStyle;
        d(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, f6Var));
        this.f25652j = f7;
        this.f25653k = f10;
        this.f25659q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        float f7;
        boolean z12;
        boolean z13;
        float min;
        boolean z14 = this.f25660r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f25645a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f25647c == null) {
            Paint paint = new Paint(1);
            this.f25647c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f25647c.setColor(this.f25646b);
            this.f25648e = Color.alpha(this.f25646b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f25646b);
            this.f25649f = Color.alpha(this.f25646b);
        }
        if (z10) {
            this.f25645a = dp;
            if (dp <= 0) {
                this.f25647c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f25647c.setPathEffect(new CornerPathEffect(this.f25645a));
                this.d.setPathEffect(new CornerPathEffect(this.f25645a));
            }
        }
        Rect rect = this.f25655m;
        float f10 = this.f25653k;
        float f11 = this.f25652j;
        ArrayList arrayList = this.f25650g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((x80) arrayList.get(0)).computeBounds(rectF, false);
            this.f25655m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((x80) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f25655m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f25655m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f25655m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f25655m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = z14;
            z12 = false;
            f7 = f11;
            z13 = true;
            this.f25656n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f25655m.top - f10, 2.0d) + Math.pow(this.f25655m.left - f11, 2.0d), Math.pow(this.f25655m.top - f10, 2.0d) + Math.pow(this.f25655m.right - f11, 2.0d)), Math.max(Math.pow(this.f25655m.bottom - f10, 2.0d) + Math.pow(this.f25655m.left - f11, 2.0d), Math.pow(this.f25655m.bottom - f10, 2.0d) + Math.pow(this.f25655m.right - f11, 2.0d))));
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
            if (this.f25657o < 0) {
                this.f25657o = elapsedRealtime;
            }
            float interpolation = pr.f29494f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f25657o)) / ((float) this.f25659q)));
            long j3 = this.f25658p;
            if (j3 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j3)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f25647c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f25648e * 0.2f * f12));
            this.f25647c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = 0; i12 < this.h; i12++) {
                ((x80) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f25647c);
            }
            this.d.setAlpha((int) (this.f25649f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f25656n;
                canvas.save();
                Path path = this.f25654l;
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
            if (i13 < 0 || this.f25658p >= 0) {
                return z13;
            }
        }
        return z12;
    }

    public final x80 b() {
        x80 x80Var;
        ArrayList arrayList = f25644s;
        if (!arrayList.isEmpty()) {
            x80Var = (x80) arrayList.remove(0);
        } else {
            x80Var = new x80(0);
        }
        x80Var.f30706c = !this.f25660r;
        x80Var.reset();
        ArrayList arrayList2 = this.f25650g;
        arrayList2.add(x80Var);
        this.h = arrayList2.size();
        return x80Var;
    }

    public final void c() {
        ArrayList arrayList = this.f25650g;
        if (arrayList.isEmpty()) {
            return;
        }
        f25644s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f25646b = i10;
        Paint paint = this.f25647c;
        if (paint != null) {
            paint.setColor(i10);
            this.f25648e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f25649f = Color.alpha(i10);
        }
    }
}
