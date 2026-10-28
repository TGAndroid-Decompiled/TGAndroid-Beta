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
public final class ba0 {
    public static final ArrayList f26774s = new ArrayList();
    public int f26775a;
    public int f26776b;
    public Paint f26777c;
    public Paint d;
    public int e;
    public int f26778f;
    public final CharacterStyle f26780i;
    public final float f26781j;
    public final float f26782k;
    public Rect f26784m;
    public float f26785n;
    public final long f26788q;
    public final ArrayList f26779g = new ArrayList();
    public int h = 0;
    public final Path f26783l = new Path();
    public long f26786o = -1;
    public long f26787p = -1;
    public final boolean f26789r = !LiteMode.isEnabled(360928);

    public ba0(CharacterStyle characterStyle, org.telegram.ui.ActionBar.u6 u6Var, float f7, float f10, int i10) {
        this.f26780i = characterStyle;
        d(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ld, u6Var));
        this.f26781j = f7;
        this.f26782k = f10;
        this.f26788q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        float min;
        boolean z14 = this.f26789r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f26775a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f26777c == null) {
            Paint paint = new Paint(1);
            this.f26777c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f26777c.setColor(this.f26776b);
            this.e = Color.alpha(this.f26776b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f26776b);
            this.f26778f = Color.alpha(this.f26776b);
        }
        if (z10) {
            this.f26775a = dp;
            if (dp <= 0) {
                this.f26777c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f26777c.setPathEffect(new CornerPathEffect(this.f26775a));
                this.d.setPathEffect(new CornerPathEffect(this.f26775a));
            }
        }
        Rect rect = this.f26784m;
        float f10 = this.f26782k;
        float f11 = this.f26781j;
        ArrayList arrayList = this.f26779g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((t90) arrayList.get(0)).computeBounds(rectF, false);
            this.f26784m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((t90) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f26784m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f26784m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f26784m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f26784m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f7 = f11;
            this.f26785n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f26784m.top - f10, 2.0d) + Math.pow(this.f26784m.left - f11, 2.0d), Math.pow(this.f26784m.top - f10, 2.0d) + Math.pow(this.f26784m.right - f11, 2.0d)), Math.max(Math.pow(this.f26784m.bottom - f10, 2.0d) + Math.pow(this.f26784m.left - f11, 2.0d), Math.pow(this.f26784m.bottom - f10, 2.0d) + Math.pow(this.f26784m.right - f11, 2.0d))));
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
            if (this.f26786o < 0) {
                this.f26786o = elapsedRealtime;
            }
            float interpolation = ds.f27530f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f26786o)) / ((float) this.f26788q)));
            long j10 = this.f26787p;
            if (j10 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j10)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f26777c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * f12));
            this.f26777c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = z11; i12 < this.h; i12++) {
                ((t90) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f26777c);
            }
            this.d.setAlpha((int) (this.f26778f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f26785n;
                canvas.save();
                Path path = this.f26783l;
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
            if (i13 < 0 || this.f26787p >= 0) {
                return z13;
            }
        }
        return z11;
    }

    public final t90 b() {
        t90 t90Var;
        ArrayList arrayList = f26774s;
        if (!arrayList.isEmpty()) {
            t90Var = (t90) arrayList.remove(0);
        } else {
            t90Var = new t90(0);
        }
        t90Var.f28280c = !this.f26789r;
        t90Var.reset();
        ArrayList arrayList2 = this.f26779g;
        arrayList2.add(t90Var);
        this.h = arrayList2.size();
        return t90Var;
    }

    public final void c() {
        ArrayList arrayList = this.f26779g;
        if (arrayList.isEmpty()) {
            return;
        }
        f26774s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f26776b = i10;
        Paint paint = this.f26777c;
        if (paint != null) {
            paint.setColor(i10);
            this.e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f26778f = Color.alpha(i10);
        }
    }
}
