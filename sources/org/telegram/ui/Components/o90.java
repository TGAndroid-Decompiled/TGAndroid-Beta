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
public final class o90 {
    public static final ArrayList f27016s = new ArrayList();
    public int f27017a;
    public int f27018b;
    public Paint f27019c;
    public Paint d;
    public int e;
    public int f27020f;
    public final CharacterStyle f27022i;
    public final float f27023j;
    public final float f27024k;
    public Rect f27026m;
    public float f27027n;
    public final long f27030q;
    public final ArrayList f27021g = new ArrayList();
    public int h = 0;
    public final Path f27025l = new Path();
    public long f27028o = -1;
    public long f27029p = -1;
    public final boolean f27031r = !LiteMode.isEnabled(360928);

    public o90(CharacterStyle characterStyle, org.telegram.ui.ActionBar.f6 f6Var, float f7, float f10, int i10) {
        this.f27022i = characterStyle;
        d(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, f6Var));
        this.f27023j = f7;
        this.f27024k = f10;
        this.f27030q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        float f7;
        boolean z12;
        boolean z13;
        float min;
        boolean z14 = this.f27031r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f27017a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f27019c == null) {
            Paint paint = new Paint(1);
            this.f27019c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f27019c.setColor(this.f27018b);
            this.e = Color.alpha(this.f27018b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f27018b);
            this.f27020f = Color.alpha(this.f27018b);
        }
        if (z10) {
            this.f27017a = dp;
            if (dp <= 0) {
                this.f27019c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f27019c.setPathEffect(new CornerPathEffect(this.f27017a));
                this.d.setPathEffect(new CornerPathEffect(this.f27017a));
            }
        }
        Rect rect = this.f27026m;
        float f10 = this.f27024k;
        float f11 = this.f27023j;
        ArrayList arrayList = this.f27021g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((h90) arrayList.get(0)).computeBounds(rectF, false);
            this.f27026m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((h90) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f27026m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f27026m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f27026m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f27026m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = z14;
            z12 = false;
            f7 = f11;
            z13 = true;
            this.f27027n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f27026m.top - f10, 2.0d) + Math.pow(this.f27026m.left - f11, 2.0d), Math.pow(this.f27026m.top - f10, 2.0d) + Math.pow(this.f27026m.right - f11, 2.0d)), Math.max(Math.pow(this.f27026m.bottom - f10, 2.0d) + Math.pow(this.f27026m.left - f11, 2.0d), Math.pow(this.f27026m.bottom - f10, 2.0d) + Math.pow(this.f27026m.right - f11, 2.0d))));
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
            if (this.f27028o < 0) {
                this.f27028o = elapsedRealtime;
            }
            float interpolation = qr.f27653f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f27028o)) / ((float) this.f27030q)));
            long j3 = this.f27029p;
            if (j3 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j3)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f27019c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * f12));
            this.f27019c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = 0; i12 < this.h; i12++) {
                ((h90) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f27019c);
            }
            this.d.setAlpha((int) (this.f27020f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f27027n;
                canvas.save();
                Path path = this.f27025l;
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
            if (i13 < 0 || this.f27029p >= 0) {
                return z13;
            }
        }
        return z12;
    }

    public final h90 b() {
        h90 h90Var;
        ArrayList arrayList = f27016s;
        if (!arrayList.isEmpty()) {
            h90Var = (h90) arrayList.remove(0);
        } else {
            h90Var = new h90(0);
        }
        h90Var.f28879c = !this.f27031r;
        h90Var.reset();
        ArrayList arrayList2 = this.f27021g;
        arrayList2.add(h90Var);
        this.h = arrayList2.size();
        return h90Var;
    }

    public final void c() {
        ArrayList arrayList = this.f27021g;
        if (arrayList.isEmpty()) {
            return;
        }
        f27016s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f27018b = i10;
        Paint paint = this.f27019c;
        if (paint != null) {
            paint.setColor(i10);
            this.e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f27020f = Color.alpha(i10);
        }
    }
}
