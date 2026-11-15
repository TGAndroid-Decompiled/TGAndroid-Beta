package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.FiltersSetupActivity;
public final class hz extends v4.v {
    public final int d;
    public final Runnable f35377e;
    public final Object f35378f;

    public hz(FiltersSetupActivity filtersSetupActivity) {
        this.d = 1;
        this.f35378f = filtersSetupActivity;
        this.f35377e = new org.telegram.ui.iz(this, 4);
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.e1 e1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, e1Var);
                View view = e1Var.f58535a;
                view.setPressed(false);
                view.setBackground(null);
                view.setTag(2131296419, null);
                return;
            default:
                super.a(recyclerView, e1Var);
                View view2 = e1Var.f58535a;
                view2.setPressed(false);
                view2.setTag(2131296419, null);
                if (view2 instanceof org.telegram.ui.c00) {
                    ((org.telegram.ui.c00) view2).setDragging(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.e1 e1Var) {
        switch (this.d) {
            case 0:
                iz izVar = (iz) this.f35378f;
                if (org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).D3() && (!izVar.f35798n || (e1Var.b() == 0 && ((fz) izVar.h.get(0)).f34751e && !org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24934t0).q()))) {
                    return v4.v.l(0, 0);
                }
                return v4.v.l(12, 0);
            default:
                if (e1Var.f58539f != 2) {
                    return v4.v.l(0, 0);
                }
                return v4.v.l(3, 0);
        }
    }

    @Override
    public final boolean k() {
        switch (this.d) {
            case 0:
                return ((iz) this.f35378f).f35798n;
            default:
                return true;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2) {
        org.telegram.messenger.so soVar;
        org.telegram.messenger.so soVar2;
        switch (this.d) {
            case 0:
                int i7 = 0;
                if (org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).D3() && ((e1Var.b() == 0 || e1Var2.b() == 0) && !org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24934t0).q())) {
                    return false;
                }
                org.telegram.ui.l4 l4Var = ((iz) this.f35378f).J;
                int b10 = e1Var.b();
                int b11 = e1Var2.b();
                iz izVar = (iz) l4Var.f48827e;
                ArrayList arrayList = izVar.h;
                SparseIntArray sparseIntArray = izVar.f35797l0;
                int size = arrayList.size();
                if (b10 >= 0 && b11 >= 0 && b10 < size && b11 < size) {
                    ArrayList T0 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).T0();
                    org.telegram.messenger.so soVar3 = (org.telegram.messenger.so) T0.get(b10);
                    org.telegram.messenger.so soVar4 = (org.telegram.messenger.so) T0.get(b11);
                    int i10 = soVar3.f26546f;
                    soVar3.f26546f = soVar4.f26546f;
                    soVar4.f26546f = i10;
                    T0.set(b10, soVar4);
                    T0.set(b11, soVar3);
                    fz fzVar = (fz) arrayList.get(b10);
                    fz fzVar2 = (fz) arrayList.get(b11);
                    int i11 = fzVar.f34748a;
                    fzVar.f34748a = fzVar2.f34748a;
                    fzVar2.f34748a = i11;
                    int i12 = sparseIntArray.get(b10);
                    sparseIntArray.put(b10, sparseIntArray.get(b11));
                    sparseIntArray.put(b11, i12);
                    ez ezVar = izVar.K;
                    int i13 = fzVar2.f34748a;
                    int i14 = fzVar.f34748a;
                    org.telegram.ui.pw pwVar = (org.telegram.ui.pw) ezVar;
                    while (true) {
                        org.telegram.ui.xw[] xwVarArr = pwVar.f50385b.f53673f0;
                        if (i7 < xwVarArr.length) {
                            org.telegram.ui.xw xwVar = xwVarArr[i7];
                            int i15 = xwVar.h;
                            if (i15 == i13) {
                                xwVar.h = i14;
                            } else if (i15 == i14) {
                                xwVar.h = i13;
                            }
                            i7++;
                        } else {
                            int i16 = izVar.L;
                            if (i16 == b10) {
                                izVar.L = b11;
                                izVar.M = fzVar.f34748a;
                            } else if (i16 == b11) {
                                izVar.L = b10;
                                izVar.M = fzVar2.f34748a;
                            }
                            int i17 = izVar.f35804r0;
                            if (i17 == b10) {
                                izVar.f35804r0 = b11;
                                izVar.f35806s0 = fzVar.f34748a;
                            } else if (i17 == b11) {
                                izVar.f35804r0 = b10;
                                izVar.f35806s0 = fzVar2.f34748a;
                            }
                            arrayList.set(b10, fzVar2);
                            arrayList.set(b11, fzVar);
                            izVar.j();
                            izVar.E = true;
                            izVar.G.setItemAnimator(izVar.f35807t0);
                            l4Var.j(b10, b11);
                        }
                    }
                }
                return true;
            default:
                if (e1Var.f58539f != e1Var2.f58539f) {
                    return false;
                }
                org.telegram.ui.g00 g00Var = ((FiltersSetupActivity) this.f35378f).f42605b;
                int b12 = e1Var.b();
                int b13 = e1Var2.b();
                FiltersSetupActivity filtersSetupActivity = g00Var.f47264e;
                int i18 = filtersSetupActivity.f42610r;
                ArrayList arrayList2 = filtersSetupActivity.f42609n;
                if (b12 >= i18 && b13 >= i18) {
                    org.telegram.ui.e00 e00Var = (org.telegram.ui.e00) arrayList2.get(b12);
                    org.telegram.ui.e00 e00Var2 = (org.telegram.ui.e00) arrayList2.get(b13);
                    if (e00Var != null && e00Var2 != null && (soVar = e00Var.d) != null && (soVar2 = e00Var2.d) != null) {
                        int i19 = soVar.f26546f;
                        soVar.f26546f = soVar2.f26546f;
                        soVar2.f26546f = i19;
                        ArrayList arrayList3 = filtersSetupActivity.getMessagesController().Q0;
                        try {
                            arrayList3.set(b12 - filtersSetupActivity.f42610r, e00Var2.d);
                            arrayList3.set(b13 - filtersSetupActivity.f42610r, e00Var.d);
                        } catch (Exception unused) {
                        }
                        filtersSetupActivity.f42607e = true;
                        filtersSetupActivity.g0(true);
                    }
                }
                return true;
        }
    }

    @Override
    public final void p(v4.e1 e1Var, int i7) {
        int i10 = this.d;
        Boolean bool = null;
        Object obj = this.f35378f;
        boolean z10 = false;
        Runnable runnable = this.f35377e;
        switch (i10) {
            case 0:
                fo foVar = (fo) runnable;
                iz izVar = (iz) obj;
                if (i7 != 0) {
                    izVar.G.I0(false);
                    e1Var.f58535a.setPressed(true);
                    org.telegram.ui.ActionBar.q6.h(izVar.f35786c0, e1Var.f58535a, izVar.f35781a);
                } else {
                    org.telegram.messenger.g0.r(foVar);
                    org.telegram.messenger.g0.i3(foVar, 320L);
                }
                if (e1Var != null) {
                    View view = e1Var.f58535a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296419, bool);
                    return;
                }
                return;
            default:
                org.telegram.ui.iz izVar2 = (org.telegram.ui.iz) runnable;
                if (i7 != 0) {
                    ((FiltersSetupActivity) obj).f42604a.I0(false);
                    e1Var.f58535a.setPressed(true);
                } else {
                    org.telegram.messenger.g0.r(izVar2);
                    org.telegram.messenger.g0.i3(izVar2, 320L);
                }
                if (e1Var != null) {
                    View view2 = e1Var.f58535a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296419, bool);
                    if (view2 instanceof org.telegram.ui.c00) {
                        org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) view2;
                        if (i7 == 2) {
                            z10 = true;
                        }
                        c00Var.setDragging(z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(v4.e1 e1Var) {
        int i7 = this.d;
    }

    public hz(iz izVar) {
        this.d = 0;
        this.f35378f = izVar;
        this.f35377e = new fo(this, 18);
    }

    private final void r(v4.e1 e1Var) {
    }

    private final void s(v4.e1 e1Var) {
    }
}
