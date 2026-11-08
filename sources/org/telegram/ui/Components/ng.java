package org.telegram.ui.Components;

import android.webkit.WebResourceRequest;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ng implements Runnable {
    public final int f36343a;
    public final Object f36344b;
    public final Object f36345c;
    public final Object d;

    public ng(Object obj, Object obj2, Object obj3, int i7) {
        this.f36343a = i7;
        this.f36344b = obj;
        this.f36345c = obj2;
        this.d = obj3;
    }

    private final void a() {
        InputStream errorStream;
        JSONObject optJSONObject;
        String optString;
        String str = (String) this.f36345c;
        WebResourceRequest webResourceRequest = (WebResourceRequest) this.d;
        org.telegram.ui.cq0 cq0Var = (org.telegram.ui.cq0) ((org.telegram.ui.n1) this.f36344b).f47935b;
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
            outputStream.write(jSONObject.put("context", jSONObject2.put("client", put.put("originalUrl", "https://www.youtube.com/watch?v=" + cq0Var.f31801x).put("platform", "DESKTOP"))).put("videoId", cq0Var.f31801x).toString().getBytes("UTF-8"));
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
                if (cq0Var.H == 0) {
                    cq0Var.f31799s = optString;
                } else {
                    ae0.a(cq0Var, optString);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    private final void b() {
        int i7;
        long C1;
        ArrayList arrayList;
        boolean z9;
        char c10;
        Object obj;
        qr0 qr0Var = (qr0) this.f36344b;
        ArrayList arrayList2 = (ArrayList) this.d;
        org.telegram.ui.ActionBar.f2 f2Var = qr0Var.f37415s.f40461x1;
        String lowerCase = ((String) this.f36345c).trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.h3(new ng(qr0Var, new ArrayList(), new ArrayList(), 23));
            return;
        }
        boolean z10 = true;
        boolean z11 = 0;
        String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
        S0 = (lowerCase.equals(S0) || S0.length() == 0) ? null : null;
        if (S0 != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i10 = i7 + 1;
        String[] strArr = new String[i10];
        strArr[0] = lowerCase;
        if (S0 != null) {
            strArr[1] = S0;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i11);
            if (tLObject instanceof TLRPC.ChatParticipant) {
                C1 = ((TLRPC.ChatParticipant) tLObject).user_id;
            } else {
                if (tLObject instanceof TLRPC.ChannelParticipant) {
                    C1 = org.telegram.messenger.ij.C1(((TLRPC.ChannelParticipant) tLObject).peer);
                }
                arrayList = arrayList2;
                z9 = z10;
                i11++;
                z10 = z9;
                arrayList2 = arrayList;
                z11 = 0;
            }
            TLRPC.User a22 = f2Var.getMessagesController().a2(Long.valueOf(C1));
            if (a22.f27105id != f2Var.getUserConfig().e()) {
                String lowerCase2 = org.telegram.messenger.t10.p(a22).toLowerCase();
                String S02 = org.telegram.messenger.id.E0().S0(lowerCase2, z10, z11);
                if (lowerCase2.equals(S02)) {
                    S02 = null;
                }
                boolean z12 = z11;
                for (int i12 = z11; i12 < i10; i12++) {
                    String str = strArr[i12];
                    if (!lowerCase2.startsWith(str) && !jg.g.A(" ", str, lowerCase2) && (S02 == null || (!S02.startsWith(str) && !jg.g.A(" ", str, S02)))) {
                        String n10 = org.telegram.messenger.t10.n(a22);
                        if (n10 != null && n10.startsWith(str)) {
                            z12 = 2;
                        }
                        c10 = z12;
                    } else {
                        c10 = 1;
                    }
                    if (c10 != 0) {
                        arrayList = arrayList2;
                        z9 = true;
                        if (c10 == 1) {
                            arrayList3.add(org.telegram.messenger.g0.r0(a22.first_name, a22.last_name, str));
                            obj = null;
                        } else {
                            obj = null;
                            arrayList3.add(org.telegram.messenger.g0.r0("@" + org.telegram.messenger.t10.n(a22), null, "@" + str));
                        }
                        arrayList4.add(tLObject);
                        i11++;
                        z10 = z9;
                        arrayList2 = arrayList;
                        z11 = 0;
                    } else {
                        z10 = true;
                        arrayList2 = arrayList2;
                        z12 = c10;
                    }
                }
            }
            arrayList = arrayList2;
            z9 = z10;
            i11++;
            z10 = z9;
            arrayList2 = arrayList;
            z11 = 0;
        }
        org.telegram.messenger.g0.h3(new ng(qr0Var, arrayList3, arrayList4, 23));
    }

    private final void c() {
        int i7;
        TLRPC.Document document;
        boolean z9;
        String str;
        ur0 ur0Var = (ur0) this.f36344b;
        ArrayList arrayList = (ArrayList) this.d;
        ur0Var.getClass();
        String lowerCase = ((String) this.f36345c).trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.h3(new v80(18, ur0Var, new ArrayList()));
            return;
        }
        String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
        S0 = (lowerCase.equals(S0) || S0.length() == 0) ? null : null;
        if (S0 != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i10 = i7 + 1;
        String[] strArr = new String[i10];
        strArr[0] = lowerCase;
        if (S0 != null) {
            strArr[1] = S0;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < i10) {
                    String str2 = strArr[i12];
                    String I0 = ijVar.I0();
                    if (I0 != null && I0.length() != 0) {
                        if (I0.toLowerCase().contains(str2)) {
                            arrayList2.add(ijVar);
                            break;
                        } else if (ur0Var.f38724r == 4) {
                            if (ijVar.D == 0) {
                                document = org.telegram.messenger.ij.o1(ijVar.f23262k).webpage.document;
                            } else {
                                document = org.telegram.messenger.ij.o1(ijVar.f23262k).document;
                            }
                            int i13 = 0;
                            while (true) {
                                if (i13 < document.attributes.size()) {
                                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                        String str3 = documentAttribute.performer;
                                        if (str3 != null) {
                                            z9 = str3.toLowerCase().contains(str2);
                                        } else {
                                            z9 = false;
                                        }
                                        if (!z9 && (str = documentAttribute.title) != null) {
                                            z9 = str.toLowerCase().contains(str2);
                                        }
                                    } else {
                                        i13++;
                                    }
                                } else {
                                    z9 = false;
                                    break;
                                }
                            }
                            if (z9) {
                                arrayList2.add(ijVar);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i12++;
                }
            }
        }
        org.telegram.messenger.g0.h3(new v80(18, ur0Var, arrayList2));
    }

    private final void d() {
        yv0 yv0Var = (yv0) this.f36344b;
        ArrayList arrayList = (ArrayList) this.f36345c;
        Boolean bool = (Boolean) this.d;
        yv0Var.P1 = arrayList;
        if (arrayList.isEmpty()) {
            yv0Var.dismiss();
            return;
        }
        yv0Var.f40787k1.f();
        if (bool.booleanValue()) {
            yv0Var.Q1 = new HashMap();
            int size = yv0Var.P1.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) yv0Var.P1.get(i7);
                yv0Var.Q1.put(zyVar.f26942a, zyVar);
                org.telegram.messenger.w7.G(yv0Var.f28616a).h0(false, 67108864, zyVar.f26942a, true);
            }
        }
        yv0Var.Z0();
    }

    private final void f() {
        int i7;
        yv0 yv0Var = (yv0) this.f36344b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f36345c;
        TLObject tLObject = (TLObject) this.d;
        org.telegram.ui.ActionBar.f2 f2Var = yv0Var.C1;
        TLRPC.StickerSet stickerSet = yv0Var.J1.set;
        if (stickerSet.masks) {
            i7 = 1;
        } else if (stickerSet.emojis) {
            i7 = 5;
        } else {
            i7 = 0;
        }
        try {
            if (tL_error == null) {
                if (yv0Var.f40776a2) {
                    cc.g(f2Var, new cv0(yv0Var.f40796s1.getContext(), yv0Var.J1, 1, 2, null, yv0Var.I0), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    org.telegram.messenger.ui.b0(yv0Var.f28616a).A1(f2Var, true, i7, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(yv0Var.getContext(), org.telegram.messenger.id.M0(2131751106, null), 0).show();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.messenger.ui.b0(yv0Var.f28616a).a1(i7, false, true);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ng.run():void");
    }

    public ng(mc0 mc0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9) {
        this.f36343a = 14;
        this.f36344b = mc0Var;
        this.f36345c = tL_error;
        this.d = tLObject;
    }
}
