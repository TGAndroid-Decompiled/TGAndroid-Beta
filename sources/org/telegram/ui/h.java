package org.telegram.ui;

import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final byte a;
    public final String b;
    public final String c;
    public final Object d;

    public h(Object obj, String str, String str2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = str;
        this.c = str2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        String str2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                j jVar = ((ArticleViewer$BlockEmbedCell$TelegramWebviewProxy) obj).a;
                if ("resize_frame".equals(str2)) {
                    try {
                        jVar.r = Utilities.z(new JSONObject(str).getString("height")).intValue();
                        jVar.requestLayout();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            default:
                p pVar = ((PaymentFormActivity$TelegramWebviewProxy) obj).a;
                if (pVar.getParentActivity() != null && str2.equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        pVar.x0 = jSONObject.getJSONObject("credentials").toString();
                        pVar.y0 = jSONObject.getString("title");
                    } catch (Throwable th) {
                        pVar.x0 = str;
                        fa4.g(th, true);
                    }
                    pVar.h0();
                    return;
                }
                return;
        }
    }
}
