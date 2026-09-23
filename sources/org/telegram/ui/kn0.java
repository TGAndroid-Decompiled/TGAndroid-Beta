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
public final class kn0 implements View.OnClickListener {
    public final int f34770a;
    public final qo0 f34771b;

    public kn0(qo0 qo0Var, int i10) {
        this.f34770a = i10;
        this.f34771b = qo0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f34770a;
        qo0 qo0Var = this.f34771b;
        switch (i10) {
            case 0:
                if (qo0Var.getParentActivity() != null) {
                    qo0Var.G0(null);
                    return;
                }
                return;
            case 1:
                qo0 qo0Var2 = new qo0(qo0Var.f36488b1, qo0Var.C0, qo0Var.N0, qo0Var.O0, 0, qo0Var.E0, qo0Var.G0, qo0Var.H0, null, qo0Var.f36520x0, qo0Var.I0, qo0Var.U0, null, qo0Var.f36511r0, qo0Var.W0);
                qo0Var2.f36491c1 = qo0Var.f36491c1;
                qo0Var2.f36493d1 = qo0Var.f36493d1;
                qo0Var2.T = new vn0(qo0Var);
                qo0Var.presentFragment(qo0Var2);
                return;
            case 2:
                qo0 qo0Var3 = new qo0(qo0Var.f36488b1, qo0Var.C0, qo0Var.N0, qo0Var.O0, 0, qo0Var.E0, qo0Var.G0, qo0Var.H0, null, qo0Var.f36520x0, qo0Var.I0, qo0Var.U0, null, qo0Var.f36511r0, qo0Var.W0);
                qo0Var3.f36491c1 = qo0Var.f36491c1;
                qo0Var3.f36493d1 = qo0Var.f36493d1;
                qo0Var3.T = new wn0(qo0Var);
                qo0Var.presentFragment(qo0Var3);
                return;
            case 3:
                qo0 qo0Var4 = new qo0(qo0Var.f36488b1, qo0Var.C0, qo0Var.N0, qo0Var.O0, 0, qo0Var.E0, qo0Var.G0, qo0Var.H0, null, qo0Var.f36520x0, qo0Var.I0, qo0Var.U0, null, qo0Var.f36511r0, qo0Var.W0);
                qo0Var4.f36491c1 = qo0Var.f36491c1;
                qo0Var4.f36493d1 = qo0Var.f36493d1;
                qo0Var4.T = new xn0(qo0Var);
                qo0Var.presentFragment(qo0Var4);
                return;
            case 4:
                qo0 qo0Var5 = new qo0(qo0Var.f36488b1, qo0Var.C0, qo0Var.N0, qo0Var.O0, 0, qo0Var.E0, qo0Var.G0, qo0Var.H0, null, qo0Var.f36520x0, qo0Var.I0, qo0Var.U0, null, qo0Var.f36511r0, qo0Var.W0);
                qo0Var5.f36491c1 = qo0Var.f36491c1;
                qo0Var5.f36493d1 = qo0Var.f36493d1;
                qo0Var5.T = new yn0(qo0Var);
                qo0Var.presentFragment(qo0Var5);
                return;
            case 5:
                if (!qo0Var.P0) {
                    boolean z11 = !qo0Var.F;
                    qo0Var.F = z11;
                    qo0Var.V.setChecked(z11);
                    qo0Var.W.a(qo0Var.F, true);
                    return;
                }
                return;
            case 6:
                qo0.Z(qo0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qo0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (qo0Var.f36484a0.has_secure_values) {
                    string = org.telegram.messenger.z0.h(R.string.TurnPasswordOffPassport, w.c.h(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                b2Var.T = string;
                b2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new on0(qo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                qo0Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(qo0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19026q7));
                    return;
                }
                return;
            case 8:
                boolean z12 = !qo0Var.T0;
                qo0Var.T0 = z12;
                qo0Var.L.setChecked(z12);
                return;
            case 9:
                boolean z13 = !qo0Var.U0;
                qo0Var.U0 = z13;
                qo0Var.L.setChecked(z13);
                return;
            case 10:
                boolean z14 = !qo0Var.U0;
                qo0Var.U0 = z14;
                qo0Var.L.setChecked(z14);
                return;
            case 11:
                qo0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = qo0Var.h;
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
                qo0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = qo0.p0();
                    if (qo0Var.K0 != null && qo0Var.M0 == null) {
                        p02.put("tokenizationSpecification", new do0(qo0Var, 1));
                    } else {
                        p02.put("tokenizationSpecification", new do0(qo0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(qo0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = qo0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j3 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j3, qo0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(qo0Var.L0)) {
                        jSONObject.put("countryCode", qo0Var.L0);
                    }
                    jSONObject.put("currencyCode", qo0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", qo0Var.f36508p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f44193r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f44194s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = qo0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                    e.f6166c = new org.telegram.ui.Cells.ja((Object) obj, 18);
                    e.d = new k6.c[]{v8.p.f44205b};
                    e.f6165b = true;
                    e.f6164a = 23707;
                    v8.a.a(v0Var.e(1, e.a()), qo0Var.getParentActivity());
                    return;
                } catch (JSONException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 13:
                qo0Var.f36516v0 = false;
                qo0Var.t0();
                return;
            default:
                qo0Var.f36496f[0].requestFocus();
                AndroidUtilities.showKeyboard(qo0Var.f36496f[0]);
                return;
        }
    }
}
