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
public final class ck0 implements Runnable {
    public final int f36005a;
    public final Object f36006b;

    public ck0(Object obj, int i10) {
        this.f36005a = i10;
        this.f36006b = obj;
    }

    @Override
    public final void run() {
        int i10;
        cp0 cp0Var;
        fk fkVar;
        int i11 = this.f36005a;
        Object obj = this.f36006b;
        switch (i11) {
            case 0:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
            case 1:
                ((PasscodeActivity) ((id0) obj).f37929n).k0();
                return;
            case 2:
                PasskeysActivity.X((PasskeysActivity) obj);
                return;
            case 3:
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_help_passportConfig) {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    SharedConfig.setPassportConfig(tL_help_passportConfig.countries_langs.data, tL_help_passportConfig.hash);
                    return;
                }
                SharedConfig.getCountryLangs();
                return;
            case 4:
                ((em0) obj).f36690a.finishFragment();
                return;
            case 5:
                org.telegram.ui.Components.f5.w0(((im0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 6:
                double currentTimeMillis = System.currentTimeMillis();
                rm0 rm0Var = (rm0) ((e6.r) obj).f8393b;
                double d = currentTimeMillis - rm0Var.G;
                rm0Var.G = currentTimeMillis;
                int i12 = (int) (rm0Var.E - d);
                rm0Var.E = i12;
                if (i12 <= 1000) {
                    rm0Var.f41256r.setVisibility(0);
                    rm0Var.f41255n.setVisibility(8);
                    rm0Var.r();
                    return;
                }
                return;
            case 7:
                qm0 qm0Var = (qm0) obj;
                rm0 rm0Var2 = qm0Var.f40613a;
                int i13 = rm0Var2.f41260y;
                sm0 sm0Var = rm0Var2.f41257s;
                kd0 kd0Var = rm0Var2.f41255n;
                if (i13 >= 1000) {
                    int i14 = i13 / 1000;
                    int i15 = i14 / 60;
                    int i16 = i14 - (i15 * 60);
                    int i17 = rm0Var2.M;
                    if (i17 != 4 && i17 != 3) {
                        if (i17 == 2) {
                            kd0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i15), Integer.valueOf(i16)));
                        }
                    } else {
                        kd0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i15), Integer.valueOf(i16)));
                    }
                    if (sm0Var != null) {
                        sm0Var.f41498c = 1.0f - (rm0Var2.f41260y / rm0Var2.P);
                        sm0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (sm0Var != null) {
                    sm0Var.f41498c = 1.0f;
                    sm0Var.invalidate();
                }
                rm0Var2.s();
                int i18 = rm0Var2.L;
                if (i18 == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(rm0Var2, NotificationCenter.didReceiveCall);
                    rm0Var2.I = false;
                    rm0Var2.r();
                    rm0Var2.t();
                    return;
                } else if (i18 == 2 || i18 == 4) {
                    int i19 = rm0Var2.M;
                    if (i19 != 4 && i19 != 2) {
                        if (i19 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(rm0Var2, NotificationCenter.didReceiveSmsCode);
                            rm0Var2.I = false;
                            rm0Var2.r();
                            rm0Var2.t();
                            return;
                        }
                        return;
                    }
                    if (i19 == 4) {
                        kd0Var.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        kd0Var.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    rm0Var2.p();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = rm0Var2.f41251a;
                    tL_auth_resendCode.phone_code_hash = rm0Var2.f41252b;
                    ConnectionsManager.getInstance(vm0.e0(rm0Var2.Q)).sendRequest(tL_auth_resendCode, new m(qm0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 8:
                pf.d.r(((on0) obj).f39943b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 9:
                eo0 eo0Var = ((tn0) obj).f41714a;
                eo0Var.t0();
                eo0Var.H0(true, false);
                eo0Var.D0(false);
                return;
            case 10:
                pf.d.r(((xn0) obj).f43256b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                ap0 ap0Var = (ap0) obj;
                cp0 cp0Var2 = ap0Var.f35407c;
                hp0 hp0Var = cp0Var2.E;
                ip0 ip0Var = cp0Var2.f36041p0;
                if (hp0Var != null && cp0Var2.L.size() > 1) {
                    hp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) cp0Var2.M.get(1);
                    cp0Var2.K = starGift;
                    if (starGift == null) {
                        yh.s3 s3Var = cp0Var2.J;
                        if (s3Var != null) {
                            s3Var.f();
                            cp0Var2.J = null;
                        }
                    } else {
                        yh.s3 s3Var2 = cp0Var2.J;
                        if (s3Var2 == null || s3Var2.f50508b != starGift.f20503id) {
                            i10 = ((org.telegram.ui.ActionBar.n2) ip0Var).currentAccount;
                            yh.s3 s3Var3 = new yh.s3(cp0Var2.K.f20503id, i10, new v3(ap0Var, 16));
                            cp0Var2.J = s3Var3;
                            s3Var3.g(false);
                        }
                    }
                    cp0.a(cp0Var2);
                    if (ip0Var.I.getCurrentPosition() == 1) {
                        cp0Var = ip0Var.f38098n;
                    } else {
                        cp0Var = ip0Var.h;
                    }
                    cp0Var.e();
                    return;
                }
                return;
            case 12:
                jq0 jq0Var = ((aq0) obj).f35410s;
                jq0Var.b0(jq0Var.P.getSearchField());
                return;
            case 13:
                ((bq0) obj).f35728z0.L.l();
                return;
            case 14:
                ((bu0) obj).invalidate();
                return;
            case 15:
                com.google.android.gms.common.api.internal.u uVar = (com.google.android.gms.common.api.internal.u) obj;
                PhotoViewer photoViewer = (PhotoViewer) uVar.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.v2(uVar.f6495a);
                if (photoViewer.f33266c2 == 1) {
                    long j10 = uVar.f6495a;
                    photoViewer.X7 = j10;
                    if (photoViewer.W7 != j10) {
                        photoViewer.W7 = -1L;
                    }
                }
                uVar.f6497c = null;
                return;
            case 16:
                PhotoViewer photoViewer2 = ((ks0) obj).f38666a;
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
            case 17:
                qn qnVar = ((ms0) obj).f39349e1.l4;
                if (qnVar != null && (fkVar = qnVar.Y) != null) {
                    fkVar.F0();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.nl0 nl0Var = (org.telegram.ui.Components.nl0) ((zb0) obj).f43714b;
                PhotoViewer photoViewer3 = (PhotoViewer) nl0Var.f28846c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.c81 c81Var = photoViewer3.F2;
                if (c81Var != null) {
                    c81Var.C();
                }
                ((PhotoViewer) nl0Var.f28846c).I2 = null;
                return;
            case 19:
                PhotoViewer photoViewer4 = ((zr0) obj).f43801a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.c81 c81Var2 = photoViewer4.F2;
                if (c81Var2 != null) {
                    c81Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 20:
                lt0 lt0Var = (lt0) ((zb0) obj).f43714b;
                lt0Var.f39022r.f33349l7.unlock();
                PhotoViewer photoViewer5 = lt0Var.f39022r;
                Runnable runnable = photoViewer5.f33382p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f33382p4 = null;
                }
                photoViewer5.A2(true);
                return;
            case 21:
                PhotoViewer photoViewer6 = ((os0) obj).f39976b;
                Runnable runnable2 = photoViewer6.f33382p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f33382p4 = null;
                    return;
                }
                return;
            case 22:
                ((wt0) obj).f49111x.d(true);
                return;
            case 23:
                ((au0) obj).d = true;
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = ((gw0) obj).f37432c;
                premiumPreviewFragment.showDialog(new t21(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                return;
            case 25:
                ((org.telegram.messenger.ik) obj).run(0);
                return;
            case 26:
                AndroidUtilities.addToClipboard((String) obj);
                return;
            case 27:
                ((ei.x3) obj).e(true);
                return;
            case 28:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                return;
            default:
                iy0 iy0Var = (iy0) obj;
                iy0Var.G.getNotificationCenter().onAnimationFinish(iy0Var.F);
                return;
        }
    }
}
