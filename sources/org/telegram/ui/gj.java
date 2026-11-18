package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class gj extends v4.u0 {
    public boolean f48117b;
    public final bn d;
    public float f48116a = 0.0f;
    public final int f48118c = org.telegram.messenger.g0.L(100.0f);

    public gj(bn bnVar) {
        this.d = bnVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        bn bnVar = this.d;
        if (i7 == 0) {
            org.telegram.ui.Cells.q1 q1Var = bnVar.E2;
            if (q1Var != null) {
                bn.q2(bnVar, q1Var, -1, bnVar.F2, bnVar.G2);
                bnVar.E2 = null;
            }
            bnVar.f46248y3 = false;
            bnVar.f46260z3 = false;
            bnVar.A3 = false;
            bnVar.B3 = false;
            bnVar.E9(true);
            bnVar.F9(true);
            if (org.telegram.messenger.bz.o() == 0) {
                int i10 = bn.f45922md;
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25142k1, 512);
            }
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25152m1, new Object[0]);
            bnVar.A0.setOverScrollMode(0);
            bnVar.f46201u9.V();
            bnVar.Gd(false);
            bnVar.Pa = false;
            return;
        }
        hi.m3 m3Var = bnVar.N1;
        if (m3Var != null && m3Var.W) {
            m3Var.f(true);
        }
        org.telegram.ui.Components.n6 n6Var = bnVar.f46082l3;
        if (n6Var != null && n6Var.getVisibility() == 0 && bnVar.V9()) {
            org.telegram.messenger.g0.v1(bnVar.getParentActivity().getCurrentFocus());
        }
        if (i7 == 2) {
            bnVar.R4 = true;
            bnVar.A3 = true;
        } else if (i7 == 1) {
            bnVar.E2 = null;
            bnVar.R4 = true;
            bnVar.f46248y3 = true;
            bnVar.f46260z3 = true;
            bnVar.B3 = true;
            bnVar.A3 = true;
        }
        if (org.telegram.messenger.bz.o() == 0) {
            int i11 = bn.f45922md;
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25137j1, 512);
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.l1, new Object[0]);
        ch.s sVar = bnVar.f46215va;
        if (sVar != null && sVar.d()) {
            bnVar.f46215va.setHiddenByScroll(true);
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
        this.f48117b = z10;
        int L0 = bnVar.C0.L0();
        h6.m mVar = null;
        if (((i10 != 0 && bnVar.Pa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && bnVar.f45952b5 != 0) {
            if (this.f48117b && !bnVar.f45966c5) {
                if (!bnVar.A0.W1 && L0 != -1) {
                    int N0 = bnVar.C0.N0();
                    org.telegram.messenger.fj fjVar = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = bnVar.C0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.q1) {
                                fjVar = ((org.telegram.ui.Cells.q1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.u0) {
                                fjVar = ((org.telegram.ui.Cells.u0) m10).getMessageObject();
                            }
                            if (fjVar != null && bnVar.f45952b5 == fjVar.e1()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && fjVar != null && fjVar.e1() < bnVar.f45952b5) {
                        bnVar.f45952b5 = 0;
                    }
                }
            } else {
                bnVar.f45952b5 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            bnVar.f45966c5 = false;
            if (!bnVar.R4 && i10 != 0) {
                bnVar.R4 = true;
            }
        }
        if (i10 != 0) {
            bnVar.f46093m1.getClass();
            bnVar.G9(true);
        }
        if (i10 != 0 && bnVar.f46248y3 && !bnVar.f46195u3) {
            if (bnVar.f45982d8 != Integer.MAX_VALUE) {
                bnVar.lb();
                bnVar.Gd(false);
            }
            bnVar.mc(true);
        }
        if (bnVar.Q9() && i10 != 0 && bnVar.f46260z3 && !bnVar.f46195u3) {
            if (bnVar.f45982d8 != Integer.MAX_VALUE) {
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
                h6.m[] mVarArr = bnVar.f46246y1.f19886e;
                if (1 < mVarArr.length) {
                    mVar = mVarArr[1];
                }
                if (mVar != null && ((te.a) mVar.f13940c).f57658f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i11 = this.f48118c;
                if (i10 > 0) {
                    if (!z12) {
                        float f10 = this.f48116a + i10;
                        this.f48116a = f10;
                        if (f10 > i11) {
                            this.f48116a = 0.0f;
                            bnVar.D9 = true;
                            bnVar.dd();
                            bnVar.f46258z1 = true;
                        }
                    }
                } else if (bnVar.f46258z1 && z12) {
                    float f11 = this.f48116a + i10;
                    this.f48116a = f11;
                    if (f11 < (-i11)) {
                        bnVar.D9 = false;
                        bnVar.dd();
                        this.f48116a = 0.0f;
                    }
                }
            }
        }
        bnVar.O9();
        bnVar.f46201u9.G();
        ArrayList arrayList = bnVar.Ua.G;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (!((mx) arrayList.get(i12)).f49993c) {
                ((mx) arrayList.get(i12)).f49992b -= i10;
            }
        }
        ch.l0 l0Var = ch.l0.B;
        if (l0Var != null) {
            l0Var.f5418r -= i10;
            if (i10 != 0) {
                l0Var.f5421u = true;
            }
        }
        bnVar.x7(false);
        hi.m3 m3Var = bnVar.M1;
        if (m3Var != null) {
            if (m3Var.W) {
                m3Var.f(true);
            } else if (!bnVar.f46269zc) {
                bnVar.f46256yc = System.currentTimeMillis();
                org.telegram.messenger.g0.r(new vf(bnVar, 29));
                org.telegram.messenger.g0.h3(new fj(bnVar, 0), 2000L);
            }
        }
        al alVar = bnVar.Q1;
        if (alVar != null && alVar.W) {
            alVar.f(true);
        }
        hi.m3 m3Var2 = bnVar.O1;
        if (m3Var2 != null && m3Var2.W) {
            m3Var2.f(true);
        } else {
            org.telegram.messenger.g0.r(new fj(bnVar, 1));
            org.telegram.messenger.g0.h3(new fj(bnVar, 2), 2000L);
        }
        hi.m3 m3Var3 = bnVar.P1;
        if (m3Var3 != null) {
            m3Var3.f(true);
        }
        rj rjVar = bnVar.f45932a0;
        if (rjVar != null) {
            rjVar.F0();
        }
        di.k6 k6Var = bnVar.Xc;
        if (k6Var != null) {
            k6Var.invalidate();
        }
        jh.a aVar = bnVar.f46204uc;
        if (aVar != null && aVar.f17748b > 0) {
            int childCount = aVar.f17747a.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 < childCount) {
                    View childAt = aVar.f17747a.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        z11 = aVar.a(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                    } else if (childAt instanceof org.telegram.ui.Cells.u0) {
                        z11 = aVar.a(((org.telegram.ui.Cells.u0) childAt).getMessageObject());
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
