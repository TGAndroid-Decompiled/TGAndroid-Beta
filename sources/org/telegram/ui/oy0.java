package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class oy0 implements Runnable {
    public final int f42251a;
    public final Object f42252b;

    public oy0(Object obj, int i10) {
        this.f42251a = i10;
        this.f42252b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f42251a;
        int i11 = 0;
        Object obj = this.f42252b;
        switch (i10) {
            case 0:
                int i12 = ProfileActivity.R6;
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                return;
            case 1:
                sy0 sy0Var = (sy0) obj;
                sy0Var.G.getNotificationCenter().onAnimationFinish(sy0Var.F);
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) ((bh.p) obj).f4102c;
                if (profileActivity.f36111t5 != 1.0f) {
                    bz0 bz0Var = profileActivity.f36064n0;
                    while (bz0Var.D0.k(i11) != bz0Var.getRealCount() - 1) {
                        i11++;
                    }
                    bz0Var.x(i11, true);
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity2 = ((tz0) obj).f43810b;
                int i13 = ProfileActivity.R6;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f36003e1, 0, true, new fi.ga(2, profileActivity2, true));
                return;
            case 4:
                xz0 xz0Var = (xz0) obj;
                xz0Var.T0(xz0Var.getTabProgress());
                return;
            case 5:
                ((o01) obj).c();
                return;
            case 6:
                ((d11) obj).a();
                return;
            case 7:
                a11 a11Var = (a11) obj;
                a11Var.f37646f.add(a11Var.f37645c);
                a11Var.a();
                return;
            case 8:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 9:
                ((di.v6) obj).e();
                return;
            case 10:
                org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) obj;
                if (LaunchActivity.U() != null) {
                    if (wcVar == null) {
                        wcVar = org.telegram.ui.Components.wc.b0(LaunchActivity.U());
                    }
                    if (wcVar != null) {
                        org.telegram.ui.Components.qc M = wcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f31861j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((g31) obj).invalidate();
                return;
            case 12:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f36167a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.b0();
                return;
            case 13:
                o31 o31Var = (o31) obj;
                o31Var.dismiss();
                qf.d.r(o31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 14:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ml0) obj).f30559c;
                Runnable runnable = secretMediaViewer.f36206o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f36206o0 = null;
                    return;
                }
                return;
            case 15:
                f41 f41Var = ((e41) obj).f38754a;
                f41Var.Q = true;
                f41Var.N.invalidate();
                return;
            case 16:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 17:
                AndroidUtilities.updateViewShow(((u51) obj).f43881c, true);
                return;
            case 18:
                org.telegram.ui.Components.k71 k71Var = ((p61) obj).f42324i0;
                if (k71Var != null) {
                    k71Var.O(true);
                    return;
                }
                return;
            case 19:
                ((i61) obj).a();
                return;
            case 20:
                jg.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 21:
                y91 y91Var = (y91) obj;
                y91Var.m0.a(y91Var.f45921j0.f30653e0, y91Var.f45922k0.isAttachedToWindow());
                return;
            case 22:
                ((ee1) obj).J.f38324r.l();
                return;
            case 23:
                ((me1) obj).f41427b.C0();
                return;
            case 24:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 25:
                ((gh1) obj).f39620a.G();
                return;
            case 26:
                ((hh1) obj).f39898a.G();
                return;
            case 27:
                rh1 rh1Var = ((fh1) obj).f39384b;
                rh1Var.L0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                rh1Var.Y.setCornerRadius(-1.0f);
                rh1Var.f43007c0.d.release();
                rh1Var.f43009d0.d.release();
                rh1Var.f43004b0.release();
                rh1Var.k();
                rh1Var.f43038u0.d();
                org.telegram.ui.Components.voip.n2.U = false;
                rh1Var.E0 = false;
                rh1.f42999n1 = null;
                return;
            case 28:
                ph1 ph1Var = (ph1) obj;
                ph1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ph1Var.f42405a.f43029n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((VoIPPermissionActivity) obj).finish();
                return;
        }
    }
}
