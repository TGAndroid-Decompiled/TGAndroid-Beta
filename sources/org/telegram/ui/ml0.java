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
public final class ml0 implements Runnable {
    public final int f35721a;
    public final Object f35722b;

    public ml0(Object obj, int i10) {
        this.f35721a = i10;
        this.f35722b = obj;
    }

    @Override
    public final void run() {
        int i10;
        qp0 qp0Var;
        lk lkVar;
        int i11 = this.f35721a;
        int i12 = 0;
        Object obj = this.f35722b;
        switch (i11) {
            case 0:
                ((PasscodeActivity) ((ae0) obj).f32056n).h0();
                return;
            case 1:
                PasskeysActivity.X((PasskeysActivity) obj);
                return;
            case 2:
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_help_passportConfig) {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    SharedConfig.setPassportConfig(tL_help_passportConfig.countries_langs.data, tL_help_passportConfig.hash);
                    return;
                }
                SharedConfig.getCountryLangs();
                return;
            case 3:
                ((rm0) obj).f37159a.finishFragment();
                return;
            case 4:
                org.telegram.ui.Components.e5.x0(((vm0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 5:
                double currentTimeMillis = System.currentTimeMillis();
                fn0 fn0Var = (fn0) ((ci.o2) obj).f5247b;
                double d = currentTimeMillis - fn0Var.G;
                fn0Var.G = currentTimeMillis;
                int i13 = (int) (fn0Var.E - d);
                fn0Var.E = i13;
                if (i13 <= 1000) {
                    fn0Var.f33593r.setVisibility(0);
                    fn0Var.f33592n.setVisibility(8);
                    fn0Var.r();
                    return;
                }
                return;
            case 6:
                en0 en0Var = (en0) obj;
                fn0 fn0Var2 = en0Var.f33294a;
                int i14 = fn0Var2.f33597y;
                gn0 gn0Var = fn0Var2.f33594s;
                cn0 cn0Var = fn0Var2.f33592n;
                if (i14 >= 1000) {
                    int i15 = i14 / 1000;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = fn0Var2.M;
                    if (i18 != 4 && i18 != 3) {
                        if (i18 == 2) {
                            cn0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i16), Integer.valueOf(i17)));
                        }
                    } else {
                        cn0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (gn0Var != null) {
                        gn0Var.f33980c = 1.0f - (fn0Var2.f33597y / fn0Var2.P);
                        gn0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (gn0Var != null) {
                    gn0Var.f33980c = 1.0f;
                    gn0Var.invalidate();
                }
                fn0Var2.s();
                int i19 = fn0Var2.L;
                if (i19 == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(fn0Var2, NotificationCenter.didReceiveCall);
                    fn0Var2.I = false;
                    fn0Var2.r();
                    fn0Var2.u();
                    return;
                } else if (i19 == 2 || i19 == 4) {
                    int i20 = fn0Var2.M;
                    if (i20 != 4 && i20 != 2) {
                        if (i20 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(fn0Var2, NotificationCenter.didReceiveSmsCode);
                            fn0Var2.I = false;
                            fn0Var2.r();
                            fn0Var2.u();
                            return;
                        }
                        return;
                    }
                    if (i20 == 4) {
                        cn0Var.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        cn0Var.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    fn0Var2.p();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = fn0Var2.f33588a;
                    tL_auth_resendCode.phone_code_hash = fn0Var2.f33589b;
                    ConnectionsManager.getInstance(jn0.f0(fn0Var2.Q)).sendRequest(tL_auth_resendCode, new m(en0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 7:
                nf.f.s(((bo0) obj).f32399b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 8:
                ro0 ro0Var = ((go0) obj).f33984a;
                ro0Var.t0();
                ro0Var.H0(true, false);
                ro0Var.D0(false);
                return;
            case 9:
                nf.f.s(((ko0) obj).f35127b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 10:
                op0 op0Var = (op0) obj;
                qp0 qp0Var2 = op0Var.f36238c;
                vp0 vp0Var = qp0Var2.E;
                wp0 wp0Var = qp0Var2.f36807p0;
                if (vp0Var != null && qp0Var2.L.size() > 1) {
                    vp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) qp0Var2.M.get(1);
                    qp0Var2.K = starGift;
                    if (starGift == null) {
                        xh.w3 w3Var = qp0Var2.J;
                        if (w3Var != null) {
                            w3Var.f();
                            qp0Var2.J = null;
                        }
                    } else {
                        xh.w3 w3Var2 = qp0Var2.J;
                        if (w3Var2 == null || w3Var2.f46526b != starGift.f18554id) {
                            i10 = ((org.telegram.ui.ActionBar.o2) wp0Var).currentAccount;
                            xh.w3 w3Var3 = new xh.w3(qp0Var2.K.f18554id, i10, new u3(op0Var, 16));
                            qp0Var2.J = w3Var3;
                            w3Var3.g(false);
                        }
                    }
                    qp0.a(qp0Var2);
                    if (wp0Var.I.getCurrentPosition() == 1) {
                        qp0Var = wp0Var.f39403n;
                    } else {
                        qp0Var = wp0Var.h;
                    }
                    qp0Var.e();
                    return;
                }
                return;
            case 11:
                wq0 wq0Var = ((nq0) obj).h;
                wq0Var.b0(wq0Var.P.getSearchField());
                return;
            case 12:
                ((oq0) obj).f36244z0.L.l();
                return;
            case 13:
                ((qu0) obj).invalidate();
                return;
            case 14:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.s2(vVar.f6165a);
                if (photoViewer.f31209c2 == 1) {
                    long j3 = vVar.f6165a;
                    photoViewer.X7 = j3;
                    if (photoViewer.W7 != j3) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.f6167c = null;
                return;
            case 15:
                PhotoViewer photoViewer2 = ((zs0) obj).f40586a;
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
            case 16:
                xn xnVar = ((bt0) obj).Z0.l4;
                if (xnVar != null && (lkVar = xnVar.Y) != null) {
                    lkVar.H0();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.cl0 cl0Var = (org.telegram.ui.Components.cl0) ((ap0) obj).f32120b;
                PhotoViewer photoViewer3 = (PhotoViewer) cl0Var.f23359c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.u71 u71Var = photoViewer3.F2;
                if (u71Var != null) {
                    u71Var.C();
                }
                ((PhotoViewer) cl0Var.f23359c).I2 = null;
                return;
            case 18:
                PhotoViewer photoViewer4 = ((os0) obj).f36249a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.u71 u71Var2 = photoViewer4.F2;
                if (u71Var2 != null) {
                    u71Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 19:
                au0 au0Var = (au0) ((ap0) obj).f32120b;
                au0Var.f32153r.f31291l7.unlock();
                PhotoViewer photoViewer5 = au0Var.f32153r;
                Runnable runnable = photoViewer5.f31324p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f31324p4 = null;
                }
                photoViewer5.x2(true);
                return;
            case 20:
                PhotoViewer photoViewer6 = ((dt0) obj).f33033b;
                Runnable runnable2 = photoViewer6.f31324p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f31324p4 = null;
                    return;
                }
                return;
            case 21:
                ((lu0) obj).f44783s.d(true);
                return;
            case 22:
                ((pu0) obj).d = true;
                return;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((ww0) obj).f39467c;
                premiumPreviewFragment.showDialog(new b41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                return;
            case 24:
                ((org.telegram.messenger.lk) obj).run(0);
                return;
            case 25:
                AndroidUtilities.addToClipboard((String) obj);
                return;
            case 26:
                ((ci.e4) obj).e(true);
                return;
            case 27:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                return;
            case 28:
                zy0 zy0Var = (zy0) obj;
                zy0Var.G.getNotificationCenter().onAnimationFinish(zy0Var.F);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) ((ci.m6) obj).f5173c;
                if (profileActivity.f31622n5 != 1.0f) {
                    iz0 iz0Var = profileActivity.f31617n0;
                    while (iz0Var.D0.k(i12) != iz0Var.getRealCount() - 1) {
                        i12++;
                    }
                    iz0Var.x(i12, true);
                    return;
                }
                return;
        }
    }
}
