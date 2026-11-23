package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
public final class j2 {
    public final String f44429a;
    public final String f44430b;
    public final String f44431c;
    public final String d;
    public final long f44432e;
    public final boolean f44433f;

    public j2(JSONObject jSONObject) {
        String str;
        String string = jSONObject.getString("address");
        this.f44429a = string;
        if (!string.contains(":") && WalletEngine2.isValidAddress(string)) {
            this.f44433f = (Base64.decode(string.replace('-', '+').replace('_', '/'), 2)[0] & Byte.MAX_VALUE) == 17;
            Object obj = jSONObject.get("amount");
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (str2.matches("[0-9]+")) {
                    long parseLong = Long.parseLong(str2);
                    this.f44432e = parseLong;
                    if (jSONObject.has("extra_currency") && jSONObject.getJSONObject("extra_currency").length() != 0) {
                        throw new IllegalArgumentException("Extra currencies are not supported");
                    }
                    if (parseLong >= 0) {
                        if (jSONObject.has("payload")) {
                            str = jSONObject.getString("payload");
                        } else {
                            str = null;
                        }
                        this.f44430b = str;
                        String string2 = jSONObject.has("stateInit") ? jSONObject.getString("stateInit") : null;
                        this.f44431c = string2;
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
