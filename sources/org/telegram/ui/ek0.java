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
public final class ek0 implements Runnable {
    public final int f36560a;
    public final Object f36561b;

    public ek0(Object obj, int i10) {
        this.f36560a = i10;
        this.f36561b = obj;
    }

    @Override
    public final void run() {
        int i10;
        dp0 dp0Var;
        hk hkVar;
        int i11 = this.f36560a;
        Object obj = this.f36561b;
        switch (i11) {
            case 0:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
            case 1:
                ((PasscodeActivity) ((kd0) obj).f38473n).k0();
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
                ((gm0) obj).f37271a.finishFragment();
                return;
            case 5:
                org.telegram.ui.Components.f5.w0(((km0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 6:
                double currentTimeMillis = System.currentTimeMillis();
                tm0 tm0Var = (tm0) ((e6.r) obj).f8395b;
                double d = currentTimeMillis - tm0Var.G;
                tm0Var.G = currentTimeMillis;
                int i12 = (int) (tm0Var.E - d);
                tm0Var.E = i12;
                if (i12 <= 1000) {
                    tm0Var.f41784r.setVisibility(0);
                    tm0Var.f41783n.setVisibility(8);
                    tm0Var.r();
                    return;
                }
                return;
            case 7:
                sm0 sm0Var = (sm0) obj;
                tm0 tm0Var2 = sm0Var.f41142a;
                int i13 = tm0Var2.f41788y;
                um0 um0Var = tm0Var2.f41785s;
                md0 md0Var = tm0Var2.f41783n;
                if (i13 >= 1000) {
                    int i14 = i13 / 1000;
                    int i15 = i14 / 60;
                    int i16 = i14 - (i15 * 60);
                    int i17 = tm0Var2.M;
                    if (i17 != 4 && i17 != 3) {
                        if (i17 == 2) {
                            md0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i15), Integer.valueOf(i16)));
                        }
                    } else {
                        md0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i15), Integer.valueOf(i16)));
                    }
                    if (um0Var != null) {
                        um0Var.f42015c = 1.0f - (tm0Var2.f41788y / tm0Var2.P);
                        um0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (um0Var != null) {
                    um0Var.f42015c = 1.0f;
                    um0Var.invalidate();
                }
                tm0Var2.s();
                int i18 = tm0Var2.L;
                if (i18 == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(tm0Var2, NotificationCenter.didReceiveCall);
                    tm0Var2.I = false;
                    tm0Var2.r();
                    tm0Var2.t();
                    return;
                } else if (i18 == 2 || i18 == 4) {
                    int i19 = tm0Var2.M;
                    if (i19 != 4 && i19 != 2) {
                        if (i19 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(tm0Var2, NotificationCenter.didReceiveSmsCode);
                            tm0Var2.I = false;
                            tm0Var2.r();
                            tm0Var2.t();
                            return;
                        }
                        return;
                    }
                    if (i19 == 4) {
                        md0Var.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        md0Var.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    tm0Var2.p();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = tm0Var2.f41779a;
                    tL_auth_resendCode.phone_code_hash = tm0Var2.f41780b;
                    ConnectionsManager.getInstance(xm0.e0(tm0Var2.Q)).sendRequest(tL_auth_resendCode, new m(sm0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 8:
                pf.d.r(((pn0) obj).f40198b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 9:
                fo0 fo0Var = ((un0) obj).f42019a;
                fo0Var.t0();
                fo0Var.H0(true, false);
                fo0Var.D0(false);
                return;
            case 10:
                pf.d.r(((yn0) obj).f43434b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                bp0 bp0Var = (bp0) obj;
                dp0 dp0Var2 = bp0Var.f35724c;
                ip0 ip0Var = dp0Var2.E;
                jp0 jp0Var = dp0Var2.f36261p0;
                if (ip0Var != null && dp0Var2.L.size() > 1) {
                    ip0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) dp0Var2.M.get(1);
                    dp0Var2.K = starGift;
                    if (starGift == null) {
                        yh.t3 t3Var = dp0Var2.J;
                        if (t3Var != null) {
                            t3Var.f();
                            dp0Var2.J = null;
                        }
                    } else {
                        yh.t3 t3Var2 = dp0Var2.J;
                        if (t3Var2 == null || t3Var2.f50534b != starGift.f20496id) {
                            i10 = ((org.telegram.ui.ActionBar.n2) jp0Var).currentAccount;
                            yh.t3 t3Var3 = new yh.t3(dp0Var2.K.f20496id, i10, new v3(bp0Var, 16));
                            dp0Var2.J = t3Var3;
                            t3Var3.g(false);
                        }
                    }
                    dp0.a(dp0Var2);
                    if (jp0Var.I.getCurrentPosition() == 1) {
                        dp0Var = jp0Var.f38254n;
                    } else {
                        dp0Var = jp0Var.h;
                    }
                    dp0Var.e();
                    return;
                }
                return;
            case 12:
                kq0 kq0Var = ((bq0) obj).f35729s;
                kq0Var.b0(kq0Var.P.getSearchField());
                return;
            case 13:
                ((cq0) obj).f35976z0.L.l();
                return;
            case 14:
                ((du0) obj).invalidate();
                return;
            case 15:
                com.google.android.gms.common.api.internal.u uVar = (com.google.android.gms.common.api.internal.u) obj;
                PhotoViewer photoViewer = (PhotoViewer) uVar.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.t2(uVar.f6497a);
                if (photoViewer.f33250c2 == 1) {
                    long j10 = uVar.f6497a;
                    photoViewer.X7 = j10;
                    if (photoViewer.W7 != j10) {
                        photoViewer.W7 = -1L;
                    }
                }
                uVar.f6499c = null;
                return;
            case 16:
                PhotoViewer photoViewer2 = ((ms0) obj).f39242a;
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
                sn snVar = ((os0) obj).f39881d1.l4;
                if (snVar != null && (hkVar = snVar.Y) != null) {
                    hkVar.F0();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.ml0 ml0Var = (org.telegram.ui.Components.ml0) ((bc0) obj).f35645b;
                PhotoViewer photoViewer3 = (PhotoViewer) ml0Var.f28549c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.a81 a81Var = photoViewer3.F2;
                if (a81Var != null) {
                    a81Var.C();
                }
                ((PhotoViewer) ml0Var.f28549c).I2 = null;
                return;
            case 19:
                PhotoViewer photoViewer4 = ((bs0) obj).f35737a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.a81 a81Var2 = photoViewer4.F2;
                if (a81Var2 != null) {
                    a81Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 20:
                nt0 nt0Var = (nt0) ((bc0) obj).f35645b;
                nt0Var.f39551r.f33333l7.unlock();
                PhotoViewer photoViewer5 = nt0Var.f39551r;
                Runnable runnable = photoViewer5.f33366p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f33366p4 = null;
                }
                photoViewer5.y2(true);
                return;
            case 21:
                PhotoViewer photoViewer6 = ((qs0) obj).f40493b;
                Runnable runnable2 = photoViewer6.f33366p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f33366p4 = null;
                    return;
                }
                return;
            case 22:
                ((yt0) obj).f49124x.d(true);
                return;
            case 23:
                ((cu0) obj).d = true;
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = ((iw0) obj).f37991c;
                premiumPreviewFragment.showDialog(new v21(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                return;
            case 25:
                ((org.telegram.messenger.fk) obj).run(0);
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
                ky0 ky0Var = (ky0) obj;
                ky0Var.G.getNotificationCenter().onAnimationFinish(ky0Var.F);
                return;
        }
    }
}
