package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class e01 implements Runnable {
    public final int f33182a;
    public final Object f33183b;

    public e01(Object obj, int i10) {
        this.f33182a = i10;
        this.f33183b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f33182a;
        Object obj = this.f33183b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((h01) obj).f34081b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.f31269e1, 0, true, new ci.cb(true, profileActivity, 2));
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
                n11Var.f35866f.add(n11Var.f35865c);
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
                org.telegram.ui.Components.vc vcVar = (org.telegram.ui.Components.vc) obj;
                if (LaunchActivity.U() != null) {
                    if (vcVar == null) {
                        vcVar = org.telegram.ui.Components.vc.a0(LaunchActivity.U());
                    }
                    if (vcVar != null) {
                        org.telegram.ui.Components.oc M = vcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f26754j = 5000;
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
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31428a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 10:
                r41 r41Var = (r41) obj;
                r41Var.dismiss();
                nf.f.s(r41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.pk0) obj).f27075c;
                Runnable runnable = secretMediaViewer.f31467o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f31467o0 = null;
                    return;
                }
                return;
            case 12:
                h51 h51Var = ((g51) obj).f33767a;
                h51Var.Q = true;
                h51Var.N.invalidate();
                return;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 14:
                AndroidUtilities.updateViewShow(((v61) obj).f38374c, true);
                return;
            case 15:
                org.telegram.ui.Components.w51 w51Var = ((q71) obj).f36796i0;
                if (w51Var != null) {
                    w51Var.N(true);
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
                ((ff1) obj).J.f33045r.l();
                return;
            case 19:
                ((nf1) obj).f35971b.C0();
                return;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 21:
                ((ii1) obj).f34688a.H();
                return;
            case 22:
                ((ji1) obj).f34912a.H();
                return;
            case 23:
                ti1 ti1Var = ((hi1) obj).f34298b;
                ti1Var.L0.unlock();
                org.telegram.ui.Components.voip.m2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ti1Var.Y.setCornerRadius(-1.0f);
                ti1Var.f37700c0.d.release();
                ti1Var.f37702d0.d.release();
                ti1Var.f37697b0.release();
                ti1Var.l();
                ti1Var.f37731u0.d();
                org.telegram.ui.Components.voip.m2.T = false;
                ti1Var.E0 = false;
                ti1.f37692n1 = null;
                return;
            case 24:
                ri1 ri1Var = (ri1) obj;
                ri1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ri1Var.f37123a.f37722n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f31618j0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
