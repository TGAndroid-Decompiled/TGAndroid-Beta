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
    public static final ArrayList f25616s = new ArrayList();
    public int f25617a;
    public int f25618b;
    public Paint f25619c;
    public Paint d;
    public int f25620e;
    public int f25621f;
    public final CharacterStyle f25623i;
    public final float f25624j;
    public final float f25625k;
    public Rect f25627m;
    public float f25628n;
    public final long f25631q;
    public final ArrayList f25622g = new ArrayList();
    public int h = 0;
    public final Path f25626l = new Path();
    public long f25629o = -1;
    public long f25630p = -1;
    public final boolean f25632r = !LiteMode.isEnabled(360928);

    public e90(CharacterStyle characterStyle, org.telegram.ui.ActionBar.f6 f6Var, float f7, float f10, int i10) {
        this.f25623i = characterStyle;
        d(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, f6Var));
        this.f25624j = f7;
        this.f25625k = f10;
        this.f25631q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        float f7;
        boolean z12;
        boolean z13;
        float min;
        boolean z14 = this.f25632r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f25617a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f25619c == null) {
            Paint paint = new Paint(1);
            this.f25619c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f25619c.setColor(this.f25618b);
            this.f25620e = Color.alpha(this.f25618b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f25618b);
            this.f25621f = Color.alpha(this.f25618b);
        }
        if (z10) {
            this.f25617a = dp;
            if (dp <= 0) {
                this.f25619c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f25619c.setPathEffect(new CornerPathEffect(this.f25617a));
                this.d.setPathEffect(new CornerPathEffect(this.f25617a));
            }
        }
        Rect rect = this.f25627m;
        float f10 = this.f25625k;
        float f11 = this.f25624j;
        ArrayList arrayList = this.f25622g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((x80) arrayList.get(0)).computeBounds(rectF, false);
            this.f25627m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((x80) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f25627m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f25627m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f25627m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f25627m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = z14;
            z12 = false;
            f7 = f11;
            z13 = true;
            this.f25628n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f25627m.top - f10, 2.0d) + Math.pow(this.f25627m.left - f11, 2.0d), Math.pow(this.f25627m.top - f10, 2.0d) + Math.pow(this.f25627m.right - f11, 2.0d)), Math.max(Math.pow(this.f25627m.bottom - f10, 2.0d) + Math.pow(this.f25627m.left - f11, 2.0d), Math.pow(this.f25627m.bottom - f10, 2.0d) + Math.pow(this.f25627m.right - f11, 2.0d))));
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
            if (this.f25629o < 0) {
                this.f25629o = elapsedRealtime;
            }
            float interpolation = pr.f29466f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f25629o)) / ((float) this.f25631q)));
            long j3 = this.f25630p;
            if (j3 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j3)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f25619c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f25620e * 0.2f * f12));
            this.f25619c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = 0; i12 < this.h; i12++) {
                ((x80) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f25619c);
            }
            this.d.setAlpha((int) (this.f25621f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f25628n;
                canvas.save();
                Path path = this.f25626l;
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
            if (i13 < 0 || this.f25630p >= 0) {
                return z13;
            }
        }
        return z12;
    }

    public final x80 b() {
        x80 x80Var;
        ArrayList arrayList = f25616s;
        if (!arrayList.isEmpty()) {
            x80Var = (x80) arrayList.remove(0);
        } else {
            x80Var = new x80(0);
        }
        x80Var.f30678c = !this.f25632r;
        x80Var.reset();
        ArrayList arrayList2 = this.f25622g;
        arrayList2.add(x80Var);
        this.h = arrayList2.size();
        return x80Var;
    }

    public final void c() {
        ArrayList arrayList = this.f25622g;
        if (arrayList.isEmpty()) {
            return;
        }
        f25616s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f25618b = i10;
        Paint paint = this.f25619c;
        if (paint != null) {
            paint.setColor(i10);
            this.f25620e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f25621f = Color.alpha(i10);
        }
    }
}
