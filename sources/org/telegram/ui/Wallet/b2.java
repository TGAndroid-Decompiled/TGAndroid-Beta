package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class b2 {
    public final String f36413a;
    public final byte[] f36414b;
    public final byte[] f36415c;
    public TL_wallet.walletOwnershipProof d;

    public b2(JSONObject jSONObject) {
        byte[] bArr;
        this.f36413a = jSONObject.getString("clientId");
        if (jSONObject.has("challengeAnswer")) {
            bArr = Base64.decode(jSONObject.getString("challengeAnswer"), 2);
        } else {
            bArr = null;
        }
        this.f36414b = bArr;
        this.f36415c = jSONObject.has("body") ? Base64.decode(jSONObject.getString("body"), 2) : null;
    }
}
