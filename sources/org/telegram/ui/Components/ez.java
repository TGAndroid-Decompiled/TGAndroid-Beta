package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.FiltersSetupActivity;
public final class ez extends v4.v {
    public final int d;
    public final Runnable f33522e;
    public final Object f33523f;

    public ez(FiltersSetupActivity filtersSetupActivity) {
        this.d = 1;
        this.f33523f = filtersSetupActivity;
        this.f33522e = new org.telegram.ui.jz(this, 4);
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, d1Var);
                View view = d1Var.f57056a;
                view.setPressed(false);
                view.setBackground(null);
                view.setTag(2131296419, null);
                return;
            default:
                super.a(recyclerView, d1Var);
                View view2 = d1Var.f57056a;
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
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        switch (this.d) {
            case 0:
                fz fzVar = (fz) this.f33523f;
                if (org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).D3() && (!fzVar.f33782n || (d1Var.b() == 0 && ((cz) fzVar.h.get(0)).f32793e && !org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).q()))) {
                    return v4.v.l(0, 0);
                }
                return v4.v.l(12, 0);
            default:
                if (d1Var.f57060f != 2) {
                    return v4.v.l(0, 0);
                }
                return v4.v.l(3, 0);
        }
    }

    @Override
    public final boolean k() {
        switch (this.d) {
            case 0:
                return ((fz) this.f33523f).f33782n;
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
                if (org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).D3() && ((d1Var.b() == 0 || d1Var2.b() == 0) && !org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).q())) {
                    return false;
                }
                org.telegram.ui.l4 l4Var = ((fz) this.f33523f).I;
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                fz fzVar = (fz) l4Var.f47458e;
                ArrayList arrayList = fzVar.h;
                SparseIntArray sparseIntArray = fzVar.f33780k0;
                int size = arrayList.size();
                if (b10 >= 0 && b11 >= 0 && b10 < size && b11 < size) {
                    ArrayList T0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).T0();
                    org.telegram.messenger.vo voVar3 = (org.telegram.messenger.vo) T0.get(b10);
                    org.telegram.messenger.vo voVar4 = (org.telegram.messenger.vo) T0.get(b11);
                    int i10 = voVar3.f26074f;
                    voVar3.f26074f = voVar4.f26074f;
                    voVar4.f26074f = i10;
                    T0.set(b10, voVar4);
                    T0.set(b11, voVar3);
                    cz czVar = (cz) arrayList.get(b10);
                    cz czVar2 = (cz) arrayList.get(b11);
                    int i11 = czVar.f32790a;
                    czVar.f32790a = czVar2.f32790a;
                    czVar2.f32790a = i11;
                    int i12 = sparseIntArray.get(b10);
                    sparseIntArray.put(b10, sparseIntArray.get(b11));
                    sparseIntArray.put(b11, i12);
                    bz bzVar = fzVar.J;
                    int i13 = czVar2.f32790a;
                    int i14 = czVar.f32790a;
                    org.telegram.ui.pw pwVar = (org.telegram.ui.pw) bzVar;
                    while (true) {
                        org.telegram.ui.xw[] xwVarArr = pwVar.f48821b.f52231e0;
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
                            int i16 = fzVar.K;
                            if (i16 == b10) {
                                fzVar.K = b11;
                                fzVar.L = czVar.f32790a;
                            } else if (i16 == b11) {
                                fzVar.K = b10;
                                fzVar.L = czVar2.f32790a;
                            }
                            int i17 = fzVar.f33786q0;
                            if (i17 == b10) {
                                fzVar.f33786q0 = b11;
                                fzVar.f33788r0 = czVar.f32790a;
                            } else if (i17 == b11) {
                                fzVar.f33786q0 = b10;
                                fzVar.f33788r0 = czVar2.f32790a;
                            }
                            arrayList.set(b10, czVar2);
                            arrayList.set(b11, czVar);
                            fzVar.j();
                            fzVar.D = true;
                            fzVar.F.setItemAnimator(fzVar.f33790s0);
                            l4Var.j(b10, b11);
                        }
                    }
                }
                return true;
            default:
                if (d1Var.f57060f != d1Var2.f57060f) {
                    return false;
                }
                org.telegram.ui.g00 g00Var = ((FiltersSetupActivity) this.f33523f).f41244b;
                int b12 = d1Var.b();
                int b13 = d1Var2.b();
                FiltersSetupActivity filtersSetupActivity = g00Var.f45835e;
                int i18 = filtersSetupActivity.f41249r;
                ArrayList arrayList2 = filtersSetupActivity.f41248n;
                if (b12 >= i18 && b13 >= i18) {
                    org.telegram.ui.e00 e00Var = (org.telegram.ui.e00) arrayList2.get(b12);
                    org.telegram.ui.e00 e00Var2 = (org.telegram.ui.e00) arrayList2.get(b13);
                    if (e00Var != null && e00Var2 != null && (voVar = e00Var.d) != null && (voVar2 = e00Var2.d) != null) {
                        int i19 = voVar.f26074f;
                        voVar.f26074f = voVar2.f26074f;
                        voVar2.f26074f = i19;
                        ArrayList arrayList3 = filtersSetupActivity.getMessagesController().P0;
                        try {
                            arrayList3.set(b12 - filtersSetupActivity.f41249r, e00Var2.d);
                            arrayList3.set(b13 - filtersSetupActivity.f41249r, e00Var.d);
                        } catch (Exception unused) {
                        }
                        filtersSetupActivity.f41246e = true;
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
        Object obj = this.f33523f;
        boolean z9 = false;
        Runnable runnable = this.f33522e;
        switch (i10) {
            case 0:
                gp gpVar = (gp) runnable;
                fz fzVar = (fz) obj;
                if (i7 != 0) {
                    fzVar.F.I0(false);
                    d1Var.f57056a.setPressed(true);
                    org.telegram.ui.ActionBar.s6.h(fzVar.f33768b0, d1Var.f57056a, fzVar.f33765a);
                } else {
                    org.telegram.messenger.g0.r(gpVar);
                    org.telegram.messenger.g0.i3(gpVar, 320L);
                }
                if (d1Var != null) {
                    View view = d1Var.f57056a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296419, bool);
                    return;
                }
                return;
            default:
                org.telegram.ui.jz jzVar = (org.telegram.ui.jz) runnable;
                if (i7 != 0) {
                    ((FiltersSetupActivity) obj).f41243a.I0(false);
                    d1Var.f57056a.setPressed(true);
                } else {
                    org.telegram.messenger.g0.r(jzVar);
                    org.telegram.messenger.g0.i3(jzVar, 320L);
                }
                if (d1Var != null) {
                    View view2 = d1Var.f57056a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296419, bool);
                    if (view2 instanceof org.telegram.ui.c00) {
                        org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) view2;
                        if (i7 == 2) {
                            z9 = true;
                        }
                        c00Var.setDragging(z9);
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

    public ez(fz fzVar) {
        this.d = 0;
        this.f33523f = fzVar;
        this.f33522e = new gp(this, 16);
    }

    private final void r(v4.d1 d1Var) {
    }

    private final void s(v4.d1 d1Var) {
    }
}
