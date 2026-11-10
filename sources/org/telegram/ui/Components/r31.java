package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
public final class r31 implements Runnable {
    public final int f37486a;
    public final Object f37487b;
    public final Object f37488c;
    public final Object d;

    public r31(Object obj, Object obj2, Object obj3, int i7) {
        this.f37486a = i7;
        this.f37487b = obj;
        this.f37488c = obj2;
        this.d = obj3;
    }

    private final void a() {
        File file = (File) this.d;
        m4.d0 d0Var = ((vi.h) this.f37487b).f57557g;
        long j3 = ((vi.g) this.f37488c).f57548a;
        synchronized (((e0.g) d0Var.f19617b).f10060f) {
            ((HashMap) ((e0.g) d0Var.f19617b).f10061g).put(Long.valueOf(j3), file);
        }
        ((Handler) ((e0.g) d0Var.f19617b).d).post(new org.telegram.messenger.u0(d0Var, j3, (org.telegram.messenger.me) d0Var.f19616a, file, 1));
    }

    private final void b() {
        File file = (File) this.d;
        wi.q0 q0Var = ((wi.t0) this.f37487b).f58210e;
        long j3 = ((wi.p0) this.f37488c).f58138a;
        hy0 hy0Var = (hy0) q0Var;
        synchronized (hy0Var) {
            if (hy0Var.d) {
                return;
            }
            hy0Var.f34483c.put(Long.valueOf(j3), new fy0(file));
        }
    }

