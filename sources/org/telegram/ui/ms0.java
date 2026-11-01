package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ms0 extends AnimatorListenerAdapter {
    public final int f39609a;
    public final Object f39610b;

    public ms0(Object obj, int i10) {
        this.f39609a = i10;
        this.f39610b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        boolean z10;
        int i12 = this.f39609a;
        int i13 = 4;
        Object obj = this.f39610b;
        switch (i12) {
            case 0:
                ps0 ps0Var = (ps0) obj;
                if (ps0Var.C != null) {
                    ps0Var.C = null;
                    ps0Var.b();
                    return;
                }
                return;
            case 1:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    return;
                }
                return;
            case 2:
                ((mw0) obj).f39627b.P5 = null;
                return;
            case 3:
                xx0 xx0Var = (xx0) obj;
                if (!xx0Var.E) {
                    xx0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                ty0 ty0Var = (ty0) obj;
                if (animator.equals(ty0Var.d)) {
                    ty0Var.d = null;
                    return;
                }
                return;
            case 5:
                ((v01) obj).d.Y.f41451k0 = 1.0f;
                return;
            case 6:
                SecretMediaViewer secretMediaViewer = ((v01) obj).d;
                secretMediaViewer.Y.setVisibility(4);
                secretMediaViewer.Y.f41451k0 = 1.0f;
                return;
            case 7:
                g31 g31Var = ((x11) obj).e;
                g31Var.S0.G = 0.0f;
                g31Var.S0 = null;
                g31Var.f37305h0.invalidate();
                return;
            case 8:
                sg.e0.a();
                g31 g31Var2 = (g31) obj;
                e21 e21Var = g31Var2.f37305h0;
                e21 e21Var2 = g31Var2.f37305h0;
                e21Var.setLayerType(0, null);
                y11 y11Var = g31Var2.f37301f0;
                y11Var.setLayerType(0, null);
                g31Var2.f37298e0.setLayerType(0, null);
                g31Var2.f37291b0.setLayerType(0, null);
                org.telegram.ui.Components.bn bnVar = g31Var2.f37316n0;
                if (bnVar != null) {
                    bnVar.setLayerType(0, null);
                }
                View view = g31Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                y11Var.b();
                g31Var2.f37296d0.m(false);
                org.telegram.messenger.at.e().k(99, 512);
                g31Var2.X1.e();
                org.telegram.messenger.i0.g3(new vv0(org.telegram.messenger.at.e(), 17));
                g31Var2.h();
                g31Var2.E(1.0f);
                for (int i14 = 0; i14 < e21Var2.getChildCount(); i14++) {
                    View childAt = e21Var2.getChildAt(i14);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i15 = 0; i15 < g31Var2.f37296d0.f33184b.getChildCount(); i15++) {
                    View childAt2 = g31Var2.f37296d0.f33184b.getChildAt(i15);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                g31Var2.f37296d0.f33184b.invalidate();
                g31Var2.f37311k0.invalidate();
                e21Var2.invalidate();
                return;
            case 9:
                ((s61) obj).f41237a0.setVisibility(8);
                return;
            case 10:
                k91 k91Var = ((z81) obj).f43849a;
                if (!k91Var.f38758q1.a()) {
                    k91Var.S1.setVisibility(8);
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                ((ha1) obj).d = null;
                return;
            case 12:
                super.onAnimationEnd(animator);
                ((lb1) obj).setScrollEnabled(true);
                return;
            case 13:
                qc1 qc1Var = (qc1) obj;
                if (animator.equals(qc1Var.d.K)) {
                    qc1Var.d.K = null;
                    return;
                }
                return;
            case 14:
                ed1 ed1Var = (ed1) obj;
                ed1Var.d = null;
                ed1Var.f36804a = null;
                ed1Var.f36805b = false;
                ed1Var.f36807f.f34155c.setAllowDrawCursor(true);
                return;
            case 15:
                ((org.telegram.ui.Wallet.w3) obj).K = null;
                return;
            case 16:
                ((org.telegram.ui.Wallet.d4) obj).f();
                return;
            case 17:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) obj;
                if (b6Var.J0 == animator) {
                    b6Var.J0 = null;
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) obj;
                z5Var.h = false;
                z5Var.f35470n = null;
                z5Var.f35467b.setLayerType(0, null);
                return;
            case 19:
                org.telegram.ui.Wallet.g6 g6Var = (org.telegram.ui.Wallet.g6) obj;
                g6Var.N = 0.0f;
                g6Var.O = 0.0f;
                g6Var.f34561b0 = null;
                return;
            case 20:
                org.telegram.ui.Wallet.a7 a7Var = (org.telegram.ui.Wallet.a7) obj;
                a7Var.I = null;
                a7Var.f34203i0 = 1.0f;
                a7Var.f34202h0 = 0.0f;
                a7Var.f34201g0 = 0.0f;
                a7Var.e();
                return;
            case 21:
                org.telegram.ui.Wallet.y8 y8Var = (org.telegram.ui.Wallet.y8) obj;
                EditTextBoldCursor editTextBoldCursor = y8Var.f35423b;
                if (y8Var.f35428s == animator) {
                    y8Var.f35428s = null;
                    View view2 = y8Var.f35422a;
                    if (y8Var.f35431y) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    view2.setVisibility(i10);
                    if (y8Var.f35431y) {
                        i13 = 0;
                    }
                    editTextBoldCursor.setVisibility(i13);
                    if (y8Var.f35431y && !y8Var.D) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.i0.J3(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Wallet.q9 q9Var = (org.telegram.ui.Wallet.q9) obj;
                q9Var.f35096n = null;
                org.telegram.ui.Wallet.a7 a7Var2 = q9Var.d;
                if (q9Var.f35100x) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                a7Var2.setVisibility(i11);
                TextView textView = q9Var.f35095f;
                if (q9Var.f35101y) {
                    i13 = 0;
                }
                textView.setVisibility(i13);
                return;
            case 23:
                ji.i iVar = (ji.i) obj;
                ((ue1) iVar.f10447b).getClass();
                ((ue1) iVar.f10447b).f41927c.setVisibility(4);
                return;
            case 24:
                ((org.telegram.ui.web.z0) obj).f43082s.setVisibility(8);
                return;
            case 25:
                ((ph.i0) obj).f45123b.f45164s1.setVisibility(8);
                return;
            case 26:
                rh.v2 v2Var = (rh.v2) obj;
                v2Var.E = 1.0f;
                v2Var.F = -1;
                rh.u2 u2Var = v2Var.H;
                if (u2Var != null && (z10 = u2Var.f47543l) && z10) {
                    u2Var.f47543l = false;
                    u2Var.b();
                }
                v2Var.G = null;
                return;
            case 27:
                wz wzVar = ((rh.w7) obj).f47659c;
                wzVar.setScaleX(1.0f);
                wzVar.setScaleY(1.0f);
                return;
            case 28:
                ((rh.n) obj).run();
                return;
            default:
                ((sg.o) obj).f48439w.setVisibility(4);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39609a) {
            case 3:
                ((xx0) this.f39610b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
