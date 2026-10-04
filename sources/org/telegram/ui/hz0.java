package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class hz0 implements Runnable {
    public final int f37192a;
    public final Object f37193b;

    public hz0(Object obj, int i10) {
        this.f37192a = i10;
        this.f37193b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f37192a;
        int i11 = 0;
        Object obj = this.f37193b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ci.m6) obj).f5570c;
                if (profileActivity.f34298n5 != 1.0f) {
                    jz0 jz0Var = profileActivity.f34293n0;
                    while (jz0Var.D0.k(i11) != jz0Var.getRealCount() - 1) {
                        i11++;
                    }
                    jz0Var.x(i11, true);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = ((a01) obj).f34622b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f34233e1, 0, true, new ci.ya(true, profileActivity2, 2));
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
                g11Var.f36469f.add(g11Var.f36467c);
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
                        M.f30338j = 5000;
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
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34393a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Y();
                return;
            case 11:
                o41 o41Var = (o41) obj;
                o41Var.dismiss();
                nf.f.s(o41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.cl0) obj).f25414c;
                Runnable runnable = secretMediaViewer.f34434o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34434o0 = null;
                    return;
                }
                return;
            case 13:
                e51 e51Var = ((d51) obj).f35649a;
                e51Var.Q = true;
                e51Var.N.invalidate();
                return;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 15:
                AndroidUtilities.updateViewShow(((r61) obj).f39928c, true);
                return;
            case 16:
                org.telegram.ui.Components.u61 u61Var = ((m71) obj).f38461i0;
                if (u61Var != null) {
                    u61Var.N(true);
                    return;
                }
                return;
            case 17:
                ((f71) obj).a();
                return;
            case 18:
                hg.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 19:
                va1 va1Var = (va1) obj;
                va1Var.m0.a(va1Var.f41651j0.f24692h1, va1Var.f41652k0.isAttachedToWindow());
                return;
            case 20:
                ((af1) obj).J.f43196r.l();
                return;
            case 21:
                ((if1) obj).f37414b.C0();
                return;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 23:
                ((bi1) obj).f35118a.H();
                return;
            case 24:
                ((ci1) obj).f35484a.H();
                return;
            case 25:
                mi1 mi1Var = ((ai1) obj).f34830b;
                mi1Var.L0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                mi1Var.Y.setCornerRadius(-1.0f);
                mi1Var.f38610c0.d.release();
                mi1Var.f38612d0.d.release();
                mi1Var.f38607b0.release();
                mi1Var.l();
                mi1Var.f38642u0.d();
                org.telegram.ui.Components.voip.n2.T = false;
                mi1Var.E0 = false;
                mi1.f38602n1 = null;
                return;
            case 26:
                ki1 ki1Var = (ki1) obj;
                ki1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ki1Var.f37991a.f38633n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f34593i0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
