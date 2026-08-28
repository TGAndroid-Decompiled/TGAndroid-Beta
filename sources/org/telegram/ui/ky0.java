package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class ky0 implements Runnable {
    public final int f39946a;
    public final Object f39947b;

    public ky0(Object obj, int i9) {
        this.f39946a = i9;
        this.f39947b = obj;
    }

    @Override
    public final void run() {
        int i9 = this.f39946a;
        int i10 = 0;
        Object obj = this.f39947b;
        switch (i9) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((fh.v) obj).f6809b;
                if (profileActivity.f35989j5 != 1.0f) {
                    my0 my0Var = profileActivity.f35984j0;
                    while (my0Var.f26814z0.k(i10) != my0Var.getRealCount() - 1) {
                        i10++;
                    }
                    my0Var.x(i10, true);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = ((dz0) obj).f37761b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f35920a1, 0, true, new kh.la(true, profileActivity2, 2));
                return;
            case 2:
                hz0 hz0Var = (hz0) obj;
                hz0Var.M0(hz0Var.getTabProgress());
                return;
            case 3:
                ((yz0) obj).c();
                return;
            case 4:
                ((m01) obj).a();
                return;
            case 5:
                j01 j01Var = (j01) obj;
                j01Var.f39333f.add(j01Var.f39331c);
                j01Var.a();
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 7:
                ((ih.j6) obj).e();
                return;
            case 8:
                k11 k11Var = (k11) obj;
                AndroidUtilities.hideKeyboard(k11Var.d.findFocus());
                while (i10 < k11Var.f39675y.length) {
                    int i11 = k11Var.f39673w;
                    if ((i11 != 0 || i10 == 4) && (i11 != 1 || i10 == 2 || i10 == 3)) {
                        k11Var.f39665a[i10].setText((CharSequence) null);
                    }
                    i10++;
                }
                return;
            case 9:
                org.telegram.ui.Components.oc ocVar = (org.telegram.ui.Components.oc) obj;
                if (LaunchActivity.U() != null) {
                    if (ocVar == null) {
                        ocVar = org.telegram.ui.Components.oc.a0(LaunchActivity.U());
                    }
                    if (ocVar != null) {
                        org.telegram.ui.Components.gc M = ocVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f28737j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((h31) obj).invalidate();
                return;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f36107a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Y();
                return;
            case 12:
                n31 n31Var = (n31) obj;
                n31Var.dismiss();
                ve.e.s(n31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.su0) obj).f32556c;
                Runnable runnable = secretMediaViewer.f36141k0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f36141k0 = null;
                    return;
                }
                return;
            case 14:
                d41 d41Var = ((c41) obj).f37061a;
                d41Var.M = true;
                d41Var.J.invalidate();
                return;
            case 15:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 16:
                AndroidUtilities.updateViewShow(((q51) obj).f41684c, true);
                return;
            case 17:
                org.telegram.ui.Components.z41 z41Var = ((l61) obj).f40068e0;
                if (z41Var != null) {
                    z41Var.N(true);
                    return;
                }
                return;
            case 18:
                ((e61) obj).a();
                return;
            case 19:
                pf.g.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 20:
                ((xd1) obj).J.f43772r.l();
                return;
            case 21:
                ((fe1) obj).f38246b.B0();
                return;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 23:
                ((bh1) obj).f36861a.H();
                return;
            case 24:
                ((ch1) obj).f37214a.H();
                return;
            case 25:
                mh1 mh1Var = ((ah1) obj).f36501b;
                mh1Var.H0.unlock();
                org.telegram.ui.Components.voip.l2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                mh1Var.U.setCornerRadius(-1.0f);
                mh1Var.Y.d.release();
                mh1Var.Z.d.release();
                mh1Var.X.release();
                mh1Var.l();
                mh1Var.f40458q0.d();
                org.telegram.ui.Components.voip.l2.P = false;
                mh1Var.A0 = false;
                mh1.f40427j1 = null;
                return;
            case 26:
                kh1 kh1Var = (kh1) obj;
                kh1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (kh1Var.f39844a.f40451j0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f36296g0;
                ((WallpapersListActivity) obj).A0(false);
                return;
        }
    }
}
