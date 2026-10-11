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
public final class on0 implements View.OnClickListener {
    public final int f40619a;
    public final uo0 f40620b;

    public on0(uo0 uo0Var, int i10) {
        this.f40619a = i10;
        this.f40620b = uo0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f40619a;
        uo0 uo0Var = this.f40620b;
        switch (i10) {
            case 0:
                if (uo0Var.getParentActivity() != null) {
                    uo0Var.G0(null);
                    return;
                }
                return;
            case 1:
                uo0 uo0Var2 = new uo0(uo0Var.f42731b1, uo0Var.C0, uo0Var.N0, uo0Var.O0, 0, uo0Var.E0, uo0Var.G0, uo0Var.H0, null, uo0Var.f42764x0, uo0Var.I0, uo0Var.U0, null, uo0Var.f42755r0, uo0Var.W0);
                uo0Var2.f42734c1 = uo0Var.f42734c1;
                uo0Var2.f42736d1 = uo0Var.f42736d1;
                uo0Var2.T = new zn0(uo0Var);
                uo0Var.presentFragment(uo0Var2);
                return;
            case 2:
                uo0 uo0Var3 = new uo0(uo0Var.f42731b1, uo0Var.C0, uo0Var.N0, uo0Var.O0, 0, uo0Var.E0, uo0Var.G0, uo0Var.H0, null, uo0Var.f42764x0, uo0Var.I0, uo0Var.U0, null, uo0Var.f42755r0, uo0Var.W0);
                uo0Var3.f42734c1 = uo0Var.f42734c1;
                uo0Var3.f42736d1 = uo0Var.f42736d1;
                uo0Var3.T = new ao0(uo0Var);
                uo0Var.presentFragment(uo0Var3);
                return;
            case 3:
                uo0 uo0Var4 = new uo0(uo0Var.f42731b1, uo0Var.C0, uo0Var.N0, uo0Var.O0, 0, uo0Var.E0, uo0Var.G0, uo0Var.H0, null, uo0Var.f42764x0, uo0Var.I0, uo0Var.U0, null, uo0Var.f42755r0, uo0Var.W0);
                uo0Var4.f42734c1 = uo0Var.f42734c1;
                uo0Var4.f42736d1 = uo0Var.f42736d1;
                uo0Var4.T = new bo0(uo0Var);
                uo0Var.presentFragment(uo0Var4);
                return;
            case 4:
                uo0 uo0Var5 = new uo0(uo0Var.f42731b1, uo0Var.C0, uo0Var.N0, uo0Var.O0, 0, uo0Var.E0, uo0Var.G0, uo0Var.H0, null, uo0Var.f42764x0, uo0Var.I0, uo0Var.U0, null, uo0Var.f42755r0, uo0Var.W0);
                uo0Var5.f42734c1 = uo0Var.f42734c1;
                uo0Var5.f42736d1 = uo0Var.f42736d1;
                uo0Var5.T = new co0(uo0Var);
                uo0Var.presentFragment(uo0Var5);
                return;
            case 5:
                if (!uo0Var.P0) {
                    boolean z11 = !uo0Var.F;
                    uo0Var.F = z11;
                    uo0Var.V.setChecked(z11);
                    uo0Var.W.a(uo0Var.F, true);
                    return;
                }
                return;
            case 6:
                uo0.Z(uo0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uo0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (uo0Var.f42727a0.has_secure_values) {
                    string = org.telegram.messenger.q.g(R.string.TurnPasswordOffPassport, sc.v.j(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                a2Var.T = string;
                a2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new sn0(uo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                uo0Var.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(uo0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21062q7));
                    return;
                }
                return;
            case 8:
                boolean z12 = !uo0Var.T0;
                uo0Var.T0 = z12;
                uo0Var.L.setChecked(z12);
                return;
            case 9:
                boolean z13 = !uo0Var.U0;
                uo0Var.U0 = z13;
                uo0Var.L.setChecked(z13);
                return;
            case 10:
                boolean z14 = !uo0Var.U0;
                uo0Var.U0 = z14;
                uo0Var.L.setChecked(z14);
                return;
            case 11:
                uo0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = uo0Var.h;
                    if (i11 < k6VarArr.length) {
                        org.telegram.ui.Cells.k6 k6Var = k6VarArr[i11];
                        if (intValue == i11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        k6Var.a(z10, true);
                        i11++;
                    } else {
                        return;
                    }
                }
            case 12:
                uo0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = uo0.p0();
                    if (uo0Var.K0 != null && uo0Var.M0 == null) {
                        p02.put("tokenizationSpecification", new ho0(uo0Var, 1));
                    } else {
                        p02.put("tokenizationSpecification", new ho0(uo0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(uo0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = uo0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j3 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j3, uo0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(uo0Var.L0)) {
                        jSONObject.put("countryCode", uo0Var.L0);
                    }
                    jSONObject.put("currencyCode", uo0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", uo0Var.f42752p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f49596r = true;
                    n6.m.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f49597s = jSONObject2;
                    com.google.android.gms.internal.clearcut.u0 u0Var = uo0Var.f42737e;
                    u0Var.getClass();
                    com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
                    e7.f6695c = new k2.g0((Object) obj, 29);
                    e7.d = new k6.c[]{v8.p.f49608b};
                    e7.f6694b = true;
                    e7.f6693a = 23707;
                    v8.a.a(u0Var.e(1, e7.a()), uo0Var.getParentActivity());
                    return;
                } catch (JSONException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 13:
                uo0Var.f42760v0 = false;
                uo0Var.t0();
                return;
            default:
                uo0Var.f42740f[0].requestFocus();
                AndroidUtilities.showKeyboard(uo0Var.f42740f[0]);
                return;
        }
    }
}
