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
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.v9;
public final class h6 implements NotificationCenter.NotificationCenterDelegate {
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
    public String f18951a;
    public SparseArray f18952a0;
    public String f18953b;
    public ArrayList f18954b0;
    public String f18955c;
    public LongSparseArray f18956c0;
    public String d;
    public final LongSparseArray f18957d0;
    public String e;
    public int f18958e0;
    public boolean f18959f;
    public int f18960f0;
    public String f18961g0;
    public boolean h;
    public String f18962h0;
    public b6 f18963i0;
    public int f18964j0;
    public boolean f18965n;
    public int f18966r;
    public int f18967s;
    public int v;
    public int f18968w;
    public int f18969x;
    public int f18970y;

    public h6() {
        this.f18969x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f18957d0 = new LongSparseArray();
        this.f18958e0 = 0;
        this.f18960f0 = 100;
        this.f18964j0 = -1;
    }

    public static boolean a(g6 g6Var, TLRPC.ThemeSettings themeSettings) {
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
            i14 = i6.X0(wallPaperSettings.background_color);
            int i16 = themeSettings.wallpaper.settings.second_background_color;
            j11 = 4294967296L;
            if (i16 == 0) {
                j3 = 4294967296L;
            } else {
                j3 = i6.X0(i16);
            }
            int i17 = themeSettings.wallpaper.settings.third_background_color;
            if (i17 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = i6.X0(i17);
            }
            int i18 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i18 != 0) {
                j11 = i6.X0(i18);
            }
            i15 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f7 = wallPaper2.settings.intensity / 100.0f;
                long j12 = j10;
                if (themeSettings.accent_color != g6Var.f18908c && themeSettings.outbox_accent_color == g6Var.d && i10 == g6Var.e && i11 == g6Var.f18909f && i12 == g6Var.f18910g && i13 == g6Var.h && themeSettings.message_colors_animated == g6Var.f18911i && i14 == g6Var.f18912j && j3 == g6Var.f18913k && j12 == g6Var.f18914l && j11 == g6Var.f18915m && i15 == g6Var.f18916n && TextUtils.equals(str, g6Var.f18917o) && Math.abs(f7 - g6Var.f18918p) < 0.001d) {
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
        if (themeSettings.accent_color != g6Var.f18908c) {
        }
        return z10;
    }

