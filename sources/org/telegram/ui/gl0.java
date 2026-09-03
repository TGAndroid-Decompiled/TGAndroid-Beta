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
public final class gl0 implements Runnable {
    public final int f37124a;
    public final Object f37125b;

    public gl0(Object obj, int i10) {
        this.f37124a = i10;
        this.f37125b = obj;
    }

    @Override
    public final void run() {
        int i10;
        hp0 hp0Var;
        jk jkVar;
        int i11 = this.f37124a;
        int i12 = 0;
        Object obj = this.f37125b;
        switch (i11) {
            case 0:
                ((PasscodeActivity) ((wd0) obj).f42411n).h0();
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
                ((nm0) obj).f39404a.finishFragment();
                return;
            case 4:
                org.telegram.ui.Components.z4.x0(((rm0) obj).f40886e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 5:
                double currentTimeMillis = System.currentTimeMillis();
                bn0 bn0Var = (bn0) ((org.telegram.ui.Components.i50) obj).f27718b;
                double d = currentTimeMillis - bn0Var.D;
                bn0Var.D = currentTimeMillis;
                int i13 = (int) (bn0Var.B - d);
                bn0Var.B = i13;
                if (i13 <= 1000) {
                    bn0Var.f35575r.setVisibility(0);
                    bn0Var.f35574n.setVisibility(8);
                    bn0Var.r();
                    return;
                }
                return;
            case 6:
                an0 an0Var = (an0) obj;
                bn0 bn0Var2 = an0Var.f35222a;
                int i14 = bn0Var2.f35579y;
                cn0 cn0Var = bn0Var2.f35576s;
                hg.q qVar = bn0Var2.f35574n;
                if (i14 >= 1000) {
                    int i15 = i14 / 1000;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = bn0Var2.J;
                    if (i18 != 4 && i18 != 3) {
                        if (i18 == 2) {
                            qVar.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i16), Integer.valueOf(i17)));
                        }
                    } else {
                        qVar.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (cn0Var != null) {
                        cn0Var.f35832c = 1.0f - (bn0Var2.f35579y / bn0Var2.M);
                        cn0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (cn0Var != null) {
                    cn0Var.f35832c = 1.0f;
                    cn0Var.invalidate();
                }
                bn0Var2.s();
                int i19 = bn0Var2.I;
                if (i19 == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(bn0Var2, NotificationCenter.didReceiveCall);
                    bn0Var2.F = false;
                    bn0Var2.r();
                    bn0Var2.t();
                    return;
                } else if (i19 == 2 || i19 == 4) {
                    int i20 = bn0Var2.J;
                    if (i20 != 4 && i20 != 2) {
                        if (i20 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(bn0Var2, NotificationCenter.didReceiveSmsCode);
                            bn0Var2.F = false;
                            bn0Var2.r();
                            bn0Var2.t();
                            return;
                        }
                        return;
                    }
                    if (i20 == 4) {
                        qVar.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        qVar.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    bn0Var2.p();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = bn0Var2.f35569a;
                    tL_auth_resendCode.phone_code_hash = bn0Var2.f35570b;
                    ConnectionsManager.getInstance(fn0.f0(bn0Var2.N)).sendRequest(tL_auth_resendCode, new o(an0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 7:
                af.g.s(((wn0) obj).f42824b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 8:
                lo0 lo0Var = ((ao0) obj).f35231a;
                lo0Var.t0();
                lo0Var.H0(true, false);
                lo0Var.D0(false);
                return;
            case 9:
                af.g.s(((eo0) obj).f36535b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 10:
                fp0 fp0Var = (fp0) obj;
                hp0 hp0Var2 = fp0Var.f36893c;
                mp0 mp0Var = hp0Var2.B;
                np0 np0Var = hp0Var2.m0;
                if (mp0Var != null && hp0Var2.I.size() > 1) {
                    mp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) hp0Var2.J.get(1);
                    hp0Var2.H = starGift;
                    if (starGift == null) {
                        lh.b5 b5Var = hp0Var2.G;
                        if (b5Var != null) {
                            b5Var.f();
                            hp0Var2.G = null;
                        }
                    } else {
                        lh.b5 b5Var2 = hp0Var2.G;
                        if (b5Var2 == null || b5Var2.f12621b != starGift.f21072id) {
                            i10 = ((org.telegram.ui.ActionBar.p2) np0Var).currentAccount;
                            lh.b5 b5Var3 = new lh.b5(hp0Var2.H.f21072id, i10, new w3(fp0Var, 13));
                            hp0Var2.G = b5Var3;
                            b5Var3.g(false);
                        }
                    }
                    hp0.a(hp0Var2);
                    if (np0Var.F.getCurrentPosition() == 1) {
                        hp0Var = np0Var.f39435n;
                    } else {
                        hp0Var = np0Var.h;
                    }
                    hp0Var.e();
                    return;
                }
                return;
            case 11:
                mq0 mq0Var = ((eq0) obj).h;
                mq0Var.b0(mq0Var.M.getSearchField());
                return;
            case 12:
                ((fq0) obj).f36899w0.I.l();
                return;
            case 13:
                ((iu0) obj).invalidate();
                return;
            case 14:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.t2(vVar.f2822a);
                if (photoViewer.Z1 == 1) {
                    long j10 = vVar.f2822a;
                    photoViewer.T7 = j10;
                    if (photoViewer.S7 != j10) {
                        photoViewer.S7 = -1L;
                    }
                }
                vVar.f2824c = null;
                return;
            case 15:
                PhotoViewer photoViewer2 = ((ps0) obj).f40122a;
                ImageView imageView = photoViewer2.B3;
                if (imageView != null && imageView.getParent() != null) {
                    ((ViewGroup) photoViewer2.B3.getParent()).removeView(photoViewer2.B3);
                    if (photoViewer2.A3 != null) {
                        ImageView imageView2 = photoViewer2.B3;
                        if (imageView2 != null) {
                            imageView2.setBackground(null);
                        }
                        AndroidUtilities.recycleBitmap(photoViewer2.A3);
                        photoViewer2.A3 = null;
                    }
                    photoViewer2.B3 = null;
                    return;
                }
                return;
            case 16:
                xn xnVar = ((rs0) obj).f40934a1.f34298i4;
                if (xnVar != null && (jkVar = xnVar.V) != null) {
                    jkVar.H0();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.ex0 ex0Var = (org.telegram.ui.Components.ex0) ((ss0) obj).f41305b;
                PhotoViewer photoViewer3 = (PhotoViewer) ex0Var.f26692c;
                photoViewer3.E2 = false;
                org.telegram.ui.Components.j71 j71Var = photoViewer3.C2;
                if (j71Var != null) {
                    j71Var.C();
                }
                ((PhotoViewer) ex0Var.f26692c).F2 = null;
                return;
            case 18:
                PhotoViewer photoViewer4 = ((es0) obj).f36577a;
                photoViewer4.E2 = false;
                org.telegram.ui.Components.j71 j71Var2 = photoViewer4.C2;
                if (j71Var2 != null) {
                    j71Var2.C();
                }
                photoViewer4.F2 = null;
                return;
            case 19:
                rt0 rt0Var = (rt0) ((ss0) obj).f41305b;
                rt0Var.f40943r.f34301i7.unlock();
                PhotoViewer photoViewer5 = rt0Var.f40943r;
                Runnable runnable = photoViewer5.f34332m4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f34332m4 = null;
                }
                photoViewer5.y2(true);
                return;
            case 20:
                PhotoViewer photoViewer6 = ((us0) obj).f41926b;
                Runnable runnable2 = photoViewer6.f34332m4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f34332m4 = null;
                    return;
                }
                return;
            case 21:
                ((cu0) obj).f10192s.d(true);
                return;
            case 22:
                ((hu0) obj).d = true;
                return;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((ow0) obj).f39816c;
                premiumPreviewFragment.showDialog(new w31(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                return;
            case 24:
                ((org.telegram.messenger.ok) obj).run(0);
                return;
            case 25:
                AndroidUtilities.addToClipboard((String) obj);
                return;
            case 26:
                ((qh.e3) obj).e(true);
                return;
            case 27:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                return;
            case 28:
                uy0 uy0Var = (uy0) obj;
                uy0Var.G.getNotificationCenter().onAnimationFinish(uy0Var.F);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) ((ag.l) obj).f213c;
                if (profileActivity.f34637k5 != 1.0f) {
                    dz0 dz0Var = profileActivity.f34632k0;
                    while (dz0Var.A0.k(i12) != dz0Var.getRealCount() - 1) {
                        i12++;
                    }
                    dz0Var.x(i12, true);
                    return;
                }
                return;
        }
    }
}
