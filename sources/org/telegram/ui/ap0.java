package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ap0 extends AnimatorListenerAdapter {
    public final int f34873a;
    public final Object f34874b;

    public ap0(Object obj, int i10) {
        this.f34873a = i10;
        this.f34874b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f34873a) {
            case 2:
                ((PhotoViewer) ((org.telegram.ui.Components.cl0) this.f34874b).f25415c).A2 = null;
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
        int i10 = this.f34873a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f34874b;
        switch (i10) {
            case 0:
                wp0 wp0Var = (wp0) obj;
                mc mcVar = wp0Var.X;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) wp0Var.X.getParent()).removeView(wp0Var.X);
                    }
                    wp0Var.X = null;
                }
                wp0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 1:
                yq0 yq0Var = (yq0) obj;
                br0 br0Var = yq0Var.D0;
                zq0[] zq0VarArr = br0Var.f35181n;
                br0Var.f35182r = null;
                if (br0Var.f35184w) {
                    zq0VarArr[1].setVisibility(8);
                } else {
                    zq0 zq0Var = zq0VarArr[0];
                    zq0VarArr[0] = zq0VarArr[1];
                    zq0VarArr[1] = zq0Var;
                    zq0Var.setVisibility(8);
                    if (br0Var.f35181n[0].f43866e == br0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    br0Var.f35179e = z10;
                    br0Var.h.j(1.0f, br0Var.f35181n[0].f43866e);
                }
                br0Var.f35183s = false;
                yq0Var.f43603y0 = false;
                yq0Var.f43602x0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) br0Var).actionBar;
                kVar.setEnabled(true);
                br0Var.h.setEnabled(true);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.cl0) obj).f25415c;
                if (photoViewer.A2 != null) {
                    nl0 nl0Var = new nl0(this, 18);
                    photoViewer.I2 = nl0Var;
                    AndroidUtilities.runOnUIThread(nl0Var, 860L);
                    return;
                }
                return;
            case 3:
                rt0 rt0Var = (rt0) obj;
                PhotoViewer photoViewer2 = rt0Var.f40287b;
                lg.p pVar = photoViewer2.C1.f26851b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f15575a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f26851b.J = true;
                photoViewer2.f33995p6 = null;
                photoViewer2.f34039u4 = rt0Var.f40286a;
                ci.i4 i4Var = photoViewer2.f1().L;
                if (photoViewer2.f34039u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i4Var.b(z11);
                ci.i4 i4Var2 = photoViewer2.K1;
                if (i4Var2 != null) {
                    if (photoViewer2.f34039u4 != 3) {
                        z13 = true;
                    }
                    i4Var2.b(z13);
                }
                if (photoViewer2.f34039u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f33987o6 = -1;
                photoViewer2.f33901e6 = 1.0f;
                photoViewer2.f33862a6 = 1.0f;
                photoViewer2.f33882c6 = 0.0f;
                photoViewer2.f33891d6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f34028t2 = true;
                photoViewer2.f33895e0.invalidate();
                return;
            case 4:
                st0 st0Var = (st0) obj;
                PhotoViewer photoViewer3 = st0Var.f40617b;
                photoViewer3.I1.f31656i0.setVisibility(0);
                photoViewer3.f33995p6 = null;
                photoViewer3.f34039u4 = st0Var.f40616a;
                ci.i4 i4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f34039u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i4Var3.b(z12);
                ci.i4 i4Var4 = photoViewer3.K1;
                if (i4Var4 != null) {
                    if (photoViewer3.f34039u4 != 3) {
                        z14 = true;
                    }
                    i4Var4.b(z14);
                }
                if (photoViewer3.f34039u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f33987o6 = -1;
                photoViewer3.f33901e6 = 1.0f;
                photoViewer3.f33862a6 = 1.0f;
                photoViewer3.f33882c6 = 0.0f;
                photoViewer3.f33891d6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f34028t2 = true;
                photoViewer3.f33895e0.invalidate();
                return;
            case 5:
                ((PhotoViewer) ((wt0) obj).f42636q0).y3[0].setTag(null);
                return;
            case 6:
                ((xt0) obj).d.T1.f37764k0 = 1.0f;
                return;
            case 7:
                PhotoViewer photoViewer4 = ((xt0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f37764k0 = 1.0f;
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new nl0(this, 20));
                return;
            case 9:
                ot0 ot0Var = (ot0) obj;
                if (animator.equals(ot0Var.f39276c.U7)) {
                    ot0Var.f39276c.U7 = null;
                    return;
                }
                return;
            case 10:
                vu0 vu0Var = (vu0) obj;
                if (vu0Var.f41837e == animator) {
                    vu0Var.f41836c[1].setVisibility(8);
                    vu0Var.f41837e = null;
                    return;
                }
                return;
            case 11:
                kv0 kv0Var = (kv0) obj;
                if (kv0Var.C != null) {
                    kv0Var.C = null;
                    kv0Var.b();
                    return;
                }
                return;
            case 12:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    return;
                }
                return;
            case 13:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f34122d0.removeView(premiumPreviewFragment.f34139r0);
                premiumPreviewFragment.f34139r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 14:
                ((ProfileActivity) ((org.telegram.ui.Components.cl0) obj).f25415c).D5 = null;
                return;
            case 15:
                t01 t01Var = (t01) obj;
                if (!t01Var.E) {
                    t01Var.setVisibility(8);
                    return;
                }
                return;
            case 16:
                p11 p11Var = (p11) obj;
                if (animator.equals(p11Var.f39316c)) {
                    p11Var.f39316c = null;
                    return;
                }
                return;
            case 17:
                x21 x21Var = (x21) obj;
                ci.sb sbVar = x21Var.O;
                if (sbVar != null) {
                    if (sbVar.getParent() != null) {
                        ((ViewGroup) x21Var.O.getParent()).removeView(x21Var.O);
                    }
                    x21Var.O = null;
                }
                x21Var.N = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                ((t41) obj).d.f34404a0.f37764k0 = 1.0f;
                return;
            case 19:
                SecretMediaViewer secretMediaViewer = ((t41) obj).d;
                secretMediaViewer.f34404a0.setVisibility(4);
                secretMediaViewer.f34404a0.f37764k0 = 1.0f;
                return;
            case 20:
                c71 c71Var = ((s51) obj).f40365e;
                c71Var.S0.G = 0.0f;
                c71Var.S0 = null;
                c71Var.f35315h0.invalidate();
                return;
            case 21:
                zg.e0.a();
                c71 c71Var2 = (c71) obj;
                z51 z51Var = c71Var2.f35315h0;
                z51 z51Var2 = c71Var2.f35315h0;
                z51Var.setLayerType(0, null);
                t51 t51Var = c71Var2.f35311f0;
                t51Var.setLayerType(0, null);
                c71Var2.f35308e0.setLayerType(0, null);
                c71Var2.f35300b0.setLayerType(0, null);
                org.telegram.ui.Components.nn nnVar = c71Var2.f35326n0;
                if (nnVar != null) {
                    nnVar.setLayerType(0, null);
                }
                View view = c71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                t51Var.b();
                c71Var2.f35305d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                c71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new hz0(globalInstance, 14));
                c71Var2.h();
                c71Var2.E(1.0f);
                for (int i11 = 0; i11 < z51Var2.getChildCount(); i11++) {
                    View childAt = z51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < c71Var2.f35305d0.f26090b.getChildCount(); i12++) {
                    View childAt2 = c71Var2.f35305d0.f26090b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                c71Var2.f35305d0.f26090b.invalidate();
                c71Var2.f35321k0.invalidate();
                z51Var2.invalidate();
                return;
            case 22:
                ((va1) obj).f41639a0.setVisibility(8);
                return;
            case 23:
                rd1 rd1Var = ((fd1) obj).f36276a;
                if (!rd1Var.f40076p1.a()) {
                    rd1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((se1) obj).f40468a = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((wf1) obj).setScrollEnabled(true);
                return;
            case 26:
                ah1 ah1Var = (ah1) obj;
                if (animator.equals(ah1Var.f34823e.K)) {
                    ah1Var.f34823e.K = null;
                    return;
                }
                return;
            case 27:
                qh1 qh1Var = (qh1) obj;
                qh1Var.d = null;
                qh1Var.f39732a = null;
                qh1Var.f39733b = false;
                qh1Var.f39736f.f34585c.setAllowDrawCursor(true);
                return;
            case 28:
                org.telegram.ui.Components.zf0 zf0Var = (org.telegram.ui.Components.zf0) obj;
                ((hj1) zf0Var.f33490b).getClass();
                ((hj1) zf0Var.f33490b).f37106c.setVisibility(4);
                return;
            default:
                ((org.telegram.ui.web.c1) obj).f42143s.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34873a) {
            case 3:
                rt0 rt0Var = (rt0) this.f34874b;
                rt0Var.f40287b.U0.setVisibility(0);
                rt0Var.f40287b.C1.setVisibility(0);
                return;
            case 4:
                return;
            case 15:
                ((t01) this.f34874b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
