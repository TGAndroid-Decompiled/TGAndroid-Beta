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
    public static final ArrayList f26323s = new ArrayList();
    public int f26324a;
    public int f26325b;
    public Paint f26326c;
    public Paint d;
    public int f26327e;
    public int f26328f;
    public final CharacterStyle f26330i;
    public final float f26331j;
    public final float f26332k;
    public Rect f26334m;
    public float f26335n;
    public final long f26338q;
    public final ArrayList f26329g = new ArrayList();
    public int h = 0;
    public final Path f26333l = new Path();
    public long f26336o = -1;
    public long f26337p = -1;
    public final boolean f26339r = !LiteMode.isEnabled(360928);

    public fa0(CharacterStyle characterStyle, org.telegram.ui.ActionBar.e6 e6Var, float f7, float f10, int i10) {
        this.f26330i = characterStyle;
        d(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ld, e6Var));
        this.f26331j = f7;
        this.f26332k = f10;
        this.f26338q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        float min;
        boolean z14 = this.f26339r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f26324a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f26326c == null) {
            Paint paint = new Paint(1);
            this.f26326c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f26326c.setColor(this.f26325b);
            this.f26327e = Color.alpha(this.f26325b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f26325b);
            this.f26328f = Color.alpha(this.f26325b);
        }
        if (z10) {
            this.f26324a = dp;
            if (dp <= 0) {
                this.f26326c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f26326c.setPathEffect(new CornerPathEffect(this.f26324a));
                this.d.setPathEffect(new CornerPathEffect(this.f26324a));
            }
        }
        Rect rect = this.f26334m;
        float f10 = this.f26332k;
        float f11 = this.f26331j;
        ArrayList arrayList = this.f26329g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((y90) arrayList.get(0)).computeBounds(rectF, false);
            this.f26334m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((y90) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f26334m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f26334m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f26334m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f26334m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f7 = f11;
            this.f26335n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f26334m.top - f10, 2.0d) + Math.pow(this.f26334m.left - f11, 2.0d), Math.pow(this.f26334m.top - f10, 2.0d) + Math.pow(this.f26334m.right - f11, 2.0d)), Math.max(Math.pow(this.f26334m.bottom - f10, 2.0d) + Math.pow(this.f26334m.left - f11, 2.0d), Math.pow(this.f26334m.bottom - f10, 2.0d) + Math.pow(this.f26334m.right - f11, 2.0d))));
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
            if (this.f26336o < 0) {
                this.f26336o = elapsedRealtime;
            }
            float interpolation = hs.f27118f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f26336o)) / ((float) this.f26338q)));
            long j3 = this.f26337p;
            if (j3 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j3)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f26326c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f26327e * 0.2f * f12));
            this.f26326c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = z11; i12 < this.h; i12++) {
                ((y90) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f26326c);
            }
            this.d.setAlpha((int) (this.f26328f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f26335n;
                canvas.save();
                Path path = this.f26333l;
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
            if (i13 < 0 || this.f26337p >= 0) {
                return z13;
            }
        }
        return z11;
    }

    public final y90 b() {
        y90 y90Var;
        ArrayList arrayList = f26323s;
        if (!arrayList.isEmpty()) {
            y90Var = (y90) arrayList.remove(0);
        } else {
            y90Var = new y90(0);
        }
        y90Var.f28150c = !this.f26339r;
        y90Var.reset();
        ArrayList arrayList2 = this.f26329g;
        arrayList2.add(y90Var);
        this.h = arrayList2.size();
        return y90Var;
    }

    public final void c() {
        ArrayList arrayList = this.f26329g;
        if (arrayList.isEmpty()) {
            return;
        }
        f26323s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f26325b = i10;
        Paint paint = this.f26326c;
        if (paint != null) {
            paint.setColor(i10);
            this.f26327e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f26328f = Color.alpha(i10);
        }
    }
}
