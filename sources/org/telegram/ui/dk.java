package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class dk extends s4.s0 {
    public boolean f31932b;
    public final eo d;
    public float f31931a = 0.0f;
    public final int f31933c = AndroidUtilities.dp(100.0f);

    public dk(eo eoVar) {
        this.d = eoVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        eo eoVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.t1 t1Var = eoVar.f32441p2;
            if (t1Var != null) {
                eoVar.f32418n2.e(t1Var, -1, eoVar.f32453q2, eoVar.f32466r2, true);
                eoVar.f32441p2 = null;
            }
            eoVar.j3 = false;
            eoVar.f32382k3 = false;
            eoVar.f32394l3 = false;
            eoVar.f32405m3 = false;
            eoVar.f9(true);
            eoVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = eo.Hc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            eoVar.f32542x0.setOverScrollMode(0);
            eoVar.f32291c9.W();
            eoVar.Wc(false);
            eoVar.q9(1);
            eoVar.f32488sa = false;
            return;
        }
        bi.x4 x4Var = eoVar.f32556y1;
        if (x4Var != null && x4Var.V) {
            x4Var.e(true);
        }
        org.telegram.ui.Components.o6 o6Var = eoVar.W2;
        if (o6Var != null && o6Var.getVisibility() == 0 && eoVar.x9()) {
            AndroidUtilities.hideKeyboard(eoVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            eoVar.D4 = true;
            eoVar.f32394l3 = true;
        } else if (i10 == 1) {
            eoVar.f32441p2 = null;
            eoVar.D4 = true;
            eoVar.j3 = true;
            eoVar.f32382k3 = true;
            eoVar.f32405m3 = true;
            eoVar.f32394l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = eo.Hc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        yg.v vVar = eoVar.Y9;
        if (vVar != null && vVar.d()) {
            eoVar.Y9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        zg.e eVar;
        boolean z12;
        boolean z13;
        eo eoVar = this.d;
        eo eoVar2 = eoVar.f32304da;
        if (eoVar2 == null) {
            eoVar2 = eoVar;
        }
        eoVar.f32542x0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31932b = z10;
        int L0 = eoVar.f32567z0.L0();
        aa.a aVar = null;
        if (((i11 != 0 && eoVar.f32488sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && eoVar.N4 != 0) {
            if (this.f31932b && !eoVar.O4) {
                if (!eoVar.f32542x0.X1 && L0 != -1) {
                    int N0 = eoVar.f32567z0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = eoVar.f32567z0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.t1) {
                                messageObject = ((org.telegram.ui.Cells.t1) m10).getMessageObject();
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
            eoVar.q9(1);
            eoVar.X0.getClass();
            eoVar.h9(true);
        }
        if (i11 != 0 && eoVar.j3 && !eoVar.f32322f3) {
            if (eoVar.L7 != Integer.MAX_VALUE) {
                eoVar.Ia();
                eoVar.Wc(false);
            }
            eoVar.Fb(true);
        }
        if (eoVar.t9() && i11 != 0 && eoVar.f32382k3 && !eoVar.f32322f3) {
            if (eoVar.L7 != Integer.MAX_VALUE) {
                eoVar.Ia();
                eoVar.Wc(false);
            }
            eoVar.Gb(true);
        }
        eoVar.a7(true);
        if (L0 != -1) {
            eoVar.A0.h();
            if (L0 == 0 && eoVar.E6[0]) {
                if (i11 >= 0) {
                    eoVar.f32340g9 = false;
                    eoVar.vc();
                }
            } else {
                aa.a[] aVarArr = eoVar.f32368j1.e;
                if (1 < aVarArr.length) {
                    aVar = aVarArr[1];
                }
                if (aVar != null && ((le.b) aVar.f356c).f12870f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f31933c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.f31931a + i11;
                        this.f31931a = f7;
                        if (f7 > i12) {
                            this.f31931a = 0.0f;
                            eoVar.f32340g9 = true;
                            eoVar.vc();
                            eoVar.f32380k1 = true;
                        }
                    }
                } else if (eoVar.f32380k1 && z12) {
                    float f10 = this.f31931a + i11;
                    this.f31931a = f10;
                    if (f10 < (-i12)) {
                        eoVar.f32340g9 = false;
                        eoVar.vc();
                        this.f31931a = 0.0f;
                    }
                }
            }
        }
        eoVar.r9();
        eoVar.f32291c9.H();
        ArrayList arrayList = eoVar.f32552xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((hz) arrayList.get(i13)).f33489c) {
                ((hz) arrayList.get(i13)).f33488b -= i11;
            }
        }
        yg.l0 l0Var = yg.l0.B;
        if (l0Var != null) {
            l0Var.f47055r -= i11;
            if (i11 != 0) {
                l0Var.f47058u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (eVar = eoVar2.F) != null) {
            eVar.f(i10, i11);
        }
        eoVar.i7(false);
        bi.x4 x4Var = eoVar.f32543x1;
        if (x4Var != null) {
            if (x4Var.V) {
                x4Var.e(true);
            } else if (!eoVar.Vb) {
                eoVar.Ub = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new vg(eoVar, 28));
                AndroidUtilities.runOnUIThread(new vg(eoVar, 29), 2000L);
            }
        }
        am amVar = eoVar.B1;
        if (amVar != null && amVar.V) {
            amVar.e(true);
        }
        bi.x4 x4Var2 = eoVar.f32568z1;
        if (x4Var2 != null && x4Var2.V) {
            x4Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new ck(eoVar, 0));
            AndroidUtilities.runOnUIThread(new ck(eoVar, 1), 2000L);
        }
        bi.x4 x4Var3 = eoVar.A1;
        if (x4Var3 != null) {
            x4Var3.e(true);
        }
        ok okVar = eoVar.Y;
        if (okVar != null) {
            okVar.l0();
        }
        xh.b4 b4Var = eoVar.f32462qc;
        if (b4Var != null) {
            b4Var.invalidate();
        }
        gh.a aVar2 = eoVar.Qb;
        if (aVar2 != null && aVar2.f9107b > 0) {
            int childCount = aVar2.f9106a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar2.f9106a.getChildAt(i14);
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
