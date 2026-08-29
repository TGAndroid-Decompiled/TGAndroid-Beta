package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class ky0 implements Runnable {
    public final int f40040a;
    public final Object f40041b;

    public ky0(Object obj, int i10) {
        this.f40040a = i10;
        this.f40041b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f40040a;
        int i11 = 0;
        Object obj = this.f40041b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((bg.d1) obj).f2147c;
                if (profileActivity.f36054j5 != 1.0f) {
                    my0 my0Var = profileActivity.f36049j0;
                    while (my0Var.f30065z0.k(i11) != my0Var.getRealCount() - 1) {
                        i11++;
                    }
                    my0Var.x(i11, true);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = ((dz0) obj).f37655b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f35986a1, 0, true, new nh.w9(true, profileActivity2, 1));
                return;
            case 2:
                hz0 hz0Var = (hz0) obj;
                hz0Var.M0(hz0Var.getTabProgress());
                return;
            case 3:
                ((yz0) obj).c();
                return;
            case 4:
                ((n01) obj).a();
                return;
            case 5:
                k01 k01Var = (k01) obj;
                k01Var.f39722f.add(k01Var.f39720c);
                k01Var.a();
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 7:
                ((lh.g6) obj).e();
                return;
            case 8:
                l11 l11Var = (l11) obj;
                AndroidUtilities.hideKeyboard(l11Var.d.findFocus());
                while (i11 < l11Var.f40063y.length) {
                    int i12 = l11Var.f40061w;
                    if ((i12 != 0 || i11 == 4) && (i12 != 1 || i11 == 2 || i11 == 3)) {
                        l11Var.f40053a[i11].setText((CharSequence) null);
                    }
                    i11++;
                }
                return;
            case 9:
                org.telegram.ui.Components.tc tcVar = (org.telegram.ui.Components.tc) obj;
                if (LaunchActivity.U() != null) {
                    if (tcVar == null) {
                        tcVar = org.telegram.ui.Components.tc.a0(LaunchActivity.U());
                    }
                    if (tcVar != null) {
                        org.telegram.ui.Components.mc M = tcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f30652j = 5000;
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
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f36172a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 12:
                o31 o31Var = (o31) obj;
                o31Var.dismiss();
                ye.d.s(o31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ok0) obj).f31382c;
                Runnable runnable = secretMediaViewer.f36206k0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f36206k0 = null;
                    return;
                }
                return;
            case 14:
                f41 f41Var = ((e41) obj).f37699a;
                f41Var.M = true;
                f41Var.J.invalidate();
                return;
            case 15:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 16:
                AndroidUtilities.updateViewShow(((s51) obj).f42273c, true);
                return;
            case 17:
                org.telegram.ui.Components.k51 k51Var = ((n61) obj).f40730e0;
                if (k51Var != null) {
                    k51Var.N(true);
                    return;
                }
                return;
            case 18:
                ((g61) obj).a();
                return;
            case 19:
                sf.g.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 20:
                ((zd1) obj).J.f45186r.l();
                return;
            case 21:
                ((ie1) obj).f39228b.C0();
                return;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 23:
                ((dh1) obj).f37544a.H();
                return;
            case 24:
                ((eh1) obj).f37838a.H();
                return;
            case 25:
                oh1 oh1Var = ((ch1) obj).f37129b;
                oh1Var.H0.unlock();
                org.telegram.ui.Components.voip.o2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                oh1Var.U.setCornerRadius(-1.0f);
                oh1Var.Y.d.release();
                oh1Var.Z.d.release();
                oh1Var.X.release();
                oh1Var.l();
                oh1Var.f41166q0.d();
                org.telegram.ui.Components.voip.o2.P = false;
                oh1Var.A0 = false;
                oh1.f41135j1 = null;
                return;
            case 26:
                mh1 mh1Var = (mh1) obj;
                mh1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (mh1Var.f40569a.f41159j0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f36361g0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
