package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
public abstract class ts implements org.telegram.messenger.vs {
    public static tm L;
    public final org.telegram.messenger.s5 D;
    public boolean E;
    public boolean G;
    public boolean I;
    public int J;
    public final int K;
    public boolean f30705a;
    public Bitmap f30706b;
    public Canvas f30707c;
    public Bitmap d;
    public Canvas e;
    public boolean f30708f;
    public int f30709n;
    public boolean f30710r;
    public int f30712w;
    public int f30713x;
    public int f30714y;
    public int h = 1;
    public final Paint f30711s = new Paint(1);
    public final ss F = new ss(this, 0);
    public final ss H = new ss(this, 1);

    public ts() {
        if (L == null) {
            ?? obj = new Object();
            obj.f30679b = new org.telegram.messenger.s5[2];
            L = obj;
        }
        tm tmVar = L;
        int i10 = tmVar.f30678a + 1;
        tmVar.f30678a = i10;
        if (i10 > 1) {
            tmVar.f30678a = 0;
        }
        org.telegram.messenger.s5[] s5VarArr = (org.telegram.messenger.s5[]) tmVar.f30679b;
        int i11 = tmVar.f30678a;
        org.telegram.messenger.s5 s5Var = s5VarArr[i11];
        if (s5Var == null) {
            s5Var = new org.telegram.messenger.s5("draw_background_queue_" + tmVar.f30678a, true);
            s5VarArr[i11] = s5Var;
        }
        this.D = s5Var;
        this.K = L.f30678a;
    }

    public void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        if (this.E) {
            boolean z10 = org.telegram.messenger.v2.f18578a;
            return;
        }
        this.f30713x = i11;
        this.f30714y = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.f30706b;
            this.e = this.f30707c;
            this.f30706b = bitmap;
            this.f30707c = canvas2;
        }
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null || this.I) {
            this.I = false;
            if (bitmap2 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.d);
                org.telegram.messenger.i0.A2(arrayList);
                this.d = null;
            }
            int i12 = this.f30713x + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f30714y) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f30714y, i12, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f7);
            this.e.restore();
        }
        if (!this.f30708f && !this.f30710r) {
            this.f30708f = true;
            i(j10);
            this.J = this.f30712w;
            this.D.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f30711s;
            paint.setAlpha((int) (f7 * 255.0f));
            canvas.save();
            canvas.translate(0.0f, -0);
            b(canvas, bitmap4, paint);
            canvas.restore();
        }
    }

    public void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    public abstract void c(Canvas canvas);

    public abstract void d(Canvas canvas, float f7);

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == org.telegram.messenger.at.f14729j1) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || org.telegram.messenger.uz.o() < 2) {
                    int intValue = num.intValue() | this.f30709n;
                    this.f30709n = intValue;
                    if (intValue != 0 && !this.f30710r) {
                        this.f30710r = true;
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.at.f14735k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f30709n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f30709n = i13;
                if (i13 == 0 && this.f30710r) {
                    this.f30710r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f30705a) {
            return;
        }
        this.f30705a = true;
        this.E = false;
        int i10 = org.telegram.messenger.at.e().f14845p & (~this.h);
        this.f30709n = i10;
        if (i10 == 0 && this.f30710r) {
            this.f30710r = false;
        }
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14729j1);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14735k1);
    }

    public final void f() {
        if (!this.f30705a) {
            return;
        }
        if (!this.f30708f) {
            j();
        }
        this.f30705a = false;
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14729j1);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14735k1);
    }

    public abstract void g();

    public abstract void i(long j10);

    public final void j() {
        ArrayList arrayList = new ArrayList();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            arrayList.add(bitmap);
        }
        Bitmap bitmap2 = this.f30706b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f30706b = null;
        this.f30707c = null;
        this.e = null;
        org.telegram.messenger.i0.A2(arrayList);
    }

    public final void k() {
        this.I = true;
        this.f30712w++;
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.d);
            this.d = null;
            org.telegram.messenger.i0.A2(arrayList);
        }
    }

    public final void l(int i10) {
        this.h = 7;
        if (this.f30705a) {
            this.f30709n = org.telegram.messenger.at.e().f14845p & (~this.h);
        }
    }

    public void h() {
    }
}
