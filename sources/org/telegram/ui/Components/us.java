package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
public abstract class us implements org.telegram.messenger.fs {
    public static an M;
    public final org.telegram.messenger.r5 E;
    public boolean F;
    public boolean H;
    public boolean J;
    public int K;
    public final int L;
    public boolean f40448a;
    public Bitmap f40449b;
    public Canvas f40450c;
    public Bitmap d;
    public Canvas f40451e;
    public boolean f40452f;
    public int f40453n;
    public boolean f40454r;
    public int f40456w;
    public int f40457x;
    public int f40458y;
    public int h = 1;
    public final Paint f40455s = new Paint(1);
    public final ts G = new ts(this, 0);
    public final ts I = new ts(this, 1);

    public us() {
        if (M == null) {
            ?? obj = new Object();
            obj.f33498b = new org.telegram.messenger.r5[2];
            M = obj;
        }
        an anVar = M;
        int i7 = anVar.f33497a + 1;
        anVar.f33497a = i7;
        if (i7 > 1) {
            anVar.f33497a = 0;
        }
        org.telegram.messenger.r5[] r5VarArr = (org.telegram.messenger.r5[]) anVar.f33498b;
        int i10 = anVar.f33497a;
        org.telegram.messenger.r5 r5Var = r5VarArr[i10];
        if (r5Var == null) {
            r5Var = new org.telegram.messenger.r5("draw_background_queue_" + anVar.f33497a, true);
            r5VarArr[i10] = r5Var;
        }
        this.E = r5Var;
        this.L = M.f33497a;
    }

    public void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        if (this.F) {
            boolean z10 = org.telegram.messenger.s2.f26829a;
            return;
        }
        this.f40457x = i10;
        this.f40458y = i7;
        if (this.H) {
            this.H = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f40451e;
            this.d = this.f40449b;
            this.f40451e = this.f40450c;
            this.f40449b = bitmap;
            this.f40450c = canvas2;
        }
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null || this.J) {
            this.J = false;
            if (bitmap2 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.d);
                org.telegram.messenger.g0.A2(arrayList);
                this.d = null;
            }
            int i11 = this.f40457x + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i11 && this.d.getWidth() == this.f40458y) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f40458y, i11, Bitmap.Config.ARGB_8888);
                this.f40451e = new Canvas(this.d);
            }
            this.f40451e.save();
            this.f40451e.translate(0.0f, 0);
            d(this.f40451e, f10);
            this.f40451e.restore();
        }
        if (!this.f40452f && !this.f40454r) {
            this.f40452f = true;
            i(j3);
            this.K = this.f40456w;
            this.E.postRunnable(this.G);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f40455s;
            paint.setAlpha((int) (f10 * 255.0f));
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

    public abstract void d(Canvas canvas, float f10);

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        if (i7 == org.telegram.messenger.ks.f25234j1) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || org.telegram.messenger.bz.o() < 2) {
                    int intValue = num.intValue() | this.f40453n;
                    this.f40453n = intValue;
                    if (intValue != 0 && !this.f40454r) {
                        this.f40454r = true;
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25239k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i11 = this.f40453n) != 0) {
                int i12 = (~num2.intValue()) & i11;
                this.f40453n = i12;
                if (i12 == 0 && this.f40454r) {
                    this.f40454r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f40448a) {
            return;
        }
        this.f40448a = true;
        this.F = false;
        int i7 = org.telegram.messenger.ks.e().f25350p & (~this.h);
        this.f40453n = i7;
        if (i7 == 0 && this.f40454r) {
            this.f40454r = false;
        }
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25234j1);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25239k1);
    }

    public final void f() {
        if (!this.f40448a) {
            return;
        }
        if (!this.f40452f) {
            j();
        }
        this.f40448a = false;
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25234j1);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25239k1);
    }

    public abstract void g();

    public abstract void i(long j3);

    public final void j() {
        ArrayList arrayList = new ArrayList();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            arrayList.add(bitmap);
        }
        Bitmap bitmap2 = this.f40449b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f40449b = null;
        this.f40450c = null;
        this.f40451e = null;
        org.telegram.messenger.g0.A2(arrayList);
    }

    public final void k() {
        this.J = true;
        this.f40456w++;
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.d);
            this.d = null;
            org.telegram.messenger.g0.A2(arrayList);
        }
    }

    public final void l(int i7) {
        this.h = 7;
        if (this.f40448a) {
            this.f40453n = org.telegram.messenger.ks.e().f25350p & (~this.h);
        }
    }

    public void h() {
    }
}
