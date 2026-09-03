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
public final class h90 {
    public static final ArrayList f27416s = new ArrayList();
    public int f27417a;
    public int f27418b;
    public Paint f27419c;
    public Paint d;
    public int f27420e;
    public int f27421f;
    public final CharacterStyle f27423i;
    public final float f27424j;
    public final float f27425k;
    public Rect f27427m;
    public float f27428n;
    public final long f27431q;
    public final ArrayList f27422g = new ArrayList();
    public int h = 0;
    public final Path f27426l = new Path();
    public long f27429o = -1;
    public long f27430p = -1;
    public final boolean f27432r = !LiteMode.isEnabled(360928);

    public h90(CharacterStyle characterStyle, org.telegram.ui.ActionBar.g6 g6Var, float f10, float f11, int i10) {
        this.f27423i = characterStyle;
        d(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ld, g6Var));
        this.f27424j = f10;
        this.f27425k = f11;
        this.f27431q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z4;
        boolean z10;
        float f10;
        boolean z11;
        boolean z12;
        float min;
        boolean z13 = this.f27432r;
        if (z13) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f27417a != dp) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f27419c == null) {
            Paint paint = new Paint(1);
            this.f27419c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f27419c.setColor(this.f27418b);
            this.f27420e = Color.alpha(this.f27418b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f27418b);
            this.f27421f = Color.alpha(this.f27418b);
        }
        if (z4) {
            this.f27417a = dp;
            if (dp <= 0) {
                this.f27419c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f27419c.setPathEffect(new CornerPathEffect(this.f27417a));
                this.d.setPathEffect(new CornerPathEffect(this.f27417a));
            }
        }
        Rect rect = this.f27427m;
        float f11 = this.f27425k;
        float f12 = this.f27424j;
        ArrayList arrayList = this.f27422g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((z80) arrayList.get(0)).computeBounds(rectF, false);
            this.f27427m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((z80) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f27427m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f27427m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f27427m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f27427m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z10 = z13;
            z11 = false;
            f10 = f12;
            z12 = true;
            this.f27428n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f27427m.top - f11, 2.0d) + Math.pow(this.f27427m.left - f12, 2.0d), Math.pow(this.f27427m.top - f11, 2.0d) + Math.pow(this.f27427m.right - f12, 2.0d)), Math.max(Math.pow(this.f27427m.bottom - f11, 2.0d) + Math.pow(this.f27427m.left - f12, 2.0d), Math.pow(this.f27427m.bottom - f11, 2.0d) + Math.pow(this.f27427m.right - f12, 2.0d))));
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
            if (this.f27429o < 0) {
                this.f27429o = elapsedRealtime;
            }
            float interpolation = pr.f30168f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f27429o)) / ((float) this.f27431q)));
            long j10 = this.f27430p;
            if (j10 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j10)) / 100.0f));
            }
            float f13 = 1.0f - min;
            this.f27419c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.f27420e * 0.2f * f13));
            this.f27419c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = 0; i12 < this.h; i12++) {
                ((z80) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f27419c);
            }
            this.d.setAlpha((int) (this.f27421f * 0.8f * f13));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f14 = interpolation * this.f27428n;
                canvas.save();
                Path path = this.f27426l;
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
            if (i13 < 0 || this.f27430p >= 0) {
                return z12;
            }
        }
        return z11;
    }

    public final z80 b() {
        z80 z80Var;
        ArrayList arrayList = f27416s;
        if (!arrayList.isEmpty()) {
            z80Var = (z80) arrayList.remove(0);
        } else {
            z80Var = new z80(0);
        }
        z80Var.f31669c = !this.f27432r;
        z80Var.reset();
        ArrayList arrayList2 = this.f27422g;
        arrayList2.add(z80Var);
        this.h = arrayList2.size();
        return z80Var;
    }

    public final void c() {
        ArrayList arrayList = this.f27422g;
        if (arrayList.isEmpty()) {
            return;
        }
        f27416s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f27418b = i10;
        Paint paint = this.f27419c;
        if (paint != null) {
            paint.setColor(i10);
            this.f27420e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f27421f = Color.alpha(i10);
        }
    }
}
