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
public final class jk0 implements View.OnClickListener {
    public final int f48998a;
    public final ml0 f48999b;

    public jk0(ml0 ml0Var, int i7) {
        this.f48998a = i7;
        this.f48999b = ml0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i7 = this.f48998a;
        ml0 ml0Var = this.f48999b;
        switch (i7) {
            case 0:
                ml0Var.f49893f[0].requestFocus();
                org.telegram.messenger.g0.I3(ml0Var.f49893f[0]);
                return;
            case 1:
                if (ml0Var.getParentActivity() != null) {
                    ml0Var.M0(null);
                    return;
                }
                return;
            case 2:
                ml0 ml0Var2 = new ml0(ml0Var.f49887c1, ml0Var.D0, ml0Var.O0, ml0Var.P0, 0, ml0Var.F0, ml0Var.H0, ml0Var.I0, null, ml0Var.f49920y0, ml0Var.J0, ml0Var.V0, null, ml0Var.f49911s0, ml0Var.X0);
                ml0Var2.f49889d1 = ml0Var.f49889d1;
                ml0Var2.f49892e1 = ml0Var.f49892e1;
                ml0Var2.U = new uk0(ml0Var);
                ml0Var.presentFragment(ml0Var2);
                return;
            case 3:
                ml0 ml0Var3 = new ml0(ml0Var.f49887c1, ml0Var.D0, ml0Var.O0, ml0Var.P0, 0, ml0Var.F0, ml0Var.H0, ml0Var.I0, null, ml0Var.f49920y0, ml0Var.J0, ml0Var.V0, null, ml0Var.f49911s0, ml0Var.X0);
                ml0Var3.f49889d1 = ml0Var.f49889d1;
                ml0Var3.f49892e1 = ml0Var.f49892e1;
                ml0Var3.U = new vk0(ml0Var);
                ml0Var.presentFragment(ml0Var3);
                return;
            case 4:
                ml0 ml0Var4 = new ml0(ml0Var.f49887c1, ml0Var.D0, ml0Var.O0, ml0Var.P0, 0, ml0Var.F0, ml0Var.H0, ml0Var.I0, null, ml0Var.f49920y0, ml0Var.J0, ml0Var.V0, null, ml0Var.f49911s0, ml0Var.X0);
                ml0Var4.f49889d1 = ml0Var.f49889d1;
                ml0Var4.f49892e1 = ml0Var.f49892e1;
                ml0Var4.U = new wk0(ml0Var);
                ml0Var.presentFragment(ml0Var4);
                return;
            case 5:
                ml0 ml0Var5 = new ml0(ml0Var.f49887c1, ml0Var.D0, ml0Var.O0, ml0Var.P0, 0, ml0Var.F0, ml0Var.H0, ml0Var.I0, null, ml0Var.f49920y0, ml0Var.J0, ml0Var.V0, null, ml0Var.f49911s0, ml0Var.X0);
                ml0Var5.f49889d1 = ml0Var.f49889d1;
                ml0Var5.f49892e1 = ml0Var.f49892e1;
                ml0Var5.U = new xk0(ml0Var);
                ml0Var.presentFragment(ml0Var5);
                return;
            case 6:
                if (!ml0Var.Q0) {
                    boolean z11 = !ml0Var.G;
                    ml0Var.G = z11;
                    ml0Var.W.setChecked(z11);
                    ml0Var.X.a(ml0Var.G, true);
                    return;
                }
                return;
            case 7:
                ml0.e0(ml0Var);
                return;
            case 8:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ml0Var.getParentActivity());
                String M0 = org.telegram.messenger.gd.M0(2131743703, null);
                if (ml0Var.f49883b0.has_secure_values) {
                    M0 = i5.c.k(2131743704, null, p5.c.n(M0, "\n\n"));
                }
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.U = M0;
                u1Var.S = org.telegram.messenger.gd.M0(2131743702, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751424, null), new pk0(ml0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                ml0Var.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, ml0Var.Z0);
                    return;
                }
                return;
            case 9:
                boolean z12 = !ml0Var.U0;
                ml0Var.U0 = z12;
                ml0Var.M.setChecked(z12);
                return;
            case 10:
                boolean z13 = !ml0Var.V0;
                ml0Var.V0 = z13;
                ml0Var.M.setChecked(z13);
                return;
            case 11:
                boolean z14 = !ml0Var.V0;
                ml0Var.V0 = z14;
                ml0Var.M.setChecked(z14);
                return;
            case 12:
                ml0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.i6[] i6VarArr = ml0Var.h;
                    if (i10 < i6VarArr.length) {
                        org.telegram.ui.Cells.i6 i6Var = i6VarArr[i10];
                        if (intValue == i10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i6Var.a(z10, true);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 13:
                ml0Var.Q.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject u02 = ml0.u0();
                    if (ml0Var.L0 != null && ml0Var.N0 == null) {
                        u02.put("tokenizationSpecification", new ca.g(ml0Var, 2));
                    } else {
                        u02.put("tokenizationSpecification", new ca.g(ml0Var, 4));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(u02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(ml0Var.D0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = ml0Var.H0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    jSONObject.put("totalPrice", ml0Var.x0(arrayList));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(ml0Var.M0)) {
                        jSONObject.put("countryCode", ml0Var.M0);
                    }
                    jSONObject.put("currencyCode", ml0Var.D0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", ml0Var.f49907q0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f61083r = true;
                    q6.m.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f61084s = jSONObject2;
                    b9.k0 k0Var = ml0Var.f49890e;
                    k0Var.getClass();
                    com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
                    b10.f6357c = new v4.f0(obj);
                    b10.d = new n6.c[]{y8.p.f61096b};
                    b10.f6356b = true;
                    b10.f6355a = 23707;
                    y8.a.a(k0Var.e(1, b10.a()), ml0Var.getParentActivity());
                    return;
                } catch (JSONException e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                ml0Var.f49916w0 = false;
                ml0Var.z0();
                return;
        }
    }
}
