package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class fj extends v4.t0 {
    public boolean f47132b;
    public final an d;
    public float f47131a = 0.0f;
    public final int f47133c = org.telegram.messenger.g0.L(100.0f);

    public fj(an anVar) {
        this.d = anVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        an anVar = this.d;
        if (i7 == 0) {
            org.telegram.ui.Cells.q1 q1Var = anVar.E2;
            if (q1Var != null) {
                an.q2(anVar, q1Var, -1, anVar.F2, anVar.G2);
                anVar.E2 = null;
            }
            anVar.f45432y3 = false;
            anVar.f45444z3 = false;
            anVar.A3 = false;
            anVar.B3 = false;
            anVar.E9(true);
            anVar.F9(true);
            if (org.telegram.messenger.gz.o() == 0) {
                int i10 = an.f45107ld;
                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25523k1, 512);
            }
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25533m1, new Object[0]);
            anVar.A0.setOverScrollMode(0);
            anVar.f45372t9.V();
            anVar.Gd(false);
            anVar.Oa = false;
            return;
        }
        hi.l3 l3Var = anVar.N1;
        if (l3Var != null && l3Var.W) {
            l3Var.f(true);
        }
        org.telegram.ui.Components.h6 h6Var = anVar.f45267l3;
        if (h6Var != null && h6Var.getVisibility() == 0 && anVar.V9()) {
            org.telegram.messenger.g0.v1(anVar.getParentActivity().getCurrentFocus());
        }
        if (i7 == 2) {
            anVar.Q4 = true;
            anVar.A3 = true;
        } else if (i7 == 1) {
            anVar.E2 = null;
            anVar.Q4 = true;
            anVar.f45432y3 = true;
            anVar.f45444z3 = true;
            anVar.B3 = true;
            anVar.A3 = true;
        }
        if (org.telegram.messenger.gz.o() == 0) {
            int i11 = an.f45107ld;
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25518j1, 512);
        }
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.l1, new Object[0]);
        ch.r rVar = anVar.f45386ua;
        if (rVar != null && rVar.d()) {
            anVar.f45386ua.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        an anVar = this.d;
        anVar.A0.invalidate();
        boolean z14 = true;
        if (i10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47132b = z10;
        int L0 = anVar.C0.L0();
        h6.m mVar = null;
        if (((i10 != 0 && anVar.Oa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && anVar.f45122a5 != 0) {
            if (this.f47132b && !anVar.f45137b5) {
                if (!anVar.A0.W1 && L0 != -1) {
                    int N0 = anVar.C0.N0();
                    org.telegram.messenger.gj gjVar = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = anVar.C0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.q1) {
                                gjVar = ((org.telegram.ui.Cells.q1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.t0) {
                                gjVar = ((org.telegram.ui.Cells.t0) m10).getMessageObject();
                            }
                            if (gjVar != null && anVar.f45122a5 == gjVar.e1()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && gjVar != null && gjVar.e1() < anVar.f45122a5) {
                        anVar.f45122a5 = 0;
                    }
                }
            } else {
                anVar.f45122a5 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            anVar.f45137b5 = false;
            if (!anVar.Q4 && i10 != 0) {
                anVar.Q4 = true;
            }
        }
        if (i10 != 0) {
            anVar.f45277m1.getClass();
            anVar.G9(true);
        }
        if (i10 != 0 && anVar.f45432y3 && !anVar.f45379u3) {
            if (anVar.f45154c8 != Integer.MAX_VALUE) {
                anVar.lb();
                anVar.Gd(false);
            }
            anVar.mc(true);
        }
        if (anVar.Q9() && i10 != 0 && anVar.f45444z3 && !anVar.f45379u3) {
            if (anVar.f45154c8 != Integer.MAX_VALUE) {
                anVar.lb();
                anVar.Gd(false);
            }
            anVar.nc(true);
        }
        anVar.p7(true);
        if (L0 != -1) {
            anVar.D0.b();
            if (L0 == 0 && anVar.V6[0]) {
                if (i10 >= 0) {
                    anVar.C9 = false;
                    anVar.dd();
                }
            } else {
                h6.m[] mVarArr = anVar.f45430y1.f19519e;
                if (1 < mVarArr.length) {
                    mVar = mVarArr[1];
                }
                if (mVar != null && ((te.a) mVar.f13625c).f57086f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i11 = this.f47133c;
                if (i10 > 0) {
                    if (!z12) {
                        float f10 = this.f47131a + i10;
                        this.f47131a = f10;
                        if (f10 > i11) {
                            this.f47131a = 0.0f;
                            anVar.C9 = true;
                            anVar.dd();
                            anVar.f45442z1 = true;
                        }
                    }
                } else if (anVar.f45442z1 && z12) {
                    float f11 = this.f47131a + i10;
                    this.f47131a = f11;
                    if (f11 < (-i11)) {
                        anVar.C9 = false;
                        anVar.dd();
                        this.f47131a = 0.0f;
                    }
                }
            }
        }
        anVar.O9();
        anVar.f45372t9.G();
        ArrayList arrayList = anVar.Ta.G;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (!((ix) arrayList.get(i12)).f48126c) {
                ((ix) arrayList.get(i12)).f48125b -= i10;
            }
        }
        ch.l0 l0Var = ch.l0.B;
        if (l0Var != null) {
            l0Var.f5130r -= i10;
            if (i10 != 0) {
                l0Var.f5133u = true;
            }
        }
        anVar.x7(false);
        hi.l3 l3Var = anVar.M1;
        if (l3Var != null) {
            if (l3Var.W) {
                l3Var.f(true);
            } else if (!anVar.f45440yc) {
                anVar.xc = System.currentTimeMillis();
                org.telegram.messenger.g0.r(new uf(anVar, 29));
                org.telegram.messenger.g0.i3(new ej(anVar, 0), 2000L);
            }
        }
        zk zkVar = anVar.Q1;
        if (zkVar != null && zkVar.W) {
            zkVar.f(true);
        }
        hi.l3 l3Var2 = anVar.O1;
        if (l3Var2 != null && l3Var2.W) {
            l3Var2.f(true);
        } else {
            org.telegram.messenger.g0.r(new ej(anVar, 1));
            org.telegram.messenger.g0.i3(new ej(anVar, 2), 2000L);
        }
        hi.l3 l3Var3 = anVar.P1;
        if (l3Var3 != null) {
            l3Var3.f(true);
        }
        qj qjVar = anVar.f45117a0;
        if (qjVar != null) {
            qjVar.x0();
        }
        di.h6 h6Var = anVar.Wc;
        if (h6Var != null) {
            h6Var.invalidate();
        }
        jh.a aVar = anVar.f45375tc;
        if (aVar != null && aVar.f17362b > 0) {
            int childCount = aVar.f17361a.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 < childCount) {
                    View childAt = aVar.f17361a.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        z11 = aVar.a(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        z11 = aVar.a(((org.telegram.ui.Cells.t0) childAt).getMessageObject());
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
