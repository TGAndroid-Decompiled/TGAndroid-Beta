package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class e2 {
    public final long f34159a;
    public final List f34160b;
    public final long f34161c;

    public e2(JSONObject jSONObject) {
        boolean z10;
        long optLong = jSONObject.optLong("valid_until", 0L);
        this.f34159a = optLong;
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() != 0 && jSONArray.length() <= 255 && optLong >= 0) {
            ArrayList arrayList = new ArrayList();
            long j10 = 0;
            int i10 = 0;
            while (i10 < jSONArray.length()) {
                d2 d2Var = new d2(jSONArray.getJSONObject(i10));
                long j11 = d2Var.e;
                long j12 = j10 + j11;
                if ((j11 ^ j10) < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 | ((j10 ^ j12) >= 0)) {
                    arrayList.add(d2Var);
                    i10++;
                    j10 = j12;
                } else {
                    throw new ArithmeticException();
                }
            }
            this.f34161c = j10;
            this.f34160b = DesugarCollections.unmodifiableList(arrayList);
            return;
        }
        throw new JSONException("Invalid transaction");
    }

    public final String[] a() {
        String str;
        List list = this.f34160b;
        String[] strArr = new String[list.size() * 5];
        for (int i10 = 0; i10 < list.size(); i10++) {
            d2 d2Var = (d2) list.get(i10);
            int i11 = i10 * 5;
            strArr[i11] = d2Var.f34111a;
            strArr[i11 + 1] = Long.toString(d2Var.e);
            strArr[i11 + 2] = d2Var.f34112b;
            strArr[i11 + 3] = d2Var.f34113c;
            int i12 = i11 + 4;
            if (d2Var.f34114f) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[i12] = str;
        }
        return strArr;
    }
}
