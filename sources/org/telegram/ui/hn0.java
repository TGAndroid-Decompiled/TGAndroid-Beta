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
    public final int f34356a;
    public final no0 f34357b;

    public hn0(no0 no0Var, int i10) {
        this.f34356a = i10;
        this.f34357b = no0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f34356a;
        no0 no0Var = this.f34357b;
        switch (i10) {
            case 0:
                if (no0Var.getParentActivity() != null) {
                    no0Var.G0(null);
                    return;
                }
                return;
            case 1:
                no0 no0Var2 = new no0(no0Var.f36054b1, no0Var.C0, no0Var.N0, no0Var.O0, 0, no0Var.E0, no0Var.G0, no0Var.H0, null, no0Var.f36086x0, no0Var.I0, no0Var.U0, null, no0Var.f36077r0, no0Var.W0);
                no0Var2.f36057c1 = no0Var.f36057c1;
                no0Var2.f36059d1 = no0Var.f36059d1;
                no0Var2.T = new sn0(no0Var);
                no0Var.presentFragment(no0Var2);
                return;
            case 2:
                no0 no0Var3 = new no0(no0Var.f36054b1, no0Var.C0, no0Var.N0, no0Var.O0, 0, no0Var.E0, no0Var.G0, no0Var.H0, null, no0Var.f36086x0, no0Var.I0, no0Var.U0, null, no0Var.f36077r0, no0Var.W0);
                no0Var3.f36057c1 = no0Var.f36057c1;
                no0Var3.f36059d1 = no0Var.f36059d1;
                no0Var3.T = new tn0(no0Var);
                no0Var.presentFragment(no0Var3);
                return;
            case 3:
                no0 no0Var4 = new no0(no0Var.f36054b1, no0Var.C0, no0Var.N0, no0Var.O0, 0, no0Var.E0, no0Var.G0, no0Var.H0, null, no0Var.f36086x0, no0Var.I0, no0Var.U0, null, no0Var.f36077r0, no0Var.W0);
                no0Var4.f36057c1 = no0Var.f36057c1;
                no0Var4.f36059d1 = no0Var.f36059d1;
                no0Var4.T = new un0(no0Var);
                no0Var.presentFragment(no0Var4);
                return;
            case 4:
                no0 no0Var5 = new no0(no0Var.f36054b1, no0Var.C0, no0Var.N0, no0Var.O0, 0, no0Var.E0, no0Var.G0, no0Var.H0, null, no0Var.f36086x0, no0Var.I0, no0Var.U0, null, no0Var.f36077r0, no0Var.W0);
                no0Var5.f36057c1 = no0Var.f36057c1;
                no0Var5.f36059d1 = no0Var.f36059d1;
                no0Var5.T = new vn0(no0Var);
                no0Var.presentFragment(no0Var5);
                return;
            case 5:
                if (!no0Var.P0) {
                    boolean z11 = !no0Var.F;
                    no0Var.F = z11;
                    no0Var.V.setChecked(z11);
                    no0Var.W.a(no0Var.F, true);
                    return;
                }
                return;
            case 6:
                no0.Z(no0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(no0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (no0Var.f36050a0.has_secure_values) {
                    string = org.telegram.messenger.f0.g(R.string.TurnPasswordOffPassport, v7.j.h(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
                a2Var.T = string;
                a2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new ln0(no0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                no0Var.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(no0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19315q7));
                    return;
                }
                return;
            case 8:
                boolean z12 = !no0Var.T0;
                no0Var.T0 = z12;
                no0Var.L.setChecked(z12);
                return;
            case 9:
                boolean z13 = !no0Var.U0;
                no0Var.U0 = z13;
                no0Var.L.setChecked(z13);
                return;
            case 10:
                boolean z14 = !no0Var.U0;
                no0Var.U0 = z14;
                no0Var.L.setChecked(z14);
                return;
            case 11:
                no0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = no0Var.h;
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
                no0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = no0.p0();
                    if (no0Var.K0 != null && no0Var.M0 == null) {
                        p02.put("tokenizationSpecification", new ao0(no0Var, 1));
                    } else {
                        p02.put("tokenizationSpecification", new ao0(no0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(no0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = no0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j3 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j3, no0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(no0Var.L0)) {
                        jSONObject.put("countryCode", no0Var.L0);
                    }
                    jSONObject.put("currencyCode", no0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", no0Var.f36074p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f44633r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f44634s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = no0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                    e.f6178c = new k2.u((Object) obj, 29);
                    e.d = new k6.c[]{v8.p.f44645b};
                    e.f6177b = true;
                    e.f6176a = 23707;
                    v8.a.a(v0Var.e(1, e.a()), no0Var.getParentActivity());
                    return;
                } catch (JSONException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 13:
                no0Var.f36082v0 = false;
                no0Var.t0();
                return;
            default:
                no0Var.f36062f[0].requestFocus();
                AndroidUtilities.showKeyboard(no0Var.f36062f[0]);
                return;
        }
    }
}
