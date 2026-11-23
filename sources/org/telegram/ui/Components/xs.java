package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
public abstract class xs implements org.telegram.messenger.gs {
    public static cn M;
    public final org.telegram.messenger.r5 E;
    public boolean F;
    public boolean H;
    public boolean J;
    public int K;
    public final int L;
    public boolean f42180a;
    public Bitmap f42181b;
    public Canvas f42182c;
    public Bitmap d;
    public Canvas f42183e;
    public boolean f42184f;
    public int f42185n;
    public boolean f42186r;
    public int f42188w;
    public int f42189x;
    public int f42190y;
    public int h = 1;
    public final Paint f42187s = new Paint(1);
    public final ws G = new ws(this, 0);
    public final ws I = new ws(this, 1);

    public xs() {
        if (M == null) {
            ?? obj = new Object();
            obj.f34188b = new org.telegram.messenger.r5[2];
            M = obj;
        }
        cn cnVar = M;
        int i7 = cnVar.f34187a + 1;
        cnVar.f34187a = i7;
        if (i7 > 1) {
            cnVar.f34187a = 0;
        }
        org.telegram.messenger.r5[] r5VarArr = (org.telegram.messenger.r5[]) cnVar.f34188b;
        int i10 = cnVar.f34187a;
        org.telegram.messenger.r5 r5Var = r5VarArr[i10];
        if (r5Var == null) {
            r5Var = new org.telegram.messenger.r5("draw_background_queue_" + cnVar.f34187a, true);
            r5VarArr[i10] = r5Var;
        }
        this.E = r5Var;
        this.L = M.f34187a;
    }

    public void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        if (this.F) {
            boolean z10 = org.telegram.messenger.s2.f26694a;
            return;
        }
        this.f42189x = i10;
        this.f42190y = i7;
        if (this.H) {
            this.H = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f42183e;
            this.d = this.f42181b;
            this.f42183e = this.f42182c;
            this.f42181b = bitmap;
            this.f42182c = canvas2;
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
            int i11 = this.f42189x + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i11 && this.d.getWidth() == this.f42190y) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f42190y, i11, Bitmap.Config.ARGB_8888);
                this.f42183e = new Canvas(this.d);
            }
            this.f42183e.save();
            this.f42183e.translate(0.0f, 0);
            d(this.f42183e, f10);
            this.f42183e.restore();
        }
        if (!this.f42184f && !this.f42186r) {
            this.f42184f = true;
            i(j3);
            this.K = this.f42188w;
            this.E.postRunnable(this.G);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f42187s;
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
        if (i7 == org.telegram.messenger.ls.f25293j1) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || org.telegram.messenger.cz.o() < 2) {
                    int intValue = num.intValue() | this.f42185n;
                    this.f42185n = intValue;
                    if (intValue != 0 && !this.f42186r) {
                        this.f42186r = true;
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ls.f25298k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i11 = this.f42185n) != 0) {
                int i12 = (~num2.intValue()) & i11;
                this.f42185n = i12;
                if (i12 == 0 && this.f42186r) {
                    this.f42186r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f42180a) {
            return;
        }
        this.f42180a = true;
        this.F = false;
        int i7 = org.telegram.messenger.ls.e().f25409p & (~this.h);
        this.f42185n = i7;
        if (i7 == 0 && this.f42186r) {
            this.f42186r = false;
        }
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25293j1);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25298k1);
    }

    public final void f() {
        if (!this.f42180a) {
            return;
        }
        if (!this.f42184f) {
            j();
        }
        this.f42180a = false;
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25293j1);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25298k1);
    }

    public abstract void g();

    public abstract void i(long j3);

    public final void j() {
        ArrayList arrayList = new ArrayList();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            arrayList.add(bitmap);
        }
        Bitmap bitmap2 = this.f42181b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f42181b = null;
        this.f42182c = null;
        this.f42183e = null;
        org.telegram.messenger.g0.A2(arrayList);
    }

    public final void k() {
        this.J = true;
        this.f42188w++;
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.d);
            this.d = null;
            org.telegram.messenger.g0.A2(arrayList);
        }
    }

    public final void l(int i7) {
        this.h = 7;
        if (this.f42180a) {
            this.f42185n = org.telegram.messenger.ls.e().f25409p & (~this.h);
        }
    }

    public void h() {
    }
}
