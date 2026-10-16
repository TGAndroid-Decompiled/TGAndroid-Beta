package org.telegram.ui;

import org.json.JSONObject;
public final class no0 extends JSONObject {
    public no0(ap0 ap0Var, int i10) {
        switch (i10) {
            case 3:
                put("type", "PAYMENT_GATEWAY");
                Object obj = ap0Var.M0;
                if (obj != null) {
                    put("parameters", obj);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gateway", "stripe");
                jSONObject.put("stripe:publishableKey", ap0Var.f34026j0);
                jSONObject.put("stripe:version", "3.5.0");
                put("parameters", jSONObject);
                return;
            default:
                put("type", "DIRECT");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("protocolVersion", "ECv2");
                jSONObject2.put("publicKey", ap0Var.K0);
                put("parameters", jSONObject2);
                return;
        }
    }
}
