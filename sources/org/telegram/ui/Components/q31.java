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
public final class q31 implements Runnable {
    public final int f37131a;
    public final Object f37132b;
    public final Object f37133c;
    public final Object d;

    public q31(Object obj, Object obj2, Object obj3, int i7) {
        this.f37131a = i7;
        this.f37132b = obj;
        this.f37133c = obj2;
        this.d = obj3;
    }

    private final void a() {
        File file = (File) this.d;
        m4.d0 d0Var = ((vi.h) this.f37132b).f57454g;
        long j3 = ((vi.g) this.f37133c).f57445a;
        synchronized (((e0.g) d0Var.f19609b).f10055f) {
            ((HashMap) ((e0.g) d0Var.f19609b).f10056g).put(Long.valueOf(j3), file);
        }
        ((Handler) ((e0.g) d0Var.f19609b).d).post(new org.telegram.messenger.u0(d0Var, j3, (org.telegram.messenger.me) d0Var.f19608a, file, 1));
    }

    private final void b() {
        File file = (File) this.d;
        wi.q0 q0Var = ((wi.t0) this.f37132b).f58102e;
        long j3 = ((wi.p0) this.f37133c).f58034a;
        gy0 gy0Var = (gy0) q0Var;
        synchronized (gy0Var) {
            if (gy0Var.d) {
                return;
            }
            gy0Var.f34101c.put(Long.valueOf(j3), new ey0(file));
        }
    }

