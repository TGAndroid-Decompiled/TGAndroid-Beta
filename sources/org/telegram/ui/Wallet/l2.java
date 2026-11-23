package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class l2 {
    public final long f44606a;
    public final List f44607b;
    public final long f44608c;

    public l2(JSONObject jSONObject) {
        boolean z10;
        long optLong = jSONObject.optLong("valid_until", 0L);
        this.f44606a = optLong;
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() != 0 && jSONArray.length() <= 255 && optLong >= 0) {
            ArrayList arrayList = new ArrayList();
            long j3 = 0;
            int i7 = 0;
            while (i7 < jSONArray.length()) {
                k2 k2Var = new k2(jSONArray.getJSONObject(i7));
                long j10 = k2Var.f44559e;
                long j11 = j3 + j10;
                if ((j10 ^ j3) < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 | ((j3 ^ j11) >= 0)) {
                    arrayList.add(k2Var);
                    i7++;
                    j3 = j11;
                } else {
                    throw new ArithmeticException();
                }
            }
            this.f44608c = j3;
            this.f44607b = DesugarCollections.unmodifiableList(arrayList);
            return;
        }
        throw new JSONException("Invalid transaction");
    }

    public final String[] a() {
        String str;
        List list = this.f44607b;
        String[] strArr = new String[list.size() * 5];
        for (int i7 = 0; i7 < list.size(); i7++) {
            k2 k2Var = (k2) list.get(i7);
            int i10 = i7 * 5;
            strArr[i10] = k2Var.f44556a;
            strArr[i10 + 1] = Long.toString(k2Var.f44559e);
            strArr[i10 + 2] = k2Var.f44557b;
            strArr[i10 + 3] = k2Var.f44558c;
            int i11 = i10 + 4;
            if (k2Var.f44560f) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[i11] = str;
        }
        return strArr;
    }
}
