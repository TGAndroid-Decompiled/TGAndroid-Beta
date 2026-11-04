package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.FiltersSetupActivity;
public final class az extends u4.v {
    public final int d;
    public final Runnable f32005e;
    public final Object f32006f;

    public az(FiltersSetupActivity filtersSetupActivity) {
        this.d = 1;
        this.f32006f = filtersSetupActivity;
        this.f32005e = new org.telegram.ui.fz(this, 4);
    }

    @Override
    public final void a(RecyclerView recyclerView, u4.d1 d1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, d1Var);
                View view = d1Var.f55540a;
                view.setPressed(false);
                view.setBackground(null);
                view.setTag(2131296419, null);
                return;
            default:
                super.a(recyclerView, d1Var);
                View view2 = d1Var.f55540a;
                view2.setPressed(false);
                view2.setTag(2131296419, null);
                if (view2 instanceof org.telegram.ui.yz) {
                    ((org.telegram.ui.yz) view2).setDragging(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, u4.d1 d1Var) {
        switch (this.d) {
            case 0:
                bz bzVar = (bz) this.f32006f;
                if (org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).D3() && (!bzVar.f32459n || (d1Var.b() == 0 && ((yy) bzVar.h.get(0)).f40856e && !org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q()))) {
                    return u4.v.l(0, 0);
                }
                return u4.v.l(12, 0);
            default:
                if (d1Var.f55544f != 2) {
                    return u4.v.l(0, 0);
                }
                return u4.v.l(3, 0);
        }
    }

