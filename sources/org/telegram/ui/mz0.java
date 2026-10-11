package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class mz0 implements Runnable {
    public final int f40096a;
    public final Object f40097b;

    public mz0(Object obj, int i10) {
        this.f40096a = i10;
        this.f40097b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f40096a;
        int i11 = 0;
        Object obj = this.f40097b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ci.m6) obj).f5600c;
                if (profileActivity.f34336n5 != 1.0f) {
                    oz0 oz0Var = profileActivity.f34331n0;
                    while (oz0Var.D0.k(i11) != oz0Var.getRealCount() - 1) {
                        i11++;
                    }
                    oz0Var.x(i11, true);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = ((f01) obj).f37499b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f34271e1, 0, true, new ci.za(2, profileActivity2, true));
                return;
            case 2:
                j01 j01Var = (j01) obj;
                j01Var.M0(j01Var.getTabProgress());
                return;
            case 3:
                ((a11) obj).c();
                return;
            case 4:
                ((o11) obj).a();
                return;
            case 5:
                l11 l11Var = (l11) obj;
                l11Var.f39484f.add(l11Var.f39482c);
                l11Var.a();
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 7:
                ((ai.y8) obj).e();
                return;
            case 8:
                org.telegram.ui.Components.ad adVar = (org.telegram.ui.Components.ad) obj;
                if (LaunchActivity.U() != null) {
                    if (adVar == null) {
                        adVar = org.telegram.ui.Components.ad.a0(LaunchActivity.U());
                    }
                    if (adVar != null) {
                        org.telegram.ui.Components.sc M = adVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f30711j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((k41) obj).invalidate();
                return;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34431a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 11:
                t41 t41Var = (t41) obj;
                t41Var.dismiss();
                of.f.s(t41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.wl0) obj).f32679c;
                Runnable runnable = secretMediaViewer.f34472o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34472o0 = null;
                    return;
                }
                return;
            case 13:
                j51 j51Var = ((i51) obj).f38584a;
                j51Var.Q = true;
                j51Var.N.invalidate();
                return;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 15:
                AndroidUtilities.updateViewShow(((y61) obj).f44264c, true);
                return;
            case 16:
                org.telegram.ui.Components.e71 e71Var = ((t71) obj).f42115i0;
                if (e71Var != null) {
                    e71Var.N(true);
                    return;
                }
                return;
            case 17:
                ((m71) obj).a();
                return;
            case 18:
                hg.g.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 19:
                ((gf1) obj).J.f37345r.l();
                return;
            case 20:
                ((of1) obj).f40535b.C0();
                return;
            case 21:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 22:
                ((ji1) obj).f39066a.G();
                return;
            case 23:
                ((ki1) obj).f39346a.G();
                return;
            case 24:
                ui1 ui1Var = ((ii1) obj).f38696b;
                ui1Var.L0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ui1Var.Y.setCornerRadius(-1.0f);
                ui1Var.f42584c0.d.release();
                ui1Var.f42586d0.d.release();
                ui1Var.f42581b0.release();
                ui1Var.k();
                ui1Var.f42616u0.d();
                org.telegram.ui.Components.voip.n2.U = false;
                ui1Var.E0 = false;
                ui1.f42576n1 = null;
                return;
            case 25:
                si1 si1Var = (si1) obj;
                si1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (si1Var.f41756a.f42607n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ((VoIPPermissionActivity) obj).finish();
                return;
            default:
                int[][] iArr = WallpapersListActivity.f35798k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
