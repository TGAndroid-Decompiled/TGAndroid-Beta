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
public final class gk0 implements View.OnClickListener {
    public final int f47470a;
    public final jl0 f47471b;

    public gk0(jl0 jl0Var, int i7) {
        this.f47470a = i7;
        this.f47471b = jl0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i7 = this.f47470a;
        jl0 jl0Var = this.f47471b;
        switch (i7) {
            case 0:
                jl0Var.f48396f[0].requestFocus();
                org.telegram.messenger.g0.J3(jl0Var.f48396f[0]);
                return;
            case 1:
                if (jl0Var.getParentActivity() != null) {
                    jl0Var.M0(null);
                    return;
                }
                return;
            case 2:
                jl0 jl0Var2 = new jl0(jl0Var.f48390c1, jl0Var.D0, jl0Var.O0, jl0Var.P0, 0, jl0Var.F0, jl0Var.H0, jl0Var.I0, null, jl0Var.f48423y0, jl0Var.J0, jl0Var.V0, null, jl0Var.f48414s0, jl0Var.X0);
                jl0Var2.f48392d1 = jl0Var.f48392d1;
                jl0Var2.f48395e1 = jl0Var.f48395e1;
                jl0Var2.U = new rk0(jl0Var);
                jl0Var.presentFragment(jl0Var2);
                return;
            case 3:
                jl0 jl0Var3 = new jl0(jl0Var.f48390c1, jl0Var.D0, jl0Var.O0, jl0Var.P0, 0, jl0Var.F0, jl0Var.H0, jl0Var.I0, null, jl0Var.f48423y0, jl0Var.J0, jl0Var.V0, null, jl0Var.f48414s0, jl0Var.X0);
                jl0Var3.f48392d1 = jl0Var.f48392d1;
                jl0Var3.f48395e1 = jl0Var.f48395e1;
                jl0Var3.U = new sk0(jl0Var);
                jl0Var.presentFragment(jl0Var3);
                return;
            case 4:
                jl0 jl0Var4 = new jl0(jl0Var.f48390c1, jl0Var.D0, jl0Var.O0, jl0Var.P0, 0, jl0Var.F0, jl0Var.H0, jl0Var.I0, null, jl0Var.f48423y0, jl0Var.J0, jl0Var.V0, null, jl0Var.f48414s0, jl0Var.X0);
                jl0Var4.f48392d1 = jl0Var.f48392d1;
                jl0Var4.f48395e1 = jl0Var.f48395e1;
                jl0Var4.U = new tk0(jl0Var);
                jl0Var.presentFragment(jl0Var4);
                return;
            case 5:
                jl0 jl0Var5 = new jl0(jl0Var.f48390c1, jl0Var.D0, jl0Var.O0, jl0Var.P0, 0, jl0Var.F0, jl0Var.H0, jl0Var.I0, null, jl0Var.f48423y0, jl0Var.J0, jl0Var.V0, null, jl0Var.f48414s0, jl0Var.X0);
                jl0Var5.f48392d1 = jl0Var.f48392d1;
                jl0Var5.f48395e1 = jl0Var.f48395e1;
                jl0Var5.U = new uk0(jl0Var);
                jl0Var.presentFragment(jl0Var5);
                return;
            case 6:
                if (!jl0Var.Q0) {
                    boolean z11 = !jl0Var.G;
                    jl0Var.G = z11;
                    jl0Var.W.setChecked(z11);
                    jl0Var.X.a(jl0Var.G, true);
                    return;
                }
                return;
            case 7:
                jl0.e0(jl0Var);
                return;
            case 8:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jl0Var.getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131743940, null);
                if (jl0Var.f48386b0.has_secure_values) {
                    M0 = i5.c.k(2131743941, null, r.b.m(M0, "\n\n"));
                }
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.U = M0;
                t1Var.S = org.telegram.messenger.hd.M0(2131743939, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751435, null), new mk0(jl0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                jl0Var.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, jl0Var.Z0);
                    return;
                }
                return;
            case 9:
                boolean z12 = !jl0Var.U0;
                jl0Var.U0 = z12;
                jl0Var.M.setChecked(z12);
                return;
            case 10:
                boolean z13 = !jl0Var.V0;
                jl0Var.V0 = z13;
                jl0Var.M.setChecked(z13);
                return;
            case 11:
                boolean z14 = !jl0Var.V0;
                jl0Var.V0 = z14;
                jl0Var.M.setChecked(z14);
                return;
            case 12:
                jl0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.h6[] h6VarArr = jl0Var.h;
                    if (i10 < h6VarArr.length) {
                        org.telegram.ui.Cells.h6 h6Var = h6VarArr[i10];
                        if (intValue == i10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h6Var.a(z10, true);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 13:
                jl0Var.Q.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject u02 = jl0.u0();
                    if (jl0Var.L0 != null && jl0Var.N0 == null) {
                        u02.put("tokenizationSpecification", new ca.g(jl0Var, 2));
                    } else {
                        u02.put("tokenizationSpecification", new ca.g(jl0Var, 4));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(u02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(jl0Var.D0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = jl0Var.H0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    jSONObject.put("totalPrice", jl0Var.x0(arrayList));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(jl0Var.M0)) {
                        jSONObject.put("countryCode", jl0Var.M0);
                    }
                    jSONObject.put("currencyCode", jl0Var.D0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", jl0Var.f48410q0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f60518r = true;
                    q6.m.h(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f60519s = jSONObject2;
                    b9.k0 k0Var = jl0Var.f48393e;
                    k0Var.getClass();
                    com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
                    b10.f6071c = new x9.d(obj);
                    b10.d = new n6.c[]{y8.p.f60531b};
                    b10.f6070b = true;
                    b10.f6069a = 23707;
                    y8.a.a(k0Var.e(1, b10.a()), jl0Var.getParentActivity());
                    return;
                } catch (JSONException e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                jl0Var.f48419w0 = false;
                jl0Var.z0();
                return;
        }
    }
}
