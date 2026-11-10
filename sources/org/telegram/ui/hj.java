package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class hj extends v4.s0 {
    public boolean f46365b;
    public final cn d;
    public float f46364a = 0.0f;
    public final int f46366c = org.telegram.messenger.g0.L(100.0f);

    public hj(cn cnVar) {
        this.d = cnVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        cn cnVar = this.d;
        if (i7 == 0) {
            org.telegram.ui.Cells.q1 q1Var = cnVar.D2;
            if (q1Var != null) {
                cn.q2(cnVar, q1Var, -1, cnVar.E2, cnVar.F2);
                cnVar.D2 = null;
            }
            cnVar.f44719x3 = false;
            cnVar.f44732y3 = false;
            cnVar.f44744z3 = false;
            cnVar.A3 = false;
            cnVar.D9(true);
            cnVar.E9(true);
            if (org.telegram.messenger.iz.o() == 0) {
                int i10 = cn.f44408kd;
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25030k1, 512);
            }
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25040m1, new Object[0]);
            cnVar.f44741z0.setOverScrollMode(0);
            cnVar.s9.V();
            cnVar.Fd(false);
            cnVar.Na = false;
            return;
        }
        fi.m3 m3Var = cnVar.M1;
        if (m3Var != null && m3Var.V) {
            m3Var.f(true);
        }
        org.telegram.ui.Components.i6 i6Var = cnVar.f44556k3;
        if (i6Var != null && i6Var.getVisibility() == 0 && cnVar.U9()) {
            org.telegram.messenger.g0.v1(cnVar.getParentActivity().getCurrentFocus());
        }
        if (i7 == 2) {
            cnVar.P4 = true;
            cnVar.f44744z3 = true;
        } else if (i7 == 1) {
            cnVar.D2 = null;
            cnVar.P4 = true;
            cnVar.f44719x3 = true;
            cnVar.f44732y3 = true;
            cnVar.A3 = true;
            cnVar.f44744z3 = true;
        }
        if (org.telegram.messenger.iz.o() == 0) {
            int i11 = cn.f44408kd;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25025j1, 512);
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.l1, new Object[0]);
        ch.r rVar = cnVar.f44673ta;
        if (rVar != null && rVar.d()) {
            cnVar.f44673ta.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        cn cnVar = this.d;
        cnVar.f44741z0.invalidate();
        boolean z13 = true;
        if (i10 < 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f46365b = z9;
        int L0 = cnVar.B0.L0();
        h6.m mVar = null;
        if (((i10 != 0 && cnVar.Na && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && cnVar.Z4 != 0) {
            if (this.f46365b && !cnVar.f44423a5) {
                if (!cnVar.f44741z0.V1 && L0 != -1) {
                    int N0 = cnVar.B0.N0();
                    org.telegram.messenger.ij ijVar = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = cnVar.B0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.q1) {
                                ijVar = ((org.telegram.ui.Cells.q1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.t0) {
                                ijVar = ((org.telegram.ui.Cells.t0) m10).getMessageObject();
                            }
                            if (ijVar != null && cnVar.Z4 == ijVar.e1()) {
                                z12 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    if (!z12 && ijVar != null && ijVar.e1() < cnVar.Z4) {
                        cnVar.Z4 = 0;
                    }
                }
            } else {
                cnVar.Z4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            cnVar.f44423a5 = false;
            if (!cnVar.P4 && i10 != 0) {
                cnVar.P4 = true;
            }
        }
        if (i10 != 0) {
            cnVar.l1.getClass();
            cnVar.F9(true);
        }
        if (i10 != 0 && cnVar.f44719x3 && !cnVar.f44667t3) {
            if (cnVar.f44441b8 != Integer.MAX_VALUE) {
                cnVar.kb();
                cnVar.Fd(false);
            }
            cnVar.lc(true);
        }
        if (cnVar.P9() && i10 != 0 && cnVar.f44732y3 && !cnVar.f44667t3) {
            if (cnVar.f44441b8 != Integer.MAX_VALUE) {
                cnVar.kb();
                cnVar.Fd(false);
            }
            cnVar.mc(true);
        }
        cnVar.p7(true);
        if (L0 != -1) {
            cnVar.C0.b();
            if (L0 == 0 && cnVar.U6[0]) {
                if (i10 >= 0) {
                    cnVar.B9 = false;
                    cnVar.cd();
                }
            } else {
                h6.m[] mVarArr = cnVar.f44717x1.f18389e;
                if (1 < mVarArr.length) {
                    mVar = mVarArr[1];
                }
                if (mVar != null && ((te.a) mVar.f14267c).f55499f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i11 = this.f46366c;
                if (i10 > 0) {
                    if (!z11) {
                        float f10 = this.f46364a + i10;
                        this.f46364a = f10;
                        if (f10 > i11) {
                            this.f46364a = 0.0f;
                            cnVar.B9 = true;
                            cnVar.cd();
                            cnVar.f44730y1 = true;
                        }
                    }
                } else if (cnVar.f44730y1 && z11) {
                    float f11 = this.f46364a + i10;
                    this.f46364a = f11;
                    if (f11 < (-i11)) {
                        cnVar.B9 = false;
                        cnVar.cd();
                        this.f46364a = 0.0f;
                    }
                }
            }
        }
        cnVar.N9();
        cnVar.s9.G();
        ArrayList arrayList = cnVar.Sa.F;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (!((kx) arrayList.get(i12)).f47442c) {
                ((kx) arrayList.get(i12)).f47441b -= i10;
            }
        }
        ch.k0 k0Var = ch.k0.B;
        if (k0Var != null) {
            k0Var.f6300r -= i10;
            if (i10 != 0) {
                k0Var.f6303u = true;
            }
        }
        cnVar.x7(false);
        fi.m3 m3Var = cnVar.L1;
        if (m3Var != null) {
            if (m3Var.V) {
                m3Var.f(true);
            } else if (!cnVar.xc) {
                cnVar.wc = System.currentTimeMillis();
                org.telegram.messenger.g0.r(new xf(cnVar, 29));
                org.telegram.messenger.g0.i3(new gj(cnVar, 0), 2000L);
            }
        }
        bl blVar = cnVar.P1;
        if (blVar != null && blVar.V) {
            blVar.f(true);
        }
        fi.m3 m3Var2 = cnVar.N1;
        if (m3Var2 != null && m3Var2.V) {
            m3Var2.f(true);
        } else {
            org.telegram.messenger.g0.r(new gj(cnVar, 1));
            org.telegram.messenger.g0.i3(new gj(cnVar, 2), 2000L);
        }
        fi.m3 m3Var3 = cnVar.O1;
        if (m3Var3 != null) {
            m3Var3.f(true);
        }
        sj sjVar = cnVar.Z;
        if (sjVar != null) {
            sjVar.i0();
        }
        bi.p7 p7Var = cnVar.Vc;
        if (p7Var != null) {
            p7Var.invalidate();
        }
        jh.a aVar = cnVar.f44663sc;
        if (aVar != null && aVar.f17010b > 0) {
            int childCount = aVar.f17009a.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 < childCount) {
                    View childAt = aVar.f17009a.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        z10 = aVar.a(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        z10 = aVar.a(((org.telegram.ui.Cells.t0) childAt).getMessageObject());
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    i13++;
                } else {
                    z13 = false;
                    break;
                }
            }
            if (!z13) {
                aVar.c(0, 0L);
            }
        }
    }
}
