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
public final class jg implements Runnable {
    public final int f27423a;
    public final Object f27424b;
    public final Object f27425c;
    public final Object d;

    public jg(Object obj, Object obj2, Object obj3, int i10) {
        this.f27423a = i10;
        this.f27424b = obj;
        this.f27425c = obj2;
        this.d = obj3;
    }

    private final void a() {
        InputStream errorStream;
        JSONObject optJSONObject;
        String optString;
        String str = (String) this.f27425c;
        WebResourceRequest webResourceRequest = (WebResourceRequest) this.d;
        org.telegram.ui.lr0 lr0Var = (org.telegram.ui.lr0) ((ji.i) this.f27424b).f10447b;
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
            outputStream.write(jSONObject.put("context", jSONObject2.put("client", put.put("originalUrl", "https://www.youtube.com/watch?v=" + lr0Var.f31277x).put("platform", "DESKTOP"))).put("videoId", lr0Var.f31277x).toString().getBytes("UTF-8"));
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
                if (lr0Var.H == 0) {
                    lr0Var.f31275s = optString;
                } else {
                    ve0.a(lr0Var, optString);
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    private final void b() {
        int i10;
        long C1;
        ArrayList arrayList;
        boolean z10;
        char c10;
        Object obj;
        rs0 rs0Var = (rs0) this.f27424b;
        ArrayList arrayList2 = (ArrayList) this.d;
        org.telegram.ui.ActionBar.k2 k2Var = rs0Var.f30084s.f24568x1;
        String lowerCase = ((String) this.f27425c).trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.i0.g3(new jg(rs0Var, new ArrayList(), new ArrayList(), 23));
            return;
        }
        boolean z11 = true;
        boolean z12 = 0;
        String R0 = org.telegram.messenger.dd.D0().R0(lowerCase, true, false);
        R0 = (lowerCase.equals(R0) || R0.length() == 0) ? null : null;
        if (R0 != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = i10 + 1;
        String[] strArr = new String[i11];
        strArr[0] = lowerCase;
        if (R0 != null) {
            strArr[1] = R0;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i12);
            if (tLObject instanceof TLRPC.ChatParticipant) {
                C1 = ((TLRPC.ChatParticipant) tLObject).user_id;
            } else {
                if (tLObject instanceof TLRPC.ChannelParticipant) {
                    C1 = org.telegram.messenger.kj.C1(((TLRPC.ChannelParticipant) tLObject).peer);
                }
                arrayList = arrayList2;
                z10 = z11;
                i12++;
                z11 = z10;
                arrayList2 = arrayList;
                z12 = 0;
            }
            TLRPC.User Z1 = k2Var.getMessagesController().Z1(Long.valueOf(C1));
            if (Z1.f19943id != k2Var.getUserConfig().e()) {
                String lowerCase2 = org.telegram.messenger.i20.p(Z1).toLowerCase();
                String R02 = org.telegram.messenger.dd.D0().R0(lowerCase2, z11, z12);
                if (lowerCase2.equals(R02)) {
                    R02 = null;
                }
                boolean z13 = z12;
                for (int i13 = z12; i13 < i11; i13++) {
                    String str = strArr[i13];
                    if (!lowerCase2.startsWith(str) && !sc.e.y(" ", str, lowerCase2) && (R02 == null || (!R02.startsWith(str) && !sc.e.y(" ", str, R02)))) {
                        String n10 = org.telegram.messenger.i20.n(Z1);
                        if (n10 != null && n10.startsWith(str)) {
                            z13 = 2;
                        }
                        c10 = z13;
                    } else {
                        c10 = 1;
                    }
                    if (c10 != 0) {
                        arrayList = arrayList2;
                        z10 = true;
                        if (c10 == 1) {
                            arrayList3.add(org.telegram.messenger.i0.r0(Z1.first_name, Z1.last_name, str));
                            obj = null;
                        } else {
                            obj = null;
                            arrayList3.add(org.telegram.messenger.i0.r0("@" + org.telegram.messenger.i20.n(Z1), null, "@" + str));
                        }
                        arrayList4.add(tLObject);
                        i12++;
                        z11 = z10;
                        arrayList2 = arrayList;
                        z12 = 0;
                    } else {
                        z11 = true;
                        arrayList2 = arrayList2;
                        z13 = c10;
                    }
                }
            }
            arrayList = arrayList2;
            z10 = z11;
            i12++;
            z11 = z10;
            arrayList2 = arrayList;
            z12 = 0;
        }
        org.telegram.messenger.i0.g3(new jg(rs0Var, arrayList3, arrayList4, 23));
    }

    private final void c() {
        int i10;
        TLRPC.Document document;
        boolean z10;
        String str;
        vs0 vs0Var = (vs0) this.f27424b;
        ArrayList arrayList = (ArrayList) this.d;
        vs0Var.getClass();
        String lowerCase = ((String) this.f27425c).trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.i0.g3(new hi0(12, vs0Var, new ArrayList()));
            return;
        }
        String R0 = org.telegram.messenger.dd.D0().R0(lowerCase, true, false);
        R0 = (lowerCase.equals(R0) || R0.length() == 0) ? null : null;
        if (R0 != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = i10 + 1;
        String[] strArr = new String[i11];
        strArr[0] = lowerCase;
        if (R0 != null) {
            strArr[1] = R0;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i12);
            int i13 = 0;
            while (true) {
                if (i13 < i11) {
                    String str2 = strArr[i13];
                    String I0 = kjVar.I0();
                    if (I0 != null && I0.length() != 0) {
                        if (I0.toLowerCase().contains(str2)) {
                            arrayList2.add(kjVar);
                            break;
                        } else if (vs0Var.f31902r == 4) {
                            if (kjVar.D == 0) {
                                document = org.telegram.messenger.kj.o1(kjVar.f16690k).webpage.document;
                            } else {
                                document = org.telegram.messenger.kj.o1(kjVar.f16690k).document;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < document.attributes.size()) {
                                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i14);
                                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                        String str3 = documentAttribute.performer;
                                        if (str3 != null) {
                                            z10 = str3.toLowerCase().contains(str2);
                                        } else {
                                            z10 = false;
                                        }
                                        if (!z10 && (str = documentAttribute.title) != null) {
                                            z10 = str.toLowerCase().contains(str2);
                                        }
                                    } else {
                                        i14++;
                                    }
                                } else {
                                    z10 = false;
                                    break;
                                }
                            }
                            if (z10) {
                                arrayList2.add(kjVar);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i13++;
                }
            }
        }
        org.telegram.messenger.i0.g3(new hi0(12, vs0Var, arrayList2));
    }

