package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ak0 implements Runnable {
    public final int f31024a;
    public final Object f31025b;
    public final Object f31026c;

    public ak0(int i10, Object obj, Object obj2) {
        this.f31024a = i10;
        this.f31025b = obj;
        this.f31026c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        String formatPluralString;
        boolean z10;
        boolean z11;
        TLRPC.Chat chat;
        int i14;
        int i15;
        String string;
        String formatString;
        org.telegram.ui.Components.pc Q;
        String str;
        vo0 vo0Var;
        vo0 vo0Var2;
        ok okVar;
        String str2 = "";
        switch (this.f31024a) {
            case 0:
                ((nj0) this.f31025b).run((TLRPC.User) this.f31026c);
                return;
            case 1:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.f31025b, (ArrayList) this.f31026c);
                return;
            case 2:
                Runnable runnable = (Runnable) this.f31026c;
                for (hs hsVar : ((PasscodeActivity) this.f31025b).f30001n.f32906f) {
                    hsVar.l(0.0f);
                }
                runnable.run();
                return;
            case 3:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f31026c;
                PasscodeActivity passcodeActivity = ((ol0) this.f31025b).f35511b;
                if (passcodeActivity.f30006y == 0) {
                    i10 = R.string.PasscodeSwitchToPassword;
                } else {
                    i10 = R.string.PasscodeSwitchToPIN;
                }
                g1Var.setText(LocaleController.getString(i10));
                if (passcodeActivity.f30006y == 0) {
                    i11 = R.drawable.msg_permissions;
                } else {
                    i11 = R.drawable.msg_pin_code;
                }
                g1Var.setIcon(i11);
                passcodeActivity.k0();
                if (passcodeActivity.e0()) {
                    passcodeActivity.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f30003s, true, 0.1f, false);
                    return;
                }
                return;
            case 4:
                ((PasskeysActivity) this.f31025b).Y((TL_account.Passkey) this.f31026c);
                return;
            case 5:
                on0 on0Var = (on0) this.f31025b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f31026c;
                int[] iArr = on0Var.f35569x;
                int i16 = result.type;
                if (i16 == 2) {
                    if (!(on0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = on0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) on0Var.G.get(i17);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    on0Var.F = tL_secureRequiredType;
                                    on0Var.P1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i16 == 1) {
                    if (!(on0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = on0Var.G.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) on0Var.G.get(i18);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    on0Var.F = tL_secureRequiredType2;
                                    on0Var.P1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i16 == 3) {
                    if (!(on0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = on0Var.G.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) on0Var.G.get(i19);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    on0Var.F = tL_secureRequiredType3;
                                    on0Var.P1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i16 == 4 && !(on0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = on0Var.G.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) on0Var.G.get(i20);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                on0Var.F = tL_secureRequiredType4;
                                on0Var.P1();
                            } else {
                                i20++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    on0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    on0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    on0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    on0Var.Y[7].setText(result.number);
                }
                int i21 = result.gender;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            on0Var.f35566w = "female";
                            on0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        }
                    } else {
                        on0Var.f35566w = "male";
                        on0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    on0Var.f35557s = str3;
                    String str4 = (String) on0Var.Y0.get(str3);
                    if (str4 != null) {
                        on0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    on0Var.v = str5;
                    String str6 = (String) on0Var.Y0.get(str5);
                    if (str6 != null) {
                        on0Var.Y[6].setText(str6);
                    }
                }
                int i22 = result.birthDay;
                if (i22 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    on0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i23 = result.expiryDay;
                if (i23 > 0 && (i12 = result.expiryMonth) > 0 && (i13 = result.expiryYear) > 0) {
                    iArr[0] = i13;
                    iArr[1] = i12;
                    iArr[2] = i23;
                    on0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i23), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                on0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 6:
                on0 on0Var2 = (on0) this.f31025b;
                TLObject tLObject = (TLObject) this.f31026c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    on0Var2.J = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.d5.x0(on0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TwoStepVerificationActivity.m0(on0Var2.J);
                    on0Var2.R1();
                    if (on0Var2.Z[0].getVisibility() == 0) {
                        on0Var2.Y[0].requestFocus();
                        AndroidUtilities.showKeyboard(on0Var2.Y[0]);
                    }
                    if (on0Var2.N0 == 1) {
                        on0Var2.B1(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                on0 on0Var3 = (on0) this.f31025b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f31026c;
                if (tL_error == null) {
                    on0Var3.f35532f1 = true;
                    on0Var3.W0(true);
                    on0Var3.finishFragment();
                    return;
                }
                on0Var3.N1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.d5.x0(on0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    return;
                } else {
                    on0Var3.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 8:
                ((jn0) this.f31025b).f34141a.K = ((TLRPC.TL_error) this.f31026c).text;
                return;
            case 9:
                ((wo0) this.f31025b).D0(false);
                ((View) this.f31026c).callOnClick();
                return;
            case 10:
                wo0 wo0Var = (wo0) this.f31025b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f31026c;
                wo0Var.H0(true, false);
                if (tL_error2 == null) {
                    if (wo0Var.getParentActivity() != null) {
                        tn0 tn0Var = wo0Var.f38263d0;
                        if (tn0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(tn0Var);
                            wo0Var.f38263d0 = null;
                        }
                        wo0Var.t0();
                        return;
                    }
                    return;
                } else if (tL_error2.text.startsWith("CODE_INVALID")) {
                    org.telegram.ui.Cells.j3 j3Var = wo0Var.S;
                    try {
                        j3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeViewSpring(j3Var, 2.5f);
                    org.telegram.ui.Cells.j3 j3Var2 = wo0Var.S;
                    j3Var2.f19338a.setText("");
                    j3Var2.f19339b = false;
                    j3Var2.setWillNotDraw(true);
                    return;
                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    wo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    wo0Var.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                    return;
                }
            case 11:
                wo0.W((wo0) this.f31025b, (TLRPC.TL_payments_validatedRequestedInfo) this.f31026c);
                return;
            case 12:
                wo0 wo0Var2 = (wo0) this.f31025b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.f31026c;
                Context parentActivity = wo0Var2.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity != null) {
                    wo0Var2.f38256a1 = true;
                    wo0Var2.f38269f1 = 1;
                    TLRPC.InputInvoice inputInvoice = wo0Var2.f38259b1;
                    boolean z12 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    if (z12 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z12 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z12 && (vo0Var2 = wo0Var2.Z0) != null) {
                        vo0Var2.a(1);
                    }
                    wo0Var2.t0();
                    if (z12 && (vo0Var = wo0Var2.Z0) != null) {
                        vo0Var.a(wo0Var2.f38269f1);
                    }
                    long r02 = wo0Var2.r0();
                    int i24 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                    if (i24 > 0) {
                        str2 = UserObject.getForcedFirstName(wo0Var2.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (i24 < 0 && (chat = wo0Var2.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str2 = chat.title;
                    }
                    long q02 = wo0Var2.q0();
                    if (z12) {
                        if (!z10 && !z11) {
                            i14 = R.raw.stars_topup;
                        } else {
                            i14 = R.raw.stars_send;
                        }
                    } else {
                        i14 = R.raw.payment_success;
                    }
                    int i25 = i14;
                    if (!z12) {
                        string = null;
                    } else {
                        if (z11) {
                            i15 = R.string.StarsGiveawaySentPopup;
                        } else if (z10) {
                            i15 = R.string.StarsGiftSentPopup;
                        } else {
                            i15 = R.string.StarsAcquired;
                        }
                        string = LocaleController.getString(i15);
                    }
                    if (z12) {
                        if (z11) {
                            formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                        } else {
                            if (z10) {
                                str = "StarsGiftSentPopupInfo";
                            } else {
                                str = "StarsAcquiredInfo";
                            }
                            formatString = LocaleController.formatPluralStringComma(str, (int) q02, str2);
                        }
                    } else {
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, wo0Var2.R0[0], wo0Var2.f38280q0);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(U);
                        if (i24 != 0 && string != null && !z11) {
                            Q = a02.K(i25, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new xn0(r02, 0));
                        } else {
                            String str7 = string;
                            if (str7 != null) {
                                Q = a02.M(str7, replaceTags, i25);
                            } else {
                                Q = a02.Q(i25, 36, replaceTags);
                            }
                        }
                        org.telegram.ui.Components.pc pcVar = Q;
                        pcVar.f26089r = false;
                        pcVar.f26081j = 5000;
                        if (messageArr[0] != null) {
                            ou ouVar = new ou(wo0Var2, pcVar, z10, messageArr, 2);
                            org.telegram.ui.Components.tb tbVar = pcVar.e;
                            if (tbVar != null) {
                                tbVar.setOnClickListener(ouVar);
                            }
                        }
                        pcVar.k(z11);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) this.f31025b;
                n41.T(photoViewer.E, photoViewer.f30120m4, false, (zh.b) this.f31026c, null);
                return;
            case 14:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f31025b;
                ft0 ft0Var = (ft0) this.f31026c;
                Drawable[] drawableArr = PhotoViewer.T8;
                if (ft0Var.getWindow() != null) {
                    ft0Var.setFocusable(true);
                    eo eoVar = photoViewer2.l4;
                    if (eoVar != null && (okVar = eoVar.Y) != null) {
                        okVar.m0(false);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                Drawable[] drawableArr2 = PhotoViewer.T8;
                ((org.telegram.messenger.j2) this.f31025b).run((Bitmap) this.f31026c);
                return;
            case 16:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f31025b;
                pg.w0 w0Var = (pg.w0) this.f31026c;
                Drawable[] drawableArr3 = PhotoViewer.T8;
                w0Var.e.h();
                w0Var.f40334c.postRunnable(new org.telegram.ui.web.d1(4));
                photoViewer3.f30049e0.removeView(photoViewer3.N1);
                return;
            case 17:
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.f31025b;
                Bitmap bitmap = (Bitmap) this.f31026c;
                Drawable[] drawableArr4 = PhotoViewer.T8;
                if (c6Var != null) {
                    ArrayList arrayList = c6Var.h;
                    org.telegram.ui.Components.z5 z5Var = c6Var.f22012n;
                    if (z5Var != null) {
                        arrayList.add(z5Var);
                    }
                    org.telegram.ui.Components.z5 z5Var2 = c6Var.f22017r;
                    if (z5Var2 != null) {
                        arrayList.add(z5Var2);
                    }
                    org.telegram.ui.Components.z5 z5Var3 = c6Var.f22019s;
                    if (z5Var3 != null) {
                        arrayList.add(z5Var3);
                    }
                    c6Var.f22012n = new org.telegram.ui.Components.z5(bitmap);
                    c6Var.f22017r = null;
                    c6Var.f22019s = null;
                    c6Var.t();
                    return;
                }
                return;
            case 18:
                fs0 fs0Var = (fs0) this.f31025b;
                fs0Var.getClass();
                ((View) this.f31026c).setOutlineProvider(null);
                PhotoViewer photoViewer4 = fs0Var.f32909c;
                ImageView imageView = photoViewer4.f30221x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                vu0 vu0Var = photoViewer4.E2;
                if (vu0Var != null) {
                    vu0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 19:
                qt0 qt0Var = (qt0) this.f31025b;
                org.telegram.ui.Components.t71 t71Var = (org.telegram.ui.Components.t71) this.f31026c;
                qt0Var.getClass();
                if (t71Var.p() > 0 && t71Var.n() >= t71Var.p() - 590) {
                    qt0Var.f36133a.f30049e0.invalidate();
                    return;
                }
                return;
            case 20:
                ut0 ut0Var = (ut0) this.f31025b;
                pg.w0 w0Var2 = (pg.w0) this.f31026c;
                w0Var2.e.h();
                w0Var2.f40334c.postRunnable(new org.telegram.ui.web.d1(4));
                try {
                    ut0Var.f37341b.f30049e0.removeView(w0Var2);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 21:
                bi.n7 n7Var = (bi.n7) this.f31026c;
                PhotoViewer photoViewer5 = ((zs0) this.f31025b).f39438b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.f30221x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.f30221x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) n7Var.f3239b).setImageBitmap(photoViewer5.C3);
                    return;
                }
                return;
            case 22:
                ((eu0) this.f31025b).f32612r.f30115l7.lock();
                ((AnimatorSet) this.f31026c).start();
                return;
            case 23:
                ev0 ev0Var = (ev0) this.f31026c;
                ((eu0) this.f31025b).f32612r.f30175s4 = false;
                if (!ev0Var.f32631s) {
                    ev0Var.f32616a.setVisible(false, true);
                    return;
                }
                return;
            case 24:
                ow0 ow0Var = (ow0) this.f31025b;
                ow0Var.getClass();
                AndroidUtilities.addToClipboard((String) this.f31026c);
                ow0Var.c(true);
                return;
            case 25:
                ow0 ow0Var2 = (ow0) this.f31025b;
                ow0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) this.f31026c).text, false));
                ow0Var2.c(true);
                return;
            case 26:
                ow0 ow0Var3 = (ow0) this.f31025b;
                SendMessagesHelper.getInstance(ow0Var3.H.currentAccount).deletePollOption(ow0Var3.H, (byte[]) this.f31026c);
                ow0Var3.c(true);
                return;
            case 27:
                PrivacyControlActivity.W((PrivacyControlActivity) this.f31025b, (TLObject) this.f31026c);
                return;
            case 28:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f31025b;
                boolean[] zArr = (boolean[]) this.f31026c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    return;
                }
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f31025b;
                privacySettingsActivity.d = (TL_account.Password) this.f31026c;
                privacySettingsActivity.y0();
                return;
        }
    }
}
