package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ta1;

public final class xm extends f2.b1 {

    public final int f34650a;

    public final Object f34651b;

    public xm(Object obj, int i10) {
        this.f34650a = i10;
        this.f34651b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        lk0 lk0Var;
        int top;
        lk0 lk0Var2;
        int i11 = this.f34650a;
        Object obj = this.f34651b;
        switch (i11) {
            case 0:
                in inVar = (in) obj;
                ta1 ta1Var = inVar.f29437s;
                gi giVar = inVar.f34900b;
                if (i10 == 0) {
                    int iDp = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop = giVar.getBackgroundPaddingTop();
                    if (((giVar.X1[0] - backgroundPaddingTop) - iDp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (lk0Var = (lk0) ta1Var.K(1)) != null && (top = (lk0Var.f5789a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        ta1Var.v0(0, top, null);
                    }
                    int i12 = inVar.S0;
                    if (i12 >= 0) {
                        in.K(inVar, i12);
                        inVar.S0 = -1;
                    }
                }
                break;
            case 6:
                z90 z90Var = (z90) obj;
                z90Var.T2 = i10 != 0;
                z90Var.U2 = i10 == 1;
                break;
            case 8:
                cg0 cg0Var = (cg0) obj;
                wf0 wf0Var = cg0Var.f27417b;
                if (i10 == 0 && ((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingTop + ((cg0Var.A - ((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingTop) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && wf0Var.canScrollVertically(1)) {
                    wf0Var.getChildAt(0);
                    lk0 lk0Var3 = (lk0) wf0Var.K(0);
                    if (lk0Var3 != null) {
                        View view = lk0Var3.f5789a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            wf0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                        }
                    }
                    break;
                }
                break;
            case 10:
                zk0 zk0Var = (zk0) obj;
                if (i10 == 0) {
                    if (zk0Var.f35289r2) {
                        zk0Var.f35289r2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!zk0Var.f35289r2 && zk0Var.f35292t1) {
                    zk0Var.f35289r2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && zk0Var.J1 != null) {
                    bg.d dVar = zk0Var.f35256a1;
                    if (dVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar);
                        zk0Var.f35256a1 = null;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        zk0Var.I1.P(motionEventObtain);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                    zk0Var.J1.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    View view2 = zk0Var.J1;
                    zk0Var.h1(view2, 0.0f, 0.0f, false);
                    zk0Var.J1 = null;
                    zk0Var.k1(null, view2);
                    zk0Var.L1 = false;
                }
                f2.b1 b1Var = zk0Var.W0;
                if (b1Var != null) {
                    b1Var.a(recyclerView, i10);
                }
                boolean z10 = i10 == 1 || i10 == 2;
                zk0Var.G1 = z10;
                if (z10) {
                    zk0Var.H1 = true;
                }
                break;
            case 11:
                jm0 jm0Var = (jm0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(jm0Var.B.getCurrentFocus());
                }
                jm0Var.a();
                break;
            case 15:
                u51 u51Var = (u51) obj;
                hh.f1 f1Var = u51Var.d;
                if (i10 == 0 && u51Var.C && AndroidUtilities.dp(13.0f) + ((org.telegram.ui.ActionBar.e3) u51Var).backgroundPaddingTop + u51Var.f32986y < AndroidUtilities.statusBarHeight * 2 && f1Var.canScrollVertically(1) && (lk0Var2 = (lk0) f1Var.K(0)) != null) {
                    View view3 = lk0Var2.f5789a;
                    if (view3.getTop() > 0) {
                        f1Var.v0(0, view3.getTop(), null);
                    }
                    break;
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((qf.s1) obj).getParentActivity().getCurrentFocus());
                }
                break;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        x30 x30Var;
        String str;
        TLRPC.User user;
        String str2;
        ik0 ik0Var;
        switch (this.f34650a) {
            case 0:
                in inVar = (in) this.f34651b;
                zi ziVar = inVar.f29442w;
                inVar.f34900b.X1(inVar, i11);
                ym ymVar = inVar.f29444x;
                if (ymVar != null && ymVar.f34370s) {
                    ux0 delegate = ymVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.z5) {
                        ta1 ta1Var = inVar.f29437s;
                        View viewF = ta1Var.F((org.telegram.ui.Cells.z5) delegate);
                        f2.o1 o1VarT = viewF == null ? null : ta1Var.T(viewF);
                        if (o1VarT != null) {
                            View view = o1VarT.f5789a;
                            int iB = o1VarT.b();
                            if (ymVar.getDirection() == 0) {
                                ymVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                ymVar.setTranslationY(view.getY());
                            }
                            if (iB < ziVar.L0() || iB > ziVar.N0()) {
                                ymVar.f();
                            }
                        } else {
                            ymVar.f();
                        }
                    } else {
                        ymVar.f();
                    }
                }
                if (i11 != 0 && (x30Var = inVar.f29446y) != null) {
                    x30Var.b(true);
                    break;
                }
                break;
            case 1:
                jn jnVar = (jn) this.f34651b;
                jnVar.f34900b.X1(jnVar, i11);
                break;
            case 2:
                ap apVar = (ap) this.f34651b;
                if (apVar.f26789x.M0() + 10 >= apVar.h.h()) {
                    apVar.x();
                }
                break;
            case 3:
                cv cvVar = (cv) this.f34651b;
                su suVar = cvVar.f27550f;
                if (suVar != null && cvVar.h.G1 && suVar.f32575w) {
                    suVar.f32575w = false;
                    suVar.invalidate();
                    break;
                }
                break;
            case 4:
                yz yzVar = (yz) this.f34651b;
                yzVar.B.invalidate();
                yzVar.invalidate();
                break;
            case 5:
                b00.G((b00) this.f34651b);
                break;
            case 6:
                z90 z90Var = (z90) this.f34651b;
                f2.x0 layoutManager = z90Var.getLayoutManager();
                aa0 aa0Var = z90Var.X2;
                t90 t90Var = aa0Var.d;
                int iN0 = layoutManager == t90Var ? t90Var.N0() : aa0Var.f26701c.N0();
                if ((iN0 == -1 ? 0 : iN0) > 0) {
                    pf.u0 u0Var = aa0Var.f26703f;
                    if (iN0 > u0Var.H0 - 5 && u0Var.f45940q0 == 0 && (str = u0Var.f45938o0) != null && str.length() != 0 && (user = u0Var.f45944s0) != null && (str2 = u0Var.f45937n0) != null) {
                        u0Var.T(true, user, str2, u0Var.f45938o0);
                    }
                }
                boolean z10 = !z90Var.canScrollVertically(-1);
                z90Var.canScrollVertically(1);
                aa0Var.n(z10);
                aa0Var.b();
                break;
            case 7:
                ab0 ab0Var = (ab0) this.f34651b;
                gh.q4 q4Var = ab0Var.f26713b;
                ta0 ta0Var = ab0Var.f26716f;
                for (int i12 = 0; i12 < ta0Var.getChildCount(); i12++) {
                    View childAt = ta0Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) childAt).Y3(q4Var.getMeasuredWidth(), q4Var.getBackgroundSizeY());
                    }
                }
                sa0 sa0Var = ab0Var.f26715e;
                if (sa0Var != null) {
                    sa0Var.x();
                }
                break;
            case 8:
                cg0 cg0Var = (cg0) this.f34651b;
                if (cg0Var.f27417b.getChildCount() > 0) {
                    cg0.u(cg0Var);
                    break;
                }
                break;
            case 9:
                wj0 wj0Var = (wj0) this.f34651b;
                hh.f1 f1Var = wj0Var.f34236b;
                int[] iArr = wj0Var.f34237b0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i13 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float fMin = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i13, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(fMin)) {
                        fMin = 1.0f;
                    }
                    wj0.b(wj0Var, childAt2, fMin);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float fMin2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i13) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(fMin2)) {
                        fMin2 = 1.0f;
                    }
                    wj0.b(wj0Var, childAt3, fMin2);
                }
                for (int i14 = 1; i14 < f1Var.getChildCount() - 1; i14++) {
                    wj0.b(wj0Var, f1Var.getChildAt(i14), 1.0f);
                }
                wj0Var.invalidate();
                break;
            case 10:
                zk0 zk0Var = (zk0) this.f34651b;
                Rect rect = zk0Var.C1;
                f2.b1 b1Var = zk0Var.W0;
                if (b1Var != null) {
                    b1Var.b(recyclerView, i10, i11);
                }
                if (zk0Var.A1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = zk0Var.f35304z1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    zk0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                zk0Var.K0(false);
                if (i11 != 0 && (ik0Var = zk0Var.f35257b1) != null) {
                    ik0Var.b();
                }
                mk0 mk0Var = zk0Var.Q1;
                if (mk0Var != null) {
                    zk0Var.e1(mk0Var, 700, false);
                }
                break;
            case 12:
                lu0.m((lu0) this.f34651b);
                break;
            case 13:
                ((ov0) this.f34651b).T.V();
                break;
            case 14:
                ex0.O((ex0) this.f34651b);
                break;
            case 15:
                ((u51) this.f34651b).L();
                break;
            case 16:
                ((o71) this.f34651b).invalidate();
                break;
            case 17:
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.f34651b;
                if (!pVar.f28261a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(pVar.f43933s)) {
                        pVar.d.d();
                    } else {
                        org.telegram.ui.web.j jVar = pVar.f43929e;
                        if (jVar != null) {
                            jVar.d();
                        }
                    }
                }
                if (pVar.f28261a.G1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                }
                break;
            case 18:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f34651b;
                if (d1Var.f28261a.G1) {
                    AndroidUtilities.hideKeyboard(d1Var.fragmentView);
                }
                break;
            case 19:
                qf.m.b0((qf.m) this.f34651b);
                break;
            case 20:
                qf.e0 e0Var = (qf.e0) this.f34651b;
                e0Var.f34900b.X1(e0Var, i11);
                e0Var.M();
                break;
        }
    }
}
