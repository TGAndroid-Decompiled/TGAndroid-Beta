package org.telegram.ui.Cells;

import android.webkit.WebResourceRequest;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ip;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.dq0;
public final class fa implements Runnable {
    public final int f30712a;
    public final Object f30713b;
    public final Object f30714c;
    public final Object d;

    public fa(Object obj, Object obj2, Object obj3, int i7) {
        this.f30712a = i7;
        this.f30713b = obj;
        this.f30714c = obj2;
        this.d = obj3;
    }

    private final void a() {
        InputStream errorStream;
        JSONObject optJSONObject;
        String optString;
        String str = (String) this.f30714c;
        WebResourceRequest webResourceRequest = (WebResourceRequest) this.d;
        dq0 dq0Var = (dq0) ((org.telegram.ui.n1) this.f30713b).f50171b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("POST");
            for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject put = new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0");
            outputStream.write(jSONObject.put("context", jSONObject2.put("client", put.put("originalUrl", "https://www.youtube.com/watch?v=" + dq0Var.f36729x).put("platform", "DESKTOP"))).put("videoId", dq0Var.f36729x).toString().getBytes("UTF-8"));
            outputStream.close();
            if (httpURLConnection.getResponseCode() == 200) {
                errorStream = httpURLConnection.getInputStream();
            } else {
                errorStream = httpURLConnection.getErrorStream();
            }
            byte[] bArr = new byte[10240];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = errorStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.close();
            errorStream.close();
            JSONObject optJSONObject2 = new JSONObject(byteArrayOutputStream.toString("UTF-8")).optJSONObject("storyboards");
            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("playerStoryboardSpecRenderer")) != null && (optString = optJSONObject.optString("spec")) != null) {
                if (dq0Var.I == 0) {
                    dq0Var.f36727s = optString;
                } else {
                    ke0.a(dq0Var, optString);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.fa.run():void");
    }

    public fa(ip ipVar, TLObject tLObject, org.telegram.ui.ActionBar.m6 m6Var) {
        this.f30712a = 9;
        this.f30713b = ipVar;
        this.d = tLObject;
        this.f30714c = m6Var;
    }

    public fa(wc0 wc0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f30712a = 21;
        this.f30713b = wc0Var;
        this.f30714c = tL_error;
        this.d = tLObject;
    }
}
