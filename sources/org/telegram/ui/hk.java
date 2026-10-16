package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class hk extends s4.r0 {
    public boolean f36590b;
    public final fo d;
    public float f36589a = 0.0f;
    public final int f36591c = AndroidUtilities.dp(100.0f);

    public hk(fo foVar) {
        this.d = foVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        fo foVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.u1 u1Var = foVar.f35760p2;
            if (u1Var != null) {
                foVar.f35736n2.e(u1Var, -1, foVar.f35771q2, foVar.f35784r2, true);
                foVar.f35760p2 = null;
            }
            foVar.f35687j3 = false;
            foVar.f35700k3 = false;
            foVar.f35712l3 = false;
            foVar.f35723m3 = false;
            foVar.k9(true);
            foVar.l9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = fo.Hc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            foVar.f35861x0.setOverScrollMode(0);
            foVar.f35608c9.V();
            foVar.ad(false);
            foVar.v9(1);
            foVar.f35806sa = false;
            return;
        }
        di.d4 d4Var = foVar.f35876y1;
        if (d4Var != null && d4Var.V) {
            d4Var.e(true);
        }
        org.telegram.ui.Components.s6 s6Var = foVar.W2;
        if (s6Var != null && s6Var.getVisibility() == 0 && foVar.C9()) {
            AndroidUtilities.hideKeyboard(foVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            foVar.D4 = true;
            foVar.f35712l3 = true;
        } else if (i10 == 1) {
            foVar.f35760p2 = null;
            foVar.D4 = true;
            foVar.f35687j3 = true;
            foVar.f35700k3 = true;
            foVar.f35723m3 = true;
            foVar.f35712l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = fo.Hc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        ah.f0 f0Var = foVar.Y9;
        if (f0Var != null && f0Var.d()) {
            foVar.Y9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        bh.f fVar;
        boolean z12;
        boolean z13;
        fo foVar = this.d;
        fo foVar2 = foVar.f35622da;
        if (foVar2 == null) {
            foVar2 = foVar;
        }
        foVar.f35861x0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36590b = z10;
        int L0 = foVar.f35886z0.L0();
        androidx.biometric.e eVar = null;
        if (((i11 != 0 && foVar.f35806sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && foVar.N4 != 0) {
            if (this.f36590b && !foVar.O4) {
                if (!foVar.f35861x0.V1 && L0 != -1) {
                    int N0 = foVar.f35886z0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = foVar.f35886z0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.u1) {
                                messageObject = ((org.telegram.ui.Cells.u1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                                messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                            }
                            if (messageObject != null && foVar.N4 == messageObject.getId()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && messageObject != null && messageObject.getId() < foVar.N4) {
                        foVar.N4 = 0;
                    }
                }
            } else {
                foVar.N4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            foVar.O4 = false;
            if (!foVar.D4 && i11 != 0) {
                foVar.D4 = true;
            }
        }
        if (i11 != 0) {
            foVar.v9(1);
            foVar.X0.getClass();
            foVar.m9(true);
        }
        if (i11 != 0 && foVar.f35687j3 && !foVar.f35640f3) {
            if (foVar.L7 != Integer.MAX_VALUE) {
                foVar.Ma();
                foVar.ad(false);
            }
            foVar.Jb(true);
        }
        if (foVar.y9() && i11 != 0 && foVar.f35700k3 && !foVar.f35640f3) {
            if (foVar.L7 != Integer.MAX_VALUE) {
                foVar.Ma();
                foVar.ad(false);
            }
            foVar.Kb(true);
        }
        foVar.d7(true);
        if (L0 != -1) {
            foVar.A0.h();
            if (L0 == 0 && foVar.E6[0]) {
                if (i11 >= 0) {
                    foVar.f35657g9 = false;
                    foVar.zc();
                }
            } else {
                androidx.biometric.e[] eVarArr = foVar.f35685j1.e;
                if (1 < eVarArr.length) {
                    eVar = eVarArr[1];
                }
                if (eVar != null && ((ne.b) eVar.f1201c).f16004f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f36591c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.f36589a + i11;
                        this.f36589a = f7;
                        if (f7 > i12) {
                            this.f36589a = 0.0f;
                            foVar.f35657g9 = true;
                            foVar.zc();
                            foVar.f35698k1 = true;
                        }
                    }
                } else if (foVar.f35698k1 && z12) {
                    float f10 = this.f36589a + i11;
                    this.f36589a = f10;
                    if (f10 < (-i12)) {
                        foVar.f35657g9 = false;
                        foVar.zc();
                        this.f36589a = 0.0f;
                    }
                }
            }
        }
        foVar.w9();
        foVar.f35608c9.G();
        ArrayList arrayList = foVar.f35871xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((jz) arrayList.get(i13)).f37175c) {
                ((jz) arrayList.get(i13)).f37174b -= i11;
            }
        }
        ah.d1 d1Var = ah.d1.B;
        if (d1Var != null) {
            d1Var.f702r -= i11;
            if (i11 != 0) {
                d1Var.f705u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = foVar2.F) != null) {
            fVar.f(i10, i11);
        }
        foVar.l7(false);
        di.d4 d4Var = foVar.f35862x1;
        if (d4Var != null) {
            if (d4Var.V) {
                d4Var.e(true);
            } else if (!foVar.Vb) {
                foVar.Ub = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new xg(foVar, 29));
                AndroidUtilities.runOnUIThread(new gk(foVar, 0), 2000L);
            }
        }
        cm cmVar = foVar.B1;
        if (cmVar != null && cmVar.V) {
            cmVar.e(true);
        }
        di.d4 d4Var2 = foVar.f35887z1;
        if (d4Var2 != null && d4Var2.V) {
            d4Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new gk(foVar, 1));
            AndroidUtilities.runOnUIThread(new gk(foVar, 2), 2000L);
        }
        di.d4 d4Var3 = foVar.A1;
        if (d4Var3 != null) {
            d4Var3.e(true);
        }
        sk skVar = foVar.Y;
        if (skVar != null) {
            skVar.j0();
        }
        zh.v3 v3Var = foVar.f35780qc;
        if (v3Var != null) {
            v3Var.invalidate();
        }
        ih.a aVar = foVar.Qb;
        if (aVar != null && aVar.f11717b > 0) {
            int childCount = aVar.f11716a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar.f11716a.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        z11 = aVar.a(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        z11 = aVar.a(((org.telegram.ui.Cells.w0) childAt).getMessageObject());
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
