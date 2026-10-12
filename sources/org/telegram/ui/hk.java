package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class hk extends s4.t0 {
    public boolean f38450b;
    public final eo d;
    public float f38449a = 0.0f;
    public final int f38451c = AndroidUtilities.dp(100.0f);

    public hk(eo eoVar) {
        this.d = eoVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        eo eoVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.u1 u1Var = eoVar.f37376p2;
            if (u1Var != null) {
                eoVar.f37353n2.e(u1Var, -1, eoVar.f37388q2, eoVar.f37401r2, true);
                eoVar.f37376p2 = null;
            }
            eoVar.j3 = false;
            eoVar.f37317k3 = false;
            eoVar.f37329l3 = false;
            eoVar.f37340m3 = false;
            eoVar.k9(true);
            eoVar.l9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = eo.Hc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            eoVar.f37478x0.setOverScrollMode(0);
            eoVar.f37225c9.V();
            eoVar.ad(false);
            eoVar.v9(1);
            eoVar.f37423sa = false;
            return;
        }
        ci.d4 d4Var = eoVar.f37492y1;
        if (d4Var != null && d4Var.V) {
            d4Var.e(true);
        }
        org.telegram.ui.Components.r6 r6Var = eoVar.W2;
        if (r6Var != null && r6Var.getVisibility() == 0 && eoVar.C9()) {
            AndroidUtilities.hideKeyboard(eoVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            eoVar.D4 = true;
            eoVar.f37329l3 = true;
        } else if (i10 == 1) {
            eoVar.f37376p2 = null;
            eoVar.D4 = true;
            eoVar.j3 = true;
            eoVar.f37317k3 = true;
            eoVar.f37340m3 = true;
            eoVar.f37329l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = eo.Hc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        zg.t tVar = eoVar.Y9;
        if (tVar != null && tVar.d()) {
            eoVar.Y9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        ah.h hVar;
        boolean z12;
        boolean z13;
        eo eoVar = this.d;
        eo eoVar2 = eoVar.f37238da;
        if (eoVar2 == null) {
            eoVar2 = eoVar;
        }
        eoVar.f37478x0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38450b = z10;
        int L0 = eoVar.f37502z0.L0();
        aa.a aVar = null;
        if (((i11 != 0 && eoVar.f37423sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && eoVar.N4 != 0) {
            if (this.f38450b && !eoVar.O4) {
                if (!eoVar.f37478x0.V1 && L0 != -1) {
                    int N0 = eoVar.f37502z0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = eoVar.f37502z0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.u1) {
                                messageObject = ((org.telegram.ui.Cells.u1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                                messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                            }
                            if (messageObject != null && eoVar.N4 == messageObject.getId()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && messageObject != null && messageObject.getId() < eoVar.N4) {
                        eoVar.N4 = 0;
                    }
                }
            } else {
                eoVar.N4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            eoVar.O4 = false;
            if (!eoVar.D4 && i11 != 0) {
                eoVar.D4 = true;
            }
        }
        if (i11 != 0) {
            eoVar.v9(1);
            eoVar.X0.getClass();
            eoVar.m9(true);
        }
        if (i11 != 0 && eoVar.j3 && !eoVar.f37257f3) {
            if (eoVar.L7 != Integer.MAX_VALUE) {
                eoVar.Ma();
                eoVar.ad(false);
            }
            eoVar.Jb(true);
        }
        if (eoVar.y9() && i11 != 0 && eoVar.f37317k3 && !eoVar.f37257f3) {
            if (eoVar.L7 != Integer.MAX_VALUE) {
                eoVar.Ma();
                eoVar.ad(false);
            }
            eoVar.Kb(true);
        }
        eoVar.d7(true);
        if (L0 != -1) {
            eoVar.A0.h();
            if (L0 == 0 && eoVar.E6[0]) {
                if (i11 >= 0) {
                    eoVar.f37275g9 = false;
                    eoVar.zc();
                }
            } else {
                aa.a[] aVarArr = eoVar.f37303j1.f14197e;
                if (1 < aVarArr.length) {
                    aVar = aVarArr[1];
                }
                if (aVar != null && ((me.b) aVar.f387c).f16088f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f38451c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.f38449a + i11;
                        this.f38449a = f7;
                        if (f7 > i12) {
                            this.f38449a = 0.0f;
                            eoVar.f37275g9 = true;
                            eoVar.zc();
                            eoVar.f37315k1 = true;
                        }
                    }
                } else if (eoVar.f37315k1 && z12) {
                    float f10 = this.f38449a + i11;
                    this.f38449a = f10;
                    if (f10 < (-i12)) {
                        eoVar.f37275g9 = false;
                        eoVar.zc();
                        this.f38449a = 0.0f;
                    }
                }
            }
        }
        eoVar.w9();
        eoVar.f37225c9.G();
        ArrayList arrayList = eoVar.f37488xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((gz) arrayList.get(i13)).f38180c) {
                ((gz) arrayList.get(i13)).f38179b -= i11;
            }
        }
        zg.j0 j0Var = zg.j0.B;
        if (j0Var != null) {
            j0Var.f54791r -= i11;
            if (i11 != 0) {
                j0Var.f54794u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (hVar = eoVar2.F) != null) {
            hVar.f(i10, i11);
        }
        eoVar.l7(false);
        ci.d4 d4Var = eoVar.f37479x1;
        if (d4Var != null) {
            if (d4Var.V) {
                d4Var.e(true);
            } else if (!eoVar.Vb) {
                eoVar.Ub = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new wg(eoVar, 29));
                AndroidUtilities.runOnUIThread(new gk(eoVar, 0), 2000L);
            }
        }
        cm cmVar = eoVar.B1;
        if (cmVar != null && cmVar.V) {
            cmVar.e(true);
        }
        ci.d4 d4Var2 = eoVar.f37503z1;
        if (d4Var2 != null && d4Var2.V) {
            d4Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new gk(eoVar, 1));
            AndroidUtilities.runOnUIThread(new gk(eoVar, 2), 2000L);
        }
        ci.d4 d4Var3 = eoVar.A1;
        if (d4Var3 != null) {
            d4Var3.e(true);
        }
        sk skVar = eoVar.Y;
        if (skVar != null) {
            skVar.m0();
        }
        yh.w3 w3Var = eoVar.f37397qc;
        if (w3Var != null) {
            w3Var.invalidate();
        }
        hh.a aVar2 = eoVar.Qb;
        if (aVar2 != null && aVar2.f11470b > 0) {
            int childCount = aVar2.f11469a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar2.f11469a.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        z11 = aVar2.a(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
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
