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
public final class mg implements Runnable {
    public final int f35954a;
    public final Object f35955b;
    public final Object f35956c;
    public final Object d;

    public mg(Object obj, Object obj2, Object obj3, int i7) {
        this.f35954a = i7;
        this.f35955b = obj;
        this.f35956c = obj2;
        this.d = obj3;
    }

    private final void a() {
        InputStream errorStream;
        JSONObject optJSONObject;
        String optString;
        String str = (String) this.f35956c;
        WebResourceRequest webResourceRequest = (WebResourceRequest) this.d;
        org.telegram.ui.fq0 fq0Var = (org.telegram.ui.fq0) ((org.telegram.ui.n1) this.f35955b).f48093b;
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
            outputStream.write(jSONObject.put("context", jSONObject2.put("client", put.put("originalUrl", "https://www.youtube.com/watch?v=" + fq0Var.f31850x).put("platform", "DESKTOP"))).put("videoId", fq0Var.f31850x).toString().getBytes("UTF-8"));
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
                if (fq0Var.H == 0) {
                    fq0Var.f31848s = optString;
                } else {
                    ae0.a(fq0Var, optString);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    private final void b() {
        int i7;
        long B1;
        ArrayList arrayList;
        boolean z9;
        char c10;
        Object obj;
        rr0 rr0Var = (rr0) this.f35955b;
        ArrayList arrayList2 = (ArrayList) this.d;
        org.telegram.ui.ActionBar.f2 f2Var = rr0Var.f37730s.f40719x1;
        String lowerCase = ((String) this.f35956c).trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.h3(new mg(rr0Var, new ArrayList(), new ArrayList(), 23));
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
                B1 = ((TLRPC.ChatParticipant) tLObject).user_id;
            } else {
                if (tLObject instanceof TLRPC.ChannelParticipant) {
                    B1 = org.telegram.messenger.ij.B1(((TLRPC.ChannelParticipant) tLObject).peer);
                }
                arrayList = arrayList2;
                z9 = z10;
                i11++;
                z10 = z9;
                arrayList2 = arrayList;
                z11 = 0;
            }
            TLRPC.User a22 = f2Var.getMessagesController().a2(Long.valueOf(B1));
            if (a22.f27109id != f2Var.getUserConfig().e()) {
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
        org.telegram.messenger.g0.h3(new mg(rr0Var, arrayList3, arrayList4, 23));
    }

    private final void c() {
        int i7;
        TLRPC.Document document;
        boolean z9;
        String str;
        vr0 vr0Var = (vr0) this.f35955b;
        ArrayList arrayList = (ArrayList) this.d;
        vr0Var.getClass();
        String lowerCase = ((String) this.f35956c).trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.h3(new r80(19, vr0Var, new ArrayList()));
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
                        } else if (vr0Var.f39723r == 4) {
                            if (ijVar.D == 0) {
                                document = org.telegram.messenger.ij.n1(ijVar.f23266k).webpage.document;
                            } else {
                                document = org.telegram.messenger.ij.n1(ijVar.f23266k).document;
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
        org.telegram.messenger.g0.h3(new r80(19, vr0Var, arrayList2));
    }

    private final void d() {
        yv0 yv0Var = (yv0) this.f35955b;
        ArrayList arrayList = (ArrayList) this.f35956c;
        Boolean bool = (Boolean) this.d;
        yv0Var.S1 = arrayList;
        if (arrayList.isEmpty()) {
            yv0Var.dismiss();
            return;
        }
        yv0Var.n1.f();
        if (bool.booleanValue()) {
            yv0Var.T1 = new HashMap();
            int size = yv0Var.S1.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) yv0Var.S1.get(i7);
                yv0Var.T1.put(zyVar.f26946a, zyVar);
                org.telegram.messenger.w7.G(yv0Var.f28669a).h0(false, 67108864, zyVar.f26946a, true);
            }
        }
        yv0Var.Z0();
    }

    private final void f() {
        int i7;
        yv0 yv0Var = (yv0) this.f35955b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f35956c;
        TLObject tLObject = (TLObject) this.d;
        org.telegram.ui.ActionBar.f2 f2Var = yv0Var.F1;
        TLRPC.StickerSet stickerSet = yv0Var.M1.set;
        if (stickerSet.masks) {
            i7 = 1;
        } else if (stickerSet.emojis) {
            i7 = 5;
        } else {
            i7 = 0;
        }
        try {
            if (tL_error == null) {
                if (yv0Var.d2) {
                    bc.g(f2Var, new dv0(yv0Var.f40759v1.getContext(), yv0Var.M1, 1, 2, null, yv0Var.I0), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    org.telegram.messenger.ui.b0(yv0Var.f28669a).A1(f2Var, true, i7, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(yv0Var.getContext(), org.telegram.messenger.id.M0(2131751105, null), 0).show();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.messenger.ui.b0(yv0Var.f28669a).a1(i7, false, true);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mg.run():void");
    }

    public mg(mc0 mc0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9) {
        this.f35954a = 14;
        this.f35955b = mc0Var;
        this.f35956c = tL_error;
        this.d = tLObject;
    }
}
