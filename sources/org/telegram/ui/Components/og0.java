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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
public final class og0 implements Runnable {
    public final int f29483a;
    public final Object f29484b;
    public final Object f29485c;
    public final Object d;

    public og0(Object obj, Object obj2, Object obj3, int i10) {
        this.f29483a = i10;
        this.f29484b = obj;
        this.f29485c = obj2;
        this.d = obj3;
    }

    private final void a() {
        boolean z10;
        String str = (String) this.f29485c;
        String str2 = (String) this.d;
        org.telegram.ui.web.b1 b1Var = ((BotWebViewContainer$WebViewProxy) this.f29484b).f43214a;
        if (b1Var != null && !b1Var.f43256o0 && b1Var.f43241c != null) {
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
                        org.telegram.ui.web.y0 y0Var = b1Var.f43237a;
                        if (y0Var != null) {
                            if (equals) {
                                y0Var.f43546s = true;
                                y0Var.f43547w = argb;
                            } else {
                                y0Var.v = true;
                                y0Var.f43548x = argb;
                            }
                            org.telegram.ui.web.y0.a(y0Var);
                        }
                        b1Var.f43241c.o(argb, equals);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                case 2:
                    b1Var.g("oauth_request " + str2);
                    if (b1Var.f43237a != null) {
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
                                    ConnectionsManager.getInstance(b1Var.M).sendRequest(tL_messages_requestUrlAuth, new ai.q3(b1Var, tL_messages_requestUrlAuth, optString, originHost, 14), 2);
                                    return;
                                }
                                return;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                case 3:
                    b1Var.g("siteName " + str2);
                    org.telegram.ui.web.y0 y0Var2 = b1Var.f43237a;
                    if (y0Var2 != null) {
                        y0Var2.f43545r = str2;
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
                    if (b1Var.getParent() instanceof ei.o4) {
                        ei.o4 o4Var = (ei.o4) b1Var.getParent();
                        o4Var.O = z10;
                        o4Var.P = z11;
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
        org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) this.f29484b;
        org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) this.f29485c;
        Bitmap bitmap = (Bitmap) this.d;
        i2Var.getClass();
        if (org.telegram.ui.web.i2.f43353f != null) {
            int i10 = 0;
            if ((h2Var.d <= 0 || h2Var.f43339e <= 0) && bitmap != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bitmap != null) {
                i2Var.d.put(h2Var.f43337b, bitmap);
                if (z10) {
                    int i11 = h2Var.d;
                    if (i11 == 0 && h2Var.f43339e == 0) {
                        h2Var.d = bitmap.getWidth();
                        h2Var.f43339e = bitmap.getHeight();
                    } else if (i11 == 0) {
                        h2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * h2Var.f43339e);
                    } else if (h2Var.f43339e == 0) {
                        h2Var.f43339e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * h2Var.d);
                    }
                }
            }
            ArrayList arrayList = (ArrayList) org.telegram.ui.web.i2.f43353f.remove(h2Var.f43337b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.og0.run():void");
    }

    public og0(org.telegram.ui.web.f1 f1Var, ArrayList arrayList, String str) {
        this.f29483a = 24;
        this.f29484b = f1Var;
        this.d = arrayList;
        this.f29485c = str;
    }
}
