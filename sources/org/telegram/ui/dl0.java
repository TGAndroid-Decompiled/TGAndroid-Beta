package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dl0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public static final List f44734h1 = Arrays.asList("http", "https");
    public static final List f44735i1 = Collections.singletonList("tg");
    public boolean A0;
    public ks B0;
    public String C0;
    public TLRPC.PaymentForm D0;
    public boolean E;
    public final TLRPC.PaymentReceipt E0;
    public ScrollView F;
    public TLRPC.TL_payments_validatedRequestedInfo F0;
    public boolean G;
    public TLRPC.TL_paymentFormMethod G0;
    public boolean H;
    public TLRPC.TL_shippingOption H0;
    public TextView I;
    public Long I0;
    public final org.telegram.ui.Cells.n4[] J;
    public TLRPC.TL_payments_validateRequestedInfo J0;
    public final ArrayList K;
    public TLRPC.TL_inputPaymentCredentialsGooglePay K0;
    public final org.telegram.ui.Cells.x6[] L;
    public String L0;
    public org.telegram.ui.Cells.q8 M;
    public String M0;
    public final org.telegram.ui.Cells.y8[] N;
    public JSONObject N0;
    public final org.telegram.ui.Cells.v9[] O;
    public org.telegram.messenger.zi O0;
    public FrameLayout P;
    public String P0;
    public FrameLayout Q;
    public boolean Q0;
    public LinearLayout R;
    public boolean R0;
    public org.telegram.ui.Cells.z8 S;
    public String[] S0;
    public org.telegram.ui.Cells.l3 T;
    public boolean T0;
    public bl0 U;
    public boolean U0;
    public TextView V;
    public boolean V0;
    public org.telegram.ui.Cells.m6 W;
    public boolean W0;
    public zk0 X;
    public boolean X0;
    public org.telegram.ui.Cells.j5 Y;
    public boolean Y0;
    public final org.telegram.ui.Cells.x8[] Z;
    public org.telegram.ui.ActionBar.e6 Z0;
    public final ArrayList f44736a;
    public float f44737a0;
    public cl0 f44738a1;
    public final HashMap f44739b;
    public TL_account.Password f44740b0;
    public boolean f44741b1;
    public final HashMap f44742c;
    public boolean f44743c0;
    public TLRPC.InputInvoice f44744c1;
    public final HashMap d;
    public int f44745d0;
    public org.telegram.messenger.u10 f44746d1;
    public a9.j0 f44747e;
    public ek0 f44748e0;
    public org.telegram.messenger.u10 f44749e1;
    public EditTextBoldCursor[] f44750f;
    public boolean f44751f0;
    public h00 f44752f1;
    public dl0 f44753g0;
    public int f44754g1;
    public org.telegram.ui.Cells.h6[] h;
    public boolean f44755h0;
    public boolean f44756i0;
    public boolean f44757j0;
    public String f44758k0;
    public boolean f44759l0;
    public TLRPC.User m0;
    public org.telegram.ui.ActionBar.q0 f44760n;
    public boolean f44761n0;
    public boolean f44762o0;
    public boolean f44763p0;
    public String f44764q0;
    public org.telegram.ui.Components.aq f44765r;
    public String f44766r0;
    public org.telegram.ui.Components.aq f44767s;
    public org.telegram.ui.ActionBar.d2 f44768s0;
    public jk0 f44769t0;
    public ArrayList f44770u0;
    public int f44771v0;
    public AnimatorSet f44772w;
    public boolean f44773w0;
    public WebView f44774x;
    public String f44775x0;
    public String f44776y;
    public String f44777y0;
    public TLRPC.TL_paymentSavedCredentialsCard f44778z0;

    public dl0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, org.telegram.messenger.zi ziVar, String str, int i3, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.d2 d2Var, boolean z11) {
        super(null);
        this.f44736a = new ArrayList();
        this.f44739b = new HashMap();
        this.f44742c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new org.telegram.ui.Cells.n4[3];
        this.K = new ArrayList();
        this.L = new org.telegram.ui.Cells.x6[3];
        this.N = new org.telegram.ui.Cells.y8[3];
        this.O = new org.telegram.ui.Cells.v9[2];
        this.Z = new org.telegram.ui.Cells.x8[7];
        this.f44737a0 = -4.5f;
        this.f44745d0 = 6;
        A0(inputInvoice, paymentForm, ziVar, str, i3, tL_payments_validatedRequestedInfo, tL_shippingOption, l10, str2, str3, tL_payments_validateRequestedInfo, z10, tL_inputPaymentCredentialsGooglePay, d2Var, z11);
    }

    public static void Z(dl0 dl0Var, TL_account.Password password, byte[] bArr) {
        byte[] bArr2;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = org.telegram.messenger.hv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        xy xyVar = new xy(20, dl0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.hv.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            gettmppassword.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                xyVar.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(dl0Var.currentAccount).sendRequest(gettmppassword, xyVar, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        xyVar.run(null, tL_error2);
    }

    public static void a0(dl0 dl0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        dl0Var.J0(false);
        dl0Var.N0(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            char c2 = 65535;
            switch (str.hashCode()) {
                case -2092780146:
                    if (str.equals("ADDRESS_CITY_INVALID")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1623547228:
                    if (str.equals("ADDRESS_STREET_LINE1_INVALID")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1224177757:
                    if (str.equals("ADDRESS_COUNTRY_INVALID")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1031752045:
                    if (str.equals("REQ_INFO_NAME_INVALID")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -274035920:
                    if (str.equals("ADDRESS_POSTCODE_INVALID")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 417441502:
                    if (str.equals("ADDRESS_STATE_INVALID")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 708423542:
                    if (str.equals("REQ_INFO_PHONE_INVALID")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 863965605:
                    if (str.equals("ADDRESS_STREET_LINE2_INVALID")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 889106340:
                    if (str.equals("REQ_INFO_EMAIL_INVALID")) {
                        c2 = '\b';
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    dl0Var.K0(2);
                    return;
                case 1:
                    dl0Var.K0(0);
                    return;
                case 2:
                    dl0Var.K0(4);
                    return;
                case 3:
                    dl0Var.K0(6);
                    return;
                case 4:
                    dl0Var.K0(5);
                    return;
                case 5:
                    dl0Var.K0(3);
                    return;
                case 6:
                    dl0Var.K0(9);
                    return;
                case 7:
                    dl0Var.K0(1);
                    return;
                case '\b':
                    dl0Var.K0(7);
                    return;
                default:
                    org.telegram.ui.Components.t4.e0(dl0Var.currentAccount, tL_error, dl0Var, tLObject, new Object[0]);
                    return;
            }
        }
    }

    public static void b0(dl0 dl0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        int i3;
        dl0Var.F0 = tL_payments_validatedRequestedInfo;
        if (dl0Var.D0.saved_info != null && !dl0Var.U0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(dl0Var.currentAccount);
            ei.u5 u5Var = new ei.u5(26);
            if (dl0Var.X0) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            connectionsManager.sendRequest(tL_payments_clearSavedInfo, u5Var, i3);
        }
        dl0Var.z0();
        dl0Var.J0(false);
        dl0Var.N0(true, false);
    }

    public static void c0(dl0 dl0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        dl0Var.J0(false);
        dl0Var.N0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.t4.e0(dl0Var.currentAccount, tL_error, dl0Var, tLObject, new Object[0]);
        }
    }

    public static void d0(dl0 dl0Var, org.telegram.ui.Components.ac acVar, boolean z10, TLRPC.Message message) {
        acVar.b();
        if (z10) {
            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(wm.qa(message.f27022id, org.telegram.messenger.zi.B0(message)));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = message.f27022id;
        tL_payments_getPaymentReceipt.peer = org.telegram.messenger.hp.s1(dl0Var.currentAccount).m1(message.peer_id);
        ConnectionsManager.getInstance(dl0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new zj0(dl0Var, 0), 2);
    }

    public static void e0(dl0 dl0Var) {
        int i3;
        TL_account.resendPasswordEmail resendpasswordemail = new TL_account.resendPasswordEmail();
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(dl0Var.currentAccount);
        ei.u5 u5Var = new ei.u5(26);
        if (dl0Var.X0) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        connectionsManager.sendRequest(resendpasswordemail, u5Var, i3);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dl0Var.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131746130, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.U = M0;
        s1Var.S = org.telegram.messenger.bd.M0(2131689472, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
        dl0Var.showDialog(s1Var);
    }

    public static void f0(dl0 dl0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        ci.t8 t8Var = new ci.t8(dl0Var, z10, str, 8);
        if (!z10) {
            byte[] h12 = org.telegram.messenger.g0.h1(str2);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = dl0Var.f44740b0.new_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                updatepasswordsettings.new_settings.new_password_hash = org.telegram.messenger.hv.b(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                if (updatepasswordsettings.new_settings.new_password_hash == null) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "ALGO_INVALID";
                    t8Var.run(null, tL_error);
                }
                ConnectionsManager.getInstance(dl0Var.currentAccount).sendRequest(updatepasswordsettings, t8Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            t8Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(dl0Var.currentAccount).sendRequest(updatepasswordsettings, t8Var, 10);
    }

    public static void g0(dl0 dl0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.t4.e0(dl0Var.currentAccount, tL_error, dl0Var, tL_payments_sendPaymentForm, new Object[0]);
        dl0Var.J0(false);
        dl0Var.N0(false, false);
        dl0Var.f44741b1 = true;
        dl0Var.f44754g1 = 4;
        cl0 cl0Var = dl0Var.f44738a1;
        if (cl0Var != null) {
            cl0Var.e(4);
        }
    }

    public static void h0(dl0 dl0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.d2 Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            ci.wb.m1(dl0Var.getParentActivity(), dl0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, dl0Var.Z0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (Q = LaunchActivity.Q()) != 0) {
            ?? obj = new Object();
            obj.f27395a = true;
            dl0 dl0Var2 = new dl0((TLRPC.PaymentReceipt) tLObject);
            dl0Var2.f44746d1 = dl0Var.f44746d1;
            dl0Var2.f44749e1 = dl0Var.f44749e1;
            Q.showAsSheet(dl0Var2, obj);
        }
    }

    public static void i0(dl0 dl0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        dl0Var.N0(true, false);
        dl0Var.J0(false);
        if (tLObject != null) {
            dl0Var.f44773w0 = true;
            org.telegram.messenger.h10.i(dl0Var.currentAccount).f22859y = (TL_account.tmpPassword) tLObject;
            org.telegram.messenger.h10.i(dl0Var.currentAccount).v(false);
            dl0Var.z0();
        } else if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            try {
                dl0Var.f44750f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.g0.G3(3.25f, dl0Var.f44750f[1], null);
            dl0Var.f44750f[1].setText("");
        } else {
            org.telegram.ui.Components.t4.e0(dl0Var.currentAccount, tL_error, dl0Var, gettmppassword, new Object[0]);
        }
    }

    public static void j0(dl0 dl0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.d2 Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            ci.wb.m1(dl0Var.getParentActivity(), dl0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, dl0Var.Z0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (Q = LaunchActivity.Q()) != 0) {
            ?? obj = new Object();
            obj.f27395a = true;
            dl0 dl0Var2 = new dl0((TLRPC.PaymentReceipt) tLObject);
            dl0Var2.f44746d1 = dl0Var.f44746d1;
            dl0Var2.f44749e1 = dl0Var.f44749e1;
            Q.showAsSheet(dl0Var2, obj);
        }
    }

    public static void k0(dl0 dl0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.n0(password, false)) {
                org.telegram.ui.Components.t4.w0(dl0Var.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, null), true);
                return;
            } else if (!password.has_password) {
                dl0Var.f44773w0 = false;
                dl0Var.z0();
                return;
            } else {
                Utilities.f21387e.c(new hc0(dl0Var, password, org.telegram.messenger.g0.h1(str), 17));
                return;
            }
        }
        org.telegram.ui.Components.t4.e0(dl0Var.currentAccount, tL_error, dl0Var, getpassword, new Object[0]);
        dl0Var.N0(true, false);
        dl0Var.J0(false);
    }

    public static void l0(dl0 dl0Var, org.telegram.ui.Components.ac acVar, boolean z10, TLRPC.Message[] messageArr) {
        acVar.b();
        if (z10) {
            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(wm.qa(messageArr[0].f27022id, org.telegram.messenger.zi.B0(messageArr[0])));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = messageArr[0].f27022id;
        tL_payments_getPaymentReceipt.peer = org.telegram.messenger.hp.s1(dl0Var.currentAccount).m1(messageArr[0].peer_id);
        ConnectionsManager.getInstance(dl0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new zj0(dl0Var, 2), 2);
    }

    public static void m0(org.telegram.ui.dl0 r23, java.lang.String r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dl0.m0(org.telegram.ui.dl0, java.lang.String, android.view.View):void");
    }

    public static void n0(dl0 dl0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        String G;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(dl0Var.currentAccount).sendRequest(new TL_account.getPassword(), new gi.b3(9, dl0Var, z10), 8);
            return;
        }
        dl0Var.N0(true, false);
        if (z10) {
            TL_account.Password password = dl0Var.f44740b0;
            password.has_password = false;
            password.current_algo = null;
            dl0Var.U.a(password);
            dl0Var.finishFragment();
        } else if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (dl0Var.getParentActivity() != null) {
                dl0Var.z0();
            }
        } else if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    dl0Var.L0(org.telegram.messenger.bd.M0(2131689472, null), org.telegram.messenger.bd.M0(2131747453, null));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    dl0Var.L0(org.telegram.messenger.bd.M0(2131689472, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G));
                    return;
                } else {
                    dl0Var.L0(org.telegram.messenger.bd.M0(2131689472, null), tL_error.text);
                    return;
                }
            }
            dl0Var.f44745d0 = Utilities.z(tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dl0Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new rb0(8, dl0Var, str));
            String M0 = org.telegram.messenger.bd.M0(2131742831, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.U = M0;
            s1Var.S = org.telegram.messenger.bd.M0(2131742832, null);
            Dialog showDialog = dl0Var.showDialog(s1Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        }
    }

    public static void o0(org.telegram.ui.dl0 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dl0.o0(org.telegram.ui.dl0):void");
    }

    public static void p0(dl0 dl0Var) {
        int i3 = 0;
        if (org.telegram.messenger.h10.i(dl0Var.currentAccount).f22859y != null && org.telegram.messenger.h10.i(dl0Var.currentAccount).f22859y.valid_until < ConnectionsManager.getInstance(dl0Var.currentAccount).getCurrentTime() + 60) {
            org.telegram.messenger.h10.i(dl0Var.currentAccount).f22859y = null;
            org.telegram.messenger.h10.i(dl0Var.currentAccount).v(false);
        }
        if (org.telegram.messenger.h10.i(dl0Var.currentAccount).f22859y != null) {
            dl0Var.F0();
        } else if (dl0Var.f44750f[1].length() == 0) {
            try {
                dl0Var.f44750f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.g0.G3(2.5f, dl0Var.f44750f[1], null);
        } else {
            String obj = dl0Var.f44750f[1].getText().toString();
            dl0Var.N0(true, true);
            dl0Var.J0(true);
            TL_account.getPassword getpassword = new TL_account.getPassword();
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(dl0Var.currentAccount);
            y9 y9Var = new y9(dl0Var, obj, getpassword, 28);
            if (dl0Var.X0) {
                i3 = 8;
            }
            connectionsManager.sendRequest(getpassword, y9Var, i3 | 2);
        }
    }

    public static void r0(dl0 dl0Var) {
        if (dl0Var.R0) {
            return;
        }
        dl0Var.N0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        dl0Var.J0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = dl0Var.f44744c1;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (dl0Var.O0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = dl0Var.getMessagesController().m1(dl0Var.O0.f26868k.peer_id);
            tL_inputInvoiceMessage.msg_id = dl0Var.O0.f1();
            dl0Var.J0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = dl0Var.P0;
            dl0Var.J0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = dl0Var.J0;
        tL_payments_validateRequestedInfo2.save = dl0Var.U0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (dl0Var.D0.invoice.name_requested) {
            dl0Var.J0.info.name = dl0Var.f44750f[6].getText().toString();
            dl0Var.J0.info.flags |= 1;
        }
        int i3 = 8;
        if (dl0Var.D0.invoice.phone_requested) {
            dl0Var.J0.info.phone = "+" + dl0Var.f44750f[8].getText().toString() + dl0Var.f44750f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = dl0Var.J0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (dl0Var.D0.invoice.email_requested) {
            dl0Var.J0.info.email = dl0Var.f44750f[7].getText().toString().trim();
            dl0Var.J0.info.flags |= 4;
        }
        if (dl0Var.D0.invoice.shipping_address_requested) {
            dl0Var.J0.info.shipping_address = new TLRPC.TL_postAddress();
            dl0Var.J0.info.shipping_address.street_line1 = dl0Var.f44750f[0].getText().toString();
            dl0Var.J0.info.shipping_address.street_line2 = dl0Var.f44750f[1].getText().toString();
            dl0Var.J0.info.shipping_address.city = dl0Var.f44750f[2].getText().toString();
            dl0Var.J0.info.shipping_address.state = dl0Var.f44750f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = dl0Var.J0.info.shipping_address;
            String str = dl0Var.C0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = dl0Var.f44750f[5].getText().toString();
            dl0Var.J0.info.flags |= 8;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo3 = dl0Var.J0;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(dl0Var.currentAccount);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo4 = dl0Var.J0;
        xy xyVar = new xy(18, dl0Var, tL_payments_validateRequestedInfo3);
        if (!dl0Var.X0) {
            i3 = 0;
        }
        connectionsManager.sendRequest(tL_payments_validateRequestedInfo4, xyVar, i3 | 2);
    }

    public static JSONObject u0() {
        List asList = Arrays.asList("AMEX", "DISCOVER", "JCB", "MASTERCARD", "VISA");
        List asList2 = Arrays.asList("PAN_ONLY", "CRYPTOGRAM_3DS");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "CARD");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("allowedAuthMethods", new JSONArray((Collection) asList2));
        jSONObject2.put("allowedCardNetworks", new JSONArray((Collection) asList));
        jSONObject.put("parameters", jSONObject2);
        return jSONObject;
    }

    public final void A0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, org.telegram.messenger.zi ziVar, String str, int i3, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.d2 d2Var, boolean z11) {
        if (d2Var != null) {
            this.currentAccount = d2Var.getCurrentAccount();
        }
        this.f44771v0 = i3;
        this.f44768s0 = d2Var;
        this.f44775x0 = str2;
        this.K0 = tL_inputPaymentCredentialsGooglePay;
        this.F0 = tL_payments_validatedRequestedInfo;
        this.D0 = paymentForm;
        this.H0 = tL_shippingOption;
        this.I0 = l10;
        this.O0 = ziVar;
        this.P0 = str;
        this.f44744c1 = inputInvoice;
        this.V0 = z10;
        this.X0 = z11;
        this.T0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.D0.native_provider)) ? false : true;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(paymentForm.bot_id));
        this.m0 = a22;
        if (a22 != null) {
            this.f44764q0 = a22.first_name;
        } else {
            this.f44764q0 = "";
        }
        this.f44766r0 = paymentForm.title;
        this.J0 = tL_payments_validateRequestedInfo;
        this.U0 = true;
        if (!z10 && this.f44771v0 != 4) {
            this.V0 = !this.D0.saved_credentials.isEmpty();
        } else {
            this.V0 = z10;
        }
        if (str3 == null) {
            if (this.D0.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.D0.saved_credentials.get(0);
            this.f44778z0 = tL_paymentSavedCredentialsCard;
            this.f44777y0 = tL_paymentSavedCredentialsCard.title;
            return;
        }
        this.f44777y0 = str3;
    }

    public final void B0(Context context) {
        int i3;
        Optional empty;
        if (getParentActivity() != null) {
            a7.l lVar = new a7.l();
            if (this.D0.invoice.test) {
                i3 = 3;
            } else {
                i3 = 1;
            }
            if (i3 != 2 && i3 != 1 && i3 != 3) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(k2.p1.i(i3, "Invalid environment value "));
            }
            lVar.f156a = i3;
            this.f44747e = new com.google.android.gms.common.api.j(context, x8.p.f58568a, new x8.o(lVar), com.google.android.gms.common.api.i.f6594c);
            try {
                JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                put.put("allowedPaymentMethods", new JSONArray().put(u0()));
                empty = Optional.of(put);
            } catch (JSONException unused) {
                empty = Optional.empty();
            }
            if (!empty.isPresent()) {
                return;
            }
            String jSONObject = ((JSONObject) empty.get()).toString();
            ?? obj = new Object();
            p6.m.h(jSONObject, "isReadyToPayRequestJson cannot be null!");
            obj.f58528f = jSONObject;
            a9.j0 j0Var = this.f44747e;
            j0Var.getClass();
            com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
            b10.f6735a = 23705;
            b10.f6737c = new org.telegram.ui.Components.y00((Object) obj);
            j0Var.e(0, b10.a()).addOnCompleteListener(getParentActivity(), new fk0(this, 0));
        }
    }

    public final void C0() {
        if (this.f44751f0) {
            return;
        }
        this.f44751f0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new zj0(this, 3), 10);
    }

    public final boolean D0(org.telegram.ui.ActionBar.q4 q4Var, Activity activity) {
        int i3 = 0;
        if (this.f44744c1 != null) {
            if (q4Var != null) {
                ArrayList arrayList = new ArrayList(q4Var.getFragmentStack());
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                    if (d2Var instanceof dl0) {
                        d2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.m0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().s6) && this.P0 == null) || (this.P0 != null && getMessagesController().f23128t6 != null && Objects.equals(this.P0, getMessagesController().f23128t6))) && q4Var != null) {
            ArrayList arrayList2 = new ArrayList(q4Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                if ((d2Var2 instanceof wm) || (d2Var2 instanceof PremiumPreviewFragment)) {
                    d2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.f41653q0 = true;
            ((ActionBarLayout) q4Var).T(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).f41328y0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void E0(org.telegram.ui.ActionBar.d2 d2Var) {
        org.telegram.messenger.g0.v1(this.fragmentView);
        if (d2Var instanceof dl0) {
            dl0 dl0Var = (dl0) d2Var;
            dl0Var.f44738a1 = this.f44738a1;
            dl0Var.Z0 = this.Z0;
            dl0Var.Y0 = this.Y0;
            dl0Var.f44778z0 = this.f44778z0;
        }
    }

    public final void F0() {
        long j10;
        String str;
        if (this.R0) {
            return;
        }
        int i3 = 0;
        N0(false, true);
        TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.f44744c1;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.O0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().m1(this.O0.f26868k.peer_id);
            tL_inputInvoiceMessage.msg_id = this.O0.f1();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.P0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.D0.form_id;
        if (org.telegram.messenger.h10.i(this.currentAccount).f22859y != null && this.f44778z0 != null) {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.f27019id = this.f44778z0.f27132id;
            tL_inputPaymentCredentialsSaved.tmp_password = org.telegram.messenger.h10.i(this.currentAccount).f22859y.tmp_password;
        } else {
            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = this.K0;
            if (tL_inputPaymentCredentialsGooglePay != null) {
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsGooglePay;
            } else {
                TLRPC.TL_inputPaymentCredentials tL_inputPaymentCredentials = new TLRPC.TL_inputPaymentCredentials();
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentials;
                tL_inputPaymentCredentials.save = this.V0;
                tL_inputPaymentCredentials.data = new TLRPC.TL_dataJSON();
                tL_payments_sendPaymentForm.credentials.data.data = this.f44775x0;
            }
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.F0;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.f27133id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags = 1 | tL_payments_sendPaymentForm.flags;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.H0;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.f27139id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        if ((this.D0.invoice.flags & 256) != 0) {
            Long l10 = this.I0;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = 0;
            }
            tL_payments_sendPaymentForm.tip_amount = j10;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        xy xyVar = new xy(19, this, tL_payments_sendPaymentForm);
        if (this.X0) {
            i3 = 8;
        }
        connectionsManager.sendRequest(tL_payments_sendPaymentForm, xyVar, i3 | 2);
    }

    public final void G0(boolean z10) {
        String str;
        String str2;
        if (!z10 && this.T.getVisibility() == 0) {
            String text = this.T.getText();
            if (text.length() == 0) {
                org.telegram.ui.Cells.l3 l3Var = this.T;
                try {
                    l3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.G3(2.5f, l3Var, null);
                return;
            }
            N0(true, true);
            TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
            confirmpasswordemail.code = text;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new zj0(this, 1), 10);
            return;
        }
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z10) {
            this.f44760n.setVisibility(0);
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.flags = 2;
            passwordinputsettings.email = "";
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            str2 = null;
            str = null;
        } else {
            String obj = this.f44750f[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                K0(0);
                return;
            } else if (!obj.equals(this.f44750f[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), org.telegram.messenger.bd.M0(2131747454, null), 0).show();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                K0(1);
                return;
            } else {
                String obj2 = this.f44750f[2].getText().toString();
                if (obj2.length() < 3) {
                    K0(2);
                    return;
                }
                int lastIndexOf = obj2.lastIndexOf(46);
                int lastIndexOf2 = obj2.lastIndexOf(64);
                if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                    updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
                    TL_account.passwordInputSettings passwordinputsettings2 = new TL_account.passwordInputSettings();
                    updatepasswordsettings.new_settings = passwordinputsettings2;
                    int i3 = passwordinputsettings2.flags;
                    passwordinputsettings2.flags = i3 | 1;
                    passwordinputsettings2.hint = "";
                    passwordinputsettings2.new_algo = this.f44740b0.new_algo;
                    passwordinputsettings2.flags = 3 | i3;
                    passwordinputsettings2.email = obj2.trim();
                    str = obj;
                    str2 = obj2;
                } else {
                    K0(2);
                    return;
                }
            }
        }
        N0(true, true);
        Utilities.f21387e.c(new gi.q1(this, z10, str2, str, updatepasswordsettings));
    }

    public final void H0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        int i3;
        int i10;
        int i11;
        boolean z10;
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        boolean z11 = true;
        org.telegram.ui.Cells.x8[] x8VarArr = this.Z;
        if (tL_postAddress != null) {
            String str = tL_postAddress.street_line1;
            String str2 = tL_postAddress.street_line2;
            String str3 = tL_postAddress.city;
            String str4 = tL_postAddress.state;
            String str5 = tL_postAddress.country_iso2;
            String str6 = tL_postAddress.post_code;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" ");
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str3);
            com.google.android.recaptcha.internal.a.s(sb2, ", ", str4, ", ", str5);
            x8VarArr[2].b(2131232272, a1.g.s(sb2, ", ", str6), org.telegram.messenger.bd.M0(2131747389, null), true);
        }
        org.telegram.ui.Cells.x8 x8Var = x8VarArr[2];
        int i12 = 8;
        if (tL_paymentRequestedInfo.shipping_address != null) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        x8Var.setVisibility(i3);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            x8VarArr[3].b(2131232100, str7, org.telegram.messenger.bd.M0(2131747420, null), true);
        }
        org.telegram.ui.Cells.x8 x8Var2 = x8VarArr[3];
        if (tL_paymentRequestedInfo.name != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        x8Var2.setVisibility(i10);
        if (tL_paymentRequestedInfo.phone != null) {
            org.telegram.ui.Cells.x8 x8Var3 = x8VarArr[4];
            String b10 = mf.b.c().b(tL_paymentRequestedInfo.phone);
            String M0 = org.telegram.messenger.bd.M0(2131747418, null);
            if (tL_paymentRequestedInfo.email == null && this.H0 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            x8Var3.b(2131232083, b10, M0, z10);
        }
        org.telegram.ui.Cells.x8 x8Var4 = x8VarArr[4];
        if (tL_paymentRequestedInfo.phone != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        x8Var4.setVisibility(i11);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            org.telegram.ui.Cells.x8 x8Var5 = x8VarArr[5];
            String M02 = org.telegram.messenger.bd.M0(2131747423, null);
            if (this.H0 == null) {
                z11 = false;
            }
            x8Var5.b(2131232222, str8, M02, z11);
        }
        org.telegram.ui.Cells.x8 x8Var6 = x8VarArr[5];
        if (tL_paymentRequestedInfo.email != null) {
            i12 = 0;
        }
        x8Var6.setVisibility(i12);
    }

    public final void I0(TL_account.Password password) {
        boolean z10;
        if (password != null && password.has_password) {
            if (getParentActivity() == null) {
                return;
            }
            z0();
            return;
        }
        this.f44740b0 = password;
        if (password != null && !TextUtils.isEmpty(password.email_unconfirmed_pattern)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44743c0 = z10;
        P0();
    }

    public final void J0(boolean z10) {
        this.Q0 = z10;
        this.H = !z10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.Q0);
        }
        org.telegram.ui.Cells.x8 x8Var = this.Z[0];
        if (x8Var != null) {
            x8Var.setEnabled(!this.Q0);
        }
    }

    public final void K0(int i3) {
        EditTextBoldCursor editTextBoldCursor = this.f44750f[i3];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.g0.G3(2.5f, editTextBoldCursor, null);
    }

    public final void L0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = str;
        s1Var.U = str2;
        showDialog(s1Var);
    }

    public final void M0(Runnable runnable) {
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(getParentActivity(), false, 1, null);
        h.P = org.telegram.messenger.bd.M0(2131747422, null);
        h.Q = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.f44778z0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(2131232273);
        } else {
            String str = this.f44777y0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(2131232273);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_paymentSavedCredentialsCard> arrayList4 = this.D0.saved_credentials;
        int size = arrayList4.size();
        int i3 = 0;
        while (i3 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i3);
            i3++;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard3 = tL_paymentSavedCredentialsCard2;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.f44778z0;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.f27132id, tL_paymentSavedCredentialsCard4.f27132id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(2131232273);
                arrayList3.add(tL_paymentSavedCredentialsCard3);
            }
        }
        ArrayList<TLRPC.TL_paymentFormMethod> arrayList5 = this.D0.additional_methods;
        int size2 = arrayList5.size();
        int i10 = 0;
        while (i10 < size2) {
            TLRPC.TL_paymentFormMethod tL_paymentFormMethod = arrayList5.get(i10);
            i10++;
            arrayList.add(tL_paymentFormMethod.title);
            arrayList2.add(2131232275);
        }
        arrayList.add(org.telegram.messenger.bd.M0(2131747421, null));
        arrayList2.add(2131232044);
        int[] iArr = new int[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            iArr[i11] = ((Integer) arrayList2.get(i11)).intValue();
        }
        org.telegram.ui.Components.r2 r2Var = new org.telegram.ui.Components.r2(this, runnable, arrayList3, arrayList, 1);
        h.M = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        h.N = iArr;
        h.L = r2Var;
        showDialog(h);
    }

    public final void N0(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f44772w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10 && this.f44760n != null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f44772w = animatorSet2;
            if (z11) {
                this.f44765r.setVisibility(0);
                this.f44760n.setEnabled(false);
                AnimatorSet animatorSet3 = this.f44772w;
                View contentView = this.f44760n.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, property, 0.1f);
                View contentView2 = this.f44760n.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, property2, 0.1f);
                View contentView3 = this.f44760n.getContentView();
                Property property3 = View.ALPHA;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, property3, 0.0f), ObjectAnimator.ofFloat(this.f44765r, property, 1.0f), ObjectAnimator.ofFloat(this.f44765r, property2, 1.0f), ObjectAnimator.ofFloat(this.f44765r, property3, 1.0f));
            } else if (this.f44774x != null) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f44765r, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.f44765r, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.f44765r, View.ALPHA, 0.0f));
            } else {
                this.f44760n.getContentView().setVisibility(0);
                this.f44760n.setEnabled(true);
                AnimatorSet animatorSet4 = this.f44772w;
                org.telegram.ui.Components.aq aqVar = this.f44765r;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(aqVar, property4, 0.1f);
                org.telegram.ui.Components.aq aqVar2 = this.f44765r;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(aqVar2, property5, 0.1f);
                org.telegram.ui.Components.aq aqVar3 = this.f44765r;
                Property property6 = View.ALPHA;
                animatorSet4.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(aqVar3, property6, 0.0f));
                if (!isFinishing()) {
                    this.f44772w.playTogether(ObjectAnimator.ofFloat(this.f44760n.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.f44760n.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.f44760n.getContentView(), property6, 1.0f));
                }
            }
            this.f44772w.addListener(new wk0(this, z11, 0));
            this.f44772w.setDuration(150L);
            this.f44772w.start();
        } else if (this.V != null) {
            this.f44772w = new AnimatorSet();
            if (z11) {
                this.f44767s.setVisibility(0);
                this.X.setEnabled(false);
                AnimatorSet animatorSet5 = this.f44772w;
                TextView textView = this.V;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, property7, 0.1f);
                TextView textView2 = this.V;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, property8, 0.1f);
                TextView textView3 = this.V;
                Property property9 = View.ALPHA;
                animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, property9, 0.0f), ObjectAnimator.ofFloat(this.f44767s, property7, 1.0f), ObjectAnimator.ofFloat(this.f44767s, property8, 1.0f), ObjectAnimator.ofFloat(this.f44767s, property9, 1.0f));
            } else {
                this.V.setVisibility(0);
                this.X.setEnabled(true);
                AnimatorSet animatorSet6 = this.f44772w;
                org.telegram.ui.Components.aq aqVar4 = this.f44767s;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(aqVar4, property10, 0.1f);
                org.telegram.ui.Components.aq aqVar5 = this.f44767s;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(aqVar5, property11, 0.1f);
                org.telegram.ui.Components.aq aqVar6 = this.f44767s;
                Property property12 = View.ALPHA;
                animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(aqVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.V, property10, 1.0f), ObjectAnimator.ofFloat(this.V, property11, 1.0f), ObjectAnimator.ofFloat(this.V, property12, 1.0f));
            }
            this.f44772w.addListener(new wk0(this, z11, 1));
            this.f44772w.setDuration(150L);
            this.f44772w.start();
        }
    }

    public final void O0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131747362, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("PaymentTransactionMessage2", null, 2131747363, str, this.f44764q0, this.f44766r0));
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, null), new fk0(this, 5));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        showDialog(s1Var);
    }

    public final void P0() {
        if (this.f44771v0 == 6) {
            org.telegram.ui.Cells.y8[] y8VarArr = this.N;
            if (y8VarArr[2] != null) {
                int i3 = 0;
                this.f44760n.setVisibility(0);
                TL_account.Password password = this.f44740b0;
                ArrayList arrayList = this.K;
                org.telegram.ui.Cells.n4[] n4VarArr = this.J;
                org.telegram.ui.Cells.v9[] v9VarArr = this.O;
                if (password == null) {
                    N0(true, true);
                    y8VarArr[2].setVisibility(8);
                    v9VarArr[0].setVisibility(8);
                    v9VarArr[1].setVisibility(8);
                    this.T.setVisibility(8);
                    n4VarArr[0].setVisibility(8);
                    n4VarArr[1].setVisibility(8);
                    y8VarArr[0].setVisibility(8);
                    for (int i10 = 0; i10 < 3; i10++) {
                        ((View) this.f44750f[i10].getParent()).setVisibility(8);
                    }
                    while (i3 < arrayList.size()) {
                        ((View) arrayList.get(i3)).setVisibility(8);
                        i3++;
                    }
                    return;
                }
                N0(true, false);
                if (this.f44743c0) {
                    org.telegram.ui.Cells.y8 y8Var = y8VarArr[2];
                    String str = this.f44740b0.email_unconfirmed_pattern;
                    if (str == null) {
                        str = "";
                    }
                    y8Var.setText(org.telegram.messenger.bd.a0("EmailPasswordConfirmText2", null, 2131751200, str));
                    y8VarArr[2].setVisibility(0);
                    v9VarArr[0].setVisibility(0);
                    v9VarArr[1].setVisibility(0);
                    this.T.setVisibility(0);
                    y8VarArr[1].setText("");
                    n4VarArr[0].setVisibility(8);
                    n4VarArr[1].setVisibility(8);
                    y8VarArr[0].setVisibility(8);
                    for (int i11 = 0; i11 < 3; i11++) {
                        ((View) this.f44750f[i11].getParent()).setVisibility(8);
                    }
                    while (i3 < arrayList.size()) {
                        ((View) arrayList.get(i3)).setVisibility(8);
                        i3++;
                    }
                    return;
                }
                y8VarArr[2].setVisibility(8);
                v9VarArr[0].setVisibility(8);
                v9VarArr[1].setVisibility(8);
                y8VarArr[1].setText(org.telegram.messenger.bd.M0(2131747399, null));
                this.T.setVisibility(8);
                n4VarArr[0].setVisibility(0);
                n4VarArr[1].setVisibility(0);
                y8VarArr[0].setVisibility(0);
                for (int i12 = 0; i12 < 3; i12++) {
                    ((View) this.f44750f[i12].getParent()).setVisibility(0);
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((View) arrayList.get(i13)).setVisibility(0);
                }
            }
        }
    }

    public final void Q0() {
        org.telegram.ui.Cells.y8[] y8VarArr = this.N;
        if (y8VarArr[0] != null) {
            org.telegram.ui.Cells.x6[] x6VarArr = this.L;
            if (x6VarArr[2] != null) {
                TLRPC.PaymentForm paymentForm = this.D0;
                if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.f44774x != null && this.A0)) {
                    this.M.setVisibility(8);
                    y8VarArr[0].setVisibility(8);
                    org.telegram.ui.Cells.x6 x6Var = x6VarArr[2];
                    org.telegram.ui.ActionBar.r6.a0(x6Var, x6Var.getContext(), 2131231230, org.telegram.ui.ActionBar.k6.f27843b7);
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131747429, null));
                if (this.D0.password_missing) {
                    C0();
                    spannableStringBuilder.append((CharSequence) "\n");
                    int length = spannableStringBuilder.length();
                    String M0 = org.telegram.messenger.bd.M0(2131747428, null);
                    int indexOf = M0.indexOf(42);
                    int lastIndexOf = M0.lastIndexOf(42);
                    spannableStringBuilder.append((CharSequence) M0);
                    if (indexOf != -1 && lastIndexOf != -1) {
                        int i3 = indexOf + length;
                        int i10 = lastIndexOf + length;
                        y8VarArr[0].getTextView().setMovementMethod(new org.telegram.messenger.c0(false));
                        spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                        spannableStringBuilder.replace(i3, i3 + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new al0(this), i3, i10 - 1, 33);
                    }
                }
                this.M.setEnabled(true);
                y8VarArr[0].setText(spannableStringBuilder);
                this.M.setVisibility(0);
                y8VarArr[0].setVisibility(0);
                org.telegram.ui.Cells.x6 x6Var2 = x6VarArr[2];
                org.telegram.ui.ActionBar.r6.a0(x6Var2, x6Var2.getContext(), 2131231229, org.telegram.ui.ActionBar.k6.f27843b7);
            }
        }
    }

    public final void R0() {
        this.S0[0] = y0(this.f44770u0);
        this.S.a(org.telegram.messenger.bd.M0(2131747361, null), this.S0[0], true);
        TextView textView = this.V;
        if (textView != null) {
            textView.setText(org.telegram.messenger.bd.a0("PaymentCheckoutPay", null, 2131747419, this.S0[0]));
        }
        if (this.f44769t0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Si);
            int childCount = this.f44769t0.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                TextView textView2 = (TextView) this.f44769t0.getChildAt(i3);
                if (textView2.getTag().equals(this.I0)) {
                    org.telegram.ui.ActionBar.k6.C1(themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Ti, this.Z0);
                } else {
                    org.telegram.ui.ActionBar.k6.C1(536870911 & themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Z8, this.Z0);
                }
                textView2.invalidate();
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dl0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23280p0) {
            TLRPC.PaymentForm paymentForm = this.D0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            Q0();
        } else if (i3 == org.telegram.messenger.hs.f23293r0) {
            TLRPC.PaymentForm paymentForm2 = this.D0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            Q0();
        } else if (i3 == org.telegram.messenger.hs.f23197a1) {
            this.f44741b1 = true;
            removeSelfFromStack();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.Z0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.F, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28160s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        if (this.f44750f != null) {
            int i3 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f44750f;
                if (i3 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) editTextBoldCursorArr[i3].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
                i3++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
        }
        if (this.h != null) {
            for (int i10 = 0; i10 < this.h.length; i10++) {
            }
        }
        int i11 = 0;
        while (true) {
            org.telegram.ui.Cells.n4[] n4VarArr = this.J;
            if (i11 >= n4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(n4VarArr[i11], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
            i11++;
        }
        for (int i12 = 0; i12 < this.L.length; i12++) {
        }
        for (int i13 = 0; i13 < this.N.length; i13++) {
        }
        int i14 = 0;
        while (true) {
            ArrayList arrayList2 = this.K;
            if (i14 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) arrayList2.get(i14), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
            i14++;
        }
        int i15 = 1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.M, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.M, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        for (int i16 = 0; i16 < this.O.length; i16++) {
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.V, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s6));
        while (true) {
            org.telegram.ui.Cells.x8[] x8VarArr = this.Z;
            if (i15 < x8VarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(x8VarArr[i15], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
                i15++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.X, 268435456, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.X, 268435456, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27972i6));
                return arrayList;
            }
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.H;
    }

    @Override
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        if (i3 == 991) {
            org.telegram.messenger.g0.h3(new rw(this, i10, intent, 5));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        WebView webView = this.f44774x;
        if (webView != null && this.E) {
            if (z10) {
                webView.loadUrl(this.f44776y);
                this.E = false;
            }
            return false;
        }
        return !this.Q0;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.f44771v0 == 4 && this.Y0) {
            this.Y0 = false;
            this.X.callOnClick();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23280p0);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23293r0);
        if (this.f44771v0 != 4 || this.W0) {
            org.telegram.messenger.hs.f(this.currentAccount).b(this, org.telegram.messenger.hs.f23197a1);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dl0.onFragmentDestroy():void");
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        try {
            int i3 = this.f44771v0;
            if ((i3 == 2 || i3 == 6) && !this.D0.invoice.test) {
                getParentActivity().getWindow().setFlags(8192, 8192);
                org.telegram.messenger.g0.h2();
                return;
            }
            if (org.telegram.messenger.az.f21661s.length() != 0 && !org.telegram.messenger.az.A) {
                return;
            }
            getParentActivity().getWindow().clearFlags(8192);
            org.telegram.messenger.g0.h2();
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            ScrollView scrollView = this.F;
            if (scrollView != null) {
                org.telegram.messenger.g0.z3(scrollView, getThemedColor(org.telegram.ui.ActionBar.k6.f28160s8));
            }
            if (this.f44750f != null) {
                getThemedColor(org.telegram.ui.ActionBar.k6.G6);
                int i3 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.f44750f;
                    if (i3 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i3];
                        if (editTextBoldCursor != null) {
                            org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, this.Z0);
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11) {
            WebView webView = this.f44774x;
            if (webView != null) {
                if (this.f44771v0 != 4) {
                    TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.G0;
                    if (tL_paymentFormMethod != null) {
                        String str = tL_paymentFormMethod.url;
                        this.f44776y = str;
                        webView.loadUrl(str);
                        return;
                    }
                    String str2 = this.D0.url;
                    this.f44776y = str2;
                    webView.loadUrl(str2);
                    return;
                }
                return;
            }
            int i3 = this.f44771v0;
            if (i3 == 2) {
                org.telegram.messenger.g0.i3(new ek0(this, 3), 100L);
            } else if (i3 == 3) {
                this.f44750f[1].requestFocus();
                org.telegram.messenger.g0.K3(this.f44750f[1]);
            } else if (i3 == 4) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f44750f;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                }
            } else if (i3 == 6 && !this.f44743c0) {
                this.f44750f[0].requestFocus();
                org.telegram.messenger.g0.K3(this.f44750f[0]);
            }
        }
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.d2 d2Var) {
        E0(d2Var);
        return super.presentFragment(d2Var);
    }

    public final void s0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27878d6);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27972i6);
        frameLayout.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(frameLayout, N0, N, N2, null);
        this.P.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        frameLayout2.setClickable(true);
        this.Q.setFocusable(true);
        this.Q.setBackgroundResource(2131231222);
        if (this.L0 == null) {
            this.Q.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f));
        } else {
            this.Q.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        }
        this.P.addView(this.Q, b8.mf.c(48.0f, -1));
        this.Q.setOnClickListener(new ak0(this, 13));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.Q.addView(linearLayout, b8.mf.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(2131230909);
        linearLayout.addView(imageView, b8.mf.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(2131231224);
        this.Q.addView(imageView2, b8.mf.c(-1.0f, -1));
    }

    public final void t0(String str) {
        boolean z10;
        boolean z11;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.f25457b.getSystemService("phone");
            if (str == null && (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0)) {
                return;
            }
            if (getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (str != null || z10) {
                if (str == null) {
                    str = mf.b.d(telephonyManager.getLine1Number(), false);
                }
                if (!TextUtils.isEmpty(str)) {
                    int i3 = 4;
                    String str2 = null;
                    if (str.length() > 4) {
                        while (true) {
                            if (i3 >= 1) {
                                String substring = str.substring(0, i3);
                                if (((String) this.f44742c.get(substring)) != null) {
                                    str2 = str.substring(i3);
                                    this.f44750f[8].setText(substring);
                                    z11 = true;
                                    break;
                                }
                                i3--;
                            } else {
                                z11 = false;
                                break;
                            }
                        }
                        if (!z11) {
                            str2 = str.substring(1);
                            this.f44750f[8].setText(str.substring(0, 1));
                        }
                    }
                    if (str2 != null) {
                        this.f44750f[9].setText(str2);
                        EditTextBoldCursor editTextBoldCursor = this.f44750f[9];
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final long v0() {
        TLRPC.InputInvoice inputInvoice = this.f44744c1;
        if (inputInvoice instanceof TLRPC.TL_inputInvoiceStars) {
            TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose;
            if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
                return ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).stars;
            }
            if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) {
                return ((TLRPC.TL_inputStorePaymentStarsTopup) inputStorePaymentPurpose).stars;
            }
            if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) {
                return ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).stars;
            }
            return 0L;
        }
        return 0L;
    }

    public final long w0() {
        TLRPC.InputPeer inputPeer;
        TLRPC.InputInvoice inputInvoice = this.f44744c1;
        if (inputInvoice instanceof TLRPC.TL_inputInvoiceStars) {
            TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose;
            if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
                TLRPC.InputUser inputUser = ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).user_id;
                if (inputUser != null) {
                    return inputUser.user_id;
                }
                return 0L;
            } else if ((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) && (inputPeer = ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).boost_peer) != null) {
                return org.telegram.messenger.m5.n(inputPeer);
            } else {
                return 0L;
            }
        }
        return 0L;
    }

    public final String x0(ArrayList arrayList) {
        double d;
        long j10 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i3)).amount;
        }
        org.telegram.messenger.bd.E0();
        String upperCase = this.D0.invoice.currency.toUpperCase();
        long abs = Math.abs(j10);
        upperCase.getClass();
        char c2 = 65535;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    c2 = 0;
                    break;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    c2 = 1;
                    break;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    c2 = 2;
                    break;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    c2 = 3;
                    break;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    c2 = 4;
                    break;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    c2 = 5;
                    break;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    c2 = 6;
                    break;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    c2 = 7;
                    break;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    c2 = 11;
                    break;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    c2 = 14;
                    break;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    c2 = 15;
                    break;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    c2 = 16;
                    break;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    c2 = 17;
                    break;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    c2 = 18;
                    break;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    c2 = 19;
                    break;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    c2 = 20;
                    break;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    c2 = 21;
                    break;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    c2 = 22;
                    break;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    c2 = 23;
                    break;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    c2 = 24;
                    break;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    c2 = 25;
                    break;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    c2 = 26;
                    break;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    c2 = 27;
                    break;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    c2 = 28;
                    break;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    c2 = 29;
                    break;
                }
                break;
        }
        String str = " %.0f";
        switch (c2) {
            case 0:
            case '\b':
            case 11:
            case 15:
            case 16:
            case 19:
            case 22:
                d = abs / 1000.0d;
                str = " %.3f";
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\n':
            case '\f':
            case '\r':
            case 14:
            case 17:
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                d = abs;
                break;
            case 3:
                d = abs / 10000.0d;
                str = " %.4f";
                break;
            case '\t':
                double d10 = ((float) abs) / 100.0f;
                if (abs % 100 != 0) {
                    str = " %.2f";
                }
                d = d10;
                break;
            case 18:
                d = abs / 10.0d;
                str = " %.1f";
                break;
            default:
                d = abs / 100.0d;
                str = " %.2f";
                break;
        }
        return String.format(Locale.US, str, Double.valueOf(d)).trim();
    }

    public final String y0(ArrayList arrayList) {
        long j10 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i3)).amount;
        }
        Long l10 = this.I0;
        if (l10 != null) {
            j10 += l10.longValue();
        }
        return org.telegram.messenger.bd.E0().p(j10, this.D0.invoice.currency);
    }

    public final void z0() {
        int i3;
        int i10;
        boolean z10;
        int i11;
        int i12 = this.f44771v0;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 6) {
                                if (!this.U.c(this.f44775x0, this.f44777y0, this.V0, this.K0, this.f44778z0)) {
                                    dl0 dl0Var = new dl0(this.f44744c1, this.D0, this.O0, this.P0, 4, this.F0, this.H0, this.I0, this.f44775x0, this.f44777y0, this.J0, this.V0, this.K0, this.f44768s0, false);
                                    dl0Var.f44746d1 = this.f44746d1;
                                    dl0Var.f44749e1 = this.f44749e1;
                                    presentFragment(dl0Var, true);
                                    return;
                                }
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        boolean z11 = this.W0;
                        int i13 = org.telegram.messenger.hs.f23197a1;
                        if (z11) {
                            org.telegram.messenger.hs.f(this.currentAccount).n(this, i13);
                        }
                        org.telegram.messenger.hs.f(this.currentAccount).k(i13, new Object[0]);
                        if (getMessagesController().f23059l7 == null) {
                            if (!D0(getParentLayout(), getParentActivity()) && !isFinishing()) {
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        org.telegram.messenger.g0.i3(new ek0(this, 1), 500L);
                        return;
                    }
                    if (this.f44773w0) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    dl0 dl0Var2 = new dl0(this.f44744c1, this.D0, this.O0, this.P0, i11, this.F0, this.H0, this.I0, this.f44775x0, this.f44777y0, this.J0, this.V0, this.K0, this.f44768s0, this.X0);
                    dl0Var2.f44746d1 = this.f44746d1;
                    dl0Var2.f44749e1 = this.f44749e1;
                    presentFragment(dl0Var2, true);
                    return;
                }
                TLRPC.PaymentForm paymentForm = this.D0;
                if (paymentForm.password_missing && (z10 = this.V0)) {
                    dl0 dl0Var3 = new dl0(this.f44744c1, paymentForm, this.O0, this.P0, 6, this.F0, this.H0, this.I0, this.f44775x0, this.f44777y0, this.J0, z10, this.K0, this.f44768s0, this.X0);
                    this.f44753g0 = dl0Var3;
                    dl0Var3.f44746d1 = this.f44746d1;
                    dl0Var3.f44749e1 = this.f44749e1;
                    dl0Var3.I0(this.f44740b0);
                    dl0 dl0Var4 = this.f44753g0;
                    dl0Var4.U = new uk0(this);
                    presentFragment(dl0Var4, this.T0);
                    return;
                }
                bl0 bl0Var = this.U;
                if (bl0Var != null) {
                    bl0Var.c(this.f44775x0, this.f44777y0, this.V0, this.K0, null);
                    finishFragment();
                    return;
                }
                dl0 dl0Var5 = new dl0(this.f44744c1, paymentForm, this.O0, this.P0, 4, this.F0, this.H0, this.I0, this.f44775x0, this.f44777y0, this.J0, this.V0, this.K0, this.f44768s0, this.X0);
                dl0Var5.f44746d1 = this.f44746d1;
                dl0Var5.f44749e1 = this.f44749e1;
                presentFragment(dl0Var5, this.T0);
                return;
            }
            if (this.f44775x0 == null && this.f44777y0 == null) {
                if (this.f44778z0 != null) {
                    if (org.telegram.messenger.h10.i(this.currentAccount).f22859y != null && org.telegram.messenger.h10.i(this.currentAccount).f22859y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        org.telegram.messenger.h10.i(this.currentAccount).f22859y = null;
                        org.telegram.messenger.h10.i(this.currentAccount).v(false);
                    }
                    if (org.telegram.messenger.h10.i(this.currentAccount).f22859y == null) {
                        i10 = 3;
                    }
                } else {
                    i10 = 2;
                }
                if (i10 != 2 && this.f44777y0 == null && this.f44778z0 == null && this.f44775x0 == null && !this.D0.additional_methods.isEmpty()) {
                    M0(new ek0(this, 0));
                    return;
                }
                dl0 dl0Var6 = new dl0(this.f44744c1, this.D0, this.O0, this.P0, i10, this.F0, this.H0, this.I0, this.f44775x0, this.f44777y0, this.J0, this.V0, this.K0, this.f44768s0, this.X0);
                dl0Var6.f44746d1 = this.f44746d1;
                dl0Var6.f44749e1 = this.f44749e1;
                presentFragment(dl0Var6, this.T0);
                return;
            }
            i10 = 4;
            if (i10 != 2) {
            }
            dl0 dl0Var62 = new dl0(this.f44744c1, this.D0, this.O0, this.P0, i10, this.F0, this.H0, this.I0, this.f44775x0, this.f44777y0, this.J0, this.V0, this.K0, this.f44768s0, this.X0);
            dl0Var62.f44746d1 = this.f44746d1;
            dl0Var62.f44749e1 = this.f44749e1;
            presentFragment(dl0Var62, this.T0);
            return;
        }
        bl0 bl0Var2 = this.U;
        if (bl0Var2 != null) {
            bl0Var2.d(this.J0);
            finishFragment();
            return;
        }
        if (this.D0.invoice.flexible) {
            i3 = 1;
        } else if (this.f44778z0 == null && this.f44775x0 == null) {
            i3 = 2;
        } else {
            if (org.telegram.messenger.h10.i(this.currentAccount).f22859y != null && org.telegram.messenger.h10.i(this.currentAccount).f22859y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                org.telegram.messenger.h10.i(this.currentAccount).f22859y = null;
                org.telegram.messenger.h10.i(this.currentAccount).v(false);
            }
            if (org.telegram.messenger.h10.i(this.currentAccount).f22859y != null) {
                i3 = 4;
            } else {
                i3 = 3;
            }
        }
        if (i3 == 2 && this.f44778z0 == null && this.f44775x0 == null && !this.D0.additional_methods.isEmpty()) {
            M0(new ek0(this, 0));
            return;
        }
        dl0 dl0Var7 = new dl0(this.f44744c1, this.D0, this.O0, this.P0, i3, this.F0, null, null, this.f44775x0, this.f44777y0, this.J0, this.V0, this.K0, this.f44768s0, this.X0);
        dl0Var7.f44746d1 = this.f44746d1;
        dl0Var7.f44749e1 = this.f44749e1;
        presentFragment(dl0Var7, this.T0);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.d2 d2Var, boolean z10) {
        E0(d2Var);
        return super.presentFragment(d2Var, z10);
    }

    public dl0(TLRPC.PaymentForm paymentForm, org.telegram.messenger.zi ziVar, String str, org.telegram.ui.ActionBar.d2 d2Var) {
        super(null);
        this.f44736a = new ArrayList();
        this.f44739b = new HashMap();
        this.f44742c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new org.telegram.ui.Cells.n4[3];
        this.K = new ArrayList();
        this.L = new org.telegram.ui.Cells.x6[3];
        this.N = new org.telegram.ui.Cells.y8[3];
        this.O = new org.telegram.ui.Cells.v9[2];
        this.Z = new org.telegram.ui.Cells.x8[7];
        this.f44737a0 = -4.5f;
        this.f44745d0 = 6;
        this.W0 = true;
        A0(null, paymentForm, ziVar, str, 4, null, null, null, null, null, null, false, null, d2Var, false);
    }

    public dl0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.f44736a = new ArrayList();
        this.f44739b = new HashMap();
        this.f44742c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new org.telegram.ui.Cells.n4[3];
        this.K = new ArrayList();
        this.L = new org.telegram.ui.Cells.x6[3];
        this.N = new org.telegram.ui.Cells.y8[3];
        this.O = new org.telegram.ui.Cells.v9[2];
        this.Z = new org.telegram.ui.Cells.x8[7];
        this.f44737a0 = -4.5f;
        this.f44745d0 = 6;
        this.f44771v0 = 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.D0 = paymentForm;
        this.E0 = paymentReceipt;
        paymentForm.bot_id = paymentReceipt.bot_id;
        paymentForm.invoice = paymentReceipt.invoice;
        paymentForm.provider_id = paymentReceipt.provider_id;
        paymentForm.users = paymentReceipt.users;
        this.H0 = paymentReceipt.shipping;
        long j10 = paymentReceipt.tip_amount;
        if (j10 != 0) {
            this.I0 = Long.valueOf(j10);
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(paymentReceipt.bot_id));
        this.m0 = a22;
        if (a22 != null) {
            this.f44764q0 = a22.first_name;
        } else {
            this.f44764q0 = "";
        }
        this.f44766r0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.J0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.O0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().j1(paymentReceipt.bot_id);
                this.J0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.P0;
                this.J0.invoice = tL_inputInvoiceSlug;
            }
            this.J0.info = paymentReceipt.info;
        }
        this.f44777y0 = paymentReceipt.credentials_title;
    }

    public dl0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.d2 d2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, d2Var, false);
        this.W0 = true;
    }
}
