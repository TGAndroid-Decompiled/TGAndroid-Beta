package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class dm0 {
    public boolean f45093f;
    public boolean f45094g;
    public boolean h;
    public Path f45095i;
    public Paint f45096j;
    public Drawable f45097k;
    public final org.telegram.ui.Components.ic f45098l;
    public boolean f45099m;
    public final org.telegram.ui.Components.w5 f45100n;
    public int f45101o;
    public final em0 f45104r;
    public final Paint f45089a = new Paint(1);
    public final Paint f45090b = new Paint(1);
    public final Paint f45091c = new Paint(1);
    public final Path d = new Path();
    public final Path f45092e = new Path();
    public final RectF f45102p = new RectF();
    public final RectF f45103q = new RectF();

    public dm0(em0 em0Var) {
        this.f45104r = em0Var;
        this.f45098l = new org.telegram.ui.Components.ic(em0Var);
        this.f45100n = new org.telegram.ui.Components.w5(em0Var, 0L, 320L, org.telegram.ui.Components.xq.h);
    }

    public final void a(org.telegram.messenger.fp fpVar) {
        boolean a10;
        int e10;
        int[] iArr;
        boolean z9;
        em0 em0Var = this.f45104r;
        org.telegram.ui.ActionBar.f6 f6Var = em0Var.f45335a;
        if (fpVar == null) {
            return;
        }
        int[] iArr2 = fpVar.f22454g;
        int[] iArr3 = fpVar.h;
        if (f6Var == null) {
            a10 = org.telegram.ui.ActionBar.k6.I.q();
        } else {
            a10 = f6Var.a();
        }
        int i7 = em0Var.f45337c;
        Paint paint = this.f45090b;
        Paint paint2 = this.f45089a;
        boolean z10 = true;
        if (i7 == 1) {
            if (a10 && fpVar.g() != fpVar.f() && fpVar.i() == fpVar.f()) {
                paint2.setColor(fpVar.e(1, f6Var));
                paint.setColor(fpVar.e(0, f6Var));
            } else {
                paint2.setColor(fpVar.e(0, f6Var));
                paint.setColor(fpVar.e(1, f6Var));
            }
            this.f45091c.setColor(fpVar.e(2, f6Var));
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
            this.f45093f = z9;
            int j3 = fpVar.j(a10);
            if (a10) {
                iArr2 = iArr3;
            }
            if (j3 == iArr2[0]) {
                z10 = false;
            }
            this.f45094g = z10;
            return;
        }
        paint2.setColor(fpVar.e(0, f6Var));
        if (fpVar.o(a10)) {
            e10 = fpVar.e(1, f6Var);
        } else {
            e10 = fpVar.e(0, f6Var);
        }
        paint.setColor(e10);
        this.f45093f = fpVar.o(a10);
        this.f45094g = false;
    }
}
