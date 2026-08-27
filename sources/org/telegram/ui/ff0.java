package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

public final class ff0 implements Runnable {

    public final int f38118a;

    public final Object f38119b;

    public final Object f38120c;

    public ff0(int i10, Object obj, Object obj2) {
        this.f38118a = i10;
        this.f38119b = obj;
        this.f38120c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        char c10;
        String pluralString;
        int i12;
        ?? r10;
        long jQ0;
        int i13;
        int i14;
        int i15;
        String str;
        String string;
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        org.telegram.ui.ActionBar.n2 n2VarU;
        org.telegram.ui.Components.mc mcVarA0;
        org.telegram.ui.Components.ec ecVarQ;
        org.telegram.ui.Components.ec ecVar;
        ag.u1 u1Var;
        org.telegram.ui.Components.jb jbVar;
        String str2;
        co0 co0Var;
        co0 co0Var2;
        Context context;
        ck ckVar;
        String forcedFirstName = "";
        String string2 = null;
        int i16 = 1;
        switch (this.f38118a) {
            case 0:
                mf0 mf0Var = (mf0) this.f38119b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f38120c;
                mf0Var.getClass();
                mf0Var.f40479a0 = tL_error.text;
                break;
            case 1:
                ((mf0) this.f38119b).f40497o0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f38120c), false);
                break;
            case 2:
                mf0 mf0Var2 = (mf0) this.f38119b;
                Runnable runnable = (Runnable) this.f38120c;
                ur urVar = mf0Var2.f40487f;
                int i17 = 0;
                while (true) {
                    wr[] wrVarArr = urVar.f43279f;
                    if (i17 >= wrVarArr.length) {
                        runnable.run();
                        urVar.f43278e = false;
                    } else {
                        wrVarArr[i17].l(0.0f);
                        i17++;
                    }
                    break;
                }
                break;
            case 3:
                ((x3) this.f38119b).run((String) this.f38120c);
                break;
            case 4:
                kh0 kh0Var = (kh0) this.f38119b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f38120c;
                kh0Var.Y = false;
                if (tL_error2 == null) {
                    bh0 bh0VarF0 = kh0Var.f0();
                    kh0Var.f39746f0.clear();
                    kh0Var.h0(bh0VarF0);
                }
                break;
            case 5:
                ah0 ah0Var = (ah0) this.f38119b;
                TLObject tLObject = (TLObject) this.f38120c;
                kh0 kh0Var2 = ah0Var.f36536a;
                bh0 bh0VarF1 = kh0Var2.f0();
                kh0Var2.f39744e0.add(0, (TLRPC.TL_chatInviteExported) tLObject);
                TLRPC.ChatFull chatFull = kh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    kh0Var2.getMessagesStorage().saveChatLinksCount(kh0Var2.f39753n, kh0Var2.d.invitesCount);
                }
                kh0Var2.h0(bh0VarF1);
                break;
            case 6:
                vi0 vi0Var = (vi0) this.f38119b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f38120c;
                if (vi0Var.getParentActivity() != null) {
                    Toast.makeText(vi0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                }
                break;
            case 7:
                oj0 oj0Var = (oj0) this.f38119b;
                String str3 = (String) this.f38120c;
                oj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str3));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                oj0Var.getContext().startActivity(intent);
                break;
            case 8:
                oj0 oj0Var2 = (oj0) this.f38119b;
                TLRPC.User user = (TLRPC.User) this.f38120c;
                oj0Var2.dismiss();
                org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                if (n2VarU2 != null) {
                    n2VarU2.presentFragment(ProfileActivity.m4(user.f22527id));
                }
                break;
            case 9:
                ((ib0) this.f38119b).run((TLRPC.User) this.f38120c);
                break;
            case 10:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.f38119b, (ArrayList) this.f38120c);
                break;
            case 11:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f38119b;
                Runnable runnable2 = (Runnable) this.f38120c;
                for (wr wrVar : passcodeActivity.f35573n.f43279f) {
                    wrVar.l(0.0f);
                }
                runnable2.run();
                break;
            case 12:
                xk0 xk0Var = (xk0) this.f38119b;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f38120c;
                PasscodeActivity passcodeActivity2 = xk0Var.f44477b;
                f1Var.setText(LocaleController.getString(passcodeActivity2.f35578y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                f1Var.setIcon(passcodeActivity2.f35578y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.k0();
                if (passcodeActivity2.e0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.f35575s, true, 0.1f, false);
                }
                break;
            case 13:
                ((PasskeysActivity) this.f38119b).Y((TL_account.Passkey) this.f38120c);
                break;
            case 14:
                xm0 xm0Var = (xm0) this.f38119b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f38120c;
                int[] iArr = xm0Var.f44532x;
                int i18 = result.type;
                if (i18 == 2) {
                    if (!(xm0Var.B.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = xm0Var.C.size();
                        for (int i19 = 0; i19 < size; i19++) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) xm0Var.C.get(i19);
                            if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                xm0Var.B = tL_secureRequiredType;
                                xm0Var.P1();
                            }
                        }
                    }
                } else if (i18 == 1) {
                    if (!(xm0Var.B.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = xm0Var.C.size();
                        for (int i20 = 0; i20 < size2; i20++) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) xm0Var.C.get(i20);
                            if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                xm0Var.B = tL_secureRequiredType2;
                                xm0Var.P1();
                            }
                        }
                    }
                } else if (i18 == 3) {
                    if (!(xm0Var.B.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = xm0Var.C.size();
                        for (int i21 = 0; i21 < size3; i21++) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) xm0Var.C.get(i21);
                            if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                xm0Var.B = tL_secureRequiredType3;
                                xm0Var.P1();
                            }
                        }
                    }
                } else if (i18 == 4 && !(xm0Var.B.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = xm0Var.C.size();
                    for (int i22 = 0; i22 < size4; i22++) {
                        TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) xm0Var.C.get(i22);
                        if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                            xm0Var.B = tL_secureRequiredType4;
                            xm0Var.P1();
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    xm0Var.U[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    xm0Var.U[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    xm0Var.U[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    xm0Var.U[7].setText(result.number);
                }
                int i23 = result.gender;
                if (i23 != 0) {
                    if (i23 == 1) {
                        xm0Var.f44529w = "male";
                        xm0Var.U[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i23 == 2) {
                        xm0Var.f44529w = "female";
                        xm0Var.U[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str4 = result.nationality;
                    xm0Var.f44520s = str4;
                    String str5 = (String) xm0Var.U0.get(str4);
                    if (str5 != null) {
                        xm0Var.U[5].setText(str5);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str6 = result.issuingCountry;
                    xm0Var.v = str6;
                    String str7 = (String) xm0Var.U0.get(str6);
                    if (str7 != null) {
                        xm0Var.U[6].setText(str7);
                    }
                }
                int i24 = result.birthDay;
                if (i24 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    xm0Var.U[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i24), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i25 = result.expiryDay;
                if (i25 <= 0 || (i10 = result.expiryMonth) <= 0 || (i11 = result.expiryYear) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    xm0Var.U[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                } else {
                    iArr[0] = i11;
                    iArr[1] = i10;
                    iArr[2] = i25;
                    xm0Var.U[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i25), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                }
                break;
            case 15:
                xm0 xm0Var2 = (xm0) this.f38119b;
                TLObject tLObject2 = (TLObject) this.f38120c;
                if (tLObject2 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    xm0Var2.F = password;
                    if (TwoStepVerificationActivity.i0(password, false)) {
                        TwoStepVerificationActivity.m0(xm0Var2.F);
                        xm0Var2.R1();
                        if (xm0Var2.V[0].getVisibility() == 0) {
                            xm0Var2.U[0].requestFocus();
                            AndroidUtilities.showKeyboard(xm0Var2.U[0]);
                        }
                        if (xm0Var2.J0 == 1) {
                            xm0Var2.B1(true);
                        }
                    } else {
                        org.telegram.ui.Components.y4.x0(xm0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                }
                break;
            case 16:
                xm0 xm0Var3 = (xm0) this.f38119b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f38120c;
                if (tL_error3 == null) {
                    xm0Var3.f44484b1 = true;
                    xm0Var3.W0(true);
                    xm0Var3.finishFragment();
                } else {
                    xm0Var3.N1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error3.text)) {
                        org.telegram.ui.Components.y4.x0(xm0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        xm0Var3.M1(LocaleController.getString(R.string.AppName), tL_error3.text);
                    }
                }
                break;
            case 17:
                ((sm0) this.f38119b).f42670a.G = ((TLRPC.TL_error) this.f38120c).text;
                break;
            case 18:
                do0 do0Var = (do0) this.f38119b;
                View view = (View) this.f38120c;
                do0Var.D0(false);
                view.callOnClick();
                break;
            case 19:
                do0 do0Var2 = (do0) this.f38119b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f38120c;
                do0Var2.H0(true, false);
                if (tL_error4 != null) {
                    if (tL_error4.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.h3 h3Var = do0Var2.O;
                        try {
                            h3Var.performHapticFeedback(3, 2);
                            break;
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(h3Var, 2.5f);
                        org.telegram.ui.Cells.h3 h3Var2 = do0Var2.O;
                        h3Var2.f24424a.setText("");
                        h3Var2.f24425b = false;
                        h3Var2.setWillNotDraw(true);
                    } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                        int iIntValue = Utilities.parseInt((CharSequence) tL_error4.text).intValue();
                        if (iIntValue < 60) {
                            c10 = 0;
                            pluralString = LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]);
                        } else {
                            c10 = 0;
                            pluralString = LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
                        }
                        String string3 = LocaleController.getString(R.string.AppName);
                        int i26 = R.string.FloodWaitTime;
                        Object[] objArr = new Object[1];
                        objArr[c10] = pluralString;
                        do0Var2.F0(string3, LocaleController.formatString("FloodWaitTime", i26, objArr));
                    } else {
                        do0Var2.F0(LocaleController.getString(R.string.AppName), tL_error4.text);
                    }
                    break;
                } else if (do0Var2.getParentActivity() != null) {
                    cn0 cn0Var = do0Var2.Z;
                    if (cn0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(cn0Var);
                        do0Var2.Z = null;
                    }
                    do0Var2.t0();
                    break;
                }
                break;
            case 20:
                do0.W((do0) this.f38119b, (TLRPC.TL_payments_validatedRequestedInfo) this.f38120c);
                break;
            case 21:
                do0 do0Var3 = (do0) this.f38119b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.f38120c;
                Activity parentActivity = do0Var3.getParentActivity();
                Context context2 = parentActivity;
                if (parentActivity == null) {
                    context = ApplicationLoader.applicationContext;
                }
                if (context2 == null) {
                    context2 = context;
                    context2 = LaunchActivity.C1;
                }
                if (context2 != null) {
                    do0Var3.W0 = true;
                    do0Var3.f37456b1 = 1;
                    TLRPC.InputInvoice inputInvoice = do0Var3.X0;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (co0Var2 = do0Var3.V0) != null) {
                        co0Var2.b(1);
                    }
                    do0Var3.t0();
                    if (z10 && (co0Var = do0Var3.V0) != null) {
                        co0Var.b(do0Var3.f37456b1);
                    }
                    long jR0 = do0Var3.r0();
                    int i27 = (jR0 > 0L ? 1 : (jR0 == 0L ? 0 : -1));
                    if (i27 <= 0) {
                        if (i27 < 0) {
                            i12 = i27;
                            r10 = 0;
                            r10 = 0;
                            TLRPC.Chat chat = do0Var3.getMessagesController().getChat(Long.valueOf(-jR0));
                            if (chat != null) {
                                forcedFirstName = chat.title;
                            }
                        }
                        jQ0 = do0Var3.q0();
                        if (z10) {
                            i13 = R.raw.payment_success;
                        } else if (!z11 || z12) {
                            i13 = R.raw.stars_send;
                        } else {
                            i13 = R.raw.stars_topup;
                        }
                        i14 = i13;
                        if (z10) {
                            if (z12) {
                                i15 = R.string.StarsGiveawaySentPopup;
                            } else if (z11) {
                                i15 = R.string.StarsGiftSentPopup;
                            } else {
                                i15 = R.string.StarsAcquired;
                            }
                            string2 = LocaleController.getString(i15);
                        }
                        str = string2;
                        if (z10) {
                            int i28 = R.string.PaymentInfoHint;
                            String str8 = do0Var3.N0[r10];
                            String str9 = do0Var3.m0;
                            Object[] objArr2 = new Object[2];
                            objArr2[r10] = str8;
                            objArr2[1] = str9;
                            string = LocaleController.formatString(i28, objArr2);
                        } else if (z12) {
                            string = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) jQ0);
                        } else {
                            if (z11) {
                                str2 = "StarsGiftSentPopupInfo";
                            } else {
                                str2 = "StarsAcquiredInfo";
                            }
                            Object[] objArr3 = new Object[1];
                            objArr3[r10] = forcedFirstName;
                            string = LocaleController.formatPluralStringComma(str2, (int) jQ0, objArr3);
                        }
                        spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(string);
                        n2VarU = LaunchActivity.U();
                        if (n2VarU == null) {
                            mcVarA0 = org.telegram.ui.Components.mc.a0(n2VarU);
                            if (i12 == 0 && str != null && !z12) {
                                ecVarQ = mcVarA0.K(i14, str, spannableStringBuilderReplaceTags, LocaleController.getString(R.string.ViewInChat), new hh.v9(jR0, i16));
                            } else if (str != null) {
                                ecVarQ = mcVarA0.M(str, spannableStringBuilderReplaceTags, i14);
                            } else {
                                ecVarQ = mcVarA0.Q(i14, 36, spannableStringBuilderReplaceTags);
                            }
                            ecVar = ecVarQ;
                            ecVar.f28028r = r10;
                            ecVar.f28020j = 5000;
                            if (messageArr[r10] != null) {
                                u1Var = new ag.u1(do0Var3, ecVar, z11, messageArr, 4);
                                jbVar = ecVar.f28016e;
                                if (jbVar != null) {
                                    jbVar.setOnClickListener(u1Var);
                                }
                            }
                            ecVar.k(z12);
                            break;
                        }
                    } else {
                        forcedFirstName = UserObject.getForcedFirstName(do0Var3.getMessagesController().getUser(Long.valueOf(jR0)));
                    }
                    i12 = i27;
                    r10 = 0;
                    jQ0 = do0Var3.q0();
                    if (z10) {
                        i13 = R.raw.payment_success;
                    } else if (z11) {
                        i13 = R.raw.stars_send;
                    } else {
                        i13 = R.raw.stars_send;
                    }
                    i14 = i13;
                    if (z10) {
                        if (z12) {
                            i15 = R.string.StarsGiveawaySentPopup;
                        } else if (z11) {
                            i15 = R.string.StarsGiftSentPopup;
                        } else {
                            i15 = R.string.StarsAcquired;
                        }
                        string2 = LocaleController.getString(i15);
                    }
                    str = string2;
                    if (z10) {
                        int i29 = R.string.PaymentInfoHint;
                        String str10 = do0Var3.N0[r10];
                        String str11 = do0Var3.m0;
                        Object[] objArr4 = new Object[2];
                        objArr4[r10] = str10;
                        objArr4[1] = str11;
                        string = LocaleController.formatString(i29, objArr4);
                    } else if (z12) {
                        string = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) jQ0);
                    } else {
                        if (z11) {
                            str2 = "StarsGiftSentPopupInfo";
                        } else {
                            str2 = "StarsAcquiredInfo";
                        }
                        Object[] objArr5 = new Object[1];
                        objArr5[r10] = forcedFirstName;
                        string = LocaleController.formatPluralStringComma(str2, (int) jQ0, objArr5);
                    }
                    spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(string);
                    n2VarU = LaunchActivity.U();
                    if (n2VarU == null) {
                        mcVarA0 = org.telegram.ui.Components.mc.a0(n2VarU);
                        if (i12 == 0) {
                            if (str != null) {
                                ecVarQ = mcVarA0.M(str, spannableStringBuilderReplaceTags, i14);
                            } else {
                                ecVarQ = mcVarA0.Q(i14, 36, spannableStringBuilderReplaceTags);
                            }
                        } else if (str != null) {
                            ecVarQ = mcVarA0.M(str, spannableStringBuilderReplaceTags, i14);
                        } else {
                            ecVarQ = mcVarA0.Q(i14, 36, spannableStringBuilderReplaceTags);
                        }
                        ecVar = ecVarQ;
                        ecVar.f28028r = r10;
                        ecVar.f28020j = 5000;
                        if (messageArr[r10] != null) {
                            u1Var = new ag.u1(do0Var3, ecVar, z11, messageArr, 4);
                            jbVar = ecVar.f28016e;
                            if (jbVar != null) {
                                jbVar.setOnClickListener(u1Var);
                            }
                        }
                        ecVar.k(z12);
                        break;
                    }
                }
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f38119b;
                c31.T(photoViewer.A, photoViewer.f35661i4, false, (jh.b) this.f38120c, null);
                break;
            case 23:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f38119b;
                es0 es0Var = (es0) this.f38120c;
                Drawable[] drawableArr = PhotoViewer.P8;
                if (es0Var.getWindow() != null) {
                    es0Var.setFocusable(true);
                    rn rnVar = photoViewer2.f35652h4;
                    if (rnVar != null && (ckVar = rnVar.U) != null) {
                        ckVar.m0(false);
                        break;
                    }
                }
                break;
            case 24:
                gh.b1 b1Var = (gh.b1) this.f38119b;
                Bitmap bitmap = (Bitmap) this.f38120c;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                b1Var.run(bitmap);
                break;
            case 25:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f38119b;
                zf.v0 v0Var = (zf.v0) this.f38120c;
                Drawable[] drawableArr3 = PhotoViewer.P8;
                v0Var.f50726e.h();
                v0Var.f50725c.postRunnable(new tq0(19));
                photoViewer3.f35583a0.removeView(photoViewer3.J1);
                break;
            case 26:
                org.telegram.ui.Components.x5 x5Var = (org.telegram.ui.Components.x5) this.f38119b;
                Bitmap bitmap2 = (Bitmap) this.f38120c;
                Drawable[] drawableArr4 = PhotoViewer.P8;
                if (x5Var != null) {
                    ArrayList arrayList = x5Var.h;
                    org.telegram.ui.Components.u5 u5Var = x5Var.f34484n;
                    if (u5Var != null) {
                        arrayList.add(u5Var);
                    }
                    org.telegram.ui.Components.u5 u5Var2 = x5Var.f34489r;
                    if (u5Var2 != null) {
                        arrayList.add(u5Var2);
                    }
                    org.telegram.ui.Components.u5 u5Var3 = x5Var.f34491s;
                    if (u5Var3 != null) {
                        arrayList.add(u5Var3);
                    }
                    x5Var.f34484n = new org.telegram.ui.Components.u5(bitmap2);
                    x5Var.f34489r = null;
                    x5Var.f34491s = null;
                    x5Var.t();
                    break;
                }
                break;
            case 27:
                fr0 fr0Var = (fr0) this.f38119b;
                View view2 = (View) this.f38120c;
                fr0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = fr0Var.f38198c;
                ImageView imageView = photoViewer4.f35758t3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                tt0 tt0Var = photoViewer4.A2;
                if (tt0Var != null) {
                    tt0Var.setOutlineProvider(null);
                }
                break;
            case 28:
                ps0 ps0Var = (ps0) this.f38119b;
                org.telegram.ui.Components.m61 m61Var = (org.telegram.ui.Components.m61) this.f38120c;
                ps0Var.getClass();
                if (m61Var.q() > 0 && m61Var.o() >= m61Var.q() - 590) {
                    ps0Var.f41425a.f35583a0.invalidate();
                }
                break;
            default:
                ts0 ts0Var = (ts0) this.f38119b;
                zf.v0 v0Var2 = (zf.v0) this.f38120c;
                v0Var2.f50726e.h();
                v0Var2.f50725c.postRunnable(new tq0(19));
                try {
                    ts0Var.f43003b.f35583a0.removeView(v0Var2);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                break;
        }
    }
}
