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
public final class g90 {
    public static final ArrayList f25092s = new ArrayList();
    public int f25093a;
    public int f25094b;
    public Paint f25095c;
    public Paint d;
    public int e;
    public int f25096f;
    public final CharacterStyle f25098i;
    public final float f25099j;
    public final float f25100k;
    public Rect f25102m;
    public float f25103n;
    public final long f25106q;
    public final ArrayList f25097g = new ArrayList();
    public int h = 0;
    public final Path f25101l = new Path();
    public long f25104o = -1;
    public long f25105p = -1;
    public final boolean f25107r = !LiteMode.isEnabled(360928);

    public g90(CharacterStyle characterStyle, org.telegram.ui.ActionBar.f6 f6Var, float f10, float f11, int i10) {
        this.f25098i = characterStyle;
        d(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, f6Var));
        this.f25099j = f10;
        this.f25100k = f11;
        this.f25106q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z4;
        boolean z10;
        float f10;
        boolean z11;
        boolean z12;
        float min;
        boolean z13 = this.f25107r;
        if (z13) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f25093a != dp) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f25095c == null) {
            Paint paint = new Paint(1);
            this.f25095c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f25095c.setColor(this.f25094b);
            this.e = Color.alpha(this.f25094b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f25094b);
            this.f25096f = Color.alpha(this.f25094b);
        }
        if (z4) {
            this.f25093a = dp;
            if (dp <= 0) {
                this.f25095c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f25095c.setPathEffect(new CornerPathEffect(this.f25093a));
                this.d.setPathEffect(new CornerPathEffect(this.f25093a));
            }
        }
        Rect rect = this.f25102m;
        float f11 = this.f25100k;
        float f12 = this.f25099j;
        ArrayList arrayList = this.f25097g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((y80) arrayList.get(0)).computeBounds(rectF, false);
            this.f25102m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((y80) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f25102m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f25102m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f25102m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f25102m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z10 = z13;
            z11 = false;
            f10 = f12;
            z12 = true;
            this.f25103n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f25102m.top - f11, 2.0d) + Math.pow(this.f25102m.left - f12, 2.0d), Math.pow(this.f25102m.top - f11, 2.0d) + Math.pow(this.f25102m.right - f12, 2.0d)), Math.max(Math.pow(this.f25102m.bottom - f11, 2.0d) + Math.pow(this.f25102m.left - f12, 2.0d), Math.pow(this.f25102m.bottom - f11, 2.0d) + Math.pow(this.f25102m.right - f12, 2.0d))));
        } else {
            z10 = z13;
            f10 = f12;
            z11 = false;
            z12 = true;
        }
        if (z10) {
            for (int i11 = 0; i11 < this.h; i11++) {
                canvas.drawPath((Path) arrayList.get(i11), this.d);
            }
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f25104o < 0) {
                this.f25104o = elapsedRealtime;
            }
            float interpolation = mr.f27122f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f25104o)) / ((float) this.f25106q)));
            long j10 = this.f25105p;
            if (j10 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j10)) / 100.0f));
            }
            float f13 = 1.0f - min;
            this.f25095c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * f13));
            this.f25095c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = 0; i12 < this.h; i12++) {
                ((y80) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f25095c);
            }
            this.d.setAlpha((int) (this.f25096f * 0.8f * f13));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f14 = interpolation * this.f25103n;
                canvas.save();
                Path path = this.f25101l;
                path.reset();
                path.addCircle(f10, f11, f14, Path.Direction.CW);
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
            if (i13 < 0 || this.f25105p >= 0) {
                return z12;
            }
        }
        return z11;
    }

    public final y80 b() {
        y80 y80Var;
        ArrayList arrayList = f25092s;
        if (!arrayList.isEmpty()) {
            y80Var = (y80) arrayList.remove(0);
        } else {
            y80Var = new y80(0);
        }
        y80Var.f28560c = !this.f25107r;
        y80Var.reset();
        ArrayList arrayList2 = this.f25097g;
        arrayList2.add(y80Var);
        this.h = arrayList2.size();
        return y80Var;
    }

    public final void c() {
        ArrayList arrayList = this.f25097g;
        if (arrayList.isEmpty()) {
            return;
        }
        f25092s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f25094b = i10;
        Paint paint = this.f25095c;
        if (paint != null) {
            paint.setColor(i10);
            this.e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f25096f = Color.alpha(i10);
        }
    }
}
