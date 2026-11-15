package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.gms.tasks.CancellationTokenSource;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jd0 implements Runnable {
    public final int f48294a;
    public final Object f48295b;
    public final Object f48296c;

    public jd0(int i7, Object obj, Object obj2) {
        this.f48294a = i7;
        this.f48295b = obj;
        this.f48296c = obj2;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        String G;
        boolean z10;
        boolean z11;
        TLRPC.Chat M0;
        int i13;
        int i14;
        String M02;
        String a02;
        org.telegram.ui.Components.xb Q;
        String str;
        jl0 jl0Var;
        jl0 jl0Var2;
        qj qjVar;
        String str2 = "";
        switch (this.f48294a) {
            case 0:
                ((r3) this.f48295b).a((String) this.f48296c);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f48296c;
                ce0 ce0Var = ((be0) this.f48295b).f45693h0;
                SharedPreferences e12 = org.telegram.messenger.np.e1();
                if (!e12.getBoolean("firstloginshow", true) && !ce0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    ce0Var.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    return;
                }
                e12.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                int i15 = org.telegram.ui.ActionBar.j6.L5;
                alertDialog$Builder.m(2131624067, 46, org.telegram.ui.ActionBar.j6.x0(null, i15, false), null);
                alertDialog$Builder.n(i15, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, "Continue"), null);
                String M03 = org.telegram.messenger.hd.M0(2131754278, "AllowFillNumber");
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.U = M03;
                ce0Var.f46091n = ce0Var.showDialog(t1Var, true, null);
                ce0Var.f46080d0 = true;
                return;
            case 2:
                be0 be0Var = (be0) this.f48295b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.f48296c;
                if (be0Var.o()) {
                    org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, be0Var.getContext(), null);
                    t1Var2.setOnCancelListener(new tf(cancellationTokenSource, 4));
                    t1Var2.show();
                    be0Var.f45686c0 = t1Var2;
                    return;
                }
                return;
            case 3:
                ee0.Z((ee0) this.f48295b, (org.telegram.ui.ActionBar.t1) this.f48296c);
                return;
            case 4:
                cf0 cf0Var = (cf0) this.f48295b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f48296c;
                cf0Var.f46119d0 = false;
                if (tL_error == null) {
                    ue0 l02 = cf0Var.l0();
                    cf0Var.f46128k0.clear();
                    cf0Var.n0(l02);
                    return;
                }
                return;
            case 5:
                cf0 cf0Var2 = ((te0) this.f48295b).f51569a;
                ue0 l03 = cf0Var2.l0();
                cf0Var2.f46127j0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f48296c));
                TLRPC.ChatFull chatFull = cf0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    cf0Var2.getMessagesStorage().w1(cf0Var2.d.invitesCount, cf0Var2.f46130n);
                }
                cf0Var2.n0(l03);
                return;
            case 6:
                jg0 jg0Var = (jg0) this.f48295b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f48296c;
                if (jg0Var.getParentActivity() != null) {
                    Toast.makeText(jg0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 7:
                bh0 bh0Var = (bh0) this.f48295b;
                bh0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f48296c)));
                intent.putExtra("sms_body", org.telegram.messenger.hd.a0(null, null, 2131749116, "https://telegram.org/dl"));
                bh0Var.getContext().startActivity(intent);
                return;
            case 8:
                TLRPC.User user = (TLRPC.User) this.f48296c;
                ((bh0) this.f48295b).dismiss();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.C4(user.f28200id));
                    return;
                }
                return;
            case 9:
                ((org.telegram.ui.Components.gh) this.f48295b).a((TLRPC.User) this.f48296c);
                return;
            case 10:
                NotificationsCustomSettingsActivity.b0((NotificationsCustomSettingsActivity) this.f48295b, (ArrayList) this.f48296c);
                return;
            case 11:
                ((org.telegram.ui.ActionBar.u2[]) this.f48295b)[0] = null;
                di0.f46383a = null;
                ((boolean[]) this.f48296c)[0] = true;
                return;
            case 12:
                Runnable runnable = (Runnable) this.f48296c;
                for (dr drVar : ((PasscodeActivity) this.f48295b).f42698n.f45485f) {
                    drVar.D(0.0f);
                }
                runnable.run();
                return;
            case 13:
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) this.f48296c;
                PasscodeActivity passcodeActivity = (PasscodeActivity) ((ji0) this.f48295b).f48351c;
                if (passcodeActivity.E == 0) {
                    i7 = 2131747653;
                } else {
                    i7 = 2131747654;
                }
                z0Var.setText(org.telegram.messenger.hd.M0(i7, null));
                if (passcodeActivity.E == 0) {
                    i10 = 2131232277;
                } else {
                    i10 = 2131232295;
                }
                z0Var.setIcon(i10);
                passcodeActivity.y0();
                if (passcodeActivity.s0()) {
                    passcodeActivity.h.setInputType(524417);
                    org.telegram.messenger.g0.Y3(passcodeActivity.f42700s, true, 0.1f, true, false);
                    return;
                }
                return;
            case 14:
                ((PasskeysActivity) this.f48295b).d0((TL_account.Passkey) this.f48296c);
                return;
            case 15:
                ek0 ek0Var = (ek0) this.f48295b;
                org.telegram.messenger.wr wrVar = (org.telegram.messenger.wr) this.f48296c;
                int[] iArr = ek0Var.f46847y;
                int i16 = wrVar.f27380a;
                if (i16 == 2) {
                    if (!(ek0Var.G.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = ek0Var.H.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) ek0Var.H.get(i17);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    ek0Var.G = tL_secureRequiredType;
                                    ek0Var.U1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i16 == 1) {
                    if (!(ek0Var.G.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = ek0Var.H.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) ek0Var.H.get(i18);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    ek0Var.G = tL_secureRequiredType2;
                                    ek0Var.U1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i16 == 3) {
                    if (!(ek0Var.G.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = ek0Var.H.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) ek0Var.H.get(i19);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    ek0Var.G = tL_secureRequiredType3;
                                    ek0Var.U1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i16 == 4 && !(ek0Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = ek0Var.H.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) ek0Var.H.get(i20);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                ek0Var.G = tL_secureRequiredType4;
                                ek0Var.U1();
                            } else {
                                i20++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(wrVar.f27381b)) {
                    ek0Var.Z[0].setText(wrVar.f27381b);
                }
                if (!TextUtils.isEmpty(wrVar.d)) {
                    ek0Var.Z[1].setText(wrVar.d);
                }
                if (!TextUtils.isEmpty(wrVar.f27382c)) {
                    ek0Var.Z[2].setText(wrVar.f27382c);
                }
                if (!TextUtils.isEmpty(wrVar.f27383e)) {
                    ek0Var.Z[7].setText(wrVar.f27383e);
                }
                int i21 = wrVar.f27391n;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            ek0Var.f46844x = "female";
                            ek0Var.Z[4].setText(org.telegram.messenger.hd.M0(2131747569, null));
                        }
                    } else {
                        ek0Var.f46844x = "male";
                        ek0Var.Z[4].setText(org.telegram.messenger.hd.M0(2131747508, null));
                    }
                }
                if (!TextUtils.isEmpty(wrVar.f27390m)) {
                    String str3 = wrVar.f27390m;
                    ek0Var.f46832s = str3;
                    String str4 = (String) ek0Var.Z0.get(str3);
                    if (str4 != null) {
                        ek0Var.Z[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(wrVar.f27389l)) {
                    String str5 = wrVar.f27389l;
                    ek0Var.f46841w = str5;
                    String str6 = (String) ek0Var.Z0.get(str5);
                    if (str6 != null) {
                        ek0Var.Z[6].setText(str6);
                    }
                }
                int i22 = wrVar.f27388k;
                if (i22 > 0 && wrVar.f27387j > 0 && wrVar.f27386i > 0) {
                    ek0Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(wrVar.f27387j), Integer.valueOf(wrVar.f27386i)));
                }
                int i23 = wrVar.h;
                if (i23 > 0 && (i11 = wrVar.f27385g) > 0 && (i12 = wrVar.f27384f) > 0) {
                    iArr[0] = i12;
                    iArr[1] = i11;
                    iArr[2] = i23;
                    ek0Var.Z[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i23), Integer.valueOf(wrVar.f27385g), Integer.valueOf(wrVar.f27384f)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ek0Var.Z[8].setText(org.telegram.messenger.hd.M0(2131747494, null));
                return;
            case 16:
                ek0 ek0Var2 = (ek0) this.f48295b;
                TLObject tLObject = (TLObject) this.f48296c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ek0Var2.K = password;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.t4.u0(ek0Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, null), true);
                        return;
                    }
                    TwoStepVerificationActivity.r0(ek0Var2.K);
                    ek0Var2.W1();
                    if (ek0Var2.f46793a0[0].getVisibility() == 0) {
                        ek0Var2.Z[0].requestFocus();
                        org.telegram.messenger.g0.J3(ek0Var2.Z[0]);
                    }
                    if (ek0Var2.O0 == 1) {
                        ek0Var2.F1(true);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ek0 ek0Var3 = (ek0) this.f48295b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f48296c;
                if (tL_error2 == null) {
                    ek0Var3.f46810g1 = true;
                    ek0Var3.a1(true);
                    ek0Var3.finishFragment();
                    return;
                }
                ek0Var3.R1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                    org.telegram.ui.Components.t4.u0(ek0Var3.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, null), true);
                    return;
                } else {
                    ek0Var3.Q1(org.telegram.messenger.hd.M0(2131689472, null), tL_error2.text);
                    return;
                }
            case 18:
                ((zj0) this.f48295b).f53947a.L = ((TLRPC.TL_error) this.f48296c).text;
                return;
            case 19:
                ((kl0) this.f48295b).J0(false);
                ((View) this.f48296c).callOnClick();
                return;
            case 20:
                kl0 kl0Var = (kl0) this.f48295b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f48296c;
                kl0Var.N0(true, false);
                if (tL_error3 == null) {
                    if (kl0Var.getParentActivity() != null) {
                        kk0 kk0Var = kl0Var.f48686e0;
                        if (kk0Var != null) {
                            org.telegram.messenger.g0.r(kk0Var);
                            kl0Var.f48686e0 = null;
                        }
                        kl0Var.z0();
                        return;
                    }
                    return;
                } else if (tL_error3.text.startsWith("CODE_INVALID")) {
                    org.telegram.ui.Cells.l3 l3Var = kl0Var.T;
                    try {
                        l3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.g0.F3(2.5f, l3Var, null);
                    org.telegram.ui.Cells.l3 l3Var2 = kl0Var.T;
                    l3Var2.f30608a.setText("");
                    l3Var2.setWillNotDraw(true);
                    return;
                } else if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error3.text).intValue();
                    if (intValue < 60) {
                        G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    kl0Var.L0(org.telegram.messenger.hd.M0(2131689472, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, G));
                    return;
                } else {
                    kl0Var.L0(org.telegram.messenger.hd.M0(2131689472, null), tL_error3.text);
                    return;
                }
            case 21:
                kl0.b0((kl0) this.f48295b, (TLRPC.TL_payments_validatedRequestedInfo) this.f48296c);
                return;
            case 22:
                kl0 kl0Var2 = (kl0) this.f48295b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.f48296c;
                Context parentActivity = kl0Var2.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.t0.f26609b;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.H1;
                }
                if (parentActivity != null) {
                    kl0Var2.f48679b1 = true;
                    kl0Var2.f48692g1 = 1;
                    TLRPC.InputInvoice inputInvoice = kl0Var2.f48682c1;
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
                    if (!z12 && (jl0Var2 = kl0Var2.f48676a1) != null) {
                        jl0Var2.e(1);
                    }
                    kl0Var2.z0();
                    if (z12 && (jl0Var = kl0Var2.f48676a1) != null) {
                        jl0Var.e(kl0Var2.f48692g1);
                    }
                    long w02 = kl0Var2.w0();
                    int i24 = (w02 > 0L ? 1 : (w02 == 0L ? 0 : -1));
                    if (i24 > 0) {
                        str2 = org.telegram.messenger.q10.k(kl0Var2.getMessagesController().a2(Long.valueOf(w02)));
                    } else if (i24 < 0 && (M0 = kl0Var2.getMessagesController().M0(Long.valueOf(-w02))) != null) {
                        str2 = M0.title;
                    }
                    long v02 = kl0Var2.v0();
                    if (z12) {
                        if (!z10 && !z11) {
                            i13 = 2131624227;
                        } else {
                            i13 = 2131624226;
                        }
                    } else {
                        i13 = 2131624115;
                    }
                    int i25 = i13;
                    if (!z12) {
                        M02 = null;
                    } else {
                        if (z11) {
                            i14 = 2131745092;
                        } else if (z10) {
                            i14 = 2131745100;
                        } else {
                            i14 = 2131745159;
                        }
                        M02 = org.telegram.messenger.hd.M0(i14, null);
                    }
                    if (z12) {
                        if (z11) {
                            a02 = org.telegram.messenger.hd.H(',', "StarsGiveawaySentPopupInfo", (int) v02);
                        } else {
                            if (z10) {
                                str = "StarsGiftSentPopupInfo";
                            } else {
                                str = "StarsAcquiredInfo";
                            }
                            a02 = org.telegram.messenger.hd.K(str, (int) v02, ',', str2);
                        }
                    } else {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131747401, kl0Var2.S0[0], kl0Var2.f48704r0);
                    }
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(a02);
                    org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        org.telegram.ui.Components.cc a03 = org.telegram.ui.Components.cc.a0(T2);
                        if (i24 != 0 && M02 != null && !z11) {
                            Q = a03.L(i25, M02, X2, org.telegram.messenger.hd.M0(2131743552, null), new di.l3(w02, 2));
                        } else {
                            String str7 = M02;
                            if (str7 != null) {
                                Q = a03.I(i25, str7, X2);
                            } else {
                                Q = a03.Q(i25, 36, X2);
                            }
                        }
                        Q.f41643r = false;
                        Q.f41635j = 5000;
                        if (messageArr[0] != null) {
                            fi.m3 m3Var = new fi.m3(kl0Var2, Q, z10, messageArr, 3);
                            org.telegram.ui.Components.cb cbVar = Q.f41631e;
                            if (cbVar != null) {
                                cbVar.setOnClickListener(m3Var);
                            }
                        }
                        Q.k(z11);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.f48295b;
                qy0.d1(photoViewer.F, photoViewer.f42825m4, false, (fi.b) this.f48296c, null);
                return;
            case 24:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f48295b;
                cp0 cp0Var = (cp0) this.f48296c;
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (cp0Var.getWindow() != null) {
                    cp0Var.A0(true);
                    an anVar = photoViewer2.f42817l4;
                    if (anVar != null && (qjVar = anVar.f45117a0) != null) {
                        qjVar.y0(false);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                ((bi.i1) this.f48295b).a((Bitmap) this.f48296c);
                return;
            case 26:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f48295b;
                tg.o0 o0Var = (tg.o0) this.f48296c;
                Drawable[] drawableArr3 = PhotoViewer.Z8;
                o0Var.f57488e.h();
                o0Var.f57487c.postRunnable(new ah0(21));
                photoViewer3.f42763f0.removeView(photoViewer3.O1);
                return;
            case 27:
                org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) this.f48295b;
                Bitmap bitmap = (Bitmap) this.f48296c;
                Drawable[] drawableArr4 = PhotoViewer.Z8;
                if (t5Var != null) {
                    ArrayList arrayList2 = t5Var.h;
                    org.telegram.ui.Components.q5 q5Var = t5Var.f39523n;
                    if (q5Var != null) {
                        arrayList2.add(q5Var);
                    }
                    org.telegram.ui.Components.q5 q5Var2 = t5Var.f39528r;
                    if (q5Var2 != null) {
                        arrayList2.add(q5Var2);
                    }
                    org.telegram.ui.Components.q5 q5Var3 = t5Var.f39530s;
                    if (q5Var3 != null) {
                        arrayList2.add(q5Var3);
                    }
                    t5Var.f39523n = new org.telegram.ui.Components.q5(bitmap);
                    t5Var.f39528r = null;
                    t5Var.f39530s = null;
                    t5Var.t();
                    return;
                }
                return;
            case 28:
                co0 co0Var = (co0) this.f48295b;
                co0Var.getClass();
                ((View) this.f48296c).setOutlineProvider(null);
                PhotoViewer photoViewer4 = co0Var.f46198c;
                ImageView imageView = photoViewer4.f42924x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                nq0 nq0Var = photoViewer4.F2;
                if (nq0Var != null) {
                    nq0Var.setOutlineProvider(null);
                    return;
                }
                return;
            default:
                kp0 kp0Var = (kp0) this.f48295b;
                org.telegram.ui.Components.u51 u51Var = (org.telegram.ui.Components.u51) this.f48296c;
                kp0Var.getClass();
                if (u51Var.U() > 0 && u51Var.S() >= u51Var.U() - 590) {
                    kp0Var.f48732a.f42763f0.invalidate();
                    return;
                }
                return;
        }
    }
}
