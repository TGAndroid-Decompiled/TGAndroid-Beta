package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class c2 {
    public final long f34717a;
    public final List f34718b;
    public final long f34719c;

    public c2(JSONObject jSONObject) {
        boolean z10;
        long optLong = jSONObject.optLong("valid_until", 0L);
        this.f34717a = optLong;
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() != 0 && jSONArray.length() <= 255 && optLong >= 0) {
            ArrayList arrayList = new ArrayList();
            long j3 = 0;
            int i10 = 0;
            while (i10 < jSONArray.length()) {
                b2 b2Var = new b2(jSONArray.getJSONObject(i10));
                long j10 = b2Var.f34675e;
                long j11 = j3 + j10;
                if ((j10 ^ j3) < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 | ((j3 ^ j11) >= 0)) {
                    arrayList.add(b2Var);
                    i10++;
                    j3 = j11;
                } else {
                    throw new ArithmeticException();
                }
            }
            this.f34719c = j3;
            this.f34718b = DesugarCollections.unmodifiableList(arrayList);
            return;
        }
        throw new JSONException("Invalid transaction");
    }

    public final String[] a() {
        String str;
        List list = this.f34718b;
        String[] strArr = new String[list.size() * 5];
        for (int i10 = 0; i10 < list.size(); i10++) {
            b2 b2Var = (b2) list.get(i10);
            int i11 = i10 * 5;
            strArr[i11] = b2Var.f34672a;
            strArr[i11 + 1] = Long.toString(b2Var.f34675e);
            strArr[i11 + 2] = b2Var.f34673b;
            strArr[i11 + 3] = b2Var.f34674c;
            int i12 = i11 + 4;
            if (b2Var.f34676f) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[i12] = str;
        }
        return strArr;
    }
}
