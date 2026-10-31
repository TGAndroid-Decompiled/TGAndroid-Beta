package org.telegram.ui.Components;

import android.content.Context;
public final class ii extends u51 {
    public final int f26981m3 = 3;
    public final Object f26982n3;

    public ii(r51 r51Var, r51 r51Var2, d dVar, q51 q51Var, q51 q51Var2) {
        super(r51Var2, dVar, q51Var, q51Var2);
        this.f26982n3 = r51Var;
    }

    @Override
    public boolean E0(float f7) {
        int i10;
        switch (this.f26981m3) {
            case 0:
                bi biVar = ((mi) this.f26982n3).f30947b;
                int L = org.telegram.messenger.i0.L(30.0f) + biVar.V3[0];
                if (!biVar.X1) {
                    i10 = org.telegram.messenger.i0.f16020m;
                } else {
                    i10 = 0;
                }
                if (f7 < L + i10) {
                    return false;
                }
                return true;
            default:
                return super.E0(f7);
        }
    }

    @Override
    public void F1() {
        switch (this.f26981m3) {
            case 0:
                mi miVar = (mi) this.f26982n3;
                miVar.f30947b.L1(miVar, 0);
                return;
            default:
                return;
        }
    }

    @Override
    public void K1() {
        switch (this.f26981m3) {
            case 4:
                org.telegram.messenger.i0.d0(((vh.k7) this.f26982n3).f52192b, new ph.h1(this, 25));
                return;
            default:
                return;
        }
    }

    @Override
    public Integer V0(int i10) {
        switch (this.f26981m3) {
            case 4:
                return 0;
            default:
                return super.V0(i10);
        }
    }

    @Override
    public void l0(int i10) {
        org.telegram.ui.web.h hVar;
        switch (this.f26981m3) {
            case 2:
                if (!canScrollVertically(1) && (hVar = ((org.telegram.ui.web.j) this.f26982n3).D) != null && hVar.h) {
                    hVar.d();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f26981m3) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                mi miVar = (mi) this.f26982n3;
                miVar.f30947b.L1(miVar, 0);
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                ((r51) this.f26982n3).f29839c = -1;
                return;
            case 2:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 3:
                super.onLayout(z10, i10, i11, i12, i13);
                ((vq0) this.f26982n3).p();
                return;
        }
    }

    public ii(vh.k7 k7Var, Context context, int i10, vh.t2 t2Var, rh.d0 d0Var, th.b bVar) {
        super(context, i10, 0, false, t2Var, d0Var, null, bVar, -1, 0);
        this.f26982n3 = k7Var;
    }

    public ii(org.telegram.ui.web.j jVar, Context context, int i10, ag.a aVar, org.telegram.ui.web.a aVar2, org.telegram.ui.ActionBar.x4 x4Var) {
        super(context, i10, 0, false, aVar, aVar2, null, x4Var);
        this.f26982n3 = jVar;
    }

    public ii(mi miVar, Context context, int i10, d dVar, fi fiVar, fi fiVar2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, 0, false, dVar, fiVar, fiVar2, p6Var);
        this.f26982n3 = miVar;
    }

    public ii(Context context, int i10, ag.a aVar, ph.a2 a2Var, ph.a2 a2Var2, org.telegram.ui.ActionBar.p6 p6Var, vq0 vq0Var) {
        super(context, i10, 0, false, aVar, a2Var, a2Var2, p6Var, 3, 1);
        this.f26982n3 = vq0Var;
    }
}
