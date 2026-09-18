package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class ak extends s4.s0 {
    public boolean f32086b;
    public final zn d;
    public float f32085a = 0.0f;
    public final int f32087c = AndroidUtilities.dp(100.0f);

    public ak(zn znVar) {
        this.d = znVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        zn znVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.u1 u1Var = znVar.f40387p2;
            if (u1Var != null) {
                znVar.f40364n2.e(u1Var, -1, znVar.f40399q2, znVar.f40412r2, true);
                znVar.f40387p2 = null;
            }
            znVar.j3 = false;
            znVar.f40328k3 = false;
            znVar.f40340l3 = false;
            znVar.f40351m3 = false;
            znVar.f9(true);
            znVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = zn.Gc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            znVar.f40488x0.setOverScrollMode(0);
            znVar.f40236c9.W();
            znVar.Wc(false);
            znVar.q9(1);
            znVar.f40434sa = false;
            return;
        }
        ci.f4 f4Var = znVar.f40502y1;
        if (f4Var != null && f4Var.V) {
            f4Var.e(true);
        }
        org.telegram.ui.Components.p6 p6Var = znVar.W2;
        if (p6Var != null && p6Var.getVisibility() == 0 && znVar.x9()) {
            AndroidUtilities.hideKeyboard(znVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            znVar.D4 = true;
            znVar.f40340l3 = true;
        } else if (i10 == 1) {
            znVar.f40387p2 = null;
            znVar.D4 = true;
            znVar.j3 = true;
            znVar.f40328k3 = true;
            znVar.f40351m3 = true;
            znVar.f40340l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = zn.Gc;
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
        ah.i iVar;
        boolean z12;
        boolean z13;
        zn znVar = this.d;
        zn znVar2 = znVar.f40249da;
        if (znVar2 == null) {
            znVar2 = znVar;
        }
        znVar.f40488x0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32086b = z10;
        int L0 = znVar.f40513z0.L0();
        aa.a aVar = null;
        if (((i11 != 0 && znVar.f40434sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && znVar.N4 != 0) {
            if (this.f32086b && !znVar.O4) {
                if (!znVar.f40488x0.X1 && L0 != -1) {
                    int N0 = znVar.f40513z0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = znVar.f40513z0.m(N0);
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
            znVar.q9(1);
            znVar.X0.getClass();
            znVar.h9(true);
        }
        if (i11 != 0 && znVar.j3 && !znVar.f40267f3) {
            if (znVar.L7 != Integer.MAX_VALUE) {
                znVar.Ia();
                znVar.Wc(false);
            }
            znVar.Fb(true);
        }
        if (znVar.t9() && i11 != 0 && znVar.f40328k3 && !znVar.f40267f3) {
            if (znVar.L7 != Integer.MAX_VALUE) {
                znVar.Ia();
                znVar.Wc(false);
            }
            znVar.Gb(true);
        }
        znVar.a7(true);
        if (L0 != -1) {
            znVar.A0.h();
            if (L0 == 0 && znVar.E6[0]) {
                if (i11 >= 0) {
                    znVar.f40285g9 = false;
                    znVar.vc();
                }
            } else {
                aa.a[] aVarArr = znVar.f40314j1.e;
                if (1 < aVarArr.length) {
                    aVar = aVarArr[1];
                }
                if (aVar != null && ((le.b) aVar.f360c).f14131f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f32087c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.f32085a + i11;
                        this.f32085a = f7;
                        if (f7 > i12) {
                            this.f32085a = 0.0f;
                            znVar.f40285g9 = true;
                            znVar.vc();
                            znVar.f40326k1 = true;
                        }
                    }
                } else if (znVar.f40326k1 && z12) {
                    float f10 = this.f32085a + i11;
                    this.f32085a = f10;
                    if (f10 < (-i12)) {
                        znVar.f40285g9 = false;
                        znVar.vc();
                        this.f32085a = 0.0f;
                    }
                }
            }
        }
        znVar.r9();
        znVar.f40236c9.H();
        ArrayList arrayList = znVar.f40498xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((fz) arrayList.get(i13)).f33645c) {
                ((fz) arrayList.get(i13)).f33644b -= i11;
            }
        }
        zg.k0 k0Var = zg.k0.B;
        if (k0Var != null) {
            k0Var.f49331r -= i11;
            if (i11 != 0) {
                k0Var.f49334u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (iVar = znVar2.F) != null) {
            iVar.f(i10, i11);
        }
        znVar.i7(false);
        ci.f4 f4Var = znVar.f40489x1;
        if (f4Var != null) {
            if (f4Var.V) {
                f4Var.e(true);
            } else if (!znVar.Ub) {
                znVar.Tb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new ug(znVar, 28));
                AndroidUtilities.runOnUIThread(new ug(znVar, 29), 2000L);
            }
        }
        vl vlVar = znVar.B1;
        if (vlVar != null && vlVar.V) {
            vlVar.e(true);
        }
        ci.f4 f4Var2 = znVar.f40514z1;
        if (f4Var2 != null && f4Var2.V) {
            f4Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new zj(znVar, 0));
            AndroidUtilities.runOnUIThread(new zj(znVar, 1), 2000L);
        }
        ci.f4 f4Var3 = znVar.A1;
        if (f4Var3 != null) {
            f4Var3.e(true);
        }
        lk lkVar = znVar.Y;
        if (lkVar != null) {
            lkVar.l0();
        }
        yh.c4 c4Var = znVar.f40396pc;
        if (c4Var != null) {
            c4Var.invalidate();
        }
        hh.a aVar2 = znVar.Pb;
        if (aVar2 != null && aVar2.f10498b > 0) {
            int childCount = aVar2.f10497a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar2.f10497a.getChildAt(i14);
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
