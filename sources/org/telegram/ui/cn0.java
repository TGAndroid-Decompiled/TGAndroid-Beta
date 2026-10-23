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
public final class cn0 implements View.OnClickListener {
    public final int f36405a;
    public final io0 f36406b;

    public cn0(io0 io0Var, int i10) {
        this.f36405a = i10;
        this.f36406b = io0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f36405a;
        io0 io0Var = this.f36406b;
        switch (i10) {
            case 0:
                if (io0Var.getParentActivity() != null) {
                    io0Var.G0(null);
                    return;
                }
                return;
            case 1:
                io0 io0Var2 = new io0(io0Var.f38292b1, io0Var.C0, io0Var.N0, io0Var.O0, 0, io0Var.E0, io0Var.G0, io0Var.H0, null, io0Var.f38324x0, io0Var.I0, io0Var.U0, null, io0Var.f38315r0, io0Var.W0);
                io0Var2.f38295c1 = io0Var.f38295c1;
                io0Var2.f38297d1 = io0Var.f38297d1;
                io0Var2.T = new nn0(io0Var);
                io0Var.presentFragment(io0Var2);
                return;
            case 2:
                io0 io0Var3 = new io0(io0Var.f38292b1, io0Var.C0, io0Var.N0, io0Var.O0, 0, io0Var.E0, io0Var.G0, io0Var.H0, null, io0Var.f38324x0, io0Var.I0, io0Var.U0, null, io0Var.f38315r0, io0Var.W0);
                io0Var3.f38295c1 = io0Var.f38295c1;
                io0Var3.f38297d1 = io0Var.f38297d1;
                io0Var3.T = new on0(io0Var);
                io0Var.presentFragment(io0Var3);
                return;
            case 3:
                io0 io0Var4 = new io0(io0Var.f38292b1, io0Var.C0, io0Var.N0, io0Var.O0, 0, io0Var.E0, io0Var.G0, io0Var.H0, null, io0Var.f38324x0, io0Var.I0, io0Var.U0, null, io0Var.f38315r0, io0Var.W0);
                io0Var4.f38295c1 = io0Var.f38295c1;
                io0Var4.f38297d1 = io0Var.f38297d1;
                io0Var4.T = new pn0(io0Var);
                io0Var.presentFragment(io0Var4);
                return;
            case 4:
                io0 io0Var5 = new io0(io0Var.f38292b1, io0Var.C0, io0Var.N0, io0Var.O0, 0, io0Var.E0, io0Var.G0, io0Var.H0, null, io0Var.f38324x0, io0Var.I0, io0Var.U0, null, io0Var.f38315r0, io0Var.W0);
                io0Var5.f38295c1 = io0Var.f38295c1;
                io0Var5.f38297d1 = io0Var.f38297d1;
                io0Var5.T = new qn0(io0Var);
                io0Var.presentFragment(io0Var5);
                return;
            case 5:
                if (!io0Var.P0) {
                    boolean z11 = !io0Var.F;
                    io0Var.F = z11;
                    io0Var.V.setChecked(z11);
                    io0Var.W.a(io0Var.F, true);
                    return;
                }
                return;
            case 6:
                io0.Z(io0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(io0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (io0Var.f38288a0.has_secure_values) {
                    string = org.telegram.messenger.v0.h(R.string.TurnPasswordOffPassport, si.o0.i(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                c2Var.T = string;
                c2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new gn0(io0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                io0Var.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, io0Var.Y0);
                    return;
                }
                return;
            case 8:
                boolean z12 = !io0Var.T0;
                io0Var.T0 = z12;
                io0Var.L.setChecked(z12);
                return;
            case 9:
                boolean z13 = !io0Var.U0;
                io0Var.U0 = z13;
                io0Var.L.setChecked(z13);
                return;
            case 10:
                boolean z14 = !io0Var.U0;
                io0Var.U0 = z14;
                io0Var.L.setChecked(z14);
                return;
            case 11:
                io0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = io0Var.h;
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
                io0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = io0.p0();
                    if (io0Var.K0 != null && io0Var.M0 == null) {
                        p02.put("tokenizationSpecification", new vn0(io0Var, 1));
                    } else {
                        p02.put("tokenizationSpecification", new vn0(io0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(io0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = io0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, io0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(io0Var.L0)) {
                        jSONObject.put("countryCode", io0Var.L0);
                    }
                    jSONObject.put("currencyCode", io0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", io0Var.f38312p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f48734r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f48735s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = io0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
                    b10.f6509c = new k2.w0((Object) obj, 27);
                    b10.d = new k6.c[]{v8.p.f48746b};
                    b10.f6508b = true;
                    b10.f6507a = 23707;
                    v8.a.a(v0Var.e(1, b10.a()), io0Var.getParentActivity());
                    return;
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                io0Var.f38320v0 = false;
                io0Var.t0();
                return;
            default:
                io0Var.f38300f[0].requestFocus();
                AndroidUtilities.showKeyboard(io0Var.f38300f[0]);
                return;
        }
    }
}
