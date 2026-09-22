package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class f01 implements Runnable {
    public final int f33444a;
    public final Object f33445b;

    public f01(Object obj, int i10) {
        this.f33444a = i10;
        this.f33445b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f33444a;
        Object obj = this.f33445b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((i01) obj).f34387b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.f31266e1, 0, true, new ci.cb(true, profileActivity, 2));
                return;
            case 1:
                m01 m01Var = (m01) obj;
                m01Var.M0(m01Var.getTabProgress());
                return;
            case 2:
                ((d11) obj).c();
                return;
            case 3:
                ((r11) obj).a();
                return;
            case 4:
                o11 o11Var = (o11) obj;
                o11Var.f36093f.add(o11Var.f36092c);
                o11Var.a();
                return;
            case 5:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 6:
                ((ai.x8) obj).e();
                return;
            case 7:
                org.telegram.ui.Components.vc vcVar = (org.telegram.ui.Components.vc) obj;
                if (LaunchActivity.U() != null) {
                    if (vcVar == null) {
                        vcVar = org.telegram.ui.Components.vc.a0(LaunchActivity.U());
                    }
                    if (vcVar != null) {
                        org.telegram.ui.Components.oc M = vcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f26751j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((m41) obj).invalidate();
                return;
            case 9:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31425a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 10:
                s41 s41Var = (s41) obj;
                s41Var.dismiss();
                nf.f.s(s41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.pk0) obj).f27072c;
                Runnable runnable = secretMediaViewer.f31464o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f31464o0 = null;
                    return;
                }
                return;
            case 12:
                i51 i51Var = ((h51) obj).f34100a;
                i51Var.Q = true;
                i51Var.N.invalidate();
                return;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 14:
                AndroidUtilities.updateViewShow(((w61) obj).f38704c, true);
                return;
            case 15:
                org.telegram.ui.Components.w51 w51Var = ((r71) obj).f37059i0;
                if (w51Var != null) {
                    w51Var.N(true);
                    return;
                }
                return;
            case 16:
                ((k71) obj).a();
                return;
            case 17:
                hg.g.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 18:
                ((gf1) obj).J.f33324r.l();
                return;
            case 19:
                ((of1) obj).f36215b.C0();
                return;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 21:
                ((ji1) obj).f34919a.H();
                return;
            case 22:
                ((ki1) obj).f35167a.H();
                return;
            case 23:
                ui1 ui1Var = ((ii1) obj).f34680b;
                ui1Var.L0.unlock();
                org.telegram.ui.Components.voip.m2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ui1Var.Y.setCornerRadius(-1.0f);
                ui1Var.f37989c0.d.release();
                ui1Var.f37991d0.d.release();
                ui1Var.f37986b0.release();
                ui1Var.l();
                ui1Var.f38020u0.d();
                org.telegram.ui.Components.voip.m2.T = false;
                ui1Var.E0 = false;
                ui1.f37981n1 = null;
                return;
            case 24:
                si1 si1Var = (si1) obj;
                si1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (si1Var.f37409a.f38011n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f31615k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
