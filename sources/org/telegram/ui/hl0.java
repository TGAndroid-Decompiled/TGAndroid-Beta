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
public final class hl0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public static final List f46385g1 = Arrays.asList("http", "https");
    public static final List f46386h1 = Collections.singletonList("tg");
    public ms A0;
    public String B0;
    public TLRPC.PaymentForm C0;
    public boolean D;
    public final TLRPC.PaymentReceipt D0;
    public ScrollView E;
    public TLRPC.TL_payments_validatedRequestedInfo E0;
    public boolean F;
    public TLRPC.TL_paymentFormMethod F0;
    public boolean G;
    public TLRPC.TL_shippingOption G0;
    public TextView H;
    public Long H0;
    public final org.telegram.ui.Cells.n4[] I;
    public TLRPC.TL_payments_validateRequestedInfo I0;
    public final ArrayList J;
    public TLRPC.TL_inputPaymentCredentialsGooglePay J0;
    public final org.telegram.ui.Cells.y6[] K;
    public String K0;
    public org.telegram.ui.Cells.r8 L;
    public String L0;
    public final org.telegram.ui.Cells.z8[] M;
    public JSONObject M0;
    public final org.telegram.ui.Cells.w9[] N;
    public org.telegram.messenger.ij N0;
    public FrameLayout O;
    public String O0;
    public FrameLayout P;
    public boolean P0;
    public LinearLayout Q;
    public boolean Q0;
    public org.telegram.ui.Cells.a9 R;
    public String[] R0;
    public org.telegram.ui.Cells.l3 S;
    public boolean S0;
    public fl0 T;
    public boolean T0;
    public TextView U;
    public boolean U0;
    public org.telegram.ui.Cells.n6 V;
    public boolean V0;
    public dl0 W;
    public boolean W0;
    public org.telegram.ui.Cells.j5 X;
    public boolean X0;
    public final org.telegram.ui.Cells.y8[] Y;
    public org.telegram.ui.ActionBar.f6 Y0;
    public float Z;
    public gl0 Z0;
    public final ArrayList f46387a;
    public TL_account.Password f46388a0;
    public boolean f46389a1;
    public final HashMap f46390b;
    public boolean f46391b0;
    public TLRPC.InputInvoice f46392b1;
    public final HashMap f46393c;
    public int f46394c0;
    public org.telegram.messenger.c20 f46395c1;
    public final HashMap d;
    public ik0 f46396d0;
    public org.telegram.messenger.c20 f46397d1;
    public b9.j0 f46398e;
    public boolean f46399e0;
    public j00 f46400e1;
    public EditTextBoldCursor[] f46401f;
    public hl0 f46402f0;
    public int f46403f1;
    public boolean f46404g0;
    public org.telegram.ui.Cells.i6[] h;
    public boolean f46405h0;
    public boolean f46406i0;
    public String f46407j0;
    public boolean f46408k0;
    public TLRPC.User f46409l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.r0 f46410n;
    public boolean f46411n0;
    public boolean f46412o0;
    public String f46413p0;
    public String f46414q0;
    public org.telegram.ui.Components.zp f46415r;
    public org.telegram.ui.ActionBar.f2 f46416r0;
    public org.telegram.ui.Components.zp f46417s;
    public nk0 f46418s0;
    public ArrayList f46419t0;
    public int f46420u0;
    public boolean f46421v0;
    public AnimatorSet f46422w;
    public String f46423w0;
    public WebView f46424x;
    public String f46425x0;
    public String f46426y;
    public TLRPC.TL_paymentSavedCredentialsCard f46427y0;
    public boolean f46428z0;

    public hl0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, org.telegram.messenger.ij ijVar, String str, int i7, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z9, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.f2 f2Var, boolean z10) {
        super(null);
        this.f46387a = new ArrayList();
        this.f46390b = new HashMap();
        this.f46393c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.n4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.y6[3];
        this.M = new org.telegram.ui.Cells.z8[3];
        this.N = new org.telegram.ui.Cells.w9[2];
        this.Y = new org.telegram.ui.Cells.y8[7];
        this.Z = -4.5f;
        this.f46394c0 = 6;
        A0(inputInvoice, paymentForm, ijVar, str, i7, tL_payments_validatedRequestedInfo, tL_shippingOption, l10, str2, str3, tL_payments_validateRequestedInfo, z9, tL_inputPaymentCredentialsGooglePay, f2Var, z10);
    }

    public static void Z(hl0 hl0Var, TL_account.Password password, byte[] bArr) {
        byte[] bArr2;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = org.telegram.messenger.pv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        h50 h50Var = new h50(17, hl0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.pv.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            gettmppassword.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                h50Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(hl0Var.currentAccount).sendRequest(gettmppassword, h50Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        h50Var.run(null, tL_error2);
    }

    public static void a0(hl0 hl0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        hl0Var.J0(false);
        hl0Var.N0(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -2092780146:
                    if (str.equals("ADDRESS_CITY_INVALID")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1623547228:
                    if (str.equals("ADDRESS_STREET_LINE1_INVALID")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1224177757:
                    if (str.equals("ADDRESS_COUNTRY_INVALID")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1031752045:
                    if (str.equals("REQ_INFO_NAME_INVALID")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -274035920:
                    if (str.equals("ADDRESS_POSTCODE_INVALID")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 417441502:
                    if (str.equals("ADDRESS_STATE_INVALID")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 708423542:
                    if (str.equals("REQ_INFO_PHONE_INVALID")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 863965605:
                    if (str.equals("ADDRESS_STREET_LINE2_INVALID")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 889106340:
                    if (str.equals("REQ_INFO_EMAIL_INVALID")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    hl0Var.K0(2);
                    return;
                case 1:
                    hl0Var.K0(0);
                    return;
                case 2:
                    hl0Var.K0(4);
                    return;
                case 3:
                    hl0Var.K0(6);
                    return;
                case 4:
                    hl0Var.K0(5);
                    return;
                case 5:
                    hl0Var.K0(3);
                    return;
                case 6:
                    hl0Var.K0(9);
                    return;
                case 7:
                    hl0Var.K0(1);
                    return;
                case '\b':
                    hl0Var.K0(7);
                    return;
                default:
                    org.telegram.ui.Components.v4.c0(hl0Var.currentAccount, tL_error, hl0Var, tLObject, new Object[0]);
                    return;
            }
        }
    }

    public static void b0(hl0 hl0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        int i7;
        hl0Var.E0 = tL_payments_validatedRequestedInfo;
        if (hl0Var.C0.saved_info != null && !hl0Var.T0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(hl0Var.currentAccount);
            di.u5 u5Var = new di.u5(26);
            if (hl0Var.W0) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            connectionsManager.sendRequest(tL_payments_clearSavedInfo, u5Var, i7);
        }
        hl0Var.z0();
        hl0Var.J0(false);
        hl0Var.N0(true, false);
    }

    public static void c0(hl0 hl0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        hl0Var.J0(false);
        hl0Var.N0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.v4.c0(hl0Var.currentAccount, tL_error, hl0Var, tLObject, new Object[0]);
        }
    }

    public static void d0(hl0 hl0Var, org.telegram.ui.Components.cc ccVar, boolean z9, TLRPC.Message message) {
        ccVar.b();
        if (z9) {
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(an.qa(message.f26973id, org.telegram.messenger.ij.B0(message)));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = message.f26973id;
        tL_payments_getPaymentReceipt.peer = org.telegram.messenger.qp.s1(hl0Var.currentAccount).m1(message.peer_id);
        ConnectionsManager.getInstance(hl0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new ck0(hl0Var, 0), 2);
    }

    public static void e0(hl0 hl0Var) {
        int i7;
        TL_account.resendPasswordEmail resendpasswordemail = new TL_account.resendPasswordEmail();
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(hl0Var.currentAccount);
        di.u5 u5Var = new di.u5(26);
        if (hl0Var.W0) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        connectionsManager.sendRequest(resendpasswordemail, u5Var, i7);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hl0Var.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131746121, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.T = M0;
        u1Var.R = org.telegram.messenger.hd.M0(2131689472, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
        hl0Var.showDialog(u1Var);
    }

    public static void f0(hl0 hl0Var, boolean z9, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        bi.u9 u9Var = new bi.u9(hl0Var, z9, str, 8);
        if (!z9) {
            byte[] h12 = org.telegram.messenger.g0.h1(str2);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = hl0Var.f46388a0.new_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                updatepasswordsettings.new_settings.new_password_hash = org.telegram.messenger.pv.b(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                if (updatepasswordsettings.new_settings.new_password_hash == null) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "ALGO_INVALID";
                    u9Var.run(null, tL_error);
                }
                ConnectionsManager.getInstance(hl0Var.currentAccount).sendRequest(updatepasswordsettings, u9Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            u9Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(hl0Var.currentAccount).sendRequest(updatepasswordsettings, u9Var, 10);
    }

    public static void g0(hl0 hl0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.v4.c0(hl0Var.currentAccount, tL_error, hl0Var, tL_payments_sendPaymentForm, new Object[0]);
        hl0Var.J0(false);
        hl0Var.N0(false, false);
        hl0Var.f46389a1 = true;
        hl0Var.f46403f1 = 4;
        gl0 gl0Var = hl0Var.Z0;
        if (gl0Var != null) {
            gl0Var.b(4);
        }
    }

    public static void h0(hl0 hl0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.f2 Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            bi.dd.m1(hl0Var.getParentActivity(), hl0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, hl0Var.Y0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (Q = LaunchActivity.Q()) != 0) {
            ?? obj = new Object();
            obj.f27420a = true;
            hl0 hl0Var2 = new hl0((TLRPC.PaymentReceipt) tLObject);
            hl0Var2.f46395c1 = hl0Var.f46395c1;
            hl0Var2.f46397d1 = hl0Var.f46397d1;
            Q.showAsSheet(hl0Var2, obj);
        }
    }

    public static void i0(hl0 hl0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        hl0Var.N0(true, false);
        hl0Var.J0(false);
        if (tLObject != null) {
            hl0Var.f46421v0 = true;
            org.telegram.messenger.p10.i(hl0Var.currentAccount).f24488y = (TL_account.tmpPassword) tLObject;
            org.telegram.messenger.p10.i(hl0Var.currentAccount).v(false);
            hl0Var.z0();
        } else if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            try {
                hl0Var.f46401f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.g0.G3(3.25f, hl0Var.f46401f[1], null);
            hl0Var.f46401f[1].setText("");
        } else {
            org.telegram.ui.Components.v4.c0(hl0Var.currentAccount, tL_error, hl0Var, gettmppassword, new Object[0]);
        }
    }

    public static void j0(hl0 hl0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.f2 Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            bi.dd.m1(hl0Var.getParentActivity(), hl0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, hl0Var.Y0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (Q = LaunchActivity.Q()) != 0) {
            ?? obj = new Object();
            obj.f27420a = true;
            hl0 hl0Var2 = new hl0((TLRPC.PaymentReceipt) tLObject);
            hl0Var2.f46395c1 = hl0Var.f46395c1;
            hl0Var2.f46397d1 = hl0Var.f46397d1;
            Q.showAsSheet(hl0Var2, obj);
        }
    }

    public static void k0(hl0 hl0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.n0(password, false)) {
                org.telegram.ui.Components.v4.u0(hl0Var.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, null), true);
                return;
            } else if (!password.has_password) {
                hl0Var.f46421v0 = false;
                hl0Var.z0();
                return;
            } else {
                Utilities.f21333e.c(new mc0(hl0Var, password, org.telegram.messenger.g0.h1(str), 16));
                return;
            }
        }
        org.telegram.ui.Components.v4.c0(hl0Var.currentAccount, tL_error, hl0Var, getpassword, new Object[0]);
        hl0Var.N0(true, false);
        hl0Var.J0(false);
    }

    public static void l0(hl0 hl0Var, org.telegram.ui.Components.cc ccVar, boolean z9, TLRPC.Message[] messageArr) {
        ccVar.b();
        if (z9) {
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(an.qa(messageArr[0].f26973id, org.telegram.messenger.ij.B0(messageArr[0])));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = messageArr[0].f26973id;
        tL_payments_getPaymentReceipt.peer = org.telegram.messenger.qp.s1(hl0Var.currentAccount).m1(messageArr[0].peer_id);
        ConnectionsManager.getInstance(hl0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new ck0(hl0Var, 2), 2);
    }

    public static void m0(org.telegram.ui.hl0 r23, java.lang.String r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hl0.m0(org.telegram.ui.hl0, java.lang.String, android.view.View):void");
    }

    public static void n0(hl0 hl0Var, TLRPC.TL_error tL_error, boolean z9, TLObject tLObject, String str) {
        String G;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(hl0Var.currentAccount).sendRequest(new TL_account.getPassword(), new fi.d3(9, hl0Var, z9), 8);
            return;
        }
        hl0Var.N0(true, false);
        if (z9) {
            TL_account.Password password = hl0Var.f46388a0;
            password.has_password = false;
            password.current_algo = null;
            hl0Var.T.a(password);
            hl0Var.finishFragment();
        } else if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (hl0Var.getParentActivity() != null) {
                hl0Var.z0();
            }
        } else if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    hl0Var.L0(org.telegram.messenger.hd.M0(2131689472, null), org.telegram.messenger.hd.M0(2131747444, null));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    hl0Var.L0(org.telegram.messenger.hd.M0(2131689472, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, G));
                    return;
                } else {
                    hl0Var.L0(org.telegram.messenger.hd.M0(2131689472, null), tL_error.text);
                    return;
                }
            }
            hl0Var.f46394c0 = Utilities.z(tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hl0Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), new lk0(0, hl0Var, str));
            String M0 = org.telegram.messenger.hd.M0(2131742822, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
            u1Var.T = M0;
            u1Var.R = org.telegram.messenger.hd.M0(2131742823, null);
            Dialog showDialog = hl0Var.showDialog(u1Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        }
    }

    public static void o0(org.telegram.ui.hl0 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hl0.o0(org.telegram.ui.hl0):void");
    }

    public static void p0(hl0 hl0Var) {
        int i7 = 0;
        if (org.telegram.messenger.p10.i(hl0Var.currentAccount).f24488y != null && org.telegram.messenger.p10.i(hl0Var.currentAccount).f24488y.valid_until < ConnectionsManager.getInstance(hl0Var.currentAccount).getCurrentTime() + 60) {
            org.telegram.messenger.p10.i(hl0Var.currentAccount).f24488y = null;
            org.telegram.messenger.p10.i(hl0Var.currentAccount).v(false);
        }
        if (org.telegram.messenger.p10.i(hl0Var.currentAccount).f24488y != null) {
            hl0Var.F0();
        } else if (hl0Var.f46401f[1].length() == 0) {
            try {
                hl0Var.f46401f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.g0.G3(2.5f, hl0Var.f46401f[1], null);
        } else {
            String obj = hl0Var.f46401f[1].getText().toString();
            hl0Var.N0(true, true);
            hl0Var.J0(true);
            TL_account.getPassword getpassword = new TL_account.getPassword();
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(hl0Var.currentAccount);
            z9 z9Var = new z9(hl0Var, obj, getpassword, 28);
            if (hl0Var.W0) {
                i7 = 8;
            }
            connectionsManager.sendRequest(getpassword, z9Var, i7 | 2);
        }
    }

    public static void r0(hl0 hl0Var) {
        if (hl0Var.Q0) {
            return;
        }
        hl0Var.N0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        hl0Var.I0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = hl0Var.f46392b1;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (hl0Var.N0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = hl0Var.getMessagesController().m1(hl0Var.N0.f23237k.peer_id);
            tL_inputInvoiceMessage.msg_id = hl0Var.N0.f1();
            hl0Var.I0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = hl0Var.O0;
            hl0Var.I0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = hl0Var.I0;
        tL_payments_validateRequestedInfo2.save = hl0Var.T0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (hl0Var.C0.invoice.name_requested) {
            hl0Var.I0.info.name = hl0Var.f46401f[6].getText().toString();
            hl0Var.I0.info.flags |= 1;
        }
        int i7 = 8;
        if (hl0Var.C0.invoice.phone_requested) {
            hl0Var.I0.info.phone = "+" + hl0Var.f46401f[8].getText().toString() + hl0Var.f46401f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = hl0Var.I0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (hl0Var.C0.invoice.email_requested) {
            hl0Var.I0.info.email = hl0Var.f46401f[7].getText().toString().trim();
            hl0Var.I0.info.flags |= 4;
        }
        if (hl0Var.C0.invoice.shipping_address_requested) {
            hl0Var.I0.info.shipping_address = new TLRPC.TL_postAddress();
            hl0Var.I0.info.shipping_address.street_line1 = hl0Var.f46401f[0].getText().toString();
            hl0Var.I0.info.shipping_address.street_line2 = hl0Var.f46401f[1].getText().toString();
            hl0Var.I0.info.shipping_address.city = hl0Var.f46401f[2].getText().toString();
            hl0Var.I0.info.shipping_address.state = hl0Var.f46401f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = hl0Var.I0.info.shipping_address;
            String str = hl0Var.B0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = hl0Var.f46401f[5].getText().toString();
            hl0Var.I0.info.flags |= 8;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo3 = hl0Var.I0;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(hl0Var.currentAccount);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo4 = hl0Var.I0;
        h50 h50Var = new h50(15, hl0Var, tL_payments_validateRequestedInfo3);
        if (!hl0Var.W0) {
            i7 = 0;
        }
        connectionsManager.sendRequest(tL_payments_validateRequestedInfo4, h50Var, i7 | 2);
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

    public final void A0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, org.telegram.messenger.ij ijVar, String str, int i7, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z9, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.f2 f2Var, boolean z10) {
        if (f2Var != null) {
            this.currentAccount = f2Var.getCurrentAccount();
        }
        this.f46420u0 = i7;
        this.f46416r0 = f2Var;
        this.f46423w0 = str2;
        this.J0 = tL_inputPaymentCredentialsGooglePay;
        this.E0 = tL_payments_validatedRequestedInfo;
        this.C0 = paymentForm;
        this.G0 = tL_shippingOption;
        this.H0 = l10;
        this.N0 = ijVar;
        this.O0 = str;
        this.f46392b1 = inputInvoice;
        this.U0 = z9;
        this.W0 = z10;
        this.S0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.C0.native_provider)) ? false : true;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(paymentForm.bot_id));
        this.f46409l0 = a22;
        if (a22 != null) {
            this.f46413p0 = a22.first_name;
        } else {
            this.f46413p0 = "";
        }
        this.f46414q0 = paymentForm.title;
        this.I0 = tL_payments_validateRequestedInfo;
        this.T0 = true;
        if (!z9 && this.f46420u0 != 4) {
            this.U0 = !this.C0.saved_credentials.isEmpty();
        } else {
            this.U0 = z9;
        }
        if (str3 == null) {
            if (this.C0.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.C0.saved_credentials.get(0);
            this.f46427y0 = tL_paymentSavedCredentialsCard;
            this.f46425x0 = tL_paymentSavedCredentialsCard.title;
            return;
        }
        this.f46425x0 = str3;
    }

    public final void B0(Context context) {
        int i7;
        Optional empty;
        if (getParentActivity() != null) {
            b7.l lVar = new b7.l();
            if (this.C0.invoice.test) {
                i7 = 3;
            } else {
                i7 = 1;
            }
            if (i7 != 2 && i7 != 1 && i7 != 3) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(jg.g.j(i7, "Invalid environment value "));
            }
            lVar.f3009a = i7;
            this.f46398e = new com.google.android.gms.common.api.j(context, y8.p.f59192a, new y8.o(lVar), com.google.android.gms.common.api.i.f6542c);
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
            q6.m.h(jSONObject, "isReadyToPayRequestJson cannot be null!");
            obj.f59152f = jSONObject;
            b9.j0 j0Var = this.f46398e;
            j0Var.getClass();
            com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
            b10.f6680a = 23705;
            b10.f6682c = new y7.i6(obj, 1);
            j0Var.e(0, b10.a()).addOnCompleteListener(getParentActivity(), new jk0(this, 0));
        }
    }

    public final void C0() {
        if (this.f46399e0) {
            return;
        }
        this.f46399e0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ck0(this, 3), 10);
    }

    public final boolean D0(org.telegram.ui.ActionBar.q4 q4Var, Activity activity) {
        int i7 = 0;
        if (this.f46392b1 != null) {
            if (q4Var != null) {
                ArrayList arrayList = new ArrayList(q4Var.getFragmentStack());
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                    if (f2Var instanceof hl0) {
                        f2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.f46409l0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().f24880s6) && this.O0 == null) || (this.O0 != null && getMessagesController().t6 != null && Objects.equals(this.O0, getMessagesController().t6))) && q4Var != null) {
            ArrayList arrayList2 = new ArrayList(q4Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj2;
                if ((f2Var2 instanceof an) || (f2Var2 instanceof PremiumPreviewFragment)) {
                    f2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.f41597p0 = true;
            ((ActionBarLayout) q4Var).T(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).f41265v0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void E0(org.telegram.ui.ActionBar.f2 f2Var) {
        org.telegram.messenger.g0.v1(this.fragmentView);
        if (f2Var instanceof hl0) {
            hl0 hl0Var = (hl0) f2Var;
            hl0Var.Z0 = this.Z0;
            hl0Var.Y0 = this.Y0;
            hl0Var.X0 = this.X0;
            hl0Var.f46427y0 = this.f46427y0;
        }
    }

    public final void F0() {
        long j3;
        String str;
        if (this.Q0) {
            return;
        }
        int i7 = 0;
        N0(false, true);
        TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.f46392b1;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.N0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().m1(this.N0.f23237k.peer_id);
            tL_inputInvoiceMessage.msg_id = this.N0.f1();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.O0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.C0.form_id;
        if (org.telegram.messenger.p10.i(this.currentAccount).f24488y != null && this.f46427y0 != null) {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.f26970id = this.f46427y0.f27083id;
            tL_inputPaymentCredentialsSaved.tmp_password = org.telegram.messenger.p10.i(this.currentAccount).f24488y.tmp_password;
        } else {
            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = this.J0;
            if (tL_inputPaymentCredentialsGooglePay != null) {
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsGooglePay;
            } else {
                TLRPC.TL_inputPaymentCredentials tL_inputPaymentCredentials = new TLRPC.TL_inputPaymentCredentials();
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentials;
                tL_inputPaymentCredentials.save = this.U0;
                tL_inputPaymentCredentials.data = new TLRPC.TL_dataJSON();
                tL_payments_sendPaymentForm.credentials.data.data = this.f46423w0;
            }
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.E0;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.f27084id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags = 1 | tL_payments_sendPaymentForm.flags;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.G0;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.f27090id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        if ((this.C0.invoice.flags & 256) != 0) {
            Long l10 = this.H0;
            if (l10 != null) {
                j3 = l10.longValue();
            } else {
                j3 = 0;
            }
            tL_payments_sendPaymentForm.tip_amount = j3;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        h50 h50Var = new h50(16, this, tL_payments_sendPaymentForm);
        if (this.W0) {
            i7 = 8;
        }
        connectionsManager.sendRequest(tL_payments_sendPaymentForm, h50Var, i7 | 2);
    }

    public final void G0(boolean z9) {
        String str;
        String str2;
        if (!z9 && this.S.getVisibility() == 0) {
            String text = this.S.getText();
            if (text.length() == 0) {
                org.telegram.ui.Cells.l3 l3Var = this.S;
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new ck0(this, 1), 10);
            return;
        }
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z9) {
            this.f46410n.setVisibility(0);
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.flags = 2;
            passwordinputsettings.email = "";
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            str2 = null;
            str = null;
        } else {
            String obj = this.f46401f[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                K0(0);
                return;
            } else if (!obj.equals(this.f46401f[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), org.telegram.messenger.hd.M0(2131747445, null), 0).show();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                K0(1);
                return;
            } else {
                String obj2 = this.f46401f[2].getText().toString();
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
                    int i7 = passwordinputsettings2.flags;
                    passwordinputsettings2.flags = i7 | 1;
                    passwordinputsettings2.hint = "";
                    passwordinputsettings2.new_algo = this.f46388a0.new_algo;
                    passwordinputsettings2.flags = 3 | i7;
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
        Utilities.f21333e.c(new fi.q1(this, z9, str2, str, updatepasswordsettings));
    }

    public final void H0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        int i7;
        int i10;
        int i11;
        boolean z9;
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        boolean z10 = true;
        org.telegram.ui.Cells.y8[] y8VarArr = this.Y;
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
            y8VarArr[2].b(2131232272, a8.p0.s(sb2, ", ", str6), org.telegram.messenger.hd.M0(2131747380, null), true);
        }
        org.telegram.ui.Cells.y8 y8Var = y8VarArr[2];
        int i12 = 8;
        if (tL_paymentRequestedInfo.shipping_address != null) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        y8Var.setVisibility(i7);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            y8VarArr[3].b(2131232100, str7, org.telegram.messenger.hd.M0(2131747411, null), true);
        }
        org.telegram.ui.Cells.y8 y8Var2 = y8VarArr[3];
        if (tL_paymentRequestedInfo.name != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        y8Var2.setVisibility(i10);
        if (tL_paymentRequestedInfo.phone != null) {
            org.telegram.ui.Cells.y8 y8Var3 = y8VarArr[4];
            String b10 = pf.b.c().b(tL_paymentRequestedInfo.phone);
            String M0 = org.telegram.messenger.hd.M0(2131747409, null);
            if (tL_paymentRequestedInfo.email == null && this.G0 == null) {
                z9 = false;
            } else {
                z9 = true;
            }
            y8Var3.b(2131232083, b10, M0, z9);
        }
        org.telegram.ui.Cells.y8 y8Var4 = y8VarArr[4];
        if (tL_paymentRequestedInfo.phone != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        y8Var4.setVisibility(i11);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            org.telegram.ui.Cells.y8 y8Var5 = y8VarArr[5];
            String M02 = org.telegram.messenger.hd.M0(2131747414, null);
            if (this.G0 == null) {
                z10 = false;
            }
            y8Var5.b(2131232222, str8, M02, z10);
        }
        org.telegram.ui.Cells.y8 y8Var6 = y8VarArr[5];
        if (tL_paymentRequestedInfo.email != null) {
            i12 = 0;
        }
        y8Var6.setVisibility(i12);
    }

    public final void I0(TL_account.Password password) {
        boolean z9;
        if (password != null && password.has_password) {
            if (getParentActivity() == null) {
                return;
            }
            z0();
            return;
        }
        this.f46388a0 = password;
        if (password != null && !TextUtils.isEmpty(password.email_unconfirmed_pattern)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f46391b0 = z9;
        P0();
    }

    public final void J0(boolean z9) {
        this.P0 = z9;
        this.G = !z9;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.P0);
        }
        org.telegram.ui.Cells.y8 y8Var = this.Y[0];
        if (y8Var != null) {
            y8Var.setEnabled(!this.P0);
        }
    }

    public final void K0(int i7) {
        EditTextBoldCursor editTextBoldCursor = this.f46401f[i7];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.g0.G3(2.5f, editTextBoldCursor, null);
    }

    public final void L0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = str;
        u1Var.T = str2;
        showDialog(u1Var);
    }

    public final void M0(Runnable runnable) {
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(getParentActivity(), false, 1, null);
        h.O = org.telegram.messenger.hd.M0(2131747413, null);
        h.P = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.f46427y0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(2131232273);
        } else {
            String str = this.f46425x0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(2131232273);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_paymentSavedCredentialsCard> arrayList4 = this.C0.saved_credentials;
        int size = arrayList4.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i7);
            i7++;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard3 = tL_paymentSavedCredentialsCard2;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.f46427y0;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.f27083id, tL_paymentSavedCredentialsCard4.f27083id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(2131232273);
                arrayList3.add(tL_paymentSavedCredentialsCard3);
            }
        }
        ArrayList<TLRPC.TL_paymentFormMethod> arrayList5 = this.C0.additional_methods;
        int size2 = arrayList5.size();
        int i10 = 0;
        while (i10 < size2) {
            TLRPC.TL_paymentFormMethod tL_paymentFormMethod = arrayList5.get(i10);
            i10++;
            arrayList.add(tL_paymentFormMethod.title);
            arrayList2.add(2131232275);
        }
        arrayList.add(org.telegram.messenger.hd.M0(2131747412, null));
        arrayList2.add(2131232044);
        int[] iArr = new int[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            iArr[i11] = ((Integer) arrayList2.get(i11)).intValue();
        }
        org.telegram.ui.Components.t2 t2Var = new org.telegram.ui.Components.t2(this, runnable, arrayList3, arrayList, 1);
        h.L = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        h.M = iArr;
        h.K = t2Var;
        showDialog(h);
    }

    public final void N0(boolean z9, boolean z10) {
        AnimatorSet animatorSet = this.f46422w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z9 && this.f46410n != null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f46422w = animatorSet2;
            if (z10) {
                this.f46415r.setVisibility(0);
                this.f46410n.setEnabled(false);
                AnimatorSet animatorSet3 = this.f46422w;
                View contentView = this.f46410n.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, property, 0.1f);
                View contentView2 = this.f46410n.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, property2, 0.1f);
                View contentView3 = this.f46410n.getContentView();
                Property property3 = View.ALPHA;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, property3, 0.0f), ObjectAnimator.ofFloat(this.f46415r, property, 1.0f), ObjectAnimator.ofFloat(this.f46415r, property2, 1.0f), ObjectAnimator.ofFloat(this.f46415r, property3, 1.0f));
            } else if (this.f46424x != null) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f46415r, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.f46415r, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.f46415r, View.ALPHA, 0.0f));
            } else {
                this.f46410n.getContentView().setVisibility(0);
                this.f46410n.setEnabled(true);
                AnimatorSet animatorSet4 = this.f46422w;
                org.telegram.ui.Components.zp zpVar = this.f46415r;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(zpVar, property4, 0.1f);
                org.telegram.ui.Components.zp zpVar2 = this.f46415r;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(zpVar2, property5, 0.1f);
                org.telegram.ui.Components.zp zpVar3 = this.f46415r;
                Property property6 = View.ALPHA;
                animatorSet4.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(zpVar3, property6, 0.0f));
                if (!isFinishing()) {
                    this.f46422w.playTogether(ObjectAnimator.ofFloat(this.f46410n.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.f46410n.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.f46410n.getContentView(), property6, 1.0f));
                }
            }
            this.f46422w.addListener(new al0(this, z10, 0));
            this.f46422w.setDuration(150L);
            this.f46422w.start();
        } else if (this.U != null) {
            this.f46422w = new AnimatorSet();
            if (z10) {
                this.f46417s.setVisibility(0);
                this.W.setEnabled(false);
                AnimatorSet animatorSet5 = this.f46422w;
                TextView textView = this.U;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, property7, 0.1f);
                TextView textView2 = this.U;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, property8, 0.1f);
                TextView textView3 = this.U;
                Property property9 = View.ALPHA;
                animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, property9, 0.0f), ObjectAnimator.ofFloat(this.f46417s, property7, 1.0f), ObjectAnimator.ofFloat(this.f46417s, property8, 1.0f), ObjectAnimator.ofFloat(this.f46417s, property9, 1.0f));
            } else {
                this.U.setVisibility(0);
                this.W.setEnabled(true);
                AnimatorSet animatorSet6 = this.f46422w;
                org.telegram.ui.Components.zp zpVar4 = this.f46417s;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(zpVar4, property10, 0.1f);
                org.telegram.ui.Components.zp zpVar5 = this.f46417s;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(zpVar5, property11, 0.1f);
                org.telegram.ui.Components.zp zpVar6 = this.f46417s;
                Property property12 = View.ALPHA;
                animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(zpVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.U, property10, 1.0f), ObjectAnimator.ofFloat(this.U, property11, 1.0f), ObjectAnimator.ofFloat(this.U, property12, 1.0f));
            }
            this.f46422w.addListener(new al0(this, z10, 1));
            this.f46422w.setDuration(150L);
            this.f46422w.start();
        }
    }

    public final void O0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131747353, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("PaymentTransactionMessage2", null, 2131747354, str, this.f46413p0, this.f46414q0));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, null), new jk0(this, 5));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        showDialog(u1Var);
    }

    public final void P0() {
        if (this.f46420u0 == 6) {
            org.telegram.ui.Cells.z8[] z8VarArr = this.M;
            if (z8VarArr[2] != null) {
                int i7 = 0;
                this.f46410n.setVisibility(0);
                TL_account.Password password = this.f46388a0;
                ArrayList arrayList = this.J;
                org.telegram.ui.Cells.n4[] n4VarArr = this.I;
                org.telegram.ui.Cells.w9[] w9VarArr = this.N;
                if (password == null) {
                    N0(true, true);
                    z8VarArr[2].setVisibility(8);
                    w9VarArr[0].setVisibility(8);
                    w9VarArr[1].setVisibility(8);
                    this.S.setVisibility(8);
                    n4VarArr[0].setVisibility(8);
                    n4VarArr[1].setVisibility(8);
                    z8VarArr[0].setVisibility(8);
                    for (int i10 = 0; i10 < 3; i10++) {
                        ((View) this.f46401f[i10].getParent()).setVisibility(8);
                    }
                    while (i7 < arrayList.size()) {
                        ((View) arrayList.get(i7)).setVisibility(8);
                        i7++;
                    }
                    return;
                }
                N0(true, false);
                if (this.f46391b0) {
                    org.telegram.ui.Cells.z8 z8Var = z8VarArr[2];
                    String str = this.f46388a0.email_unconfirmed_pattern;
                    if (str == null) {
                        str = "";
                    }
                    z8Var.setText(org.telegram.messenger.hd.a0("EmailPasswordConfirmText2", null, 2131751200, str));
                    z8VarArr[2].setVisibility(0);
                    w9VarArr[0].setVisibility(0);
                    w9VarArr[1].setVisibility(0);
                    this.S.setVisibility(0);
                    z8VarArr[1].setText("");
                    n4VarArr[0].setVisibility(8);
                    n4VarArr[1].setVisibility(8);
                    z8VarArr[0].setVisibility(8);
                    for (int i11 = 0; i11 < 3; i11++) {
                        ((View) this.f46401f[i11].getParent()).setVisibility(8);
                    }
                    while (i7 < arrayList.size()) {
                        ((View) arrayList.get(i7)).setVisibility(8);
                        i7++;
                    }
                    return;
                }
                z8VarArr[2].setVisibility(8);
                w9VarArr[0].setVisibility(8);
                w9VarArr[1].setVisibility(8);
                z8VarArr[1].setText(org.telegram.messenger.hd.M0(2131747390, null));
                this.S.setVisibility(8);
                n4VarArr[0].setVisibility(0);
                n4VarArr[1].setVisibility(0);
                z8VarArr[0].setVisibility(0);
                for (int i12 = 0; i12 < 3; i12++) {
                    ((View) this.f46401f[i12].getParent()).setVisibility(0);
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((View) arrayList.get(i13)).setVisibility(0);
                }
            }
        }
    }

    public final void Q0() {
        org.telegram.ui.Cells.z8[] z8VarArr = this.M;
        if (z8VarArr[0] != null) {
            org.telegram.ui.Cells.y6[] y6VarArr = this.K;
            if (y6VarArr[2] != null) {
                TLRPC.PaymentForm paymentForm = this.C0;
                if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.f46424x != null && this.f46428z0)) {
                    this.L.setVisibility(8);
                    z8VarArr[0].setVisibility(8);
                    org.telegram.ui.Cells.y6 y6Var = y6VarArr[2];
                    org.telegram.ui.ActionBar.r6.a0(y6Var, y6Var.getContext(), 2131231230, org.telegram.ui.ActionBar.k6.f27812b7);
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131747420, null));
                if (this.C0.password_missing) {
                    C0();
                    spannableStringBuilder.append((CharSequence) "\n");
                    int length = spannableStringBuilder.length();
                    String M0 = org.telegram.messenger.hd.M0(2131747419, null);
                    int indexOf = M0.indexOf(42);
                    int lastIndexOf = M0.lastIndexOf(42);
                    spannableStringBuilder.append((CharSequence) M0);
                    if (indexOf != -1 && lastIndexOf != -1) {
                        int i7 = indexOf + length;
                        int i10 = lastIndexOf + length;
                        z8VarArr[0].getTextView().setMovementMethod(new org.telegram.messenger.c0(false));
                        spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                        spannableStringBuilder.replace(i7, i7 + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new el0(this), i7, i10 - 1, 33);
                    }
                }
                this.L.setEnabled(true);
                z8VarArr[0].setText(spannableStringBuilder);
                this.L.setVisibility(0);
                z8VarArr[0].setVisibility(0);
                org.telegram.ui.Cells.y6 y6Var2 = y6VarArr[2];
                org.telegram.ui.ActionBar.r6.a0(y6Var2, y6Var2.getContext(), 2131231229, org.telegram.ui.ActionBar.k6.f27812b7);
            }
        }
    }

    public final void R0() {
        this.R0[0] = y0(this.f46419t0);
        this.R.a(org.telegram.messenger.hd.M0(2131747352, null), this.R0[0], true);
        TextView textView = this.U;
        if (textView != null) {
            textView.setText(org.telegram.messenger.hd.a0("PaymentCheckoutPay", null, 2131747410, this.R0[0]));
        }
        if (this.f46418s0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Si);
            int childCount = this.f46418s0.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                TextView textView2 = (TextView) this.f46418s0.getChildAt(i7);
                if (textView2.getTag().equals(this.H0)) {
                    org.telegram.ui.ActionBar.k6.C1(themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Ti, this.Y0);
                } else {
                    org.telegram.ui.ActionBar.k6.C1(536870911 & themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Z8, this.Y0);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27904g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hl0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25034p0) {
            TLRPC.PaymentForm paymentForm = this.C0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            Q0();
        } else if (i7 == org.telegram.messenger.qs.f25047r0) {
            TLRPC.PaymentForm paymentForm2 = this.C0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            Q0();
        } else if (i7 == org.telegram.messenger.qs.f24951a1) {
            this.f46389a1 = true;
            removeSelfFromStack();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.Y0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.E, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28128s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        if (this.f46401f != null) {
            int i7 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f46401f;
                if (i7 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) editTextBoldCursorArr[i7].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27848d6));
                i7++;
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
            org.telegram.ui.Cells.n4[] n4VarArr = this.I;
            if (i11 >= n4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(n4VarArr[i11], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27848d6));
            i11++;
        }
        for (int i12 = 0; i12 < this.K.length; i12++) {
        }
        for (int i13 = 0; i13 < this.M.length; i13++) {
        }
        int i14 = 0;
        while (true) {
            ArrayList arrayList2 = this.J;
            if (i14 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) arrayList2.get(i14), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27848d6));
            i14++;
        }
        int i15 = 1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        for (int i16 = 0; i16 < this.N.length; i16++) {
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.U, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28126s6));
        while (true) {
            org.telegram.ui.Cells.y8[] y8VarArr = this.Y;
            if (i15 < y8VarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(y8VarArr[i15], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27848d6));
                i15++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.W, 268435456, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27848d6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.W, 268435456, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27940i6));
                return arrayList;
            }
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.G;
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        if (i7 == 991) {
            org.telegram.messenger.g0.h3(new d10(this, i10, intent, 4));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        WebView webView = this.f46424x;
        if (webView != null && this.D) {
            if (z9) {
                webView.loadUrl(this.f46426y);
                this.D = false;
            }
            return false;
        }
        return !this.P0;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.f46420u0 == 4 && this.X0) {
            this.X0 = false;
            this.W.callOnClick();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25034p0);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25047r0);
        if (this.f46420u0 != 4 || this.V0) {
            org.telegram.messenger.qs.f(this.currentAccount).b(this, org.telegram.messenger.qs.f24951a1);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hl0.onFragmentDestroy():void");
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        try {
            int i7 = this.f46420u0;
            if ((i7 == 2 || i7 == 6) && !this.C0.invoice.test) {
                getParentActivity().getWindow().setFlags(8192, 8192);
                org.telegram.messenger.g0.h2();
                return;
            }
            if (org.telegram.messenger.iz.f23406s.length() != 0 && !org.telegram.messenger.iz.A) {
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
            ScrollView scrollView = this.E;
            if (scrollView != null) {
                org.telegram.messenger.g0.z3(scrollView, getThemedColor(org.telegram.ui.ActionBar.k6.f28128s8));
            }
            if (this.f46401f != null) {
                getThemedColor(org.telegram.ui.ActionBar.k6.G6);
                int i7 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.f46401f;
                    if (i7 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i7];
                        if (editTextBoldCursor != null) {
                            org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, this.Y0);
                        }
                        i7++;
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
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9 && !z10) {
            WebView webView = this.f46424x;
            if (webView != null) {
                if (this.f46420u0 != 4) {
                    TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.F0;
                    if (tL_paymentFormMethod != null) {
                        String str = tL_paymentFormMethod.url;
                        this.f46426y = str;
                        webView.loadUrl(str);
                        return;
                    }
                    String str2 = this.C0.url;
                    this.f46426y = str2;
                    webView.loadUrl(str2);
                    return;
                }
                return;
            }
            int i7 = this.f46420u0;
            if (i7 == 2) {
                org.telegram.messenger.g0.i3(new ik0(this, 3), 100L);
            } else if (i7 == 3) {
                this.f46401f[1].requestFocus();
                org.telegram.messenger.g0.K3(this.f46401f[1]);
            } else if (i7 == 4) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f46401f;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                }
            } else if (i7 == 6 && !this.f46391b0) {
                this.f46401f[0].requestFocus();
                org.telegram.messenger.g0.K3(this.f46401f[0]);
            }
        }
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.f2 f2Var) {
        E0(f2Var);
        return super.presentFragment(f2Var);
    }

    public final void s0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27848d6);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27940i6);
        frameLayout.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(frameLayout, N0, N, N2, null);
        this.O.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        frameLayout2.setClickable(true);
        this.P.setFocusable(true);
        this.P.setBackgroundResource(2131231222);
        if (this.K0 == null) {
            this.P.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f));
        } else {
            this.P.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        }
        this.O.addView(this.P, c8.ha.c(48.0f, -1));
        this.P.setOnClickListener(new dk0(this, 13));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.P.addView(linearLayout, c8.ha.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(2131230909);
        linearLayout.addView(imageView, c8.ha.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(2131231224);
        this.P.addView(imageView2, c8.ha.c(-1.0f, -1));
    }

    public final void t0(String str) {
        boolean z9;
        boolean z10;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.f25555b.getSystemService("phone");
            if (str == null && (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0)) {
                return;
            }
            if (getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (str != null || z9) {
                if (str == null) {
                    str = pf.b.d(telephonyManager.getLine1Number(), false);
                }
                if (!TextUtils.isEmpty(str)) {
                    int i7 = 4;
                    String str2 = null;
                    if (str.length() > 4) {
                        while (true) {
                            if (i7 >= 1) {
                                String substring = str.substring(0, i7);
                                if (((String) this.f46393c.get(substring)) != null) {
                                    str2 = str.substring(i7);
                                    this.f46401f[8].setText(substring);
                                    z10 = true;
                                    break;
                                }
                                i7--;
                            } else {
                                z10 = false;
                                break;
                            }
                        }
                        if (!z10) {
                            str2 = str.substring(1);
                            this.f46401f[8].setText(str.substring(0, 1));
                        }
                    }
                    if (str2 != null) {
                        this.f46401f[9].setText(str2);
                        EditTextBoldCursor editTextBoldCursor = this.f46401f[9];
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final long v0() {
        TLRPC.InputInvoice inputInvoice = this.f46392b1;
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
        TLRPC.InputInvoice inputInvoice = this.f46392b1;
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
        long j3 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i7)).amount;
        }
        org.telegram.messenger.hd.E0();
        String upperCase = this.C0.invoice.currency.toUpperCase();
        long abs = Math.abs(j3);
        upperCase.getClass();
        char c10 = 65535;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    c10 = 1;
                    break;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    c10 = 2;
                    break;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    c10 = 3;
                    break;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    c10 = 4;
                    break;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    c10 = 5;
                    break;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    c10 = 6;
                    break;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    c10 = 7;
                    break;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    c10 = 11;
                    break;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    c10 = 14;
                    break;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    c10 = 15;
                    break;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    c10 = 16;
                    break;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    c10 = 17;
                    break;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    c10 = 18;
                    break;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    c10 = 19;
                    break;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    c10 = 20;
                    break;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    c10 = 21;
                    break;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    c10 = 22;
                    break;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    c10 = 23;
                    break;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    c10 = 24;
                    break;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    c10 = 25;
                    break;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    c10 = 26;
                    break;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    c10 = 27;
                    break;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    c10 = 28;
                    break;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    c10 = 29;
                    break;
                }
                break;
        }
        String str = " %.0f";
        switch (c10) {
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
                double d2 = ((float) abs) / 100.0f;
                if (abs % 100 != 0) {
                    str = " %.2f";
                }
                d = d2;
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
        long j3 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i7)).amount;
        }
        Long l10 = this.H0;
        if (l10 != null) {
            j3 += l10.longValue();
        }
        return org.telegram.messenger.hd.E0().p(j3, this.C0.invoice.currency);
    }

    public final void z0() {
        int i7;
        int i10;
        boolean z9;
        int i11;
        int i12 = this.f46420u0;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 6) {
                                if (!this.T.c(this.f46423w0, this.f46425x0, this.U0, this.J0, this.f46427y0)) {
                                    hl0 hl0Var = new hl0(this.f46392b1, this.C0, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.f46423w0, this.f46425x0, this.I0, this.U0, this.J0, this.f46416r0, false);
                                    hl0Var.f46395c1 = this.f46395c1;
                                    hl0Var.f46397d1 = this.f46397d1;
                                    presentFragment(hl0Var, true);
                                    return;
                                }
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        boolean z10 = this.V0;
                        int i13 = org.telegram.messenger.qs.f24951a1;
                        if (z10) {
                            org.telegram.messenger.qs.f(this.currentAccount).n(this, i13);
                        }
                        org.telegram.messenger.qs.f(this.currentAccount).k(i13, new Object[0]);
                        if (getMessagesController().f24819l7 == null) {
                            if (!D0(getParentLayout(), getParentActivity()) && !isFinishing()) {
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        org.telegram.messenger.g0.i3(new ik0(this, 1), 500L);
                        return;
                    }
                    if (this.f46421v0) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    hl0 hl0Var2 = new hl0(this.f46392b1, this.C0, this.N0, this.O0, i11, this.E0, this.G0, this.H0, this.f46423w0, this.f46425x0, this.I0, this.U0, this.J0, this.f46416r0, this.W0);
                    hl0Var2.f46395c1 = this.f46395c1;
                    hl0Var2.f46397d1 = this.f46397d1;
                    presentFragment(hl0Var2, true);
                    return;
                }
                TLRPC.PaymentForm paymentForm = this.C0;
                if (paymentForm.password_missing && (z9 = this.U0)) {
                    hl0 hl0Var3 = new hl0(this.f46392b1, paymentForm, this.N0, this.O0, 6, this.E0, this.G0, this.H0, this.f46423w0, this.f46425x0, this.I0, z9, this.J0, this.f46416r0, this.W0);
                    this.f46402f0 = hl0Var3;
                    hl0Var3.f46395c1 = this.f46395c1;
                    hl0Var3.f46397d1 = this.f46397d1;
                    hl0Var3.I0(this.f46388a0);
                    hl0 hl0Var4 = this.f46402f0;
                    hl0Var4.T = new yk0(this);
                    presentFragment(hl0Var4, this.S0);
                    return;
                }
                fl0 fl0Var = this.T;
                if (fl0Var != null) {
                    fl0Var.c(this.f46423w0, this.f46425x0, this.U0, this.J0, null);
                    finishFragment();
                    return;
                }
                hl0 hl0Var5 = new hl0(this.f46392b1, paymentForm, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.f46423w0, this.f46425x0, this.I0, this.U0, this.J0, this.f46416r0, this.W0);
                hl0Var5.f46395c1 = this.f46395c1;
                hl0Var5.f46397d1 = this.f46397d1;
                presentFragment(hl0Var5, this.S0);
                return;
            }
            if (this.f46423w0 == null && this.f46425x0 == null) {
                if (this.f46427y0 != null) {
                    if (org.telegram.messenger.p10.i(this.currentAccount).f24488y != null && org.telegram.messenger.p10.i(this.currentAccount).f24488y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        org.telegram.messenger.p10.i(this.currentAccount).f24488y = null;
                        org.telegram.messenger.p10.i(this.currentAccount).v(false);
                    }
                    if (org.telegram.messenger.p10.i(this.currentAccount).f24488y == null) {
                        i10 = 3;
                    }
                } else {
                    i10 = 2;
                }
                if (i10 != 2 && this.f46425x0 == null && this.f46427y0 == null && this.f46423w0 == null && !this.C0.additional_methods.isEmpty()) {
                    M0(new ik0(this, 0));
                    return;
                }
                hl0 hl0Var6 = new hl0(this.f46392b1, this.C0, this.N0, this.O0, i10, this.E0, this.G0, this.H0, this.f46423w0, this.f46425x0, this.I0, this.U0, this.J0, this.f46416r0, this.W0);
                hl0Var6.f46395c1 = this.f46395c1;
                hl0Var6.f46397d1 = this.f46397d1;
                presentFragment(hl0Var6, this.S0);
                return;
            }
            i10 = 4;
            if (i10 != 2) {
            }
            hl0 hl0Var62 = new hl0(this.f46392b1, this.C0, this.N0, this.O0, i10, this.E0, this.G0, this.H0, this.f46423w0, this.f46425x0, this.I0, this.U0, this.J0, this.f46416r0, this.W0);
            hl0Var62.f46395c1 = this.f46395c1;
            hl0Var62.f46397d1 = this.f46397d1;
            presentFragment(hl0Var62, this.S0);
            return;
        }
        fl0 fl0Var2 = this.T;
        if (fl0Var2 != null) {
            fl0Var2.d(this.I0);
            finishFragment();
            return;
        }
        if (this.C0.invoice.flexible) {
            i7 = 1;
        } else if (this.f46427y0 == null && this.f46423w0 == null) {
            i7 = 2;
        } else {
            if (org.telegram.messenger.p10.i(this.currentAccount).f24488y != null && org.telegram.messenger.p10.i(this.currentAccount).f24488y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                org.telegram.messenger.p10.i(this.currentAccount).f24488y = null;
                org.telegram.messenger.p10.i(this.currentAccount).v(false);
            }
            if (org.telegram.messenger.p10.i(this.currentAccount).f24488y != null) {
                i7 = 4;
            } else {
                i7 = 3;
            }
        }
        if (i7 == 2 && this.f46427y0 == null && this.f46423w0 == null && !this.C0.additional_methods.isEmpty()) {
            M0(new ik0(this, 0));
            return;
        }
        hl0 hl0Var7 = new hl0(this.f46392b1, this.C0, this.N0, this.O0, i7, this.E0, null, null, this.f46423w0, this.f46425x0, this.I0, this.U0, this.J0, this.f46416r0, this.W0);
        hl0Var7.f46395c1 = this.f46395c1;
        hl0Var7.f46397d1 = this.f46397d1;
        presentFragment(hl0Var7, this.S0);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        E0(f2Var);
        return super.presentFragment(f2Var, z9);
    }

    public hl0(TLRPC.PaymentForm paymentForm, org.telegram.messenger.ij ijVar, String str, org.telegram.ui.ActionBar.f2 f2Var) {
        super(null);
        this.f46387a = new ArrayList();
        this.f46390b = new HashMap();
        this.f46393c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.n4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.y6[3];
        this.M = new org.telegram.ui.Cells.z8[3];
        this.N = new org.telegram.ui.Cells.w9[2];
        this.Y = new org.telegram.ui.Cells.y8[7];
        this.Z = -4.5f;
        this.f46394c0 = 6;
        this.V0 = true;
        A0(null, paymentForm, ijVar, str, 4, null, null, null, null, null, null, false, null, f2Var, false);
    }

    public hl0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.f46387a = new ArrayList();
        this.f46390b = new HashMap();
        this.f46393c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.n4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.y6[3];
        this.M = new org.telegram.ui.Cells.z8[3];
        this.N = new org.telegram.ui.Cells.w9[2];
        this.Y = new org.telegram.ui.Cells.y8[7];
        this.Z = -4.5f;
        this.f46394c0 = 6;
        this.f46420u0 = 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.C0 = paymentForm;
        this.D0 = paymentReceipt;
        paymentForm.bot_id = paymentReceipt.bot_id;
        paymentForm.invoice = paymentReceipt.invoice;
        paymentForm.provider_id = paymentReceipt.provider_id;
        paymentForm.users = paymentReceipt.users;
        this.G0 = paymentReceipt.shipping;
        long j3 = paymentReceipt.tip_amount;
        if (j3 != 0) {
            this.H0 = Long.valueOf(j3);
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(paymentReceipt.bot_id));
        this.f46409l0 = a22;
        if (a22 != null) {
            this.f46413p0 = a22.first_name;
        } else {
            this.f46413p0 = "";
        }
        this.f46414q0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.I0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.N0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().j1(paymentReceipt.bot_id);
                this.I0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.O0;
                this.I0.invoice = tL_inputInvoiceSlug;
            }
            this.I0.info = paymentReceipt.info;
        }
        this.f46425x0 = paymentReceipt.credentials_title;
    }

    public hl0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.f2 f2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, f2Var, false);
        this.V0 = true;
    }
}
