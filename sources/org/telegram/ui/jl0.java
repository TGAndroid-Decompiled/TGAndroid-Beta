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
public final class jl0 implements Runnable {
    public final int f34758a;
    public final Object f34759b;
    public final Object f34760c;

    public jl0(int i10, Object obj, Object obj2) {
        this.f34758a = i10;
        this.f34759b = obj;
        this.f34760c = obj2;
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
        org.telegram.ui.Components.qc Q;
        String str;
        qo0 qo0Var;
        qo0 qo0Var2;
        lk lkVar;
        String str2 = "";
        switch (this.f34758a) {
            case 0:
                Runnable runnable = (Runnable) this.f34760c;
                for (ds dsVar : ((PasscodeActivity) this.f34759b).f31176n.f32431f) {
                    dsVar.l(0.0f);
                }
                runnable.run();
                return;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f34760c;
                PasscodeActivity passcodeActivity = ((kl0) this.f34759b).f35099b;
                if (passcodeActivity.f31181y == 0) {
                    i10 = R.string.PasscodeSwitchToPassword;
                } else {
                    i10 = R.string.PasscodeSwitchToPIN;
                }
                g1Var.setText(LocaleController.getString(i10));
                if (passcodeActivity.f31181y == 0) {
                    i11 = R.drawable.msg_permissions;
                } else {
                    i11 = R.drawable.msg_pin_code;
                }
                g1Var.setIcon(i11);
                passcodeActivity.k0();
                if (passcodeActivity.e0()) {
                    passcodeActivity.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f31178s, true, 0.1f, false);
                    return;
                }
                return;
            case 2:
                ((PasskeysActivity) this.f34759b).Y((TL_account.Passkey) this.f34760c);
                return;
            case 3:
                jn0 jn0Var = (jn0) this.f34759b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f34760c;
                int[] iArr = jn0Var.f34819x;
                int i16 = result.type;
                if (i16 == 2) {
                    if (!(jn0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = jn0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) jn0Var.G.get(i17);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    jn0Var.F = tL_secureRequiredType;
                                    jn0Var.P1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i16 == 1) {
                    if (!(jn0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = jn0Var.G.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) jn0Var.G.get(i18);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    jn0Var.F = tL_secureRequiredType2;
                                    jn0Var.P1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i16 == 3) {
                    if (!(jn0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = jn0Var.G.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) jn0Var.G.get(i19);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    jn0Var.F = tL_secureRequiredType3;
                                    jn0Var.P1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i16 == 4 && !(jn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = jn0Var.G.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) jn0Var.G.get(i20);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                jn0Var.F = tL_secureRequiredType4;
                                jn0Var.P1();
                            } else {
                                i20++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    jn0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    jn0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    jn0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    jn0Var.Y[7].setText(result.number);
                }
                int i21 = result.gender;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            jn0Var.f34816w = "female";
                            jn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        }
                    } else {
                        jn0Var.f34816w = "male";
                        jn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    jn0Var.f34807s = str3;
                    String str4 = (String) jn0Var.Y0.get(str3);
                    if (str4 != null) {
                        jn0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    jn0Var.v = str5;
                    String str6 = (String) jn0Var.Y0.get(str5);
                    if (str6 != null) {
                        jn0Var.Y[6].setText(str6);
                    }
                }
                int i22 = result.birthDay;
                if (i22 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    jn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i23 = result.expiryDay;
                if (i23 > 0 && (i12 = result.expiryMonth) > 0 && (i13 = result.expiryYear) > 0) {
                    iArr[0] = i13;
                    iArr[1] = i12;
                    iArr[2] = i23;
                    jn0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i23), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                jn0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 4:
                jn0 jn0Var2 = (jn0) this.f34759b;
                TLObject tLObject = (TLObject) this.f34760c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    jn0Var2.J = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(jn0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TwoStepVerificationActivity.m0(jn0Var2.J);
                    jn0Var2.R1();
                    if (jn0Var2.Z[0].getVisibility() == 0) {
                        jn0Var2.Y[0].requestFocus();
                        AndroidUtilities.showKeyboard(jn0Var2.Y[0]);
                    }
                    if (jn0Var2.N0 == 1) {
                        jn0Var2.B1(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                jn0 jn0Var3 = (jn0) this.f34759b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f34760c;
                if (tL_error == null) {
                    jn0Var3.f34782f1 = true;
                    jn0Var3.W0(true);
                    jn0Var3.finishFragment();
                    return;
                }
                jn0Var3.N1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.e5.x0(jn0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    return;
                } else {
                    jn0Var3.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 6:
                ((en0) this.f34759b).f33294a.K = ((TLRPC.TL_error) this.f34760c).text;
                return;
            case 7:
                ((ro0) this.f34759b).D0(false);
                ((View) this.f34760c).callOnClick();
                return;
            case 8:
                ro0 ro0Var = (ro0) this.f34759b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f34760c;
                ro0Var.H0(true, false);
                if (tL_error2 == null) {
                    if (ro0Var.getParentActivity() != null) {
                        on0 on0Var = ro0Var.f37176d0;
                        if (on0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(on0Var);
                            ro0Var.f37176d0 = null;
                        }
                        ro0Var.t0();
                        return;
                    }
                    return;
                } else if (tL_error2.text.startsWith("CODE_INVALID")) {
                    org.telegram.ui.Cells.k3 k3Var = ro0Var.S;
                    try {
                        k3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeViewSpring(k3Var, 2.5f);
                    org.telegram.ui.Cells.k3 k3Var2 = ro0Var.S;
                    k3Var2.f20558a.setText("");
                    k3Var2.f20559b = false;
                    k3Var2.setWillNotDraw(true);
                    return;
                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    ro0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    ro0Var.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                    return;
                }
            case 9:
                ro0.W((ro0) this.f34759b, (TLRPC.TL_payments_validatedRequestedInfo) this.f34760c);
                return;
            case 10:
                ro0 ro0Var2 = (ro0) this.f34759b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.f34760c;
                Context parentActivity = ro0Var2.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity != null) {
                    ro0Var2.f37169a1 = true;
                    ro0Var2.f37182f1 = 1;
                    TLRPC.InputInvoice inputInvoice = ro0Var2.f37172b1;
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
                    if (!z12 && (qo0Var2 = ro0Var2.Z0) != null) {
                        qo0Var2.a(1);
                    }
                    ro0Var2.t0();
                    if (z12 && (qo0Var = ro0Var2.Z0) != null) {
                        qo0Var.a(ro0Var2.f37182f1);
                    }
                    long r02 = ro0Var2.r0();
                    int i24 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                    if (i24 > 0) {
                        str2 = UserObject.getForcedFirstName(ro0Var2.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (i24 < 0 && (chat = ro0Var2.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str2 = chat.title;
                    }
                    long q02 = ro0Var2.q0();
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
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, ro0Var2.R0[0], ro0Var2.f37193q0);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(U);
                        if (i24 != 0 && string != null && !z11) {
                            Q = a02.K(i25, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new sn0(r02, 0));
                        } else {
                            String str7 = string;
                            if (str7 != null) {
                                Q = a02.M(str7, replaceTags, i25);
                            } else {
                                Q = a02.Q(i25, 36, replaceTags);
                            }
                        }
                        org.telegram.ui.Components.qc qcVar = Q;
                        qcVar.f27699r = false;
                        qcVar.f27691j = 5000;
                        if (messageArr[0] != null) {
                            ai.l5 l5Var = new ai.l5(ro0Var2, qcVar, z10, messageArr, 3);
                            org.telegram.ui.Components.ub ubVar = qcVar.e;
                            if (ubVar != null) {
                                ubVar.setOnClickListener(l5Var);
                            }
                        }
                        qcVar.k(z11);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) this.f34759b;
                b41.T(photoViewer.E, photoViewer.f31296m4, false, (ai.d) this.f34760c, null);
                return;
            case 12:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f34759b;
                bt0 bt0Var = (bt0) this.f34760c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (bt0Var.getWindow() != null) {
                    bt0Var.setFocusable(true);
                    xn xnVar = photoViewer2.l4;
                    if (xnVar != null && (lkVar = xnVar.Y) != null) {
                        lkVar.m0(false);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                ((ai.l) this.f34759b).run((Bitmap) this.f34760c);
                return;
            case 14:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f34759b;
                qg.w0 w0Var = (qg.w0) this.f34760c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                w0Var.e.h();
                w0Var.f42006c.postRunnable(new n21(12));
                photoViewer3.f31225e0.removeView(photoViewer3.N1);
                return;
            case 15:
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.f34759b;
                Bitmap bitmap = (Bitmap) this.f34760c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (d6Var != null) {
                    ArrayList arrayList = d6Var.h;
                    org.telegram.ui.Components.a6 a6Var = d6Var.f23528n;
                    if (a6Var != null) {
                        arrayList.add(a6Var);
                    }
                    org.telegram.ui.Components.a6 a6Var2 = d6Var.f23533r;
                    if (a6Var2 != null) {
                        arrayList.add(a6Var2);
                    }
                    org.telegram.ui.Components.a6 a6Var3 = d6Var.f23535s;
                    if (a6Var3 != null) {
                        arrayList.add(a6Var3);
                    }
                    d6Var.f23528n = new org.telegram.ui.Components.a6(bitmap);
                    d6Var.f23533r = null;
                    d6Var.f23535s = null;
                    d6Var.t();
                    return;
                }
                return;
            case 16:
                bs0 bs0Var = (bs0) this.f34759b;
                bs0Var.getClass();
                ((View) this.f34760c).setOutlineProvider(null);
                PhotoViewer photoViewer4 = bs0Var.f32434c;
                ImageView imageView = photoViewer4.f31397x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                pu0 pu0Var = photoViewer4.E2;
                if (pu0Var != null) {
                    pu0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 17:
                mt0 mt0Var = (mt0) this.f34759b;
                org.telegram.ui.Components.u71 u71Var = (org.telegram.ui.Components.u71) this.f34760c;
                mt0Var.getClass();
                if (u71Var.p() > 0 && u71Var.n() >= u71Var.p() - 590) {
                    mt0Var.f35751a.f31225e0.invalidate();
                    return;
                }
                return;
            case 18:
                qt0 qt0Var = (qt0) this.f34759b;
                qg.w0 w0Var2 = (qg.w0) this.f34760c;
                w0Var2.e.h();
                w0Var2.f42006c.postRunnable(new n21(12));
                try {
                    qt0Var.f36911b.f31225e0.removeView(w0Var2);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 19:
                ci.m6 m6Var = (ci.m6) this.f34760c;
                PhotoViewer photoViewer5 = ((vs0) this.f34759b).f38699b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.f31397x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.f31397x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) m6Var.f5172b).setImageBitmap(photoViewer5.C3);
                    return;
                }
                return;
            case 20:
                ((au0) this.f34759b).f32153r.f31291l7.lock();
                ((AnimatorSet) this.f34760c).start();
                return;
            case 21:
                yu0 yu0Var = (yu0) this.f34760c;
                ((au0) this.f34759b).f32153r.f31351s4 = false;
                if (!yu0Var.f40340s) {
                    yu0Var.f40325a.setVisible(false, true);
                    return;
                }
                return;
            case 22:
                gw0 gw0Var = (gw0) this.f34759b;
                gw0Var.getClass();
                AndroidUtilities.addToClipboard((String) this.f34760c);
                gw0Var.c(true);
                return;
            case 23:
                gw0 gw0Var2 = (gw0) this.f34759b;
                gw0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) this.f34760c).text, false));
                gw0Var2.c(true);
                return;
            case 24:
                gw0 gw0Var3 = (gw0) this.f34759b;
                SendMessagesHelper.getInstance(gw0Var3.H.currentAccount).deletePollOption(gw0Var3.H, (byte[]) this.f34760c);
                gw0Var3.c(true);
                return;
            case 25:
                PrivacyControlActivity.W((PrivacyControlActivity) this.f34759b, (TLObject) this.f34760c);
                return;
            case 26:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f34759b;
                boolean[] zArr = (boolean[]) this.f34760c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    return;
                }
                return;
            case 27:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f34759b;
                privacySettingsActivity.d = (TL_account.Password) this.f34760c;
                privacySettingsActivity.y0();
                return;
            case 28:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.f34759b;
                boolean z13 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z13;
                ((org.telegram.ui.Cells.w8) this.f34760c).setChecked(z13);
                return;
            default:
                ((ay0) this.f34759b).getMessagesController().unblockPeer(((Long) this.f34760c).longValue());
                return;
        }
    }
}
