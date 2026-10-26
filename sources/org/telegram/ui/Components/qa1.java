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
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.WidgetConformanceActivity;
public final class qa1 {
    public final Context f31873a;
    public final File f31874b;
    public final String f31875c;
    public final org.telegram.ui.hl0 d;
    public final Handler e = new Handler(Looper.getMainLooper());

    public qa1(WidgetConformanceActivity widgetConformanceActivity, String str, org.telegram.ui.hl0 hl0Var) {
        this.f31873a = widgetConformanceActivity.getApplicationContext();
        this.f31874b = new File(widgetConformanceActivity.getExternalFilesDir(null), "attacks");
        this.f31875c = str;
        this.d = hl0Var;
    }

    public final void a(String str) {
        Log.i("WidgetAttacks", str);
        this.e.post(new c71(7, this, str));
    }

    public final void b() {
        char c10;
        int i10;
        File file = this.f31874b;
        JSONArray jSONArray = new JSONArray();
        try {
            try {
                int i11 = 2;
                File[] listFiles = file.listFiles(new da.a(2));
                try {
                    if (listFiles != null) {
                        Arrays.sort(listFiles);
                        char c11 = 1;
                        WidgetSandboxNative.attackScan(true);
                        int length = listFiles.length;
                        int i12 = 0;
                        int i13 = 0;
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            String str = "dead";
                            if (i12 < length) {
                                File file2 = listFiles[i12];
                                String str2 = this.f31875c;
                                if (str2 != null && !str2.isEmpty()) {
                                    c10 = c11;
                                    if (!file2.getName().contains(str2)) {
                                        i10 = i11;
                                        i12++;
                                        c11 = c10;
                                        i11 = i10;
                                    }
                                } else {
                                    c10 = c11;
                                }
                                JSONObject c12 = c(file2);
                                jSONArray.put(c12);
                                i13++;
                                if (!c12.optBoolean("ok")) {
                                    i14++;
                                }
                                if (!c12.optString("dead").isEmpty()) {
                                    i15++;
                                }
                                String name = file2.getName();
                                if (c12.optBoolean("ok")) {
                                    if (c12.optString("dead").isEmpty()) {
                                        str = "ok";
                                    }
                                } else {
                                    str = "FAIL";
                                }
                                String optString = c12.optString("summary");
                                i10 = i11;
                                Object[] objArr = new Object[3];
                                objArr[0] = name;
                                objArr[c10] = str;
                                objArr[i10] = optString;
                                a(String.format("%-40s %-6s %s", objArr));
                                JSONArray optJSONArray = c12.optJSONArray("problems");
                                for (int i16 = 0; optJSONArray != null && i16 < optJSONArray.length(); i16++) {
                                    a("    " + optJSONArray.optString(i16));
                                }
                                i12++;
                                c11 = c10;
                                i11 = i10;
                            } else {
                                int i17 = i11;
                                JSONObject put = new JSONObject().put("width", 390).put("files", i13).put("failed", i14).put("dead", i15).put("results", jSONArray);
                                File file3 = new File(file, "report.json");
                                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                try {
                                    fileOutputStream.write(put.toString(i17).getBytes(StandardCharsets.UTF_8));
                                    fileOutputStream.close();
                                    a("done · " + i13 + " attacks · " + i14 + " failed · " + i15 + " runtimes killed by limits · " + file3);
                                    WidgetSandboxNative.attackScan(false);
                                    return;
                                } catch (Throwable th2) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("no " + file);
                    }
                } catch (Exception e) {
                    e = e;
                    a("error · " + e);
                    WidgetSandboxNative.attackScan(false);
                }
            } catch (Throwable th4) {
                th = th4;
                WidgetSandboxNative.attackScan(false);
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
        } catch (Throwable th5) {
            th = th5;
            WidgetSandboxNative.attackScan(false);
            throw th;
        }
    }

    public final JSONObject c(File file) {
        String optString;
        boolean z10;
        String optString2;
        String str;
        String str2;
        JSONObject put = new JSONObject().put("file", file.getName());
        pa1 pa1Var = new pa1();
        Context context = this.f31873a;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[16384];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
            fileInputStream.close();
            yb1 yb1Var = new yb1(context, byteArrayOutputStream2, zb1.d(false), 1, "en-US", null);
            yb1Var.J = new b3(pa1Var, 13);
            d(new c71(6, yb1Var, pa1Var));
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                try {
                    yb1Var.f(Math.round(AndroidUtilities.density * 390.0f));
                } catch (Exception e) {
                    pa1Var.f31517b = String.valueOf(e.getMessage());
                }
                pa1Var.j();
                int h = pa1Var.h();
                d(new na1(yb1Var, 0));
                Thread.sleep(80L);
                d(new na1(yb1Var, 1));
                Thread.sleep(1500L);
                int h10 = pa1Var.h() - h;
                JSONArray jSONArray = new JSONArray();
                synchronized (pa1Var.d) {
                    ArrayList arrayList = pa1Var.d;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        jSONArray.put("LEAK " + ((String) obj));
                    }
                }
                if (h > 0) {
                    jSONArray.put("ACTION before the tap: " + pa1Var.i());
                }
                boolean z11 = true;
                if (h10 > 1) {
                    jSONArray.put("ACTIONS after one tap: " + pa1Var.i());
                }
                JSONObject jSONObject = pa1Var.f31516a;
                if (jSONObject == null) {
                    optString = "";
                } else {
                    optString = jSONObject.optString("dead");
                }
                if (jSONArray.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                JSONObject put2 = put.put("ok", z10).put("problems", jSONArray).put("dead", optString);
                if (jSONObject == null || !jSONObject.optBoolean("loaded")) {
                    z11 = false;
                }
                put2.put("loaded", z11).put("actions", pa1Var.h()).put("ms", SystemClock.uptimeMillis() - uptimeMillis);
                StringBuilder sb2 = new StringBuilder();
                if (jSONObject == null) {
                    optString2 = "no diagnostics";
                } else {
                    optString2 = jSONObject.optString("diagnostic");
                }
                sb2.append(optString2);
                if (optString.isEmpty()) {
                    str = "";
                } else {
                    str = " — " + optString;
                }
                sb2.append(str);
                if (pa1Var.f31517b != null) {
                    str2 = " — failure: " + pa1Var.f31517b;
                } else {
                    str2 = "";
                }
                sb2.append(str2);
                String sb3 = sb2.toString();
                if (sb3.length() > 140) {
                    sb3 = sb3.substring(0, 140);
                }
                put.put("summary", sb3);
                return put;
            } finally {
                d(new na1(yb1Var, 2));
            }
        } finally {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
    }

    public final void d(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.e.post(new oa1(runnable, countDownLatch, 0));
        countDownLatch.await(5L, TimeUnit.SECONDS);
    }
}
