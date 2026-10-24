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
public final class bn0 implements View.OnClickListener {
    public final int f36113a;
    public final ho0 f36114b;

    public bn0(ho0 ho0Var, int i10) {
        this.f36113a = i10;
        this.f36114b = ho0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f36113a;
        ho0 ho0Var = this.f36114b;
        switch (i10) {
            case 0:
                if (ho0Var.getParentActivity() != null) {
                    ho0Var.G0(null);
                    return;
                }
                return;
            case 1:
                ho0 ho0Var2 = new ho0(ho0Var.f37919b1, ho0Var.C0, ho0Var.N0, ho0Var.O0, 0, ho0Var.E0, ho0Var.G0, ho0Var.H0, null, ho0Var.f37951x0, ho0Var.I0, ho0Var.U0, null, ho0Var.f37942r0, ho0Var.W0);
                ho0Var2.f37922c1 = ho0Var.f37922c1;
                ho0Var2.f37924d1 = ho0Var.f37924d1;
                ho0Var2.T = new mn0(ho0Var);
                ho0Var.presentFragment(ho0Var2);
                return;
            case 2:
                ho0 ho0Var3 = new ho0(ho0Var.f37919b1, ho0Var.C0, ho0Var.N0, ho0Var.O0, 0, ho0Var.E0, ho0Var.G0, ho0Var.H0, null, ho0Var.f37951x0, ho0Var.I0, ho0Var.U0, null, ho0Var.f37942r0, ho0Var.W0);
                ho0Var3.f37922c1 = ho0Var.f37922c1;
                ho0Var3.f37924d1 = ho0Var.f37924d1;
                ho0Var3.T = new nn0(ho0Var);
                ho0Var.presentFragment(ho0Var3);
                return;
            case 3:
                ho0 ho0Var4 = new ho0(ho0Var.f37919b1, ho0Var.C0, ho0Var.N0, ho0Var.O0, 0, ho0Var.E0, ho0Var.G0, ho0Var.H0, null, ho0Var.f37951x0, ho0Var.I0, ho0Var.U0, null, ho0Var.f37942r0, ho0Var.W0);
                ho0Var4.f37922c1 = ho0Var.f37922c1;
                ho0Var4.f37924d1 = ho0Var.f37924d1;
                ho0Var4.T = new on0(ho0Var);
                ho0Var.presentFragment(ho0Var4);
                return;
            case 4:
                ho0 ho0Var5 = new ho0(ho0Var.f37919b1, ho0Var.C0, ho0Var.N0, ho0Var.O0, 0, ho0Var.E0, ho0Var.G0, ho0Var.H0, null, ho0Var.f37951x0, ho0Var.I0, ho0Var.U0, null, ho0Var.f37942r0, ho0Var.W0);
                ho0Var5.f37922c1 = ho0Var.f37922c1;
                ho0Var5.f37924d1 = ho0Var.f37924d1;
                ho0Var5.T = new pn0(ho0Var);
                ho0Var.presentFragment(ho0Var5);
                return;
            case 5:
                if (!ho0Var.P0) {
                    boolean z11 = !ho0Var.F;
                    ho0Var.F = z11;
                    ho0Var.V.setChecked(z11);
                    ho0Var.W.a(ho0Var.F, true);
                    return;
                }
                return;
            case 6:
                ho0.Z(ho0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ho0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (ho0Var.f37915a0.has_secure_values) {
                    string = org.telegram.messenger.v0.h(R.string.TurnPasswordOffPassport, si.o0.i(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.T = string;
                c2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new fn0(ho0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ho0Var.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, ho0Var.Y0);
                    return;
                }
                return;
            case 8:
                boolean z12 = !ho0Var.T0;
                ho0Var.T0 = z12;
                ho0Var.L.setChecked(z12);
                return;
            case 9:
                boolean z13 = !ho0Var.U0;
                ho0Var.U0 = z13;
                ho0Var.L.setChecked(z13);
                return;
            case 10:
                boolean z14 = !ho0Var.U0;
                ho0Var.U0 = z14;
                ho0Var.L.setChecked(z14);
                return;
            case 11:
                ho0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = ho0Var.h;
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
                ho0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = ho0.p0();
                    if (ho0Var.K0 != null && ho0Var.M0 == null) {
                        p02.put("tokenizationSpecification", new un0(ho0Var, 1));
                    } else {
                        p02.put("tokenizationSpecification", new un0(ho0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(ho0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = ho0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, ho0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(ho0Var.L0)) {
                        jSONObject.put("countryCode", ho0Var.L0);
                    }
                    jSONObject.put("currencyCode", ho0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", ho0Var.f37939p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f48733r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f48734s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = ho0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
                    b10.f6509c = new k2.w0((Object) obj, 27);
                    b10.d = new k6.c[]{v8.p.f48745b};
                    b10.f6508b = true;
                    b10.f6507a = 23707;
                    v8.a.a(v0Var.e(1, b10.a()), ho0Var.getParentActivity());
                    return;
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                ho0Var.f37947v0 = false;
                ho0Var.t0();
                return;
            default:
                ho0Var.f37927f[0].requestFocus();
                AndroidUtilities.showKeyboard(ho0Var.f37927f[0]);
                return;
        }
    }
}
