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
public final class in0 implements View.OnClickListener {
    public final int f34544a;
    public final oo0 f34545b;

    public in0(oo0 oo0Var, int i10) {
        this.f34544a = i10;
        this.f34545b = oo0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f34544a;
        oo0 oo0Var = this.f34545b;
        switch (i10) {
            case 0:
                if (oo0Var.getParentActivity() != null) {
                    oo0Var.G0(null);
                    return;
                }
                return;
            case 1:
                oo0 oo0Var2 = new oo0(oo0Var.f36266b1, oo0Var.C0, oo0Var.N0, oo0Var.O0, 0, oo0Var.E0, oo0Var.G0, oo0Var.H0, null, oo0Var.f36298x0, oo0Var.I0, oo0Var.U0, null, oo0Var.f36289r0, oo0Var.W0);
                oo0Var2.f36269c1 = oo0Var.f36269c1;
                oo0Var2.f36271d1 = oo0Var.f36271d1;
                oo0Var2.T = new tn0(oo0Var);
                oo0Var.presentFragment(oo0Var2);
                return;
            case 2:
                oo0 oo0Var3 = new oo0(oo0Var.f36266b1, oo0Var.C0, oo0Var.N0, oo0Var.O0, 0, oo0Var.E0, oo0Var.G0, oo0Var.H0, null, oo0Var.f36298x0, oo0Var.I0, oo0Var.U0, null, oo0Var.f36289r0, oo0Var.W0);
                oo0Var3.f36269c1 = oo0Var.f36269c1;
                oo0Var3.f36271d1 = oo0Var.f36271d1;
                oo0Var3.T = new un0(oo0Var);
                oo0Var.presentFragment(oo0Var3);
                return;
            case 3:
                oo0 oo0Var4 = new oo0(oo0Var.f36266b1, oo0Var.C0, oo0Var.N0, oo0Var.O0, 0, oo0Var.E0, oo0Var.G0, oo0Var.H0, null, oo0Var.f36298x0, oo0Var.I0, oo0Var.U0, null, oo0Var.f36289r0, oo0Var.W0);
                oo0Var4.f36269c1 = oo0Var.f36269c1;
                oo0Var4.f36271d1 = oo0Var.f36271d1;
                oo0Var4.T = new vn0(oo0Var);
                oo0Var.presentFragment(oo0Var4);
                return;
            case 4:
                oo0 oo0Var5 = new oo0(oo0Var.f36266b1, oo0Var.C0, oo0Var.N0, oo0Var.O0, 0, oo0Var.E0, oo0Var.G0, oo0Var.H0, null, oo0Var.f36298x0, oo0Var.I0, oo0Var.U0, null, oo0Var.f36289r0, oo0Var.W0);
                oo0Var5.f36269c1 = oo0Var.f36269c1;
                oo0Var5.f36271d1 = oo0Var.f36271d1;
                oo0Var5.T = new wn0(oo0Var);
                oo0Var.presentFragment(oo0Var5);
                return;
            case 5:
                if (!oo0Var.P0) {
                    boolean z11 = !oo0Var.F;
                    oo0Var.F = z11;
                    oo0Var.V.setChecked(z11);
                    oo0Var.W.a(oo0Var.F, true);
                    return;
                }
                return;
            case 6:
                oo0.Z(oo0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oo0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (oo0Var.f36262a0.has_secure_values) {
                    string = org.telegram.messenger.f0.g(R.string.TurnPasswordOffPassport, v7.j.h(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18647a;
                a2Var.T = string;
                a2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new mn0(oo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                oo0Var.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(oo0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19284q7));
                    return;
                }
                return;
            case 8:
                boolean z12 = !oo0Var.T0;
                oo0Var.T0 = z12;
                oo0Var.L.setChecked(z12);
                return;
            case 9:
                boolean z13 = !oo0Var.U0;
                oo0Var.U0 = z13;
                oo0Var.L.setChecked(z13);
                return;
            case 10:
                boolean z14 = !oo0Var.U0;
                oo0Var.U0 = z14;
                oo0Var.L.setChecked(z14);
                return;
            case 11:
                oo0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = oo0Var.h;
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
                oo0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = oo0.p0();
                    if (oo0Var.K0 != null && oo0Var.M0 == null) {
                        p02.put("tokenizationSpecification", new bo0(oo0Var, 1));
                    } else {
                        p02.put("tokenizationSpecification", new bo0(oo0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(oo0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = oo0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j3 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j3, oo0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(oo0Var.L0)) {
                        jSONObject.put("countryCode", oo0Var.L0);
                    }
                    jSONObject.put("currencyCode", oo0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", oo0Var.f36286p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f44511r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f44512s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = oo0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                    e.f6166c = new k2.u((Object) obj, 29);
                    e.d = new k6.c[]{v8.p.f44523b};
                    e.f6165b = true;
                    e.f6164a = 23707;
                    v8.a.a(v0Var.e(1, e.a()), oo0Var.getParentActivity());
                    return;
                } catch (JSONException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 13:
                oo0Var.f36294v0 = false;
                oo0Var.t0();
                return;
            default:
                oo0Var.f36274f[0].requestFocus();
                AndroidUtilities.showKeyboard(oo0Var.f36274f[0]);
                return;
        }
    }
}
