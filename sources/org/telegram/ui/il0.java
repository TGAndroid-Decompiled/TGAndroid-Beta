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
public final class il0 implements Runnable {
    public final int f34635a;
    public final Object f34636b;

    public il0(Object obj, int i10) {
        this.f34635a = i10;
        this.f34636b = obj;
    }

    @Override
    public final void run() {
        int i10;
        mp0 mp0Var;
        jk jkVar;
        int i11 = this.f34635a;
        int i12 = 0;
        Object obj = this.f34636b;
        switch (i11) {
            case 0:
                ((PasscodeActivity) ((xd0) obj).f40002n).h0();
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
                ((nm0) obj).f36041a.finishFragment();
                return;
            case 4:
                org.telegram.ui.Components.e5.x0(((rm0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 5:
                double currentTimeMillis = System.currentTimeMillis();
                bn0 bn0Var = (bn0) ((ci.o2) obj).f5244b;
                double d = currentTimeMillis - bn0Var.G;
                bn0Var.G = currentTimeMillis;
                int i13 = (int) (bn0Var.E - d);
                bn0Var.E = i13;
                if (i13 <= 1000) {
                    bn0Var.f32534r.setVisibility(0);
                    bn0Var.f32533n.setVisibility(8);
                    bn0Var.r();
                    return;
                }
                return;
            case 6:
                an0 an0Var = (an0) obj;
                bn0 bn0Var2 = an0Var.f32275a;
                int i14 = bn0Var2.f32538y;
                cn0 cn0Var = bn0Var2.f32535s;
                ym0 ym0Var = bn0Var2.f32533n;
                if (i14 >= 1000) {
                    int i15 = i14 / 1000;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = bn0Var2.M;
                    if (i18 != 4 && i18 != 3) {
                        if (i18 == 2) {
                            ym0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i16), Integer.valueOf(i17)));
                        }
                    } else {
                        ym0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (cn0Var != null) {
                        cn0Var.f32839c = 1.0f - (bn0Var2.f32538y / bn0Var2.P);
                        cn0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (cn0Var != null) {
                    cn0Var.f32839c = 1.0f;
                    cn0Var.invalidate();
                }
                bn0Var2.s();
                int i19 = bn0Var2.L;
                if (i19 == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(bn0Var2, NotificationCenter.didReceiveCall);
                    bn0Var2.I = false;
                    bn0Var2.r();
                    bn0Var2.u();
                    return;
                } else if (i19 == 2 || i19 == 4) {
                    int i20 = bn0Var2.M;
                    if (i20 != 4 && i20 != 2) {
                        if (i20 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(bn0Var2, NotificationCenter.didReceiveSmsCode);
                            bn0Var2.I = false;
                            bn0Var2.r();
                            bn0Var2.u();
                            return;
                        }
                        return;
                    }
                    if (i20 == 4) {
                        ym0Var.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        ym0Var.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    bn0Var2.p();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = bn0Var2.f32529a;
                    tL_auth_resendCode.phone_code_hash = bn0Var2.f32530b;
                    ConnectionsManager.getInstance(fn0.f0(bn0Var2.Q)).sendRequest(tL_auth_resendCode, new m(an0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 7:
                nf.f.s(((xn0) obj).f40052b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 8:
                no0 no0Var = ((co0) obj).f32843a;
                no0Var.t0();
                no0Var.H0(true, false);
                no0Var.D0(false);
                return;
            case 9:
                nf.f.s(((go0) obj).f34123b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 10:
                kp0 kp0Var = (kp0) obj;
                mp0 mp0Var2 = kp0Var.f35210c;
                rp0 rp0Var = mp0Var2.E;
                sp0 sp0Var = mp0Var2.f35751p0;
                if (rp0Var != null && mp0Var2.L.size() > 1) {
                    rp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) mp0Var2.M.get(1);
                    mp0Var2.K = starGift;
                    if (starGift == null) {
                        xh.v3 v3Var = mp0Var2.J;
                        if (v3Var != null) {
                            v3Var.f();
                            mp0Var2.J = null;
                        }
                    } else {
                        xh.v3 v3Var2 = mp0Var2.J;
                        if (v3Var2 == null || v3Var2.f46559b != starGift.f18577id) {
                            i10 = ((org.telegram.ui.ActionBar.m2) sp0Var).currentAccount;
                            xh.v3 v3Var3 = new xh.v3(mp0Var2.K.f18577id, i10, new t3(kp0Var, 16));
                            mp0Var2.J = v3Var3;
                            v3Var3.g(false);
                        }
                    }
                    mp0.a(mp0Var2);
                    if (sp0Var.I.getCurrentPosition() == 1) {
                        mp0Var = sp0Var.f37950n;
                    } else {
                        mp0Var = sp0Var.h;
                    }
                    mp0Var.e();
                    return;
                }
                return;
            case 11:
                tq0 tq0Var = ((kq0) obj).h;
                tq0Var.b0(tq0Var.P.getSearchField());
                return;
            case 12:
                ((lq0) obj).f35493z0.L.l();
                return;
            case 13:
                ((nu0) obj).invalidate();
                return;
            case 14:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.s2(vVar.f6176a);
                if (photoViewer.f31281c2 == 1) {
                    long j3 = vVar.f6176a;
                    photoViewer.X7 = j3;
                    if (photoViewer.W7 != j3) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.f6178c = null;
                return;
            case 15:
                PhotoViewer photoViewer2 = ((ws0) obj).f39847a;
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
                wn wnVar = ((ys0) obj).f40355d1.l4;
                if (wnVar != null && (jkVar = wnVar.Y) != null) {
                    jkVar.H0();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.dl0 dl0Var = (org.telegram.ui.Components.dl0) ((wo0) obj).f39829b;
                PhotoViewer photoViewer3 = (PhotoViewer) dl0Var.f23677c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.v71 v71Var = photoViewer3.F2;
                if (v71Var != null) {
                    v71Var.C();
                }
                ((PhotoViewer) dl0Var.f23677c).I2 = null;
                return;
            case 18:
                PhotoViewer photoViewer4 = ((ls0) obj).f35499a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.v71 v71Var2 = photoViewer4.F2;
                if (v71Var2 != null) {
                    v71Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 19:
                xt0 xt0Var = (xt0) ((wo0) obj).f39829b;
                xt0Var.f40092r.f31363l7.unlock();
                PhotoViewer photoViewer5 = xt0Var.f40092r;
                Runnable runnable = photoViewer5.f31396p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f31396p4 = null;
                }
                photoViewer5.x2(true);
                return;
            case 20:
                PhotoViewer photoViewer6 = ((at0) obj).f32308b;
                Runnable runnable2 = photoViewer6.f31396p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f31396p4 = null;
                    return;
                }
                return;
            case 21:
                ((iu0) obj).f44845s.d(true);
                return;
            case 22:
                ((mu0) obj).d = true;
                return;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((tw0) obj).f38338c;
                premiumPreviewFragment.showDialog(new z31(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
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
                xy0 xy0Var = (xy0) obj;
                xy0Var.G.getNotificationCenter().onAnimationFinish(xy0Var.F);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) ((ci.m6) obj).f5179c;
                if (profileActivity.f31694n5 != 1.0f) {
                    gz0 gz0Var = profileActivity.f31689n0;
                    while (gz0Var.D0.k(i12) != gz0Var.getRealCount() - 1) {
                        i12++;
                    }
                    gz0Var.x(i12, true);
                    return;
                }
                return;
        }
    }
}
