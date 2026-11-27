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
import android.view.ViewGroup;
import android.view.ViewParent;
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
public final class p extends org.telegram.ui.ActionBar.e implements fn7 {
    public static final List h1 = Arrays.asList("http", "https");
    public static final List i1 = Collections.singletonList("tg");
    public boolean A0;
    public gy2 B0;
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
    public final mf5[] J;
    public TLRPC.TL_payments_validateRequestedInfo J0;
    public final ArrayList K;
    public TLRPC.TL_inputPaymentCredentialsGooglePay K0;
    public final sca[] L;
    public String L0;
    public wkb M;
    public String M0;
    public final ilb[] N;
    public JSONObject N0;
    public final qmb[] O;
    public r47 O0;
    public FrameLayout P;
    public String P0;
    public FrameLayout Q;
    public boolean Q0;
    public LinearLayout R;
    public boolean R0;
    public tlb S;
    public String[] S0;
    public ku3 T;
    public boolean T0;
    public y28 U;
    public boolean U0;
    public TextView V;
    public boolean V0;
    public b69 W;
    public boolean W0;
    public w28 X;
    public boolean X0;
    public a38 Y;
    public boolean Y0;
    public final dlb[] Z;
    public vnb Z0;
    public final ArrayList a;
    public float a0;
    public z28 a1;
    public final HashMap b;
    public TL_account.Password b0;
    public boolean b1;
    public final HashMap c;
    public boolean c0;
    public TLRPC.InputInvoice c1;
    public final HashMap d;
    public int d0;
    public pcc d1;
    public qa4 e;
    public x18 e0;
    public pcc e1;
    public EditTextBoldCursor[] f;
    public boolean f0;
    public p12 f1;
    public p g0;
    public int g1;
    public i29[] h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public String k0;
    public boolean l0;
    public TLRPC.User m0;
    public s7 n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public String q0;
    public ww2 r;
    public String r0;
    public ww2 s;
    public org.telegram.ui.ActionBar.e s0;
    public f28 t0;
    public ArrayList u0;
    public byte v0;
    public AnimatorSet w;
    public boolean w0;
    public WebView x;
    public String x0;
    public String y;
    public String y0;
    public TLRPC.TL_paymentSavedCredentialsCard z0;

