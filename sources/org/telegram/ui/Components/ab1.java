package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.WidgetConformanceActivity;
public final class ab1 {
    public static final String[][] h = {new String[]{"private", "0", "1", "1", "0"}, new String[]{"group", "0", "1", "0", "0"}, new String[]{"via-bot", "0", "1", "0", "0"}, new String[]{"no-queries", "0", "0", "0", "0"}, new String[]{"live-copy", "1", "1", "0", "0"}, new String[]{"copy", "1", "0", "0", "0"}, new String[]{"preview", "0", "0", "0", "1"}};
    public final Context f26498a;
    public final File f26499b;
    public final int f26500c;
    public final boolean d;
    public final String e;
    public final org.telegram.ui.jl0 f26501f;
    public final Handler f26502g = new Handler(Looper.getMainLooper());

    public ab1(WidgetConformanceActivity widgetConformanceActivity, int i10, boolean z10, String str, org.telegram.ui.jl0 jl0Var) {
        this.f26498a = widgetConformanceActivity.getApplicationContext();
        this.f26499b = new File(widgetConformanceActivity.getExternalFilesDir(null), "conformance");
        this.f26500c = i10;
        this.d = z10;
        this.e = str;
        this.f26501f = jl0Var;
    }

    public static JSONArray b(JSONArray jSONArray, za1 za1Var, dc1 dc1Var) {
        ac1 ac1Var;
        double min;
        int i10;
        JSONArray jSONArray2 = new JSONArray();
        for (int i11 = 0; jSONArray != null && i11 < jSONArray.length(); i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            JSONObject put = new JSONObject().put("id", jSONObject.optString("id")).put("name", jSONObject.optString("name"));
            JSONObject optJSONObject = jSONObject.optJSONObject("bridge");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("height");
            boolean z10 = true;
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("method");
                String optString2 = optJSONObject.optString("arg", null);
                synchronized (za1Var.e) {
                    try {
                        ArrayList arrayList = za1Var.e;
                        int size = arrayList.size();
                        i10 = 0;
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList.get(i12);
                            i12++;
                            JSONObject jSONObject2 = (JSONObject) obj;
                            if (optString.equals(jSONObject2.optString("kind")) && (optString2 == null || optString2.equals(jSONObject2.optString("url")))) {
                                i10++;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i10 != optJSONObject.optInt("count")) {
                    z10 = false;
                }
                put.put("ok", z10).put("got", i10 + " call(s), want " + optJSONObject.optInt("count"));
            } else if (optJSONObject2 != null) {
                if (dc1Var.E == null) {
                    min = 0.0d;
                } else {
                    min = Math.min(600.0f, ac1Var.e / AndroidUtilities.density);
                }
                put.put("ok", (min < optJSONObject2.optDouble("min") || min > optJSONObject2.optDouble("max")) ? false : false).put("got", Math.round(min) + " px");
            } else if ("chat".equals(jSONObject.optString("focus"))) {
                put.put("ok", true).put("got", "no keyboard");
            } else {
                put.put("ok", true).put("got", "not checked");
            }
            jSONArray2.put(put);
        }
        return jSONArray2;
    }

    public static String c(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[16384];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                    fileInputStream.close();
                    return byteArrayOutputStream2;
                }
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static float[] f(za1 za1Var, String str) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        if (za1Var.f35305a == null) {
            optJSONObject = null;
        } else {
            optJSONObject = za1Var.f35305a.optJSONObject("targets");
        }
        if (optJSONObject == null) {
            optJSONArray = null;
        } else {
            optJSONArray = optJSONObject.optJSONArray(str);
        }
        if (optJSONArray == null) {
            return null;
        }
        return new float[]{(float) ((optJSONArray.optDouble(2) / 2.0d) + optJSONArray.optDouble(0)), (float) ((optJSONArray.optDouble(3) / 2.0d) + optJSONArray.optDouble(1))};
    }

