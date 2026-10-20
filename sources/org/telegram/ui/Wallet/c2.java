package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class c2 {
    public final String f34067a;
    public final byte[] f34068b;
    public final byte[] f34069c;
    public TL_wallet.walletOwnershipProof d;

    public c2(JSONObject jSONObject) {
        byte[] bArr;
        this.f34067a = jSONObject.getString("clientId");
        if (jSONObject.has("challengeAnswer")) {
            bArr = Base64.decode(jSONObject.getString("challengeAnswer"), 2);
        } else {
            bArr = null;
        }
        this.f34068b = bArr;
        this.f34069c = jSONObject.has("body") ? Base64.decode(jSONObject.getString("body"), 2) : null;
    }
}
