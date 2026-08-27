package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import j$.util.Objects;
import j$.util.Optional;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
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

public final class do0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {

    public static final List f37449c1 = Arrays.asList("http", "https");

    public static final List f37450d1 = Collections.singletonList("tg");
    public ScrollView A;
    public TLRPC.TL_payments_validatedRequestedInfo A0;
    public boolean B;
    public TLRPC.TL_paymentFormMethod B0;
    public boolean C;
    public TLRPC.TL_shippingOption C0;
    public TextView D;
    public Long D0;
    public final org.telegram.ui.Cells.j4[] E;
    public TLRPC.TL_payments_validateRequestedInfo E0;
    public final ArrayList F;
    public TLRPC.TL_inputPaymentCredentialsGooglePay F0;
    public final org.telegram.ui.Cells.w6[] G;
    public String G0;
    public org.telegram.ui.Cells.p8 H;
    public String H0;
    public final org.telegram.ui.Cells.x8[] I;
    public JSONObject I0;
    public final org.telegram.ui.Cells.x9[] J;
    public MessageObject J0;
    public FrameLayout K;
    public String K0;
    public FrameLayout L;
    public boolean L0;
    public LinearLayout M;
    public boolean M0;
    public org.telegram.ui.Cells.y8 N;
    public String[] N0;
    public org.telegram.ui.Cells.h3 O;
    public boolean O0;
    public bo0 P;
    public boolean P0;
    public TextView Q;
    public boolean Q0;
    public org.telegram.ui.Cells.l6 R;
    public boolean R0;
    public zn0 S;
    public boolean S0;
    public org.telegram.ui.Cells.i5 T;
    public boolean T0;
    public final org.telegram.ui.Cells.w8[] U;
    public org.telegram.ui.ActionBar.c6 U0;
    public float V;
    public co0 V0;
    public TL_account.Password W;
    public boolean W0;
    public boolean X;
    public TLRPC.InputInvoice X0;
    public int Y;
    public Utilities.Callback Y0;
    public cn0 Z;
    public Utilities.Callback Z0;

    public final ArrayList f37451a;

    public boolean f37452a0;

    public w10 f37453a1;

    public final HashMap f37454b;

    public do0 f37455b0;

    public int f37456b1;

    public final HashMap f37457c;

    public boolean f37458c0;
    public final HashMap d;

    public boolean f37459d0;

    public com.google.android.gms.internal.clearcut.v0 f37460e;

    public boolean f37461e0;

    public EditTextBoldCursor[] f37462f;

    public String f37463f0;

    public boolean f37464g0;
    public org.telegram.ui.Cells.g6[] h;

    public TLRPC.User f37465h0;

    public boolean f37466i0;

    public boolean f37467j0;

    public boolean f37468k0;

    public String f37469l0;
    public String m0;

    public org.telegram.ui.ActionBar.v0 f37470n;

    public org.telegram.ui.ActionBar.n2 f37471n0;

    public hn0 f37472o0;

    public ArrayList f37473p0;

    public int f37474q0;

    public org.telegram.ui.Components.hq f37475r;

    public boolean f37476r0;

    public org.telegram.ui.Components.hq f37477s;

    public String f37478s0;

    public String f37479t0;

    public TLRPC.TL_paymentSavedCredentialsCard f37480u0;
    public AnimatorSet v;

    public boolean f37481v0;

    public WebView f37482w;

    public nt f37483w0;

    public String f37484x;

    public String f37485x0;

    public boolean f37486y;

    public TLRPC.PaymentForm f37487y0;

    public final TLRPC.PaymentReceipt f37488z0;

