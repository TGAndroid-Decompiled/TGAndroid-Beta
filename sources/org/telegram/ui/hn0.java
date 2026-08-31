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
public final class hn0 implements View.OnClickListener {
    public final int f37550a;
    public final lo0 f37551b;

    public hn0(lo0 lo0Var, int i10) {
        this.f37550a = i10;
        this.f37551b = lo0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        int i10 = this.f37550a;
        lo0 lo0Var = this.f37551b;
        switch (i10) {
            case 0:
                if (lo0Var.getParentActivity() != null) {
                    lo0Var.G0(null);
                    return;
                }
                return;
            case 1:
                lo0 lo0Var2 = new lo0(lo0Var.Y0, lo0Var.f38833z0, lo0Var.K0, lo0Var.L0, 0, lo0Var.B0, lo0Var.D0, lo0Var.E0, null, lo0Var.f38825u0, lo0Var.F0, lo0Var.R0, null, lo0Var.f38817o0, lo0Var.T0);
                lo0Var2.Z0 = lo0Var.Z0;
                lo0Var2.f38797a1 = lo0Var.f38797a1;
                lo0Var2.Q = new rn0(lo0Var);
                lo0Var.presentFragment(lo0Var2);
                return;
            case 2:
                lo0 lo0Var3 = new lo0(lo0Var.Y0, lo0Var.f38833z0, lo0Var.K0, lo0Var.L0, 0, lo0Var.B0, lo0Var.D0, lo0Var.E0, null, lo0Var.f38825u0, lo0Var.F0, lo0Var.R0, null, lo0Var.f38817o0, lo0Var.T0);
                lo0Var3.Z0 = lo0Var.Z0;
                lo0Var3.f38797a1 = lo0Var.f38797a1;
                lo0Var3.Q = new sn0(lo0Var);
                lo0Var.presentFragment(lo0Var3);
                return;
            case 3:
                lo0 lo0Var4 = new lo0(lo0Var.Y0, lo0Var.f38833z0, lo0Var.K0, lo0Var.L0, 0, lo0Var.B0, lo0Var.D0, lo0Var.E0, null, lo0Var.f38825u0, lo0Var.F0, lo0Var.R0, null, lo0Var.f38817o0, lo0Var.T0);
                lo0Var4.Z0 = lo0Var.Z0;
                lo0Var4.f38797a1 = lo0Var.f38797a1;
                lo0Var4.Q = new tn0(lo0Var);
                lo0Var.presentFragment(lo0Var4);
                return;
            case 4:
                lo0 lo0Var5 = new lo0(lo0Var.Y0, lo0Var.f38833z0, lo0Var.K0, lo0Var.L0, 0, lo0Var.B0, lo0Var.D0, lo0Var.E0, null, lo0Var.f38825u0, lo0Var.F0, lo0Var.R0, null, lo0Var.f38817o0, lo0Var.T0);
                lo0Var5.Z0 = lo0Var.Z0;
                lo0Var5.f38797a1 = lo0Var.f38797a1;
                lo0Var5.Q = new un0(lo0Var);
                lo0Var.presentFragment(lo0Var5);
                return;
            case 5:
                if (!lo0Var.M0) {
                    boolean z10 = !lo0Var.C;
                    lo0Var.C = z10;
                    lo0Var.S.setChecked(z10);
                    lo0Var.T.a(lo0Var.C, true);
                    return;
                }
                return;
            case 6:
                lo0.Z(lo0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lo0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (lo0Var.X.has_secure_values) {
                    string = org.telegram.messenger.y3.h(R.string.TurnPasswordOffPassport, w.c.f(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                d2Var.Q = string;
                d2Var.O = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new ln0(lo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                lo0Var.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(lo0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21895q7));
                    return;
                }
                return;
            case 8:
                boolean z11 = !lo0Var.Q0;
                lo0Var.Q0 = z11;
                lo0Var.I.setChecked(z11);
                return;
            case 9:
                boolean z12 = !lo0Var.R0;
                lo0Var.R0 = z12;
                lo0Var.I.setChecked(z12);
                return;
            case 10:
                boolean z13 = !lo0Var.R0;
                lo0Var.R0 = z13;
                lo0Var.I.setChecked(z13);
                return;
            case 11:
                lo0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = lo0Var.h;
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
                lo0Var.M.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = lo0.p0();
                    if (lo0Var.H0 != null && lo0Var.J0 == null) {
                        p02.put("tokenizationSpecification", new j9.f(lo0Var, 2));
                    } else {
                        p02.put("tokenizationSpecification", new j9.f(lo0Var, 4));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(lo0Var.f38833z0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = lo0Var.D0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, lo0Var.f38833z0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(lo0Var.I0)) {
                        jSONObject.put("countryCode", lo0Var.I0);
                    }
                    jSONObject.put("currencyCode", lo0Var.f38833z0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", lo0Var.m0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f9911r = true;
                    b6.m.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f9912s = jSONObject2;
                    a8.e eVar = lo0Var.f38805e;
                    eVar.getClass();
                    com.google.android.gms.common.api.internal.v e6 = com.google.android.gms.common.api.internal.w.e();
                    e6.f2824c = new y5.h((Object) obj, 21);
                    e6.d = new y5.c[]{j8.p.f9923b};
                    e6.f2823b = true;
                    e6.f2822a = 23707;
                    j8.a.a(eVar.e(1, e6.e()), lo0Var.getParentActivity());
                    return;
                } catch (JSONException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 13:
                lo0Var.f38823s0 = false;
                lo0Var.t0();
                return;
            default:
                lo0Var.f38807f[0].requestFocus();
                AndroidUtilities.showKeyboard(lo0Var.f38807f[0]);
                return;
        }
    }
}
