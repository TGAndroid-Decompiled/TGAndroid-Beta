package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class f01 implements Runnable {
    public final int f36248a;
    public final Object f36249b;

    public f01(Object obj, int i10) {
        this.f36248a = i10;
        this.f36249b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f36248a;
        Object obj = this.f36249b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((i01) obj).f37177b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.f33916e1, 0, true, new di.cb(true, profileActivity, 2));
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
                p11Var.f39415f.add(p11Var.f39413c);
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
                        M.f29707j = 5000;
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
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34076a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 10:
                u41 u41Var = (u41) obj;
                u41Var.dismiss();
                of.f.s(u41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.pk0) obj).f29442c;
                Runnable runnable = secretMediaViewer.f34117o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34117o0 = null;
                    return;
                }
                return;
            case 12:
                k51 k51Var = ((j51) obj).f37537a;
                k51Var.Q = true;
                k51Var.N.invalidate();
                return;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 14:
                AndroidUtilities.updateViewShow(((y61) obj).f43030c, true);
                return;
            case 15:
                org.telegram.ui.Components.v51 v51Var = ((t71) obj).f40684i0;
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
                ((gf1) obj).J.f36087r.l();
                return;
            case 19:
                ((of1) obj).f39265b.C0();
                return;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 21:
                ((ji1) obj).f37810a.H();
                return;
            case 22:
                ((ki1) obj).f38103a.H();
                return;
            case 23:
                ui1 ui1Var = ((ii1) obj).f37415b;
                ui1Var.L0.unlock();
                org.telegram.ui.Components.voip.k2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ui1Var.Y.setCornerRadius(-1.0f);
                ui1Var.f41142c0.d.release();
                ui1Var.f41144d0.d.release();
                ui1Var.f41139b0.release();
                ui1Var.l();
                ui1Var.f41174u0.d();
                org.telegram.ui.Components.voip.k2.T = false;
                ui1Var.E0 = false;
                ui1.f41134n1 = null;
                return;
            case 24:
                si1 si1Var = (si1) obj;
                si1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (si1Var.f40489a.f41165n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f34276k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
