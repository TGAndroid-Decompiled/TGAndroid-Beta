package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class my0 implements Runnable {
    public final int f41721a;
    public final Object f41722b;

    public my0(Object obj, int i10) {
        this.f41721a = i10;
        this.f41722b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f41721a;
        int i11 = 0;
        Object obj = this.f41722b;
        switch (i10) {
            case 0:
                int i12 = ProfileActivity.R6;
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                return;
            case 1:
                qy0 qy0Var = (qy0) obj;
                qy0Var.G.getNotificationCenter().onAnimationFinish(qy0Var.F);
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) ((bh.p) obj).f4102c;
                if (profileActivity.f36084t5 != 1.0f) {
                    zy0 zy0Var = profileActivity.f36037n0;
                    while (zy0Var.D0.k(i11) != zy0Var.getRealCount() - 1) {
                        i11++;
                    }
                    zy0Var.x(i11, true);
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity2 = ((rz0) obj).f43312b;
                int i13 = ProfileActivity.R6;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f35976e1, 0, true, new fi.ga(2, profileActivity2, true));
                return;
            case 4:
                vz0 vz0Var = (vz0) obj;
                vz0Var.T0(vz0Var.getTabProgress());
                return;
            case 5:
                ((m01) obj).c();
                return;
            case 6:
                ((b11) obj).a();
                return;
            case 7:
                y01 y01Var = (y01) obj;
                y01Var.f45919f.add(y01Var.f45918c);
                y01Var.a();
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
                        M.f31887j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((e31) obj).invalidate();
                return;
            case 12:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f36140a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.b0();
                return;
            case 13:
                m31 m31Var = (m31) obj;
                m31Var.dismiss();
                qf.d.r(m31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 14:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ll0) obj).f30226c;
                Runnable runnable = secretMediaViewer.f36179o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f36179o0 = null;
                    return;
                }
                return;
            case 15:
                c41 c41Var = ((b41) obj).f37973a;
                c41Var.Q = true;
                c41Var.N.invalidate();
                return;
            case 16:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 17:
                AndroidUtilities.updateViewShow(((r51) obj).f42998c, true);
                return;
            case 18:
                org.telegram.ui.Components.j71 j71Var = ((m61) obj).f41478i0;
                if (j71Var != null) {
                    j71Var.O(true);
                    return;
                }
                return;
            case 19:
                ((f61) obj).a();
                return;
            case 20:
                jg.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 21:
                w91 w91Var = (w91) obj;
                w91Var.m0.a(w91Var.f45030j0.f30308e0, w91Var.f45031k0.isAttachedToWindow());
                return;
            case 22:
                ((ce1) obj).J.f37767r.l();
                return;
            case 23:
                ((ke1) obj).f40924b.C0();
                return;
            case 24:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 25:
                ((eh1) obj).f39109a.G();
                return;
            case 26:
                ((fh1) obj).f39379a.G();
                return;
            case 27:
                ph1 ph1Var = ((dh1) obj).f38887b;
                ph1Var.L0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ph1Var.Y.setCornerRadius(-1.0f);
                ph1Var.f42514c0.d.release();
                ph1Var.f42516d0.d.release();
                ph1Var.f42511b0.release();
                ph1Var.k();
                ph1Var.f42545u0.d();
                org.telegram.ui.Components.voip.n2.U = false;
                ph1Var.E0 = false;
                ph1.f42506n1 = null;
                return;
            case 28:
                nh1 nh1Var = (nh1) obj;
                nh1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (nh1Var.f41895a.f42536n0 && VoIPService.getSharedInstance() != null) {
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
