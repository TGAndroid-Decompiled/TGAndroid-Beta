package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.util.SparseArray;
import android.webkit.WebView;
import android.widget.TextView;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
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
public final class fy0 implements Runnable {
    public final int f26475a;
    public final Object f26476b;
    public final Object f26477c;
    public final Object d;

    public fy0(Object obj, Object obj2, Object obj3, int i10) {
        this.f26475a = i10;
        this.f26476b = obj;
        this.f26477c = obj2;
        this.d = obj3;
    }

    private final void a() {
        File file = (File) this.d;
        si.r0 r0Var = ((si.u0) this.f26476b).e;
        long j10 = ((si.q0) this.f26477c).f47189a;
        d11 d11Var = (d11) r0Var;
        synchronized (d11Var) {
            if (d11Var.d) {
                return;
            }
            d11Var.f25485c.put(Long.valueOf(j10), new b11(file));
        }
    }

    @Override
    public final void run() {
        Uri uri;
        String stickerExt;
        int i10;
        int i11;
        int i12;
        String absolutePath;
        String absolutePath2;
        boolean z10;
        org.telegram.ui.web.m2 m2Var;
        Object obj;
        Exception runtimeException;
        TLRPC.User user;
        char c10 = 65535;
        Boolean bool = null;
        Object obj2 = null;
        byte[] bArr = null;
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = true;
        switch (this.f26475a) {
            case 0:
                ty0.I((ty0) this.f26476b, (String) this.f26477c, (TextView) this.d);
                return;
            case 1:
                ty0 ty0Var = (ty0) this.f26476b;
                ArrayList arrayList = (ArrayList) this.f26477c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    Object obj3 = arrayList.get(i14);
                    if ((obj3 instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj3))) != null) {
                        boolean equals = "tgs".equals(stickerExt);
                        if (bool == null) {
                            bool = Boolean.valueOf(equals);
                        } else if (bool.booleanValue() != equals) {
                            continue;
                        }
                        if (!ty0Var.isDismissed()) {
                            SendMessagesHelper.ImportingSticker importingSticker = new SendMessagesHelper.ImportingSticker();
                            importingSticker.animated = equals;
                            if (equals) {
                                i10 = 64;
                            } else {
                                i10 = 512;
                            }
                            String copyFileToCache = MediaController.copyFileToCache(uri, stickerExt, i10 * 1024);
                            importingSticker.path = copyFileToCache;
                            if (copyFileToCache != null) {
                                if (!equals) {
                                    BitmapFactory.decodeFile(copyFileToCache, options);
                                    int i15 = options.outWidth;
                                    if ((i15 == 512 && (i11 = options.outHeight) > 0 && i11 <= 512) || (options.outHeight == 512 && i15 > 0 && i15 <= 512)) {
                                        importingSticker.mimeType = "image/".concat(stickerExt);
                                        importingSticker.validated = true;
                                    }
                                } else {
                                    importingSticker.mimeType = "application/x-tgsticker";
                                }
                                if (arrayList2 != null && arrayList2.size() == size && (arrayList2.get(i14) instanceof String)) {
                                    importingSticker.emoji = (String) arrayList2.get(i14);
                                } else {
                                    importingSticker.emoji = "#️⃣";
                                }
                                arrayList3.add(importingSticker);
                                if (arrayList3.size() >= 200) {
                                    AndroidUtilities.runOnUIThread(new lg(ty0Var, arrayList3, bool, 28));
                                    return;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new lg(ty0Var, arrayList3, bool, 28));
                return;
            case 2:
                h61 h61Var = (h61) this.f26476b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f26477c;
                TLObject tLObject = (TLObject) this.d;
                SparseArray sparseArray = h61Var.f26804f;
                ArrayList arrayList4 = h61Var.e;
                ArrayList arrayList5 = h61Var.f26805n;
                SparseArray sparseArray2 = h61Var.d;
                h61Var.f26806r = false;
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_featuredStickers)) {
                    ArrayList<TLRPC.StickerSetCovered> arrayList6 = ((TLRPC.TL_messages_featuredStickers) tLObject).sets;
                    if (arrayList6.size() < 40) {
                        h61Var.f26807s = true;
                    }
                    if (!arrayList6.isEmpty()) {
                        if (arrayList5.isEmpty()) {
                            int i16 = h61Var.f26808w;
                            h61Var.f26808w = i16 + 1;
                            sparseArray2.put(i16, -1);
                        }
                        arrayList5.addAll(arrayList6);
                        int size2 = arrayList4.size();
                        for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList6.get(i17);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList4.add(stickerSetCovered);
                                sparseArray.put(h61Var.f26808w, stickerSetCovered);
                                int i18 = h61Var.f26808w;
                                h61Var.f26808w = i18 + 1;
                                int i19 = size2 + 1;
                                sparseArray2.put(i18, Integer.valueOf(size2));
                                if (!stickerSetCovered.covers.isEmpty()) {
                                    i12 = (int) Math.ceil(stickerSetCovered.covers.size() / h61Var.v);
                                    for (int i20 = 0; i20 < stickerSetCovered.covers.size(); i20++) {
                                        sparseArray2.put(h61Var.f26808w + i20, stickerSetCovered.covers.get(i20));
                                    }
                                } else {
                                    sparseArray2.put(h61Var.f26808w, stickerSetCovered.cover);
                                    i12 = 1;
                                }
                                int i21 = 0;
                                while (true) {
                                    int i22 = h61Var.v * i12;
                                    if (i21 < i22) {
                                        sparseArray.put(h61Var.f26808w + i21, stickerSetCovered);
                                        i21++;
                                    } else {
                                        h61Var.f26808w = i22 + h61Var.f26808w;
                                        size2 = i19;
                                    }
                                }
                            }
                        }
                        h61Var.l();
                        return;
                    }
                    return;
                }
                h61Var.f26807s = true;
                return;
            case 3:
                q81 q81Var = (q81) this.f26476b;
                Uri uri2 = (Uri) this.f26477c;
                MessageObject messageObject = (MessageObject) this.d;
                q81Var.getClass();
                if ("tg".equals(uri2.getScheme())) {
                    int intValue = Utilities.parseInt((CharSequence) uri2.getQueryParameter("account")).intValue();
                    Object parentObject = FileLoader.getInstance(intValue).getParentObject(Utilities.parseInt((CharSequence) uri2.getQueryParameter("rid")).intValue());
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    tL_document.access_hash = Utilities.parseLong(uri2.getQueryParameter("hash")).longValue();
                    tL_document.f20349id = Utilities.parseLong(uri2.getQueryParameter("id")).longValue();
                    tL_document.size = Utilities.parseLong(uri2.getQueryParameter("size")).longValue();
                    tL_document.dc_id = Utilities.parseInt((CharSequence) uri2.getQueryParameter("dc")).intValue();
                    tL_document.mime_type = uri2.getQueryParameter("mime");
                    tL_document.file_reference = Utilities.hexToBytes(uri2.getQueryParameter("reference"));
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_documentAttributeFilename.file_name = uri2.getQueryParameter("name");
                    tL_document.attributes.add(tL_documentAttributeFilename);
                    tL_document.attributes.add(new TLRPC.TL_documentAttributeVideo());
                    if (FileLoader.getInstance(intValue).isLoadingFile(FileLoader.getAttachFileName(tL_document))) {
                        File directory = FileLoader.getDirectory(4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_document.dc_id);
                        sb2.append("_");
                        absolutePath = new File(directory, a1.g.r(sb2, tL_document.f20349id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath = FileLoader.getInstance(intValue).getPathToAttach(tL_document, false).getAbsolutePath();
                    }
                    q81Var.f29790b = new e6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    q81Var.f29790b = new e6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                q81Var.f29792c = q81Var.f29790b.d[4];
                float f7 = q81Var.h;
                if (f7 != 0.0f) {
                    q81Var.e(messageObject, f7, q81Var.f29800r);
                    q81Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new m81(q81Var, 1));
                return;
            case 4:
                q81 q81Var2 = (q81) this.f26476b;
                h81 h81Var = (h81) this.f26477c;
                MessageObject messageObject2 = (MessageObject) this.d;
                q81Var2.getClass();
                if (h81Var.b()) {
                    q81Var2.f29790b = new e6(new File(h81Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i23 = UserConfig.selectedAccount;
                    try {
                        i23 = Utilities.parseInt((CharSequence) h81Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    int i24 = i23;
                    try {
                        obj2 = FileLoader.getInstance(i24).getParentObject(Utilities.parseInt((CharSequence) h81Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    Object obj4 = obj2;
                    TLRPC.Document document = h81Var.f26831g;
                    if (FileLoader.getInstance(i24).isLoadingFile(FileLoader.getAttachFileName(document))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(directory2, a1.g.r(sb3, document.f20349id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i24).getPathToAttach(document, false).getAbsolutePath();
                    }
                    q81Var2.f29790b = new e6(new File(absolutePath2), true, document.size, 1, document, null, obj4, 0L, i24, true);
                }
                q81Var2.f29792c = q81Var2.f29790b.d[4];
                float f10 = q81Var2.h;
                if (f10 != 0.0f) {
                    q81Var2.e(messageObject2, f10, q81Var2.f29800r);
                    q81Var2.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new m81(q81Var2, 2));
                return;
            case 5:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.f26476b;
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f26477c;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.d;
                ValueAnimator valueAnimator = l0Var.N0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                tVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.k0(l0Var, tVar)).setDuration(100L).start();
                if (tVar2 != null) {
                    tVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.x(tVar2)).start();
                    return;
                }
                return;
            case 6:
                AnimatedFileNative.d(((File) this.f26476b).getAbsolutePath(), (int[]) this.f26477c, 0L);
                AndroidUtilities.runOnUIThread((ai.v7) this.d);
                return;
            case 7:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f26476b;
                q0.a aVar = (q0.a) this.f26477c;
                String[] strArr = (String[]) this.d;
                b1Var.getClass();
                int length = strArr.length;
                int i25 = 0;
                while (true) {
                    if (i25 < length) {
                        if (b1Var.getContext().checkSelfPermission(strArr[i25]) == 0) {
                            i25++;
                        }
                    } else {
                        z11 = true;
                    }
                }
                aVar.accept(Boolean.valueOf(z11));
                return;
            case 8:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.f26476b;
                String str = (String) this.f26477c;
                String str2 = (String) this.d;
                botWebViewContainer$BotWebViewProxy.getClass();
                try {
                    org.telegram.ui.web.b1 b1Var2 = botWebViewContainer$BotWebViewProxy.f43023a;
                    if (b1Var2 != null) {
                        boolean z13 = org.telegram.ui.web.b1.Q0;
                        b1Var2.E(botWebViewContainer$BotWebViewProxy, b1Var2.f(), str, str2);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 9:
                String str3 = (String) this.f26477c;
                String str4 = (String) this.d;
                org.telegram.ui.web.b1 b1Var3 = ((BotWebViewContainer$WebViewProxy) this.f26476b).f43024a;
                if (b1Var3 != null && !b1Var3.f43061o0 && b1Var3.f43047c != null) {
                    if (b1Var3.G0 != null && !TextUtils.equals(b1Var3.getOriginHost(), b1Var3.G0)) {
                        b1Var3.g("onWebEventReceived ignore " + str3);
                        return;
                    }
                    b1Var3.g("onWebEventReceived " + str3 + " " + str4);
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
                                boolean equals2 = TextUtils.equals(str3, "actionBarColor");
                                int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                                org.telegram.ui.web.y0 y0Var = b1Var3.f43043a;
                                if (y0Var != null) {
                                    if (equals2) {
                                        y0Var.f43334s = true;
                                        y0Var.f43335w = argb;
                                    } else {
                                        y0Var.v = true;
                                        y0Var.f43336x = argb;
                                    }
                                    org.telegram.ui.web.y0.a(y0Var);
                                }
                                b1Var3.f43047c.o(argb, equals2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        case 2:
                            b1Var3.g("oauth_request " + str4);
                            if (b1Var3.f43043a != null) {
                                String originHost = b1Var3.getOriginHost();
                                if (!TextUtils.isEmpty(originHost)) {
                                    try {
                                        String optString = new JSONObject(str4).optString("url");
                                        b1Var3.y("oauth_supported", org.telegram.ui.web.b1.A(1, "version"));
                                        if (!TextUtils.isEmpty(optString)) {
                                            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                            tL_messages_requestUrlAuth.url = optString;
                                            int i26 = tL_messages_requestUrlAuth.flags;
                                            tL_messages_requestUrlAuth.in_app_origin = originHost;
                                            tL_messages_requestUrlAuth.flags = i26 | 12;
                                            ConnectionsManager.getInstance(b1Var3.M).sendRequest(tL_messages_requestUrlAuth, new ai.k2(b1Var3, tL_messages_requestUrlAuth, optString, originHost, 19), 2);
                                            return;
                                        }
                                        return;
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        case 3:
                            b1Var3.g("siteName " + str4);
                            org.telegram.ui.web.y0 y0Var2 = b1Var3.f43043a;
                            if (y0Var2 != null) {
                                y0Var2.f43333r = str4;
                                org.telegram.ui.web.y0.a(y0Var2);
                                return;
                            }
                            return;
                        case 4:
                            try {
                                JSONArray jSONArray2 = new JSONArray(str4);
                                z10 = jSONArray2.optBoolean(0, true);
                                try {
                                    z12 = jSONArray2.optBoolean(1, true);
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                                z10 = true;
                            }
                            if (b1Var3.getParent() instanceof gi.e4) {
                                gi.e4 e4Var = (gi.e4) b1Var3.getParent();
                                e4Var.O = z10;
                                e4Var.P = z12;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 10:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.f26476b;
                ArrayList arrayList7 = (ArrayList) this.d;
                String str5 = (String) this.f26477c;
                ArrayList arrayList8 = new ArrayList();
                for (int i27 = 0; i27 < arrayList7.size(); i27++) {
                    org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) arrayList7.get(i27);
                    if (org.telegram.ui.web.f1.w(c1Var.f43089c, str5) || ((m2Var = c1Var.d) != null && (org.telegram.ui.web.f1.w(m2Var.f43198c, str5) || org.telegram.ui.web.f1.w(c1Var.d.d, str5)))) {
                        arrayList8.add(c1Var);
                    }
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.y3(24, f1Var, arrayList8));
                return;
            case 11:
                org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) this.f26476b;
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) this.f26477c;
                Bitmap bitmap = (Bitmap) this.d;
                i2Var.getClass();
                if (org.telegram.ui.web.i2.f43150f != null) {
                    if ((h2Var.d > 0 && h2Var.e > 0) || bitmap == null) {
                        z12 = false;
                    }
                    if (bitmap != null) {
                        i2Var.d.put(h2Var.f43136b, bitmap);
                        if (z12) {
                            int i28 = h2Var.d;
                            if (i28 == 0 && h2Var.e == 0) {
                                h2Var.d = bitmap.getWidth();
                                h2Var.e = bitmap.getHeight();
                            } else if (i28 == 0) {
                                h2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * h2Var.e);
                            } else if (h2Var.e == 0) {
                                h2Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * h2Var.d);
                            }
                        }
                    }
                    ArrayList arrayList9 = (ArrayList) org.telegram.ui.web.i2.f43150f.remove(h2Var.f43136b);
                    if (arrayList9 != null) {
                        int size3 = arrayList9.size();
                        while (i13 < size3) {
                            Object obj5 = arrayList9.get(i13);
                            i13++;
                            Pair pair = (Pair) obj5;
                            ((ImageReceiver) pair.first).setImageBitmap(bitmap);
                            if (z12 && (obj = pair.second) != null) {
                                ((Runnable) obj).run();
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((EglRenderer) this.f26476b).lambda$init$0((EglBase.Context) this.f26477c, (int[]) this.d);
                return;
            case 13:
                ((EglRenderer) this.f26476b).lambda$removeFrameListener$4((CountDownLatch) this.f26477c, (EglRenderer.FrameListener) this.d);
                return;
            case 14:
                ((VideoFileRenderer) this.f26476b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.f26477c, (VideoFrame) this.d);
                return;
            case 15:
                qi.i iVar = (qi.i) this.f26476b;
                WebView webView = (WebView) this.f26477c;
                b5.h hVar = (b5.h) this.d;
                synchronized (iVar.f45186a) {
                    if (!iVar.f45203u && iVar.f45197o == webView && iVar.f45198p == hVar && !iVar.f45200r) {
                        if (iVar.f45201s) {
                            FileLog.e("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                            iVar.o();
                            return;
                        }
                        iVar.f45201s = true;
                        FileLog.e("WEB proxy: Base64 bridge installation timed out; retrying once");
                        iVar.f();
                        return;
                    }
                    return;
                }
            case 16:
                ri.o oVar = (ri.o) this.f26476b;
                byte[] bArr2 = (byte[]) this.d;
                File file = ((ri.i) this.f26477c).f46241b;
                if (oVar.f46267n == ri.m.d) {
                    oVar.C = bArr2;
                    try {
                        oVar.o();
                        if (oVar.e) {
                            i2.h0 a2 = new i2.o(oVar.f46257a).a();
                            oVar.B = a2;
                            a2.p0(oVar.G);
                            oVar.B.r0(b2.o0.b(Uri.fromFile(file)));
                            oVar.B.b();
                        }
                        oVar.r(ri.m.e);
                        ri.f fVar = oVar.f46260f;
                        long j10 = oVar.j();
                        long j11 = oVar.f46272s;
                        long j12 = oVar.f46273t;
                        byte[] bArr3 = oVar.C;
                        if (bArr3 != null) {
                            bArr = (byte[]) bArr3.clone();
                        }
                        fVar.onPreviewReady(j10, j11, j12, bArr);
                        return;
                    } catch (Throwable th2) {
                        if (th2 instanceof Exception) {
                            runtimeException = th2;
                        } else {
                            runtimeException = new RuntimeException(th2);
                        }
                        oVar.g(runtimeException);
                        return;
                    }
                }
                return;
            case 17:
                ((ri.o) this.f26476b).f46261g.onOutputStarted(((ri.i) this.f26477c).f46240a, (File) this.d);
                return;
            case 18:
                ((ri.o) this.f26476b).f46261g.onOutputError(((ri.i) this.f26477c).f46240a, (Exception) this.d);
                return;
            case 19:
                ((ri.o) this.f26476b).f46261g.onOutputInvalidated(((ri.i) this.f26477c).f46240a, (ri.j) this.d);
                return;
            case 20:
                si.t tVar3 = (si.t) this.f26476b;
                HandlerThread handlerThread = (HandlerThread) this.f26477c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                tVar3.getClass();
                try {
                    tVar3.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 21:
                si.u0 u0Var = (si.u0) this.f26476b;
                si.w wVar = (si.w) this.f26477c;
                File file2 = (File) this.d;
                Handler handler = u0Var.f47254i;
                try {
                    wVar.c(file2);
                    u0Var.g();
                    long e12 = w7.m7.e(file2) / 1000;
                    u0Var.f47258m.b("preview snapshot completed: durationMs=" + e12 + ", size=" + file2.length() + ", elapsedMs=" + si.u0.f(u0Var.J));
                    handler.post(new si.f0(u0Var, e12, 1));
                    return;
                } catch (Exception e13) {
                    handler.post(new si.e0(u0Var, e13, 3));
                    return;
                }
            case 22:
                a();
                return;
            case 23:
                ((ug.v0) this.f26476b).run(new Pair((HashMap) this.f26477c, (ArrayList) this.d));
                return;
            case 24:
                TLObject tLObject2 = (TLObject) this.f26476b;
                MessagesController messagesController = (MessagesController) this.f26477c;
                ug.v0 v0Var = (ug.v0) this.d;
                if (tLObject2 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject2;
                    messagesController.putUsers(tL_channels_channelParticipants.users, false);
                    messagesController.putChats(tL_channels_channelParticipants.chats, false);
                    long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    ArrayList arrayList10 = new ArrayList();
                    for (int i29 = 0; i29 < tL_channels_channelParticipants.participants.size(); i29++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i29).peer;
                        if (peer != null && MessageObject.getPeerId(peer) != clientUserId && (user = messagesController.getUser(Long.valueOf(peer.user_id))) != null && !UserObject.isDeleted(user) && !user.bot) {
                            arrayList10.add(messagesController.getInputPeer(peer));
                        }
                    }
                    v0Var.run(arrayList10);
                    return;
                }
                return;
            case 25:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f26476b;
                Utilities.Callback callback = (Utilities.Callback) this.f26477c;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    return;
                } else {
                    callback2.run(null);
                    return;
                }
            case 26:
                ((ig.k0) this.f26476b).run(new Pair((HashMap) this.f26477c, (ArrayList) this.d));
                return;
            case 27:
                wf.d dVar = (wf.d) this.f26476b;
                TLObject tLObject3 = (TLObject) this.f26477c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                String str6 = dVar.f49387b;
                int i30 = dVar.f49386a;
                if (tLObject3 != null) {
                    MediaDataController.getInstance(i30).onRingtoneUploaded(str6, (TLRPC.Document) tLObject3, false);
                } else {
                    dVar.a();
                    MediaDataController.getInstance(i30).onRingtoneUploaded(str6, null, true);
                    if (tL_error3 != null) {
                        NotificationCenter.getInstance(i30).doOnIdle(new u2.k0(14, dVar, tL_error3));
                    }
                }
                dVar.a();
                return;
            case 28:
                wh.n nVar = (wh.n) this.f26476b;
                z90 z90Var = (z90) this.f26477c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                x90 x90Var = nVar.G;
                if (x90Var != null && nVar.H == z90Var) {
                    x90Var.a(clickableSpan);
                    nVar.H = null;
                    nVar.f49554x.d(true);
                    return;
                }
                return;
            default:
                u4.f fVar2 = (u4.f) this.f26476b;
                Executor executor = (Executor) this.f26477c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    ((Task) fVar2.call()).continueWith(executor, new x9.v(2, taskCompletionSource));
                    return;
                } catch (Exception e14) {
                    taskCompletionSource.setException(e14);
                    return;
                }
        }
    }

    public fy0(org.telegram.ui.web.f1 f1Var, ArrayList arrayList, String str) {
        this.f26475a = 10;
        this.f26476b = f1Var;
        this.d = arrayList;
        this.f26477c = str;
    }
}