    public static void b(h6 h6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        h6Var.W = iArr.length;
        h6Var.f18954b0 = new ArrayList();
        h6Var.f18952a0 = new SparseArray();
        h6Var.f18956c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            g6 g6Var = new g6();
            g6Var.f18906a = iArr8[i10];
            if (i6.g1(g6Var)) {
                g6Var.f18927z = true;
            }
            g6Var.f18908c = iArr[i10];
            g6Var.f18907b = h6Var;
            g6Var.e = iArr2[i10];
            g6Var.f18909f = iArr3[i10];
            long j3 = iArr4[i10];
            g6Var.f18912j = j3;
            boolean z10 = h6Var.S;
            if (z10 && g6Var.f18906a == i6.f19235n) {
                g6Var.f18912j = 4294967296L;
            } else {
                g6Var.f18912j = j3;
            }
            if (z10 && g6Var.f18906a == i6.f19235n) {
                g6Var.f18913k = 4294967296L;
            } else {
                g6Var.f18913k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && g6Var.f18906a == i6.f19235n) {
                    g6Var.f18914l = 4294967296L;
                } else {
                    g6Var.f18914l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && g6Var.f18906a == i6.f19235n) {
                    g6Var.f18915m = 4294967296L;
                } else {
                    g6Var.f18915m = iArr7[i10];
                }
            }
            g6Var.f18918p = iArr10[i10] / 100.0f;
            g6Var.f18916n = iArr9[i10];
            g6Var.f18917o = strArr[i10];
            if ((i6.g1(g6Var) && h6Var.f18951a.equals("Dark Blue")) || h6Var.f18951a.equals("Night")) {
                g6Var.e = -14316059;
                g6Var.f18909f = -12422433;
                g6Var.f18910g = -8304937;
                g6Var.h = -6340950;
                if (h6Var.f18951a.equals("Night")) {
                    g6Var.f18918p = -0.57f;
                    g6Var.f18912j = -9666650L;
                    g6Var.f18913k = -13749173L;
                    g6Var.f18914l = -8883033L;
                    g6Var.f18915m = -13421992L;
                }
            }
            h6Var.f18952a0.put(g6Var.f18906a, g6Var);
            h6Var.f18954b0.add(g6Var);
        }
        h6Var.X = ((g6) h6Var.f18952a0.get(0)).f18908c;
    }

    public static void c(h6 h6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = h6Var.f18954b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = h6Var.f18954b0.size();
            for (int i10 = 0; i10 < size; i10++) {
                g6 g6Var = (g6) h6Var.f18954b0.get(i10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(h6Var.f18951a);
                sb2.append("_");
                h6Var.r(sharedPreferences, g6Var, a4.a.n(g6Var.f18906a, "_owp", sb2));
            }
            return;
        }
        h6Var.r(sharedPreferences, null, a4.a.s(new StringBuilder(), h6Var.f18951a, "_owp"));
    }

    public static h6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            h6 h6Var = new h6();
            h6Var.f18951a = jSONObject.getString("name");
            h6Var.f18953b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                h6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                h6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                h6Var.G = jSONObject.getBoolean("loaded");
            }
            return h6Var;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static h6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        h6 h6Var = new h6();
        h6Var.f18951a = split[0];
        h6Var.f18953b = split[1];
        return h6Var;
    }

    public static void i(g6 g6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        g6Var.f18908c = themeSettings.accent_color;
        g6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i10 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        g6Var.e = i10;
        if (themeSettings.message_colors.size() > 1) {
            i11 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        g6Var.f18909f = i11;
        if (g6Var.e == i11) {
            g6Var.f18909f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        g6Var.f18910g = i12;
        if (themeSettings.message_colors.size() > 3) {
            i13 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i13 = 0;
        }
        g6Var.h = i13;
        g6Var.f18911i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            int i14 = wallPaperSettings.background_color;
            if (i14 == 0) {
                g6Var.f18912j = 4294967296L;
            } else {
                g6Var.f18912j = i6.X0(i14);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                g6Var.f18913k = 4294967296L;
            } else {
                g6Var.f18913k = i6.X0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                g6Var.f18914l = 4294967296L;
            } else {
                g6Var.f18914l = i6.X0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                g6Var.f18915m = 4294967296L;
            } else {
                g6Var.f18915m = i6.X0(wallPaperSettings4.fourth_background_color);
            }
            g6Var.f18916n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                g6Var.f18917o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                g6Var.f18918p = wallPaperSettings5.intensity / 100.0f;
                g6Var.f18919q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f18966r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = nc0.g(this.f18966r, this.f18967s, i10, this.f18968w);
                } else {
                    int i11 = this.f18967s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f18966r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(v9.d(this.f18969x), new int[]{this.f18966r, this.f18967s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.f18966r);
                        canvas.drawColor(this.f18966r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.f18970y / 100.0f) * 255.0f));
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
                if (str.equals(this.f18961g0)) {
                    this.f18961g0 = null;
                    Utilities.globalQueue.postRunnable(new ki.h0(29, this, (File) objArr[1]));
                } else if (str.equals(FileLoader.getAttachFileName(this.F.document))) {
                    t();
                    if (i10 == i12) {
                        File file = new File(this.f18953b);
                        TLRPC.TL_theme tL_theme2 = this.F;
                        h6 k02 = i6.k0(file, tL_theme2.title, tL_theme2);
                        if (k02 != null && k02.f18955c != null && !new File(k02.f18955c).exists()) {
                            this.f18966r = k02.f18966r;
                            this.f18967s = k02.f18967s;
                            this.v = k02.v;
                            this.f18968w = k02.f18968w;
                            this.f18969x = k02.f18969x;
                            this.h = k02.h;
                            this.f18970y = k02.f18970y;
                            this.f18962h0 = k02.f18955c;
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

    public final g6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.f18957d0;
            g6 g6Var = (g6) longSparseArray.get(j3);
            if (g6Var != null) {
                return g6Var;
            }
            int i11 = this.f18958e0 + 1;
            this.f18958e0 = i11;
            g6 g6Var2 = new g6();
            i(g6Var2, themeSettings);
            g6Var2.f18907b = this;
            g6Var2.f18906a = i11;
            g6Var2.f18920r = tL_theme;
            g6Var2.f18922t = i10;
            longSparseArray.put(i11, g6Var2);
            return g6Var2;
        }
        g6 g6Var3 = (g6) this.f18956c0.get(j3);
        if (g6Var3 != null) {
            return g6Var3;
        }
        int i12 = this.f18960f0 + 1;
        this.f18960f0 = i12;
        g6 g6Var4 = new g6();
        i(g6Var4, themeSettings);
        g6Var4.f18907b = this;
        g6Var4.f18906a = i12;
        g6Var4.f18920r = tL_theme;
        g6Var4.f18922t = i10;
        this.f18952a0.put(i12, g6Var4);
        this.f18954b0.add(0, g6Var4);
        i6.D1(this);
        this.f18956c0.put(j3, g6Var4);
        return g6Var4;
    }

    public final g6 f(TLRPC.TL_theme tL_theme, int i10, int i11) {
        TLRPC.ThemeSettings themeSettings = null;
        if (tL_theme == null) {
            return null;
        }
        if (i11 < tL_theme.settings.size()) {
            themeSettings = tL_theme.settings.get(i11);
        }
        return e(tL_theme.f18466id, themeSettings, tL_theme, i10, false);
    }

    public final String j(g6 g6Var, boolean z10) {
        String s10;
        String n10;
        if (g6Var == null) {
            g6Var = k(false);
        }
        if (g6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f18951a);
                sb3.append("_");
                n10 = a4.a.n(g6Var.f18906a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f18951a);
                sb4.append("_");
                n10 = a4.a.n(g6Var.f18906a, "_wp", sb4);
            }
            sb2.append(n10);
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            s10 = a4.a.s(new StringBuilder(), this.f18951a, "_wp_o");
        } else {
            s10 = a4.a.s(new StringBuilder(), this.f18951a, "_wp");
        }
        sb5.append(s10);
        sb5.append(Utilities.random.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final g6 k(boolean z10) {
        g6 g6Var;
        if (this.f18954b0 == null || (g6Var = (g6) this.f18952a0.get(this.Y)) == null) {
            return null;
        }
        if (z10) {
            int i10 = this.f18960f0 + 1;
            this.f18960f0 = i10;
            g6 g6Var2 = new g6();
            g6Var2.f18908c = g6Var.f18908c;
            g6Var2.d = g6Var.d;
            g6Var2.e = g6Var.e;
            g6Var2.f18909f = g6Var.f18909f;
            g6Var2.f18910g = g6Var.f18910g;
            g6Var2.h = g6Var.h;
            g6Var2.f18911i = g6Var.f18911i;
            g6Var2.f18912j = g6Var.f18912j;
            g6Var2.f18913k = g6Var.f18913k;
            g6Var2.f18914l = g6Var.f18914l;
            g6Var2.f18915m = g6Var.f18915m;
            g6Var2.f18916n = g6Var.f18916n;
            g6Var2.f18917o = g6Var.f18917o;
            g6Var2.f18918p = g6Var.f18918p;
            g6Var2.f18919q = g6Var.f18919q;
            g6Var2.f18907b = this;
            b6 b6Var = this.f18963i0;
            if (b6Var != null) {
                ?? obj = new Object();
                obj.f18692a = "";
                obj.f18693b = "";
                obj.f18694c = "";
                obj.f18694c = b6Var.f18694c;
                obj.d = b6Var.d;
                obj.e = b6Var.e;
                obj.f18695f = b6Var.f18695f;
                obj.f18696g = b6Var.f18696g;
                obj.h = b6Var.h;
                obj.f18697i = b6Var.f18697i;
                obj.f18698j = b6Var.f18698j;
                obj.f18699k = b6Var.f18699k;
                obj.f18704p = this;
                obj.f18705q = g6Var2;
                if (!TextUtils.isEmpty(b6Var.f18692a)) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18692a);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String j3 = obj.f18704p.j(obj.f18705q, false);
                        obj.f18692a = j3;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, j3));
                    } catch (Exception e) {
                        obj.f18692a = "";
                        FileLog.e(e);
                    }
                } else {
                    obj.f18692a = "";
                }
                if (!TextUtils.isEmpty(b6Var.f18693b)) {
                    if (!b6Var.f18693b.equals(b6Var.f18692a)) {
                        try {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18693b);
                            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                            String j10 = obj.f18704p.j(obj.f18705q, true);
                            obj.f18693b = j10;
                            AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j10));
                        } catch (Exception e7) {
                            obj.f18693b = "";
                            FileLog.e(e7);
                        }
                    } else {
                        obj.f18693b = obj.f18692a;
                    }
                } else {
                    obj.f18693b = "";
                }
                g6Var2.f18926y = obj;
            }
            this.Z = this.Y;
            g6Var2.f18906a = i10;
            this.Y = i10;
            this.f18963i0 = g6Var2.f18926y;
            this.f18952a0.put(i10, g6Var2);
            this.f18954b0.add(0, g6Var2);
            i6.D1(this);
            return g6Var2;
        }
        return g6Var;
    }

    public final int l(int i10) {
        g6 g6Var = (g6) this.f18952a0.get(i10);
        if (g6Var != null) {
            return g6Var.f18908c;
        }
        return 0;
    }

    public final String m() {
        if (this.F != null) {
            return "remote" + this.F.f18466id;
        }
        return this.f18951a;
    }

    public final String n() {
        if ("Blue".equals(this.f18951a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.f18951a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.f18951a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.f18951a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.f18951a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.F;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f18951a;
    }

    public final int o() {
        if (this.S && this.Y == i6.f19235n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == i6.f19235n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i10 = this.f18964j0;
        if (i10 != -1) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f18951a) && !"Night".equals(this.f18951a)) {
            if ("Blue".equals(this.f18951a) || "Arctic Blue".equals(this.f18951a) || "Day".equals(this.f18951a)) {
                this.f18964j0 = 0;
            }
        } else {
            this.f18964j0 = 1;
        }
        if (this.f18964j0 == -1) {
            i6.G(i6.Q0(new File(this.f18953b), null, new String[1]), this);
        }
        if (this.f18964j0 != 1) {
            return false;
        }
        return true;
    }

    public final void r(SharedPreferences sharedPreferences, g6 g6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                b6 b6Var = new b6();
                b6Var.f18692a = jSONObject.getString("wall");
                b6Var.f18693b = jSONObject.getString("owall");
                b6Var.d = jSONObject.getInt("pColor");
                b6Var.e = jSONObject.getInt("pGrColor");
                b6Var.f18695f = jSONObject.optInt("pGrColor2");
                b6Var.f18696g = jSONObject.optInt("pGrColor3");
                b6Var.h = jSONObject.getInt("pGrAngle");
                b6Var.f18694c = jSONObject.getString("wallSlug");
                b6Var.f18697i = jSONObject.getBoolean("wBlur");
                b6Var.f18698j = jSONObject.getBoolean("wMotion");
                b6Var.f18699k = (float) jSONObject.getDouble("pIntensity");
                b6Var.f18704p = this;
                b6Var.f18705q = g6Var;
                if (g6Var != null) {
                    g6Var.f18926y = b6Var;
                } else {
                    this.f18963i0 = b6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    b6Var.f18694c = "d";
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
        i6.s1(true, false);
        if (this == i6.I && i6.M == null) {
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i10 = NotificationCenter.needSetDayNightTheme;
            if (this == i6.J) {
                z10 = true;
            } else {
                z10 = false;
            }
            globalInstance.lambda$postNotificationNameOnUIThread$1(i10, this, Boolean.valueOf(z10), null, -1, i6.ol);
        }
    }

    public final void t() {
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.fileLoadFailed);
    }

    public final void u(int i10) {
        this.Y = i10;
        g6 k10 = k(false);
        if (k10 != null) {
            this.f18963i0 = k10.f18926y;
        }
    }

    public final void v(b6 b6Var) {
        if (this.f18963i0 != b6Var) {
            g6 k10 = k(false);
            b6 b6Var2 = this.f18963i0;
            if (b6Var2 != null) {
                b6.a(b6Var2);
            }
            if (b6Var != null) {
                b6Var.f18705q = k10;
                b6Var.f18704p = this;
                b6Var.c();
            }
            this.f18963i0 = b6Var;
            if (k10 != null) {
                k10.f18926y = b6Var;
            }
        }
    }

    public h6(h6 h6Var) {
        this.f18969x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f18957d0 = new LongSparseArray();
        this.f18958e0 = 0;
        this.f18960f0 = 100;
        this.f18964j0 = -1;
        this.f18951a = h6Var.f18951a;
        this.f18953b = h6Var.f18953b;
        this.f18955c = h6Var.f18955c;
        this.d = h6Var.d;
        this.e = h6Var.e;
        this.f18959f = h6Var.f18959f;
        this.h = h6Var.h;
        this.f18965n = h6Var.f18965n;
        this.f18966r = h6Var.f18966r;
        this.f18967s = h6Var.f18967s;
        this.v = h6Var.v;
        this.f18968w = h6Var.f18968w;
        this.f18969x = h6Var.f18969x;
        this.f18970y = h6Var.f18970y;
        this.E = h6Var.E;
        this.F = h6Var.F;
        this.G = h6Var.G;
        this.H = h6Var.H;
        this.I = h6Var.I;
        this.J = h6Var.J;
        this.K = h6Var.K;
        this.L = h6Var.L;
        this.M = h6Var.M;
        this.N = h6Var.N;
        this.O = h6Var.O;
        this.P = h6Var.P;
        this.Q = h6Var.Q;
        this.R = h6Var.R;
        this.S = h6Var.S;
        this.T = h6Var.T;
        this.U = h6Var.U;
        this.V = h6Var.V;
        this.W = h6Var.W;
        this.X = h6Var.X;
        this.Y = h6Var.Y;
        this.Z = h6Var.Z;
        this.f18952a0 = h6Var.f18952a0;
        this.f18954b0 = h6Var.f18954b0;
        this.f18956c0 = h6Var.f18956c0;
        this.f18960f0 = h6Var.f18960f0;
        this.f18961g0 = h6Var.f18961g0;
        this.f18962h0 = h6Var.f18962h0;
        this.f18963i0 = h6Var.f18963i0;
    }
}
