package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class d2 {
    public final long f34806a;
    public final List f34807b;
    public final long f34808c;

    public d2(JSONObject jSONObject) {
        boolean z10;
        long optLong = jSONObject.optLong("valid_until", 0L);
        this.f34806a = optLong;
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() != 0 && jSONArray.length() <= 255 && optLong >= 0) {
            ArrayList arrayList = new ArrayList();
            long j3 = 0;
            int i10 = 0;
            while (i10 < jSONArray.length()) {
                c2 c2Var = new c2(jSONArray.getJSONObject(i10));
                long j10 = c2Var.f34775e;
                long j11 = j3 + j10;
                if ((j10 ^ j3) < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 | ((j3 ^ j11) >= 0)) {
                    arrayList.add(c2Var);
                    i10++;
                    j3 = j11;
                } else {
                    throw new ArithmeticException();
                }
            }
            this.f34808c = j3;
            this.f34807b = DesugarCollections.unmodifiableList(arrayList);
            return;
        }
        throw new JSONException("Invalid transaction");
    }

    public final String[] a() {
        String str;
        List list = this.f34807b;
        String[] strArr = new String[list.size() * 5];
        for (int i10 = 0; i10 < list.size(); i10++) {
            c2 c2Var = (c2) list.get(i10);
            int i11 = i10 * 5;
            strArr[i11] = c2Var.f34772a;
            strArr[i11 + 1] = Long.toString(c2Var.f34775e);
            strArr[i11 + 2] = c2Var.f34773b;
            strArr[i11 + 3] = c2Var.f34774c;
            int i12 = i11 + 4;
            if (c2Var.f34776f) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[i12] = str;
        }
        return strArr;
    }
}
