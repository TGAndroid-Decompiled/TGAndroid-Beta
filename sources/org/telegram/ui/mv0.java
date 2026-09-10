package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class mv0 extends AnimatorListenerAdapter {
    public final int f35065a;
    public final Object f35066b;

    public mv0(Object obj, int i10) {
        this.f35065a = i10;
        this.f35066b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35065a) {
            case 23:
                ((r0.m0) this.f35066b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f35065a;
        float f7 = 0.0f;
        Object obj = this.f35066b;
        switch (i10) {
            case 0:
                rv0 rv0Var = (rv0) obj;
                if (rv0Var.C != null) {
                    rv0Var.C = null;
                    rv0Var.b();
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
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f30273d0.removeView(premiumPreviewFragment.f30289r0);
                premiumPreviewFragment.f30289r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 3:
                ((ProfileActivity) ((org.telegram.ui.Components.vv0) obj).f28603c).D5 = null;
                return;
            case 4:
                g11 g11Var = (g11) obj;
                if (!g11Var.E) {
                    g11Var.setVisibility(8);
                    return;
                }
                return;
            case 5:
                c21 c21Var = (c21) obj;
                if (animator.equals(c21Var.f31501c)) {
                    c21Var.f31501c = null;
                    return;
                }
                return;
            case 6:
                j31 j31Var = (j31) obj;
                bi.gd gdVar = j31Var.O;
                if (gdVar != null) {
                    if (gdVar.getParent() != null) {
                        ((ViewGroup) j31Var.O.getParent()).removeView(j31Var.O);
                    }
                    j31Var.O = null;
                }
                j31Var.N = null;
                super.onAnimationEnd(animator);
                return;
            case 7:
                ((c51) obj).d.f30549a0.f35612k0 = 1.0f;
                return;
            case 8:
                SecretMediaViewer secretMediaViewer = ((c51) obj).d;
                secretMediaViewer.f30549a0.setVisibility(4);
                secretMediaViewer.f30549a0.f35612k0 = 1.0f;
                return;
            case 9:
                l71 l71Var = ((b61) obj).e;
                l71Var.S0.G = 0.0f;
                l71Var.S0 = null;
                l71Var.f34570h0.invalidate();
                return;
            case 10:
                yg.f0.a();
                l71 l71Var2 = (l71) obj;
                i61 i61Var = l71Var2.f34570h0;
                i61 i61Var2 = l71Var2.f34570h0;
                i61Var.setLayerType(0, null);
                c61 c61Var = l71Var2.f34566f0;
                c61Var.setLayerType(0, null);
                l71Var2.f34563e0.setLayerType(0, null);
                l71Var2.f34556b0.setLayerType(0, null);
                org.telegram.ui.Components.qn qnVar = l71Var2.f34581n0;
                if (qnVar != null) {
                    qnVar.setLayerType(0, null);
                }
                View view = l71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                c61Var.b();
                l71Var2.f34561d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                l71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new k01(globalInstance, 13));
                l71Var2.h();
                l71Var2.E(1.0f);
                for (int i11 = 0; i11 < i61Var2.getChildCount(); i11++) {
                    View childAt = i61Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < l71Var2.f34561d0.f28802b.getChildCount(); i12++) {
                    View childAt2 = l71Var2.f34561d0.f28802b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                l71Var2.f34561d0.f28802b.invalidate();
                l71Var2.f34576k0.invalidate();
                i61Var2.invalidate();
                return;
            case 11:
                ((fb1) obj).f32743b0.setVisibility(8);
                return;
            case 12:
                ae1 ae1Var = ((od1) obj).f35470a;
                if (!ae1Var.f30957p1.a()) {
                    ae1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 13:
                super.onAnimationEnd(animator);
                ((cf1) obj).f31657a = null;
                return;
            case 14:
                super.onAnimationEnd(animator);
                ((gg1) obj).setScrollEnabled(true);
                return;
            case 15:
                lh1 lh1Var = (lh1) obj;
                if (animator.equals(lh1Var.e.K)) {
                    lh1Var.e.K = null;
                    return;
                }
                return;
            case 16:
                di1 di1Var = (di1) obj;
                di1Var.d = null;
                di1Var.f31920a = null;
                di1Var.f31921b = false;
                di1Var.f31923f.f30722c.setAllowDrawCursor(true);
                return;
            case 17:
                ki.i iVar = (ki.i) obj;
                ((tj1) iVar.f12544b).getClass();
                ((tj1) iVar.f12544b).f36955c.setVisibility(4);
                return;
            case 18:
                ((org.telegram.ui.web.c1) obj).f37899s.setVisibility(8);
                return;
            case 19:
                super.onAnimationEnd(animator);
                pg.l0 l0Var = (pg.l0) obj;
                ImageView imageView = l0Var.f40096c;
                l0Var.f40096c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 20:
                pg.r1 r1Var = (pg.r1) obj;
                if (animator == r1Var.f40277r) {
                    r1Var.f40275f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.f40277r = null;
                    return;
                }
                return;
            case 21:
                qg.s0 s0Var = (qg.s0) obj;
                if (s0Var.h) {
                    f7 = 1.0f;
                }
                s0Var.f40903n = f7;
                s0Var.e();
                return;
            case 22:
                qg.a2 a2Var = (qg.a2) ((bi.h0) obj).f2776b;
                a2Var.F = true;
                a2Var.invalidate();
                return;
            case 23:
                ((r0.m0) obj).c();
                return;
            case 24:
                super.onAnimationEnd(animator);
                rg.f fVar = (rg.f) ((rg.c) obj).f41478b;
                fVar.f41485b.d = 0.0f;
                fVar.T = null;
                fVar.h(fVar.I);
                return;
            case 25:
                sg.b bVar = (sg.b) obj;
                bVar.f41873b = 1.0f;
                bVar.invalidate();
                return;
            case 26:
                uh.h hVar = (uh.h) obj;
                Iterator it = hVar.h.iterator();
                while (it.hasNext()) {
                    uh.c cVar = (uh.c) it.next();
                    if (hVar.f42774c.size() < hVar.d) {
                        hVar.f42774c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable2 = hVar.f42785q;
                if (runnable2 != null) {
                    runnable2.run();
                    hVar.f42785q = null;
                }
                hVar.f42786r = null;
                hVar.invalidateSelf();
                return;
            case 27:
                ((wh.i0) obj).f44147b.f44168w.setVisibility(8);
                return;
            case 28:
                xh.q2 q2Var = (xh.q2) obj;
                q2Var.E = 1.0f;
                q2Var.F = -1;
                xh.p2 p2Var = q2Var.H;
                if (p2Var != null && (z10 = p2Var.f45865l) && z10) {
                    p2Var.f45865l = false;
                    p2Var.b();
                }
                q2Var.G = null;
                return;
            default:
                u00 u00Var = ((xh.n7) obj).f45776c;
                u00Var.setScaleX(1.0f);
                u00Var.setScaleY(1.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35065a) {
            case 4:
                ((g11) this.f35066b).setVisibility(0);
                return;
            case 23:
                ((r0.m0) this.f35066b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public mv0(r0.m0 m0Var, View view) {
        this.f35065a = 23;
        this.f35066b = m0Var;
    }
}
