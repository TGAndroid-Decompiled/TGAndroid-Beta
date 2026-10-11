package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class mz0 implements Runnable {
    public final int f40130a;
    public final Object f40131b;

    public mz0(Object obj, int i10) {
        this.f40130a = i10;
        this.f40131b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f40130a;
        int i11 = 0;
        Object obj = this.f40131b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ci.m6) obj).f5600c;
                if (profileActivity.f34370n5 != 1.0f) {
                    oz0 oz0Var = profileActivity.f34365n0;
                    while (oz0Var.D0.k(i11) != oz0Var.getRealCount() - 1) {
                        i11++;
                    }
                    oz0Var.x(i11, true);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = ((f01) obj).f37533b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f34305e1, 0, true, new ci.za(2, profileActivity2, true));
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
                l11Var.f39518f.add(l11Var.f39516c);
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
                        M.f30833j = 5000;
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
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34465a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 11:
                t41 t41Var = (t41) obj;
                t41Var.dismiss();
                of.f.s(t41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.vl0) obj).f31920c;
                Runnable runnable = secretMediaViewer.f34506o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34506o0 = null;
                    return;
                }
                return;
            case 13:
                j51 j51Var = ((i51) obj).f38618a;
                j51Var.Q = true;
                j51Var.N.invalidate();
                return;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 15:
                AndroidUtilities.updateViewShow(((y61) obj).f44298c, true);
                return;
            case 16:
                org.telegram.ui.Components.d71 d71Var = ((t71) obj).f42149i0;
                if (d71Var != null) {
                    d71Var.N(true);
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
                ((gf1) obj).J.f37379r.l();
                return;
            case 20:
                ((of1) obj).f40569b.C0();
                return;
            case 21:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 22:
                ((ji1) obj).f39100a.G();
                return;
            case 23:
                ((ki1) obj).f39380a.G();
                return;
            case 24:
                ui1 ui1Var = ((ii1) obj).f38730b;
                ui1Var.L0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ui1Var.Y.setCornerRadius(-1.0f);
                ui1Var.f42618c0.d.release();
                ui1Var.f42620d0.d.release();
                ui1Var.f42615b0.release();
                ui1Var.k();
                ui1Var.f42650u0.d();
                org.telegram.ui.Components.voip.n2.U = false;
                ui1Var.E0 = false;
                ui1.f42610n1 = null;
                return;
            case 25:
                si1 si1Var = (si1) obj;
                si1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (si1Var.f41790a.f42641n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f35832k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
