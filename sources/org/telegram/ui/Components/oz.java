package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.FiltersSetupActivity;
public final class oz extends v4.w {
    public final int d;
    public final Runnable f38196e;
    public final Object f38197f;

    public oz(FiltersSetupActivity filtersSetupActivity) {
        this.d = 1;
        this.f38197f = filtersSetupActivity;
        this.f38196e = new org.telegram.ui.lz(this, 4);
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, f1Var);
                View view = f1Var.f59122a;
                view.setPressed(false);
                view.setBackground(null);
                view.setTag(2131296419, null);
                return;
            default:
                super.a(recyclerView, f1Var);
                View view2 = f1Var.f59122a;
                view2.setPressed(false);
                view2.setTag(2131296419, null);
                if (view2 instanceof org.telegram.ui.f00) {
                    ((org.telegram.ui.f00) view2).setDragging(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        switch (this.d) {
            case 0:
                pz pzVar = (pz) this.f38197f;
                if (org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24773t0).K3() && (!pzVar.f38631n || (f1Var.b() == 0 && ((mz) pzVar.h.get(0)).f37671e && !org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).q()))) {
                    return v4.w.l(0, 0);
                }
                return v4.w.l(12, 0);
            default:
                if (f1Var.f59126f != 2) {
                    return v4.w.l(0, 0);
                }
                return v4.w.l(3, 0);
        }
    }

    @Override
    public final boolean k() {
        switch (this.d) {
            case 0:
                return ((pz) this.f38197f).f38631n;
            default:
                return true;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        org.telegram.messenger.ro roVar;
        org.telegram.messenger.ro roVar2;
        switch (this.d) {
            case 0:
                int i7 = 0;
                if (org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24773t0).K3() && ((f1Var.b() == 0 || f1Var2.b() == 0) && !org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).q())) {
                    return false;
                }
                org.telegram.ui.l4 l4Var = ((pz) this.f38197f).J;
                int b10 = f1Var.b();
                int b11 = f1Var2.b();
                pz pzVar = (pz) l4Var.f49426e;
                ArrayList arrayList = pzVar.h;
                SparseIntArray sparseIntArray = pzVar.f38630l0;
                int size = arrayList.size();
                if (b10 >= 0 && b11 >= 0 && b10 < size && b11 < size) {
                    ArrayList V0 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24773t0).V0();
                    org.telegram.messenger.ro roVar3 = (org.telegram.messenger.ro) V0.get(b10);
                    org.telegram.messenger.ro roVar4 = (org.telegram.messenger.ro) V0.get(b11);
                    int i10 = roVar3.f26678f;
                    roVar3.f26678f = roVar4.f26678f;
                    roVar4.f26678f = i10;
                    V0.set(b10, roVar4);
                    V0.set(b11, roVar3);
                    mz mzVar = (mz) arrayList.get(b10);
                    mz mzVar2 = (mz) arrayList.get(b11);
                    int i11 = mzVar.f37668a;
                    mzVar.f37668a = mzVar2.f37668a;
                    mzVar2.f37668a = i11;
                    int i12 = sparseIntArray.get(b10);
                    sparseIntArray.put(b10, sparseIntArray.get(b11));
                    sparseIntArray.put(b11, i12);
                    lz lzVar = pzVar.K;
                    int i13 = mzVar2.f37668a;
                    int i14 = mzVar.f37668a;
                    org.telegram.ui.tw twVar = (org.telegram.ui.tw) lzVar;
                    while (true) {
                        org.telegram.ui.bx[] bxVarArr = twVar.f52368b.f46683f0;
                        if (i7 < bxVarArr.length) {
                            org.telegram.ui.bx bxVar = bxVarArr[i7];
                            int i15 = bxVar.h;
                            if (i15 == i13) {
                                bxVar.h = i14;
                            } else if (i15 == i14) {
                                bxVar.h = i13;
                            }
                            i7++;
                        } else {
                            int i16 = pzVar.L;
                            if (i16 == b10) {
                                pzVar.L = b11;
                                pzVar.M = mzVar.f37668a;
                            } else if (i16 == b11) {
                                pzVar.L = b10;
                                pzVar.M = mzVar2.f37668a;
                            }
                            int i17 = pzVar.f38637r0;
                            if (i17 == b10) {
                                pzVar.f38637r0 = b11;
                                pzVar.f38639s0 = mzVar.f37668a;
                            } else if (i17 == b11) {
                                pzVar.f38637r0 = b10;
                                pzVar.f38639s0 = mzVar2.f37668a;
                            }
                            arrayList.set(b10, mzVar2);
                            arrayList.set(b11, mzVar);
                            pzVar.m();
                            pzVar.E = true;
                            pzVar.G.setItemAnimator(pzVar.f38640t0);
                            l4Var.j(b10, b11);
                        }
                    }
                }
                return true;
            default:
                if (f1Var.f59126f != f1Var2.f59126f) {
                    return false;
                }
                org.telegram.ui.j00 j00Var = ((FiltersSetupActivity) this.f38197f).f43050b;
                int b12 = f1Var.b();
                int b13 = f1Var2.b();
                FiltersSetupActivity filtersSetupActivity = j00Var.f48831e;
                int i18 = filtersSetupActivity.f43055r;
                ArrayList arrayList2 = filtersSetupActivity.f43054n;
                if (b12 >= i18 && b13 >= i18) {
                    org.telegram.ui.h00 h00Var = (org.telegram.ui.h00) arrayList2.get(b12);
                    org.telegram.ui.h00 h00Var2 = (org.telegram.ui.h00) arrayList2.get(b13);
                    if (h00Var != null && h00Var2 != null && (roVar = h00Var.d) != null && (roVar2 = h00Var2.d) != null) {
                        int i19 = roVar.f26678f;
                        roVar.f26678f = roVar2.f26678f;
                        roVar2.f26678f = i19;
                        ArrayList arrayList3 = filtersSetupActivity.getMessagesController().Q0;
                        try {
                            arrayList3.set(b12 - filtersSetupActivity.f43055r, h00Var2.d);
                            arrayList3.set(b13 - filtersSetupActivity.f43055r, h00Var.d);
                        } catch (Exception unused) {
                        }
                        filtersSetupActivity.f43052e = true;
                        filtersSetupActivity.g0(true);
                    }
                }
                return true;
        }
    }

    @Override
    public final void p(v4.f1 f1Var, int i7) {
        int i10 = this.d;
        Boolean bool = null;
        Object obj = this.f38197f;
        boolean z10 = false;
        Runnable runnable = this.f38196e;
        switch (i10) {
            case 0:
                mo moVar = (mo) runnable;
                pz pzVar = (pz) obj;
                if (i7 != 0) {
                    pzVar.G.I0(false);
                    f1Var.f59122a.setPressed(true);
                    org.telegram.ui.ActionBar.u6.h(pzVar.f38619c0, f1Var.f59122a, pzVar.f38614a);
                } else {
                    org.telegram.messenger.g0.r(moVar);
                    org.telegram.messenger.g0.h3(moVar, 320L);
                }
                if (f1Var != null) {
                    View view = f1Var.f59122a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296419, bool);
                    return;
                }
                return;
            default:
                org.telegram.ui.lz lzVar = (org.telegram.ui.lz) runnable;
                if (i7 != 0) {
                    ((FiltersSetupActivity) obj).f43049a.I0(false);
                    f1Var.f59122a.setPressed(true);
                } else {
                    org.telegram.messenger.g0.r(lzVar);
                    org.telegram.messenger.g0.h3(lzVar, 320L);
                }
                if (f1Var != null) {
                    View view2 = f1Var.f59122a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296419, bool);
                    if (view2 instanceof org.telegram.ui.f00) {
                        org.telegram.ui.f00 f00Var = (org.telegram.ui.f00) view2;
                        if (i7 == 2) {
                            z10 = true;
                        }
                        f00Var.setDragging(z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(v4.f1 f1Var) {
        int i7 = this.d;
    }

    public oz(pz pzVar) {
        this.d = 0;
        this.f38197f = pzVar;
        this.f38196e = new mo(this, 18);
    }

    private final void r(v4.f1 f1Var) {
    }

    private final void s(v4.f1 f1Var) {
    }
}
