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
    public final int f46109a;
    public final kl0 f46110b;

    public gk0(kl0 kl0Var, int i7) {
        this.f46109a = i7;
        this.f46110b = kl0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        int i7 = this.f46109a;
        kl0 kl0Var = this.f46110b;
        switch (i7) {
            case 0:
                kl0Var.f47339f[0].requestFocus();
                org.telegram.messenger.g0.K3(kl0Var.f47339f[0]);
                return;
            case 1:
                if (kl0Var.getParentActivity() != null) {
                    kl0Var.M0(null);
                    return;
                }
                return;
            case 2:
                kl0 kl0Var2 = new kl0(kl0Var.f47330b1, kl0Var.C0, kl0Var.N0, kl0Var.O0, 0, kl0Var.E0, kl0Var.G0, kl0Var.H0, null, kl0Var.f47363x0, kl0Var.I0, kl0Var.U0, null, kl0Var.f47354r0, kl0Var.W0);
                kl0Var2.f47333c1 = kl0Var.f47333c1;
                kl0Var2.f47335d1 = kl0Var.f47335d1;
                kl0Var2.T = new sk0(kl0Var);
                kl0Var.presentFragment(kl0Var2);
                return;
            case 3:
                kl0 kl0Var3 = new kl0(kl0Var.f47330b1, kl0Var.C0, kl0Var.N0, kl0Var.O0, 0, kl0Var.E0, kl0Var.G0, kl0Var.H0, null, kl0Var.f47363x0, kl0Var.I0, kl0Var.U0, null, kl0Var.f47354r0, kl0Var.W0);
                kl0Var3.f47333c1 = kl0Var.f47333c1;
                kl0Var3.f47335d1 = kl0Var.f47335d1;
                kl0Var3.T = new tk0(kl0Var);
                kl0Var.presentFragment(kl0Var3);
                return;
            case 4:
                kl0 kl0Var4 = new kl0(kl0Var.f47330b1, kl0Var.C0, kl0Var.N0, kl0Var.O0, 0, kl0Var.E0, kl0Var.G0, kl0Var.H0, null, kl0Var.f47363x0, kl0Var.I0, kl0Var.U0, null, kl0Var.f47354r0, kl0Var.W0);
                kl0Var4.f47333c1 = kl0Var.f47333c1;
                kl0Var4.f47335d1 = kl0Var.f47335d1;
                kl0Var4.T = new uk0(kl0Var);
                kl0Var.presentFragment(kl0Var4);
                return;
            case 5:
                kl0 kl0Var5 = new kl0(kl0Var.f47330b1, kl0Var.C0, kl0Var.N0, kl0Var.O0, 0, kl0Var.E0, kl0Var.G0, kl0Var.H0, null, kl0Var.f47363x0, kl0Var.I0, kl0Var.U0, null, kl0Var.f47354r0, kl0Var.W0);
                kl0Var5.f47333c1 = kl0Var.f47333c1;
                kl0Var5.f47335d1 = kl0Var.f47335d1;
                kl0Var5.T = new vk0(kl0Var);
                kl0Var.presentFragment(kl0Var5);
                return;
            case 6:
                if (!kl0Var.P0) {
                    boolean z10 = !kl0Var.F;
                    kl0Var.F = z10;
                    kl0Var.V.setChecked(z10);
                    kl0Var.W.a(kl0Var.F, true);
                    return;
                }
                return;
            case 7:
                kl0.e0(kl0Var);
                return;
            case 8:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kl0Var.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131743940, null);
                if (kl0Var.f47326a0.has_secure_values) {
                    M0 = jg.g.l(2131743941, null, rf.b.j(M0, "\n\n"));
                }
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.T = M0;
                u1Var.R = org.telegram.messenger.id.M0(2131743939, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751435, null), new mk0(kl0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                kl0Var.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, kl0Var.Y0);
                    return;
                }
                return;
            case 9:
                boolean z11 = !kl0Var.T0;
                kl0Var.T0 = z11;
                kl0Var.L.setChecked(z11);
                return;
            case 10:
                boolean z12 = !kl0Var.U0;
                kl0Var.U0 = z12;
                kl0Var.L.setChecked(z12);
                return;
            case 11:
                boolean z13 = !kl0Var.U0;
                kl0Var.U0 = z13;
                kl0Var.L.setChecked(z13);
                return;
            case 12:
                kl0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.i6[] i6VarArr = kl0Var.h;
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
                kl0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject u02 = kl0.u0();
                    if (kl0Var.K0 != null && kl0Var.M0 == null) {
                        u02.put("tokenizationSpecification", new ca.g(kl0Var, 2));
                    } else {
                        u02.put("tokenizationSpecification", new ca.g(kl0Var, 4));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(u02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(kl0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = kl0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    jSONObject.put("totalPrice", kl0Var.x0(arrayList));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(kl0Var.L0)) {
                        jSONObject.put("countryCode", kl0Var.L0);
                    }
                    jSONObject.put("currencyCode", kl0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", kl0Var.f47351p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f59307r = true;
                    q6.m.h(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f59308s = jSONObject2;
                    b9.j0 j0Var = kl0Var.f47336e;
                    j0Var.getClass();
                    com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                    b10.f6685c = new org.telegram.ui.Components.uy((Object) obj, 29);
                    b10.d = new n6.c[]{y8.p.f59320b};
                    b10.f6684b = true;
                    b10.f6683a = 23707;
                    y8.a.a(j0Var.e(1, b10.a()), kl0Var.getParentActivity());
                    return;
                } catch (JSONException e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                kl0Var.f47359v0 = false;
                kl0Var.z0();
                return;
        }
    }
}
