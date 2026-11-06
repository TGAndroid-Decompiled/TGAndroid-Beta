package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class e2 {
    public final long f42414a;
    public final List f42415b;
    public final long f42416c;

    public e2(JSONObject jSONObject) {
        boolean z9;
        long optLong = jSONObject.optLong("valid_until", 0L);
        this.f42414a = optLong;
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() != 0 && jSONArray.length() <= 255 && optLong >= 0) {
            ArrayList arrayList = new ArrayList();
            long j3 = 0;
            int i7 = 0;
            while (i7 < jSONArray.length()) {
                d2 d2Var = new d2(jSONArray.getJSONObject(i7));
                long j10 = d2Var.f42328e;
                long j11 = j3 + j10;
                if ((j10 ^ j3) < 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 | ((j3 ^ j11) >= 0)) {
                    arrayList.add(d2Var);
                    i7++;
                    j3 = j11;
                } else {
                    throw new ArithmeticException();
                }
            }
            this.f42416c = j3;
            this.f42415b = DesugarCollections.unmodifiableList(arrayList);
            return;
        }
        throw new JSONException("Invalid transaction");
    }

    public final String[] a() {
        String str;
        List list = this.f42415b;
        String[] strArr = new String[list.size() * 5];
        for (int i7 = 0; i7 < list.size(); i7++) {
            d2 d2Var = (d2) list.get(i7);
            int i10 = i7 * 5;
            strArr[i10] = d2Var.f42325a;
            strArr[i10 + 1] = Long.toString(d2Var.f42328e);
            strArr[i10 + 2] = d2Var.f42326b;
            strArr[i10 + 3] = d2Var.f42327c;
            int i11 = i10 + 4;
            if (d2Var.f42329f) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[i11] = str;
        }
        return strArr;
    }
}
