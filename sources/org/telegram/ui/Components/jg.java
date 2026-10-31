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
    public final int f27368a;
    public final Object f27369b;
    public final Object f27370c;
    public final Object d;

    public jg(Object obj, Object obj2, Object obj3, int i10) {
        this.f27368a = i10;
        this.f27369b = obj;
        this.f27370c = obj2;
        this.d = obj3;
    }

    private final void a() {
        InputStream errorStream;
        JSONObject optJSONObject;
        String optString;
        String str = (String) this.f27370c;
        WebResourceRequest webResourceRequest = (WebResourceRequest) this.d;
        org.telegram.ui.mr0 mr0Var = (org.telegram.ui.mr0) ((ji.i) this.f27369b).f10446b;
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
            outputStream.write(jSONObject.put("context", jSONObject2.put("client", put.put("originalUrl", "https://www.youtube.com/watch?v=" + mr0Var.f31242x).put("platform", "DESKTOP"))).put("videoId", mr0Var.f31242x).toString().getBytes("UTF-8"));
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
                if (mr0Var.H == 0) {
                    mr0Var.f31240s = optString;
                } else {
                    ve0.a(mr0Var, optString);
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
        qs0 qs0Var = (qs0) this.f27369b;
        ArrayList arrayList2 = (ArrayList) this.d;
        org.telegram.ui.ActionBar.k2 k2Var = qs0Var.f29738s.f33240x1;
        String lowerCase = ((String) this.f27370c).trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.i0.g3(new jg(qs0Var, new ArrayList(), new ArrayList(), 23));
            return;
        }
        boolean z11 = true;
        boolean z12 = 0;
        String R0 = org.telegram.messenger.cd.D0().R0(lowerCase, true, false);
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
                    C1 = org.telegram.messenger.jj.C1(((TLRPC.ChannelParticipant) tLObject).peer);
                }
                arrayList = arrayList2;
                z10 = z11;
                i12++;
                z11 = z10;
                arrayList2 = arrayList;
                z12 = 0;
            }
            TLRPC.User Z1 = k2Var.getMessagesController().Z1(Long.valueOf(C1));
            if (Z1.f19942id != k2Var.getUserConfig().e()) {
                String lowerCase2 = org.telegram.messenger.h20.p(Z1).toLowerCase();
                String R02 = org.telegram.messenger.cd.D0().R0(lowerCase2, z11, z12);
                if (lowerCase2.equals(R02)) {
                    R02 = null;
                }
                boolean z13 = z12;
                for (int i13 = z12; i13 < i11; i13++) {
                    String str = strArr[i13];
                    if (!lowerCase2.startsWith(str) && !sc.e.y(" ", str, lowerCase2) && (R02 == null || (!R02.startsWith(str) && !sc.e.y(" ", str, R02)))) {
                        String n10 = org.telegram.messenger.h20.n(Z1);
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
                            arrayList3.add(org.telegram.messenger.i0.r0("@" + org.telegram.messenger.h20.n(Z1), null, "@" + str));
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
        org.telegram.messenger.i0.g3(new jg(qs0Var, arrayList3, arrayList4, 23));
    }

    private final void c() {
        int i10;
        TLRPC.Document document;
        boolean z10;
        String str;
        us0 us0Var = (us0) this.f27369b;
        ArrayList arrayList = (ArrayList) this.d;
        us0Var.getClass();
        String lowerCase = ((String) this.f27370c).trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.i0.g3(new gi0(12, us0Var, new ArrayList()));
            return;
        }
        String R0 = org.telegram.messenger.cd.D0().R0(lowerCase, true, false);
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
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i12);
            int i13 = 0;
            while (true) {
                if (i13 < i11) {
                    String str2 = strArr[i13];
                    String I0 = jjVar.I0();
                    if (I0 != null && I0.length() != 0) {
                        if (I0.toLowerCase().contains(str2)) {
                            arrayList2.add(jjVar);
                            break;
                        } else if (us0Var.f31034r == 4) {
                            if (jjVar.D == 0) {
                                document = org.telegram.messenger.jj.o1(jjVar.f16337k).webpage.document;
                            } else {
                                document = org.telegram.messenger.jj.o1(jjVar.f16337k).document;
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
                                arrayList2.add(jjVar);
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
        org.telegram.messenger.i0.g3(new gi0(12, us0Var, arrayList2));
    }

    private final void d() {
        cx0 cx0Var = (cx0) this.f27369b;
        ArrayList arrayList = (ArrayList) this.f27370c;
        Boolean bool = (Boolean) this.d;
        cx0Var.P1 = arrayList;
        if (arrayList.isEmpty()) {
            cx0Var.dismiss();
            return;
        }
        cx0Var.f25208k1.f();
        if (bool.booleanValue()) {
            cx0Var.Q1 = new HashMap();
            int size = cx0Var.P1.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.jz jzVar = (org.telegram.messenger.jz) cx0Var.P1.get(i10);
                cx0Var.Q1.put(jzVar.f16493a, jzVar);
                org.telegram.messenger.b8.G(cx0Var.f21583a).i0(false, 67108864, jzVar.f16493a, true);
            }
        }
        cx0Var.Z0();
    }

    private final void f() {
        int i10;
        cx0 cx0Var = (cx0) this.f27369b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f27370c;
        TLObject tLObject = (TLObject) this.d;
        org.telegram.ui.ActionBar.k2 k2Var = cx0Var.C1;
        TLRPC.StickerSet stickerSet = cx0Var.J1.set;
        if (stickerSet.masks) {
            i10 = 1;
        } else if (stickerSet.emojis) {
            i10 = 5;
        } else {
            i10 = 0;
        }
        try {
            if (tL_error == null) {
                if (cx0Var.a2) {
                    wb.g(k2Var, new fw0(cx0Var.f25218s1.getContext(), cx0Var.J1, 1, 2, null, cx0Var.I0), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    org.telegram.messenger.ui.b0(cx0Var.f21583a).A1(k2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(cx0Var.getContext(), org.telegram.messenger.cd.L0(2131751106, null), 0).show();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        org.telegram.messenger.ui.b0(cx0Var.f21583a).a1(i10, false, true);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jg.run():void");
    }

    public jg(hd0 hd0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f27368a = 14;
        this.f27369b = hd0Var;
        this.f27370c = tL_error;
        this.d = tLObject;
    }
}
