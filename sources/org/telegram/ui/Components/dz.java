package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.FiltersSetupActivity;
public final class dz extends v4.v {
    public final int d;
    public final Runnable f33071e;
    public final Object f33072f;

    public dz(FiltersSetupActivity filtersSetupActivity) {
        this.d = 1;
        this.f33072f = filtersSetupActivity;
        this.f33071e = new org.telegram.ui.hz(this, 4);
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, d1Var);
                View view = d1Var.f56952a;
                view.setPressed(false);
                view.setBackground(null);
                view.setTag(2131296419, null);
                return;
            default:
                super.a(recyclerView, d1Var);
                View view2 = d1Var.f56952a;
                view2.setPressed(false);
                view2.setTag(2131296419, null);
                if (view2 instanceof org.telegram.ui.a00) {
                    ((org.telegram.ui.a00) view2).setDragging(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        switch (this.d) {
            case 0:
                ez ezVar = (ez) this.f33072f;
                if (org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).D3() && (!ezVar.f33388n || (d1Var.b() == 0 && ((bz) ezVar.h.get(0)).f32330e && !org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).q()))) {
                    return v4.v.l(0, 0);
                }
                return v4.v.l(12, 0);
            default:
                if (d1Var.f56956f != 2) {
                    return v4.v.l(0, 0);
                }
                return v4.v.l(3, 0);
        }
    }

    @Override
    public final boolean k() {
        switch (this.d) {
            case 0:
                return ((ez) this.f33072f).f33388n;
            default:
                return true;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        org.telegram.messenger.vo voVar;
        org.telegram.messenger.vo voVar2;
        switch (this.d) {
            case 0:
                int i7 = 0;
                if (org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).D3() && ((d1Var.b() == 0 || d1Var2.b() == 0) && !org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).q())) {
                    return false;
                }
                org.telegram.ui.l4 l4Var = ((ez) this.f33072f).I;
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                ez ezVar = (ez) l4Var.f47406e;
                ArrayList arrayList = ezVar.h;
                SparseIntArray sparseIntArray = ezVar.f33386k0;
                int size = arrayList.size();
                if (b10 >= 0 && b11 >= 0 && b10 < size && b11 < size) {
                    ArrayList T0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).T0();
                    org.telegram.messenger.vo voVar3 = (org.telegram.messenger.vo) T0.get(b10);
                    org.telegram.messenger.vo voVar4 = (org.telegram.messenger.vo) T0.get(b11);
                    int i10 = voVar3.f26060f;
                    voVar3.f26060f = voVar4.f26060f;
                    voVar4.f26060f = i10;
                    T0.set(b10, voVar4);
                    T0.set(b11, voVar3);
                    bz bzVar = (bz) arrayList.get(b10);
                    bz bzVar2 = (bz) arrayList.get(b11);
                    int i11 = bzVar.f32327a;
                    bzVar.f32327a = bzVar2.f32327a;
                    bzVar2.f32327a = i11;
                    int i12 = sparseIntArray.get(b10);
                    sparseIntArray.put(b10, sparseIntArray.get(b11));
                    sparseIntArray.put(b11, i12);
                    az azVar = ezVar.J;
                    int i13 = bzVar2.f32327a;
                    int i14 = bzVar.f32327a;
                    org.telegram.ui.nw nwVar = (org.telegram.ui.nw) azVar;
                    while (true) {
                        org.telegram.ui.vw[] vwVarArr = nwVar.f48151b.f51551e0;
                        if (i7 < vwVarArr.length) {
                            org.telegram.ui.vw vwVar = vwVarArr[i7];
                            int i15 = vwVar.h;
                            if (i15 == i13) {
                                vwVar.h = i14;
                            } else if (i15 == i14) {
                                vwVar.h = i13;
                            }
                            i7++;
                        } else {
                            int i16 = ezVar.K;
                            if (i16 == b10) {
                                ezVar.K = b11;
                                ezVar.L = bzVar.f32327a;
                            } else if (i16 == b11) {
                                ezVar.K = b10;
                                ezVar.L = bzVar2.f32327a;
                            }
                            int i17 = ezVar.f33392q0;
                            if (i17 == b10) {
                                ezVar.f33392q0 = b11;
                                ezVar.f33394r0 = bzVar.f32327a;
                            } else if (i17 == b11) {
                                ezVar.f33392q0 = b10;
                                ezVar.f33394r0 = bzVar2.f32327a;
                            }
                            arrayList.set(b10, bzVar2);
                            arrayList.set(b11, bzVar);
                            ezVar.j();
                            ezVar.D = true;
                            ezVar.F.setItemAnimator(ezVar.f33396s0);
                            l4Var.j(b10, b11);
                        }
                    }
                }
                return true;
            default:
                if (d1Var.f56956f != d1Var2.f56956f) {
                    return false;
                }
                org.telegram.ui.e00 e00Var = ((FiltersSetupActivity) this.f33072f).f41234b;
                int b12 = d1Var.b();
                int b13 = d1Var2.b();
                FiltersSetupActivity filtersSetupActivity = e00Var.f45171e;
                int i18 = filtersSetupActivity.f41239r;
                ArrayList arrayList2 = filtersSetupActivity.f41238n;
                if (b12 >= i18 && b13 >= i18) {
                    org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) arrayList2.get(b12);
                    org.telegram.ui.c00 c00Var2 = (org.telegram.ui.c00) arrayList2.get(b13);
                    if (c00Var != null && c00Var2 != null && (voVar = c00Var.d) != null && (voVar2 = c00Var2.d) != null) {
                        int i19 = voVar.f26060f;
                        voVar.f26060f = voVar2.f26060f;
                        voVar2.f26060f = i19;
                        ArrayList arrayList3 = filtersSetupActivity.getMessagesController().P0;
                        try {
                            arrayList3.set(b12 - filtersSetupActivity.f41239r, c00Var2.d);
                            arrayList3.set(b13 - filtersSetupActivity.f41239r, c00Var.d);
                        } catch (Exception unused) {
                        }
                        filtersSetupActivity.f41236e = true;
                        filtersSetupActivity.g0(true);
                    }
                }
                return true;
        }
    }

    @Override
    public final void p(v4.d1 d1Var, int i7) {
        int i10 = this.d;
        Boolean bool = null;
        Object obj = this.f33072f;
        boolean z9 = false;
        Runnable runnable = this.f33071e;
        switch (i10) {
            case 0:
                gp gpVar = (gp) runnable;
                ez ezVar = (ez) obj;
                if (i7 != 0) {
                    ezVar.F.I0(false);
                    d1Var.f56952a.setPressed(true);
                    org.telegram.ui.ActionBar.r6.i(ezVar.f33374b0, d1Var.f56952a, ezVar.f33371a);
                } else {
                    org.telegram.messenger.g0.r(gpVar);
                    org.telegram.messenger.g0.i3(gpVar, 320L);
                }
                if (d1Var != null) {
                    View view = d1Var.f56952a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296419, bool);
                    return;
                }
                return;
            default:
                org.telegram.ui.hz hzVar = (org.telegram.ui.hz) runnable;
                if (i7 != 0) {
                    ((FiltersSetupActivity) obj).f41233a.I0(false);
                    d1Var.f56952a.setPressed(true);
                } else {
                    org.telegram.messenger.g0.r(hzVar);
                    org.telegram.messenger.g0.i3(hzVar, 320L);
                }
                if (d1Var != null) {
                    View view2 = d1Var.f56952a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296419, bool);
                    if (view2 instanceof org.telegram.ui.a00) {
                        org.telegram.ui.a00 a00Var = (org.telegram.ui.a00) view2;
                        if (i7 == 2) {
                            z9 = true;
                        }
                        a00Var.setDragging(z9);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(v4.d1 d1Var) {
        int i7 = this.d;
    }

    public dz(ez ezVar) {
        this.d = 0;
        this.f33072f = ezVar;
        this.f33071e = new gp(this, 16);
    }

    private final void r(v4.d1 d1Var) {
    }

    private final void s(v4.d1 d1Var) {
    }
}
