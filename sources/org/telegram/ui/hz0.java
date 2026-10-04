package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class hz0 implements Runnable {
    public final int f37198a;
    public final Object f37199b;

    public hz0(Object obj, int i10) {
        this.f37198a = i10;
        this.f37199b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f37198a;
        int i11 = 0;
        Object obj = this.f37199b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ci.m6) obj).f5571c;
                if (profileActivity.f34305n5 != 1.0f) {
                    jz0 jz0Var = profileActivity.f34300n0;
                    while (jz0Var.D0.k(i11) != jz0Var.getRealCount() - 1) {
                        i11++;
                    }
                    jz0Var.x(i11, true);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = ((a01) obj).f34629b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f34240e1, 0, true, new ci.ya(true, profileActivity2, 2));
                return;
            case 2:
                e01 e01Var = (e01) obj;
                e01Var.M0(e01Var.getTabProgress());
                return;
            case 3:
                ((v01) obj).c();
                return;
            case 4:
                ((j11) obj).a();
                return;
            case 5:
                g11 g11Var = (g11) obj;
                g11Var.f36475f.add(g11Var.f36473c);
                g11Var.a();
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 7:
                ((ai.x8) obj).e();
                return;
            case 8:
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) obj;
                if (LaunchActivity.U() != null) {
                    if (ycVar == null) {
                        ycVar = org.telegram.ui.Components.yc.a0(LaunchActivity.U());
                    }
                    if (ycVar != null) {
                        org.telegram.ui.Components.rc M = ycVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f30345j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((f41) obj).invalidate();
                return;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34400a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Y();
                return;
            case 11:
                o41 o41Var = (o41) obj;
                o41Var.dismiss();
                nf.f.s(o41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.cl0) obj).f25420c;
                Runnable runnable = secretMediaViewer.f34441o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34441o0 = null;
                    return;
                }
                return;
            case 13:
                e51 e51Var = ((d51) obj).f35655a;
                e51Var.Q = true;
                e51Var.N.invalidate();
                return;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 15:
                AndroidUtilities.updateViewShow(((r61) obj).f39934c, true);
                return;
            case 16:
                org.telegram.ui.Components.u61 u61Var = ((m71) obj).f38467i0;
                if (u61Var != null) {
                    u61Var.N(true);
                    return;
                }
                return;
            case 17:
                ((f71) obj).a();
                return;
            case 18:
                hg.g.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 19:
                va1 va1Var = (va1) obj;
                va1Var.m0.a(va1Var.f41659j0.f24697h1, va1Var.f41660k0.isAttachedToWindow());
                return;
            case 20:
                ((af1) obj).J.f43204r.l();
                return;
            case 21:
                ((if1) obj).f37420b.C0();
                return;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 23:
                ((bi1) obj).f35124a.H();
                return;
            case 24:
                ((ci1) obj).f35490a.H();
                return;
            case 25:
                mi1 mi1Var = ((ai1) obj).f34836b;
                mi1Var.L0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                mi1Var.Y.setCornerRadius(-1.0f);
                mi1Var.f38616c0.d.release();
                mi1Var.f38618d0.d.release();
                mi1Var.f38613b0.release();
                mi1Var.l();
                mi1Var.f38648u0.d();
                org.telegram.ui.Components.voip.n2.T = false;
                mi1Var.E0 = false;
                mi1.f38608n1 = null;
                return;
            case 26:
                ki1 ki1Var = (ki1) obj;
                ki1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ki1Var.f37997a.f38639n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ((VoIPPermissionActivity) obj).finish();
                return;
            default:
                int[][] iArr = WallpapersListActivity.f34600i0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
