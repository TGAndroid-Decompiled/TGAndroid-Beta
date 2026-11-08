package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class b2 {
    public final String f42181a;
    public final byte[] f42182b;
    public final byte[] f42183c;
    public TL_wallet.walletOwnershipProof d;

    public b2(JSONObject jSONObject) {
        byte[] bArr;
        this.f42181a = jSONObject.getString("clientId");
        if (jSONObject.has("challengeAnswer")) {
            bArr = Base64.decode(jSONObject.getString("challengeAnswer"), 2);
        } else {
            bArr = null;
        }
        this.f42182b = bArr;
        this.f42183c = jSONObject.has("body") ? Base64.decode(jSONObject.getString("body"), 2) : null;
    }
}
