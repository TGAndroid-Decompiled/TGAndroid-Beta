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
    public final int f41489a;
    public final ro0 f41490b;

    public mn0(ro0 ro0Var, int i10) {
        this.f41489a = i10;
        this.f41490b = ro0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f41489a;
        ro0 ro0Var = this.f41490b;
        switch (i10) {
            case 0:
                if (ro0Var.getParentActivity() != null) {
                    ro0Var.H0(null);
                    return;
                }
                return;
            case 1:
                ro0 ro0Var2 = new ro0(ro0Var.f43102b1, ro0Var.C0, ro0Var.N0, ro0Var.O0, 0, ro0Var.E0, ro0Var.G0, ro0Var.H0, null, ro0Var.f43134x0, ro0Var.I0, ro0Var.U0, null, ro0Var.f43125r0, ro0Var.W0);
                ro0Var2.f43105c1 = ro0Var.f43105c1;
                ro0Var2.f43107d1 = ro0Var.f43107d1;
                ro0Var2.T = new wn0(ro0Var);
                ro0Var.presentFragment(ro0Var2);
                return;
            case 2:
                ro0 ro0Var3 = new ro0(ro0Var.f43102b1, ro0Var.C0, ro0Var.N0, ro0Var.O0, 0, ro0Var.E0, ro0Var.G0, ro0Var.H0, null, ro0Var.f43134x0, ro0Var.I0, ro0Var.U0, null, ro0Var.f43125r0, ro0Var.W0);
                ro0Var3.f43105c1 = ro0Var.f43105c1;
                ro0Var3.f43107d1 = ro0Var.f43107d1;
                ro0Var3.T = new xn0(ro0Var);
                ro0Var.presentFragment(ro0Var3);
                return;
            case 3:
                ro0 ro0Var4 = new ro0(ro0Var.f43102b1, ro0Var.C0, ro0Var.N0, ro0Var.O0, 0, ro0Var.E0, ro0Var.G0, ro0Var.H0, null, ro0Var.f43134x0, ro0Var.I0, ro0Var.U0, null, ro0Var.f43125r0, ro0Var.W0);
                ro0Var4.f43105c1 = ro0Var.f43105c1;
                ro0Var4.f43107d1 = ro0Var.f43107d1;
                ro0Var4.T = new yn0(ro0Var);
                ro0Var.presentFragment(ro0Var4);
                return;
            case 4:
                ro0 ro0Var5 = new ro0(ro0Var.f43102b1, ro0Var.C0, ro0Var.N0, ro0Var.O0, 0, ro0Var.E0, ro0Var.G0, ro0Var.H0, null, ro0Var.f43134x0, ro0Var.I0, ro0Var.U0, null, ro0Var.f43125r0, ro0Var.W0);
                ro0Var5.f43105c1 = ro0Var.f43105c1;
                ro0Var5.f43107d1 = ro0Var.f43107d1;
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
                ro0.a0(ro0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ro0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (ro0Var.f43098a0.has_secure_values) {
                    string = org.telegram.messenger.t.h(R.string.TurnPasswordOffPassport, org.telegram.ui.Components.b10.l(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                e2Var.T = string;
                e2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new qn0(ro0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ro0Var.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, ro0Var.Y0);
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
                    org.telegram.ui.Cells.o6[] o6VarArr = ro0Var.h;
                    if (i11 < o6VarArr.length) {
                        org.telegram.ui.Cells.o6 o6Var = o6VarArr[i11];
                        if (intValue == i11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        o6Var.a(z10, true);
                        i11++;
                    } else {
                        return;
                    }
                }
            case 12:
                ro0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject q02 = ro0.q0();
                    if (ro0Var.K0 != null && ro0Var.M0 == null) {
                        q02.put("tokenizationSpecification", new eo0(ro0Var, 1));
                    } else {
                        q02.put("tokenizationSpecification", new eo0(ro0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(q02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(ro0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = ro0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, ro0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(ro0Var.L0)) {
                        jSONObject.put("countryCode", ro0Var.L0);
                    }
                    jSONObject.put("currencyCode", ro0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", ro0Var.f43122p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f51169r = true;
                    o6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f51170s = jSONObject2;
                    a6.a aVar = ro0Var.e;
                    aVar.getClass();
                    com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
                    b10.f6622c = new li.h5(obj);
                    b10.d = new l6.c[]{w8.p.f51181b};
                    b10.f6621b = true;
                    b10.f6620a = 23707;
                    w8.a.a(aVar.e(1, b10.a()), ro0Var.getParentActivity());
                    return;
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                ro0Var.f43130v0 = false;
                ro0Var.u0();
                return;
            default:
                ro0Var.f43110f[0].requestFocus();
                AndroidUtilities.showKeyboard(ro0Var.f43110f[0]);
                return;
        }
    }
}
