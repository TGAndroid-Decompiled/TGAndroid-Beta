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
public final class pn0 implements View.OnClickListener {
    public final int f40899a;
    public final vo0 f40900b;

    public pn0(vo0 vo0Var, int i10) {
        this.f40899a = i10;
        this.f40900b = vo0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f40899a;
        vo0 vo0Var = this.f40900b;
        switch (i10) {
            case 0:
                if (vo0Var.getParentActivity() != null) {
                    vo0Var.G0(null);
                    return;
                }
                return;
            case 1:
                vo0 vo0Var2 = new vo0(vo0Var.f42962b1, vo0Var.C0, vo0Var.N0, vo0Var.O0, 0, vo0Var.E0, vo0Var.G0, vo0Var.H0, null, vo0Var.f42995x0, vo0Var.I0, vo0Var.U0, null, vo0Var.f42986r0, vo0Var.W0);
                vo0Var2.f42965c1 = vo0Var.f42965c1;
                vo0Var2.f42967d1 = vo0Var.f42967d1;
                vo0Var2.T = new ao0(vo0Var);
                vo0Var.presentFragment(vo0Var2);
                return;
            case 2:
                vo0 vo0Var3 = new vo0(vo0Var.f42962b1, vo0Var.C0, vo0Var.N0, vo0Var.O0, 0, vo0Var.E0, vo0Var.G0, vo0Var.H0, null, vo0Var.f42995x0, vo0Var.I0, vo0Var.U0, null, vo0Var.f42986r0, vo0Var.W0);
                vo0Var3.f42965c1 = vo0Var.f42965c1;
                vo0Var3.f42967d1 = vo0Var.f42967d1;
                vo0Var3.T = new bo0(vo0Var);
                vo0Var.presentFragment(vo0Var3);
                return;
            case 3:
                vo0 vo0Var4 = new vo0(vo0Var.f42962b1, vo0Var.C0, vo0Var.N0, vo0Var.O0, 0, vo0Var.E0, vo0Var.G0, vo0Var.H0, null, vo0Var.f42995x0, vo0Var.I0, vo0Var.U0, null, vo0Var.f42986r0, vo0Var.W0);
                vo0Var4.f42965c1 = vo0Var.f42965c1;
                vo0Var4.f42967d1 = vo0Var.f42967d1;
                vo0Var4.T = new co0(vo0Var);
                vo0Var.presentFragment(vo0Var4);
                return;
            case 4:
                vo0 vo0Var5 = new vo0(vo0Var.f42962b1, vo0Var.C0, vo0Var.N0, vo0Var.O0, 0, vo0Var.E0, vo0Var.G0, vo0Var.H0, null, vo0Var.f42995x0, vo0Var.I0, vo0Var.U0, null, vo0Var.f42986r0, vo0Var.W0);
                vo0Var5.f42965c1 = vo0Var.f42965c1;
                vo0Var5.f42967d1 = vo0Var.f42967d1;
                vo0Var5.T = new do0(vo0Var);
                vo0Var.presentFragment(vo0Var5);
                return;
            case 5:
                if (!vo0Var.P0) {
                    boolean z11 = !vo0Var.F;
                    vo0Var.F = z11;
                    vo0Var.V.setChecked(z11);
                    vo0Var.W.a(vo0Var.F, true);
                    return;
                }
                return;
            case 6:
                vo0.Z(vo0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vo0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (vo0Var.f42958a0.has_secure_values) {
                    string = org.telegram.messenger.q.g(R.string.TurnPasswordOffPassport, sc.v.j(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
                b2Var.T = string;
                b2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new tn0(vo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                vo0Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(vo0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21041q7));
                    return;
                }
                return;
            case 8:
                boolean z12 = !vo0Var.T0;
                vo0Var.T0 = z12;
                vo0Var.L.setChecked(z12);
                return;
            case 9:
                boolean z13 = !vo0Var.U0;
                vo0Var.U0 = z13;
                vo0Var.L.setChecked(z13);
                return;
            case 10:
                boolean z14 = !vo0Var.U0;
                vo0Var.U0 = z14;
                vo0Var.L.setChecked(z14);
                return;
            case 11:
                vo0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = vo0Var.h;
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
                vo0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = vo0.p0();
                    if (vo0Var.K0 != null && vo0Var.M0 == null) {
                        p02.put("tokenizationSpecification", new io0(vo0Var, 1));
                    } else {
                        p02.put("tokenizationSpecification", new io0(vo0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(vo0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = vo0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j3 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j3, vo0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(vo0Var.L0)) {
                        jSONObject.put("countryCode", vo0Var.L0);
                    }
                    jSONObject.put("currencyCode", vo0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", vo0Var.f42983p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f49519r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f49520s = jSONObject2;
                    com.google.android.gms.internal.clearcut.u0 u0Var = vo0Var.f42968e;
                    u0Var.getClass();
                    com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
                    e7.f6696c = new k2.g0((Object) obj, 29);
                    e7.d = new k6.c[]{v8.p.f49531b};
                    e7.f6695b = true;
                    e7.f6694a = 23707;
                    v8.a.a(u0Var.e(1, e7.a()), vo0Var.getParentActivity());
                    return;
                } catch (JSONException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 13:
                vo0Var.f42991v0 = false;
                vo0Var.t0();
                return;
            default:
                vo0Var.f42971f[0].requestFocus();
                AndroidUtilities.showKeyboard(vo0Var.f42971f[0]);
                return;
        }
    }
}
