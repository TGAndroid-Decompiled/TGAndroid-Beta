package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class gm0 {
    public boolean f46121f;
    public boolean f46122g;
    public boolean h;
    public Path f46123i;
    public Paint f46124j;
    public Drawable f46125k;
    public final org.telegram.ui.Components.hc f46126l;
    public boolean f46127m;
    public final org.telegram.ui.Components.v5 f46128n;
    public int f46129o;
    public final hm0 f46132r;
    public final Paint f46117a = new Paint(1);
    public final Paint f46118b = new Paint(1);
    public final Paint f46119c = new Paint(1);
    public final Path d = new Path();
    public final Path f46120e = new Path();
    public final RectF f46130p = new RectF();
    public final RectF f46131q = new RectF();

    public gm0(hm0 hm0Var) {
        this.f46132r = hm0Var;
        this.f46126l = new org.telegram.ui.Components.hc(hm0Var);
        this.f46128n = new org.telegram.ui.Components.v5(hm0Var, 0L, 320L, org.telegram.ui.Components.wq.h);
    }

    public final void a(org.telegram.messenger.fp fpVar) {
        boolean a10;
        int e10;
        int[] iArr;
        boolean z9;
        hm0 hm0Var = this.f46132r;
        org.telegram.ui.ActionBar.h6 h6Var = hm0Var.f46383a;
        if (fpVar == null) {
            return;
        }
        int[] iArr2 = fpVar.f22458g;
        int[] iArr3 = fpVar.h;
        if (h6Var == null) {
            a10 = org.telegram.ui.ActionBar.m6.I.q();
        } else {
            a10 = h6Var.a();
        }
        int i7 = hm0Var.f46385c;
        Paint paint = this.f46118b;
        Paint paint2 = this.f46117a;
        boolean z10 = true;
        if (i7 == 1) {
            if (a10 && fpVar.g() != fpVar.f() && fpVar.i() == fpVar.f()) {
                paint2.setColor(fpVar.e(1, h6Var));
                paint.setColor(fpVar.e(0, h6Var));
            } else {
                paint2.setColor(fpVar.e(0, h6Var));
                paint.setColor(fpVar.e(1, h6Var));
            }
            this.f46119c.setColor(fpVar.e(2, h6Var));
            int h = fpVar.h(a10);
            if (a10) {
                iArr = iArr3;
            } else {
                iArr = iArr2;
            }
            if (h != iArr[0]) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f46121f = z9;
            int j3 = fpVar.j(a10);
            if (a10) {
                iArr2 = iArr3;
            }
            if (j3 == iArr2[0]) {
                z10 = false;
            }
            this.f46122g = z10;
            return;
        }
        paint2.setColor(fpVar.e(0, h6Var));
        if (fpVar.o(a10)) {
            e10 = fpVar.e(1, h6Var);
        } else {
            e10 = fpVar.e(0, h6Var);
        }
        paint.setColor(e10);
        this.f46121f = fpVar.o(a10);
        this.f46122g = false;
    }
}
