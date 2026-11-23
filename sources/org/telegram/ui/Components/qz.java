package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.FiltersSetupActivity;
public final class qz extends v4.w {
    public final int d;
    public final Runnable f39020e;
    public final Object f39021f;

    public qz(FiltersSetupActivity filtersSetupActivity) {
        this.d = 1;
        this.f39021f = filtersSetupActivity;
        this.f39020e = new org.telegram.ui.lz(this, 4);
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, f1Var);
                View view = f1Var.f59165a;
                view.setPressed(false);
                view.setBackground(null);
                view.setTag(2131296421, null);
                return;
            default:
                super.a(recyclerView, f1Var);
                View view2 = f1Var.f59165a;
                view2.setPressed(false);
                view2.setTag(2131296421, null);
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
                rz rzVar = (rz) this.f39021f;
                if (org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).K3() && (!rzVar.f39408n || (f1Var.b() == 0 && ((oz) rzVar.h.get(0)).f38419e && !org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0).q()))) {
                    return v4.w.l(0, 0);
                }
                return v4.w.l(12, 0);
            default:
                if (f1Var.f59169f != 2) {
                    return v4.w.l(0, 0);
                }
                return v4.w.l(3, 0);
        }
    }

    @Override
    public final boolean k() {
        switch (this.d) {
            case 0:
                return ((rz) this.f39021f).f39408n;
            default:
                return true;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        org.telegram.messenger.so soVar;
        org.telegram.messenger.so soVar2;
        switch (this.d) {
            case 0:
                int i7 = 0;
                if (org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).K3() && ((f1Var.b() == 0 || f1Var2.b() == 0) && !org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0).q())) {
                    return false;
                }
                org.telegram.ui.l4 l4Var = ((rz) this.f39021f).J;
                int b10 = f1Var.b();
                int b11 = f1Var2.b();
                rz rzVar = (rz) l4Var.f49474e;
                ArrayList arrayList = rzVar.h;
                SparseIntArray sparseIntArray = rzVar.f39407l0;
                int size = arrayList.size();
                if (b10 >= 0 && b11 >= 0 && b10 < size && b11 < size) {
                    ArrayList V0 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).V0();
                    org.telegram.messenger.so soVar3 = (org.telegram.messenger.so) V0.get(b10);
                    org.telegram.messenger.so soVar4 = (org.telegram.messenger.so) V0.get(b11);
                    int i10 = soVar3.f26890f;
                    soVar3.f26890f = soVar4.f26890f;
                    soVar4.f26890f = i10;
                    V0.set(b10, soVar4);
                    V0.set(b11, soVar3);
                    oz ozVar = (oz) arrayList.get(b10);
                    oz ozVar2 = (oz) arrayList.get(b11);
                    int i11 = ozVar.f38416a;
                    ozVar.f38416a = ozVar2.f38416a;
                    ozVar2.f38416a = i11;
                    int i12 = sparseIntArray.get(b10);
                    sparseIntArray.put(b10, sparseIntArray.get(b11));
                    sparseIntArray.put(b11, i12);
                    nz nzVar = rzVar.K;
                    int i13 = ozVar2.f38416a;
                    int i14 = ozVar.f38416a;
                    org.telegram.ui.tw twVar = (org.telegram.ui.tw) nzVar;
                    while (true) {
                        org.telegram.ui.bx[] bxVarArr = twVar.f52405b.f46722f0;
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
                            int i16 = rzVar.L;
                            if (i16 == b10) {
                                rzVar.L = b11;
                                rzVar.M = ozVar.f38416a;
                            } else if (i16 == b11) {
                                rzVar.L = b10;
                                rzVar.M = ozVar2.f38416a;
                            }
                            int i17 = rzVar.f39414r0;
                            if (i17 == b10) {
                                rzVar.f39414r0 = b11;
                                rzVar.f39416s0 = ozVar.f38416a;
                            } else if (i17 == b11) {
                                rzVar.f39414r0 = b10;
                                rzVar.f39416s0 = ozVar2.f38416a;
                            }
                            arrayList.set(b10, ozVar2);
                            arrayList.set(b11, ozVar);
                            rzVar.m();
                            rzVar.E = true;
                            rzVar.G.setItemAnimator(rzVar.f39417t0);
                            l4Var.j(b10, b11);
                        }
                    }
                }
                return true;
            default:
                if (f1Var.f59169f != f1Var2.f59169f) {
                    return false;
                }
                org.telegram.ui.j00 j00Var = ((FiltersSetupActivity) this.f39021f).f43095b;
                int b12 = f1Var.b();
                int b13 = f1Var2.b();
                FiltersSetupActivity filtersSetupActivity = j00Var.f48857e;
                int i18 = filtersSetupActivity.f43100r;
                ArrayList arrayList2 = filtersSetupActivity.f43099n;
                if (b12 >= i18 && b13 >= i18) {
                    org.telegram.ui.h00 h00Var = (org.telegram.ui.h00) arrayList2.get(b12);
                    org.telegram.ui.h00 h00Var2 = (org.telegram.ui.h00) arrayList2.get(b13);
                    if (h00Var != null && h00Var2 != null && (soVar = h00Var.d) != null && (soVar2 = h00Var2.d) != null) {
                        int i19 = soVar.f26890f;
                        soVar.f26890f = soVar2.f26890f;
                        soVar2.f26890f = i19;
                        ArrayList arrayList3 = filtersSetupActivity.getMessagesController().Q0;
                        try {
                            arrayList3.set(b12 - filtersSetupActivity.f43100r, h00Var2.d);
                            arrayList3.set(b13 - filtersSetupActivity.f43100r, h00Var.d);
                        } catch (Exception unused) {
                        }
                        filtersSetupActivity.f43097e = true;
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
        Object obj = this.f39021f;
        boolean z10 = false;
        Runnable runnable = this.f39020e;
        switch (i10) {
            case 0:
                oo ooVar = (oo) runnable;
                rz rzVar = (rz) obj;
                if (i7 != 0) {
                    rzVar.G.I0(false);
                    f1Var.f59165a.setPressed(true);
                    org.telegram.ui.ActionBar.t6.h(rzVar.f39396c0, f1Var.f59165a, rzVar.f39391a);
                } else {
                    org.telegram.messenger.g0.r(ooVar);
                    org.telegram.messenger.g0.h3(ooVar, 320L);
                }
                if (f1Var != null) {
                    View view = f1Var.f59165a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296421, bool);
                    return;
                }
                return;
            default:
                org.telegram.ui.lz lzVar = (org.telegram.ui.lz) runnable;
                if (i7 != 0) {
                    ((FiltersSetupActivity) obj).f43094a.I0(false);
                    f1Var.f59165a.setPressed(true);
                } else {
                    org.telegram.messenger.g0.r(lzVar);
                    org.telegram.messenger.g0.h3(lzVar, 320L);
                }
                if (f1Var != null) {
                    View view2 = f1Var.f59165a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296421, bool);
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

    public qz(rz rzVar) {
        this.d = 0;
        this.f39021f = rzVar;
        this.f39020e = new oo(this, 18);
    }

    private final void r(v4.f1 f1Var) {
    }

    private final void s(v4.f1 f1Var) {
    }
}
