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
public final class q80 {
    public static final ArrayList f29562s = new ArrayList();
    public int f29563a;
    public int f29564b;
    public Paint f29565c;
    public Paint d;
    public int e;
    public int f29566f;
    public final CharacterStyle f29568i;
    public final float f29569j;
    public final float f29570k;
    public Rect f29572m;
    public float f29573n;
    public final long f29576q;
    public final ArrayList f29567g = new ArrayList();
    public int h = 0;
    public final Path f29571l = new Path();
    public long f29574o = -1;
    public long f29575p = -1;
    public final boolean f29577r = !org.telegram.messenger.sc.e(360928);

    public q80(CharacterStyle characterStyle, org.telegram.ui.ActionBar.p6 p6Var, float f7, float f10, int i10) {
        this.f29568i = characterStyle;
        d(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21336ze, p6Var));
        this.f29569j = f7;
        this.f29570k = f10;
        this.f29576q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int L;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        float min;
        boolean z14 = this.f29577r;
        if (z14) {
            L = 0;
        } else {
            L = org.telegram.messenger.i0.L(4.0f);
        }
        if (this.f29563a != L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f29565c == null) {
            Paint paint = new Paint(1);
            this.f29565c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f29565c.setColor(this.f29564b);
            this.e = Color.alpha(this.f29564b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f29564b);
            this.f29566f = Color.alpha(this.f29564b);
        }
        if (z10) {
            this.f29563a = L;
            if (L <= 0) {
                this.f29565c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f29565c.setPathEffect(new CornerPathEffect(this.f29563a));
                this.d.setPathEffect(new CornerPathEffect(this.f29563a));
            }
        }
        Rect rect = this.f29572m;
        float f10 = this.f29570k;
        float f11 = this.f29569j;
        ArrayList arrayList = this.f29567g;
        if (rect == null && this.h > 0) {
            RectF rectF = org.telegram.messenger.i0.P;
            ((k80) arrayList.get(0)).computeBounds(rectF, false);
            this.f29572m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = org.telegram.messenger.i0.P;
                ((k80) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f29572m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f29572m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f29572m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f29572m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = 0;
            z12 = z14;
            z13 = true;
            f7 = f11;
            this.f29573n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f29572m.top - f10, 2.0d) + Math.pow(this.f29572m.left - f11, 2.0d), Math.pow(this.f29572m.top - f10, 2.0d) + Math.pow(this.f29572m.right - f11, 2.0d)), Math.max(Math.pow(this.f29572m.bottom - f10, 2.0d) + Math.pow(this.f29572m.left - f11, 2.0d), Math.pow(this.f29572m.bottom - f10, 2.0d) + Math.pow(this.f29572m.right - f11, 2.0d))));
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
            if (this.f29574o < 0) {
                this.f29574o = elapsedRealtime;
            }
            float interpolation = gr.f26495f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f29574o)) / ((float) this.f29576q)));
            long j10 = this.f29575p;
            if (j10 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j10)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f29565c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * f12));
            this.f29565c.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.i0.L(5.0f));
            for (int i12 = z11; i12 < this.h; i12++) {
                ((k80) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f29565c);
            }
            this.d.setAlpha((int) (this.f29566f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.i0.L(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f29573n;
                canvas.save();
                Path path = this.f29571l;
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
            if (i13 < 0 || this.f29575p >= 0) {
                return z13;
            }
        }
        return z11;
    }

    public final k80 b() {
        k80 k80Var;
        ArrayList arrayList = f29562s;
        if (!arrayList.isEmpty()) {
            k80Var = (k80) arrayList.remove(0);
        } else {
            k80Var = new k80(0);
        }
        k80Var.f27471c = !this.f29577r;
        k80Var.reset();
        ArrayList arrayList2 = this.f29567g;
        arrayList2.add(k80Var);
        this.h = arrayList2.size();
        return k80Var;
    }

    public final void c() {
        ArrayList arrayList = this.f29567g;
        if (arrayList.isEmpty()) {
            return;
        }
        f29562s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f29564b = i10;
        Paint paint = this.f29565c;
        if (paint != null) {
            paint.setColor(i10);
            this.e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f29566f = Color.alpha(i10);
        }
    }
}
