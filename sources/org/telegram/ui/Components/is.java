package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
public abstract class is implements org.telegram.messenger.cs {
    public static km M;
    public final org.telegram.messenger.q5 E;
    public boolean F;
    public boolean H;
    public boolean J;
    public int K;
    public final int L;
    public boolean f34805a;
    public Bitmap f34806b;
    public Canvas f34807c;
    public Bitmap d;
    public Canvas f34808e;
    public boolean f34809f;
    public int f34810n;
    public boolean f34811r;
    public int f34813w;
    public int f34814x;
    public int f34815y;
    public int h = 1;
    public final Paint f34812s = new Paint(1);
    public final hs G = new hs(this, 0);
    public final hs I = new hs(this, 1);

    public is() {
        if (M == null) {
            ?? obj = new Object();
            obj.f35437b = new org.telegram.messenger.q5[2];
            M = obj;
        }
        km kmVar = M;
        int i3 = kmVar.f35436a + 1;
        kmVar.f35436a = i3;
        if (i3 > 1) {
            kmVar.f35436a = 0;
        }
        org.telegram.messenger.q5[] q5VarArr = (org.telegram.messenger.q5[]) kmVar.f35437b;
        int i10 = kmVar.f35436a;
        org.telegram.messenger.q5 q5Var = q5VarArr[i10];
        if (q5Var == null) {
            q5Var = new org.telegram.messenger.q5("draw_background_queue_" + kmVar.f35436a, true);
            q5VarArr[i10] = q5Var;
        }
        this.E = q5Var;
        this.L = M.f35436a;
    }

    public void a(Canvas canvas, long j10, int i3, int i10, float f10) {
        if (this.F) {
            boolean z10 = org.telegram.messenger.r2.f25040a;
            return;
        }
        this.f34814x = i10;
        this.f34815y = i3;
        if (this.H) {
            this.H = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f34808e;
            this.d = this.f34806b;
            this.f34808e = this.f34807c;
            this.f34806b = bitmap;
            this.f34807c = canvas2;
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
            int i11 = this.f34814x + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i11 && this.d.getWidth() == this.f34815y) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f34815y, i11, Bitmap.Config.ARGB_8888);
                this.f34808e = new Canvas(this.d);
            }
            this.f34808e.save();
            this.f34808e.translate(0.0f, 0);
            d(this.f34808e, f10);
            this.f34808e.restore();
        }
        if (!this.f34809f && !this.f34811r) {
            this.f34809f = true;
            i(j10);
            this.K = this.f34813w;
            this.E.postRunnable(this.G);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f34812s;
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
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11;
        if (i3 == org.telegram.messenger.hs.f23249j1) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || org.telegram.messenger.az.o() < 2) {
                    int intValue = num.intValue() | this.f34810n;
                    this.f34810n = intValue;
                    if (intValue != 0 && !this.f34811r) {
                        this.f34811r = true;
                    }
                }
            }
        } else if (i3 == org.telegram.messenger.hs.k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i11 = this.f34810n) != 0) {
                int i12 = (~num2.intValue()) & i11;
                this.f34810n = i12;
                if (i12 == 0 && this.f34811r) {
                    this.f34811r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f34805a) {
            return;
        }
        this.f34805a = true;
        this.F = false;
        int i3 = org.telegram.messenger.hs.e().f23366p & (~this.h);
        this.f34810n = i3;
        if (i3 == 0 && this.f34811r) {
            this.f34811r = false;
        }
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23249j1);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.k1);
    }

    public final void f() {
        if (!this.f34805a) {
            return;
        }
        if (!this.f34809f) {
            j();
        }
        this.f34805a = false;
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23249j1);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.k1);
    }

    public abstract void g();

    public abstract void i(long j10);

    public final void j() {
        ArrayList arrayList = new ArrayList();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            arrayList.add(bitmap);
        }
        Bitmap bitmap2 = this.f34806b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f34806b = null;
        this.f34807c = null;
        this.f34808e = null;
        org.telegram.messenger.g0.A2(arrayList);
    }

    public final void k() {
        this.J = true;
        this.f34813w++;
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.d);
            this.d = null;
            org.telegram.messenger.g0.A2(arrayList);
        }
    }

    public final void l(int i3) {
        this.h = 7;
        if (this.f34805a) {
            this.f34810n = org.telegram.messenger.hs.e().f23366p & (~this.h);
        }
    }

    public void h() {
    }
}
