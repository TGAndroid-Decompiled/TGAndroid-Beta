package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class nn0 {
    public boolean f39938f;
    public boolean f39939g;
    public boolean h;
    public Path f39940i;
    public Paint f39941j;
    public Drawable f39942k;
    public final org.telegram.ui.Components.dc f39943l;
    public boolean f39944m;
    public final org.telegram.ui.Components.t5 f39945n;
    public int f39946o;
    public final on0 f39949r;
    public final Paint f39935a = new Paint(1);
    public final Paint f39936b = new Paint(1);
    public final Paint f39937c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f39947p = new RectF();
    public final RectF f39948q = new RectF();

    public nn0(on0 on0Var) {
        this.f39949r = on0Var;
        this.f39943l = new org.telegram.ui.Components.dc(on0Var);
        this.f39945n = new org.telegram.ui.Components.t5(on0Var, 0L, 320L, org.telegram.ui.Components.gr.h);
    }

    public final void a(org.telegram.messenger.lp lpVar) {
        boolean a2;
        int e;
        int[] iArr;
        boolean z10;
        on0 on0Var = this.f39949r;
        org.telegram.ui.ActionBar.p6 p6Var = on0Var.f40194a;
        if (lpVar == null) {
            return;
        }
        int[] iArr2 = lpVar.f16988g;
        int[] iArr3 = lpVar.h;
        if (p6Var == null) {
            a2 = org.telegram.ui.ActionBar.t6.I.q();
        } else {
            a2 = p6Var.a();
        }
        int i10 = on0Var.f40196c;
        Paint paint = this.f39936b;
        Paint paint2 = this.f39935a;
        boolean z11 = true;
        if (i10 == 1) {
            if (a2 && lpVar.g() != lpVar.f() && lpVar.i() == lpVar.f()) {
                paint2.setColor(lpVar.e(1, p6Var));
                paint.setColor(lpVar.e(0, p6Var));
            } else {
                paint2.setColor(lpVar.e(0, p6Var));
                paint.setColor(lpVar.e(1, p6Var));
            }
            this.f39937c.setColor(lpVar.e(2, p6Var));
            int h = lpVar.h(a2);
            if (a2) {
                iArr = iArr3;
            } else {
                iArr = iArr2;
            }
            if (h != iArr[0]) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f39938f = z10;
            int j10 = lpVar.j(a2);
            if (a2) {
                iArr2 = iArr3;
            }
            if (j10 == iArr2[0]) {
                z11 = false;
            }
            this.f39939g = z11;
            return;
        }
        paint2.setColor(lpVar.e(0, p6Var));
        if (lpVar.o(a2)) {
            e = lpVar.e(1, p6Var);
        } else {
            e = lpVar.e(0, p6Var);
        }
        paint.setColor(e);
        this.f39938f = lpVar.o(a2);
        this.f39939g = false;
    }
}
