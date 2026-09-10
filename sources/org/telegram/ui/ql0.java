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
public final class ql0 implements Runnable {
    public final int f36086a;
    public final Object f36087b;

    public ql0(Object obj, int i10) {
        this.f36086a = i10;
        this.f36087b = obj;
    }

    @Override
    public final void run() {
        int i10;
        up0 up0Var;
        ok okVar;
        int i11 = this.f36086a;
        int i12 = 0;
        Object obj = this.f36087b;
        switch (i11) {
            case 0:
                ((PasscodeActivity) ((de0) obj).f31891n).h0();
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
                ((wm0) obj).f38247a.finishFragment();
                return;
            case 4:
                org.telegram.ui.Components.d5.x0(((an0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 5:
                double currentTimeMillis = System.currentTimeMillis();
                kn0 kn0Var = (kn0) ((bi.b3) obj).f2355b;
                double d = currentTimeMillis - kn0Var.G;
                kn0Var.G = currentTimeMillis;
                int i13 = (int) (kn0Var.E - d);
                kn0Var.E = i13;
                if (i13 <= 1000) {
                    kn0Var.f34425r.setVisibility(0);
                    kn0Var.f34424n.setVisibility(8);
                    kn0Var.r();
                    return;
                }
                return;
            case 6:
                jn0 jn0Var = (jn0) obj;
                kn0 kn0Var2 = jn0Var.f34141a;
                int i14 = kn0Var2.f34429y;
                ln0 ln0Var = kn0Var2.f34426s;
                di.h hVar = kn0Var2.f34424n;
                if (i14 >= 1000) {
                    int i15 = i14 / 1000;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = kn0Var2.M;
                    if (i18 != 4 && i18 != 3) {
                        if (i18 == 2) {
                            hVar.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i16), Integer.valueOf(i17)));
                        }
                    } else {
                        hVar.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (ln0Var != null) {
                        ln0Var.f34743c = 1.0f - (kn0Var2.f34429y / kn0Var2.P);
                        ln0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (ln0Var != null) {
                    ln0Var.f34743c = 1.0f;
                    ln0Var.invalidate();
                }
                kn0Var2.s();
                int i19 = kn0Var2.L;
                if (i19 == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(kn0Var2, NotificationCenter.didReceiveCall);
                    kn0Var2.I = false;
                    kn0Var2.r();
                    kn0Var2.u();
                    return;
                } else if (i19 == 2 || i19 == 4) {
                    int i20 = kn0Var2.M;
                    if (i20 != 4 && i20 != 2) {
                        if (i20 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(kn0Var2, NotificationCenter.didReceiveSmsCode);
                            kn0Var2.I = false;
                            kn0Var2.r();
                            kn0Var2.u();
                            return;
                        }
                        return;
                    }
                    if (i20 == 4) {
                        hVar.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        hVar.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    kn0Var2.p();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = kn0Var2.f34420a;
                    tL_auth_resendCode.phone_code_hash = kn0Var2.f34421b;
                    ConnectionsManager.getInstance(on0.f0(kn0Var2.Q)).sendRequest(tL_auth_resendCode, new m(jn0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 7:
                nf.f.s(((go0) obj).f33146b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 8:
                wo0 wo0Var = ((lo0) obj).f34747a;
                wo0Var.t0();
                wo0Var.H0(true, false);
                wo0Var.D0(false);
                return;
            case 9:
                nf.f.s(((po0) obj).f35888b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 10:
                sp0 sp0Var = (sp0) obj;
                up0 up0Var2 = sp0Var.f36740c;
                aq0 aq0Var = up0Var2.E;
                bq0 bq0Var = up0Var2.f37324p0;
                if (aq0Var != null && up0Var2.L.size() > 1) {
                    aq0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) up0Var2.M.get(1);
                    up0Var2.K = starGift;
                    if (starGift == null) {
                        wh.u3 u3Var = up0Var2.J;
                        if (u3Var != null) {
                            u3Var.f();
                            up0Var2.J = null;
                        }
                    } else {
                        wh.u3 u3Var2 = up0Var2.J;
                        if (u3Var2 == null || u3Var2.f44369b != starGift.f17425id) {
                            i10 = ((org.telegram.ui.ActionBar.p2) bq0Var).currentAccount;
                            wh.u3 u3Var3 = new wh.u3(up0Var2.K.f17425id, i10, new u3(sp0Var, 13));
                            up0Var2.J = u3Var3;
                            u3Var3.g(false);
                        }
                    }
                    up0.a(up0Var2);
                    if (bq0Var.I.getCurrentPosition() == 1) {
                        up0Var = bq0Var.f31352n;
                    } else {
                        up0Var = bq0Var.h;
                    }
                    up0Var.e();
                    return;
                }
                return;
            case 11:
                br0 br0Var = ((sq0) obj).h;
                br0Var.b0(br0Var.P.getSearchField());
                return;
            case 12:
                ((tq0) obj).f36993z0.L.l();
                return;
            case 13:
                ((wu0) obj).invalidate();
                return;
            case 14:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.t2(vVar.f4955a);
                if (photoViewer.f30033c2 == 1) {
                    long j3 = vVar.f4955a;
                    photoViewer.W7 = j3;
                    if (photoViewer.V7 != j3) {
                        photoViewer.V7 = -1L;
                    }
                }
                vVar.f4957c = null;
                return;
            case 15:
                PhotoViewer photoViewer2 = ((dt0) obj).f31972a;
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
                eo eoVar = ((ft0) obj).f32914d1.l4;
                if (eoVar != null && (okVar = eoVar.Y) != null) {
                    okVar.H0();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.vv0 vv0Var = (org.telegram.ui.Components.vv0) ((org.telegram.ui.Components.voip.v2) obj).f28501b;
                PhotoViewer photoViewer3 = (PhotoViewer) vv0Var.f28603c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.t71 t71Var = photoViewer3.F2;
                if (t71Var != null) {
                    t71Var.C();
                }
                ((PhotoViewer) vv0Var.f28603c).I2 = null;
                return;
            case 18:
                PhotoViewer photoViewer4 = ((ss0) obj).f36749a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.t71 t71Var2 = photoViewer4.F2;
                if (t71Var2 != null) {
                    t71Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 19:
                eu0 eu0Var = (eu0) ((org.telegram.ui.Components.voip.v2) obj).f28501b;
                eu0Var.f32612r.f30115l7.unlock();
                PhotoViewer photoViewer5 = eu0Var.f32612r;
                Runnable runnable = photoViewer5.f30148p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f30148p4 = null;
                }
                photoViewer5.y2(true);
                return;
            case 20:
                PhotoViewer photoViewer6 = ((ht0) obj).f33459b;
                Runnable runnable2 = photoViewer6.f30148p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f30148p4 = null;
                    return;
                }
                return;
            case 21:
                ((qu0) obj).f42825s.d(true);
                return;
            case 22:
                ((vu0) obj).d = true;
                return;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((ex0) obj).f32642c;
                premiumPreviewFragment.showDialog(new n41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                return;
            case 24:
                ((org.telegram.messenger.vk) obj).run(0);
                return;
            case 25:
                AndroidUtilities.addToClipboard((String) obj);
                return;
            case 26:
                ((bi.x4) obj).e(true);
                return;
            case 27:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                return;
            case 28:
                kz0 kz0Var = (kz0) obj;
                kz0Var.G.getNotificationCenter().onAnimationFinish(kz0Var.F);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) ((bi.n7) obj).f3240c;
                if (profileActivity.f30446n5 != 1.0f) {
                    tz0 tz0Var = profileActivity.f30441n0;
                    while (tz0Var.D0.k(i12) != tz0Var.getRealCount() - 1) {
                        i12++;
                    }
                    tz0Var.x(i12, true);
                    return;
                }
                return;
        }
    }
}
