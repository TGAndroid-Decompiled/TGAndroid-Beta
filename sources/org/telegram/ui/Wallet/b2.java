package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class b2 {
    public final long f42222a;
    public final List f42223b;
    public final long f42224c;

    public b2(JSONObject jSONObject) {
        boolean z10;
        long optLong = jSONObject.optLong("valid_until", 0L);
        this.f42222a = optLong;
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() != 0 && jSONArray.length() <= 255 && optLong >= 0) {
            ArrayList arrayList = new ArrayList();
            long j10 = 0;
            int i3 = 0;
            while (i3 < jSONArray.length()) {
                a2 a2Var = new a2(jSONArray.getJSONObject(i3));
                long j11 = a2Var.f42127e;
                long j12 = j10 + j11;
                if ((j11 ^ j10) < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 | ((j10 ^ j12) >= 0)) {
                    arrayList.add(a2Var);
                    i3++;
                    j10 = j12;
                } else {
                    throw new ArithmeticException();
                }
            }
            this.f42224c = j10;
            this.f42223b = DesugarCollections.unmodifiableList(arrayList);
            return;
        }
        throw new JSONException("Invalid transaction");
    }

    public final String[] a() {
        String str;
        List list = this.f42223b;
        String[] strArr = new String[list.size() * 5];
        for (int i3 = 0; i3 < list.size(); i3++) {
            a2 a2Var = (a2) list.get(i3);
            int i10 = i3 * 5;
            strArr[i10] = a2Var.f42124a;
            strArr[i10 + 1] = Long.toString(a2Var.f42127e);
            strArr[i10 + 2] = a2Var.f42125b;
            strArr[i10 + 3] = a2Var.f42126c;
            int i11 = i10 + 4;
            if (a2Var.f42128f) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[i11] = str;
        }
        return strArr;
    }
}
