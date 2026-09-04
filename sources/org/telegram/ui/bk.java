package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class bk extends s4.s0 {
    public boolean f34825b;
    public final co d;
    public float f34824a = 0.0f;
    public final int f34826c = AndroidUtilities.dp(100.0f);

    public bk(co coVar) {
        this.d = coVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        co coVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.t1 t1Var = coVar.f35372p2;
            if (t1Var != null) {
                coVar.f35349n2.e(t1Var, -1, coVar.f35384q2, coVar.f35397r2, true);
                coVar.f35372p2 = null;
            }
            coVar.j3 = false;
            coVar.f35313k3 = false;
            coVar.f35325l3 = false;
            coVar.f35336m3 = false;
            coVar.f9(true);
            coVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = co.Hc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            coVar.f35473x0.setOverScrollMode(0);
            coVar.f35221c9.W();
            coVar.Wc(false);
            coVar.q9(1);
            coVar.f35419sa = false;
            return;
        }
        di.f4 f4Var = coVar.f35487y1;
        if (f4Var != null && f4Var.V) {
            f4Var.e(true);
        }
        org.telegram.ui.Components.q6 q6Var = coVar.W2;
        if (q6Var != null && q6Var.getVisibility() == 0 && coVar.x9()) {
            AndroidUtilities.hideKeyboard(coVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            coVar.D4 = true;
            coVar.f35325l3 = true;
        } else if (i10 == 1) {
            coVar.f35372p2 = null;
            coVar.D4 = true;
            coVar.j3 = true;
            coVar.f35313k3 = true;
            coVar.f35336m3 = true;
            coVar.f35325l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = co.Hc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        ah.g0 g0Var = coVar.Y9;
        if (g0Var != null && g0Var.d()) {
            coVar.Y9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        bh.f fVar;
        boolean z12;
        boolean z13;
        co coVar = this.d;
        co coVar2 = coVar.f35234da;
        if (coVar2 == null) {
            coVar2 = coVar;
        }
        coVar.f35473x0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34825b = z10;
        int L0 = coVar.f35498z0.L0();
        aa.a aVar = null;
        if (((i11 != 0 && coVar.f35419sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && coVar.N4 != 0) {
            if (this.f34825b && !coVar.O4) {
                if (!coVar.f35473x0.X1 && L0 != -1) {
                    int N0 = coVar.f35498z0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = coVar.f35498z0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.t1) {
                                messageObject = ((org.telegram.ui.Cells.t1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                                messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                            }
                            if (messageObject != null && coVar.N4 == messageObject.getId()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && messageObject != null && messageObject.getId() < coVar.N4) {
                        coVar.N4 = 0;
                    }
                }
            } else {
                coVar.N4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            coVar.O4 = false;
            if (!coVar.D4 && i11 != 0) {
                coVar.D4 = true;
            }
        }
        if (i11 != 0) {
            coVar.q9(1);
            coVar.X0.getClass();
            coVar.h9(true);
        }
        if (i11 != 0 && coVar.j3 && !coVar.f35253f3) {
            if (coVar.L7 != Integer.MAX_VALUE) {
                coVar.Ia();
                coVar.Wc(false);
            }
            coVar.Fb(true);
        }
        if (coVar.t9() && i11 != 0 && coVar.f35313k3 && !coVar.f35253f3) {
            if (coVar.L7 != Integer.MAX_VALUE) {
                coVar.Ia();
                coVar.Wc(false);
            }
            coVar.Gb(true);
        }
        coVar.a7(true);
        if (L0 != -1) {
            coVar.A0.h();
            if (L0 == 0 && coVar.E6[0]) {
                if (i11 >= 0) {
                    coVar.f35271g9 = false;
                    coVar.vc();
                }
            } else {
                aa.a[] aVarArr = coVar.f35299j1.f14967e;
                if (1 < aVarArr.length) {
                    aVar = aVarArr[1];
                }
                if (aVar != null && ((le.b) aVar.f372c).f15369f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f34826c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.f34824a + i11;
                        this.f34824a = f7;
                        if (f7 > i12) {
                            this.f34824a = 0.0f;
                            coVar.f35271g9 = true;
                            coVar.vc();
                            coVar.f35311k1 = true;
                        }
                    }
                } else if (coVar.f35311k1 && z12) {
                    float f10 = this.f34824a + i11;
                    this.f34824a = f10;
                    if (f10 < (-i12)) {
                        coVar.f35271g9 = false;
                        coVar.vc();
                        this.f34824a = 0.0f;
                    }
                }
            }
        }
        coVar.r9();
        coVar.f35221c9.H();
        ArrayList arrayList = coVar.f35483xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((fz) arrayList.get(i13)).f36498c) {
                ((fz) arrayList.get(i13)).f36497b -= i11;
            }
        }
        ah.e1 e1Var = ah.e1.B;
        if (e1Var != null) {
            e1Var.f521r -= i11;
            if (i11 != 0) {
                e1Var.f524u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = coVar2.F) != null) {
            fVar.f(i10, i11);
        }
        coVar.i7(false);
        di.f4 f4Var = coVar.f35474x1;
        if (f4Var != null) {
            if (f4Var.V) {
                f4Var.e(true);
            } else if (!coVar.Vb) {
                coVar.Ub = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new ug(coVar, 28));
                AndroidUtilities.runOnUIThread(new ug(coVar, 29), 2000L);
            }
        }
        yl ylVar = coVar.B1;
        if (ylVar != null && ylVar.V) {
            ylVar.e(true);
        }
        di.f4 f4Var2 = coVar.f35499z1;
        if (f4Var2 != null && f4Var2.V) {
            f4Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new ak(coVar, 0));
            AndroidUtilities.runOnUIThread(new ak(coVar, 1), 2000L);
        }
        di.f4 f4Var3 = coVar.A1;
        if (f4Var3 != null) {
            f4Var3.e(true);
        }
        mk mkVar = coVar.Y;
        if (mkVar != null) {
            mkVar.l0();
        }
        zh.a4 a4Var = coVar.f35393qc;
        if (a4Var != null) {
            a4Var.invalidate();
        }
        ih.a aVar2 = coVar.Qb;
        if (aVar2 != null && aVar2.f12300b > 0) {
            int childCount = aVar2.f12299a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar2.f12299a.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        z11 = aVar2.a(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        z11 = aVar2.a(((org.telegram.ui.Cells.w0) childAt).getMessageObject());
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
                aVar2.c(0, 0L);
            }
        }
    }
}