    private final void d() {
        dx0 dx0Var = (dx0) this.f27424b;
        ArrayList arrayList = (ArrayList) this.f27425c;
        Boolean bool = (Boolean) this.d;
        dx0Var.P1 = arrayList;
        if (arrayList.isEmpty()) {
            dx0Var.dismiss();
            return;
        }
        dx0Var.f25621k1.f();
        if (bool.booleanValue()) {
            dx0Var.Q1 = new HashMap();
            int size = dx0Var.P1.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.kz kzVar = (org.telegram.messenger.kz) dx0Var.P1.get(i10);
                dx0Var.Q1.put(kzVar.f16846a, kzVar);
                org.telegram.messenger.b8.G(dx0Var.f21584a).i0(false, 67108864, kzVar.f16846a, true);
            }
        }
        dx0Var.Z0();
    }

    private final void f() {
        int i10;
        dx0 dx0Var = (dx0) this.f27424b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f27425c;
        TLObject tLObject = (TLObject) this.d;
        org.telegram.ui.ActionBar.k2 k2Var = dx0Var.C1;
        TLRPC.StickerSet stickerSet = dx0Var.J1.set;
        if (stickerSet.masks) {
            i10 = 1;
        } else if (stickerSet.emojis) {
            i10 = 5;
        } else {
            i10 = 0;
        }
        try {
            if (tL_error == null) {
                if (dx0Var.a2) {
                    wb.g(k2Var, new gw0(dx0Var.f25631s1.getContext(), dx0Var.J1, 1, 2, null, dx0Var.I0), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    org.telegram.messenger.vi.b0(dx0Var.f21584a).A1(k2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(dx0Var.getContext(), org.telegram.messenger.dd.L0(2131751106, null), 0).show();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        org.telegram.messenger.vi.b0(dx0Var.f21584a).a1(i10, false, true);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jg.run():void");
    }

    public jg(hd0 hd0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f27423a = 14;
        this.f27424b = hd0Var;
        this.f27425c = tL_error;
        this.d = tLObject;
    }
}
