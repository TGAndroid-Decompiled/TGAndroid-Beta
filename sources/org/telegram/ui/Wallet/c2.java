package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class c2 {
    public final String f34072a;
    public final byte[] f34073b;
    public final byte[] f34074c;
    public TL_wallet.walletOwnershipProof d;

    public c2(JSONObject jSONObject) {
        byte[] bArr;
        this.f34072a = jSONObject.getString("clientId");
        if (jSONObject.has("challengeAnswer")) {
            bArr = Base64.decode(jSONObject.getString("challengeAnswer"), 2);
        } else {
            bArr = null;
        }
        this.f34073b = bArr;
        this.f34074c = jSONObject.has("body") ? Base64.decode(jSONObject.getString("body"), 2) : null;
    }
}
