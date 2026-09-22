package org.telegram.ui;

import android.animation.AnimatorSet;
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
import org.telegram.tgnet.tl.TL_stats;
public final class fj0 implements Runnable {
    public final int f33685a;
    public final Object f33686b;
    public final Object f33687c;

    public fj0(int i10, Object obj, Object obj2) {
        this.f33685a = i10;
        this.f33686b = obj;
        this.f33687c = obj2;
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
        wo0 wo0Var;
        wo0 wo0Var2;
        mk mkVar;
        String str2 = "";
        switch (this.f33685a) {
            case 0:
                mj0 mj0Var = (mj0) this.f33686b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f33687c;
                if (mj0Var.getParentActivity() != null) {
                    Toast.makeText(mj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 1:
                fk0 fk0Var = (fk0) this.f33686b;
                fk0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f33687c)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                fk0Var.getContext().startActivity(intent);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) this.f33687c;
                ((fk0) this.f33686b).dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.f18490id));
                    return;
                }
                return;
            case 3:
                ((pj0) this.f33686b).run((TLRPC.User) this.f33687c);
                return;
            case 4:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.f33686b, (ArrayList) this.f33687c);
                return;
            case 5:
                Runnable runnable = (Runnable) this.f33687c;
                for (gs gsVar : ((PasscodeActivity) this.f33686b).f31193n.f33145f) {
                    gsVar.l(0.0f);
                }
                runnable.run();
                return;
            case 6:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f33687c;
                PasscodeActivity passcodeActivity = ((ql0) this.f33686b).f36956b;
                if (passcodeActivity.f31198y == 0) {
                    i10 = R.string.PasscodeSwitchToPassword;
                } else {
                    i10 = R.string.PasscodeSwitchToPIN;
                }
                f1Var.setText(LocaleController.getString(i10));
                if (passcodeActivity.f31198y == 0) {
                    i11 = R.drawable.msg_permissions;
                } else {
                    i11 = R.drawable.msg_pin_code;
                }
                f1Var.setIcon(i11);
                passcodeActivity.k0();
                if (passcodeActivity.e0()) {
                    passcodeActivity.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f31195s, true, 0.1f, false);
                    return;
                }
                return;
            case 7:
                ((PasskeysActivity) this.f33686b).Y((TL_account.Passkey) this.f33687c);
                return;
            case 8:
                pn0 pn0Var = (pn0) this.f33686b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f33687c;
                int[] iArr = pn0Var.f36676x;
                int i16 = result.type;
                if (i16 == 2) {
                    if (!(pn0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = pn0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) pn0Var.G.get(i17);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    pn0Var.F = tL_secureRequiredType;
                                    pn0Var.P1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i16 == 1) {
                    if (!(pn0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = pn0Var.G.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) pn0Var.G.get(i18);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    pn0Var.F = tL_secureRequiredType2;
                                    pn0Var.P1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i16 == 3) {
                    if (!(pn0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = pn0Var.G.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) pn0Var.G.get(i19);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    pn0Var.F = tL_secureRequiredType3;
                                    pn0Var.P1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i16 == 4 && !(pn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = pn0Var.G.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) pn0Var.G.get(i20);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                pn0Var.F = tL_secureRequiredType4;
                                pn0Var.P1();
                            } else {
                                i20++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    pn0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    pn0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    pn0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    pn0Var.Y[7].setText(result.number);
                }
                int i21 = result.gender;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            pn0Var.f36673w = "female";
                            pn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        }
                    } else {
                        pn0Var.f36673w = "male";
                        pn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    pn0Var.f36664s = str3;
                    String str4 = (String) pn0Var.Y0.get(str3);
                    if (str4 != null) {
                        pn0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    pn0Var.v = str5;
                    String str6 = (String) pn0Var.Y0.get(str5);
                    if (str6 != null) {
                        pn0Var.Y[6].setText(str6);
                    }
                }
                int i22 = result.birthDay;
                if (i22 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    pn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i23 = result.expiryDay;
                if (i23 > 0 && (i12 = result.expiryMonth) > 0 && (i13 = result.expiryYear) > 0) {
                    iArr[0] = i13;
                    iArr[1] = i12;
                    iArr[2] = i23;
                    pn0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i23), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                pn0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 9:
                pn0 pn0Var2 = (pn0) this.f33686b;
                TLObject tLObject = (TLObject) this.f33687c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    pn0Var2.J = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.d5.x0(pn0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TwoStepVerificationActivity.m0(pn0Var2.J);
                    pn0Var2.R1();
                    if (pn0Var2.Z[0].getVisibility() == 0) {
                        pn0Var2.Y[0].requestFocus();
                        AndroidUtilities.showKeyboard(pn0Var2.Y[0]);
                    }
                    if (pn0Var2.N0 == 1) {
                        pn0Var2.B1(true);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                pn0 pn0Var3 = (pn0) this.f33686b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f33687c;
                if (tL_error == null) {
                    pn0Var3.f36639f1 = true;
                    pn0Var3.W0(true);
                    pn0Var3.finishFragment();
                    return;
                }
                pn0Var3.N1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.d5.x0(pn0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    return;
                } else {
                    pn0Var3.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 11:
                ((kn0) this.f33686b).f35232a.K = ((TLRPC.TL_error) this.f33687c).text;
                return;
            case 12:
                ((xo0) this.f33686b).D0(false);
                ((View) this.f33687c).callOnClick();
                return;
            case 13:
                xo0 xo0Var = (xo0) this.f33686b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f33687c;
                xo0Var.H0(true, false);
                if (tL_error2 == null) {
                    if (xo0Var.getParentActivity() != null) {
                        un0 un0Var = xo0Var.f39672d0;
                        if (un0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(un0Var);
                            xo0Var.f39672d0 = null;
                        }
                        xo0Var.t0();
                        return;
                    }
                    return;
                } else if (tL_error2.text.startsWith("CODE_INVALID")) {
                    org.telegram.ui.Cells.l3 l3Var = xo0Var.S;
                    try {
                        l3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeViewSpring(l3Var, 2.5f);
                    org.telegram.ui.Cells.l3 l3Var2 = xo0Var.S;
                    l3Var2.f20606a.setText("");
                    l3Var2.f20607b = false;
                    l3Var2.setWillNotDraw(true);
                    return;
                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    xo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    xo0Var.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                    return;
                }
            case 14:
                xo0.W((xo0) this.f33686b, (TLRPC.TL_payments_validatedRequestedInfo) this.f33687c);
                return;
            case 15:
                xo0 xo0Var2 = (xo0) this.f33686b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.f33687c;
                Context parentActivity = xo0Var2.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity != null) {
                    xo0Var2.f39665a1 = true;
                    xo0Var2.f39678f1 = 1;
                    TLRPC.InputInvoice inputInvoice = xo0Var2.f39668b1;
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
                    if (!z12 && (wo0Var2 = xo0Var2.Z0) != null) {
                        wo0Var2.a(1);
                    }
                    xo0Var2.t0();
                    if (z12 && (wo0Var = xo0Var2.Z0) != null) {
                        wo0Var.a(xo0Var2.f39678f1);
                    }
                    long r02 = xo0Var2.r0();
                    int i24 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                    if (i24 > 0) {
                        str2 = UserObject.getForcedFirstName(xo0Var2.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (i24 < 0 && (chat = xo0Var2.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str2 = chat.title;
                    }
                    long q02 = xo0Var2.q0();
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
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, xo0Var2.R0[0], xo0Var2.f39689q0);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(U2);
                        if (i24 != 0 && string != null && !z11) {
                            Q = a02.K(i25, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new yn0(r02, 0));
                        } else {
                            String str7 = string;
                            if (str7 != null) {
                                Q = a02.M(str7, replaceTags, i25);
                            } else {
                                Q = a02.Q(i25, 36, replaceTags);
                            }
                        }
                        org.telegram.ui.Components.pc pcVar = Q;
                        pcVar.f27319r = false;
                        pcVar.f27311j = 5000;
                        if (messageArr[0] != null) {
                            ai.m5 m5Var = new ai.m5(xo0Var2, pcVar, z10, messageArr, 3);
                            org.telegram.ui.Components.tb tbVar = pcVar.e;
                            if (tbVar != null) {
                                tbVar.setOnClickListener(m5Var);
                            }
                        }
                        pcVar.k(z11);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                PhotoViewer photoViewer = (PhotoViewer) this.f33686b;
                i41.T(photoViewer.E, photoViewer.f31313m4, false, (ai.d) this.f33687c, null);
                return;
            case 17:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f33686b;
                gt0 gt0Var = (gt0) this.f33687c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (gt0Var.getWindow() != null) {
                    gt0Var.setFocusable(true);
                    zn znVar = photoViewer2.l4;
                    if (znVar != null && (mkVar = znVar.Y) != null) {
                        mkVar.m0(false);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                ((org.telegram.messenger.f2) this.f33686b).run((Bitmap) this.f33687c);
                return;
            case 19:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f33686b;
                qg.x0 x0Var = (qg.x0) this.f33687c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                x0Var.e.h();
                x0Var.f42019c.postRunnable(new u21(12));
                photoViewer3.f31242e0.removeView(photoViewer3.N1);
                return;
            case 20:
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.f33686b;
                Bitmap bitmap = (Bitmap) this.f33687c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (c6Var != null) {
                    ArrayList arrayList = c6Var.h;
                    org.telegram.ui.Components.z5 z5Var = c6Var.f23202n;
                    if (z5Var != null) {
                        arrayList.add(z5Var);
                    }
                    org.telegram.ui.Components.z5 z5Var2 = c6Var.f23207r;
                    if (z5Var2 != null) {
                        arrayList.add(z5Var2);
                    }
                    org.telegram.ui.Components.z5 z5Var3 = c6Var.f23209s;
                    if (z5Var3 != null) {
                        arrayList.add(z5Var3);
                    }
                    c6Var.f23202n = new org.telegram.ui.Components.z5(bitmap);
                    c6Var.f23207r = null;
                    c6Var.f23209s = null;
                    c6Var.t();
                    return;
                }
                return;
            case 21:
                hs0 hs0Var = (hs0) this.f33686b;
                hs0Var.getClass();
                ((View) this.f33687c).setOutlineProvider(null);
                PhotoViewer photoViewer4 = hs0Var.f34299c;
                ImageView imageView = photoViewer4.f31414x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                uu0 uu0Var = photoViewer4.E2;
                if (uu0Var != null) {
                    uu0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 22:
                rt0 rt0Var = (rt0) this.f33686b;
                org.telegram.ui.Components.v71 v71Var = (org.telegram.ui.Components.v71) this.f33687c;
                rt0Var.getClass();
                if (v71Var.p() > 0 && v71Var.n() >= v71Var.p() - 590) {
                    rt0Var.f37247a.f31242e0.invalidate();
                    return;
                }
                return;
            case 23:
                vt0 vt0Var = (vt0) this.f33686b;
                qg.x0 x0Var2 = (qg.x0) this.f33687c;
                x0Var2.e.h();
                x0Var2.f42019c.postRunnable(new u21(12));
                try {
                    vt0Var.f38622b.f31242e0.removeView(x0Var2);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 24:
                ci.n6 n6Var = (ci.n6) this.f33687c;
                PhotoViewer photoViewer5 = ((at0) this.f33686b).f32176b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.f31414x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.f31414x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) n6Var.f5073b).setImageBitmap(photoViewer5.C3);
                    return;
                }
                return;
            case 25:
                ((fu0) this.f33686b).f33756r.f31308l7.lock();
                ((AnimatorSet) this.f33687c).start();
                return;
            case 26:
                dv0 dv0Var = (dv0) this.f33687c;
                ((fu0) this.f33686b).f33756r.f31368s4 = false;
                if (!dv0Var.f33178s) {
                    dv0Var.f33163a.setVisible(false, true);
                    return;
                }
                return;
            case 27:
                mw0 mw0Var = (mw0) this.f33686b;
                mw0Var.getClass();
                AndroidUtilities.addToClipboard((String) this.f33687c);
                mw0Var.c(true);
                return;
            case 28:
                mw0 mw0Var2 = (mw0) this.f33686b;
                mw0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) this.f33687c).text, false));
                mw0Var2.c(true);
                return;
            default:
                mw0 mw0Var3 = (mw0) this.f33686b;
                SendMessagesHelper.getInstance(mw0Var3.H.currentAccount).deletePollOption(mw0Var3.H, (byte[]) this.f33687c);
                mw0Var3.c(true);
                return;
        }
    }
}
