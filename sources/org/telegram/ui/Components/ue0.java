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
public final class ue0 implements Runnable {
    public final int f32993a;
    public final Object f32994b;
    public final Object f32995c;
    public final Object d;

    public ue0(Object obj, Object obj2, Object obj3, int i9) {
        this.f32993a = i9;
        this.f32994b = obj;
        this.f32995c = obj2;
        this.d = obj3;
    }

    private final void a() {
        boolean z10;
        String str = (String) this.f32995c;
        String str2 = (String) this.d;
        org.telegram.ui.web.y0 y0Var = ((BotWebViewContainer$WebViewProxy) this.f32994b).f43787a;
        if (!y0Var.f44085k0 && y0Var.f44074c != null) {
            if (y0Var.f44105z0 != null && !TextUtils.equals(y0Var.getOriginHost(), y0Var.f44105z0)) {
                y0Var.g("onWebEventReceived ignore " + str);
                return;
            }
            y0Var.g("onWebEventReceived " + str + " " + str2);
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
                        org.telegram.ui.web.v0 v0Var = y0Var.f44070a;
                        if (v0Var != null) {
                            if (equals) {
                                v0Var.f44043s = true;
                                v0Var.f44044w = argb;
                            } else {
                                v0Var.v = true;
                                v0Var.f44045x = argb;
                            }
                            org.telegram.ui.web.v0.a(v0Var);
                        }
                        y0Var.f44074c.o(argb, equals);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                case 2:
                    y0Var.g("oauth_request " + str2);
                    if (y0Var.f44070a != null) {
                        String originHost = y0Var.getOriginHost();
                        if (!TextUtils.isEmpty(originHost)) {
                            try {
                                String optString = new JSONObject(str2).optString("url");
                                y0Var.v("oauth_supported", org.telegram.ui.web.y0.x(1, "version"));
                                if (!TextUtils.isEmpty(optString)) {
                                    TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                    tL_messages_requestUrlAuth.url = optString;
                                    int i9 = tL_messages_requestUrlAuth.flags;
                                    tL_messages_requestUrlAuth.in_app_origin = originHost;
                                    tL_messages_requestUrlAuth.flags = i9 | 12;
                                    ConnectionsManager.getInstance(y0Var.I).sendRequest(tL_messages_requestUrlAuth, new fh.h1(y0Var, tL_messages_requestUrlAuth, optString, originHost, 19), 2);
                                    return;
                                }
                                return;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                case 3:
                    y0Var.g("siteName " + str2);
                    org.telegram.ui.web.v0 v0Var2 = y0Var.f44070a;
                    if (v0Var2 != null) {
                        v0Var2.f44042r = str2;
                        org.telegram.ui.web.v0.a(v0Var2);
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
                    if (y0Var.getParent() instanceof mh.f4) {
                        mh.f4 f4Var = (mh.f4) y0Var.getParent();
                        f4Var.K = z10;
                        f4Var.L = z11;
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
        org.telegram.ui.web.d2 d2Var = (org.telegram.ui.web.d2) this.f32994b;
        org.telegram.ui.web.c2 c2Var = (org.telegram.ui.web.c2) this.f32995c;
        Bitmap bitmap = (Bitmap) this.d;
        d2Var.getClass();
        if (org.telegram.ui.web.d2.f43836f != null) {
            int i9 = 0;
            if ((c2Var.d <= 0 || c2Var.f43828e <= 0) && bitmap != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bitmap != null) {
                d2Var.d.put(c2Var.f43826b, bitmap);
                if (z10) {
                    int i10 = c2Var.d;
                    if (i10 == 0 && c2Var.f43828e == 0) {
                        c2Var.d = bitmap.getWidth();
                        c2Var.f43828e = bitmap.getHeight();
                    } else if (i10 == 0) {
                        c2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * c2Var.f43828e);
                    } else if (c2Var.f43828e == 0) {
                        c2Var.f43828e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * c2Var.d);
                    }
                }
            }
            ArrayList arrayList = (ArrayList) org.telegram.ui.web.d2.f43836f.remove(c2Var.f43826b);
            if (arrayList != null) {
                int size = arrayList.size();
                while (i9 < size) {
                    Object obj2 = arrayList.get(i9);
                    i9++;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ue0.run():void");
    }

    public ue0(org.telegram.ui.web.b1 b1Var, ArrayList arrayList, String str) {
        this.f32993a = 25;
        this.f32994b = b1Var;
        this.d = arrayList;
        this.f32995c = str;
    }
}
