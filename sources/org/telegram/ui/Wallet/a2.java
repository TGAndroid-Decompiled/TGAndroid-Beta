package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class a2 {
    public final String f32918a;
    public final byte[] f32919b;
    public final byte[] f32920c;
    public TL_wallet.walletOwnershipProof d;

    public a2(JSONObject jSONObject) {
        byte[] bArr;
        this.f32918a = jSONObject.getString("clientId");
        if (jSONObject.has("challengeAnswer")) {
            bArr = Base64.decode(jSONObject.getString("challengeAnswer"), 2);
        } else {
            bArr = null;
        }
        this.f32919b = bArr;
        this.f32920c = jSONObject.has("body") ? Base64.decode(jSONObject.getString("body"), 2) : null;
    }
}