    public final String a(final dc1 dc1Var, ya1 ya1Var, za1 za1Var, final JSONObject jSONObject) {
        float[] f7;
        char c10;
        int i10;
        int i11;
        int arbiterMove;
        if (jSONObject.has("wait")) {
            Thread.sleep(jSONObject.optLong("wait"));
        } else if (jSONObject.has("theme")) {
            g(new Runnable() {
                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            dc1Var.e(ec1.d("dark".equals(jSONObject.optString("theme"))));
                            return;
                        default:
                            dc1Var.f(jSONObject.optBoolean("visible"));
                            return;
                    }
                }
            });
        } else if (jSONObject.has("visible")) {
            g(new Runnable() {
                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            dc1Var.e(ec1.d("dark".equals(jSONObject.optString("theme"))));
                            return;
                        default:
                            dc1Var.f(jSONObject.optBoolean("visible"));
                            return;
                    }
                }
            });
        } else if (jSONObject.has("tap")) {
            float[] f10 = f(za1Var, jSONObject.optString("tap"));
            if (f10 == null) {
                return "tap " + jSONObject.optString("tap") + " (no target)";
            }
            ya1Var.c(f10, 60L);
        } else if (jSONObject.has("press")) {
            float[] f11 = f(za1Var, jSONObject.optString("press"));
            if (f11 == null) {
                return "press " + jSONObject.optString("press") + " (no target)";
            }
            ya1Var.c(f11, jSONObject.optLong("ms", 400L));
        } else if (jSONObject.has("dblclick")) {
            float[] f12 = f(za1Var, jSONObject.optString("dblclick"));
            if (f12 == null) {
                return "dblclick (no target)";
            }
            ya1Var.c(f12, 40L);
            Thread.sleep(80L);
            ya1Var.c(f12, 40L);
        } else if (jSONObject.has("drag")) {
            float[] f13 = f(za1Var, jSONObject.optString("drag"));
            if (f13 == null) {
                return "drag " + jSONObject.optString("drag") + " (no target)";
            }
            Object opt = jSONObject.opt("to");
            char c11 = 0;
            int i12 = 1;
            if (opt instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) opt;
                f7 = jSONObject.optBoolean("by") ? new float[]{f13[0] + ((float) jSONArray.optDouble(0)), f13[1] + ((float) jSONArray.optDouble(1))} : new float[]{(float) jSONArray.optDouble(0), (float) jSONArray.optDouble(1)};
            } else {
                f7 = f(za1Var, String.valueOf(opt));
                if (f7 == null) {
                    return "drag to " + opt + " (no target)";
                }
            }
            int max = Math.max(1, jSONObject.optInt("steps", 10));
            ya1Var.b(f13[0], f13[1]);
            int i13 = 1;
            while (i13 <= max) {
                Thread.sleep(16L);
                float f14 = i13 / max;
                float f15 = f13[c11];
                float z10 = c3.h0.z(f7[c11], f15, f14, f15);
                float f16 = f13[i12];
                float z11 = c3.h0.z(f7[i12], f16, f14, f16);
                if (ya1Var.d) {
                    i11 = max;
                    c10 = c11;
                    i10 = i12;
                } else {
                    ya1Var.e.g(new xa1(ya1Var.f35024a, i12, z10, z11));
                    c3.s sVar = ya1Var.f35026c;
                    double uptimeMillis = SystemClock.uptimeMillis();
                    double d = z10;
                    c10 = c11;
                    i10 = i12;
                    double d10 = z11;
                    i11 = max;
                    long j10 = sVar.f6092a;
                    if (j10 == 0) {
                        arbiterMove = -1;
                    } else {
                        arbiterMove = WidgetSandboxNative.arbiterMove(j10, uptimeMillis, d, d10);
                    }
                    ya1Var.a(z10, z11, arbiterMove);
                }
                i13++;
                c11 = c10;
                max = i11;
                i12 = i10;
            }
            ya1Var.d(f7[c11], f7[i12]);
        } else if (jSONObject.has("key")) {
            return "key " + jSONObject.optString("key");
        } else if (jSONObject.has("wheel")) {
            return "wheel";
        } else {
            if (jSONObject.has("hover")) {
                return "hover";
            }
            if (jSONObject.has("rightclick")) {
                return "rightclick";
            }
        }
        Thread.sleep(120L);
        return null;
    }

    public final void d() {
        String str;
        String str2;
        Handler handler = this.f26502g;
        File file = this.f26499b;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            try {
                JSONArray jSONArray2 = new JSONObject(c(new File(file, "manifest.json"))).getJSONArray("tests");
                WidgetSandboxNative.conformance(true);
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i12);
                    if ("auto".equals(jSONObject2.optString("set"))) {
                        String optString = jSONObject2.optString("id");
                        String str3 = this.e;
                        if (str3 == null || str3.isEmpty() || optString.contains(str3)) {
                            JSONObject e = e(jSONObject2);
                            jSONArray.put(e);
                            boolean optBoolean = e.optBoolean("ok");
                            if (optBoolean) {
                                i10++;
                            } else {
                                i11++;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            if (optBoolean) {
                                str2 = "PASS ";
                            } else {
                                str2 = "FAIL ";
                            }
                            sb2.append(str2);
                            sb2.append(optString);
                            sb2.append(" · ");
                            sb2.append(e.optString("summary"));
                            String sb3 = sb2.toString();
                            Log.i("WidgetConformance", sb3);
                            handler.post(new d71(8, this, sb3));
                        }
                    }
                }
                JSONObject put = jSONObject.put("width", this.f26500c);
                if (this.d) {
                    str = "dark";
                } else {
                    str = "light";
                }
                put.put("theme", str).put("passed", i10).put("failed", i11).put("results", jSONArray);
                FileOutputStream fileOutputStream = new FileOutputStream(new File(file, "report.json"));
                try {
                    fileOutputStream.write(jSONObject.toString(2).getBytes(StandardCharsets.UTF_8));
                    fileOutputStream.close();
                    String str4 = "done · " + i10 + " passed · " + i11 + " failed · " + new File(file, "report.json");
                    Log.i("WidgetConformance", str4);
                    handler.post(new d71(8, this, str4));
                    WidgetSandboxNative.conformance(false);
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                WidgetSandboxNative.conformance(false);
                throw th4;
            }
        } catch (Exception e10) {
            String str5 = "error · " + e10;
            Log.i("WidgetConformance", str5);
            handler.post(new d71(8, this, str5));
            WidgetSandboxNative.conformance(false);
        }
    }

    public final JSONObject e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        Object obj;
        Object obj2;
        boolean z10;
        int i10;
        JSONObject optJSONObject;
        String optString;
        boolean z11;
        int i11;
        String optString2;
        Object obj3;
        JSONObject put = new JSONObject().put("id", jSONObject.optString("id"));
        String c10 = c(new File(this.f26499b, jSONObject.optString("file")));
        za1 za1Var = new za1();
        boolean z12 = this.d;
        JSONArray optJSONArray = jSONObject.optJSONArray("themes");
        String str = "light";
        if (optJSONArray != null && optJSONArray.length() > 0) {
            boolean z13 = false;
            for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                String optString3 = optJSONArray.optString(i12);
                if (!this.d) {
                    obj3 = "light";
                } else {
                    obj3 = "dark";
                }
                z13 |= optString3.equals(obj3);
            }
            if (!z13) {
                z12 = "dark".equals(optJSONArray.optString(0));
            }
        }
        if (z12) {
            str = "dark";
        }
        put.put("theme", str);
        dc1 dc1Var = new dc1(this.f26498a, c10, ec1.d(z12), 1, "en-US", null);
        JSONArray optJSONArray2 = jSONObject.optJSONArray("message");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            jSONObject2 = optJSONArray2.getJSONObject(0);
        } else {
            jSONObject2 = new JSONObject();
        }
        String str2 = "private";
        String optString4 = jSONObject2.optString("kind", "private");
        String[][] strArr = h;
        String[] strArr2 = strArr[0];
        for (int i13 = 0; i13 < 7; i13++) {
            String[] strArr3 = strArr[i13];
            if (strArr3[0].equals(optString4)) {
                strArr2 = strArr3;
            }
        }
        int i14 = 1;
        JSONObject put2 = new JSONObject().put("isCopy", "1".equals(strArr2[1])).put("canQuery", "1".equals(strArr2[2])).put("backgroundQuery", "1".equals(strArr2[3])).put("preview", "1".equals(strArr2[4]));
        boolean equals = "1".equals(strArr2[1]);
        boolean equals2 = "1".equals(strArr2[4]);
        if (!equals && !equals2) {
            if ("group".equals(optString4)) {
                str2 = jSONObject2.optString("chat", "group");
            }
            put2.put("chatType", str2);
        }
        if ("1".equals(strArr2[2])) {
            put2.put("viewer", new JSONObject().put("id", 1000001).put("firstName", "Tester").put("username", "conformance_tester"));
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject2.has("chat_data")) {
            obj = jSONObject2.getString("chat_data");
        } else {
            obj = JSONObject.NULL;
        }
        JSONObject put3 = jSONObject3.put("chatData", obj);
        if (jSONObject2.has("public_data")) {
            obj2 = jSONObject2.getString("public_data");
        } else {
            obj2 = JSONObject.NULL;
        }
        String jSONObject4 = new JSONObject().put("data", put3.put("publicData", obj2)).put("context", put2).toString();
        if (jSONObject4 != null) {
            dc1Var.h = jSONObject4;
        }
        za1Var.f35306b = dc1Var;
        za1Var.f35307c = jSONObject.optJSONObject("bot");
        dc1Var.J = new b3(za1Var, 14);
        ya1 ya1Var = new ya1(this, dc1Var, za1Var);
        g(new d71(9, dc1Var, za1Var));
        try {
            dc1Var.g(Math.round(this.f26500c * AndroidUtilities.density));
            JSONArray jSONArray = new JSONArray();
            HashSet hashSet = new HashSet();
            za1Var.k(new ai.d0(9), 15000L);
            JSONArray optJSONArray3 = jSONObject.optJSONArray("actions");
            int i15 = 0;
            while (optJSONArray3 != null) {
                try {
                    if (i15 >= optJSONArray3.length()) {
                        break;
                    }
                    String a2 = a(dc1Var, ya1Var, za1Var, optJSONArray3.getJSONObject(i15));
                    if (a2 != null) {
                        jSONArray.put(a2);
                        JSONArray optJSONArray4 = optJSONArray3.getJSONObject(i15).optJSONArray("ids");
                        for (int i16 = 0; optJSONArray4 != null && i16 < optJSONArray4.length(); i16++) {
                            hashSet.add(optJSONArray4.optString(i16));
                        }
                    }
                    i15++;
                } catch (Throwable th2) {
                    th = th2;
                    dc1Var.J = null;
                    c3.s sVar = ya1Var.f35026c;
                    long j10 = sVar.f6092a;
                    if (j10 != 0) {
                        WidgetSandboxNative.arbiterDestroy(j10);
                        sVar.f6092a = 0L;
                    }
                    g(new oa1(dc1Var, 2));
                    throw th;
                }
            }
            za1Var.k(new ai.d0(10), 25000L);
            JSONObject jSONObject5 = za1Var.f35305a;
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            if (jSONObject5 != null && "done".equals(jSONObject5.optString("status"))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (jSONObject5 != null) {
                JSONArray optJSONArray5 = jSONObject5.optJSONArray("checks");
                int i17 = 0;
                while (true) {
                    if (optJSONArray5 != null) {
                        z11 = z10;
                        if (i17 >= optJSONArray5.length()) {
                            break;
                        }
                        JSONArray optJSONArray6 = optJSONArray5.optJSONArray(i17);
                        if (optJSONArray6 == null) {
                            optString2 = "";
                            i11 = i17;
                        } else {
                            i11 = i17;
                            optString2 = optJSONArray6.optString(2);
                        }
                        String str3 = optString2;
                        JSONArray jSONArray4 = optJSONArray5;
                        if (str3.equals("fail") || str3.equals("xpass") || str3.equals("pending")) {
                            if (hashSet.contains(optJSONArray6.optString(0))) {
                                jSONArray3.put(optJSONArray6);
                            } else {
                                jSONArray2.put(optJSONArray6);
                                z10 = false;
                                i17 = i11 + 1;
                                optJSONArray5 = jSONArray4;
                            }
                        }
                        z10 = z11;
                        i17 = i11 + 1;
                        optJSONArray5 = jSONArray4;
                    } else {
                        z11 = z10;
                        break;
                    }
                }
                i10 = false;
                z10 = z11;
            } else {
                i10 = false;
            }
            JSONArray b10 = b(jSONObject.optJSONArray("host"), za1Var, dc1Var);
            for (int i18 = i10; i18 < b10.length(); i18++) {
                if (!b10.getJSONObject(i18).optBoolean("ok")) {
                    z10 = i10;
                }
            }
            if (jSONObject5 == null) {
                optJSONObject = new JSONObject();
            } else {
                optJSONObject = jSONObject5.optJSONObject("n");
            }
            JSONObject put4 = put.put("ok", z10);
            if (jSONObject5 == null) {
                optString = "no verdict";
            } else {
                optString = jSONObject5.optString("status");
            }
            put4.put("status", optString).put("n", optJSONObject).put("failures", jSONArray2).put("host", b10).put("skipped", jSONArray).put("notApplicable", jSONArray3);
            StringBuilder sb2 = new StringBuilder(put.optString("status"));
            if (optJSONObject != null) {
                String[] strArr4 = {"pass", "fail", "xfail", "xpass", "skip", "pending"};
                for (int i19 = i10; i19 < 6; i19++) {
                    String str4 = strArr4[i19];
                    if (optJSONObject.optInt(str4) > 0) {
                        sb2.append(" · ");
                        sb2.append(str4);
                        sb2.append(' ');
                        sb2.append(optJSONObject.optInt(str4));
                    }
                }
            }
            int i20 = 0;
            while (i20 < jSONArray2.length()) {
                JSONArray jSONArray5 = jSONArray2.getJSONArray(i20);
                sb2.append("\n    ");
                sb2.append(jSONArray5.optString(2));
                sb2.append(" · ");
                sb2.append(jSONArray5.optString(i14));
                sb2.append(" · ");
                sb2.append(jSONArray5.optString(3));
                i20++;
                i14 = 1;
            }
            for (int i21 = 0; i21 < b10.length(); i21++) {
                JSONObject jSONObject6 = b10.getJSONObject(i21);
                if (!jSONObject6.optBoolean("ok")) {
                    sb2.append("\n    host fail · ");
                    sb2.append(jSONObject6.optString("name"));
                    sb2.append(" · ");
                    sb2.append(jSONObject6.optString("got"));
                }
            }
            if (jSONArray.length() > 0) {
                sb2.append("\n    not on touch: ");
                sb2.append(jSONArray.join(", "));
            }
            for (int i22 = 0; i22 < jSONArray3.length(); i22++) {
                JSONArray jSONArray6 = jSONArray3.getJSONArray(i22);
                sb2.append("\n    n/a on touch · ");
                sb2.append(jSONArray6.optString(1));
            }
            put.put("summary", sb2.toString());
            dc1Var.J = null;
            c3.s sVar2 = ya1Var.f35026c;
            long j11 = sVar2.f6092a;
            if (j11 != 0) {
                WidgetSandboxNative.arbiterDestroy(j11);
                sVar2.f6092a = 0L;
            }
            g(new oa1(dc1Var, 2));
            return put;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void g(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f26502g.post(new pa1(runnable, countDownLatch, 1));
        countDownLatch.await(5L, TimeUnit.SECONDS);
    }
}