    public do0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.n2 n2Var, boolean z11) {
        super(null);
        this.f37451a = new ArrayList();
        this.f37454b = new HashMap();
        this.f37457c = new HashMap();
        this.d = new HashMap();
        this.C = true;
        this.E = new org.telegram.ui.Cells.j4[3];
        this.F = new ArrayList();
        this.G = new org.telegram.ui.Cells.w6[3];
        this.I = new org.telegram.ui.Cells.x8[3];
        this.J = new org.telegram.ui.Cells.x9[2];
        this.U = new org.telegram.ui.Cells.w8[7];
        this.V = -4.5f;
        this.Y = 6;
        u0(inputInvoice, paymentForm, messageObject, str, i10, tL_payments_validatedRequestedInfo, tL_shippingOption, l10, str2, str3, tL_payments_validateRequestedInfo, z10, tL_inputPaymentCredentialsGooglePay, n2Var, z11);
    }

    public static void U(do0 do0Var, TL_account.Password password, byte[] bArr) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        byte[] x8 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        v80 v80Var = new v80(15, do0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            v80Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(x8, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        gettmppassword.password = tL_inputCheckPasswordSRPStartCheck;
        if (tL_inputCheckPasswordSRPStartCheck != null) {
            ConnectionsManager.getInstance(do0Var.currentAccount).sendRequest(gettmppassword, v80Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        v80Var.run(null, tL_error2);
    }

    public static void V(do0 do0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        do0Var.D0(false);
        do0Var.H0(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            switch (str) {
                case "ADDRESS_CITY_INVALID":
                    do0Var.E0(2);
                    break;
                case "ADDRESS_STREET_LINE1_INVALID":
                    do0Var.E0(0);
                    break;
                case "ADDRESS_COUNTRY_INVALID":
                    do0Var.E0(4);
                    break;
                case "REQ_INFO_NAME_INVALID":
                    do0Var.E0(6);
                    break;
                case "ADDRESS_POSTCODE_INVALID":
                    do0Var.E0(5);
                    break;
                case "ADDRESS_STATE_INVALID":
                    do0Var.E0(3);
                    break;
                case "REQ_INFO_PHONE_INVALID":
                    do0Var.E0(9);
                    break;
                case "ADDRESS_STREET_LINE2_INVALID":
                    do0Var.E0(1);
                    break;
                case "REQ_INFO_EMAIL_INVALID":
                    do0Var.E0(7);
                    break;
                default:
                    org.telegram.ui.Components.y4.f0(do0Var.currentAccount, tL_error, do0Var, tLObject, new Object[0]);
                    break;
            }
        }
    }

    public static void W(do0 do0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        do0Var.A0 = tL_payments_validatedRequestedInfo;
        if (do0Var.f37487y0.saved_info != null && !do0Var.P0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager.getInstance(do0Var.currentAccount).sendRequest(tL_payments_clearSavedInfo, new jh.m5(17), do0Var.S0 ? 8 : 0);
        }
        do0Var.t0();
        do0Var.D0(false);
        do0Var.H0(true, false);
    }

    public static void X(do0 do0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        do0Var.D0(false);
        do0Var.H0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.y4.f0(do0Var.currentAccount, tL_error, do0Var, tLObject, new Object[0]);
        }
    }

    public static void Y(do0 do0Var, org.telegram.ui.Components.ec ecVar, boolean z10, TLRPC.Message message) {
        ecVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = message.f22401id;
            tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(do0Var.currentAccount).getInputPeer(message.peer_id);
            ConnectionsManager.getInstance(do0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new fn0(do0Var, 3), 2);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU != null) {
            n2VarU.presentFragment(rn.Q9(message.f22401id, MessageObject.getDialogId(message)));
        }
    }

    public static void Z(do0 do0Var) {
        ConnectionsManager.getInstance(do0Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new jh.m5(17), do0Var.S0 ? 8 : 0);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(do0Var.getParentActivity());
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        do0Var.showDialog(alertDialog$Builder.f22702a);
    }

    public static void a0(do0 do0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        hh.l7 l7Var = new hh.l7(do0Var, z10, str, 7);
        if (z10) {
            ConnectionsManager.getInstance(do0Var.currentAccount).sendRequest(updatepasswordsettings, l7Var, 10);
            return;
        }
        byte[] stringBytes = AndroidUtilities.getStringBytes(str2);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = do0Var.W.new_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            l7Var.run(null, tL_error);
            return;
        }
        updatepasswordsettings.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        if (updatepasswordsettings.new_settings.new_password_hash == null) {
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "ALGO_INVALID";
            l7Var.run(null, tL_error2);
        }
        ConnectionsManager.getInstance(do0Var.currentAccount).sendRequest(updatepasswordsettings, l7Var, 10);
    }

    public static void b0(do0 do0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.y4.f0(do0Var.currentAccount, tL_error, do0Var, tL_payments_sendPaymentForm, new Object[0]);
        do0Var.D0(false);
        do0Var.H0(false, false);
        do0Var.W0 = true;
        do0Var.f37456b1 = 4;
        co0 co0Var = do0Var.V0;
        if (co0Var != null) {
            co0Var.b(4);
        }
    }

    public static void c0(do0 do0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.n2 n2VarR;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            hh.oa.j1(do0Var.getParentActivity(), do0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, do0Var.U0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (n2VarR = LaunchActivity.R()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.f23619a = true;
        do0 do0Var2 = new do0((TLRPC.PaymentReceipt) tLObject);
        do0Var2.Y0 = do0Var.Y0;
        do0Var2.Z0 = do0Var.Z0;
        n2VarR.showAsSheet(do0Var2, l2Var);
    }

    public static void d0(do0 do0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        do0Var.H0(true, false);
        do0Var.D0(false);
        if (tLObject != null) {
            do0Var.f37476r0 = true;
            UserConfig.getInstance(do0Var.currentAccount).tmpPassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(do0Var.currentAccount).saveConfig(false);
            do0Var.t0();
            return;
        }
        if (!tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            org.telegram.ui.Components.y4.f0(do0Var.currentAccount, tL_error, do0Var, gettmppassword, new Object[0]);
            return;
        }
        try {
            do0Var.f37462f[1].performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(do0Var.f37462f[1], 3.25f);
        do0Var.f37462f[1].setText("");
    }

    public static void e0(do0 do0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.n2 n2VarR;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            hh.oa.j1(do0Var.getParentActivity(), do0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, do0Var.U0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (n2VarR = LaunchActivity.R()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.f23619a = true;
        do0 do0Var2 = new do0((TLRPC.PaymentReceipt) tLObject);
        do0Var2.Y0 = do0Var.Y0;
        do0Var2.Z0 = do0Var.Z0;
        n2VarR.showAsSheet(do0Var2, l2Var);
    }

    public static void f0(do0 do0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error != null) {
            org.telegram.ui.Components.y4.f0(do0Var.currentAccount, tL_error, do0Var, getpassword, new Object[0]);
            do0Var.H0(true, false);
            do0Var.D0(false);
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.i0(password, false)) {
            org.telegram.ui.Components.y4.x0(do0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
        } else if (password.has_password) {
            Utilities.globalQueue.postRunnable(new bf0(do0Var, password, AndroidUtilities.getStringBytes(str), 14));
        } else {
            do0Var.f37476r0 = false;
            do0Var.t0();
        }
    }

    public static void g0(do0 do0Var, org.telegram.ui.Components.ec ecVar, boolean z10, TLRPC.Message[] messageArr) {
        ecVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = messageArr[0].f22401id;
            tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(do0Var.currentAccount).getInputPeer(messageArr[0].peer_id);
            ConnectionsManager.getInstance(do0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new fn0(do0Var, 2), 2);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU != null) {
            n2VarU.presentFragment(rn.Q9(messageArr[0].f22401id, MessageObject.getDialogId(messageArr[0])));
        }
    }

    public static void h0(org.telegram.ui.do0 r23, java.lang.String r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.do0.h0(org.telegram.ui.do0, java.lang.String, android.view.View):void");
    }

    public static void i0(do0 do0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(do0Var.currentAccount).sendRequest(new TL_account.getPassword(), new lh.n3(10, do0Var, z10), 8);
            return;
        }
        do0Var.H0(true, false);
        if (z10) {
            TL_account.Password password = do0Var.W;
            password.has_password = false;
            password.current_algo = null;
            do0Var.P.a(password);
            do0Var.finishFragment();
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (do0Var.getParentActivity() == null) {
                return;
            }
            do0Var.t0();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    do0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    do0Var.F0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                } else {
                    int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    do0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                    return;
                }
            }
            do0Var.Y = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(do0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new nl0(4, do0Var, str));
            String string = LocaleController.getString(R.string.YourEmailAlmostThereText);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.P = string;
            b2Var.N = LocaleController.getString(R.string.YourEmailAlmostThere);
            Dialog dialogShowDialog = do0Var.showDialog(b2Var);
            if (dialogShowDialog != null) {
                dialogShowDialog.setCanceledOnTouchOutside(false);
                dialogShowDialog.setCancelable(false);
            }
        }
    }

    public static void j0(org.telegram.ui.do0 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.do0.j0(org.telegram.ui.do0):void");
    }

    public static void k0(do0 do0Var) {
        if (UserConfig.getInstance(do0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(do0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(do0Var.currentAccount).getCurrentTime() + 60) {
            UserConfig.getInstance(do0Var.currentAccount).tmpPassword = null;
            UserConfig.getInstance(do0Var.currentAccount).saveConfig(false);
        }
        if (UserConfig.getInstance(do0Var.currentAccount).tmpPassword != null) {
            do0Var.z0();
            return;
        }
        if (do0Var.f37462f[1].length() == 0) {
            try {
                do0Var.f37462f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(do0Var.f37462f[1], 2.5f);
            return;
        }
        String string = do0Var.f37462f[1].getText().toString();
        do0Var.H0(true, true);
        do0Var.D0(true);
        TL_account.getPassword getpassword = new TL_account.getPassword();
        ConnectionsManager.getInstance(do0Var.currentAccount).sendRequest(getpassword, new z9(do0Var, string, getpassword, 28), (do0Var.S0 ? 8 : 0) | 2);
    }

    public static void m0(do0 do0Var) {
        if (do0Var.M0) {
            return;
        }
        do0Var.H0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        do0Var.E0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = do0Var.X0;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (do0Var.J0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = do0Var.getMessagesController().getInputPeer(do0Var.J0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = do0Var.J0.getId();
            do0Var.E0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = do0Var.K0;
            do0Var.E0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = do0Var.E0;
        tL_payments_validateRequestedInfo2.save = do0Var.P0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (do0Var.f37487y0.invoice.name_requested) {
            do0Var.E0.info.name = do0Var.f37462f[6].getText().toString();
            do0Var.E0.info.flags |= 1;
        }
        if (do0Var.f37487y0.invoice.phone_requested) {
            do0Var.E0.info.phone = "+" + do0Var.f37462f[8].getText().toString() + do0Var.f37462f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = do0Var.E0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (do0Var.f37487y0.invoice.email_requested) {
            do0Var.E0.info.email = do0Var.f37462f[7].getText().toString().trim();
            do0Var.E0.info.flags |= 4;
        }
        if (do0Var.f37487y0.invoice.shipping_address_requested) {
            do0Var.E0.info.shipping_address = new TLRPC.TL_postAddress();
            do0Var.E0.info.shipping_address.street_line1 = do0Var.f37462f[0].getText().toString();
            do0Var.E0.info.shipping_address.street_line2 = do0Var.f37462f[1].getText().toString();
            do0Var.E0.info.shipping_address.city = do0Var.f37462f[2].getText().toString();
            do0Var.E0.info.shipping_address.state = do0Var.f37462f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = do0Var.E0.info.shipping_address;
            String str = do0Var.f37485x0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = do0Var.f37462f[5].getText().toString();
            do0Var.E0.info.flags |= 8;
        }
        ConnectionsManager.getInstance(do0Var.currentAccount).sendRequest(do0Var.E0, new v80(13, do0Var, do0Var.E0), (do0Var.S0 ? 8 : 0) | 2);
    }

    public static JSONObject p0() throws JSONException {
        List listAsList = Arrays.asList("AMEX", "DISCOVER", "JCB", "MASTERCARD", "VISA");
        List listAsList2 = Arrays.asList("PAN_ONLY", "CRYPTOGRAM_3DS");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "CARD");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("allowedAuthMethods", new JSONArray((Collection) listAsList2));
        jSONObject2.put("allowedCardNetworks", new JSONArray((Collection) listAsList));
        jSONObject.put("parameters", jSONObject2);
        return jSONObject;
    }

    public final void A0(boolean z10) {
        String str;
        String str2;
        if (!z10 && this.O.getVisibility() == 0) {
            String text = this.O.getText();
            if (text.length() == 0) {
                org.telegram.ui.Cells.h3 h3Var = this.O;
                try {
                    h3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.shakeViewSpring(h3Var, 2.5f);
                return;
            } else {
                H0(true, true);
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = text;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new fn0(this, 0), 10);
                return;
            }
        }
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z10) {
            this.f37470n.setVisibility(0);
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.flags = 2;
            passwordinputsettings.email = "";
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            str = null;
            str2 = null;
        } else {
            String string = this.f37462f[0].getText().toString();
            if (TextUtils.isEmpty(string)) {
                E0(0);
                return;
            }
            if (!string.equals(this.f37462f[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                E0(1);
                return;
            }
            String string2 = this.f37462f[2].getText().toString();
            if (string2.length() < 3) {
                E0(2);
                return;
            }
            int iLastIndexOf = string2.lastIndexOf(46);
            int iLastIndexOf2 = string2.lastIndexOf(64);
            if (iLastIndexOf2 < 0 || iLastIndexOf < iLastIndexOf2) {
                E0(2);
                return;
            }
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            TL_account.passwordInputSettings passwordinputsettings2 = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings2;
            int i10 = passwordinputsettings2.flags;
            passwordinputsettings2.flags = i10 | 1;
            passwordinputsettings2.hint = "";
            passwordinputsettings2.new_algo = this.W.new_algo;
            passwordinputsettings2.flags = 3 | i10;
            passwordinputsettings2.email = string2.trim();
            str = string2;
            str2 = string;
        }
        H0(true, true);
        Utilities.globalQueue.postRunnable(new cg.j(this, z10, str, str2, updatepasswordsettings));
    }

    public final void B0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        org.telegram.ui.Cells.w8[] w8VarArr = this.U;
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
            i0.a.z(sb2, ", ", str4, ", ", str5);
            w8VarArr[2].b(R.drawable.msg_payment_address, a9.p.p(sb2, ", ", str6), LocaleController.getString(R.string.PaymentShippingAddress), true);
        }
        w8VarArr[2].setVisibility(tL_paymentRequestedInfo.shipping_address != null ? 0 : 8);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            w8VarArr[3].b(R.drawable.msg_contacts, str7, LocaleController.getString(R.string.PaymentCheckoutName), true);
        }
        w8VarArr[3].setVisibility(tL_paymentRequestedInfo.name != null ? 0 : 8);
        if (tL_paymentRequestedInfo.phone != null) {
            w8VarArr[4].b(R.drawable.msg_calls, oe.b.c().b(tL_paymentRequestedInfo.phone), LocaleController.getString(R.string.PaymentCheckoutPhoneNumber), (tL_paymentRequestedInfo.email == null && this.C0 == null) ? false : true);
        }
        w8VarArr[4].setVisibility(tL_paymentRequestedInfo.phone != null ? 0 : 8);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            w8VarArr[5].b(R.drawable.msg_mention, str8, LocaleController.getString(R.string.PaymentCheckoutEmail), this.C0 != null);
        }
        w8VarArr[5].setVisibility(tL_paymentRequestedInfo.email != null ? 0 : 8);
    }

    public final void C0(TL_account.Password password) {
        if (password == null || !password.has_password) {
            this.W = password;
            this.X = (password == null || TextUtils.isEmpty(password.email_unconfirmed_pattern)) ? false : true;
            J0();
        } else {
            if (getParentActivity() == null) {
                return;
            }
            t0();
        }
    }

    public final void D0(boolean z10) {
        this.L0 = z10;
        this.C = !z10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.L0);
        }
        org.telegram.ui.Cells.w8 w8Var = this.U[0];
        if (w8Var != null) {
            w8Var.setEnabled(!this.L0);
        }
    }

    public final void E0(int i10) {
        EditTextBoldCursor editTextBoldCursor = this.f37462f[i10];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(editTextBoldCursor, 2.5f);
    }

    public final void F0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = str;
        b2Var.P = str2;
        showDialog(b2Var);
    }

    public final void G0(Runnable runnable) {
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(getParentActivity(), null, false, false);
        e3Var.fixNavigationBar();
        e3Var.title = LocaleController.getString(R.string.PaymentCheckoutMethod);
        e3Var.bigTitle = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.f37480u0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
        } else {
            String str = this.f37479t0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_paymentSavedCredentialsCard> arrayList4 = this.f37487y0.saved_credentials;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i10);
            i10++;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard3 = tL_paymentSavedCredentialsCard2;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.f37480u0;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.f22509id, tL_paymentSavedCredentialsCard4.f22509id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
                arrayList3.add(tL_paymentSavedCredentialsCard3);
            }
        }
        ArrayList<TLRPC.TL_paymentFormMethod> arrayList5 = this.f37487y0.additional_methods;
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
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        org.telegram.ui.Components.w2 w2Var = new org.telegram.ui.Components.w2(this, runnable, arrayList3, arrayList, 1);
        e3Var.items = charSequenceArr;
        e3Var.itemIcons = iArr;
        e3Var.onClickListener = w2Var;
        showDialog(e3Var);
    }

    public final void H0(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i10 = 1;
        int i11 = 0;
        if (!z10 || this.f37470n == null) {
            if (this.Q != null) {
                this.v = new AnimatorSet();
                if (z11) {
                    this.f37477s.setVisibility(0);
                    this.S.setEnabled(false);
                    AnimatorSet animatorSet2 = this.v;
                    TextView textView = this.Q;
                    Property property = View.SCALE_X;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.1f);
                    TextView textView2 = this.Q;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.1f);
                    TextView textView3 = this.Q;
                    Property property3 = View.ALPHA;
                    animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.f37477s, (Property<org.telegram.ui.Components.hq, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f37477s, (Property<org.telegram.ui.Components.hq, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.f37477s, (Property<org.telegram.ui.Components.hq, Float>) property3, 1.0f));
                } else {
                    this.Q.setVisibility(0);
                    this.S.setEnabled(true);
                    AnimatorSet animatorSet3 = this.v;
                    org.telegram.ui.Components.hq hqVar = this.f37477s;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(hqVar, (Property<org.telegram.ui.Components.hq, Float>) property4, 0.1f);
                    org.telegram.ui.Components.hq hqVar2 = this.f37477s;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(hqVar2, (Property<org.telegram.ui.Components.hq, Float>) property5, 0.1f);
                    org.telegram.ui.Components.hq hqVar3 = this.f37477s;
                    Property property6 = View.ALPHA;
                    animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, ObjectAnimator.ofFloat(hqVar3, (Property<org.telegram.ui.Components.hq, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.Q, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.Q, (Property<TextView, Float>) property6, 1.0f));
                }
                this.v.addListener(new un0(this, z11, i10));
                this.v.setDuration(150L);
                this.v.start();
                return;
            }
            return;
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.v = animatorSet4;
        if (z11) {
            this.f37475r.setVisibility(0);
            this.f37470n.setEnabled(false);
            AnimatorSet animatorSet5 = this.v;
            View contentView = this.f37470n.getContentView();
            Property property7 = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(contentView, (Property<View, Float>) property7, 0.1f);
            View contentView2 = this.f37470n.getContentView();
            Property property8 = View.SCALE_Y;
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(contentView2, (Property<View, Float>) property8, 0.1f);
            View contentView3 = this.f37470n.getContentView();
            Property property9 = View.ALPHA;
            animatorSet5.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.f37475r, (Property<org.telegram.ui.Components.hq, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.f37475r, (Property<org.telegram.ui.Components.hq, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.f37475r, (Property<org.telegram.ui.Components.hq, Float>) property9, 1.0f));
        } else if (this.f37482w != null) {
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f37475r, (Property<org.telegram.ui.Components.hq, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.f37475r, (Property<org.telegram.ui.Components.hq, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.f37475r, (Property<org.telegram.ui.Components.hq, Float>) View.ALPHA, 0.0f));
        } else {
            this.f37470n.getContentView().setVisibility(0);
            this.f37470n.setEnabled(true);
            AnimatorSet animatorSet6 = this.v;
            org.telegram.ui.Components.hq hqVar4 = this.f37475r;
            Property property10 = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(hqVar4, (Property<org.telegram.ui.Components.hq, Float>) property10, 0.1f);
            org.telegram.ui.Components.hq hqVar5 = this.f37475r;
            Property property11 = View.SCALE_Y;
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(hqVar5, (Property<org.telegram.ui.Components.hq, Float>) property11, 0.1f);
            org.telegram.ui.Components.hq hqVar6 = this.f37475r;
            Property property12 = View.ALPHA;
            animatorSet6.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, ObjectAnimator.ofFloat(hqVar6, (Property<org.telegram.ui.Components.hq, Float>) property12, 0.0f));
            if (!isFinishing()) {
                this.v.playTogether(ObjectAnimator.ofFloat(this.f37470n.getContentView(), (Property<View, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.f37470n.getContentView(), (Property<View, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.f37470n.getContentView(), (Property<View, Float>) property12, 1.0f));
            }
        }
        this.v.addListener(new un0(this, z11, i11));
        this.v.setDuration(150L);
        this.v.start();
    }

    public final void I0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.PaymentTransactionReview);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("PaymentTransactionMessage2", R.string.PaymentTransactionMessage2, str, this.f37469l0, this.m0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new dn0(this, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
    }

    public final void J0() {
        if (this.f37474q0 == 6) {
            org.telegram.ui.Cells.x8[] x8VarArr = this.I;
            if (x8VarArr[2] == null) {
                return;
            }
            int i10 = 0;
            this.f37470n.setVisibility(0);
            TL_account.Password password = this.W;
            ArrayList arrayList = this.F;
            org.telegram.ui.Cells.j4[] j4VarArr = this.E;
            org.telegram.ui.Cells.x9[] x9VarArr = this.J;
            if (password == null) {
                H0(true, true);
                x8VarArr[2].setVisibility(8);
                x9VarArr[0].setVisibility(8);
                x9VarArr[1].setVisibility(8);
                this.O.setVisibility(8);
                j4VarArr[0].setVisibility(8);
                j4VarArr[1].setVisibility(8);
                x8VarArr[0].setVisibility(8);
                for (int i11 = 0; i11 < 3; i11++) {
                    ((View) this.f37462f[i11].getParent()).setVisibility(8);
                }
                while (i10 < arrayList.size()) {
                    ((View) arrayList.get(i10)).setVisibility(8);
                    i10++;
                }
                return;
            }
            H0(true, false);
            if (!this.X) {
                x8VarArr[2].setVisibility(8);
                x9VarArr[0].setVisibility(8);
                x9VarArr[1].setVisibility(8);
                x8VarArr[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                this.O.setVisibility(8);
                j4VarArr[0].setVisibility(0);
                j4VarArr[1].setVisibility(0);
                x8VarArr[0].setVisibility(0);
                for (int i12 = 0; i12 < 3; i12++) {
                    ((View) this.f37462f[i12].getParent()).setVisibility(0);
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((View) arrayList.get(i13)).setVisibility(0);
                }
                return;
            }
            org.telegram.ui.Cells.x8 x8Var = x8VarArr[2];
            int i14 = R.string.EmailPasswordConfirmText2;
            String str = this.W.email_unconfirmed_pattern;
            if (str == null) {
                str = "";
            }
            x8Var.setText(LocaleController.formatString("EmailPasswordConfirmText2", i14, str));
            x8VarArr[2].setVisibility(0);
            x9VarArr[0].setVisibility(0);
            x9VarArr[1].setVisibility(0);
            this.O.setVisibility(0);
            x8VarArr[1].setText("");
            j4VarArr[0].setVisibility(8);
            j4VarArr[1].setVisibility(8);
            x8VarArr[0].setVisibility(8);
            for (int i15 = 0; i15 < 3; i15++) {
                ((View) this.f37462f[i15].getParent()).setVisibility(8);
            }
            while (i10 < arrayList.size()) {
                ((View) arrayList.get(i10)).setVisibility(8);
                i10++;
            }
        }
    }

    public final void K0() {
        org.telegram.ui.Cells.x8[] x8VarArr = this.I;
        if (x8VarArr[0] != null) {
            org.telegram.ui.Cells.w6[] w6VarArr = this.G;
            if (w6VarArr[2] == null) {
                return;
            }
            TLRPC.PaymentForm paymentForm = this.f37487y0;
            if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.f37482w != null && this.f37481v0)) {
                this.H.setVisibility(8);
                x8VarArr[0].setVisibility(8);
                org.telegram.ui.Cells.w6 w6Var = w6VarArr[2];
                w6Var.setBackground(org.telegram.ui.ActionBar.g6.V0(w6Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine1));
            if (this.f37487y0.password_missing) {
                w0();
                spannableStringBuilder.append((CharSequence) "\n");
                int length = spannableStringBuilder.length();
                String string = LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine2);
                int iIndexOf = string.indexOf(42);
                int iLastIndexOf = string.lastIndexOf(42);
                spannableStringBuilder.append((CharSequence) string);
                if (iIndexOf != -1 && iLastIndexOf != -1) {
                    int i10 = iIndexOf + length;
                    int i11 = iLastIndexOf + length;
                    x8VarArr[0].getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(i11, i11 + 1, (CharSequence) "");
                    spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new ao0(this), i10, i11 - 1, 33);
                }
            }
            this.H.setEnabled(true);
            x8VarArr[0].setText(spannableStringBuilder);
            this.H.setVisibility(0);
            x8VarArr[0].setVisibility(0);
            org.telegram.ui.Cells.w6 w6Var2 = w6VarArr[2];
            w6Var2.setBackground(org.telegram.ui.ActionBar.g6.V0(w6Var2.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23018b7));
        }
    }

    public final void L0() {
        this.N0[0] = s0(this.f37473p0);
        this.N.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.N0[0], true);
        TextView textView = this.Q;
        if (textView != null) {
            textView.setText(LocaleController.formatString("PaymentCheckoutPay", R.string.PaymentCheckoutPay, this.N0[0]));
        }
        if (this.f37472o0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.ei);
            int childCount = this.f37472o0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                TextView textView2 = (TextView) this.f37472o0.getChildAt(i10);
                if (textView2.getTag().equals(this.D0)) {
                    org.telegram.ui.ActionBar.g6.w1(themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.fi));
                } else {
                    org.telegram.ui.ActionBar.g6.w1(536870911 & themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Z8));
                }
                textView2.invalidate();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        char c10;
        TLRPC.PaymentForm paymentForm;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.PaymentForm paymentForm2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo;
        boolean z10;
        int i11;
        int i12;
        char c11;
        int i13;
        int i14;
        TLRPC.TL_invoice tL_invoice;
        org.telegram.ui.Cells.w6 w6Var;
        org.telegram.ui.Cells.x8 x8Var;
        TLRPC.TL_invoice tL_invoice2;
        int i15;
        TLRPC.TL_invoice tL_invoice3;
        int i16;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo2;
        TLRPC.PaymentForm paymentForm3;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo3;
        String upperCase;
        String str;
        TelephonyManager telephonyManager;
        TLRPC.TL_invoice tL_invoice4;
        int i17;
        ?? frameLayout;
        int i18;
        boolean z11;
        TLRPC.TL_invoice tL_invoice5;
        int i19;
        int i20;
        TLRPC.TL_invoice tL_invoice6;
        TLRPC.User user;
        int i21;
        String name;
        boolean z12;
        boolean z13;
        TLRPC.User user2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo4;
        TLRPC.TL_postAddress tL_postAddress;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo5;
        TLRPC.TL_postAddress tL_postAddress2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo6;
        TLRPC.TL_postAddress tL_postAddress3;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo7;
        TLRPC.TL_postAddress tL_postAddress4;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo8;
        TLRPC.TL_postAddress tL_postAddress5;
        String str2;
        String str3;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo9;
        TLRPC.TL_postAddress tL_postAddress6;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo10;
        String str4;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo11;
        String str5;
        switch (this.f37474q0) {
            case 0:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentShippingInfo));
                break;
            case 1:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentShippingMethod));
                break;
            case 2:
            case 3:
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.B0;
                if (tL_paymentFormMethod == null || TextUtils.isEmpty(tL_paymentFormMethod.title)) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentCardInfo));
                } else {
                    this.actionBar.setTitle(this.B0.title);
                }
                break;
            case 4:
                if (this.f37487y0.invoice.test) {
                    this.actionBar.setTitle("Test " + LocaleController.getString(R.string.PaymentCheckout));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentCheckout));
                }
                break;
            case 5:
                if (this.f37487y0.invoice.test) {
                    this.actionBar.setTitle("Test " + LocaleController.getString(R.string.PaymentReceipt));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentReceipt));
                }
                break;
            case 6:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentPassword));
                break;
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new pn0(this));
        org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
        int i22 = this.f37474q0;
        int i23 = 6;
        int i24 = 3;
        if (i22 == 0 || i22 == 1 || i22 == 2 || i22 == 3 || i22 == 4 || i22 == 6) {
            this.f37470n = zVarN.h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.hq hqVar = new org.telegram.ui.Components.hq(context, 1);
            this.f37475r = hqVar;
            hqVar.setAlpha(0.0f);
            this.f37475r.setScaleX(0.1f);
            this.f37475r.setScaleY(0.1f);
            this.f37475r.setVisibility(4);
            this.f37470n.addView(this.f37475r, h7.z5.c(-1.0f, -1));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7));
        ScrollView scrollView = new ScrollView(context);
        this.A = scrollView;
        scrollView.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.A, getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8));
        frameLayout2.addView(this.A, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.f37474q0 == 4 ? 48.0f : 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.M = linearLayout;
        linearLayout.setOrientation(1);
        int i25 = 0;
        this.M.setClipChildren(false);
        this.A.addView(this.M, new FrameLayout.LayoutParams(-1, -2));
        int i26 = this.f37474q0;
        int i27 = 10;
        char c12 = 1;
        String name2 = "";
        int i28 = 9;
        if (i26 == 0) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        String[] strArrSplit = line.split(";");
                        this.f37451a.add(i25, strArrSplit[2]);
                        c11 = 0;
                        try {
                            this.f37454b.put(strArrSplit[2], strArrSplit[0]);
                            this.f37457c.put(strArrSplit[0], strArrSplit[2]);
                            map2.put(strArrSplit[1], strArrSplit[2]);
                            if (strArrSplit.length > 3) {
                                this.d.put(strArrSplit[0], strArrSplit[3]);
                            }
                            map.put(strArrSplit[1], strArrSplit[2]);
                            i25 = 0;
                        } catch (Exception e9) {
                            e = e9;
                        }
                    } else {
                        c11 = 0;
                        bufferedReader.close();
                        Collections.sort(this.f37451a, new org.telegram.ui.Components.lp0(9));
                        this.f37462f = new EditTextBoldCursor[10];
                        i13 = 0;
                        while (i13 < i27) {
                            if (i13 == 0) {
                                this.E[c11] = new org.telegram.ui.Cells.j4(context, this.U0);
                                this.E[c11].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                                this.E[c11].setText(LocaleController.getString(R.string.PaymentShippingAddress));
                                this.M.addView(this.E[c11], h7.z5.n(-1, -2));
                            } else if (i13 == i23) {
                                this.G[c11] = new org.telegram.ui.Cells.w6(context, (Object) null);
                                this.M.addView(this.G[c11], h7.z5.n(-1, -2));
                                this.E[c12] = new org.telegram.ui.Cells.j4(context, this.U0);
                                this.E[c12].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                                this.E[c12].setText(LocaleController.getString(R.string.PaymentShippingReceiver));
                                this.M.addView(this.E[c12], h7.z5.n(-1, -2));
                            }
                            if (i13 == 8) {
                                frameLayout = new LinearLayout(context);
                                frameLayout.setClipChildren(false);
                                frameLayout.setOrientation(0);
                                this.M.addView(frameLayout, h7.z5.n(-1, 50));
                                frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                            } else if (i13 == i28) {
                                frameLayout = (ViewGroup) this.f37462f[8].getParent();
                            } else {
                                frameLayout = new FrameLayout(context);
                                frameLayout.setClipChildren(false);
                                this.M.addView(frameLayout, h7.z5.n(-1, 50));
                                i18 = org.telegram.ui.ActionBar.g6.f23053d6;
                                frameLayout.setBackgroundColor(getThemedColor(i18));
                                if (i13 != 5) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (i13 != 7 && !this.f37487y0.invoice.phone_requested) {
                                        z11 = false;
                                    } else if (i13 == i23) {
                                        tL_invoice5 = this.f37487y0.invoice;
                                        if (!tL_invoice5.phone_requested && !tL_invoice5.email_requested) {
                                            z11 = false;
                                        }
                                    }
                                }
                                if (z11) {
                                    org.telegram.ui.Components.zm zmVar = new org.telegram.ui.Components.zm(context, 17);
                                    zmVar.setBackgroundColor(getThemedColor(i18));
                                    this.F.add(zmVar);
                                    frameLayout.addView(zmVar, new FrameLayout.LayoutParams(-1, 1, 83));
                                }
                            }
                            if (i13 == i28) {
                                this.f37462f[i13] = new org.telegram.ui.Components.u30(context);
                            } else {
                                this.f37462f[i13] = new EditTextBoldCursor(context);
                            }
                            this.f37462f[i13].setTag(Integer.valueOf(i13));
                            this.f37462f[i13].setTextSize(1, 16.0f);
                            this.f37462f[i13].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.H6));
                            EditTextBoldCursor editTextBoldCursor = this.f37462f[i13];
                            i19 = org.telegram.ui.ActionBar.g6.G6;
                            editTextBoldCursor.setTextColor(getThemedColor(i19));
                            this.f37462f[i13].setBackgroundDrawable(null);
                            this.f37462f[i13].setCursorColor(getThemedColor(i19));
                            this.f37462f[i13].setCursorSize(AndroidUtilities.dp(20.0f));
                            this.f37462f[i13].setCursorWidth(1.5f);
                            if (i13 == 4) {
                                final int i29 = 0;
                                this.f37462f[i13].setOnTouchListener(new View.OnTouchListener(this) {

                                    public final do0 f36578b;

                                    {
                                        this.f36578b = this;
                                    }

                                    @Override
                                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                                        switch (i29) {
                                            case 0:
                                                do0 do0Var = this.f36578b;
                                                if (do0Var.getParentActivity() == null) {
                                                    return false;
                                                }
                                                if (motionEvent.getAction() == 1) {
                                                    tt ttVar = new tt(null, false);
                                                    ttVar.f43009n = true;
                                                    ttVar.f43010r = new dn0(do0Var, 4);
                                                    do0Var.presentFragment(ttVar);
                                                }
                                                return true;
                                            default:
                                                do0 do0Var2 = this.f36578b;
                                                if (do0Var2.getParentActivity() == null) {
                                                    return false;
                                                }
                                                if (motionEvent.getAction() == 1) {
                                                    tt ttVar2 = new tt(null, false);
                                                    ttVar2.f43009n = true;
                                                    ttVar2.f43010r = new dn0(do0Var2, 2);
                                                    do0Var2.presentFragment(ttVar2);
                                                }
                                                return true;
                                        }
                                    }
                                });
                                this.f37462f[i13].setInputType(0);
                            }
                            if (i13 != i28 || i13 == 8) {
                                this.f37462f[i13].setInputType(i24);
                            } else if (i13 == 7) {
                                this.f37462f[i13].setInputType(1);
                            } else {
                                this.f37462f[i13].setInputType(16385);
                            }
                            this.f37462f[i13].setImeOptions(268435461);
                            switch (i13) {
                                case 0:
                                    this.f37462f[i13].setHint(LocaleController.getString(R.string.PaymentShippingAddress1Placeholder));
                                    tL_paymentRequestedInfo4 = this.f37487y0.saved_info;
                                    if (tL_paymentRequestedInfo4 != null && (tL_postAddress = tL_paymentRequestedInfo4.shipping_address) != null) {
                                        this.f37462f[i13].setText(tL_postAddress.street_line1);
                                    }
                                    break;
                                case 1:
                                    this.f37462f[i13].setHint(LocaleController.getString(R.string.PaymentShippingAddress2Placeholder));
                                    tL_paymentRequestedInfo5 = this.f37487y0.saved_info;
                                    if (tL_paymentRequestedInfo5 != null && (tL_postAddress2 = tL_paymentRequestedInfo5.shipping_address) != null) {
                                        this.f37462f[i13].setText(tL_postAddress2.street_line2);
                                    }
                                    break;
                                case 2:
                                    this.f37462f[i13].setHint(LocaleController.getString(R.string.PaymentShippingCityPlaceholder));
                                    tL_paymentRequestedInfo6 = this.f37487y0.saved_info;
                                    if (tL_paymentRequestedInfo6 != null && (tL_postAddress3 = tL_paymentRequestedInfo6.shipping_address) != null) {
                                        this.f37462f[i13].setText(tL_postAddress3.city);
                                    }
                                    break;
                                case 3:
                                    this.f37462f[i13].setHint(LocaleController.getString(R.string.PaymentShippingStatePlaceholder));
                                    tL_paymentRequestedInfo7 = this.f37487y0.saved_info;
                                    if (tL_paymentRequestedInfo7 != null && (tL_postAddress4 = tL_paymentRequestedInfo7.shipping_address) != null) {
                                        this.f37462f[i13].setText(tL_postAddress4.state);
                                    }
                                    break;
                                case 4:
                                    this.f37462f[i13].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                                    tL_paymentRequestedInfo8 = this.f37487y0.saved_info;
                                    if (tL_paymentRequestedInfo8 != null && (tL_postAddress5 = tL_paymentRequestedInfo8.shipping_address) != null) {
                                        str2 = (String) map2.get(tL_postAddress5.country_iso2);
                                        str3 = this.f37487y0.saved_info.shipping_address.country_iso2;
                                        this.f37485x0 = str3;
                                        EditTextBoldCursor editTextBoldCursor2 = this.f37462f[i13];
                                        if (str2 == null) {
                                            str2 = str3;
                                        }
                                        editTextBoldCursor2.setText(str2);
                                    }
                                    break;
                                case 5:
                                    this.f37462f[i13].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                                    tL_paymentRequestedInfo9 = this.f37487y0.saved_info;
                                    if (tL_paymentRequestedInfo9 != null && (tL_postAddress6 = tL_paymentRequestedInfo9.shipping_address) != null) {
                                        this.f37462f[i13].setText(tL_postAddress6.post_code);
                                    }
                                    break;
                                case 6:
                                    this.f37462f[i13].setHint(LocaleController.getString(R.string.PaymentShippingName));
                                    tL_paymentRequestedInfo10 = this.f37487y0.saved_info;
                                    if (tL_paymentRequestedInfo10 != null && (str4 = tL_paymentRequestedInfo10.name) != null) {
                                        this.f37462f[i13].setText(str4);
                                    }
                                    break;
                                case 7:
                                    this.f37462f[i13].setHint(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                                    tL_paymentRequestedInfo11 = this.f37487y0.saved_info;
                                    if (tL_paymentRequestedInfo11 != null && (str5 = tL_paymentRequestedInfo11.email) != null) {
                                        this.f37462f[i13].setText(str5);
                                    }
                                    break;
                            }
                            EditTextBoldCursor editTextBoldCursor3 = this.f37462f[i13];
                            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                            if (i13 == 8) {
                                TextView textView = new TextView(context);
                                this.D = textView;
                                textView.setText("+");
                                this.D.setTextColor(getThemedColor(i19));
                                this.D.setTextSize(1, 16.0f);
                                frameLayout.addView(this.D, h7.z5.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                                this.f37462f[i13].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                                this.f37462f[i13].setGravity(19);
                                this.f37462f[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                                frameLayout.addView(this.f37462f[i13], h7.z5.k(0.0f, 12.0f, 21.0f, 6.0f, 55, -2));
                                this.f37462f[i13].addTextChangedListener(new vn0(this));
                            } else if (i13 == i28) {
                                this.f37462f[i13].setPadding(0, 0, 0, 0);
                                this.f37462f[i13].setGravity(19);
                                frameLayout.addView(this.f37462f[i13], h7.z5.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                                this.f37462f[i13].addTextChangedListener(new tr(this, 4));
                            } else {
                                this.f37462f[i13].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                                EditTextBoldCursor editTextBoldCursor4 = this.f37462f[i13];
                                if (LocaleController.isRTL) {
                                    i20 = 5;
                                } else {
                                    i20 = 3;
                                }
                                editTextBoldCursor4.setGravity(i20);
                                frameLayout.addView(this.f37462f[i13], h7.z5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            }
                            final int i30 = 2;
                            this.f37462f[i13].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

                                public final do0 f36859b;

                                {
                                    this.f36859b = this;
                                }

                                @Override
                                public final boolean onEditorAction(TextView textView2, int i31, KeyEvent keyEvent) {
                                    EditTextBoldCursor[] editTextBoldCursorArr;
                                    switch (i30) {
                                        case 0:
                                            do0 do0Var = this.f36859b;
                                            if (i31 == 6) {
                                                do0Var.A0(false);
                                                return true;
                                            }
                                            do0Var.getClass();
                                            return false;
                                        case 1:
                                            do0 do0Var2 = this.f36859b;
                                            if (i31 == 6) {
                                                do0Var2.f37470n.performClick();
                                                return true;
                                            }
                                            do0Var2.getClass();
                                            if (i31 == 5) {
                                                int iIntValue = ((Integer) textView2.getTag()).intValue();
                                                if (iIntValue == 0) {
                                                    do0Var2.f37462f[1].requestFocus();
                                                } else if (iIntValue == 1) {
                                                    do0Var2.f37462f[2].requestFocus();
                                                }
                                            }
                                            return false;
                                        case 2:
                                            do0 do0Var3 = this.f36859b;
                                            do0Var3.getClass();
                                            if (i31 != 5) {
                                                if (i31 != 6) {
                                                    return false;
                                                }
                                                do0Var3.f37470n.performClick();
                                                return true;
                                            }
                                            int iIntValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                iIntValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = do0Var3.f37462f;
                                                if (iIntValue2 >= editTextBoldCursorArr2.length) {
                                                    return true;
                                                }
                                                if (iIntValue2 != 4 && ((View) editTextBoldCursorArr2[iIntValue2].getParent()).getVisibility() == 0) {
                                                    do0Var3.f37462f[iIntValue2].requestFocus();
                                                    return true;
                                                }
                                            }
                                            break;
                                        case 3:
                                            do0 do0Var4 = this.f36859b;
                                            do0Var4.getClass();
                                            if (i31 != 5) {
                                                if (i31 != 6) {
                                                    return false;
                                                }
                                                do0Var4.f37470n.performClick();
                                                return true;
                                            }
                                            int iIntValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i32 = iIntValue3 + 1;
                                                editTextBoldCursorArr = do0Var4.f37462f;
                                                if (i32 >= editTextBoldCursorArr.length) {
                                                    return true;
                                                }
                                                iIntValue3 = i32 == 4 ? iIntValue3 + 2 : i32;
                                            } while (((View) editTextBoldCursorArr[iIntValue3].getParent()).getVisibility() != 0);
                                            do0Var4.f37462f[iIntValue3].requestFocus();
                                            return true;
                                        default:
                                            do0 do0Var5 = this.f36859b;
                                            if (i31 == 6) {
                                                do0Var5.f37470n.performClick();
                                                return true;
                                            }
                                            do0Var5.getClass();
                                            return false;
                                    }
                                }
                            });
                            if (i13 == i28) {
                                tL_invoice6 = this.f37487y0.invoice;
                                if (!tL_invoice6.email_to_provider || tL_invoice6.phone_to_provider) {
                                    user = null;
                                    for (i21 = 0; i21 < this.f37487y0.users.size(); i21++) {
                                        user2 = this.f37487y0.users.get(i21);
                                        if (user2.f22527id == this.f37487y0.provider_id) {
                                            user = user2;
                                        }
                                    }
                                    if (user != null) {
                                        name = ContactsController.formatName(user.first_name, user.last_name);
                                    } else {
                                        name = "";
                                    }
                                    z12 = true;
                                    this.I[1] = new org.telegram.ui.Cells.x8(context, this.U0);
                                    this.I[1].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                                    this.M.addView(this.I[1], h7.z5.n(-1, -2));
                                    TLRPC.TL_invoice tL_invoice7 = this.f37487y0.invoice;
                                    z13 = tL_invoice7.email_to_provider;
                                    if (!z13 && tL_invoice7.phone_to_provider) {
                                        this.I[1].setText(LocaleController.formatString("PaymentPhoneEmailToProvider", R.string.PaymentPhoneEmailToProvider, name));
                                    } else if (z13) {
                                        this.I[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, name));
                                    } else {
                                        this.I[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, name));
                                    }
                                } else {
                                    this.G[1] = new org.telegram.ui.Cells.w6(context, (Object) null);
                                    this.M.addView(this.G[1], h7.z5.n(-1, -2));
                                    z12 = true;
                                }
                                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context, this.U0);
                                this.H = p8Var;
                                p8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(z12));
                                this.H.f(LocaleController.getString(R.string.PaymentShippingSave), this.P0, false);
                                this.M.addView(this.H, h7.z5.n(-1, -2));
                                this.H.setOnClickListener(new zm0(this, 8));
                                this.I[0] = new org.telegram.ui.Cells.x8(context, this.U0);
                                this.I[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                                this.I[0].setText(LocaleController.getString(R.string.PaymentShippingSaveInfo));
                                this.M.addView(this.I[0], h7.z5.n(-1, -2));
                            }
                            i13++;
                            i27 = 10;
                            i23 = 6;
                            i24 = 3;
                            i28 = 9;
                            c12 = 1;
                            c11 = 0;
                        }
                        if (this.f37487y0.invoice.name_requested) {
                            i14 = 8;
                        } else {
                            i14 = 8;
                            ((ViewGroup) this.f37462f[6].getParent()).setVisibility(8);
                        }
                        if (!this.f37487y0.invoice.phone_requested) {
                            ((ViewGroup) this.f37462f[i14].getParent()).setVisibility(i14);
                        }
                        if (!this.f37487y0.invoice.email_requested) {
                            ((ViewGroup) this.f37462f[7].getParent()).setVisibility(i14);
                        }
                        tL_invoice = this.f37487y0.invoice;
                        if (tL_invoice.phone_requested) {
                            this.f37462f[9].setImeOptions(268435462);
                        } else if (tL_invoice.email_requested) {
                            this.f37462f[7].setImeOptions(268435462);
                        } else if (tL_invoice.name_requested) {
                            this.f37462f[6].setImeOptions(268435462);
                        } else {
                            this.f37462f[5].setImeOptions(268435462);
                        }
                        w6Var = this.G[1];
                        if (w6Var != null) {
                            tL_invoice4 = this.f37487y0.invoice;
                            if (!tL_invoice4.name_requested || tL_invoice4.phone_requested || tL_invoice4.email_requested) {
                                i17 = 0;
                            } else {
                                i17 = 8;
                            }
                            w6Var.setVisibility(i17);
                        } else {
                            x8Var = this.I[1];
                            if (x8Var != null) {
                                tL_invoice2 = this.f37487y0.invoice;
                                if (!tL_invoice2.name_requested || tL_invoice2.phone_requested || tL_invoice2.email_requested) {
                                    i15 = 0;
                                } else {
                                    i15 = 8;
                                }
                                x8Var.setVisibility(i15);
                            }
                        }
                        org.telegram.ui.Cells.j4 j4Var = this.E[1];
                        tL_invoice3 = this.f37487y0.invoice;
                        if (!tL_invoice3.name_requested || tL_invoice3.phone_requested || tL_invoice3.email_requested) {
                            i16 = 0;
                        } else {
                            i16 = 8;
                        }
                        j4Var.setVisibility(i16);
                        if (!this.f37487y0.invoice.shipping_address_requested) {
                            this.E[0].setVisibility(8);
                            this.G[0].setVisibility(8);
                            ((ViewGroup) this.f37462f[0].getParent()).setVisibility(8);
                            ((ViewGroup) this.f37462f[1].getParent()).setVisibility(8);
                            ((ViewGroup) this.f37462f[2].getParent()).setVisibility(8);
                            ((ViewGroup) this.f37462f[3].getParent()).setVisibility(8);
                            ((ViewGroup) this.f37462f[4].getParent()).setVisibility(8);
                            ((ViewGroup) this.f37462f[5].getParent()).setVisibility(8);
                        }
                        tL_paymentRequestedInfo2 = this.f37487y0.saved_info;
                        if (tL_paymentRequestedInfo2 != null || TextUtils.isEmpty(tL_paymentRequestedInfo2.phone)) {
                            o0(null);
                        } else {
                            o0(this.f37487y0.saved_info.phone);
                        }
                        if (this.f37462f[8].length() == 0) {
                            paymentForm3 = this.f37487y0;
                            if (paymentForm3.invoice.phone_requested && ((tL_paymentRequestedInfo3 = paymentForm3.saved_info) == null || TextUtils.isEmpty(tL_paymentRequestedInfo3.phone))) {
                                try {
                                    telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                                    if (telephonyManager != null) {
                                        upperCase = telephonyManager.getSimCountryIso().toUpperCase();
                                    } else {
                                        upperCase = null;
                                    }
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                if (upperCase != null && (str = (String) map.get(upperCase)) != null && this.f37451a.indexOf(str) != -1) {
                                    this.f37462f[8].setText((CharSequence) this.f37454b.get(str));
                                }
                            }
                        }
                    }
                    e = e9;
                    FileLog.e(e);
                    Collections.sort(this.f37451a, new org.telegram.ui.Components.lp0(9));
                    this.f37462f = new EditTextBoldCursor[10];
                    i13 = 0;
                    while (i13 < i27) {
                        if (i13 == 0) {
                            this.E[c11] = new org.telegram.ui.Cells.j4(context, this.U0);
                            this.E[c11].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                            this.E[c11].setText(LocaleController.getString(R.string.PaymentShippingAddress));
                            this.M.addView(this.E[c11], h7.z5.n(-1, -2));
                        } else if (i13 == i23) {
                            this.G[c11] = new org.telegram.ui.Cells.w6(context, (Object) null);
                            this.M.addView(this.G[c11], h7.z5.n(-1, -2));
                            this.E[c12] = new org.telegram.ui.Cells.j4(context, this.U0);
                            this.E[c12].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                            this.E[c12].setText(LocaleController.getString(R.string.PaymentShippingReceiver));
                            this.M.addView(this.E[c12], h7.z5.n(-1, -2));
                        }
                        if (i13 == 8) {
                            frameLayout = new LinearLayout(context);
                            frameLayout.setClipChildren(false);
                            frameLayout.setOrientation(0);
                            this.M.addView(frameLayout, h7.z5.n(-1, 50));
                            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                        } else if (i13 == i28) {
                            frameLayout = (ViewGroup) this.f37462f[8].getParent();
                        } else {
                            frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(false);
                            this.M.addView(frameLayout, h7.z5.n(-1, 50));
                            i18 = org.telegram.ui.ActionBar.g6.f23053d6;
                            frameLayout.setBackgroundColor(getThemedColor(i18));
                            if (i13 != 5) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                if (i13 != 7) {
                                    if (i13 == i23) {
                                        tL_invoice5 = this.f37487y0.invoice;
                                        if (!tL_invoice5.phone_requested) {
                                            z11 = false;
                                        }
                                    }
                                } else if (i13 == i23) {
                                    tL_invoice5 = this.f37487y0.invoice;
                                    if (!tL_invoice5.phone_requested) {
                                        z11 = false;
                                    }
                                }
                            }
                            if (z11) {
                                org.telegram.ui.Components.zm zmVar2 = new org.telegram.ui.Components.zm(context, 17);
                                zmVar2.setBackgroundColor(getThemedColor(i18));
                                this.F.add(zmVar2);
                                frameLayout.addView(zmVar2, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                        }
                        if (i13 == i28) {
                            this.f37462f[i13] = new org.telegram.ui.Components.u30(context);
                        } else {
                            this.f37462f[i13] = new EditTextBoldCursor(context);
                        }
                        this.f37462f[i13].setTag(Integer.valueOf(i13));
                        this.f37462f[i13].setTextSize(1, 16.0f);
                        this.f37462f[i13].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.H6));
                        EditTextBoldCursor editTextBoldCursor5 = this.f37462f[i13];
                        i19 = org.telegram.ui.ActionBar.g6.G6;
                        editTextBoldCursor5.setTextColor(getThemedColor(i19));
                        this.f37462f[i13].setBackgroundDrawable(null);
                        this.f37462f[i13].setCursorColor(getThemedColor(i19));
                        this.f37462f[i13].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f37462f[i13].setCursorWidth(1.5f);
                        if (i13 == 4) {
                            final int i210 = 0;
                            this.f37462f[i13].setOnTouchListener(new View.OnTouchListener(this) {

                                public final do0 f36578b;

                                {
                                    this.f36578b = this;
                                }

                                @Override
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i210) {
                                        case 0:
                                            do0 do0Var = this.f36578b;
                                            if (do0Var.getParentActivity() == null) {
                                                return false;
                                            }
                                            if (motionEvent.getAction() == 1) {
                                                tt ttVar = new tt(null, false);
                                                ttVar.f43009n = true;
                                                ttVar.f43010r = new dn0(do0Var, 4);
                                                do0Var.presentFragment(ttVar);
                                            }
                                            return true;
                                        default:
                                            do0 do0Var2 = this.f36578b;
                                            if (do0Var2.getParentActivity() == null) {
                                                return false;
                                            }
                                            if (motionEvent.getAction() == 1) {
                                                tt ttVar2 = new tt(null, false);
                                                ttVar2.f43009n = true;
                                                ttVar2.f43010r = new dn0(do0Var2, 2);
                                                do0Var2.presentFragment(ttVar2);
                                            }
                                            return true;
                                    }
                                }
                            });
                            this.f37462f[i13].setInputType(0);
                        }
                        if (i13 != i28) {
                            this.f37462f[i13].setInputType(i24);
                        } else {
                            this.f37462f[i13].setInputType(i24);
                        }
                        this.f37462f[i13].setImeOptions(268435461);
                        switch (i13) {
                            case 0:
                                this.f37462f[i13].setHint(LocaleController.getString(R.string.PaymentShippingAddress1Placeholder));
                                tL_paymentRequestedInfo4 = this.f37487y0.saved_info;
                                if (tL_paymentRequestedInfo4 != null) {
                                    this.f37462f[i13].setText(tL_postAddress.street_line1);
                                }
                                break;
                            case 1:
                                this.f37462f[i13].setHint(LocaleController.getString(R.string.PaymentShippingAddress2Placeholder));
                                tL_paymentRequestedInfo5 = this.f37487y0.saved_info;
                                if (tL_paymentRequestedInfo5 != null) {
                                    this.f37462f[i13].setText(tL_postAddress2.street_line2);
                                }
                                break;
                            case 2:
                                this.f37462f[i13].setHint(LocaleController.getString(R.string.PaymentShippingCityPlaceholder));
                                tL_paymentRequestedInfo6 = this.f37487y0.saved_info;
                                if (tL_paymentRequestedInfo6 != null) {
                                    this.f37462f[i13].setText(tL_postAddress3.city);
                                }
                                break;
                            case 3:
                                this.f37462f[i13].setHint(LocaleController.getString(R.string.PaymentShippingStatePlaceholder));
                                tL_paymentRequestedInfo7 = this.f37487y0.saved_info;
                                if (tL_paymentRequestedInfo7 != null) {
                                    this.f37462f[i13].setText(tL_postAddress4.state);
                                }
                                break;
                            case 4:
                                this.f37462f[i13].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                                tL_paymentRequestedInfo8 = this.f37487y0.saved_info;
                                if (tL_paymentRequestedInfo8 != null) {
                                    str2 = (String) map2.get(tL_postAddress5.country_iso2);
                                    str3 = this.f37487y0.saved_info.shipping_address.country_iso2;
                                    this.f37485x0 = str3;
                                    EditTextBoldCursor editTextBoldCursor6 = this.f37462f[i13];
                                    if (str2 == null) {
                                        str2 = str3;
                                    }
                                    editTextBoldCursor6.setText(str2);
                                }
                                break;
                            case 5:
                                this.f37462f[i13].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                                tL_paymentRequestedInfo9 = this.f37487y0.saved_info;
                                if (tL_paymentRequestedInfo9 != null) {
                                    this.f37462f[i13].setText(tL_postAddress6.post_code);
                                }
                                break;
                            case 6:
                                this.f37462f[i13].setHint(LocaleController.getString(R.string.PaymentShippingName));
                                tL_paymentRequestedInfo10 = this.f37487y0.saved_info;
                                if (tL_paymentRequestedInfo10 != null) {
                                    this.f37462f[i13].setText(str4);
                                }
                                break;
                            case 7:
                                this.f37462f[i13].setHint(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                                tL_paymentRequestedInfo11 = this.f37487y0.saved_info;
                                if (tL_paymentRequestedInfo11 != null) {
                                    this.f37462f[i13].setText(str5);
                                }
                                break;
                        }
                        EditTextBoldCursor editTextBoldCursor7 = this.f37462f[i13];
                        editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
                        if (i13 == 8) {
                            TextView textView2 = new TextView(context);
                            this.D = textView2;
                            textView2.setText("+");
                            this.D.setTextColor(getThemedColor(i19));
                            this.D.setTextSize(1, 16.0f);
                            frameLayout.addView(this.D, h7.z5.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                            this.f37462f[i13].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                            this.f37462f[i13].setGravity(19);
                            this.f37462f[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                            frameLayout.addView(this.f37462f[i13], h7.z5.k(0.0f, 12.0f, 21.0f, 6.0f, 55, -2));
                            this.f37462f[i13].addTextChangedListener(new vn0(this));
                        } else if (i13 == i28) {
                            this.f37462f[i13].setPadding(0, 0, 0, 0);
                            this.f37462f[i13].setGravity(19);
                            frameLayout.addView(this.f37462f[i13], h7.z5.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                            this.f37462f[i13].addTextChangedListener(new tr(this, 4));
                        } else {
                            this.f37462f[i13].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                            EditTextBoldCursor editTextBoldCursor8 = this.f37462f[i13];
                            if (LocaleController.isRTL) {
                                i20 = 5;
                            } else {
                                i20 = 3;
                            }
                            editTextBoldCursor8.setGravity(i20);
                            frameLayout.addView(this.f37462f[i13], h7.z5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        }
                        final int i31 = 2;
                        this.f37462f[i13].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

                            public final do0 f36859b;

                            {
                                this.f36859b = this;
                            }

                            @Override
                            public final boolean onEditorAction(TextView textView3, int i32, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i31) {
                                    case 0:
                                        do0 do0Var = this.f36859b;
                                        if (i32 == 6) {
                                            do0Var.A0(false);
                                            return true;
                                        }
                                        do0Var.getClass();
                                        return false;
                                    case 1:
                                        do0 do0Var2 = this.f36859b;
                                        if (i32 == 6) {
                                            do0Var2.f37470n.performClick();
                                            return true;
                                        }
                                        do0Var2.getClass();
                                        if (i32 == 5) {
                                            int iIntValue = ((Integer) textView3.getTag()).intValue();
                                            if (iIntValue == 0) {
                                                do0Var2.f37462f[1].requestFocus();
                                            } else if (iIntValue == 1) {
                                                do0Var2.f37462f[2].requestFocus();
                                            }
                                        }
                                        return false;
                                    case 2:
                                        do0 do0Var3 = this.f36859b;
                                        do0Var3.getClass();
                                        if (i32 != 5) {
                                            if (i32 != 6) {
                                                return false;
                                            }
                                            do0Var3.f37470n.performClick();
                                            return true;
                                        }
                                        int iIntValue2 = ((Integer) textView3.getTag()).intValue();
                                        while (true) {
                                            iIntValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = do0Var3.f37462f;
                                            if (iIntValue2 >= editTextBoldCursorArr2.length) {
                                                return true;
                                            }
                                            if (iIntValue2 != 4 && ((View) editTextBoldCursorArr2[iIntValue2].getParent()).getVisibility() == 0) {
                                                do0Var3.f37462f[iIntValue2].requestFocus();
                                                return true;
                                            }
                                        }
                                        break;
                                    case 3:
                                        do0 do0Var4 = this.f36859b;
                                        do0Var4.getClass();
                                        if (i32 != 5) {
                                            if (i32 != 6) {
                                                return false;
                                            }
                                            do0Var4.f37470n.performClick();
                                            return true;
                                        }
                                        int iIntValue3 = ((Integer) textView3.getTag()).intValue();
                                        do {
                                            int i33 = iIntValue3 + 1;
                                            editTextBoldCursorArr = do0Var4.f37462f;
                                            if (i33 >= editTextBoldCursorArr.length) {
                                                return true;
                                            }
                                            iIntValue3 = i33 == 4 ? iIntValue3 + 2 : i33;
                                        } while (((View) editTextBoldCursorArr[iIntValue3].getParent()).getVisibility() != 0);
                                        do0Var4.f37462f[iIntValue3].requestFocus();
                                        return true;
                                    default:
                                        do0 do0Var5 = this.f36859b;
                                        if (i32 == 6) {
                                            do0Var5.f37470n.performClick();
                                            return true;
                                        }
                                        do0Var5.getClass();
                                        return false;
                                }
                            }
                        });
                        if (i13 == i28) {
                            tL_invoice6 = this.f37487y0.invoice;
                            if (tL_invoice6.email_to_provider) {
                                user = null;
                                while (i21 < this.f37487y0.users.size()) {
                                    user2 = this.f37487y0.users.get(i21);
                                    if (user2.f22527id == this.f37487y0.provider_id) {
                                        user = user2;
                                    }
                                }
                                if (user != null) {
                                    name = ContactsController.formatName(user.first_name, user.last_name);
                                } else {
                                    name = "";
                                }
                                z12 = true;
                                this.I[1] = new org.telegram.ui.Cells.x8(context, this.U0);
                                this.I[1].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                                this.M.addView(this.I[1], h7.z5.n(-1, -2));
                                TLRPC.TL_invoice tL_invoice8 = this.f37487y0.invoice;
                                z13 = tL_invoice8.email_to_provider;
                                if (!z13) {
                                    if (z13) {
                                        this.I[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, name));
                                    } else {
                                        this.I[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, name));
                                    }
                                } else if (z13) {
                                    this.I[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, name));
                                } else {
                                    this.I[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, name));
                                }
                            } else {
                                user = null;
                                while (i21 < this.f37487y0.users.size()) {
                                    user2 = this.f37487y0.users.get(i21);
                                    if (user2.f22527id == this.f37487y0.provider_id) {
                                        user = user2;
                                    }
                                }
                                if (user != null) {
                                    name = ContactsController.formatName(user.first_name, user.last_name);
                                } else {
                                    name = "";
                                }
                                z12 = true;
                                this.I[1] = new org.telegram.ui.Cells.x8(context, this.U0);
                                this.I[1].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                                this.M.addView(this.I[1], h7.z5.n(-1, -2));
                                TLRPC.TL_invoice tL_invoice9 = this.f37487y0.invoice;
                                z13 = tL_invoice9.email_to_provider;
                                if (!z13) {
                                    if (z13) {
                                        this.I[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, name));
                                    } else {
                                        this.I[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, name));
                                    }
                                } else if (z13) {
                                    this.I[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, name));
                                } else {
                                    this.I[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, name));
                                }
                            }
                            org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(context, this.U0);
                            this.H = p8Var2;
                            p8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(z12));
                            this.H.f(LocaleController.getString(R.string.PaymentShippingSave), this.P0, false);
                            this.M.addView(this.H, h7.z5.n(-1, -2));
                            this.H.setOnClickListener(new zm0(this, 8));
                            this.I[0] = new org.telegram.ui.Cells.x8(context, this.U0);
                            this.I[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                            this.I[0].setText(LocaleController.getString(R.string.PaymentShippingSaveInfo));
                            this.M.addView(this.I[0], h7.z5.n(-1, -2));
                        }
                        i13++;
                        i27 = 10;
                        i23 = 6;
                        i24 = 3;
                        i28 = 9;
                        c12 = 1;
                        c11 = 0;
                    }
                    if (this.f37487y0.invoice.name_requested) {
                        i14 = 8;
                        ((ViewGroup) this.f37462f[6].getParent()).setVisibility(8);
                    } else {
                        i14 = 8;
                    }
                    if (!this.f37487y0.invoice.phone_requested) {
                        ((ViewGroup) this.f37462f[i14].getParent()).setVisibility(i14);
                    }
                    if (!this.f37487y0.invoice.email_requested) {
                        ((ViewGroup) this.f37462f[7].getParent()).setVisibility(i14);
                    }
                    tL_invoice = this.f37487y0.invoice;
                    if (tL_invoice.phone_requested) {
                        this.f37462f[9].setImeOptions(268435462);
                    } else if (tL_invoice.email_requested) {
                        this.f37462f[7].setImeOptions(268435462);
                    } else if (tL_invoice.name_requested) {
                        this.f37462f[6].setImeOptions(268435462);
                    } else {
                        this.f37462f[5].setImeOptions(268435462);
                    }
                    w6Var = this.G[1];
                    if (w6Var != null) {
                        tL_invoice4 = this.f37487y0.invoice;
                        if (tL_invoice4.name_requested) {
                            i17 = 0;
                        } else {
                            i17 = 0;
                        }
                        w6Var.setVisibility(i17);
                    } else {
                        x8Var = this.I[1];
                        if (x8Var != null) {
                            tL_invoice2 = this.f37487y0.invoice;
                            if (tL_invoice2.name_requested) {
                                i15 = 0;
                            } else {
                                i15 = 0;
                            }
                            x8Var.setVisibility(i15);
                        }
                    }
                    org.telegram.ui.Cells.j4 j4Var2 = this.E[1];
                    tL_invoice3 = this.f37487y0.invoice;
                    if (tL_invoice3.name_requested) {
                        i16 = 0;
                    } else {
                        i16 = 0;
                    }
                    j4Var2.setVisibility(i16);
                    if (!this.f37487y0.invoice.shipping_address_requested) {
                        this.E[0].setVisibility(8);
                        this.G[0].setVisibility(8);
                        ((ViewGroup) this.f37462f[0].getParent()).setVisibility(8);
                        ((ViewGroup) this.f37462f[1].getParent()).setVisibility(8);
                        ((ViewGroup) this.f37462f[2].getParent()).setVisibility(8);
                        ((ViewGroup) this.f37462f[3].getParent()).setVisibility(8);
                        ((ViewGroup) this.f37462f[4].getParent()).setVisibility(8);
                        ((ViewGroup) this.f37462f[5].getParent()).setVisibility(8);
                    }
                    tL_paymentRequestedInfo2 = this.f37487y0.saved_info;
                    if (tL_paymentRequestedInfo2 != null) {
                        o0(null);
                    } else {
                        o0(null);
                    }
                    if (this.f37462f[8].length() == 0) {
                        paymentForm3 = this.f37487y0;
                        if (paymentForm3.invoice.phone_requested) {
                            telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                            if (telephonyManager != null) {
                                upperCase = telephonyManager.getSimCountryIso().toUpperCase();
                            } else {
                                upperCase = null;
                            }
                            if (upperCase != null) {
                                this.f37462f[8].setText((CharSequence) this.f37454b.get(str));
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e = e11;
                c11 = 0;
            }
        } else {
            int i32 = 9;
            if (i26 == 2) {
                if (this.f37487y0.native_params != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(this.f37487y0.native_params.data);
                        String strOptString = jSONObject.optString("google_pay_public_key");
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.G0 = strOptString;
                        }
                        this.H0 = jSONObject.optString("acquirer_bank_country");
                        this.I0 = jSONObject.optJSONObject("gpay_parameters");
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                }
                if (this.O0 || this.B0 != null) {
                    if (this.G0 != null || this.I0 != null) {
                        v0(context);
                    }
                    n0(context);
                    this.M.addView(this.K, h7.z5.n(-1, 50));
                    this.f37481v0 = true;
                    H0(true, true);
                    this.f37475r.setVisibility(0);
                    this.f37470n.setEnabled(false);
                    this.f37470n.getContentView().setVisibility(4);
                    AndroidUtilities.checkAndroidTheme(context, true);
                    org.telegram.ui.Components.b81 b81Var = new org.telegram.ui.Components.b81(this, context);
                    this.f37482w = b81Var;
                    b81Var.getSettings().setJavaScriptEnabled(true);
                    this.f37482w.getSettings().setDomStorageEnabled(true);
                    this.f37482w.getSettings().setSupportZoom(true);
                    this.f37482w.getSettings().setBuiltInZoomControls(true);
                    this.f37482w.getSettings().setDisplayZoomControls(false);
                    this.f37482w.getSettings().setUseWideViewPort(true);
                    this.f37482w.getSettings().setMixedContentMode(0);
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.f37482w, true);
                    this.f37482w.addJavascriptInterface(new PaymentFormActivity$TelegramWebviewProxy(this), "TelegramWebviewProxy");
                    this.f37482w.setWebViewClient(new wn0(this, context));
                    this.M.addView(this.f37482w, h7.z5.c(-2.0f, -1));
                    this.G[2] = new org.telegram.ui.Cells.w6(context, (Object) null);
                    this.M.addView(this.G[2], h7.z5.n(-1, -2));
                    org.telegram.ui.Cells.p8 p8Var3 = new org.telegram.ui.Cells.p8(context, this.U0);
                    this.H = p8Var3;
                    p8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                    this.H.f(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.Q0, false);
                    this.M.addView(this.H, h7.z5.n(-1, -2));
                    this.H.setOnClickListener(new zm0(this, i32));
                    this.I[0] = new org.telegram.ui.Cells.x8(context, this.U0);
                    this.I[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                    K0();
                    this.M.addView(this.I[0], h7.z5.n(-1, -2));
                } else {
                    if (this.f37487y0.native_params != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(this.f37487y0.native_params.data);
                            try {
                                this.f37458c0 = jSONObject2.getBoolean("need_country");
                            } catch (Exception unused) {
                                this.f37458c0 = false;
                            }
                            try {
                                this.f37459d0 = jSONObject2.getBoolean("need_zip");
                            } catch (Exception unused2) {
                                this.f37459d0 = false;
                            }
                            try {
                                this.f37461e0 = jSONObject2.getBoolean("need_cardholder_name");
                            } catch (Exception unused3) {
                                this.f37461e0 = false;
                            }
                            if (jSONObject2.has("public_token")) {
                                this.f37463f0 = jSONObject2.getString("public_token");
                            } else {
                                try {
                                    this.f37463f0 = jSONObject2.getString("publishable_key");
                                } catch (Exception unused4) {
                                    this.f37463f0 = "";
                                }
                            }
                            this.f37464g0 = !jSONObject2.optBoolean("google_pay_hidden", false);
                        } catch (Exception e13) {
                            FileLog.e(e13);
                        }
                    }
                    if (this.f37464g0 && ((!TextUtils.isEmpty(this.f37463f0) && "stripe".equals(this.f37487y0.native_provider)) || this.I0 != null)) {
                        v0(context);
                    }
                    this.f37462f = new EditTextBoldCursor[6];
                    int i33 = 0;
                    for (int i34 = 6; i33 < i34; i34 = 6) {
                        if (i33 == 0) {
                            this.E[0] = new org.telegram.ui.Cells.j4(context, this.U0);
                            this.E[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                            this.E[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                            this.M.addView(this.E[0], h7.z5.n(-1, -2));
                        } else if (i33 == 4) {
                            this.E[1] = new org.telegram.ui.Cells.j4(context, this.U0);
                            this.E[1].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                            this.E[1].setText(LocaleController.getString(R.string.PaymentBillingAddress));
                            this.M.addView(this.E[1], h7.z5.n(-1, -2));
                        }
                        boolean z14 = (i33 == 3 || i33 == 5 || (i33 == 4 && !this.f37459d0)) ? false : true;
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        frameLayout3.setClipChildren(false);
                        int i35 = org.telegram.ui.ActionBar.g6.f23053d6;
                        frameLayout3.setBackgroundColor(getThemedColor(i35));
                        this.M.addView(frameLayout3, h7.z5.n(-1, 50));
                        this.f37462f[i33] = new EditTextBoldCursor(context);
                        this.f37462f[i33].setTag(Integer.valueOf(i33));
                        this.f37462f[i33].setTextSize(1, 16.0f);
                        this.f37462f[i33].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.H6));
                        EditTextBoldCursor editTextBoldCursor9 = this.f37462f[i33];
                        int i36 = org.telegram.ui.ActionBar.g6.G6;
                        editTextBoldCursor9.setTextColor(getThemedColor(i36));
                        this.f37462f[i33].setBackgroundDrawable(null);
                        this.f37462f[i33].setCursorColor(getThemedColor(i36));
                        this.f37462f[i33].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f37462f[i33].setCursorWidth(1.5f);
                        if (i33 == 3) {
                            this.f37462f[i33].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                            this.f37462f[i33].setInputType(130);
                            this.f37462f[i33].setTypeface(Typeface.DEFAULT);
                            this.f37462f[i33].setTransformationMethod(PasswordTransformationMethod.getInstance());
                        } else if (i33 == 0) {
                            this.f37462f[i33].setInputType(3);
                        } else if (i33 == 4) {
                            final int i37 = 1;
                            this.f37462f[i33].setOnTouchListener(new View.OnTouchListener(this) {

                                public final do0 f36578b;

                                {
                                    this.f36578b = this;
                                }

                                @Override
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i37) {
                                        case 0:
                                            do0 do0Var = this.f36578b;
                                            if (do0Var.getParentActivity() == null) {
                                                return false;
                                            }
                                            if (motionEvent.getAction() == 1) {
                                                tt ttVar = new tt(null, false);
                                                ttVar.f43009n = true;
                                                ttVar.f43010r = new dn0(do0Var, 4);
                                                do0Var.presentFragment(ttVar);
                                            }
                                            return true;
                                        default:
                                            do0 do0Var2 = this.f36578b;
                                            if (do0Var2.getParentActivity() == null) {
                                                return false;
                                            }
                                            if (motionEvent.getAction() == 1) {
                                                tt ttVar2 = new tt(null, false);
                                                ttVar2.f43009n = true;
                                                ttVar2.f43010r = new dn0(do0Var2, 2);
                                                do0Var2.presentFragment(ttVar2);
                                            }
                                            return true;
                                    }
                                }
                            });
                            this.f37462f[i33].setInputType(0);
                        } else if (i33 == 1) {
                            this.f37462f[i33].setInputType(16386);
                        } else {
                            if (i33 == 2) {
                                this.f37462f[i33].setInputType(4097);
                            } else {
                                this.f37462f[i33].setInputType(16385);
                            }
                            this.f37462f[i33].setImeOptions(268435461);
                            if (i33 != 0) {
                                this.f37462f[i33].setHint(LocaleController.getString(R.string.PaymentCardNumber));
                            } else if (i33 != 1) {
                                this.f37462f[i33].setHint(LocaleController.getString(R.string.PaymentCardExpireDate));
                            } else if (i33 != 2) {
                                this.f37462f[i33].setHint(LocaleController.getString(R.string.PaymentCardName));
                            } else if (i33 != 3) {
                                this.f37462f[i33].setHint(LocaleController.getString(R.string.PaymentCardCvv));
                            } else if (i33 != 4) {
                                this.f37462f[i33].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                            } else if (i33 == 5) {
                                this.f37462f[i33].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                            }
                            if (i33 == 0) {
                                this.f37462f[i33].addTextChangedListener(new xn0(this));
                            } else if (i33 == 1) {
                                this.f37462f[i33].addTextChangedListener(new yn0(this));
                            }
                            this.f37462f[i33].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                            EditTextBoldCursor editTextBoldCursor10 = this.f37462f[i33];
                            if (LocaleController.isRTL) {
                                i11 = 5;
                            } else {
                                i11 = 3;
                            }
                            editTextBoldCursor10.setGravity(i11);
                            frameLayout3.addView(this.f37462f[i33], h7.z5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            final int i38 = 3;
                            this.f37462f[i33].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

                                public final do0 f36859b;

                                {
                                    this.f36859b = this;
                                }

                                @Override
                                public final boolean onEditorAction(TextView textView3, int i39, KeyEvent keyEvent) {
                                    EditTextBoldCursor[] editTextBoldCursorArr;
                                    switch (i38) {
                                        case 0:
                                            do0 do0Var = this.f36859b;
                                            if (i39 == 6) {
                                                do0Var.A0(false);
                                                return true;
                                            }
                                            do0Var.getClass();
                                            return false;
                                        case 1:
                                            do0 do0Var2 = this.f36859b;
                                            if (i39 == 6) {
                                                do0Var2.f37470n.performClick();
                                                return true;
                                            }
                                            do0Var2.getClass();
                                            if (i39 == 5) {
                                                int iIntValue = ((Integer) textView3.getTag()).intValue();
                                                if (iIntValue == 0) {
                                                    do0Var2.f37462f[1].requestFocus();
                                                } else if (iIntValue == 1) {
                                                    do0Var2.f37462f[2].requestFocus();
                                                }
                                            }
                                            return false;
                                        case 2:
                                            do0 do0Var3 = this.f36859b;
                                            do0Var3.getClass();
                                            if (i39 != 5) {
                                                if (i39 != 6) {
                                                    return false;
                                                }
                                                do0Var3.f37470n.performClick();
                                                return true;
                                            }
                                            int iIntValue2 = ((Integer) textView3.getTag()).intValue();
                                            while (true) {
                                                iIntValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = do0Var3.f37462f;
                                                if (iIntValue2 >= editTextBoldCursorArr2.length) {
                                                    return true;
                                                }
                                                if (iIntValue2 != 4 && ((View) editTextBoldCursorArr2[iIntValue2].getParent()).getVisibility() == 0) {
                                                    do0Var3.f37462f[iIntValue2].requestFocus();
                                                    return true;
                                                }
                                            }
                                            break;
                                        case 3:
                                            do0 do0Var4 = this.f36859b;
                                            do0Var4.getClass();
                                            if (i39 != 5) {
                                                if (i39 != 6) {
                                                    return false;
                                                }
                                                do0Var4.f37470n.performClick();
                                                return true;
                                            }
                                            int iIntValue3 = ((Integer) textView3.getTag()).intValue();
                                            do {
                                                int i310 = iIntValue3 + 1;
                                                editTextBoldCursorArr = do0Var4.f37462f;
                                                if (i310 >= editTextBoldCursorArr.length) {
                                                    return true;
                                                }
                                                iIntValue3 = i310 == 4 ? iIntValue3 + 2 : i310;
                                            } while (((View) editTextBoldCursorArr[iIntValue3].getParent()).getVisibility() != 0);
                                            do0Var4.f37462f[iIntValue3].requestFocus();
                                            return true;
                                        default:
                                            do0 do0Var5 = this.f36859b;
                                            if (i39 == 6) {
                                                do0Var5.f37470n.performClick();
                                                return true;
                                            }
                                            do0Var5.getClass();
                                            return false;
                                    }
                                }
                            });
                            if (i33 == 3) {
                                this.G[0] = new org.telegram.ui.Cells.w6(context, (Object) null);
                                this.M.addView(this.G[0], h7.z5.n(-1, -2));
                            } else if (i33 == 5) {
                                this.G[2] = new org.telegram.ui.Cells.w6(context, (Object) null);
                                this.M.addView(this.G[2], h7.z5.n(-1, -2));
                                org.telegram.ui.Cells.p8 p8Var4 = new org.telegram.ui.Cells.p8(context, this.U0);
                                this.H = p8Var4;
                                p8Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                                this.H.f(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.Q0, false);
                                this.M.addView(this.H, h7.z5.n(-1, -2));
                                this.H.setOnClickListener(new zm0(this, 10));
                                this.I[0] = new org.telegram.ui.Cells.x8(context, this.U0);
                                this.I[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                                K0();
                                this.M.addView(this.I[0], h7.z5.n(-1, -2));
                            } else if (i33 == 0) {
                                n0(context);
                                FrameLayout frameLayout4 = this.K;
                                if (LocaleController.isRTL) {
                                    i12 = 3;
                                } else {
                                    i12 = 5;
                                }
                                frameLayout3.addView(frameLayout4, h7.z5.d(-2, -2.0f, i12 | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                            }
                            if (z14) {
                                org.telegram.ui.Components.zm zmVar3 = new org.telegram.ui.Components.zm(context, 18);
                                zmVar3.setBackgroundColor(getThemedColor(i35));
                                this.F.add(zmVar3);
                                frameLayout3.addView(zmVar3, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                            if ((i33 != 4 && !this.f37458c0) || ((i33 == 5 && !this.f37459d0) || (i33 == 2 && !this.f37461e0))) {
                                frameLayout3.setVisibility(8);
                            }
                            i33++;
                        }
                        this.f37462f[i33].setImeOptions(268435461);
                        if (i33 != 0) {
                            this.f37462f[i33].setHint(LocaleController.getString(R.string.PaymentCardNumber));
                        } else if (i33 != 1) {
                            this.f37462f[i33].setHint(LocaleController.getString(R.string.PaymentCardExpireDate));
                        } else if (i33 != 2) {
                            this.f37462f[i33].setHint(LocaleController.getString(R.string.PaymentCardName));
                        } else if (i33 != 3) {
                            this.f37462f[i33].setHint(LocaleController.getString(R.string.PaymentCardCvv));
                        } else if (i33 != 4) {
                            this.f37462f[i33].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                        } else if (i33 == 5) {
                            this.f37462f[i33].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                        }
                        if (i33 == 0) {
                            this.f37462f[i33].addTextChangedListener(new xn0(this));
                        } else if (i33 == 1) {
                            this.f37462f[i33].addTextChangedListener(new yn0(this));
                        }
                        this.f37462f[i33].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        EditTextBoldCursor editTextBoldCursor11 = this.f37462f[i33];
                        if (LocaleController.isRTL) {
                            i11 = 5;
                        } else {
                            i11 = 3;
                        }
                        editTextBoldCursor11.setGravity(i11);
                        frameLayout3.addView(this.f37462f[i33], h7.z5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i39 = 3;
                        this.f37462f[i33].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

                            public final do0 f36859b;

                            {
                                this.f36859b = this;
                            }

                            @Override
                            public final boolean onEditorAction(TextView textView3, int i310, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i39) {
                                    case 0:
                                        do0 do0Var = this.f36859b;
                                        if (i310 == 6) {
                                            do0Var.A0(false);
                                            return true;
                                        }
                                        do0Var.getClass();
                                        return false;
                                    case 1:
                                        do0 do0Var2 = this.f36859b;
                                        if (i310 == 6) {
                                            do0Var2.f37470n.performClick();
                                            return true;
                                        }
                                        do0Var2.getClass();
                                        if (i310 == 5) {
                                            int iIntValue = ((Integer) textView3.getTag()).intValue();
                                            if (iIntValue == 0) {
                                                do0Var2.f37462f[1].requestFocus();
                                            } else if (iIntValue == 1) {
                                                do0Var2.f37462f[2].requestFocus();
                                            }
                                        }
                                        return false;
                                    case 2:
                                        do0 do0Var3 = this.f36859b;
                                        do0Var3.getClass();
                                        if (i310 != 5) {
                                            if (i310 != 6) {
                                                return false;
                                            }
                                            do0Var3.f37470n.performClick();
                                            return true;
                                        }
                                        int iIntValue2 = ((Integer) textView3.getTag()).intValue();
                                        while (true) {
                                            iIntValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = do0Var3.f37462f;
                                            if (iIntValue2 >= editTextBoldCursorArr2.length) {
                                                return true;
                                            }
                                            if (iIntValue2 != 4 && ((View) editTextBoldCursorArr2[iIntValue2].getParent()).getVisibility() == 0) {
                                                do0Var3.f37462f[iIntValue2].requestFocus();
                                                return true;
                                            }
                                        }
                                        break;
                                    case 3:
                                        do0 do0Var4 = this.f36859b;
                                        do0Var4.getClass();
                                        if (i310 != 5) {
                                            if (i310 != 6) {
                                                return false;
                                            }
                                            do0Var4.f37470n.performClick();
                                            return true;
                                        }
                                        int iIntValue3 = ((Integer) textView3.getTag()).intValue();
                                        do {
                                            int i311 = iIntValue3 + 1;
                                            editTextBoldCursorArr = do0Var4.f37462f;
                                            if (i311 >= editTextBoldCursorArr.length) {
                                                return true;
                                            }
                                            iIntValue3 = i311 == 4 ? iIntValue3 + 2 : i311;
                                        } while (((View) editTextBoldCursorArr[iIntValue3].getParent()).getVisibility() != 0);
                                        do0Var4.f37462f[iIntValue3].requestFocus();
                                        return true;
                                    default:
                                        do0 do0Var5 = this.f36859b;
                                        if (i310 == 6) {
                                            do0Var5.f37470n.performClick();
                                            return true;
                                        }
                                        do0Var5.getClass();
                                        return false;
                                }
                            }
                        });
                        if (i33 == 3) {
                            this.G[0] = new org.telegram.ui.Cells.w6(context, (Object) null);
                            this.M.addView(this.G[0], h7.z5.n(-1, -2));
                        } else if (i33 == 5) {
                            this.G[2] = new org.telegram.ui.Cells.w6(context, (Object) null);
                            this.M.addView(this.G[2], h7.z5.n(-1, -2));
                            org.telegram.ui.Cells.p8 p8Var5 = new org.telegram.ui.Cells.p8(context, this.U0);
                            this.H = p8Var5;
                            p8Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                            this.H.f(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.Q0, false);
                            this.M.addView(this.H, h7.z5.n(-1, -2));
                            this.H.setOnClickListener(new zm0(this, 10));
                            this.I[0] = new org.telegram.ui.Cells.x8(context, this.U0);
                            this.I[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                            K0();
                            this.M.addView(this.I[0], h7.z5.n(-1, -2));
                        } else if (i33 == 0) {
                            n0(context);
                            FrameLayout frameLayout5 = this.K;
                            if (LocaleController.isRTL) {
                                i12 = 3;
                            } else {
                                i12 = 5;
                            }
                            frameLayout3.addView(frameLayout5, h7.z5.d(-2, -2.0f, i12 | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                        }
                        if (z14) {
                            org.telegram.ui.Components.zm zmVar4 = new org.telegram.ui.Components.zm(context, 18);
                            zmVar4.setBackgroundColor(getThemedColor(i35));
                            this.F.add(zmVar4);
                            frameLayout3.addView(zmVar4, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        if (i33 != 4) {
                        }
                        i33++;
                    }
                    if (!this.f37458c0 && !this.f37459d0) {
                        this.E[1].setVisibility(8);
                        this.G[0].setVisibility(8);
                    }
                    if (this.f37459d0) {
                        this.f37462f[5].setImeOptions(268435462);
                    } else {
                        this.f37462f[3].setImeOptions(268435462);
                    }
                }
            } else if (i26 == 1) {
                ArrayList<TLRPC.TL_shippingOption> arrayList = this.A0.shipping_options;
                int size = arrayList == null ? 0 : arrayList.size();
                this.h = new org.telegram.ui.Cells.g6[size];
                int i40 = 0;
                while (i40 < size) {
                    TLRPC.TL_shippingOption tL_shippingOption = this.A0.shipping_options.get(i40);
                    this.h[i40] = new org.telegram.ui.Cells.g6(context);
                    this.h[i40].setTag(Integer.valueOf(i40));
                    this.h[i40].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                    this.h[i40].c(a9.p.w(s0(tL_shippingOption.prices), " - ", tL_shippingOption.title), i40 == 0, i40 != size + (-1));
                    this.h[i40].setOnClickListener(new zm0(this, 11));
                    this.M.addView(this.h[i40]);
                    i40++;
                }
                this.I[0] = new org.telegram.ui.Cells.x8(context, this.U0);
                this.I[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                this.M.addView(this.I[0], h7.z5.n(-1, -2));
            } else {
                int i41 = 13;
                if (i26 == 3) {
                    this.f37462f = new EditTextBoldCursor[2];
                    int i42 = 0;
                    for (int i43 = 2; i42 < i43; i43 = 2) {
                        if (i42 == 0) {
                            z10 = false;
                            this.E[0] = new org.telegram.ui.Cells.j4(context, this.U0);
                            this.E[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                            this.E[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                            this.M.addView(this.E[0], h7.z5.n(-1, -2));
                        } else {
                            z10 = false;
                        }
                        FrameLayout frameLayout6 = new FrameLayout(context);
                        frameLayout6.setClipChildren(z10);
                        this.M.addView(frameLayout6, h7.z5.n(-1, 50));
                        int i44 = org.telegram.ui.ActionBar.g6.f23053d6;
                        frameLayout6.setBackgroundColor(getThemedColor(i44));
                        boolean z15 = i42 != 1;
                        if (z15) {
                            if (i42 == 7 && !this.f37487y0.invoice.phone_requested) {
                                z15 = false;
                            } else if (i42 == 6) {
                                TLRPC.TL_invoice tL_invoice10 = this.f37487y0.invoice;
                                if (!tL_invoice10.phone_requested && !tL_invoice10.email_requested) {
                                    z15 = false;
                                }
                            }
                        }
                        if (z15) {
                            org.telegram.ui.Components.zm zmVar5 = new org.telegram.ui.Components.zm(context, 15);
                            zmVar5.setBackgroundColor(getThemedColor(i44));
                            this.F.add(zmVar5);
                            frameLayout6.addView(zmVar5, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f37462f[i42] = new EditTextBoldCursor(context);
                        this.f37462f[i42].setTag(Integer.valueOf(i42));
                        this.f37462f[i42].setTextSize(1, 16.0f);
                        this.f37462f[i42].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.H6));
                        EditTextBoldCursor editTextBoldCursor12 = this.f37462f[i42];
                        int i45 = org.telegram.ui.ActionBar.g6.G6;
                        editTextBoldCursor12.setTextColor(getThemedColor(i45));
                        this.f37462f[i42].setBackgroundDrawable(null);
                        this.f37462f[i42].setCursorColor(getThemedColor(i45));
                        this.f37462f[i42].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f37462f[i42].setCursorWidth(1.5f);
                        if (i42 == 0) {
                            this.f37462f[i42].setOnTouchListener(new kh.e(28));
                            this.f37462f[i42].setInputType(0);
                        } else {
                            this.f37462f[i42].setInputType(129);
                            this.f37462f[i42].setTypeface(Typeface.DEFAULT);
                        }
                        this.f37462f[i42].setImeOptions(268435462);
                        if (i42 == 0) {
                            EditTextBoldCursor editTextBoldCursor13 = this.f37462f[i42];
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.f37480u0;
                            editTextBoldCursor13.setText(tL_paymentSavedCredentialsCard == null ? "" : tL_paymentSavedCredentialsCard.title);
                        } else if (i42 == 1) {
                            this.f37462f[i42].setHint(LocaleController.getString(R.string.LoginPassword));
                            this.f37462f[i42].requestFocus();
                        }
                        this.f37462f[i42].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f37462f[i42].setGravity(LocaleController.isRTL ? 5 : 3);
                        frameLayout6.addView(this.f37462f[i42], h7.z5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i46 = 4;
                        this.f37462f[i42].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

                            public final do0 f36859b;

                            {
                                this.f36859b = this;
                            }

                            @Override
                            public final boolean onEditorAction(TextView textView3, int i310, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i46) {
                                    case 0:
                                        do0 do0Var = this.f36859b;
                                        if (i310 == 6) {
                                            do0Var.A0(false);
                                            return true;
                                        }
                                        do0Var.getClass();
                                        return false;
                                    case 1:
                                        do0 do0Var2 = this.f36859b;
                                        if (i310 == 6) {
                                            do0Var2.f37470n.performClick();
                                            return true;
                                        }
                                        do0Var2.getClass();
                                        if (i310 == 5) {
                                            int iIntValue = ((Integer) textView3.getTag()).intValue();
                                            if (iIntValue == 0) {
                                                do0Var2.f37462f[1].requestFocus();
                                            } else if (iIntValue == 1) {
                                                do0Var2.f37462f[2].requestFocus();
                                            }
                                        }
                                        return false;
                                    case 2:
                                        do0 do0Var3 = this.f36859b;
                                        do0Var3.getClass();
                                        if (i310 != 5) {
                                            if (i310 != 6) {
                                                return false;
                                            }
                                            do0Var3.f37470n.performClick();
                                            return true;
                                        }
                                        int iIntValue2 = ((Integer) textView3.getTag()).intValue();
                                        while (true) {
                                            iIntValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = do0Var3.f37462f;
                                            if (iIntValue2 >= editTextBoldCursorArr2.length) {
                                                return true;
                                            }
                                            if (iIntValue2 != 4 && ((View) editTextBoldCursorArr2[iIntValue2].getParent()).getVisibility() == 0) {
                                                do0Var3.f37462f[iIntValue2].requestFocus();
                                                return true;
                                            }
                                        }
                                        break;
                                    case 3:
                                        do0 do0Var4 = this.f36859b;
                                        do0Var4.getClass();
                                        if (i310 != 5) {
                                            if (i310 != 6) {
                                                return false;
                                            }
                                            do0Var4.f37470n.performClick();
                                            return true;
                                        }
                                        int iIntValue3 = ((Integer) textView3.getTag()).intValue();
                                        do {
                                            int i311 = iIntValue3 + 1;
                                            editTextBoldCursorArr = do0Var4.f37462f;
                                            if (i311 >= editTextBoldCursorArr.length) {
                                                return true;
                                            }
                                            iIntValue3 = i311 == 4 ? iIntValue3 + 2 : i311;
                                        } while (((View) editTextBoldCursorArr[iIntValue3].getParent()).getVisibility() != 0);
                                        do0Var4.f37462f[iIntValue3].requestFocus();
                                        return true;
                                    default:
                                        do0 do0Var5 = this.f36859b;
                                        if (i310 == 6) {
                                            do0Var5.f37470n.performClick();
                                            return true;
                                        }
                                        do0Var5.getClass();
                                        return false;
                                }
                            }
                        });
                        if (i42 == 1) {
                            this.I[0] = new org.telegram.ui.Cells.x8(context, this.U0);
                            org.telegram.ui.Cells.x8 x8Var2 = this.I[0];
                            int i47 = R.string.PaymentConfirmationMessage;
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.f37480u0;
                            x8Var2.setText(LocaleController.formatString("PaymentConfirmationMessage", i47, tL_paymentSavedCredentialsCard2 == null ? "" : tL_paymentSavedCredentialsCard2.title));
                            org.telegram.ui.Cells.x8 x8Var3 = this.I[0];
                            int i48 = R.drawable.greydivider;
                            int i49 = org.telegram.ui.ActionBar.g6.f23018b7;
                            x8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i48, i49));
                            this.M.addView(this.I[0], h7.z5.n(-1, -2));
                            this.J[0] = new org.telegram.ui.Cells.x9(context, this.U0);
                            this.J[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                            this.J[0].b(LocaleController.getString(R.string.PaymentConfirmationNewCard), false);
                            this.M.addView(this.J[0], h7.z5.n(-1, -2));
                            this.J[0].setOnClickListener(new zm0(this, i41));
                            this.I[1] = new org.telegram.ui.Cells.x8(context, this.U0);
                            this.I[1].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i49));
                            this.M.addView(this.I[1], h7.z5.n(-1, -2));
                        }
                        i42++;
                    }
                } else if (i26 == 4 || i26 == 5) {
                    org.telegram.ui.Cells.i5 i5Var = new org.telegram.ui.Cells.i5(context);
                    this.T = i5Var;
                    i5Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                    MessageObject messageObject = this.J0;
                    if (messageObject != null) {
                        this.T.b((TLRPC.TL_messageMediaInvoice) messageObject.messageOwner.media, this.f37469l0);
                    } else {
                        TLRPC.PaymentReceipt paymentReceipt = this.f37488z0;
                        if (paymentReceipt != null) {
                            this.T.c(paymentReceipt, this.f37469l0);
                        } else if (this.K0 != null || this.X0 != null) {
                            org.telegram.ui.Cells.i5 i5Var2 = this.T;
                            TLRPC.PaymentForm paymentForm4 = this.f37487y0;
                            i5Var2.a(paymentForm4.title, paymentForm4.description, paymentForm4.photo, this.f37469l0, paymentForm4);
                        }
                    }
                    this.M.addView(this.T, h7.z5.n(-1, -2));
                    this.G[0] = new org.telegram.ui.Cells.w6(context, (Object) null);
                    this.M.addView(this.G[0], h7.z5.n(-1, -2));
                    ArrayList arrayList2 = new ArrayList(this.f37487y0.invoice.prices);
                    this.f37473p0 = arrayList2;
                    TLRPC.TL_shippingOption tL_shippingOption2 = this.C0;
                    if (tL_shippingOption2 != null) {
                        arrayList2.addAll(tL_shippingOption2.prices);
                    }
                    this.N0 = new String[1];
                    for (int i50 = 0; i50 < this.f37473p0.size(); i50++) {
                        TLRPC.TL_labeledPrice tL_labeledPrice = (TLRPC.TL_labeledPrice) this.f37473p0.get(i50);
                        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
                        y8Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                        y8Var.a(tL_labeledPrice.label, LocaleController.getInstance().formatCurrencyString(tL_labeledPrice.amount, this.f37487y0.invoice.currency), false);
                        this.M.addView(y8Var);
                    }
                    if (this.f37474q0 == 5 && this.D0 != null) {
                        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
                        y8Var2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                        y8Var2.a(LocaleController.getString(R.string.PaymentTip), LocaleController.getInstance().formatCurrencyString(this.D0.longValue(), this.f37487y0.invoice.currency), false);
                        this.M.addView(y8Var2);
                    }
                    org.telegram.ui.Cells.y8 y8Var3 = new org.telegram.ui.Cells.y8(context);
                    this.N = y8Var3;
                    int i51 = org.telegram.ui.ActionBar.g6.f23053d6;
                    y8Var3.setBackgroundColor(getThemedColor(i51));
                    this.N0[0] = s0(this.f37473p0);
                    this.N.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.N0[0], true);
                    float f10 = 14.0f;
                    if (this.f37474q0 == 4 && (this.f37487y0.invoice.flags & 256) != 0) {
                        FrameLayout frameLayout7 = new FrameLayout(context);
                        frameLayout7.setClipChildren(false);
                        frameLayout7.setBackgroundColor(getThemedColor(i51));
                        this.M.addView(frameLayout7, h7.z5.n(-1, this.f37487y0.invoice.suggested_tip_amounts.isEmpty() ? 40 : 78));
                        frameLayout7.setOnClickListener(new zm0(this, 14));
                        org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(context);
                        y8Var4.setBackgroundColor(getThemedColor(i51));
                        y8Var4.a(LocaleController.getString(R.string.PaymentTipOptional), "", false);
                        frameLayout7.addView(y8Var4);
                        this.f37462f = new EditTextBoldCursor[]{new EditTextBoldCursor(context)};
                        this.f37462f[0].setTag(0);
                        this.f37462f[0].setTextSize(1, 16.0f);
                        EditTextBoldCursor editTextBoldCursor14 = this.f37462f[0];
                        int i52 = org.telegram.ui.ActionBar.g6.f23441z6;
                        editTextBoldCursor14.setHintTextColor(getThemedColor(i52));
                        this.f37462f[0].setTextColor(getThemedColor(i52));
                        this.f37462f[0].setBackgroundDrawable(null);
                        this.f37462f[0].setCursorColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                        this.f37462f[0].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f37462f[0].setCursorWidth(1.5f);
                        this.f37462f[0].setInputType(3);
                        this.f37462f[0].setImeOptions(268435462);
                        this.f37462f[0].setHint(LocaleController.getInstance().formatCurrencyString(0L, this.f37487y0.invoice.currency));
                        this.f37462f[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f37462f[0].setGravity(LocaleController.isRTL ? 3 : 5);
                        frameLayout7.addView(this.f37462f[0], h7.z5.d(-1, -2.0f, 51, 21.0f, 9.0f, 21.0f, 1.0f));
                        this.f37462f[0].addTextChangedListener(new gn0(this));
                        this.f37462f[0].setOnEditorActionListener(new org.telegram.ui.Components.o2(3));
                        this.f37462f[0].requestFocus();
                        if (!this.f37487y0.invoice.suggested_tip_amounts.isEmpty()) {
                            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                            horizontalScrollView.setHorizontalScrollBarEnabled(false);
                            horizontalScrollView.setVerticalScrollBarEnabled(false);
                            horizontalScrollView.setClipToPadding(false);
                            horizontalScrollView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                            horizontalScrollView.setFillViewport(true);
                            frameLayout7.addView(horizontalScrollView, h7.z5.d(-1, 30.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                            int[] iArr = new int[1];
                            int[] iArr2 = new int[1];
                            int size2 = this.f37487y0.invoice.suggested_tip_amounts.size();
                            hn0 hn0Var = new hn0(context, size2, iArr, iArr2);
                            this.f37472o0 = hn0Var;
                            hn0Var.setOrientation(0);
                            horizontalScrollView.addView(this.f37472o0, h7.z5.x(-1, 30, 51));
                            int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.ei);
                            int i53 = 0;
                            while (i53 < size2) {
                                long jLongValue = LocaleController.isRTL ? this.f37487y0.invoice.suggested_tip_amounts.get((size2 - i53) - 1).longValue() : this.f37487y0.invoice.suggested_tip_amounts.get(i53).longValue();
                                String currencyString = LocaleController.getInstance().formatCurrencyString(jLongValue, this.f37487y0.invoice.currency);
                                TextView textViewH = org.telegram.messenger.y1.h(context, 1, f10);
                                textViewH.setTypeface(AndroidUtilities.bold());
                                textViewH.setLines(1);
                                textViewH.setTag(Long.valueOf(jLongValue));
                                textViewH.setMaxLines(1);
                                textViewH.setText(currencyString);
                                textViewH.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
                                textViewH.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Z8));
                                textViewH.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(15.0f), themedColor & 536870911));
                                textViewH.setSingleLine(true);
                                textViewH.setGravity(17);
                                this.f37472o0.addView(textViewH, h7.z5.t(-2, -1, 19, 0, 0, i53 != size2 + (-1) ? 9 : 0, 0));
                                int[] iArr3 = iArr2;
                                textViewH.setOnClickListener(new hh.s2(this, textViewH, jLongValue, 6));
                                int iDp = AndroidUtilities.dp(30.0f) + ((int) Math.ceil(textViewH.getPaint().measureText(currencyString)));
                                textViewH.setTag(R.id.width_tag, Integer.valueOf(iDp));
                                iArr[0] = Math.max(iArr[0], iDp);
                                iArr3[0] = iArr3[0] + iDp;
                                i53++;
                                iArr2 = iArr3;
                                f10 = 14.0f;
                            }
                        }
                    }
                    this.M.addView(this.N);
                    this.G[2] = new org.telegram.ui.Cells.w6(context, (Object) null);
                    this.G[2].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                    this.M.addView(this.G[2], h7.z5.n(-1, -2));
                    this.U[0] = new in0(context);
                    this.U[0].setBackground(org.telegram.ui.ActionBar.g6.K0(true));
                    org.telegram.ui.Cells.w8 w8Var = this.U[0];
                    String str6 = this.f37479t0;
                    w8Var.b(R.drawable.msg_payment_card, (str6 == null || str6.length() <= 1) ? this.f37479t0 : this.f37479t0.substring(0, 1).toUpperCase() + this.f37479t0.substring(1), LocaleController.getString(R.string.PaymentCheckoutMethod), true);
                    if (this.R0 || this.S0) {
                        String str7 = this.f37479t0;
                        i10 = (str7 == null || str7.length() <= 1) ? 8 : 0;
                    } else {
                        i10 = 0;
                    }
                    int i54 = 0;
                    this.U[0].setVisibility(i10);
                    this.M.addView(this.U[0]);
                    if (this.f37474q0 == 4) {
                        this.U[0].setOnClickListener(new zm0(this, i54));
                    }
                    TLRPC.User user3 = null;
                    for (int i55 = 0; i55 < this.f37487y0.users.size(); i55++) {
                        TLRPC.User user4 = this.f37487y0.users.get(i55);
                        if (user4.f22527id == this.f37487y0.provider_id) {
                            user3 = user4;
                        }
                    }
                    char c13 = 1;
                    this.U[1] = new org.telegram.ui.Cells.w8(context);
                    this.U[1].setBackground(org.telegram.ui.ActionBar.g6.K0(true));
                    if (user3 != null) {
                        org.telegram.ui.Cells.w8 w8Var2 = this.U[1];
                        name2 = ContactsController.formatName(user3.first_name, user3.last_name);
                        String string = LocaleController.getString(R.string.PaymentCheckoutProvider);
                        int i56 = R.drawable.msg_payment_provider;
                        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = this.E0;
                        w8Var2.b(i56, name2, string, ((tL_payments_validateRequestedInfo == null || (tL_payments_validateRequestedInfo.info.shipping_address == null && this.C0 == null)) && ((tL_paymentRequestedInfo = this.f37487y0.saved_info) == null || tL_paymentRequestedInfo.shipping_address == null)) ? false : true);
                        c13 = 1;
                        this.M.addView(this.U[1]);
                    }
                    this.U[c13].setVisibility(user3 != null ? i10 : 8);
                    TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.E0;
                    if (tL_payments_validateRequestedInfo2 != null || (this.R0 && (paymentForm2 = this.f37487y0) != null && paymentForm2.saved_info != null)) {
                        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo12 = tL_payments_validateRequestedInfo2 != null ? tL_payments_validateRequestedInfo2.info : this.f37487y0.saved_info;
                        this.U[2] = new org.telegram.ui.Cells.w8(context);
                        this.U[2].setVisibility(8);
                        this.M.addView(this.U[2]);
                        if (tL_paymentRequestedInfo12.shipping_address != null) {
                            this.U[2].setVisibility(0);
                            if (this.f37474q0 == 4) {
                                this.U[2].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                                this.U[2].setOnClickListener(new zm0(this, 1));
                            } else {
                                this.U[2].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                            }
                        }
                        this.U[3] = new org.telegram.ui.Cells.w8(context);
                        this.U[3].setVisibility(8);
                        this.M.addView(this.U[3]);
                        if (tL_paymentRequestedInfo12.name != null) {
                            this.U[3].setVisibility(0);
                            if (this.f37474q0 == 4) {
                                this.U[3].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                                this.U[3].setOnClickListener(new zm0(this, 2));
                            } else {
                                this.U[3].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                            }
                        }
                        this.U[4] = new org.telegram.ui.Cells.w8(context);
                        this.U[4].setVisibility(8);
                        this.M.addView(this.U[4]);
                        if (tL_paymentRequestedInfo12.phone != null) {
                            this.U[4].setVisibility(0);
                            if (this.f37474q0 == 4) {
                                this.U[4].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                                this.U[4].setOnClickListener(new zm0(this, 3));
                            } else {
                                this.U[4].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                            }
                        }
                        this.U[5] = new org.telegram.ui.Cells.w8(context);
                        this.U[5].setVisibility(8);
                        this.M.addView(this.U[5]);
                        if (tL_paymentRequestedInfo12.email != null) {
                            this.U[5].setVisibility(0);
                            int i57 = 4;
                            if (this.f37474q0 == 4) {
                                this.U[5].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                                this.U[5].setOnClickListener(new zm0(this, i57));
                            } else {
                                this.U[5].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                            }
                        }
                        if (this.C0 != null) {
                            this.U[6] = new org.telegram.ui.Cells.w8(context);
                            this.U[6].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                            this.U[6].b(R.drawable.msg_payment_delivery, this.C0.title, LocaleController.getString(R.string.PaymentCheckoutShippingMethod), false);
                            this.M.addView(this.U[6]);
                        }
                        B0(tL_paymentRequestedInfo12);
                    }
                    if (this.f37474q0 == 4) {
                        this.B = !this.R0;
                        if (this.X0 instanceof TLRPC.TL_inputInvoiceStars) {
                            this.B = true;
                        }
                        this.S = new zn0(this, context);
                        View view = new View(context);
                        view.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6), 2, -1));
                        this.S.addView(view, h7.z5.c(-1.0f, -1));
                        frameLayout2.addView(this.S, h7.z5.e(-1, 48, 80));
                        this.S.setOnClickListener(new u70(12, this, name2));
                        TextView textView3 = new TextView(context);
                        this.Q = textView3;
                        int i58 = org.telegram.ui.ActionBar.g6.fi;
                        textView3.setTextColor(getThemedColor(i58));
                        this.Q.setText(LocaleController.formatString(R.string.PaymentCheckoutPay, this.N0[0]));
                        this.Q.setTextSize(1, 14.0f);
                        this.Q.setGravity(17);
                        this.Q.setTypeface(AndroidUtilities.bold());
                        this.S.addView(this.Q, h7.z5.c(-1.0f, -1));
                        org.telegram.ui.Components.hq hqVar2 = new org.telegram.ui.Components.hq(context, 0);
                        this.f37477s = hqVar2;
                        hqVar2.setVisibility(4);
                        int themedColor2 = getThemedColor(i58);
                        this.f37477s.a(805306367 & themedColor2, themedColor2);
                        this.S.addView(this.f37477s, h7.z5.c(-1.0f, -1));
                        this.S.a(this.B, false);
                        this.Q.setAlpha(!this.B ? 0.8f : 1.0f);
                        this.f37470n.setEnabled(false);
                        this.f37470n.getContentView().setVisibility(4);
                        AndroidUtilities.checkAndroidTheme(context, true);
                        try {
                            nn0 nn0Var = new nn0(context);
                            this.f37482w = nn0Var;
                            nn0Var.setBackgroundColor(-1);
                            this.f37482w.getSettings().setJavaScriptEnabled(true);
                            this.f37482w.getSettings().setDomStorageEnabled(true);
                            this.f37482w.getSettings().setSupportZoom(true);
                            this.f37482w.getSettings().setBuiltInZoomControls(true);
                            this.f37482w.getSettings().setDisplayZoomControls(false);
                            this.f37482w.getSettings().setUseWideViewPort(true);
                            this.f37482w.getSettings().setMixedContentMode(0);
                            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f37482w, true);
                            this.f37482w.setWebViewClient(new on0(this, context));
                        } catch (Exception e14) {
                            FileLog.e(e14);
                        }
                        this.R = null;
                        if (this.f37487y0.invoice.terms_url != null) {
                            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(context, getResourceProvider());
                            this.R = l6Var;
                            l6Var.setChecked(this.B);
                            if (TextUtils.isEmpty(this.f37469l0)) {
                                String string2 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrentFee);
                                spannableStringBuilder = new SpannableStringBuilder(string2);
                                int iIndexOf = string2.indexOf(42);
                                int iLastIndexOf = string2.lastIndexOf(42);
                                if (iIndexOf != -1 && iLastIndexOf != -1) {
                                    SpannableString spannableString = new SpannableString(string2.substring(iIndexOf + 1, iLastIndexOf));
                                    spannableString.setSpan(new org.telegram.ui.Components.r41(this.f37487y0.invoice.terms_url), 0, spannableString.length(), 33);
                                    int i59 = iLastIndexOf + 1;
                                    spannableStringBuilder.replace(iIndexOf, i59, (CharSequence) spannableString);
                                    string2.substring(0, iIndexOf);
                                    spannableString.toString();
                                    string2.substring(i59);
                                }
                            } else {
                                String string3 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrent);
                                spannableStringBuilder = new SpannableStringBuilder(string3);
                                int iIndexOf2 = string3.indexOf(42);
                                int iLastIndexOf2 = string3.lastIndexOf(42);
                                if (iIndexOf2 != -1 && iLastIndexOf2 != -1) {
                                    SpannableString spannableString2 = new SpannableString(string3.substring(iIndexOf2 + 1, iLastIndexOf2));
                                    spannableString2.setSpan(new org.telegram.ui.Components.r41(this.f37487y0.invoice.terms_url), 0, spannableString2.length(), 33);
                                    int i60 = iLastIndexOf2 + 1;
                                    spannableStringBuilder.replace(iIndexOf2, i60, (CharSequence) spannableString2);
                                    string3 = string3.substring(0, iIndexOf2) + ((Object) spannableString2) + string3.substring(i60);
                                }
                                int iIndexOf3 = string3.indexOf("%1$s");
                                if (iIndexOf3 != -1) {
                                    spannableStringBuilder.replace(iIndexOf3, iIndexOf3 + 4, (CharSequence) this.f37469l0);
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.k41(AndroidUtilities.bold()), iIndexOf3, this.f37469l0.length() + iIndexOf3, 33);
                                }
                            }
                            this.R.setText(spannableStringBuilder);
                            this.R.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6), getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6)));
                            this.R.setOnClickListener(new zm0(this, 5));
                            frameLayout2.addView(this.R, h7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                        WebView webView = this.f37482w;
                        if (webView != null) {
                            frameLayout2.addView(webView, h7.z5.c(-1.0f, -1));
                            this.f37482w.setVisibility(8);
                        }
                    }
                    this.G[1] = new org.telegram.ui.Cells.w6(context, (Object) null);
                    this.G[1].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                    if (i10 != 0 && this.f37474q0 == 4 && this.E0 == null && ((paymentForm = this.f37487y0) == null || paymentForm.saved_info == null)) {
                        c10 = 1;
                        this.G[1].setVisibility(i10);
                    } else {
                        c10 = 1;
                    }
                    this.M.addView(this.G[c10], h7.z5.n(-1, -2));
                } else if (i26 == 6) {
                    org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context);
                    this.O = h3Var;
                    String string4 = LocaleController.getString(R.string.PasswordCode);
                    EditTextBoldCursor editTextBoldCursor15 = h3Var.f24424a;
                    editTextBoldCursor15.setText("");
                    editTextBoldCursor15.setHint(string4);
                    final int i61 = 0;
                    h3Var.f24425b = false;
                    h3Var.setWillNotDraw(true);
                    this.O.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                    EditTextBoldCursor textView4 = this.O.getTextView();
                    textView4.setInputType(3);
                    textView4.setImeOptions(6);
                    textView4.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

                        public final do0 f36859b;

                        {
                            this.f36859b = this;
                        }

                        @Override
                        public final boolean onEditorAction(TextView textView5, int i310, KeyEvent keyEvent) {
                            EditTextBoldCursor[] editTextBoldCursorArr;
                            switch (i61) {
                                case 0:
                                    do0 do0Var = this.f36859b;
                                    if (i310 == 6) {
                                        do0Var.A0(false);
                                        return true;
                                    }
                                    do0Var.getClass();
                                    return false;
                                case 1:
                                    do0 do0Var2 = this.f36859b;
                                    if (i310 == 6) {
                                        do0Var2.f37470n.performClick();
                                        return true;
                                    }
                                    do0Var2.getClass();
                                    if (i310 == 5) {
                                        int iIntValue = ((Integer) textView5.getTag()).intValue();
                                        if (iIntValue == 0) {
                                            do0Var2.f37462f[1].requestFocus();
                                        } else if (iIntValue == 1) {
                                            do0Var2.f37462f[2].requestFocus();
                                        }
                                    }
                                    return false;
                                case 2:
                                    do0 do0Var3 = this.f36859b;
                                    do0Var3.getClass();
                                    if (i310 != 5) {
                                        if (i310 != 6) {
                                            return false;
                                        }
                                        do0Var3.f37470n.performClick();
                                        return true;
                                    }
                                    int iIntValue2 = ((Integer) textView5.getTag()).intValue();
                                    while (true) {
                                        iIntValue2++;
                                        EditTextBoldCursor[] editTextBoldCursorArr2 = do0Var3.f37462f;
                                        if (iIntValue2 >= editTextBoldCursorArr2.length) {
                                            return true;
                                        }
                                        if (iIntValue2 != 4 && ((View) editTextBoldCursorArr2[iIntValue2].getParent()).getVisibility() == 0) {
                                            do0Var3.f37462f[iIntValue2].requestFocus();
                                            return true;
                                        }
                                    }
                                    break;
                                case 3:
                                    do0 do0Var4 = this.f36859b;
                                    do0Var4.getClass();
                                    if (i310 != 5) {
                                        if (i310 != 6) {
                                            return false;
                                        }
                                        do0Var4.f37470n.performClick();
                                        return true;
                                    }
                                    int iIntValue3 = ((Integer) textView5.getTag()).intValue();
                                    do {
                                        int i311 = iIntValue3 + 1;
                                        editTextBoldCursorArr = do0Var4.f37462f;
                                        if (i311 >= editTextBoldCursorArr.length) {
                                            return true;
                                        }
                                        iIntValue3 = i311 == 4 ? iIntValue3 + 2 : i311;
                                    } while (((View) editTextBoldCursorArr[iIntValue3].getParent()).getVisibility() != 0);
                                    do0Var4.f37462f[iIntValue3].requestFocus();
                                    return true;
                                default:
                                    do0 do0Var5 = this.f36859b;
                                    if (i310 == 6) {
                                        do0Var5.f37470n.performClick();
                                        return true;
                                    }
                                    do0Var5.getClass();
                                    return false;
                            }
                        }
                    });
                    textView4.addTextChangedListener(new p0(this, i41));
                    this.M.addView(this.O, h7.z5.n(-1, -2));
                    this.I[2] = new org.telegram.ui.Cells.x8(context, this.U0);
                    this.I[2].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23018b7));
                    this.M.addView(this.I[2], h7.z5.n(-1, -2));
                    this.J[1] = new org.telegram.ui.Cells.x9(context, this.U0);
                    this.J[1].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                    org.telegram.ui.Cells.x9 x9Var = this.J[1];
                    int i62 = org.telegram.ui.ActionBar.g6.G6;
                    x9Var.setTag(Integer.valueOf(i62));
                    this.J[1].setTextColor(getThemedColor(i62));
                    this.J[1].b(LocaleController.getString(R.string.ResendCode), true);
                    this.M.addView(this.J[1], h7.z5.n(-1, -2));
                    this.J[1].setOnClickListener(new zm0(this, 6));
                    this.J[0] = new org.telegram.ui.Cells.x9(context, this.U0);
                    this.J[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                    org.telegram.ui.Cells.x9 x9Var2 = this.J[0];
                    int i63 = org.telegram.ui.ActionBar.g6.f23269p7;
                    x9Var2.setTag(Integer.valueOf(i63));
                    this.J[0].setTextColor(getThemedColor(i63));
                    this.J[0].b(LocaleController.getString(R.string.AbortPassword), false);
                    this.M.addView(this.J[0], h7.z5.n(-1, -2));
                    this.J[0].setOnClickListener(new zm0(this, 7));
                    this.f37462f = new EditTextBoldCursor[3];
                    int i64 = 0;
                    for (int i65 = 3; i64 < i65; i65 = 3) {
                        if (i64 == 0) {
                            this.E[0] = new org.telegram.ui.Cells.j4(context, this.U0);
                            this.E[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                            this.E[0].setText(LocaleController.getString(R.string.PaymentPasswordTitle));
                            this.M.addView(this.E[0], h7.z5.n(-1, -2));
                        } else if (i64 == 2) {
                            this.E[1] = new org.telegram.ui.Cells.j4(context, this.U0);
                            this.E[1].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                            this.E[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailTitle));
                            this.M.addView(this.E[1], h7.z5.n(-1, -2));
                        }
                        FrameLayout frameLayout8 = new FrameLayout(context);
                        frameLayout8.setClipChildren(false);
                        this.M.addView(frameLayout8, h7.z5.n(-1, 50));
                        int i66 = org.telegram.ui.ActionBar.g6.f23053d6;
                        frameLayout8.setBackgroundColor(getThemedColor(i66));
                        if (i64 == 0) {
                            org.telegram.ui.Components.zm zmVar6 = new org.telegram.ui.Components.zm(context, 16);
                            zmVar6.setBackgroundColor(getThemedColor(i66));
                            this.F.add(zmVar6);
                            frameLayout8.addView(zmVar6, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f37462f[i64] = new EditTextBoldCursor(context);
                        this.f37462f[i64].setTag(Integer.valueOf(i64));
                        this.f37462f[i64].setTextSize(1, 16.0f);
                        this.f37462f[i64].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.H6));
                        EditTextBoldCursor editTextBoldCursor16 = this.f37462f[i64];
                        int i67 = org.telegram.ui.ActionBar.g6.G6;
                        editTextBoldCursor16.setTextColor(getThemedColor(i67));
                        this.f37462f[i64].setBackgroundDrawable(null);
                        this.f37462f[i64].setCursorColor(getThemedColor(i67));
                        this.f37462f[i64].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f37462f[i64].setCursorWidth(1.5f);
                        if (i64 == 0 || i64 == 1) {
                            this.f37462f[i64].setInputType(129);
                            this.f37462f[i64].setTypeface(Typeface.DEFAULT);
                            this.f37462f[i64].setImeOptions(268435461);
                        } else {
                            this.f37462f[i64].setInputType(33);
                            this.f37462f[i64].setImeOptions(268435462);
                        }
                        if (i64 == 0) {
                            this.f37462f[i64].setHint(LocaleController.getString(R.string.PaymentPasswordEnter));
                            this.f37462f[i64].requestFocus();
                        } else if (i64 == 1) {
                            this.f37462f[i64].setHint(LocaleController.getString(R.string.PaymentPasswordReEnter));
                        } else if (i64 == 2) {
                            this.f37462f[i64].setHint(LocaleController.getString(R.string.PaymentPasswordEmail));
                        }
                        this.f37462f[i64].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f37462f[i64].setGravity(LocaleController.isRTL ? 5 : 3);
                        frameLayout8.addView(this.f37462f[i64], h7.z5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i68 = 1;
                        this.f37462f[i64].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

                            public final do0 f36859b;

                            {
                                this.f36859b = this;
                            }

                            @Override
                            public final boolean onEditorAction(TextView textView5, int i310, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i68) {
                                    case 0:
                                        do0 do0Var = this.f36859b;
                                        if (i310 == 6) {
                                            do0Var.A0(false);
                                            return true;
                                        }
                                        do0Var.getClass();
                                        return false;
                                    case 1:
                                        do0 do0Var2 = this.f36859b;
                                        if (i310 == 6) {
                                            do0Var2.f37470n.performClick();
                                            return true;
                                        }
                                        do0Var2.getClass();
                                        if (i310 == 5) {
                                            int iIntValue = ((Integer) textView5.getTag()).intValue();
                                            if (iIntValue == 0) {
                                                do0Var2.f37462f[1].requestFocus();
                                            } else if (iIntValue == 1) {
                                                do0Var2.f37462f[2].requestFocus();
                                            }
                                        }
                                        return false;
                                    case 2:
                                        do0 do0Var3 = this.f36859b;
                                        do0Var3.getClass();
                                        if (i310 != 5) {
                                            if (i310 != 6) {
                                                return false;
                                            }
                                            do0Var3.f37470n.performClick();
                                            return true;
                                        }
                                        int iIntValue2 = ((Integer) textView5.getTag()).intValue();
                                        while (true) {
                                            iIntValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = do0Var3.f37462f;
                                            if (iIntValue2 >= editTextBoldCursorArr2.length) {
                                                return true;
                                            }
                                            if (iIntValue2 != 4 && ((View) editTextBoldCursorArr2[iIntValue2].getParent()).getVisibility() == 0) {
                                                do0Var3.f37462f[iIntValue2].requestFocus();
                                                return true;
                                            }
                                        }
                                        break;
                                    case 3:
                                        do0 do0Var4 = this.f36859b;
                                        do0Var4.getClass();
                                        if (i310 != 5) {
                                            if (i310 != 6) {
                                                return false;
                                            }
                                            do0Var4.f37470n.performClick();
                                            return true;
                                        }
                                        int iIntValue3 = ((Integer) textView5.getTag()).intValue();
                                        do {
                                            int i311 = iIntValue3 + 1;
                                            editTextBoldCursorArr = do0Var4.f37462f;
                                            if (i311 >= editTextBoldCursorArr.length) {
                                                return true;
                                            }
                                            iIntValue3 = i311 == 4 ? iIntValue3 + 2 : i311;
                                        } while (((View) editTextBoldCursorArr[iIntValue3].getParent()).getVisibility() != 0);
                                        do0Var4.f37462f[iIntValue3].requestFocus();
                                        return true;
                                    default:
                                        do0 do0Var5 = this.f36859b;
                                        if (i310 == 6) {
                                            do0Var5.f37470n.performClick();
                                            return true;
                                        }
                                        do0Var5.getClass();
                                        return false;
                                }
                            }
                        });
                        if (i64 == 1) {
                            this.I[0] = new org.telegram.ui.Cells.x8(context, this.U0);
                            this.I[0].setText(LocaleController.getString(R.string.PaymentPasswordInfo));
                            this.I[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23018b7));
                            this.M.addView(this.I[0], h7.z5.n(-1, -2));
                        } else if (i64 == 2) {
                            this.I[1] = new org.telegram.ui.Cells.x8(context, this.U0);
                            this.I[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                            this.I[1].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                            this.M.addView(this.I[1], h7.z5.n(-1, -2));
                        }
                        i64++;
                    }
                    J0();
                }
            }
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.twoStepPasswordChanged) {
            TLRPC.PaymentForm paymentForm = this.f37487y0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            K0();
            return;
        }
        if (i10 == NotificationCenter.didRemoveTwoStepPassword) {
            TLRPC.PaymentForm paymentForm2 = this.f37487y0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            K0();
            return;
        }
        if (i10 == NotificationCenter.paymentFinished) {
            this.W0 = true;
            removeSelfFromStack();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.U0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23322s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        org.telegram.ui.Components.hq hqVar = this.f37475r;
        int i11 = org.telegram.ui.ActionBar.g6.D7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(hqVar, 0, null, null, null, null, i11));
        org.telegram.ui.Components.hq hqVar2 = this.f37475r;
        int i12 = org.telegram.ui.ActionBar.g6.E7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(hqVar2, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37477s, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37477s, 0, null, null, null, null, i12));
        if (this.f37462f != null) {
            int i13 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f37462f;
                if (i13 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6((View) editTextBoldCursorArr[i13].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37462f[i13], 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37462f[i13], 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
                i13++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
        }
        if (this.h != null) {
            int i14 = 0;
            while (true) {
                org.telegram.ui.Cells.g6[] g6VarArr = this.h;
                if (i14 >= g6VarArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6(g6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.h[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.h[i14], 0, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.h[i14], 8192, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23109g7));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.h[i14], 16384, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23126h7));
                i14++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 8192, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23109g7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 16384, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23126h7));
        }
        int i15 = 0;
        while (true) {
            org.telegram.ui.Cells.j4[] j4VarArr = this.E;
            if (i15 >= j4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(j4VarArr[i15], 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(j4VarArr[i15], 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
            i15++;
        }
        int i16 = 0;
        while (true) {
            org.telegram.ui.Cells.w6[] w6VarArr = this.G;
            if (i16 >= w6VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(w6VarArr[i16], 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23018b7));
            i16++;
        }
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.x8[] x8VarArr = this.I;
            if (i17 >= x8VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(x8VarArr[i17], 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23018b7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(x8VarArr[i17], 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(x8VarArr[i17], 2, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
            i17++;
        }
        int i18 = 0;
        while (true) {
            ArrayList arrayList2 = this.F;
            if (i18 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6((View) arrayList2.get(i18), 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
            i18++;
        }
        org.telegram.ui.Cells.h3 h3Var = this.O;
        int i19 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(h3Var, 1, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 4, new Class[]{org.telegram.ui.Cells.h3.class}, new String[]{"textView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 8388608, new Class[]{org.telegram.ui.Cells.h3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 4, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 268435456, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        int i21 = 0;
        while (true) {
            org.telegram.ui.Cells.x9[] x9VarArr = this.J;
            if (i21 >= x9VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(x9VarArr[i21], 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(x9VarArr[i21], 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(x9VarArr[i21], 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
            i21++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23320s6));
        int i22 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 16, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i22));
        int i23 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"valueTextView"}, null, null, -1, null, i23));
        int i24 = org.telegram.ui.ActionBar.g6.f23441z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"valueTextView"}, null, null, -1, null, i24));
        org.telegram.ui.Cells.w8[] w8VarArr = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w8VarArr[0], 268435456, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(w8VarArr[0], 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        for (int i25 = 1; i25 < w8VarArr.length; i25++) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(w8VarArr[i25], 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(w8VarArr[i25], 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(w8VarArr[i25], 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23441z6));
        }
        org.telegram.ui.Cells.i5 i5Var = this.T;
        int i26 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(i5Var, 1, null, null, null, null, i26));
        int i27 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"nameTextView"}, null, null, -1, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"detailTextView"}, null, null, -1, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"detailExTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23441z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, 268435456, null, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.C;
    }

    public final void n0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.K = frameLayout;
        frameLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
        this.K.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        frameLayout2.setClickable(true);
        this.L.setFocusable(true);
        this.L.setBackgroundResource(R.drawable.googlepay_button_no_shadow_background);
        if (this.G0 == null) {
            this.L.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f));
        } else {
            this.L.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        }
        this.K.addView(this.L, h7.z5.c(48.0f, -1));
        this.L.setOnClickListener(new zm0(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.L.addView(linearLayout, h7.z5.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, h7.z5.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.L.addView(imageView2, h7.z5.c(-1.0f, -1));
    }

    public final void o0(String str) {
        boolean z10;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (str == null && (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0)) {
                return;
            }
            boolean z11 = Build.VERSION.SDK_INT < 23 || getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            if (str != null || z11) {
                if (str == null) {
                    str = oe.b.d(telephonyManager.getLine1Number(), false);
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                int i10 = 4;
                String strSubstring = null;
                if (str.length() > 4) {
                    while (true) {
                        if (i10 < 1) {
                            z10 = false;
                            break;
                        }
                        String strSubstring2 = str.substring(0, i10);
                        if (((String) this.f37457c.get(strSubstring2)) != null) {
                            strSubstring = str.substring(i10);
                            this.f37462f[8].setText(strSubstring2);
                            z10 = true;
                            break;
                        }
                        i10--;
                    }
                    if (!z10) {
                        strSubstring = str.substring(1);
                        this.f37462f[8].setText(str.substring(0, 1));
                    }
                }
                if (strSubstring != null) {
                    this.f37462f[9].setText(strSubstring);
                    EditTextBoldCursor editTextBoldCursor = this.f37462f[9];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 == 991) {
            AndroidUtilities.runOnUIThread(new ol0(this, i11, intent, 1));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        WebView webView = this.f37482w;
        if (webView == null || !this.f37486y) {
            return !this.L0;
        }
        if (z10) {
            webView.loadUrl(this.f37484x);
            this.f37486y = false;
        }
        return false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.f37474q0 == 4 && this.T0) {
            this.T0 = false;
            this.S.callOnClick();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.f37474q0 != 4 || this.R0) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.paymentFinished);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        bo0 bo0Var = this.P;
        if (bo0Var != null) {
            bo0Var.b();
        }
        int i10 = 0;
        AndroidUtilities.checkAndroidTheme(getParentActivity(), false);
        if (!this.W0) {
            this.f37456b1 = 2;
            if (this.V0 != null) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var != null && b5Var.getFragmentStack() != null) {
                    int iIndexOf = this.parentLayout.getFragmentStack().indexOf(this);
                    if (iIndexOf == -1) {
                        iIndexOf = this.parentLayout.getFragmentStack().size();
                    }
                    while (true) {
                        if (i10 >= this.parentLayout.getFragmentStack().size()) {
                            i10 = iIndexOf;
                            break;
                        } else if (((org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(i10)) instanceof do0) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    i10 -= iIndexOf;
                }
                if (i10 == 0) {
                    this.V0.b(this.f37456b1);
                }
            }
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.f37474q0 != 4 || this.R0) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
        }
        WebView webView = this.f37482w;
        if (webView != null) {
            try {
                ViewParent parent = webView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.f37482w);
                }
                this.f37482w.stopLoading();
                this.f37482w.loadUrl("about:blank");
                this.f37484x = null;
                this.f37482w.destroy();
                this.f37482w = null;
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        try {
            int i11 = this.f37474q0;
            if ((i11 == 2 || i11 == 6) && Build.VERSION.SDK_INT >= 23 && (SharedConfig.passcodeHash.length() == 0 || SharedConfig.allowScreenCapture)) {
                getParentActivity().getWindow().clearFlags(8192);
                AndroidUtilities.logFlagSecure();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        super.onFragmentDestroy();
        this.M0 = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                int i10 = this.f37474q0;
                if ((i10 == 2 || i10 == 6) && !this.f37487y0.invoice.test) {
                    getParentActivity().getWindow().setFlags(8192, 8192);
                    AndroidUtilities.logFlagSecure();
                } else if (SharedConfig.passcodeHash.length() == 0 || SharedConfig.allowScreenCapture) {
                    getParentActivity().getWindow().clearFlags(8192);
                    AndroidUtilities.logFlagSecure();
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || z11) {
            return;
        }
        WebView webView = this.f37482w;
        if (webView != null) {
            if (this.f37474q0 != 4) {
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.B0;
                if (tL_paymentFormMethod != null) {
                    String str = tL_paymentFormMethod.url;
                    this.f37484x = str;
                    webView.loadUrl(str);
                    return;
                } else {
                    String str2 = this.f37487y0.url;
                    this.f37484x = str2;
                    webView.loadUrl(str2);
                    return;
                }
            }
            return;
        }
        int i10 = this.f37474q0;
        if (i10 == 2) {
            AndroidUtilities.runOnUIThread(new cn0(this, 0), 100L);
            return;
        }
        if (i10 == 3) {
            this.f37462f[1].requestFocus();
            AndroidUtilities.showKeyboard(this.f37462f[1]);
            return;
        }
        if (i10 == 4) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f37462f;
            if (editTextBoldCursorArr != null) {
                editTextBoldCursorArr[0].requestFocus();
                return;
            }
            return;
        }
        if (i10 != 6 || this.X) {
            return;
        }
        this.f37462f[0].requestFocus();
        AndroidUtilities.showKeyboard(this.f37462f[0]);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        y0(n2Var);
        return super.presentFragment(n2Var);
    }

    public final long q0() {
        TLRPC.InputInvoice inputInvoice = this.X0;
        if (!(inputInvoice instanceof TLRPC.TL_inputInvoiceStars)) {
            return 0L;
        }
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

    public final long r0() {
        TLRPC.InputPeer inputPeer;
        TLRPC.InputInvoice inputInvoice = this.X0;
        if (!(inputInvoice instanceof TLRPC.TL_inputInvoiceStars)) {
            return 0L;
        }
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose;
        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
            TLRPC.InputUser inputUser = ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).user_id;
            if (inputUser != null) {
                return inputUser.user_id;
            }
            return 0L;
        }
        if (!(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) || (inputPeer = ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).boost_peer) == null) {
            return 0L;
        }
        return DialogObject.getPeerDialogId(inputPeer);
    }

    public final String s0(ArrayList arrayList) {
        long jLongValue = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jLongValue += ((TLRPC.TL_labeledPrice) arrayList.get(i10)).amount;
        }
        Long l10 = this.D0;
        if (l10 != null) {
            jLongValue += l10.longValue();
        }
        return LocaleController.getInstance().formatCurrencyString(jLongValue, this.f37487y0.invoice.currency);
    }

    public final void t0() {
        int i10;
        int i11;
        boolean z10;
        int i12 = this.f37474q0;
        if (i12 == 0) {
            bo0 bo0Var = this.P;
            if (bo0Var != null) {
                bo0Var.d(this.E0);
                finishFragment();
                return;
            }
            if (this.f37487y0.invoice.flexible) {
                i10 = 1;
            } else if (this.f37480u0 == null && this.f37478s0 == null) {
                i10 = 2;
            } else {
                if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                    UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                    UserConfig.getInstance(this.currentAccount).saveConfig(false);
                }
                i10 = UserConfig.getInstance(this.currentAccount).tmpPassword != null ? 4 : 3;
            }
            if (i10 == 2 && this.f37480u0 == null && this.f37478s0 == null && !this.f37487y0.additional_methods.isEmpty()) {
                G0(new cn0(this, 1));
                return;
            }
            do0 do0Var = new do0(this.X0, this.f37487y0, this.J0, this.K0, i10, this.A0, null, null, this.f37478s0, this.f37479t0, this.E0, this.Q0, this.F0, this.f37471n0, this.S0);
            do0Var.Y0 = this.Y0;
            do0Var.Z0 = this.Z0;
            presentFragment(do0Var, this.O0);
            return;
        }
        if (i12 == 1) {
            if (this.f37478s0 != null || this.f37479t0 != null) {
                i11 = 4;
            } else if (this.f37480u0 != null) {
                if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                    UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                    UserConfig.getInstance(this.currentAccount).saveConfig(false);
                }
                if (UserConfig.getInstance(this.currentAccount).tmpPassword != null) {
                    i11 = 4;
                } else {
                    i11 = 3;
                }
            } else {
                i11 = 2;
            }
            if (i11 == 2 && this.f37479t0 == null && this.f37480u0 == null && this.f37478s0 == null && !this.f37487y0.additional_methods.isEmpty()) {
                G0(new cn0(this, 1));
                return;
            }
            do0 do0Var2 = new do0(this.X0, this.f37487y0, this.J0, this.K0, i11, this.A0, this.C0, this.D0, this.f37478s0, this.f37479t0, this.E0, this.Q0, this.F0, this.f37471n0, this.S0);
            do0Var2.Y0 = this.Y0;
            do0Var2.Z0 = this.Z0;
            presentFragment(do0Var2, this.O0);
            return;
        }
        if (i12 == 2) {
            TLRPC.PaymentForm paymentForm = this.f37487y0;
            if (paymentForm.password_missing && (z10 = this.Q0)) {
                do0 do0Var3 = new do0(this.X0, paymentForm, this.J0, this.K0, 6, this.A0, this.C0, this.D0, this.f37478s0, this.f37479t0, this.E0, z10, this.F0, this.f37471n0, this.S0);
                this.f37455b0 = do0Var3;
                do0Var3.Y0 = this.Y0;
                do0Var3.Z0 = this.Z0;
                do0Var3.C0(this.W);
                do0 do0Var4 = this.f37455b0;
                do0Var4.P = new rn0(this);
                presentFragment(do0Var4, this.O0);
                return;
            }
            bo0 bo0Var2 = this.P;
            if (bo0Var2 != null) {
                bo0Var2.c(this.f37478s0, this.f37479t0, this.Q0, this.F0, null);
                finishFragment();
                return;
            } else {
                do0 do0Var5 = new do0(this.X0, paymentForm, this.J0, this.K0, 4, this.A0, this.C0, this.D0, this.f37478s0, this.f37479t0, this.E0, this.Q0, this.F0, this.f37471n0, this.S0);
                do0Var5.Y0 = this.Y0;
                do0Var5.Z0 = this.Z0;
                presentFragment(do0Var5, this.O0);
                return;
            }
        }
        if (i12 == 3) {
            do0 do0Var6 = new do0(this.X0, this.f37487y0, this.J0, this.K0, this.f37476r0 ? 4 : 2, this.A0, this.C0, this.D0, this.f37478s0, this.f37479t0, this.E0, this.Q0, this.F0, this.f37471n0, this.S0);
            do0Var6.Y0 = this.Y0;
            do0Var6.Z0 = this.Z0;
            presentFragment(do0Var6, true);
            return;
        }
        if (i12 != 4) {
            if (i12 != 6) {
                return;
            }
            if (this.P.c(this.f37478s0, this.f37479t0, this.Q0, this.F0, this.f37480u0)) {
                finishFragment();
                return;
            }
            do0 do0Var7 = new do0(this.X0, this.f37487y0, this.J0, this.K0, 4, this.A0, this.C0, this.D0, this.f37478s0, this.f37479t0, this.E0, this.Q0, this.F0, this.f37471n0, false);
            do0Var7.Y0 = this.Y0;
            do0Var7.Z0 = this.Z0;
            presentFragment(do0Var7, true);
            return;
        }
        if (this.R0) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.paymentFinished, new Object[0]);
        if (getMessagesController().newMessageCallback != null) {
            AndroidUtilities.runOnUIThread(new cn0(this, 2), 500L);
        } else {
            if (x0(getParentLayout(), getParentActivity()) || isFinishing()) {
                return;
            }
            finishFragment();
        }
    }

    public final void u0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.n2 n2Var, boolean z11) {
        if (n2Var != null) {
            this.currentAccount = n2Var.getCurrentAccount();
        }
        this.f37474q0 = i10;
        this.f37471n0 = n2Var;
        this.f37478s0 = str2;
        this.F0 = tL_inputPaymentCredentialsGooglePay;
        this.A0 = tL_payments_validatedRequestedInfo;
        this.f37487y0 = paymentForm;
        this.C0 = tL_shippingOption;
        this.D0 = l10;
        this.J0 = messageObject;
        this.K0 = str;
        this.X0 = inputInvoice;
        this.Q0 = z10;
        this.S0 = z11;
        this.O0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.f37487y0.native_provider)) ? false : true;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentForm.bot_id));
        this.f37465h0 = user;
        if (user != null) {
            this.f37469l0 = user.first_name;
        } else {
            this.f37469l0 = "";
        }
        this.m0 = paymentForm.title;
        this.E0 = tL_payments_validateRequestedInfo;
        this.P0 = true;
        if (z10 || this.f37474q0 == 4) {
            this.Q0 = z10;
        } else {
            this.Q0 = !this.f37487y0.saved_credentials.isEmpty();
        }
        if (str3 != null) {
            this.f37479t0 = str3;
        } else {
            if (this.f37487y0.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.f37487y0.saved_credentials.get(0);
            this.f37480u0 = tL_paymentSavedCredentialsCard;
            this.f37479t0 = tL_paymentSavedCredentialsCard.title;
        }
    }

    public final void v0(Context context) {
        Optional optionalEmpty;
        if (getParentActivity() == null) {
            return;
        }
        com.google.android.gms.internal.cast.a aVar = new com.google.android.gms.internal.cast.a();
        int i10 = this.f37487y0.invoice.test ? 3 : 1;
        if (i10 != 2 && i10 != 1 && i10 != 3) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(i0.a.k(i10, "Invalid environment value "));
        }
        aVar.f3426a = i10;
        this.f37460e = new com.google.android.gms.internal.clearcut.v0(context, g8.p.f6768a, new g8.o(aVar), com.google.android.gms.common.api.i.f3198c);
        try {
            JSONObject jSONObjectPut = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
            jSONObjectPut.put("allowedPaymentMethods", new JSONArray().put(p0()));
            optionalEmpty = Optional.of(jSONObjectPut);
        } catch (JSONException unused) {
            optionalEmpty = Optional.empty();
        }
        if (optionalEmpty.isPresent()) {
            String string = ((JSONObject) optionalEmpty.get()).toString();
            g8.e eVar = new g8.e();
            y5.l.i(string, "isReadyToPayRequestJson cannot be null!");
            eVar.f6729f = string;
            com.google.android.gms.internal.clearcut.v0 v0Var = this.f37460e;
            v0Var.getClass();
            com.google.android.gms.common.api.internal.v vVarB = com.google.android.gms.common.api.internal.w.b();
            vVarB.f3357a = 23705;
            vVarB.f3359c = new a9.i(eVar, 17);
            v0Var.e(0, vVarB.b()).addOnCompleteListener(getParentActivity(), new dn0(this, 0));
        }
    }

    public final void w0() {
        if (this.f37452a0) {
            return;
        }
        this.f37452a0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new fn0(this, 1), 10);
    }

    public final boolean x0(org.telegram.ui.ActionBar.b5 b5Var, Activity activity) {
        int i10 = 0;
        if (this.X0 != null) {
            if (b5Var != null) {
                ArrayList arrayList = new ArrayList(b5Var.getFragmentStack());
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                    if (n2Var instanceof do0) {
                        n2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.f37465h0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().premiumBotUsername) && this.K0 == null) || (this.K0 != null && getMessagesController().premiumInvoiceSlug != null && Objects.equals(this.K0, getMessagesController().premiumInvoiceSlug))) && b5Var != null) {
            ArrayList arrayList2 = new ArrayList(b5Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                if ((n2Var2 instanceof rn) || (n2Var2 instanceof PremiumPreviewFragment)) {
                    n2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.f35858l0 = true;
            ((ActionBarLayout) b5Var).Q(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).f35535t0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void y0(org.telegram.ui.ActionBar.n2 n2Var) {
        AndroidUtilities.hideKeyboard(this.fragmentView);
        if (n2Var instanceof do0) {
            do0 do0Var = (do0) n2Var;
            do0Var.V0 = this.V0;
            do0Var.U0 = this.U0;
            do0Var.T0 = this.T0;
            do0Var.f37480u0 = this.f37480u0;
        }
    }

    public final void z0() {
        String str;
        if (this.M0) {
            return;
        }
        H0(false, true);
        TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.X0;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.J0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(this.J0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = this.J0.getId();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.K0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.f37487y0.form_id;
        if (UserConfig.getInstance(this.currentAccount).tmpPassword == null || this.f37480u0 == null) {
            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = this.F0;
            if (tL_inputPaymentCredentialsGooglePay != null) {
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsGooglePay;
            } else {
                TLRPC.TL_inputPaymentCredentials tL_inputPaymentCredentials = new TLRPC.TL_inputPaymentCredentials();
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentials;
                tL_inputPaymentCredentials.save = this.Q0;
                tL_inputPaymentCredentials.data = new TLRPC.TL_dataJSON();
                tL_payments_sendPaymentForm.credentials.data.data = this.f37478s0;
            }
        } else {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.f22398id = this.f37480u0.f22509id;
            tL_inputPaymentCredentialsSaved.tmp_password = UserConfig.getInstance(this.currentAccount).tmpPassword.tmp_password;
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.A0;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.f22510id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags = 1 | tL_payments_sendPaymentForm.flags;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.C0;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.f22516id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        if ((this.f37487y0.invoice.flags & 256) != 0) {
            Long l10 = this.D0;
            tL_payments_sendPaymentForm.tip_amount = l10 != null ? l10.longValue() : 0L;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendPaymentForm, new v80(14, this, tL_payments_sendPaymentForm), (this.S0 ? 8 : 0) | 2);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        y0(n2Var);
        return super.presentFragment(n2Var, z10);
    }

    public do0(TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, org.telegram.ui.ActionBar.n2 n2Var) {
        super(null);
        this.f37451a = new ArrayList();
        this.f37454b = new HashMap();
        this.f37457c = new HashMap();
        this.d = new HashMap();
        this.C = true;
        this.E = new org.telegram.ui.Cells.j4[3];
        this.F = new ArrayList();
        this.G = new org.telegram.ui.Cells.w6[3];
        this.I = new org.telegram.ui.Cells.x8[3];
        this.J = new org.telegram.ui.Cells.x9[2];
        this.U = new org.telegram.ui.Cells.w8[7];
        this.V = -4.5f;
        this.Y = 6;
        this.R0 = true;
        u0(null, paymentForm, messageObject, str, 4, null, null, null, null, null, null, false, null, n2Var, false);
    }

    public do0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.f37451a = new ArrayList();
        this.f37454b = new HashMap();
        this.f37457c = new HashMap();
        this.d = new HashMap();
        this.C = true;
        this.E = new org.telegram.ui.Cells.j4[3];
        this.F = new ArrayList();
        this.G = new org.telegram.ui.Cells.w6[3];
        this.I = new org.telegram.ui.Cells.x8[3];
        this.J = new org.telegram.ui.Cells.x9[2];
        this.U = new org.telegram.ui.Cells.w8[7];
        this.V = -4.5f;
        this.Y = 6;
        this.f37474q0 = 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.f37487y0 = paymentForm;
        this.f37488z0 = paymentReceipt;
        paymentForm.bot_id = paymentReceipt.bot_id;
        paymentForm.invoice = paymentReceipt.invoice;
        paymentForm.provider_id = paymentReceipt.provider_id;
        paymentForm.users = paymentReceipt.users;
        this.C0 = paymentReceipt.shipping;
        long j10 = paymentReceipt.tip_amount;
        if (j10 != 0) {
            this.D0 = Long.valueOf(j10);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentReceipt.bot_id));
        this.f37465h0 = user;
        if (user != null) {
            this.f37469l0 = user.first_name;
        } else {
            this.f37469l0 = "";
        }
        this.m0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.E0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.J0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(paymentReceipt.bot_id);
                this.E0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.K0;
                this.E0.invoice = tL_inputInvoiceSlug;
            }
            this.E0.info = paymentReceipt.info;
        }
        this.f37479t0 = paymentReceipt.credentials_title;
    }

    public do0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.n2 n2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, n2Var, false);
        this.R0 = true;
    }
}
