package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ns0 extends AnimatorListenerAdapter {
    public final int f40045a;
    public final Object f40046b;

    public ns0(Object obj, int i10) {
        this.f40045a = i10;
        this.f40046b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        boolean z10;
        int i12 = this.f40045a;
        int i13 = 4;
        Object obj = this.f40046b;
        switch (i12) {
            case 0:
                qs0 qs0Var = (qs0) obj;
                if (qs0Var.C != null) {
                    qs0Var.C = null;
                    qs0Var.b();
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
                ((nw0) obj).f40063b.O5 = null;
                return;
            case 3:
                yx0 yx0Var = (yx0) obj;
                if (!yx0Var.E) {
                    yx0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                uy0 uy0Var = (uy0) obj;
                if (animator.equals(uy0Var.d)) {
                    uy0Var.d = null;
                    return;
                }
                return;
            case 5:
                ((v01) obj).d.Y.f41928k0 = 1.0f;
                return;
            case 6:
                SecretMediaViewer secretMediaViewer = ((v01) obj).d;
                secretMediaViewer.Y.setVisibility(4);
                secretMediaViewer.Y.f41928k0 = 1.0f;
                return;
            case 7:
                i31 i31Var = ((z11) obj).e;
                i31Var.S0.G = 0.0f;
                i31Var.S0 = null;
                i31Var.f38129h0.invalidate();
                return;
            case 8:
                sg.e0.a();
                i31 i31Var2 = (i31) obj;
                g21 g21Var = i31Var2.f38129h0;
                g21 g21Var2 = i31Var2.f38129h0;
                g21Var.setLayerType(0, null);
                a21 a21Var = i31Var2.f38125f0;
                a21Var.setLayerType(0, null);
                i31Var2.f38122e0.setLayerType(0, null);
                i31Var2.f38115b0.setLayerType(0, null);
                org.telegram.ui.Components.bn bnVar = i31Var2.f38140n0;
                if (bnVar != null) {
                    bnVar.setLayerType(0, null);
                }
                View view = i31Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                a21Var.b();
                i31Var2.f38120d0.m(false);
                org.telegram.messenger.zs.e().k(99, 512);
                i31Var2.X1.e();
                org.telegram.messenger.i0.g3(new wv0(org.telegram.messenger.zs.e(), 17));
                i31Var2.h();
                i31Var2.E(1.0f);
                for (int i14 = 0; i14 < g21Var2.getChildCount(); i14++) {
                    View childAt = g21Var2.getChildAt(i14);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i15 = 0; i15 < i31Var2.f38120d0.f32758b.getChildCount(); i15++) {
                    View childAt2 = i31Var2.f38120d0.f32758b.getChildAt(i15);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                i31Var2.f38120d0.f32758b.invalidate();
                i31Var2.f38135k0.invalidate();
                g21Var2.invalidate();
                return;
            case 9:
                ((u61) obj).f42024a0.setVisibility(8);
                return;
            case 10:
                m91 m91Var = ((b91) obj).f36142a;
                if (!m91Var.f39583q1.a()) {
                    m91Var.S1.setVisibility(8);
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                ((ja1) obj).d = null;
                return;
            case 12:
                super.onAnimationEnd(animator);
                ((nb1) obj).setScrollEnabled(true);
                return;
            case 13:
                sc1 sc1Var = (sc1) obj;
                if (animator.equals(sc1Var.d.K)) {
                    sc1Var.d.K = null;
                    return;
                }
                return;
            case 14:
                gd1 gd1Var = (gd1) obj;
                gd1Var.d = null;
                gd1Var.f37516a = null;
                gd1Var.f37517b = false;
                gd1Var.f37519f.f34148c.setAllowDrawCursor(true);
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
                z5Var.f35463n = null;
                z5Var.f35460b.setLayerType(0, null);
                return;
            case 19:
                org.telegram.ui.Wallet.g6 g6Var = (org.telegram.ui.Wallet.g6) obj;
                g6Var.N = 0.0f;
                g6Var.O = 0.0f;
                g6Var.f34555b0 = null;
                return;
            case 20:
                org.telegram.ui.Wallet.a7 a7Var = (org.telegram.ui.Wallet.a7) obj;
                a7Var.I = null;
                a7Var.f34204i0 = 1.0f;
                a7Var.f34203h0 = 0.0f;
                a7Var.f34202g0 = 0.0f;
                a7Var.e();
                return;
            case 21:
                org.telegram.ui.Wallet.y8 y8Var = (org.telegram.ui.Wallet.y8) obj;
                EditTextBoldCursor editTextBoldCursor = y8Var.f35420b;
                if (y8Var.f35425s == animator) {
                    y8Var.f35425s = null;
                    View view2 = y8Var.f35419a;
                    if (y8Var.f35428y) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    view2.setVisibility(i10);
                    if (y8Var.f35428y) {
                        i13 = 0;
                    }
                    editTextBoldCursor.setVisibility(i13);
                    if (y8Var.f35428y && !y8Var.D) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.i0.J3(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Wallet.q9 q9Var = (org.telegram.ui.Wallet.q9) obj;
                q9Var.f35090n = null;
                org.telegram.ui.Wallet.a7 a7Var2 = q9Var.d;
                if (q9Var.f35094x) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                a7Var2.setVisibility(i11);
                TextView textView = q9Var.f35089f;
                if (q9Var.f35095y) {
                    i13 = 0;
                }
                textView.setVisibility(i13);
                return;
            case 23:
                ji.i iVar = (ji.i) obj;
                ((we1) iVar.f10446b).getClass();
                ((we1) iVar.f10446b).f42970c.setVisibility(4);
                return;
            case 24:
                ((org.telegram.ui.web.z0) obj).f43280s.setVisibility(8);
                return;
            case 25:
                ((ph.i0) obj).f45112b.f45153s1.setVisibility(8);
                return;
            case 26:
                rh.u2 u2Var = (rh.u2) obj;
                u2Var.E = 1.0f;
                u2Var.F = -1;
                rh.t2 t2Var = u2Var.H;
                if (t2Var != null && (z10 = t2Var.f47499l) && z10) {
                    t2Var.f47499l = false;
                    t2Var.b();
                }
                u2Var.G = null;
                return;
            case 27:
                xz xzVar = ((rh.w7) obj).f47649c;
                xzVar.setScaleX(1.0f);
                xzVar.setScaleY(1.0f);
                return;
            case 28:
                ((rh.o) obj).run();
                return;
            default:
                ((sg.o) obj).f48428w.setVisibility(4);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40045a) {
            case 3:
                ((yx0) this.f40046b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
