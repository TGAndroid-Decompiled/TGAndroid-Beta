package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class g01 implements Runnable {
    public final int f33814a;
    public final Object f33815b;

    public g01(Object obj, int i10) {
        this.f33814a = i10;
        this.f33815b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f33814a;
        Object obj = this.f33815b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((j01) obj).f34748b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.f31286e1, 0, true, new ci.cb(true, profileActivity, 2));
                return;
            case 1:
                n01 n01Var = (n01) obj;
                n01Var.M0(n01Var.getTabProgress());
                return;
            case 2:
                ((e11) obj).c();
                return;
            case 3:
                ((s11) obj).a();
                return;
            case 4:
                p11 p11Var = (p11) obj;
                p11Var.f36493f.add(p11Var.f36492c);
                p11Var.a();
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
                        M.f26705j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((n41) obj).invalidate();
                return;
            case 9:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31445a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 10:
                u41 u41Var = (u41) obj;
                u41Var.dismiss();
                nf.f.s(u41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.qk0) obj).f27341c;
                Runnable runnable = secretMediaViewer.f31484o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f31484o0 = null;
                    return;
                }
                return;
            case 12:
                k51 k51Var = ((j51) obj).f34782a;
                k51Var.Q = true;
                k51Var.N.invalidate();
                return;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 14:
                AndroidUtilities.updateViewShow(((x61) obj).f39397c, true);
                return;
            case 15:
                org.telegram.ui.Components.x51 x51Var = ((s71) obj).f37414i0;
                if (x51Var != null) {
                    x51Var.N(true);
                    return;
                }
                return;
            case 16:
                ((l71) obj).a();
                return;
            case 17:
                hg.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 18:
                ((hf1) obj).J.f33673r.l();
                return;
            case 19:
                ((pf1) obj).f36625b.C0();
                return;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 21:
                ((ii1) obj).f34609a.H();
                return;
            case 22:
                ((ji1) obj).f34899a.H();
                return;
            case 23:
                ti1 ti1Var = ((hi1) obj).f34290b;
                ti1Var.L0.unlock();
                org.telegram.ui.Components.voip.m2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ti1Var.Y.setCornerRadius(-1.0f);
                ti1Var.f37768c0.d.release();
                ti1Var.f37770d0.d.release();
                ti1Var.f37765b0.release();
                ti1Var.l();
                ti1Var.f37799u0.d();
                org.telegram.ui.Components.voip.m2.T = false;
                ti1Var.E0 = false;
                ti1.f37760n1 = null;
                return;
            case 24:
                ri1 ri1Var = (ri1) obj;
                ri1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ri1Var.f37253a.f37790n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f31635i0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
