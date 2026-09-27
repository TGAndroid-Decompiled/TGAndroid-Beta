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
public final class ln0 implements View.OnClickListener {
    public final int f35390a;
    public final ro0 f35391b;

    public ln0(ro0 ro0Var, int i10) {
        this.f35390a = i10;
        this.f35391b = ro0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f35390a;
        ro0 ro0Var = this.f35391b;
        switch (i10) {
            case 0:
                if (ro0Var.getParentActivity() != null) {
                    ro0Var.G0(null);
                    return;
                }
                return;
            case 1:
                ro0 ro0Var2 = new ro0(ro0Var.f37172b1, ro0Var.C0, ro0Var.N0, ro0Var.O0, 0, ro0Var.E0, ro0Var.G0, ro0Var.H0, null, ro0Var.f37204x0, ro0Var.I0, ro0Var.U0, null, ro0Var.f37195r0, ro0Var.W0);
                ro0Var2.f37175c1 = ro0Var.f37175c1;
                ro0Var2.f37177d1 = ro0Var.f37177d1;
                ro0Var2.T = new wn0(ro0Var);
                ro0Var.presentFragment(ro0Var2);
                return;
            case 2:
                ro0 ro0Var3 = new ro0(ro0Var.f37172b1, ro0Var.C0, ro0Var.N0, ro0Var.O0, 0, ro0Var.E0, ro0Var.G0, ro0Var.H0, null, ro0Var.f37204x0, ro0Var.I0, ro0Var.U0, null, ro0Var.f37195r0, ro0Var.W0);
                ro0Var3.f37175c1 = ro0Var.f37175c1;
                ro0Var3.f37177d1 = ro0Var.f37177d1;
                ro0Var3.T = new xn0(ro0Var);
                ro0Var.presentFragment(ro0Var3);
                return;
            case 3:
                ro0 ro0Var4 = new ro0(ro0Var.f37172b1, ro0Var.C0, ro0Var.N0, ro0Var.O0, 0, ro0Var.E0, ro0Var.G0, ro0Var.H0, null, ro0Var.f37204x0, ro0Var.I0, ro0Var.U0, null, ro0Var.f37195r0, ro0Var.W0);
                ro0Var4.f37175c1 = ro0Var.f37175c1;
                ro0Var4.f37177d1 = ro0Var.f37177d1;
                ro0Var4.T = new yn0(ro0Var);
                ro0Var.presentFragment(ro0Var4);
                return;
            case 4:
                ro0 ro0Var5 = new ro0(ro0Var.f37172b1, ro0Var.C0, ro0Var.N0, ro0Var.O0, 0, ro0Var.E0, ro0Var.G0, ro0Var.H0, null, ro0Var.f37204x0, ro0Var.I0, ro0Var.U0, null, ro0Var.f37195r0, ro0Var.W0);
                ro0Var5.f37175c1 = ro0Var.f37175c1;
                ro0Var5.f37177d1 = ro0Var.f37177d1;
                ro0Var5.T = new zn0(ro0Var);
                ro0Var.presentFragment(ro0Var5);
                return;
            case 5:
                if (!ro0Var.P0) {
                    boolean z11 = !ro0Var.F;
                    ro0Var.F = z11;
                    ro0Var.V.setChecked(z11);
                    ro0Var.W.a(ro0Var.F, true);
                    return;
                }
                return;
            case 6:
                ro0.Z(ro0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ro0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (ro0Var.f37168a0.has_secure_values) {
                    string = org.telegram.messenger.l0.g(R.string.TurnPasswordOffPassport, v7.k0.h(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                c2Var.T = string;
                c2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new pn0(ro0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ro0Var.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(ro0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19297q7));
                    return;
                }
                return;
            case 8:
                boolean z12 = !ro0Var.T0;
                ro0Var.T0 = z12;
                ro0Var.L.setChecked(z12);
                return;
            case 9:
                boolean z13 = !ro0Var.U0;
                ro0Var.U0 = z13;
                ro0Var.L.setChecked(z13);
                return;
            case 10:
                boolean z14 = !ro0Var.U0;
                ro0Var.U0 = z14;
                ro0Var.L.setChecked(z14);
                return;
            case 11:
                ro0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = ro0Var.h;
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
                ro0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = ro0.p0();
                    if (ro0Var.K0 != null && ro0Var.M0 == null) {
                        p02.put("tokenizationSpecification", new eo0(ro0Var, 1));
                    } else {
                        p02.put("tokenizationSpecification", new eo0(ro0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(ro0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = ro0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j3 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j3, ro0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(ro0Var.L0)) {
                        jSONObject.put("countryCode", ro0Var.L0);
                    }
                    jSONObject.put("currencyCode", ro0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", ro0Var.f37192p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f44571r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f44572s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = ro0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                    e.f6167c = new k2.u(obj);
                    e.d = new k6.c[]{v8.p.f44583b};
                    e.f6166b = true;
                    e.f6165a = 23707;
                    v8.a.a(v0Var.e(1, e.a()), ro0Var.getParentActivity());
                    return;
                } catch (JSONException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 13:
                ro0Var.f37200v0 = false;
                ro0Var.t0();
                return;
            default:
                ro0Var.f37180f[0].requestFocus();
                AndroidUtilities.showKeyboard(ro0Var.f37180f[0]);
                return;
        }
    }
}
