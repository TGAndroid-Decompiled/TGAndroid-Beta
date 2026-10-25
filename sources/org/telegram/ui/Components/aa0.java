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
public final class aa0 {
    public static final ArrayList f26439s = new ArrayList();
    public int f26440a;
    public int f26441b;
    public Paint f26442c;
    public Paint d;
    public int e;
    public int f26443f;
    public final CharacterStyle f26445i;
    public final float f26446j;
    public final float f26447k;
    public Rect f26449m;
    public float f26450n;
    public final long f26453q;
    public final ArrayList f26444g = new ArrayList();
    public int h = 0;
    public final Path f26448l = new Path();
    public long f26451o = -1;
    public long f26452p = -1;
    public final boolean f26454r = !LiteMode.isEnabled(360928);

    public aa0(CharacterStyle characterStyle, org.telegram.ui.ActionBar.u6 u6Var, float f7, float f10, int i10) {
        this.f26445i = characterStyle;
        d(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ld, u6Var));
        this.f26446j = f7;
        this.f26447k = f10;
        this.f26453q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        float min;
        boolean z14 = this.f26454r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f26440a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f26442c == null) {
            Paint paint = new Paint(1);
            this.f26442c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f26442c.setColor(this.f26441b);
            this.e = Color.alpha(this.f26441b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f26441b);
            this.f26443f = Color.alpha(this.f26441b);
        }
        if (z10) {
            this.f26440a = dp;
            if (dp <= 0) {
                this.f26442c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f26442c.setPathEffect(new CornerPathEffect(this.f26440a));
                this.d.setPathEffect(new CornerPathEffect(this.f26440a));
            }
        }
        Rect rect = this.f26449m;
        float f10 = this.f26447k;
        float f11 = this.f26446j;
        ArrayList arrayList = this.f26444g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((s90) arrayList.get(0)).computeBounds(rectF, false);
            this.f26449m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((s90) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f26449m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f26449m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f26449m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f26449m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f7 = f11;
            this.f26450n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f26449m.top - f10, 2.0d) + Math.pow(this.f26449m.left - f11, 2.0d), Math.pow(this.f26449m.top - f10, 2.0d) + Math.pow(this.f26449m.right - f11, 2.0d)), Math.max(Math.pow(this.f26449m.bottom - f10, 2.0d) + Math.pow(this.f26449m.left - f11, 2.0d), Math.pow(this.f26449m.bottom - f10, 2.0d) + Math.pow(this.f26449m.right - f11, 2.0d))));
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
            if (this.f26451o < 0) {
                this.f26451o = elapsedRealtime;
            }
            float interpolation = ds.f27584f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f26451o)) / ((float) this.f26453q)));
            long j10 = this.f26452p;
            if (j10 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j10)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f26442c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * f12));
            this.f26442c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = z11; i12 < this.h; i12++) {
                ((s90) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f26442c);
            }
            this.d.setAlpha((int) (this.f26443f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f26450n;
                canvas.save();
                Path path = this.f26448l;
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
            if (i13 < 0 || this.f26452p >= 0) {
                return z13;
            }
        }
        return z11;
    }

    public final s90 b() {
        s90 s90Var;
        ArrayList arrayList = f26439s;
        if (!arrayList.isEmpty()) {
            s90Var = (s90) arrayList.remove(0);
        } else {
            s90Var = new s90(0);
        }
        s90Var.f28298c = !this.f26454r;
        s90Var.reset();
        ArrayList arrayList2 = this.f26444g;
        arrayList2.add(s90Var);
        this.h = arrayList2.size();
        return s90Var;
    }

    public final void c() {
        ArrayList arrayList = this.f26444g;
        if (arrayList.isEmpty()) {
            return;
        }
        f26439s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f26441b = i10;
        Paint paint = this.f26442c;
        if (paint != null) {
            paint.setColor(i10);
            this.e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f26443f = Color.alpha(i10);
        }
    }
}
