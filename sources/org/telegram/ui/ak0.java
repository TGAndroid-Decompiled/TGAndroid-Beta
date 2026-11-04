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
public final class ak0 implements View.OnClickListener {
    public final int f43792a;
    public final dl0 f43793b;

    public ak0(dl0 dl0Var, int i3) {
        this.f43792a = i3;
        this.f43793b = dl0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i3 = this.f43792a;
        dl0 dl0Var = this.f43793b;
        switch (i3) {
            case 0:
                dl0Var.f44750f[0].requestFocus();
                org.telegram.messenger.g0.K3(dl0Var.f44750f[0]);
                return;
            case 1:
                if (dl0Var.getParentActivity() != null) {
                    dl0Var.M0(null);
                    return;
                }
                return;
            case 2:
                dl0 dl0Var2 = new dl0(dl0Var.f44744c1, dl0Var.D0, dl0Var.O0, dl0Var.P0, 0, dl0Var.F0, dl0Var.H0, dl0Var.I0, null, dl0Var.f44777y0, dl0Var.J0, dl0Var.V0, null, dl0Var.f44768s0, dl0Var.X0);
                dl0Var2.f44746d1 = dl0Var.f44746d1;
                dl0Var2.f44749e1 = dl0Var.f44749e1;
                dl0Var2.U = new lk0(dl0Var);
                dl0Var.presentFragment(dl0Var2);
                return;
            case 3:
                dl0 dl0Var3 = new dl0(dl0Var.f44744c1, dl0Var.D0, dl0Var.O0, dl0Var.P0, 0, dl0Var.F0, dl0Var.H0, dl0Var.I0, null, dl0Var.f44777y0, dl0Var.J0, dl0Var.V0, null, dl0Var.f44768s0, dl0Var.X0);
                dl0Var3.f44746d1 = dl0Var.f44746d1;
                dl0Var3.f44749e1 = dl0Var.f44749e1;
                dl0Var3.U = new mk0(dl0Var);
                dl0Var.presentFragment(dl0Var3);
                return;
            case 4:
                dl0 dl0Var4 = new dl0(dl0Var.f44744c1, dl0Var.D0, dl0Var.O0, dl0Var.P0, 0, dl0Var.F0, dl0Var.H0, dl0Var.I0, null, dl0Var.f44777y0, dl0Var.J0, dl0Var.V0, null, dl0Var.f44768s0, dl0Var.X0);
                dl0Var4.f44746d1 = dl0Var.f44746d1;
                dl0Var4.f44749e1 = dl0Var.f44749e1;
                dl0Var4.U = new nk0(dl0Var);
                dl0Var.presentFragment(dl0Var4);
                return;
            case 5:
                dl0 dl0Var5 = new dl0(dl0Var.f44744c1, dl0Var.D0, dl0Var.O0, dl0Var.P0, 0, dl0Var.F0, dl0Var.H0, dl0Var.I0, null, dl0Var.f44777y0, dl0Var.J0, dl0Var.V0, null, dl0Var.f44768s0, dl0Var.X0);
                dl0Var5.f44746d1 = dl0Var.f44746d1;
                dl0Var5.f44749e1 = dl0Var.f44749e1;
                dl0Var5.U = new ok0(dl0Var);
                dl0Var.presentFragment(dl0Var5);
                return;
            case 6:
                if (!dl0Var.Q0) {
                    boolean z11 = !dl0Var.G;
                    dl0Var.G = z11;
                    dl0Var.W.setChecked(z11);
                    dl0Var.X.a(dl0Var.G, true);
                    return;
                }
                return;
            case 7:
                dl0.e0(dl0Var);
                return;
            case 8:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dl0Var.getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131743950, null);
                if (dl0Var.f44740b0.has_secure_values) {
                    M0 = k2.p1.k(2131743951, null, t4.c.h(M0, "\n\n"));
                }
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.U = M0;
                s1Var.S = org.telegram.messenger.bd.M0(2131743949, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751436, null), new fk0(dl0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                dl0Var.showDialog(s1Var);
                TextView textView = (TextView) s1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, dl0Var.Z0);
                    return;
                }
                return;
            case 9:
                boolean z12 = !dl0Var.U0;
                dl0Var.U0 = z12;
                dl0Var.M.setChecked(z12);
                return;
            case 10:
                boolean z13 = !dl0Var.V0;
                dl0Var.V0 = z13;
                dl0Var.M.setChecked(z13);
                return;
            case 11:
                boolean z14 = !dl0Var.V0;
                dl0Var.V0 = z14;
                dl0Var.M.setChecked(z14);
                return;
            case 12:
                dl0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.h6[] h6VarArr = dl0Var.h;
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
                dl0Var.Q.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject u02 = dl0.u0();
                    if (dl0Var.L0 != null && dl0Var.N0 == null) {
                        u02.put("tokenizationSpecification", new ba.g(dl0Var, 2));
                    } else {
                        u02.put("tokenizationSpecification", new ba.g(dl0Var, 4));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(u02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(dl0Var.D0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = dl0Var.H0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    jSONObject.put("totalPrice", dl0Var.x0(arrayList));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(dl0Var.M0)) {
                        jSONObject.put("countryCode", dl0Var.M0);
                    }
                    jSONObject.put("currencyCode", dl0Var.D0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", dl0Var.f44764q0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f58556r = true;
                    p6.m.h(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f58557s = jSONObject2;
                    a9.j0 j0Var = dl0Var.f44747e;
                    j0Var.getClass();
                    com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                    b10.f6737c = new org.telegram.ui.Components.nh(obj, 29);
                    b10.d = new m6.c[]{x8.p.f58569b};
                    b10.f6736b = true;
                    b10.f6735a = 23707;
                    x8.a.a(j0Var.e(1, b10.a()), dl0Var.getParentActivity());
                    return;
                } catch (JSONException e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                dl0Var.f44773w0 = false;
                dl0Var.z0();
                return;
        }
    }
}
