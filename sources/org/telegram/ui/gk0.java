package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class gk0 extends AnimatorListenerAdapter {
    public final int f36709a;
    public final Object f36710b;

    public gk0(Object obj, int i10) {
        this.f36709a = i10;
        this.f36710b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36709a) {
            case 4:
                ((PhotoViewer) ((org.telegram.ui.Components.pk0) this.f36710b).f29414c).A2 = null;
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
        int i10 = this.f36709a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f36710b;
        switch (i10) {
            case 0:
                hk0 hk0Var = (hk0) obj;
                hk0Var.f37059f = 1.0f;
                hk0Var.invalidate();
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.f33476e)) {
                    notificationsCustomSettingsActivity.f33476e = null;
                    return;
                }
                return;
            case 2:
                bq0 bq0Var = (bq0) obj;
                mc mcVar = bq0Var.X;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) bq0Var.X.getParent()).removeView(bq0Var.X);
                    }
                    bq0Var.X = null;
                }
                bq0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 3:
                dr0 dr0Var = (dr0) obj;
                gr0 gr0Var = dr0Var.D0;
                er0[] er0VarArr = gr0Var.f36757n;
                gr0Var.f36758r = null;
                if (gr0Var.f36760w) {
                    er0VarArr[1].setVisibility(8);
                } else {
                    er0 er0Var = er0VarArr[0];
                    er0VarArr[0] = er0VarArr[1];
                    er0VarArr[1] = er0Var;
                    er0Var.setVisibility(8);
                    if (gr0Var.f36757n[0].f36157e == gr0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gr0Var.f36755e = z10;
                    gr0Var.h.j(1.0f, gr0Var.f36757n[0].f36157e);
                }
                gr0Var.f36759s = false;
                dr0Var.f35849y0 = false;
                dr0Var.f35848x0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) gr0Var).actionBar;
                kVar.setEnabled(true);
                gr0Var.h.setEnabled(true);
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.pk0) obj).f29414c;
                if (photoViewer.A2 != null) {
                    rl0 rl0Var = new rl0(this, 17);
                    photoViewer.I2 = rl0Var;
                    AndroidUtilities.runOnUIThread(rl0Var, 860L);
                    return;
                }
                return;
            case 5:
                vt0 vt0Var = (vt0) obj;
                PhotoViewer photoViewer2 = vt0Var.f41697b;
                mg.q qVar = photoViewer2.C1.f30869b;
                qVar.q();
                CropAreaView cropAreaView = qVar.f16303a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f30869b.J = true;
                photoViewer2.f33649p6 = null;
                photoViewer2.f33693u4 = vt0Var.f41696a;
                di.j4 j4Var = photoViewer2.f1().L;
                if (photoViewer2.f33693u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j4Var.b(z11);
                di.j4 j4Var2 = photoViewer2.K1;
                if (j4Var2 != null) {
                    if (photoViewer2.f33693u4 != 3) {
                        z13 = true;
                    }
                    j4Var2.b(z13);
                }
                if (photoViewer2.f33693u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f33641o6 = -1;
                photoViewer2.f33555e6 = 1.0f;
                photoViewer2.f33516a6 = 1.0f;
                photoViewer2.f33536c6 = 0.0f;
                photoViewer2.f33545d6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f33682t2 = true;
                photoViewer2.f33549e0.invalidate();
                return;
            case 6:
                wt0 wt0Var = (wt0) obj;
                PhotoViewer photoViewer3 = wt0Var.f42478b;
                photoViewer3.I1.f27480i0.setVisibility(0);
                photoViewer3.f33649p6 = null;
                photoViewer3.f33693u4 = wt0Var.f42477a;
                di.j4 j4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f33693u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                j4Var3.b(z12);
                di.j4 j4Var4 = photoViewer3.K1;
                if (j4Var4 != null) {
                    if (photoViewer3.f33693u4 != 3) {
                        z14 = true;
                    }
                    j4Var4.b(z14);
                }
                if (photoViewer3.f33693u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f33641o6 = -1;
                photoViewer3.f33555e6 = 1.0f;
                photoViewer3.f33516a6 = 1.0f;
                photoViewer3.f33536c6 = 0.0f;
                photoViewer3.f33545d6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f33682t2 = true;
                photoViewer3.f33549e0.invalidate();
                return;
            case 7:
                ((PhotoViewer) ((au0) obj).f34550q0).y3[0].setTag(null);
                return;
            case 8:
                ((bu0) obj).d.T1.f39031k0 = 1.0f;
                return;
            case 9:
                PhotoViewer photoViewer4 = ((bu0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f39031k0 = 1.0f;
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new rl0(this, 19));
                return;
            case 11:
                st0 st0Var = (st0) obj;
                if (animator.equals(st0Var.f40554c.T7)) {
                    st0Var.f40554c.T7 = null;
                    return;
                }
                return;
            case 12:
                zu0 zu0Var = (zu0) obj;
                if (zu0Var.f43520e == animator) {
                    zu0Var.f43519c[1].setVisibility(8);
                    zu0Var.f43520e = null;
                    return;
                }
                return;
            case 13:
                ov0 ov0Var = (ov0) obj;
                if (ov0Var.C != null) {
                    ov0Var.C = null;
                    ov0Var.b();
                    return;
                }
                return;
            case 14:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    return;
                }
                return;
            case 15:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f33776d0.removeView(premiumPreviewFragment.f33793r0);
                premiumPreviewFragment.f33793r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 16:
                ((ProfileActivity) ((org.telegram.ui.Components.pk0) obj).f29414c).D5 = null;
                return;
            case 17:
                b11 b11Var = (b11) obj;
                if (!b11Var.E) {
                    b11Var.setVisibility(8);
                    return;
                }
                return;
            case 18:
                y11 y11Var = (y11) obj;
                if (animator.equals(y11Var.f42953c)) {
                    y11Var.f42953c = null;
                    return;
                }
                return;
            case 19:
                f31 f31Var = (f31) obj;
                di.xb xbVar = f31Var.O;
                if (xbVar != null) {
                    if (xbVar.getParent() != null) {
                        ((ViewGroup) f31Var.O.getParent()).removeView(f31Var.O);
                    }
                    f31Var.O = null;
                }
                f31Var.N = null;
                super.onAnimationEnd(animator);
                return;
            case 20:
                ((z41) obj).d.f34058a0.f39031k0 = 1.0f;
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = ((z41) obj).d;
                secretMediaViewer.f34058a0.setVisibility(4);
                secretMediaViewer.f34058a0.f39031k0 = 1.0f;
                return;
            case 22:
                j71 j71Var = ((z51) obj).f43298e;
                j71Var.S0.G = 0.0f;
                j71Var.S0 = null;
                j71Var.f37646h0.invalidate();
                return;
            case 23:
                ah.y0.a();
                j71 j71Var2 = (j71) obj;
                g61 g61Var = j71Var2.f37646h0;
                g61 g61Var2 = j71Var2.f37646h0;
                g61Var.setLayerType(0, null);
                a61 a61Var = j71Var2.f37642f0;
                a61Var.setLayerType(0, null);
                j71Var2.f37639e0.setLayerType(0, null);
                j71Var2.f37631b0.setLayerType(0, null);
                org.telegram.ui.Components.jn jnVar = j71Var2.f37657n0;
                if (jnVar != null) {
                    jnVar.setLayerType(0, null);
                }
                View view = j71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                a61Var.b();
                j71Var2.f37636d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                j71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new f01(globalInstance, 13));
                j71Var2.h();
                j71Var2.E(1.0f);
                for (int i11 = 0; i11 < g61Var2.getChildCount(); i11++) {
                    View childAt = g61Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < j71Var2.f37636d0.f28470b.getChildCount(); i12++) {
                    View childAt2 = j71Var2.f37636d0.f28470b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                j71Var2.f37636d0.f28470b.invalidate();
                j71Var2.f37652k0.invalidate();
                g61Var2.invalidate();
                return;
            case 24:
                ((bb1) obj).f34693b0.setVisibility(8);
                return;
            case 25:
                wd1 wd1Var = ((kd1) obj).f38010a;
                if (!wd1Var.f41958p1.a()) {
                    wd1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 26:
                super.onAnimationEnd(animator);
                ((ye1) obj).f43093a = null;
                return;
            case 27:
                super.onAnimationEnd(animator);
                ((cg1) obj).setScrollEnabled(true);
                return;
            case 28:
                gh1 gh1Var = (gh1) obj;
                if (animator.equals(gh1Var.f36681e.K)) {
                    gh1Var.f36681e.K = null;
                    return;
                }
                return;
            default:
                yh1 yh1Var = (yh1) obj;
                yh1Var.d = null;
                yh1Var.f43149a = null;
                yh1Var.f43150b = false;
                yh1Var.f43153f.f34239c.setAllowDrawCursor(true);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36709a) {
            case 5:
                vt0 vt0Var = (vt0) this.f36710b;
                vt0Var.f41697b.U0.setVisibility(0);
                vt0Var.f41697b.C1.setVisibility(0);
                return;
            case 6:
                return;
            case 17:
                ((b11) this.f36710b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
