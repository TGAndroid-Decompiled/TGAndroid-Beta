package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fn0 implements View.OnClickListener {
    public final int f34290a;
    public final jo0 f34291b;

    public fn0(jo0 jo0Var, int i10) {
        this.f34290a = i10;
        this.f34291b = jo0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        int i10 = this.f34290a;
        jo0 jo0Var = this.f34291b;
        switch (i10) {
            case 0:
                if (jo0Var.getParentActivity() != null) {
                    jo0Var.G0(null);
                    return;
                }
                return;
            case 1:
                jo0 jo0Var2 = new jo0(jo0Var.Y0, jo0Var.f35425z0, jo0Var.K0, jo0Var.L0, 0, jo0Var.B0, jo0Var.D0, jo0Var.E0, null, jo0Var.f35417u0, jo0Var.F0, jo0Var.R0, null, jo0Var.f35409o0, jo0Var.T0);
                jo0Var2.Z0 = jo0Var.Z0;
                jo0Var2.f35390a1 = jo0Var.f35390a1;
                jo0Var2.Q = new pn0(jo0Var);
                jo0Var.presentFragment(jo0Var2);
                return;
            case 2:
                jo0 jo0Var3 = new jo0(jo0Var.Y0, jo0Var.f35425z0, jo0Var.K0, jo0Var.L0, 0, jo0Var.B0, jo0Var.D0, jo0Var.E0, null, jo0Var.f35417u0, jo0Var.F0, jo0Var.R0, null, jo0Var.f35409o0, jo0Var.T0);
                jo0Var3.Z0 = jo0Var.Z0;
                jo0Var3.f35390a1 = jo0Var.f35390a1;
                jo0Var3.Q = new qn0(jo0Var);
                jo0Var.presentFragment(jo0Var3);
                return;
            case 3:
                jo0 jo0Var4 = new jo0(jo0Var.Y0, jo0Var.f35425z0, jo0Var.K0, jo0Var.L0, 0, jo0Var.B0, jo0Var.D0, jo0Var.E0, null, jo0Var.f35417u0, jo0Var.F0, jo0Var.R0, null, jo0Var.f35409o0, jo0Var.T0);
                jo0Var4.Z0 = jo0Var.Z0;
                jo0Var4.f35390a1 = jo0Var.f35390a1;
                jo0Var4.Q = new rn0(jo0Var);
                jo0Var.presentFragment(jo0Var4);
                return;
            case 4:
                jo0 jo0Var5 = new jo0(jo0Var.Y0, jo0Var.f35425z0, jo0Var.K0, jo0Var.L0, 0, jo0Var.B0, jo0Var.D0, jo0Var.E0, null, jo0Var.f35417u0, jo0Var.F0, jo0Var.R0, null, jo0Var.f35409o0, jo0Var.T0);
                jo0Var5.Z0 = jo0Var.Z0;
                jo0Var5.f35390a1 = jo0Var.f35390a1;
                jo0Var5.Q = new sn0(jo0Var);
                jo0Var.presentFragment(jo0Var5);
                return;
            case 5:
                if (!jo0Var.M0) {
                    boolean z10 = !jo0Var.C;
                    jo0Var.C = z10;
                    jo0Var.S.setChecked(z10);
                    jo0Var.T.a(jo0Var.C, true);
                    return;
                }
                return;
            case 6:
                jo0.Z(jo0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jo0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (jo0Var.X.has_secure_values) {
                    string = org.telegram.messenger.y3.h(R.string.TurnPasswordOffPassport, vh.v2.f(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                d2Var.Q = string;
                d2Var.O = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new jn0(jo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                jo0Var.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(jo0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20141q7));
                    return;
                }
                return;
            case 8:
                boolean z11 = !jo0Var.Q0;
                jo0Var.Q0 = z11;
                jo0Var.I.setChecked(z11);
                return;
            case 9:
                boolean z12 = !jo0Var.R0;
                jo0Var.R0 = z12;
                jo0Var.I.setChecked(z12);
                return;
            case 10:
                boolean z13 = !jo0Var.R0;
                jo0Var.R0 = z13;
                jo0Var.I.setChecked(z13);
                return;
            case 11:
                jo0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = jo0Var.h;
                    if (i11 < j6VarArr.length) {
                        org.telegram.ui.Cells.j6 j6Var = j6VarArr[i11];
                        if (intValue == i11) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        j6Var.a(z4, true);
                        i11++;
                    } else {
                        return;
                    }
                }
            case 12:
                jo0Var.M.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = jo0.p0();
                    if (jo0Var.H0 != null && jo0Var.J0 == null) {
                        p02.put("tokenizationSpecification", new j9.f(jo0Var, 2));
                    } else {
                        p02.put("tokenizationSpecification", new j9.f(jo0Var, 4));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(jo0Var.f35425z0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = jo0Var.D0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, jo0Var.f35425z0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(jo0Var.I0)) {
                        jSONObject.put("countryCode", jo0Var.I0);
                    }
                    jSONObject.put("currencyCode", jo0Var.f35425z0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", jo0Var.m0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f9281r = true;
                    b6.m.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f9282s = jSONObject2;
                    a8.e eVar = jo0Var.e;
                    eVar.getClass();
                    com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                    e.f2885c = new o5.i((Object) obj, 22);
                    e.d = new y5.c[]{j8.p.f9293b};
                    e.f2884b = true;
                    e.f2883a = 23707;
                    j8.a.a(eVar.e(1, e.e()), jo0Var.getParentActivity());
                    return;
                } catch (JSONException e6) {
                    FileLog.e(e6);
                    return;
                }
            case 13:
                jo0Var.f35415s0 = false;
                jo0Var.t0();
                return;
            default:
                jo0Var.f35399f[0].requestFocus();
                AndroidUtilities.showKeyboard(jo0Var.f35399f[0]);
                return;
        }
    }
}
