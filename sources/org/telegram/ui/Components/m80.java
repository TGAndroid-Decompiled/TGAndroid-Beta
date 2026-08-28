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
public final class m80 {
    public static final ArrayList f30761s = new ArrayList();
    public int f30762a;
    public int f30763b;
    public Paint f30764c;
    public Paint d;
    public int f30765e;
    public int f30766f;
    public final CharacterStyle f30768i;
    public final float f30769j;
    public final float f30770k;
    public Rect f30772m;
    public float f30773n;
    public final long f30776q;
    public final ArrayList f30767g = new ArrayList();
    public int h = 0;
    public final Path f30771l = new Path();
    public long f30774o = -1;
    public long f30775p = -1;
    public final boolean f30777r = !LiteMode.isEnabled(360928);

    public m80(CharacterStyle characterStyle, org.telegram.ui.ActionBar.b6 b6Var, float f10, float f11, int i9) {
        this.f30768i = characterStyle;
        d(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ld, b6Var));
        this.f30769j = f10;
        this.f30770k = f11;
        this.f30776q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        float f10;
        boolean z12;
        boolean z13;
        float min;
        boolean z14 = this.f30777r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f30762a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f30764c == null) {
            Paint paint = new Paint(1);
            this.f30764c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f30764c.setColor(this.f30763b);
            this.f30765e = Color.alpha(this.f30763b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f30763b);
            this.f30766f = Color.alpha(this.f30763b);
        }
        if (z10) {
            this.f30762a = dp;
            if (dp <= 0) {
                this.f30764c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f30764c.setPathEffect(new CornerPathEffect(this.f30762a));
                this.d.setPathEffect(new CornerPathEffect(this.f30762a));
            }
        }
        Rect rect = this.f30772m;
        float f11 = this.f30770k;
        float f12 = this.f30769j;
        ArrayList arrayList = this.f30767g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((f80) arrayList.get(0)).computeBounds(rectF, false);
            this.f30772m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i9 = 1; i9 < this.h; i9++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((f80) arrayList.get(i9)).computeBounds(rectF2, false);
                Rect rect2 = this.f30772m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f30772m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f30772m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f30772m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = z14;
            z12 = false;
            f10 = f12;
            z13 = true;
            this.f30773n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f30772m.top - f11, 2.0d) + Math.pow(this.f30772m.left - f12, 2.0d), Math.pow(this.f30772m.top - f11, 2.0d) + Math.pow(this.f30772m.right - f12, 2.0d)), Math.max(Math.pow(this.f30772m.bottom - f11, 2.0d) + Math.pow(this.f30772m.left - f12, 2.0d), Math.pow(this.f30772m.bottom - f11, 2.0d) + Math.pow(this.f30772m.right - f12, 2.0d))));
        } else {
            z11 = z14;
            f10 = f12;
            z12 = false;
            z13 = true;
        }
        if (z11) {
            for (int i10 = 0; i10 < this.h; i10++) {
                canvas.drawPath((Path) arrayList.get(i10), this.d);
            }
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f30774o < 0) {
                this.f30774o = elapsedRealtime;
            }
            float interpolation = gr.f28844f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f30774o)) / ((float) this.f30776q)));
            long j10 = this.f30775p;
            if (j10 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j10)) / 100.0f));
            }
            float f13 = 1.0f - min;
            this.f30764c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f30765e * 0.2f * f13));
            this.f30764c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i11 = 0; i11 < this.h; i11++) {
                ((f80) arrayList.get(i11)).a();
                canvas.drawPath((Path) arrayList.get(i11), this.f30764c);
            }
            this.d.setAlpha((int) (this.f30766f * 0.8f * f13));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i12 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i12 < 0) {
                float f14 = interpolation * this.f30773n;
                canvas.save();
                Path path = this.f30771l;
                path.reset();
                path.addCircle(f10, f11, f14, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i13 = 0; i13 < this.h; i13++) {
                    canvas.drawPath((Path) arrayList.get(i13), this.d);
                }
                canvas.restore();
            } else {
                for (int i14 = 0; i14 < this.h; i14++) {
                    canvas.drawPath((Path) arrayList.get(i14), this.d);
                }
            }
            if (i12 < 0 || this.f30775p >= 0) {
                return z13;
            }
        }
        return z12;
    }

    public final f80 b() {
        f80 f80Var;
        ArrayList arrayList = f30761s;
        if (!arrayList.isEmpty()) {
            f80Var = (f80) arrayList.remove(0);
        } else {
            f80Var = new f80(0);
        }
        f80Var.f30219c = !this.f30777r;
        f80Var.reset();
        ArrayList arrayList2 = this.f30767g;
        arrayList2.add(f80Var);
        this.h = arrayList2.size();
        return f80Var;
    }

    public final void c() {
        ArrayList arrayList = this.f30767g;
        if (arrayList.isEmpty()) {
            return;
        }
        f30761s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i9) {
        this.f30763b = i9;
        Paint paint = this.f30764c;
        if (paint != null) {
            paint.setColor(i9);
            this.f30765e = Color.alpha(i9);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i9);
            this.f30766f = Color.alpha(i9);
        }
    }
}