    @Override
    public final void run() {
        int i7;
        String absolutePath;
        Object obj;
        String absolutePath2;
        boolean z9;
        org.telegram.ui.web.a2 a2Var;
        Object obj2;
        Exception runtimeException;
        TLRPC.User a22;
        char c10 = 65535;
        byte[] bArr = null;
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = true;
        switch (this.f37486a) {
            case 0:
                s31 s31Var = (s31) this.f37487b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f37488c;
                TLObject tLObject = (TLObject) this.d;
                SparseArray sparseArray = s31Var.f37849f;
                ArrayList arrayList = s31Var.f37848e;
                ArrayList arrayList2 = s31Var.f37850n;
                SparseArray sparseArray2 = s31Var.d;
                s31Var.f37851r = false;
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_featuredStickers)) {
                    ArrayList<TLRPC.StickerSetCovered> arrayList3 = ((TLRPC.TL_messages_featuredStickers) tLObject).sets;
                    if (arrayList3.size() < 40) {
                        s31Var.f37852s = true;
                    }
                    if (!arrayList3.isEmpty()) {
                        if (arrayList2.isEmpty()) {
                            int i11 = s31Var.f37854x;
                            s31Var.f37854x = i11 + 1;
                            sparseArray2.put(i11, -1);
                        }
                        arrayList2.addAll(arrayList3);
                        int size = arrayList.size();
                        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList3.get(i12);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList.add(stickerSetCovered);
                                sparseArray.put(s31Var.f37854x, stickerSetCovered);
                                int i13 = s31Var.f37854x;
                                s31Var.f37854x = i13 + 1;
                                int i14 = size + 1;
                                sparseArray2.put(i13, Integer.valueOf(size));
                                if (!stickerSetCovered.covers.isEmpty()) {
                                    i7 = (int) Math.ceil(stickerSetCovered.covers.size() / s31Var.f37853w);
                                    for (int i15 = 0; i15 < stickerSetCovered.covers.size(); i15++) {
                                        sparseArray2.put(s31Var.f37854x + i15, stickerSetCovered.covers.get(i15));
                                    }
                                } else {
                                    sparseArray2.put(s31Var.f37854x, stickerSetCovered.cover);
                                    i7 = 1;
                                }
                                int i16 = 0;
                                while (true) {
                                    int i17 = s31Var.f37853w * i7;
                                    if (i16 < i17) {
                                        sparseArray.put(s31Var.f37854x + i16, stickerSetCovered);
                                        i16++;
                                    } else {
                                        s31Var.f37854x = i17 + s31Var.f37854x;
                                        size = i14;
                                    }
                                }
                            }
                        }
                        s31Var.f();
                        return;
                    }
                    return;
                }
                s31Var.f37852s = true;
                return;
            case 1:
                z51 z51Var = (z51) this.f37487b;
                Uri uri = (Uri) this.f37488c;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.d;
                z51Var.getClass();
                if ("tg".equals(uri.getScheme())) {
                    int intValue = Utilities.z(uri.getQueryParameter("account")).intValue();
                    Object obj3 = org.telegram.messenger.w7.G(intValue).G.get(Utilities.z(uri.getQueryParameter("rid")));
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    tL_document.access_hash = Utilities.A(uri.getQueryParameter("hash")).longValue();
                    tL_document.f26966id = Utilities.A(uri.getQueryParameter("id")).longValue();
                    tL_document.size = Utilities.A(uri.getQueryParameter("size")).longValue();
                    tL_document.dc_id = Utilities.z(uri.getQueryParameter("dc")).intValue();
                    tL_document.mime_type = uri.getQueryParameter("mime");
                    tL_document.file_reference = Utilities.v(uri.getQueryParameter("reference"));
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_documentAttributeFilename.file_name = uri.getQueryParameter("name");
                    tL_document.attributes.add(tL_documentAttributeFilename);
                    tL_document.attributes.add(new TLRPC.TL_documentAttributeVideo());
                    if (org.telegram.messenger.w7.G(intValue).S(org.telegram.messenger.w7.r(null, tL_document))) {
                        File z12 = org.telegram.messenger.w7.z(4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_document.dc_id);
                        sb2.append("_");
                        absolutePath = new File(z12, a8.p0.r(sb2, tL_document.f26966id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.w7.G(intValue);
                        absolutePath = org.telegram.messenger.w7.J(tL_document, null, false, true).getAbsolutePath();
                    }
                    z51Var.f40867b = new u5(new File(absolutePath), true, tL_document.size, 1, tL_document, null, obj3, 0L, intValue, true);
                } else {
                    z51Var.f40867b = new u5(new File(uri.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                z51Var.f40869c = z51Var.f40867b.d[4];
                float f10 = z51Var.h;
                if (f10 != 0.0f) {
                    z51Var.e(ijVar, f10, z51Var.f40878r);
                    z51Var.h = 0.0f;
                }
                org.telegram.messenger.g0.h3(new w51(z51Var, 1));
                return;
            case 2:
                z51 z51Var2 = (z51) this.f37487b;
                r51 r51Var = (r51) this.f37488c;
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) this.d;
                z51Var2.getClass();
                if (r51Var.b()) {
                    z51Var2.f40867b = new u5(new File(r51Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i18 = org.telegram.messenger.p10.f24474s0;
                    try {
                        i18 = Utilities.z(r51Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    int i19 = i18;
                    try {
                        obj = org.telegram.messenger.w7.G(i19).G.get(Utilities.z(r51Var.d.getQueryParameter("rid")));
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        obj = null;
                    }
                    TLRPC.Document document = r51Var.f37515g;
                    if (org.telegram.messenger.w7.G(i19).S(org.telegram.messenger.w7.r(null, document))) {
                        File z13 = org.telegram.messenger.w7.z(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(z13, a8.p0.r(sb3, document.f26966id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.w7.G(i19);
                        absolutePath2 = org.telegram.messenger.w7.J(document, null, false, true).getAbsolutePath();
                    }
                    z51Var2.f40867b = new u5(new File(absolutePath2), true, document.size, 1, document, null, obj, 0L, i19, true);
                }
                z51Var2.f40869c = z51Var2.f40867b.d[4];
                float f11 = z51Var2.h;
                if (f11 != 0.0f) {
                    z51Var2.e(ijVar2, f11, z51Var2.f40878r);
                    z51Var2.h = 0.0f;
                }
                org.telegram.messenger.g0.h3(new w51(z51Var2, 2));
                return;
            case 3:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.f37487b;
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.f37488c;
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) this.d;
                ValueAnimator valueAnimator = k0Var.N0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                yVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.i0(k0Var, yVar, 3)).setDuration(100L).start();
                if (yVar2 != null) {
                    yVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.w(yVar2, 3)).start();
                    return;
                }
                return;
            case 4:
                AnimatedFileNative.d(((File) this.f37487b).getAbsolutePath(), (int[]) this.f37488c, 0L);
                org.telegram.messenger.g0.h3((bi.r7) this.d);
                return;
            case 5:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f37487b;
                q0.a aVar = (q0.a) this.f37488c;
                String[] strArr = (String[]) this.d;
                x0Var.getClass();
                int length = strArr.length;
                int i20 = 0;
                while (true) {
                    if (i20 < length) {
                        if (x0Var.getContext().checkSelfPermission(strArr[i20]) == 0) {
                            i20++;
                        }
                    } else {
                        z10 = true;
                    }
                }
                aVar.accept(Boolean.valueOf(z10));
                return;
            case 6:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.f37487b;
                String str = (String) this.f37488c;
                String str2 = (String) this.d;
                try {
                    org.telegram.ui.web.x0 x0Var2 = botWebViewContainer$BotWebViewProxy.f51013a;
                    if (x0Var2 != null) {
                        boolean z14 = org.telegram.ui.web.x0.Q0;
                        x0Var2.F(botWebViewContainer$BotWebViewProxy, x0Var2.f(), str, str2);
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 7:
                String str3 = (String) this.f37488c;
                String str4 = (String) this.d;
                org.telegram.ui.web.x0 x0Var3 = ((BotWebViewContainer$WebViewProxy) this.f37487b).f51014a;
                if (x0Var3 != null && !x0Var3.f51314o0 && x0Var3.f51299c != null) {
                    if (x0Var3.G0 != null && !TextUtils.equals(x0Var3.getOriginHost(), x0Var3.G0)) {
                        x0Var3.g("onWebEventReceived ignore " + str3);
                        return;
                    }
                    x0Var3.g("onWebEventReceived " + str3 + " " + str4);
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -1695046810:
                            if (str3.equals("actionBarColor")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -462720700:
                            if (str3.equals("navigationBarColor")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 479731943:
                            if (str3.equals("oauth_request")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 675009138:
                            if (str3.equals("siteName")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 997530486:
                            if (str3.equals("allowScroll")) {
                                c10 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                        case 1:
                            try {
                                JSONArray jSONArray = new JSONArray(str4);
                                boolean equals = TextUtils.equals(str3, "actionBarColor");
                                int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                                org.telegram.ui.web.u0 u0Var = x0Var3.f51295a;
                                if (u0Var != null) {
                                    if (equals) {
                                        u0Var.f51255s = true;
                                        u0Var.f51257x = argb;
                                    } else {
                                        u0Var.f51256w = true;
                                        u0Var.f51258y = argb;
                                    }
                                    org.telegram.ui.web.u0.a(u0Var);
                                }
                                x0Var3.f51299c.o(argb, equals);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        case 2:
                            x0Var3.g("oauth_request " + str4);
                            if (x0Var3.f51295a != null) {
                                String originHost = x0Var3.getOriginHost();
                                if (!TextUtils.isEmpty(originHost)) {
                                    try {
                                        String optString = new JSONObject(str4).optString("url");
                                        x0Var3.y("oauth_supported", org.telegram.ui.web.x0.A(1, "version"));
                                        if (!TextUtils.isEmpty(optString)) {
                                            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                            tL_messages_requestUrlAuth.url = optString;
                                            int i21 = tL_messages_requestUrlAuth.flags;
                                            tL_messages_requestUrlAuth.in_app_origin = originHost;
                                            tL_messages_requestUrlAuth.flags = i21 | 12;
                                            ConnectionsManager.getInstance(x0Var3.M).sendRequest(tL_messages_requestUrlAuth, new bi.g2(x0Var3, tL_messages_requestUrlAuth, optString, originHost, 19), 2);
                                            return;
                                        }
                                        return;
                                    } catch (Exception e13) {
                                        org.telegram.messenger.a8.g(e13, true);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        case 3:
                            x0Var3.g("siteName " + str4);
                            org.telegram.ui.web.u0 u0Var2 = x0Var3.f51295a;
                            if (u0Var2 != null) {
                                u0Var2.f51254r = str4;
                                org.telegram.ui.web.u0.a(u0Var2);
                                return;
                            }
                            return;
                        case 4:
                            try {
                                JSONArray jSONArray2 = new JSONArray(str4);
                                z9 = jSONArray2.optBoolean(0, true);
                                try {
                                    z11 = jSONArray2.optBoolean(1, true);
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                                z9 = true;
                            }
                            if (x0Var3.getParent() instanceof hi.b4) {
                                hi.b4 b4Var = (hi.b4) x0Var3.getParent();
                                b4Var.O = z9;
                                b4Var.P = z11;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 8:
                fi.u2 u2Var = (fi.u2) this.f37487b;
                ArrayList arrayList4 = (ArrayList) this.f37488c;
                String str5 = (String) this.d;
                ArrayList arrayList5 = new ArrayList();
                for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                    org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) arrayList4.get(i22);
                    if (fi.u2.n(y0Var.f51339c, str5) || ((a2Var = y0Var.d) != null && (fi.u2.n(a2Var.f51028c, str5) || fi.u2.n(y0Var.d.d, str5)))) {
                        arrayList5.add(y0Var);
                    }
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.s(3, u2Var, arrayList5));
                return;
            case 9:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.f37487b;
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.f37488c;
                Bitmap bitmap = (Bitmap) this.d;
                w1Var.getClass();
                if (org.telegram.ui.web.w1.f51286f != null) {
                    if ((v1Var.d > 0 && v1Var.f51281e > 0) || bitmap == null) {
                        z11 = false;
                    }
                    if (bitmap != null) {
                        w1Var.d.put(v1Var.f51279b, bitmap);
                        if (z11) {
                            int i23 = v1Var.d;
                            if (i23 == 0 && v1Var.f51281e == 0) {
                                v1Var.d = bitmap.getWidth();
                                v1Var.f51281e = bitmap.getHeight();
                            } else if (i23 == 0) {
                                v1Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * v1Var.f51281e);
                            } else if (v1Var.f51281e == 0) {
                                v1Var.f51281e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * v1Var.d);
                            }
                        }
                    }
                    ArrayList arrayList6 = (ArrayList) org.telegram.ui.web.w1.f51286f.remove(v1Var.f51279b);
                    if (arrayList6 != null) {
                        int size2 = arrayList6.size();
                        while (i10 < size2) {
                            Object obj4 = arrayList6.get(i10);
                            i10++;
                            Pair pair = (Pair) obj4;
                            ((ImageReceiver) pair.first).v0(bitmap);
                            if (z11 && (obj2 = pair.second) != null) {
                                ((Runnable) obj2).run();
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((EglRenderer) this.f37487b).lambda$init$0((EglBase.Context) this.f37488c, (int[]) this.d);
                return;
            case 11:
                ((EglRenderer) this.f37487b).lambda$removeFrameListener$4((CountDownLatch) this.f37488c, (EglRenderer.FrameListener) this.d);
                return;
            case 12:
                ((VideoFileRenderer) this.f37487b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.f37488c, (VideoFrame) this.d);
                return;
            case 13:
                p4.a0 a0Var = (p4.a0) this.f37487b;
                p4.v vVar = (p4.v) this.f37488c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                p4.d0 d0Var = a0Var.f53175b;
                if (d0Var.i(vVar)) {
                    d0Var.b(keyEvent, false, false);
                } else {
                    p4.m0 m0Var = d0Var.h;
                    q4.r rVar = vVar.f53462a;
                    rVar.getClass();
                    m0Var.getClass();
                    m0Var.i0(1, new p4.g0(m0Var, 9), rVar, true);
                }
                a0Var.f53174a = null;
                return;
            case 14:
                p4.d0 d0Var2 = (p4.d0) this.f37487b;
                p4.r0 r0Var = (p4.r0) this.f37488c;
                p4.w wVar = (p4.w) this.d;
                if (!d0Var2.j()) {
                    p4.g1 g1Var = d0Var2.f53229t;
                    r0Var.getClass();
                    c8.ab.b(g1Var, wVar);
                    return;
                }
                return;
            case 15:
                q2.j jVar = (q2.j) this.f37487b;
                this.f37488c.K(jVar.f53748a, jVar.f53749b, (Exception) this.d);
                return;
            case 16:
                q2.j jVar2 = (q2.j) this.f37487b;
                this.f37488c.b(jVar2.f53748a, jVar2.f53749b, (qb.a) this.d);
                return;
            case 17:
                ui.i iVar = (ui.i) this.f37487b;
                WebView webView = (WebView) this.f37488c;
                e5.f fVar = (e5.f) this.d;
                synchronized (iVar.f56950a) {
                    if (!iVar.f56968u && iVar.f56962o == webView && iVar.f56963p == fVar && !iVar.f56965r) {
                        if (iVar.f56966s) {
                            org.telegram.messenger.a8.d("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                            iVar.q();
                            return;
                        }
                        iVar.f56966s = true;
                        org.telegram.messenger.a8.d("WEB proxy: Base64 bridge installation timed out; retrying once");
                        iVar.h();
                        return;
                    }
                    return;
                }
            case 18:
                vi.h hVar = (vi.h) this.f37487b;
                byte[] bArr2 = (byte[]) this.d;
                File file = ((vi.g) this.f37488c).f57549b;
                if (hVar.G == 4) {
                    hVar.B = bArr2;
                    try {
                        hVar.p();
                        if (hVar.f57555e) {
                            l2.i0 a10 = new l2.n(hVar.f57552a).a();
                            hVar.A = a10;
                            a10.I0(hVar.F);
                            hVar.A.m0(e2.l0.b(Uri.fromFile(file)));
                            hVar.A.a();
                        }
                        hVar.s(5);
                        j2.n nVar = hVar.f57556f;
                        long j3 = hVar.j();
                        byte[] bArr3 = hVar.B;
                        if (bArr3 != null) {
                            bArr = (byte[]) bArr3.clone();
                        }
                        nVar.i0(j3, bArr);
                        return;
                    } catch (Throwable th2) {
                        if (th2 instanceof Exception) {
                            runtimeException = th2;
                        } else {
                            runtimeException = new RuntimeException(th2);
                        }
                        hVar.g(runtimeException);
                        return;
                    }
                }
                return;
            case 19:
                a();
                return;
            case 20:
                ((wg.u0) this.f37487b).a(new Pair((HashMap) this.f37488c, (ArrayList) this.d));
                return;
            case 21:
                TLObject tLObject2 = (TLObject) this.d;
                org.telegram.messenger.qp qpVar = (org.telegram.messenger.qp) this.f37487b;
                wg.u0 u0Var3 = (wg.u0) this.f37488c;
                if (tLObject2 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject2;
                    qpVar.Y3(tL_channels_channelParticipants.users, false);
                    qpVar.S3(tL_channels_channelParticipants.chats, false);
                    long e14 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).e();
                    ArrayList arrayList7 = new ArrayList();
                    for (int i24 = 0; i24 < tL_channels_channelParticipants.participants.size(); i24++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i24).peer;
                        if (peer != null && org.telegram.messenger.ij.B1(peer) != e14 && (a22 = qpVar.a2(Long.valueOf(peer.user_id))) != null && !org.telegram.messenger.t10.x(a22) && !a22.bot) {
                            arrayList7.add(qpVar.m1(peer));
                        }
                    }
                    u0Var3.a(arrayList7);
                    return;
                }
                return;
            case 22:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f37488c;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.f37487b;
                org.telegram.messenger.c20 c20Var2 = (org.telegram.messenger.c20) this.d;
                if (tL_error2 != null) {
                    c20Var.a(tL_error2);
                    return;
                } else {
                    c20Var2.a(null);
                    return;
                }
            case 23:
                ((ii.c) this.f37487b).a(new Pair((HashMap) this.f37488c, (ArrayList) this.d));
                return;
            case 24:
                wi.t tVar = (wi.t) this.f37487b;
                HandlerThread handlerThread = (HandlerThread) this.f37488c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                tVar.getClass();
                try {
                    tVar.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 25:
                wi.t0 t0Var = (wi.t0) this.f37487b;
                wi.x xVar = (wi.x) this.f37488c;
                File file2 = (File) this.d;
                Handler handler = t0Var.f58213i;
                try {
                    xVar.c(file2);
                    t0Var.g();
                    long h = xVar.h();
                    t0Var.f58217m.b("preview snapshot completed: durationMs=" + h + ", size=" + file2.length() + ", elapsedMs=" + wi.t0.f(t0Var.N));
                    handler.post(new wi.f0(t0Var, h, 1));
                    return;
                } catch (Exception e15) {
                    handler.post(new wi.e0(t0Var, e15, 3));
                    return;
                }
            case 26:
                b();
                return;
            case 27:
                xh.l lVar = (xh.l) this.f37487b;
                x70 x70Var = (x70) this.f37488c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                v70 v70Var = lVar.G;
                if (v70Var != null && lVar.H == x70Var) {
                    v70Var.a(clickableSpan);
                    lVar.H = null;
                    lVar.f58854y.f(true);
                    return;
                }
                return;
            case 28:
                yf.e eVar = (yf.e) this.f37487b;
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f37488c;
                String str6 = eVar.f59426b;
                int i25 = eVar.f59425a;
                if (tLObject3 != null) {
                    org.telegram.messenger.ui.b0(i25).i1(str6, (TLRPC.Document) tLObject3, false);
                } else {
                    eVar.a();
                    org.telegram.messenger.ui.b0(i25).i1(str6, null, true);
                    if (tL_error3 != null) {
                        org.telegram.messenger.qs.f(i25).d(new yf.b(3, eVar, tL_error3));
                    }
                }
                eVar.a();
                return;
            default:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f37488c;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.d;
                ((up0) this.f37487b).H = -1;
                if (tL_error4 != null) {
                    gc.a0(f2Var).f0(tL_error4, false);
                    return;
                }
                return;
        }
    }

    public r31(TLObject tLObject, org.telegram.messenger.qp qpVar, wg.u0 u0Var) {
        this.f37486a = 21;
        this.d = tLObject;
        this.f37487b = qpVar;
        this.f37488c = u0Var;
    }

    public r31(TLRPC.TL_error tL_error, org.telegram.messenger.c20 c20Var, org.telegram.messenger.c20 c20Var2) {
        this.f37486a = 22;
        this.f37488c = tL_error;
        this.f37487b = c20Var;
        this.d = c20Var2;
    }

    public r31(yf.e eVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f37486a = 28;
        this.f37487b = eVar;
        this.d = tLObject;
        this.f37488c = tL_error;
    }
}
