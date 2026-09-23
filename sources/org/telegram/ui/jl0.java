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
public final class jl0 implements Runnable {
    public final int f34473a;
    public final Object f34474b;

    public jl0(Object obj, int i10) {
        this.f34473a = i10;
        this.f34474b = obj;
    }

    @Override
    public final void run() {
        int i10;
        op0 op0Var;
        jk jkVar;
        int i11 = this.f34473a;
        int i12 = 0;
        Object obj = this.f34474b;
        switch (i11) {
            case 0:
                ((PasscodeActivity) ((yd0) obj).f39796n).h0();
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
                ((qm0) obj).f36476a.finishFragment();
                return;
            case 4:
                org.telegram.ui.Components.e5.x0(((um0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 5:
                double currentTimeMillis = System.currentTimeMillis();
                en0 en0Var = (en0) ((ci.o2) obj).f5237b;
                double d = currentTimeMillis - en0Var.G;
                en0Var.G = currentTimeMillis;
                int i13 = (int) (en0Var.E - d);
                en0Var.E = i13;
                if (i13 <= 1000) {
                    en0Var.f32985r.setVisibility(0);
                    en0Var.f32984n.setVisibility(8);
                    en0Var.r();
                    return;
                }
                return;
            case 6:
                dn0 dn0Var = (dn0) obj;
                en0 en0Var2 = dn0Var.f32688a;
                int i14 = en0Var2.f32989y;
                fn0 fn0Var = en0Var2.f32986s;
                bn0 bn0Var = en0Var2.f32984n;
                if (i14 >= 1000) {
                    int i15 = i14 / 1000;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = en0Var2.M;
                    if (i18 != 4 && i18 != 3) {
                        if (i18 == 2) {
                            bn0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i16), Integer.valueOf(i17)));
                        }
                    } else {
                        bn0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (fn0Var != null) {
                        fn0Var.f33348c = 1.0f - (en0Var2.f32989y / en0Var2.P);
                        fn0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (fn0Var != null) {
                    fn0Var.f33348c = 1.0f;
                    fn0Var.invalidate();
                }
                en0Var2.s();
                int i19 = en0Var2.L;
                if (i19 == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(en0Var2, NotificationCenter.didReceiveCall);
                    en0Var2.I = false;
                    en0Var2.r();
                    en0Var2.u();
                    return;
                } else if (i19 == 2 || i19 == 4) {
                    int i20 = en0Var2.M;
                    if (i20 != 4 && i20 != 2) {
                        if (i20 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(en0Var2, NotificationCenter.didReceiveSmsCode);
                            en0Var2.I = false;
                            en0Var2.r();
                            en0Var2.u();
                            return;
                        }
                        return;
                    }
                    if (i20 == 4) {
                        bn0Var.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        bn0Var.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    en0Var2.p();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = en0Var2.f32980a;
                    tL_auth_resendCode.phone_code_hash = en0Var2.f32981b;
                    ConnectionsManager.getInstance(in0.f0(en0Var2.Q)).sendRequest(tL_auth_resendCode, new m(dn0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 7:
                nf.f.s(((ao0) obj).f31845b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 8:
                qo0 qo0Var = ((fo0) obj).f33352a;
                qo0Var.t0();
                qo0Var.H0(true, false);
                qo0Var.D0(false);
                return;
            case 9:
                nf.f.s(((jo0) obj).f34494b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 10:
                mp0 mp0Var = (mp0) obj;
                op0 op0Var2 = mp0Var.f35372c;
                tp0 tp0Var = op0Var2.E;
                up0 up0Var = op0Var2.f35938p0;
                if (tp0Var != null && op0Var2.L.size() > 1) {
                    tp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) op0Var2.M.get(1);
                    op0Var2.K = starGift;
                    if (starGift == null) {
                        xh.v3 v3Var = op0Var2.J;
                        if (v3Var != null) {
                            v3Var.f();
                            op0Var2.J = null;
                        }
                    } else {
                        xh.v3 v3Var2 = op0Var2.J;
                        if (v3Var2 == null || v3Var2.f46123b != starGift.f18308id) {
                            i10 = ((org.telegram.ui.ActionBar.n2) up0Var).currentAccount;
                            xh.v3 v3Var3 = new xh.v3(op0Var2.K.f18308id, i10, new t3(mp0Var, 16));
                            op0Var2.J = v3Var3;
                            v3Var3.g(false);
                        }
                    }
                    op0.a(op0Var2);
                    if (up0Var.I.getCurrentPosition() == 1) {
                        op0Var = up0Var.f38158n;
                    } else {
                        op0Var = up0Var.h;
                    }
                    op0Var.e();
                    return;
                }
                return;
            case 11:
                uq0 uq0Var = ((lq0) obj).h;
                uq0Var.b0(uq0Var.P.getSearchField());
                return;
            case 12:
                ((mq0) obj).f35378z0.L.l();
                return;
            case 13:
                ((ou0) obj).invalidate();
                return;
            case 14:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.s2(vVar.f6164a);
                if (photoViewer.f30892c2 == 1) {
                    long j3 = vVar.f6164a;
                    photoViewer.X7 = j3;
                    if (photoViewer.W7 != j3) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.f6166c = null;
                return;
            case 15:
                PhotoViewer photoViewer2 = ((xs0) obj).f39654a;
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
                xn xnVar = ((zs0) obj).f40240d1.l4;
                if (xnVar != null && (jkVar = xnVar.Y) != null) {
                    jkVar.I0();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.qk0 qk0Var = (org.telegram.ui.Components.qk0) ((wq0) obj).f39075b;
                PhotoViewer photoViewer3 = (PhotoViewer) qk0Var.f27380c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.f71 f71Var = photoViewer3.F2;
                if (f71Var != null) {
                    f71Var.C();
                }
                ((PhotoViewer) qk0Var.f27380c).I2 = null;
                return;
            case 18:
                PhotoViewer photoViewer4 = ((ms0) obj).f35384a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.f71 f71Var2 = photoViewer4.F2;
                if (f71Var2 != null) {
                    f71Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 19:
                yt0 yt0Var = (yt0) ((wq0) obj).f39075b;
                yt0Var.f39894r.f30974l7.unlock();
                PhotoViewer photoViewer5 = yt0Var.f39894r;
                Runnable runnable = photoViewer5.f31007p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f31007p4 = null;
                }
                photoViewer5.x2(true);
                return;
            case 20:
                PhotoViewer photoViewer6 = ((bt0) obj).f32177b;
                Runnable runnable2 = photoViewer6.f31007p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f31007p4 = null;
                    return;
                }
                return;
            case 21:
                ((ju0) obj).f44407s.d(true);
                return;
            case 22:
                ((nu0) obj).d = true;
                return;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((vw0) obj).f38487c;
                premiumPreviewFragment.showDialog(new a41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                return;
            case 24:
                ((org.telegram.messenger.mk) obj).run(0);
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
                ProfileActivity profileActivity = (ProfileActivity) ((ci.m6) obj).f5172c;
                if (profileActivity.f31305n5 != 1.0f) {
                    iz0 iz0Var = profileActivity.f31300n0;
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
