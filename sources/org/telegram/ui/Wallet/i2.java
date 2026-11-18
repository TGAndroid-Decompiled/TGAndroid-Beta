package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class i2 {
    public final String f44341a;
    public final byte[] f44342b;
    public final byte[] f44343c;
    public TL_wallet.walletOwnershipProof d;

    public i2(JSONObject jSONObject) {
        byte[] bArr;
        this.f44341a = jSONObject.getString("clientId");
        if (jSONObject.has("challengeAnswer")) {
            bArr = Base64.decode(jSONObject.getString("challengeAnswer"), 2);
        } else {
            bArr = null;
        }
        this.f44342b = bArr;
        this.f44343c = jSONObject.has("body") ? Base64.decode(jSONObject.getString("body"), 2) : null;
    }
}
