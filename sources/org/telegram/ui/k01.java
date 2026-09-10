package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class k01 implements Runnable {
    public final int f34184a;
    public final Object f34185b;

    public k01(Object obj, int i10) {
        this.f34184a = i10;
        this.f34185b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f34184a;
        Object obj = this.f34185b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((n01) obj).f35089b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.f30381e1, 0, true, new bi.lc(true, profileActivity, 2));
                return;
            case 1:
                r01 r01Var = (r01) obj;
                r01Var.M0(r01Var.getTabProgress());
                return;
            case 2:
                ((i11) obj).c();
                return;
            case 3:
                ((w11) obj).a();
                return;
            case 4:
                t11 t11Var = (t11) obj;
                t11Var.f36816f.add(t11Var.f36815c);
                t11Var.a();
                return;
            case 5:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 6:
                ((zh.w4) obj).e();
                return;
            case 7:
                org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) obj;
                if (LaunchActivity.U() != null) {
                    if (wcVar == null) {
                        wcVar = org.telegram.ui.Components.wc.a0(LaunchActivity.U());
                    }
                    if (wcVar != null) {
                        org.telegram.ui.Components.pc M = wcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f26081j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((r41) obj).invalidate();
                return;
            case 9:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f30540a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 10:
                x41 x41Var = (x41) obj;
                x41Var.dismiss();
                nf.f.s(x41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.vv0) obj).f28603c;
                Runnable runnable = secretMediaViewer.f30579o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f30579o0 = null;
                    return;
                }
                return;
            case 12:
                n51 n51Var = ((m51) obj).f34848a;
                n51Var.Q = true;
                n51Var.N.invalidate();
                return;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 14:
                AndroidUtilities.updateViewShow(((a71) obj).f30814c, true);
                return;
            case 15:
                org.telegram.ui.Components.j61 j61Var = ((v71) obj).f37442i0;
                if (j61Var != null) {
                    j61Var.N(true);
                    return;
                }
                return;
            case 16:
                ((o71) obj).a();
                return;
            case 17:
                gg.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 18:
                ((kf1) obj).J.f33714r.l();
                return;
            case 19:
                ((sf1) obj).f36673b.C0();
                return;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 21:
                ((oi1) obj).f35502a.H();
                return;
            case 22:
                ((pi1) obj).f35849a.H();
                return;
            case 23:
                zi1 zi1Var = ((ni1) obj).f35286b;
                zi1Var.L0.unlock();
                org.telegram.ui.Components.voip.l2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                zi1Var.Y.setCornerRadius(-1.0f);
                zi1Var.f39363c0.d.release();
                zi1Var.f39365d0.d.release();
                zi1Var.f39360b0.release();
                zi1Var.l();
                zi1Var.f39394u0.d();
                org.telegram.ui.Components.voip.l2.T = false;
                zi1Var.E0 = false;
                zi1.f39355n1 = null;
                return;
            case 24:
                xi1 xi1Var = (xi1) obj;
                xi1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (xi1Var.f38763a.f39385n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f30730k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
