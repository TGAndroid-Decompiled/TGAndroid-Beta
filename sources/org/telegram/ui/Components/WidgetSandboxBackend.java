package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Base64;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
final class WidgetSandboxBackend implements mb1, ta1 {
    private static final long MEMORY_BUDGET = 33554432;
    private long imageBytes;
    private int nextFont;
    private final yb1 owner;
    private dc1 text;
    private final HashMap<Integer, Paint> fonts = new HashMap<>();
    private final HashMap<Integer, Paint> deviceFonts = new HashMap<>();
    private final HashMap<Integer, Bitmap> images = new HashMap<>();
    private final HashMap<Integer, ua1> canvases = new HashMap<>();
    private final HashMap<Integer, JSONArray> pendingLayers = new HashMap<>();
    private HashMap<Long, hb1> layerContents = new HashMap<>();
    private final nb1 painter = new nb1();
    private final Rect bounds = new Rect();

    public WidgetSandboxBackend(yb1 yb1Var) {
        this.owner = yb1Var;
    }

    private static void assertWorker() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Native layout and recording must run off UI");
    }

    private void checkCanvasSize(int i10, int i11, int i12) {
        long width;
        long j10 = i11 * i12;
        if (j10 <= 4194304) {
            long j11 = (j10 * 8) + this.imageBytes;
            for (Map.Entry<Integer, ua1> entry : this.canvases.entrySet()) {
                if (entry.getKey().intValue() != i10) {
                    ua1 value = entry.getValue();
                    Bitmap bitmap = value.f33333m;
                    if (bitmap == null) {
                        width = 0;
                    } else {
                        width = bitmap.getWidth() * value.f33333m.getHeight() * 8;
                    }
                    j11 += width;
                }
            }
            if (j11 <= 33554432) {
                return;
            }
            throw new IllegalArgumentException("Canvas memory budget");
        }
        throw new IllegalArgumentException("Canvas dimensions");
    }

    public static String featureSettings(String str) {
        String[] split;
        if (str.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : str.split(",")) {
            if (str2.indexOf(61) == 4) {
                String substring = str2.substring(0, 4);
                String substring2 = str2.substring(5);
                if (substring.matches("[\\x20-\\x7e]{4}") && substring.indexOf(34) < 0 && substring2.matches("\\d{1,5}")) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append('\"');
                    sb2.append(substring);
                    sb2.append("\" ");
                    sb2.append(substring2);
                }
            }
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    private wb1[] layers(JSONObject jSONObject, float f7) {
        int length;
        int i10;
        JSONArray jSONArray;
        float[] fArr;
        float[] fArr2;
        int length2;
        boolean z10;
        int i11;
        cb1 bb1Var;
        float f10 = f7;
        JSONArray optJSONArray = jSONObject.optJSONArray("l");
        int i12 = 0;
        if (optJSONArray == null) {
            length = 0;
        } else {
            length = optJSONArray.length();
        }
        HashMap<Long, hb1> hashMap = new HashMap<>();
        wb1[] wb1VarArr = new wb1[length];
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i13);
            if (optJSONObject != null) {
                long optLong = optJSONObject.optLong("id");
                long optLong2 = optJSONObject.optLong("cv");
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("b");
                if (optJSONArray2 != null) {
                    double optDouble = optJSONArray2.optDouble(i12);
                    i10 = length;
                    double d = f10;
                    int floor = (int) Math.floor(optDouble * d);
                    jSONArray = optJSONArray;
                    int floor2 = (int) Math.floor(optJSONArray2.optDouble(1) * d);
                    int ceil = (int) Math.ceil((optJSONArray2.optDouble(2) + optJSONArray2.optDouble(0)) * d);
                    int ceil2 = (int) Math.ceil((optJSONArray2.optDouble(3) + optJSONArray2.optDouble(1)) * d);
                    hb1 hb1Var = this.layerContents.get(Long.valueOf(optLong));
                    JSONArray jSONArray2 = this.pendingLayers.get(Integer.valueOf(i13));
                    if (jSONArray2 != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            cb1 ab1Var = new ab1("widget-sandbox-layer", floor, floor2, ceil, ceil2);
                            i11 = floor2;
                            bb1Var = ab1Var;
                        } else {
                            i11 = floor2;
                            bb1Var = new bb1(floor, i11, ceil, ceil2);
                        }
                        Canvas a2 = bb1Var.a();
                        try {
                            a2.translate(-floor, -i11);
                            a2.scale(f10, f10);
                            nb1 nb1Var = this.painter;
                            nb1Var.getClass();
                            nb1Var.e(a2, jSONArray2, jSONArray2.length(), this, f10, true);
                            bb1Var.e();
                            hb1Var = new hb1(bb1Var, (int) optLong2);
                        } catch (Throwable th2) {
                            bb1Var.e();
                            throw th2;
                        }
                    } else {
                        if (hb1Var != null) {
                            if (hb1Var.f28908b != ((int) optLong2)) {
                            }
                        }
                        i13++;
                        f10 = f7;
                        length = i10;
                        optJSONArray = jSONArray;
                        i12 = 0;
                    }
                    hashMap.put(Long.valueOf(optLong), hb1Var);
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("l");
                    float[] fArr3 = null;
                    if (optJSONArray3 != null) {
                        float[] fArr4 = new float[4];
                        nb1.c(optJSONArray3, fArr4, 4, new float[0]);
                        JSONArray optJSONArray4 = optJSONObject.optJSONArray("q");
                        if (optJSONArray4 != null) {
                            fArr3 = new float[8];
                            nb1.c(optJSONArray4, fArr3, 8, new float[0]);
                        }
                        fArr2 = fArr3;
                        fArr = fArr4;
                    } else {
                        fArr = null;
                        fArr2 = null;
                    }
                    JSONArray optJSONArray5 = optJSONObject.optJSONArray("k");
                    if (optJSONArray5 == null) {
                        length2 = 0;
                    } else {
                        length2 = (optJSONArray5.length() / 8) * 8;
                    }
                    float[] fArr5 = new float[length2];
                    nb1.c(optJSONArray5, fArr5, length2, new float[0]);
                    int i15 = i14 + 1;
                    cb1 cb1Var = hb1Var.f28907a;
                    double optDouble2 = optJSONObject.optDouble("ts");
                    double optDouble3 = optJSONObject.optDouble("td");
                    if (optJSONObject.optInt("tr") != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    wb1VarArr[i14] = new wb1(cb1Var, fArr, fArr2, optDouble2, optDouble3, z10, fArr5);
                    i14 = i15;
                    i13++;
                    f10 = f7;
                    length = i10;
                    optJSONArray = jSONArray;
                    i12 = 0;
                }
            }
            jSONArray = optJSONArray;
            i10 = length;
            i13++;
            f10 = f7;
            length = i10;
            optJSONArray = jSONArray;
            i12 = 0;
        }
        int i16 = length;
        this.layerContents = hashMap;
        if (i14 == i16) {
            return wb1VarArr;
        }
        wb1[] wb1VarArr2 = new wb1[i14];
        System.arraycopy(wb1VarArr, 0, wb1VarArr2, 0, i14);
        return wb1VarArr2;
    }

    private static String text(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    private static android.graphics.Typeface typeface(java.lang.String r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.WidgetSandboxBackend.typeface(java.lang.String, int, boolean):android.graphics.Typeface");
    }

    @Override
    public Bitmap canvas(int i10) {
        Bitmap bitmap;
        ua1 ua1Var = this.canvases.get(Integer.valueOf(i10));
        if (ua1Var == null || (bitmap = ua1Var.f33333m) == null) {
            return null;
        }
        if (ua1Var.f33337q != ua1Var.f33336p || ua1Var.f33334n == null) {
            ua1Var.f33334n = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            ua1Var.f33337q = ua1Var.f33336p;
        }
        return ua1Var.f33334n;
    }

    @Override
    public Bitmap canvasBitmap(int i10) {
        ua1 ua1Var = this.canvases.get(Integer.valueOf(i10));
        if (ua1Var == null) {
            return null;
        }
        return ua1Var.f33333m;
    }

    public byte[] canvasRead(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i11;
        assertWorker();
        if (i13 > 0 && i14 > 0 && i13 * i14 <= 4194304) {
            ua1 ua1Var = this.canvases.get(Integer.valueOf(i10));
            if (ua1Var == null) {
                return new byte[i13 * i14 * 4];
            }
            byte[] bArr = new byte[Math.max(i14, 0) * Math.max(i13, 0) * 4];
            if (ua1Var.f33333m != null) {
                int max = Math.max(0, i15);
                int max2 = Math.max(0, i12);
                int min = Math.min(ua1Var.f33333m.getWidth(), i15 + i13);
                int min2 = Math.min(ua1Var.f33333m.getHeight(), i14 + i12);
                if (min > max && min2 > max2) {
                    int i16 = min - max;
                    int i17 = min2 - max2;
                    int[] iArr = new int[i16 * i17];
                    ua1Var.f33333m.getPixels(iArr, 0, i16, max, max2, i16, i17);
                    int i18 = max2;
                    while (i18 < min2) {
                        int i19 = max;
                        while (i19 < min) {
                            int i20 = iArr[(i19 - max) + ((i18 - max2) * i16)];
                            int i21 = ((i19 - i15) + ((i18 - i12) * i13)) * 4;
                            bArr[i21] = (byte) Color.red(i20);
                            bArr[i21 + 1] = (byte) Color.green(i20);
                            bArr[i21 + 2] = (byte) Color.blue(i20);
                            bArr[i21 + 3] = (byte) Color.alpha(i20);
                            i19++;
                            i15 = i11;
                        }
                        i18++;
                        i15 = i11;
                    }
                }
            }
            return bArr;
        }
        return null;
    }

    public void canvasRelease(int i10) {
        assertWorker();
        ua1 remove = this.canvases.remove(Integer.valueOf(i10));
        if (remove != null) {
            Bitmap bitmap = remove.f33333m;
            if (bitmap != null) {
                bitmap.recycle();
            }
            remove.f33333m = null;
            remove.f33335o = null;
            remove.f33334n = null;
        }
    }

    public void canvasRun(int i10, int i11, int i12, byte[] bArr) {
        int i13;
        int i14;
        JSONArray jSONArray;
        int i15;
        int[] iArr;
        assertWorker();
        if (i11 > 0 && i12 > 0) {
            checkCanvasSize(i10, i11, i12);
            ua1 ua1Var = this.canvases.get(Integer.valueOf(i10));
            if (ua1Var == null) {
                ua1Var = new ua1(i10);
                this.canvases.put(Integer.valueOf(i10), ua1Var);
            }
            JSONArray jSONArray2 = new JSONArray(text(bArr));
            Bitmap bitmap = ua1Var.f33333m;
            if (bitmap == null || bitmap.getWidth() != i11 || ua1Var.f33333m.getHeight() != i12) {
                Bitmap bitmap2 = ua1Var.f33333m;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ua1Var.f33333m = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                ua1Var.f33335o = new Canvas(ua1Var.f33333m);
            }
            int i16 = 0;
            int i17 = 0;
            while (i17 < jSONArray2.length()) {
                JSONObject optJSONObject = jSONArray2.optJSONObject(i17);
                if (optJSONObject != null) {
                    Paint paint = ua1Var.f33325b;
                    int optInt = optJSONObject.optInt("k");
                    if (optInt == 0) {
                        ua1Var.f33333m.eraseColor(i16);
                    } else {
                        if (optInt == 6) {
                            int optInt2 = optJSONObject.optInt("w");
                            int optInt3 = optJSONObject.optInt("h");
                            try {
                                byte[] decode = Base64.decode(optJSONObject.optString("px"), i16);
                                if (optInt2 > 0 && optInt3 > 0 && decode.length == optInt2 * optInt3 * 4) {
                                    int optDouble = (int) optJSONObject.optDouble("x");
                                    int optDouble2 = (int) optJSONObject.optDouble("y");
                                    int max = Math.max(i16, optDouble);
                                    int max2 = Math.max(i16, optDouble2);
                                    int min = Math.min(ua1Var.f33333m.getWidth(), optDouble + optInt2);
                                    int min2 = Math.min(ua1Var.f33333m.getHeight(), optInt3 + optDouble2);
                                    if (min > max && min2 > max2) {
                                        int i18 = min - max;
                                        int i19 = min2 - max2;
                                        int[] iArr2 = new int[i18 * i19];
                                        i15 = i16;
                                        int i20 = max2;
                                        while (i20 < min2) {
                                            int i21 = max;
                                            while (i21 < min) {
                                                int i22 = ((i21 - optDouble) + ((i20 - optDouble2) * optInt2)) * 4;
                                                iArr2[(i21 - max) + ((i20 - max2) * i18)] = Color.argb(decode[i22 + 3] & 255, decode[i22] & 255, decode[i22 + 1] & 255, decode[i22 + 2] & 255);
                                                i21++;
                                                i20 = i20;
                                                i17 = i17;
                                                optDouble2 = optDouble2;
                                                jSONArray2 = jSONArray2;
                                            }
                                            i20++;
                                        }
                                        i14 = i17;
                                        jSONArray = jSONArray2;
                                        ua1Var.f33333m.setPixels(iArr2, 0, i18, max, max2, i18, i19);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            i15 = i16;
                            i14 = i17;
                            jSONArray = jSONArray2;
                        } else {
                            i15 = i16;
                            i14 = i17;
                            jSONArray = jSONArray2;
                            ua1Var.f33335o.save();
                            JSONArray optJSONArray = optJSONObject.optJSONArray("cl");
                            if (optJSONArray != null) {
                                for (int i23 = i15; i23 < optJSONArray.length(); i23++) {
                                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i23);
                                    if (optJSONObject2 != null) {
                                        Canvas canvas = ua1Var.f33335o;
                                        Path path = ua1Var.e;
                                        nb1.h(optJSONObject2, path);
                                        canvas.clipPath(path);
                                    }
                                }
                            }
                            if (optInt == 3) {
                                Canvas canvas2 = ua1Var.f33335o;
                                Path path2 = ua1Var.d;
                                nb1.h(optJSONObject, path2);
                                canvas2.drawPath(path2, ua1Var.f33326c);
                                ua1Var.f33335o.restore();
                            } else {
                                float max3 = Math.max(0.0f, Math.min(1.0f, (float) optJSONObject.optDouble("a", 1.0d)));
                                int optInt4 = optJSONObject.optInt("cm");
                                JSONArray optJSONArray2 = optJSONObject.optJSONArray("sh");
                                if (optJSONArray2 != null && optJSONObject.has("shc")) {
                                    Bitmap createBitmap = Bitmap.createBitmap(ua1Var.f33333m.getWidth(), ua1Var.f33333m.getHeight(), Bitmap.Config.ARGB_8888);
                                    ua1Var.c(new Canvas(createBitmap), optJSONObject, this);
                                    Paint paint2 = new Paint(1);
                                    float optDouble3 = ((float) optJSONArray2.optDouble(2)) / 2.0f;
                                    if (optDouble3 > 0.5f) {
                                        paint2.setMaskFilter(new BlurMaskFilter((optDouble3 - 0.5f) / 0.57735f, BlurMaskFilter.Blur.NORMAL));
                                    }
                                    Bitmap extractAlpha = createBitmap.extractAlpha(paint2, new int[2]);
                                    paint.reset();
                                    paint.setAlpha(Math.round(max3 * 255.0f));
                                    ua1.b(paint, optInt4);
                                    ua1Var.f33335o.saveLayer(null, paint);
                                    Paint paint3 = new Paint(1);
                                    paint3.setColor((int) optJSONObject.optLong("shc"));
                                    i13 = i15;
                                    ua1Var.f33335o.drawBitmap(extractAlpha, iArr[i15] + ((float) optJSONArray2.optDouble(i13)), iArr[1] + ((float) optJSONArray2.optDouble(1)), paint3);
                                    ua1Var.f33335o.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                                    ua1Var.f33335o.restore();
                                    extractAlpha.recycle();
                                    createBitmap.recycle();
                                } else {
                                    i13 = i15;
                                    if (max3 >= 1.0f && optInt4 == 0) {
                                        ua1Var.c(ua1Var.f33335o, optJSONObject, this);
                                    } else {
                                        paint.reset();
                                        paint.setAlpha(Math.round(max3 * 255.0f));
                                        ua1.b(paint, optInt4);
                                        ua1Var.f33335o.saveLayer(null, paint);
                                        ua1Var.c(ua1Var.f33335o, optJSONObject, this);
                                        ua1Var.f33335o.restore();
                                    }
                                }
                                ua1Var.f33335o.restore();
                                i17 = i14 + 1;
                                i16 = i13;
                                jSONArray2 = jSONArray;
                            }
                        }
                        i13 = i15;
                        i17 = i14 + 1;
                        i16 = i13;
                        jSONArray2 = jSONArray;
                    }
                }
                i13 = i16;
                i14 = i17;
                jSONArray = jSONArray2;
                i17 = i14 + 1;
                i16 = i13;
                jSONArray2 = jSONArray;
            }
            ua1Var.f33336p++;
            return;
        }
        canvasRelease(i10);
    }

    public float[] createFont(byte[] bArr, float f7, int i10, boolean z10, byte[] bArr2) {
        assertWorker();
        Paint paint = new Paint(129);
        paint.setTextSize(f7);
        paint.setTypeface(typeface(text(bArr), i10, z10));
        String featureSettings = featureSettings(text(bArr2));
        if (featureSettings != null) {
            paint.setFontFeatureSettings(featureSettings);
        }
        float f10 = this.owner.h;
        Paint paint2 = new Paint(paint);
        paint2.setTextSize(f7 * f10);
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        int i11 = this.nextFont + 1;
        this.nextFont = i11;
        this.fonts.put(Integer.valueOf(i11), paint);
        this.deviceFonts.put(Integer.valueOf(i11), paint2);
        paint2.getTextBounds("x", 0, 1, this.bounds);
        float f11 = fontMetrics.ascent;
        float f12 = fontMetrics.descent;
        return new float[]{i11, (-f11) / f10, f12 / f10, ((f12 - f11) + fontMetrics.leading) / f10, this.bounds.height() / f10, paint2.measureText("0") / f10};
    }

    public void deleteFont(int i10) {
        this.fonts.remove(Integer.valueOf(i10));
        this.deviceFonts.remove(Integer.valueOf(i10));
    }

    @Override
    public Paint deviceFont(int i10) {
        return this.deviceFonts.get(Integer.valueOf(i10));
    }

    @Override
    public Paint font(int i10) {
        return this.fonts.get(Integer.valueOf(i10));
    }

    public byte[] formatIntl(byte[] bArr) {
        return ib1.b(text(bArr)).getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public Bitmap image(int i10) {
        return this.images.get(Integer.valueOf(i10));
    }

    public float[] loadImage(int r42, byte[] r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.WidgetSandboxBackend.loadImage(int, byte[]):float[]");
    }

    public void record(byte[] bArr, byte[] bArr2, double d, int i10, int i11, float f7, float f10, int i12, int i13) {
        cb1 bb1Var;
        int i14;
        assertWorker();
        this.owner.getClass();
        this.owner.getClass();
        Trace.beginSection("WidgetSandbox:Record");
        long nanoTime = System.nanoTime();
        double d10 = d - (nanoTime / 1.0E9d);
        if (Build.VERSION.SDK_INT >= 29) {
            bb1Var = new ab1("widget-sandbox-content", 0, 0, i10, i11);
            i14 = i11;
        } else {
            i14 = i11;
            bb1Var = new bb1(0, 0, i10, i14);
        }
        cb1 cb1Var = bb1Var;
        try {
            try {
                JSONArray jSONArray = new JSONArray(text(bArr));
                Canvas a2 = cb1Var.a();
                try {
                    a2.scale(f7, f7);
                    nb1 nb1Var = this.painter;
                    nb1Var.getClass();
                    nb1Var.e(a2, jSONArray, jSONArray.length(), this, f7, true);
                    cb1Var.e();
                    this.owner.b(cb1Var, layers(new JSONObject(text(bArr2)), f7), d10, i10, i14, f10, ((float) (System.nanoTime() - nanoTime)) / 1000000.0f, i12, i13, jSONArray.length(), this.text);
                } catch (Throwable th2) {
                    cb1Var.e();
                    throw th2;
                }
            } finally {
                this.pendingLayers.clear();
                Trace.endSection();
            }
        } catch (Exception e) {
            cb1Var.c();
            throw e;
        }
    }

    public void recordLayer(int i10, int i11, byte[] bArr) {
        assertWorker();
        this.pendingLayers.put(Integer.valueOf(i10), new JSONArray(text(bArr)));
    }

    public void selectableText(byte[] bArr) {
        assertWorker();
        try {
            String text = text(bArr);
            HashMap<Integer, Paint> hashMap = this.deviceFonts;
            Objects.requireNonNull(hashMap);
            this.text = dc1.a(text, new w81(hashMap), this.owner.h);
        } catch (Exception unused) {
            this.text = null;
        }
    }

    public void signal(int i10, byte[] bArr) {
        final yb1 yb1Var = this.owner;
        final String text = text(bArr);
        if (i10 == 8) {
            yb1Var.f35000a.post(new Runnable() {
                @Override
                public final void run() {
                    xb1 xb1Var;
                    xb1 xb1Var2;
                    switch (r3) {
                        case 0:
                            yb1 yb1Var2 = yb1Var;
                            String str = text;
                            if (yb1Var2.K != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str);
                                    JSONObject optJSONObject = jSONObject.optJSONObject("values");
                                    xb1 xb1Var3 = yb1Var2.K;
                                    String optString = jSONObject.optString("area");
                                    if (optJSONObject == null) {
                                        optJSONObject = new JSONObject();
                                    }
                                    xb1Var3.g(optString, optJSONObject);
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                            return;
                        case 1:
                            yb1 yb1Var3 = yb1Var;
                            String str2 = text;
                            if (!yb1Var3.f35015s && (xb1Var = yb1Var3.H) != null) {
                                xb1Var.a(str2);
                                return;
                            }
                            return;
                        default:
                            yb1 yb1Var4 = yb1Var;
                            String str3 = text;
                            if (!yb1Var4.f35015s && (xb1Var2 = yb1Var4.H) != null) {
                                try {
                                    xb1Var2.e(new JSONObject(str3));
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                            return;
                    }
                }
            });
        } else if (i10 == 10) {
            b3 b3Var = yb1Var.J;
            if (b3Var != null) {
                b3Var.run(text);
            }
        } else if (!yb1Var.f35015s) {
            if (i10 == 11) {
                yb1Var.f35000a.post(new Runnable() {
                    @Override
                    public final void run() {
                        xb1 xb1Var;
                        xb1 xb1Var2;
                        switch (r3) {
                            case 0:
                                yb1 yb1Var2 = yb1Var;
                                String str = text;
                                if (yb1Var2.K != null) {
                                    try {
                                        JSONObject jSONObject = new JSONObject(str);
                                        JSONObject optJSONObject = jSONObject.optJSONObject("values");
                                        xb1 xb1Var3 = yb1Var2.K;
                                        String optString = jSONObject.optString("area");
                                        if (optJSONObject == null) {
                                            optJSONObject = new JSONObject();
                                        }
                                        xb1Var3.g(optString, optJSONObject);
                                    } catch (Exception unused) {
                                        return;
                                    }
                                }
                                return;
                            case 1:
                                yb1 yb1Var3 = yb1Var;
                                String str2 = text;
                                if (!yb1Var3.f35015s && (xb1Var = yb1Var3.H) != null) {
                                    xb1Var.a(str2);
                                    return;
                                }
                                return;
                            default:
                                yb1 yb1Var4 = yb1Var;
                                String str3 = text;
                                if (!yb1Var4.f35015s && (xb1Var2 = yb1Var4.H) != null) {
                                    try {
                                        xb1Var2.e(new JSONObject(str3));
                                    } catch (Exception unused2) {
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
            } else if (i10 == 9) {
                b3 b3Var2 = yb1Var.I;
                if (b3Var2 != null) {
                    yb1Var.f35000a.post(new ai.j1(b3Var2, text));
                }
            } else {
                boolean z10 = false;
                if (i10 == 6) {
                    yb1Var.f35007k.set(false);
                    yb1Var.f35000a.post(yb1Var.N);
                } else if (i10 != 1 && i10 != 2) {
                    try {
                        if (i10 == 3) {
                            JSONObject jSONObject = new JSONObject(text);
                            yb1Var.f35000a.post(new c00(yb1Var, jSONObject.optBoolean("x"), jSONObject.optBoolean("y"), jSONObject.optBoolean("hold"), 1));
                        } else if (i10 == 4) {
                            JSONObject jSONObject2 = new JSONObject(text);
                            if (jSONObject2.optBoolean("loaded")) {
                                yb1Var.f35016t = true;
                            }
                            yb1Var.f35018w = "bottom".equals(jSONObject2.optString("resizeAnchor"));
                            if (jSONObject2.optBoolean("rendered") && !yb1Var.f35017u) {
                                double optDouble = jSONObject2.optDouble("height", -1.0d);
                                double min = Math.min(600.0f, Math.max(50.0f, yb1Var.f35012p / yb1Var.h));
                                if (yb1Var.f35013q && optDouble > 0.0d && Math.abs(min - optDouble) <= 1.0d) {
                                    yb1Var.v = true;
                                }
                                yb1Var.f35017u = true;
                            }
                            synchronized (yb1Var.f35011o) {
                                if (yb1Var.f35015s) {
                                    return;
                                }
                                yb1Var.F = jSONObject2;
                                if (!yb1Var.G) {
                                    yb1Var.G = true;
                                    yb1Var.f35000a.post(yb1Var.M);
                                }
                            }
                        } else if (i10 == 5) {
                            yb1Var.f35000a.post(new Runnable() {
                                @Override
                                public final void run() {
                                    xb1 xb1Var;
                                    xb1 xb1Var2;
                                    switch (r3) {
                                        case 0:
                                            yb1 yb1Var2 = yb1Var;
                                            String str = text;
                                            if (yb1Var2.K != null) {
                                                try {
                                                    JSONObject jSONObject3 = new JSONObject(str);
                                                    JSONObject optJSONObject = jSONObject3.optJSONObject("values");
                                                    xb1 xb1Var3 = yb1Var2.K;
                                                    String optString = jSONObject3.optString("area");
                                                    if (optJSONObject == null) {
                                                        optJSONObject = new JSONObject();
                                                    }
                                                    xb1Var3.g(optString, optJSONObject);
                                                } catch (Exception unused) {
                                                    return;
                                                }
                                            }
                                            return;
                                        case 1:
                                            yb1 yb1Var3 = yb1Var;
                                            String str2 = text;
                                            if (!yb1Var3.f35015s && (xb1Var = yb1Var3.H) != null) {
                                                xb1Var.a(str2);
                                                return;
                                            }
                                            return;
                                        default:
                                            yb1 yb1Var4 = yb1Var;
                                            String str3 = text;
                                            if (!yb1Var4.f35015s && (xb1Var2 = yb1Var4.H) != null) {
                                                try {
                                                    xb1Var2.e(new JSONObject(str3));
                                                } catch (Exception unused2) {
                                                    return;
                                                }
                                            }
                                            return;
                                    }
                                }
                            });
                        } else if (i10 == 7) {
                            float parseFloat = Float.parseFloat(text);
                            AtomicBoolean atomicBoolean = yb1Var.f35009m;
                            if (parseFloat == 0.0f) {
                                z10 = true;
                            }
                            atomicBoolean.set(z10);
                            yb1Var.f35000a.post(new org.telegram.ui.b0(yb1Var, parseFloat, 2));
                        }
                    } catch (NumberFormatException | Exception unused) {
                    }
                } else {
                    if (i10 == 1) {
                        yb1Var.f35008l.set(true);
                    } else {
                        yb1Var.f35006j.set(true);
                    }
                    yb1Var.f35000a.removeCallbacks(yb1Var.N);
                    yb1Var.f35000a.post(yb1Var.N);
                }
            }
        }
    }

    public float textWidth(int i10, byte[] bArr) {
        Paint paint = this.deviceFonts.get(Integer.valueOf(i10));
        if (paint == null) {
            return 0.0f;
        }
        return paint.measureText(text(bArr)) / this.owner.h;
    }
}
