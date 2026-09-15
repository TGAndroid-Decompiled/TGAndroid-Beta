package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ml0 implements Runnable {
    public final int f35768a;
    public final Object f35769b;
    public final Object f35770c;

    public ml0(int i10, Object obj, Object obj2) {
        this.f35768a = i10;
        this.f35769b = obj;
        this.f35770c = obj2;
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
        vo0 vo0Var;
        vo0 vo0Var2;
        mk mkVar;
        String str2 = "";
        switch (this.f35768a) {
            case 0:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f35770c;
                PasscodeActivity passcodeActivity = ((nl0) this.f35769b).f36004b;
                if (passcodeActivity.f30893y == 0) {
                    i10 = R.string.PasscodeSwitchToPassword;
                } else {
                    i10 = R.string.PasscodeSwitchToPIN;
                }
                f1Var.setText(LocaleController.getString(i10));
                if (passcodeActivity.f30893y == 0) {
                    i11 = R.drawable.msg_permissions;
                } else {
                    i11 = R.drawable.msg_pin_code;
                }
                f1Var.setIcon(i11);
                passcodeActivity.k0();
                if (passcodeActivity.e0()) {
                    passcodeActivity.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f30890s, true, 0.1f, false);
                    return;
                }
                return;
            case 1:
                ((PasskeysActivity) this.f35769b).Y((TL_account.Passkey) this.f35770c);
                return;
            case 2:
                on0 on0Var = (on0) this.f35769b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f35770c;
                int[] iArr = on0Var.f36305x;
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
                            on0Var.f36302w = "female";
                            on0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        }
                    } else {
                        on0Var.f36302w = "male";
                        on0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    on0Var.f36293s = str3;
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
            case 3:
                on0 on0Var2 = (on0) this.f35769b;
                TLObject tLObject = (TLObject) this.f35770c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    on0Var2.J = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.c5.x0(on0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
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
            case 4:
                on0 on0Var3 = (on0) this.f35769b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f35770c;
                if (tL_error == null) {
                    on0Var3.f36268f1 = true;
                    on0Var3.W0(true);
                    on0Var3.finishFragment();
                    return;
                }
                on0Var3.N1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.c5.x0(on0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    return;
                } else {
                    on0Var3.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 5:
                ((jn0) this.f35769b).f34942a.K = ((TLRPC.TL_error) this.f35770c).text;
                return;
            case 6:
                ((wo0) this.f35769b).D0(false);
                ((View) this.f35770c).callOnClick();
                return;
            case 7:
                wo0 wo0Var = (wo0) this.f35769b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f35770c;
                wo0Var.H0(true, false);
                if (tL_error2 == null) {
                    if (wo0Var.getParentActivity() != null) {
                        tn0 tn0Var = wo0Var.f39315d0;
                        if (tn0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(tn0Var);
                            wo0Var.f39315d0 = null;
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
                    j3Var2.f20296a.setText("");
                    j3Var2.f20297b = false;
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
            case 8:
                wo0.W((wo0) this.f35769b, (TLRPC.TL_payments_validatedRequestedInfo) this.f35770c);
                return;
            case 9:
                wo0 wo0Var2 = (wo0) this.f35769b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.f35770c;
                Context parentActivity = wo0Var2.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity != null) {
                    wo0Var2.f39308a1 = true;
                    wo0Var2.f39321f1 = 1;
                    TLRPC.InputInvoice inputInvoice = wo0Var2.f39311b1;
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
                        vo0Var.a(wo0Var2.f39321f1);
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
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, wo0Var2.R0[0], wo0Var2.f39332q0);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(U);
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
                        org.telegram.ui.Components.oc ocVar = Q;
                        ocVar.f26762r = false;
                        ocVar.f26754j = 5000;
                        if (messageArr[0] != null) {
                            ai.m5 m5Var = new ai.m5(wo0Var2, ocVar, z10, messageArr, 3);
                            org.telegram.ui.Components.sb sbVar = ocVar.e;
                            if (sbVar != null) {
                                sbVar.setOnClickListener(m5Var);
                            }
                        }
                        ocVar.k(z11);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) this.f35769b;
                h41.T(photoViewer.E, photoViewer.f31007m4, false, (ai.d) this.f35770c, null);
                return;
            case 11:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f35769b;
                gt0 gt0Var = (gt0) this.f35770c;
                Drawable[] drawableArr = PhotoViewer.T8;
                if (gt0Var.getWindow() != null) {
                    gt0Var.setFocusable(true);
                    bo boVar = photoViewer2.l4;
                    if (boVar != null && (mkVar = boVar.Y) != null) {
                        mkVar.m0(false);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                Drawable[] drawableArr2 = PhotoViewer.T8;
                ((org.telegram.messenger.f2) this.f35769b).run((Bitmap) this.f35770c);
                return;
            case 13:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f35769b;
                qg.z0 z0Var = (qg.z0) this.f35770c;
                Drawable[] drawableArr3 = PhotoViewer.T8;
                z0Var.e.h();
                z0Var.f41726c.postRunnable(new n91(10));
                photoViewer3.f30936e0.removeView(photoViewer3.N1);
                return;
            case 14:
                org.telegram.ui.Components.b6 b6Var = (org.telegram.ui.Components.b6) this.f35769b;
                Bitmap bitmap = (Bitmap) this.f35770c;
                Drawable[] drawableArr4 = PhotoViewer.T8;
                if (b6Var != null) {
                    ArrayList arrayList = b6Var.h;
                    org.telegram.ui.Components.y5 y5Var = b6Var.f22645n;
                    if (y5Var != null) {
                        arrayList.add(y5Var);
                    }
                    org.telegram.ui.Components.y5 y5Var2 = b6Var.f22650r;
                    if (y5Var2 != null) {
                        arrayList.add(y5Var2);
                    }
                    org.telegram.ui.Components.y5 y5Var3 = b6Var.f22652s;
                    if (y5Var3 != null) {
                        arrayList.add(y5Var3);
                    }
                    b6Var.f22645n = new org.telegram.ui.Components.y5(bitmap);
                    b6Var.f22650r = null;
                    b6Var.f22652s = null;
                    b6Var.t();
                    return;
                }
                return;
            case 15:
                hs0 hs0Var = (hs0) this.f35769b;
                hs0Var.getClass();
                ((View) this.f35770c).setOutlineProvider(null);
                PhotoViewer photoViewer4 = hs0Var.f34337c;
                ImageView imageView = photoViewer4.f31108x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                uu0 uu0Var = photoViewer4.E2;
                if (uu0Var != null) {
                    uu0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 16:
                rt0 rt0Var = (rt0) this.f35769b;
                org.telegram.ui.Components.g71 g71Var = (org.telegram.ui.Components.g71) this.f35770c;
                rt0Var.getClass();
                if (g71Var.p() > 0 && g71Var.n() >= g71Var.p() - 590) {
                    rt0Var.f37186a.f30936e0.invalidate();
                    return;
                }
                return;
            case 17:
                vt0 vt0Var = (vt0) this.f35769b;
                qg.z0 z0Var2 = (qg.z0) this.f35770c;
                z0Var2.e.h();
                z0Var2.f41726c.postRunnable(new n91(10));
                try {
                    vt0Var.f38684b.f30936e0.removeView(z0Var2);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 18:
                ci.n6 n6Var = (ci.n6) this.f35770c;
                PhotoViewer photoViewer5 = ((at0) this.f35769b).f31949b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.f31108x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.f31108x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) n6Var.f5069b).setImageBitmap(photoViewer5.C3);
                    return;
                }
                return;
            case 19:
                ((fu0) this.f35769b).f33672r.f31002l7.lock();
                ((AnimatorSet) this.f35770c).start();
                return;
            case 20:
                dv0 dv0Var = (dv0) this.f35770c;
                ((fu0) this.f35769b).f33672r.f31062s4 = false;
                if (!dv0Var.f33149s) {
                    dv0Var.f33134a.setVisible(false, true);
                    return;
                }
                return;
            case 21:
                mw0 mw0Var = (mw0) this.f35769b;
                mw0Var.getClass();
                AndroidUtilities.addToClipboard((String) this.f35770c);
                mw0Var.c(true);
                return;
            case 22:
                mw0 mw0Var2 = (mw0) this.f35769b;
                mw0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) this.f35770c).text, false));
                mw0Var2.c(true);
                return;
            case 23:
                mw0 mw0Var3 = (mw0) this.f35769b;
                SendMessagesHelper.getInstance(mw0Var3.H.currentAccount).deletePollOption(mw0Var3.H, (byte[]) this.f35770c);
                mw0Var3.c(true);
                return;
            case 24:
                PrivacyControlActivity.W((PrivacyControlActivity) this.f35769b, (TLObject) this.f35770c);
                return;
            case 25:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f35769b;
                boolean[] zArr = (boolean[]) this.f35770c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    return;
                }
                return;
            case 26:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f35769b;
                boolean z13 = !privacySettingsActivity.V;
                privacySettingsActivity.V = z13;
                ((org.telegram.ui.Cells.w8) this.f35770c).setChecked(z13);
                return;
            case 27:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.f35769b;
                privacySettingsActivity2.d = (TL_account.Password) this.f35770c;
                privacySettingsActivity2.y0();
                return;
            case 28:
                ((gy0) this.f35769b).getMessagesController().unblockPeer(((Long) this.f35770c).longValue());
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f35769b;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i26 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i26);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i26, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) this.f35770c)[0]).f18120id);
                profileActivity.presentFragment(new bo(bundle), true);
                return;
        }
    }
}
