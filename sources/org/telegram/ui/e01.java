package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class e01 implements Runnable {
    public final int f33193a;
    public final Object f33194b;

    public e01(Object obj, int i10) {
        this.f33193a = i10;
        this.f33194b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f33193a;
        Object obj = this.f33194b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((h01) obj).f34039b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.f31553e1, 0, true, new ci.cb(true, profileActivity, 2));
                return;
            case 1:
                l01 l01Var = (l01) obj;
                l01Var.M0(l01Var.getTabProgress());
                return;
            case 2:
                ((c11) obj).c();
                return;
            case 3:
                ((q11) obj).a();
                return;
            case 4:
                n11 n11Var = (n11) obj;
                n11Var.f35876f.add(n11Var.f35875c);
                n11Var.a();
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
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) obj;
                if (LaunchActivity.U() != null) {
                    if (xcVar == null) {
                        xcVar = org.telegram.ui.Components.xc.a0(LaunchActivity.U());
                    }
                    if (xcVar != null) {
                        org.telegram.ui.Components.pc M = xcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f27252j = 5000;
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
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31712a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 10:
                v41 v41Var = (v41) obj;
                v41Var.dismiss();
                nf.f.s(v41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.zk0) obj).f30853c;
                Runnable runnable = secretMediaViewer.f31751o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f31751o0 = null;
                    return;
                }
                return;
            case 12:
                l51 l51Var = ((k51) obj).f35040a;
                l51Var.Q = true;
                l51Var.N.invalidate();
                return;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 14:
                AndroidUtilities.updateViewShow(((y61) obj).f39807c, true);
                return;
            case 15:
                org.telegram.ui.Components.k61 k61Var = ((t71) obj).f37673i0;
                if (k61Var != null) {
                    k61Var.N(true);
                    return;
                }
                return;
            case 16:
                ((m71) obj).a();
                return;
            case 17:
                hg.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 18:
                ((hf1) obj).J.f33629r.l();
                return;
            case 19:
                ((pf1) obj).f36558b.C0();
                return;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 21:
                ((ii1) obj).f34592a.H();
                return;
            case 22:
                ((ji1) obj).f34938a.H();
                return;
            case 23:
                ti1 ti1Var = ((hi1) obj).f34222b;
                ti1Var.L0.unlock();
                org.telegram.ui.Components.voip.m2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ti1Var.Y.setCornerRadius(-1.0f);
                ti1Var.f37776c0.d.release();
                ti1Var.f37778d0.d.release();
                ti1Var.f37773b0.release();
                ti1Var.l();
                ti1Var.f37807u0.d();
                org.telegram.ui.Components.voip.m2.T = false;
                ti1Var.E0 = false;
                ti1.f37768n1 = null;
                return;
            case 24:
                ri1 ri1Var = (ri1) obj;
                ri1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ri1Var.f37173a.f37798n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f31902i0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
