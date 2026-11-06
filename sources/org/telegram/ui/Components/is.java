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
    public boolean f34728a;
    public Bitmap f34729b;
    public Canvas f34730c;
    public Bitmap d;
    public Canvas f34731e;
    public boolean f34732f;
    public int f34733n;
    public boolean f34734r;
    public int f34736w;
    public int f34737x;
    public int f34738y;
    public int h = 1;
    public final Paint f34735s = new Paint(1);
    public final hs F = new hs(this, 0);
    public final hs H = new hs(this, 1);

    public is() {
        if (L == null) {
            ?? obj = new Object();
            obj.f35681b = new org.telegram.messenger.q5[2];
            L = obj;
        }
        lm lmVar = L;
        int i7 = lmVar.f35680a + 1;
        lmVar.f35680a = i7;
        if (i7 > 1) {
            lmVar.f35680a = 0;
        }
        org.telegram.messenger.q5[] q5VarArr = (org.telegram.messenger.q5[]) lmVar.f35681b;
        int i10 = lmVar.f35680a;
        org.telegram.messenger.q5 q5Var = q5VarArr[i10];
        if (q5Var == null) {
            q5Var = new org.telegram.messenger.q5("draw_background_queue_" + lmVar.f35680a, true);
            q5VarArr[i10] = q5Var;
        }
        this.D = q5Var;
        this.K = L.f35680a;
    }

    public void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        if (this.E) {
            boolean z9 = org.telegram.messenger.r2.f25191a;
            return;
        }
        this.f34737x = i10;
        this.f34738y = i7;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f34731e;
            this.d = this.f34729b;
            this.f34731e = this.f34730c;
            this.f34729b = bitmap;
            this.f34730c = canvas2;
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
            int i11 = this.f34737x + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i11 && this.d.getWidth() == this.f34738y) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f34738y, i11, Bitmap.Config.ARGB_8888);
                this.f34731e = new Canvas(this.d);
            }
            this.f34731e.save();
            this.f34731e.translate(0.0f, 0);
            d(this.f34731e, f10);
            this.f34731e.restore();
        }
        if (!this.f34732f && !this.f34734r) {
            this.f34732f = true;
            i(j3);
            this.J = this.f34736w;
            this.D.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f34735s;
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
        if (i7 == org.telegram.messenger.qs.f25004j1) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || org.telegram.messenger.iz.o() < 2) {
                    int intValue = num.intValue() | this.f34733n;
                    this.f34733n = intValue;
                    if (intValue != 0 && !this.f34734r) {
                        this.f34734r = true;
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25009k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i11 = this.f34733n) != 0) {
                int i12 = (~num2.intValue()) & i11;
                this.f34733n = i12;
                if (i12 == 0 && this.f34734r) {
                    this.f34734r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f34728a) {
            return;
        }
        this.f34728a = true;
        this.E = false;
        int i7 = org.telegram.messenger.qs.e().f25120p & (~this.h);
        this.f34733n = i7;
        if (i7 == 0 && this.f34734r) {
            this.f34734r = false;
        }
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25004j1);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25009k1);
    }

    public final void f() {
        if (!this.f34728a) {
            return;
        }
        if (!this.f34732f) {
            j();
        }
        this.f34728a = false;
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25004j1);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25009k1);
    }

    public abstract void g();

    public abstract void i(long j3);

    public final void j() {
        ArrayList arrayList = new ArrayList();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            arrayList.add(bitmap);
        }
        Bitmap bitmap2 = this.f34729b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f34729b = null;
        this.f34730c = null;
        this.f34731e = null;
        org.telegram.messenger.g0.A2(arrayList);
    }

    public final void k() {
        this.I = true;
        this.f34736w++;
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.d);
            this.d = null;
            org.telegram.messenger.g0.A2(arrayList);
        }
    }

    public final void l(int i7) {
        this.h = 7;
        if (this.f34728a) {
            this.f34733n = org.telegram.messenger.qs.e().f25120p & (~this.h);
        }
    }

    public void h() {
    }
}
