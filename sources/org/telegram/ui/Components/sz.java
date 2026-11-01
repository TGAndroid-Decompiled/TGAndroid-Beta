package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.FiltersSetupActivity;
public final class sz extends s4.u {
    public final int d;
    public final Runnable e;
    public final Object f30470f;

    public sz(FiltersSetupActivity filtersSetupActivity) {
        this.d = 1;
        this.f30470f = filtersSetupActivity;
        this.e = new org.telegram.ui.yy(this, 5);
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, c1Var);
                View view = c1Var.f47909a;
                view.setPressed(false);
                view.setBackground(null);
                view.setTag(2131296419, null);
                return;
            default:
                super.a(recyclerView, c1Var);
                View view2 = c1Var.f47909a;
                view2.setPressed(false);
                view2.setTag(2131296419, null);
                if (view2 instanceof org.telegram.ui.a10) {
                    ((org.telegram.ui.a10) view2).setDragging(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                tz tzVar = (tz) this.f30470f;
                if (org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).A3() && (!tzVar.f30763n || (c1Var.b() == 0 && ((pz) tzVar.h.get(0)).e && !org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).q()))) {
                    return s4.u.l(0, 0);
                }
                return s4.u.l(12, 0);
            default:
                if (c1Var.f47912f != 2) {
                    return s4.u.l(0, 0);
                }
                return s4.u.l(3, 0);
        }
    }

    @Override
    public final boolean k() {
        switch (this.d) {
            case 0:
                return ((tz) this.f30470f).f30763n;
            default:
                return true;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        org.telegram.messenger.bp bpVar;
        org.telegram.messenger.bp bpVar2;
        switch (this.d) {
            case 0:
                int i10 = 0;
                if (org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).A3() && ((c1Var.b() == 0 || c1Var2.b() == 0) && !org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).q())) {
                    return false;
                }
                fg.j jVar = ((tz) this.f30470f).I;
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                tz tzVar = (tz) jVar.e;
                ArrayList arrayList = tzVar.h;
                SparseIntArray sparseIntArray = tzVar.f30761k0;
                int size = arrayList.size();
                if (b10 >= 0 && b11 >= 0 && b10 < size && b11 < size) {
                    ArrayList S0 = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).S0();
                    org.telegram.messenger.bp bpVar3 = (org.telegram.messenger.bp) S0.get(b10);
                    org.telegram.messenger.bp bpVar4 = (org.telegram.messenger.bp) S0.get(b11);
                    int i11 = bpVar3.f15003f;
                    bpVar3.f15003f = bpVar4.f15003f;
                    bpVar4.f15003f = i11;
                    S0.set(b10, bpVar4);
                    S0.set(b11, bpVar3);
                    pz pzVar = (pz) arrayList.get(b10);
                    pz pzVar2 = (pz) arrayList.get(b11);
                    int i12 = pzVar.f29572a;
                    pzVar.f29572a = pzVar2.f29572a;
                    pzVar2.f29572a = i12;
                    int i13 = sparseIntArray.get(b10);
                    sparseIntArray.put(b10, sparseIntArray.get(b11));
                    sparseIntArray.put(b11, i13);
                    oz ozVar = tzVar.J;
                    int i14 = pzVar2.f29572a;
                    int i15 = pzVar.f29572a;
                    org.telegram.ui.qx qxVar = (org.telegram.ui.qx) ozVar;
                    while (true) {
                        org.telegram.ui.yx[] yxVarArr = qxVar.f40919b.f44137e0;
                        if (i10 < yxVarArr.length) {
                            org.telegram.ui.yx yxVar = yxVarArr[i10];
                            int i16 = yxVar.h;
                            if (i16 == i14) {
                                yxVar.h = i15;
                            } else if (i16 == i15) {
                                yxVar.h = i14;
                            }
                            i10++;
                        } else {
                            int i17 = tzVar.K;
                            if (i17 == b10) {
                                tzVar.K = b11;
                                tzVar.L = pzVar.f29572a;
                            } else if (i17 == b11) {
                                tzVar.K = b10;
                                tzVar.L = pzVar2.f29572a;
                            }
                            int i18 = tzVar.f30767q0;
                            if (i18 == b10) {
                                tzVar.f30767q0 = b11;
                                tzVar.f30769r0 = pzVar.f29572a;
                            } else if (i18 == b11) {
                                tzVar.f30767q0 = b10;
                                tzVar.f30769r0 = pzVar2.f29572a;
                            }
                            arrayList.set(b10, pzVar2);
                            arrayList.set(b11, pzVar);
                            tzVar.j();
                            tzVar.D = true;
                            tzVar.F.setItemAnimator(tzVar.f30771s0);
                            jVar.j(b10, b11);
                        }
                    }
                }
                return true;
            default:
                if (c1Var.f47912f != c1Var2.f47912f) {
                    return false;
                }
                org.telegram.ui.e10 e10Var = ((FiltersSetupActivity) this.f30470f).f33339b;
                int b12 = c1Var.b();
                int b13 = c1Var2.b();
                FiltersSetupActivity filtersSetupActivity = e10Var.e;
                int i19 = filtersSetupActivity.f33343r;
                ArrayList arrayList2 = filtersSetupActivity.f33342n;
                if (b12 >= i19 && b13 >= i19) {
                    org.telegram.ui.c10 c10Var = (org.telegram.ui.c10) arrayList2.get(b12);
                    org.telegram.ui.c10 c10Var2 = (org.telegram.ui.c10) arrayList2.get(b13);
                    if (c10Var != null && c10Var2 != null && (bpVar = c10Var.d) != null && (bpVar2 = c10Var2.d) != null) {
                        int i20 = bpVar.f15003f;
                        bpVar.f15003f = bpVar2.f15003f;
                        bpVar2.f15003f = i20;
                        ArrayList arrayList3 = filtersSetupActivity.getMessagesController().P0;
                        try {
                            arrayList3.set(b12 - filtersSetupActivity.f33343r, c10Var2.d);
                            arrayList3.set(b13 - filtersSetupActivity.f33343r, c10Var.d);
                        } catch (Exception unused) {
                        }
                        filtersSetupActivity.e = true;
                        filtersSetupActivity.g0(true);
                    }
                }
                return true;
        }
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        int i11 = this.d;
        Boolean bool = null;
        Object obj = this.f30470f;
        boolean z10 = false;
        Runnable runnable = this.e;
        switch (i11) {
            case 0:
                ho hoVar = (ho) runnable;
                tz tzVar = (tz) obj;
                if (i10 != 0) {
                    tzVar.F.I0(false);
                    c1Var.f47909a.setPressed(true);
                    org.telegram.ui.ActionBar.a7.i(tzVar.f30750b0, c1Var.f47909a, tzVar.f30747a);
                } else {
                    org.telegram.messenger.i0.r(hoVar);
                    org.telegram.messenger.i0.h3(hoVar, 320L);
                }
                if (c1Var != null) {
                    View view = c1Var.f47909a;
                    if (i10 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296419, bool);
                    return;
                }
                return;
            default:
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) runnable;
                if (i10 != 0) {
                    ((FiltersSetupActivity) obj).f33338a.I0(false);
                    c1Var.f47909a.setPressed(true);
                } else {
                    org.telegram.messenger.i0.r(yyVar);
                    org.telegram.messenger.i0.h3(yyVar, 320L);
                }
                if (c1Var != null) {
                    View view2 = c1Var.f47909a;
                    if (i10 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296419, bool);
                    if (view2 instanceof org.telegram.ui.a10) {
                        org.telegram.ui.a10 a10Var = (org.telegram.ui.a10) view2;
                        if (i10 == 2) {
                            z10 = true;
                        }
                        a10Var.setDragging(z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
        int i10 = this.d;
    }

    public sz(tz tzVar) {
        this.d = 0;
        this.f30470f = tzVar;
        this.e = new ho(this, 18);
    }

    private final void r(s4.c1 c1Var) {
    }

    private final void s(s4.c1 c1Var) {
    }
}
