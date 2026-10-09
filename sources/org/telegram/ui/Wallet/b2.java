package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
public final class b2 {
    public final String f34644a;
    public final String f34645b;
    public final String f34646c;
    public final String d;
    public final long f34647e;
    public final boolean f34648f;

    public b2(JSONObject jSONObject) {
        String str;
        String string = jSONObject.getString("address");
        this.f34644a = string;
        if (!string.contains(":") && WalletEngine2.isValidAddress(string)) {
            this.f34648f = (Base64.decode(string.replace('-', '+').replace('_', '/'), 2)[0] & Byte.MAX_VALUE) == 17;
            Object obj = jSONObject.get("amount");
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (str2.matches("[0-9]+")) {
                    long parseLong = Long.parseLong(str2);
                    this.f34647e = parseLong;
                    if (jSONObject.has("extra_currency") && jSONObject.getJSONObject("extra_currency").length() != 0) {
                        throw new IllegalArgumentException("Extra currencies are not supported");
                    }
                    if (parseLong >= 0) {
                        if (jSONObject.has("payload")) {
                            str = jSONObject.getString("payload");
                        } else {
                            str = null;
                        }
                        this.f34645b = str;
                        String string2 = jSONObject.has("stateInit") ? jSONObject.getString("stateInit") : null;
                        this.f34646c = string2;
                        if ((str != null && !WalletEngine2.isValidCellBoc(str)) || (string2 != null && !WalletEngine2.isValidCellBoc(string2))) {
                            throw new IllegalArgumentException("Invalid transaction cell");
                        }
                        this.d = WalletEngine2.textCommentFromBody(str);
                        return;
                    }
                    throw new IllegalArgumentException("Transfer amount must not be negative");
                }
            }
            throw new IllegalArgumentException("Invalid transfer amount");
        }
        throw new IllegalArgumentException("Expected a friendly destination address");
    }
}
