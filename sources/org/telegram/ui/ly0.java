package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class ly0 implements Runnable {
    public final int f39410a;
    public final Object f39411b;

    public ly0(Object obj, int i10) {
        this.f39410a = i10;
        this.f39411b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f39410a;
        int i11 = 0;
        Object obj = this.f39411b;
        switch (i10) {
            case 0:
                my0 my0Var = (my0) obj;
                my0Var.G.getNotificationCenter().onAnimationFinish(my0Var.F);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((ah.v) obj).f896c;
                if (profileActivity.p5 != 1.0f) {
                    vy0 vy0Var = profileActivity.f33983o0;
                    while (vy0Var.D0.k(i11) != vy0Var.getRealCount() - 1) {
                        i11++;
                    }
                    vy0Var.x(i11, true);
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = ((mz0) obj).f39679b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f33923f1, 0, true, new ei.ka(2, profileActivity2, true));
                return;
            case 3:
                qz0 qz0Var = (qz0) obj;
                qz0Var.P0(qz0Var.getTabProgress());
                return;
            case 4:
                ((h01) obj).c();
                return;
            case 5:
                ((w01) obj).a();
                return;
            case 6:
                t01 t01Var = (t01) obj;
                t01Var.f41850f.add(t01Var.f41849c);
                t01Var.a();
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
                org.telegram.ui.Components.vc vcVar = (org.telegram.ui.Components.vc) obj;
                if (LaunchActivity.U() != null) {
                    if (vcVar == null) {
                        vcVar = org.telegram.ui.Components.vc.a0(LaunchActivity.U());
                    }
                    if (vcVar != null) {
                        org.telegram.ui.Components.oc M = vcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f29203j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((a31) obj).invalidate();
                return;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34079a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.a0();
                return;
            case 12:
                k31 k31Var = (k31) obj;
                k31Var.dismiss();
                pf.d.r(k31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.pl0) obj).f29621c;
                Runnable runnable = secretMediaViewer.f34118o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34118o0 = null;
                    return;
                }
                return;
            case 14:
                a41 a41Var = ((z31) obj).f44018a;
                a41Var.Q = true;
                a41Var.N.invalidate();
                return;
            case 15:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 16:
                AndroidUtilities.updateViewShow(((p51) obj).f40337c, true);
                return;
            case 17:
                org.telegram.ui.Components.a71 a71Var = ((k61) obj).f38808i0;
                if (a71Var != null) {
                    a71Var.N(true);
                    return;
                }
                return;
            case 18:
                ((d61) obj).a();
                return;
            case 19:
                ig.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 20:
                ((yd1) obj).J.f43581r.l();
                return;
            case 21:
                ((ge1) obj).f37552b.B0();
                return;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 23:
                ((ch1) obj).f36350a.G();
                return;
            case 24:
                ((dh1) obj).f36631a.G();
                return;
            case 25:
                nh1 nh1Var = ((bh1) obj).f36077b;
                nh1Var.L0.unlock();
                org.telegram.ui.Components.voip.k2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                nh1Var.Y.setCornerRadius(-1.0f);
                nh1Var.f39833c0.d.release();
                nh1Var.f39835d0.d.release();
                nh1Var.f39830b0.release();
                nh1Var.k();
                nh1Var.f39864u0.d();
                org.telegram.ui.Components.voip.k2.U = false;
                nh1Var.E0 = false;
                nh1.f39825n1 = null;
                return;
            case 26:
                lh1 lh1Var = (lh1) obj;
                lh1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (lh1Var.f39300a.f39855n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f35517k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
