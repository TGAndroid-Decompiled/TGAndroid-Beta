package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

public final class ky0 implements Runnable {

    public final int f39902a;

    public final Object f39903b;

    public ky0(Object obj, int i10) {
        this.f39902a = i10;
        this.f39903b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f39902a;
        int i11 = 2;
        int i12 = 0;
        Object obj = this.f39903b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ag.y1) obj).f707c;
                if (profileActivity.f35992j5 != 1.0f) {
                    my0 my0Var = profileActivity.f35987j0;
                    while (my0Var.f27451z0.k(i12) != my0Var.getRealCount() - 1) {
                        i12++;
                    }
                    my0Var.x(i12, true);
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = ((dz0) obj).f37574b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f35923a1, 0, true, new lh.ia(true, profileActivity2, i11));
                break;
            case 2:
                hz0 hz0Var = (hz0) obj;
                hz0Var.M0(hz0Var.getTabProgress());
                break;
            case 3:
                ((yz0) obj).c();
                break;
            case 4:
                ((n01) obj).a();
                break;
            case 5:
                k01 k01Var = (k01) obj;
                k01Var.f39556f.add(k01Var.f39554c);
                k01Var.a();
                break;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 7:
                ((jh.f6) obj).e();
                break;
            case 8:
                j11 j11Var = (j11) obj;
                AndroidUtilities.hideKeyboard(j11Var.d.findFocus());
                while (i12 < j11Var.f39233y.length) {
                    int i13 = j11Var.f39231w;
                    if ((i13 != 0 || i12 == 4) && (i13 != 1 || i12 == 2 || i12 == 3)) {
                        j11Var.f39223a[i12].setText((CharSequence) null);
                    }
                    i12++;
                }
                break;
            case 9:
                org.telegram.ui.Components.mc mcVarA0 = (org.telegram.ui.Components.mc) obj;
                if (LaunchActivity.U() != null) {
                    if (mcVarA0 == null) {
                        mcVarA0 = org.telegram.ui.Components.mc.a0(LaunchActivity.U());
                    }
                    if (mcVarA0 != null) {
                        org.telegram.ui.Components.ec ecVarM = mcVarA0.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        ecVarM.f28020j = 5000;
                        ecVarM.j();
                        break;
                    }
                }
                break;
            case 10:
                ((g31) obj).invalidate();
                break;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f36110a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                break;
            case 12:
                m31 m31Var = (m31) obj;
                m31Var.dismiss();
                we.e.s(m31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.fk0) obj).f28400c;
                Runnable runnable = secretMediaViewer.f36144k0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f36144k0 = null;
                }
                break;
            case 14:
                c41 c41Var = ((b41) obj).f36696a;
                c41Var.M = true;
                c41Var.J.invalidate();
                break;
            case 15:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 16:
                AndroidUtilities.updateViewShow(((p51) obj).f41274c, true);
                break;
            case 17:
                org.telegram.ui.Components.b51 b51Var = ((k61) obj).f39626e0;
                if (b51Var != null) {
                    b51Var.N(true);
                }
                break;
            case 18:
                ((d61) obj).a();
                break;
            case 19:
                qf.h.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 20:
                ((yd1) obj).J.f43750r.l();
                break;
            case 21:
                ((ge1) obj).f38398b.C0();
                break;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 23:
                ((ah1) obj).f36537a.H();
                break;
            case 24:
                ((bh1) obj).f36833a.H();
                break;
            case 25:
                lh1 lh1Var = ((zg1) obj).f45182b;
                lh1Var.H0.unlock();
                org.telegram.ui.Components.voip.l2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                lh1Var.U.setCornerRadius(-1.0f);
                lh1Var.Y.d.release();
                lh1Var.Z.d.release();
                lh1Var.X.release();
                lh1Var.l();
                lh1Var.f40119q0.d();
                org.telegram.ui.Components.voip.l2.P = false;
                lh1Var.A0 = false;
                lh1.f40088j1 = null;
                break;
            case 26:
                jh1 jh1Var = (jh1) obj;
                jh1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (jh1Var.f39378a.f40112j0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            case 27:
                ((VoIPPermissionActivity) obj).finish();
                break;
            default:
                int[][] iArr = WallpapersListActivity.f36299g0;
                ((WallpapersListActivity) obj).B0(false);
                break;
        }
    }
}
