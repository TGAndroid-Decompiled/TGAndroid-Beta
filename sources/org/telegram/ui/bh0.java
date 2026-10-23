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
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
public final class bh0 implements Runnable {
    public final int f36103a;
    public final Object f36104b;
    public final Object f36105c;

    public bh0(int i10, Object obj, Object obj2) {
        this.f36103a = i10;
        this.f36104b = obj;
        this.f36105c = obj2;
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
        ho0 ho0Var;
        ho0 ho0Var2;
        gk gkVar;
        String str2 = "";
        switch (this.f36103a) {
            case 0:
                mh0 mh0Var = ((ch0) this.f36104b).f36365a;
                dh0 g02 = mh0Var.g0();
                mh0Var.f39588i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f36105c));
                TLRPC.ChatFull chatFull = mh0Var.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    mh0Var.getMessagesStorage().saveChatLinksCount(mh0Var.f39592n, mh0Var.d.invitesCount);
                }
                mh0Var.i0(g02);
                return;
            case 1:
                yi0 yi0Var = (yi0) this.f36104b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f36105c;
                if (yi0Var.getParentActivity() != null) {
                    Toast.makeText(yi0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 2:
                rj0 rj0Var = (rj0) this.f36104b;
                rj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f36105c)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                rj0Var.getContext().startActivity(intent);
                return;
            case 3:
                TLRPC.User user = (TLRPC.User) this.f36105c;
                ((rj0) this.f36104b).dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.o4(user.f20490id));
                    return;
                }
                return;
            case 4:
                ((org.telegram.ui.Components.qy) this.f36104b).run((TLRPC.User) this.f36105c);
                return;
            case 5:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.f36104b, (ArrayList) this.f36105c);
                return;
            case 6:
                ((org.telegram.ui.ActionBar.h3[]) this.f36104b)[0] = null;
                xk0.f43614a = null;
                ((boolean[]) this.f36105c)[0] = true;
                return;
            case 7:
                Runnable runnable = (Runnable) this.f36105c;
                for (vr vrVar : ((PasscodeActivity) this.f36104b).f33531n.f41793f) {
                    vrVar.l(0.0f);
                }
                runnable.run();
                return;
            case 8:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f36105c;
                PasscodeActivity passcodeActivity = ((cl0) this.f36104b).f36390b;
                if (passcodeActivity.f33536y == 0) {
                    i10 = R.string.PasscodeSwitchToPassword;
                } else {
                    i10 = R.string.PasscodeSwitchToPIN;
                }
                e1Var.setText(LocaleController.getString(i10));
                if (passcodeActivity.f33536y == 0) {
                    i11 = R.drawable.msg_permissions;
                } else {
                    i11 = R.drawable.msg_pin_code;
                }
                e1Var.setIcon(i11);
                passcodeActivity.n0();
                if (passcodeActivity.h0()) {
                    passcodeActivity.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33533s, true, 0.1f, false);
                    return;
                }
                return;
            case 9:
                ((PasskeysActivity) this.f36104b).Y((TL_account.Passkey) this.f36105c);
                return;
            case 10:
                an0 an0Var = (an0) this.f36104b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f36105c;
                int[] iArr = an0Var.f35753x;
                int i16 = result.type;
                if (i16 == 2) {
                    if (!(an0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = an0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) an0Var.G.get(i17);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    an0Var.F = tL_secureRequiredType;
                                    an0Var.P1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i16 == 1) {
                    if (!(an0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = an0Var.G.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) an0Var.G.get(i18);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    an0Var.F = tL_secureRequiredType2;
                                    an0Var.P1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i16 == 3) {
                    if (!(an0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = an0Var.G.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) an0Var.G.get(i19);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    an0Var.F = tL_secureRequiredType3;
                                    an0Var.P1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i16 == 4 && !(an0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = an0Var.G.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) an0Var.G.get(i20);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                an0Var.F = tL_secureRequiredType4;
                                an0Var.P1();
                            } else {
                                i20++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    an0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    an0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    an0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    an0Var.Y[7].setText(result.number);
                }
                int i21 = result.gender;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            an0Var.f35750w = "female";
                            an0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        }
                    } else {
                        an0Var.f35750w = "male";
                        an0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    an0Var.f35741s = str3;
                    String str4 = (String) an0Var.Y0.get(str3);
                    if (str4 != null) {
                        an0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    an0Var.v = str5;
                    String str6 = (String) an0Var.Y0.get(str5);
                    if (str6 != null) {
                        an0Var.Y[6].setText(str6);
                    }
                }
                int i22 = result.birthDay;
                if (i22 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    an0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i23 = result.expiryDay;
                if (i23 > 0 && (i12 = result.expiryMonth) > 0 && (i13 = result.expiryYear) > 0) {
                    iArr[0] = i13;
                    iArr[1] = i12;
                    iArr[2] = i23;
                    an0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i23), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                an0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 11:
                an0 an0Var2 = (an0) this.f36104b;
                TLObject tLObject = (TLObject) this.f36105c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    an0Var2.J = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.f5.x0(an0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TwoStepVerificationActivity.m0(an0Var2.J);
                    an0Var2.R1();
                    if (an0Var2.Z[0].getVisibility() == 0) {
                        an0Var2.Y[0].requestFocus();
                        AndroidUtilities.showKeyboard(an0Var2.Y[0]);
                    }
                    if (an0Var2.N0 == 1) {
                        an0Var2.A1(true);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                an0 an0Var3 = (an0) this.f36104b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f36105c;
                if (tL_error == null) {
                    an0Var3.f35716f1 = true;
                    an0Var3.V0(true);
                    an0Var3.finishFragment();
                    return;
                }
                an0Var3.M1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.f5.x0(an0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    return;
                } else {
                    an0Var3.L1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 13:
                ((vm0) this.f36104b).f42791a.K = ((TLRPC.TL_error) this.f36105c).text;
                return;
            case 14:
                ((io0) this.f36104b).D0(false);
                ((View) this.f36105c).callOnClick();
                return;
            case 15:
                io0 io0Var = (io0) this.f36104b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f36105c;
                io0Var.H0(true, false);
                if (tL_error2 == null) {
                    if (io0Var.getParentActivity() != null) {
                        fn0 fn0Var = io0Var.f38296d0;
                        if (fn0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(fn0Var);
                            io0Var.f38296d0 = null;
                        }
                        io0Var.t0();
                        return;
                    }
                    return;
                } else if (tL_error2.text.startsWith("CODE_INVALID")) {
                    org.telegram.ui.Cells.i3 i3Var = io0Var.S;
                    try {
                        i3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeViewSpring(i3Var, 2.5f);
                    org.telegram.ui.Cells.i3 i3Var2 = io0Var.S;
                    i3Var2.f22488a.setText("");
                    i3Var2.f22489b = false;
                    i3Var2.setWillNotDraw(true);
                    return;
                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    io0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    io0Var.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                    return;
                }
            case 16:
                io0.W((io0) this.f36104b, (TLRPC.TL_payments_validatedRequestedInfo) this.f36105c);
                return;
            case 17:
                io0 io0Var2 = (io0) this.f36104b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.f36105c;
                Context parentActivity = io0Var2.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.J1;
                }
                if (parentActivity != null) {
                    io0Var2.f38289a1 = true;
                    io0Var2.f38302f1 = 1;
                    TLRPC.InputInvoice inputInvoice = io0Var2.f38292b1;
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
                    if (!z12 && (ho0Var2 = io0Var2.Z0) != null) {
                        ho0Var2.a(1);
                    }
                    io0Var2.t0();
                    if (z12 && (ho0Var = io0Var2.Z0) != null) {
                        ho0Var.a(io0Var2.f38302f1);
                    }
                    long r02 = io0Var2.r0();
                    int i24 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                    if (i24 > 0) {
                        str2 = UserObject.getForcedFirstName(io0Var2.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (i24 < 0 && (chat = io0Var2.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str2 = chat.title;
                    }
                    long q02 = io0Var2.q0();
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
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, io0Var2.R0[0], io0Var2.f38313q0);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(U2);
                        if (i24 != 0 && string != null && !z11) {
                            Q = a02.K(i25, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new ai.o4(r02, 2));
                        } else {
                            String str7 = string;
                            if (str7 != null) {
                                Q = a02.M(str7, replaceTags, i25);
                            } else {
                                Q = a02.Q(i25, 36, replaceTags);
                            }
                        }
                        org.telegram.ui.Components.qc qcVar = Q;
                        qcVar.f29840r = false;
                        qcVar.f29832j = 5000;
                        if (messageArr[0] != null) {
                            ci.y3 y3Var = new ci.y3(io0Var2, qcVar, z10, messageArr, 3);
                            org.telegram.ui.Components.ub ubVar = qcVar.e;
                            if (ubVar != null) {
                                ubVar.setOnClickListener(y3Var);
                            }
                        }
                        qcVar.k(z11);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                PhotoViewer photoViewer = (PhotoViewer) this.f36104b;
                x21.T(photoViewer.E, photoViewer.f33652m4, false, (ci.b) this.f36105c, null);
                return;
            case 19:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f36104b;
                ps0 ps0Var = (ps0) this.f36105c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (ps0Var.getWindow() != null) {
                    ps0Var.setFocusable(true);
                    sn snVar = photoViewer2.l4;
                    if (snVar != null && (gkVar = snVar.Y) != null) {
                        gkVar.j0(false);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                ((ai.x2) this.f36104b).run((Bitmap) this.f36105c);
                return;
            case 21:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f36104b;
                rg.w0 w0Var = (rg.w0) this.f36105c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                w0Var.e.h();
                w0Var.f46103c.postRunnable(new if0(19));
                photoViewer3.f33580e0.removeView(photoViewer3.N1);
                return;
            case 22:
                org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) this.f36104b;
                Bitmap bitmap = (Bitmap) this.f36105c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (e6Var != null) {
                    ArrayList arrayList = e6Var.h;
                    org.telegram.ui.Components.b6 b6Var = e6Var.f25878n;
                    if (b6Var != null) {
                        arrayList.add(b6Var);
                    }
                    org.telegram.ui.Components.b6 b6Var2 = e6Var.f25883r;
                    if (b6Var2 != null) {
                        arrayList.add(b6Var2);
                    }
                    org.telegram.ui.Components.b6 b6Var3 = e6Var.f25885s;
                    if (b6Var3 != null) {
                        arrayList.add(b6Var3);
                    }
                    e6Var.f25878n = new org.telegram.ui.Components.b6(bitmap);
                    e6Var.f25883r = null;
                    e6Var.f25885s = null;
                    e6Var.t();
                    return;
                }
                return;
            case 23:
                qr0 qr0Var = (qr0) this.f36104b;
                qr0Var.getClass();
                ((View) this.f36105c).setOutlineProvider(null);
                PhotoViewer photoViewer4 = qr0Var.f40911c;
                ImageView imageView = photoViewer4.f33753x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                du0 du0Var = photoViewer4.E2;
                if (du0Var != null) {
                    du0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 24:
                at0 at0Var = (at0) this.f36104b;
                org.telegram.ui.Components.j81 j81Var = (org.telegram.ui.Components.j81) this.f36105c;
                at0Var.getClass();
                if (j81Var.p() > 0 && j81Var.n() >= j81Var.p() - 590) {
                    at0Var.f35777a.f33580e0.invalidate();
                    return;
                }
                return;
            case 25:
                et0 et0Var = (et0) this.f36104b;
                rg.w0 w0Var2 = (rg.w0) this.f36105c;
                w0Var2.e.h();
                w0Var2.f46103c.postRunnable(new if0(19));
                try {
                    et0Var.f37024b.f33580e0.removeView(w0Var2);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 26:
                ah.v vVar = (ah.v) this.f36105c;
                PhotoViewer photoViewer5 = ((js0) this.f36104b).f38697b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.f33753x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.f33753x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) vVar.f895b).setImageBitmap(photoViewer5.C3);
                    return;
                }
                return;
            case 27:
                ((ot0) this.f36104b).f40266r.f33647l7.lock();
                ((AnimatorSet) this.f36105c).start();
                return;
            case 28:
                mu0 mu0Var = (mu0) this.f36105c;
                ((ot0) this.f36104b).f40266r.f33707s4 = false;
                if (!mu0Var.f39707s) {
                    mu0Var.f39692a.setVisible(false, true);
                    return;
                }
                return;
            default:
                uv0 uv0Var = (uv0) this.f36104b;
                uv0Var.getClass();
                AndroidUtilities.addToClipboard((String) this.f36105c);
                uv0Var.c(true);
                return;
        }
    }
}
