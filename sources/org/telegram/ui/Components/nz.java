package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.FiltersSetupActivity;
public final class nz extends v4.w {
    public final int d;
    public final Runnable f37958e;
    public final Object f37959f;

    public nz(FiltersSetupActivity filtersSetupActivity) {
        this.d = 1;
        this.f37959f = filtersSetupActivity;
        this.f37958e = new org.telegram.ui.kz(this, 4);
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, f1Var);
                View view = f1Var.f59245a;
                view.setPressed(false);
                view.setBackground(null);
                view.setTag(2131296421, null);
                return;
            default:
                super.a(recyclerView, f1Var);
                View view2 = f1Var.f59245a;
                view2.setPressed(false);
                view2.setTag(2131296421, null);
                if (view2 instanceof org.telegram.ui.e00) {
                    ((org.telegram.ui.e00) view2).setDragging(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        switch (this.d) {
            case 0:
                oz ozVar = (oz) this.f37959f;
                if (org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).K3() && (!ozVar.f38306n || (f1Var.b() == 0 && ((lz) ozVar.h.get(0)).f37264e && !org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).q()))) {
                    return v4.w.l(0, 0);
                }
                return v4.w.l(12, 0);
            default:
                if (f1Var.f59249f != 2) {
                    return v4.w.l(0, 0);
                }
                return v4.w.l(3, 0);
        }
    }

    @Override
    public final boolean k() {
        switch (this.d) {
            case 0:
                return ((oz) this.f37959f).f38306n;
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
                if (org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).K3() && ((f1Var.b() == 0 || f1Var2.b() == 0) && !org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).q())) {
                    return false;
                }
                org.telegram.ui.l4 l4Var = ((oz) this.f37959f).J;
                int b10 = f1Var.b();
                int b11 = f1Var2.b();
                oz ozVar = (oz) l4Var.f49583e;
                ArrayList arrayList = ozVar.h;
                SparseIntArray sparseIntArray = ozVar.f38305l0;
                int size = arrayList.size();
                if (b10 >= 0 && b11 >= 0 && b10 < size && b11 < size) {
                    ArrayList V0 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).V0();
                    org.telegram.messenger.ro roVar3 = (org.telegram.messenger.ro) V0.get(b10);
                    org.telegram.messenger.ro roVar4 = (org.telegram.messenger.ro) V0.get(b11);
                    int i10 = roVar3.f26777f;
                    roVar3.f26777f = roVar4.f26777f;
                    roVar4.f26777f = i10;
                    V0.set(b10, roVar4);
                    V0.set(b11, roVar3);
                    lz lzVar = (lz) arrayList.get(b10);
                    lz lzVar2 = (lz) arrayList.get(b11);
                    int i11 = lzVar.f37261a;
                    lzVar.f37261a = lzVar2.f37261a;
                    lzVar2.f37261a = i11;
                    int i12 = sparseIntArray.get(b10);
                    sparseIntArray.put(b10, sparseIntArray.get(b11));
                    sparseIntArray.put(b11, i12);
                    kz kzVar = ozVar.K;
                    int i13 = lzVar2.f37261a;
                    int i14 = lzVar.f37261a;
                    org.telegram.ui.sw swVar = (org.telegram.ui.sw) kzVar;
                    while (true) {
                        org.telegram.ui.ax[] axVarArr = swVar.f52164b.f46549f0;
                        if (i7 < axVarArr.length) {
                            org.telegram.ui.ax axVar = axVarArr[i7];
                            int i15 = axVar.h;
                            if (i15 == i13) {
                                axVar.h = i14;
                            } else if (i15 == i14) {
                                axVar.h = i13;
                            }
                            i7++;
                        } else {
                            int i16 = ozVar.L;
                            if (i16 == b10) {
                                ozVar.L = b11;
                                ozVar.M = lzVar.f37261a;
                            } else if (i16 == b11) {
                                ozVar.L = b10;
                                ozVar.M = lzVar2.f37261a;
                            }
                            int i17 = ozVar.f38312r0;
                            if (i17 == b10) {
                                ozVar.f38312r0 = b11;
                                ozVar.f38314s0 = lzVar.f37261a;
                            } else if (i17 == b11) {
                                ozVar.f38312r0 = b10;
                                ozVar.f38314s0 = lzVar2.f37261a;
                            }
                            arrayList.set(b10, lzVar2);
                            arrayList.set(b11, lzVar);
                            ozVar.m();
                            ozVar.E = true;
                            ozVar.G.setItemAnimator(ozVar.f38315t0);
                            l4Var.j(b10, b11);
                        }
                    }
                }
                return true;
            default:
                if (f1Var.f59249f != f1Var2.f59249f) {
                    return false;
                }
                org.telegram.ui.i00 i00Var = ((FiltersSetupActivity) this.f37959f).f43170b;
                int b12 = f1Var.b();
                int b13 = f1Var2.b();
                FiltersSetupActivity filtersSetupActivity = i00Var.f48676e;
                int i18 = filtersSetupActivity.f43175r;
                ArrayList arrayList2 = filtersSetupActivity.f43174n;
                if (b12 >= i18 && b13 >= i18) {
                    org.telegram.ui.g00 g00Var = (org.telegram.ui.g00) arrayList2.get(b12);
                    org.telegram.ui.g00 g00Var2 = (org.telegram.ui.g00) arrayList2.get(b13);
                    if (g00Var != null && g00Var2 != null && (roVar = g00Var.d) != null && (roVar2 = g00Var2.d) != null) {
                        int i19 = roVar.f26777f;
                        roVar.f26777f = roVar2.f26777f;
                        roVar2.f26777f = i19;
                        ArrayList arrayList3 = filtersSetupActivity.getMessagesController().Q0;
                        try {
                            arrayList3.set(b12 - filtersSetupActivity.f43175r, g00Var2.d);
                            arrayList3.set(b13 - filtersSetupActivity.f43175r, g00Var.d);
                        } catch (Exception unused) {
                        }
                        filtersSetupActivity.f43172e = true;
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
        Object obj = this.f37959f;
        boolean z10 = false;
        Runnable runnable = this.f37958e;
        switch (i10) {
            case 0:
                lo loVar = (lo) runnable;
                oz ozVar = (oz) obj;
                if (i7 != 0) {
                    ozVar.G.I0(false);
                    f1Var.f59245a.setPressed(true);
                    org.telegram.ui.ActionBar.u6.h(ozVar.f38294c0, f1Var.f59245a, ozVar.f38289a);
                } else {
                    org.telegram.messenger.g0.r(loVar);
                    org.telegram.messenger.g0.h3(loVar, 320L);
                }
                if (f1Var != null) {
                    View view = f1Var.f59245a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296421, bool);
                    return;
                }
                return;
            default:
                org.telegram.ui.kz kzVar = (org.telegram.ui.kz) runnable;
                if (i7 != 0) {
                    ((FiltersSetupActivity) obj).f43169a.I0(false);
                    f1Var.f59245a.setPressed(true);
                } else {
                    org.telegram.messenger.g0.r(kzVar);
                    org.telegram.messenger.g0.h3(kzVar, 320L);
                }
                if (f1Var != null) {
                    View view2 = f1Var.f59245a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296421, bool);
                    if (view2 instanceof org.telegram.ui.e00) {
                        org.telegram.ui.e00 e00Var = (org.telegram.ui.e00) view2;
                        if (i7 == 2) {
                            z10 = true;
                        }
                        e00Var.setDragging(z10);
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

    public nz(oz ozVar) {
        this.d = 0;
        this.f37959f = ozVar;
        this.f37958e = new lo(this, 18);
    }

    private final void r(v4.f1 f1Var) {
    }

    private final void s(v4.f1 f1Var) {
    }
}
