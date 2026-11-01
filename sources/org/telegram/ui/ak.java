package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ak extends s4.s0 {
    public boolean f35798b;
    public final un d;
    public float f35797a = 0.0f;
    public final int f35799c = org.telegram.messenger.i0.L(100.0f);

    public ak(un unVar) {
        this.d = unVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        un unVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.q1 q1Var = unVar.D2;
            if (q1Var != null) {
                unVar.B2.e(q1Var, -1, unVar.E2, unVar.F2, true);
                unVar.D2 = null;
            }
            unVar.f42281x3 = false;
            unVar.y3 = false;
            unVar.f42306z3 = false;
            unVar.A3 = false;
            unVar.x9(true);
            unVar.y9(true);
            if (org.telegram.messenger.uz.o() == 0) {
                int i11 = un.f41979bd;
                org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14735k1, 512);
            }
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14744m1, new Object[0]);
            unVar.f42303z0.setOverScrollMode(0);
            unVar.f42197q9.V();
            unVar.xd(false);
            unVar.La = false;
            return;
        }
        vh.p2 p2Var = unVar.M1;
        if (p2Var != null && p2Var.V) {
            p2Var.e(true);
        }
        org.telegram.ui.Components.f6 f6Var = unVar.f42118k3;
        if (f6Var != null && f6Var.getVisibility() == 0 && unVar.O9()) {
            org.telegram.messenger.i0.v1(unVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            unVar.P4 = true;
            unVar.f42306z3 = true;
        } else if (i10 == 1) {
            unVar.D2 = null;
            unVar.P4 = true;
            unVar.f42281x3 = true;
            unVar.y3 = true;
            unVar.A3 = true;
            unVar.f42306z3 = true;
        }
        if (org.telegram.messenger.uz.o() == 0) {
            int i12 = un.f41979bd;
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14729j1, 512);
        }
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.l1, new Object[0]);
        sg.s sVar = unVar.f42211ra;
        if (sVar != null && sVar.d()) {
            unVar.f42211ra.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        un unVar = this.d;
        unVar.f42303z0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35798b = z10;
        int L0 = unVar.B0.L0();
        android.support.v4.media.session.a0 a0Var = null;
        if (((i11 != 0 && unVar.La && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && unVar.Z4 != 0) {
            if (this.f35798b && !unVar.f41993a5) {
                if (!unVar.f42303z0.V1 && L0 != -1) {
                    int N0 = unVar.B0.N0();
                    org.telegram.messenger.kj kjVar = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = unVar.B0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.q1) {
                                kjVar = ((org.telegram.ui.Cells.q1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.s0) {
                                kjVar = ((org.telegram.ui.Cells.s0) m10).getMessageObject();
                            }
                            if (kjVar != null && unVar.Z4 == kjVar.f1()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && kjVar != null && kjVar.f1() < unVar.Z4) {
                        unVar.Z4 = 0;
                    }
                }
            } else {
                unVar.Z4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            unVar.f41993a5 = false;
            if (!unVar.P4 && i11 != 0) {
                unVar.P4 = true;
            }
        }
        if (i11 != 0) {
            unVar.l1.getClass();
            unVar.z9(true);
        }
        if (i11 != 0 && unVar.f42281x3 && !unVar.f42230t3) {
            if (unVar.f42011b8 != Integer.MAX_VALUE) {
                unVar.cb();
                unVar.xd(false);
            }
            unVar.dc(true);
        }
        if (unVar.J9() && i11 != 0 && unVar.y3 && !unVar.f42230t3) {
            if (unVar.f42011b8 != Integer.MAX_VALUE) {
                unVar.cb();
                unVar.xd(false);
            }
            unVar.ec(true);
        }
        unVar.m7(true);
        if (L0 != -1) {
            unVar.C0.b();
            if (L0 == 0 && unVar.U6[0]) {
                if (i11 >= 0) {
                    unVar.f42312z9 = false;
                    unVar.Uc();
                }
            } else {
                android.support.v4.media.session.a0[] a0VarArr = unVar.f42279x1.e;
                if (1 < a0VarArr.length) {
                    a0Var = a0VarArr[1];
                }
                if (a0Var != null && ((fe.b) a0Var.f876c).f7022f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f35799c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.f35797a + i11;
                        this.f35797a = f7;
                        if (f7 > i12) {
                            this.f35797a = 0.0f;
                            unVar.f42312z9 = true;
                            unVar.Uc();
                            unVar.f42292y1 = true;
                        }
                    }
                } else if (unVar.f42292y1 && z12) {
                    float f10 = this.f35797a + i11;
                    this.f35797a = f10;
                    if (f10 < (-i12)) {
                        unVar.f42312z9 = false;
                        unVar.Uc();
                        this.f35797a = 0.0f;
                    }
                }
            }
        }
        unVar.H9();
        unVar.f42197q9.G();
        ArrayList arrayList = unVar.Qa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((jy) arrayList.get(i13)).f38580c) {
                ((jy) arrayList.get(i13)).f38579b -= i11;
            }
        }
        sg.k0 k0Var = sg.k0.B;
        if (k0Var != null) {
            k0Var.f48390r -= i11;
            if (i11 != 0) {
                k0Var.f48393u = true;
            }
        }
        unVar.u7(false);
        vh.p2 p2Var = unVar.L1;
        if (p2Var != null) {
            if (p2Var.V) {
                p2Var.e(true);
            } else if (!unVar.rc) {
                unVar.qc = System.currentTimeMillis();
                org.telegram.messenger.i0.r(new ng(unVar, 28));
                org.telegram.messenger.i0.h3(new ng(unVar, 29), 2000L);
            }
        }
        wl wlVar = unVar.P1;
        if (wlVar != null && wlVar.V) {
            wlVar.e(true);
        }
        vh.p2 p2Var2 = unVar.N1;
        if (p2Var2 != null && p2Var2.V) {
            p2Var2.e(true);
        } else {
            org.telegram.messenger.i0.r(new zj(unVar, 0));
            org.telegram.messenger.i0.h3(new zj(unVar, 1), 2000L);
        }
        vh.p2 p2Var3 = unVar.O1;
        if (p2Var3 != null) {
            p2Var3.e(true);
        }
        mk mkVar = unVar.Z;
        if (mkVar != null) {
            mkVar.h0();
        }
        rh.i4 i4Var = unVar.Mc;
        if (i4Var != null) {
            i4Var.invalidate();
        }
        zg.a aVar = unVar.f42150mc;
        if (aVar != null && aVar.f55735b > 0) {
            int childCount = aVar.f55734a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar.f55734a.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        z11 = aVar.a(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                    } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                        z11 = aVar.a(((org.telegram.ui.Cells.s0) childAt).getMessageObject());
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        break;
                    }
                    i14++;
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
