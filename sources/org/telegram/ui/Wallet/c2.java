package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class c2 {
    public final String f34061a;
    public final byte[] f34062b;
    public final byte[] f34063c;
    public TL_wallet.walletOwnershipProof d;

    public c2(JSONObject jSONObject) {
        byte[] bArr;
        this.f34061a = jSONObject.getString("clientId");
        if (jSONObject.has("challengeAnswer")) {
            bArr = Base64.decode(jSONObject.getString("challengeAnswer"), 2);
        } else {
            bArr = null;
        }
        this.f34062b = bArr;
        this.f34063c = jSONObject.has("body") ? Base64.decode(jSONObject.getString("body"), 2) : null;
    }
}
