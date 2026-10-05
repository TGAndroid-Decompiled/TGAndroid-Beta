package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class hz0 implements Runnable {
    public final int f37199a;
    public final Object f37200b;

    public hz0(Object obj, int i10) {
        this.f37199a = i10;
        this.f37200b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f37199a;
        int i11 = 0;
        Object obj = this.f37200b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ci.m6) obj).f5571c;
                if (profileActivity.f34318n5 != 1.0f) {
                    jz0 jz0Var = profileActivity.f34313n0;
                    while (jz0Var.D0.k(i11) != jz0Var.getRealCount() - 1) {
                        i11++;
                    }
                    jz0Var.x(i11, true);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = ((a01) obj).f34642b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f34253e1, 0, true, new ci.ya(true, profileActivity2, 2));
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
                g11Var.f36483f.add(g11Var.f36481c);
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
                        M.f30427j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((d41) obj).invalidate();
                return;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34413a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Y();
                return;
            case 11:
                m41 m41Var = (m41) obj;
                m41Var.dismiss();
                nf.f.s(m41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.cl0) obj).f25468c;
                Runnable runnable = secretMediaViewer.f34454o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34454o0 = null;
                    return;
                }
                return;
            case 13:
                c51 c51Var = ((b51) obj).f35054a;
                c51Var.Q = true;
                c51Var.N.invalidate();
                return;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 15:
                AndroidUtilities.updateViewShow(((p61) obj).f39368c, true);
                return;
            case 16:
                org.telegram.ui.Components.w61 w61Var = ((k71) obj).f37879i0;
                if (w61Var != null) {
                    w61Var.N(true);
                    return;
                }
                return;
            case 17:
                ((d71) obj).a();
                return;
            case 18:
                hg.g.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 19:
                ta1 ta1Var = (ta1) obj;
                ta1Var.m0.a(ta1Var.f40816j0.f25125e0, ta1Var.f40817k0.isAttachedToWindow());
                return;
            case 20:
                ((ye1) obj).J.f42501r.l();
                return;
            case 21:
                ((gf1) obj).f36660b.C0();
                return;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 23:
                ((zh1) obj).f43800a.H();
                return;
            case 24:
                ((ai1) obj).f34886a.H();
                return;
            case 25:
                ki1 ki1Var = ((yh1) obj).f43238b;
                ki1Var.L0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ki1Var.Y.setCornerRadius(-1.0f);
                ki1Var.f38025c0.d.release();
                ki1Var.f38027d0.d.release();
                ki1Var.f38022b0.release();
                ki1Var.l();
                ki1Var.f38057u0.d();
                org.telegram.ui.Components.voip.n2.T = false;
                ki1Var.E0 = false;
                ki1.f38017n1 = null;
                return;
            case 26:
                ii1 ii1Var = (ii1) obj;
                ii1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ii1Var.f37436a.f38048n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f34613i0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