    @Override
    public final void run() {
        int i7;
        String absolutePath;
        Object obj;
        String absolutePath2;
        boolean z9;
        org.telegram.ui.web.b2 b2Var;
        Object obj2;
        Exception runtimeException;
        TLRPC.User a22;
        char c10 = 65535;
        byte[] bArr = null;
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = true;
        switch (this.f37131a) {
            case 0:
                r31 r31Var = (r31) this.f37132b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f37133c;
                TLObject tLObject = (TLObject) this.d;
                SparseArray sparseArray = r31Var.f37524f;
                ArrayList arrayList = r31Var.f37523e;
                ArrayList arrayList2 = r31Var.f37525n;
                SparseArray sparseArray2 = r31Var.d;
                r31Var.f37526r = false;
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_featuredStickers)) {
                    ArrayList<TLRPC.StickerSetCovered> arrayList3 = ((TLRPC.TL_messages_featuredStickers) tLObject).sets;
                    if (arrayList3.size() < 40) {
                        r31Var.f37527s = true;
                    }
                    if (!arrayList3.isEmpty()) {
                        if (arrayList2.isEmpty()) {
                            int i11 = r31Var.f37529x;
                            r31Var.f37529x = i11 + 1;
                            sparseArray2.put(i11, -1);
                        }
                        arrayList2.addAll(arrayList3);
                        int size = arrayList.size();
                        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList3.get(i12);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList.add(stickerSetCovered);
                                sparseArray.put(r31Var.f37529x, stickerSetCovered);
                                int i13 = r31Var.f37529x;
                                r31Var.f37529x = i13 + 1;
                                int i14 = size + 1;
                                sparseArray2.put(i13, Integer.valueOf(size));
                                if (!stickerSetCovered.covers.isEmpty()) {
                                    i7 = (int) Math.ceil(stickerSetCovered.covers.size() / r31Var.f37528w);
                                    for (int i15 = 0; i15 < stickerSetCovered.covers.size(); i15++) {
                                        sparseArray2.put(r31Var.f37529x + i15, stickerSetCovered.covers.get(i15));
                                    }
                                } else {
                                    sparseArray2.put(r31Var.f37529x, stickerSetCovered.cover);
                                    i7 = 1;
                                }
                                int i16 = 0;
                                while (true) {
                                    int i17 = r31Var.f37528w * i7;
                                    if (i16 < i17) {
                                        sparseArray.put(r31Var.f37529x + i16, stickerSetCovered);
                                        i16++;
                                    } else {
                                        r31Var.f37529x = i17 + r31Var.f37529x;
                                        size = i14;
                                    }
                                }
                            }
                        }
                        r31Var.f();
                        return;
                    }
                    return;
                }
                r31Var.f37527s = true;
                return;
            case 1:
                y51 y51Var = (y51) this.f37132b;
                Uri uri = (Uri) this.f37133c;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.d;
                y51Var.getClass();
                if ("tg".equals(uri.getScheme())) {
                    int intValue = Utilities.z(uri.getQueryParameter("account")).intValue();
                    Object obj3 = org.telegram.messenger.w7.G(intValue).G.get(Utilities.z(uri.getQueryParameter("rid")));
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    tL_document.access_hash = Utilities.A(uri.getQueryParameter("hash")).longValue();
                    tL_document.f26958id = Utilities.A(uri.getQueryParameter("id")).longValue();
                    tL_document.size = Utilities.A(uri.getQueryParameter("size")).longValue();
                    tL_document.dc_id = Utilities.z(uri.getQueryParameter("dc")).intValue();
                    tL_document.mime_type = uri.getQueryParameter("mime");
                    tL_document.file_reference = Utilities.v(uri.getQueryParameter("reference"));
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_documentAttributeFilename.file_name = uri.getQueryParameter("name");
                    tL_document.attributes.add(tL_documentAttributeFilename);
                    tL_document.attributes.add(new TLRPC.TL_documentAttributeVideo());
                    if (org.telegram.messenger.w7.G(intValue).T(org.telegram.messenger.w7.r(null, tL_document))) {
                        File z12 = org.telegram.messenger.w7.z(4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_document.dc_id);
                        sb2.append("_");
                        absolutePath = new File(z12, a8.p0.r(sb2, tL_document.f26958id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.w7.G(intValue);
                        absolutePath = org.telegram.messenger.w7.K(tL_document, null, false, true).getAbsolutePath();
                    }
                    y51Var.f40535b = new v5(new File(absolutePath), true, tL_document.size, 1, tL_document, null, obj3, 0L, intValue, true);
                } else {
                    y51Var.f40535b = new v5(new File(uri.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                y51Var.f40537c = y51Var.f40535b.d[4];
                float f10 = y51Var.h;
                if (f10 != 0.0f) {
                    y51Var.e(ijVar, f10, y51Var.f40546r);
                    y51Var.h = 0.0f;
                }
                org.telegram.messenger.g0.h3(new v51(y51Var, 1));
                return;
            case 2:
                y51 y51Var2 = (y51) this.f37132b;
                q51 q51Var = (q51) this.f37133c;
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) this.d;
                y51Var2.getClass();
                if (q51Var.b()) {
                    y51Var2.f40535b = new v5(new File(q51Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i18 = org.telegram.messenger.p10.f24459s0;
                    try {
                        i18 = Utilities.z(q51Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    int i19 = i18;
                    try {
                        obj = org.telegram.messenger.w7.G(i19).G.get(Utilities.z(q51Var.d.getQueryParameter("rid")));
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        obj = null;
                    }
                    TLRPC.Document document = q51Var.f37155g;
                    if (org.telegram.messenger.w7.G(i19).T(org.telegram.messenger.w7.r(null, document))) {
                        File z13 = org.telegram.messenger.w7.z(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(z13, a8.p0.r(sb3, document.f26958id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.w7.G(i19);
                        absolutePath2 = org.telegram.messenger.w7.K(document, null, false, true).getAbsolutePath();
                    }
                    y51Var2.f40535b = new v5(new File(absolutePath2), true, document.size, 1, document, null, obj, 0L, i19, true);
                }
                y51Var2.f40537c = y51Var2.f40535b.d[4];
                float f11 = y51Var2.h;
                if (f11 != 0.0f) {
                    y51Var2.e(ijVar2, f11, y51Var2.f40546r);
                    y51Var2.h = 0.0f;
                }
                org.telegram.messenger.g0.h3(new v51(y51Var2, 2));
                return;
            case 3:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.f37132b;
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.f37133c;
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
                AnimatedFileNative.d(((File) this.f37132b).getAbsolutePath(), (int[]) this.f37133c, 0L);
                org.telegram.messenger.g0.h3((bi.r7) this.d);
                return;
            case 5:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f37132b;
                q0.a aVar = (q0.a) this.f37133c;
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
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.f37132b;
                String str = (String) this.f37133c;
                String str2 = (String) this.d;
                try {
                    org.telegram.ui.web.x0 x0Var2 = botWebViewContainer$BotWebViewProxy.f51072a;
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
                String str3 = (String) this.f37133c;
                String str4 = (String) this.d;
                org.telegram.ui.web.x0 x0Var3 = ((BotWebViewContainer$WebViewProxy) this.f37132b).f51073a;
                if (x0Var3 != null && !x0Var3.f51377o0 && x0Var3.f51362c != null) {
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
                                org.telegram.ui.web.u0 u0Var = x0Var3.f51358a;
                                if (u0Var != null) {
                                    if (equals) {
                                        u0Var.f51323s = true;
                                        u0Var.f51325x = argb;
                                    } else {
                                        u0Var.f51324w = true;
                                        u0Var.f51326y = argb;
                                    }
                                    org.telegram.ui.web.u0.a(u0Var);
                                }
                                x0Var3.f51362c.o(argb, equals);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        case 2:
                            x0Var3.g("oauth_request " + str4);
                            if (x0Var3.f51358a != null) {
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
                            org.telegram.ui.web.u0 u0Var2 = x0Var3.f51358a;
                            if (u0Var2 != null) {
                                u0Var2.f51322r = str4;
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
                fi.u2 u2Var = (fi.u2) this.f37132b;
                ArrayList arrayList4 = (ArrayList) this.f37133c;
                String str5 = (String) this.d;
                ArrayList arrayList5 = new ArrayList();
                for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                    org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) arrayList4.get(i22);
                    if (fi.u2.n(y0Var.f51405c, str5) || ((b2Var = y0Var.d) != null && (fi.u2.n(b2Var.f51103c, str5) || fi.u2.n(y0Var.d.d, str5)))) {
                        arrayList5.add(y0Var);
                    }
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.w(2, u2Var, arrayList5));
                return;
            case 9:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.f37132b;
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.f37133c;
                Bitmap bitmap = (Bitmap) this.d;
                x1Var.getClass();
                if (org.telegram.ui.web.x1.f51395f != null) {
                    if ((w1Var.d > 0 && w1Var.f51352e > 0) || bitmap == null) {
                        z11 = false;
                    }
                    if (bitmap != null) {
                        x1Var.d.put(w1Var.f51350b, bitmap);
                        if (z11) {
                            int i23 = w1Var.d;
                            if (i23 == 0 && w1Var.f51352e == 0) {
                                w1Var.d = bitmap.getWidth();
                                w1Var.f51352e = bitmap.getHeight();
                            } else if (i23 == 0) {
                                w1Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * w1Var.f51352e);
                            } else if (w1Var.f51352e == 0) {
                                w1Var.f51352e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * w1Var.d);
                            }
                        }
                    }
                    ArrayList arrayList6 = (ArrayList) org.telegram.ui.web.x1.f51395f.remove(w1Var.f51350b);
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
                ((EglRenderer) this.f37132b).lambda$init$0((EglBase.Context) this.f37133c, (int[]) this.d);
                return;
            case 11:
                ((EglRenderer) this.f37132b).lambda$removeFrameListener$4((CountDownLatch) this.f37133c, (EglRenderer.FrameListener) this.d);
                return;
            case 12:
                ((VideoFileRenderer) this.f37132b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.f37133c, (VideoFrame) this.d);
                return;
            case 13:
                p4.a0 a0Var = (p4.a0) this.f37132b;
                p4.v vVar = (p4.v) this.f37133c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                p4.d0 d0Var = a0Var.f53072b;
                if (d0Var.i(vVar)) {
                    d0Var.b(keyEvent, false, false);
                } else {
                    p4.m0 m0Var = d0Var.h;
                    q4.r rVar = vVar.f53359a;
                    rVar.getClass();
                    m0Var.getClass();
                    m0Var.i0(1, new p4.g0(m0Var, 9), rVar, true);
                }
                a0Var.f53071a = null;
                return;
            case 14:
                p4.d0 d0Var2 = (p4.d0) this.f37132b;
                p4.r0 r0Var = (p4.r0) this.f37133c;
                p4.w wVar = (p4.w) this.d;
                if (!d0Var2.j()) {
                    p4.g1 g1Var = d0Var2.f53126t;
                    r0Var.getClass();
                    c8.za.b(g1Var, wVar);
                    return;
                }
                return;
            case 15:
                q2.j jVar = (q2.j) this.f37132b;
                this.f37133c.K(jVar.f53644a, jVar.f53645b, (Exception) this.d);
                return;
            case 16:
                q2.j jVar2 = (q2.j) this.f37132b;
                this.f37133c.b(jVar2.f53644a, jVar2.f53645b, (qb.a) this.d);
                return;
            case 17:
                ui.i iVar = (ui.i) this.f37132b;
                WebView webView = (WebView) this.f37133c;
                e5.f fVar = (e5.f) this.d;
                synchronized (iVar.f56850a) {
                    if (!iVar.f56868u && iVar.f56862o == webView && iVar.f56863p == fVar && !iVar.f56865r) {
                        if (iVar.f56866s) {
                            org.telegram.messenger.a8.d("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                            iVar.q();
                            return;
                        }
                        iVar.f56866s = true;
                        org.telegram.messenger.a8.d("WEB proxy: Base64 bridge installation timed out; retrying once");
                        iVar.h();
                        return;
                    }
                    return;
                }
            case 18:
                vi.h hVar = (vi.h) this.f37132b;
                byte[] bArr2 = (byte[]) this.d;
                File file = ((vi.g) this.f37133c).f57446b;
                if (hVar.G == 4) {
                    hVar.B = bArr2;
                    try {
                        hVar.p();
                        if (hVar.f57452e) {
                            l2.i0 a10 = new l2.n(hVar.f57449a).a();
                            hVar.A = a10;
                            a10.I0(hVar.F);
                            hVar.A.m0(e2.l0.b(Uri.fromFile(file)));
                            hVar.A.a();
                        }
                        hVar.s(5);
                        j2.n nVar = hVar.f57453f;
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
                ((wg.u0) this.f37132b).a(new Pair((HashMap) this.f37133c, (ArrayList) this.d));
                return;
            case 21:
                TLObject tLObject2 = (TLObject) this.d;
                org.telegram.messenger.qp qpVar = (org.telegram.messenger.qp) this.f37132b;
                wg.u0 u0Var3 = (wg.u0) this.f37133c;
                if (tLObject2 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject2;
                    qpVar.Y3(tL_channels_channelParticipants.users, false);
                    qpVar.S3(tL_channels_channelParticipants.chats, false);
                    long e14 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).e();
                    ArrayList arrayList7 = new ArrayList();
                    for (int i24 = 0; i24 < tL_channels_channelParticipants.participants.size(); i24++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i24).peer;
                        if (peer != null && org.telegram.messenger.ij.C1(peer) != e14 && (a22 = qpVar.a2(Long.valueOf(peer.user_id))) != null && !org.telegram.messenger.t10.x(a22) && !a22.bot) {
                            arrayList7.add(qpVar.m1(peer));
                        }
                    }
                    u0Var3.a(arrayList7);
                    return;
                }
                return;
            case 22:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f37133c;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.f37132b;
                org.telegram.messenger.c20 c20Var2 = (org.telegram.messenger.c20) this.d;
                if (tL_error2 != null) {
                    c20Var.a(tL_error2);
                    return;
                } else {
                    c20Var2.a(null);
                    return;
                }
            case 23:
                ((ii.c) this.f37132b).a(new Pair((HashMap) this.f37133c, (ArrayList) this.d));
                return;
            case 24:
                wi.t tVar = (wi.t) this.f37132b;
                HandlerThread handlerThread = (HandlerThread) this.f37133c;
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
                wi.t0 t0Var = (wi.t0) this.f37132b;
                wi.x xVar = (wi.x) this.f37133c;
                File file2 = (File) this.d;
                Handler handler = t0Var.f58105i;
                try {
                    xVar.c(file2);
                    t0Var.g();
                    long h = xVar.h();
                    t0Var.f58109m.b("preview snapshot completed: durationMs=" + h + ", size=" + file2.length() + ", elapsedMs=" + wi.t0.f(t0Var.M));
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
                xh.l lVar = (xh.l) this.f37132b;
                x70 x70Var = (x70) this.f37133c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                v70 v70Var = lVar.G;
                if (v70Var != null && lVar.H == x70Var) {
                    v70Var.a(clickableSpan);
                    lVar.H = null;
                    lVar.f58752y.f(true);
                    return;
                }
                return;
            case 28:
                yf.d dVar = (yf.d) this.f37132b;
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f37133c;
                String str6 = dVar.f59321b;
                int i25 = dVar.f59320a;
                if (tLObject3 != null) {
                    org.telegram.messenger.ui.b0(i25).i1(str6, (TLRPC.Document) tLObject3, false);
                } else {
                    dVar.a();
                    org.telegram.messenger.ui.b0(i25).i1(str6, null, true);
                    if (tL_error3 != null) {
                        org.telegram.messenger.qs.f(i25).d(new wi.q(7, dVar, tL_error3));
                    }
                }
                dVar.a();
                return;
            default:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f37133c;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.d;
                ((up0) this.f37132b).H = -1;
                if (tL_error4 != null) {
                    hc.a0(f2Var).f0(tL_error4, false);
                    return;
                }
                return;
        }
    }

    public q31(TLObject tLObject, org.telegram.messenger.qp qpVar, wg.u0 u0Var) {
        this.f37131a = 21;
        this.d = tLObject;
        this.f37132b = qpVar;
        this.f37133c = u0Var;
    }

    public q31(TLRPC.TL_error tL_error, org.telegram.messenger.c20 c20Var, org.telegram.messenger.c20 c20Var2) {
        this.f37131a = 22;
        this.f37133c = tL_error;
        this.f37132b = c20Var;
        this.d = c20Var2;
    }

    public q31(yf.d dVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f37131a = 28;
        this.f37132b = dVar;
        this.d = tLObject;
        this.f37133c = tL_error;
    }
}
