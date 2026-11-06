package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class c2 {
    public final String f42191a;
    public final byte[] f42192b;
    public final byte[] f42193c;
    public TL_wallet.walletOwnershipProof d;

    public c2(JSONObject jSONObject) {
        byte[] bArr;
        this.f42191a = jSONObject.getString("clientId");
        if (jSONObject.has("challengeAnswer")) {
            bArr = Base64.decode(jSONObject.getString("challengeAnswer"), 2);
        } else {
            bArr = null;
        }
        this.f42192b = bArr;
        this.f42193c = jSONObject.has("body") ? Base64.decode(jSONObject.getString("body"), 2) : null;
    }
}
