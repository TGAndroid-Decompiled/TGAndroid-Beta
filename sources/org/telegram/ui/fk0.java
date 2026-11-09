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
public final class fk0 implements View.OnClickListener {
    public final int f45735a;
    public final jl0 f45736b;

    public fk0(jl0 jl0Var, int i7) {
        this.f45735a = i7;
        this.f45736b = jl0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        int i7 = this.f45735a;
        jl0 jl0Var = this.f45736b;
        switch (i7) {
            case 0:
                jl0Var.f47007f[0].requestFocus();
                org.telegram.messenger.g0.K3(jl0Var.f47007f[0]);
                return;
            case 1:
                if (jl0Var.getParentActivity() != null) {
                    jl0Var.M0(null);
                    return;
                }
                return;
            case 2:
                jl0 jl0Var2 = new jl0(jl0Var.f46998b1, jl0Var.C0, jl0Var.N0, jl0Var.O0, 0, jl0Var.E0, jl0Var.G0, jl0Var.H0, null, jl0Var.f47031x0, jl0Var.I0, jl0Var.U0, null, jl0Var.f47022r0, jl0Var.W0);
                jl0Var2.f47001c1 = jl0Var.f47001c1;
                jl0Var2.f47003d1 = jl0Var.f47003d1;
                jl0Var2.T = new rk0(jl0Var);
                jl0Var.presentFragment(jl0Var2);
                return;
            case 3:
                jl0 jl0Var3 = new jl0(jl0Var.f46998b1, jl0Var.C0, jl0Var.N0, jl0Var.O0, 0, jl0Var.E0, jl0Var.G0, jl0Var.H0, null, jl0Var.f47031x0, jl0Var.I0, jl0Var.U0, null, jl0Var.f47022r0, jl0Var.W0);
                jl0Var3.f47001c1 = jl0Var.f47001c1;
                jl0Var3.f47003d1 = jl0Var.f47003d1;
                jl0Var3.T = new sk0(jl0Var);
                jl0Var.presentFragment(jl0Var3);
                return;
            case 4:
                jl0 jl0Var4 = new jl0(jl0Var.f46998b1, jl0Var.C0, jl0Var.N0, jl0Var.O0, 0, jl0Var.E0, jl0Var.G0, jl0Var.H0, null, jl0Var.f47031x0, jl0Var.I0, jl0Var.U0, null, jl0Var.f47022r0, jl0Var.W0);
                jl0Var4.f47001c1 = jl0Var.f47001c1;
                jl0Var4.f47003d1 = jl0Var.f47003d1;
                jl0Var4.T = new tk0(jl0Var);
                jl0Var.presentFragment(jl0Var4);
                return;
            case 5:
                jl0 jl0Var5 = new jl0(jl0Var.f46998b1, jl0Var.C0, jl0Var.N0, jl0Var.O0, 0, jl0Var.E0, jl0Var.G0, jl0Var.H0, null, jl0Var.f47031x0, jl0Var.I0, jl0Var.U0, null, jl0Var.f47022r0, jl0Var.W0);
                jl0Var5.f47001c1 = jl0Var.f47001c1;
                jl0Var5.f47003d1 = jl0Var.f47003d1;
                jl0Var5.T = new uk0(jl0Var);
                jl0Var.presentFragment(jl0Var5);
                return;
            case 6:
                if (!jl0Var.P0) {
                    boolean z10 = !jl0Var.F;
                    jl0Var.F = z10;
                    jl0Var.V.setChecked(z10);
                    jl0Var.W.a(jl0Var.F, true);
                    return;
                }
                return;
            case 7:
                jl0.e0(jl0Var);
                return;
            case 8:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jl0Var.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131743940, null);
                if (jl0Var.f46994a0.has_secure_values) {
                    M0 = jg.g.l(2131743941, null, rf.b.j(M0, "\n\n"));
                }
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.T = M0;
                u1Var.R = org.telegram.messenger.id.M0(2131743939, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751435, null), new lk0(jl0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                jl0Var.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, jl0Var.Y0);
                    return;
                }
                return;
            case 9:
                boolean z11 = !jl0Var.T0;
                jl0Var.T0 = z11;
                jl0Var.L.setChecked(z11);
                return;
            case 10:
                boolean z12 = !jl0Var.U0;
                jl0Var.U0 = z12;
                jl0Var.L.setChecked(z12);
                return;
            case 11:
                boolean z13 = !jl0Var.U0;
                jl0Var.U0 = z13;
                jl0Var.L.setChecked(z13);
                return;
            case 12:
                jl0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.i6[] i6VarArr = jl0Var.h;
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
                jl0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject u02 = jl0.u0();
                    if (jl0Var.K0 != null && jl0Var.M0 == null) {
                        u02.put("tokenizationSpecification", new ca.g(jl0Var, 2));
                    } else {
                        u02.put("tokenizationSpecification", new ca.g(jl0Var, 4));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(u02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(jl0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = jl0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    jSONObject.put("totalPrice", jl0Var.x0(arrayList));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(jl0Var.L0)) {
                        jSONObject.put("countryCode", jl0Var.L0);
                    }
                    jSONObject.put("currencyCode", jl0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", jl0Var.f47019p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f59309r = true;
                    q6.m.h(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f59310s = jSONObject2;
                    b9.j0 j0Var = jl0Var.f47004e;
                    j0Var.getClass();
                    com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                    b10.f6680c = new org.telegram.ui.Components.vy((Object) obj, 29);
                    b10.d = new n6.c[]{y8.p.f59322b};
                    b10.f6679b = true;
                    b10.f6678a = 23707;
                    y8.a.a(j0Var.e(1, b10.a()), jl0Var.getParentActivity());
                    return;
                } catch (JSONException e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                jl0Var.f47027v0 = false;
                jl0Var.z0();
                return;
        }
    }
}
