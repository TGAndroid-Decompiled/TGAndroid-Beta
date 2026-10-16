package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
public final class ze0 implements Runnable {
    public final int f31549a;
    public final Object f31550b;
    public final Object f31551c;
    public final Object d;

    public ze0(Object obj, Object obj2, Object obj3, int i10) {
        this.f31549a = i10;
        this.f31550b = obj;
        this.f31551c = obj2;
        this.d = obj3;
    }

    private final void a() {
        boolean z10;
        String str = (String) this.f31551c;
        String str2 = (String) this.d;
        org.telegram.ui.web.c1 c1Var = ((BotWebViewContainer$WebViewProxy) this.f31550b).f40950a;
        if (c1Var != null && !c1Var.f40999o0 && c1Var.f40985c != null) {
            if (c1Var.F0 != null && !TextUtils.equals(c1Var.getOriginHost(), c1Var.F0)) {
                c1Var.g("onWebEventReceived ignore " + str);
                return;
            }
            c1Var.g("onWebEventReceived " + str + " " + str2);
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
                        org.telegram.ui.web.z0 z0Var = c1Var.f40981a;
                        if (z0Var != null) {
                            if (equals) {
                                z0Var.f41267s = true;
                                z0Var.f41268w = argb;
                            } else {
                                z0Var.v = true;
                                z0Var.f41269x = argb;
                            }
                            org.telegram.ui.web.z0.a(z0Var);
                        }
                        c1Var.f40985c.o(argb, equals);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                case 2:
                    c1Var.g("oauth_request " + str2);
                    if (c1Var.f40981a != null) {
                        String originHost = c1Var.getOriginHost();
                        if (!TextUtils.isEmpty(originHost)) {
                            try {
                                String optString = new JSONObject(str2).optString("url");
                                c1Var.y("oauth_supported", org.telegram.ui.web.c1.A(1, "version"));
                                if (!TextUtils.isEmpty(optString)) {
                                    TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                    tL_messages_requestUrlAuth.url = optString;
                                    int i10 = tL_messages_requestUrlAuth.flags;
                                    tL_messages_requestUrlAuth.in_app_origin = originHost;
                                    tL_messages_requestUrlAuth.flags = i10 | 12;
                                    ConnectionsManager.getInstance(c1Var.M).sendRequest(tL_messages_requestUrlAuth, new bi.f3(c1Var, tL_messages_requestUrlAuth, optString, originHost, 14), 2);
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
                    c1Var.g("siteName " + str2);
                    org.telegram.ui.web.z0 z0Var2 = c1Var.f40981a;
                    if (z0Var2 != null) {
                        z0Var2.f41266r = str2;
                        org.telegram.ui.web.z0.a(z0Var2);
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
                    if (c1Var.getParent() instanceof fi.p4) {
                        fi.p4 p4Var = (fi.p4) c1Var.getParent();
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

    private final void b() {
        boolean z10;
        Object obj;
        org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) this.f31550b;
        org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) this.f31551c;
        Bitmap bitmap = (Bitmap) this.d;
        i2Var.getClass();
        if (org.telegram.ui.web.i2.f41077f != null) {
            int i10 = 0;
            if ((h2Var.d <= 0 || h2Var.e <= 0) && bitmap != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bitmap != null) {
                i2Var.d.put(h2Var.f41066b, bitmap);
                if (z10) {
                    int i11 = h2Var.d;
                    if (i11 == 0 && h2Var.e == 0) {
                        h2Var.d = bitmap.getWidth();
                        h2Var.e = bitmap.getHeight();
                    } else if (i11 == 0) {
                        h2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * h2Var.e);
                    } else if (h2Var.e == 0) {
                        h2Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * h2Var.d);
                    }
                }
            }
            ArrayList arrayList = (ArrayList) org.telegram.ui.web.i2.f41077f.remove(h2Var.f41066b);
            if (arrayList != null) {
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    Pair pair = (Pair) obj2;
                    ((ImageReceiver) pair.first).setImageBitmap(bitmap);
                    if (z10 && (obj = pair.second) != null) {
                        ((Runnable) obj).run();
                    }
                }
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ze0.run():void");
    }

    public ze0(af0 af0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f31549a = 0;
        this.f31550b = af0Var;
        this.f31551c = tL_error;
        this.d = tLObject;
    }
}
