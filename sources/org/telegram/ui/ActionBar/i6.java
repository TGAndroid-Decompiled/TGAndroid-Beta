package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.t9;
public final class i6 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public TLRPC.TL_theme F;
    public boolean G;
    public String H;
    public String I;
    public TLRPC.InputFile J;
    public TLRPC.InputFile K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public String f18757a;
    public SparseArray f18758a0;
    public String f18759b;
    public ArrayList f18760b0;
    public String f18761c;
    public LongSparseArray f18762c0;
    public String d;
    public final LongSparseArray f18763d0;
    public String e;
    public int f18764e0;
    public boolean f18765f;
    public int f18766f0;
    public String f18767g0;
    public boolean h;
    public String f18768h0;
    public c6 f18769i0;
    public int f18770j0;
    public boolean f18771n;
    public int f18772r;
    public int f18773s;
    public int v;
    public int f18774w;
    public int f18775x;
    public int f18776y;

    public i6() {
        this.f18775x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f18763d0 = new LongSparseArray();
        this.f18764e0 = 0;
        this.f18766f0 = 100;
        this.f18770j0 = -1;
    }

    public static boolean a(h6 h6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        long j3;
        long j10;
        long j11;
        String str;
        int i14;
        int i15;
        float f7;
        TLRPC.WallPaperSettings wallPaperSettings;
        if (themeSettings.message_colors.size() > 0) {
            i10 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        if (themeSettings.message_colors.size() > 1) {
            i11 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        if (i10 == i11) {
            i11 = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        if (themeSettings.message_colors.size() > 3) {
            i13 = (-16777216) | themeSettings.message_colors.get(3).intValue();
        } else {
            i13 = 0;
        }
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            i14 = j6.X0(wallPaperSettings.background_color);
            int i16 = themeSettings.wallpaper.settings.second_background_color;
            j11 = 4294967296L;
            if (i16 == 0) {
                j3 = 4294967296L;
            } else {
                j3 = j6.X0(i16);
            }
            int i17 = themeSettings.wallpaper.settings.third_background_color;
            if (i17 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = j6.X0(i17);
            }
            int i18 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i18 != 0) {
                j11 = j6.X0(i18);
            }
            i15 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f7 = wallPaper2.settings.intensity / 100.0f;
                long j12 = j10;
                if (themeSettings.accent_color != h6Var.f18723c && themeSettings.outbox_accent_color == h6Var.d && i10 == h6Var.e && i11 == h6Var.f18724f && i12 == h6Var.f18725g && i13 == h6Var.h && themeSettings.message_colors_animated == h6Var.f18726i && i14 == h6Var.f18727j && j3 == h6Var.f18728k && j12 == h6Var.f18729l && j11 == h6Var.f18730m && i15 == h6Var.f18731n && TextUtils.equals(str, h6Var.f18732o) && Math.abs(f7 - h6Var.f18733p) < 0.001d) {
                    return z11;
                }
                return z10;
            }
            str = null;
        } else {
            z10 = false;
            z11 = true;
            j3 = 0;
            j10 = 0;
            j11 = 0;
            str = null;
            i14 = 0;
            i15 = 0;
        }
        f7 = 0.0f;
        long j122 = j10;
        if (themeSettings.accent_color != h6Var.f18723c) {
        }
        return z10;
    }

    public static void b(i6 i6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        i6Var.W = iArr.length;
        i6Var.f18760b0 = new ArrayList();
        i6Var.f18758a0 = new SparseArray();
        i6Var.f18762c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            h6 h6Var = new h6();
            h6Var.f18721a = iArr8[i10];
            if (j6.g1(h6Var)) {
                h6Var.f18742z = true;
            }
            h6Var.f18723c = iArr[i10];
            h6Var.f18722b = i6Var;
            h6Var.e = iArr2[i10];
            h6Var.f18724f = iArr3[i10];
            long j3 = iArr4[i10];
            h6Var.f18727j = j3;
            boolean z10 = i6Var.S;
            if (z10 && h6Var.f18721a == j6.f19041n) {
                h6Var.f18727j = 4294967296L;
            } else {
                h6Var.f18727j = j3;
            }
            if (z10 && h6Var.f18721a == j6.f19041n) {
                h6Var.f18728k = 4294967296L;
            } else {
                h6Var.f18728k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && h6Var.f18721a == j6.f19041n) {
                    h6Var.f18729l = 4294967296L;
                } else {
                    h6Var.f18729l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && h6Var.f18721a == j6.f19041n) {
                    h6Var.f18730m = 4294967296L;
                } else {
                    h6Var.f18730m = iArr7[i10];
                }
            }
            h6Var.f18733p = iArr10[i10] / 100.0f;
            h6Var.f18731n = iArr9[i10];
            h6Var.f18732o = strArr[i10];
            if ((j6.g1(h6Var) && i6Var.f18757a.equals("Dark Blue")) || i6Var.f18757a.equals("Night")) {
                h6Var.e = -14316059;
                h6Var.f18724f = -12422433;
                h6Var.f18725g = -8304937;
                h6Var.h = -6340950;
                if (i6Var.f18757a.equals("Night")) {
                    h6Var.f18733p = -0.57f;
                    h6Var.f18727j = -9666650L;
                    h6Var.f18728k = -13749173L;
                    h6Var.f18729l = -8883033L;
                    h6Var.f18730m = -13421992L;
                }
            }
            i6Var.f18758a0.put(h6Var.f18721a, h6Var);
            i6Var.f18760b0.add(h6Var);
        }
        i6Var.X = ((h6) i6Var.f18758a0.get(0)).f18723c;
    }

    public static void c(i6 i6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = i6Var.f18760b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = i6Var.f18760b0.size();
            for (int i10 = 0; i10 < size; i10++) {
                h6 h6Var = (h6) i6Var.f18760b0.get(i10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i6Var.f18757a);
                sb2.append("_");
                i6Var.r(sharedPreferences, h6Var, a4.a.n(h6Var.f18721a, "_owp", sb2));
            }
            return;
        }
        i6Var.r(sharedPreferences, null, a4.a.s(new StringBuilder(), i6Var.f18757a, "_owp"));
    }

    public static i6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            i6 i6Var = new i6();
            i6Var.f18757a = jSONObject.getString("name");
            i6Var.f18759b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                i6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                i6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                i6Var.G = jSONObject.getBoolean("loaded");
            }
            return i6Var;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static i6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        i6 i6Var = new i6();
        i6Var.f18757a = split[0];
        i6Var.f18759b = split[1];
        return i6Var;
    }

    public static void i(h6 h6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        h6Var.f18723c = themeSettings.accent_color;
        h6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i10 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        h6Var.e = i10;
        if (themeSettings.message_colors.size() > 1) {
            i11 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        h6Var.f18724f = i11;
        if (h6Var.e == i11) {
            h6Var.f18724f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        h6Var.f18725g = i12;
        if (themeSettings.message_colors.size() > 3) {
            i13 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i13 = 0;
        }
        h6Var.h = i13;
        h6Var.f18726i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            int i14 = wallPaperSettings.background_color;
            if (i14 == 0) {
                h6Var.f18727j = 4294967296L;
            } else {
                h6Var.f18727j = j6.X0(i14);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                h6Var.f18728k = 4294967296L;
            } else {
                h6Var.f18728k = j6.X0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                h6Var.f18729l = 4294967296L;
            } else {
                h6Var.f18729l = j6.X0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                h6Var.f18730m = 4294967296L;
            } else {
                h6Var.f18730m = j6.X0(wallPaperSettings4.fourth_background_color);
            }
            h6Var.f18731n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                h6Var.f18732o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                h6Var.f18733p = wallPaperSettings5.intensity / 100.0f;
                h6Var.f18734q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f18772r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = cc0.g(this.f18772r, this.f18773s, i10, this.f18774w);
                } else {
                    int i11 = this.f18773s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f18772r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(t9.d(this.f18775x), new int[]{this.f18772r, this.f18773s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.f18772r);
                        canvas.drawColor(this.f18772r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.f18776y / 100.0f) * 255.0f));
                canvas.drawBitmap(scaledBitmap, 0.0f, 0.0f, paint);
                canvas.setBitmap(null);
                scaledBitmap = createBitmap;
            }
            if (this.h) {
                scaledBitmap = Utilities.blurWallpaper(scaledBitmap);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            if (this.v != 0) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
            scaledBitmap.compress(compressFormat, 87, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return false;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.fileLoaded;
        if (i10 == i12 || i10 == NotificationCenter.fileLoadFailed) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.F;
            if (tL_theme != null && tL_theme.document != null) {
                if (str.equals(this.f18767g0)) {
                    this.f18767g0 = null;
                    Utilities.globalQueue.postRunnable(new m4.g0(26, this, (File) objArr[1]));
                } else if (str.equals(FileLoader.getAttachFileName(this.F.document))) {
                    t();
                    if (i10 == i12) {
                        File file = new File(this.f18759b);
                        TLRPC.TL_theme tL_theme2 = this.F;
                        i6 k02 = j6.k0(file, tL_theme2.title, tL_theme2);
                        if (k02 != null && k02.f18761c != null && !new File(k02.f18761c).exists()) {
                            this.f18772r = k02.f18772r;
                            this.f18773s = k02.f18773s;
                            this.v = k02.v;
                            this.f18774w = k02.f18774w;
                            this.f18775x = k02.f18775x;
                            this.h = k02.h;
                            this.f18776y = k02.f18776y;
                            this.f18768h0 = k02.f18761c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = k02.e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(k02.E).sendRequest(getwallpaper, new ai.v1(21, this, k02));
                            return;
                        }
                        s();
                    }
                }
            }
        }
    }

    public final h6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.f18763d0;
            h6 h6Var = (h6) longSparseArray.get(j3);
            if (h6Var != null) {
                return h6Var;
            }
            int i11 = this.f18764e0 + 1;
            this.f18764e0 = i11;
            h6 h6Var2 = new h6();
            i(h6Var2, themeSettings);
            h6Var2.f18722b = this;
            h6Var2.f18721a = i11;
            h6Var2.f18735r = tL_theme;
            h6Var2.f18737t = i10;
            longSparseArray.put(i11, h6Var2);
            return h6Var2;
        }
        h6 h6Var3 = (h6) this.f18762c0.get(j3);
        if (h6Var3 != null) {
            return h6Var3;
        }
        int i12 = this.f18766f0 + 1;
        this.f18766f0 = i12;
        h6 h6Var4 = new h6();
        i(h6Var4, themeSettings);
        h6Var4.f18722b = this;
        h6Var4.f18721a = i12;
        h6Var4.f18735r = tL_theme;
        h6Var4.f18737t = i10;
        this.f18758a0.put(i12, h6Var4);
        this.f18760b0.add(0, h6Var4);
        j6.D1(this);
        this.f18762c0.put(j3, h6Var4);
        return h6Var4;
    }

    public final h6 f(TLRPC.TL_theme tL_theme, int i10, int i11) {
        TLRPC.ThemeSettings themeSettings = null;
        if (tL_theme == null) {
            return null;
        }
        if (i11 < tL_theme.settings.size()) {
            themeSettings = tL_theme.settings.get(i11);
        }
        return e(tL_theme.f18258id, themeSettings, tL_theme, i10, false);
    }

    public final String j(h6 h6Var, boolean z10) {
        String s10;
        String n10;
        if (h6Var == null) {
            h6Var = k(false);
        }
        if (h6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f18757a);
                sb3.append("_");
                n10 = a4.a.n(h6Var.f18721a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f18757a);
                sb4.append("_");
                n10 = a4.a.n(h6Var.f18721a, "_wp", sb4);
            }
            sb2.append(n10);
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            s10 = a4.a.s(new StringBuilder(), this.f18757a, "_wp_o");
        } else {
            s10 = a4.a.s(new StringBuilder(), this.f18757a, "_wp");
        }
        sb5.append(s10);
        sb5.append(Utilities.random.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final h6 k(boolean z10) {
        h6 h6Var;
        if (this.f18760b0 == null || (h6Var = (h6) this.f18758a0.get(this.Y)) == null) {
            return null;
        }
        if (z10) {
            int i10 = this.f18766f0 + 1;
            this.f18766f0 = i10;
            h6 h6Var2 = new h6();
            h6Var2.f18723c = h6Var.f18723c;
            h6Var2.d = h6Var.d;
            h6Var2.e = h6Var.e;
            h6Var2.f18724f = h6Var.f18724f;
            h6Var2.f18725g = h6Var.f18725g;
            h6Var2.h = h6Var.h;
            h6Var2.f18726i = h6Var.f18726i;
            h6Var2.f18727j = h6Var.f18727j;
            h6Var2.f18728k = h6Var.f18728k;
            h6Var2.f18729l = h6Var.f18729l;
            h6Var2.f18730m = h6Var.f18730m;
            h6Var2.f18731n = h6Var.f18731n;
            h6Var2.f18732o = h6Var.f18732o;
            h6Var2.f18733p = h6Var.f18733p;
            h6Var2.f18734q = h6Var.f18734q;
            h6Var2.f18722b = this;
            c6 c6Var = this.f18769i0;
            if (c6Var != null) {
                ?? obj = new Object();
                obj.f18538a = "";
                obj.f18539b = "";
                obj.f18540c = "";
                obj.f18540c = c6Var.f18540c;
                obj.d = c6Var.d;
                obj.e = c6Var.e;
                obj.f18541f = c6Var.f18541f;
                obj.f18542g = c6Var.f18542g;
                obj.h = c6Var.h;
                obj.f18543i = c6Var.f18543i;
                obj.f18544j = c6Var.f18544j;
                obj.f18545k = c6Var.f18545k;
                obj.f18550p = this;
                obj.f18551q = h6Var2;
                if (!TextUtils.isEmpty(c6Var.f18538a)) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), c6Var.f18538a);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String j3 = obj.f18550p.j(obj.f18551q, false);
                        obj.f18538a = j3;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, j3));
                    } catch (Exception e) {
                        obj.f18538a = "";
                        FileLog.e(e);
                    }
                } else {
                    obj.f18538a = "";
                }
                if (!TextUtils.isEmpty(c6Var.f18539b)) {
                    if (!c6Var.f18539b.equals(c6Var.f18538a)) {
                        try {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), c6Var.f18539b);
                            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                            String j10 = obj.f18550p.j(obj.f18551q, true);
                            obj.f18539b = j10;
                            AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j10));
                        } catch (Exception e7) {
                            obj.f18539b = "";
                            FileLog.e(e7);
                        }
                    } else {
                        obj.f18539b = obj.f18538a;
                    }
                } else {
                    obj.f18539b = "";
                }
                h6Var2.f18741y = obj;
            }
            this.Z = this.Y;
            h6Var2.f18721a = i10;
            this.Y = i10;
            this.f18769i0 = h6Var2.f18741y;
            this.f18758a0.put(i10, h6Var2);
            this.f18760b0.add(0, h6Var2);
            j6.D1(this);
            return h6Var2;
        }
        return h6Var;
    }

    public final int l(int i10) {
        h6 h6Var = (h6) this.f18758a0.get(i10);
        if (h6Var != null) {
            return h6Var.f18723c;
        }
        return 0;
    }

    public final String m() {
        if (this.F != null) {
            return "remote" + this.F.f18258id;
        }
        return this.f18757a;
    }

    public final String n() {
        if ("Blue".equals(this.f18757a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.f18757a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.f18757a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.f18757a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.f18757a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.F;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f18757a;
    }

    public final int o() {
        if (this.S && this.Y == j6.f19041n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == j6.f19041n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i10 = this.f18770j0;
        if (i10 != -1) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f18757a) && !"Night".equals(this.f18757a)) {
            if ("Blue".equals(this.f18757a) || "Arctic Blue".equals(this.f18757a) || "Day".equals(this.f18757a)) {
                this.f18770j0 = 0;
            }
        } else {
            this.f18770j0 = 1;
        }
        if (this.f18770j0 == -1) {
            j6.G(j6.Q0(new File(this.f18759b), null, new String[1]), this);
        }
        if (this.f18770j0 != 1) {
            return false;
        }
        return true;
    }

    public final void r(SharedPreferences sharedPreferences, h6 h6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                c6 c6Var = new c6();
                c6Var.f18538a = jSONObject.getString("wall");
                c6Var.f18539b = jSONObject.getString("owall");
                c6Var.d = jSONObject.getInt("pColor");
                c6Var.e = jSONObject.getInt("pGrColor");
                c6Var.f18541f = jSONObject.optInt("pGrColor2");
                c6Var.f18542g = jSONObject.optInt("pGrColor3");
                c6Var.h = jSONObject.getInt("pGrAngle");
                c6Var.f18540c = jSONObject.getString("wallSlug");
                c6Var.f18543i = jSONObject.getBoolean("wBlur");
                c6Var.f18544j = jSONObject.getBoolean("wMotion");
                c6Var.f18545k = (float) jSONObject.getDouble("pIntensity");
                c6Var.f18550p = this;
                c6Var.f18551q = h6Var;
                if (h6Var != null) {
                    h6Var.f18741y = c6Var;
                } else {
                    this.f18769i0 = c6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    c6Var.f18540c = "d";
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void s() {
        boolean z10;
        this.G = true;
        this.T = false;
        j6.s1(true, false);
        if (this == j6.I && j6.M == null) {
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i10 = NotificationCenter.needSetDayNightTheme;
            if (this == j6.J) {
                z10 = true;
            } else {
                z10 = false;
            }
            globalInstance.lambda$postNotificationNameOnUIThread$1(i10, this, Boolean.valueOf(z10), null, -1, j6.ol);
        }
    }

    public final void t() {
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.fileLoadFailed);
    }

    public final void u(int i10) {
        this.Y = i10;
        h6 k10 = k(false);
        if (k10 != null) {
            this.f18769i0 = k10.f18741y;
        }
    }

    public final void v(c6 c6Var) {
        if (this.f18769i0 != c6Var) {
            h6 k10 = k(false);
            c6 c6Var2 = this.f18769i0;
            if (c6Var2 != null) {
                c6.a(c6Var2);
            }
            if (c6Var != null) {
                c6Var.f18551q = k10;
                c6Var.f18550p = this;
                c6Var.c();
            }
            this.f18769i0 = c6Var;
            if (k10 != null) {
                k10.f18741y = c6Var;
            }
        }
    }

    public i6(i6 i6Var) {
        this.f18775x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f18763d0 = new LongSparseArray();
        this.f18764e0 = 0;
        this.f18766f0 = 100;
        this.f18770j0 = -1;
        this.f18757a = i6Var.f18757a;
        this.f18759b = i6Var.f18759b;
        this.f18761c = i6Var.f18761c;
        this.d = i6Var.d;
        this.e = i6Var.e;
        this.f18765f = i6Var.f18765f;
        this.h = i6Var.h;
        this.f18771n = i6Var.f18771n;
        this.f18772r = i6Var.f18772r;
        this.f18773s = i6Var.f18773s;
        this.v = i6Var.v;
        this.f18774w = i6Var.f18774w;
        this.f18775x = i6Var.f18775x;
        this.f18776y = i6Var.f18776y;
        this.E = i6Var.E;
        this.F = i6Var.F;
        this.G = i6Var.G;
        this.H = i6Var.H;
        this.I = i6Var.I;
        this.J = i6Var.J;
        this.K = i6Var.K;
        this.L = i6Var.L;
        this.M = i6Var.M;
        this.N = i6Var.N;
        this.O = i6Var.O;
        this.P = i6Var.P;
        this.Q = i6Var.Q;
        this.R = i6Var.R;
        this.S = i6Var.S;
        this.T = i6Var.T;
        this.U = i6Var.U;
        this.V = i6Var.V;
        this.W = i6Var.W;
        this.X = i6Var.X;
        this.Y = i6Var.Y;
        this.Z = i6Var.Z;
        this.f18758a0 = i6Var.f18758a0;
        this.f18760b0 = i6Var.f18760b0;
        this.f18762c0 = i6Var.f18762c0;
        this.f18766f0 = i6Var.f18766f0;
        this.f18767g0 = i6Var.f18767g0;
        this.f18768h0 = i6Var.f18768h0;
        this.f18769i0 = i6Var.f18769i0;
    }
}
