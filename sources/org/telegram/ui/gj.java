package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class gj extends v4.u0 {
    public boolean f48122b;
    public final bn d;
    public float f48121a = 0.0f;
    public final int f48123c = org.telegram.messenger.g0.L(100.0f);

    public gj(bn bnVar) {
        this.d = bnVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        bn bnVar = this.d;
        if (i7 == 0) {
            org.telegram.ui.Cells.r1 r1Var = bnVar.E2;
            if (r1Var != null) {
                bn.q2(bnVar, r1Var, -1, bnVar.F2, bnVar.G2);
                bnVar.E2 = null;
            }
            bnVar.f46262y3 = false;
            bnVar.f46274z3 = false;
            bnVar.A3 = false;
            bnVar.B3 = false;
            bnVar.E9(true);
            bnVar.F9(true);
            if (org.telegram.messenger.bz.o() == 0) {
                int i10 = bn.f45936md;
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25168k1, 512);
            }
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25178m1, new Object[0]);
            bnVar.A0.setOverScrollMode(0);
            bnVar.f46215u9.V();
            bnVar.Gd(false);
            bnVar.Pa = false;
            return;
        }
        hi.l3 l3Var = bnVar.N1;
        if (l3Var != null && l3Var.W) {
            l3Var.f(true);
        }
        org.telegram.ui.Components.o6 o6Var = bnVar.f46096l3;
        if (o6Var != null && o6Var.getVisibility() == 0 && bnVar.V9()) {
            org.telegram.messenger.g0.v1(bnVar.getParentActivity().getCurrentFocus());
        }
        if (i7 == 2) {
            bnVar.R4 = true;
            bnVar.A3 = true;
        } else if (i7 == 1) {
            bnVar.E2 = null;
            bnVar.R4 = true;
            bnVar.f46262y3 = true;
            bnVar.f46274z3 = true;
            bnVar.B3 = true;
            bnVar.A3 = true;
        }
        if (org.telegram.messenger.bz.o() == 0) {
            int i11 = bn.f45936md;
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25163j1, 512);
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.l1, new Object[0]);
        ch.s sVar = bnVar.f46229va;
        if (sVar != null && sVar.d()) {
            bnVar.f46229va.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        bn bnVar = this.d;
        bnVar.A0.invalidate();
        boolean z14 = true;
        if (i10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48122b = z10;
        int L0 = bnVar.C0.L0();
        h6.m mVar = null;
        if (((i10 != 0 && bnVar.Pa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && bnVar.f45966b5 != 0) {
            if (this.f48122b && !bnVar.f45980c5) {
                if (!bnVar.A0.W1 && L0 != -1) {
                    int N0 = bnVar.C0.N0();
                    org.telegram.messenger.fj fjVar = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = bnVar.C0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.r1) {
                                fjVar = ((org.telegram.ui.Cells.r1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.v0) {
                                fjVar = ((org.telegram.ui.Cells.v0) m10).getMessageObject();
                            }
                            if (fjVar != null && bnVar.f45966b5 == fjVar.e1()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && fjVar != null && fjVar.e1() < bnVar.f45966b5) {
                        bnVar.f45966b5 = 0;
                    }
                }
            } else {
                bnVar.f45966b5 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            bnVar.f45980c5 = false;
            if (!bnVar.R4 && i10 != 0) {
                bnVar.R4 = true;
            }
        }
        if (i10 != 0) {
            bnVar.f46107m1.getClass();
            bnVar.G9(true);
        }
        if (i10 != 0 && bnVar.f46262y3 && !bnVar.f46209u3) {
            if (bnVar.f45996d8 != Integer.MAX_VALUE) {
                bnVar.lb();
                bnVar.Gd(false);
            }
            bnVar.mc(true);
        }
        if (bnVar.Q9() && i10 != 0 && bnVar.f46274z3 && !bnVar.f46209u3) {
            if (bnVar.f45996d8 != Integer.MAX_VALUE) {
                bnVar.lb();
                bnVar.Gd(false);
            }
            bnVar.nc(true);
        }
        bnVar.p7(true);
        if (L0 != -1) {
            bnVar.D0.b();
            if (L0 == 0 && bnVar.W6[0]) {
                if (i10 >= 0) {
                    bnVar.D9 = false;
                    bnVar.dd();
                }
            } else {
                h6.m[] mVarArr = bnVar.f46260y1.f19911e;
                if (1 < mVarArr.length) {
                    mVar = mVarArr[1];
                }
                if (mVar != null && ((te.a) mVar.f13966c).f57697f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i11 = this.f48123c;
                if (i10 > 0) {
                    if (!z12) {
                        float f10 = this.f48121a + i10;
                        this.f48121a = f10;
                        if (f10 > i11) {
                            this.f48121a = 0.0f;
                            bnVar.D9 = true;
                            bnVar.dd();
                            bnVar.f46272z1 = true;
                        }
                    }
                } else if (bnVar.f46272z1 && z12) {
                    float f11 = this.f48121a + i10;
                    this.f48121a = f11;
                    if (f11 < (-i11)) {
                        bnVar.D9 = false;
                        bnVar.dd();
                        this.f48121a = 0.0f;
                    }
                }
            }
        }
        bnVar.O9();
        bnVar.f46215u9.G();
        ArrayList arrayList = bnVar.Ua.G;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (!((mx) arrayList.get(i12)).f50008c) {
                ((mx) arrayList.get(i12)).f50007b -= i10;
            }
        }
        ch.l0 l0Var = ch.l0.B;
        if (l0Var != null) {
            l0Var.f5444r -= i10;
            if (i10 != 0) {
                l0Var.f5447u = true;
            }
        }
        bnVar.x7(false);
        hi.l3 l3Var = bnVar.M1;
        if (l3Var != null) {
            if (l3Var.W) {
                l3Var.f(true);
            } else if (!bnVar.f46283zc) {
                bnVar.f46270yc = System.currentTimeMillis();
                org.telegram.messenger.g0.r(new vf(bnVar, 29));
                org.telegram.messenger.g0.h3(new fj(bnVar, 0), 2000L);
            }
        }
        al alVar = bnVar.Q1;
        if (alVar != null && alVar.W) {
            alVar.f(true);
        }
        hi.l3 l3Var2 = bnVar.O1;
        if (l3Var2 != null && l3Var2.W) {
            l3Var2.f(true);
        } else {
            org.telegram.messenger.g0.r(new fj(bnVar, 1));
            org.telegram.messenger.g0.h3(new fj(bnVar, 2), 2000L);
        }
        hi.l3 l3Var3 = bnVar.P1;
        if (l3Var3 != null) {
            l3Var3.f(true);
        }
        rj rjVar = bnVar.f45946a0;
        if (rjVar != null) {
            rjVar.J0();
        }
        di.k6 k6Var = bnVar.Xc;
        if (k6Var != null) {
            k6Var.invalidate();
        }
        jh.a aVar = bnVar.f46218uc;
        if (aVar != null && aVar.f17770b > 0) {
            int childCount = aVar.f17769a.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 < childCount) {
                    View childAt = aVar.f17769a.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        z11 = aVar.a(((org.telegram.ui.Cells.r1) childAt).getMessageObject());
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        z11 = aVar.a(((org.telegram.ui.Cells.v0) childAt).getMessageObject());
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        break;
                    }
                    i13++;
                } else {
                    z14 = false;
                    break;
                }
            }
            if (!z14) {
                aVar.c(0, 0L);
            }
        }
    }
}
