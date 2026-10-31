package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
public abstract class ts implements org.telegram.messenger.us {
    public static tm L;
    public final org.telegram.messenger.s5 D;
    public boolean E;
    public boolean G;
    public boolean I;
    public int J;
    public final int K;
    public boolean f30678a;
    public Bitmap f30679b;
    public Canvas f30680c;
    public Bitmap d;
    public Canvas e;
    public boolean f30681f;
    public int f30682n;
    public boolean f30683r;
    public int f30685w;
    public int f30686x;
    public int f30687y;
    public int h = 1;
    public final Paint f30684s = new Paint(1);
    public final ss F = new ss(this, 0);
    public final ss H = new ss(this, 1);

    public ts() {
        if (L == null) {
            ?? obj = new Object();
            obj.f30655b = new org.telegram.messenger.s5[2];
            L = obj;
        }
        tm tmVar = L;
        int i10 = tmVar.f30654a + 1;
        tmVar.f30654a = i10;
        if (i10 > 1) {
            tmVar.f30654a = 0;
        }
        org.telegram.messenger.s5[] s5VarArr = (org.telegram.messenger.s5[]) tmVar.f30655b;
        int i11 = tmVar.f30654a;
        org.telegram.messenger.s5 s5Var = s5VarArr[i11];
        if (s5Var == null) {
            s5Var = new org.telegram.messenger.s5("draw_background_queue_" + tmVar.f30654a, true);
            s5VarArr[i11] = s5Var;
        }
        this.D = s5Var;
        this.K = L.f30654a;
    }

    public void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        if (this.E) {
            boolean z10 = org.telegram.messenger.v2.f18448a;
            return;
        }
        this.f30686x = i11;
        this.f30687y = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.f30679b;
            this.e = this.f30680c;
            this.f30679b = bitmap;
            this.f30680c = canvas2;
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
            int i12 = this.f30686x + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f30687y) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f30687y, i12, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f7);
            this.e.restore();
        }
        if (!this.f30681f && !this.f30683r) {
            this.f30681f = true;
            i(j10);
            this.J = this.f30685w;
            this.D.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f30684s;
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
        if (i10 == org.telegram.messenger.zs.f19633j1) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || org.telegram.messenger.tz.o() < 2) {
                    int intValue = num.intValue() | this.f30682n;
                    this.f30682n = intValue;
                    if (intValue != 0 && !this.f30683r) {
                        this.f30683r = true;
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.zs.f19639k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f30682n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f30682n = i13;
                if (i13 == 0 && this.f30683r) {
                    this.f30683r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f30678a) {
            return;
        }
        this.f30678a = true;
        this.E = false;
        int i10 = org.telegram.messenger.zs.e().f19749p & (~this.h);
        this.f30682n = i10;
        if (i10 == 0 && this.f30683r) {
            this.f30683r = false;
        }
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19633j1);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19639k1);
    }

    public final void f() {
        if (!this.f30678a) {
            return;
        }
        if (!this.f30681f) {
            j();
        }
        this.f30678a = false;
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19633j1);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19639k1);
    }

    public abstract void g();

    public abstract void i(long j10);

    public final void j() {
        ArrayList arrayList = new ArrayList();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            arrayList.add(bitmap);
        }
        Bitmap bitmap2 = this.f30679b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f30679b = null;
        this.f30680c = null;
        this.e = null;
        org.telegram.messenger.i0.A2(arrayList);
    }

    public final void k() {
        this.I = true;
        this.f30685w++;
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.d);
            this.d = null;
            org.telegram.messenger.i0.A2(arrayList);
        }
    }

    public final void l(int i10) {
        this.h = 7;
        if (this.f30678a) {
            this.f30682n = org.telegram.messenger.zs.e().f19749p & (~this.h);
        }
    }

    public void h() {
    }
}
