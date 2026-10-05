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
public final class mn0 implements View.OnClickListener {
    public final int f38679a;
    public final so0 f38680b;

    public mn0(so0 so0Var, int i10) {
        this.f38679a = i10;
        this.f38680b = so0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f38679a;
        so0 so0Var = this.f38680b;
        switch (i10) {
            case 0:
                if (so0Var.getParentActivity() != null) {
                    so0Var.G0(null);
                    return;
                }
                return;
            case 1:
                so0 so0Var2 = new so0(so0Var.f40563b1, so0Var.C0, so0Var.N0, so0Var.O0, 0, so0Var.E0, so0Var.G0, so0Var.H0, null, so0Var.f40596x0, so0Var.I0, so0Var.U0, null, so0Var.f40587r0, so0Var.W0);
                so0Var2.f40566c1 = so0Var.f40566c1;
                so0Var2.f40568d1 = so0Var.f40568d1;
                so0Var2.T = new xn0(so0Var);
                so0Var.presentFragment(so0Var2);
                return;
            case 2:
                so0 so0Var3 = new so0(so0Var.f40563b1, so0Var.C0, so0Var.N0, so0Var.O0, 0, so0Var.E0, so0Var.G0, so0Var.H0, null, so0Var.f40596x0, so0Var.I0, so0Var.U0, null, so0Var.f40587r0, so0Var.W0);
                so0Var3.f40566c1 = so0Var.f40566c1;
                so0Var3.f40568d1 = so0Var.f40568d1;
                so0Var3.T = new yn0(so0Var);
                so0Var.presentFragment(so0Var3);
                return;
            case 3:
                so0 so0Var4 = new so0(so0Var.f40563b1, so0Var.C0, so0Var.N0, so0Var.O0, 0, so0Var.E0, so0Var.G0, so0Var.H0, null, so0Var.f40596x0, so0Var.I0, so0Var.U0, null, so0Var.f40587r0, so0Var.W0);
                so0Var4.f40566c1 = so0Var.f40566c1;
                so0Var4.f40568d1 = so0Var.f40568d1;
                so0Var4.T = new zn0(so0Var);
                so0Var.presentFragment(so0Var4);
                return;
            case 4:
                so0 so0Var5 = new so0(so0Var.f40563b1, so0Var.C0, so0Var.N0, so0Var.O0, 0, so0Var.E0, so0Var.G0, so0Var.H0, null, so0Var.f40596x0, so0Var.I0, so0Var.U0, null, so0Var.f40587r0, so0Var.W0);
                so0Var5.f40566c1 = so0Var.f40566c1;
                so0Var5.f40568d1 = so0Var.f40568d1;
                so0Var5.T = new ao0(so0Var);
                so0Var.presentFragment(so0Var5);
                return;
            case 5:
                if (!so0Var.P0) {
                    boolean z11 = !so0Var.F;
                    so0Var.F = z11;
                    so0Var.V.setChecked(z11);
                    so0Var.W.a(so0Var.F, true);
                    return;
                }
                return;
            case 6:
                so0.Y(so0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(so0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (so0Var.f40559a0.has_secure_values) {
                    string = org.telegram.messenger.q.g(R.string.TurnPasswordOffPassport, sa.e.j(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                b2Var.T = string;
                b2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new qn0(so0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                so0Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(so0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21068q7));
                    return;
                }
                return;
            case 8:
                boolean z12 = !so0Var.T0;
                so0Var.T0 = z12;
                so0Var.L.setChecked(z12);
                return;
            case 9:
                boolean z13 = !so0Var.U0;
                so0Var.U0 = z13;
                so0Var.L.setChecked(z13);
                return;
            case 10:
                boolean z14 = !so0Var.U0;
                so0Var.U0 = z14;
                so0Var.L.setChecked(z14);
                return;
            case 11:
                so0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = so0Var.h;
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
                so0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = so0.p0();
                    if (so0Var.K0 != null && so0Var.M0 == null) {
                        p02.put("tokenizationSpecification", new fo0(so0Var, 1));
                    } else {
                        p02.put("tokenizationSpecification", new fo0(so0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(so0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = so0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j3 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j3, so0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(so0Var.L0)) {
                        jSONObject.put("countryCode", so0Var.L0);
                    }
                    jSONObject.put("currencyCode", so0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", so0Var.f40584p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f48223r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f48224s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = so0Var.f40569e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
                    e7.f6644c = new n2.c((Object) obj, 22);
                    e7.d = new k6.c[]{v8.p.f48235b};
                    e7.f6643b = true;
                    e7.f6642a = 23707;
                    v8.a.a(v0Var.e(1, e7.a()), so0Var.getParentActivity());
                    return;
                } catch (JSONException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 13:
                so0Var.f40592v0 = false;
                so0Var.t0();
                return;
            default:
                so0Var.f40572f[0].requestFocus();
                AndroidUtilities.showKeyboard(so0Var.f40572f[0]);
                return;
        }
    }
}
