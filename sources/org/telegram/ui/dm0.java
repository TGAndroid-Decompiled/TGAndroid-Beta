package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class dm0 {
    public boolean f45098f;
    public boolean f45099g;
    public boolean h;
    public Path f45100i;
    public Paint f45101j;
    public Drawable f45102k;
    public final org.telegram.ui.Components.ic f45103l;
    public boolean f45104m;
    public final org.telegram.ui.Components.w5 f45105n;
    public int f45106o;
    public final em0 f45109r;
    public final Paint f45094a = new Paint(1);
    public final Paint f45095b = new Paint(1);
    public final Paint f45096c = new Paint(1);
    public final Path d = new Path();
    public final Path f45097e = new Path();
    public final RectF f45107p = new RectF();
    public final RectF f45108q = new RectF();

    public dm0(em0 em0Var) {
        this.f45109r = em0Var;
        this.f45103l = new org.telegram.ui.Components.ic(em0Var);
        this.f45105n = new org.telegram.ui.Components.w5(em0Var, 0L, 320L, org.telegram.ui.Components.xq.h);
    }

    public final void a(org.telegram.messenger.fp fpVar) {
        boolean a10;
        int e10;
        int[] iArr;
        boolean z9;
        em0 em0Var = this.f45109r;
        org.telegram.ui.ActionBar.f6 f6Var = em0Var.f45376a;
        if (fpVar == null) {
            return;
        }
        int[] iArr2 = fpVar.f22435g;
        int[] iArr3 = fpVar.h;
        if (f6Var == null) {
            a10 = org.telegram.ui.ActionBar.k6.I.q();
        } else {
            a10 = f6Var.a();
        }
        int i7 = em0Var.f45378c;
        Paint paint = this.f45095b;
        Paint paint2 = this.f45094a;
        boolean z10 = true;
        if (i7 == 1) {
            if (a10 && fpVar.g() != fpVar.f() && fpVar.i() == fpVar.f()) {
                paint2.setColor(fpVar.e(1, f6Var));
                paint.setColor(fpVar.e(0, f6Var));
            } else {
                paint2.setColor(fpVar.e(0, f6Var));
                paint.setColor(fpVar.e(1, f6Var));
            }
            this.f45096c.setColor(fpVar.e(2, f6Var));
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
            this.f45098f = z9;
            int j3 = fpVar.j(a10);
            if (a10) {
                iArr2 = iArr3;
            }
            if (j3 == iArr2[0]) {
                z10 = false;
            }
            this.f45099g = z10;
            return;
        }
        paint2.setColor(fpVar.e(0, f6Var));
        if (fpVar.o(a10)) {
            e10 = fpVar.e(1, f6Var);
        } else {
            e10 = fpVar.e(0, f6Var);
        }
        paint.setColor(e10);
        this.f45098f = fpVar.o(a10);
        this.f45099g = false;
    }
}
