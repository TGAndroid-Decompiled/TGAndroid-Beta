package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class pz0 implements Runnable {
    public final int f41121a;
    public final Object f41122b;

    public pz0(Object obj, int i10) {
        this.f41121a = i10;
        this.f41122b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f41121a;
        int i11 = 0;
        Object obj = this.f41122b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ci.m6) obj).f5599c;
                if (profileActivity.f34147n5 != 1.0f) {
                    rz0 rz0Var = profileActivity.f34142n0;
                    while (rz0Var.D0.k(i11) != rz0Var.getRealCount() - 1) {
                        i11++;
                    }
                    rz0Var.x(i11, true);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = ((i01) obj).f38580b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f34082e1, 0, true, new ci.za(2, profileActivity2, true));
                return;
            case 2:
                m01 m01Var = (m01) obj;
                m01Var.M0(m01Var.getTabProgress());
                return;
            case 3:
                ((d11) obj).c();
                return;
            case 4:
                ((r11) obj).a();
                return;
            case 5:
                o11 o11Var = (o11) obj;
                o11Var.f40539f.add(o11Var.f40537c);
                o11Var.a();
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
                org.telegram.ui.Components.zc zcVar = (org.telegram.ui.Components.zc) obj;
                if (LaunchActivity.U() != null) {
                    if (zcVar == null) {
                        zcVar = org.telegram.ui.Components.zc.a0(LaunchActivity.U());
                    }
                    if (zcVar != null) {
                        org.telegram.ui.Components.sc M = zcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f30536j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((n41) obj).invalidate();
                return;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34242a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 11:
                w41 w41Var = (w41) obj;
                w41Var.dismiss();
                of.f.s(w41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.am0) obj).f24434c;
                Runnable runnable = secretMediaViewer.f34283o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34283o0 = null;
                    return;
                }
                return;
            case 13:
                n51 n51Var = ((m51) obj).f39920a;
                n51Var.Q = true;
                n51Var.N.invalidate();
                return;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 15:
                AndroidUtilities.updateViewShow(((c71) obj).f36357c, true);
                return;
            case 16:
                org.telegram.ui.Components.h71 h71Var = ((x71) obj).f43801i0;
                if (h71Var != null) {
                    h71Var.N(true);
                    return;
                }
                return;
            case 17:
                ((q71) obj).a();
                return;
            case 18:
                hg.g.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 19:
                ((jf1) obj).J.f38410r.l();
                return;
            case 20:
                ((rf1) obj).f41630b.C0();
                return;
            case 21:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 22:
                ((mi1) obj).f40059a.G();
                return;
            case 23:
                ((ni1) obj).f40427a.G();
                return;
            case 24:
                xi1 xi1Var = ((li1) obj).f39771b;
                xi1Var.L0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                xi1Var.Y.setCornerRadius(-1.0f);
                xi1Var.f43990c0.d.release();
                xi1Var.f43992d0.d.release();
                xi1Var.f43987b0.release();
                xi1Var.k();
                xi1Var.f44022u0.d();
                org.telegram.ui.Components.voip.n2.U = false;
                xi1Var.E0 = false;
                xi1.f43982n1 = null;
                return;
            case 25:
                vi1 vi1Var = (vi1) obj;
                vi1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (vi1Var.f42809a.f44013n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f35610k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
