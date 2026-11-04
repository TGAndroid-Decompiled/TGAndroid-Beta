package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class z1 {
    public final String f43494a;
    public final byte[] f43495b;
    public final byte[] f43496c;
    public TL_wallet.walletOwnershipProof d;

    public z1(JSONObject jSONObject) {
        byte[] bArr;
        this.f43494a = jSONObject.getString("clientId");
        if (jSONObject.has("challengeAnswer")) {
            bArr = Base64.decode(jSONObject.getString("challengeAnswer"), 2);
        } else {
            bArr = null;
        }
        this.f43495b = bArr;
        this.f43496c = jSONObject.has("body") ? Base64.decode(jSONObject.getString("body"), 2) : null;
    }
}
