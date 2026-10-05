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
    public final int f34929a;
    public final Object f34930b;

    public ap0(Object obj, int i10) {
        this.f34929a = i10;
        this.f34930b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f34929a) {
            case 2:
                ((PhotoViewer) ((org.telegram.ui.Components.cl0) this.f34930b).f25468c).A2 = null;
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
        int i10 = this.f34929a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f34930b;
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
                zq0[] zq0VarArr = br0Var.f35210n;
                br0Var.f35211r = null;
                if (br0Var.f35213w) {
                    zq0VarArr[1].setVisibility(8);
                } else {
                    zq0 zq0Var = zq0VarArr[0];
                    zq0VarArr[0] = zq0VarArr[1];
                    zq0VarArr[1] = zq0Var;
                    zq0Var.setVisibility(8);
                    if (br0Var.f35210n[0].f43880e == br0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    br0Var.f35208e = z10;
                    br0Var.h.j(1.0f, br0Var.f35210n[0].f43880e);
                }
                br0Var.f35212s = false;
                yq0Var.f43603y0 = false;
                yq0Var.f43602x0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) br0Var).actionBar;
                kVar.setEnabled(true);
                br0Var.h.setEnabled(true);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.cl0) obj).f25468c;
                if (photoViewer.A2 != null) {
                    nl0 nl0Var = new nl0(this, 18);
                    photoViewer.I2 = nl0Var;
                    AndroidUtilities.runOnUIThread(nl0Var, 860L);
                    return;
                }
                return;
            case 3:
                rt0 rt0Var = (rt0) obj;
                PhotoViewer photoViewer2 = rt0Var.f40267b;
                lg.p pVar = photoViewer2.C1.f26905b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f15576a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f26905b.J = true;
                photoViewer2.f34014p6 = null;
                photoViewer2.f34058u4 = rt0Var.f40266a;
                ci.i4 i4Var = photoViewer2.f1().L;
                if (photoViewer2.f34058u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i4Var.b(z11);
                ci.i4 i4Var2 = photoViewer2.K1;
                if (i4Var2 != null) {
                    if (photoViewer2.f34058u4 != 3) {
                        z13 = true;
                    }
                    i4Var2.b(z13);
                }
                if (photoViewer2.f34058u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f34006o6 = -1;
                photoViewer2.f33920e6 = 1.0f;
                photoViewer2.f33881a6 = 1.0f;
                photoViewer2.f33901c6 = 0.0f;
                photoViewer2.f33910d6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f34047t2 = true;
                photoViewer2.f33914e0.invalidate();
                return;
            case 4:
                st0 st0Var = (st0) obj;
                PhotoViewer photoViewer3 = st0Var.f40635b;
                photoViewer3.I1.f31729i0.setVisibility(0);
                photoViewer3.f34014p6 = null;
                photoViewer3.f34058u4 = st0Var.f40634a;
                ci.i4 i4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f34058u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i4Var3.b(z12);
                ci.i4 i4Var4 = photoViewer3.K1;
                if (i4Var4 != null) {
                    if (photoViewer3.f34058u4 != 3) {
                        z14 = true;
                    }
                    i4Var4.b(z14);
                }
                if (photoViewer3.f34058u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f34006o6 = -1;
                photoViewer3.f33920e6 = 1.0f;
                photoViewer3.f33881a6 = 1.0f;
                photoViewer3.f33901c6 = 0.0f;
                photoViewer3.f33910d6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f34047t2 = true;
                photoViewer3.f33914e0.invalidate();
                return;
            case 5:
                ((PhotoViewer) ((wt0) obj).f42710q0).y3[0].setTag(null);
                return;
            case 6:
                ((xt0) obj).d.T1.f37777k0 = 1.0f;
                return;
            case 7:
                PhotoViewer photoViewer4 = ((xt0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f37777k0 = 1.0f;
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new nl0(this, 20));
                return;
            case 9:
                ot0 ot0Var = (ot0) obj;
                if (animator.equals(ot0Var.f39291c.U7)) {
                    ot0Var.f39291c.U7 = null;
                    return;
                }
                return;
            case 10:
                vu0 vu0Var = (vu0) obj;
                if (vu0Var.f41842e == animator) {
                    vu0Var.f41841c[1].setVisibility(8);
                    vu0Var.f41842e = null;
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
                premiumPreviewFragment.f34141d0.removeView(premiumPreviewFragment.f34158r0);
                premiumPreviewFragment.f34158r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 14:
                ((ProfileActivity) ((org.telegram.ui.Components.cl0) obj).f25468c).D5 = null;
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
                if (animator.equals(p11Var.d)) {
                    p11Var.d = null;
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
                ((r41) obj).d.f34423a0.f37777k0 = 1.0f;
                return;
            case 19:
                SecretMediaViewer secretMediaViewer = ((r41) obj).d;
                secretMediaViewer.f34423a0.setVisibility(4);
                secretMediaViewer.f34423a0.f37777k0 = 1.0f;
                return;
            case 20:
                a71 a71Var = ((q51) obj).f39722e;
                a71Var.S0.G = 0.0f;
                a71Var.S0 = null;
                a71Var.f34739h0.invalidate();
                return;
            case 21:
                zg.c0.a();
                a71 a71Var2 = (a71) obj;
                x51 x51Var = a71Var2.f34739h0;
                x51 x51Var2 = a71Var2.f34739h0;
                x51Var.setLayerType(0, null);
                r51 r51Var = a71Var2.f34735f0;
                r51Var.setLayerType(0, null);
                a71Var2.f34732e0.setLayerType(0, null);
                a71Var2.f34724b0.setLayerType(0, null);
                org.telegram.ui.Components.nn nnVar = a71Var2.f34750n0;
                if (nnVar != null) {
                    nnVar.setLayerType(0, null);
                }
                View view = a71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                r51Var.b();
                a71Var2.f34729d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                a71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new hz0(globalInstance, 14));
                a71Var2.h();
                a71Var2.E(1.0f);
                for (int i11 = 0; i11 < x51Var2.getChildCount(); i11++) {
                    View childAt = x51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < a71Var2.f34729d0.f26164b.getChildCount(); i12++) {
                    View childAt2 = a71Var2.f34729d0.f26164b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                a71Var2.f34729d0.f26164b.invalidate();
                a71Var2.f34745k0.invalidate();
                x51Var2.invalidate();
                return;
            case 22:
                ((ta1) obj).f40803a0.setVisibility(8);
                return;
            case 23:
                pd1 pd1Var = ((dd1) obj).f35789a;
                if (!pd1Var.f39531p1.a()) {
                    pd1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((qe1) obj).f39779a = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((uf1) obj).setScrollEnabled(true);
                return;
            case 26:
                yg1 yg1Var = (yg1) obj;
                if (animator.equals(yg1Var.f43229e.K)) {
                    yg1Var.f43229e.K = null;
                    return;
                }
                return;
            case 27:
                oh1 oh1Var = (oh1) obj;
                oh1Var.d = null;
                oh1Var.f39206a = null;
                oh1Var.f39207b = false;
                oh1Var.f39210f.f34604c.setAllowDrawCursor(true);
                return;
            case 28:
                org.telegram.ui.Components.zf0 zf0Var = (org.telegram.ui.Components.zf0) obj;
                ((fj1) zf0Var.f33504b).getClass();
                ((fj1) zf0Var.f33504b).f36347c.setVisibility(4);
                return;
            default:
                ((org.telegram.ui.web.c1) obj).f42162s.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34929a) {
            case 3:
                rt0 rt0Var = (rt0) this.f34930b;
                rt0Var.f40267b.U0.setVisibility(0);
                rt0Var.f40267b.C1.setVisibility(0);
                return;
            case 4:
                return;
            case 15:
                ((t01) this.f34930b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
