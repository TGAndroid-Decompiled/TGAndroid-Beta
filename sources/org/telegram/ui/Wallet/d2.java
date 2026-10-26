package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class d2 {
    public final long f36455a;
    public final List f36456b;
    public final long f36457c;

    public d2(JSONObject jSONObject) {
        boolean z10;
        long optLong = jSONObject.optLong("valid_until", 0L);
        this.f36455a = optLong;
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() != 0 && jSONArray.length() <= 255 && optLong >= 0) {
            ArrayList arrayList = new ArrayList();
            long j10 = 0;
            int i10 = 0;
            while (i10 < jSONArray.length()) {
                c2 c2Var = new c2(jSONArray.getJSONObject(i10));
                long j11 = c2Var.e;
                long j12 = j10 + j11;
                if ((j11 ^ j10) < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 | ((j10 ^ j12) >= 0)) {
                    arrayList.add(c2Var);
                    i10++;
                    j10 = j12;
                } else {
                    throw new ArithmeticException();
                }
            }
            this.f36457c = j10;
            this.f36456b = DesugarCollections.unmodifiableList(arrayList);
            return;
        }
        throw new JSONException("Invalid transaction");
    }

    public final String[] a() {
        String str;
        List list = this.f36456b;
        String[] strArr = new String[list.size() * 5];
        for (int i10 = 0; i10 < list.size(); i10++) {
            c2 c2Var = (c2) list.get(i10);
            int i11 = i10 * 5;
            strArr[i11] = c2Var.f36420a;
            strArr[i11 + 1] = Long.toString(c2Var.e);
            strArr[i11 + 2] = c2Var.f36421b;
            strArr[i11 + 3] = c2Var.f36422c;
            int i12 = i11 + 4;
            if (c2Var.f36423f) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[i12] = str;
        }
        return strArr;
    }
}
