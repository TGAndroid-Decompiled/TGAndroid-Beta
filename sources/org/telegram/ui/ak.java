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
    public boolean f32088b;
    public final xn d;
    public float f32087a = 0.0f;
    public final int f32089c = AndroidUtilities.dp(100.0f);

    public ak(xn xnVar) {
        this.d = xnVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        xn xnVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.u1 u1Var = xnVar.f39876p2;
            if (u1Var != null) {
                xnVar.f39853n2.e(u1Var, -1, xnVar.f39888q2, xnVar.f39901r2, true);
                xnVar.f39876p2 = null;
            }
            xnVar.j3 = false;
            xnVar.f39817k3 = false;
            xnVar.f39829l3 = false;
            xnVar.f39840m3 = false;
            xnVar.f9(true);
            xnVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = xn.Gc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            xnVar.f39977x0.setOverScrollMode(0);
            xnVar.f39725c9.W();
            xnVar.Wc(false);
            xnVar.q9(1);
            xnVar.f39923sa = false;
            return;
        }
        ci.e4 e4Var = xnVar.f39991y1;
        if (e4Var != null && e4Var.V) {
            e4Var.e(true);
        }
        org.telegram.ui.Components.p6 p6Var = xnVar.W2;
        if (p6Var != null && p6Var.getVisibility() == 0 && xnVar.x9()) {
            AndroidUtilities.hideKeyboard(xnVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            xnVar.D4 = true;
            xnVar.f39829l3 = true;
        } else if (i10 == 1) {
            xnVar.f39876p2 = null;
            xnVar.D4 = true;
            xnVar.j3 = true;
            xnVar.f39817k3 = true;
            xnVar.f39840m3 = true;
            xnVar.f39829l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = xn.Gc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        zg.u uVar = xnVar.Y9;
        if (uVar != null && uVar.d()) {
            xnVar.Y9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        ah.i iVar;
        boolean z12;
        boolean z13;
        xn xnVar = this.d;
        xn xnVar2 = xnVar.f39738da;
        if (xnVar2 == null) {
            xnVar2 = xnVar;
        }
        xnVar.f39977x0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32088b = z10;
        int L0 = xnVar.f40002z0.L0();
        aa.a aVar = null;
        if (((i11 != 0 && xnVar.f39923sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && xnVar.N4 != 0) {
            if (this.f32088b && !xnVar.O4) {
                if (!xnVar.f39977x0.X1 && L0 != -1) {
                    int N0 = xnVar.f40002z0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = xnVar.f40002z0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.u1) {
                                messageObject = ((org.telegram.ui.Cells.u1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                                messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                            }
                            if (messageObject != null && xnVar.N4 == messageObject.getId()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && messageObject != null && messageObject.getId() < xnVar.N4) {
                        xnVar.N4 = 0;
                    }
                }
            } else {
                xnVar.N4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            xnVar.O4 = false;
            if (!xnVar.D4 && i11 != 0) {
                xnVar.D4 = true;
            }
        }
        if (i11 != 0) {
            xnVar.q9(1);
            xnVar.X0.getClass();
            xnVar.h9(true);
        }
        if (i11 != 0 && xnVar.j3 && !xnVar.f39756f3) {
            if (xnVar.L7 != Integer.MAX_VALUE) {
                xnVar.Ia();
                xnVar.Wc(false);
            }
            xnVar.Fb(true);
        }
        if (xnVar.t9() && i11 != 0 && xnVar.f39817k3 && !xnVar.f39756f3) {
            if (xnVar.L7 != Integer.MAX_VALUE) {
                xnVar.Ia();
                xnVar.Wc(false);
            }
            xnVar.Gb(true);
        }
        xnVar.a7(true);
        if (L0 != -1) {
            xnVar.A0.h();
            if (L0 == 0 && xnVar.E6[0]) {
                if (i11 >= 0) {
                    xnVar.f39774g9 = false;
                    xnVar.vc();
                }
            } else {
                aa.a[] aVarArr = xnVar.f39803j1.e;
                if (1 < aVarArr.length) {
                    aVar = aVarArr[1];
                }
                if (aVar != null && ((le.c) aVar.f360c).f14203f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f32089c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.f32087a + i11;
                        this.f32087a = f7;
                        if (f7 > i12) {
                            this.f32087a = 0.0f;
                            xnVar.f39774g9 = true;
                            xnVar.vc();
                            xnVar.f39815k1 = true;
                        }
                    }
                } else if (xnVar.f39815k1 && z12) {
                    float f10 = this.f32087a + i11;
                    this.f32087a = f10;
                    if (f10 < (-i12)) {
                        xnVar.f39774g9 = false;
                        xnVar.vc();
                        this.f32087a = 0.0f;
                    }
                }
            }
        }
        xnVar.r9();
        xnVar.f39725c9.H();
        ArrayList arrayList = xnVar.f39987xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((ez) arrayList.get(i13)).f33354c) {
                ((ez) arrayList.get(i13)).f33353b -= i11;
            }
        }
        zg.l0 l0Var = zg.l0.B;
        if (l0Var != null) {
            l0Var.f49398r -= i11;
            if (i11 != 0) {
                l0Var.f49401u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (iVar = xnVar2.F) != null) {
            iVar.f(i10, i11);
        }
        xnVar.i7(false);
        ci.e4 e4Var = xnVar.f39978x1;
        if (e4Var != null) {
            if (e4Var.V) {
                e4Var.e(true);
            } else if (!xnVar.Ub) {
                xnVar.Tb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new ug(xnVar, 28));
                AndroidUtilities.runOnUIThread(new ug(xnVar, 29), 2000L);
            }
        }
        vl vlVar = xnVar.B1;
        if (vlVar != null && vlVar.V) {
            vlVar.e(true);
        }
        ci.e4 e4Var2 = xnVar.f40003z1;
        if (e4Var2 != null && e4Var2.V) {
            e4Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new zj(xnVar, 0));
            AndroidUtilities.runOnUIThread(new zj(xnVar, 1), 2000L);
        }
        ci.e4 e4Var3 = xnVar.A1;
        if (e4Var3 != null) {
            e4Var3.e(true);
        }
        lk lkVar = xnVar.Y;
        if (lkVar != null) {
            lkVar.l0();
        }
        yh.b4 b4Var = xnVar.f39885pc;
        if (b4Var != null) {
            b4Var.invalidate();
        }
        hh.a aVar2 = xnVar.Pb;
        if (aVar2 != null && aVar2.f10486b > 0) {
            int childCount = aVar2.f10485a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar2.f10485a.getChildAt(i14);
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
