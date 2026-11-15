package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
public abstract class os implements org.telegram.messenger.is {
    public static tm M;
    public final org.telegram.messenger.q5 E;
    public boolean F;
    public boolean H;
    public boolean J;
    public int K;
    public final int L;
    public boolean f38054a;
    public Bitmap f38055b;
    public Canvas f38056c;
    public Bitmap d;
    public Canvas f38057e;
    public boolean f38058f;
    public int f38059n;
    public boolean f38060r;
    public int f38062w;
    public int f38063x;
    public int f38064y;
    public int h = 1;
    public final Paint f38061s = new Paint(1);
    public final ns G = new ns(this, 0);
    public final ns I = new ns(this, 1);

    public os() {
        if (M == null) {
            ?? obj = new Object();
            obj.f39724b = new org.telegram.messenger.q5[2];
            M = obj;
        }
        tm tmVar = M;
        int i7 = tmVar.f39723a + 1;
        tmVar.f39723a = i7;
        if (i7 > 1) {
            tmVar.f39723a = 0;
        }
        org.telegram.messenger.q5[] q5VarArr = (org.telegram.messenger.q5[]) tmVar.f39724b;
        int i10 = tmVar.f39723a;
        org.telegram.messenger.q5 q5Var = q5VarArr[i10];
        if (q5Var == null) {
            q5Var = new org.telegram.messenger.q5("draw_background_queue_" + tmVar.f39723a, true);
            q5VarArr[i10] = q5Var;
        }
        this.E = q5Var;
        this.L = M.f39723a;
    }

    public void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        if (this.F) {
            boolean z10 = org.telegram.messenger.r2.f26198a;
            return;
        }
        this.f38063x = i10;
        this.f38064y = i7;
        if (this.H) {
            this.H = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f38057e;
            this.d = this.f38055b;
            this.f38057e = this.f38056c;
            this.f38055b = bitmap;
            this.f38056c = canvas2;
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
            int i11 = this.f38063x + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i11 && this.d.getWidth() == this.f38064y) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f38064y, i11, Bitmap.Config.ARGB_8888);
                this.f38057e = new Canvas(this.d);
            }
            this.f38057e.save();
            this.f38057e.translate(0.0f, 0);
            d(this.f38057e, f10);
            this.f38057e.restore();
        }
        if (!this.f38058f && !this.f38060r) {
            this.f38058f = true;
            i(j3);
            this.K = this.f38062w;
            this.E.postRunnable(this.G);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f38061s;
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
        if (i7 == org.telegram.messenger.ns.f25517j1) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || org.telegram.messenger.gz.o() < 2) {
                    int intValue = num.intValue() | this.f38059n;
                    this.f38059n = intValue;
                    if (intValue != 0 && !this.f38060r) {
                        this.f38060r = true;
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ns.f25522k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i11 = this.f38059n) != 0) {
                int i12 = (~num2.intValue()) & i11;
                this.f38059n = i12;
                if (i12 == 0 && this.f38060r) {
                    this.f38060r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f38054a) {
            return;
        }
        this.f38054a = true;
        this.F = false;
        int i7 = org.telegram.messenger.ns.e().f25633p & (~this.h);
        this.f38059n = i7;
        if (i7 == 0 && this.f38060r) {
            this.f38060r = false;
        }
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25517j1);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25522k1);
    }

    public final void f() {
        if (!this.f38054a) {
            return;
        }
        if (!this.f38058f) {
            j();
        }
        this.f38054a = false;
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25517j1);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25522k1);
    }

    public abstract void g();

    public abstract void i(long j3);

    public final void j() {
        ArrayList arrayList = new ArrayList();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            arrayList.add(bitmap);
        }
        Bitmap bitmap2 = this.f38055b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f38055b = null;
        this.f38056c = null;
        this.f38057e = null;
        org.telegram.messenger.g0.A2(arrayList);
    }

    public final void k() {
        this.J = true;
        this.f38062w++;
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.d);
            this.d = null;
            org.telegram.messenger.g0.A2(arrayList);
        }
    }

    public final void l(int i7) {
        this.h = 7;
        if (this.f38054a) {
            this.f38059n = org.telegram.messenger.ns.e().f25633p & (~this.h);
        }
    }

    public void h() {
    }
}
