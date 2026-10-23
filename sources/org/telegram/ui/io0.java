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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class io0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static final List f38285g1 = Arrays.asList("http", "https");
    public static final List f38286h1 = Collections.singletonList("tg");
    public lt A0;
    public String B0;
    public TLRPC.PaymentForm C0;
    public final TLRPC.PaymentReceipt D0;
    public ScrollView E;
    public TLRPC.TL_payments_validatedRequestedInfo E0;
    public boolean F;
    public TLRPC.TL_paymentFormMethod F0;
    public boolean G;
    public TLRPC.TL_shippingOption G0;
    public TextView H;
    public Long H0;
    public final org.telegram.ui.Cells.l4[] I;
    public TLRPC.TL_payments_validateRequestedInfo I0;
    public final ArrayList J;
    public TLRPC.TL_inputPaymentCredentialsGooglePay J0;
    public final org.telegram.ui.Cells.b7[] K;
    public String K0;
    public org.telegram.ui.Cells.w8 L;
    public String L0;
    public final org.telegram.ui.Cells.e9[] M;
    public JSONObject M0;
    public final org.telegram.ui.Cells.ca[] N;
    public MessageObject N0;
    public FrameLayout O;
    public String O0;
    public FrameLayout P;
    public boolean P0;
    public LinearLayout Q;
    public boolean Q0;
    public org.telegram.ui.Cells.f9 R;
    public String[] R0;
    public org.telegram.ui.Cells.i3 S;
    public boolean S0;
    public go0 T;
    public boolean T0;
    public TextView U;
    public boolean U0;
    public org.telegram.ui.Cells.p6 V;
    public boolean V0;
    public eo0 W;
    public boolean W0;
    public org.telegram.ui.Cells.k5 X;
    public boolean X0;
    public final org.telegram.ui.Cells.d9[] Y;
    public org.telegram.ui.ActionBar.g6 Y0;
    public float Z;
    public ho0 Z0;
    public final ArrayList f38287a;
    public TL_account.Password f38288a0;
    public boolean f38289a1;
    public final HashMap f38290b;
    public boolean f38291b0;
    public TLRPC.InputInvoice f38292b1;
    public final HashMap f38293c;
    public int f38294c0;
    public Utilities.Callback f38295c1;
    public final HashMap d;
    public fn0 f38296d0;
    public Utilities.Callback f38297d1;
    public com.google.android.gms.internal.clearcut.v0 e;
    public boolean f38298e0;
    public x10 f38299e1;
    public EditTextBoldCursor[] f38300f;
    public io0 f38301f0;
    public int f38302f1;
    public boolean f38303g0;
    public org.telegram.ui.Cells.k6[] h;
    public boolean f38304h0;
    public boolean f38305i0;
    public String f38306j0;
    public boolean f38307k0;
    public TLRPC.User f38308l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.u0 f38309n;
    public boolean f38310n0;
    public boolean f38311o0;
    public String f38312p0;
    public String f38313q0;
    public org.telegram.ui.Components.cr f38314r;
    public org.telegram.ui.ActionBar.o2 f38315r0;
    public org.telegram.ui.Components.cr f38316s;
    public ln0 f38317s0;
    public ArrayList f38318t0;
    public int f38319u0;
    public AnimatorSet v;
    public boolean f38320v0;
    public WebView f38321w;
    public String f38322w0;
    public String f38323x;
    public String f38324x0;
    public boolean f38325y;
    public TLRPC.TL_paymentSavedCredentialsCard f38326y0;
    public boolean f38327z0;

    public io0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l4, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.o2 o2Var, boolean z11) {
        super(null);
        this.f38287a = new ArrayList();
        this.f38290b = new HashMap();
        this.f38293c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.l4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.b7[3];
        this.M = new org.telegram.ui.Cells.e9[3];
        this.N = new org.telegram.ui.Cells.ca[2];
        this.Y = new org.telegram.ui.Cells.d9[7];
        this.Z = -4.5f;
        this.f38294c0 = 6;
        u0(inputInvoice, paymentForm, messageObject, str, i10, tL_payments_validatedRequestedInfo, tL_shippingOption, l4, str2, str3, tL_payments_validateRequestedInfo, z10, tL_inputPaymentCredentialsGooglePay, o2Var, z11);
    }

    public static void U(io0 io0Var, TL_account.Password password, byte[] bArr) {
        byte[] bArr2;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        a50 a50Var = new a50(18, io0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            gettmppassword.password = startCheck;
            if (startCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                a50Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(io0Var.currentAccount).sendRequest(gettmppassword, a50Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        a50Var.run(null, tL_error2);
    }

    public static void V(io0 io0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        io0Var.D0(false);
        io0Var.H0(true, false);
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
                    io0Var.E0(2);
                    return;
                case 1:
                    io0Var.E0(0);
                    return;
                case 2:
                    io0Var.E0(4);
                    return;
                case 3:
                    io0Var.E0(6);
                    return;
                case 4:
                    io0Var.E0(5);
                    return;
                case 5:
                    io0Var.E0(3);
                    return;
                case 6:
                    io0Var.E0(9);
                    return;
                case 7:
                    io0Var.E0(1);
                    return;
                case '\b':
                    io0Var.E0(7);
                    return;
                default:
                    org.telegram.ui.Components.f5.f0(io0Var.currentAccount, tL_error, io0Var, tLObject, new Object[0]);
                    return;
            }
        }
    }

    public static void W(io0 io0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        int i10;
        io0Var.E0 = tL_payments_validatedRequestedInfo;
        if (io0Var.C0.saved_info != null && !io0Var.T0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(io0Var.currentAccount);
            ci.d6 d6Var = new ci.d6(20);
            if (io0Var.W0) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            connectionsManager.sendRequest(tL_payments_clearSavedInfo, d6Var, i10);
        }
        io0Var.t0();
        io0Var.D0(false);
        io0Var.H0(true, false);
    }

    public static void X(io0 io0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        io0Var.D0(false);
        io0Var.H0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.f5.f0(io0Var.currentAccount, tL_error, io0Var, tLObject, new Object[0]);
        }
    }

    public static void Y(io0 io0Var, org.telegram.ui.Components.qc qcVar, boolean z10, TLRPC.Message message) {
        qcVar.b();
        if (z10) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(sn.V9(message.f20364id, MessageObject.getDialogId(message)));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = message.f20364id;
        tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(io0Var.currentAccount).getInputPeer(message.peer_id);
        ConnectionsManager.getInstance(io0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new in0(io0Var, 3), 2);
    }

    public static void Z(io0 io0Var) {
        int i10;
        TL_account.resendPasswordEmail resendpasswordemail = new TL_account.resendPasswordEmail();
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(io0Var.currentAccount);
        ci.d6 d6Var = new ci.d6(20);
        if (io0Var.W0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        connectionsManager.sendRequest(resendpasswordemail, d6Var, i10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(io0Var.getParentActivity());
        alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        io0Var.showDialog(alertDialog$Builder.f20678a);
    }

    public static void a0(io0 io0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        ai.w9 w9Var = new ai.w9(io0Var, z10, str, 8);
        if (!z10) {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str2);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = io0Var.f38288a0.new_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                updatepasswordsettings.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                if (updatepasswordsettings.new_settings.new_password_hash == null) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "ALGO_INVALID";
                    w9Var.run(null, tL_error);
                }
                ConnectionsManager.getInstance(io0Var.currentAccount).sendRequest(updatepasswordsettings, w9Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            w9Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(io0Var.currentAccount).sendRequest(updatepasswordsettings, w9Var, 10);
    }

    public static void b0(io0 io0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.f5.f0(io0Var.currentAccount, tL_error, io0Var, tL_payments_sendPaymentForm, new Object[0]);
        io0Var.D0(false);
        io0Var.H0(false, false);
        io0Var.f38289a1 = true;
        io0Var.f38302f1 = 4;
        ho0 ho0Var = io0Var.Z0;
        if (ho0Var != null) {
            ho0Var.a(4);
        }
    }

    public static void c0(io0 io0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.o2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            ai.nd.k1(io0Var.getParentActivity(), io0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, io0Var.Y0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (R = LaunchActivity.R()) != 0) {
            ?? obj = new Object();
            obj.f21636a = true;
            io0 io0Var2 = new io0((TLRPC.PaymentReceipt) tLObject);
            io0Var2.f38295c1 = io0Var.f38295c1;
            io0Var2.f38297d1 = io0Var.f38297d1;
            R.showAsSheet(io0Var2, obj);
        }
    }

    public static void d0(io0 io0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        io0Var.H0(true, false);
        io0Var.D0(false);
        if (tLObject != null) {
            io0Var.f38320v0 = true;
            UserConfig.getInstance(io0Var.currentAccount).tmpPassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(io0Var.currentAccount).saveConfig(false);
            io0Var.t0();
        } else if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            try {
                io0Var.f38300f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(io0Var.f38300f[1], 3.25f);
            io0Var.f38300f[1].setText("");
        } else {
            org.telegram.ui.Components.f5.f0(io0Var.currentAccount, tL_error, io0Var, gettmppassword, new Object[0]);
        }
    }

    public static void e0(io0 io0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.o2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            ai.nd.k1(io0Var.getParentActivity(), io0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, io0Var.Y0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (R = LaunchActivity.R()) != 0) {
            ?? obj = new Object();
            obj.f21636a = true;
            io0 io0Var2 = new io0((TLRPC.PaymentReceipt) tLObject);
            io0Var2.f38295c1 = io0Var.f38295c1;
            io0Var2.f38297d1 = io0Var.f38297d1;
            R.showAsSheet(io0Var2, obj);
        }
    }

    public static void f0(io0 io0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.i0(password, false)) {
                org.telegram.ui.Components.f5.x0(io0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            } else if (!password.has_password) {
                io0Var.f38320v0 = false;
                io0Var.t0();
                return;
            } else {
                Utilities.globalQueue.postRunnable(new re0(io0Var, password, AndroidUtilities.getStringBytes(str), 16));
                return;
            }
        }
        org.telegram.ui.Components.f5.f0(io0Var.currentAccount, tL_error, io0Var, getpassword, new Object[0]);
        io0Var.H0(true, false);
        io0Var.D0(false);
    }

    public static void g0(io0 io0Var, org.telegram.ui.Components.qc qcVar, boolean z10, TLRPC.Message[] messageArr) {
        qcVar.b();
        if (z10) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(sn.V9(messageArr[0].f20364id, MessageObject.getDialogId(messageArr[0])));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = messageArr[0].f20364id;
        tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(io0Var.currentAccount).getInputPeer(messageArr[0].peer_id);
        ConnectionsManager.getInstance(io0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new in0(io0Var, 2), 2);
    }

    public static void h0(org.telegram.ui.io0 r23, java.lang.String r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.io0.h0(org.telegram.ui.io0, java.lang.String, android.view.View):void");
    }

    public static void i0(io0 io0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        String formatPluralString;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(io0Var.currentAccount).sendRequest(new TL_account.getPassword(), new ei.o3(10, io0Var, z10), 8);
            return;
        }
        io0Var.H0(true, false);
        if (z10) {
            TL_account.Password password = io0Var.f38288a0;
            password.has_password = false;
            password.current_algo = null;
            io0Var.T.a(password);
            io0Var.finishFragment();
        } else if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (io0Var.getParentActivity() != null) {
                io0Var.t0();
            }
        } else if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    io0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    io0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    io0Var.F0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            }
            io0Var.f38294c0 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(io0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ql0(2, io0Var, str));
            String string = LocaleController.getString(R.string.YourEmailAlmostThereText);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
            c2Var.T = string;
            c2Var.R = LocaleController.getString(R.string.YourEmailAlmostThere);
            Dialog showDialog = io0Var.showDialog(c2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        }
    }

    public static void j0(org.telegram.ui.io0 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.io0.j0(org.telegram.ui.io0):void");
    }

    public static void k0(io0 io0Var) {
        int i10 = 0;
        if (UserConfig.getInstance(io0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(io0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(io0Var.currentAccount).getCurrentTime() + 60) {
            UserConfig.getInstance(io0Var.currentAccount).tmpPassword = null;
            UserConfig.getInstance(io0Var.currentAccount).saveConfig(false);
        }
        if (UserConfig.getInstance(io0Var.currentAccount).tmpPassword != null) {
            io0Var.z0();
        } else if (io0Var.f38300f[1].length() == 0) {
            try {
                io0Var.f38300f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(io0Var.f38300f[1], 2.5f);
        } else {
            String obj = io0Var.f38300f[1].getText().toString();
            io0Var.H0(true, true);
            io0Var.D0(true);
            TL_account.getPassword getpassword = new TL_account.getPassword();
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(io0Var.currentAccount);
            ca caVar = new ca(io0Var, obj, getpassword, 28);
            if (io0Var.W0) {
                i10 = 8;
            }
            connectionsManager.sendRequest(getpassword, caVar, i10 | 2);
        }
    }

    public static void m0(io0 io0Var) {
        if (io0Var.Q0) {
            return;
        }
        io0Var.H0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        io0Var.I0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = io0Var.f38292b1;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (io0Var.N0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = io0Var.getMessagesController().getInputPeer(io0Var.N0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = io0Var.N0.getId();
            io0Var.I0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = io0Var.O0;
            io0Var.I0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = io0Var.I0;
        tL_payments_validateRequestedInfo2.save = io0Var.T0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (io0Var.C0.invoice.name_requested) {
            io0Var.I0.info.name = io0Var.f38300f[6].getText().toString();
            io0Var.I0.info.flags |= 1;
        }
        int i10 = 8;
        if (io0Var.C0.invoice.phone_requested) {
            io0Var.I0.info.phone = "+" + io0Var.f38300f[8].getText().toString() + io0Var.f38300f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = io0Var.I0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (io0Var.C0.invoice.email_requested) {
            io0Var.I0.info.email = io0Var.f38300f[7].getText().toString().trim();
            io0Var.I0.info.flags |= 4;
        }
        if (io0Var.C0.invoice.shipping_address_requested) {
            io0Var.I0.info.shipping_address = new TLRPC.TL_postAddress();
            io0Var.I0.info.shipping_address.street_line1 = io0Var.f38300f[0].getText().toString();
            io0Var.I0.info.shipping_address.street_line2 = io0Var.f38300f[1].getText().toString();
            io0Var.I0.info.shipping_address.city = io0Var.f38300f[2].getText().toString();
            io0Var.I0.info.shipping_address.state = io0Var.f38300f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = io0Var.I0.info.shipping_address;
            String str = io0Var.B0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = io0Var.f38300f[5].getText().toString();
            io0Var.I0.info.flags |= 8;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo3 = io0Var.I0;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(io0Var.currentAccount);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo4 = io0Var.I0;
        a50 a50Var = new a50(16, io0Var, tL_payments_validateRequestedInfo3);
        if (!io0Var.W0) {
            i10 = 0;
        }
        connectionsManager.sendRequest(tL_payments_validateRequestedInfo4, a50Var, i10 | 2);
    }

    public static JSONObject p0() {
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

    public final void A0(boolean z10) {
        String str;
        String str2;
        if (!z10 && this.S.getVisibility() == 0) {
            String text = this.S.getText();
            if (text.length() == 0) {
                org.telegram.ui.Cells.i3 i3Var = this.S;
                try {
                    i3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.shakeViewSpring(i3Var, 2.5f);
                return;
            }
            H0(true, true);
            TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
            confirmpasswordemail.code = text;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new in0(this, 0), 10);
            return;
        }
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z10) {
            this.f38309n.setVisibility(0);
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.flags = 2;
            passwordinputsettings.email = "";
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            str = null;
            str2 = null;
        } else {
            String obj = this.f38300f[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                E0(0);
                return;
            } else if (!obj.equals(this.f38300f[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                E0(1);
                return;
            } else {
                String obj2 = this.f38300f[2].getText().toString();
                if (obj2.length() < 3) {
                    E0(2);
                    return;
                }
                int lastIndexOf = obj2.lastIndexOf(46);
                int lastIndexOf2 = obj2.lastIndexOf(64);
                if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                    updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
                    TL_account.passwordInputSettings passwordinputsettings2 = new TL_account.passwordInputSettings();
                    updatepasswordsettings.new_settings = passwordinputsettings2;
                    int i10 = passwordinputsettings2.flags;
                    passwordinputsettings2.flags = i10 | 1;
                    passwordinputsettings2.hint = "";
                    passwordinputsettings2.new_algo = this.f38288a0.new_algo;
                    passwordinputsettings2.flags = 3 | i10;
                    passwordinputsettings2.email = obj2.trim();
                    str = obj2;
                    str2 = obj;
                } else {
                    E0(2);
                    return;
                }
            }
        }
        H0(true, true);
        Utilities.globalQueue.postRunnable(new ei.s1(this, z10, str, str2, updatepasswordsettings));
    }

    public final void B0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        boolean z11 = true;
        org.telegram.ui.Cells.d9[] d9VarArr = this.Y;
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
            a1.g.A(sb2, ", ", str4, ", ", str5);
            d9VarArr[2].b(R.drawable.msg_payment_address, a1.g.s(sb2, ", ", str6), LocaleController.getString(R.string.PaymentShippingAddress), true);
        }
        org.telegram.ui.Cells.d9 d9Var = d9VarArr[2];
        int i13 = 8;
        if (tL_paymentRequestedInfo.shipping_address != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        d9Var.setVisibility(i10);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            d9VarArr[3].b(R.drawable.msg_contacts, str7, LocaleController.getString(R.string.PaymentCheckoutName), true);
        }
        org.telegram.ui.Cells.d9 d9Var2 = d9VarArr[3];
        if (tL_paymentRequestedInfo.name != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        d9Var2.setVisibility(i11);
        if (tL_paymentRequestedInfo.phone != null) {
            org.telegram.ui.Cells.d9 d9Var3 = d9VarArr[4];
            String b10 = jf.b.c().b(tL_paymentRequestedInfo.phone);
            String string = LocaleController.getString(R.string.PaymentCheckoutPhoneNumber);
            int i14 = R.drawable.msg_calls;
            if (tL_paymentRequestedInfo.email == null && this.G0 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            d9Var3.b(i14, b10, string, z10);
        }
        org.telegram.ui.Cells.d9 d9Var4 = d9VarArr[4];
        if (tL_paymentRequestedInfo.phone != null) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        d9Var4.setVisibility(i12);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            org.telegram.ui.Cells.d9 d9Var5 = d9VarArr[5];
            String string2 = LocaleController.getString(R.string.PaymentCheckoutEmail);
            int i15 = R.drawable.msg_mention;
            if (this.G0 == null) {
                z11 = false;
            }
            d9Var5.b(i15, str8, string2, z11);
        }
        org.telegram.ui.Cells.d9 d9Var6 = d9VarArr[5];
        if (tL_paymentRequestedInfo.email != null) {
            i13 = 0;
        }
        d9Var6.setVisibility(i13);
    }

    public final void C0(TL_account.Password password) {
        boolean z10;
        if (password != null && password.has_password) {
            if (getParentActivity() == null) {
                return;
            }
            t0();
            return;
        }
        this.f38288a0 = password;
        if (password != null && !TextUtils.isEmpty(password.email_unconfirmed_pattern)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38291b0 = z10;
        J0();
    }

    public final void D0(boolean z10) {
        this.P0 = z10;
        this.G = !z10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.P0);
        }
        org.telegram.ui.Cells.d9 d9Var = this.Y[0];
        if (d9Var != null) {
            d9Var.setEnabled(!this.P0);
        }
    }

    public final void E0(int i10) {
        EditTextBoldCursor editTextBoldCursor = this.f38300f[i10];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(editTextBoldCursor, 2.5f);
    }

    public final void F0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        c2Var.R = str;
        c2Var.T = str2;
        showDialog(c2Var);
    }

    public final void G0(Runnable runnable) {
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.g6) null, false);
        h3Var.fixNavigationBar();
        h3Var.title = LocaleController.getString(R.string.PaymentCheckoutMethod);
        h3Var.bigTitle = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.f38326y0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
        } else {
            String str = this.f38324x0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_paymentSavedCredentialsCard> arrayList4 = this.C0.saved_credentials;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i10);
            i10++;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard3 = tL_paymentSavedCredentialsCard2;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.f38326y0;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.f20472id, tL_paymentSavedCredentialsCard4.f20472id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
                arrayList3.add(tL_paymentSavedCredentialsCard3);
            }
        }
        ArrayList<TLRPC.TL_paymentFormMethod> arrayList5 = this.C0.additional_methods;
        int size2 = arrayList5.size();
        int i11 = 0;
        while (i11 < size2) {
            TLRPC.TL_paymentFormMethod tL_paymentFormMethod = arrayList5.get(i11);
            i11++;
            arrayList.add(tL_paymentFormMethod.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_provider));
        }
        arrayList.add(LocaleController.getString(R.string.PaymentCheckoutMethodNewCard));
        arrayList2.add(Integer.valueOf(R.drawable.msg_addbot));
        int[] iArr = new int[arrayList2.size()];
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        org.telegram.ui.Components.a3 a3Var = new org.telegram.ui.Components.a3(this, runnable, arrayList3, arrayList, 1);
        h3Var.items = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        h3Var.itemIcons = iArr;
        h3Var.onClickListener = a3Var;
        showDialog(h3Var);
    }

    public final void H0(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10 && this.f38309n != null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.v = animatorSet2;
            if (z11) {
                this.f38314r.setVisibility(0);
                this.f38309n.setEnabled(false);
                AnimatorSet animatorSet3 = this.v;
                View contentView = this.f38309n.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, property, 0.1f);
                View contentView2 = this.f38309n.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, property2, 0.1f);
                View contentView3 = this.f38309n.getContentView();
                Property property3 = View.ALPHA;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, property3, 0.0f), ObjectAnimator.ofFloat(this.f38314r, property, 1.0f), ObjectAnimator.ofFloat(this.f38314r, property2, 1.0f), ObjectAnimator.ofFloat(this.f38314r, property3, 1.0f));
            } else if (this.f38321w != null) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f38314r, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.f38314r, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.f38314r, View.ALPHA, 0.0f));
            } else {
                this.f38309n.getContentView().setVisibility(0);
                this.f38309n.setEnabled(true);
                AnimatorSet animatorSet4 = this.v;
                org.telegram.ui.Components.cr crVar = this.f38314r;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(crVar, property4, 0.1f);
                org.telegram.ui.Components.cr crVar2 = this.f38314r;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(crVar2, property5, 0.1f);
                org.telegram.ui.Components.cr crVar3 = this.f38314r;
                Property property6 = View.ALPHA;
                animatorSet4.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(crVar3, property6, 0.0f));
                if (!isFinishing()) {
                    this.v.playTogether(ObjectAnimator.ofFloat(this.f38309n.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.f38309n.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.f38309n.getContentView(), property6, 1.0f));
                }
            }
            this.v.addListener(new zn0(this, z11, 0));
            this.v.setDuration(150L);
            this.v.start();
        } else if (this.U != null) {
            this.v = new AnimatorSet();
            if (z11) {
                this.f38316s.setVisibility(0);
                this.W.setEnabled(false);
                AnimatorSet animatorSet5 = this.v;
                TextView textView = this.U;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, property7, 0.1f);
                TextView textView2 = this.U;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, property8, 0.1f);
                TextView textView3 = this.U;
                Property property9 = View.ALPHA;
                animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, property9, 0.0f), ObjectAnimator.ofFloat(this.f38316s, property7, 1.0f), ObjectAnimator.ofFloat(this.f38316s, property8, 1.0f), ObjectAnimator.ofFloat(this.f38316s, property9, 1.0f));
            } else {
                this.U.setVisibility(0);
                this.W.setEnabled(true);
                AnimatorSet animatorSet6 = this.v;
                org.telegram.ui.Components.cr crVar4 = this.f38316s;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(crVar4, property10, 0.1f);
                org.telegram.ui.Components.cr crVar5 = this.f38316s;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(crVar5, property11, 0.1f);
                org.telegram.ui.Components.cr crVar6 = this.f38316s;
                Property property12 = View.ALPHA;
                animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(crVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.U, property10, 1.0f), ObjectAnimator.ofFloat(this.U, property11, 1.0f), ObjectAnimator.ofFloat(this.U, property12, 1.0f));
            }
            this.v.addListener(new zn0(this, z11, 1));
            this.v.setDuration(150L);
            this.v.start();
        }
    }

    public final void I0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.PaymentTransactionReview);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        c2Var.R = string;
        c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("PaymentTransactionMessage2", R.string.PaymentTransactionMessage2, str, this.f38312p0, this.f38313q0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new gn0(this, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var);
    }

    public final void J0() {
        if (this.f38319u0 == 6) {
            org.telegram.ui.Cells.e9[] e9VarArr = this.M;
            if (e9VarArr[2] != null) {
                int i10 = 0;
                this.f38309n.setVisibility(0);
                TL_account.Password password = this.f38288a0;
                ArrayList arrayList = this.J;
                org.telegram.ui.Cells.l4[] l4VarArr = this.I;
                org.telegram.ui.Cells.ca[] caVarArr = this.N;
                if (password == null) {
                    H0(true, true);
                    e9VarArr[2].setVisibility(8);
                    caVarArr[0].setVisibility(8);
                    caVarArr[1].setVisibility(8);
                    this.S.setVisibility(8);
                    l4VarArr[0].setVisibility(8);
                    l4VarArr[1].setVisibility(8);
                    e9VarArr[0].setVisibility(8);
                    for (int i11 = 0; i11 < 3; i11++) {
                        ((View) this.f38300f[i11].getParent()).setVisibility(8);
                    }
                    while (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setVisibility(8);
                        i10++;
                    }
                    return;
                }
                H0(true, false);
                if (this.f38291b0) {
                    org.telegram.ui.Cells.e9 e9Var = e9VarArr[2];
                    int i12 = R.string.EmailPasswordConfirmText2;
                    String str = this.f38288a0.email_unconfirmed_pattern;
                    if (str == null) {
                        str = "";
                    }
                    e9Var.setText(LocaleController.formatString("EmailPasswordConfirmText2", i12, str));
                    e9VarArr[2].setVisibility(0);
                    caVarArr[0].setVisibility(0);
                    caVarArr[1].setVisibility(0);
                    this.S.setVisibility(0);
                    e9VarArr[1].setText("");
                    l4VarArr[0].setVisibility(8);
                    l4VarArr[1].setVisibility(8);
                    e9VarArr[0].setVisibility(8);
                    for (int i13 = 0; i13 < 3; i13++) {
                        ((View) this.f38300f[i13].getParent()).setVisibility(8);
                    }
                    while (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setVisibility(8);
                        i10++;
                    }
                    return;
                }
                e9VarArr[2].setVisibility(8);
                caVarArr[0].setVisibility(8);
                caVarArr[1].setVisibility(8);
                e9VarArr[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                this.S.setVisibility(8);
                l4VarArr[0].setVisibility(0);
                l4VarArr[1].setVisibility(0);
                e9VarArr[0].setVisibility(0);
                for (int i14 = 0; i14 < 3; i14++) {
                    ((View) this.f38300f[i14].getParent()).setVisibility(0);
                }
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((View) arrayList.get(i15)).setVisibility(0);
                }
            }
        }
    }

    public final void K0() {
        org.telegram.ui.Cells.e9[] e9VarArr = this.M;
        if (e9VarArr[0] != null) {
            org.telegram.ui.Cells.b7[] b7VarArr = this.K;
            if (b7VarArr[2] != null) {
                TLRPC.PaymentForm paymentForm = this.C0;
                if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.f38321w != null && this.f38327z0)) {
                    this.L.setVisibility(8);
                    e9VarArr[0].setVisibility(8);
                    org.telegram.ui.Cells.b7 b7Var = b7VarArr[2];
                    org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21145b7, b7Var.getContext(), b7Var, null);
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine1));
                if (this.C0.password_missing) {
                    w0();
                    spannableStringBuilder.append((CharSequence) "\n");
                    int length = spannableStringBuilder.length();
                    String string = LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine2);
                    int indexOf = string.indexOf(42);
                    int lastIndexOf = string.lastIndexOf(42);
                    spannableStringBuilder.append((CharSequence) string);
                    if (indexOf != -1 && lastIndexOf != -1) {
                        int i10 = indexOf + length;
                        int i11 = lastIndexOf + length;
                        e9VarArr[0].getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(i11, i11 + 1, (CharSequence) "");
                        spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new fo0(this), i10, i11 - 1, 33);
                    }
                }
                this.L.setEnabled(true);
                e9VarArr[0].setText(spannableStringBuilder);
                this.L.setVisibility(0);
                e9VarArr[0].setVisibility(0);
                org.telegram.ui.Cells.b7 b7Var2 = b7VarArr[2];
                org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21145b7, b7Var2.getContext(), b7Var2, null);
            }
        }
    }

    public final void L0() {
        this.R0[0] = s0(this.f38318t0);
        this.R.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.R0[0], true);
        TextView textView = this.U;
        if (textView != null) {
            textView.setText(LocaleController.formatString("PaymentCheckoutPay", R.string.PaymentCheckoutPay, this.R0[0]));
        }
        if (this.f38317s0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21211ei);
            int childCount = this.f38317s0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                TextView textView2 = (TextView) this.f38317s0.getChildAt(i10);
                if (textView2.getTag().equals(this.H0)) {
                    org.telegram.ui.ActionBar.k6.z1(themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21228fi, this.Y0);
                } else {
                    org.telegram.ui.ActionBar.k6.z1(536870911 & themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.Z8, this.Y0);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21256h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21237g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.io0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.twoStepPasswordChanged) {
            TLRPC.PaymentForm paymentForm = this.C0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            K0();
        } else if (i10 == NotificationCenter.didRemoveTwoStepPassword) {
            TLRPC.PaymentForm paymentForm2 = this.C0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            K0();
        } else if (i10 == NotificationCenter.paymentFinished) {
            this.f38289a1 = true;
            removeSelfFromStack();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.Y0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.E, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21462s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        if (this.f38300f != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f38300f;
                if (i10 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) editTextBoldCursorArr[i10].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21183d6));
                i10++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
        }
        if (this.h != null) {
            for (int i11 = 0; i11 < this.h.length; i11++) {
            }
        }
        int i12 = 0;
        while (true) {
            org.telegram.ui.Cells.l4[] l4VarArr = this.I;
            if (i12 >= l4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(l4VarArr[i12], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21183d6));
            i12++;
        }
        for (int i13 = 0; i13 < this.K.length; i13++) {
        }
        for (int i14 = 0; i14 < this.M.length; i14++) {
        }
        int i15 = 0;
        while (true) {
            ArrayList arrayList2 = this.J;
            if (i15 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) arrayList2.get(i15), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21183d6));
            i15++;
        }
        int i16 = 1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        for (int i17 = 0; i17 < this.N.length; i17++) {
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.U, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21460s6));
        while (true) {
            org.telegram.ui.Cells.d9[] d9VarArr = this.Y;
            if (i16 < d9VarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(d9VarArr[i16], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21183d6));
                i16++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.W, 268435456, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21183d6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.W, 268435456, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21272i6));
                return arrayList;
            }
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.G;
    }

    public final void n0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.k6.M0(true);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.f21183d6);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.f21272i6);
        frameLayout.setBackground(M0);
        org.telegram.ui.ActionBar.r6.k(frameLayout, M0, O, O2, null);
        this.O.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        frameLayout2.setClickable(true);
        this.P.setFocusable(true);
        this.P.setBackgroundResource(R.drawable.googlepay_button_no_shadow_background);
        if (this.K0 == null) {
            this.P.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f));
        } else {
            this.P.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        }
        this.O.addView(this.P, w7.z5.c(48.0f, -1));
        this.P.setOnClickListener(new cn0(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.P.addView(linearLayout, w7.z5.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, w7.z5.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.P.addView(imageView2, w7.z5.c(-1.0f, -1));
    }

    public final void o0(String str) {
        boolean z10;
        boolean z11;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
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
                    str = jf.b.d(telephonyManager.getLine1Number(), false);
                }
                if (!TextUtils.isEmpty(str)) {
                    int i10 = 4;
                    String str2 = null;
                    if (str.length() > 4) {
                        while (true) {
                            if (i10 >= 1) {
                                String substring = str.substring(0, i10);
                                if (((String) this.f38293c.get(substring)) != null) {
                                    str2 = str.substring(i10);
                                    this.f38300f[8].setText(substring);
                                    z11 = true;
                                    break;
                                }
                                i10--;
                            } else {
                                z11 = false;
                                break;
                            }
                        }
                        if (!z11) {
                            str2 = str.substring(1);
                            this.f38300f[8].setText(str.substring(0, 1));
                        }
                    }
                    if (str2 != null) {
                        this.f38300f[9].setText(str2);
                        EditTextBoldCursor editTextBoldCursor = this.f38300f[9];
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 == 991) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c41(this, i11, intent, 7));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        WebView webView = this.f38321w;
        if (webView != null && this.f38325y) {
            if (z10) {
                webView.loadUrl(this.f38323x);
                this.f38325y = false;
            }
            return false;
        }
        return !this.P0;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.f38319u0 == 4 && this.X0) {
            this.X0 = false;
            this.W.callOnClick();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.f38319u0 != 4 || this.V0) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.paymentFinished);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.io0.onFragmentDestroy():void");
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        try {
            int i10 = this.f38319u0;
            if ((i10 == 2 || i10 == 6) && !this.C0.invoice.test) {
                getParentActivity().getWindow().setFlags(8192, 8192);
                AndroidUtilities.logFlagSecure();
                return;
            }
            if (SharedConfig.passcodeHash.length() != 0 && !SharedConfig.allowScreenCapture) {
                return;
            }
            getParentActivity().getWindow().clearFlags(8192);
            AndroidUtilities.logFlagSecure();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            ScrollView scrollView = this.E;
            if (scrollView != null) {
                AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, getThemedColor(org.telegram.ui.ActionBar.k6.f21462s8));
            }
            if (this.f38300f != null) {
                getThemedColor(org.telegram.ui.ActionBar.k6.G6);
                int i10 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.f38300f;
                    if (i10 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                        if (editTextBoldCursor != null) {
                            org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, this.Y0);
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11) {
            WebView webView = this.f38321w;
            if (webView != null) {
                if (this.f38319u0 != 4) {
                    TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.F0;
                    if (tL_paymentFormMethod != null) {
                        String str = tL_paymentFormMethod.url;
                        this.f38323x = str;
                        webView.loadUrl(str);
                        return;
                    }
                    String str2 = this.C0.url;
                    this.f38323x = str2;
                    webView.loadUrl(str2);
                    return;
                }
                return;
            }
            int i10 = this.f38319u0;
            if (i10 == 2) {
                AndroidUtilities.runOnUIThread(new fn0(this, 0), 100L);
            } else if (i10 == 3) {
                this.f38300f[1].requestFocus();
                AndroidUtilities.showKeyboard(this.f38300f[1]);
            } else if (i10 == 4) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f38300f;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                }
            } else if (i10 == 6 && !this.f38291b0) {
                this.f38300f[0].requestFocus();
                AndroidUtilities.showKeyboard(this.f38300f[0]);
            }
        }
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        y0(o2Var);
        return super.presentFragment(o2Var);
    }

    public final long q0() {
        TLRPC.InputInvoice inputInvoice = this.f38292b1;
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

    public final long r0() {
        TLRPC.InputPeer inputPeer;
        TLRPC.InputInvoice inputInvoice = this.f38292b1;
        if (inputInvoice instanceof TLRPC.TL_inputInvoiceStars) {
            TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose;
            if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
                TLRPC.InputUser inputUser = ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).user_id;
                if (inputUser != null) {
                    return inputUser.user_id;
                }
                return 0L;
            } else if ((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) && (inputPeer = ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).boost_peer) != null) {
                return DialogObject.getPeerDialogId(inputPeer);
            } else {
                return 0L;
            }
        }
        return 0L;
    }

    public final String s0(ArrayList arrayList) {
        long j10 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i10)).amount;
        }
        Long l4 = this.H0;
        if (l4 != null) {
            j10 += l4.longValue();
        }
        return LocaleController.getInstance().formatCurrencyString(j10, this.C0.invoice.currency);
    }

    public final void t0() {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13 = this.f38319u0;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 == 6) {
                                if (!this.T.c(this.f38322w0, this.f38324x0, this.U0, this.J0, this.f38326y0)) {
                                    io0 io0Var = new io0(this.f38292b1, this.C0, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.f38322w0, this.f38324x0, this.I0, this.U0, this.J0, this.f38315r0, false);
                                    io0Var.f38295c1 = this.f38295c1;
                                    io0Var.f38297d1 = this.f38297d1;
                                    presentFragment(io0Var, true);
                                    return;
                                }
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        if (this.V0) {
                            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
                        }
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.paymentFinished, new Object[0]);
                        if (getMessagesController().newMessageCallback == null) {
                            if (!x0(getParentLayout(), getParentActivity()) && !isFinishing()) {
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new fn0(this, 2), 500L);
                        return;
                    }
                    if (this.f38320v0) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    io0 io0Var2 = new io0(this.f38292b1, this.C0, this.N0, this.O0, i12, this.E0, this.G0, this.H0, this.f38322w0, this.f38324x0, this.I0, this.U0, this.J0, this.f38315r0, this.W0);
                    io0Var2.f38295c1 = this.f38295c1;
                    io0Var2.f38297d1 = this.f38297d1;
                    presentFragment(io0Var2, true);
                    return;
                }
                TLRPC.PaymentForm paymentForm = this.C0;
                if (paymentForm.password_missing && (z10 = this.U0)) {
                    io0 io0Var3 = new io0(this.f38292b1, paymentForm, this.N0, this.O0, 6, this.E0, this.G0, this.H0, this.f38322w0, this.f38324x0, this.I0, z10, this.J0, this.f38315r0, this.W0);
                    this.f38301f0 = io0Var3;
                    io0Var3.f38295c1 = this.f38295c1;
                    io0Var3.f38297d1 = this.f38297d1;
                    io0Var3.C0(this.f38288a0);
                    io0 io0Var4 = this.f38301f0;
                    io0Var4.T = new wn0(this);
                    presentFragment(io0Var4, this.S0);
                    return;
                }
                go0 go0Var = this.T;
                if (go0Var != null) {
                    go0Var.c(this.f38322w0, this.f38324x0, this.U0, this.J0, null);
                    finishFragment();
                    return;
                }
                io0 io0Var5 = new io0(this.f38292b1, paymentForm, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.f38322w0, this.f38324x0, this.I0, this.U0, this.J0, this.f38315r0, this.W0);
                io0Var5.f38295c1 = this.f38295c1;
                io0Var5.f38297d1 = this.f38297d1;
                presentFragment(io0Var5, this.S0);
                return;
            }
            if (this.f38322w0 == null && this.f38324x0 == null) {
                if (this.f38326y0 != null) {
                    if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                        UserConfig.getInstance(this.currentAccount).saveConfig(false);
                    }
                    if (UserConfig.getInstance(this.currentAccount).tmpPassword == null) {
                        i11 = 3;
                    }
                } else {
                    i11 = 2;
                }
                if (i11 != 2 && this.f38324x0 == null && this.f38326y0 == null && this.f38322w0 == null && !this.C0.additional_methods.isEmpty()) {
                    G0(new fn0(this, 1));
                    return;
                }
                io0 io0Var6 = new io0(this.f38292b1, this.C0, this.N0, this.O0, i11, this.E0, this.G0, this.H0, this.f38322w0, this.f38324x0, this.I0, this.U0, this.J0, this.f38315r0, this.W0);
                io0Var6.f38295c1 = this.f38295c1;
                io0Var6.f38297d1 = this.f38297d1;
                presentFragment(io0Var6, this.S0);
                return;
            }
            i11 = 4;
            if (i11 != 2) {
            }
            io0 io0Var62 = new io0(this.f38292b1, this.C0, this.N0, this.O0, i11, this.E0, this.G0, this.H0, this.f38322w0, this.f38324x0, this.I0, this.U0, this.J0, this.f38315r0, this.W0);
            io0Var62.f38295c1 = this.f38295c1;
            io0Var62.f38297d1 = this.f38297d1;
            presentFragment(io0Var62, this.S0);
            return;
        }
        go0 go0Var2 = this.T;
        if (go0Var2 != null) {
            go0Var2.d(this.I0);
            finishFragment();
            return;
        }
        if (this.C0.invoice.flexible) {
            i10 = 1;
        } else if (this.f38326y0 == null && this.f38322w0 == null) {
            i10 = 2;
        } else {
            if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                UserConfig.getInstance(this.currentAccount).saveConfig(false);
            }
            if (UserConfig.getInstance(this.currentAccount).tmpPassword != null) {
                i10 = 4;
            } else {
                i10 = 3;
            }
        }
        if (i10 == 2 && this.f38326y0 == null && this.f38322w0 == null && !this.C0.additional_methods.isEmpty()) {
            G0(new fn0(this, 1));
            return;
        }
        io0 io0Var7 = new io0(this.f38292b1, this.C0, this.N0, this.O0, i10, this.E0, null, null, this.f38322w0, this.f38324x0, this.I0, this.U0, this.J0, this.f38315r0, this.W0);
        io0Var7.f38295c1 = this.f38295c1;
        io0Var7.f38297d1 = this.f38297d1;
        presentFragment(io0Var7, this.S0);
    }

    public final void u0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l4, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.o2 o2Var, boolean z11) {
        if (o2Var != null) {
            this.currentAccount = o2Var.getCurrentAccount();
        }
        this.f38319u0 = i10;
        this.f38315r0 = o2Var;
        this.f38322w0 = str2;
        this.J0 = tL_inputPaymentCredentialsGooglePay;
        this.E0 = tL_payments_validatedRequestedInfo;
        this.C0 = paymentForm;
        this.G0 = tL_shippingOption;
        this.H0 = l4;
        this.N0 = messageObject;
        this.O0 = str;
        this.f38292b1 = inputInvoice;
        this.U0 = z10;
        this.W0 = z11;
        this.S0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.C0.native_provider)) ? false : true;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentForm.bot_id));
        this.f38308l0 = user;
        if (user != null) {
            this.f38312p0 = user.first_name;
        } else {
            this.f38312p0 = "";
        }
        this.f38313q0 = paymentForm.title;
        this.I0 = tL_payments_validateRequestedInfo;
        this.T0 = true;
        if (!z10 && this.f38319u0 != 4) {
            this.U0 = !this.C0.saved_credentials.isEmpty();
        } else {
            this.U0 = z10;
        }
        if (str3 == null) {
            if (this.C0.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.C0.saved_credentials.get(0);
            this.f38326y0 = tL_paymentSavedCredentialsCard;
            this.f38324x0 = tL_paymentSavedCredentialsCard.title;
            return;
        }
        this.f38324x0 = str3;
    }

    public final void v0(Context context) {
        int i10;
        Optional empty;
        if (getParentActivity() != null) {
            com.google.android.gms.internal.cast.a aVar = new com.google.android.gms.internal.cast.a();
            if (this.C0.invoice.test) {
                i10 = 3;
            } else {
                i10 = 1;
            }
            if (i10 != 2 && i10 != 1 && i10 != 3) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(i2.o1.k(i10, "Invalid environment value "));
            }
            aVar.f6575a = i10;
            this.e = new com.google.android.gms.common.api.j(context, v8.p.f48745a, new v8.o(aVar), com.google.android.gms.common.api.i.f6368c);
            try {
                JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                put.put("allowedPaymentMethods", new JSONArray().put(p0()));
                empty = Optional.of(put);
            } catch (JSONException unused) {
                empty = Optional.empty();
            }
            if (!empty.isPresent()) {
                return;
            }
            String jSONObject = ((JSONObject) empty.get()).toString();
            ?? obj = new Object();
            n6.l.i(jSONObject, "isReadyToPayRequestJson cannot be null!");
            obj.f48709f = jSONObject;
            com.google.android.gms.internal.clearcut.v0 v0Var = this.e;
            v0Var.getClass();
            com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
            b10.f6507a = 23705;
            b10.f6509c = new le.b((Object) obj, 26);
            v0Var.e(0, b10.a()).addOnCompleteListener(getParentActivity(), new gn0(this, 0));
        }
    }

    public final void w0() {
        if (this.f38298e0) {
            return;
        }
        this.f38298e0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new in0(this, 1), 10);
    }

    public final boolean x0(org.telegram.ui.ActionBar.h5 h5Var, Activity activity) {
        int i10 = 0;
        if (this.f38292b1 != null) {
            if (h5Var != null) {
                ArrayList arrayList = new ArrayList(h5Var.getFragmentStack());
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                    if (o2Var instanceof io0) {
                        o2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.f38308l0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().premiumBotUsername) && this.O0 == null) || (this.O0 != null && getMessagesController().premiumInvoiceSlug != null && Objects.equals(this.O0, getMessagesController().premiumInvoiceSlug))) && h5Var != null) {
            ArrayList arrayList2 = new ArrayList(h5Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                if ((o2Var2 instanceof sn) || (o2Var2 instanceof PremiumPreviewFragment)) {
                    o2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.f33818p0 = true;
            ((ActionBarLayout) h5Var).R(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).f33501x0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void y0(org.telegram.ui.ActionBar.o2 o2Var) {
        AndroidUtilities.hideKeyboard(this.fragmentView);
        if (o2Var instanceof io0) {
            io0 io0Var = (io0) o2Var;
            io0Var.Z0 = this.Z0;
            io0Var.Y0 = this.Y0;
            io0Var.X0 = this.X0;
            io0Var.f38326y0 = this.f38326y0;
        }
    }

    public final void z0() {
        long j10;
        String str;
        if (this.Q0) {
            return;
        }
        int i10 = 0;
        H0(false, true);
        TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.f38292b1;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.N0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(this.N0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = this.N0.getId();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.O0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.C0.form_id;
        if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && this.f38326y0 != null) {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.f20361id = this.f38326y0.f20472id;
            tL_inputPaymentCredentialsSaved.tmp_password = UserConfig.getInstance(this.currentAccount).tmpPassword.tmp_password;
        } else {
            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = this.J0;
            if (tL_inputPaymentCredentialsGooglePay != null) {
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsGooglePay;
            } else {
                TLRPC.TL_inputPaymentCredentials tL_inputPaymentCredentials = new TLRPC.TL_inputPaymentCredentials();
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentials;
                tL_inputPaymentCredentials.save = this.U0;
                tL_inputPaymentCredentials.data = new TLRPC.TL_dataJSON();
                tL_payments_sendPaymentForm.credentials.data.data = this.f38322w0;
            }
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.E0;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.f20473id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags = 1 | tL_payments_sendPaymentForm.flags;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.G0;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.f20479id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        if ((this.C0.invoice.flags & 256) != 0) {
            Long l4 = this.H0;
            if (l4 != null) {
                j10 = l4.longValue();
            } else {
                j10 = 0;
            }
            tL_payments_sendPaymentForm.tip_amount = j10;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        a50 a50Var = new a50(17, this, tL_payments_sendPaymentForm);
        if (this.W0) {
            i10 = 8;
        }
        connectionsManager.sendRequest(tL_payments_sendPaymentForm, a50Var, i10 | 2);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        y0(o2Var);
        return super.presentFragment(o2Var, z10);
    }

    public io0(TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, org.telegram.ui.ActionBar.o2 o2Var) {
        super(null);
        this.f38287a = new ArrayList();
        this.f38290b = new HashMap();
        this.f38293c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.l4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.b7[3];
        this.M = new org.telegram.ui.Cells.e9[3];
        this.N = new org.telegram.ui.Cells.ca[2];
        this.Y = new org.telegram.ui.Cells.d9[7];
        this.Z = -4.5f;
        this.f38294c0 = 6;
        this.V0 = true;
        u0(null, paymentForm, messageObject, str, 4, null, null, null, null, null, null, false, null, o2Var, false);
    }

    public io0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.f38287a = new ArrayList();
        this.f38290b = new HashMap();
        this.f38293c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.l4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.b7[3];
        this.M = new org.telegram.ui.Cells.e9[3];
        this.N = new org.telegram.ui.Cells.ca[2];
        this.Y = new org.telegram.ui.Cells.d9[7];
        this.Z = -4.5f;
        this.f38294c0 = 6;
        this.f38319u0 = 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.C0 = paymentForm;
        this.D0 = paymentReceipt;
        paymentForm.bot_id = paymentReceipt.bot_id;
        paymentForm.invoice = paymentReceipt.invoice;
        paymentForm.provider_id = paymentReceipt.provider_id;
        paymentForm.users = paymentReceipt.users;
        this.G0 = paymentReceipt.shipping;
        long j10 = paymentReceipt.tip_amount;
        if (j10 != 0) {
            this.H0 = Long.valueOf(j10);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentReceipt.bot_id));
        this.f38308l0 = user;
        if (user != null) {
            this.f38312p0 = user.first_name;
        } else {
            this.f38312p0 = "";
        }
        this.f38313q0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.I0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.N0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(paymentReceipt.bot_id);
                this.I0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.O0;
                this.I0.invoice = tL_inputInvoiceSlug;
            }
            this.I0.info = paymentReceipt.info;
        }
        this.f38324x0 = paymentReceipt.credentials_title;
    }

    public io0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.o2 o2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, o2Var, false);
        this.V0 = true;
    }
}
