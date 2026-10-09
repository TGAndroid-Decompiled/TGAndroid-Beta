package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class nz0 implements Runnable {
    public final int f40385a;
    public final Object f40386b;

    public nz0(Object obj, int i10) {
        this.f40385a = i10;
        this.f40386b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f40385a;
        int i11 = 0;
        Object obj = this.f40386b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ci.m6) obj).f5601c;
                if (profileActivity.f34308n5 != 1.0f) {
                    pz0 pz0Var = profileActivity.f34303n0;
                    while (pz0Var.D0.k(i11) != pz0Var.getRealCount() - 1) {
                        i11++;
                    }
                    pz0Var.x(i11, true);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = ((g01) obj).f37738b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f34243e1, 0, true, new ci.za(2, profileActivity2, true));
                return;
            case 2:
                k01 k01Var = (k01) obj;
                k01Var.M0(k01Var.getTabProgress());
                return;
            case 3:
                ((b11) obj).c();
                return;
            case 4:
                ((p11) obj).a();
                return;
            case 5:
                m11 m11Var = (m11) obj;
                m11Var.f39740f.add(m11Var.f39738c);
                m11Var.a();
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
                        org.telegram.ui.Components.tc M = adVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f31130j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((l41) obj).invalidate();
                return;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34403a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 11:
                u41 u41Var = (u41) obj;
                u41Var.dismiss();
                of.f.s(u41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ul0) obj).f31536c;
                Runnable runnable = secretMediaViewer.f34444o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34444o0 = null;
                    return;
                }
                return;
            case 13:
                k51 k51Var = ((j51) obj).f38827a;
                k51Var.Q = true;
                k51Var.N.invalidate();
                return;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 15:
                AndroidUtilities.updateViewShow(((z61) obj).f44494c, true);
                return;
            case 16:
                org.telegram.ui.Components.c71 c71Var = ((u71) obj).f42360i0;
                if (c71Var != null) {
                    c71Var.N(true);
                    return;
                }
                return;
            case 17:
                ((n71) obj).a();
                return;
            case 18:
                hg.g.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 19:
                ((hf1) obj).J.f37592r.l();
                return;
            case 20:
                ((pf1) obj).f40793b.C0();
                return;
            case 21:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 22:
                ((li1) obj).f39592a.G();
                return;
            case 23:
                ((mi1) obj).f39929a.G();
                return;
            case 24:
                wi1 wi1Var = ((ki1) obj).f39304b;
                wi1Var.L0.unlock();
                org.telegram.ui.Components.voip.m2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                wi1Var.Y.setCornerRadius(-1.0f);
                wi1Var.f43633c0.d.release();
                wi1Var.f43635d0.d.release();
                wi1Var.f43630b0.release();
                wi1Var.k();
                wi1Var.f43665u0.d();
                org.telegram.ui.Components.voip.m2.U = false;
                wi1Var.E0 = false;
                wi1.f43625n1 = null;
                return;
            case 25:
                ui1 ui1Var = (ui1) obj;
                ui1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ui1Var.f42446a.f43656n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f35761k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
