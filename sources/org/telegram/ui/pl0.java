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
public final class pl0 implements Runnable {
    public final int f36603a;
    public final Object f36604b;

    public pl0(Object obj, int i10) {
        this.f36603a = i10;
        this.f36604b = obj;
    }

    @Override
    public final void run() {
        int i10;
        up0 up0Var;
        mk mkVar;
        int i11 = this.f36603a;
        int i12 = 0;
        Object obj = this.f36604b;
        switch (i11) {
            case 0:
                ((PasscodeActivity) ((de0) obj).f33000n).h0();
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
                ((wm0) obj).f39265a.finishFragment();
                return;
            case 4:
                org.telegram.ui.Components.c5.x0(((an0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 5:
                double currentTimeMillis = System.currentTimeMillis();
                kn0 kn0Var = (kn0) ((ci.p2) obj).f5298b;
                double d = currentTimeMillis - kn0Var.G;
                kn0Var.G = currentTimeMillis;
                int i13 = (int) (kn0Var.E - d);
                kn0Var.E = i13;
                if (i13 <= 1000) {
                    kn0Var.f35201r.setVisibility(0);
                    kn0Var.f35200n.setVisibility(8);
                    kn0Var.r();
                    return;
                }
                return;
            case 6:
                jn0 jn0Var = (jn0) obj;
                kn0 kn0Var2 = jn0Var.f34942a;
                int i14 = kn0Var2.f35205y;
                ln0 ln0Var = kn0Var2.f35202s;
                hn0 hn0Var = kn0Var2.f35200n;
                if (i14 >= 1000) {
                    int i15 = i14 / 1000;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = kn0Var2.M;
                    if (i18 != 4 && i18 != 3) {
                        if (i18 == 2) {
                            hn0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i16), Integer.valueOf(i17)));
                        }
                    } else {
                        hn0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (ln0Var != null) {
                        ln0Var.f35538c = 1.0f - (kn0Var2.f35205y / kn0Var2.P);
                        ln0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (ln0Var != null) {
                    ln0Var.f35538c = 1.0f;
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
                        hn0Var.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        hn0Var.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    kn0Var2.p();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = kn0Var2.f35196a;
                    tL_auth_resendCode.phone_code_hash = kn0Var2.f35197b;
                    ConnectionsManager.getInstance(on0.f0(kn0Var2.Q)).sendRequest(tL_auth_resendCode, new m(jn0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 7:
                nf.f.s(((go0) obj).f33969b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 8:
                wo0 wo0Var = ((lo0) obj).f35541a;
                wo0Var.t0();
                wo0Var.H0(true, false);
                wo0Var.D0(false);
                return;
            case 9:
                nf.f.s(((po0) obj).f36627b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 10:
                sp0 sp0Var = (sp0) obj;
                up0 up0Var2 = sp0Var.f37425c;
                zp0 zp0Var = up0Var2.E;
                aq0 aq0Var = up0Var2.f38083p0;
                if (zp0Var != null && up0Var2.L.size() > 1) {
                    zp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) up0Var2.M.get(1);
                    up0Var2.K = starGift;
                    if (starGift == null) {
                        xh.u3 u3Var = up0Var2.J;
                        if (u3Var != null) {
                            u3Var.f();
                            up0Var2.J = null;
                        }
                    } else {
                        xh.u3 u3Var2 = up0Var2.J;
                        if (u3Var2 == null || u3Var2.f46144b != starGift.f18338id) {
                            i10 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
                            xh.u3 u3Var3 = new xh.u3(up0Var2.K.f18338id, i10, new s3(sp0Var, 13));
                            up0Var2.J = u3Var3;
                            u3Var3.g(false);
                        }
                    }
                    up0.a(up0Var2);
                    if (aq0Var.I.getCurrentPosition() == 1) {
                        up0Var = aq0Var.f31900n;
                    } else {
                        up0Var = aq0Var.h;
                    }
                    up0Var.e();
                    return;
                }
                return;
            case 11:
                ar0 ar0Var = ((rq0) obj).h;
                ar0Var.b0(ar0Var.P.getSearchField());
                return;
            case 12:
                ((sq0) obj).f37431z0.L.l();
                return;
            case 13:
                ((vu0) obj).invalidate();
                return;
            case 14:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.t2(vVar.f6176a);
                if (photoViewer.f30920c2 == 1) {
                    long j3 = vVar.f6176a;
                    photoViewer.W7 = j3;
                    if (photoViewer.V7 != j3) {
                        photoViewer.V7 = -1L;
                    }
                }
                vVar.f6178c = null;
                return;
            case 15:
                PhotoViewer photoViewer2 = ((et0) obj).f33401a;
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
                bo boVar = ((gt0) obj).f34019d1.l4;
                if (boVar != null && (mkVar = boVar.Y) != null) {
                    mkVar.H0();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.pk0 pk0Var = (org.telegram.ui.Components.pk0) ((cr0) obj).f32848b;
                PhotoViewer photoViewer3 = (PhotoViewer) pk0Var.f27075c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.g71 g71Var = photoViewer3.F2;
                if (g71Var != null) {
                    g71Var.C();
                }
                ((PhotoViewer) pk0Var.f27075c).I2 = null;
                return;
            case 18:
                PhotoViewer photoViewer4 = ((ts0) obj).f37780a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.g71 g71Var2 = photoViewer4.F2;
                if (g71Var2 != null) {
                    g71Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 19:
                fu0 fu0Var = (fu0) ((cr0) obj).f32848b;
                fu0Var.f33672r.f31002l7.unlock();
                PhotoViewer photoViewer5 = fu0Var.f33672r;
                Runnable runnable = photoViewer5.f31035p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f31035p4 = null;
                }
                photoViewer5.y2(true);
                return;
            case 20:
                PhotoViewer photoViewer6 = ((it0) obj).f34734b;
                Runnable runnable2 = photoViewer6.f31035p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f31035p4 = null;
                    return;
                }
                return;
            case 21:
                ((qu0) obj).f44457s.d(true);
                return;
            case 22:
                ((uu0) obj).d = true;
                return;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((cx0) obj).f32874c;
                premiumPreviewFragment.showDialog(new h41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                return;
            case 24:
                ((org.telegram.messenger.nk) obj).run(0);
                return;
            case 25:
                AndroidUtilities.addToClipboard((String) obj);
                return;
            case 26:
                ((ci.f4) obj).e(true);
                return;
            case 27:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                return;
            case 28:
                gz0 gz0Var = (gz0) obj;
                gz0Var.G.getNotificationCenter().onAnimationFinish(gz0Var.F);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) ((ci.n6) obj).f5070c;
                if (profileActivity.f31334n5 != 1.0f) {
                    pz0 pz0Var = profileActivity.f31329n0;
                    while (pz0Var.D0.k(i12) != pz0Var.getRealCount() - 1) {
                        i12++;
                    }
                    pz0Var.x(i12, true);
                    return;
                }
                return;
        }
    }
}
