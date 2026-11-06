package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class fj extends v4.s0 {
    public boolean f45641b;
    public final an d;
    public float f45640a = 0.0f;
    public final int f45642c = org.telegram.messenger.g0.L(100.0f);

    public fj(an anVar) {
        this.d = anVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        an anVar = this.d;
        if (i7 == 0) {
            org.telegram.ui.Cells.q1 q1Var = anVar.D2;
            if (q1Var != null) {
                an.p2(anVar, q1Var, -1, anVar.E2, anVar.F2);
                anVar.D2 = null;
            }
            anVar.f44016x3 = false;
            anVar.f44029y3 = false;
            anVar.f44041z3 = false;
            anVar.A3 = false;
            anVar.C9(true);
            anVar.D9(true);
            if (org.telegram.messenger.iz.o() == 0) {
                int i10 = an.f43707id;
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25009k1, 512);
            }
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25019m1, new Object[0]);
            anVar.f44038z0.setOverScrollMode(0);
            anVar.f43931q9.V();
            anVar.Cd(false);
            anVar.La = false;
            return;
        }
        fi.m3 m3Var = anVar.M1;
        if (m3Var != null && m3Var.V) {
            m3Var.f(true);
        }
        org.telegram.ui.Components.j6 j6Var = anVar.f43853k3;
        if (j6Var != null && j6Var.getVisibility() == 0 && anVar.T9()) {
            org.telegram.messenger.g0.v1(anVar.getParentActivity().getCurrentFocus());
        }
        if (i7 == 2) {
            anVar.P4 = true;
            anVar.f44041z3 = true;
        } else if (i7 == 1) {
            anVar.D2 = null;
            anVar.P4 = true;
            anVar.f44016x3 = true;
            anVar.f44029y3 = true;
            anVar.A3 = true;
            anVar.f44041z3 = true;
        }
        if (org.telegram.messenger.iz.o() == 0) {
            int i11 = an.f43707id;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25004j1, 512);
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.l1, new Object[0]);
        ch.r rVar = anVar.f43946ra;
        if (rVar != null && rVar.d()) {
            anVar.f43946ra.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        an anVar = this.d;
        anVar.f44038z0.invalidate();
        boolean z13 = true;
        if (i10 < 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f45641b = z9;
        int L0 = anVar.B0.L0();
        h6.m mVar = null;
        if (((i10 != 0 && anVar.La && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && anVar.Z4 != 0) {
            if (this.f45641b && !anVar.f43722a5) {
                if (!anVar.f44038z0.V1 && L0 != -1) {
                    int N0 = anVar.B0.N0();
                    org.telegram.messenger.ij ijVar = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = anVar.B0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.q1) {
                                ijVar = ((org.telegram.ui.Cells.q1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.t0) {
                                ijVar = ((org.telegram.ui.Cells.t0) m10).getMessageObject();
                            }
                            if (ijVar != null && anVar.Z4 == ijVar.f1()) {
                                z12 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    if (!z12 && ijVar != null && ijVar.f1() < anVar.Z4) {
                        anVar.Z4 = 0;
                    }
                }
            } else {
                anVar.Z4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            anVar.f43722a5 = false;
            if (!anVar.P4 && i10 != 0) {
                anVar.P4 = true;
            }
        }
        if (i10 != 0) {
            anVar.l1.getClass();
            anVar.E9(true);
        }
        if (i10 != 0 && anVar.f44016x3 && !anVar.f43964t3) {
            if (anVar.f43740b8 != Integer.MAX_VALUE) {
                anVar.hb();
                anVar.Cd(false);
            }
            anVar.ic(true);
        }
        if (anVar.O9() && i10 != 0 && anVar.f44029y3 && !anVar.f43964t3) {
            if (anVar.f43740b8 != Integer.MAX_VALUE) {
                anVar.hb();
                anVar.Cd(false);
            }
            anVar.jc(true);
        }
        anVar.o7(true);
        if (L0 != -1) {
            anVar.C0.b();
            if (L0 == 0 && anVar.U6[0]) {
                if (i10 >= 0) {
                    anVar.z9 = false;
                    anVar.Zc();
                }
            } else {
                h6.m[] mVarArr = anVar.f44014x1.f18383e;
                if (1 < mVarArr.length) {
                    mVar = mVarArr[1];
                }
                if (mVar != null && ((te.a) mVar.f14265c).f55396f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i11 = this.f45642c;
                if (i10 > 0) {
                    if (!z11) {
                        float f10 = this.f45640a + i10;
                        this.f45640a = f10;
                        if (f10 > i11) {
                            this.f45640a = 0.0f;
                            anVar.z9 = true;
                            anVar.Zc();
                            anVar.f44027y1 = true;
                        }
                    }
                } else if (anVar.f44027y1 && z11) {
                    float f11 = this.f45640a + i10;
                    this.f45640a = f11;
                    if (f11 < (-i11)) {
                        anVar.z9 = false;
                        anVar.Zc();
                        this.f45640a = 0.0f;
                    }
                }
            }
        }
        anVar.M9();
        anVar.f43931q9.G();
        ArrayList arrayList = anVar.Qa.F;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (!((hx) arrayList.get(i12)).f46507c) {
                ((hx) arrayList.get(i12)).f46506b -= i10;
            }
        }
        ch.k0 k0Var = ch.k0.B;
        if (k0Var != null) {
            k0Var.f6297r -= i10;
            if (i10 != 0) {
                k0Var.f6300u = true;
            }
        }
        anVar.w7(false);
        fi.m3 m3Var = anVar.L1;
        if (m3Var != null) {
            if (m3Var.V) {
                m3Var.f(true);
            } else if (!anVar.f43998vc) {
                anVar.f43985uc = System.currentTimeMillis();
                org.telegram.messenger.g0.r(new xf(anVar, 29));
                org.telegram.messenger.g0.i3(new ej(anVar, 0), 2000L);
            }
        }
        zk zkVar = anVar.P1;
        if (zkVar != null && zkVar.V) {
            zkVar.f(true);
        }
        fi.m3 m3Var2 = anVar.N1;
        if (m3Var2 != null && m3Var2.V) {
            m3Var2.f(true);
        } else {
            org.telegram.messenger.g0.r(new ej(anVar, 1));
            org.telegram.messenger.g0.i3(new ej(anVar, 2), 2000L);
        }
        fi.m3 m3Var3 = anVar.O1;
        if (m3Var3 != null) {
            m3Var3.f(true);
        }
        qj qjVar = anVar.Z;
        if (qjVar != null) {
            qjVar.i0();
        }
        bi.p7 p7Var = anVar.Tc;
        if (p7Var != null) {
            p7Var.invalidate();
        }
        jh.a aVar = anVar.f43934qc;
        if (aVar != null && aVar.f17007b > 0) {
            int childCount = aVar.f17006a.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 < childCount) {
                    View childAt = aVar.f17006a.getChildAt(i13);
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
