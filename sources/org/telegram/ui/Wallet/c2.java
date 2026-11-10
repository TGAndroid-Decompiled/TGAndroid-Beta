package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class c2 {
    public final long f42209a;
    public final List f42210b;
    public final long f42211c;

    public c2(JSONObject jSONObject) {
        boolean z9;
        long optLong = jSONObject.optLong("valid_until", 0L);
        this.f42209a = optLong;
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() != 0 && jSONArray.length() <= 255 && optLong >= 0) {
            ArrayList arrayList = new ArrayList();
            long j3 = 0;
            int i7 = 0;
            while (i7 < jSONArray.length()) {
                b2 b2Var = new b2(jSONArray.getJSONObject(i7));
                long j10 = b2Var.f42170e;
                long j11 = j3 + j10;
                if ((j10 ^ j3) < 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 | ((j3 ^ j11) >= 0)) {
                    arrayList.add(b2Var);
                    i7++;
                    j3 = j11;
                } else {
                    throw new ArithmeticException();
                }
            }
            this.f42211c = j3;
            this.f42210b = DesugarCollections.unmodifiableList(arrayList);
            return;
        }
        throw new JSONException("Invalid transaction");
    }

    public final String[] a() {
        String str;
        List list = this.f42210b;
        String[] strArr = new String[list.size() * 5];
        for (int i7 = 0; i7 < list.size(); i7++) {
            b2 b2Var = (b2) list.get(i7);
            int i10 = i7 * 5;
            strArr[i10] = b2Var.f42167a;
            strArr[i10 + 1] = Long.toString(b2Var.f42170e);
            strArr[i10 + 2] = b2Var.f42168b;
            strArr[i10 + 3] = b2Var.f42169c;
            int i11 = i10 + 4;
            if (b2Var.f42171f) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[i11] = str;
        }
        return strArr;
    }
}
