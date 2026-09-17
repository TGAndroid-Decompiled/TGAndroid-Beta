package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class er0 extends AnimatorListenerAdapter {
    public final int f33462a;
    public final Object f33463b;

    public er0(Object obj, int i10) {
        this.f33462a = i10;
        this.f33463b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33462a) {
            case 1:
                ((PhotoViewer) ((org.telegram.ui.Components.qk0) this.f33463b).f27338c).A2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        boolean z12;
        int i10 = this.f33462a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f33463b;
        switch (i10) {
            case 0:
                fr0 fr0Var = (fr0) obj;
                ir0 ir0Var = fr0Var.D0;
                gr0[] gr0VarArr = ir0Var.f34661n;
                ir0Var.f34662r = null;
                if (ir0Var.f34664w) {
                    gr0VarArr[1].setVisibility(8);
                } else {
                    gr0 gr0Var = gr0VarArr[0];
                    gr0VarArr[0] = gr0VarArr[1];
                    gr0VarArr[1] = gr0Var;
                    gr0Var.setVisibility(8);
                    if (ir0Var.f34661n[0].e == ir0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ir0Var.e = z10;
                    ir0Var.h.j(1.0f, ir0Var.f34661n[0].e);
                }
                ir0Var.f34663s = false;
                fr0Var.f33744y0 = false;
                fr0Var.f33743x0 = false;
                kVar = ((org.telegram.ui.ActionBar.o2) ir0Var).actionBar;
                kVar.setEnabled(true);
                ir0Var.h.setEnabled(true);
                return;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.qk0) obj).f27338c;
                if (photoViewer.A2 != null) {
                    sl0 sl0Var = new sl0(this, 17);
                    photoViewer.I2 = sl0Var;
                    AndroidUtilities.runOnUIThread(sl0Var, 860L);
                    return;
                }
                return;
            case 2:
                yt0 yt0Var = (yt0) obj;
                PhotoViewer photoViewer2 = yt0Var.f40021b;
                lg.p pVar = photoViewer2.C1.f28369b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f14110a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f28369b.J = true;
                photoViewer2.f31050p6 = null;
                photoViewer2.f31094u4 = yt0Var.f40020a;
                ci.j4 j4Var = photoViewer2.f1().L;
                if (photoViewer2.f31094u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j4Var.b(z11);
                ci.j4 j4Var2 = photoViewer2.K1;
                if (j4Var2 != null) {
                    if (photoViewer2.f31094u4 != 3) {
                        z13 = true;
                    }
                    j4Var2.b(z13);
                }
                if (photoViewer2.f31094u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f31042o6 = -1;
                photoViewer2.f30956e6 = 1.0f;
                photoViewer2.f30918a6 = 1.0f;
                photoViewer2.f30938c6 = 0.0f;
                photoViewer2.f30947d6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f31083t2 = true;
                photoViewer2.f30950e0.invalidate();
                return;
            case 3:
                zt0 zt0Var = (zt0) obj;
                PhotoViewer photoViewer3 = zt0Var.f40340b;
                photoViewer3.I1.f25244i0.setVisibility(0);
                photoViewer3.f31050p6 = null;
                photoViewer3.f31094u4 = zt0Var.f40339a;
                ci.j4 j4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f31094u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                j4Var3.b(z12);
                ci.j4 j4Var4 = photoViewer3.K1;
                if (j4Var4 != null) {
                    if (photoViewer3.f31094u4 != 3) {
                        z14 = true;
                    }
                    j4Var4.b(z14);
                }
                if (photoViewer3.f31094u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f31042o6 = -1;
                photoViewer3.f30956e6 = 1.0f;
                photoViewer3.f30918a6 = 1.0f;
                photoViewer3.f30938c6 = 0.0f;
                photoViewer3.f30947d6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f31083t2 = true;
                photoViewer3.f30950e0.invalidate();
                return;
            case 4:
                ((PhotoViewer) ((du0) obj).f33225q0).y3[0].setTag(null);
                return;
            case 5:
                ((eu0) obj).d.T1.f37031k0 = 1.0f;
                return;
            case 6:
                PhotoViewer photoViewer4 = ((eu0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f37031k0 = 1.0f;
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new sl0(this, 19));
                return;
            case 8:
                vt0 vt0Var = (vt0) obj;
                if (animator.equals(vt0Var.f38504c.T7)) {
                    vt0Var.f38504c.T7 = null;
                    return;
                }
                return;
            case 9:
                cv0 cv0Var = (cv0) obj;
                if (cv0Var.e == animator) {
                    cv0Var.f32923c[1].setVisibility(8);
                    cv0Var.e = null;
                    return;
                }
                return;
            case 10:
                rv0 rv0Var = (rv0) obj;
                if (rv0Var.C != null) {
                    rv0Var.C = null;
                    rv0Var.b();
                    return;
                }
                return;
            case 11:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    return;
                }
                return;
            case 12:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f31174d0.removeView(premiumPreviewFragment.f31190r0);
                premiumPreviewFragment.f31190r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 13:
                ((ProfileActivity) ((org.telegram.ui.Components.qk0) obj).f27338c).D5 = null;
                return;
            case 14:
                c11 c11Var = (c11) obj;
                if (!c11Var.E) {
                    c11Var.setVisibility(8);
                    return;
                }
                return;
            case 15:
                y11 y11Var = (y11) obj;
                if (animator.equals(y11Var.f39765c)) {
                    y11Var.f39765c = null;
                    return;
                }
                return;
            case 16:
                f31 f31Var = (f31) obj;
                ci.wb wbVar = f31Var.O;
                if (wbVar != null) {
                    if (wbVar.getParent() != null) {
                        ((ViewGroup) f31Var.O.getParent()).removeView(f31Var.O);
                    }
                    f31Var.O = null;
                }
                f31Var.N = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                ((z41) obj).d.f31450a0.f37031k0 = 1.0f;
                return;
            case 18:
                SecretMediaViewer secretMediaViewer = ((z41) obj).d;
                secretMediaViewer.f31450a0.setVisibility(4);
                secretMediaViewer.f31450a0.f37031k0 = 1.0f;
                return;
            case 19:
                i71 i71Var = ((y51) obj).e;
                i71Var.S0.G = 0.0f;
                i71Var.S0 = null;
                i71Var.f34461h0.invalidate();
                return;
            case 20:
                zg.f0.a();
                i71 i71Var2 = (i71) obj;
                f61 f61Var = i71Var2.f34461h0;
                f61 f61Var2 = i71Var2.f34461h0;
                f61Var.setLayerType(0, null);
                z51 z51Var = i71Var2.f34457f0;
                z51Var.setLayerType(0, null);
                i71Var2.f34454e0.setLayerType(0, null);
                i71Var2.f34447b0.setLayerType(0, null);
                org.telegram.ui.Components.kn knVar = i71Var2.f34472n0;
                if (knVar != null) {
                    knVar.setLayerType(0, null);
                }
                View view = i71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                z51Var.b();
                i71Var2.f34452d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                i71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new g01(globalInstance, 13));
                i71Var2.h();
                i71Var2.E(1.0f);
                for (int i11 = 0; i11 < f61Var2.getChildCount(); i11++) {
                    View childAt = f61Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < i71Var2.f34452d0.f26502b.getChildCount(); i12++) {
                    View childAt2 = i71Var2.f34452d0.f26502b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                i71Var2.f34452d0.f26502b.invalidate();
                i71Var2.f34467k0.invalidate();
                f61Var2.invalidate();
                return;
            case 21:
                ((ab1) obj).f31785b0.setVisibility(8);
                return;
            case 22:
                xd1 xd1Var = ((ld1) obj).f35501a;
                if (!xd1Var.f39574p1.a()) {
                    xd1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((ze1) obj).f40238a = null;
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((dg1) obj).setScrollEnabled(true);
                return;
            case 25:
                hh1 hh1Var = (hh1) obj;
                if (animator.equals(hh1Var.e.K)) {
                    hh1Var.e.K = null;
                    return;
                }
                return;
            case 26:
                xh1 xh1Var = (xh1) obj;
                xh1Var.d = null;
                xh1Var.f39641a = null;
                xh1Var.f39642b = false;
                xh1Var.f39644f.f31623c.setAllowDrawCursor(true);
                return;
            case 27:
                ni.i iVar = (ni.i) obj;
                ((oj1) iVar.f15273b).getClass();
                ((oj1) iVar.f15273b).f36368c.setVisibility(4);
                return;
            case 28:
                ((org.telegram.ui.web.d1) obj).f38759s.setVisibility(8);
                return;
            default:
                pg.d0 d0Var = (pg.d0) obj;
                d0Var.f40856a.getPainting().c(null, d0Var.f40856a.getCurrentColor(), true, null);
                d0Var.f40870r = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33462a) {
            case 2:
                yt0 yt0Var = (yt0) this.f33463b;
                yt0Var.f40021b.U0.setVisibility(0);
                yt0Var.f40021b.C1.setVisibility(0);
                return;
            case 3:
                return;
            case 14:
                ((c11) this.f33463b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
