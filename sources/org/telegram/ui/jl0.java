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
public final class jl0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public static final List f48380h1 = Arrays.asList("http", "https");
    public static final List f48381i1 = Collections.singletonList("tg");
    public boolean A0;
    public ps B0;
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
    public org.telegram.messenger.gj O0;
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
    public hl0 U;
    public boolean U0;
    public TextView V;
    public boolean V0;
    public org.telegram.ui.Cells.m6 W;
    public boolean W0;
    public fl0 X;
    public boolean X0;
    public org.telegram.ui.Cells.j5 Y;
    public boolean Y0;
    public final org.telegram.ui.Cells.x8[] Z;
    public org.telegram.ui.ActionBar.e6 Z0;
    public final ArrayList f48382a;
    public float f48383a0;
    public il0 f48384a1;
    public final HashMap f48385b;
    public TL_account.Password f48386b0;
    public boolean f48387b1;
    public final HashMap f48388c;
    public boolean f48389c0;
    public TLRPC.InputInvoice f48390c1;
    public final HashMap d;
    public int f48391d0;
    public org.telegram.messenger.z10 f48392d1;
    public b9.k0 f48393e;
    public kk0 f48394e0;
    public org.telegram.messenger.z10 f48395e1;
    public EditTextBoldCursor[] f48396f;
    public boolean f48397f0;
    public l00 f48398f1;
    public jl0 f48399g0;
    public int f48400g1;
    public org.telegram.ui.Cells.h6[] h;
    public boolean f48401h0;
    public boolean f48402i0;
    public boolean f48403j0;
    public String f48404k0;
    public boolean f48405l0;
    public TLRPC.User m0;
    public org.telegram.ui.ActionBar.q0 f48406n;
    public boolean f48407n0;
    public boolean f48408o0;
    public boolean f48409p0;
    public String f48410q0;
    public org.telegram.ui.Components.hq f48411r;
    public String f48412r0;
    public org.telegram.ui.Components.hq f48413s;
    public org.telegram.ui.ActionBar.e2 f48414s0;
    public pk0 f48415t0;
    public ArrayList f48416u0;
    public int f48417v0;
    public AnimatorSet f48418w;
    public boolean f48419w0;
    public WebView f48420x;
    public String f48421x0;
    public String f48422y;
    public String f48423y0;
    public TLRPC.TL_paymentSavedCredentialsCard f48424z0;

    public jl0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, org.telegram.messenger.gj gjVar, String str, int i7, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.e2 e2Var, boolean z11) {
        super(null);
        this.f48382a = new ArrayList();
        this.f48385b = new HashMap();
        this.f48388c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new org.telegram.ui.Cells.n4[3];
        this.K = new ArrayList();
        this.L = new org.telegram.ui.Cells.x6[3];
        this.N = new org.telegram.ui.Cells.y8[3];
        this.O = new org.telegram.ui.Cells.v9[2];
        this.Z = new org.telegram.ui.Cells.x8[7];
        this.f48383a0 = -4.5f;
        this.f48391d0 = 6;
        A0(inputInvoice, paymentForm, gjVar, str, i7, tL_payments_validatedRequestedInfo, tL_shippingOption, l10, str2, str3, tL_payments_validateRequestedInfo, z10, tL_inputPaymentCredentialsGooglePay, e2Var, z11);
    }

    public static void Z(jl0 jl0Var, TL_account.Password password, byte[] bArr) {
        byte[] bArr2;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = org.telegram.messenger.nv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        b00 b00Var = new b00(19, jl0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.nv.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            gettmppassword.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                b00Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(jl0Var.currentAccount).sendRequest(gettmppassword, b00Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        b00Var.run(null, tL_error2);
    }

    public static void a0(jl0 jl0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        jl0Var.J0(false);
        jl0Var.N0(true, false);
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
                    jl0Var.K0(2);
                    return;
                case 1:
                    jl0Var.K0(0);
                    return;
                case 2:
                    jl0Var.K0(4);
                    return;
                case 3:
                    jl0Var.K0(6);
                    return;
                case 4:
                    jl0Var.K0(5);
                    return;
                case 5:
                    jl0Var.K0(3);
                    return;
                case 6:
                    jl0Var.K0(9);
                    return;
                case 7:
                    jl0Var.K0(1);
                    return;
                case '\b':
                    jl0Var.K0(7);
                    return;
                default:
                    org.telegram.ui.Components.t4.c0(jl0Var.currentAccount, tL_error, jl0Var, tLObject, new Object[0]);
                    return;
            }
        }
    }

    public static void b0(jl0 jl0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        int i7;
        jl0Var.F0 = tL_payments_validatedRequestedInfo;
        if (jl0Var.D0.saved_info != null && !jl0Var.U0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(jl0Var.currentAccount);
            fi.m5 m5Var = new fi.m5(26);
            if (jl0Var.X0) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            connectionsManager.sendRequest(tL_payments_clearSavedInfo, m5Var, i7);
        }
        jl0Var.z0();
        jl0Var.J0(false);
        jl0Var.N0(true, false);
    }

    public static void c0(jl0 jl0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        jl0Var.J0(false);
        jl0Var.N0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.t4.c0(jl0Var.currentAccount, tL_error, jl0Var, tLObject, new Object[0]);
        }
    }

    public static void d0(jl0 jl0Var, org.telegram.ui.Components.xb xbVar, boolean z10, TLRPC.Message message) {
        xbVar.b();
        if (z10) {
            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(an.ta(message.f28072id, org.telegram.messenger.gj.B0(message)));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = message.f28072id;
        tL_payments_getPaymentReceipt.peer = org.telegram.messenger.np.s1(jl0Var.currentAccount).m1(message.peer_id);
        ConnectionsManager.getInstance(jl0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new fk0(jl0Var, 0), 2);
    }

    public static void e0(jl0 jl0Var) {
        int i7;
        TL_account.resendPasswordEmail resendpasswordemail = new TL_account.resendPasswordEmail();
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(jl0Var.currentAccount);
        fi.m5 m5Var = new fi.m5(26);
        if (jl0Var.X0) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        connectionsManager.sendRequest(resendpasswordemail, m5Var, i7);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jl0Var.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131746120, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.U = M0;
        t1Var.S = org.telegram.messenger.hd.M0(2131689472, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
        jl0Var.showDialog(t1Var);
    }

    public static void f0(jl0 jl0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        di.l8 l8Var = new di.l8(jl0Var, z10, str, 8);
        if (!z10) {
            byte[] h12 = org.telegram.messenger.g0.h1(str2);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = jl0Var.f48386b0.new_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                updatepasswordsettings.new_settings.new_password_hash = org.telegram.messenger.nv.b(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                if (updatepasswordsettings.new_settings.new_password_hash == null) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "ALGO_INVALID";
                    l8Var.run(null, tL_error);
                }
                ConnectionsManager.getInstance(jl0Var.currentAccount).sendRequest(updatepasswordsettings, l8Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            l8Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(jl0Var.currentAccount).sendRequest(updatepasswordsettings, l8Var, 10);
    }

    public static void g0(jl0 jl0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.t4.c0(jl0Var.currentAccount, tL_error, jl0Var, tL_payments_sendPaymentForm, new Object[0]);
        jl0Var.J0(false);
        jl0Var.N0(false, false);
        jl0Var.f48387b1 = true;
        jl0Var.f48400g1 = 4;
        il0 il0Var = jl0Var.f48384a1;
        if (il0Var != null) {
            il0Var.e(4);
        }
    }

    public static void h0(jl0 jl0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.e2 Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            di.mb.m1(jl0Var.getParentActivity(), jl0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, jl0Var.Z0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (Q = LaunchActivity.Q()) != 0) {
            ?? obj = new Object();
            obj.f28476a = true;
            jl0 jl0Var2 = new jl0((TLRPC.PaymentReceipt) tLObject);
            jl0Var2.f48392d1 = jl0Var.f48392d1;
            jl0Var2.f48395e1 = jl0Var.f48395e1;
            Q.showAsSheet(jl0Var2, obj);
        }
    }

    public static void i0(jl0 jl0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        jl0Var.N0(true, false);
        jl0Var.J0(false);
        if (tLObject != null) {
            jl0Var.f48419w0 = true;
            org.telegram.messenger.m10.i(jl0Var.currentAccount).f24964y = (TL_account.tmpPassword) tLObject;
            org.telegram.messenger.m10.i(jl0Var.currentAccount).v(false);
            jl0Var.z0();
        } else if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            try {
                jl0Var.f48396f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.g0.F3(3.25f, jl0Var.f48396f[1], null);
            jl0Var.f48396f[1].setText("");
        } else {
            org.telegram.ui.Components.t4.c0(jl0Var.currentAccount, tL_error, jl0Var, gettmppassword, new Object[0]);
        }
    }

    public static void j0(jl0 jl0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.e2 Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            di.mb.m1(jl0Var.getParentActivity(), jl0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, jl0Var.Z0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (Q = LaunchActivity.Q()) != 0) {
            ?? obj = new Object();
            obj.f28476a = true;
            jl0 jl0Var2 = new jl0((TLRPC.PaymentReceipt) tLObject);
            jl0Var2.f48392d1 = jl0Var.f48392d1;
            jl0Var2.f48395e1 = jl0Var.f48395e1;
            Q.showAsSheet(jl0Var2, obj);
        }
    }

    public static void k0(jl0 jl0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.n0(password, false)) {
                org.telegram.ui.Components.t4.u0(jl0Var.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, null), true);
                return;
            } else if (!password.has_password) {
                jl0Var.f48419w0 = false;
                jl0Var.z0();
                return;
            } else {
                Utilities.f22416e.c(new lc0(jl0Var, password, org.telegram.messenger.g0.h1(str), 16));
                return;
            }
        }
        org.telegram.ui.Components.t4.c0(jl0Var.currentAccount, tL_error, jl0Var, getpassword, new Object[0]);
        jl0Var.N0(true, false);
        jl0Var.J0(false);
    }

    public static void l0(jl0 jl0Var, org.telegram.ui.Components.xb xbVar, boolean z10, TLRPC.Message[] messageArr) {
        xbVar.b();
        if (z10) {
            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(an.ta(messageArr[0].f28072id, org.telegram.messenger.gj.B0(messageArr[0])));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = messageArr[0].f28072id;
        tL_payments_getPaymentReceipt.peer = org.telegram.messenger.np.s1(jl0Var.currentAccount).m1(messageArr[0].peer_id);
        ConnectionsManager.getInstance(jl0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new fk0(jl0Var, 2), 2);
    }

    public static void m0(org.telegram.ui.jl0 r23, java.lang.String r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl0.m0(org.telegram.ui.jl0, java.lang.String, android.view.View):void");
    }

    public static void n0(jl0 jl0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        String G;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(jl0Var.currentAccount).sendRequest(new TL_account.getPassword(), new hi.b3(9, jl0Var, z10), 8);
            return;
        }
        jl0Var.N0(true, false);
        if (z10) {
            TL_account.Password password = jl0Var.f48386b0;
            password.has_password = false;
            password.current_algo = null;
            jl0Var.U.a(password);
            jl0Var.finishFragment();
        } else if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (jl0Var.getParentActivity() != null) {
                jl0Var.z0();
            }
        } else if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    jl0Var.L0(org.telegram.messenger.hd.M0(2131689472, null), org.telegram.messenger.hd.M0(2131747445, null));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    jl0Var.L0(org.telegram.messenger.hd.M0(2131689472, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, G));
                    return;
                } else {
                    jl0Var.L0(org.telegram.messenger.hd.M0(2131689472, null), tL_error.text);
                    return;
                }
            }
            jl0Var.f48391d0 = Utilities.z(tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jl0Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), new xi0(4, jl0Var, str));
            String M0 = org.telegram.messenger.hd.M0(2131742821, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.U = M0;
            t1Var.S = org.telegram.messenger.hd.M0(2131742822, null);
            Dialog showDialog = jl0Var.showDialog(t1Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        }
    }

    public static void o0(org.telegram.ui.jl0 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl0.o0(org.telegram.ui.jl0):void");
    }

    public static void p0(jl0 jl0Var) {
        int i7 = 0;
        if (org.telegram.messenger.m10.i(jl0Var.currentAccount).f24964y != null && org.telegram.messenger.m10.i(jl0Var.currentAccount).f24964y.valid_until < ConnectionsManager.getInstance(jl0Var.currentAccount).getCurrentTime() + 60) {
            org.telegram.messenger.m10.i(jl0Var.currentAccount).f24964y = null;
            org.telegram.messenger.m10.i(jl0Var.currentAccount).v(false);
        }
        if (org.telegram.messenger.m10.i(jl0Var.currentAccount).f24964y != null) {
            jl0Var.F0();
        } else if (jl0Var.f48396f[1].length() == 0) {
            try {
                jl0Var.f48396f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.g0.F3(2.5f, jl0Var.f48396f[1], null);
        } else {
            String obj = jl0Var.f48396f[1].getText().toString();
            jl0Var.N0(true, true);
            jl0Var.J0(true);
            TL_account.getPassword getpassword = new TL_account.getPassword();
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(jl0Var.currentAccount);
            z9 z9Var = new z9(jl0Var, obj, getpassword, 28);
            if (jl0Var.X0) {
                i7 = 8;
            }
            connectionsManager.sendRequest(getpassword, z9Var, i7 | 2);
        }
    }

    public static void r0(jl0 jl0Var) {
        if (jl0Var.R0) {
            return;
        }
        jl0Var.N0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        jl0Var.J0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = jl0Var.f48390c1;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (jl0Var.O0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = jl0Var.getMessagesController().m1(jl0Var.O0.f23817k.peer_id);
            tL_inputInvoiceMessage.msg_id = jl0Var.O0.e1();
            jl0Var.J0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = jl0Var.P0;
            jl0Var.J0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = jl0Var.J0;
        tL_payments_validateRequestedInfo2.save = jl0Var.U0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (jl0Var.D0.invoice.name_requested) {
            jl0Var.J0.info.name = jl0Var.f48396f[6].getText().toString();
            jl0Var.J0.info.flags |= 1;
        }
        int i7 = 8;
        if (jl0Var.D0.invoice.phone_requested) {
            jl0Var.J0.info.phone = "+" + jl0Var.f48396f[8].getText().toString() + jl0Var.f48396f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = jl0Var.J0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (jl0Var.D0.invoice.email_requested) {
            jl0Var.J0.info.email = jl0Var.f48396f[7].getText().toString().trim();
            jl0Var.J0.info.flags |= 4;
        }
        if (jl0Var.D0.invoice.shipping_address_requested) {
            jl0Var.J0.info.shipping_address = new TLRPC.TL_postAddress();
            jl0Var.J0.info.shipping_address.street_line1 = jl0Var.f48396f[0].getText().toString();
            jl0Var.J0.info.shipping_address.street_line2 = jl0Var.f48396f[1].getText().toString();
            jl0Var.J0.info.shipping_address.city = jl0Var.f48396f[2].getText().toString();
            jl0Var.J0.info.shipping_address.state = jl0Var.f48396f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = jl0Var.J0.info.shipping_address;
            String str = jl0Var.C0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = jl0Var.f48396f[5].getText().toString();
            jl0Var.J0.info.flags |= 8;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo3 = jl0Var.J0;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(jl0Var.currentAccount);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo4 = jl0Var.J0;
        b00 b00Var = new b00(17, jl0Var, tL_payments_validateRequestedInfo3);
        if (!jl0Var.X0) {
            i7 = 0;
        }
        connectionsManager.sendRequest(tL_payments_validateRequestedInfo4, b00Var, i7 | 2);
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

    public final void A0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, org.telegram.messenger.gj gjVar, String str, int i7, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.e2 e2Var, boolean z11) {
        if (e2Var != null) {
            this.currentAccount = e2Var.getCurrentAccount();
        }
        this.f48417v0 = i7;
        this.f48414s0 = e2Var;
        this.f48421x0 = str2;
        this.K0 = tL_inputPaymentCredentialsGooglePay;
        this.F0 = tL_payments_validatedRequestedInfo;
        this.D0 = paymentForm;
        this.H0 = tL_shippingOption;
        this.I0 = l10;
        this.O0 = gjVar;
        this.P0 = str;
        this.f48390c1 = inputInvoice;
        this.V0 = z10;
        this.X0 = z11;
        this.T0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.D0.native_provider)) ? false : true;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(paymentForm.bot_id));
        this.m0 = a22;
        if (a22 != null) {
            this.f48410q0 = a22.first_name;
        } else {
            this.f48410q0 = "";
        }
        this.f48412r0 = paymentForm.title;
        this.J0 = tL_payments_validateRequestedInfo;
        this.U0 = true;
        if (!z10 && this.f48417v0 != 4) {
            this.V0 = !this.D0.saved_credentials.isEmpty();
        } else {
            this.V0 = z10;
        }
        if (str3 == null) {
            if (this.D0.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.D0.saved_credentials.get(0);
            this.f48424z0 = tL_paymentSavedCredentialsCard;
            this.f48423y0 = tL_paymentSavedCredentialsCard.title;
            return;
        }
        this.f48423y0 = str3;
    }

    public final void B0(Context context) {
        int i7;
        Optional empty;
        if (getParentActivity() != null) {
            b7.l lVar = new b7.l();
            if (this.D0.invoice.test) {
                i7 = 3;
            } else {
                i7 = 1;
            }
            if (i7 != 2 && i7 != 1 && i7 != 3) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(i5.c.i(i7, "Invalid environment value "));
            }
            lVar.f2963a = i7;
            this.f48393e = new com.google.android.gms.common.api.j(context, y8.p.f60530a, new y8.o(lVar), com.google.android.gms.common.api.i.f5924c);
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
            obj.f60490f = jSONObject;
            b9.k0 k0Var = this.f48393e;
            k0Var.getClass();
            com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
            b10.f6069a = 23705;
            b10.f6071c = new org.telegram.ui.Components.ff((Object) obj, 27);
            k0Var.e(0, b10.a()).addOnCompleteListener(getParentActivity(), new mk0(this, 0));
        }
    }

    public final void C0() {
        if (this.f48397f0) {
            return;
        }
        this.f48397f0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new fk0(this, 3), 10);
    }

    public final boolean D0(org.telegram.ui.ActionBar.o4 o4Var, Activity activity) {
        int i7 = 0;
        if (this.f48390c1 != null) {
            if (o4Var != null) {
                ArrayList arrayList = new ArrayList(o4Var.getFragmentStack());
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                    if (e2Var instanceof jl0) {
                        e2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.m0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().t6) && this.P0 == null) || (this.P0 != null && getMessagesController().f25408u6 != null && Objects.equals(this.P0, getMessagesController().f25408u6))) && o4Var != null) {
            ArrayList arrayList2 = new ArrayList(o4Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj2;
                if ((e2Var2 instanceof an) || (e2Var2 instanceof PremiumPreviewFragment)) {
                    e2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.f42996q0 = true;
            ((ActionBarLayout) o4Var).T(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).f42663w0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void E0(org.telegram.ui.ActionBar.e2 e2Var) {
        org.telegram.messenger.g0.v1(this.fragmentView);
        if (e2Var instanceof jl0) {
            jl0 jl0Var = (jl0) e2Var;
            jl0Var.f48384a1 = this.f48384a1;
            jl0Var.Z0 = this.Z0;
            jl0Var.Y0 = this.Y0;
            jl0Var.f48424z0 = this.f48424z0;
        }
    }

    public final void F0() {
        long j3;
        String str;
        if (this.R0) {
            return;
        }
        int i7 = 0;
        N0(false, true);
        TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.f48390c1;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.O0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().m1(this.O0.f23817k.peer_id);
            tL_inputInvoiceMessage.msg_id = this.O0.e1();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.P0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.D0.form_id;
        if (org.telegram.messenger.m10.i(this.currentAccount).f24964y != null && this.f48424z0 != null) {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.f28069id = this.f48424z0.f28182id;
            tL_inputPaymentCredentialsSaved.tmp_password = org.telegram.messenger.m10.i(this.currentAccount).f24964y.tmp_password;
        } else {
            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = this.K0;
            if (tL_inputPaymentCredentialsGooglePay != null) {
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsGooglePay;
            } else {
                TLRPC.TL_inputPaymentCredentials tL_inputPaymentCredentials = new TLRPC.TL_inputPaymentCredentials();
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentials;
                tL_inputPaymentCredentials.save = this.V0;
                tL_inputPaymentCredentials.data = new TLRPC.TL_dataJSON();
                tL_payments_sendPaymentForm.credentials.data.data = this.f48421x0;
            }
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.F0;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.f28183id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags = 1 | tL_payments_sendPaymentForm.flags;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.H0;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.f28189id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        if ((this.D0.invoice.flags & 256) != 0) {
            Long l10 = this.I0;
            if (l10 != null) {
                j3 = l10.longValue();
            } else {
                j3 = 0;
            }
            tL_payments_sendPaymentForm.tip_amount = j3;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        b00 b00Var = new b00(18, this, tL_payments_sendPaymentForm);
        if (this.X0) {
            i7 = 8;
        }
        connectionsManager.sendRequest(tL_payments_sendPaymentForm, b00Var, i7 | 2);
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
                org.telegram.messenger.g0.F3(2.5f, l3Var, null);
                return;
            }
            N0(true, true);
            TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
            confirmpasswordemail.code = text;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new fk0(this, 1), 10);
            return;
        }
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z10) {
            this.f48406n.setVisibility(0);
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.flags = 2;
            passwordinputsettings.email = "";
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            str2 = null;
            str = null;
        } else {
            String obj = this.f48396f[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                K0(0);
                return;
            } else if (!obj.equals(this.f48396f[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), org.telegram.messenger.hd.M0(2131747446, null), 0).show();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                K0(1);
                return;
            } else {
                String obj2 = this.f48396f[2].getText().toString();
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
                    passwordinputsettings2.new_algo = this.f48386b0.new_algo;
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
        Utilities.f22416e.c(new ai.j(this, z10, str2, str, updatepasswordsettings));
    }

    public final void H0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        int i7;
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
            com.google.android.gms.internal.vision.e2.r(sb2, ", ", str4, ", ", str5);
            x8VarArr[2].b(2131232273, a8.p0.s(sb2, ", ", str6), org.telegram.messenger.hd.M0(2131747381, null), true);
        }
        org.telegram.ui.Cells.x8 x8Var = x8VarArr[2];
        int i12 = 8;
        if (tL_paymentRequestedInfo.shipping_address != null) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        x8Var.setVisibility(i7);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            x8VarArr[3].b(2131232101, str7, org.telegram.messenger.hd.M0(2131747412, null), true);
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
            String b10 = pf.b.c().b(tL_paymentRequestedInfo.phone);
            String M0 = org.telegram.messenger.hd.M0(2131747410, null);
            if (tL_paymentRequestedInfo.email == null && this.H0 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            x8Var3.b(2131232084, b10, M0, z10);
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
            String M02 = org.telegram.messenger.hd.M0(2131747415, null);
            if (this.H0 == null) {
                z11 = false;
            }
            x8Var5.b(2131232223, str8, M02, z11);
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
        this.f48386b0 = password;
        if (password != null && !TextUtils.isEmpty(password.email_unconfirmed_pattern)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48389c0 = z10;
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

    public final void K0(int i7) {
        EditTextBoldCursor editTextBoldCursor = this.f48396f[i7];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.g0.F3(2.5f, editTextBoldCursor, null);
    }

    public final void L0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = str;
        t1Var.U = str2;
        showDialog(t1Var);
    }

    public final void M0(Runnable runnable) {
        org.telegram.ui.ActionBar.u2 i7 = org.telegram.messenger.i20.i(getParentActivity(), false, 1, null);
        i7.P = org.telegram.messenger.hd.M0(2131747414, null);
        i7.Q = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.f48424z0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(2131232274);
        } else {
            String str = this.f48423y0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(2131232274);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_paymentSavedCredentialsCard> arrayList4 = this.D0.saved_credentials;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i10);
            i10++;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard3 = tL_paymentSavedCredentialsCard2;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.f48424z0;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.f28182id, tL_paymentSavedCredentialsCard4.f28182id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(2131232274);
                arrayList3.add(tL_paymentSavedCredentialsCard3);
            }
        }
        ArrayList<TLRPC.TL_paymentFormMethod> arrayList5 = this.D0.additional_methods;
        int size2 = arrayList5.size();
        int i11 = 0;
        while (i11 < size2) {
            TLRPC.TL_paymentFormMethod tL_paymentFormMethod = arrayList5.get(i11);
            i11++;
            arrayList.add(tL_paymentFormMethod.title);
            arrayList2.add(2131232276);
        }
        arrayList.add(org.telegram.messenger.hd.M0(2131747413, null));
        arrayList2.add(2131232045);
        int[] iArr = new int[arrayList2.size()];
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        org.telegram.ui.Components.r2 r2Var = new org.telegram.ui.Components.r2(this, runnable, arrayList3, arrayList, 1);
        i7.M = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        i7.N = iArr;
        i7.L = r2Var;
        showDialog(i7);
    }

    public final void N0(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f48418w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10 && this.f48406n != null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f48418w = animatorSet2;
            if (z11) {
                this.f48411r.setVisibility(0);
                this.f48406n.setEnabled(false);
                AnimatorSet animatorSet3 = this.f48418w;
                View contentView = this.f48406n.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, property, 0.1f);
                View contentView2 = this.f48406n.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, property2, 0.1f);
                View contentView3 = this.f48406n.getContentView();
                Property property3 = View.ALPHA;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, property3, 0.0f), ObjectAnimator.ofFloat(this.f48411r, property, 1.0f), ObjectAnimator.ofFloat(this.f48411r, property2, 1.0f), ObjectAnimator.ofFloat(this.f48411r, property3, 1.0f));
            } else if (this.f48420x != null) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f48411r, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.f48411r, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.f48411r, View.ALPHA, 0.0f));
            } else {
                this.f48406n.getContentView().setVisibility(0);
                this.f48406n.setEnabled(true);
                AnimatorSet animatorSet4 = this.f48418w;
                org.telegram.ui.Components.hq hqVar = this.f48411r;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(hqVar, property4, 0.1f);
                org.telegram.ui.Components.hq hqVar2 = this.f48411r;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(hqVar2, property5, 0.1f);
                org.telegram.ui.Components.hq hqVar3 = this.f48411r;
                Property property6 = View.ALPHA;
                animatorSet4.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(hqVar3, property6, 0.0f));
                if (!isFinishing()) {
                    this.f48418w.playTogether(ObjectAnimator.ofFloat(this.f48406n.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.f48406n.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.f48406n.getContentView(), property6, 1.0f));
                }
            }
            this.f48418w.addListener(new cl0(this, z11, 0));
            this.f48418w.setDuration(150L);
            this.f48418w.start();
        } else if (this.V != null) {
            this.f48418w = new AnimatorSet();
            if (z11) {
                this.f48413s.setVisibility(0);
                this.X.setEnabled(false);
                AnimatorSet animatorSet5 = this.f48418w;
                TextView textView = this.V;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, property7, 0.1f);
                TextView textView2 = this.V;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, property8, 0.1f);
                TextView textView3 = this.V;
                Property property9 = View.ALPHA;
                animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, property9, 0.0f), ObjectAnimator.ofFloat(this.f48413s, property7, 1.0f), ObjectAnimator.ofFloat(this.f48413s, property8, 1.0f), ObjectAnimator.ofFloat(this.f48413s, property9, 1.0f));
            } else {
                this.V.setVisibility(0);
                this.X.setEnabled(true);
                AnimatorSet animatorSet6 = this.f48418w;
                org.telegram.ui.Components.hq hqVar4 = this.f48413s;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(hqVar4, property10, 0.1f);
                org.telegram.ui.Components.hq hqVar5 = this.f48413s;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(hqVar5, property11, 0.1f);
                org.telegram.ui.Components.hq hqVar6 = this.f48413s;
                Property property12 = View.ALPHA;
                animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(hqVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.V, property10, 1.0f), ObjectAnimator.ofFloat(this.V, property11, 1.0f), ObjectAnimator.ofFloat(this.V, property12, 1.0f));
            }
            this.f48418w.addListener(new cl0(this, z11, 1));
            this.f48418w.setDuration(150L);
            this.f48418w.start();
        }
    }

    public final void O0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131747354, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("PaymentTransactionMessage2", null, 2131747355, str, this.f48410q0, this.f48412r0));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, null), new mk0(this, 5));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        showDialog(t1Var);
    }

    public final void P0() {
        if (this.f48417v0 == 6) {
            org.telegram.ui.Cells.y8[] y8VarArr = this.N;
            if (y8VarArr[2] != null) {
                int i7 = 0;
                this.f48406n.setVisibility(0);
                TL_account.Password password = this.f48386b0;
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
                        ((View) this.f48396f[i10].getParent()).setVisibility(8);
                    }
                    while (i7 < arrayList.size()) {
                        ((View) arrayList.get(i7)).setVisibility(8);
                        i7++;
                    }
                    return;
                }
                N0(true, false);
                if (this.f48389c0) {
                    org.telegram.ui.Cells.y8 y8Var = y8VarArr[2];
                    String str = this.f48386b0.email_unconfirmed_pattern;
                    if (str == null) {
                        str = "";
                    }
                    y8Var.setText(org.telegram.messenger.hd.a0("EmailPasswordConfirmText2", null, 2131751199, str));
                    y8VarArr[2].setVisibility(0);
                    v9VarArr[0].setVisibility(0);
                    v9VarArr[1].setVisibility(0);
                    this.T.setVisibility(0);
                    y8VarArr[1].setText("");
                    n4VarArr[0].setVisibility(8);
                    n4VarArr[1].setVisibility(8);
                    y8VarArr[0].setVisibility(8);
                    for (int i11 = 0; i11 < 3; i11++) {
                        ((View) this.f48396f[i11].getParent()).setVisibility(8);
                    }
                    while (i7 < arrayList.size()) {
                        ((View) arrayList.get(i7)).setVisibility(8);
                        i7++;
                    }
                    return;
                }
                y8VarArr[2].setVisibility(8);
                v9VarArr[0].setVisibility(8);
                v9VarArr[1].setVisibility(8);
                y8VarArr[1].setText(org.telegram.messenger.hd.M0(2131747391, null));
                this.T.setVisibility(8);
                n4VarArr[0].setVisibility(0);
                n4VarArr[1].setVisibility(0);
                y8VarArr[0].setVisibility(0);
                for (int i12 = 0; i12 < 3; i12++) {
                    ((View) this.f48396f[i12].getParent()).setVisibility(0);
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
                if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.f48420x != null && this.A0)) {
                    this.M.setVisibility(8);
                    y8VarArr[0].setVisibility(8);
                    org.telegram.ui.Cells.x6 x6Var = x6VarArr[2];
                    org.telegram.ui.ActionBar.q6.Z(x6Var, x6Var.getContext(), 2131231230, org.telegram.ui.ActionBar.j6.f28813b7);
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131747421, null));
                if (this.D0.password_missing) {
                    C0();
                    spannableStringBuilder.append((CharSequence) "\n");
                    int length = spannableStringBuilder.length();
                    String M0 = org.telegram.messenger.hd.M0(2131747420, null);
                    int indexOf = M0.indexOf(42);
                    int lastIndexOf = M0.lastIndexOf(42);
                    spannableStringBuilder.append((CharSequence) M0);
                    if (indexOf != -1 && lastIndexOf != -1) {
                        int i7 = indexOf + length;
                        int i10 = lastIndexOf + length;
                        y8VarArr[0].getTextView().setMovementMethod(new org.telegram.messenger.c0(false));
                        spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                        spannableStringBuilder.replace(i7, i7 + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new gl0(this), i7, i10 - 1, 33);
                    }
                }
                this.M.setEnabled(true);
                y8VarArr[0].setText(spannableStringBuilder);
                this.M.setVisibility(0);
                y8VarArr[0].setVisibility(0);
                org.telegram.ui.Cells.x6 x6Var2 = x6VarArr[2];
                org.telegram.ui.ActionBar.q6.Z(x6Var2, x6Var2.getContext(), 2131231229, org.telegram.ui.ActionBar.j6.f28813b7);
            }
        }
    }

    public final void R0() {
        this.S0[0] = y0(this.f48416u0);
        this.S.a(org.telegram.messenger.hd.M0(2131747353, null), this.S0[0], true);
        TextView textView = this.V;
        if (textView != null) {
            textView.setText(org.telegram.messenger.hd.a0("PaymentCheckoutPay", null, 2131747411, this.S0[0]));
        }
        if (this.f48415t0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Vi);
            int childCount = this.f48415t0.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                TextView textView2 = (TextView) this.f48415t0.getChildAt(i7);
                if (textView2.getTag().equals(this.I0)) {
                    org.telegram.ui.ActionBar.j6.C1(themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.Wi, this.Z0);
                } else {
                    org.telegram.ui.ActionBar.j6.C1(536870911 & themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.Z8, this.Z0);
                }
                textView2.invalidate();
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28905g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25547p0) {
            TLRPC.PaymentForm paymentForm = this.D0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            Q0();
        } else if (i7 == org.telegram.messenger.ns.f25560r0) {
            TLRPC.PaymentForm paymentForm2 = this.D0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            Q0();
        } else if (i7 == org.telegram.messenger.ns.f25464a1) {
            this.f48387b1 = true;
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
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.F, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29129s8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.D8));
        if (this.f48396f != null) {
            int i7 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f48396f;
                if (i7 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.s6((View) editTextBoldCursorArr[i7].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
                i7++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.H6));
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
            arrayList.add(new org.telegram.ui.ActionBar.s6(n4VarArr[i11], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
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
            arrayList.add(new org.telegram.ui.ActionBar.s6((View) arrayList2.get(i14), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
            i14++;
        }
        int i15 = 1;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.M, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.M, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.N6));
        for (int i16 = 0; i16 < this.O.length; i16++) {
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.V, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29127s6));
        while (true) {
            org.telegram.ui.Cells.x8[] x8VarArr = this.Z;
            if (i15 < x8VarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.s6(x8VarArr[i15], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
                i15++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.s6(this.X, 268435456, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
                arrayList.add(new org.telegram.ui.ActionBar.s6(this.X, 268435456, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28941i6));
                return arrayList;
            }
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.H;
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        if (i7 == 991) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u11(this, i10, intent, 7));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        WebView webView = this.f48420x;
        if (webView != null && this.E) {
            if (z10) {
                webView.loadUrl(this.f48422y);
                this.E = false;
            }
            return false;
        }
        return !this.Q0;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.f48417v0 == 4 && this.Y0) {
            this.Y0 = false;
            this.X.callOnClick();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25547p0);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25560r0);
        if (this.f48417v0 != 4 || this.W0) {
            org.telegram.messenger.ns.f(this.currentAccount).b(this, org.telegram.messenger.ns.f25464a1);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl0.onFragmentDestroy():void");
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        try {
            int i7 = this.f48417v0;
            if ((i7 == 2 || i7 == 6) && !this.D0.invoice.test) {
                getParentActivity().getWindow().setFlags(8192, 8192);
                org.telegram.messenger.g0.h2();
                return;
            }
            if (org.telegram.messenger.gz.f23978s.length() != 0 && !org.telegram.messenger.gz.A) {
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
                org.telegram.messenger.g0.y3(scrollView, getThemedColor(org.telegram.ui.ActionBar.j6.f29129s8));
            }
            if (this.f48396f != null) {
                getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                int i7 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.f48396f;
                    if (i7 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i7];
                        if (editTextBoldCursor != null) {
                            org.telegram.ui.ActionBar.q6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.j6.G6, this.Z0);
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
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11) {
            WebView webView = this.f48420x;
            if (webView != null) {
                if (this.f48417v0 != 4) {
                    TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.G0;
                    if (tL_paymentFormMethod != null) {
                        String str = tL_paymentFormMethod.url;
                        this.f48422y = str;
                        webView.loadUrl(str);
                        return;
                    }
                    String str2 = this.D0.url;
                    this.f48422y = str2;
                    webView.loadUrl(str2);
                    return;
                }
                return;
            }
            int i7 = this.f48417v0;
            if (i7 == 2) {
                org.telegram.messenger.g0.i3(new kk0(this, 3), 100L);
            } else if (i7 == 3) {
                this.f48396f[1].requestFocus();
                org.telegram.messenger.g0.J3(this.f48396f[1]);
            } else if (i7 == 4) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f48396f;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                }
            } else if (i7 == 6 && !this.f48389c0) {
                this.f48396f[0].requestFocus();
                org.telegram.messenger.g0.J3(this.f48396f[0]);
            }
        }
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.e2 e2Var) {
        E0(e2Var);
        return super.presentFragment(e2Var);
    }

    public final void s0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.j6.N0(true);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.f28849d6);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.f28941i6);
        frameLayout.setBackground(N0);
        org.telegram.ui.ActionBar.q6.j(frameLayout, N0, M, M2, null);
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
        this.P.addView(this.Q, c8.ja.c(48.0f, -1));
        this.Q.setOnClickListener(new gk0(this, 13));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.Q.addView(linearLayout, c8.ja.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(2131230909);
        linearLayout.addView(imageView, c8.ja.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(2131231224);
        this.Q.addView(imageView2, c8.ja.c(-1.0f, -1));
    }

    public final void t0(String str) {
        boolean z10;
        boolean z11;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.f26600b.getSystemService("phone");
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
                    str = pf.b.d(telephonyManager.getLine1Number(), false);
                }
                if (!TextUtils.isEmpty(str)) {
                    int i7 = 4;
                    String str2 = null;
                    if (str.length() > 4) {
                        while (true) {
                            if (i7 >= 1) {
                                String substring = str.substring(0, i7);
                                if (((String) this.f48388c.get(substring)) != null) {
                                    str2 = str.substring(i7);
                                    this.f48396f[8].setText(substring);
                                    z11 = true;
                                    break;
                                }
                                i7--;
                            } else {
                                z11 = false;
                                break;
                            }
                        }
                        if (!z11) {
                            str2 = str.substring(1);
                            this.f48396f[8].setText(str.substring(0, 1));
                        }
                    }
                    if (str2 != null) {
                        this.f48396f[9].setText(str2);
                        EditTextBoldCursor editTextBoldCursor = this.f48396f[9];
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final long v0() {
        TLRPC.InputInvoice inputInvoice = this.f48390c1;
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
        TLRPC.InputInvoice inputInvoice = this.f48390c1;
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
        String upperCase = this.D0.invoice.currency.toUpperCase();
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
        Long l10 = this.I0;
        if (l10 != null) {
            j3 += l10.longValue();
        }
        return org.telegram.messenger.hd.E0().p(j3, this.D0.invoice.currency);
    }

    public final void z0() {
        int i7;
        int i10;
        boolean z10;
        int i11;
        int i12 = this.f48417v0;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 6) {
                                if (!this.U.c(this.f48421x0, this.f48423y0, this.V0, this.K0, this.f48424z0)) {
                                    jl0 jl0Var = new jl0(this.f48390c1, this.D0, this.O0, this.P0, 4, this.F0, this.H0, this.I0, this.f48421x0, this.f48423y0, this.J0, this.V0, this.K0, this.f48414s0, false);
                                    jl0Var.f48392d1 = this.f48392d1;
                                    jl0Var.f48395e1 = this.f48395e1;
                                    presentFragment(jl0Var, true);
                                    return;
                                }
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        boolean z11 = this.W0;
                        int i13 = org.telegram.messenger.ns.f25464a1;
                        if (z11) {
                            org.telegram.messenger.ns.f(this.currentAccount).n(this, i13);
                        }
                        org.telegram.messenger.ns.f(this.currentAccount).k(i13, new Object[0]);
                        if (getMessagesController().f25338m7 == null) {
                            if (!D0(getParentLayout(), getParentActivity()) && !isFinishing()) {
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        org.telegram.messenger.g0.i3(new kk0(this, 1), 500L);
                        return;
                    }
                    if (this.f48419w0) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    jl0 jl0Var2 = new jl0(this.f48390c1, this.D0, this.O0, this.P0, i11, this.F0, this.H0, this.I0, this.f48421x0, this.f48423y0, this.J0, this.V0, this.K0, this.f48414s0, this.X0);
                    jl0Var2.f48392d1 = this.f48392d1;
                    jl0Var2.f48395e1 = this.f48395e1;
                    presentFragment(jl0Var2, true);
                    return;
                }
                TLRPC.PaymentForm paymentForm = this.D0;
                if (paymentForm.password_missing && (z10 = this.V0)) {
                    jl0 jl0Var3 = new jl0(this.f48390c1, paymentForm, this.O0, this.P0, 6, this.F0, this.H0, this.I0, this.f48421x0, this.f48423y0, this.J0, z10, this.K0, this.f48414s0, this.X0);
                    this.f48399g0 = jl0Var3;
                    jl0Var3.f48392d1 = this.f48392d1;
                    jl0Var3.f48395e1 = this.f48395e1;
                    jl0Var3.I0(this.f48386b0);
                    jl0 jl0Var4 = this.f48399g0;
                    jl0Var4.U = new al0(this);
                    presentFragment(jl0Var4, this.T0);
                    return;
                }
                hl0 hl0Var = this.U;
                if (hl0Var != null) {
                    hl0Var.c(this.f48421x0, this.f48423y0, this.V0, this.K0, null);
                    finishFragment();
                    return;
                }
                jl0 jl0Var5 = new jl0(this.f48390c1, paymentForm, this.O0, this.P0, 4, this.F0, this.H0, this.I0, this.f48421x0, this.f48423y0, this.J0, this.V0, this.K0, this.f48414s0, this.X0);
                jl0Var5.f48392d1 = this.f48392d1;
                jl0Var5.f48395e1 = this.f48395e1;
                presentFragment(jl0Var5, this.T0);
                return;
            }
            if (this.f48421x0 == null && this.f48423y0 == null) {
                if (this.f48424z0 != null) {
                    if (org.telegram.messenger.m10.i(this.currentAccount).f24964y != null && org.telegram.messenger.m10.i(this.currentAccount).f24964y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        org.telegram.messenger.m10.i(this.currentAccount).f24964y = null;
                        org.telegram.messenger.m10.i(this.currentAccount).v(false);
                    }
                    if (org.telegram.messenger.m10.i(this.currentAccount).f24964y == null) {
                        i10 = 3;
                    }
                } else {
                    i10 = 2;
                }
                if (i10 != 2 && this.f48423y0 == null && this.f48424z0 == null && this.f48421x0 == null && !this.D0.additional_methods.isEmpty()) {
                    M0(new kk0(this, 0));
                    return;
                }
                jl0 jl0Var6 = new jl0(this.f48390c1, this.D0, this.O0, this.P0, i10, this.F0, this.H0, this.I0, this.f48421x0, this.f48423y0, this.J0, this.V0, this.K0, this.f48414s0, this.X0);
                jl0Var6.f48392d1 = this.f48392d1;
                jl0Var6.f48395e1 = this.f48395e1;
                presentFragment(jl0Var6, this.T0);
                return;
            }
            i10 = 4;
            if (i10 != 2) {
            }
            jl0 jl0Var62 = new jl0(this.f48390c1, this.D0, this.O0, this.P0, i10, this.F0, this.H0, this.I0, this.f48421x0, this.f48423y0, this.J0, this.V0, this.K0, this.f48414s0, this.X0);
            jl0Var62.f48392d1 = this.f48392d1;
            jl0Var62.f48395e1 = this.f48395e1;
            presentFragment(jl0Var62, this.T0);
            return;
        }
        hl0 hl0Var2 = this.U;
        if (hl0Var2 != null) {
            hl0Var2.d(this.J0);
            finishFragment();
            return;
        }
        if (this.D0.invoice.flexible) {
            i7 = 1;
        } else if (this.f48424z0 == null && this.f48421x0 == null) {
            i7 = 2;
        } else {
            if (org.telegram.messenger.m10.i(this.currentAccount).f24964y != null && org.telegram.messenger.m10.i(this.currentAccount).f24964y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                org.telegram.messenger.m10.i(this.currentAccount).f24964y = null;
                org.telegram.messenger.m10.i(this.currentAccount).v(false);
            }
            if (org.telegram.messenger.m10.i(this.currentAccount).f24964y != null) {
                i7 = 4;
            } else {
                i7 = 3;
            }
        }
        if (i7 == 2 && this.f48424z0 == null && this.f48421x0 == null && !this.D0.additional_methods.isEmpty()) {
            M0(new kk0(this, 0));
            return;
        }
        jl0 jl0Var7 = new jl0(this.f48390c1, this.D0, this.O0, this.P0, i7, this.F0, null, null, this.f48421x0, this.f48423y0, this.J0, this.V0, this.K0, this.f48414s0, this.X0);
        jl0Var7.f48392d1 = this.f48392d1;
        jl0Var7.f48395e1 = this.f48395e1;
        presentFragment(jl0Var7, this.T0);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.e2 e2Var, boolean z10) {
        E0(e2Var);
        return super.presentFragment(e2Var, z10);
    }

    public jl0(TLRPC.PaymentForm paymentForm, org.telegram.messenger.gj gjVar, String str, org.telegram.ui.ActionBar.e2 e2Var) {
        super(null);
        this.f48382a = new ArrayList();
        this.f48385b = new HashMap();
        this.f48388c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new org.telegram.ui.Cells.n4[3];
        this.K = new ArrayList();
        this.L = new org.telegram.ui.Cells.x6[3];
        this.N = new org.telegram.ui.Cells.y8[3];
        this.O = new org.telegram.ui.Cells.v9[2];
        this.Z = new org.telegram.ui.Cells.x8[7];
        this.f48383a0 = -4.5f;
        this.f48391d0 = 6;
        this.W0 = true;
        A0(null, paymentForm, gjVar, str, 4, null, null, null, null, null, null, false, null, e2Var, false);
    }

    public jl0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.f48382a = new ArrayList();
        this.f48385b = new HashMap();
        this.f48388c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new org.telegram.ui.Cells.n4[3];
        this.K = new ArrayList();
        this.L = new org.telegram.ui.Cells.x6[3];
        this.N = new org.telegram.ui.Cells.y8[3];
        this.O = new org.telegram.ui.Cells.v9[2];
        this.Z = new org.telegram.ui.Cells.x8[7];
        this.f48383a0 = -4.5f;
        this.f48391d0 = 6;
        this.f48417v0 = 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.D0 = paymentForm;
        this.E0 = paymentReceipt;
        paymentForm.bot_id = paymentReceipt.bot_id;
        paymentForm.invoice = paymentReceipt.invoice;
        paymentForm.provider_id = paymentReceipt.provider_id;
        paymentForm.users = paymentReceipt.users;
        this.H0 = paymentReceipt.shipping;
        long j3 = paymentReceipt.tip_amount;
        if (j3 != 0) {
            this.I0 = Long.valueOf(j3);
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(paymentReceipt.bot_id));
        this.m0 = a22;
        if (a22 != null) {
            this.f48410q0 = a22.first_name;
        } else {
            this.f48410q0 = "";
        }
        this.f48412r0 = paymentReceipt.title;
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
        this.f48423y0 = paymentReceipt.credentials_title;
    }

    public jl0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.e2 e2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, e2Var, false);
        this.W0 = true;
    }
}
