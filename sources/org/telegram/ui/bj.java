package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class bj extends u4.t0 {
    public boolean f44054b;
    public final wm d;
    public float f44053a = 0.0f;
    public final int f44055c = org.telegram.messenger.g0.L(100.0f);

    public bj(wm wmVar) {
        this.d = wmVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i3) {
        wm wmVar = this.d;
        if (i3 == 0) {
            org.telegram.ui.Cells.q1 q1Var = wmVar.E2;
            if (q1Var != null) {
                wm.p2(wmVar, q1Var, -1, wmVar.F2, wmVar.G2);
                wmVar.E2 = null;
            }
            wmVar.f51551y3 = false;
            wmVar.f51562z3 = false;
            wmVar.A3 = false;
            wmVar.B3 = false;
            wmVar.C9(true);
            wmVar.D9(true);
            if (org.telegram.messenger.az.o() == 0) {
                int i10 = wm.f51227jd;
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 512);
            }
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.m1, new Object[0]);
            wmVar.A0.setOverScrollMode(0);
            wmVar.r9.V();
            wmVar.Cd(false);
            wmVar.Ma = false;
            return;
        }
        gi.l3 l3Var = wmVar.N1;
        if (l3Var != null && l3Var.W) {
            l3Var.f(true);
        }
        org.telegram.ui.Components.h6 h6Var = wmVar.f51386l3;
        if (h6Var != null && h6Var.getVisibility() == 0 && wmVar.T9()) {
            org.telegram.messenger.g0.v1(wmVar.getParentActivity().getCurrentFocus());
        }
        if (i3 == 2) {
            wmVar.Q4 = true;
            wmVar.A3 = true;
        } else if (i3 == 1) {
            wmVar.E2 = null;
            wmVar.Q4 = true;
            wmVar.f51551y3 = true;
            wmVar.f51562z3 = true;
            wmVar.B3 = true;
            wmVar.A3 = true;
        }
        if (org.telegram.messenger.az.o() == 0) {
            int i11 = wm.f51227jd;
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23249j1, 512);
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23260l1, new Object[0]);
        dh.r rVar = wmVar.f51480sa;
        if (rVar != null && rVar.d()) {
            wmVar.f51480sa.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        wm wmVar = this.d;
        wmVar.A0.invalidate();
        boolean z14 = true;
        if (i10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44054b = z10;
        int L0 = wmVar.C0.L0();
        k4.j jVar = null;
        if (((i10 != 0 && wmVar.Ma && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && wmVar.f51242a5 != 0) {
            if (this.f44054b && !wmVar.f51256b5) {
                if (!wmVar.A0.W1 && L0 != -1) {
                    int N0 = wmVar.C0.N0();
                    org.telegram.messenger.zi ziVar = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = wmVar.C0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.q1) {
                                ziVar = ((org.telegram.ui.Cells.q1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.t0) {
                                ziVar = ((org.telegram.ui.Cells.t0) m10).getMessageObject();
                            }
                            if (ziVar != null && wmVar.f51242a5 == ziVar.f1()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && ziVar != null && ziVar.f1() < wmVar.f51242a5) {
                        wmVar.f51242a5 = 0;
                    }
                }
            } else {
                wmVar.f51242a5 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            wmVar.f51256b5 = false;
            if (!wmVar.Q4 && i10 != 0) {
                wmVar.Q4 = true;
            }
        }
        if (i10 != 0) {
            wmVar.m1.getClass();
            wmVar.E9(true);
        }
        if (i10 != 0 && wmVar.f51551y3 && !wmVar.f51498u3) {
            if (wmVar.f51273c8 != Integer.MAX_VALUE) {
                wmVar.hb();
                wmVar.Cd(false);
            }
            wmVar.ic(true);
        }
        if (wmVar.O9() && i10 != 0 && wmVar.f51562z3 && !wmVar.f51498u3) {
            if (wmVar.f51273c8 != Integer.MAX_VALUE) {
                wmVar.hb();
                wmVar.Cd(false);
            }
            wmVar.jc(true);
        }
        wmVar.o7(true);
        if (L0 != -1) {
            wmVar.D0.b();
            if (L0 == 0 && wmVar.V6[0]) {
                if (i10 >= 0) {
                    wmVar.A9 = false;
                    wmVar.Zc();
                }
            } else {
                k4.j[] jVarArr = wmVar.f51549y1.f19425e;
                if (1 < jVarArr.length) {
                    jVar = jVarArr[1];
                }
                if (jVar != null && ((qe.a) jVar.f16870b).f53841f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i11 = this.f44055c;
                if (i10 > 0) {
                    if (!z12) {
                        float f10 = this.f44053a + i10;
                        this.f44053a = f10;
                        if (f10 > i11) {
                            this.f44053a = 0.0f;
                            wmVar.A9 = true;
                            wmVar.Zc();
                            wmVar.f51560z1 = true;
                        }
                    }
                } else if (wmVar.f51560z1 && z12) {
                    float f11 = this.f44053a + i10;
                    this.f44053a = f11;
                    if (f11 < (-i11)) {
                        wmVar.A9 = false;
                        wmVar.Zc();
                        this.f44053a = 0.0f;
                    }
                }
            }
        }
        wmVar.M9();
        wmVar.r9.G();
        ArrayList arrayList = wmVar.Ra.G;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (!((ex) arrayList.get(i12)).f45065c) {
                ((ex) arrayList.get(i12)).f45064b -= i10;
            }
        }
        dh.j0 j0Var = dh.j0.B;
        if (j0Var != null) {
            j0Var.f9049r -= i10;
            if (i10 != 0) {
                j0Var.f9052u = true;
            }
        }
        wmVar.w7(false);
        gi.l3 l3Var = wmVar.M1;
        if (l3Var != null) {
            if (l3Var.W) {
                l3Var.f(true);
            } else if (!wmVar.f51533wc) {
                wmVar.f51519vc = System.currentTimeMillis();
                org.telegram.messenger.g0.r(new tf(wmVar, 29));
                org.telegram.messenger.g0.i3(new aj(wmVar, 0), 2000L);
            }
        }
        vk vkVar = wmVar.Q1;
        if (vkVar != null && vkVar.W) {
            vkVar.f(true);
        }
        gi.l3 l3Var2 = wmVar.O1;
        if (l3Var2 != null && l3Var2.W) {
            l3Var2.f(true);
        } else {
            org.telegram.messenger.g0.r(new aj(wmVar, 1));
            org.telegram.messenger.g0.i3(new aj(wmVar, 2), 2000L);
        }
        gi.l3 l3Var3 = wmVar.P1;
        if (l3Var3 != null) {
            l3Var3.f(true);
        }
        mj mjVar = wmVar.f51237a0;
        if (mjVar != null) {
            mjVar.i0();
        }
        ci.q6 q6Var = wmVar.Uc;
        if (q6Var != null) {
            q6Var.invalidate();
        }
        kh.a aVar = wmVar.f51469rc;
        if (aVar != null && aVar.f17252b > 0) {
            int childCount = aVar.f17251a.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 < childCount) {
                    View childAt = aVar.f17251a.getChildAt(i13);
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
