package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class dk extends s4.t0 {
    public boolean f37073b;
    public final zn d;
    public float f37072a = 0.0f;
    public final int f37074c = AndroidUtilities.dp(100.0f);

    public dk(zn znVar) {
        this.d = znVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        zn znVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.u1 u1Var = znVar.f44921p2;
            if (u1Var != null) {
                znVar.f44898n2.e(u1Var, -1, znVar.f44933q2, znVar.f44946r2, true);
                znVar.f44921p2 = null;
            }
            znVar.j3 = false;
            znVar.f44862k3 = false;
            znVar.f44874l3 = false;
            znVar.f44885m3 = false;
            znVar.k9(true);
            znVar.l9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = zn.Hc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            znVar.f45023x0.setOverScrollMode(0);
            znVar.f44770c9.V();
            znVar.ad(false);
            znVar.v9(1);
            znVar.f44968sa = false;
            return;
        }
        ci.d4 d4Var = znVar.f45037y1;
        if (d4Var != null && d4Var.V) {
            d4Var.e(true);
        }
        org.telegram.ui.Components.r6 r6Var = znVar.W2;
        if (r6Var != null && r6Var.getVisibility() == 0 && znVar.C9()) {
            AndroidUtilities.hideKeyboard(znVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            znVar.D4 = true;
            znVar.f44874l3 = true;
        } else if (i10 == 1) {
            znVar.f44921p2 = null;
            znVar.D4 = true;
            znVar.j3 = true;
            znVar.f44862k3 = true;
            znVar.f44885m3 = true;
            znVar.f44874l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = zn.Hc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        zg.t tVar = znVar.Y9;
        if (tVar != null && tVar.d()) {
            znVar.Y9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        ah.h hVar;
        boolean z12;
        boolean z13;
        zn znVar = this.d;
        zn znVar2 = znVar.f44783da;
        if (znVar2 == null) {
            znVar2 = znVar;
        }
        znVar.f45023x0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37073b = z10;
        int L0 = znVar.f45047z0.L0();
        aa.a aVar = null;
        if (((i11 != 0 && znVar.f44968sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && znVar.N4 != 0) {
            if (this.f37073b && !znVar.O4) {
                if (!znVar.f45023x0.V1 && L0 != -1) {
                    int N0 = znVar.f45047z0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = znVar.f45047z0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.u1) {
                                messageObject = ((org.telegram.ui.Cells.u1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                                messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                            }
                            if (messageObject != null && znVar.N4 == messageObject.getId()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && messageObject != null && messageObject.getId() < znVar.N4) {
                        znVar.N4 = 0;
                    }
                }
            } else {
                znVar.N4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            znVar.O4 = false;
            if (!znVar.D4 && i11 != 0) {
                znVar.D4 = true;
            }
        }
        if (i11 != 0) {
            znVar.v9(1);
            znVar.X0.getClass();
            znVar.m9(true);
        }
        if (i11 != 0 && znVar.j3 && !znVar.f44802f3) {
            if (znVar.L7 != Integer.MAX_VALUE) {
                znVar.Ma();
                znVar.ad(false);
            }
            znVar.Jb(true);
        }
        if (znVar.y9() && i11 != 0 && znVar.f44862k3 && !znVar.f44802f3) {
            if (znVar.L7 != Integer.MAX_VALUE) {
                znVar.Ma();
                znVar.ad(false);
            }
            znVar.Kb(true);
        }
        znVar.d7(true);
        if (L0 != -1) {
            znVar.A0.h();
            if (L0 == 0 && znVar.E6[0]) {
                if (i11 >= 0) {
                    znVar.f44820g9 = false;
                    znVar.zc();
                }
            } else {
                aa.a[] aVarArr = znVar.f44848j1.f14199e;
                if (1 < aVarArr.length) {
                    aVar = aVarArr[1];
                }
                if (aVar != null && ((me.b) aVar.f385c).f16402f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f37074c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.f37072a + i11;
                        this.f37072a = f7;
                        if (f7 > i12) {
                            this.f37072a = 0.0f;
                            znVar.f44820g9 = true;
                            znVar.zc();
                            znVar.f44860k1 = true;
                        }
                    }
                } else if (znVar.f44860k1 && z12) {
                    float f10 = this.f37072a + i11;
                    this.f37072a = f10;
                    if (f10 < (-i12)) {
                        znVar.f44820g9 = false;
                        znVar.zc();
                        this.f37072a = 0.0f;
                    }
                }
            }
        }
        znVar.w9();
        znVar.f44770c9.G();
        ArrayList arrayList = znVar.f45033xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((dz) arrayList.get(i13)).f37180c) {
                ((dz) arrayList.get(i13)).f37179b -= i11;
            }
        }
        zg.j0 j0Var = zg.j0.B;
        if (j0Var != null) {
            j0Var.f54688r -= i11;
            if (i11 != 0) {
                j0Var.f54691u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (hVar = znVar2.F) != null) {
            hVar.f(i10, i11);
        }
        znVar.l7(false);
        ci.d4 d4Var = znVar.f45024x1;
        if (d4Var != null) {
            if (d4Var.V) {
                d4Var.e(true);
            } else if (!znVar.Vb) {
                znVar.Ub = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new sg(znVar, 29));
                AndroidUtilities.runOnUIThread(new ck(znVar, 0), 2000L);
            }
        }
        yl ylVar = znVar.B1;
        if (ylVar != null && ylVar.V) {
            ylVar.e(true);
        }
        ci.d4 d4Var2 = znVar.f45048z1;
        if (d4Var2 != null && d4Var2.V) {
            d4Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new ck(znVar, 1));
            AndroidUtilities.runOnUIThread(new ck(znVar, 2), 2000L);
        }
        ci.d4 d4Var3 = znVar.A1;
        if (d4Var3 != null) {
            d4Var3.e(true);
        }
        ok okVar = znVar.Y;
        if (okVar != null) {
            okVar.j0();
        }
        yh.w3 w3Var = znVar.f44942qc;
        if (w3Var != null) {
            w3Var.invalidate();
        }
        hh.a aVar2 = znVar.Qb;
        if (aVar2 != null && aVar2.f11471b > 0) {
            int childCount = aVar2.f11470a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar2.f11470a.getChildAt(i14);
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
