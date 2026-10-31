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
public final class nl0 implements View.OnClickListener {
    public final int f39971a;
    public final sm0 f39972b;

    public nl0(sm0 sm0Var, int i10) {
        this.f39971a = i10;
        this.f39972b = sm0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f39971a;
        sm0 sm0Var = this.f39972b;
        switch (i10) {
            case 0:
                sm0Var.f41559f[0].requestFocus();
                org.telegram.messenger.i0.J3(sm0Var.f41559f[0]);
                return;
            case 1:
                if (sm0Var.getParentActivity() != null) {
                    sm0Var.L0(null);
                    return;
                }
                return;
            case 2:
                sm0 sm0Var2 = new sm0(sm0Var.f41551b1, sm0Var.C0, sm0Var.N0, sm0Var.O0, 0, sm0Var.E0, sm0Var.G0, sm0Var.H0, null, sm0Var.f41583x0, sm0Var.I0, sm0Var.U0, null, sm0Var.f41574r0, sm0Var.W0);
                sm0Var2.f41554c1 = sm0Var.f41554c1;
                sm0Var2.f41556d1 = sm0Var.f41556d1;
                sm0Var2.T = new zl0(sm0Var);
                sm0Var.presentFragment(sm0Var2);
                return;
            case 3:
                sm0 sm0Var3 = new sm0(sm0Var.f41551b1, sm0Var.C0, sm0Var.N0, sm0Var.O0, 0, sm0Var.E0, sm0Var.G0, sm0Var.H0, null, sm0Var.f41583x0, sm0Var.I0, sm0Var.U0, null, sm0Var.f41574r0, sm0Var.W0);
                sm0Var3.f41554c1 = sm0Var.f41554c1;
                sm0Var3.f41556d1 = sm0Var.f41556d1;
                sm0Var3.T = new am0(sm0Var);
                sm0Var.presentFragment(sm0Var3);
                return;
            case 4:
                sm0 sm0Var4 = new sm0(sm0Var.f41551b1, sm0Var.C0, sm0Var.N0, sm0Var.O0, 0, sm0Var.E0, sm0Var.G0, sm0Var.H0, null, sm0Var.f41583x0, sm0Var.I0, sm0Var.U0, null, sm0Var.f41574r0, sm0Var.W0);
                sm0Var4.f41554c1 = sm0Var.f41554c1;
                sm0Var4.f41556d1 = sm0Var.f41556d1;
                sm0Var4.T = new bm0(sm0Var);
                sm0Var.presentFragment(sm0Var4);
                return;
            case 5:
                sm0 sm0Var5 = new sm0(sm0Var.f41551b1, sm0Var.C0, sm0Var.N0, sm0Var.O0, 0, sm0Var.E0, sm0Var.G0, sm0Var.H0, null, sm0Var.f41583x0, sm0Var.I0, sm0Var.U0, null, sm0Var.f41574r0, sm0Var.W0);
                sm0Var5.f41554c1 = sm0Var.f41554c1;
                sm0Var5.f41556d1 = sm0Var.f41556d1;
                sm0Var5.T = new cm0(sm0Var);
                sm0Var.presentFragment(sm0Var5);
                return;
            case 6:
                if (!sm0Var.P0) {
                    boolean z11 = !sm0Var.F;
                    sm0Var.F = z11;
                    sm0Var.V.setChecked(z11);
                    sm0Var.W.a(sm0Var.F, true);
                    return;
                }
                return;
            case 7:
                sm0.d0(sm0Var);
                return;
            case 8:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sm0Var.getParentActivity());
                String L0 = org.telegram.messenger.cd.L0(2131743965, null);
                if (sm0Var.f41547a0.has_secure_values) {
                    L0 = a1.g.m(null, 2131743966, sc.e.i(L0, "\n\n"));
                }
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.T = L0;
                x1Var.R = org.telegram.messenger.cd.L0(2131743964, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751436, null), new sl0(sm0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                sm0Var.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, sm0Var.Y0);
                    return;
                }
                return;
            case 9:
                boolean z12 = !sm0Var.T0;
                sm0Var.T0 = z12;
                sm0Var.L.setChecked(z12);
                return;
            case 10:
                boolean z13 = !sm0Var.U0;
                sm0Var.U0 = z13;
                sm0Var.L.setChecked(z13);
                return;
            case 11:
                boolean z14 = !sm0Var.U0;
                sm0Var.U0 = z14;
                sm0Var.L.setChecked(z14);
                return;
            case 12:
                sm0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.m6[] m6VarArr = sm0Var.h;
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
                sm0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject t02 = sm0.t0();
                    if (sm0Var.K0 != null && sm0Var.M0 == null) {
                        t02.put("tokenizationSpecification", new im0(sm0Var, 1));
                    } else {
                        t02.put("tokenizationSpecification", new im0(sm0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(t02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(sm0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = sm0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    jSONObject.put("totalPrice", sm0Var.w0(arrayList));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(sm0Var.L0)) {
                        jSONObject.put("countryCode", sm0Var.L0);
                    }
                    jSONObject.put("currencyCode", sm0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", sm0Var.f41571p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f50710r = true;
                    n6.l.h(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f50711s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = sm0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                    b10.f4496c = new r2.y((Object) obj, 11);
                    b10.d = new k6.c[]{v8.p.f50723b};
                    b10.f4495b = true;
                    b10.f4494a = 23707;
                    v8.a.a(v0Var.e(1, b10.a()), sm0Var.getParentActivity());
                    return;
                } catch (JSONException e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                sm0Var.f41579v0 = false;
                sm0Var.y0();
                return;
        }
    }
}
