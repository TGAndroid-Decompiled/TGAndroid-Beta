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
public final class dk0 implements View.OnClickListener {
    public final int f45081a;
    public final hl0 f45082b;

    public dk0(hl0 hl0Var, int i7) {
        this.f45081a = i7;
        this.f45082b = hl0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        int i7 = this.f45081a;
        hl0 hl0Var = this.f45082b;
        switch (i7) {
            case 0:
                hl0Var.f46419f[0].requestFocus();
                org.telegram.messenger.g0.K3(hl0Var.f46419f[0]);
                return;
            case 1:
                if (hl0Var.getParentActivity() != null) {
                    hl0Var.M0(null);
                    return;
                }
                return;
            case 2:
                hl0 hl0Var2 = new hl0(hl0Var.f46410b1, hl0Var.C0, hl0Var.N0, hl0Var.O0, 0, hl0Var.E0, hl0Var.G0, hl0Var.H0, null, hl0Var.f46443x0, hl0Var.I0, hl0Var.U0, null, hl0Var.f46434r0, hl0Var.W0);
                hl0Var2.f46413c1 = hl0Var.f46413c1;
                hl0Var2.f46415d1 = hl0Var.f46415d1;
                hl0Var2.T = new pk0(hl0Var);
                hl0Var.presentFragment(hl0Var2);
                return;
            case 3:
                hl0 hl0Var3 = new hl0(hl0Var.f46410b1, hl0Var.C0, hl0Var.N0, hl0Var.O0, 0, hl0Var.E0, hl0Var.G0, hl0Var.H0, null, hl0Var.f46443x0, hl0Var.I0, hl0Var.U0, null, hl0Var.f46434r0, hl0Var.W0);
                hl0Var3.f46413c1 = hl0Var.f46413c1;
                hl0Var3.f46415d1 = hl0Var.f46415d1;
                hl0Var3.T = new qk0(hl0Var);
                hl0Var.presentFragment(hl0Var3);
                return;
            case 4:
                hl0 hl0Var4 = new hl0(hl0Var.f46410b1, hl0Var.C0, hl0Var.N0, hl0Var.O0, 0, hl0Var.E0, hl0Var.G0, hl0Var.H0, null, hl0Var.f46443x0, hl0Var.I0, hl0Var.U0, null, hl0Var.f46434r0, hl0Var.W0);
                hl0Var4.f46413c1 = hl0Var.f46413c1;
                hl0Var4.f46415d1 = hl0Var.f46415d1;
                hl0Var4.T = new rk0(hl0Var);
                hl0Var.presentFragment(hl0Var4);
                return;
            case 5:
                hl0 hl0Var5 = new hl0(hl0Var.f46410b1, hl0Var.C0, hl0Var.N0, hl0Var.O0, 0, hl0Var.E0, hl0Var.G0, hl0Var.H0, null, hl0Var.f46443x0, hl0Var.I0, hl0Var.U0, null, hl0Var.f46434r0, hl0Var.W0);
                hl0Var5.f46413c1 = hl0Var.f46413c1;
                hl0Var5.f46415d1 = hl0Var.f46415d1;
                hl0Var5.T = new sk0(hl0Var);
                hl0Var.presentFragment(hl0Var5);
                return;
            case 6:
                if (!hl0Var.P0) {
                    boolean z10 = !hl0Var.F;
                    hl0Var.F = z10;
                    hl0Var.V.setChecked(z10);
                    hl0Var.W.a(hl0Var.F, true);
                    return;
                }
                return;
            case 7:
                hl0.e0(hl0Var);
                return;
            case 8:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hl0Var.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131743943, null);
                if (hl0Var.f46406a0.has_secure_values) {
                    M0 = jg.g.l(2131743944, null, rf.b.j(M0, "\n\n"));
                }
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.T = M0;
                u1Var.R = org.telegram.messenger.id.M0(2131743942, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751436, null), new jk0(hl0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                hl0Var.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28093q7, hl0Var.Y0);
                    return;
                }
                return;
            case 9:
                boolean z11 = !hl0Var.T0;
                hl0Var.T0 = z11;
                hl0Var.L.setChecked(z11);
                return;
            case 10:
                boolean z12 = !hl0Var.U0;
                hl0Var.U0 = z12;
                hl0Var.L.setChecked(z12);
                return;
            case 11:
                boolean z13 = !hl0Var.U0;
                hl0Var.U0 = z13;
                hl0Var.L.setChecked(z13);
                return;
            case 12:
                hl0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.i6[] i6VarArr = hl0Var.h;
                    if (i10 < i6VarArr.length) {
                        org.telegram.ui.Cells.i6 i6Var = i6VarArr[i10];
                        if (intValue == i10) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        i6Var.a(z9, true);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 13:
                hl0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject u02 = hl0.u0();
                    if (hl0Var.K0 != null && hl0Var.M0 == null) {
                        u02.put("tokenizationSpecification", new ca.g(hl0Var, 2));
                    } else {
                        u02.put("tokenizationSpecification", new ca.g(hl0Var, 4));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(u02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(hl0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = hl0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    jSONObject.put("totalPrice", hl0Var.x0(arrayList));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(hl0Var.L0)) {
                        jSONObject.put("countryCode", hl0Var.L0);
                    }
                    jSONObject.put("currencyCode", hl0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", hl0Var.f46431p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f59299r = true;
                    q6.m.h(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f59300s = jSONObject2;
                    b9.j0 j0Var = hl0Var.f46416e;
                    j0Var.getClass();
                    com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                    b10.f6682c = new org.telegram.ui.Components.vy((Object) obj, 29);
                    b10.d = new n6.c[]{y8.p.f59312b};
                    b10.f6681b = true;
                    b10.f6680a = 23707;
                    y8.a.a(j0Var.e(1, b10.a()), hl0Var.getParentActivity());
                    return;
                } catch (JSONException e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                hl0Var.f46439v0 = false;
                hl0Var.z0();
                return;
        }
    }
}
