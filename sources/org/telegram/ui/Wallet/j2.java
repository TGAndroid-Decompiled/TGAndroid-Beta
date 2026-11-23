package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class j2 {
    public final String f44513a;
    public final byte[] f44514b;
    public final byte[] f44515c;
    public TL_wallet.walletOwnershipProof d;

    public j2(JSONObject jSONObject) {
        byte[] bArr;
        this.f44513a = jSONObject.getString("clientId");
        if (jSONObject.has("challengeAnswer")) {
            bArr = Base64.decode(jSONObject.getString("challengeAnswer"), 2);
        } else {
            bArr = null;
        }
        this.f44514b = bArr;
        this.f44515c = jSONObject.has("body") ? Base64.decode(jSONObject.getString("body"), 2) : null;
    }
}
