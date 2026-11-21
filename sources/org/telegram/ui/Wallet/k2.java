package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class k2 {
    public final long f44475a;
    public final List f44476b;
    public final long f44477c;

    public k2(JSONObject jSONObject) {
        boolean z10;
        long optLong = jSONObject.optLong("valid_until", 0L);
        this.f44475a = optLong;
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() != 0 && jSONArray.length() <= 255 && optLong >= 0) {
            ArrayList arrayList = new ArrayList();
            long j3 = 0;
            int i7 = 0;
            while (i7 < jSONArray.length()) {
                j2 j2Var = new j2(jSONArray.getJSONObject(i7));
                long j10 = j2Var.f44428e;
                long j11 = j3 + j10;
                if ((j10 ^ j3) < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 | ((j3 ^ j11) >= 0)) {
                    arrayList.add(j2Var);
                    i7++;
                    j3 = j11;
                } else {
                    throw new ArithmeticException();
                }
            }
            this.f44477c = j3;
            this.f44476b = DesugarCollections.unmodifiableList(arrayList);
            return;
        }
        throw new JSONException("Invalid transaction");
    }

    public final String[] a() {
        String str;
        List list = this.f44476b;
        String[] strArr = new String[list.size() * 5];
        for (int i7 = 0; i7 < list.size(); i7++) {
            j2 j2Var = (j2) list.get(i7);
            int i10 = i7 * 5;
            strArr[i10] = j2Var.f44425a;
            strArr[i10 + 1] = Long.toString(j2Var.f44428e);
            strArr[i10 + 2] = j2Var.f44426b;
            strArr[i10 + 3] = j2Var.f44427c;
            int i11 = i10 + 4;
            if (j2Var.f44429f) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[i11] = str;
        }
        return strArr;
    }
}
