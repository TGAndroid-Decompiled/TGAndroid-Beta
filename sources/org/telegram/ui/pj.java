package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class pj extends f2.d1 {
    public boolean f41545b;
    public final qn d;
    public float f41544a = 0.0f;
    public final int f41546c = AndroidUtilities.dp(100.0f);

    public pj(qn qnVar) {
        this.d = qnVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i9) {
        qn qnVar = this.d;
        if (i9 == 0) {
            org.telegram.ui.Cells.t1 t1Var = qnVar.f41979l2;
            if (t1Var != null) {
                qnVar.f41956j2.e(t1Var, -1, qnVar.f41991m2, qnVar.f42004n2, true);
                qnVar.f41979l2 = null;
            }
            qnVar.f41907f3 = false;
            qnVar.f41919g3 = false;
            qnVar.f41932h3 = false;
            qnVar.f41945i3 = false;
            qnVar.f9(true);
            qnVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i10 = qn.Dc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            qnVar.f42077t0.setOverScrollMode(0);
            qnVar.Y8.W();
            qnVar.Wc(false);
            qnVar.q9(1);
            qnVar.f42023oa = false;
            return;
        }
        kh.x3 x3Var = qnVar.f42091u1;
        if (x3Var != null && x3Var.R) {
            x3Var.e(true);
        }
        org.telegram.ui.Components.j6 j6Var = qnVar.S2;
        if (j6Var != null && j6Var.getVisibility() == 0 && qnVar.x9()) {
            AndroidUtilities.hideKeyboard(qnVar.getParentActivity().getCurrentFocus());
        }
        if (i9 == 2) {
            qnVar.f42157z4 = true;
            qnVar.f41932h3 = true;
        } else if (i9 == 1) {
            qnVar.f41979l2 = null;
            qnVar.f42157z4 = true;
            qnVar.f41907f3 = true;
            qnVar.f41919g3 = true;
            qnVar.f41945i3 = true;
            qnVar.f41932h3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i11 = qn.Dc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        hg.v vVar = qnVar.U9;
        if (vVar != null && vVar.d()) {
            qnVar.U9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        boolean z10;
        boolean z11;
        ig.e eVar;
        boolean z12;
        boolean z13;
        qn qnVar = this.d;
        qn qnVar2 = qnVar.Z9;
        if (qnVar2 == null) {
            qnVar2 = qnVar;
        }
        qnVar.f42077t0.invalidate();
        boolean z14 = true;
        if (i10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41545b = z10;
        int L0 = qnVar.f42103v0.L0();
        j4.c cVar = null;
        if (((i10 != 0 && qnVar.f42023oa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && qnVar.J4 != 0) {
            if (this.f41545b && !qnVar.K4) {
                if (!qnVar.f42077t0.T1 && L0 != -1) {
                    int N0 = qnVar.f42103v0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = qnVar.f42103v0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.t1) {
                                messageObject = ((org.telegram.ui.Cells.t1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                                messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                            }
                            if (messageObject != null && qnVar.J4 == messageObject.getId()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && messageObject != null && messageObject.getId() < qnVar.J4) {
                        qnVar.J4 = 0;
                    }
                }
            } else {
                qnVar.J4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            qnVar.K4 = false;
            if (!qnVar.f42157z4 && i10 != 0) {
                qnVar.f42157z4 = true;
            }
        }
        if (i10 != 0) {
            qnVar.q9(1);
            qnVar.T0.getClass();
            qnVar.h9(true);
        }
        if (i10 != 0 && qnVar.f41907f3 && !qnVar.f41855b3) {
            if (qnVar.H7 != Integer.MAX_VALUE) {
                qnVar.Ia();
                qnVar.Wc(false);
            }
            qnVar.Fb(true);
        }
        if (qnVar.t9() && i10 != 0 && qnVar.f41919g3 && !qnVar.f41855b3) {
            if (qnVar.H7 != Integer.MAX_VALUE) {
                qnVar.Ia();
                qnVar.Wc(false);
            }
            qnVar.Gb(true);
        }
        qnVar.a7(true);
        if (L0 != -1) {
            qnVar.f42114w0.h();
            if (L0 == 0 && qnVar.A6[0]) {
                if (i10 >= 0) {
                    qnVar.f41874c9 = false;
                    qnVar.vc();
                }
            } else {
                j4.c[] cVarArr = qnVar.f41905f1.f47199e;
                if (1 < cVarArr.length) {
                    cVar = cVarArr[1];
                }
                if (cVar != null && ((td.a) cVar.f13432c).f47776f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i11 = this.f41546c;
                if (i10 > 0) {
                    if (!z12) {
                        float f10 = this.f41544a + i10;
                        this.f41544a = f10;
                        if (f10 > i11) {
                            this.f41544a = 0.0f;
                            qnVar.f41874c9 = true;
                            qnVar.vc();
                            qnVar.f41917g1 = true;
                        }
                    }
                } else if (qnVar.f41917g1 && z12) {
                    float f11 = this.f41544a + i10;
                    this.f41544a = f11;
                    if (f11 < (-i11)) {
                        qnVar.f41874c9 = false;
                        qnVar.vc();
                        this.f41544a = 0.0f;
                    }
                }
            }
        }
        qnVar.r9();
        qnVar.Y8.H();
        ArrayList arrayList = qnVar.f42087ta.B;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (!((oy) arrayList.get(i12)).f41264c) {
                ((oy) arrayList.get(i12)).f41263b -= i10;
            }
        }
        hg.n0 n0Var = hg.n0.B;
        if (n0Var != null) {
            n0Var.f10671r -= i10;
            if (i10 != 0) {
                n0Var.f10674u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (eVar = qnVar2.B) != null) {
            eVar.f(i9, i10);
        }
        qnVar.i7(false);
        kh.x3 x3Var = qnVar.f42078t1;
        if (x3Var != null) {
            if (x3Var.R) {
                x3Var.e(true);
            } else if (!qnVar.Rb) {
                qnVar.Qb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new jg(qnVar, 28));
                AndroidUtilities.runOnUIThread(new jg(qnVar, 29), 2000L);
            }
        }
        ml mlVar = qnVar.f42128x1;
        if (mlVar != null && mlVar.R) {
            mlVar.e(true);
        }
        kh.x3 x3Var2 = qnVar.f42104v1;
        if (x3Var2 != null && x3Var2.R) {
            x3Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new oj(qnVar, 0));
            AndroidUtilities.runOnUIThread(new oj(qnVar, 1), 2000L);
        }
        kh.x3 x3Var3 = qnVar.f42115w1;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        ak akVar = qnVar.U;
        if (akVar != null) {
            akVar.k0();
        }
        gh.p5 p5Var = qnVar.f42000mc;
        if (p5Var != null) {
            p5Var.invalidate();
        }
        pg.a aVar = qnVar.Mb;
        if (aVar != null && aVar.f45840b > 0) {
            int childCount = aVar.f45839a.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 < childCount) {
                    View childAt = aVar.f45839a.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        z11 = aVar.a(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        z11 = aVar.a(((org.telegram.ui.Cells.w0) childAt).getMessageObject());
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
