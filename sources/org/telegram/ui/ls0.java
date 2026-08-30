package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ls0 extends AnimatorListenerAdapter {
    public final int f36131a;
    public final Object f36132b;

    public ls0(Object obj, int i10) {
        this.f36131a = i10;
        this.f36132b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36131a) {
            case 0:
                ((PhotoViewer) ((org.telegram.ui.Components.ex0) this.f36132b).f24697c).f31906x2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z4;
        boolean z10;
        int i10 = this.f36131a;
        boolean z11 = false;
        boolean z12 = false;
        Object obj = this.f36132b;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ex0) obj).f24697c;
                if (photoViewer.f31906x2 != null) {
                    el0 el0Var = new el0(this, 18);
                    photoViewer.F2 = el0Var;
                    AndroidUtilities.runOnUIThread(el0Var, 860L);
                    return;
                }
                return;
            case 1:
                bt0 bt0Var = (bt0) obj;
                PhotoViewer photoViewer2 = bt0Var.f33030b;
                yf.n nVar = photoViewer2.f31924z1.f31004b;
                nVar.q();
                CropAreaView cropAreaView = nVar.f47246a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.f31924z1.f31004b.G = true;
                photoViewer2.f31808m6 = null;
                photoViewer2.f31853r4 = bt0Var.f33029a;
                ph.i3 i3Var = photoViewer2.f1().I;
                if (photoViewer2.f31853r4 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i3Var.b(z4);
                ph.i3 i3Var2 = photoViewer2.H1;
                if (i3Var2 != null) {
                    if (photoViewer2.f31853r4 != 3) {
                        z11 = true;
                    }
                    i3Var2.b(z11);
                }
                if (photoViewer2.f31853r4 != 3) {
                    photoViewer2.W5 = 0.0f;
                }
                photoViewer2.f31800l6 = -1;
                photoViewer2.f31711b6 = 1.0f;
                photoViewer2.X5 = 1.0f;
                photoViewer2.Z5 = 0.0f;
                photoViewer2.f31701a6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f31841q2 = true;
                photoViewer2.f31705b0.invalidate();
                return;
            case 2:
                ct0 ct0Var = (ct0) obj;
                PhotoViewer photoViewer3 = ct0Var.f33428b;
                photoViewer3.F1.f27245f0.setVisibility(0);
                photoViewer3.f31808m6 = null;
                photoViewer3.f31853r4 = ct0Var.f33427a;
                ph.i3 i3Var3 = photoViewer3.f1().I;
                if (photoViewer3.f31853r4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i3Var3.b(z10);
                ph.i3 i3Var4 = photoViewer3.H1;
                if (i3Var4 != null) {
                    if (photoViewer3.f31853r4 != 3) {
                        z12 = true;
                    }
                    i3Var4.b(z12);
                }
                if (photoViewer3.f31853r4 != 3) {
                    photoViewer3.W5 = 0.0f;
                }
                photoViewer3.f31800l6 = -1;
                photoViewer3.f31711b6 = 1.0f;
                photoViewer3.X5 = 1.0f;
                photoViewer3.Z5 = 0.0f;
                photoViewer3.f31701a6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f31841q2 = true;
                photoViewer3.f31705b0.invalidate();
                return;
            case 3:
                ((PhotoViewer) ((gt0) obj).f34676n0).f31887v3[0].setTag(null);
                return;
            case 4:
                ((ht0) obj).d.Q1.f38745h0 = 1.0f;
                return;
            case 5:
                PhotoViewer photoViewer4 = ((ht0) obj).d;
                photoViewer4.Q1.setVisibility(4);
                photoViewer4.Q1.f38745h0 = 1.0f;
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new el0(this, 20));
                return;
            case 7:
                ys0 ys0Var = (ys0) obj;
                if (animator.equals(ys0Var.f40570c.Q7)) {
                    ys0Var.f40570c.Q7 = null;
                    return;
                }
                return;
            case 8:
                gu0 gu0Var = (gu0) obj;
                if (gu0Var.e == animator) {
                    gu0Var.f34680c[1].setVisibility(8);
                    gu0Var.e = null;
                    return;
                }
                return;
            case 9:
                vu0 vu0Var = (vu0) obj;
                if (vu0Var.C != null) {
                    vu0Var.C = null;
                    vu0Var.b();
                    return;
                }
                return;
            case 10:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.V;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.V = null;
                    return;
                }
                return;
            case 11:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f31952a0.removeView(premiumPreviewFragment.f31969o0);
                premiumPreviewFragment.f31969o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 12:
                ((ProfileActivity) ((org.telegram.ui.Components.ex0) obj).f24697c).A5 = null;
                return;
            case 13:
                h01 h01Var = (h01) obj;
                if (!h01Var.B) {
                    h01Var.setVisibility(8);
                    return;
                }
                return;
            case 14:
                e11 e11Var = (e11) obj;
                if (animator.equals(e11Var.f33853c)) {
                    e11Var.f33853c = null;
                    return;
                }
                return;
            case 15:
                l21 l21Var = (l21) obj;
                org.telegram.ui.Components.uo uoVar = l21Var.L;
                if (uoVar != null) {
                    if (uoVar.getParent() != null) {
                        ((ViewGroup) l21Var.L.getParent()).removeView(l21Var.L);
                    }
                    l21Var.L = null;
                }
                l21Var.K = null;
                super.onAnimationEnd(animator);
                return;
            case 16:
                ((e41) obj).d.X.f38745h0 = 1.0f;
                return;
            case 17:
                SecretMediaViewer secretMediaViewer = ((e41) obj).d;
                secretMediaViewer.X.setVisibility(4);
                secretMediaViewer.X.f38745h0 = 1.0f;
                return;
            case 18:
                q61 q61Var = ((f51) obj).e;
                q61Var.P0.D = 0.0f;
                q61Var.P0 = null;
                q61Var.f37605e0.invalidate();
                return;
            case 19:
                mg.g0.a();
                q61 q61Var2 = (q61) obj;
                m51 m51Var = q61Var2.f37605e0;
                m51 m51Var2 = q61Var2.f37605e0;
                m51Var.setLayerType(0, null);
                g51 g51Var = q61Var2.f37601c0;
                g51Var.setLayerType(0, null);
                q61Var2.f37598b0.setLayerType(0, null);
                q61Var2.V.setLayerType(0, null);
                org.telegram.ui.Components.hn hnVar = q61Var2.f37618k0;
                if (hnVar != null) {
                    hnVar.setLayerType(0, null);
                }
                View view = q61Var2.f37616j0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                g51Var.b();
                q61Var2.f37595a0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                q61Var2.T1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new vy0(globalInstance, 15));
                q61Var2.h();
                q61Var2.E(1.0f);
                for (int i11 = 0; i11 < m51Var2.getChildCount(); i11++) {
                    View childAt = m51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < q61Var2.f37595a0.f29253b.getChildCount(); i12++) {
                    View childAt2 = q61Var2.f37595a0.f29253b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                q61Var2.f37595a0.f29253b.invalidate();
                q61Var2.f37612h0.invalidate();
                m51Var2.invalidate();
                return;
            case 20:
                ((ga1) obj).Y.setVisibility(8);
                return;
            case 21:
                cd1 cd1Var = ((qc1) obj).f37723a;
                if (!cd1Var.f33320m1.a()) {
                    cd1Var.O1.setVisibility(8);
                    return;
                }
                return;
            case 22:
                super.onAnimationEnd(animator);
                ((de1) obj).f33614a = null;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((if1) obj).setScrollEnabled(true);
                return;
            case 24:
                ng1 ng1Var = (ng1) obj;
                if (animator.equals(ng1Var.e.H)) {
                    ng1Var.e.H = null;
                    return;
                }
                return;
            case 25:
                eh1 eh1Var = (eh1) obj;
                eh1Var.d = null;
                eh1Var.f34021a = null;
                eh1Var.f34022b = false;
                eh1Var.f34024f.f32389c.setAllowDrawCursor(true);
                return;
            case 26:
                org.telegram.ui.Components.rf0 rf0Var = (org.telegram.ui.Components.rf0) obj;
                ((vi1) rf0Var.f28461b).getClass();
                ((vi1) rf0Var.f28461b).f39190c.setVisibility(4);
                return;
            case 27:
                ((org.telegram.ui.web.a1) obj).f39443s.setVisibility(8);
                return;
            case 28:
                ph.k kVar = ((ph.f) obj).W;
                if (kVar.f41807d0 == animator) {
                    kVar.f41807d0 = null;
                    kVar.f41809f.getEditText().setScrollY(kVar.V);
                    return;
                }
                return;
            default:
                ph.x xVar = (ph.x) obj;
                xVar.f42526l = 1.0f;
                ph.y yVar = xVar.f42530p;
                if (yVar.f42590n.contains(xVar)) {
                    xVar.f42520c.onDetachedFromWindow();
                    eg.t2 t2Var = xVar.d;
                    if (t2Var != null) {
                        t2Var.pause();
                        xVar.d.release(null);
                        xVar.d = null;
                    }
                    TextureView textureView = xVar.e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        xVar.e = null;
                    }
                    xVar.f42521f = false;
                    yVar.f42590n.remove(xVar);
                }
                yVar.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36131a) {
            case 1:
                bt0 bt0Var = (bt0) this.f36132b;
                bt0Var.f33030b.R0.setVisibility(0);
                bt0Var.f33030b.f31924z1.setVisibility(0);
                return;
            case 2:
                return;
            case 13:
                ((h01) this.f36132b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
