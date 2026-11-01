package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ll0 implements View.OnClickListener {
    public final int f39306a;
    public final qm0 f39307b;

    public ll0(qm0 qm0Var, int i10) {
        this.f39306a = i10;
        this.f39307b = qm0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f39306a;
        qm0 qm0Var = this.f39307b;
        switch (i10) {
            case 0:
                qm0Var.f40825f[0].requestFocus();
                org.telegram.messenger.i0.J3(qm0Var.f40825f[0]);
                return;
            case 1:
                if (qm0Var.getParentActivity() != null) {
                    qm0Var.M0(null);
                    return;
                }
                return;
            case 2:
                qm0 qm0Var2 = new qm0(qm0Var.f40817b1, qm0Var.C0, qm0Var.N0, qm0Var.O0, 0, qm0Var.E0, qm0Var.G0, qm0Var.H0, null, qm0Var.f40849x0, qm0Var.I0, qm0Var.U0, null, qm0Var.f40840r0, qm0Var.W0);
                qm0Var2.f40820c1 = qm0Var.f40820c1;
                qm0Var2.f40822d1 = qm0Var.f40822d1;
                qm0Var2.T = new xl0(qm0Var);
                qm0Var.presentFragment(qm0Var2);
                return;
            case 3:
                qm0 qm0Var3 = new qm0(qm0Var.f40817b1, qm0Var.C0, qm0Var.N0, qm0Var.O0, 0, qm0Var.E0, qm0Var.G0, qm0Var.H0, null, qm0Var.f40849x0, qm0Var.I0, qm0Var.U0, null, qm0Var.f40840r0, qm0Var.W0);
                qm0Var3.f40820c1 = qm0Var.f40820c1;
                qm0Var3.f40822d1 = qm0Var.f40822d1;
                qm0Var3.T = new yl0(qm0Var);
                qm0Var.presentFragment(qm0Var3);
                return;
            case 4:
                qm0 qm0Var4 = new qm0(qm0Var.f40817b1, qm0Var.C0, qm0Var.N0, qm0Var.O0, 0, qm0Var.E0, qm0Var.G0, qm0Var.H0, null, qm0Var.f40849x0, qm0Var.I0, qm0Var.U0, null, qm0Var.f40840r0, qm0Var.W0);
                qm0Var4.f40820c1 = qm0Var.f40820c1;
                qm0Var4.f40822d1 = qm0Var.f40822d1;
                qm0Var4.T = new zl0(qm0Var);
                qm0Var.presentFragment(qm0Var4);
                return;
            case 5:
                qm0 qm0Var5 = new qm0(qm0Var.f40817b1, qm0Var.C0, qm0Var.N0, qm0Var.O0, 0, qm0Var.E0, qm0Var.G0, qm0Var.H0, null, qm0Var.f40849x0, qm0Var.I0, qm0Var.U0, null, qm0Var.f40840r0, qm0Var.W0);
                qm0Var5.f40820c1 = qm0Var.f40820c1;
                qm0Var5.f40822d1 = qm0Var.f40822d1;
                qm0Var5.T = new am0(qm0Var);
                qm0Var.presentFragment(qm0Var5);
                return;
            case 6:
                if (!qm0Var.P0) {
                    boolean z11 = !qm0Var.F;
                    qm0Var.F = z11;
                    qm0Var.V.setChecked(z11);
                    qm0Var.W.a(qm0Var.F, true);
                    return;
                }
                return;
            case 7:
                qm0.e0(qm0Var);
                return;
            case 8:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qm0Var.getParentActivity());
                String L0 = org.telegram.messenger.dd.L0(2131743965, null);
                if (qm0Var.f40813a0.has_secure_values) {
                    L0 = a1.g.m(null, 2131743966, sc.e.i(L0, "\n\n"));
                }
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.T = L0;
                x1Var.R = org.telegram.messenger.dd.L0(2131743964, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751436, null), new ql0(qm0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                qm0Var.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, qm0Var.Y0);
                    return;
                }
                return;
            case 9:
                boolean z12 = !qm0Var.T0;
                qm0Var.T0 = z12;
                qm0Var.L.setChecked(z12);
                return;
            case 10:
                boolean z13 = !qm0Var.U0;
                qm0Var.U0 = z13;
                qm0Var.L.setChecked(z13);
                return;
            case 11:
                boolean z14 = !qm0Var.U0;
                qm0Var.U0 = z14;
                qm0Var.L.setChecked(z14);
                return;
            case 12:
                qm0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.m6[] m6VarArr = qm0Var.h;
                    if (i11 < m6VarArr.length) {
                        org.telegram.ui.Cells.m6 m6Var = m6VarArr[i11];
                        if (intValue == i11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m6Var.a(z10, true);
                        i11++;
                    } else {
                        return;
                    }
                }
            case 13:
                qm0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject u02 = qm0.u0();
                    if (qm0Var.K0 != null && qm0Var.M0 == null) {
                        u02.put("tokenizationSpecification", new gm0(qm0Var, 1));
                    } else {
                        u02.put("tokenizationSpecification", new gm0(qm0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(u02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(qm0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = qm0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    jSONObject.put("totalPrice", qm0Var.x0(arrayList));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(qm0Var.L0)) {
                        jSONObject.put("countryCode", qm0Var.L0);
                    }
                    jSONObject.put("currencyCode", qm0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", qm0Var.f40837p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f50724r = true;
                    n6.l.h(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f50725s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = qm0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                    b10.f4496c = new r2.y((Object) obj, 11);
                    b10.d = new k6.c[]{v8.p.f50737b};
                    b10.f4495b = true;
                    b10.f4494a = 23707;
                    v8.a.a(v0Var.e(1, b10.a()), qm0Var.getParentActivity());
                    return;
                } catch (JSONException e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                qm0Var.f40845v0 = false;
                qm0Var.z0();
                return;
        }
    }
}
