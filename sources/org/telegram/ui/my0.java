package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class my0 implements Runnable {
    public final int f39729a;
    public final Object f39730b;

    public my0(Object obj, int i10) {
        this.f39729a = i10;
        this.f39730b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f39729a;
        int i11 = 0;
        Object obj = this.f39730b;
        switch (i10) {
            case 0:
                ny0 ny0Var = (ny0) obj;
                ny0Var.G.getNotificationCenter().onAnimationFinish(ny0Var.F);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((ah.v) obj).f896c;
                if (profileActivity.p5 != 1.0f) {
                    wy0 wy0Var = profileActivity.f33981o0;
                    while (wy0Var.D0.k(i11) != wy0Var.getRealCount() - 1) {
                        i11++;
                    }
                    wy0Var.x(i11, true);
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = ((nz0) obj).f40016b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f33921f1, 0, true, new ei.ka(2, profileActivity2, true));
                return;
            case 3:
                rz0 rz0Var = (rz0) obj;
                rz0Var.P0(rz0Var.getTabProgress());
                return;
            case 4:
                ((i01) obj).c();
                return;
            case 5:
                ((x01) obj).a();
                return;
            case 6:
                u01 u01Var = (u01) obj;
                u01Var.f42124f.add(u01Var.f42123c);
                u01Var.a();
                return;
            case 7:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 8:
                ((ci.v6) obj).e();
                return;
            case 9:
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) obj;
                if (LaunchActivity.U() != null) {
                    if (xcVar == null) {
                        xcVar = org.telegram.ui.Components.xc.a0(LaunchActivity.U());
                    }
                    if (xcVar != null) {
                        org.telegram.ui.Components.qc M = xcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f29832j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((b31) obj).invalidate();
                return;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34077a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.a0();
                return;
            case 12:
                l31 l31Var = (l31) obj;
                l31Var.dismiss();
                pf.d.r(l31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ql0) obj).f29941c;
                Runnable runnable = secretMediaViewer.f34116o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34116o0 = null;
                    return;
                }
                return;
            case 14:
                b41 b41Var = ((a41) obj).f35571a;
                b41Var.Q = true;
                b41Var.N.invalidate();
                return;
            case 15:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 16:
                AndroidUtilities.updateViewShow(((q51) obj).f40629c, true);
                return;
            case 17:
                org.telegram.ui.Components.b71 b71Var = ((l61) obj).f39148i0;
                if (b71Var != null) {
                    b71Var.N(true);
                    return;
                }
                return;
            case 18:
                ((e61) obj).a();
                return;
            case 19:
                ig.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 20:
                ((zd1) obj).J.f43828r.l();
                return;
            case 21:
                ((he1) obj).f37836b.B0();
                return;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 23:
                ((dh1) obj).f36636a.G();
                return;
            case 24:
                ((eh1) obj).f36973a.G();
                return;
            case 25:
                oh1 oh1Var = ((ch1) obj).f36367b;
                oh1Var.L0.unlock();
                org.telegram.ui.Components.voip.k2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                oh1Var.Y.setCornerRadius(-1.0f);
                oh1Var.f40170c0.d.release();
                oh1Var.f40172d0.d.release();
                oh1Var.f40167b0.release();
                oh1Var.k();
                oh1Var.f40201u0.d();
                org.telegram.ui.Components.voip.k2.U = false;
                oh1Var.E0 = false;
                oh1.f40162n1 = null;
                return;
            case 26:
                mh1 mh1Var = (mh1) obj;
                mh1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (mh1Var.f39605a.f40192n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f35515k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
