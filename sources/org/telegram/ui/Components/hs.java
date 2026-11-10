package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
public abstract class hs implements org.telegram.messenger.ls {
    public static km L;
    public final org.telegram.messenger.q5 D;
    public boolean E;
    public boolean G;
    public boolean I;
    public int J;
    public final int K;
    public boolean f34442a;
    public Bitmap f34443b;
    public Canvas f34444c;
    public Bitmap d;
    public Canvas f34445e;
    public boolean f34446f;
    public int f34447n;
    public boolean f34448r;
    public int f34450w;
    public int f34451x;
    public int f34452y;
    public int h = 1;
    public final Paint f34449s = new Paint(1);
    public final gs F = new gs(this, 0);
    public final gs H = new gs(this, 1);

    public hs() {
        if (L == null) {
            ?? obj = new Object();
            obj.f35368b = new org.telegram.messenger.q5[2];
            L = obj;
        }
        km kmVar = L;
        int i7 = kmVar.f35367a + 1;
        kmVar.f35367a = i7;
        if (i7 > 1) {
            kmVar.f35367a = 0;
        }
        org.telegram.messenger.q5[] q5VarArr = (org.telegram.messenger.q5[]) kmVar.f35368b;
        int i10 = kmVar.f35367a;
        org.telegram.messenger.q5 q5Var = q5VarArr[i10];
        if (q5Var == null) {
            q5Var = new org.telegram.messenger.q5("draw_background_queue_" + kmVar.f35367a, true);
            q5VarArr[i10] = q5Var;
        }
        this.D = q5Var;
        this.K = L.f35367a;
    }

    public void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        if (this.E) {
            boolean z9 = org.telegram.messenger.r2.f25216a;
            return;
        }
        this.f34451x = i10;
        this.f34452y = i7;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f34445e;
            this.d = this.f34443b;
            this.f34445e = this.f34444c;
            this.f34443b = bitmap;
            this.f34444c = canvas2;
        }
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null || this.I) {
            this.I = false;
            if (bitmap2 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.d);
                org.telegram.messenger.g0.A2(arrayList);
                this.d = null;
            }
            int i11 = this.f34451x + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i11 && this.d.getWidth() == this.f34452y) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f34452y, i11, Bitmap.Config.ARGB_8888);
                this.f34445e = new Canvas(this.d);
            }
            this.f34445e.save();
            this.f34445e.translate(0.0f, 0);
            d(this.f34445e, f10);
            this.f34445e.restore();
        }
        if (!this.f34446f && !this.f34448r) {
            this.f34446f = true;
            i(j3);
            this.J = this.f34450w;
            this.D.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f34449s;
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
        if (i7 == org.telegram.messenger.qs.f25025j1) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || org.telegram.messenger.iz.o() < 2) {
                    int intValue = num.intValue() | this.f34447n;
                    this.f34447n = intValue;
                    if (intValue != 0 && !this.f34448r) {
                        this.f34448r = true;
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25030k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i11 = this.f34447n) != 0) {
                int i12 = (~num2.intValue()) & i11;
                this.f34447n = i12;
                if (i12 == 0 && this.f34448r) {
                    this.f34448r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f34442a) {
            return;
        }
        this.f34442a = true;
        this.E = false;
        int i7 = org.telegram.messenger.qs.e().f25141p & (~this.h);
        this.f34447n = i7;
        if (i7 == 0 && this.f34448r) {
            this.f34448r = false;
        }
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25025j1);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25030k1);
    }

    public final void f() {
        if (!this.f34442a) {
            return;
        }
        if (!this.f34446f) {
            j();
        }
        this.f34442a = false;
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25025j1);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25030k1);
    }

    public abstract void g();

    public abstract void i(long j3);

    public final void j() {
        ArrayList arrayList = new ArrayList();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            arrayList.add(bitmap);
        }
        Bitmap bitmap2 = this.f34443b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f34443b = null;
        this.f34444c = null;
        this.f34445e = null;
        org.telegram.messenger.g0.A2(arrayList);
    }

    public final void k() {
        this.I = true;
        this.f34450w++;
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.d);
            this.d = null;
            org.telegram.messenger.g0.A2(arrayList);
        }
    }

    public final void l(int i7) {
        this.h = 7;
        if (this.f34442a) {
            this.f34447n = org.telegram.messenger.qs.e().f25141p & (~this.h);
        }
    }

    public void h() {
    }
}
