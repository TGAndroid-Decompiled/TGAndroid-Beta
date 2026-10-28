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
import org.telegram.messenger.AgentController;
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
public final class am0 implements Runnable {
    public final int f37799a;
    public final Object f37800b;
    public final Object f37801c;

    public am0(int i10, Object obj, Object obj2) {
        this.f37799a = i10;
        this.f37800b = obj;
        this.f37801c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        String formatPluralString;
        boolean z10;
        boolean z11;
        TLRPC.Chat chat;
        int i12;
        int i13;
        String string;
        String formatString;
        org.telegram.ui.Components.qc R;
        String str;
        qo0 qo0Var;
        qo0 qo0Var2;
        jk jkVar;
        String str2 = "";
        switch (this.f37799a) {
            case 0:
                kn0 kn0Var = (kn0) this.f37800b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f37801c;
                int[] iArr = kn0Var.f40887x;
                int i14 = result.type;
                if (i14 == 2) {
                    if (!(kn0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = kn0Var.G.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) kn0Var.G.get(i15);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    kn0Var.F = tL_secureRequiredType;
                                    kn0Var.Q1();
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                } else if (i14 == 1) {
                    if (!(kn0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = kn0Var.G.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) kn0Var.G.get(i16);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    kn0Var.F = tL_secureRequiredType2;
                                    kn0Var.Q1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i14 == 3) {
                    if (!(kn0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = kn0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) kn0Var.G.get(i17);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    kn0Var.F = tL_secureRequiredType3;
                                    kn0Var.Q1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i14 == 4 && !(kn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = kn0Var.G.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) kn0Var.G.get(i18);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                kn0Var.F = tL_secureRequiredType4;
                                kn0Var.Q1();
                            } else {
                                i18++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    kn0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    kn0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    kn0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    kn0Var.Y[7].setText(result.number);
                }
                int i19 = result.gender;
                if (i19 != 0) {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            kn0Var.f40884w = "female";
                            kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        }
                    } else {
                        kn0Var.f40884w = "male";
                        kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    kn0Var.f40875s = str3;
                    String str4 = (String) kn0Var.Y0.get(str3);
                    if (str4 != null) {
                        kn0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    kn0Var.v = str5;
                    String str6 = (String) kn0Var.Y0.get(str5);
                    if (str6 != null) {
                        kn0Var.Y[6].setText(str6);
                    }
                }
                int i20 = result.birthDay;
                if (i20 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    kn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i20), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i21 = result.expiryDay;
                if (i21 > 0 && (i10 = result.expiryMonth) > 0 && (i11 = result.expiryYear) > 0) {
                    iArr[0] = i11;
                    iArr[1] = i10;
                    iArr[2] = i21;
                    kn0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i21), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                kn0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 1:
                kn0 kn0Var2 = (kn0) this.f37800b;
                TLObject tLObject = (TLObject) this.f37801c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    kn0Var2.J = password;
                    if (!TwoStepVerificationActivity.j0(password, false)) {
                        org.telegram.ui.Components.g5.w0(kn0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TwoStepVerificationActivity.n0(kn0Var2.J);
                    kn0Var2.S1();
                    if (kn0Var2.Z[0].getVisibility() == 0) {
                        kn0Var2.Y[0].requestFocus();
                        AndroidUtilities.showKeyboard(kn0Var2.Y[0]);
                    }
                    if (kn0Var2.N0 == 1) {
                        kn0Var2.B1(true);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                kn0 kn0Var3 = (kn0) this.f37800b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f37801c;
                if (tL_error == null) {
                    kn0Var3.f40850f1 = true;
                    kn0Var3.W0(true);
                    kn0Var3.finishFragment();
                    return;
                }
                kn0Var3.N1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.g5.w0(kn0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    return;
                } else {
                    kn0Var3.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 3:
                ((fn0) this.f37800b).f39405a.K = ((TLRPC.TL_error) this.f37801c).text;
                return;
            case 4:
                ((ro0) this.f37800b).E0(false);
                ((View) this.f37801c).callOnClick();
                return;
            case 5:
                ro0 ro0Var = (ro0) this.f37800b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f37801c;
                ro0Var.I0(true, false);
                if (tL_error2 == null) {
                    if (ro0Var.getParentActivity() != null) {
                        pn0 pn0Var = ro0Var.f43106d0;
                        if (pn0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(pn0Var);
                            ro0Var.f43106d0 = null;
                        }
                        ro0Var.u0();
                        return;
                    }
                    return;
                } else if (tL_error2.text.startsWith("CODE_INVALID")) {
                    org.telegram.ui.Cells.h3 h3Var = ro0Var.S;
                    try {
                        h3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeViewSpring(h3Var, 2.5f);
                    org.telegram.ui.Cells.h3 h3Var2 = ro0Var.S;
                    h3Var2.f24194a.setText("");
                    h3Var2.setWillNotDraw(true);
                    return;
                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    ro0Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    ro0Var.G0(LocaleController.getString(R.string.AppName), tL_error2.text);
                    return;
                }
            case 6:
                ro0.X((ro0) this.f37800b, (TLRPC.TL_payments_validatedRequestedInfo) this.f37801c);
                return;
            case 7:
                ro0 ro0Var2 = (ro0) this.f37800b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.f37801c;
                Context parentActivity = ro0Var2.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.I1;
                }
                if (parentActivity != null) {
                    ro0Var2.f43099a1 = true;
                    ro0Var2.f43112f1 = 1;
                    TLRPC.InputInvoice inputInvoice = ro0Var2.f43102b1;
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
                    ro0Var2.u0();
                    if (z12 && (qo0Var = ro0Var2.Z0) != null) {
                        qo0Var.a(ro0Var2.f43112f1);
                    }
                    long s02 = ro0Var2.s0();
                    int i22 = (s02 > 0L ? 1 : (s02 == 0L ? 0 : -1));
                    if (i22 > 0) {
                        str2 = UserObject.getForcedFirstName(ro0Var2.getMessagesController().getUser(Long.valueOf(s02)));
                    } else if (i22 < 0 && (chat = ro0Var2.getMessagesController().getChat(Long.valueOf(-s02))) != null) {
                        str2 = chat.title;
                    }
                    long r02 = ro0Var2.r0();
                    if (z12) {
                        if (!z10 && !z11) {
                            i12 = R.raw.stars_topup;
                        } else {
                            i12 = R.raw.stars_send;
                        }
                    } else {
                        i12 = R.raw.payment_success;
                    }
                    int i23 = i12;
                    if (!z12) {
                        string = null;
                    } else {
                        if (z11) {
                            i13 = R.string.StarsGiveawaySentPopup;
                        } else if (z10) {
                            i13 = R.string.StarsGiftSentPopup;
                        } else {
                            i13 = R.string.StarsAcquired;
                        }
                        string = LocaleController.getString(i13);
                    }
                    if (z12) {
                        if (z11) {
                            formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) r02);
                        } else {
                            if (z10) {
                                str = "StarsGiftSentPopupInfo";
                            } else {
                                str = "StarsAcquiredInfo";
                            }
                            formatString = LocaleController.formatPluralStringComma(str, (int) r02, str2);
                        }
                    } else {
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, ro0Var2.R0[0], ro0Var2.f43123q0);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(U);
                        if (i22 != 0 && string != null && !z11) {
                            R = b02.K(i23, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new bi.j4(s02, 2));
                        } else {
                            String str7 = string;
                            if (str7 != null) {
                                R = b02.M(str7, replaceTags, i23);
                            } else {
                                R = b02.R(i23, 36, replaceTags);
                            }
                        }
                        org.telegram.ui.Components.qc qcVar = R;
                        qcVar.f31870s = false;
                        qcVar.f31861j = 5000;
                        if (messageArr[0] != null) {
                            di.y3 y3Var = new di.y3(ro0Var2, qcVar, z10, messageArr, 3);
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
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) this.f37800b;
                c31.T(photoViewer.E, photoViewer.f35742m4, false, (di.b) this.f37801c, null);
                return;
            case 9:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f37800b;
                vs0 vs0Var = (vs0) this.f37801c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (vs0Var.getWindow() != null) {
                    vs0Var.setFocusable(true);
                    wn wnVar = photoViewer2.l4;
                    if (wnVar != null && (jkVar = wnVar.Y) != null) {
                        jkVar.i0(false);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                ((bi.t2) this.f37800b).run((Bitmap) this.f37801c);
                return;
            case 11:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f37800b;
                sg.w0 w0Var = (sg.w0) this.f37801c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                w0Var.e.h();
                w0Var.f48580c.postRunnable(new w90(23));
                photoViewer3.f35670e0.removeView(photoViewer3.N1);
                return;
            case 12:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.f37800b;
                Bitmap bitmap = (Bitmap) this.f37801c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (g6Var != null) {
                    ArrayList arrayList = g6Var.h;
                    org.telegram.ui.Components.d6 d6Var = g6Var.f28423n;
                    if (d6Var != null) {
                        arrayList.add(d6Var);
                    }
                    org.telegram.ui.Components.d6 d6Var2 = g6Var.f28428r;
                    if (d6Var2 != null) {
                        arrayList.add(d6Var2);
                    }
                    org.telegram.ui.Components.d6 d6Var3 = g6Var.f28430s;
                    if (d6Var3 != null) {
                        arrayList.add(d6Var3);
                    }
                    g6Var.f28423n = new org.telegram.ui.Components.d6(bitmap);
                    g6Var.f28428r = null;
                    g6Var.f28430s = null;
                    g6Var.t();
                    return;
                }
                return;
            case 13:
                wr0 wr0Var = (wr0) this.f37800b;
                wr0Var.getClass();
                ((View) this.f37801c).setOutlineProvider(null);
                PhotoViewer photoViewer4 = wr0Var.f45392c;
                ImageView imageView = photoViewer4.f35843x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                ju0 ju0Var = photoViewer4.E2;
                if (ju0Var != null) {
                    ju0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 14:
                gt0 gt0Var = (gt0) this.f37800b;
                org.telegram.ui.Components.t81 t81Var = (org.telegram.ui.Components.t81) this.f37801c;
                gt0Var.getClass();
                if (t81Var.p() > 0 && t81Var.n() >= t81Var.p() - 590) {
                    gt0Var.f39690a.f35670e0.invalidate();
                    return;
                }
                return;
            case 15:
                kt0 kt0Var = (kt0) this.f37800b;
                sg.w0 w0Var2 = (sg.w0) this.f37801c;
                w0Var2.e.h();
                w0Var2.f48580c.postRunnable(new w90(23));
                try {
                    kt0Var.f40915b.f35670e0.removeView(w0Var2);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 16:
                bh.p pVar = (bh.p) this.f37801c;
                PhotoViewer photoViewer5 = ((ps0) this.f37800b).f42501b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.f35843x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.f35843x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) pVar.f4101b).setImageBitmap(photoViewer5.C3);
                    return;
                }
                return;
            case 17:
                ((ut0) this.f37800b).f44110r.f35737l7.lock();
                ((AnimatorSet) this.f37801c).start();
                return;
            case 18:
                su0 su0Var = (su0) this.f37801c;
                ((ut0) this.f37800b).f44110r.f35797s4 = false;
                if (!su0Var.f43421s) {
                    su0Var.f43406a.setVisible(false, true);
                    return;
                }
                return;
            case 19:
                zv0 zv0Var = (zv0) this.f37800b;
                zv0Var.getClass();
                AndroidUtilities.addToClipboard((String) this.f37801c);
                zv0Var.c(true);
                return;
            case 20:
                zv0 zv0Var2 = (zv0) this.f37800b;
                zv0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) this.f37801c).text, false));
                zv0Var2.c(true);
                return;
            case 21:
                zv0 zv0Var3 = (zv0) this.f37800b;
                SendMessagesHelper.getInstance(zv0Var3.H.currentAccount).deletePollOption(zv0Var3.H, (byte[]) this.f37801c);
                zv0Var3.c(true);
                return;
            case 22:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f37800b, (TLObject) this.f37801c);
                return;
            case 23:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f37800b;
                boolean[] zArr = (boolean[]) this.f37801c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.y0();
                    return;
                }
                return;
            case 24:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37800b;
                privacySettingsActivity.d = (TL_account.Password) this.f37801c;
                privacySettingsActivity.z0();
                return;
            case 25:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.f37800b;
                boolean z13 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z13;
                ((org.telegram.ui.Cells.a9) this.f37801c).setChecked(z13);
                return;
            case 26:
                ((ux0) this.f37800b).getMessagesController().unblockPeer(((Long) this.f37801c).longValue());
                return;
            case 27:
                ProfileActivity profileActivity = (ProfileActivity) this.f37800b;
                int i24 = ProfileActivity.R6;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i25 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i25);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i25, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) this.f37801c)[0]).f22036id);
                profileActivity.presentFragment(new wn(bundle), true);
                return;
            case 28:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f37800b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f37801c;
                long j10 = profileActivity2.A2;
                if (j10 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f36011f1, user);
                    if (profileActivity2.E2 != null && user != null && org.telegram.ui.Components.wc.a(profileActivity2)) {
                        org.telegram.ui.Components.wc.D(profileActivity2, user, profileActivity2.E2.title).j();
                    }
                    if (profileActivity2.f36115u2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.p5(true, false);
                        return;
                    }
                    return;
                }
                NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                int i26 = NotificationCenter.closeChats;
                notificationCenter2.removeObserver(profileActivity2, i26);
                if (AndroidUtilities.isTablet()) {
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i26, Long.valueOf(-profileActivity2.f36011f1));
                } else {
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i26, new Object[0]);
                }
                profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f36011f1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                profileActivity2.J1 = 0;
                profileActivity2.finishFragment();
                return;
            default:
                int i27 = ProfileActivity.R6;
                ((AgentController) this.f37800b).disconnect((String) this.f37801c);
                return;
        }
    }
}
