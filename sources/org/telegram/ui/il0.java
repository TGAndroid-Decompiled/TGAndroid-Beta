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
    public final int f34539a;
    public final Object f34540b;

    public il0(Object obj, int i10) {
        this.f34539a = i10;
        this.f34540b = obj;
    }

    @Override
    public final void run() {
        int i10;
        np0 np0Var;
        jk jkVar;
        int i11 = this.f34539a;
        int i12 = 0;
        Object obj = this.f34540b;
        switch (i11) {
            case 0:
                ((PasscodeActivity) ((xd0) obj).f39903n).h0();
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
                ((om0) obj).f36268a.finishFragment();
                return;
            case 4:
                org.telegram.ui.Components.e5.x0(((sm0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 5:
                double currentTimeMillis = System.currentTimeMillis();
                cn0 cn0Var = (cn0) ((ci.o2) obj).f5237b;
                double d = currentTimeMillis - cn0Var.G;
                cn0Var.G = currentTimeMillis;
                int i13 = (int) (cn0Var.E - d);
                cn0Var.E = i13;
                if (i13 <= 1000) {
                    cn0Var.f32755r.setVisibility(0);
                    cn0Var.f32754n.setVisibility(8);
                    cn0Var.r();
                    return;
                }
                return;
            case 6:
                bn0 bn0Var = (bn0) obj;
                cn0 cn0Var2 = bn0Var.f32453a;
                int i14 = cn0Var2.f32759y;
                dn0 dn0Var = cn0Var2.f32756s;
                zm0 zm0Var = cn0Var2.f32754n;
                if (i14 >= 1000) {
                    int i15 = i14 / 1000;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = cn0Var2.M;
                    if (i18 != 4 && i18 != 3) {
                        if (i18 == 2) {
                            zm0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i16), Integer.valueOf(i17)));
                        }
                    } else {
                        zm0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (dn0Var != null) {
                        dn0Var.f33164c = 1.0f - (cn0Var2.f32759y / cn0Var2.P);
                        dn0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (dn0Var != null) {
                    dn0Var.f33164c = 1.0f;
                    dn0Var.invalidate();
                }
                cn0Var2.s();
                int i19 = cn0Var2.L;
                if (i19 == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(cn0Var2, NotificationCenter.didReceiveCall);
                    cn0Var2.I = false;
                    cn0Var2.r();
                    cn0Var2.u();
                    return;
                } else if (i19 == 2 || i19 == 4) {
                    int i20 = cn0Var2.M;
                    if (i20 != 4 && i20 != 2) {
                        if (i20 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(cn0Var2, NotificationCenter.didReceiveSmsCode);
                            cn0Var2.I = false;
                            cn0Var2.r();
                            cn0Var2.u();
                            return;
                        }
                        return;
                    }
                    if (i20 == 4) {
                        zm0Var.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        zm0Var.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    cn0Var2.p();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = cn0Var2.f32750a;
                    tL_auth_resendCode.phone_code_hash = cn0Var2.f32751b;
                    ConnectionsManager.getInstance(gn0.f0(cn0Var2.Q)).sendRequest(tL_auth_resendCode, new m(bn0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 7:
                nf.f.s(((yn0) obj).f40196b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 8:
                oo0 oo0Var = ((do0) obj).f33165a;
                oo0Var.t0();
                oo0Var.H0(true, false);
                oo0Var.D0(false);
                return;
            case 9:
                nf.f.s(((ho0) obj).f34265b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 10:
                lp0 lp0Var = (lp0) obj;
                np0 np0Var2 = lp0Var.f35396c;
                sp0 sp0Var = np0Var2.E;
                tp0 tp0Var = np0Var2.f35954p0;
                if (sp0Var != null && np0Var2.L.size() > 1) {
                    sp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) np0Var2.M.get(1);
                    np0Var2.K = starGift;
                    if (starGift == null) {
                        xh.v3 v3Var = np0Var2.J;
                        if (v3Var != null) {
                            v3Var.f();
                            np0Var2.J = null;
                        }
                    } else {
                        xh.v3 v3Var2 = np0Var2.J;
                        if (v3Var2 == null || v3Var2.f46450b != starGift.f18560id) {
                            i10 = ((org.telegram.ui.ActionBar.m2) tp0Var).currentAccount;
                            xh.v3 v3Var3 = new xh.v3(np0Var2.K.f18560id, i10, new t3(lp0Var, 16));
                            np0Var2.J = v3Var3;
                            v3Var3.g(false);
                        }
                    }
                    np0.a(np0Var2);
                    if (tp0Var.I.getCurrentPosition() == 1) {
                        np0Var = tp0Var.f38178n;
                    } else {
                        np0Var = tp0Var.h;
                    }
                    np0Var.e();
                    return;
                }
                return;
            case 11:
                tq0 tq0Var = ((kq0) obj).h;
                tq0Var.b0(tq0Var.P.getSearchField());
                return;
            case 12:
                ((lq0) obj).f35402z0.L.l();
                return;
            case 13:
                ((nu0) obj).invalidate();
                return;
            case 14:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.s2(vVar.f6164a);
                if (photoViewer.f31206c2 == 1) {
                    long j3 = vVar.f6164a;
                    photoViewer.X7 = j3;
                    if (photoViewer.W7 != j3) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.f6166c = null;
                return;
            case 15:
                PhotoViewer photoViewer2 = ((ws0) obj).f39751a;
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
                wn wnVar = ((ys0) obj).f40244d1.l4;
                if (wnVar != null && (jkVar = wnVar.Y) != null) {
                    jkVar.H0();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.bl0 bl0Var = (org.telegram.ui.Components.bl0) ((xo0) obj).f39956b;
                PhotoViewer photoViewer3 = (PhotoViewer) bl0Var.f23059c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.t71 t71Var = photoViewer3.F2;
                if (t71Var != null) {
                    t71Var.C();
                }
                ((PhotoViewer) bl0Var.f23059c).I2 = null;
                return;
            case 18:
                PhotoViewer photoViewer4 = ((ls0) obj).f35408a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.t71 t71Var2 = photoViewer4.F2;
                if (t71Var2 != null) {
                    t71Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 19:
                xt0 xt0Var = (xt0) ((xo0) obj).f39956b;
                xt0Var.f39988r.f31288l7.unlock();
                PhotoViewer photoViewer5 = xt0Var.f39988r;
                Runnable runnable = photoViewer5.f31321p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f31321p4 = null;
                }
                photoViewer5.x2(true);
                return;
            case 20:
                PhotoViewer photoViewer6 = ((at0) obj).f32232b;
                Runnable runnable2 = photoViewer6.f31321p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f31321p4 = null;
                    return;
                }
                return;
            case 21:
                ((iu0) obj).f44736s.d(true);
                return;
            case 22:
                ((mu0) obj).d = true;
                return;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((tw0) obj).f38247c;
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
                ProfileActivity profileActivity = (ProfileActivity) ((ci.m6) obj).f5172c;
                if (profileActivity.f31619n5 != 1.0f) {
                    gz0 gz0Var = profileActivity.f31614n0;
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
