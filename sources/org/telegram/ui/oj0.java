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
public final class oj0 implements Runnable {
    public final int f40214a;
    public final Object f40215b;

    public oj0(Object obj, int i10) {
        this.f40214a = i10;
        this.f40215b = obj;
    }

    @Override
    public final void run() {
        int i10;
        fp0 fp0Var;
        gk gkVar;
        int i11 = this.f40214a;
        Object obj = this.f40215b;
        switch (i11) {
            case 0:
                AndroidUtilities.showKeyboard(((rj0) ((f) obj).f37180b).P);
                return;
            case 1:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
            case 2:
                ((PasscodeActivity) ((od0) obj).f40139n).k0();
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
                ((im0) obj).f38269a.finishFragment();
                return;
            case 6:
                org.telegram.ui.Components.f5.x0(((mm0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 7:
                double currentTimeMillis = System.currentTimeMillis();
                wm0 wm0Var = (wm0) ((e6.r) obj).f8400b;
                double d = currentTimeMillis - wm0Var.G;
                wm0Var.G = currentTimeMillis;
                int i12 = (int) (wm0Var.E - d);
                wm0Var.E = i12;
                if (i12 <= 1000) {
                    wm0Var.f43399r.setVisibility(0);
                    wm0Var.f43398n.setVisibility(8);
                    wm0Var.q();
                    return;
                }
                return;
            case 8:
                vm0 vm0Var = (vm0) obj;
                wm0 wm0Var2 = vm0Var.f42791a;
                int i13 = wm0Var2.f43403y;
                xm0 xm0Var = wm0Var2.f43400s;
                tm0 tm0Var = wm0Var2.f43398n;
                if (i13 >= 1000) {
                    int i14 = i13 / 1000;
                    int i15 = i14 / 60;
                    int i16 = i14 - (i15 * 60);
                    int i17 = wm0Var2.M;
                    if (i17 != 4 && i17 != 3) {
                        if (i17 == 2) {
                            tm0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i15), Integer.valueOf(i16)));
                        }
                    } else {
                        tm0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i15), Integer.valueOf(i16)));
                    }
                    if (xm0Var != null) {
                        xm0Var.f43621c = 1.0f - (wm0Var2.f43403y / wm0Var2.P);
                        xm0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (xm0Var != null) {
                    xm0Var.f43621c = 1.0f;
                    xm0Var.invalidate();
                }
                wm0Var2.r();
                int i18 = wm0Var2.L;
                if (i18 == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(wm0Var2, NotificationCenter.didReceiveCall);
                    wm0Var2.I = false;
                    wm0Var2.q();
                    wm0Var2.s();
                    return;
                } else if (i18 == 2 || i18 == 4) {
                    int i19 = wm0Var2.M;
                    if (i19 != 4 && i19 != 2) {
                        if (i19 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(wm0Var2, NotificationCenter.didReceiveSmsCode);
                            wm0Var2.I = false;
                            wm0Var2.q();
                            wm0Var2.s();
                            return;
                        }
                        return;
                    }
                    if (i19 == 4) {
                        tm0Var.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        tm0Var.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    wm0Var2.o();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = wm0Var2.f43394a;
                    tL_auth_resendCode.phone_code_hash = wm0Var2.f43395b;
                    ConnectionsManager.getInstance(an0.e0(wm0Var2.Q)).sendRequest(tL_auth_resendCode, new l(vm0Var, 17), 2);
                    return;
                } else {
                    return;
                }
            case 9:
                pf.d.r(((sn0) obj).f41775b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 10:
                io0 io0Var = ((xn0) obj).f43625a;
                io0Var.t0();
                io0Var.H0(true, false);
                io0Var.D0(false);
                return;
            case 11:
                pf.d.r(((bo0) obj).f36146b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 12:
                dp0 dp0Var = (dp0) obj;
                fp0 fp0Var2 = dp0Var.f36671c;
                kp0 kp0Var = fp0Var2.E;
                lp0 lp0Var = fp0Var2.f37402p0;
                if (kp0Var != null && fp0Var2.L.size() > 1) {
                    kp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) fp0Var2.M.get(1);
                    fp0Var2.K = starGift;
                    if (starGift == null) {
                        yh.s3 s3Var = fp0Var2.J;
                        if (s3Var != null) {
                            s3Var.f();
                            fp0Var2.J = null;
                        }
                    } else {
                        yh.s3 s3Var2 = fp0Var2.J;
                        if (s3Var2 == null || s3Var2.f50967b != starGift.f20567id) {
                            i10 = ((org.telegram.ui.ActionBar.o2) lp0Var).currentAccount;
                            yh.s3 s3Var3 = new yh.s3(fp0Var2.K.f20567id, i10, new u3(dp0Var, 16));
                            fp0Var2.J = s3Var3;
                            s3Var3.g(false);
                        }
                    }
                    fp0.a(fp0Var2);
                    if (lp0Var.I.getCurrentPosition() == 1) {
                        fp0Var = lp0Var.f39305n;
                    } else {
                        fp0Var = lp0Var.h;
                    }
                    fp0Var.e();
                    return;
                }
                return;
            case 13:
                mq0 mq0Var = ((dq0) obj).f36712s;
                mq0Var.b0(mq0Var.P.getSearchField());
                return;
            case 14:
                ((eq0) obj).f37015z0.L.l();
                return;
            case 15:
                ((eu0) obj).invalidate();
                return;
            case 16:
                com.google.android.gms.common.api.internal.u uVar = (com.google.android.gms.common.api.internal.u) obj;
                PhotoViewer photoViewer = (PhotoViewer) uVar.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.v2(uVar.f6507a);
                if (photoViewer.f33564c2 == 1) {
                    long j10 = uVar.f6507a;
                    photoViewer.X7 = j10;
                    if (photoViewer.W7 != j10) {
                        photoViewer.W7 = -1L;
                    }
                }
                uVar.f6509c = null;
                return;
            case 17:
                PhotoViewer photoViewer2 = ((ns0) obj).f39986a;
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
                sn snVar = ((ps0) obj).f40539g1.l4;
                if (snVar != null && (gkVar = snVar.Y) != null) {
                    gkVar.F0();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.ql0 ql0Var = (org.telegram.ui.Components.ql0) ((v70) obj).f42631b;
                PhotoViewer photoViewer3 = (PhotoViewer) ql0Var.f29941c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.j81 j81Var = photoViewer3.F2;
                if (j81Var != null) {
                    j81Var.C();
                }
                ((PhotoViewer) ql0Var.f29941c).I2 = null;
                return;
            case 20:
                PhotoViewer photoViewer4 = ((cs0) obj).f36422a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.j81 j81Var2 = photoViewer4.F2;
                if (j81Var2 != null) {
                    j81Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 21:
                ot0 ot0Var = (ot0) ((v70) obj).f42631b;
                ot0Var.f40266r.f33647l7.unlock();
                PhotoViewer photoViewer5 = ot0Var.f40266r;
                Runnable runnable = photoViewer5.f33680p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f33680p4 = null;
                }
                photoViewer5.A2(true);
                return;
            case 22:
                PhotoViewer photoViewer6 = ((rs0) obj).f41239b;
                Runnable runnable2 = photoViewer6.f33680p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f33680p4 = null;
                    return;
                }
                return;
            case 23:
                ((zt0) obj).f49554x.d(true);
                return;
            case 24:
                ((du0) obj).d = true;
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = ((kw0) obj).f39082c;
                premiumPreviewFragment.showDialog(new x21(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                return;
            case 26:
                ((org.telegram.messenger.hk) obj).run(0);
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
