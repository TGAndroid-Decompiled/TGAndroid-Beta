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
public final class ns0 extends AnimatorListenerAdapter {
    public final int f39512a;
    public final Object f39513b;

    public ns0(Object obj, int i10) {
        this.f39512a = i10;
        this.f39513b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39512a) {
            case 0:
                ((PhotoViewer) ((org.telegram.ui.Components.fx0) this.f39513b).f27035c).f34432x2 = null;
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
        int i10 = this.f39512a;
        boolean z11 = false;
        boolean z12 = false;
        Object obj = this.f39513b;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.fx0) obj).f27035c;
                if (photoViewer.f34432x2 != null) {
                    gl0 gl0Var = new gl0(this, 18);
                    photoViewer.F2 = gl0Var;
                    AndroidUtilities.runOnUIThread(gl0Var, 860L);
                    return;
                }
                return;
            case 1:
                dt0 dt0Var = (dt0) obj;
                PhotoViewer photoViewer2 = dt0Var.f36304b;
                zf.n nVar = photoViewer2.f34450z1.f25248b;
                nVar.q();
                CropAreaView cropAreaView = nVar.f51166a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.f34450z1.f25248b.G = true;
                photoViewer2.f34334m6 = null;
                photoViewer2.f34379r4 = dt0Var.f36303a;
                qh.i3 i3Var = photoViewer2.f1().I;
                if (photoViewer2.f34379r4 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i3Var.b(z4);
                qh.i3 i3Var2 = photoViewer2.H1;
                if (i3Var2 != null) {
                    if (photoViewer2.f34379r4 != 3) {
                        z11 = true;
                    }
                    i3Var2.b(z11);
                }
                if (photoViewer2.f34379r4 != 3) {
                    photoViewer2.W5 = 0.0f;
                }
                photoViewer2.f34326l6 = -1;
                photoViewer2.f34236b6 = 1.0f;
                photoViewer2.X5 = 1.0f;
                photoViewer2.Z5 = 0.0f;
                photoViewer2.f34226a6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f34367q2 = true;
                photoViewer2.f34230b0.invalidate();
                return;
            case 2:
                et0 et0Var = (et0) obj;
                PhotoViewer photoViewer3 = et0Var.f36685b;
                photoViewer3.F1.f30044f0.setVisibility(0);
                photoViewer3.f34334m6 = null;
                photoViewer3.f34379r4 = et0Var.f36684a;
                qh.i3 i3Var3 = photoViewer3.f1().I;
                if (photoViewer3.f34379r4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i3Var3.b(z10);
                qh.i3 i3Var4 = photoViewer3.H1;
                if (i3Var4 != null) {
                    if (photoViewer3.f34379r4 != 3) {
                        z12 = true;
                    }
                    i3Var4.b(z12);
                }
                if (photoViewer3.f34379r4 != 3) {
                    photoViewer3.W5 = 0.0f;
                }
                photoViewer3.f34326l6 = -1;
                photoViewer3.f34236b6 = 1.0f;
                photoViewer3.X5 = 1.0f;
                photoViewer3.Z5 = 0.0f;
                photoViewer3.f34226a6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f34367q2 = true;
                photoViewer3.f34230b0.invalidate();
                return;
            case 3:
                ((PhotoViewer) ((it0) obj).f37926n0).f34413v3[0].setTag(null);
                return;
            case 4:
                ((jt0) obj).d.Q1.f42296h0 = 1.0f;
                return;
            case 5:
                PhotoViewer photoViewer4 = ((jt0) obj).d;
                photoViewer4.Q1.setVisibility(4);
                photoViewer4.Q1.f42296h0 = 1.0f;
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new gl0(this, 20));
                return;
            case 7:
                at0 at0Var = (at0) obj;
                if (animator.equals(at0Var.f35242c.Q7)) {
                    at0Var.f35242c.Q7 = null;
                    return;
                }
                return;
            case 8:
                iu0 iu0Var = (iu0) obj;
                if (iu0Var.f37932e == animator) {
                    iu0Var.f37931c[1].setVisibility(8);
                    iu0Var.f37932e = null;
                    return;
                }
                return;
            case 9:
                xu0 xu0Var = (xu0) obj;
                if (xu0Var.C != null) {
                    xu0Var.C = null;
                    xu0Var.b();
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
                premiumPreviewFragment.f34481a0.removeView(premiumPreviewFragment.f34499o0);
                premiumPreviewFragment.f34499o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 12:
                ((ProfileActivity) ((org.telegram.ui.Components.fx0) obj).f27035c).A5 = null;
                return;
            case 13:
                j01 j01Var = (j01) obj;
                if (!j01Var.B) {
                    j01Var.setVisibility(8);
                    return;
                }
                return;
            case 14:
                g11 g11Var = (g11) obj;
                if (animator.equals(g11Var.f37058c)) {
                    g11Var.f37058c = null;
                    return;
                }
                return;
            case 15:
                n21 n21Var = (n21) obj;
                org.telegram.ui.Components.wo woVar = n21Var.L;
                if (woVar != null) {
                    if (woVar.getParent() != null) {
                        ((ViewGroup) n21Var.L.getParent()).removeView(n21Var.L);
                    }
                    n21Var.L = null;
                }
                n21Var.K = null;
                super.onAnimationEnd(animator);
                return;
            case 16:
                ((g41) obj).d.X.f42296h0 = 1.0f;
                return;
            case 17:
                SecretMediaViewer secretMediaViewer = ((g41) obj).d;
                secretMediaViewer.X.setVisibility(4);
                secretMediaViewer.X.f42296h0 = 1.0f;
                return;
            case 18:
                r61 r61Var = ((h51) obj).f37333e;
                r61Var.P0.D = 0.0f;
                r61Var.P0 = null;
                r61Var.f40791e0.invalidate();
                return;
            case 19:
                ng.g0.a();
                r61 r61Var2 = (r61) obj;
                o51 o51Var = r61Var2.f40791e0;
                o51 o51Var2 = r61Var2.f40791e0;
                o51Var.setLayerType(0, null);
                i51 i51Var = r61Var2.f40786c0;
                i51Var.setLayerType(0, null);
                r61Var2.f40783b0.setLayerType(0, null);
                r61Var2.V.setLayerType(0, null);
                org.telegram.ui.Components.jn jnVar = r61Var2.f40804k0;
                if (jnVar != null) {
                    jnVar.setLayerType(0, null);
                }
                View view = r61Var2.f40802j0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                i51Var.b();
                r61Var2.f40780a0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                r61Var2.T1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new xy0(globalInstance, 14));
                r61Var2.h();
                r61Var2.E(1.0f);
                for (int i11 = 0; i11 < o51Var2.getChildCount(); i11++) {
                    View childAt = o51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < r61Var2.f40780a0.f31929b.getChildCount(); i12++) {
                    View childAt2 = r61Var2.f40780a0.f31929b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                r61Var2.f40780a0.f31929b.invalidate();
                r61Var2.f40798h0.invalidate();
                o51Var2.invalidate();
                return;
            case 20:
                ((ha1) obj).Y.setVisibility(8);
                return;
            case 21:
                ed1 ed1Var = ((sc1) obj).f41229a;
                if (!ed1Var.f36520m1.a()) {
                    ed1Var.O1.setVisibility(8);
                    return;
                }
                return;
            case 22:
                super.onAnimationEnd(animator);
                ((ge1) obj).f37178a = null;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((kf1) obj).setScrollEnabled(true);
                return;
            case 24:
                pg1 pg1Var = (pg1) obj;
                if (animator.equals(pg1Var.f40038e.H)) {
                    pg1Var.f40038e.H = null;
                    return;
                }
                return;
            case 25:
                gh1 gh1Var = (gh1) obj;
                gh1Var.d = null;
                gh1Var.f37199a = null;
                gh1Var.f37200b = false;
                gh1Var.f37203f.f34932c.setAllowDrawCursor(true);
                return;
            case 26:
                org.telegram.ui.Components.tf0 tf0Var = (org.telegram.ui.Components.tf0) obj;
                ((yi1) tf0Var.f31335b).getClass();
                ((yi1) tf0Var.f31335b).f43642c.setVisibility(4);
                return;
            case 27:
                ((org.telegram.ui.web.a1) obj).f42489s.setVisibility(8);
                return;
            case 28:
                qh.k kVar = ((qh.f) obj).W;
                if (kVar.f45514d0 == animator) {
                    kVar.f45514d0 = null;
                    kVar.f45517f.getEditText().setScrollY(kVar.V);
                    return;
                }
                return;
            default:
                qh.x xVar = (qh.x) obj;
                xVar.f46253l = 1.0f;
                qh.y yVar = xVar.f46257p;
                if (yVar.f46329n.contains(xVar)) {
                    xVar.f46246c.onDetachedFromWindow();
                    fg.s2 s2Var = xVar.d;
                    if (s2Var != null) {
                        s2Var.pause();
                        xVar.d.release(null);
                        xVar.d = null;
                    }
                    TextureView textureView = xVar.f46247e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        xVar.f46247e = null;
                    }
                    xVar.f46248f = false;
                    yVar.f46329n.remove(xVar);
                }
                yVar.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39512a) {
            case 1:
                dt0 dt0Var = (dt0) this.f39513b;
                dt0Var.f36304b.R0.setVisibility(0);
                dt0Var.f36304b.f34450z1.setVisibility(0);
                return;
            case 2:
                return;
            case 13:
                ((j01) this.f39513b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
