package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class d2 {
    public final long f42384a;
    public final List f42385b;
    public final long f42386c;

    public d2(JSONObject jSONObject) {
        boolean z9;
        long optLong = jSONObject.optLong("valid_until", 0L);
        this.f42384a = optLong;
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() != 0 && jSONArray.length() <= 255 && optLong >= 0) {
            ArrayList arrayList = new ArrayList();
            long j3 = 0;
            int i7 = 0;
            while (i7 < jSONArray.length()) {
                c2 c2Var = new c2(jSONArray.getJSONObject(i7));
                long j10 = c2Var.f42299e;
                long j11 = j3 + j10;
                if ((j10 ^ j3) < 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 | ((j3 ^ j11) >= 0)) {
                    arrayList.add(c2Var);
                    i7++;
                    j3 = j11;
                } else {
                    throw new ArithmeticException();
                }
            }
            this.f42386c = j3;
            this.f42385b = DesugarCollections.unmodifiableList(arrayList);
            return;
        }
        throw new JSONException("Invalid transaction");
    }

    public final String[] a() {
        String str;
        List list = this.f42385b;
        String[] strArr = new String[list.size() * 5];
        for (int i7 = 0; i7 < list.size(); i7++) {
            c2 c2Var = (c2) list.get(i7);
            int i10 = i7 * 5;
            strArr[i10] = c2Var.f42296a;
            strArr[i10 + 1] = Long.toString(c2Var.f42299e);
            strArr[i10 + 2] = c2Var.f42297b;
            strArr[i10 + 3] = c2Var.f42298c;
            int i11 = i10 + 4;
            if (c2Var.f42300f) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[i11] = str;
        }
        return strArr;
    }
}
