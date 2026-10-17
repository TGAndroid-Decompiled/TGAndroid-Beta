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
public final class ay0 implements Runnable {
    public final int f24739a;
    public final Object f24740b;
    public final Object f24741c;
    public final Object d;

    public ay0(Object obj, Object obj2, Object obj3, int i10) {
        this.f24739a = i10;
        this.f24740b = obj;
        this.f24741c = obj2;
        this.d = obj3;
    }

    private final void a() {
        File file = (File) this.d;
        si.q0 q0Var = ((si.t0) this.f24740b).e;
        long j10 = ((si.p0) this.f24741c).f46768a;
        y01 y01Var = (y01) q0Var;
        synchronized (y01Var) {
            if (y01Var.d) {
                return;
            }
            y01Var.f32506c.put(Long.valueOf(j10), new w01(file));
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
        org.telegram.ui.web.l2 l2Var;
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
        switch (this.f24739a) {
            case 0:
                oy0.H((oy0) this.f24740b, (String) this.f24741c, (TextView) this.d);
                return;
            case 1:
                oy0 oy0Var = (oy0) this.f24740b;
                ArrayList arrayList = (ArrayList) this.f24741c;
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
                        if (!oy0Var.isDismissed()) {
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
                                    AndroidUtilities.runOnUIThread(new lg(oy0Var, arrayList3, bool, 28));
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
                AndroidUtilities.runOnUIThread(new lg(oy0Var, arrayList3, bool, 28));
                return;
            case 2:
                a61 a61Var = (a61) this.f24740b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f24741c;
                TLObject tLObject = (TLObject) this.d;
                SparseArray sparseArray = a61Var.f24503f;
                ArrayList arrayList4 = a61Var.e;
                ArrayList arrayList5 = a61Var.f24504n;
                SparseArray sparseArray2 = a61Var.d;
                a61Var.f24505r = false;
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_featuredStickers)) {
                    ArrayList<TLRPC.StickerSetCovered> arrayList6 = ((TLRPC.TL_messages_featuredStickers) tLObject).sets;
                    if (arrayList6.size() < 40) {
                        a61Var.f24506s = true;
                    }
                    if (!arrayList6.isEmpty()) {
                        if (arrayList5.isEmpty()) {
                            int i16 = a61Var.f24507w;
                            a61Var.f24507w = i16 + 1;
                            sparseArray2.put(i16, -1);
                        }
                        arrayList5.addAll(arrayList6);
                        int size2 = arrayList4.size();
                        for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList6.get(i17);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList4.add(stickerSetCovered);
                                sparseArray.put(a61Var.f24507w, stickerSetCovered);
                                int i18 = a61Var.f24507w;
                                a61Var.f24507w = i18 + 1;
                                int i19 = size2 + 1;
                                sparseArray2.put(i18, Integer.valueOf(size2));
                                if (!stickerSetCovered.covers.isEmpty()) {
                                    i12 = (int) Math.ceil(stickerSetCovered.covers.size() / a61Var.v);
                                    for (int i20 = 0; i20 < stickerSetCovered.covers.size(); i20++) {
                                        sparseArray2.put(a61Var.f24507w + i20, stickerSetCovered.covers.get(i20));
                                    }
                                } else {
                                    sparseArray2.put(a61Var.f24507w, stickerSetCovered.cover);
                                    i12 = 1;
                                }
                                int i21 = 0;
                                while (true) {
                                    int i22 = a61Var.v * i12;
                                    if (i21 < i22) {
                                        sparseArray.put(a61Var.f24507w + i21, stickerSetCovered);
                                        i21++;
                                    } else {
                                        a61Var.f24507w = i22 + a61Var.f24507w;
                                        size2 = i19;
                                    }
                                }
                            }
                        }
                        a61Var.l();
                        return;
                    }
                    return;
                }
                a61Var.f24506s = true;
                return;
            case 3:
                h81 h81Var = (h81) this.f24740b;
                Uri uri2 = (Uri) this.f24741c;
                MessageObject messageObject = (MessageObject) this.d;
                h81Var.getClass();
                if ("tg".equals(uri2.getScheme())) {
                    int intValue = Utilities.parseInt((CharSequence) uri2.getQueryParameter("account")).intValue();
                    Object parentObject = FileLoader.getInstance(intValue).getParentObject(Utilities.parseInt((CharSequence) uri2.getQueryParameter("rid")).intValue());
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    tL_document.access_hash = Utilities.parseLong(uri2.getQueryParameter("hash")).longValue();
                    tL_document.f20278id = Utilities.parseLong(uri2.getQueryParameter("id")).longValue();
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
                        absolutePath = new File(directory, a1.g.r(sb2, tL_document.f20278id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath = FileLoader.getInstance(intValue).getPathToAttach(tL_document, false).getAbsolutePath();
                    }
                    h81Var.f26795b = new e6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    h81Var.f26795b = new e6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                h81Var.f26797c = h81Var.f26795b.d[4];
                float f7 = h81Var.h;
                if (f7 != 0.0f) {
                    h81Var.e(messageObject, f7, h81Var.f26805r);
                    h81Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new d81(h81Var, 1));
                return;
            case 4:
                h81 h81Var2 = (h81) this.f24740b;
                y71 y71Var = (y71) this.f24741c;
                MessageObject messageObject2 = (MessageObject) this.d;
                h81Var2.getClass();
                if (y71Var.b()) {
                    h81Var2.f26795b = new e6(new File(y71Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i23 = UserConfig.selectedAccount;
                    try {
                        i23 = Utilities.parseInt((CharSequence) y71Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    int i24 = i23;
                    try {
                        obj2 = FileLoader.getInstance(i24).getParentObject(Utilities.parseInt((CharSequence) y71Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    Object obj4 = obj2;
                    TLRPC.Document document = y71Var.f32561g;
                    if (FileLoader.getInstance(i24).isLoadingFile(FileLoader.getAttachFileName(document))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(directory2, a1.g.r(sb3, document.f20278id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i24).getPathToAttach(document, false).getAbsolutePath();
                    }
                    h81Var2.f26795b = new e6(new File(absolutePath2), true, document.size, 1, document, null, obj4, 0L, i24, true);
                }
                h81Var2.f26797c = h81Var2.f26795b.d[4];
                float f10 = h81Var2.h;
                if (f10 != 0.0f) {
                    h81Var2.e(messageObject2, f10, h81Var2.f26805r);
                    h81Var2.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new d81(h81Var2, 2));
                return;
            case 5:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.f24740b;
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f24741c;
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
                AnimatedFileNative.d(((File) this.f24740b).getAbsolutePath(), (int[]) this.f24741c, 0L);
                AndroidUtilities.runOnUIThread((ai.u7) this.d);
                return;
            case 7:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f24740b;
                q0.a aVar = (q0.a) this.f24741c;
                String[] strArr = (String[]) this.d;
                a1Var.getClass();
                int length = strArr.length;
                int i25 = 0;
                while (true) {
                    if (i25 < length) {
                        if (a1Var.getContext().checkSelfPermission(strArr[i25]) == 0) {
                            i25++;
                        }
                    } else {
                        z11 = true;
                    }
                }
                aVar.accept(Boolean.valueOf(z11));
                return;
            case 8:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.f24740b;
                String str = (String) this.f24741c;
                String str2 = (String) this.d;
                botWebViewContainer$BotWebViewProxy.getClass();
                try {
                    org.telegram.ui.web.a1 a1Var2 = botWebViewContainer$BotWebViewProxy.f42503a;
                    if (a1Var2 != null) {
                        boolean z13 = org.telegram.ui.web.a1.P0;
                        a1Var2.E(botWebViewContainer$BotWebViewProxy, a1Var2.f(), str, str2);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 9:
                String str3 = (String) this.f24741c;
                String str4 = (String) this.d;
                org.telegram.ui.web.a1 a1Var3 = ((BotWebViewContainer$WebViewProxy) this.f24740b).f42504a;
                if (a1Var3 != null && !a1Var3.f42532o0 && a1Var3.f42518c != null) {
                    if (a1Var3.F0 != null && !TextUtils.equals(a1Var3.getOriginHost(), a1Var3.F0)) {
                        a1Var3.g("onWebEventReceived ignore " + str3);
                        return;
                    }
                    a1Var3.g("onWebEventReceived " + str3 + " " + str4);
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
                                org.telegram.ui.web.x0 x0Var = a1Var3.f42514a;
                                if (x0Var != null) {
                                    if (equals2) {
                                        x0Var.f42803s = true;
                                        x0Var.f42804w = argb;
                                    } else {
                                        x0Var.v = true;
                                        x0Var.f42805x = argb;
                                    }
                                    org.telegram.ui.web.x0.a(x0Var);
                                }
                                a1Var3.f42518c.o(argb, equals2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        case 2:
                            a1Var3.g("oauth_request " + str4);
                            if (a1Var3.f42514a != null) {
                                String originHost = a1Var3.getOriginHost();
                                if (!TextUtils.isEmpty(originHost)) {
                                    try {
                                        String optString = new JSONObject(str4).optString("url");
                                        a1Var3.y("oauth_supported", org.telegram.ui.web.a1.A(1, "version"));
                                        if (!TextUtils.isEmpty(optString)) {
                                            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                            tL_messages_requestUrlAuth.url = optString;
                                            int i26 = tL_messages_requestUrlAuth.flags;
                                            tL_messages_requestUrlAuth.in_app_origin = originHost;
                                            tL_messages_requestUrlAuth.flags = i26 | 12;
                                            ConnectionsManager.getInstance(a1Var3.M).sendRequest(tL_messages_requestUrlAuth, new ai.x2(a1Var3, tL_messages_requestUrlAuth, optString, originHost, 19), 2);
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
                            a1Var3.g("siteName " + str4);
                            org.telegram.ui.web.x0 x0Var2 = a1Var3.f42514a;
                            if (x0Var2 != null) {
                                x0Var2.f42802r = str4;
                                org.telegram.ui.web.x0.a(x0Var2);
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
                            if (a1Var3.getParent() instanceof gi.e4) {
                                gi.e4 e4Var = (gi.e4) a1Var3.getParent();
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
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) this.f24740b;
                ArrayList arrayList7 = (ArrayList) this.d;
                String str5 = (String) this.f24741c;
                ArrayList arrayList8 = new ArrayList();
                for (int i27 = 0; i27 < arrayList7.size(); i27++) {
                    org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) arrayList7.get(i27);
                    if (org.telegram.ui.web.e1.w(b1Var.f42560c, str5) || ((l2Var = b1Var.d) != null && (org.telegram.ui.web.e1.w(l2Var.f42667c, str5) || org.telegram.ui.web.e1.w(b1Var.d.d, str5)))) {
                        arrayList8.add(b1Var);
                    }
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.t3(24, e1Var, arrayList8));
                return;
            case 11:
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) this.f24740b;
                org.telegram.ui.web.g2 g2Var = (org.telegram.ui.web.g2) this.f24741c;
                Bitmap bitmap = (Bitmap) this.d;
                h2Var.getClass();
                if (org.telegram.ui.web.h2.f42619f != null) {
                    if ((g2Var.d > 0 && g2Var.e > 0) || bitmap == null) {
                        z12 = false;
                    }
                    if (bitmap != null) {
                        h2Var.d.put(g2Var.f42605b, bitmap);
                        if (z12) {
                            int i28 = g2Var.d;
                            if (i28 == 0 && g2Var.e == 0) {
                                g2Var.d = bitmap.getWidth();
                                g2Var.e = bitmap.getHeight();
                            } else if (i28 == 0) {
                                g2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * g2Var.e);
                            } else if (g2Var.e == 0) {
                                g2Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * g2Var.d);
                            }
                        }
                    }
                    ArrayList arrayList9 = (ArrayList) org.telegram.ui.web.h2.f42619f.remove(g2Var.f42605b);
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
                ((EglRenderer) this.f24740b).lambda$init$0((EglBase.Context) this.f24741c, (int[]) this.d);
                return;
            case 13:
                ((EglRenderer) this.f24740b).lambda$removeFrameListener$4((CountDownLatch) this.f24741c, (EglRenderer.FrameListener) this.d);
                return;
            case 14:
                ((VideoFileRenderer) this.f24740b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.f24741c, (VideoFrame) this.d);
                return;
            case 15:
                qi.i iVar = (qi.i) this.f24740b;
                WebView webView = (WebView) this.f24741c;
                b5.h hVar = (b5.h) this.d;
                synchronized (iVar.f44787a) {
                    if (!iVar.f44804u && iVar.f44798o == webView && iVar.f44799p == hVar && !iVar.f44801r) {
                        if (iVar.f44802s) {
                            FileLog.e("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                            iVar.o();
                            return;
                        }
                        iVar.f44802s = true;
                        FileLog.e("WEB proxy: Base64 bridge installation timed out; retrying once");
                        iVar.f();
                        return;
                    }
                    return;
                }
            case 16:
                ri.p pVar = (ri.p) this.f24740b;
                byte[] bArr2 = (byte[]) this.d;
                File file = ((ri.j) this.f24741c).f45837b;
                if (pVar.f45862m == ri.n.d) {
                    pVar.B = bArr2;
                    try {
                        pVar.o();
                        i2.g0 a2 = new i2.n(pVar.f45853a).a();
                        pVar.A = a2;
                        a2.p0(pVar.F);
                        pVar.A.r0(b2.o0.b(Uri.fromFile(file)));
                        pVar.A.b();
                        pVar.r(ri.n.e);
                        ri.g gVar = pVar.e;
                        long j10 = pVar.j();
                        long j11 = pVar.f45867r;
                        long j12 = pVar.f45868s;
                        byte[] bArr3 = pVar.B;
                        if (bArr3 != null) {
                            bArr = (byte[]) bArr3.clone();
                        }
                        gVar.onPreviewReady(j10, j11, j12, bArr);
                        return;
                    } catch (Throwable th2) {
                        if (th2 instanceof Exception) {
                            runtimeException = th2;
                        } else {
                            runtimeException = new RuntimeException(th2);
                        }
                        pVar.g(runtimeException);
                        return;
                    }
                }
                return;
            case 17:
                ((ri.p) this.f24740b).f45856f.onOutputStarted(((ri.j) this.f24741c).f45836a, (File) this.d);
                return;
            case 18:
                ((ri.p) this.f24740b).f45856f.onOutputError(((ri.j) this.f24741c).f45836a, (Exception) this.d);
                return;
            case 19:
                ((ri.p) this.f24740b).f45856f.onOutputInvalidated(((ri.j) this.f24741c).f45836a, (ri.k) this.d);
                return;
            case 20:
                si.u uVar = (si.u) this.f24740b;
                HandlerThread handlerThread = (HandlerThread) this.f24741c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                uVar.getClass();
                try {
                    uVar.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 21:
                si.t0 t0Var = (si.t0) this.f24740b;
                si.x xVar = (si.x) this.f24741c;
                File file2 = (File) this.d;
                Handler handler = t0Var.f46791i;
                try {
                    xVar.c(file2);
                    t0Var.g();
                    long e12 = w7.p7.e(file2) / 1000;
                    t0Var.f46795m.b("preview snapshot completed: durationMs=" + e12 + ", size=" + file2.length() + ", elapsedMs=" + si.t0.f(t0Var.J));
                    handler.post(new si.f0(t0Var, e12, 1));
                    return;
                } catch (Exception e13) {
                    handler.post(new si.e0(t0Var, e13, 3));
                    return;
                }
            case 22:
                a();
                return;
            case 23:
                ((ug.v0) this.f24740b).run(new Pair((HashMap) this.f24741c, (ArrayList) this.d));
                return;
            case 24:
                TLObject tLObject2 = (TLObject) this.f24740b;
                MessagesController messagesController = (MessagesController) this.f24741c;
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
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f24740b;
                Utilities.Callback callback = (Utilities.Callback) this.f24741c;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    return;
                } else {
                    callback2.run(null);
                    return;
                }
            case 26:
                ((ig.l0) this.f24740b).run(new Pair((HashMap) this.f24741c, (ArrayList) this.d));
                return;
            case 27:
                wf.d dVar = (wf.d) this.f24740b;
                TLObject tLObject3 = (TLObject) this.f24741c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                String str6 = dVar.f48961b;
                int i30 = dVar.f48960a;
                if (tLObject3 != null) {
                    MediaDataController.getInstance(i30).onRingtoneUploaded(str6, (TLRPC.Document) tLObject3, false);
                } else {
                    dVar.a();
                    MediaDataController.getInstance(i30).onRingtoneUploaded(str6, null, true);
                    if (tL_error3 != null) {
                        NotificationCenter.getInstance(i30).doOnIdle(new uf.c(12, dVar, tL_error3));
                    }
                }
                dVar.a();
                return;
            case 28:
                wh.n nVar = (wh.n) this.f24740b;
                y90 y90Var = (y90) this.f24741c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                w90 w90Var = nVar.G;
                if (w90Var != null && nVar.H == y90Var) {
                    w90Var.a(clickableSpan);
                    nVar.H = null;
                    nVar.f49124x.d(true);
                    return;
                }
                return;
            default:
                u4.f fVar = (u4.f) this.f24740b;
                Executor executor = (Executor) this.f24741c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    ((Task) fVar.call()).continueWith(executor, new x9.v(2, taskCompletionSource));
                    return;
                } catch (Exception e14) {
                    taskCompletionSource.setException(e14);
                    return;
                }
        }
    }

    public ay0(org.telegram.ui.web.e1 e1Var, ArrayList arrayList, String str) {
        this.f24739a = 10;
        this.f24740b = e1Var;
        this.d = arrayList;
        this.f24741c = str;
    }
}
