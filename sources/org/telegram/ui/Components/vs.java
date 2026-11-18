package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
public abstract class vs implements org.telegram.messenger.fs {
    public static an M;
    public final org.telegram.messenger.r5 E;
    public boolean F;
    public boolean H;
    public boolean J;
    public int K;
    public final int L;
    public boolean f41401a;
    public Bitmap f41402b;
    public Canvas f41403c;
    public Bitmap d;
    public Canvas f41404e;
    public boolean f41405f;
    public int f41406n;
    public boolean f41407r;
    public int f41409w;
    public int f41410x;
    public int f41411y;
    public int h = 1;
    public final Paint f41408s = new Paint(1);
    public final us G = new us(this, 0);
    public final us I = new us(this, 1);

    public vs() {
        if (M == null) {
            ?? obj = new Object();
            obj.f33367b = new org.telegram.messenger.r5[2];
            M = obj;
        }
        an anVar = M;
        int i7 = anVar.f33366a + 1;
        anVar.f33366a = i7;
        if (i7 > 1) {
            anVar.f33366a = 0;
        }
        org.telegram.messenger.r5[] r5VarArr = (org.telegram.messenger.r5[]) anVar.f33367b;
        int i10 = anVar.f33366a;
        org.telegram.messenger.r5 r5Var = r5VarArr[i10];
        if (r5Var == null) {
            r5Var = new org.telegram.messenger.r5("draw_background_queue_" + anVar.f33366a, true);
            r5VarArr[i10] = r5Var;
        }
        this.E = r5Var;
        this.L = M.f33366a;
    }

    public void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        if (this.F) {
            boolean z10 = org.telegram.messenger.s2.f26723a;
            return;
        }
        this.f41410x = i10;
        this.f41411y = i7;
        if (this.H) {
            this.H = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f41404e;
            this.d = this.f41402b;
            this.f41404e = this.f41403c;
            this.f41402b = bitmap;
            this.f41403c = canvas2;
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
            int i11 = this.f41410x + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i11 && this.d.getWidth() == this.f41411y) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f41411y, i11, Bitmap.Config.ARGB_8888);
                this.f41404e = new Canvas(this.d);
            }
            this.f41404e.save();
            this.f41404e.translate(0.0f, 0);
            d(this.f41404e, f10);
            this.f41404e.restore();
        }
        if (!this.f41405f && !this.f41407r) {
            this.f41405f = true;
            i(j3);
            this.K = this.f41409w;
            this.E.postRunnable(this.G);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f41408s;
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
        if (i7 == org.telegram.messenger.ks.f25137j1) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || org.telegram.messenger.bz.o() < 2) {
                    int intValue = num.intValue() | this.f41406n;
                    this.f41406n = intValue;
                    if (intValue != 0 && !this.f41407r) {
                        this.f41407r = true;
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25142k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i11 = this.f41406n) != 0) {
                int i12 = (~num2.intValue()) & i11;
                this.f41406n = i12;
                if (i12 == 0 && this.f41407r) {
                    this.f41407r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f41401a) {
            return;
        }
        this.f41401a = true;
        this.F = false;
        int i7 = org.telegram.messenger.ks.e().f25253p & (~this.h);
        this.f41406n = i7;
        if (i7 == 0 && this.f41407r) {
            this.f41407r = false;
        }
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25137j1);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25142k1);
    }

    public final void f() {
        if (!this.f41401a) {
            return;
        }
        if (!this.f41405f) {
            j();
        }
        this.f41401a = false;
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25137j1);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25142k1);
    }

    public abstract void g();

    public abstract void i(long j3);

    public final void j() {
        ArrayList arrayList = new ArrayList();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            arrayList.add(bitmap);
        }
        Bitmap bitmap2 = this.f41402b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f41402b = null;
        this.f41403c = null;
        this.f41404e = null;
        org.telegram.messenger.g0.A2(arrayList);
    }

    public final void k() {
        this.J = true;
        this.f41409w++;
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.d);
            this.d = null;
            org.telegram.messenger.g0.A2(arrayList);
        }
    }

    public final void l(int i7) {
        this.h = 7;
        if (this.f41401a) {
            this.f41406n = org.telegram.messenger.ks.e().f25253p & (~this.h);
        }
    }

    public void h() {
    }
}
