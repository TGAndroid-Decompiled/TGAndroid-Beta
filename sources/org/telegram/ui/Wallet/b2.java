package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class b2 {
    public final String f36387a;
    public final byte[] f36388b;
    public final byte[] f36389c;
    public TL_wallet.walletOwnershipProof d;

    public b2(JSONObject jSONObject) {
        byte[] bArr;
        this.f36387a = jSONObject.getString("clientId");
        if (jSONObject.has("challengeAnswer")) {
            bArr = Base64.decode(jSONObject.getString("challengeAnswer"), 2);
        } else {
            bArr = null;
        }
        this.f36388b = bArr;
        this.f36389c = jSONObject.has("body") ? Base64.decode(jSONObject.getString("body"), 2) : null;
    }
}
