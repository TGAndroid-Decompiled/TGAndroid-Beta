package org.telegram.ui;

import org.json.JSONObject;
public final class co0 extends JSONObject {
    public co0(po0 po0Var, int i10) {
        switch (i10) {
            case 3:
                put("type", "PAYMENT_GATEWAY");
                Object obj = po0Var.M0;
                if (obj != null) {
                    put("parameters", obj);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gateway", "stripe");
                jSONObject.put("stripe:publishableKey", po0Var.f42602j0);
                jSONObject.put("stripe:version", "3.5.0");
                put("parameters", jSONObject);
                return;
            default:
                put("type", "DIRECT");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("protocolVersion", "ECv2");
                jSONObject2.put("publicKey", po0Var.K0);
                put("parameters", jSONObject2);
                return;
        }
    }
}