    public p(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo;
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new mf5[3];
        this.K = new ArrayList();
        this.L = new sca[3];
        this.N = new ilb[3];
        this.O = new qmb[2];
        this.Z = new dlb[7];
        this.a0 = -4.5f;
        this.d0 = 6;
        this.v0 = (byte) 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.D0 = paymentForm;
        this.E0 = paymentReceipt;
        paymentForm.bot_id = paymentReceipt.bot_id;
        paymentForm.invoice = paymentReceipt.invoice;
        paymentForm.provider_id = paymentReceipt.provider_id;
        paymentForm.users = paymentReceipt.users;
        this.H0 = paymentReceipt.shipping;
        long j = paymentReceipt.tip_amount;
        if (j != 0) {
            this.I0 = Long.valueOf(j);
        }
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(paymentReceipt.bot_id));
        this.m0 = X1;
        if (X1 != null) {
            this.q0 = X1.first_name;
        } else {
            this.q0 = "";
        }
        this.r0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.J0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.O0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().j1(paymentReceipt.bot_id);
                tL_payments_validateRequestedInfo = this.J0;
                tL_payments_validateRequestedInfo.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.P0;
                tL_payments_validateRequestedInfo = this.J0;
                tL_payments_validateRequestedInfo.invoice = tL_inputInvoiceSlug;
            }
            tL_payments_validateRequestedInfo.info = paymentReceipt.info;
        }
        this.y0 = paymentReceipt.credentials_title;
    }

    public static JSONObject c0() {
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

    public final void A0() {
        if (this.f0) {
            return;
        }
        this.f0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new w18(this, (byte) 1), 10);
    }

    public final boolean B0(wk5 wk5Var, Activity activity) {
        int i = 0;
        if (this.c1 != null) {
            if (wk5Var != null) {
                ArrayList arrayList = new ArrayList(wk5Var.getFragmentStack());
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    org.telegram.ui.ActionBar.e eVar = (org.telegram.ui.ActionBar.e) obj;
                    if (eVar instanceof p) {
                        eVar.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.m0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().l4.M0.f) && this.P0 == null) || (this.P0 != null && getMessagesController().l4.O0.f != null && Objects.equals(this.P0, getMessagesController().l4.O0.f))) && wk5Var != null) {
            ArrayList arrayList2 = new ArrayList(wk5Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                org.telegram.ui.ActionBar.e eVar2 = (org.telegram.ui.ActionBar.e) obj2;
                if ((eVar2 instanceof zu1) || (eVar2 instanceof PremiumPreviewFragment)) {
                    eVar2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.q0 = true;
            ((ActionBarLayout) wk5Var).T(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).w0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void C0(org.telegram.ui.ActionBar.e eVar) {
        hl.t1(this.fragmentView);
        if (eVar instanceof p) {
            p pVar = (p) eVar;
            pVar.a1 = this.a1;
            pVar.Z0 = this.Z0;
            pVar.Y0 = this.Y0;
            pVar.z0 = this.z0;
        }
    }

    public final void D0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p.D0():void");
    }

    public final void E0() {
        long j;
        String str;
        if (this.R0) {
            return;
        }
        int i = 0;
        N0(false, true);
        TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.c1;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.O0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().m1(this.O0.k.peer_id);
            tL_inputInvoiceMessage.msg_id = this.O0.e1();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.P0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.D0.form_id;
        if (yac.h(this.currentAccount).y != null && this.z0 != null) {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.id = this.z0.id;
            tL_inputPaymentCredentialsSaved.tmp_password = yac.h(this.currentAccount).y.tmp_password;
        } else {
            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = this.K0;
            if (tL_inputPaymentCredentialsGooglePay != null) {
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsGooglePay;
            } else {
                TLRPC.TL_inputPaymentCredentials tL_inputPaymentCredentials = new TLRPC.TL_inputPaymentCredentials();
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentials;
                tL_inputPaymentCredentials.save = this.V0;
                tL_inputPaymentCredentials.data = new TLRPC.TL_dataJSON();
                tL_payments_sendPaymentForm.credentials.data.data = this.x0;
            }
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.F0;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags |= 1;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.H0;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        if ((this.D0.invoice.flags & 256) != 0) {
            Long l = this.I0;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            tL_payments_sendPaymentForm.tip_amount = j;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        pl7 pl7Var = new pl7(this, tL_payments_sendPaymentForm, (byte) 5);
        if (this.X0) {
            i = 8;
        }
        connectionsManager.sendRequest(tL_payments_sendPaymentForm, pl7Var, i | 2);
    }

    public final void F0() {
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo;
        if (this.R0) {
            return;
        }
        N0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = new TLRPC.TL_payments_validateRequestedInfo();
        this.J0 = tL_payments_validateRequestedInfo2;
        TLRPC.InputInvoice inputInvoice = this.c1;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo2.invoice = inputInvoice;
        } else {
            if (this.O0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().m1(this.O0.k.peer_id);
                tL_inputInvoiceMessage.msg_id = this.O0.e1();
                tL_payments_validateRequestedInfo = this.J0;
                tL_payments_validateRequestedInfo.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.P0;
                tL_payments_validateRequestedInfo = this.J0;
                tL_payments_validateRequestedInfo.invoice = tL_inputInvoiceSlug;
            }
            tL_payments_validateRequestedInfo2 = tL_payments_validateRequestedInfo;
        }
        tL_payments_validateRequestedInfo2.save = this.U0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (this.D0.invoice.name_requested) {
            this.J0.info.name = this.f[6].getText().toString();
            this.J0.info.flags |= 1;
        }
        int i = 8;
        if (this.D0.invoice.phone_requested) {
            this.J0.info.phone = "+" + this.f[8].getText().toString() + this.f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = this.J0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (this.D0.invoice.email_requested) {
            this.J0.info.email = this.f[7].getText().toString().trim();
            this.J0.info.flags |= 4;
        }
        if (this.D0.invoice.shipping_address_requested) {
            this.J0.info.shipping_address = new TLRPC.TL_postAddress();
            this.J0.info.shipping_address.street_line1 = this.f[0].getText().toString();
            this.J0.info.shipping_address.street_line2 = this.f[1].getText().toString();
            this.J0.info.shipping_address.city = this.f[2].getText().toString();
            this.J0.info.shipping_address.state = this.f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = this.J0.info.shipping_address;
            String str = this.C0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = this.f[5].getText().toString();
            this.J0.info.flags |= 8;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo3 = this.J0;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo4 = this.J0;
        pl7 pl7Var = new pl7(this, tL_payments_validateRequestedInfo3, (byte) 4);
        if (!this.X0) {
            i = 0;
        }
        connectionsManager.sendRequest(tL_payments_validateRequestedInfo4, pl7Var, i | 2);
    }

    public final void G0(boolean z) {
        String obj;
        String str;
        if (!z && this.T.getVisibility() == 0) {
            String text = this.T.getText();
            if (text.length() == 0) {
                ku3 ku3Var = this.T;
                try {
                    ku3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                hl.A3(2.5f, ku3Var, null);
                return;
            }
            N0(true, true);
            TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
            confirmpasswordemail.code = text;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new w18(this, (byte) 2), 10);
            return;
        }
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z) {
            this.n.setVisibility(0);
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.flags = 2;
            passwordinputsettings.email = "";
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            str = null;
            obj = null;
        } else {
            obj = this.f[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                K0(0);
                return;
            } else if (!obj.equals(this.f[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), ob6.M0(2131747173, null), 0).show();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                K0(1);
                return;
            } else {
                String obj2 = this.f[2].getText().toString();
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
                    int i = passwordinputsettings2.flags;
                    passwordinputsettings2.flags = i | 1;
                    passwordinputsettings2.hint = "";
                    passwordinputsettings2.new_algo = this.b0.new_algo;
                    passwordinputsettings2.flags = i | 3;
                    passwordinputsettings2.email = obj2.trim();
                    str = obj2;
                } else {
                    K0(2);
                    return;
                }
            }
        }
        N0(true, true);
        Utilities.e.c(new va7(this, z, str, obj, updatepasswordsettings, (byte) 15));
    }

    public final void H0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        int i;
        int i2;
        int i3;
        boolean z;
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        boolean z2 = true;
        dlb[] dlbVarArr = this.Z;
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
            qu6.u(sb, ", ", str4, ", ", str5);
            dlbVarArr[2].b(2131232277, c00.k(sb, ", ", str6), ob6.M0(2131747108, null), true);
        }
        dlb dlbVar = dlbVarArr[2];
        int i4 = 8;
        if (tL_paymentRequestedInfo.shipping_address != null) {
            i = 0;
        } else {
            i = 8;
        }
        dlbVar.setVisibility(i);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            dlbVarArr[3].b(2131232105, str7, ob6.M0(2131747139, null), true);
        }
        dlb dlbVar2 = dlbVarArr[3];
        if (tL_paymentRequestedInfo.name != null) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        dlbVar2.setVisibility(i2);
        if (tL_paymentRequestedInfo.phone != null) {
            dlb dlbVar3 = dlbVarArr[4];
            String e = f78.f().e(tL_paymentRequestedInfo.phone);
            String M0 = ob6.M0(2131747137, null);
            if (tL_paymentRequestedInfo.email == null && this.H0 == null) {
                z = false;
            } else {
                z = true;
            }
            dlbVar3.b(2131232088, e, M0, z);
        }
        dlb dlbVar4 = dlbVarArr[4];
        if (tL_paymentRequestedInfo.phone != null) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        dlbVar4.setVisibility(i3);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            dlb dlbVar5 = dlbVarArr[5];
            String M02 = ob6.M0(2131747142, null);
            if (this.H0 == null) {
                z2 = false;
            }
            dlbVar5.b(2131232227, str8, M02, z2);
        }
        dlb dlbVar6 = dlbVarArr[5];
        if (tL_paymentRequestedInfo.email != null) {
            i4 = 0;
        }
        dlbVar6.setVisibility(i4);
    }

    public final void I0(TL_account.Password password) {
        boolean z;
        if (password != null && password.has_password) {
            if (getParentActivity() == null) {
                return;
            }
            h0();
            return;
        }
        this.b0 = password;
        if (password != null && !TextUtils.isEmpty(password.email_unconfirmed_pattern)) {
            z = true;
        } else {
            z = false;
        }
        this.c0 = z;
        P0();
    }

    public final void J0(boolean z) {
        this.Q0 = z;
        this.H = !z;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && aVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.Q0);
        }
        dlb dlbVar = this.Z[0];
        if (dlbVar != null) {
            dlbVar.setEnabled(!this.Q0);
        }
    }

    public final void K0(int i) {
        EditTextBoldCursor editTextBoldCursor = this.f[i];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        hl.A3(2.5f, editTextBoldCursor, null);
    }

    public final void L0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        id idVar = alertDialog$Builder.a;
        idVar.S = str;
        idVar.U = str2;
        showDialog(idVar);
    }

    public final void M0(Runnable runnable) {
        nx0 i = ik8.i(getParentActivity(), false, 1, null);
        i.P = ob6.M0(2131747141, null);
        i.Q = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.z0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(2131232278);
        } else {
            String str = this.y0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(2131232278);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_paymentSavedCredentialsCard> arrayList4 = this.D0.saved_credentials;
        int size = arrayList4.size();
        int i2 = 0;
        while (i2 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i2);
            i2++;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard3 = tL_paymentSavedCredentialsCard2;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.z0;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.id, tL_paymentSavedCredentialsCard4.id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(2131232278);
                arrayList3.add(tL_paymentSavedCredentialsCard3);
            }
        }
        ArrayList<TLRPC.TL_paymentFormMethod> arrayList5 = this.D0.additional_methods;
        int size2 = arrayList5.size();
        int i3 = 0;
        while (i3 < size2) {
            TLRPC.TL_paymentFormMethod tL_paymentFormMethod = arrayList5.get(i3);
            i3++;
            arrayList.add(tL_paymentFormMethod.title);
            arrayList2.add(2131232280);
        }
        arrayList.add(ob6.M0(2131747140, null));
        arrayList2.add(2131232049);
        int[] iArr = new int[arrayList2.size()];
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            iArr[i4] = ((Integer) arrayList2.get(i4)).intValue();
        }
        og ogVar = new og(this, runnable, arrayList3, arrayList, (byte) 1);
        i.M = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        i.N = iArr;
        i.L = ogVar;
        showDialog(i);
    }

    public final void N0(boolean z, boolean z2) {
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z && this.n != null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.w = animatorSet2;
            if (z2) {
                this.r.setVisibility(0);
                this.n.setEnabled(false);
                AnimatorSet animatorSet3 = this.w;
                View contentView = this.n.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, property, 0.1f);
                View contentView2 = this.n.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, property2, 0.1f);
                View contentView3 = this.n.getContentView();
                Property property3 = View.ALPHA;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, property3, 0.0f), ObjectAnimator.ofFloat(this.r, property, 1.0f), ObjectAnimator.ofFloat(this.r, property2, 1.0f), ObjectAnimator.ofFloat(this.r, property3, 1.0f));
            } else if (this.x != null) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.r, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.r, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.r, View.ALPHA, 0.0f));
            } else {
                this.n.getContentView().setVisibility(0);
                this.n.setEnabled(true);
                AnimatorSet animatorSet4 = this.w;
                ww2 ww2Var = this.r;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ww2Var, property4, 0.1f);
                ww2 ww2Var2 = this.r;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ww2Var2, property5, 0.1f);
                ww2 ww2Var3 = this.r;
                Property property6 = View.ALPHA;
                animatorSet4.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(ww2Var3, property6, 0.0f));
                if (!isFinishing()) {
                    this.w.playTogether(ObjectAnimator.ofFloat(this.n.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), property6, 1.0f));
                }
            }
            this.w.addListener(new s28(this, z2, (byte) 0));
            this.w.setDuration(150L);
            this.w.start();
        } else if (this.V != null) {
            this.w = new AnimatorSet();
            if (z2) {
                this.s.setVisibility(0);
                this.X.setEnabled(false);
                AnimatorSet animatorSet5 = this.w;
                TextView textView = this.V;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, property7, 0.1f);
                TextView textView2 = this.V;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, property8, 0.1f);
                TextView textView3 = this.V;
                Property property9 = View.ALPHA;
                animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, property9, 0.0f), ObjectAnimator.ofFloat(this.s, property7, 1.0f), ObjectAnimator.ofFloat(this.s, property8, 1.0f), ObjectAnimator.ofFloat(this.s, property9, 1.0f));
            } else {
                this.V.setVisibility(0);
                this.X.setEnabled(true);
                AnimatorSet animatorSet6 = this.w;
                ww2 ww2Var4 = this.s;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(ww2Var4, property10, 0.1f);
                ww2 ww2Var5 = this.s;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(ww2Var5, property11, 0.1f);
                ww2 ww2Var6 = this.s;
                Property property12 = View.ALPHA;
                animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(ww2Var6, property12, 0.0f), ObjectAnimator.ofFloat(this.V, property10, 1.0f), ObjectAnimator.ofFloat(this.V, property11, 1.0f), ObjectAnimator.ofFloat(this.V, property12, 1.0f));
            }
            this.w.addListener(new s28(this, z2, (byte) 1));
            this.w.setDuration(150L);
            this.w.start();
        }
    }

    public final void O0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131747081, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = hl.S2(ob6.a0("PaymentTransactionMessage2", null, 2131747082, str, this.q0, this.r0));
        alertDialog$Builder.j(ob6.M0(2131751736, null), new b28(this, (byte) 5));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        showDialog(idVar);
    }

    public final void P0() {
        if (this.v0 == 6) {
            ilb[] ilbVarArr = this.N;
            if (ilbVarArr[2] != null) {
                int i = 0;
                this.n.setVisibility(0);
                TL_account.Password password = this.b0;
                ArrayList arrayList = this.K;
                mf5[] mf5VarArr = this.J;
                qmb[] qmbVarArr = this.O;
                if (password == null) {
                    N0(true, true);
                    ilbVarArr[2].setVisibility(8);
                    qmbVarArr[0].setVisibility(8);
                    qmbVarArr[1].setVisibility(8);
                    this.T.setVisibility(8);
                    mf5VarArr[0].setVisibility(8);
                    mf5VarArr[1].setVisibility(8);
                    ilbVarArr[0].setVisibility(8);
                    for (int i2 = 0; i2 < 3; i2++) {
                        ((View) this.f[i2].getParent()).setVisibility(8);
                    }
                    while (i < arrayList.size()) {
                        ((View) arrayList.get(i)).setVisibility(8);
                        i++;
                    }
                    return;
                }
                N0(true, false);
                if (this.c0) {
                    ilb ilbVar = ilbVarArr[2];
                    String str = this.b0.email_unconfirmed_pattern;
                    if (str == null) {
                        str = "";
                    }
                    ilbVar.setText(ob6.a0("EmailPasswordConfirmText2", null, 2131751164, str));
                    ilbVarArr[2].setVisibility(0);
                    qmbVarArr[0].setVisibility(0);
                    qmbVarArr[1].setVisibility(0);
                    this.T.setVisibility(0);
                    ilbVarArr[1].setText("");
                    mf5VarArr[0].setVisibility(8);
                    mf5VarArr[1].setVisibility(8);
                    ilbVarArr[0].setVisibility(8);
                    for (int i3 = 0; i3 < 3; i3++) {
                        ((View) this.f[i3].getParent()).setVisibility(8);
                    }
                    while (i < arrayList.size()) {
                        ((View) arrayList.get(i)).setVisibility(8);
                        i++;
                    }
                    return;
                }
                ilbVarArr[2].setVisibility(8);
                qmbVarArr[0].setVisibility(8);
                qmbVarArr[1].setVisibility(8);
                ilbVarArr[1].setText(ob6.M0(2131747118, null));
                this.T.setVisibility(8);
                mf5VarArr[0].setVisibility(0);
                mf5VarArr[1].setVisibility(0);
                ilbVarArr[0].setVisibility(0);
                for (int i4 = 0; i4 < 3; i4++) {
                    ((View) this.f[i4].getParent()).setVisibility(0);
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ((View) arrayList.get(i5)).setVisibility(0);
                }
            }
        }
    }

    public final void Q0() {
        ilb[] ilbVarArr = this.N;
        if (ilbVarArr[0] != null) {
            sca[] scaVarArr = this.L;
            if (scaVarArr[2] != null) {
                TLRPC.PaymentForm paymentForm = this.D0;
                if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.x != null && this.A0)) {
                    this.M.setVisibility(8);
                    ilbVarArr[0].setVisibility(8);
                    sca scaVar = scaVarArr[2];
                    yob.Z(scaVar, scaVar.getContext(), 2131231233, aob.b7);
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131747148, null));
                if (this.D0.password_missing) {
                    A0();
                    spannableStringBuilder.append((CharSequence) "\n");
                    int length = spannableStringBuilder.length();
                    String M0 = ob6.M0(2131747147, null);
                    int indexOf = M0.indexOf(42);
                    int lastIndexOf = M0.lastIndexOf(42);
                    spannableStringBuilder.append((CharSequence) M0);
                    if (indexOf != -1 && lastIndexOf != -1) {
                        int i = indexOf + length;
                        int i2 = lastIndexOf + length;
                        ilbVarArr[0].getTextView().setMovementMethod(new dl((byte) 0));
                        spannableStringBuilder.replace(i2, i2 + 1, (CharSequence) "");
                        spannableStringBuilder.replace(i, i + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new x28(this), i, i2 - 1, 33);
                    }
                }
                this.M.setEnabled(true);
                ilbVarArr[0].setText(spannableStringBuilder);
                this.M.setVisibility(0);
                ilbVarArr[0].setVisibility(0);
                sca scaVar2 = scaVarArr[2];
                yob.Z(scaVar2, scaVar2.getContext(), 2131231232, aob.b7);
            }
        }
    }

    public final void R0() {
        this.S0[0] = g0(this.u0);
        this.S.a(ob6.M0(2131747080, null), this.S0[0], true);
        TextView textView = this.V;
        if (textView != null) {
            textView.setText(ob6.a0("PaymentCheckoutPay", null, 2131747138, this.S0[0]));
        }
        if (this.t0 != null) {
            int themedColor = getThemedColor(aob.Vi);
            int childCount = this.t0.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TextView textView2 = (TextView) this.t0.getChildAt(i);
                if (textView2.getTag().equals(this.I0)) {
                    aob.A1(themedColor, textView2.getBackground());
                    yob.X(textView2, aob.Wi, this.Z0);
                } else {
                    aob.A1(536870911 & themedColor, textView2.getBackground());
                    yob.X(textView2, aob.Z8, this.Z0);
                }
                textView2.invalidate();
            }
        }
    }

    public final void Z() {
        int i = 0;
        if (yac.h(this.currentAccount).y != null && yac.h(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
            yac.h(this.currentAccount).y = null;
            yac.h(this.currentAccount).u(false);
        }
        if (yac.h(this.currentAccount).y != null) {
            E0();
        } else if (this.f[1].length() == 0) {
            try {
                this.f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            hl.A3(2.5f, this.f[1], null);
        } else {
            String obj = this.f[1].getText().toString();
            N0(true, true);
            J0(true);
            TL_account.getPassword getpassword = new TL_account.getPassword();
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
            m65 m65Var = new m65(this, obj, getpassword, (byte) 26);
            if (this.X0) {
                i = 8;
            }
            connectionsManager.sendRequest(getpassword, m65Var, i | 2);
        }
    }

    public final void a0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        hf0 L0 = aob.L0(true);
        uob M = yob.M(aob.d6);
        uob M2 = yob.M(aob.i6);
        frameLayout.setBackground(L0);
        yob.j(frameLayout, L0, M, M2, null);
        this.P.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        frameLayout2.setClickable(true);
        this.Q.setFocusable(true);
        this.Q.setBackgroundResource(2131231225);
        String str = this.L0;
        FrameLayout frameLayout3 = this.Q;
        if (str == null) {
            frameLayout3.setPadding(hl.L(10.0f), hl.L(2.0f), hl.L(10.0f), hl.L(2.0f));
        } else {
            frameLayout3.setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(2.0f));
        }
        this.P.addView(this.Q, tre.c(48.0f, -1));
        this.Q.setOnClickListener(new z18(this, (byte) 14));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.Q.addView(linearLayout, tre.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(2131230909);
        linearLayout.addView(imageView, tre.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(2131231227);
        this.Q.addView(imageView2, tre.c(-1.0f, -1));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.h7));
        hashSet.add(Integer.valueOf(aob.g7));
        hashSet.add(Integer.valueOf(aob.E7));
        hashSet.add(Integer.valueOf(aob.D7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    public final void b0(String str) {
        boolean z;
        boolean z2;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.a.b.getSystemService("phone");
            if (str != null || (telephonyManager.getSimState() != 1 && telephonyManager.getPhoneType() != 0)) {
                if (getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (str == null) {
                    if (z) {
                        str = f78.h(telephonyManager.getLine1Number(), false);
                    } else {
                        return;
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    int i = 4;
                    String str2 = null;
                    if (str.length() > 4) {
                        while (true) {
                            if (i >= 1) {
                                String substring = str.substring(0, i);
                                if (((String) this.c.get(substring)) != null) {
                                    str2 = str.substring(i);
                                    this.f[8].setText(substring);
                                    z2 = true;
                                    break;
                                }
                                i--;
                            } else {
                                z2 = false;
                                break;
                            }
                        }
                        if (!z2) {
                            str2 = str.substring(1);
                            this.f[8].setText(str.substring(0, 1));
                        }
                    }
                    if (str2 != null) {
                        this.f[9].setText(str2);
                        EditTextBoldCursor editTextBoldCursor = this.f[9];
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p.createView(android.content.Context):android.view.View");
    }

    public final long d0() {
        TLRPC.InputInvoice inputInvoice = this.c1;
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
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.p0) {
            TLRPC.PaymentForm paymentForm = this.D0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            Q0();
        } else if (i == jn7.r0) {
            TLRPC.PaymentForm paymentForm2 = this.D0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            Q0();
        } else if (i == jn7.a1) {
            this.b1 = true;
            removeSelfFromStack();
        }
    }

    public final long e0() {
        TLRPC.InputPeer inputPeer;
        TLRPC.InputInvoice inputInvoice = this.c1;
        if (inputInvoice instanceof TLRPC.TL_inputInvoiceStars) {
            TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose;
            if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
                TLRPC.InputUser inputUser = ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).user_id;
                if (inputUser != null) {
                    return inputUser.user_id;
                }
                return 0L;
            } else if ((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) && (inputPeer = ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).boost_peer) != null) {
                return wf3.m(inputPeer);
            } else {
                return 0L;
            }
        }
        return 0L;
    }

    public final String f0(ArrayList arrayList) {
        double d;
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            j += ((TLRPC.TL_labeledPrice) arrayList.get(i)).amount;
        }
        ob6.D0();
        String upperCase = this.D0.invoice.currency.toUpperCase();
        long abs = Math.abs(j);
        upperCase.getClass();
        char c = 65535;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    c = 0;
                    break;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    c = 1;
                    break;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    c = 2;
                    break;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    c = 3;
                    break;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    c = 4;
                    break;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    c = 5;
                    break;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    c = 6;
                    break;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    c = 7;
                    break;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    c = '\b';
                    break;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    c = '\t';
                    break;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    c = '\n';
                    break;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    c = 11;
                    break;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    c = '\f';
                    break;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    c = '\r';
                    break;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    c = 14;
                    break;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    c = 15;
                    break;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    c = 16;
                    break;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    c = 17;
                    break;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    c = 18;
                    break;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    c = 19;
                    break;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    c = 20;
                    break;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    c = 21;
                    break;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    c = 22;
                    break;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    c = 23;
                    break;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    c = 24;
                    break;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    c = 25;
                    break;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    c = 26;
                    break;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    c = 27;
                    break;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    c = 28;
                    break;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    c = 29;
                    break;
                }
                break;
        }
        String str = " %.0f";
        switch (c) {
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

    public final String g0(ArrayList arrayList) {
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            j += ((TLRPC.TL_labeledPrice) arrayList.get(i)).amount;
        }
        Long l = this.I0;
        if (l != null) {
            j += l.longValue();
        }
        return ob6.D0().p(j, this.D0.invoice.currency);
    }

    @Override
    public final vnb getResourceProvider() {
        return this.Z0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.F, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.s8));
        arrayList.add(new apb(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.C8));
        arrayList.add(new apb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.D8));
        if (this.f != null) {
            int i = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new apb((View) editTextBoldCursorArr[i].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
                i++;
            }
        } else {
            arrayList.add(new apb((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G6));
            arrayList.add(new apb((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.H6));
        }
        if (this.h != null) {
            for (int i2 = 0; i2 < this.h.length; i2++) {
            }
        }
        int i3 = 0;
        while (true) {
            mf5[] mf5VarArr = this.J;
            if (i3 >= mf5VarArr.length) {
                break;
            }
            arrayList.add(new apb(mf5VarArr[i3], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
            i3++;
        }
        for (int i4 = 0; i4 < this.L.length; i4++) {
        }
        for (int i5 = 0; i5 < this.N.length; i5++) {
        }
        int i6 = 0;
        while (true) {
            ArrayList arrayList2 = this.K;
            if (i6 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new apb((View) arrayList2.get(i6), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
            i6++;
        }
        int i7 = 1;
        arrayList.add(new apb(this.M, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.M6));
        arrayList.add(new apb(this.M, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.N6));
        for (int i8 = 0; i8 < this.O.length; i8++) {
        }
        arrayList.add(new apb(this.V, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.s6));
        while (true) {
            dlb[] dlbVarArr = this.Z;
            if (i7 < dlbVarArr.length) {
                arrayList.add(new apb(dlbVarArr[i7], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
                i7++;
            } else {
                arrayList.add(new apb(this.X, 268435456, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
                arrayList.add(new apb(this.X, 268435456, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.i6));
                return arrayList;
            }
        }
    }

    public final void h0() {
        int i;
        int i2;
        boolean z;
        int i3;
        byte b = this.v0;
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        if (b != 4) {
                            if (b == 6) {
                                if (!this.U.c(this.x0, this.y0, this.V0, this.K0, this.z0)) {
                                    p pVar = new p(this.c1, this.D0, this.O0, this.P0, 4, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, false);
                                    pVar.d1 = this.d1;
                                    pVar.e1 = this.e1;
                                    presentFragment(pVar, true);
                                    return;
                                }
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        boolean z2 = this.W0;
                        int i4 = jn7.a1;
                        if (z2) {
                            jn7.f(this.currentAccount).n(this, i4);
                        }
                        jn7.f(this.currentAccount).k(i4, new Object[0]);
                        if (getMessagesController().c4 == null) {
                            if (!B0(getParentLayout(), getParentActivity()) && !isFinishing()) {
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        hl.d3(new x18(this, (byte) 3), 500L);
                        return;
                    }
                    if (this.w0) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    p pVar2 = new p(this.c1, this.D0, this.O0, this.P0, i3, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
                    pVar2.d1 = this.d1;
                    pVar2.e1 = this.e1;
                    presentFragment(pVar2, true);
                    return;
                }
                TLRPC.PaymentForm paymentForm = this.D0;
                if (paymentForm.password_missing && (z = this.V0)) {
                    p pVar3 = new p(this.c1, paymentForm, this.O0, this.P0, 6, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, z, this.K0, this.s0, this.X0);
                    this.g0 = pVar3;
                    pVar3.d1 = this.d1;
                    pVar3.e1 = this.e1;
                    pVar3.I0(this.b0);
                    p pVar4 = this.g0;
                    pVar4.U = new q28(this);
                    presentFragment(pVar4, this.T0);
                    return;
                }
                y28 y28Var = this.U;
                if (y28Var != null) {
                    y28Var.c(this.x0, this.y0, this.V0, this.K0, null);
                    finishFragment();
                    return;
                }
                p pVar5 = new p(this.c1, paymentForm, this.O0, this.P0, 4, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
                pVar5.d1 = this.d1;
                pVar5.e1 = this.e1;
                presentFragment(pVar5, this.T0);
                return;
            }
            if (this.x0 == null && this.y0 == null) {
                if (this.z0 != null) {
                    if (yac.h(this.currentAccount).y != null && yac.h(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        yac.h(this.currentAccount).y = null;
                        yac.h(this.currentAccount).u(false);
                    }
                    if (yac.h(this.currentAccount).y == null) {
                        i2 = 3;
                    }
                } else {
                    i2 = 2;
                }
                if (i2 != 2 && this.y0 == null && this.z0 == null && this.x0 == null && !this.D0.additional_methods.isEmpty()) {
                    M0(new x18(this, (byte) 2));
                    return;
                }
                p pVar6 = new p(this.c1, this.D0, this.O0, this.P0, i2, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
                pVar6.d1 = this.d1;
                pVar6.e1 = this.e1;
                presentFragment(pVar6, this.T0);
                return;
            }
            i2 = 4;
            if (i2 != 2) {
            }
            p pVar62 = new p(this.c1, this.D0, this.O0, this.P0, i2, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
            pVar62.d1 = this.d1;
            pVar62.e1 = this.e1;
            presentFragment(pVar62, this.T0);
            return;
        }
        y28 y28Var2 = this.U;
        if (y28Var2 != null) {
            y28Var2.d(this.J0);
            finishFragment();
            return;
        }
        if (this.D0.invoice.flexible) {
            i = 1;
        } else if (this.z0 == null && this.x0 == null) {
            i = 2;
        } else {
            if (yac.h(this.currentAccount).y != null && yac.h(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                yac.h(this.currentAccount).y = null;
                yac.h(this.currentAccount).u(false);
            }
            if (yac.h(this.currentAccount).y != null) {
                i = 4;
            } else {
                i = 3;
            }
        }
        if (i == 2 && this.z0 == null && this.x0 == null && !this.D0.additional_methods.isEmpty()) {
            M0(new x18(this, (byte) 2));
            return;
        }
        p pVar7 = new p(this.c1, this.D0, this.O0, this.P0, i, this.F0, null, null, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
        pVar7.d1 = this.d1;
        pVar7.e1 = this.e1;
        presentFragment(pVar7, this.T0);
    }

    public final void i0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, r47 r47Var, String str, int i, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.e eVar, boolean z2) {
        boolean z3;
        if (eVar != null) {
            this.currentAccount = eVar.getCurrentAccount();
        }
        this.v0 = i;
        this.s0 = eVar;
        this.x0 = str2;
        this.K0 = tL_inputPaymentCredentialsGooglePay;
        this.F0 = tL_payments_validatedRequestedInfo;
        this.D0 = paymentForm;
        this.H0 = tL_shippingOption;
        this.I0 = l;
        this.O0 = r47Var;
        this.P0 = str;
        this.c1 = inputInvoice;
        this.V0 = z;
        this.X0 = z2;
        if (!"stripe".equals(paymentForm.native_provider) && !"smartglocal".equals(this.D0.native_provider)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.T0 = z3;
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(paymentForm.bot_id));
        this.m0 = X1;
        if (X1 != null) {
            this.q0 = X1.first_name;
        } else {
            this.q0 = "";
        }
        this.r0 = paymentForm.title;
        this.J0 = tL_payments_validateRequestedInfo;
        this.U0 = true;
        if (!z && this.v0 != 4) {
            this.V0 = !this.D0.saved_credentials.isEmpty();
        } else {
            this.V0 = z;
        }
        if (str3 == null) {
            if (!this.D0.saved_credentials.isEmpty()) {
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.D0.saved_credentials.get(0);
                this.z0 = tL_paymentSavedCredentialsCard;
                this.y0 = tL_paymentSavedCredentialsCard.title;
                return;
            }
            return;
        }
        this.y0 = str3;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.H;
    }

    public final void j0(Context context) {
        byte b;
        Optional empty;
        if (getParentActivity() != null) {
            e00 e00Var = new e00();
            if (this.D0.invoice.test) {
                b = 3;
            } else {
                b = 1;
            }
            if (b != 2 && b != 1 && b != 3) {
                Locale locale = Locale.US;
                lq5.j(uh9.k(b, "Invalid environment value "));
                return;
            }
            e00Var.a = b;
            this.e = new h05(context, soc.a, new roc(e00Var), g05.c);
            try {
                JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                put.put("allowedPaymentMethods", new JSONArray().put(c0()));
                empty = Optional.of(put);
            } catch (JSONException unused) {
                empty = Optional.empty();
            }
            if (!empty.isPresent()) {
                return;
            }
            String jSONObject = ((JSONObject) empty.get()).toString();
            ?? obj = new Object();
            xve.i(jSONObject, "isReadyToPayRequestJson cannot be null!");
            obj.f = jSONObject;
            qa4 qa4Var = this.e;
            qa4Var.getClass();
            wjb b2 = xjb.b();
            b2.d = (char) 23705;
            b2.a = new ve9((Object) obj, (byte) 24);
            qa4Var.e(0, b2.a()).addOnCompleteListener(getParentActivity(), new b28(this, (byte) 0));
        }
    }

    public final void k0(TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        N0(true, false);
        J0(false);
        if (tLObject != null) {
            this.w0 = true;
            yac.h(this.currentAccount).y = (TL_account.tmpPassword) tLObject;
            yac.h(this.currentAccount).u(false);
            h0();
        } else if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            try {
                this.f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            hl.A3(3.25f, this.f[1], null);
            this.f[1].setText("");
        } else {
            jj.c0(this.currentAccount, tL_error, this, gettmppassword, new Object[0]);
        }
    }

    public final void l0(TL_account.Password password, byte[] bArr) {
        byte[] bArr2;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = es9.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        pl7 pl7Var = new pl7(this, gettmppassword, (byte) 6);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = es9.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            gettmppassword.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                pl7Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(gettmppassword, pl7Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        pl7Var.run(null, tL_error2);
    }

    public final void m0(TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.a0(password, false)) {
                jj.u0(getParentActivity(), ob6.M0(2131743475, null), true);
                return;
            } else if (!password.has_password) {
                this.w0 = false;
                h0();
                return;
            } else {
                Utilities.e.c(new gd7(this, password, hl.g1(str), (byte) 22));
                return;
            }
        }
        jj.c0(this.currentAccount, tL_error, this, getpassword, new Object[0]);
        N0(true, false);
        J0(false);
    }

    public final void n0(android.view.View r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p.n0(android.view.View, java.lang.String):void");
    }

    public final void o0() {
        TL_account.resendPasswordEmail resendpasswordemail = new TL_account.resendPasswordEmail();
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        int i = 0;
        xe2 xe2Var = new xe2((byte) 0);
        if (this.X0) {
            i = 8;
        }
        connectionsManager.sendRequest(resendpasswordemail, xe2Var, i);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131745847, null);
        id idVar = alertDialog$Builder.a;
        idVar.U = M0;
        idVar.S = ob6.M0(2131689472, null);
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        showDialog(idVar);
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i == 991) {
            hl.c3(new l65(this, i2, intent, (byte) 22));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        WebView webView = this.x;
        if (webView != null && this.E) {
            if (z) {
                webView.loadUrl(this.y);
                this.E = false;
            }
            return false;
        }
        return !this.Q0;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.v0 == 4 && this.Y0) {
            this.Y0 = false;
            this.X.callOnClick();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.p0);
        jn7.f(this.currentAccount).b(this, jn7.r0);
        if (this.v0 != 4 || this.W0) {
            jn7.f(this.currentAccount).a(this, jn7.a1);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        y28 y28Var = this.U;
        if (y28Var != null) {
            y28Var.b();
        }
        int i = 0;
        hl.u(getParentActivity(), false);
        if (!this.b1) {
            this.g1 = 2;
            if (this.a1 != null) {
                wk5 wk5Var = this.parentLayout;
                if (wk5Var != null && wk5Var.getFragmentStack() != null) {
                    int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
                    if (indexOf == -1) {
                        indexOf = this.parentLayout.getFragmentStack().size();
                    }
                    while (true) {
                        if (i < this.parentLayout.getFragmentStack().size()) {
                            if (((org.telegram.ui.ActionBar.e) this.parentLayout.getFragmentStack().get(i)) instanceof p) {
                                break;
                            }
                            i++;
                        } else {
                            i = indexOf;
                            break;
                        }
                    }
                    i -= indexOf;
                }
                if (i == 0) {
                    this.a1.c(this.g1);
                }
            }
        }
        jn7.f(this.currentAccount).n(this, jn7.p0);
        jn7.f(this.currentAccount).n(this, jn7.r0);
        if (this.v0 != 4 || this.W0) {
            jn7.f(this.currentAccount).n(this, jn7.a1);
        }
        WebView webView = this.x;
        if (webView != null) {
            try {
                ViewParent parent = webView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.x);
                }
                this.x.stopLoading();
                this.x.loadUrl("about:blank");
                this.y = null;
                this.x.destroy();
                this.x = null;
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        try {
            byte b = this.v0;
            if ((b == 2 || b == 6) && (xea.r.length() == 0 || xea.z)) {
                getParentActivity().getWindow().clearFlags(8192);
                hl.f2();
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        super.onFragmentDestroy();
        this.R0 = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        hl.V2(getParentActivity(), this.classGuid);
        try {
            byte b = this.v0;
            if ((b == 2 || b == 6) && !this.D0.invoice.test) {
                getParentActivity().getWindow().setFlags(8192, 8192);
                hl.f2();
            } else if (xea.r.length() != 0 && !xea.z) {
            } else {
                getParentActivity().getWindow().clearFlags(8192);
                hl.f2();
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            ScrollView scrollView = this.F;
            if (scrollView != null) {
                hl.u3(scrollView, getThemedColor(aob.s8));
            }
            if (this.f != null) {
                getThemedColor(aob.G6);
                int i = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                    if (i < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i];
                        if (editTextBoldCursor != null) {
                            yob.l(editTextBoldCursor, 30, aob.G6, this.Z0);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && !z2) {
            WebView webView = this.x;
            byte b = this.v0;
            if (webView != null) {
                if (b != 4) {
                    TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.G0;
                    if (tL_paymentFormMethod != null) {
                        String str = tL_paymentFormMethod.url;
                        this.y = str;
                        webView.loadUrl(str);
                        return;
                    }
                    String str2 = this.D0.url;
                    this.y = str2;
                    webView.loadUrl(str2);
                }
            } else if (b == 2) {
                hl.d3(new x18(this, (byte) 0), 100L);
            } else if (b == 3) {
                this.f[1].requestFocus();
                hl.E3(this.f[1]);
            } else if (b == 4) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                }
            } else if (b == 6 && !this.c0) {
                this.f[0].requestFocus();
                hl.E3(this.f[0]);
            }
        }
    }

    public final void p0(TLObject tLObject) {
        org.telegram.ui.ActionBar.e Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            nza.n1(getParentActivity(), this.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, this.Z0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (Q = LaunchActivity.Q()) != 0) {
            ?? obj = new Object();
            obj.a = true;
            p pVar = new p((TLRPC.PaymentReceipt) tLObject);
            pVar.d1 = this.d1;
            pVar.e1 = this.e1;
            Q.showAsSheet(pVar, obj);
        }
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.e eVar) {
        C0(eVar);
        return super.presentFragment(eVar);
    }

    public final void q0(v21 v21Var, boolean z, TLRPC.Message[] messageArr) {
        v21Var.b();
        if (z) {
            org.telegram.ui.ActionBar.e S = LaunchActivity.S();
            if (S != null) {
                S.presentFragment(zu1.ga(messageArr[0].id, r47.B0(messageArr[0])));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = messageArr[0].id;
        tL_payments_getPaymentReceipt.peer = uc7.s1(this.currentAccount).m1(messageArr[0].peer_id);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new w18(this, (byte) 0), 2);
    }

    public final void r0(TLObject tLObject) {
        org.telegram.ui.ActionBar.e Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            nza.n1(getParentActivity(), this.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, this.Z0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (Q = LaunchActivity.Q()) != 0) {
            ?? obj = new Object();
            obj.a = true;
            p pVar = new p((TLRPC.PaymentReceipt) tLObject);
            pVar.d1 = this.d1;
            pVar.e1 = this.e1;
            Q.showAsSheet(pVar, obj);
        }
    }

    public final void s0(v21 v21Var, boolean z, TLRPC.Message message) {
        v21Var.b();
        if (z) {
            org.telegram.ui.ActionBar.e S = LaunchActivity.S();
            if (S != null) {
                S.presentFragment(zu1.ga(message.id, r47.B0(message)));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = message.id;
        tL_payments_getPaymentReceipt.peer = uc7.s1(this.currentAccount).m1(message.peer_id);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new w18(this, (byte) 3), 2);
    }

    public final void t0(TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        jj.c0(this.currentAccount, tL_error, this, tL_payments_sendPaymentForm, new Object[0]);
        J0(false);
        N0(false, false);
        this.b1 = true;
        this.g1 = 4;
        z28 z28Var = this.a1;
        if (z28Var != null) {
            z28Var.c(4);
        }
    }

    public final void u0(TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        int i;
        this.F0 = tL_payments_validatedRequestedInfo;
        if (this.D0.saved_info != null && !this.U0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
            xe2 xe2Var = new xe2((byte) 0);
            if (this.X0) {
                i = 8;
            } else {
                i = 0;
            }
            connectionsManager.sendRequest(tL_payments_clearSavedInfo, xe2Var, i);
        }
        h0();
        J0(false);
        N0(true, false);
    }

    public final void w0(TLObject tLObject, TLRPC.TL_error tL_error) {
        J0(false);
        N0(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -2092780146:
                    if (str.equals("ADDRESS_CITY_INVALID")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1623547228:
                    if (str.equals("ADDRESS_STREET_LINE1_INVALID")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1224177757:
                    if (str.equals("ADDRESS_COUNTRY_INVALID")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1031752045:
                    if (str.equals("REQ_INFO_NAME_INVALID")) {
                        c = 3;
                        break;
                    }
                    break;
                case -274035920:
                    if (str.equals("ADDRESS_POSTCODE_INVALID")) {
                        c = 4;
                        break;
                    }
                    break;
                case 417441502:
                    if (str.equals("ADDRESS_STATE_INVALID")) {
                        c = 5;
                        break;
                    }
                    break;
                case 708423542:
                    if (str.equals("REQ_INFO_PHONE_INVALID")) {
                        c = 6;
                        break;
                    }
                    break;
                case 863965605:
                    if (str.equals("ADDRESS_STREET_LINE2_INVALID")) {
                        c = 7;
                        break;
                    }
                    break;
                case 889106340:
                    if (str.equals("REQ_INFO_EMAIL_INVALID")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    K0(2);
                    return;
                case 1:
                    K0(0);
                    return;
                case 2:
                    K0(4);
                    return;
                case 3:
                    K0(6);
                    return;
                case 4:
                    K0(5);
                    return;
                case 5:
                    K0(3);
                    return;
                case 6:
                    K0(9);
                    return;
                case 7:
                    K0(1);
                    return;
                case '\b':
                    K0(7);
                    return;
                default:
                    jj.c0(this.currentAccount, tL_error, this, tLObject, new Object[0]);
                    return;
            }
        }
    }

    public final void x0(TLRPC.TL_error tL_error, boolean z, TLObject tLObject, String str) {
        String G;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new q81((byte) 8, this, z), 8);
            return;
        }
        N0(true, false);
        if (z) {
            TL_account.Password password = this.b0;
            password.has_password = false;
            password.current_algo = null;
            this.U.a(password);
            finishFragment();
        } else if (tL_error == null) {
            if ((tLObject instanceof TLRPC.TL_boolTrue) && getParentActivity() != null) {
                h0();
            }
        } else if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
            if (tL_error.text.equals("EMAIL_INVALID")) {
                L0(ob6.M0(2131689472, null), ob6.M0(2131747172, null));
            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                int intValue = Utilities.z(tL_error.text).intValue();
                if (intValue < 60) {
                    G = ob6.G(intValue, "Seconds", new Object[0]);
                } else {
                    G = ob6.G(intValue / 60, "Minutes", new Object[0]);
                }
                L0(ob6.M0(2131689472, null), ob6.a0("FloodWaitTime", null, 2131750646, G));
            } else {
                L0(ob6.M0(2131689472, null), tL_error.text);
            }
        } else {
            this.d0 = Utilities.z(tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.j(ob6.M0(2131747558, null), new rm6(this, str, (byte) 16));
            String M0 = ob6.M0(2131742452, null);
            id idVar = alertDialog$Builder.a;
            idVar.U = M0;
            idVar.S = ob6.M0(2131742453, null);
            Dialog showDialog = showDialog(idVar);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        }
    }

    public final void y0(boolean z, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        vi1 vi1Var = new vi1(this, z, str, (byte) 10);
        if (!z) {
            byte[] g1 = hl.g1(str2);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.b0.new_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                updatepasswordsettings.new_settings.new_password_hash = es9.b(g1, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                if (updatepasswordsettings.new_settings.new_password_hash == null) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "ALGO_INVALID";
                    vi1Var.run(null, tL_error);
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, vi1Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            vi1Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, vi1Var, 10);
    }

    public final void z0(TLObject tLObject, TLRPC.TL_error tL_error) {
        J0(false);
        N0(true, false);
        if (tL_error != null) {
            jj.c0(this.currentAccount, tL_error, this, tLObject, new Object[0]);
        }
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.e eVar, boolean z) {
        C0(eVar);
        return super.presentFragment(eVar, z);
    }

    public p(TLRPC.PaymentForm paymentForm, r47 r47Var, String str, org.telegram.ui.ActionBar.e eVar) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new mf5[3];
        this.K = new ArrayList();
        this.L = new sca[3];
        this.N = new ilb[3];
        this.O = new qmb[2];
        this.Z = new dlb[7];
        this.a0 = -4.5f;
        this.d0 = 6;
        this.W0 = true;
        i0(null, paymentForm, r47Var, str, 4, null, null, null, null, null, null, false, null, eVar, false);
    }

    public p(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, r47 r47Var, String str, int i, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.e eVar, boolean z2) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new mf5[3];
        this.K = new ArrayList();
        this.L = new sca[3];
        this.N = new ilb[3];
        this.O = new qmb[2];
        this.Z = new dlb[7];
        this.a0 = -4.5f;
        this.d0 = 6;
        i0(inputInvoice, paymentForm, r47Var, str, i, tL_payments_validatedRequestedInfo, tL_shippingOption, l, str2, str3, tL_payments_validateRequestedInfo, z, tL_inputPaymentCredentialsGooglePay, eVar, z2);
    }

    public p(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.e eVar) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, eVar, false);
        this.W0 = true;
    }
}
