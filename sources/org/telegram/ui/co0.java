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
public final class co0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static final List f37243c1 = Arrays.asList("http", "https");
    public static final List f37244d1 = Collections.singletonList("tg");
    public ScrollView A;
    public TLRPC.TL_payments_validatedRequestedInfo A0;
    public boolean B;
    public TLRPC.TL_paymentFormMethod B0;
    public boolean C;
    public TLRPC.TL_shippingOption C0;
    public TextView D;
    public Long D0;
    public final org.telegram.ui.Cells.m4[] E;
    public TLRPC.TL_payments_validateRequestedInfo E0;
    public final ArrayList F;
    public TLRPC.TL_inputPaymentCredentialsGooglePay F0;
    public final org.telegram.ui.Cells.z6[] G;
    public String G0;
    public org.telegram.ui.Cells.t8 H;
    public String H0;
    public final org.telegram.ui.Cells.b9[] I;
    public JSONObject I0;
    public final org.telegram.ui.Cells.ba[] J;
    public MessageObject J0;
    public FrameLayout K;
    public String K0;
    public FrameLayout L;
    public boolean L0;
    public LinearLayout M;
    public boolean M0;
    public org.telegram.ui.Cells.c9 N;
    public String[] N0;
    public org.telegram.ui.Cells.k3 O;
    public boolean O0;
    public ao0 P;
    public boolean P0;
    public TextView Q;
    public boolean Q0;
    public org.telegram.ui.Cells.o6 R;
    public boolean R0;
    public yn0 S;
    public boolean S0;
    public org.telegram.ui.Cells.l5 T;
    public boolean T0;
    public final org.telegram.ui.Cells.a9[] U;
    public org.telegram.ui.ActionBar.b6 U0;
    public float V;
    public bo0 V0;
    public TL_account.Password W;
    public boolean W0;
    public boolean X;
    public TLRPC.InputInvoice X0;
    public int Y;
    public Utilities.Callback Y0;
    public bn0 Z;
    public Utilities.Callback Z0;
    public final ArrayList f37245a;
    public boolean f37246a0;
    public t10 f37247a1;
    public final HashMap f37248b;
    public co0 f37249b0;
    public int f37250b1;
    public final HashMap f37251c;
    public boolean f37252c0;
    public final HashMap d;
    public boolean f37253d0;
    public com.google.android.gms.internal.clearcut.v0 f37254e;
    public boolean f37255e0;
    public EditTextBoldCursor[] f37256f;
    public String f37257f0;
    public boolean f37258g0;
    public org.telegram.ui.Cells.j6[] h;
    public TLRPC.User f37259h0;
    public boolean f37260i0;
    public boolean f37261j0;
    public boolean f37262k0;
    public String f37263l0;
    public String m0;
    public org.telegram.ui.ActionBar.w0 f37264n;
    public org.telegram.ui.ActionBar.o2 f37265n0;
    public gn0 f37266o0;
    public ArrayList f37267p0;
    public int f37268q0;
    public org.telegram.ui.Components.jq f37269r;
    public boolean f37270r0;
    public org.telegram.ui.Components.jq f37271s;
    public String f37272s0;
    public String f37273t0;
    public TLRPC.TL_paymentSavedCredentialsCard f37274u0;
    public AnimatorSet v;
    public boolean f37275v0;
    public WebView f37276w;
    public lt f37277w0;
    public String f37278x;
    public String f37279x0;
    public boolean f37280y;
    public TLRPC.PaymentForm f37281y0;
    public final TLRPC.PaymentReceipt f37282z0;

    public co0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i9, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.o2 o2Var, boolean z11) {
        super(null);
        this.f37245a = new ArrayList();
        this.f37248b = new HashMap();
        this.f37251c = new HashMap();
        this.d = new HashMap();
        this.C = true;
        this.E = new org.telegram.ui.Cells.m4[3];
        this.F = new ArrayList();
        this.G = new org.telegram.ui.Cells.z6[3];
        this.I = new org.telegram.ui.Cells.b9[3];
        this.J = new org.telegram.ui.Cells.ba[2];
        this.U = new org.telegram.ui.Cells.a9[7];
        this.V = -4.5f;
        this.Y = 6;
        t0(inputInvoice, paymentForm, messageObject, str, i9, tL_payments_validatedRequestedInfo, tL_shippingOption, l10, str2, str3, tL_payments_validateRequestedInfo, z10, tL_inputPaymentCredentialsGooglePay, o2Var, z11);
    }

    public static void T(co0 co0Var, TL_account.Password password, byte[] bArr) {
        byte[] bArr2;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        v40 v40Var = new v40(18, co0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            gettmppassword.password = startCheck;
            if (startCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                v40Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(co0Var.currentAccount).sendRequest(gettmppassword, v40Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        v40Var.run(null, tL_error2);
    }

    public static void U(co0 co0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        co0Var.C0(false);
        co0Var.G0(true, false);
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
                    co0Var.D0(2);
                    return;
                case 1:
                    co0Var.D0(0);
                    return;
                case 2:
                    co0Var.D0(4);
                    return;
                case 3:
                    co0Var.D0(6);
                    return;
                case 4:
                    co0Var.D0(5);
                    return;
                case 5:
                    co0Var.D0(3);
                    return;
                case 6:
                    co0Var.D0(9);
                    return;
                case 7:
                    co0Var.D0(1);
                    return;
                case '\b':
                    co0Var.D0(7);
                    return;
                default:
                    org.telegram.ui.Components.y4.f0(co0Var.currentAccount, tL_error, co0Var, tLObject, new Object[0]);
                    return;
            }
        }
    }

    public static void V(co0 co0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        int i9;
        co0Var.A0 = tL_payments_validatedRequestedInfo;
        if (co0Var.f37281y0.saved_info != null && !co0Var.P0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(co0Var.currentAccount);
            ih.q5 q5Var = new ih.q5(17);
            if (co0Var.S0) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            connectionsManager.sendRequest(tL_payments_clearSavedInfo, q5Var, i9);
        }
        co0Var.s0();
        co0Var.C0(false);
        co0Var.G0(true, false);
    }

    public static void W(co0 co0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        co0Var.C0(false);
        co0Var.G0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.y4.f0(co0Var.currentAccount, tL_error, co0Var, tLObject, new Object[0]);
        }
    }

    public static void X(co0 co0Var, org.telegram.ui.Components.gc gcVar, boolean z10, TLRPC.Message message) {
        gcVar.b();
        if (z10) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(qn.Q9(message.f22401id, MessageObject.getDialogId(message)));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = message.f22401id;
        tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(co0Var.currentAccount).getInputPeer(message.peer_id);
        ConnectionsManager.getInstance(co0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new en0(co0Var, 3), 2);
    }

    public static void Y(co0 co0Var) {
        int i9;
        TL_account.resendPasswordEmail resendpasswordemail = new TL_account.resendPasswordEmail();
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(co0Var.currentAccount);
        ih.q5 q5Var = new ih.q5(17);
        if (co0Var.S0) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        connectionsManager.sendRequest(resendpasswordemail, q5Var, i9);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(co0Var.getParentActivity());
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        co0Var.showDialog(alertDialog$Builder.f22702a);
    }

    public static void Z(co0 co0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        gh.m7 m7Var = new gh.m7(co0Var, z10, str, 8);
        if (!z10) {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str2);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = co0Var.W.new_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                updatepasswordsettings.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                if (updatepasswordsettings.new_settings.new_password_hash == null) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "ALGO_INVALID";
                    m7Var.run(null, tL_error);
                }
                ConnectionsManager.getInstance(co0Var.currentAccount).sendRequest(updatepasswordsettings, m7Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            m7Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(co0Var.currentAccount).sendRequest(updatepasswordsettings, m7Var, 10);
    }

    public static void a0(co0 co0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.y4.f0(co0Var.currentAccount, tL_error, co0Var, tL_payments_sendPaymentForm, new Object[0]);
        co0Var.C0(false);
        co0Var.G0(false, false);
        co0Var.W0 = true;
        co0Var.f37250b1 = 4;
        bo0 bo0Var = co0Var.V0;
        if (bo0Var != null) {
            bo0Var.b(4);
        }
    }

    public static void b0(co0 co0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.o2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            gh.oa.j1(co0Var.getParentActivity(), co0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, co0Var.U0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (R = LaunchActivity.R()) != 0) {
            ?? obj = new Object();
            obj.f23653a = true;
            co0 co0Var2 = new co0((TLRPC.PaymentReceipt) tLObject);
            co0Var2.Y0 = co0Var.Y0;
            co0Var2.Z0 = co0Var.Z0;
            R.showAsSheet(co0Var2, obj);
        }
    }

    public static void c0(co0 co0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        co0Var.G0(true, false);
        co0Var.C0(false);
        if (tLObject != null) {
            co0Var.f37270r0 = true;
            UserConfig.getInstance(co0Var.currentAccount).tmpPassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(co0Var.currentAccount).saveConfig(false);
            co0Var.s0();
        } else if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            try {
                co0Var.f37256f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(co0Var.f37256f[1], 3.25f);
            co0Var.f37256f[1].setText("");
        } else {
            org.telegram.ui.Components.y4.f0(co0Var.currentAccount, tL_error, co0Var, gettmppassword, new Object[0]);
        }
    }

    public static void d0(co0 co0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.o2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            gh.oa.j1(co0Var.getParentActivity(), co0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, co0Var.U0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (R = LaunchActivity.R()) != 0) {
            ?? obj = new Object();
            obj.f23653a = true;
            co0 co0Var2 = new co0((TLRPC.PaymentReceipt) tLObject);
            co0Var2.Y0 = co0Var.Y0;
            co0Var2.Z0 = co0Var.Z0;
            R.showAsSheet(co0Var2, obj);
        }
    }

    public static void e0(co0 co0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.h0(password, false)) {
                org.telegram.ui.Components.y4.x0(co0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            } else if (!password.has_password) {
                co0Var.f37270r0 = false;
                co0Var.s0();
                return;
            } else {
                Utilities.globalQueue.postRunnable(new ye0(co0Var, password, AndroidUtilities.getStringBytes(str), 14));
                return;
            }
        }
        org.telegram.ui.Components.y4.f0(co0Var.currentAccount, tL_error, co0Var, getpassword, new Object[0]);
        co0Var.G0(true, false);
        co0Var.C0(false);
    }

    public static void f0(co0 co0Var, org.telegram.ui.Components.gc gcVar, boolean z10, TLRPC.Message[] messageArr) {
        gcVar.b();
        if (z10) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(qn.Q9(messageArr[0].f22401id, MessageObject.getDialogId(messageArr[0])));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = messageArr[0].f22401id;
        tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(co0Var.currentAccount).getInputPeer(messageArr[0].peer_id);
        ConnectionsManager.getInstance(co0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new en0(co0Var, 2), 2);
    }

    public static void g0(org.telegram.ui.co0 r23, java.lang.String r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co0.g0(org.telegram.ui.co0, java.lang.String, android.view.View):void");
    }

    public static void h0(co0 co0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        String formatPluralString;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(co0Var.currentAccount).sendRequest(new TL_account.getPassword(), new kh.o3(10, co0Var, z10), 8);
            return;
        }
        co0Var.G0(true, false);
        if (z10) {
            TL_account.Password password = co0Var.W;
            password.has_password = false;
            password.current_algo = null;
            co0Var.P.a(password);
            co0Var.finishFragment();
        } else if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (co0Var.getParentActivity() != null) {
                co0Var.s0();
            }
        } else if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    co0Var.E0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    co0Var.E0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    co0Var.E0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            }
            co0Var.Y = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(co0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new nl0(4, co0Var, str));
            String string = LocaleController.getString(R.string.YourEmailAlmostThereText);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.P = string;
            c2Var.N = LocaleController.getString(R.string.YourEmailAlmostThere);
            Dialog showDialog = co0Var.showDialog(c2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        }
    }

    public static void i0(org.telegram.ui.co0 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co0.i0(org.telegram.ui.co0):void");
    }

    public static void j0(co0 co0Var) {
        int i9 = 0;
        if (UserConfig.getInstance(co0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(co0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(co0Var.currentAccount).getCurrentTime() + 60) {
            UserConfig.getInstance(co0Var.currentAccount).tmpPassword = null;
            UserConfig.getInstance(co0Var.currentAccount).saveConfig(false);
        }
        if (UserConfig.getInstance(co0Var.currentAccount).tmpPassword != null) {
            co0Var.y0();
        } else if (co0Var.f37256f[1].length() == 0) {
            try {
                co0Var.f37256f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(co0Var.f37256f[1], 2.5f);
        } else {
            String obj = co0Var.f37256f[1].getText().toString();
            co0Var.G0(true, true);
            co0Var.C0(true);
            TL_account.getPassword getpassword = new TL_account.getPassword();
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(co0Var.currentAccount);
            y9 y9Var = new y9(co0Var, obj, getpassword, 28);
            if (co0Var.S0) {
                i9 = 8;
            }
            connectionsManager.sendRequest(getpassword, y9Var, i9 | 2);
        }
    }

    public static void l0(co0 co0Var) {
        if (co0Var.M0) {
            return;
        }
        co0Var.G0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        co0Var.E0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = co0Var.X0;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (co0Var.J0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = co0Var.getMessagesController().getInputPeer(co0Var.J0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = co0Var.J0.getId();
            co0Var.E0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = co0Var.K0;
            co0Var.E0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = co0Var.E0;
        tL_payments_validateRequestedInfo2.save = co0Var.P0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (co0Var.f37281y0.invoice.name_requested) {
            co0Var.E0.info.name = co0Var.f37256f[6].getText().toString();
            co0Var.E0.info.flags |= 1;
        }
        int i9 = 8;
        if (co0Var.f37281y0.invoice.phone_requested) {
            co0Var.E0.info.phone = "+" + co0Var.f37256f[8].getText().toString() + co0Var.f37256f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = co0Var.E0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (co0Var.f37281y0.invoice.email_requested) {
            co0Var.E0.info.email = co0Var.f37256f[7].getText().toString().trim();
            co0Var.E0.info.flags |= 4;
        }
        if (co0Var.f37281y0.invoice.shipping_address_requested) {
            co0Var.E0.info.shipping_address = new TLRPC.TL_postAddress();
            co0Var.E0.info.shipping_address.street_line1 = co0Var.f37256f[0].getText().toString();
            co0Var.E0.info.shipping_address.street_line2 = co0Var.f37256f[1].getText().toString();
            co0Var.E0.info.shipping_address.city = co0Var.f37256f[2].getText().toString();
            co0Var.E0.info.shipping_address.state = co0Var.f37256f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = co0Var.E0.info.shipping_address;
            String str = co0Var.f37279x0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = co0Var.f37256f[5].getText().toString();
            co0Var.E0.info.flags |= 8;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo3 = co0Var.E0;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(co0Var.currentAccount);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo4 = co0Var.E0;
        v40 v40Var = new v40(16, co0Var, tL_payments_validateRequestedInfo3);
        if (!co0Var.S0) {
            i9 = 0;
        }
        connectionsManager.sendRequest(tL_payments_validateRequestedInfo4, v40Var, i9 | 2);
    }

    public static JSONObject o0() {
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

    public final void A0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        int i9;
        int i10;
        int i11;
        boolean z10;
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        boolean z11 = true;
        org.telegram.ui.Cells.a9[] a9VarArr = this.U;
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
            j3.r0.A(sb2, ", ", str4, ", ", str5);
            String r10 = aa.d.r(sb2, ", ", str6);
            a9VarArr[2].b(R.drawable.msg_payment_address, r10, LocaleController.getString(R.string.PaymentShippingAddress), true);
        }
        org.telegram.ui.Cells.a9 a9Var = a9VarArr[2];
        int i12 = 8;
        if (tL_paymentRequestedInfo.shipping_address != null) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        a9Var.setVisibility(i9);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            a9VarArr[3].b(R.drawable.msg_contacts, str7, LocaleController.getString(R.string.PaymentCheckoutName), true);
        }
        org.telegram.ui.Cells.a9 a9Var2 = a9VarArr[3];
        if (tL_paymentRequestedInfo.name != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        a9Var2.setVisibility(i10);
        if (tL_paymentRequestedInfo.phone != null) {
            org.telegram.ui.Cells.a9 a9Var3 = a9VarArr[4];
            String b10 = ne.b.c().b(tL_paymentRequestedInfo.phone);
            String string = LocaleController.getString(R.string.PaymentCheckoutPhoneNumber);
            int i13 = R.drawable.msg_calls;
            if (tL_paymentRequestedInfo.email == null && this.C0 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            a9Var3.b(i13, b10, string, z10);
        }
        org.telegram.ui.Cells.a9 a9Var4 = a9VarArr[4];
        if (tL_paymentRequestedInfo.phone != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        a9Var4.setVisibility(i11);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            org.telegram.ui.Cells.a9 a9Var5 = a9VarArr[5];
            String string2 = LocaleController.getString(R.string.PaymentCheckoutEmail);
            int i14 = R.drawable.msg_mention;
            if (this.C0 == null) {
                z11 = false;
            }
            a9Var5.b(i14, str8, string2, z11);
        }
        org.telegram.ui.Cells.a9 a9Var6 = a9VarArr[5];
        if (tL_paymentRequestedInfo.email != null) {
            i12 = 0;
        }
        a9Var6.setVisibility(i12);
    }

    public final void B0(TL_account.Password password) {
        boolean z10;
        if (password != null && password.has_password) {
            if (getParentActivity() == null) {
                return;
            }
            s0();
            return;
        }
        this.W = password;
        if (password != null && !TextUtils.isEmpty(password.email_unconfirmed_pattern)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X = z10;
        I0();
    }

    public final void C0(boolean z10) {
        this.L0 = z10;
        this.C = !z10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.L0);
        }
        org.telegram.ui.Cells.a9 a9Var = this.U[0];
        if (a9Var != null) {
            a9Var.setEnabled(!this.L0);
        }
    }

    public final void D0(int i9) {
        EditTextBoldCursor editTextBoldCursor = this.f37256f[i9];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(editTextBoldCursor, 2.5f);
    }

    public final void E0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = str;
        c2Var.P = str2;
        showDialog(c2Var);
    }

    public final void F0(Runnable runnable) {
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(getParentActivity(), null, false, false);
        f3Var.fixNavigationBar();
        f3Var.title = LocaleController.getString(R.string.PaymentCheckoutMethod);
        f3Var.bigTitle = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.f37274u0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
        } else {
            String str = this.f37273t0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_paymentSavedCredentialsCard> arrayList4 = this.f37281y0.saved_credentials;
        int size = arrayList4.size();
        int i9 = 0;
        while (i9 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i9);
            i9++;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard3 = tL_paymentSavedCredentialsCard2;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.f37274u0;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.f22509id, tL_paymentSavedCredentialsCard4.f22509id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
                arrayList3.add(tL_paymentSavedCredentialsCard3);
            }
        }
        ArrayList<TLRPC.TL_paymentFormMethod> arrayList5 = this.f37281y0.additional_methods;
        int size2 = arrayList5.size();
        int i10 = 0;
        while (i10 < size2) {
            TLRPC.TL_paymentFormMethod tL_paymentFormMethod = arrayList5.get(i10);
            i10++;
            arrayList.add(tL_paymentFormMethod.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_provider));
        }
        arrayList.add(LocaleController.getString(R.string.PaymentCheckoutMethodNewCard));
        arrayList2.add(Integer.valueOf(R.drawable.msg_addbot));
        int[] iArr = new int[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            iArr[i11] = ((Integer) arrayList2.get(i11)).intValue();
        }
        org.telegram.ui.Components.w2 w2Var = new org.telegram.ui.Components.w2(this, runnable, arrayList3, arrayList, 1);
        f3Var.items = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        f3Var.itemIcons = iArr;
        f3Var.onClickListener = w2Var;
        showDialog(f3Var);
    }

    public final void G0(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10 && this.f37264n != null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.v = animatorSet2;
            if (z11) {
                this.f37269r.setVisibility(0);
                this.f37264n.setEnabled(false);
                AnimatorSet animatorSet3 = this.v;
                View contentView = this.f37264n.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, property, 0.1f);
                View contentView2 = this.f37264n.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, property2, 0.1f);
                View contentView3 = this.f37264n.getContentView();
                Property property3 = View.ALPHA;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, property3, 0.0f), ObjectAnimator.ofFloat(this.f37269r, property, 1.0f), ObjectAnimator.ofFloat(this.f37269r, property2, 1.0f), ObjectAnimator.ofFloat(this.f37269r, property3, 1.0f));
            } else if (this.f37276w != null) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f37269r, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.f37269r, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.f37269r, View.ALPHA, 0.0f));
            } else {
                this.f37264n.getContentView().setVisibility(0);
                this.f37264n.setEnabled(true);
                AnimatorSet animatorSet4 = this.v;
                org.telegram.ui.Components.jq jqVar = this.f37269r;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(jqVar, property4, 0.1f);
                org.telegram.ui.Components.jq jqVar2 = this.f37269r;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(jqVar2, property5, 0.1f);
                org.telegram.ui.Components.jq jqVar3 = this.f37269r;
                Property property6 = View.ALPHA;
                animatorSet4.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(jqVar3, property6, 0.0f));
                if (!isFinishing()) {
                    this.v.playTogether(ObjectAnimator.ofFloat(this.f37264n.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.f37264n.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.f37264n.getContentView(), property6, 1.0f));
                }
            }
            this.v.addListener(new tn0(this, z11, 0));
            this.v.setDuration(150L);
            this.v.start();
        } else if (this.Q != null) {
            this.v = new AnimatorSet();
            if (z11) {
                this.f37271s.setVisibility(0);
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
                animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, property9, 0.0f), ObjectAnimator.ofFloat(this.f37271s, property7, 1.0f), ObjectAnimator.ofFloat(this.f37271s, property8, 1.0f), ObjectAnimator.ofFloat(this.f37271s, property9, 1.0f));
            } else {
                this.Q.setVisibility(0);
                this.S.setEnabled(true);
                AnimatorSet animatorSet6 = this.v;
                org.telegram.ui.Components.jq jqVar4 = this.f37271s;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(jqVar4, property10, 0.1f);
                org.telegram.ui.Components.jq jqVar5 = this.f37271s;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(jqVar5, property11, 0.1f);
                org.telegram.ui.Components.jq jqVar6 = this.f37271s;
                Property property12 = View.ALPHA;
                animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(jqVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.Q, property10, 1.0f), ObjectAnimator.ofFloat(this.Q, property11, 1.0f), ObjectAnimator.ofFloat(this.Q, property12, 1.0f));
            }
            this.v.addListener(new tn0(this, z11, 1));
            this.v.setDuration(150L);
            this.v.start();
        }
    }

    public final void H0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.PaymentTransactionReview);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("PaymentTransactionMessage2", R.string.PaymentTransactionMessage2, str, this.f37263l0, this.m0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new cn0(this, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var);
    }

    public final void I0() {
        if (this.f37268q0 == 6) {
            org.telegram.ui.Cells.b9[] b9VarArr = this.I;
            if (b9VarArr[2] != null) {
                int i9 = 0;
                this.f37264n.setVisibility(0);
                TL_account.Password password = this.W;
                ArrayList arrayList = this.F;
                org.telegram.ui.Cells.m4[] m4VarArr = this.E;
                org.telegram.ui.Cells.ba[] baVarArr = this.J;
                if (password == null) {
                    G0(true, true);
                    b9VarArr[2].setVisibility(8);
                    baVarArr[0].setVisibility(8);
                    baVarArr[1].setVisibility(8);
                    this.O.setVisibility(8);
                    m4VarArr[0].setVisibility(8);
                    m4VarArr[1].setVisibility(8);
                    b9VarArr[0].setVisibility(8);
                    for (int i10 = 0; i10 < 3; i10++) {
                        ((View) this.f37256f[i10].getParent()).setVisibility(8);
                    }
                    while (i9 < arrayList.size()) {
                        ((View) arrayList.get(i9)).setVisibility(8);
                        i9++;
                    }
                    return;
                }
                G0(true, false);
                if (this.X) {
                    org.telegram.ui.Cells.b9 b9Var = b9VarArr[2];
                    int i11 = R.string.EmailPasswordConfirmText2;
                    String str = this.W.email_unconfirmed_pattern;
                    if (str == null) {
                        str = "";
                    }
                    b9Var.setText(LocaleController.formatString("EmailPasswordConfirmText2", i11, str));
                    b9VarArr[2].setVisibility(0);
                    baVarArr[0].setVisibility(0);
                    baVarArr[1].setVisibility(0);
                    this.O.setVisibility(0);
                    b9VarArr[1].setText("");
                    m4VarArr[0].setVisibility(8);
                    m4VarArr[1].setVisibility(8);
                    b9VarArr[0].setVisibility(8);
                    for (int i12 = 0; i12 < 3; i12++) {
                        ((View) this.f37256f[i12].getParent()).setVisibility(8);
                    }
                    while (i9 < arrayList.size()) {
                        ((View) arrayList.get(i9)).setVisibility(8);
                        i9++;
                    }
                    return;
                }
                b9VarArr[2].setVisibility(8);
                baVarArr[0].setVisibility(8);
                baVarArr[1].setVisibility(8);
                b9VarArr[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                this.O.setVisibility(8);
                m4VarArr[0].setVisibility(0);
                m4VarArr[1].setVisibility(0);
                b9VarArr[0].setVisibility(0);
                for (int i13 = 0; i13 < 3; i13++) {
                    ((View) this.f37256f[i13].getParent()).setVisibility(0);
                }
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((View) arrayList.get(i14)).setVisibility(0);
                }
            }
        }
    }

    public final void K0() {
        org.telegram.ui.Cells.b9[] b9VarArr = this.I;
        if (b9VarArr[0] != null) {
            org.telegram.ui.Cells.z6[] z6VarArr = this.G;
            if (z6VarArr[2] != null) {
                TLRPC.PaymentForm paymentForm = this.f37281y0;
                if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.f37276w != null && this.f37275v0)) {
                    this.H.setVisibility(8);
                    b9VarArr[0].setVisibility(8);
                    org.telegram.ui.Cells.z6 z6Var = z6VarArr[2];
                    z6Var.setBackground(org.telegram.ui.ActionBar.f6.V0(z6Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine1));
                if (this.f37281y0.password_missing) {
                    v0();
                    spannableStringBuilder.append((CharSequence) "\n");
                    int length = spannableStringBuilder.length();
                    String string = LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine2);
                    int indexOf = string.indexOf(42);
                    int lastIndexOf = string.lastIndexOf(42);
                    spannableStringBuilder.append((CharSequence) string);
                    if (indexOf != -1 && lastIndexOf != -1) {
                        int i9 = indexOf + length;
                        int i10 = lastIndexOf + length;
                        b9VarArr[0].getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                        spannableStringBuilder.replace(i9, i9 + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new zn0(this), i9, i10 - 1, 33);
                    }
                }
                this.H.setEnabled(true);
                b9VarArr[0].setText(spannableStringBuilder);
                this.H.setVisibility(0);
                b9VarArr[0].setVisibility(0);
                org.telegram.ui.Cells.z6 z6Var2 = z6VarArr[2];
                z6Var2.setBackground(org.telegram.ui.ActionBar.f6.V0(z6Var2.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.f6.f22966b7));
            }
        }
    }

    public final void L0() {
        this.N0[0] = r0(this.f37267p0);
        this.N.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.N0[0], true);
        TextView textView = this.Q;
        if (textView != null) {
            textView.setText(LocaleController.formatString("PaymentCheckoutPay", R.string.PaymentCheckoutPay, this.N0[0]));
        }
        if (this.f37266o0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.ei);
            int childCount = this.f37266o0.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                TextView textView2 = (TextView) this.f37266o0.getChildAt(i9);
                if (textView2.getTag().equals(this.D0)) {
                    org.telegram.ui.ActionBar.f6.w1(themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.fi));
                } else {
                    org.telegram.ui.ActionBar.f6.w1(536870911 & themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Z8));
                }
                textView2.invalidate();
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.twoStepPasswordChanged) {
            TLRPC.PaymentForm paymentForm = this.f37281y0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            K0();
        } else if (i9 == NotificationCenter.didRemoveTwoStepPassword) {
            TLRPC.PaymentForm paymentForm2 = this.f37281y0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            K0();
        } else if (i9 == NotificationCenter.paymentFinished) {
            this.W0 = true;
            removeSelfFromStack();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        return this.U0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f23269s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.f6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        org.telegram.ui.Components.jq jqVar = this.f37269r;
        int i10 = org.telegram.ui.ActionBar.f6.D7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(jqVar, 0, null, null, null, null, i10));
        org.telegram.ui.Components.jq jqVar2 = this.f37269r;
        int i11 = org.telegram.ui.ActionBar.f6.E7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(jqVar2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f37271s, 0, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f37271s, 0, null, null, null, null, i11));
        if (this.f37256f != null) {
            int i12 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f37256f;
                if (i12 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h6((View) editTextBoldCursorArr[i12].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.f37256f[i12], 4, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.f37256f[i12], 8388608, null, null, null, null, org.telegram.ui.ActionBar.f6.H6));
                i12++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.f6.H6));
        }
        if (this.h != null) {
            int i13 = 0;
            while (true) {
                org.telegram.ui.Cells.j6[] j6VarArr = this.h;
                if (i13 >= j6VarArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h6(j6VarArr[i13], 268435456, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.h[i13], 268435456, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.h[i13], 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.h[i13], 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23056g7));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.h[i13], 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23074h7));
                i13++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23056g7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23074h7));
        }
        int i14 = 0;
        while (true) {
            org.telegram.ui.Cells.m4[] m4VarArr = this.E;
            if (i14 >= m4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6(m4VarArr[i14], 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(m4VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
            i14++;
        }
        int i15 = 0;
        while (true) {
            org.telegram.ui.Cells.z6[] z6VarArr = this.G;
            if (i15 >= z6VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6(z6VarArr[i15], 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22966b7));
            i15++;
        }
        int i16 = 0;
        while (true) {
            org.telegram.ui.Cells.b9[] b9VarArr = this.I;
            if (i16 >= b9VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6(b9VarArr[i16], 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22966b7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(b9VarArr[i16], 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(b9VarArr[i16], 2, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.J6));
            i16++;
        }
        int i17 = 0;
        while (true) {
            ArrayList arrayList2 = this.F;
            if (i17 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6((View) arrayList2.get(i17), 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
            i17++;
        }
        org.telegram.ui.Cells.k3 k3Var = this.O;
        int i18 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(k3Var, 1, null, null, null, null, i18));
        int i19 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 4, new Class[]{org.telegram.ui.Cells.k3.class}, new String[]{"textView"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 8388608, new Class[]{org.telegram.ui.Cells.k3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 4, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, 268435456, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, 268435456, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        int i20 = 0;
        while (true) {
            org.telegram.ui.Cells.ba[] baVarArr = this.J;
            if (i20 >= baVarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6(baVarArr[i20], 268435456, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(baVarArr[i20], 268435456, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(baVarArr[i20], 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
            i20++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f23267s6));
        int i21 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 16, new Class[]{org.telegram.ui.Cells.c9.class}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 262144, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 262144, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        int i23 = org.telegram.ui.ActionBar.f6.f23386z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 262144, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 262144, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, i23));
        org.telegram.ui.Cells.a9[] a9VarArr = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.h6(a9VarArr[0], 268435456, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(a9VarArr[0], 268435456, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        for (int i24 = 1; i24 < a9VarArr.length; i24++) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(a9VarArr[i24], 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(a9VarArr[i24], 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(a9VarArr[i24], 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23386z6));
        }
        org.telegram.ui.Cells.l5 l5Var = this.T;
        int i25 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(l5Var, 1, null, null, null, null, i25));
        int i26 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.T, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"nameTextView"}, null, null, -1, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.T, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"detailTextView"}, null, null, -1, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.T, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"detailExTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23386z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.S, 268435456, null, null, null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.S, 268435456, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.C;
    }

    public final void m0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.K = frameLayout;
        frameLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
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
        this.K.addView(this.L, g7.e6.c(48.0f, -1));
        this.L.setOnClickListener(new ym0(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.L.addView(linearLayout, g7.e6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, g7.e6.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.L.addView(imageView2, g7.e6.c(-1.0f, -1));
    }

    public final void n0(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co0.n0(java.lang.String):void");
    }

    @Override
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        if (i9 == 991) {
            AndroidUtilities.runOnUIThread(new jh0(this, i10, intent, 2));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        WebView webView = this.f37276w;
        if (webView != null && this.f37280y) {
            if (z10) {
                webView.loadUrl(this.f37278x);
                this.f37280y = false;
            }
            return false;
        }
        return !this.L0;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.f37268q0 == 4 && this.T0) {
            this.T0 = false;
            this.S.callOnClick();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.f37268q0 != 4 || this.R0) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.paymentFinished);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co0.onFragmentDestroy():void");
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                int i9 = this.f37268q0;
                if ((i9 == 2 || i9 == 6) && !this.f37281y0.invoice.test) {
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
        if (z10 && !z11) {
            WebView webView = this.f37276w;
            if (webView != null) {
                if (this.f37268q0 != 4) {
                    TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.B0;
                    if (tL_paymentFormMethod != null) {
                        String str = tL_paymentFormMethod.url;
                        this.f37278x = str;
                        webView.loadUrl(str);
                        return;
                    }
                    String str2 = this.f37281y0.url;
                    this.f37278x = str2;
                    webView.loadUrl(str2);
                    return;
                }
                return;
            }
            int i9 = this.f37268q0;
            if (i9 == 2) {
                AndroidUtilities.runOnUIThread(new bn0(this, 0), 100L);
            } else if (i9 == 3) {
                this.f37256f[1].requestFocus();
                AndroidUtilities.showKeyboard(this.f37256f[1]);
            } else if (i9 == 4) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f37256f;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                }
            } else if (i9 == 6 && !this.X) {
                this.f37256f[0].requestFocus();
                AndroidUtilities.showKeyboard(this.f37256f[0]);
            }
        }
    }

    public final long p0() {
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

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        x0(o2Var);
        return super.presentFragment(o2Var);
    }

    public final long q0() {
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

    public final String r0(ArrayList arrayList) {
        long j10 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i9)).amount;
        }
        Long l10 = this.D0;
        if (l10 != null) {
            j10 += l10.longValue();
        }
        return LocaleController.getInstance().formatCurrencyString(j10, this.f37281y0.invoice.currency);
    }

    public final void s0() {
        int i9;
        int i10;
        boolean z10;
        int i11;
        int i12 = this.f37268q0;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 6) {
                                if (!this.P.c(this.f37272s0, this.f37273t0, this.Q0, this.F0, this.f37274u0)) {
                                    co0 co0Var = new co0(this.X0, this.f37281y0, this.J0, this.K0, 4, this.A0, this.C0, this.D0, this.f37272s0, this.f37273t0, this.E0, this.Q0, this.F0, this.f37265n0, false);
                                    co0Var.Y0 = this.Y0;
                                    co0Var.Z0 = this.Z0;
                                    presentFragment(co0Var, true);
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
                            if (!w0(getParentLayout(), getParentActivity()) && !isFinishing()) {
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new bn0(this, 2), 500L);
                        return;
                    }
                    if (this.f37270r0) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    co0 co0Var2 = new co0(this.X0, this.f37281y0, this.J0, this.K0, i11, this.A0, this.C0, this.D0, this.f37272s0, this.f37273t0, this.E0, this.Q0, this.F0, this.f37265n0, this.S0);
                    co0Var2.Y0 = this.Y0;
                    co0Var2.Z0 = this.Z0;
                    presentFragment(co0Var2, true);
                    return;
                }
                TLRPC.PaymentForm paymentForm = this.f37281y0;
                if (paymentForm.password_missing && (z10 = this.Q0)) {
                    co0 co0Var3 = new co0(this.X0, paymentForm, this.J0, this.K0, 6, this.A0, this.C0, this.D0, this.f37272s0, this.f37273t0, this.E0, z10, this.F0, this.f37265n0, this.S0);
                    this.f37249b0 = co0Var3;
                    co0Var3.Y0 = this.Y0;
                    co0Var3.Z0 = this.Z0;
                    co0Var3.B0(this.W);
                    co0 co0Var4 = this.f37249b0;
                    co0Var4.P = new qn0(this);
                    presentFragment(co0Var4, this.O0);
                    return;
                }
                ao0 ao0Var = this.P;
                if (ao0Var != null) {
                    ao0Var.c(this.f37272s0, this.f37273t0, this.Q0, this.F0, null);
                    finishFragment();
                    return;
                }
                co0 co0Var5 = new co0(this.X0, paymentForm, this.J0, this.K0, 4, this.A0, this.C0, this.D0, this.f37272s0, this.f37273t0, this.E0, this.Q0, this.F0, this.f37265n0, this.S0);
                co0Var5.Y0 = this.Y0;
                co0Var5.Z0 = this.Z0;
                presentFragment(co0Var5, this.O0);
                return;
            }
            if (this.f37272s0 == null && this.f37273t0 == null) {
                if (this.f37274u0 != null) {
                    if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                        UserConfig.getInstance(this.currentAccount).saveConfig(false);
                    }
                    if (UserConfig.getInstance(this.currentAccount).tmpPassword == null) {
                        i10 = 3;
                    }
                } else {
                    i10 = 2;
                }
                if (i10 != 2 && this.f37273t0 == null && this.f37274u0 == null && this.f37272s0 == null && !this.f37281y0.additional_methods.isEmpty()) {
                    F0(new bn0(this, 1));
                    return;
                }
                co0 co0Var6 = new co0(this.X0, this.f37281y0, this.J0, this.K0, i10, this.A0, this.C0, this.D0, this.f37272s0, this.f37273t0, this.E0, this.Q0, this.F0, this.f37265n0, this.S0);
                co0Var6.Y0 = this.Y0;
                co0Var6.Z0 = this.Z0;
                presentFragment(co0Var6, this.O0);
                return;
            }
            i10 = 4;
            if (i10 != 2) {
            }
            co0 co0Var62 = new co0(this.X0, this.f37281y0, this.J0, this.K0, i10, this.A0, this.C0, this.D0, this.f37272s0, this.f37273t0, this.E0, this.Q0, this.F0, this.f37265n0, this.S0);
            co0Var62.Y0 = this.Y0;
            co0Var62.Z0 = this.Z0;
            presentFragment(co0Var62, this.O0);
            return;
        }
        ao0 ao0Var2 = this.P;
        if (ao0Var2 != null) {
            ao0Var2.d(this.E0);
            finishFragment();
            return;
        }
        if (this.f37281y0.invoice.flexible) {
            i9 = 1;
        } else if (this.f37274u0 == null && this.f37272s0 == null) {
            i9 = 2;
        } else {
            if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                UserConfig.getInstance(this.currentAccount).saveConfig(false);
            }
            if (UserConfig.getInstance(this.currentAccount).tmpPassword != null) {
                i9 = 4;
            } else {
                i9 = 3;
            }
        }
        if (i9 == 2 && this.f37274u0 == null && this.f37272s0 == null && !this.f37281y0.additional_methods.isEmpty()) {
            F0(new bn0(this, 1));
            return;
        }
        co0 co0Var7 = new co0(this.X0, this.f37281y0, this.J0, this.K0, i9, this.A0, null, null, this.f37272s0, this.f37273t0, this.E0, this.Q0, this.F0, this.f37265n0, this.S0);
        co0Var7.Y0 = this.Y0;
        co0Var7.Z0 = this.Z0;
        presentFragment(co0Var7, this.O0);
    }

    public final void t0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i9, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.o2 o2Var, boolean z11) {
        if (o2Var != null) {
            this.currentAccount = o2Var.getCurrentAccount();
        }
        this.f37268q0 = i9;
        this.f37265n0 = o2Var;
        this.f37272s0 = str2;
        this.F0 = tL_inputPaymentCredentialsGooglePay;
        this.A0 = tL_payments_validatedRequestedInfo;
        this.f37281y0 = paymentForm;
        this.C0 = tL_shippingOption;
        this.D0 = l10;
        this.J0 = messageObject;
        this.K0 = str;
        this.X0 = inputInvoice;
        this.Q0 = z10;
        this.S0 = z11;
        this.O0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.f37281y0.native_provider)) ? false : true;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentForm.bot_id));
        this.f37259h0 = user;
        if (user != null) {
            this.f37263l0 = user.first_name;
        } else {
            this.f37263l0 = "";
        }
        this.m0 = paymentForm.title;
        this.E0 = tL_payments_validateRequestedInfo;
        this.P0 = true;
        if (!z10 && this.f37268q0 != 4) {
            this.Q0 = !this.f37281y0.saved_credentials.isEmpty();
        } else {
            this.Q0 = z10;
        }
        if (str3 == null) {
            if (this.f37281y0.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.f37281y0.saved_credentials.get(0);
            this.f37274u0 = tL_paymentSavedCredentialsCard;
            this.f37273t0 = tL_paymentSavedCredentialsCard.title;
            return;
        }
        this.f37273t0 = str3;
    }

    public final void u0(Context context) {
        int i9;
        Optional empty;
        if (getParentActivity() != null) {
            com.google.android.gms.internal.cast.a aVar = new com.google.android.gms.internal.cast.a();
            if (this.f37281y0.invoice.test) {
                i9 = 3;
            } else {
                i9 = 1;
            }
            if (i9 != 2 && i9 != 1 && i9 != 3) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(j3.r0.l(i9, "Invalid environment value "));
            }
            aVar.f2981a = i9;
            this.f37254e = new com.google.android.gms.common.api.j(context, f8.p.f5967a, new f8.o(aVar), com.google.android.gms.common.api.i.f2753c);
            try {
                JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                put.put("allowedPaymentMethods", new JSONArray().put(o0()));
                empty = Optional.of(put);
            } catch (JSONException unused) {
                empty = Optional.empty();
            }
            if (!empty.isPresent()) {
                return;
            }
            String jSONObject = ((JSONObject) empty.get()).toString();
            ?? obj = new Object();
            x5.l.i(jSONObject, "isReadyToPayRequestJson cannot be null!");
            obj.f5928f = jSONObject;
            com.google.android.gms.internal.clearcut.v0 v0Var = this.f37254e;
            v0Var.getClass();
            com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
            b10.f2912a = 23705;
            b10.f2914c = new k5.i((Object) obj, 14);
            v0Var.e(0, b10.b()).addOnCompleteListener(getParentActivity(), new cn0(this, 0));
        }
    }

    public final void v0() {
        if (this.f37246a0) {
            return;
        }
        this.f37246a0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new en0(this, 1), 10);
    }

    public final boolean w0(org.telegram.ui.ActionBar.b5 b5Var, Activity activity) {
        int i9 = 0;
        if (this.X0 != null) {
            if (b5Var != null) {
                ArrayList arrayList = new ArrayList(b5Var.getFragmentStack());
                int size = arrayList.size();
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                    if (o2Var instanceof co0) {
                        o2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.f37259h0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().premiumBotUsername) && this.K0 == null) || (this.K0 != null && getMessagesController().premiumInvoiceSlug != null && Objects.equals(this.K0, getMessagesController().premiumInvoiceSlug))) && b5Var != null) {
            ArrayList arrayList2 = new ArrayList(b5Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                if ((o2Var2 instanceof qn) || (o2Var2 instanceof PremiumPreviewFragment)) {
                    o2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.f35855l0 = true;
            ((ActionBarLayout) b5Var).Q(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).f35532t0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void x0(org.telegram.ui.ActionBar.o2 o2Var) {
        AndroidUtilities.hideKeyboard(this.fragmentView);
        if (o2Var instanceof co0) {
            co0 co0Var = (co0) o2Var;
            co0Var.V0 = this.V0;
            co0Var.U0 = this.U0;
            co0Var.T0 = this.T0;
            co0Var.f37274u0 = this.f37274u0;
        }
    }

    public final void y0() {
        long j10;
        String str;
        if (this.M0) {
            return;
        }
        int i9 = 0;
        G0(false, true);
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
        tL_payments_sendPaymentForm.form_id = this.f37281y0.form_id;
        if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && this.f37274u0 != null) {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.f22398id = this.f37274u0.f22509id;
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
                tL_payments_sendPaymentForm.credentials.data.data = this.f37272s0;
            }
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
        if ((this.f37281y0.invoice.flags & 256) != 0) {
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
        v40 v40Var = new v40(17, this, tL_payments_sendPaymentForm);
        if (this.S0) {
            i9 = 8;
        }
        connectionsManager.sendRequest(tL_payments_sendPaymentForm, v40Var, i9 | 2);
    }

    public final void z0(boolean z10) {
        String str;
        String str2;
        if (!z10 && this.O.getVisibility() == 0) {
            String text = this.O.getText();
            if (text.length() == 0) {
                org.telegram.ui.Cells.k3 k3Var = this.O;
                try {
                    k3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.shakeViewSpring(k3Var, 2.5f);
                return;
            }
            G0(true, true);
            TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
            confirmpasswordemail.code = text;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new en0(this, 0), 10);
            return;
        }
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z10) {
            this.f37264n.setVisibility(0);
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.flags = 2;
            passwordinputsettings.email = "";
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            str = null;
            str2 = null;
        } else {
            String obj = this.f37256f[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                D0(0);
                return;
            } else if (!obj.equals(this.f37256f[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                D0(1);
                return;
            } else {
                String obj2 = this.f37256f[2].getText().toString();
                if (obj2.length() < 3) {
                    D0(2);
                    return;
                }
                int lastIndexOf = obj2.lastIndexOf(46);
                int lastIndexOf2 = obj2.lastIndexOf(64);
                if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                    updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
                    TL_account.passwordInputSettings passwordinputsettings2 = new TL_account.passwordInputSettings();
                    updatepasswordsettings.new_settings = passwordinputsettings2;
                    int i9 = passwordinputsettings2.flags;
                    passwordinputsettings2.flags = i9 | 1;
                    passwordinputsettings2.hint = "";
                    passwordinputsettings2.new_algo = this.W.new_algo;
                    passwordinputsettings2.flags = 3 | i9;
                    passwordinputsettings2.email = obj2.trim();
                    str = obj2;
                    str2 = obj;
                } else {
                    D0(2);
                    return;
                }
            }
        }
        G0(true, true);
        Utilities.globalQueue.postRunnable(new bg.m(this, z10, str, str2, updatepasswordsettings));
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        x0(o2Var);
        return super.presentFragment(o2Var, z10);
    }

    public co0(TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, org.telegram.ui.ActionBar.o2 o2Var) {
        super(null);
        this.f37245a = new ArrayList();
        this.f37248b = new HashMap();
        this.f37251c = new HashMap();
        this.d = new HashMap();
        this.C = true;
        this.E = new org.telegram.ui.Cells.m4[3];
        this.F = new ArrayList();
        this.G = new org.telegram.ui.Cells.z6[3];
        this.I = new org.telegram.ui.Cells.b9[3];
        this.J = new org.telegram.ui.Cells.ba[2];
        this.U = new org.telegram.ui.Cells.a9[7];
        this.V = -4.5f;
        this.Y = 6;
        this.R0 = true;
        t0(null, paymentForm, messageObject, str, 4, null, null, null, null, null, null, false, null, o2Var, false);
    }

    public co0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.f37245a = new ArrayList();
        this.f37248b = new HashMap();
        this.f37251c = new HashMap();
        this.d = new HashMap();
        this.C = true;
        this.E = new org.telegram.ui.Cells.m4[3];
        this.F = new ArrayList();
        this.G = new org.telegram.ui.Cells.z6[3];
        this.I = new org.telegram.ui.Cells.b9[3];
        this.J = new org.telegram.ui.Cells.ba[2];
        this.U = new org.telegram.ui.Cells.a9[7];
        this.V = -4.5f;
        this.Y = 6;
        this.f37268q0 = 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.f37281y0 = paymentForm;
        this.f37282z0 = paymentReceipt;
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
        this.f37259h0 = user;
        if (user != null) {
            this.f37263l0 = user.first_name;
        } else {
            this.f37263l0 = "";
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
        this.f37273t0 = paymentReceipt.credentials_title;
    }

    public co0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.o2 o2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, o2Var, false);
        this.R0 = true;
    }
}
