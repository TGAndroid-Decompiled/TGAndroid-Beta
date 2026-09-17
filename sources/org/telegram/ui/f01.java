package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class f01 implements Runnable {
    public final int f36221a;
    public final Object f36222b;

    public f01(Object obj, int i10) {
        this.f36221a = i10;
        this.f36222b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f36221a;
        Object obj = this.f36222b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((i01) obj).f37150b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.f33889e1, 0, true, new di.cb(true, profileActivity, 2));
                return;
            case 1:
                m01 m01Var = (m01) obj;
                m01Var.M0(m01Var.getTabProgress());
                return;
            case 2:
                ((d11) obj).c();
                return;
            case 3:
                ((s11) obj).a();
                return;
            case 4:
                p11 p11Var = (p11) obj;
                p11Var.f39388f.add(p11Var.f39386c);
                p11Var.a();
                return;
            case 5:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 6:
                ((bi.f8) obj).e();
                return;
            case 7:
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) obj;
                if (LaunchActivity.U() != null) {
                    if (ycVar == null) {
                        ycVar = org.telegram.ui.Components.yc.a0(LaunchActivity.U());
                    }
                    if (ycVar != null) {
                        org.telegram.ui.Components.qc M = ycVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f29680j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((o41) obj).invalidate();
                return;
            case 9:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34049a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 10:
                u41 u41Var = (u41) obj;
                u41Var.dismiss();
                of.f.s(u41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.pk0) obj).f29415c;
                Runnable runnable = secretMediaViewer.f34090o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34090o0 = null;
                    return;
                }
                return;
            case 12:
                k51 k51Var = ((j51) obj).f37510a;
                k51Var.Q = true;
                k51Var.N.invalidate();
                return;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 14:
                AndroidUtilities.updateViewShow(((y61) obj).f43003c, true);
                return;
            case 15:
                org.telegram.ui.Components.v51 v51Var = ((t71) obj).f40657i0;
                if (v51Var != null) {
                    v51Var.N(true);
                    return;
                }
                return;
            case 16:
                ((m71) obj).a();
                return;
            case 17:
                ig.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 18:
                ((gf1) obj).J.f36060r.l();
                return;
            case 19:
                ((of1) obj).f39238b.C0();
                return;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 21:
                ((ji1) obj).f37783a.H();
                return;
            case 22:
                ((ki1) obj).f38076a.H();
                return;
            case 23:
                ui1 ui1Var = ((ii1) obj).f37388b;
                ui1Var.L0.unlock();
                org.telegram.ui.Components.voip.k2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ui1Var.Y.setCornerRadius(-1.0f);
                ui1Var.f41115c0.d.release();
                ui1Var.f41117d0.d.release();
                ui1Var.f41112b0.release();
                ui1Var.l();
                ui1Var.f41147u0.d();
                org.telegram.ui.Components.voip.k2.T = false;
                ui1Var.E0 = false;
                ui1.f41107n1 = null;
                return;
            case 24:
                si1 si1Var = (si1) obj;
                si1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (si1Var.f40462a.f41138n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                ((VoIPPermissionActivity) obj).finish();
                return;
            default:
                int[][] iArr = WallpapersListActivity.f34249k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
