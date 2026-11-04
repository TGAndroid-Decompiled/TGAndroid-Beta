package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.voip.VoIPService;
public final class pu0 implements Runnable {
    public final int f48671a;
    public final Object f48672b;

    public pu0(Object obj, int i3) {
        this.f48671a = i3;
        this.f48672b = obj;
    }

    @Override
    public final void run() {
        int i3 = this.f48671a;
        int i10 = 0;
        Object obj = this.f48672b;
        switch (i3) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ai.c0) obj).f537c;
                if (profileActivity.f41822o5 != 1.0f) {
                    ru0 ru0Var = profileActivity.f41817o0;
                    while (ru0Var.E0.k(i10) != ru0Var.getRealCount() - 1) {
                        i10++;
                    }
                    ru0Var.x(i10, true);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = ((iv0) obj).f46427b;
                RectF rectF = ProfileActivity.T6;
                profileActivity2.getMessagesController().d5(profileActivity2.f41751e1, 0, true, new gi.m9(2, profileActivity2, true));
                return;
            case 2:
                mv0 mv0Var = (mv0) obj;
                mv0Var.X0(mv0Var.getTabProgress());
                return;
            case 3:
                ((ew0) obj).c();
                return;
            case 4:
                ((sw0) obj).a();
                return;
            case 5:
                pw0 pw0Var = (pw0) obj;
                pw0Var.f48696f.add(pw0Var.f48694c);
                pw0Var.a();
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 7:
                ((ei.n6) obj).e();
                return;
            case 8:
                org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) obj;
                if (LaunchActivity.T() != null) {
                    if (fcVar == null) {
                        fcVar = org.telegram.ui.Components.fc.a0(LaunchActivity.T());
                    }
                    if (fcVar != null) {
                        org.telegram.ui.Components.ac I = fcVar.I(2131624091, org.telegram.messenger.bd.M0(2131746232, null), org.telegram.messenger.bd.M0(2131746195, null));
                        I.f31792j = 5000;
                        I.j();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((my0) obj).invalidate();
                return;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.f41923w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f41915a, saveToGallerySettingsActivity.f41923w);
                saveToGallerySettingsActivity.e0();
                return;
            case 11:
                org.telegram.ui.Components.i20 i20Var = (org.telegram.ui.Components.i20) obj;
                i20Var.dismiss();
                sf.c.t(i20Var.getContext(), org.telegram.messenger.bd.M0(2131746626, null));
                return;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ri0) obj).f37738c;
                Runnable runnable = secretMediaViewer.f41954n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f41954n0 = null;
                    return;
                }
                return;
            case 13:
                iz0 iz0Var = ((hz0) obj).f46018a;
                iz0Var.R = true;
                iz0Var.O.invalidate();
                return;
            case 14:
                ((org.telegram.messenger.hs) obj).o();
                return;
            case 15:
                org.telegram.messenger.g0.V3(((yz0) obj).f52467c, true, true);
                return;
            case 16:
                org.telegram.ui.Components.f41 f41Var = ((q11) obj).f48731b2;
                if (f41Var != null) {
                    f41Var.O(true);
                    return;
                }
                return;
            case 17:
                ((j11) obj).a();
                return;
            case 18:
                lg.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 19:
                r41 r41Var = (r41) obj;
                r41Var.f49081n0.a(r41Var.f49078k0.f34196f0, r41Var.f49079l0.isAttachedToWindow());
                return;
            case 20:
                ((q81) obj).J.f47612r.f();
                return;
            case 21:
                ((y81) obj).f52227b.G0();
                return;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 23:
                ((pb1) obj).f48509a.G();
                return;
            case 24:
                ((qb1) obj).f48846a.G();
                return;
            case 25:
                zb1 zb1Var = ((ob1) obj).f48255b;
                zb1Var.M0.e();
                org.telegram.ui.Components.voip.u1.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                zb1Var.Z.setCornerRadius(-1.0f);
                zb1Var.f52613d0.d.release();
                zb1Var.f52616e0.d.release();
                zb1Var.f52611c0.release();
                zb1Var.d();
                zb1Var.f52644v0.d();
                org.telegram.ui.Components.voip.u1.V = false;
                zb1Var.F0 = false;
                zb1.f52603o1 = null;
                return;
            case 26:
                xb1 xb1Var = (xb1) obj;
                xb1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (xb1Var.f51906a.f52635o0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ((VoIPPermissionActivity) obj).finish();
                return;
            default:
                ((WallpapersListActivity) obj).G0(false);
                return;
        }
    }
}
