package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class ck extends s4.s0 {
    public boolean f32822b;
    public final bo d;
    public float f32821a = 0.0f;
    public final int f32823c = AndroidUtilities.dp(100.0f);

    public ck(bo boVar) {
        this.d = boVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        bo boVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.t1 t1Var = boVar.f32401p2;
            if (t1Var != null) {
                boVar.f32378n2.e(t1Var, -1, boVar.f32413q2, boVar.f32426r2, true);
                boVar.f32401p2 = null;
            }
            boVar.j3 = false;
            boVar.f32342k3 = false;
            boVar.f32354l3 = false;
            boVar.f32365m3 = false;
            boVar.f9(true);
            boVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = bo.Hc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            boVar.f32502x0.setOverScrollMode(0);
            boVar.f32250c9.W();
            boVar.Wc(false);
            boVar.q9(1);
            boVar.f32448sa = false;
            return;
        }
        ci.f4 f4Var = boVar.f32516y1;
        if (f4Var != null && f4Var.V) {
            f4Var.e(true);
        }
        org.telegram.ui.Components.n6 n6Var = boVar.W2;
        if (n6Var != null && n6Var.getVisibility() == 0 && boVar.x9()) {
            AndroidUtilities.hideKeyboard(boVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            boVar.D4 = true;
            boVar.f32354l3 = true;
        } else if (i10 == 1) {
            boVar.f32401p2 = null;
            boVar.D4 = true;
            boVar.j3 = true;
            boVar.f32342k3 = true;
            boVar.f32365m3 = true;
            boVar.f32354l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = bo.Hc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        zg.t tVar = boVar.Y9;
        if (tVar != null && tVar.d()) {
            boVar.Y9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        ah.i iVar;
        boolean z12;
        boolean z13;
        bo boVar = this.d;
        bo boVar2 = boVar.f32263da;
        if (boVar2 == null) {
            boVar2 = boVar;
        }
        boVar.f32502x0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32822b = z10;
        int L0 = boVar.f32527z0.L0();
        aa.a aVar = null;
        if (((i11 != 0 && boVar.f32448sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && boVar.N4 != 0) {
            if (this.f32822b && !boVar.O4) {
                if (!boVar.f32502x0.X1 && L0 != -1) {
                    int N0 = boVar.f32527z0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = boVar.f32527z0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.t1) {
                                messageObject = ((org.telegram.ui.Cells.t1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                                messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                            }
                            if (messageObject != null && boVar.N4 == messageObject.getId()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && messageObject != null && messageObject.getId() < boVar.N4) {
                        boVar.N4 = 0;
                    }
                }
            } else {
                boVar.N4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            boVar.O4 = false;
            if (!boVar.D4 && i11 != 0) {
                boVar.D4 = true;
            }
        }
        if (i11 != 0) {
            boVar.q9(1);
            boVar.X0.getClass();
            boVar.h9(true);
        }
        if (i11 != 0 && boVar.j3 && !boVar.f32281f3) {
            if (boVar.L7 != Integer.MAX_VALUE) {
                boVar.Ia();
                boVar.Wc(false);
            }
            boVar.Fb(true);
        }
        if (boVar.t9() && i11 != 0 && boVar.f32342k3 && !boVar.f32281f3) {
            if (boVar.L7 != Integer.MAX_VALUE) {
                boVar.Ia();
                boVar.Wc(false);
            }
            boVar.Gb(true);
        }
        boVar.a7(true);
        if (L0 != -1) {
            boVar.A0.h();
            if (L0 == 0 && boVar.E6[0]) {
                if (i11 >= 0) {
                    boVar.f32299g9 = false;
                    boVar.vc();
                }
            } else {
                aa.a[] aVarArr = boVar.f32328j1.e;
                if (1 < aVarArr.length) {
                    aVar = aVarArr[1];
                }
                if (aVar != null && ((le.b) aVar.f360c).f13985f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f32823c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.f32821a + i11;
                        this.f32821a = f7;
                        if (f7 > i12) {
                            this.f32821a = 0.0f;
                            boVar.f32299g9 = true;
                            boVar.vc();
                            boVar.f32340k1 = true;
                        }
                    }
                } else if (boVar.f32340k1 && z12) {
                    float f10 = this.f32821a + i11;
                    this.f32821a = f10;
                    if (f10 < (-i12)) {
                        boVar.f32299g9 = false;
                        boVar.vc();
                        this.f32821a = 0.0f;
                    }
                }
            }
        }
        boVar.r9();
        boVar.f32250c9.H();
        ArrayList arrayList = boVar.f32512xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((hz) arrayList.get(i13)).f34384c) {
                ((hz) arrayList.get(i13)).f34383b -= i11;
            }
        }
        zg.l0 l0Var = zg.l0.B;
        if (l0Var != null) {
            l0Var.f49104r -= i11;
            if (i11 != 0) {
                l0Var.f49107u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (iVar = boVar2.F) != null) {
            iVar.f(i10, i11);
        }
        boVar.i7(false);
        ci.f4 f4Var = boVar.f32503x1;
        if (f4Var != null) {
            if (f4Var.V) {
                f4Var.e(true);
            } else if (!boVar.Vb) {
                boVar.Ub = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new wg(boVar, 28));
                AndroidUtilities.runOnUIThread(new wg(boVar, 29), 2000L);
            }
        }
        yl ylVar = boVar.B1;
        if (ylVar != null && ylVar.V) {
            ylVar.e(true);
        }
        ci.f4 f4Var2 = boVar.f32528z1;
        if (f4Var2 != null && f4Var2.V) {
            f4Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new bk(boVar, 0));
            AndroidUtilities.runOnUIThread(new bk(boVar, 1), 2000L);
        }
        ci.f4 f4Var3 = boVar.A1;
        if (f4Var3 != null) {
            f4Var3.e(true);
        }
        nk nkVar = boVar.Y;
        if (nkVar != null) {
            nkVar.l0();
        }
        yh.e4 e4Var = boVar.f32422qc;
        if (e4Var != null) {
            e4Var.invalidate();
        }
        hh.a aVar2 = boVar.Qb;
        if (aVar2 != null && aVar2.f10498b > 0) {
            int childCount = aVar2.f10497a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar2.f10497a.getChildAt(i14);
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
