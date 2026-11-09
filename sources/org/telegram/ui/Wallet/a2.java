package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class a2 {
    public final String f42101a;
    public final byte[] f42102b;
    public final byte[] f42103c;
    public TL_wallet.walletOwnershipProof d;

    public a2(JSONObject jSONObject) {
        byte[] bArr;
        this.f42101a = jSONObject.getString("clientId");
        if (jSONObject.has("challengeAnswer")) {
            bArr = Base64.decode(jSONObject.getString("challengeAnswer"), 2);
        } else {
            bArr = null;
        }
        this.f42102b = bArr;
        this.f42103c = jSONObject.has("body") ? Base64.decode(jSONObject.getString("body"), 2) : null;
    }
}
