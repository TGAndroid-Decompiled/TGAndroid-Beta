package org.telegram.ui;

import org.json.JSONObject;
public final class jo0 extends JSONObject {
    public jo0(wo0 wo0Var, int i10) {
        switch (i10) {
            case 3:
                put("type", "PAYMENT_GATEWAY");
                Object obj = wo0Var.M0;
                if (obj != null) {
                    put("parameters", obj);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gateway", "stripe");
                jSONObject.put("stripe:publishableKey", wo0Var.f38273j0);
                jSONObject.put("stripe:version", "3.5.0");
                put("parameters", jSONObject);
                return;
            default:
                put("type", "DIRECT");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("protocolVersion", "ECv2");
                jSONObject2.put("publicKey", wo0Var.K0);
                put("parameters", jSONObject2);
                return;
        }
    }
}
