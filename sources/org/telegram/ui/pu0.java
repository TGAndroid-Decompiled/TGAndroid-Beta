package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.voip.VoIPService;
public final class pu0 implements Runnable {
    public final int f50368a;
    public final Object f50369b;

    public pu0(Object obj, int i7) {
        this.f50368a = i7;
        this.f50369b = obj;
    }

    @Override
    public final void run() {
        int i7 = this.f50368a;
        int i10 = 0;
        Object obj = this.f50369b;
        switch (i7) {
            case 0:
                qu0 qu0Var = (qu0) obj;
                qu0Var.G.getNotificationCenter().j(qu0Var.F);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((ai.k0) obj).f1273c;
                if (profileActivity.f43187r5 != 1.0f) {
                    yu0 yu0Var = profileActivity.f43161o0;
                    while (yu0Var.E0.k(i10) != yu0Var.getRealCount() - 1) {
                        i10++;
                    }
                    yu0Var.x(i10, true);
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = ((pv0) obj).f50374b;
                RectF rectF = ProfileActivity.X6;
                profileActivity2.getMessagesController().e5(profileActivity2.f43094e1, 0, true, new hi.j9(2, profileActivity2, true));
                return;
            case 3:
                uv0 uv0Var = (uv0) obj;
                uv0Var.Z0(uv0Var.getTabProgress());
                return;
            case 4:
                ((lw0) obj).c();
                return;
            case 5:
                ((zw0) obj).a();
                return;
            case 6:
                ww0 ww0Var = (ww0) obj;
                ww0Var.f53018f.add(ww0Var.f53016c);
                ww0Var.a();
                return;
            case 7:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 8:
                ((fi.g6) obj).e();
                return;
            case 9:
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) obj;
                if (LaunchActivity.T() != null) {
                    if (ccVar == null) {
                        ccVar = org.telegram.ui.Components.cc.a0(LaunchActivity.T());
                    }
                    if (ccVar != null) {
                        org.telegram.ui.Components.xb I = ccVar.I(2131624092, org.telegram.messenger.hd.M0(2131746222, null), org.telegram.messenger.hd.M0(2131746185, null));
                        I.f41635j = 5000;
                        I.j();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((uy0) obj).invalidate();
                return;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.f43266w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f43258a, saveToGallerySettingsActivity.f43266w);
                saveToGallerySettingsActivity.e0();
                return;
            case 12:
                org.telegram.ui.Components.p20 p20Var = (org.telegram.ui.Components.p20) obj;
                p20Var.dismiss();
                vf.c.t(p20Var.getContext(), org.telegram.messenger.hd.M0(2131746618, null));
                return;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.y50) obj).f41877c;
                Runnable runnable = secretMediaViewer.f43298n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f43298n0 = null;
                    return;
                }
                return;
            case 14:
                pz0 pz0Var = ((oz0) obj).f50069a;
                pz0Var.R = true;
                pz0Var.O.invalidate();
                return;
            case 15:
                ((org.telegram.messenger.ns) obj).o();
                return;
            case 16:
                org.telegram.messenger.g0.U3(((f01) obj).f46939c, true, true);
                return;
            case 17:
                org.telegram.ui.Components.p41 p41Var = ((x11) obj).f53070e2;
                if (p41Var != null) {
                    p41Var.O(true);
                    return;
                }
                return;
            case 18:
                ((q11) obj).a();
                return;
            case 19:
                kg.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 20:
                z41 z41Var = (z41) obj;
                z41Var.f53825n0.a(z41Var.f53822k0.f35713f0, z41Var.f53823l0.isAttachedToWindow());
                return;
            case 21:
                ((x81) obj).J.f51872r.f();
                return;
            case 22:
                ((f91) obj).f47078b.G0();
                return;
            case 23:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 24:
                ((vb1) obj).f52186a.y();
                return;
            case 25:
                ((wb1) obj).f52541a.y();
                return;
            case 26:
                ec1 ec1Var = ((ub1) obj).f51904b;
                ec1Var.L0.e();
                org.telegram.ui.Components.voip.i2.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ec1Var.Z.setCornerRadius(-1.0f);
                ec1Var.f46680d0.d.release();
                ec1Var.f46683e0.d.release();
                ec1Var.f46678c0.release();
                ec1Var.c();
                ec1Var.f46709u0.d();
                org.telegram.ui.Components.voip.i2.T = false;
                ec1Var.E0 = false;
                ec1.f46670m1 = null;
                org.telegram.ui.Components.voip.j2.g();
                return;
            case 27:
                cc1 cc1Var = (cc1) obj;
                cc1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (cc1Var.f46067a.f46700n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ((VoIPPermissionActivity) obj).finish();
                return;
            default:
                ((WallpapersListActivity) obj).G0(false);
                return;
        }
    }
}
