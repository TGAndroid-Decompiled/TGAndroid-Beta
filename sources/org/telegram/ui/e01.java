package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class e01 implements Runnable {
    public final int f33142a;
    public final Object f33143b;

    public e01(Object obj, int i10) {
        this.f33142a = i10;
        this.f33143b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f33142a;
        Object obj = this.f33143b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((h01) obj).f34003b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.f31513e1, 0, true, new ci.cb(true, profileActivity, 2));
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
                n11Var.f35801f.add(n11Var.f35800c);
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
                        org.telegram.ui.Components.qc M = xcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f27550j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((l41) obj).invalidate();
                return;
            case 9:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31672a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 10:
                s41 s41Var = (s41) obj;
                s41Var.dismiss();
                nf.f.s(s41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.al0) obj).f22650c;
                Runnable runnable = secretMediaViewer.f31711o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f31711o0 = null;
                    return;
                }
                return;
            case 12:
                i51 i51Var = ((h51) obj).f34082a;
                i51Var.Q = true;
                i51Var.N.invalidate();
                return;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 14:
                AndroidUtilities.updateViewShow(((v61) obj).f38315c, true);
                return;
            case 15:
                org.telegram.ui.Components.l61 l61Var = ((q71) obj).f36718i0;
                if (l61Var != null) {
                    l61Var.N(true);
                    return;
                }
                return;
            case 16:
                ((j71) obj).a();
                return;
            case 17:
                hg.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 18:
                ((ff1) obj).J.f33003r.l();
                return;
            case 19:
                ((nf1) obj).f35931b.C0();
                return;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 21:
                ((hi1) obj).f34172a.H();
                return;
            case 22:
                ((ii1) obj).f34538a.H();
                return;
            case 23:
                si1 si1Var = ((gi1) obj).f33885b;
                si1Var.L0.unlock();
                org.telegram.ui.Components.voip.m2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                si1Var.Y.setCornerRadius(-1.0f);
                si1Var.f37302c0.d.release();
                si1Var.f37304d0.d.release();
                si1Var.f37299b0.release();
                si1Var.l();
                si1Var.f37333u0.d();
                org.telegram.ui.Components.voip.m2.T = false;
                si1Var.E0 = false;
                si1.f37294n1 = null;
                return;
            case 24:
                qi1 qi1Var = (qi1) obj;
                qi1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (qi1Var.f36840a.f37324n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f31862i0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
