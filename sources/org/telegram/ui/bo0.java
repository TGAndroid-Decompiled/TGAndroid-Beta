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
public final class bo0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static final List f36836c1 = Arrays.asList("http", "https");
    public static final List f36837d1 = Collections.singletonList("tg");
    public ScrollView A;
    public TLRPC.TL_payments_validatedRequestedInfo A0;
    public boolean B;
    public TLRPC.TL_paymentFormMethod B0;
    public boolean C;
    public TLRPC.TL_shippingOption C0;
    public TextView D;
    public Long D0;
    public final org.telegram.ui.Cells.k4[] E;
    public TLRPC.TL_payments_validateRequestedInfo E0;
    public final ArrayList F;
    public TLRPC.TL_inputPaymentCredentialsGooglePay F0;
    public final org.telegram.ui.Cells.x6[] G;
    public String G0;
    public org.telegram.ui.Cells.q8 H;
    public String H0;
    public final org.telegram.ui.Cells.y8[] I;
    public JSONObject I0;
    public final org.telegram.ui.Cells.y9[] J;
    public MessageObject J0;
    public FrameLayout K;
    public String K0;
    public FrameLayout L;
    public boolean L0;
    public LinearLayout M;
    public boolean M0;
    public org.telegram.ui.Cells.z8 N;
    public String[] N0;
    public org.telegram.ui.Cells.h3 O;
    public boolean O0;
    public zn0 P;
    public boolean P0;
    public TextView Q;
    public boolean Q0;
    public org.telegram.ui.Cells.m6 R;
    public boolean R0;
    public xn0 S;
    public boolean S0;
    public org.telegram.ui.Cells.j5 T;
    public boolean T0;
    public final org.telegram.ui.Cells.x8[] U;
    public org.telegram.ui.ActionBar.c6 U0;
    public float V;
    public ao0 V0;
    public TL_account.Password W;
    public boolean W0;
    public boolean X;
    public TLRPC.InputInvoice X0;
    public int Y;
    public Utilities.Callback Y0;
    public an0 Z;
    public Utilities.Callback Z0;
    public final ArrayList f36838a;
    public boolean f36839a0;
    public v10 f36840a1;
    public final HashMap f36841b;
    public bo0 f36842b0;
    public int f36843b1;
    public final HashMap f36844c;
    public boolean f36845c0;
    public final HashMap d;
    public boolean f36846d0;
    public com.google.android.gms.internal.clearcut.v0 f36847e;
    public boolean f36848e0;
    public EditTextBoldCursor[] f36849f;
    public String f36850f0;
    public boolean f36851g0;
    public org.telegram.ui.Cells.h6[] h;
    public TLRPC.User f36852h0;
    public boolean f36853i0;
    public boolean f36854j0;
    public boolean f36855k0;
    public String f36856l0;
    public String m0;
    public org.telegram.ui.ActionBar.w0 f36857n;
    public org.telegram.ui.ActionBar.o2 f36858n0;
    public fn0 f36859o0;
    public ArrayList f36860p0;
    public int f36861q0;
    public org.telegram.ui.Components.nq f36862r;
    public boolean f36863r0;
    public org.telegram.ui.Components.nq f36864s;
    public String f36865s0;
    public String f36866t0;
    public TLRPC.TL_paymentSavedCredentialsCard f36867u0;
    public AnimatorSet v;
    public boolean f36868v0;
    public WebView f36869w;
    public lt f36870w0;
    public String f36871x;
    public String f36872x0;
    public boolean f36873y;
    public TLRPC.PaymentForm f36874y0;
    public final TLRPC.PaymentReceipt f36875z0;

    public bo0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.o2 o2Var, boolean z11) {
        super(null);
        this.f36838a = new ArrayList();
        this.f36841b = new HashMap();
        this.f36844c = new HashMap();
        this.d = new HashMap();
        this.C = true;
        this.E = new org.telegram.ui.Cells.k4[3];
        this.F = new ArrayList();
        this.G = new org.telegram.ui.Cells.x6[3];
        this.I = new org.telegram.ui.Cells.y8[3];
        this.J = new org.telegram.ui.Cells.y9[2];
        this.U = new org.telegram.ui.Cells.x8[7];
        this.V = -4.5f;
        this.Y = 6;
        u0(inputInvoice, paymentForm, messageObject, str, i10, tL_payments_validatedRequestedInfo, tL_shippingOption, l10, str2, str3, tL_payments_validateRequestedInfo, z10, tL_inputPaymentCredentialsGooglePay, o2Var, z11);
    }

    public static void U(bo0 bo0Var, TL_account.Password password, byte[] bArr) {
        byte[] bArr2;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        u80 u80Var = new u80(14, bo0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            gettmppassword.password = startCheck;
            if (startCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                u80Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(bo0Var.currentAccount).sendRequest(gettmppassword, u80Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        u80Var.run(null, tL_error2);
    }

    public static void V(bo0 bo0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        bo0Var.D0(false);
        bo0Var.H0(true, false);
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
                    bo0Var.E0(2);
                    return;
                case 1:
                    bo0Var.E0(0);
                    return;
                case 2:
                    bo0Var.E0(4);
                    return;
                case 3:
                    bo0Var.E0(6);
                    return;
                case 4:
                    bo0Var.E0(5);
                    return;
                case 5:
                    bo0Var.E0(3);
                    return;
                case 6:
                    bo0Var.E0(9);
                    return;
                case 7:
                    bo0Var.E0(1);
                    return;
                case '\b':
                    bo0Var.E0(7);
                    return;
                default:
                    org.telegram.ui.Components.c5.f0(bo0Var.currentAccount, tL_error, bo0Var, tLObject, new Object[0]);
                    return;
            }
        }
    }

    public static void W(bo0 bo0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        int i10;
        bo0Var.A0 = tL_payments_validatedRequestedInfo;
        if (bo0Var.f36874y0.saved_info != null && !bo0Var.P0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(bo0Var.currentAccount);
            lh.o5 o5Var = new lh.o5(17);
            if (bo0Var.S0) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            connectionsManager.sendRequest(tL_payments_clearSavedInfo, o5Var, i10);
        }
        bo0Var.t0();
        bo0Var.D0(false);
        bo0Var.H0(true, false);
    }

    public static void X(bo0 bo0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        bo0Var.D0(false);
        bo0Var.H0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.c5.f0(bo0Var.currentAccount, tL_error, bo0Var, tLObject, new Object[0]);
        }
    }

    public static void Y(bo0 bo0Var, org.telegram.ui.Components.mc mcVar, boolean z10, TLRPC.Message message) {
        mcVar.b();
        if (z10) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(tn.Q9(message.f22413id, MessageObject.getDialogId(message)));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = message.f22413id;
        tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(bo0Var.currentAccount).getInputPeer(message.peer_id);
        ConnectionsManager.getInstance(bo0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new dn0(bo0Var, 3), 2);
    }

    public static void Z(bo0 bo0Var) {
        int i10;
        TL_account.resendPasswordEmail resendpasswordemail = new TL_account.resendPasswordEmail();
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(bo0Var.currentAccount);
        lh.o5 o5Var = new lh.o5(17);
        if (bo0Var.S0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        connectionsManager.sendRequest(resendpasswordemail, o5Var, i10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bo0Var.getParentActivity());
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        bo0Var.showDialog(alertDialog$Builder.f22714a);
    }

    public static void a0(bo0 bo0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        jh.j7 j7Var = new jh.j7(bo0Var, z10, str, 7);
        if (!z10) {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str2);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = bo0Var.W.new_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                updatepasswordsettings.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                if (updatepasswordsettings.new_settings.new_password_hash == null) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "ALGO_INVALID";
                    j7Var.run(null, tL_error);
                }
                ConnectionsManager.getInstance(bo0Var.currentAccount).sendRequest(updatepasswordsettings, j7Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            j7Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(bo0Var.currentAccount).sendRequest(updatepasswordsettings, j7Var, 10);
    }

    public static void b0(bo0 bo0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.c5.f0(bo0Var.currentAccount, tL_error, bo0Var, tL_payments_sendPaymentForm, new Object[0]);
        bo0Var.D0(false);
        bo0Var.H0(false, false);
        bo0Var.W0 = true;
        bo0Var.f36843b1 = 4;
        ao0 ao0Var = bo0Var.V0;
        if (ao0Var != null) {
            ao0Var.a(4);
        }
    }

    public static void c0(bo0 bo0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.o2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            jh.ia.j1(bo0Var.getParentActivity(), bo0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, bo0Var.U0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (R = LaunchActivity.R()) != 0) {
            ?? obj = new Object();
            obj.f23673a = true;
            bo0 bo0Var2 = new bo0((TLRPC.PaymentReceipt) tLObject);
            bo0Var2.Y0 = bo0Var.Y0;
            bo0Var2.Z0 = bo0Var.Z0;
            R.showAsSheet(bo0Var2, obj);
        }
    }

    public static void d0(bo0 bo0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        bo0Var.H0(true, false);
        bo0Var.D0(false);
        if (tLObject != null) {
            bo0Var.f36863r0 = true;
            UserConfig.getInstance(bo0Var.currentAccount).tmpPassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(bo0Var.currentAccount).saveConfig(false);
            bo0Var.t0();
        } else if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            try {
                bo0Var.f36849f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(bo0Var.f36849f[1], 3.25f);
            bo0Var.f36849f[1].setText("");
        } else {
            org.telegram.ui.Components.c5.f0(bo0Var.currentAccount, tL_error, bo0Var, gettmppassword, new Object[0]);
        }
    }

    public static void e0(bo0 bo0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.o2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            jh.ia.j1(bo0Var.getParentActivity(), bo0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, bo0Var.U0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (R = LaunchActivity.R()) != 0) {
            ?? obj = new Object();
            obj.f23673a = true;
            bo0 bo0Var2 = new bo0((TLRPC.PaymentReceipt) tLObject);
            bo0Var2.Y0 = bo0Var.Y0;
            bo0Var2.Z0 = bo0Var.Z0;
            R.showAsSheet(bo0Var2, obj);
        }
    }

    public static void f0(bo0 bo0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.i0(password, false)) {
                org.telegram.ui.Components.c5.x0(bo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            } else if (!password.has_password) {
                bo0Var.f36863r0 = false;
                bo0Var.t0();
                return;
            } else {
                Utilities.globalQueue.postRunnable(new xe0(bo0Var, password, AndroidUtilities.getStringBytes(str), 14));
                return;
            }
        }
        org.telegram.ui.Components.c5.f0(bo0Var.currentAccount, tL_error, bo0Var, getpassword, new Object[0]);
        bo0Var.H0(true, false);
        bo0Var.D0(false);
    }

    public static void g0(bo0 bo0Var, org.telegram.ui.Components.mc mcVar, boolean z10, TLRPC.Message[] messageArr) {
        mcVar.b();
        if (z10) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(tn.Q9(messageArr[0].f22413id, MessageObject.getDialogId(messageArr[0])));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = messageArr[0].f22413id;
        tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(bo0Var.currentAccount).getInputPeer(messageArr[0].peer_id);
        ConnectionsManager.getInstance(bo0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new dn0(bo0Var, 2), 2);
    }

    public static void h0(org.telegram.ui.bo0 r23, java.lang.String r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo0.h0(org.telegram.ui.bo0, java.lang.String, android.view.View):void");
    }

    public static void i0(bo0 bo0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        String formatPluralString;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(bo0Var.currentAccount).sendRequest(new TL_account.getPassword(), new nh.l3(10, bo0Var, z10), 8);
            return;
        }
        bo0Var.H0(true, false);
        if (z10) {
            TL_account.Password password = bo0Var.W;
            password.has_password = false;
            password.current_algo = null;
            bo0Var.P.a(password);
            bo0Var.finishFragment();
        } else if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (bo0Var.getParentActivity() != null) {
                bo0Var.t0();
            }
        } else if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    bo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    bo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    bo0Var.F0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            }
            bo0Var.Y = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bo0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new kl0(4, bo0Var, str));
            String string = LocaleController.getString(R.string.YourEmailAlmostThereText);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.P = string;
            c2Var.N = LocaleController.getString(R.string.YourEmailAlmostThere);
            Dialog showDialog = bo0Var.showDialog(c2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        }
    }

    public static void j0(org.telegram.ui.bo0 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo0.j0(org.telegram.ui.bo0):void");
    }

    public static void k0(bo0 bo0Var) {
        int i10 = 0;
        if (UserConfig.getInstance(bo0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(bo0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(bo0Var.currentAccount).getCurrentTime() + 60) {
            UserConfig.getInstance(bo0Var.currentAccount).tmpPassword = null;
            UserConfig.getInstance(bo0Var.currentAccount).saveConfig(false);
        }
        if (UserConfig.getInstance(bo0Var.currentAccount).tmpPassword != null) {
            bo0Var.z0();
        } else if (bo0Var.f36849f[1].length() == 0) {
            try {
                bo0Var.f36849f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(bo0Var.f36849f[1], 2.5f);
        } else {
            String obj = bo0Var.f36849f[1].getText().toString();
            bo0Var.H0(true, true);
            bo0Var.D0(true);
            TL_account.getPassword getpassword = new TL_account.getPassword();
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(bo0Var.currentAccount);
            x9 x9Var = new x9(bo0Var, obj, getpassword, 28);
            if (bo0Var.S0) {
                i10 = 8;
            }
            connectionsManager.sendRequest(getpassword, x9Var, i10 | 2);
        }
    }

    public static void m0(bo0 bo0Var) {
        if (bo0Var.M0) {
            return;
        }
        bo0Var.H0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        bo0Var.E0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = bo0Var.X0;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (bo0Var.J0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = bo0Var.getMessagesController().getInputPeer(bo0Var.J0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = bo0Var.J0.getId();
            bo0Var.E0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = bo0Var.K0;
            bo0Var.E0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = bo0Var.E0;
        tL_payments_validateRequestedInfo2.save = bo0Var.P0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (bo0Var.f36874y0.invoice.name_requested) {
            bo0Var.E0.info.name = bo0Var.f36849f[6].getText().toString();
            bo0Var.E0.info.flags |= 1;
        }
        int i10 = 8;
        if (bo0Var.f36874y0.invoice.phone_requested) {
            bo0Var.E0.info.phone = "+" + bo0Var.f36849f[8].getText().toString() + bo0Var.f36849f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = bo0Var.E0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (bo0Var.f36874y0.invoice.email_requested) {
            bo0Var.E0.info.email = bo0Var.f36849f[7].getText().toString().trim();
            bo0Var.E0.info.flags |= 4;
        }
        if (bo0Var.f36874y0.invoice.shipping_address_requested) {
            bo0Var.E0.info.shipping_address = new TLRPC.TL_postAddress();
            bo0Var.E0.info.shipping_address.street_line1 = bo0Var.f36849f[0].getText().toString();
            bo0Var.E0.info.shipping_address.street_line2 = bo0Var.f36849f[1].getText().toString();
            bo0Var.E0.info.shipping_address.city = bo0Var.f36849f[2].getText().toString();
            bo0Var.E0.info.shipping_address.state = bo0Var.f36849f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = bo0Var.E0.info.shipping_address;
            String str = bo0Var.f36872x0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = bo0Var.f36849f[5].getText().toString();
            bo0Var.E0.info.flags |= 8;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo3 = bo0Var.E0;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(bo0Var.currentAccount);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo4 = bo0Var.E0;
        u80 u80Var = new u80(12, bo0Var, tL_payments_validateRequestedInfo3);
        if (!bo0Var.S0) {
            i10 = 0;
        }
        connectionsManager.sendRequest(tL_payments_validateRequestedInfo4, u80Var, i10 | 2);
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
            }
            H0(true, true);
            TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
            confirmpasswordemail.code = text;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new dn0(this, 0), 10);
            return;
        }
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z10) {
            this.f36857n.setVisibility(0);
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.flags = 2;
            passwordinputsettings.email = "";
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            str = null;
            str2 = null;
        } else {
            String obj = this.f36849f[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                E0(0);
                return;
            } else if (!obj.equals(this.f36849f[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                E0(1);
                return;
            } else {
                String obj2 = this.f36849f[2].getText().toString();
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
                    passwordinputsettings2.new_algo = this.W.new_algo;
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
        Utilities.globalQueue.postRunnable(new eg.j(this, z10, str, str2, updatepasswordsettings));
    }

    public final void B0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        boolean z11 = true;
        org.telegram.ui.Cells.x8[] x8VarArr = this.U;
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
            th.w(sb2, ", ", str4, ", ", str5);
            String q6 = a4.w.q(sb2, ", ", str6);
            x8VarArr[2].b(R.drawable.msg_payment_address, q6, LocaleController.getString(R.string.PaymentShippingAddress), true);
        }
        org.telegram.ui.Cells.x8 x8Var = x8VarArr[2];
        int i13 = 8;
        if (tL_paymentRequestedInfo.shipping_address != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        x8Var.setVisibility(i10);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            x8VarArr[3].b(R.drawable.msg_contacts, str7, LocaleController.getString(R.string.PaymentCheckoutName), true);
        }
        org.telegram.ui.Cells.x8 x8Var2 = x8VarArr[3];
        if (tL_paymentRequestedInfo.name != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        x8Var2.setVisibility(i11);
        if (tL_paymentRequestedInfo.phone != null) {
            org.telegram.ui.Cells.x8 x8Var3 = x8VarArr[4];
            String b10 = qe.b.c().b(tL_paymentRequestedInfo.phone);
            String string = LocaleController.getString(R.string.PaymentCheckoutPhoneNumber);
            int i14 = R.drawable.msg_calls;
            if (tL_paymentRequestedInfo.email == null && this.C0 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            x8Var3.b(i14, b10, string, z10);
        }
        org.telegram.ui.Cells.x8 x8Var4 = x8VarArr[4];
        if (tL_paymentRequestedInfo.phone != null) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        x8Var4.setVisibility(i12);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            org.telegram.ui.Cells.x8 x8Var5 = x8VarArr[5];
            String string2 = LocaleController.getString(R.string.PaymentCheckoutEmail);
            int i15 = R.drawable.msg_mention;
            if (this.C0 == null) {
                z11 = false;
            }
            x8Var5.b(i15, str8, string2, z11);
        }
        org.telegram.ui.Cells.x8 x8Var6 = x8VarArr[5];
        if (tL_paymentRequestedInfo.email != null) {
            i13 = 0;
        }
        x8Var6.setVisibility(i13);
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
        this.W = password;
        if (password != null && !TextUtils.isEmpty(password.email_unconfirmed_pattern)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X = z10;
        J0();
    }

    public final void D0(boolean z10) {
        this.L0 = z10;
        this.C = !z10;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && lVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.L0);
        }
        org.telegram.ui.Cells.x8 x8Var = this.U[0];
        if (x8Var != null) {
            x8Var.setEnabled(!this.L0);
        }
    }

    public final void E0(int i10) {
        EditTextBoldCursor editTextBoldCursor = this.f36849f[i10];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(editTextBoldCursor, 2.5f);
    }

    public final void F0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = str;
        c2Var.P = str2;
        showDialog(c2Var);
    }

    public final void G0(Runnable runnable) {
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(getParentActivity(), null, false, false);
        f3Var.fixNavigationBar();
        f3Var.title = LocaleController.getString(R.string.PaymentCheckoutMethod);
        f3Var.bigTitle = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.f36867u0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
        } else {
            String str = this.f36866t0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_paymentSavedCredentialsCard> arrayList4 = this.f36874y0.saved_credentials;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i10);
            i10++;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard3 = tL_paymentSavedCredentialsCard2;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.f36867u0;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.f22521id, tL_paymentSavedCredentialsCard4.f22521id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
                arrayList3.add(tL_paymentSavedCredentialsCard3);
            }
        }
        ArrayList<TLRPC.TL_paymentFormMethod> arrayList5 = this.f36874y0.additional_methods;
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
        f3Var.items = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        f3Var.itemIcons = iArr;
        f3Var.onClickListener = a3Var;
        showDialog(f3Var);
    }

    public final void H0(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10 && this.f36857n != null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.v = animatorSet2;
            if (z11) {
                this.f36862r.setVisibility(0);
                this.f36857n.setEnabled(false);
                AnimatorSet animatorSet3 = this.v;
                View contentView = this.f36857n.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, property, 0.1f);
                View contentView2 = this.f36857n.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, property2, 0.1f);
                View contentView3 = this.f36857n.getContentView();
                Property property3 = View.ALPHA;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, property3, 0.0f), ObjectAnimator.ofFloat(this.f36862r, property, 1.0f), ObjectAnimator.ofFloat(this.f36862r, property2, 1.0f), ObjectAnimator.ofFloat(this.f36862r, property3, 1.0f));
            } else if (this.f36869w != null) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f36862r, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.f36862r, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.f36862r, View.ALPHA, 0.0f));
            } else {
                this.f36857n.getContentView().setVisibility(0);
                this.f36857n.setEnabled(true);
                AnimatorSet animatorSet4 = this.v;
                org.telegram.ui.Components.nq nqVar = this.f36862r;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(nqVar, property4, 0.1f);
                org.telegram.ui.Components.nq nqVar2 = this.f36862r;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(nqVar2, property5, 0.1f);
                org.telegram.ui.Components.nq nqVar3 = this.f36862r;
                Property property6 = View.ALPHA;
                animatorSet4.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(nqVar3, property6, 0.0f));
                if (!isFinishing()) {
                    this.v.playTogether(ObjectAnimator.ofFloat(this.f36857n.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.f36857n.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.f36857n.getContentView(), property6, 1.0f));
                }
            }
            this.v.addListener(new sn0(this, z11, 0));
            this.v.setDuration(150L);
            this.v.start();
        } else if (this.Q != null) {
            this.v = new AnimatorSet();
            if (z11) {
                this.f36864s.setVisibility(0);
                this.S.setEnabled(false);
                AnimatorSet animatorSet5 = this.v;
                TextView textView = this.Q;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, property7, 0.1f);
                TextView textView2 = this.Q;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, property8, 0.1f);
                TextView textView3 = this.Q;
                Property property9 = View.ALPHA;
                animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, property9, 0.0f), ObjectAnimator.ofFloat(this.f36864s, property7, 1.0f), ObjectAnimator.ofFloat(this.f36864s, property8, 1.0f), ObjectAnimator.ofFloat(this.f36864s, property9, 1.0f));
            } else {
                this.Q.setVisibility(0);
                this.S.setEnabled(true);
                AnimatorSet animatorSet6 = this.v;
                org.telegram.ui.Components.nq nqVar4 = this.f36864s;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(nqVar4, property10, 0.1f);
                org.telegram.ui.Components.nq nqVar5 = this.f36864s;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(nqVar5, property11, 0.1f);
                org.telegram.ui.Components.nq nqVar6 = this.f36864s;
                Property property12 = View.ALPHA;
                animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(nqVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.Q, property10, 1.0f), ObjectAnimator.ofFloat(this.Q, property11, 1.0f), ObjectAnimator.ofFloat(this.Q, property12, 1.0f));
            }
            this.v.addListener(new sn0(this, z11, 1));
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
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("PaymentTransactionMessage2", R.string.PaymentTransactionMessage2, str, this.f36856l0, this.m0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new bn0(this, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var);
    }

    public final void J0() {
        if (this.f36861q0 == 6) {
            org.telegram.ui.Cells.y8[] y8VarArr = this.I;
            if (y8VarArr[2] != null) {
                int i10 = 0;
                this.f36857n.setVisibility(0);
                TL_account.Password password = this.W;
                ArrayList arrayList = this.F;
                org.telegram.ui.Cells.k4[] k4VarArr = this.E;
                org.telegram.ui.Cells.y9[] y9VarArr = this.J;
                if (password == null) {
                    H0(true, true);
                    y8VarArr[2].setVisibility(8);
                    y9VarArr[0].setVisibility(8);
                    y9VarArr[1].setVisibility(8);
                    this.O.setVisibility(8);
                    k4VarArr[0].setVisibility(8);
                    k4VarArr[1].setVisibility(8);
                    y8VarArr[0].setVisibility(8);
                    for (int i11 = 0; i11 < 3; i11++) {
                        ((View) this.f36849f[i11].getParent()).setVisibility(8);
                    }
                    while (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setVisibility(8);
                        i10++;
                    }
                    return;
                }
                H0(true, false);
                if (this.X) {
                    org.telegram.ui.Cells.y8 y8Var = y8VarArr[2];
                    int i12 = R.string.EmailPasswordConfirmText2;
                    String str = this.W.email_unconfirmed_pattern;
                    if (str == null) {
                        str = "";
                    }
                    y8Var.setText(LocaleController.formatString("EmailPasswordConfirmText2", i12, str));
                    y8VarArr[2].setVisibility(0);
                    y9VarArr[0].setVisibility(0);
                    y9VarArr[1].setVisibility(0);
                    this.O.setVisibility(0);
                    y8VarArr[1].setText("");
                    k4VarArr[0].setVisibility(8);
                    k4VarArr[1].setVisibility(8);
                    y8VarArr[0].setVisibility(8);
                    for (int i13 = 0; i13 < 3; i13++) {
                        ((View) this.f36849f[i13].getParent()).setVisibility(8);
                    }
                    while (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setVisibility(8);
                        i10++;
                    }
                    return;
                }
                y8VarArr[2].setVisibility(8);
                y9VarArr[0].setVisibility(8);
                y9VarArr[1].setVisibility(8);
                y8VarArr[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                this.O.setVisibility(8);
                k4VarArr[0].setVisibility(0);
                k4VarArr[1].setVisibility(0);
                y8VarArr[0].setVisibility(0);
                for (int i14 = 0; i14 < 3; i14++) {
                    ((View) this.f36849f[i14].getParent()).setVisibility(0);
                }
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((View) arrayList.get(i15)).setVisibility(0);
                }
            }
        }
    }

    public final void K0() {
        org.telegram.ui.Cells.y8[] y8VarArr = this.I;
        if (y8VarArr[0] != null) {
            org.telegram.ui.Cells.x6[] x6VarArr = this.G;
            if (x6VarArr[2] != null) {
                TLRPC.PaymentForm paymentForm = this.f36874y0;
                if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.f36869w != null && this.f36868v0)) {
                    this.H.setVisibility(8);
                    y8VarArr[0].setVisibility(8);
                    org.telegram.ui.Cells.x6 x6Var = x6VarArr[2];
                    x6Var.setBackground(org.telegram.ui.ActionBar.g6.V0(x6Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine1));
                if (this.f36874y0.password_missing) {
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
                        y8VarArr[0].getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(i11, i11 + 1, (CharSequence) "");
                        spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new yn0(this), i10, i11 - 1, 33);
                    }
                }
                this.H.setEnabled(true);
                y8VarArr[0].setText(spannableStringBuilder);
                this.H.setVisibility(0);
                y8VarArr[0].setVisibility(0);
                org.telegram.ui.Cells.x6 x6Var2 = x6VarArr[2];
                x6Var2.setBackground(org.telegram.ui.ActionBar.g6.V0(x6Var2.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23028b7));
            }
        }
    }

    public final void L0() {
        this.N0[0] = s0(this.f36860p0);
        this.N.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.N0[0], true);
        TextView textView = this.Q;
        if (textView != null) {
            textView.setText(LocaleController.formatString("PaymentCheckoutPay", R.string.PaymentCheckoutPay, this.N0[0]));
        }
        if (this.f36859o0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.ei);
            int childCount = this.f36859o0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                TextView textView2 = (TextView) this.f36859o0.getChildAt(i10);
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
    public final android.view.View createView(android.content.Context r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.twoStepPasswordChanged) {
            TLRPC.PaymentForm paymentForm = this.f36874y0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            K0();
        } else if (i10 == NotificationCenter.didRemoveTwoStepPassword) {
            TLRPC.PaymentForm paymentForm2 = this.f36874y0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            K0();
        } else if (i10 == NotificationCenter.paymentFinished) {
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
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23329s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        org.telegram.ui.Components.nq nqVar = this.f36862r;
        int i11 = org.telegram.ui.ActionBar.g6.D7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(nqVar, 0, null, null, null, null, i11));
        org.telegram.ui.Components.nq nqVar2 = this.f36862r;
        int i12 = org.telegram.ui.ActionBar.g6.E7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(nqVar2, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36864s, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36864s, 0, null, null, null, null, i12));
        if (this.f36849f != null) {
            int i13 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f36849f;
                if (i13 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6((View) editTextBoldCursorArr[i13].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36849f[i13], 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36849f[i13], 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
                i13++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
        }
        if (this.h != null) {
            int i14 = 0;
            while (true) {
                org.telegram.ui.Cells.h6[] h6VarArr = this.h;
                if (i14 >= h6VarArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6(h6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.h[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.h[i14], 0, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.h[i14], 8192, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23118g7));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.h[i14], 16384, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23135h7));
                i14++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 8192, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23118g7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 16384, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23135h7));
        }
        int i15 = 0;
        while (true) {
            org.telegram.ui.Cells.k4[] k4VarArr = this.E;
            if (i15 >= k4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(k4VarArr[i15], 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(k4VarArr[i15], 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
            i15++;
        }
        int i16 = 0;
        while (true) {
            org.telegram.ui.Cells.x6[] x6VarArr = this.G;
            if (i16 >= x6VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(x6VarArr[i16], 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23028b7));
            i16++;
        }
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.y8[] y8VarArr = this.I;
            if (i17 >= y8VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(y8VarArr[i17], 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23028b7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(y8VarArr[i17], 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(y8VarArr[i17], 2, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
            i17++;
        }
        int i18 = 0;
        while (true) {
            ArrayList arrayList2 = this.F;
            if (i18 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6((View) arrayList2.get(i18), 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
            i18++;
        }
        org.telegram.ui.Cells.h3 h3Var = this.O;
        int i19 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(h3Var, 1, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 4, new Class[]{org.telegram.ui.Cells.h3.class}, new String[]{"textView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 8388608, new Class[]{org.telegram.ui.Cells.h3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 4, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 268435456, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        int i21 = 0;
        while (true) {
            org.telegram.ui.Cells.y9[] y9VarArr = this.J;
            if (i21 >= y9VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(y9VarArr[i21], 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(y9VarArr[i21], 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(y9VarArr[i21], 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
            i21++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23327s6));
        int i22 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 16, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i22));
        int i23 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, i23));
        int i24 = org.telegram.ui.ActionBar.g6.f23450z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, i24));
        org.telegram.ui.Cells.x8[] x8VarArr = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.i6(x8VarArr[0], 268435456, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(x8VarArr[0], 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        for (int i25 = 1; i25 < x8VarArr.length; i25++) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(x8VarArr[i25], 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(x8VarArr[i25], 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(x8VarArr[i25], 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23450z6));
        }
        org.telegram.ui.Cells.j5 j5Var = this.T;
        int i26 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(j5Var, 1, null, null, null, null, i26));
        int i27 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"nameTextView"}, null, null, -1, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"detailTextView"}, null, null, -1, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"detailExTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23450z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, 268435456, null, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
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
        this.K.addView(this.L, i7.f6.c(48.0f, -1));
        this.L.setOnClickListener(new xm0(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.L.addView(linearLayout, i7.f6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, i7.f6.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.L.addView(imageView2, i7.f6.c(-1.0f, -1));
    }

    public final void o0(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo0.o0(java.lang.String):void");
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 == 991) {
            AndroidUtilities.runOnUIThread(new ll0(this, i11, intent, 1));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        WebView webView = this.f36869w;
        if (webView != null && this.f36873y) {
            if (z10) {
                webView.loadUrl(this.f36871x);
                this.f36873y = false;
            }
            return false;
        }
        return !this.L0;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.f36861q0 == 4 && this.T0) {
            this.T0 = false;
            this.S.callOnClick();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.f36861q0 != 4 || this.R0) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.paymentFinished);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo0.onFragmentDestroy():void");
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                int i10 = this.f36861q0;
                if ((i10 == 2 || i10 == 6) && !this.f36874y0.invoice.test) {
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
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11) {
            WebView webView = this.f36869w;
            if (webView != null) {
                if (this.f36861q0 != 4) {
                    TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.B0;
                    if (tL_paymentFormMethod != null) {
                        String str = tL_paymentFormMethod.url;
                        this.f36871x = str;
                        webView.loadUrl(str);
                        return;
                    }
                    String str2 = this.f36874y0.url;
                    this.f36871x = str2;
                    webView.loadUrl(str2);
                    return;
                }
                return;
            }
            int i10 = this.f36861q0;
            if (i10 == 2) {
                AndroidUtilities.runOnUIThread(new an0(this, 0), 100L);
            } else if (i10 == 3) {
                this.f36849f[1].requestFocus();
                AndroidUtilities.showKeyboard(this.f36849f[1]);
            } else if (i10 == 4) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f36849f;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                }
            } else if (i10 == 6 && !this.X) {
                this.f36849f[0].requestFocus();
                AndroidUtilities.showKeyboard(this.f36849f[0]);
            }
        }
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        y0(o2Var);
        return super.presentFragment(o2Var);
    }

    public final long q0() {
        TLRPC.InputInvoice inputInvoice = this.X0;
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
        TLRPC.InputInvoice inputInvoice = this.X0;
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
        Long l10 = this.D0;
        if (l10 != null) {
            j10 += l10.longValue();
        }
        return LocaleController.getInstance().formatCurrencyString(j10, this.f36874y0.invoice.currency);
    }

    public final void t0() {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13 = this.f36861q0;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 == 6) {
                                if (!this.P.c(this.f36865s0, this.f36866t0, this.Q0, this.F0, this.f36867u0)) {
                                    bo0 bo0Var = new bo0(this.X0, this.f36874y0, this.J0, this.K0, 4, this.A0, this.C0, this.D0, this.f36865s0, this.f36866t0, this.E0, this.Q0, this.F0, this.f36858n0, false);
                                    bo0Var.Y0 = this.Y0;
                                    bo0Var.Z0 = this.Z0;
                                    presentFragment(bo0Var, true);
                                    return;
                                }
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        if (this.R0) {
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
                        AndroidUtilities.runOnUIThread(new an0(this, 2), 500L);
                        return;
                    }
                    if (this.f36863r0) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    bo0 bo0Var2 = new bo0(this.X0, this.f36874y0, this.J0, this.K0, i12, this.A0, this.C0, this.D0, this.f36865s0, this.f36866t0, this.E0, this.Q0, this.F0, this.f36858n0, this.S0);
                    bo0Var2.Y0 = this.Y0;
                    bo0Var2.Z0 = this.Z0;
                    presentFragment(bo0Var2, true);
                    return;
                }
                TLRPC.PaymentForm paymentForm = this.f36874y0;
                if (paymentForm.password_missing && (z10 = this.Q0)) {
                    bo0 bo0Var3 = new bo0(this.X0, paymentForm, this.J0, this.K0, 6, this.A0, this.C0, this.D0, this.f36865s0, this.f36866t0, this.E0, z10, this.F0, this.f36858n0, this.S0);
                    this.f36842b0 = bo0Var3;
                    bo0Var3.Y0 = this.Y0;
                    bo0Var3.Z0 = this.Z0;
                    bo0Var3.C0(this.W);
                    bo0 bo0Var4 = this.f36842b0;
                    bo0Var4.P = new pn0(this);
                    presentFragment(bo0Var4, this.O0);
                    return;
                }
                zn0 zn0Var = this.P;
                if (zn0Var != null) {
                    zn0Var.c(this.f36865s0, this.f36866t0, this.Q0, this.F0, null);
                    finishFragment();
                    return;
                }
                bo0 bo0Var5 = new bo0(this.X0, paymentForm, this.J0, this.K0, 4, this.A0, this.C0, this.D0, this.f36865s0, this.f36866t0, this.E0, this.Q0, this.F0, this.f36858n0, this.S0);
                bo0Var5.Y0 = this.Y0;
                bo0Var5.Z0 = this.Z0;
                presentFragment(bo0Var5, this.O0);
                return;
            }
            if (this.f36865s0 == null && this.f36866t0 == null) {
                if (this.f36867u0 != null) {
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
                if (i11 != 2 && this.f36866t0 == null && this.f36867u0 == null && this.f36865s0 == null && !this.f36874y0.additional_methods.isEmpty()) {
                    G0(new an0(this, 1));
                    return;
                }
                bo0 bo0Var6 = new bo0(this.X0, this.f36874y0, this.J0, this.K0, i11, this.A0, this.C0, this.D0, this.f36865s0, this.f36866t0, this.E0, this.Q0, this.F0, this.f36858n0, this.S0);
                bo0Var6.Y0 = this.Y0;
                bo0Var6.Z0 = this.Z0;
                presentFragment(bo0Var6, this.O0);
                return;
            }
            i11 = 4;
            if (i11 != 2) {
            }
            bo0 bo0Var62 = new bo0(this.X0, this.f36874y0, this.J0, this.K0, i11, this.A0, this.C0, this.D0, this.f36865s0, this.f36866t0, this.E0, this.Q0, this.F0, this.f36858n0, this.S0);
            bo0Var62.Y0 = this.Y0;
            bo0Var62.Z0 = this.Z0;
            presentFragment(bo0Var62, this.O0);
            return;
        }
        zn0 zn0Var2 = this.P;
        if (zn0Var2 != null) {
            zn0Var2.d(this.E0);
            finishFragment();
            return;
        }
        if (this.f36874y0.invoice.flexible) {
            i10 = 1;
        } else if (this.f36867u0 == null && this.f36865s0 == null) {
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
        if (i10 == 2 && this.f36867u0 == null && this.f36865s0 == null && !this.f36874y0.additional_methods.isEmpty()) {
            G0(new an0(this, 1));
            return;
        }
        bo0 bo0Var7 = new bo0(this.X0, this.f36874y0, this.J0, this.K0, i10, this.A0, null, null, this.f36865s0, this.f36866t0, this.E0, this.Q0, this.F0, this.f36858n0, this.S0);
        bo0Var7.Y0 = this.Y0;
        bo0Var7.Z0 = this.Z0;
        presentFragment(bo0Var7, this.O0);
    }

    public final void u0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.o2 o2Var, boolean z11) {
        if (o2Var != null) {
            this.currentAccount = o2Var.getCurrentAccount();
        }
        this.f36861q0 = i10;
        this.f36858n0 = o2Var;
        this.f36865s0 = str2;
        this.F0 = tL_inputPaymentCredentialsGooglePay;
        this.A0 = tL_payments_validatedRequestedInfo;
        this.f36874y0 = paymentForm;
        this.C0 = tL_shippingOption;
        this.D0 = l10;
        this.J0 = messageObject;
        this.K0 = str;
        this.X0 = inputInvoice;
        this.Q0 = z10;
        this.S0 = z11;
        this.O0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.f36874y0.native_provider)) ? false : true;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentForm.bot_id));
        this.f36852h0 = user;
        if (user != null) {
            this.f36856l0 = user.first_name;
        } else {
            this.f36856l0 = "";
        }
        this.m0 = paymentForm.title;
        this.E0 = tL_payments_validateRequestedInfo;
        this.P0 = true;
        if (!z10 && this.f36861q0 != 4) {
            this.Q0 = !this.f36874y0.saved_credentials.isEmpty();
        } else {
            this.Q0 = z10;
        }
        if (str3 == null) {
            if (this.f36874y0.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.f36874y0.saved_credentials.get(0);
            this.f36867u0 = tL_paymentSavedCredentialsCard;
            this.f36866t0 = tL_paymentSavedCredentialsCard.title;
            return;
        }
        this.f36866t0 = str3;
    }

    public final void v0(Context context) {
        int i10;
        Optional empty;
        if (getParentActivity() != null) {
            a5.c cVar = new a5.c();
            if (this.f36874y0.invoice.test) {
                i10 = 3;
            } else {
                i10 = 1;
            }
            if (i10 != 2 && i10 != 1 && i10 != 3) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(j7.l1.k(i10, "Invalid environment value "));
            }
            cVar.f161a = i10;
            this.f36847e = new com.google.android.gms.common.api.j(context, h8.p.f7915a, new h8.o(cVar), com.google.android.gms.common.api.i.f3767c);
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
            z5.l.i(jSONObject, "isReadyToPayRequestJson cannot be null!");
            obj.f7876f = jSONObject;
            com.google.android.gms.internal.clearcut.v0 v0Var = this.f36847e;
            v0Var.getClass();
            com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
            b10.f3926a = 23705;
            b10.f3928c = new ha.c(obj, 19);
            v0Var.e(0, b10.b()).addOnCompleteListener(getParentActivity(), new bn0(this, 0));
        }
    }

    public final void w0() {
        if (this.f36839a0) {
            return;
        }
        this.f36839a0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new dn0(this, 1), 10);
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
                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                    if (o2Var instanceof bo0) {
                        o2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.f36852h0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().premiumBotUsername) && this.K0 == null) || (this.K0 != null && getMessagesController().premiumInvoiceSlug != null && Objects.equals(this.K0, getMessagesController().premiumInvoiceSlug))) && b5Var != null) {
            ArrayList arrayList2 = new ArrayList(b5Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                if ((o2Var2 instanceof tn) || (o2Var2 instanceof PremiumPreviewFragment)) {
                    o2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.f35921l0 = true;
            ((ActionBarLayout) b5Var).Q(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).f35599t0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void y0(org.telegram.ui.ActionBar.o2 o2Var) {
        AndroidUtilities.hideKeyboard(this.fragmentView);
        if (o2Var instanceof bo0) {
            bo0 bo0Var = (bo0) o2Var;
            bo0Var.V0 = this.V0;
            bo0Var.U0 = this.U0;
            bo0Var.T0 = this.T0;
            bo0Var.f36867u0 = this.f36867u0;
        }
    }

    public final void z0() {
        long j10;
        String str;
        if (this.M0) {
            return;
        }
        int i10 = 0;
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
        tL_payments_sendPaymentForm.form_id = this.f36874y0.form_id;
        if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && this.f36867u0 != null) {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.f22410id = this.f36867u0.f22521id;
            tL_inputPaymentCredentialsSaved.tmp_password = UserConfig.getInstance(this.currentAccount).tmpPassword.tmp_password;
        } else {
            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = this.F0;
            if (tL_inputPaymentCredentialsGooglePay != null) {
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsGooglePay;
            } else {
                TLRPC.TL_inputPaymentCredentials tL_inputPaymentCredentials = new TLRPC.TL_inputPaymentCredentials();
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentials;
                tL_inputPaymentCredentials.save = this.Q0;
                tL_inputPaymentCredentials.data = new TLRPC.TL_dataJSON();
                tL_payments_sendPaymentForm.credentials.data.data = this.f36865s0;
            }
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.A0;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.f22522id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags = 1 | tL_payments_sendPaymentForm.flags;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.C0;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.f22528id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        if ((this.f36874y0.invoice.flags & 256) != 0) {
            Long l10 = this.D0;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = 0;
            }
            tL_payments_sendPaymentForm.tip_amount = j10;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        u80 u80Var = new u80(13, this, tL_payments_sendPaymentForm);
        if (this.S0) {
            i10 = 8;
        }
        connectionsManager.sendRequest(tL_payments_sendPaymentForm, u80Var, i10 | 2);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        y0(o2Var);
        return super.presentFragment(o2Var, z10);
    }

    public bo0(TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, org.telegram.ui.ActionBar.o2 o2Var) {
        super(null);
        this.f36838a = new ArrayList();
        this.f36841b = new HashMap();
        this.f36844c = new HashMap();
        this.d = new HashMap();
        this.C = true;
        this.E = new org.telegram.ui.Cells.k4[3];
        this.F = new ArrayList();
        this.G = new org.telegram.ui.Cells.x6[3];
        this.I = new org.telegram.ui.Cells.y8[3];
        this.J = new org.telegram.ui.Cells.y9[2];
        this.U = new org.telegram.ui.Cells.x8[7];
        this.V = -4.5f;
        this.Y = 6;
        this.R0 = true;
        u0(null, paymentForm, messageObject, str, 4, null, null, null, null, null, null, false, null, o2Var, false);
    }

    public bo0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.f36838a = new ArrayList();
        this.f36841b = new HashMap();
        this.f36844c = new HashMap();
        this.d = new HashMap();
        this.C = true;
        this.E = new org.telegram.ui.Cells.k4[3];
        this.F = new ArrayList();
        this.G = new org.telegram.ui.Cells.x6[3];
        this.I = new org.telegram.ui.Cells.y8[3];
        this.J = new org.telegram.ui.Cells.y9[2];
        this.U = new org.telegram.ui.Cells.x8[7];
        this.V = -4.5f;
        this.Y = 6;
        this.f36861q0 = 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.f36874y0 = paymentForm;
        this.f36875z0 = paymentReceipt;
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
        this.f36852h0 = user;
        if (user != null) {
            this.f36856l0 = user.first_name;
        } else {
            this.f36856l0 = "";
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
        this.f36866t0 = paymentReceipt.credentials_title;
    }

    public bo0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.o2 o2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, o2Var, false);
        this.R0 = true;
    }
}
