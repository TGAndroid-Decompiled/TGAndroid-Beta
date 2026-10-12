package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
public final class v70 implements Runnable {
    public final int f29910a;
    public final Object f29911b;
    public final Object f29912c;
    public final Object d;

    public v70(Object obj, Object obj2, Object obj3, int i10) {
        this.f29910a = i10;
        this.f29911b = obj;
        this.f29912c = obj2;
        this.d = obj3;
    }

    private final void a() {
        Object obj;
        String absolutePath;
        p81 p81Var = (p81) this.f29911b;
        f81 f81Var = (f81) this.f29912c;
        MessageObject messageObject = (MessageObject) this.d;
        p81Var.getClass();
        if (f81Var.b()) {
            p81Var.f28233b = new f6(new File(f81Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
        } else {
            int i10 = UserConfig.selectedAccount;
            try {
                i10 = Utilities.parseInt((CharSequence) f81Var.d.getQueryParameter("account")).intValue();
            } catch (Exception e) {
                FileLog.e(e);
            }
            int i11 = i10;
            try {
                obj = FileLoader.getInstance(i11).getParentObject(Utilities.parseInt((CharSequence) f81Var.d.getQueryParameter("rid")).intValue());
            } catch (Exception e7) {
                FileLog.e(e7);
                obj = null;
            }
            Object obj2 = obj;
            TLRPC.Document document = f81Var.f24964g;
            if (FileLoader.getInstance(i11).isLoadingFile(FileLoader.getAttachFileName(document))) {
                File directory = FileLoader.getDirectory(4);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(document.dc_id);
                sb2.append("_");
                absolutePath = new File(directory, a1.g.r(sb2, document.f19222id, ".temp")).getAbsolutePath();
            } else {
                absolutePath = FileLoader.getInstance(i11).getPathToAttach(document, false).getAbsolutePath();
            }
            p81Var.f28233b = new f6(new File(absolutePath), true, document.size, 1, document, null, obj2, 0L, i11, true);
        }
        p81Var.f28235c = p81Var.f28233b.d[4];
        float f7 = p81Var.h;
        if (f7 != 0.0f) {
            p81Var.e(messageObject, f7, p81Var.f28243r);
            p81Var.h = 0.0f;
        }
        AndroidUtilities.runOnUIThread(new k81(p81Var, 2));
    }

    private final void b() {
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.f29911b;
        String str = (String) this.f29912c;
        String str2 = (String) this.d;
        botWebViewContainer$BotWebViewProxy.getClass();
        try {
            org.telegram.ui.web.b1 b1Var = botWebViewContainer$BotWebViewProxy.f41262a;
            if (b1Var == null) {
                return;
            }
            boolean z10 = org.telegram.ui.web.b1.P0;
            b1Var.E(botWebViewContainer$BotWebViewProxy, b1Var.f(), str, str2);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private final void c() {
        boolean z10;
        String str = (String) this.f29912c;
        String str2 = (String) this.d;
        org.telegram.ui.web.b1 b1Var = ((BotWebViewContainer$WebViewProxy) this.f29911b).f41263a;
        if (b1Var != null && !b1Var.f41300o0 && b1Var.f41286c != null) {
            if (b1Var.F0 != null && !TextUtils.equals(b1Var.getOriginHost(), b1Var.F0)) {
                b1Var.g("onWebEventReceived ignore " + str);
                return;
            }
            b1Var.g("onWebEventReceived " + str + " " + str2);
            str.getClass();
            boolean z11 = true;
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1695046810:
                    if (str.equals("actionBarColor")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -462720700:
                    if (str.equals("navigationBarColor")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 479731943:
                    if (str.equals("oauth_request")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 675009138:
                    if (str.equals("siteName")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 997530486:
                    if (str.equals("allowScroll")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                    try {
                        JSONArray jSONArray = new JSONArray(str2);
                        boolean equals = TextUtils.equals(str, "actionBarColor");
                        int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                        org.telegram.ui.web.y0 y0Var = b1Var.f41282a;
                        if (y0Var != null) {
                            if (equals) {
                                y0Var.f41566s = true;
                                y0Var.f41567w = argb;
                            } else {
                                y0Var.v = true;
                                y0Var.f41568x = argb;
                            }
                            org.telegram.ui.web.y0.a(y0Var);
                        }
                        b1Var.f41286c.o(argb, equals);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                case 2:
                    b1Var.g("oauth_request " + str2);
                    if (b1Var.f41282a != null) {
                        String originHost = b1Var.getOriginHost();
                        if (!TextUtils.isEmpty(originHost)) {
                            try {
                                String optString = new JSONObject(str2).optString("url");
                                b1Var.y("oauth_supported", org.telegram.ui.web.b1.A(1, "version"));
                                if (!TextUtils.isEmpty(optString)) {
                                    TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                    tL_messages_requestUrlAuth.url = optString;
                                    int i10 = tL_messages_requestUrlAuth.flags;
                                    tL_messages_requestUrlAuth.in_app_origin = originHost;
                                    tL_messages_requestUrlAuth.flags = i10 | 12;
                                    ConnectionsManager.getInstance(b1Var.M).sendRequest(tL_messages_requestUrlAuth, new bi.f3(b1Var, tL_messages_requestUrlAuth, optString, originHost, 14), 2);
                                    return;
                                }
                                return;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                case 3:
                    b1Var.g("siteName " + str2);
                    org.telegram.ui.web.y0 y0Var2 = b1Var.f41282a;
                    if (y0Var2 != null) {
                        y0Var2.f41565r = str2;
                        org.telegram.ui.web.y0.a(y0Var2);
                        return;
                    }
                    return;
                case 4:
                    try {
                        JSONArray jSONArray2 = new JSONArray(str2);
                        z10 = jSONArray2.optBoolean(0, true);
                        try {
                            z11 = jSONArray2.optBoolean(1, true);
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        z10 = true;
                    }
                    if (b1Var.getParent() instanceof fi.p4) {
                        fi.p4 p4Var = (fi.p4) b1Var.getParent();
                        p4Var.O = z10;
                        p4Var.P = z11;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private final void d() {
        org.telegram.ui.web.l2 l2Var;
        org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.f29911b;
        ArrayList arrayList = (ArrayList) this.f29912c;
        String str = (String) this.d;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) arrayList.get(i10);
            if (org.telegram.ui.web.f1.t(c1Var.f41323c, str) || ((l2Var = c1Var.d) != null && (org.telegram.ui.web.f1.t(l2Var.f41425c, str) || org.telegram.ui.web.f1.t(c1Var.d.d, str)))) {
                arrayList2.add(c1Var);
            }
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.t8(8, f1Var, arrayList2));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v70.run():void");
    }

    public v70(ze0 ze0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f29910a = 3;
        this.f29911b = ze0Var;
        this.f29912c = tL_error;
        this.d = tLObject;
    }

    public v70(lm0 lm0Var, String str, ArrayList arrayList, int i10) {
        this.f29910a = i10;
        this.f29911b = lm0Var;
        this.d = str;
        this.f29912c = arrayList;
    }
}
