package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
public abstract class is implements org.telegram.messenger.ls {
    public static lm L;
    public final org.telegram.messenger.q5 D;
    public boolean E;
    public boolean G;
    public boolean I;
    public int J;
    public final int K;
    public boolean f34758a;
    public Bitmap f34759b;
    public Canvas f34760c;
    public Bitmap d;
    public Canvas f34761e;
    public boolean f34762f;
    public int f34763n;
    public boolean f34764r;
    public int f34766w;
    public int f34767x;
    public int f34768y;
    public int h = 1;
    public final Paint f34765s = new Paint(1);
    public final hs F = new hs(this, 0);
    public final hs H = new hs(this, 1);

    public is() {
        if (L == null) {
            ?? obj = new Object();
            obj.f35701b = new org.telegram.messenger.q5[2];
            L = obj;
        }
        lm lmVar = L;
        int i7 = lmVar.f35700a + 1;
        lmVar.f35700a = i7;
        if (i7 > 1) {
            lmVar.f35700a = 0;
        }
        org.telegram.messenger.q5[] q5VarArr = (org.telegram.messenger.q5[]) lmVar.f35701b;
        int i10 = lmVar.f35700a;
        org.telegram.messenger.q5 q5Var = q5VarArr[i10];
        if (q5Var == null) {
            q5Var = new org.telegram.messenger.q5("draw_background_queue_" + lmVar.f35700a, true);
            q5VarArr[i10] = q5Var;
        }
        this.D = q5Var;
        this.K = L.f35700a;
    }

    public void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        if (this.E) {
            boolean z9 = org.telegram.messenger.r2.f25199a;
            return;
        }
        this.f34767x = i10;
        this.f34768y = i7;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f34761e;
            this.d = this.f34759b;
            this.f34761e = this.f34760c;
            this.f34759b = bitmap;
            this.f34760c = canvas2;
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
            int i11 = this.f34767x + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i11 && this.d.getWidth() == this.f34768y) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f34768y, i11, Bitmap.Config.ARGB_8888);
                this.f34761e = new Canvas(this.d);
            }
            this.f34761e.save();
            this.f34761e.translate(0.0f, 0);
            d(this.f34761e, f10);
            this.f34761e.restore();
        }
        if (!this.f34762f && !this.f34764r) {
            this.f34762f = true;
            i(j3);
            this.J = this.f34766w;
            this.D.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f34765s;
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
        if (i7 == org.telegram.messenger.qs.f25012j1) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || org.telegram.messenger.iz.o() < 2) {
                    int intValue = num.intValue() | this.f34763n;
                    this.f34763n = intValue;
                    if (intValue != 0 && !this.f34764r) {
                        this.f34764r = true;
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25017k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i11 = this.f34763n) != 0) {
                int i12 = (~num2.intValue()) & i11;
                this.f34763n = i12;
                if (i12 == 0 && this.f34764r) {
                    this.f34764r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f34758a) {
            return;
        }
        this.f34758a = true;
        this.E = false;
        int i7 = org.telegram.messenger.qs.e().f25128p & (~this.h);
        this.f34763n = i7;
        if (i7 == 0 && this.f34764r) {
            this.f34764r = false;
        }
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25012j1);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25017k1);
    }

    public final void f() {
        if (!this.f34758a) {
            return;
        }
        if (!this.f34762f) {
            j();
        }
        this.f34758a = false;
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25012j1);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25017k1);
    }

    public abstract void g();

    public abstract void i(long j3);

    public final void j() {
        ArrayList arrayList = new ArrayList();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            arrayList.add(bitmap);
        }
        Bitmap bitmap2 = this.f34759b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f34759b = null;
        this.f34760c = null;
        this.f34761e = null;
        org.telegram.messenger.g0.A2(arrayList);
    }

    public final void k() {
        this.I = true;
        this.f34766w++;
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.d);
            this.d = null;
            org.telegram.messenger.g0.A2(arrayList);
        }
    }

    public final void l(int i7) {
        this.h = 7;
        if (this.f34758a) {
            this.f34763n = org.telegram.messenger.qs.e().f25128p & (~this.h);
        }
    }

    public void h() {
    }
}
