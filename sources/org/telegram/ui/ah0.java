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
public final class ah0 implements Runnable {
    public final int f35780a;
    public final Object f35781b;
    public final Object f35782c;

    public ah0(int i10, Object obj, Object obj2) {
        this.f35780a = i10;
        this.f35781b = obj;
        this.f35782c = obj2;
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
        org.telegram.ui.Components.oc Q;
        String str;
        go0 go0Var;
        go0 go0Var2;
        gk gkVar;
        String str2 = "";
        switch (this.f35780a) {
            case 0:
                lh0 lh0Var = ((bh0) this.f35781b).f36075a;
                ch0 g02 = lh0Var.g0();
                lh0Var.f39283i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f35782c));
                TLRPC.ChatFull chatFull = lh0Var.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    lh0Var.getMessagesStorage().saveChatLinksCount(lh0Var.f39287n, lh0Var.d.invitesCount);
                }
                lh0Var.i0(g02);
                return;
            case 1:
                xi0 xi0Var = (xi0) this.f35781b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f35782c;
                if (xi0Var.getParentActivity() != null) {
                    Toast.makeText(xi0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 2:
                qj0 qj0Var = (qj0) this.f35781b;
                qj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f35782c)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                qj0Var.getContext().startActivity(intent);
                return;
            case 3:
                TLRPC.User user = (TLRPC.User) this.f35782c;
                ((qj0) this.f35781b).dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.o4(user.f20491id));
                    return;
                }
                return;
            case 4:
                ((org.telegram.ui.Components.oy) this.f35781b).run((TLRPC.User) this.f35782c);
                return;
            case 5:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.f35781b, (ArrayList) this.f35782c);
                return;
            case 6:
                ((org.telegram.ui.ActionBar.h3[]) this.f35781b)[0] = null;
                wk0.f43370a = null;
                ((boolean[]) this.f35782c)[0] = true;
                return;
            case 7:
                Runnable runnable = (Runnable) this.f35782c;
                for (vr vrVar : ((PasscodeActivity) this.f35781b).f33533n.f41792f) {
                    vrVar.l(0.0f);
                }
                runnable.run();
                return;
            case 8:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f35782c;
                PasscodeActivity passcodeActivity = ((bl0) this.f35781b).f36095b;
                if (passcodeActivity.f33538y == 0) {
                    i10 = R.string.PasscodeSwitchToPassword;
                } else {
                    i10 = R.string.PasscodeSwitchToPIN;
                }
                e1Var.setText(LocaleController.getString(i10));
                if (passcodeActivity.f33538y == 0) {
                    i11 = R.drawable.msg_permissions;
                } else {
                    i11 = R.drawable.msg_pin_code;
                }
                e1Var.setIcon(i11);
                passcodeActivity.n0();
                if (passcodeActivity.h0()) {
                    passcodeActivity.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33535s, true, 0.1f, false);
                    return;
                }
                return;
            case 9:
                ((PasskeysActivity) this.f35781b).Y((TL_account.Passkey) this.f35782c);
                return;
            case 10:
                zm0 zm0Var = (zm0) this.f35781b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f35782c;
                int[] iArr = zm0Var.f44176x;
                int i16 = result.type;
                if (i16 == 2) {
                    if (!(zm0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = zm0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) zm0Var.G.get(i17);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    zm0Var.F = tL_secureRequiredType;
                                    zm0Var.P1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i16 == 1) {
                    if (!(zm0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = zm0Var.G.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) zm0Var.G.get(i18);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    zm0Var.F = tL_secureRequiredType2;
                                    zm0Var.P1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i16 == 3) {
                    if (!(zm0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = zm0Var.G.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) zm0Var.G.get(i19);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    zm0Var.F = tL_secureRequiredType3;
                                    zm0Var.P1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i16 == 4 && !(zm0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = zm0Var.G.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) zm0Var.G.get(i20);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                zm0Var.F = tL_secureRequiredType4;
                                zm0Var.P1();
                            } else {
                                i20++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    zm0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    zm0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    zm0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    zm0Var.Y[7].setText(result.number);
                }
                int i21 = result.gender;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            zm0Var.f44173w = "female";
                            zm0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        }
                    } else {
                        zm0Var.f44173w = "male";
                        zm0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    zm0Var.f44164s = str3;
                    String str4 = (String) zm0Var.Y0.get(str3);
                    if (str4 != null) {
                        zm0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    zm0Var.v = str5;
                    String str6 = (String) zm0Var.Y0.get(str5);
                    if (str6 != null) {
                        zm0Var.Y[6].setText(str6);
                    }
                }
                int i22 = result.birthDay;
                if (i22 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    zm0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i23 = result.expiryDay;
                if (i23 > 0 && (i12 = result.expiryMonth) > 0 && (i13 = result.expiryYear) > 0) {
                    iArr[0] = i13;
                    iArr[1] = i12;
                    iArr[2] = i23;
                    zm0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i23), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                zm0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 11:
                zm0 zm0Var2 = (zm0) this.f35781b;
                TLObject tLObject = (TLObject) this.f35782c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    zm0Var2.J = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.d5.w0(zm0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TwoStepVerificationActivity.m0(zm0Var2.J);
                    zm0Var2.R1();
                    if (zm0Var2.Z[0].getVisibility() == 0) {
                        zm0Var2.Y[0].requestFocus();
                        AndroidUtilities.showKeyboard(zm0Var2.Y[0]);
                    }
                    if (zm0Var2.N0 == 1) {
                        zm0Var2.A1(true);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                zm0 zm0Var3 = (zm0) this.f35781b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f35782c;
                if (tL_error == null) {
                    zm0Var3.f44139f1 = true;
                    zm0Var3.V0(true);
                    zm0Var3.finishFragment();
                    return;
                }
                zm0Var3.M1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.d5.w0(zm0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    return;
                } else {
                    zm0Var3.L1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 13:
                ((um0) this.f35781b).f42453a.K = ((TLRPC.TL_error) this.f35782c).text;
                return;
            case 14:
                ((ho0) this.f35781b).D0(false);
                ((View) this.f35782c).callOnClick();
                return;
            case 15:
                ho0 ho0Var = (ho0) this.f35781b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f35782c;
                ho0Var.H0(true, false);
                if (tL_error2 == null) {
                    if (ho0Var.getParentActivity() != null) {
                        en0 en0Var = ho0Var.f37923d0;
                        if (en0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(en0Var);
                            ho0Var.f37923d0 = null;
                        }
                        ho0Var.t0();
                        return;
                    }
                    return;
                } else if (tL_error2.text.startsWith("CODE_INVALID")) {
                    org.telegram.ui.Cells.i3 i3Var = ho0Var.S;
                    try {
                        i3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeViewSpring(i3Var, 2.5f);
                    org.telegram.ui.Cells.i3 i3Var2 = ho0Var.S;
                    i3Var2.f22489a.setText("");
                    i3Var2.f22490b = false;
                    i3Var2.setWillNotDraw(true);
                    return;
                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    ho0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    ho0Var.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                    return;
                }
            case 16:
                ho0.W((ho0) this.f35781b, (TLRPC.TL_payments_validatedRequestedInfo) this.f35782c);
                return;
            case 17:
                ho0 ho0Var2 = (ho0) this.f35781b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.f35782c;
                Context parentActivity = ho0Var2.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.I1;
                }
                if (parentActivity != null) {
                    ho0Var2.f37916a1 = true;
                    ho0Var2.f37929f1 = 1;
                    TLRPC.InputInvoice inputInvoice = ho0Var2.f37919b1;
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
                    if (!z12 && (go0Var2 = ho0Var2.Z0) != null) {
                        go0Var2.a(1);
                    }
                    ho0Var2.t0();
                    if (z12 && (go0Var = ho0Var2.Z0) != null) {
                        go0Var.a(ho0Var2.f37929f1);
                    }
                    long r02 = ho0Var2.r0();
                    int i24 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                    if (i24 > 0) {
                        str2 = UserObject.getForcedFirstName(ho0Var2.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (i24 < 0 && (chat = ho0Var2.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str2 = chat.title;
                    }
                    long q02 = ho0Var2.q0();
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
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, ho0Var2.R0[0], ho0Var2.f37940q0);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(U2);
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
                        org.telegram.ui.Components.oc ocVar = Q;
                        ocVar.f29211r = false;
                        ocVar.f29203j = 5000;
                        if (messageArr[0] != null) {
                            ci.y3 y3Var = new ci.y3(ho0Var2, ocVar, z10, messageArr, 3);
                            org.telegram.ui.Components.sb sbVar = ocVar.e;
                            if (sbVar != null) {
                                sbVar.setOnClickListener(y3Var);
                            }
                        }
                        ocVar.k(z11);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                PhotoViewer photoViewer = (PhotoViewer) this.f35781b;
                w21.T(photoViewer.E, photoViewer.f33654m4, false, (ci.b) this.f35782c, null);
                return;
            case 19:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f35781b;
                os0 os0Var = (os0) this.f35782c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (os0Var.getWindow() != null) {
                    os0Var.setFocusable(true);
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
                ((ai.x2) this.f35781b).run((Bitmap) this.f35782c);
                return;
            case 21:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f35781b;
                rg.w0 w0Var = (rg.w0) this.f35782c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                w0Var.e.h();
                w0Var.f46102c.postRunnable(new hf0(19));
                photoViewer3.f33582e0.removeView(photoViewer3.N1);
                return;
            case 22:
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.f35781b;
                Bitmap bitmap = (Bitmap) this.f35782c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (c6Var != null) {
                    ArrayList arrayList = c6Var.h;
                    org.telegram.ui.Components.z5 z5Var = c6Var.f25214n;
                    if (z5Var != null) {
                        arrayList.add(z5Var);
                    }
                    org.telegram.ui.Components.z5 z5Var2 = c6Var.f25219r;
                    if (z5Var2 != null) {
                        arrayList.add(z5Var2);
                    }
                    org.telegram.ui.Components.z5 z5Var3 = c6Var.f25221s;
                    if (z5Var3 != null) {
                        arrayList.add(z5Var3);
                    }
                    c6Var.f25214n = new org.telegram.ui.Components.z5(bitmap);
                    c6Var.f25219r = null;
                    c6Var.f25221s = null;
                    c6Var.t();
                    return;
                }
                return;
            case 23:
                pr0 pr0Var = (pr0) this.f35781b;
                pr0Var.getClass();
                ((View) this.f35782c).setOutlineProvider(null);
                PhotoViewer photoViewer4 = pr0Var.f40626c;
                ImageView imageView = photoViewer4.f33755x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                cu0 cu0Var = photoViewer4.E2;
                if (cu0Var != null) {
                    cu0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 24:
                zs0 zs0Var = (zs0) this.f35781b;
                org.telegram.ui.Components.j81 j81Var = (org.telegram.ui.Components.j81) this.f35782c;
                zs0Var.getClass();
                if (j81Var.p() > 0 && j81Var.n() >= j81Var.p() - 590) {
                    zs0Var.f44203a.f33582e0.invalidate();
                    return;
                }
                return;
            case 25:
                dt0 dt0Var = (dt0) this.f35781b;
                rg.w0 w0Var2 = (rg.w0) this.f35782c;
                w0Var2.e.h();
                w0Var2.f46102c.postRunnable(new hf0(19));
                try {
                    dt0Var.f36723b.f33582e0.removeView(w0Var2);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 26:
                ah.v vVar = (ah.v) this.f35782c;
                PhotoViewer photoViewer5 = ((is0) this.f35781b).f38384b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.f33755x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.f33755x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) vVar.f895b).setImageBitmap(photoViewer5.C3);
                    return;
                }
                return;
            case 27:
                ((nt0) this.f35781b).f39989r.f33649l7.lock();
                ((AnimatorSet) this.f35782c).start();
                return;
            case 28:
                lu0 lu0Var = (lu0) this.f35782c;
                ((nt0) this.f35781b).f39989r.f33709s4 = false;
                if (!lu0Var.f39396s) {
                    lu0Var.f39381a.setVisible(false, true);
                    return;
                }
                return;
            default:
                tv0 tv0Var = (tv0) this.f35781b;
                tv0Var.getClass();
                AndroidUtilities.addToClipboard((String) this.f35782c);
                tv0Var.c(true);
                return;
        }
    }
}
