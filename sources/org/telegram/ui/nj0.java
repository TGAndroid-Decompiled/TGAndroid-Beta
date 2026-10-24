package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class nj0 implements Runnable {
    public final int f39905a;
    public final Object f39906b;

    public nj0(Object obj, int i10) {
        this.f39905a = i10;
        this.f39906b = obj;
    }

    @Override
    public final void run() {
        int i10;
        ep0 ep0Var;
        gk gkVar;
        int i11 = this.f39905a;
        Object obj = this.f39906b;
        switch (i11) {
            case 0:
                AndroidUtilities.showKeyboard(((qj0) ((f) obj).f37153b).P);
                return;
            case 1:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
            case 2:
                ((PasscodeActivity) ((nd0) obj).f39806n).k0();
                return;
            case 3:
                PasskeysActivity.X((PasskeysActivity) obj);
                return;
            case 4:
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_help_passportConfig) {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    SharedConfig.setPassportConfig(tL_help_passportConfig.countries_langs.data, tL_help_passportConfig.hash);
                    return;
                }
                SharedConfig.getCountryLangs();
                return;
            case 5:
                ((hm0) obj).f37903a.finishFragment();
                return;
            case 6:
                org.telegram.ui.Components.d5.w0(((lm0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 7:
                double currentTimeMillis = System.currentTimeMillis();
                vm0 vm0Var = (vm0) ((e6.r) obj).f8400b;
                double d = currentTimeMillis - vm0Var.G;
                vm0Var.G = currentTimeMillis;
                int i12 = (int) (vm0Var.E - d);
                vm0Var.E = i12;
                if (i12 <= 1000) {
                    vm0Var.f42768r.setVisibility(0);
                    vm0Var.f42767n.setVisibility(8);
                    vm0Var.q();
                    return;
                }
                return;
            case 8:
                um0 um0Var = (um0) obj;
                vm0 vm0Var2 = um0Var.f42453a;
                int i13 = vm0Var2.f42772y;
                wm0 wm0Var = vm0Var2.f42769s;
                sm0 sm0Var = vm0Var2.f42767n;
                if (i13 >= 1000) {
                    int i14 = i13 / 1000;
                    int i15 = i14 / 60;
                    int i16 = i14 - (i15 * 60);
                    int i17 = vm0Var2.M;
                    if (i17 != 4 && i17 != 3) {
                        if (i17 == 2) {
                            sm0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i15), Integer.valueOf(i16)));
                        }
                    } else {
                        sm0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i15), Integer.valueOf(i16)));
                    }
                    if (wm0Var != null) {
                        wm0Var.f43375c = 1.0f - (vm0Var2.f42772y / vm0Var2.P);
                        wm0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (wm0Var != null) {
                    wm0Var.f43375c = 1.0f;
                    wm0Var.invalidate();
                }
                vm0Var2.r();
                int i18 = vm0Var2.L;
                if (i18 == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(vm0Var2, NotificationCenter.didReceiveCall);
                    vm0Var2.I = false;
                    vm0Var2.q();
                    vm0Var2.s();
                    return;
                } else if (i18 == 2 || i18 == 4) {
                    int i19 = vm0Var2.M;
                    if (i19 != 4 && i19 != 2) {
                        if (i19 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(vm0Var2, NotificationCenter.didReceiveSmsCode);
                            vm0Var2.I = false;
                            vm0Var2.q();
                            vm0Var2.s();
                            return;
                        }
                        return;
                    }
                    if (i19 == 4) {
                        sm0Var.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        sm0Var.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    vm0Var2.o();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = vm0Var2.f42763a;
                    tL_auth_resendCode.phone_code_hash = vm0Var2.f42764b;
                    ConnectionsManager.getInstance(zm0.e0(vm0Var2.Q)).sendRequest(tL_auth_resendCode, new l(um0Var, 17), 2);
                    return;
                } else {
                    return;
                }
            case 9:
                pf.d.r(((rn0) obj).f41191b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 10:
                ho0 ho0Var = ((wn0) obj).f43378a;
                ho0Var.t0();
                ho0Var.H0(true, false);
                ho0Var.D0(false);
                return;
            case 11:
                pf.d.r(((ao0) obj).f35818b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 12:
                cp0 cp0Var = (cp0) obj;
                ep0 ep0Var2 = cp0Var.f36384c;
                jp0 jp0Var = ep0Var2.E;
                kp0 kp0Var = ep0Var2.f36983p0;
                if (jp0Var != null && ep0Var2.L.size() > 1) {
                    jp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) ep0Var2.M.get(1);
                    ep0Var2.K = starGift;
                    if (starGift == null) {
                        yh.s3 s3Var = ep0Var2.J;
                        if (s3Var != null) {
                            s3Var.f();
                            ep0Var2.J = null;
                        }
                    } else {
                        yh.s3 s3Var2 = ep0Var2.J;
                        if (s3Var2 == null || s3Var2.f50966b != starGift.f20568id) {
                            i10 = ((org.telegram.ui.ActionBar.o2) kp0Var).currentAccount;
                            yh.s3 s3Var3 = new yh.s3(ep0Var2.K.f20568id, i10, new u3(cp0Var, 16));
                            ep0Var2.J = s3Var3;
                            s3Var3.g(false);
                        }
                    }
                    ep0.a(ep0Var2);
                    if (kp0Var.I.getCurrentPosition() == 1) {
                        ep0Var = kp0Var.f39013n;
                    } else {
                        ep0Var = kp0Var.h;
                    }
                    ep0Var.e();
                    return;
                }
                return;
            case 13:
                lq0 lq0Var = ((cq0) obj).f36387s;
                lq0Var.b0(lq0Var.P.getSearchField());
                return;
            case 14:
                ((dq0) obj).f36705z0.L.l();
                return;
            case 15:
                ((du0) obj).invalidate();
                return;
            case 16:
                com.google.android.gms.common.api.internal.u uVar = (com.google.android.gms.common.api.internal.u) obj;
                PhotoViewer photoViewer = (PhotoViewer) uVar.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.v2(uVar.f6507a);
                if (photoViewer.f33566c2 == 1) {
                    long j10 = uVar.f6507a;
                    photoViewer.X7 = j10;
                    if (photoViewer.W7 != j10) {
                        photoViewer.W7 = -1L;
                    }
                }
                uVar.f6509c = null;
                return;
            case 17:
                PhotoViewer photoViewer2 = ((ms0) obj).f39650a;
                ImageView imageView = photoViewer2.E3;
                if (imageView != null && imageView.getParent() != null) {
                    ((ViewGroup) photoViewer2.E3.getParent()).removeView(photoViewer2.E3);
                    if (photoViewer2.D3 != null) {
                        ImageView imageView2 = photoViewer2.E3;
                        if (imageView2 != null) {
                            imageView2.setBackground(null);
                        }
                        AndroidUtilities.recycleBitmap(photoViewer2.D3);
                        photoViewer2.D3 = null;
                    }
                    photoViewer2.E3 = null;
                    return;
                }
                return;
            case 18:
                sn snVar = ((os0) obj).f40250g1.l4;
                if (snVar != null && (gkVar = snVar.Y) != null) {
                    gkVar.F0();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.pl0 pl0Var = (org.telegram.ui.Components.pl0) ((v70) obj).f42599b;
                PhotoViewer photoViewer3 = (PhotoViewer) pl0Var.f29621c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.j81 j81Var = photoViewer3.F2;
                if (j81Var != null) {
                    j81Var.C();
                }
                ((PhotoViewer) pl0Var.f29621c).I2 = null;
                return;
            case 20:
                PhotoViewer photoViewer4 = ((bs0) obj).f36134a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.j81 j81Var2 = photoViewer4.F2;
                if (j81Var2 != null) {
                    j81Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 21:
                nt0 nt0Var = (nt0) ((v70) obj).f42599b;
                nt0Var.f39989r.f33649l7.unlock();
                PhotoViewer photoViewer5 = nt0Var.f39989r;
                Runnable runnable = photoViewer5.f33682p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f33682p4 = null;
                }
                photoViewer5.A2(true);
                return;
            case 22:
                PhotoViewer photoViewer6 = ((qs0) obj).f40930b;
                Runnable runnable2 = photoViewer6.f33682p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f33682p4 = null;
                    return;
                }
                return;
            case 23:
                ((yt0) obj).f49553x.d(true);
                return;
            case 24:
                ((cu0) obj).d = true;
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = ((jw0) obj).f38697c;
                premiumPreviewFragment.showDialog(new w21(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                return;
            case 26:
                ((org.telegram.messenger.ik) obj).run(0);
                return;
            case 27:
                AndroidUtilities.addToClipboard((String) obj);
                return;
            case 28:
                ((ei.x3) obj).e(true);
                return;
            default:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                return;
        }
    }
}
