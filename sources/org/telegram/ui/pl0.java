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
public final class pl0 implements Runnable {
    public final int f36653a;
    public final Object f36654b;
    public final Object f36655c;

    public pl0(int i10, Object obj, Object obj2) {
        this.f36653a = i10;
        this.f36654b = obj;
        this.f36655c = obj2;
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
        xo0 xo0Var;
        xo0 xo0Var2;
        nk nkVar;
        String str2 = "";
        switch (this.f36653a) {
            case 0:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f36655c;
                PasscodeActivity passcodeActivity = ((ql0) this.f36654b).f36932b;
                if (passcodeActivity.f30907y == 0) {
                    i10 = R.string.PasscodeSwitchToPassword;
                } else {
                    i10 = R.string.PasscodeSwitchToPIN;
                }
                g1Var.setText(LocaleController.getString(i10));
                if (passcodeActivity.f30907y == 0) {
                    i11 = R.drawable.msg_permissions;
                } else {
                    i11 = R.drawable.msg_pin_code;
                }
                g1Var.setIcon(i11);
                passcodeActivity.k0();
                if (passcodeActivity.e0()) {
                    passcodeActivity.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f30904s, true, 0.1f, false);
                    return;
                }
                return;
            case 1:
                ((PasskeysActivity) this.f36654b).Y((TL_account.Passkey) this.f36655c);
                return;
            case 2:
                qn0 qn0Var = (qn0) this.f36654b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f36655c;
                int[] iArr = qn0Var.f36994x;
                int i16 = result.type;
                if (i16 == 2) {
                    if (!(qn0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = qn0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) qn0Var.G.get(i17);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    qn0Var.F = tL_secureRequiredType;
                                    qn0Var.P1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i16 == 1) {
                    if (!(qn0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = qn0Var.G.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) qn0Var.G.get(i18);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    qn0Var.F = tL_secureRequiredType2;
                                    qn0Var.P1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i16 == 3) {
                    if (!(qn0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = qn0Var.G.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) qn0Var.G.get(i19);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    qn0Var.F = tL_secureRequiredType3;
                                    qn0Var.P1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i16 == 4 && !(qn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = qn0Var.G.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) qn0Var.G.get(i20);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                qn0Var.F = tL_secureRequiredType4;
                                qn0Var.P1();
                            } else {
                                i20++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    qn0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    qn0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    qn0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    qn0Var.Y[7].setText(result.number);
                }
                int i21 = result.gender;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            qn0Var.f36991w = "female";
                            qn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        }
                    } else {
                        qn0Var.f36991w = "male";
                        qn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    qn0Var.f36982s = str3;
                    String str4 = (String) qn0Var.Y0.get(str3);
                    if (str4 != null) {
                        qn0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    qn0Var.v = str5;
                    String str6 = (String) qn0Var.Y0.get(str5);
                    if (str6 != null) {
                        qn0Var.Y[6].setText(str6);
                    }
                }
                int i22 = result.birthDay;
                if (i22 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    qn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i23 = result.expiryDay;
                if (i23 > 0 && (i12 = result.expiryMonth) > 0 && (i13 = result.expiryYear) > 0) {
                    iArr[0] = i13;
                    iArr[1] = i12;
                    iArr[2] = i23;
                    qn0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i23), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                qn0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 3:
                qn0 qn0Var2 = (qn0) this.f36654b;
                TLObject tLObject = (TLObject) this.f36655c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    qn0Var2.J = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.c5.x0(qn0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TwoStepVerificationActivity.m0(qn0Var2.J);
                    qn0Var2.R1();
                    if (qn0Var2.Z[0].getVisibility() == 0) {
                        qn0Var2.Y[0].requestFocus();
                        AndroidUtilities.showKeyboard(qn0Var2.Y[0]);
                    }
                    if (qn0Var2.N0 == 1) {
                        qn0Var2.B1(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                qn0 qn0Var3 = (qn0) this.f36654b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f36655c;
                if (tL_error == null) {
                    qn0Var3.f36957f1 = true;
                    qn0Var3.W0(true);
                    qn0Var3.finishFragment();
                    return;
                }
                qn0Var3.N1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.c5.x0(qn0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    return;
                } else {
                    qn0Var3.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 5:
                ((ln0) this.f36654b).f35590a.K = ((TLRPC.TL_error) this.f36655c).text;
                return;
            case 6:
                ((yo0) this.f36654b).D0(false);
                ((View) this.f36655c).callOnClick();
                return;
            case 7:
                yo0 yo0Var = (yo0) this.f36654b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f36655c;
                yo0Var.H0(true, false);
                if (tL_error2 == null) {
                    if (yo0Var.getParentActivity() != null) {
                        vn0 vn0Var = yo0Var.f39953d0;
                        if (vn0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(vn0Var);
                            yo0Var.f39953d0 = null;
                        }
                        yo0Var.t0();
                        return;
                    }
                    return;
                } else if (tL_error2.text.startsWith("CODE_INVALID")) {
                    org.telegram.ui.Cells.j3 j3Var = yo0Var.S;
                    try {
                        j3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeViewSpring(j3Var, 2.5f);
                    org.telegram.ui.Cells.j3 j3Var2 = yo0Var.S;
                    j3Var2.f20306a.setText("");
                    j3Var2.f20307b = false;
                    j3Var2.setWillNotDraw(true);
                    return;
                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    yo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    yo0Var.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                    return;
                }
            case 8:
                yo0.W((yo0) this.f36654b, (TLRPC.TL_payments_validatedRequestedInfo) this.f36655c);
                return;
            case 9:
                yo0 yo0Var2 = (yo0) this.f36654b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.f36655c;
                Context parentActivity = yo0Var2.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity != null) {
                    yo0Var2.f39946a1 = true;
                    yo0Var2.f39959f1 = 1;
                    TLRPC.InputInvoice inputInvoice = yo0Var2.f39949b1;
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
                    if (!z12 && (xo0Var2 = yo0Var2.Z0) != null) {
                        xo0Var2.a(1);
                    }
                    yo0Var2.t0();
                    if (z12 && (xo0Var = yo0Var2.Z0) != null) {
                        xo0Var.a(yo0Var2.f39959f1);
                    }
                    long r02 = yo0Var2.r0();
                    int i24 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                    if (i24 > 0) {
                        str2 = UserObject.getForcedFirstName(yo0Var2.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (i24 < 0 && (chat = yo0Var2.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str2 = chat.title;
                    }
                    long q02 = yo0Var2.q0();
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
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, yo0Var2.R0[0], yo0Var2.f39970q0);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(U);
                        if (i24 != 0 && string != null && !z11) {
                            Q = a02.K(i25, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new zn0(r02, 0));
                        } else {
                            String str7 = string;
                            if (str7 != null) {
                                Q = a02.M(str7, replaceTags, i25);
                            } else {
                                Q = a02.Q(i25, 36, replaceTags);
                            }
                        }
                        org.telegram.ui.Components.oc ocVar = Q;
                        ocVar.f26710r = false;
                        ocVar.f26702j = 5000;
                        if (messageArr[0] != null) {
                            ai.m5 m5Var = new ai.m5(yo0Var2, ocVar, z10, messageArr, 3);
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
                PhotoViewer photoViewer = (PhotoViewer) this.f36654b;
                j41.T(photoViewer.E, photoViewer.f31021m4, false, (ai.d) this.f36655c, null);
                return;
            case 11:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f36654b;
                it0 it0Var = (it0) this.f36655c;
                Drawable[] drawableArr = PhotoViewer.T8;
                if (it0Var.getWindow() != null) {
                    it0Var.setFocusable(true);
                    bo boVar = photoViewer2.l4;
                    if (boVar != null && (nkVar = boVar.Y) != null) {
                        nkVar.m0(false);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                Drawable[] drawableArr2 = PhotoViewer.T8;
                ((org.telegram.messenger.f2) this.f36654b).run((Bitmap) this.f36655c);
                return;
            case 13:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f36654b;
                qg.z0 z0Var = (qg.z0) this.f36655c;
                Drawable[] drawableArr3 = PhotoViewer.T8;
                z0Var.e.h();
                z0Var.f41748c.postRunnable(new p91(10));
                photoViewer3.f30950e0.removeView(photoViewer3.N1);
                return;
            case 14:
                org.telegram.ui.Components.b6 b6Var = (org.telegram.ui.Components.b6) this.f36654b;
                Bitmap bitmap = (Bitmap) this.f36655c;
                Drawable[] drawableArr4 = PhotoViewer.T8;
                if (b6Var != null) {
                    ArrayList arrayList = b6Var.h;
                    org.telegram.ui.Components.y5 y5Var = b6Var.f22596n;
                    if (y5Var != null) {
                        arrayList.add(y5Var);
                    }
                    org.telegram.ui.Components.y5 y5Var2 = b6Var.f22601r;
                    if (y5Var2 != null) {
                        arrayList.add(y5Var2);
                    }
                    org.telegram.ui.Components.y5 y5Var3 = b6Var.f22603s;
                    if (y5Var3 != null) {
                        arrayList.add(y5Var3);
                    }
                    b6Var.f22596n = new org.telegram.ui.Components.y5(bitmap);
                    b6Var.f22601r = null;
                    b6Var.f22603s = null;
                    b6Var.t();
                    return;
                }
                return;
            case 15:
                js0 js0Var = (js0) this.f36654b;
                js0Var.getClass();
                ((View) this.f36655c).setOutlineProvider(null);
                PhotoViewer photoViewer4 = js0Var.f34929c;
                ImageView imageView = photoViewer4.f31122x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                wu0 wu0Var = photoViewer4.E2;
                if (wu0Var != null) {
                    wu0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 16:
                tt0 tt0Var = (tt0) this.f36654b;
                org.telegram.ui.Components.h71 h71Var = (org.telegram.ui.Components.h71) this.f36655c;
                tt0Var.getClass();
                if (h71Var.p() > 0 && h71Var.n() >= h71Var.p() - 590) {
                    tt0Var.f37865a.f30950e0.invalidate();
                    return;
                }
                return;
            case 17:
                xt0 xt0Var = (xt0) this.f36654b;
                qg.z0 z0Var2 = (qg.z0) this.f36655c;
                z0Var2.e.h();
                z0Var2.f41748c.postRunnable(new p91(10));
                try {
                    xt0Var.f39699b.f30950e0.removeView(z0Var2);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 18:
                ci.n6 n6Var = (ci.n6) this.f36655c;
                PhotoViewer photoViewer5 = ((ct0) this.f36654b).f32912b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.f31122x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.f31122x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) n6Var.f5074b).setImageBitmap(photoViewer5.C3);
                    return;
                }
                return;
            case 19:
                ((hu0) this.f36654b).f34352r.f31016l7.lock();
                ((AnimatorSet) this.f36655c).start();
                return;
            case 20:
                fv0 fv0Var = (fv0) this.f36655c;
                ((hu0) this.f36654b).f34352r.f31076s4 = false;
                if (!fv0Var.f33778s) {
                    fv0Var.f33763a.setVisible(false, true);
                    return;
                }
                return;
            case 21:
                ow0 ow0Var = (ow0) this.f36654b;
                ow0Var.getClass();
                AndroidUtilities.addToClipboard((String) this.f36655c);
                ow0Var.c(true);
                return;
            case 22:
                ow0 ow0Var2 = (ow0) this.f36654b;
                ow0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) this.f36655c).text, false));
                ow0Var2.c(true);
                return;
            case 23:
                ow0 ow0Var3 = (ow0) this.f36654b;
                SendMessagesHelper.getInstance(ow0Var3.H.currentAccount).deletePollOption(ow0Var3.H, (byte[]) this.f36655c);
                ow0Var3.c(true);
                return;
            case 24:
                PrivacyControlActivity.W((PrivacyControlActivity) this.f36654b, (TLObject) this.f36655c);
                return;
            case 25:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f36654b;
                boolean[] zArr = (boolean[]) this.f36655c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    return;
                }
                return;
            case 26:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f36654b;
                privacySettingsActivity.d = (TL_account.Password) this.f36655c;
                privacySettingsActivity.y0();
                return;
            case 27:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.f36654b;
                boolean z13 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z13;
                ((org.telegram.ui.Cells.w8) this.f36655c).setChecked(z13);
                return;
            case 28:
                ((iy0) this.f36654b).getMessagesController().unblockPeer(((Long) this.f36655c).longValue());
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f36654b;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i26 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i26);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i26, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) this.f36655c)[0]).f18129id);
                profileActivity.presentFragment(new bo(bundle), true);
                return;
        }
    }
}