    @Override
    public final boolean k() {
        switch (this.d) {
            case 0:
                return ((bz) this.f32006f).f32459n;
            default:
                return true;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, u4.d1 d1Var, u4.d1 d1Var2) {
        org.telegram.messenger.mo moVar;
        org.telegram.messenger.mo moVar2;
        switch (this.d) {
            case 0:
                int i3 = 0;
                if (org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).D3() && ((d1Var.b() == 0 || d1Var2.b() == 0) && !org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q())) {
                    return false;
                }
                org.telegram.ui.n4 n4Var = ((bz) this.f32006f).J;
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                bz bzVar = (bz) n4Var.f47865e;
                ArrayList arrayList = bzVar.h;
                SparseIntArray sparseIntArray = bzVar.f32458l0;
                int size = arrayList.size();
                if (b10 >= 0 && b11 >= 0 && b10 < size && b11 < size) {
                    ArrayList T0 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).T0();
                    org.telegram.messenger.mo moVar3 = (org.telegram.messenger.mo) T0.get(b10);
                    org.telegram.messenger.mo moVar4 = (org.telegram.messenger.mo) T0.get(b11);
                    int i10 = moVar3.f24241f;
                    moVar3.f24241f = moVar4.f24241f;
                    moVar4.f24241f = i10;
                    T0.set(b10, moVar4);
                    T0.set(b11, moVar3);
                    yy yyVar = (yy) arrayList.get(b10);
                    yy yyVar2 = (yy) arrayList.get(b11);
                    int i11 = yyVar.f40853a;
                    yyVar.f40853a = yyVar2.f40853a;
                    yyVar2.f40853a = i11;
                    int i12 = sparseIntArray.get(b10);
                    sparseIntArray.put(b10, sparseIntArray.get(b11));
                    sparseIntArray.put(b11, i12);
                    xy xyVar = bzVar.K;
                    int i13 = yyVar2.f40853a;
                    int i14 = yyVar.f40853a;
                    org.telegram.ui.kw kwVar = (org.telegram.ui.kw) xyVar;
                    while (true) {
                        org.telegram.ui.tw[] twVarArr = kwVar.f47036b.f50230f0;
                        if (i3 < twVarArr.length) {
                            org.telegram.ui.tw twVar = twVarArr[i3];
                            int i15 = twVar.h;
                            if (i15 == i13) {
                                twVar.h = i14;
                            } else if (i15 == i14) {
                                twVar.h = i13;
                            }
                            i3++;
                        } else {
                            int i16 = bzVar.L;
                            if (i16 == b10) {
                                bzVar.L = b11;
                                bzVar.M = yyVar.f40853a;
                            } else if (i16 == b11) {
                                bzVar.L = b10;
                                bzVar.M = yyVar2.f40853a;
                            }
                            int i17 = bzVar.f32465r0;
                            if (i17 == b10) {
                                bzVar.f32465r0 = b11;
                                bzVar.f32467s0 = yyVar.f40853a;
                            } else if (i17 == b11) {
                                bzVar.f32465r0 = b10;
                                bzVar.f32467s0 = yyVar2.f40853a;
                            }
                            arrayList.set(b10, yyVar2);
                            arrayList.set(b11, yyVar);
                            bzVar.j();
                            bzVar.E = true;
                            bzVar.G.setItemAnimator(bzVar.f32468t0);
                            n4Var.j(b10, b11);
                        }
                    }
                }
                return true;
            default:
                if (d1Var.f55544f != d1Var2.f55544f) {
                    return false;
                }
                org.telegram.ui.c00 c00Var = ((FiltersSetupActivity) this.f32006f).f41266b;
                int b12 = d1Var.b();
                int b13 = d1Var2.b();
                FiltersSetupActivity filtersSetupActivity = c00Var.f44184e;
                int i18 = filtersSetupActivity.f41271r;
                ArrayList arrayList2 = filtersSetupActivity.f41270n;
                if (b12 >= i18 && b13 >= i18) {
                    org.telegram.ui.a00 a00Var = (org.telegram.ui.a00) arrayList2.get(b12);
                    org.telegram.ui.a00 a00Var2 = (org.telegram.ui.a00) arrayList2.get(b13);
                    if (a00Var != null && a00Var2 != null && (moVar = a00Var.d) != null && (moVar2 = a00Var2.d) != null) {
                        int i19 = moVar.f24241f;
                        moVar.f24241f = moVar2.f24241f;
                        moVar2.f24241f = i19;
                        ArrayList arrayList3 = filtersSetupActivity.getMessagesController().Q0;
                        try {
                            arrayList3.set(b12 - filtersSetupActivity.f41271r, a00Var2.d);
                            arrayList3.set(b13 - filtersSetupActivity.f41271r, a00Var.d);
                        } catch (Exception unused) {
                        }
                        filtersSetupActivity.f41268e = true;
                        filtersSetupActivity.g0(true);
                    }
                }
                return true;
        }
    }

    @Override
    public final void p(u4.d1 d1Var, int i3) {
        int i10 = this.d;
        Boolean bool = null;
        Object obj = this.f32006f;
        boolean z10 = false;
        Runnable runnable = this.f32005e;
        switch (i10) {
            case 0:
                gp gpVar = (gp) runnable;
                bz bzVar = (bz) obj;
                if (i3 != 0) {
                    bzVar.G.I0(false);
                    d1Var.f55540a.setPressed(true);
                    org.telegram.ui.ActionBar.r6.i(bzVar.f32447c0, d1Var.f55540a, bzVar.f32442a);
                } else {
                    org.telegram.messenger.g0.r(gpVar);
                    org.telegram.messenger.g0.i3(gpVar, 320L);
                }
                if (d1Var != null) {
                    View view = d1Var.f55540a;
                    if (i3 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296419, bool);
                    return;
                }
                return;
            default:
                org.telegram.ui.fz fzVar = (org.telegram.ui.fz) runnable;
                if (i3 != 0) {
                    ((FiltersSetupActivity) obj).f41265a.I0(false);
                    d1Var.f55540a.setPressed(true);
                } else {
                    org.telegram.messenger.g0.r(fzVar);
                    org.telegram.messenger.g0.i3(fzVar, 320L);
                }
                if (d1Var != null) {
                    View view2 = d1Var.f55540a;
                    if (i3 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296419, bool);
                    if (view2 instanceof org.telegram.ui.yz) {
                        org.telegram.ui.yz yzVar = (org.telegram.ui.yz) view2;
                        if (i3 == 2) {
                            z10 = true;
                        }
                        yzVar.setDragging(z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(u4.d1 d1Var) {
        int i3 = this.d;
    }

    public az(bz bzVar) {
        this.d = 0;
        this.f32006f = bzVar;
        this.f32005e = new gp(this, 16);
    }

    private final void r(u4.d1 d1Var) {
    }

    private final void s(u4.d1 d1Var) {
    }
}
