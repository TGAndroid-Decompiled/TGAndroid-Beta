package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
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
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
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
public final class lo0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static final List f38705d1 = Arrays.asList("http", "https");
    public static final List f38706e1 = Collections.singletonList("tg");
    public final TLRPC.PaymentReceipt A0;
    public ScrollView B;
    public TLRPC.TL_payments_validatedRequestedInfo B0;
    public boolean C;
    public TLRPC.TL_paymentFormMethod C0;
    public boolean D;
    public TLRPC.TL_shippingOption D0;
    public TextView E;
    public Long E0;
    public final org.telegram.ui.Cells.m4[] F;
    public TLRPC.TL_payments_validateRequestedInfo F0;
    public final ArrayList G;
    public TLRPC.TL_inputPaymentCredentialsGooglePay G0;
    public final org.telegram.ui.Cells.z6[] H;
    public String H0;
    public org.telegram.ui.Cells.s8 I;
    public String I0;
    public final org.telegram.ui.Cells.a9[] J;
    public JSONObject J0;
    public final org.telegram.ui.Cells.aa[] K;
    public MessageObject K0;
    public FrameLayout L;
    public String L0;
    public FrameLayout M;
    public boolean M0;
    public LinearLayout N;
    public boolean N0;
    public org.telegram.ui.Cells.b9 O;
    public String[] O0;
    public org.telegram.ui.Cells.j3 P;
    public boolean P0;
    public jo0 Q;
    public boolean Q0;
    public TextView R;
    public boolean R0;
    public org.telegram.ui.Cells.o6 S;
    public boolean S0;
    public ho0 T;
    public boolean T0;
    public org.telegram.ui.Cells.l5 U;
    public boolean U0;
    public final org.telegram.ui.Cells.z8[] V;
    public org.telegram.ui.ActionBar.g6 V0;
    public float W;
    public ko0 W0;
    public TL_account.Password X;
    public boolean X0;
    public boolean Y;
    public TLRPC.InputInvoice Y0;
    public int Z;
    public Utilities.Callback Z0;
    public final ArrayList f38707a;
    public kn0 f38708a0;
    public Utilities.Callback f38709a1;
    public final HashMap f38710b;
    public boolean f38711b0;
    public i20 f38712b1;
    public final HashMap f38713c;
    public lo0 f38714c0;
    public int f38715c1;
    public final HashMap d;
    public boolean f38716d0;
    public a8.e f38717e;
    public boolean f38718e0;
    public EditTextBoldCursor[] f38719f;
    public boolean f38720f0;
    public String f38721g0;
    public org.telegram.ui.Cells.j6[] h;
    public boolean f38722h0;
    public TLRPC.User f38723i0;
    public boolean f38724j0;
    public boolean f38725k0;
    public boolean f38726l0;
    public String m0;
    public org.telegram.ui.ActionBar.w0 f38727n;
    public String f38728n0;
    public org.telegram.ui.ActionBar.p2 f38729o0;
    public pn0 f38730p0;
    public ArrayList f38731q0;
    public org.telegram.ui.Components.tq f38732r;
    public int f38733r0;
    public org.telegram.ui.Components.tq f38734s;
    public boolean f38735s0;
    public String f38736t0;
    public String f38737u0;
    public AnimatorSet v;
    public TLRPC.TL_paymentSavedCredentialsCard f38738v0;
    public WebView f38739w;
    public boolean f38740w0;
    public String f38741x;
    public tt f38742x0;
    public boolean f38743y;
    public String f38744y0;
    public TLRPC.PaymentForm f38745z0;

    public lo0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z4, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.p2 p2Var, boolean z10) {
        super(null);
        this.f38707a = new ArrayList();
        this.f38710b = new HashMap();
        this.f38713c = new HashMap();
        this.d = new HashMap();
        this.D = true;
        this.F = new org.telegram.ui.Cells.m4[3];
        this.G = new ArrayList();
        this.H = new org.telegram.ui.Cells.z6[3];
        this.J = new org.telegram.ui.Cells.a9[3];
        this.K = new org.telegram.ui.Cells.aa[2];
        this.V = new org.telegram.ui.Cells.z8[7];
        this.W = -4.5f;
        this.Z = 6;
        u0(inputInvoice, paymentForm, messageObject, str, i10, tL_payments_validatedRequestedInfo, tL_shippingOption, l10, str2, str3, tL_payments_validateRequestedInfo, z4, tL_inputPaymentCredentialsGooglePay, p2Var, z10);
    }

    public static void U(lo0 lo0Var, TL_account.Password password, byte[] bArr) {
        byte[] bArr2;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        tb0 tb0Var = new tb0(11, lo0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            gettmppassword.password = startCheck;
            if (startCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                tb0Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(lo0Var.currentAccount).sendRequest(gettmppassword, tb0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        tb0Var.run(null, tL_error2);
    }

    public static void V(lo0 lo0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        lo0Var.D0(false);
        lo0Var.H0(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            char c3 = 65535;
            switch (str.hashCode()) {
                case -2092780146:
                    if (str.equals("ADDRESS_CITY_INVALID")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -1623547228:
                    if (str.equals("ADDRESS_STREET_LINE1_INVALID")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case -1224177757:
                    if (str.equals("ADDRESS_COUNTRY_INVALID")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case -1031752045:
                    if (str.equals("REQ_INFO_NAME_INVALID")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case -274035920:
                    if (str.equals("ADDRESS_POSTCODE_INVALID")) {
                        c3 = 4;
                        break;
                    }
                    break;
                case 417441502:
                    if (str.equals("ADDRESS_STATE_INVALID")) {
                        c3 = 5;
                        break;
                    }
                    break;
                case 708423542:
                    if (str.equals("REQ_INFO_PHONE_INVALID")) {
                        c3 = 6;
                        break;
                    }
                    break;
                case 863965605:
                    if (str.equals("ADDRESS_STREET_LINE2_INVALID")) {
                        c3 = 7;
                        break;
                    }
                    break;
                case 889106340:
                    if (str.equals("REQ_INFO_EMAIL_INVALID")) {
                        c3 = '\b';
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    lo0Var.E0(2);
                    return;
                case 1:
                    lo0Var.E0(0);
                    return;
                case 2:
                    lo0Var.E0(4);
                    return;
                case 3:
                    lo0Var.E0(6);
                    return;
                case 4:
                    lo0Var.E0(5);
                    return;
                case 5:
                    lo0Var.E0(3);
                    return;
                case 6:
                    lo0Var.E0(9);
                    return;
                case 7:
                    lo0Var.E0(1);
                    return;
                case '\b':
                    lo0Var.E0(7);
                    return;
                default:
                    org.telegram.ui.Components.z4.f0(lo0Var.currentAccount, tL_error, lo0Var, tLObject, new Object[0]);
                    return;
            }
        }
    }

    public static void W(lo0 lo0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        int i10;
        lo0Var.B0 = tL_payments_validatedRequestedInfo;
        if (lo0Var.f38745z0.saved_info != null && !lo0Var.Q0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(lo0Var.currentAccount);
            oh.p5 p5Var = new oh.p5(16);
            if (lo0Var.T0) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            connectionsManager.sendRequest(tL_payments_clearSavedInfo, p5Var, i10);
        }
        lo0Var.t0();
        lo0Var.D0(false);
        lo0Var.H0(true, false);
    }

    public static void X(lo0 lo0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        lo0Var.D0(false);
        lo0Var.H0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.z4.f0(lo0Var.currentAccount, tL_error, lo0Var, tLObject, new Object[0]);
        }
    }

    public static void Y(lo0 lo0Var, org.telegram.ui.Components.ic icVar, boolean z4, TLRPC.Message message) {
        icVar.b();
        if (z4) {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(xn.Q9(message.f20866id, MessageObject.getDialogId(message)));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = message.f20866id;
        tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(lo0Var.currentAccount).getInputPeer(message.peer_id);
        ConnectionsManager.getInstance(lo0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new nn0(lo0Var, 3), 2);
    }

    public static void Z(lo0 lo0Var) {
        int i10;
        TL_account.resendPasswordEmail resendpasswordemail = new TL_account.resendPasswordEmail();
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(lo0Var.currentAccount);
        oh.p5 p5Var = new oh.p5(16);
        if (lo0Var.T0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        connectionsManager.sendRequest(resendpasswordemail, p5Var, i10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lo0Var.getParentActivity());
        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        lo0Var.showDialog(alertDialog$Builder.f21168a);
    }

    public static void a0(lo0 lo0Var, boolean z4, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        mh.k7 k7Var = new mh.k7(lo0Var, z4, str, 6);
        if (!z4) {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str2);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = lo0Var.X.new_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                updatepasswordsettings.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                if (updatepasswordsettings.new_settings.new_password_hash == null) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "ALGO_INVALID";
                    k7Var.run(null, tL_error);
                }
                ConnectionsManager.getInstance(lo0Var.currentAccount).sendRequest(updatepasswordsettings, k7Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            k7Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(lo0Var.currentAccount).sendRequest(updatepasswordsettings, k7Var, 10);
    }

    public static void b0(lo0 lo0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.z4.f0(lo0Var.currentAccount, tL_error, lo0Var, tL_payments_sendPaymentForm, new Object[0]);
        lo0Var.D0(false);
        lo0Var.H0(false, false);
        lo0Var.X0 = true;
        lo0Var.f38715c1 = 4;
        ko0 ko0Var = lo0Var.W0;
        if (ko0Var != null) {
            ko0Var.a(4);
        }
    }

    public static void c0(lo0 lo0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.p2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            mh.ja.j1(lo0Var.getParentActivity(), lo0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, lo0Var.V0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (R = LaunchActivity.R()) != 0) {
            ?? obj = new Object();
            obj.f22158a = true;
            lo0 lo0Var2 = new lo0((TLRPC.PaymentReceipt) tLObject);
            lo0Var2.Z0 = lo0Var.Z0;
            lo0Var2.f38709a1 = lo0Var.f38709a1;
            R.showAsSheet(lo0Var2, obj);
        }
    }

    public static void d0(lo0 lo0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        lo0Var.H0(true, false);
        lo0Var.D0(false);
        if (tLObject != null) {
            lo0Var.f38735s0 = true;
            UserConfig.getInstance(lo0Var.currentAccount).tmpPassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(lo0Var.currentAccount).saveConfig(false);
            lo0Var.t0();
        } else if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            try {
                lo0Var.f38719f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(lo0Var.f38719f[1], 3.25f);
            lo0Var.f38719f[1].setText("");
        } else {
            org.telegram.ui.Components.z4.f0(lo0Var.currentAccount, tL_error, lo0Var, gettmppassword, new Object[0]);
        }
    }

    public static void e0(lo0 lo0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.p2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            mh.ja.j1(lo0Var.getParentActivity(), lo0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, lo0Var.V0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (R = LaunchActivity.R()) != 0) {
            ?? obj = new Object();
            obj.f22158a = true;
            lo0 lo0Var2 = new lo0((TLRPC.PaymentReceipt) tLObject);
            lo0Var2.Z0 = lo0Var.Z0;
            lo0Var2.f38709a1 = lo0Var.f38709a1;
            R.showAsSheet(lo0Var2, obj);
        }
    }

    public static void f0(lo0 lo0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.i0(password, false)) {
                org.telegram.ui.Components.z4.x0(lo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            } else if (!password.has_password) {
                lo0Var.f38735s0 = false;
                lo0Var.t0();
                return;
            } else {
                Utilities.globalQueue.postRunnable(new if0(lo0Var, password, AndroidUtilities.getStringBytes(str), 14));
                return;
            }
        }
        org.telegram.ui.Components.z4.f0(lo0Var.currentAccount, tL_error, lo0Var, getpassword, new Object[0]);
        lo0Var.H0(true, false);
        lo0Var.D0(false);
    }

    public static void g0(lo0 lo0Var, org.telegram.ui.Components.ic icVar, boolean z4, TLRPC.Message[] messageArr) {
        icVar.b();
        if (z4) {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(xn.Q9(messageArr[0].f20866id, MessageObject.getDialogId(messageArr[0])));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = messageArr[0].f20866id;
        tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(lo0Var.currentAccount).getInputPeer(messageArr[0].peer_id);
        ConnectionsManager.getInstance(lo0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new nn0(lo0Var, 2), 2);
    }

    public static void h0(org.telegram.ui.lo0 r23, java.lang.String r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lo0.h0(org.telegram.ui.lo0, java.lang.String, android.view.View):void");
    }

    public static void i0(lo0 lo0Var, TLRPC.TL_error tL_error, boolean z4, TLObject tLObject, String str) {
        String formatPluralString;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(lo0Var.currentAccount).sendRequest(new TL_account.getPassword(), new org.telegram.messenger.zd(9, lo0Var, z4), 8);
            return;
        }
        lo0Var.H0(true, false);
        if (z4) {
            TL_account.Password password = lo0Var.X;
            password.has_password = false;
            password.current_algo = null;
            lo0Var.Q.a(password);
            lo0Var.finishFragment();
        } else if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (lo0Var.getParentActivity() != null) {
                lo0Var.t0();
            }
        } else if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    lo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    lo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    lo0Var.F0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            }
            lo0Var.Z = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lo0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new vl0(3, lo0Var, str));
            String string = LocaleController.getString(R.string.YourEmailAlmostThereText);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
            d2Var.Q = string;
            d2Var.O = LocaleController.getString(R.string.YourEmailAlmostThere);
            Dialog showDialog = lo0Var.showDialog(d2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        }
    }

    public static void j0(org.telegram.ui.lo0 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lo0.j0(org.telegram.ui.lo0):void");
    }

    public static void k0(lo0 lo0Var) {
        int i10 = 0;
        if (UserConfig.getInstance(lo0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(lo0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(lo0Var.currentAccount).getCurrentTime() + 60) {
            UserConfig.getInstance(lo0Var.currentAccount).tmpPassword = null;
            UserConfig.getInstance(lo0Var.currentAccount).saveConfig(false);
        }
        if (UserConfig.getInstance(lo0Var.currentAccount).tmpPassword != null) {
            lo0Var.z0();
        } else if (lo0Var.f38719f[1].length() == 0) {
            try {
                lo0Var.f38719f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(lo0Var.f38719f[1], 2.5f);
        } else {
            String obj = lo0Var.f38719f[1].getText().toString();
            lo0Var.H0(true, true);
            lo0Var.D0(true);
            TL_account.getPassword getpassword = new TL_account.getPassword();
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(lo0Var.currentAccount);
            ba baVar = new ba(lo0Var, obj, getpassword, 28);
            if (lo0Var.T0) {
                i10 = 8;
            }
            connectionsManager.sendRequest(getpassword, baVar, i10 | 2);
        }
    }

    public static void m0(lo0 lo0Var) {
        if (lo0Var.N0) {
            return;
        }
        lo0Var.H0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        lo0Var.F0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = lo0Var.Y0;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (lo0Var.K0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = lo0Var.getMessagesController().getInputPeer(lo0Var.K0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = lo0Var.K0.getId();
            lo0Var.F0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = lo0Var.L0;
            lo0Var.F0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = lo0Var.F0;
        tL_payments_validateRequestedInfo2.save = lo0Var.Q0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (lo0Var.f38745z0.invoice.name_requested) {
            lo0Var.F0.info.name = lo0Var.f38719f[6].getText().toString();
            lo0Var.F0.info.flags |= 1;
        }
        int i10 = 8;
        if (lo0Var.f38745z0.invoice.phone_requested) {
            lo0Var.F0.info.phone = "+" + lo0Var.f38719f[8].getText().toString() + lo0Var.f38719f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = lo0Var.F0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (lo0Var.f38745z0.invoice.email_requested) {
            lo0Var.F0.info.email = lo0Var.f38719f[7].getText().toString().trim();
            lo0Var.F0.info.flags |= 4;
        }
        if (lo0Var.f38745z0.invoice.shipping_address_requested) {
            lo0Var.F0.info.shipping_address = new TLRPC.TL_postAddress();
            lo0Var.F0.info.shipping_address.street_line1 = lo0Var.f38719f[0].getText().toString();
            lo0Var.F0.info.shipping_address.street_line2 = lo0Var.f38719f[1].getText().toString();
            lo0Var.F0.info.shipping_address.city = lo0Var.f38719f[2].getText().toString();
            lo0Var.F0.info.shipping_address.state = lo0Var.f38719f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = lo0Var.F0.info.shipping_address;
            String str = lo0Var.f38744y0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = lo0Var.f38719f[5].getText().toString();
            lo0Var.F0.info.flags |= 8;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo3 = lo0Var.F0;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(lo0Var.currentAccount);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo4 = lo0Var.F0;
        tb0 tb0Var = new tb0(9, lo0Var, tL_payments_validateRequestedInfo3);
        if (!lo0Var.T0) {
            i10 = 0;
        }
        connectionsManager.sendRequest(tL_payments_validateRequestedInfo4, tb0Var, i10 | 2);
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

    public final void A0(boolean z4) {
        String str;
        String str2;
        if (!z4 && this.P.getVisibility() == 0) {
            String text = this.P.getText();
            if (text.length() == 0) {
                org.telegram.ui.Cells.j3 j3Var = this.P;
                try {
                    j3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.shakeViewSpring(j3Var, 2.5f);
                return;
            }
            H0(true, true);
            TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
            confirmpasswordemail.code = text;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new nn0(this, 0), 10);
            return;
        }
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z4) {
            this.f38727n.setVisibility(0);
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.flags = 2;
            passwordinputsettings.email = "";
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            str = null;
            str2 = null;
        } else {
            String obj = this.f38719f[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                E0(0);
                return;
            } else if (!obj.equals(this.f38719f[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                E0(1);
                return;
            } else {
                String obj2 = this.f38719f[2].getText().toString();
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
                    passwordinputsettings2.new_algo = this.X.new_algo;
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
        Utilities.globalQueue.postRunnable(new hg.j(this, z4, str, str2, updatepasswordsettings));
    }

    public final void B0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        int i10;
        int i11;
        int i12;
        boolean z4;
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        boolean z10 = true;
        org.telegram.ui.Cells.z8[] z8VarArr = this.V;
        if (tL_postAddress != null) {
            String str = tL_postAddress.street_line1;
            String str2 = tL_postAddress.street_line2;
            String str3 = tL_postAddress.city;
            String str4 = tL_postAddress.state;
            String str5 = tL_postAddress.country_iso2;
            String str6 = tL_postAddress.post_code;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(", ");
            sb.append(str3);
            yh.w(sb, ", ", str4, ", ", str5);
            String r10 = android.support.v4.media.a.r(sb, ", ", str6);
            z8VarArr[2].b(R.drawable.msg_payment_address, r10, LocaleController.getString(R.string.PaymentShippingAddress), true);
        }
        org.telegram.ui.Cells.z8 z8Var = z8VarArr[2];
        int i13 = 8;
        if (tL_paymentRequestedInfo.shipping_address != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        z8Var.setVisibility(i10);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            z8VarArr[3].b(R.drawable.msg_contacts, str7, LocaleController.getString(R.string.PaymentCheckoutName), true);
        }
        org.telegram.ui.Cells.z8 z8Var2 = z8VarArr[3];
        if (tL_paymentRequestedInfo.name != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        z8Var2.setVisibility(i11);
        if (tL_paymentRequestedInfo.phone != null) {
            org.telegram.ui.Cells.z8 z8Var3 = z8VarArr[4];
            String b10 = se.b.c().b(tL_paymentRequestedInfo.phone);
            String string = LocaleController.getString(R.string.PaymentCheckoutPhoneNumber);
            int i14 = R.drawable.msg_calls;
            if (tL_paymentRequestedInfo.email == null && this.D0 == null) {
                z4 = false;
            } else {
                z4 = true;
            }
            z8Var3.b(i14, b10, string, z4);
        }
        org.telegram.ui.Cells.z8 z8Var4 = z8VarArr[4];
        if (tL_paymentRequestedInfo.phone != null) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        z8Var4.setVisibility(i12);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            org.telegram.ui.Cells.z8 z8Var5 = z8VarArr[5];
            String string2 = LocaleController.getString(R.string.PaymentCheckoutEmail);
            int i15 = R.drawable.msg_mention;
            if (this.D0 == null) {
                z10 = false;
            }
            z8Var5.b(i15, str8, string2, z10);
        }
        org.telegram.ui.Cells.z8 z8Var6 = z8VarArr[5];
        if (tL_paymentRequestedInfo.email != null) {
            i13 = 0;
        }
        z8Var6.setVisibility(i13);
    }

    public final void C0(TL_account.Password password) {
        boolean z4;
        if (password != null && password.has_password) {
            if (getParentActivity() == null) {
                return;
            }
            t0();
            return;
        }
        this.X = password;
        if (password != null && !TextUtils.isEmpty(password.email_unconfirmed_pattern)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.Y = z4;
        J0();
    }

    public final void D0(boolean z4) {
        this.M0 = z4;
        this.D = !z4;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.M0);
        }
        org.telegram.ui.Cells.z8 z8Var = this.V[0];
        if (z8Var != null) {
            z8Var.setEnabled(!this.M0);
        }
    }

    public final void E0(int i10) {
        EditTextBoldCursor editTextBoldCursor = this.f38719f[i10];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(editTextBoldCursor, 2.5f);
    }

    public final void F0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        d2Var.O = str;
        d2Var.Q = str2;
        showDialog(d2Var);
    }

    public final void G0(Runnable runnable) {
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(getParentActivity(), null, false, false);
        h3Var.fixNavigationBar();
        h3Var.title = LocaleController.getString(R.string.PaymentCheckoutMethod);
        h3Var.bigTitle = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.f38738v0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
        } else {
            String str = this.f38737u0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_paymentSavedCredentialsCard> arrayList4 = this.f38745z0.saved_credentials;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i10);
            i10++;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard3 = tL_paymentSavedCredentialsCard2;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.f38738v0;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.f20974id, tL_paymentSavedCredentialsCard4.f20974id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
                arrayList3.add(tL_paymentSavedCredentialsCard3);
            }
        }
        ArrayList<TLRPC.TL_paymentFormMethod> arrayList5 = this.f38745z0.additional_methods;
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
        org.telegram.ui.Components.x2 x2Var = new org.telegram.ui.Components.x2(this, runnable, arrayList3, arrayList, 1);
        h3Var.items = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        h3Var.itemIcons = iArr;
        h3Var.onClickListener = x2Var;
        showDialog(h3Var);
    }

    public final void H0(boolean z4, boolean z10) {
        AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z4 && this.f38727n != null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.v = animatorSet2;
            if (z10) {
                this.f38732r.setVisibility(0);
                this.f38727n.setEnabled(false);
                AnimatorSet animatorSet3 = this.v;
                View contentView = this.f38727n.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, property, 0.1f);
                View contentView2 = this.f38727n.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, property2, 0.1f);
                View contentView3 = this.f38727n.getContentView();
                Property property3 = View.ALPHA;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, property3, 0.0f), ObjectAnimator.ofFloat(this.f38732r, property, 1.0f), ObjectAnimator.ofFloat(this.f38732r, property2, 1.0f), ObjectAnimator.ofFloat(this.f38732r, property3, 1.0f));
            } else if (this.f38739w != null) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f38732r, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.f38732r, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.f38732r, View.ALPHA, 0.0f));
            } else {
                this.f38727n.getContentView().setVisibility(0);
                this.f38727n.setEnabled(true);
                AnimatorSet animatorSet4 = this.v;
                org.telegram.ui.Components.tq tqVar = this.f38732r;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tqVar, property4, 0.1f);
                org.telegram.ui.Components.tq tqVar2 = this.f38732r;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tqVar2, property5, 0.1f);
                org.telegram.ui.Components.tq tqVar3 = this.f38732r;
                Property property6 = View.ALPHA;
                animatorSet4.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(tqVar3, property6, 0.0f));
                if (!isFinishing()) {
                    this.v.playTogether(ObjectAnimator.ofFloat(this.f38727n.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.f38727n.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.f38727n.getContentView(), property6, 1.0f));
                }
            }
            this.v.addListener(new co0(this, z10, 0));
            this.v.setDuration(150L);
            this.v.start();
        } else if (this.R != null) {
            this.v = new AnimatorSet();
            if (z10) {
                this.f38734s.setVisibility(0);
                this.T.setEnabled(false);
                AnimatorSet animatorSet5 = this.v;
                TextView textView = this.R;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, property7, 0.1f);
                TextView textView2 = this.R;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, property8, 0.1f);
                TextView textView3 = this.R;
                Property property9 = View.ALPHA;
                animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, property9, 0.0f), ObjectAnimator.ofFloat(this.f38734s, property7, 1.0f), ObjectAnimator.ofFloat(this.f38734s, property8, 1.0f), ObjectAnimator.ofFloat(this.f38734s, property9, 1.0f));
            } else {
                this.R.setVisibility(0);
                this.T.setEnabled(true);
                AnimatorSet animatorSet6 = this.v;
                org.telegram.ui.Components.tq tqVar4 = this.f38734s;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(tqVar4, property10, 0.1f);
                org.telegram.ui.Components.tq tqVar5 = this.f38734s;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(tqVar5, property11, 0.1f);
                org.telegram.ui.Components.tq tqVar6 = this.f38734s;
                Property property12 = View.ALPHA;
                animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(tqVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.R, property10, 1.0f), ObjectAnimator.ofFloat(this.R, property11, 1.0f), ObjectAnimator.ofFloat(this.R, property12, 1.0f));
            }
            this.v.addListener(new co0(this, z10, 1));
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
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        d2Var.O = string;
        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("PaymentTransactionMessage2", R.string.PaymentTransactionMessage2, str, this.m0, this.f38728n0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new ln0(this, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(d2Var);
    }

    public final void J0() {
        if (this.f38733r0 == 6) {
            org.telegram.ui.Cells.a9[] a9VarArr = this.J;
            if (a9VarArr[2] != null) {
                int i10 = 0;
                this.f38727n.setVisibility(0);
                TL_account.Password password = this.X;
                ArrayList arrayList = this.G;
                org.telegram.ui.Cells.m4[] m4VarArr = this.F;
                org.telegram.ui.Cells.aa[] aaVarArr = this.K;
                if (password == null) {
                    H0(true, true);
                    a9VarArr[2].setVisibility(8);
                    aaVarArr[0].setVisibility(8);
                    aaVarArr[1].setVisibility(8);
                    this.P.setVisibility(8);
                    m4VarArr[0].setVisibility(8);
                    m4VarArr[1].setVisibility(8);
                    a9VarArr[0].setVisibility(8);
                    for (int i11 = 0; i11 < 3; i11++) {
                        ((View) this.f38719f[i11].getParent()).setVisibility(8);
                    }
                    while (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setVisibility(8);
                        i10++;
                    }
                    return;
                }
                H0(true, false);
                if (this.Y) {
                    org.telegram.ui.Cells.a9 a9Var = a9VarArr[2];
                    int i12 = R.string.EmailPasswordConfirmText2;
                    String str = this.X.email_unconfirmed_pattern;
                    if (str == null) {
                        str = "";
                    }
                    a9Var.setText(LocaleController.formatString("EmailPasswordConfirmText2", i12, str));
                    a9VarArr[2].setVisibility(0);
                    aaVarArr[0].setVisibility(0);
                    aaVarArr[1].setVisibility(0);
                    this.P.setVisibility(0);
                    a9VarArr[1].setText("");
                    m4VarArr[0].setVisibility(8);
                    m4VarArr[1].setVisibility(8);
                    a9VarArr[0].setVisibility(8);
                    for (int i13 = 0; i13 < 3; i13++) {
                        ((View) this.f38719f[i13].getParent()).setVisibility(8);
                    }
                    while (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setVisibility(8);
                        i10++;
                    }
                    return;
                }
                a9VarArr[2].setVisibility(8);
                aaVarArr[0].setVisibility(8);
                aaVarArr[1].setVisibility(8);
                a9VarArr[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                this.P.setVisibility(8);
                m4VarArr[0].setVisibility(0);
                m4VarArr[1].setVisibility(0);
                a9VarArr[0].setVisibility(0);
                for (int i14 = 0; i14 < 3; i14++) {
                    ((View) this.f38719f[i14].getParent()).setVisibility(0);
                }
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((View) arrayList.get(i15)).setVisibility(0);
                }
            }
        }
    }

    public final void K0() {
        org.telegram.ui.Cells.a9[] a9VarArr = this.J;
        if (a9VarArr[0] != null) {
            org.telegram.ui.Cells.z6[] z6VarArr = this.H;
            if (z6VarArr[2] != null) {
                TLRPC.PaymentForm paymentForm = this.f38745z0;
                if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.f38739w != null && this.f38740w0)) {
                    this.I.setVisibility(8);
                    a9VarArr[0].setVisibility(8);
                    org.telegram.ui.Cells.z6 z6Var = z6VarArr[2];
                    z6Var.setBackground(org.telegram.ui.ActionBar.k6.V0(z6Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21626b7));
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine1));
                if (this.f38745z0.password_missing) {
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
                        a9VarArr[0].getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(i11, i11 + 1, (CharSequence) "");
                        spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new io0(this), i10, i11 - 1, 33);
                    }
                }
                this.I.setEnabled(true);
                a9VarArr[0].setText(spannableStringBuilder);
                this.I.setVisibility(0);
                a9VarArr[0].setVisibility(0);
                org.telegram.ui.Cells.z6 z6Var2 = z6VarArr[2];
                z6Var2.setBackground(org.telegram.ui.ActionBar.k6.V0(z6Var2.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21626b7));
            }
        }
    }

    public final void L0() {
        this.O0[0] = s0(this.f38731q0);
        this.O.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.O0[0], true);
        TextView textView = this.R;
        if (textView != null) {
            textView.setText(LocaleController.formatString("PaymentCheckoutPay", R.string.PaymentCheckoutPay, this.O0[0]));
        }
        if (this.f38730p0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.ei);
            int childCount = this.f38730p0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                TextView textView2 = (TextView) this.f38730p0.getChildAt(i10);
                if (textView2.getTag().equals(this.E0)) {
                    org.telegram.ui.ActionBar.k6.w1(themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.fi));
                } else {
                    org.telegram.ui.ActionBar.k6.w1(536870911 & themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Z8));
                }
                textView2.invalidate();
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lo0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.twoStepPasswordChanged) {
            TLRPC.PaymentForm paymentForm = this.f38745z0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            K0();
        } else if (i10 == NotificationCenter.didRemoveTwoStepPassword) {
            TLRPC.PaymentForm paymentForm2 = this.f38745z0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            K0();
        } else if (i10 == NotificationCenter.paymentFinished) {
            this.X0 = true;
            removeSelfFromStack();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.V0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21932s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        org.telegram.ui.Components.tq tqVar = this.f38732r;
        int i11 = org.telegram.ui.ActionBar.k6.D7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(tqVar, 0, null, null, null, null, i11));
        org.telegram.ui.Components.tq tqVar2 = this.f38732r;
        int i12 = org.telegram.ui.ActionBar.k6.E7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(tqVar2, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38734s, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38734s, 0, null, null, null, null, i12));
        if (this.f38719f != null) {
            int i13 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f38719f;
                if (i13 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.m6((View) editTextBoldCursorArr[i13].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38719f[i13], 4, null, null, null, null, org.telegram.ui.ActionBar.k6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38719f[i13], 8388608, null, null, null, null, org.telegram.ui.ActionBar.k6.H6));
                i13++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.k6.H6));
        }
        if (this.h != null) {
            int i14 = 0;
            while (true) {
                org.telegram.ui.Cells.j6[] j6VarArr = this.h;
                if (i14 >= j6VarArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.m6(j6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.h[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.h[i14], 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.h[i14], 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21717g7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.h[i14], 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21735h7));
                i14++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21717g7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21735h7));
        }
        int i15 = 0;
        while (true) {
            org.telegram.ui.Cells.m4[] m4VarArr = this.F;
            if (i15 >= m4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.m6(m4VarArr[i15], 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(m4VarArr[i15], 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
            i15++;
        }
        int i16 = 0;
        while (true) {
            org.telegram.ui.Cells.z6[] z6VarArr = this.H;
            if (i16 >= z6VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.m6(z6VarArr[i16], 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21626b7));
            i16++;
        }
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.a9[] a9VarArr = this.J;
            if (i17 >= a9VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.m6(a9VarArr[i17], 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21626b7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(a9VarArr[i17], 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(a9VarArr[i17], 2, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.J6));
            i17++;
        }
        int i18 = 0;
        while (true) {
            ArrayList arrayList2 = this.G;
            if (i18 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.m6((View) arrayList2.get(i18), 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
            i18++;
        }
        org.telegram.ui.Cells.j3 j3Var = this.P;
        int i19 = org.telegram.ui.ActionBar.k6.f21661d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(j3Var, 1, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 4, new Class[]{org.telegram.ui.Cells.j3.class}, new String[]{"textView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 8388608, new Class[]{org.telegram.ui.Cells.j3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.E, 4, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, 268435456, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, 268435456, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        int i21 = 0;
        while (true) {
            org.telegram.ui.Cells.aa[] aaVarArr = this.K;
            if (i21 >= aaVarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.m6(aaVarArr[i21], 268435456, null, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(aaVarArr[i21], 268435456, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(aaVarArr[i21], 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
            i21++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.s6));
        int i22 = org.telegram.ui.ActionBar.k6.f21661d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 16, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i22));
        int i23 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"valueTextView"}, null, null, -1, null, i23));
        int i24 = org.telegram.ui.ActionBar.k6.f22055z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"valueTextView"}, null, null, -1, null, i24));
        org.telegram.ui.Cells.z8[] z8VarArr = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.m6(z8VarArr[0], 268435456, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(z8VarArr[0], 268435456, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        for (int i25 = 1; i25 < z8VarArr.length; i25++) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(z8VarArr[i25], 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(z8VarArr[i25], 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(z8VarArr[i25], 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22055z6));
        }
        org.telegram.ui.Cells.l5 l5Var = this.U;
        int i26 = org.telegram.ui.ActionBar.k6.f21661d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(l5Var, 1, null, null, null, null, i26));
        int i27 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.U, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"nameTextView"}, null, null, -1, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.U, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"detailTextView"}, null, null, -1, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.U, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"detailExTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22055z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.T, 268435456, null, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.T, 268435456, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.D;
    }

    public final void n0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        frameLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
        this.L.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        frameLayout2.setClickable(true);
        this.M.setFocusable(true);
        this.M.setBackgroundResource(R.drawable.googlepay_button_no_shadow_background);
        if (this.H0 == null) {
            this.M.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f));
        } else {
            this.M.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        }
        this.L.addView(this.M, k7.c6.c(48.0f, -1));
        this.M.setOnClickListener(new hn0(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.M.addView(linearLayout, k7.c6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, k7.c6.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.M.addView(imageView2, k7.c6.c(-1.0f, -1));
    }

    public final void o0(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lo0.o0(java.lang.String):void");
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 == 991) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gy(this, i11, intent, 29));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        WebView webView = this.f38739w;
        if (webView != null && this.f38743y) {
            if (z4) {
                webView.loadUrl(this.f38741x);
                this.f38743y = false;
            }
            return false;
        }
        return !this.M0;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.f38733r0 == 4 && this.U0) {
            this.U0 = false;
            this.T.callOnClick();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.f38733r0 != 4 || this.S0) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.paymentFinished);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lo0.onFragmentDestroy():void");
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                int i10 = this.f38733r0;
                if ((i10 == 2 || i10 == 6) && !this.f38745z0.invoice.test) {
                    getParentActivity().getWindow().setFlags(8192, 8192);
                    AndroidUtilities.logFlagSecure();
                } else if (SharedConfig.passcodeHash.length() == 0 || SharedConfig.allowScreenCapture) {
                    getParentActivity().getWindow().clearFlags(8192);
                    AndroidUtilities.logFlagSecure();
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4 && !z10) {
            WebView webView = this.f38739w;
            if (webView != null) {
                if (this.f38733r0 != 4) {
                    TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.C0;
                    if (tL_paymentFormMethod != null) {
                        String str = tL_paymentFormMethod.url;
                        this.f38741x = str;
                        webView.loadUrl(str);
                        return;
                    }
                    String str2 = this.f38745z0.url;
                    this.f38741x = str2;
                    webView.loadUrl(str2);
                    return;
                }
                return;
            }
            int i10 = this.f38733r0;
            if (i10 == 2) {
                AndroidUtilities.runOnUIThread(new kn0(this, 0), 100L);
            } else if (i10 == 3) {
                this.f38719f[1].requestFocus();
                AndroidUtilities.showKeyboard(this.f38719f[1]);
            } else if (i10 == 4) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f38719f;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                }
            } else if (i10 == 6 && !this.Y) {
                this.f38719f[0].requestFocus();
                AndroidUtilities.showKeyboard(this.f38719f[0]);
            }
        }
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        y0(p2Var);
        return super.presentFragment(p2Var);
    }

    public final long q0() {
        TLRPC.InputInvoice inputInvoice = this.Y0;
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
        TLRPC.InputInvoice inputInvoice = this.Y0;
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
        Long l10 = this.E0;
        if (l10 != null) {
            j10 += l10.longValue();
        }
        return LocaleController.getInstance().formatCurrencyString(j10, this.f38745z0.invoice.currency);
    }

    public final void t0() {
        int i10;
        int i11;
        boolean z4;
        int i12;
        int i13 = this.f38733r0;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 == 6) {
                                if (!this.Q.c(this.f38736t0, this.f38737u0, this.R0, this.G0, this.f38738v0)) {
                                    lo0 lo0Var = new lo0(this.Y0, this.f38745z0, this.K0, this.L0, 4, this.B0, this.D0, this.E0, this.f38736t0, this.f38737u0, this.F0, this.R0, this.G0, this.f38729o0, false);
                                    lo0Var.Z0 = this.Z0;
                                    lo0Var.f38709a1 = this.f38709a1;
                                    presentFragment(lo0Var, true);
                                    return;
                                }
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        if (this.S0) {
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
                        AndroidUtilities.runOnUIThread(new kn0(this, 2), 500L);
                        return;
                    }
                    if (this.f38735s0) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    lo0 lo0Var2 = new lo0(this.Y0, this.f38745z0, this.K0, this.L0, i12, this.B0, this.D0, this.E0, this.f38736t0, this.f38737u0, this.F0, this.R0, this.G0, this.f38729o0, this.T0);
                    lo0Var2.Z0 = this.Z0;
                    lo0Var2.f38709a1 = this.f38709a1;
                    presentFragment(lo0Var2, true);
                    return;
                }
                TLRPC.PaymentForm paymentForm = this.f38745z0;
                if (paymentForm.password_missing && (z4 = this.R0)) {
                    lo0 lo0Var3 = new lo0(this.Y0, paymentForm, this.K0, this.L0, 6, this.B0, this.D0, this.E0, this.f38736t0, this.f38737u0, this.F0, z4, this.G0, this.f38729o0, this.T0);
                    this.f38714c0 = lo0Var3;
                    lo0Var3.Z0 = this.Z0;
                    lo0Var3.f38709a1 = this.f38709a1;
                    lo0Var3.C0(this.X);
                    lo0 lo0Var4 = this.f38714c0;
                    lo0Var4.Q = new zn0(this);
                    presentFragment(lo0Var4, this.P0);
                    return;
                }
                jo0 jo0Var = this.Q;
                if (jo0Var != null) {
                    jo0Var.c(this.f38736t0, this.f38737u0, this.R0, this.G0, null);
                    finishFragment();
                    return;
                }
                lo0 lo0Var5 = new lo0(this.Y0, paymentForm, this.K0, this.L0, 4, this.B0, this.D0, this.E0, this.f38736t0, this.f38737u0, this.F0, this.R0, this.G0, this.f38729o0, this.T0);
                lo0Var5.Z0 = this.Z0;
                lo0Var5.f38709a1 = this.f38709a1;
                presentFragment(lo0Var5, this.P0);
                return;
            }
            if (this.f38736t0 == null && this.f38737u0 == null) {
                if (this.f38738v0 != null) {
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
                if (i11 != 2 && this.f38737u0 == null && this.f38738v0 == null && this.f38736t0 == null && !this.f38745z0.additional_methods.isEmpty()) {
                    G0(new kn0(this, 1));
                    return;
                }
                lo0 lo0Var6 = new lo0(this.Y0, this.f38745z0, this.K0, this.L0, i11, this.B0, this.D0, this.E0, this.f38736t0, this.f38737u0, this.F0, this.R0, this.G0, this.f38729o0, this.T0);
                lo0Var6.Z0 = this.Z0;
                lo0Var6.f38709a1 = this.f38709a1;
                presentFragment(lo0Var6, this.P0);
                return;
            }
            i11 = 4;
            if (i11 != 2) {
            }
            lo0 lo0Var62 = new lo0(this.Y0, this.f38745z0, this.K0, this.L0, i11, this.B0, this.D0, this.E0, this.f38736t0, this.f38737u0, this.F0, this.R0, this.G0, this.f38729o0, this.T0);
            lo0Var62.Z0 = this.Z0;
            lo0Var62.f38709a1 = this.f38709a1;
            presentFragment(lo0Var62, this.P0);
            return;
        }
        jo0 jo0Var2 = this.Q;
        if (jo0Var2 != null) {
            jo0Var2.d(this.F0);
            finishFragment();
            return;
        }
        if (this.f38745z0.invoice.flexible) {
            i10 = 1;
        } else if (this.f38738v0 == null && this.f38736t0 == null) {
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
        if (i10 == 2 && this.f38738v0 == null && this.f38736t0 == null && !this.f38745z0.additional_methods.isEmpty()) {
            G0(new kn0(this, 1));
            return;
        }
        lo0 lo0Var7 = new lo0(this.Y0, this.f38745z0, this.K0, this.L0, i10, this.B0, null, null, this.f38736t0, this.f38737u0, this.F0, this.R0, this.G0, this.f38729o0, this.T0);
        lo0Var7.Z0 = this.Z0;
        lo0Var7.f38709a1 = this.f38709a1;
        presentFragment(lo0Var7, this.P0);
    }

    public final void u0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z4, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.p2 p2Var, boolean z10) {
        if (p2Var != null) {
            this.currentAccount = p2Var.getCurrentAccount();
        }
        this.f38733r0 = i10;
        this.f38729o0 = p2Var;
        this.f38736t0 = str2;
        this.G0 = tL_inputPaymentCredentialsGooglePay;
        this.B0 = tL_payments_validatedRequestedInfo;
        this.f38745z0 = paymentForm;
        this.D0 = tL_shippingOption;
        this.E0 = l10;
        this.K0 = messageObject;
        this.L0 = str;
        this.Y0 = inputInvoice;
        this.R0 = z4;
        this.T0 = z10;
        this.P0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.f38745z0.native_provider)) ? false : true;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentForm.bot_id));
        this.f38723i0 = user;
        if (user != null) {
            this.m0 = user.first_name;
        } else {
            this.m0 = "";
        }
        this.f38728n0 = paymentForm.title;
        this.F0 = tL_payments_validateRequestedInfo;
        this.Q0 = true;
        if (!z4 && this.f38733r0 != 4) {
            this.R0 = !this.f38745z0.saved_credentials.isEmpty();
        } else {
            this.R0 = z4;
        }
        if (str3 == null) {
            if (this.f38745z0.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.f38745z0.saved_credentials.get(0);
            this.f38738v0 = tL_paymentSavedCredentialsCard;
            this.f38737u0 = tL_paymentSavedCredentialsCard.title;
            return;
        }
        this.f38737u0 = str3;
    }

    public final void v0(Context context) {
        int i10;
        Optional empty;
        if (getParentActivity() != null) {
            c5.c cVar = new c5.c();
            if (this.f38745z0.invoice.test) {
                i10 = 3;
            } else {
                i10 = 1;
            }
            if (i10 != 2 && i10 != 1 && i10 != 3) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(l.d.j(i10, "Invalid environment value "));
            }
            cVar.f2264a = i10;
            this.f38717e = new com.google.android.gms.common.api.j(context, j8.p.f9922a, new j8.o(cVar), com.google.android.gms.common.api.i.f2658c);
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
            b6.m.i(jSONObject, "isReadyToPayRequestJson cannot be null!");
            obj.f9883f = jSONObject;
            a8.e eVar = this.f38717e;
            eVar.getClass();
            com.google.android.gms.common.api.internal.v e6 = com.google.android.gms.common.api.internal.w.e();
            e6.f2822a = 23705;
            e6.f2824c = new o5.i((Object) obj, 18);
            eVar.e(0, e6.e()).addOnCompleteListener(getParentActivity(), new ln0(this, 0));
        }
    }

    public final void w0() {
        if (this.f38711b0) {
            return;
        }
        this.f38711b0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new nn0(this, 1), 10);
    }

    public final boolean x0(org.telegram.ui.ActionBar.f5 f5Var, Activity activity) {
        int i10 = 0;
        if (this.Y0 != null) {
            if (f5Var != null) {
                ArrayList arrayList = new ArrayList(f5Var.getFragmentStack());
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                    if (p2Var instanceof lo0) {
                        p2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.f38723i0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().premiumBotUsername) && this.L0 == null) || (this.L0 != null && getMessagesController().premiumInvoiceSlug != null && Objects.equals(this.L0, getMessagesController().premiumInvoiceSlug))) && f5Var != null) {
            ArrayList arrayList2 = new ArrayList(f5Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj2;
                if ((p2Var2 instanceof xn) || (p2Var2 instanceof PremiumPreviewFragment)) {
                    p2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.m0 = true;
            ((ActionBarLayout) f5Var).Q(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).f34174u0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void y0(org.telegram.ui.ActionBar.p2 p2Var) {
        AndroidUtilities.hideKeyboard(this.fragmentView);
        if (p2Var instanceof lo0) {
            lo0 lo0Var = (lo0) p2Var;
            lo0Var.W0 = this.W0;
            lo0Var.V0 = this.V0;
            lo0Var.U0 = this.U0;
            lo0Var.f38738v0 = this.f38738v0;
        }
    }

    public final void z0() {
        long j10;
        String str;
        if (this.N0) {
            return;
        }
        int i10 = 0;
        H0(false, true);
        TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.Y0;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.K0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(this.K0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = this.K0.getId();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.L0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.f38745z0.form_id;
        if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && this.f38738v0 != null) {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.f20863id = this.f38738v0.f20974id;
            tL_inputPaymentCredentialsSaved.tmp_password = UserConfig.getInstance(this.currentAccount).tmpPassword.tmp_password;
        } else {
            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = this.G0;
            if (tL_inputPaymentCredentialsGooglePay != null) {
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsGooglePay;
            } else {
                TLRPC.TL_inputPaymentCredentials tL_inputPaymentCredentials = new TLRPC.TL_inputPaymentCredentials();
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentials;
                tL_inputPaymentCredentials.save = this.R0;
                tL_inputPaymentCredentials.data = new TLRPC.TL_dataJSON();
                tL_payments_sendPaymentForm.credentials.data.data = this.f38736t0;
            }
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.B0;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.f20975id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags = 1 | tL_payments_sendPaymentForm.flags;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.D0;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.f20981id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        if ((this.f38745z0.invoice.flags & 256) != 0) {
            Long l10 = this.E0;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = 0;
            }
            tL_payments_sendPaymentForm.tip_amount = j10;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        tb0 tb0Var = new tb0(10, this, tL_payments_sendPaymentForm);
        if (this.T0) {
            i10 = 8;
        }
        connectionsManager.sendRequest(tL_payments_sendPaymentForm, tb0Var, i10 | 2);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var, boolean z4) {
        y0(p2Var);
        return super.presentFragment(p2Var, z4);
    }

    public lo0(TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, org.telegram.ui.ActionBar.p2 p2Var) {
        super(null);
        this.f38707a = new ArrayList();
        this.f38710b = new HashMap();
        this.f38713c = new HashMap();
        this.d = new HashMap();
        this.D = true;
        this.F = new org.telegram.ui.Cells.m4[3];
        this.G = new ArrayList();
        this.H = new org.telegram.ui.Cells.z6[3];
        this.J = new org.telegram.ui.Cells.a9[3];
        this.K = new org.telegram.ui.Cells.aa[2];
        this.V = new org.telegram.ui.Cells.z8[7];
        this.W = -4.5f;
        this.Z = 6;
        this.S0 = true;
        u0(null, paymentForm, messageObject, str, 4, null, null, null, null, null, null, false, null, p2Var, false);
    }

    public lo0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.f38707a = new ArrayList();
        this.f38710b = new HashMap();
        this.f38713c = new HashMap();
        this.d = new HashMap();
        this.D = true;
        this.F = new org.telegram.ui.Cells.m4[3];
        this.G = new ArrayList();
        this.H = new org.telegram.ui.Cells.z6[3];
        this.J = new org.telegram.ui.Cells.a9[3];
        this.K = new org.telegram.ui.Cells.aa[2];
        this.V = new org.telegram.ui.Cells.z8[7];
        this.W = -4.5f;
        this.Z = 6;
        this.f38733r0 = 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.f38745z0 = paymentForm;
        this.A0 = paymentReceipt;
        paymentForm.bot_id = paymentReceipt.bot_id;
        paymentForm.invoice = paymentReceipt.invoice;
        paymentForm.provider_id = paymentReceipt.provider_id;
        paymentForm.users = paymentReceipt.users;
        this.D0 = paymentReceipt.shipping;
        long j10 = paymentReceipt.tip_amount;
        if (j10 != 0) {
            this.E0 = Long.valueOf(j10);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentReceipt.bot_id));
        this.f38723i0 = user;
        if (user != null) {
            this.m0 = user.first_name;
        } else {
            this.m0 = "";
        }
        this.f38728n0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.F0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.K0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(paymentReceipt.bot_id);
                this.F0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.L0;
                this.F0.invoice = tL_inputInvoiceSlug;
            }
            this.F0.info = paymentReceipt.info;
        }
        this.f38737u0 = paymentReceipt.credentials_title;
    }

    public lo0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.p2 p2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, p2Var, false);
        this.S0 = true;
    }
}
