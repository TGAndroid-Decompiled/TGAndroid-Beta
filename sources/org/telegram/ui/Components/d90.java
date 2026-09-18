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
public final class d90 {
    public static final ArrayList f23237s = new ArrayList();
    public int f23238a;
    public int f23239b;
    public Paint f23240c;
    public Paint d;
    public int e;
    public int f23241f;
    public final CharacterStyle f23243i;
    public final float f23244j;
    public final float f23245k;
    public Rect f23247m;
    public float f23248n;
    public final long f23251q;
    public final ArrayList f23242g = new ArrayList();
    public int h = 0;
    public final Path f23246l = new Path();
    public long f23249o = -1;
    public long f23250p = -1;
    public final boolean f23252r = !LiteMode.isEnabled(360928);

    public d90(CharacterStyle characterStyle, org.telegram.ui.ActionBar.f6 f6Var, float f7, float f10, int i10) {
        this.f23243i = characterStyle;
        d(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, f6Var));
        this.f23244j = f7;
        this.f23245k = f10;
        this.f23251q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int dp;
        boolean z10;
        boolean z11;
        float f7;
        boolean z12;
        boolean z13;
        float min;
        boolean z14 = this.f23252r;
        if (z14) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        if (this.f23238a != dp) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f23240c == null) {
            Paint paint = new Paint(1);
            this.f23240c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f23240c.setColor(this.f23239b);
            this.e = Color.alpha(this.f23239b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.f23239b);
            this.f23241f = Color.alpha(this.f23239b);
        }
        if (z10) {
            this.f23238a = dp;
            if (dp <= 0) {
                this.f23240c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.f23240c.setPathEffect(new CornerPathEffect(this.f23238a));
                this.d.setPathEffect(new CornerPathEffect(this.f23238a));
            }
        }
        Rect rect = this.f23247m;
        float f10 = this.f23245k;
        float f11 = this.f23244j;
        ArrayList arrayList = this.f23242g;
        if (rect == null && this.h > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            ((w80) arrayList.get(0)).computeBounds(rectF, false);
            this.f23247m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i10 = 1; i10 < this.h; i10++) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                ((w80) arrayList.get(i10)).computeBounds(rectF2, false);
                Rect rect2 = this.f23247m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.f23247m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.f23247m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.f23247m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z11 = z14;
            z12 = false;
            f7 = f11;
            z13 = true;
            this.f23248n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.f23247m.top - f10, 2.0d) + Math.pow(this.f23247m.left - f11, 2.0d), Math.pow(this.f23247m.top - f10, 2.0d) + Math.pow(this.f23247m.right - f11, 2.0d)), Math.max(Math.pow(this.f23247m.bottom - f10, 2.0d) + Math.pow(this.f23247m.left - f11, 2.0d), Math.pow(this.f23247m.bottom - f10, 2.0d) + Math.pow(this.f23247m.right - f11, 2.0d))));
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
            if (this.f23249o < 0) {
                this.f23249o = elapsedRealtime;
            }
            float interpolation = qr.f27383f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - this.f23249o)) / ((float) this.f23251q)));
            long j3 = this.f23250p;
            if (j3 < 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j3)) / 100.0f));
            }
            float f12 = 1.0f - min;
            this.f23240c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * f12));
            this.f23240c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i12 = 0; i12 < this.h; i12++) {
                ((w80) arrayList.get(i12)).a();
                canvas.drawPath((Path) arrayList.get(i12), this.f23240c);
            }
            this.d.setAlpha((int) (this.f23241f * 0.8f * f12));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            int i13 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
            if (i13 < 0) {
                float f13 = interpolation * this.f23248n;
                canvas.save();
                Path path = this.f23246l;
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
            if (i13 < 0 || this.f23250p >= 0) {
                return z13;
            }
        }
        return z12;
    }

    public final w80 b() {
        w80 w80Var;
        ArrayList arrayList = f23237s;
        if (!arrayList.isEmpty()) {
            w80Var = (w80) arrayList.remove(0);
        } else {
            w80Var = new w80(0);
        }
        w80Var.f28468c = !this.f23252r;
        w80Var.reset();
        ArrayList arrayList2 = this.f23242g;
        arrayList2.add(w80Var);
        this.h = arrayList2.size();
        return w80Var;
    }

    public final void c() {
        ArrayList arrayList = this.f23242g;
        if (arrayList.isEmpty()) {
            return;
        }
        f23237s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i10) {
        this.f23239b = i10;
        Paint paint = this.f23240c;
        if (paint != null) {
            paint.setColor(i10);
            this.e = Color.alpha(i10);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i10);
            this.f23241f = Color.alpha(i10);
        }
    }
}
