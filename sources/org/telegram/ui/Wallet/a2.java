package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class a2 {
    public final String f42092a;
    public final byte[] f42093b;
    public final byte[] f42094c;
    public TL_wallet.walletOwnershipProof d;

    public a2(JSONObject jSONObject) {
        byte[] bArr;
        this.f42092a = jSONObject.getString("clientId");
        if (jSONObject.has("challengeAnswer")) {
            bArr = Base64.decode(jSONObject.getString("challengeAnswer"), 2);
        } else {
            bArr = null;
        }
        this.f42093b = bArr;
        this.f42094c = jSONObject.has("body") ? Base64.decode(jSONObject.getString("body"), 2) : null;
    }
}
