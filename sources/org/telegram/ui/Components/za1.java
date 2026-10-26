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
public final class za1 {
    public final Context f35282a;
    public final File f35283b;
    public final int f35284c;
    public final boolean d;
    public final String e;
    public final org.telegram.ui.hl0 f35285f;
    public final Handler f35286g = new Handler(Looper.getMainLooper());

    public za1(WidgetConformanceActivity widgetConformanceActivity, int i10, boolean z10, String str, org.telegram.ui.hl0 hl0Var) {
        this.f35282a = widgetConformanceActivity.getApplicationContext();
        this.f35283b = new File(widgetConformanceActivity.getExternalFilesDir(null), "conformance");
        this.f35284c = i10;
        this.d = z10;
        this.e = str;
        this.f35285f = hl0Var;
    }

    public static JSONArray b(JSONArray jSONArray, ya1 ya1Var, yb1 yb1Var) {
        vb1 vb1Var;
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
                synchronized (ya1Var.f34999c) {
                    try {
                        ArrayList arrayList = ya1Var.f34999c;
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
                if (yb1Var.D == null) {
                    min = 0.0d;
                } else {
                    min = Math.min(600.0f, vb1Var.e / AndroidUtilities.density);
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

    public static float[] f(ya1 ya1Var, String str) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        if (ya1Var.f34997a == null) {
            optJSONObject = null;
        } else {
            optJSONObject = ya1Var.f34997a.optJSONObject("targets");
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

    public final String a(final yb1 yb1Var, xa1 xa1Var, ya1 ya1Var, final JSONObject jSONObject) {
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
                            yb1Var.d(zb1.d("dark".equals(jSONObject.optString("theme"))));
                            return;
                        default:
                            yb1Var.e(jSONObject.optBoolean("visible"));
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
                            yb1Var.d(zb1.d("dark".equals(jSONObject.optString("theme"))));
                            return;
                        default:
                            yb1Var.e(jSONObject.optBoolean("visible"));
                            return;
                    }
                }
            });
        } else if (jSONObject.has("tap")) {
            float[] f10 = f(ya1Var, jSONObject.optString("tap"));
            if (f10 == null) {
                return "tap " + jSONObject.optString("tap") + " (no target)";
            }
            xa1Var.c(f10, 60L);
        } else if (jSONObject.has("press")) {
            float[] f11 = f(ya1Var, jSONObject.optString("press"));
            if (f11 == null) {
                return "press " + jSONObject.optString("press") + " (no target)";
            }
            xa1Var.c(f11, jSONObject.optLong("ms", 400L));
        } else if (jSONObject.has("dblclick")) {
            float[] f12 = f(ya1Var, jSONObject.optString("dblclick"));
            if (f12 == null) {
                return "dblclick (no target)";
            }
            xa1Var.c(f12, 40L);
            Thread.sleep(80L);
            xa1Var.c(f12, 40L);
        } else if (jSONObject.has("drag")) {
            float[] f13 = f(ya1Var, jSONObject.optString("drag"));
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
                f7 = f(ya1Var, String.valueOf(opt));
                if (f7 == null) {
                    return "drag to " + opt + " (no target)";
                }
            }
            int max = Math.max(1, jSONObject.optInt("steps", 10));
            xa1Var.b(f13[0], f13[1]);
            int i13 = 1;
            while (i13 <= max) {
                Thread.sleep(16L);
                float f14 = i13 / max;
                float f15 = f13[c11];
                float z10 = c3.h0.z(f7[c11], f15, f14, f15);
                float f16 = f13[i12];
                float z11 = c3.h0.z(f7[i12], f16, f14, f16);
                if (xa1Var.d) {
                    i11 = max;
                    c10 = c11;
                    i10 = i12;
                } else {
                    xa1Var.e.g(new wa1(xa1Var.f34682a, i12, z10, z11));
                    c3.s sVar = xa1Var.f34684c;
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
                    xa1Var.a(z10, z11, arbiterMove);
                }
                i13++;
                c11 = c10;
                max = i11;
                i12 = i10;
            }
            xa1Var.d(f7[c11], f7[i12]);
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
        Handler handler = this.f35286g;
        File file = this.f35283b;
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
                            handler.post(new c71(8, this, sb3));
                        }
                    }
                }
                JSONObject put = jSONObject.put("width", this.f35284c);
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
                    handler.post(new c71(8, this, str4));
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
            handler.post(new c71(8, this, str5));
            WidgetSandboxNative.conformance(false);
        }
    }

    public final JSONObject e(JSONObject jSONObject) {
        boolean z10;
        JSONObject optJSONObject;
        String optString;
        boolean z11;
        JSONArray jSONArray;
        String optString2;
        long j10;
        Object obj;
        JSONObject put = new JSONObject().put("id", jSONObject.optString("id"));
        String c10 = c(new File(this.f35283b, jSONObject.optString("file")));
        ya1 ya1Var = new ya1();
        boolean z12 = this.d;
        JSONArray optJSONArray = jSONObject.optJSONArray("themes");
        String str = "light";
        int i10 = false;
        if (optJSONArray != null && optJSONArray.length() > 0) {
            boolean z13 = false;
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                String optString3 = optJSONArray.optString(i11);
                if (!this.d) {
                    obj = "light";
                } else {
                    obj = "dark";
                }
                z13 |= optString3.equals(obj);
            }
            if (!z13) {
                z12 = "dark".equals(optJSONArray.optString(0));
            }
        }
        if (z12) {
            str = "dark";
        }
        put.put("theme", str);
        yb1 yb1Var = new yb1(this.f35282a, c10, zb1.d(z12), 1, "en-US", null);
        yb1Var.I = new b3(ya1Var, 14);
        xa1 xa1Var = new xa1(this, yb1Var, ya1Var);
        g(new c71(9, yb1Var, ya1Var));
        try {
            yb1Var.f(Math.round(this.f35284c * AndroidUtilities.density));
            JSONArray jSONArray2 = new JSONArray();
            HashSet hashSet = new HashSet();
            long j11 = 0;
            ya1Var.h(new ai.d0(9), 15000L);
            JSONArray optJSONArray2 = jSONObject.optJSONArray("actions");
            int i12 = 0;
            while (optJSONArray2 != null) {
                try {
                    if (i12 >= optJSONArray2.length()) {
                        break;
                    }
                    String a2 = a(yb1Var, xa1Var, ya1Var, optJSONArray2.getJSONObject(i12));
                    if (a2 != null) {
                        jSONArray2.put(a2);
                        JSONArray optJSONArray3 = optJSONArray2.getJSONObject(i12).optJSONArray("ids");
                        int i13 = 0;
                        while (optJSONArray3 != null) {
                            j10 = j11;
                            if (i13 < optJSONArray3.length()) {
                                hashSet.add(optJSONArray3.optString(i13));
                                i13++;
                                j11 = j10;
                            }
                        }
                    }
                    j10 = j11;
                    i12++;
                    j11 = j10;
                } catch (Throwable th2) {
                    th = th2;
                    yb1Var.I = null;
                    c3.s sVar = xa1Var.f34684c;
                    long j12 = sVar.f6092a;
                    if (j12 != 0) {
                        WidgetSandboxNative.arbiterDestroy(j12);
                        sVar.f6092a = 0L;
                    }
                    g(new na1(yb1Var, 2));
                    throw th;
                }
            }
            long j13 = j11;
            ya1Var.h(new ai.d0(10), 25000L);
            JSONObject jSONObject2 = ya1Var.f34997a;
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            if (jSONObject2 != null && "done".equals(jSONObject2.optString("status"))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (jSONObject2 != null) {
                JSONArray optJSONArray4 = jSONObject2.optJSONArray("checks");
                int i14 = 0;
                while (true) {
                    if (optJSONArray4 != null) {
                        z11 = z10;
                        if (i14 >= optJSONArray4.length()) {
                            break;
                        }
                        JSONArray optJSONArray5 = optJSONArray4.optJSONArray(i14);
                        if (optJSONArray5 == null) {
                            optString2 = "";
                            jSONArray = optJSONArray4;
                        } else {
                            jSONArray = optJSONArray4;
                            optString2 = optJSONArray5.optString(2);
                        }
                        String str2 = optString2;
                        int i15 = i14;
                        if (str2.equals("fail") || str2.equals("xpass") || str2.equals("pending")) {
                            if (hashSet.contains(optJSONArray5.optString(0))) {
                                jSONArray4.put(optJSONArray5);
                            } else {
                                jSONArray3.put(optJSONArray5);
                                z10 = false;
                                i14 = i15 + 1;
                                optJSONArray4 = jSONArray;
                            }
                        }
                        z10 = z11;
                        i14 = i15 + 1;
                        optJSONArray4 = jSONArray;
                    } else {
                        z11 = z10;
                        break;
                    }
                }
                i10 = false;
                z10 = z11;
            }
            JSONArray b10 = b(jSONObject.optJSONArray("host"), ya1Var, yb1Var);
            for (int i16 = i10; i16 < b10.length(); i16++) {
                if (!b10.getJSONObject(i16).optBoolean("ok")) {
                    z10 = i10;
                }
            }
            if (jSONObject2 == null) {
                optJSONObject = new JSONObject();
            } else {
                optJSONObject = jSONObject2.optJSONObject("n");
            }
            JSONObject put2 = put.put("ok", z10);
            if (jSONObject2 == null) {
                optString = "no verdict";
            } else {
                optString = jSONObject2.optString("status");
            }
            put2.put("status", optString).put("n", optJSONObject).put("failures", jSONArray3).put("host", b10).put("skipped", jSONArray2).put("notApplicable", jSONArray4);
            StringBuilder sb2 = new StringBuilder(put.optString("status"));
            if (optJSONObject != null) {
                String[] strArr = {"pass", "fail", "xfail", "xpass", "skip", "pending"};
                for (int i17 = i10; i17 < 6; i17++) {
                    String str3 = strArr[i17];
                    if (optJSONObject.optInt(str3) > 0) {
                        sb2.append(" · ");
                        sb2.append(str3);
                        sb2.append(' ');
                        sb2.append(optJSONObject.optInt(str3));
                    }
                }
            }
            for (int i18 = 0; i18 < jSONArray3.length(); i18++) {
                JSONArray jSONArray5 = jSONArray3.getJSONArray(i18);
                sb2.append("\n    ");
                sb2.append(jSONArray5.optString(2));
                sb2.append(" · ");
                sb2.append(jSONArray5.optString(1));
                sb2.append(" · ");
                sb2.append(jSONArray5.optString(3));
            }
            for (int i19 = 0; i19 < b10.length(); i19++) {
                JSONObject jSONObject3 = b10.getJSONObject(i19);
                if (!jSONObject3.optBoolean("ok")) {
                    sb2.append("\n    host fail · ");
                    sb2.append(jSONObject3.optString("name"));
                    sb2.append(" · ");
                    sb2.append(jSONObject3.optString("got"));
                }
            }
            if (jSONArray2.length() > 0) {
                sb2.append("\n    not on touch: ");
                sb2.append(jSONArray2.join(", "));
            }
            for (int i20 = 0; i20 < jSONArray4.length(); i20++) {
                JSONArray jSONArray6 = jSONArray4.getJSONArray(i20);
                sb2.append("\n    n/a on touch · ");
                sb2.append(jSONArray6.optString(1));
            }
            put.put("summary", sb2.toString());
            yb1Var.I = null;
            c3.s sVar2 = xa1Var.f34684c;
            long j14 = sVar2.f6092a;
            if (j14 != j13) {
                WidgetSandboxNative.arbiterDestroy(j14);
                sVar2.f6092a = j13;
            }
            g(new na1(yb1Var, 2));
            return put;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void g(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f35286g.post(new oa1(runnable, countDownLatch, 1));
        countDownLatch.await(5L, TimeUnit.SECONDS);
    }
}
