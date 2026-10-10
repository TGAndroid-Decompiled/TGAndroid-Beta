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
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.x9;
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
    public String f20707a;
    public SparseArray f20708a0;
    public String f20709b;
    public ArrayList f20710b0;
    public String f20711c;
    public LongSparseArray f20712c0;
    public String d;
    public final LongSparseArray f20713d0;
    public String f20714e;
    public int f20715e0;
    public boolean f20716f;
    public int f20717f0;
    public String f20718g0;
    public boolean h;
    public String f20719h0;
    public b6 f20720i0;
    public int f20721j0;
    public boolean f20722n;
    public int f20723r;
    public int f20724s;
    public int v;
    public int f20725w;
    public int f20726x;
    public int f20727y;

    public h6() {
        this.f20726x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f20713d0 = new LongSparseArray();
        this.f20715e0 = 0;
        this.f20717f0 = 100;
        this.f20721j0 = -1;
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
        int i14;
        int i15;
        String str;
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
            i14 = i6.Y0(wallPaperSettings.background_color);
            int i16 = themeSettings.wallpaper.settings.second_background_color;
            j11 = 4294967296L;
            if (i16 == 0) {
                j3 = 4294967296L;
            } else {
                j3 = i6.Y0(i16);
            }
            int i17 = themeSettings.wallpaper.settings.third_background_color;
            if (i17 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = i6.Y0(i17);
            }
            int i18 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i18 != 0) {
                j11 = i6.Y0(i18);
            }
            i15 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f7 = wallPaper2.settings.intensity / 100.0f;
                long j12 = j10;
                if (themeSettings.accent_color != g6Var.f20659c && themeSettings.outbox_accent_color == g6Var.d && i10 == g6Var.f20660e && i11 == g6Var.f20661f && i12 == g6Var.f20662g && i13 == g6Var.h && themeSettings.message_colors_animated == g6Var.f20663i && i14 == g6Var.f20664j && j3 == g6Var.f20665k && j12 == g6Var.f20666l && j11 == g6Var.f20667m && i15 == g6Var.f20668n && TextUtils.equals(str, g6Var.f20669o) && Math.abs(f7 - g6Var.f20670p) < 0.001d) {
                    return z11;
                }
                return z10;
            }
        } else {
            z10 = false;
            z11 = true;
            j3 = 0;
            j10 = 0;
            j11 = 0;
            i14 = 0;
            i15 = 0;
        }
        str = null;
        f7 = 0.0f;
        long j122 = j10;
        if (themeSettings.accent_color != g6Var.f20659c) {
        }
        return z10;
    }

    public static void b(h6 h6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        h6Var.W = iArr.length;
        h6Var.f20710b0 = new ArrayList();
        h6Var.f20708a0 = new SparseArray();
        h6Var.f20712c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            g6 g6Var = new g6();
            g6Var.f20657a = iArr8[i10];
            if (i6.h1(g6Var)) {
                g6Var.f20679z = true;
            }
            g6Var.f20659c = iArr[i10];
            g6Var.f20658b = h6Var;
            g6Var.f20660e = iArr2[i10];
            g6Var.f20661f = iArr3[i10];
            long j3 = iArr4[i10];
            g6Var.f20664j = j3;
            boolean z10 = h6Var.S;
            if (z10 && g6Var.f20657a == i6.f20979n) {
                g6Var.f20664j = 4294967296L;
            } else {
                g6Var.f20664j = j3;
            }
            if (z10 && g6Var.f20657a == i6.f20979n) {
                g6Var.f20665k = 4294967296L;
            } else {
                g6Var.f20665k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && g6Var.f20657a == i6.f20979n) {
                    g6Var.f20666l = 4294967296L;
                } else {
                    g6Var.f20666l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && g6Var.f20657a == i6.f20979n) {
                    g6Var.f20667m = 4294967296L;
                } else {
                    g6Var.f20667m = iArr7[i10];
                }
            }
            g6Var.f20670p = iArr10[i10] / 100.0f;
            g6Var.f20668n = iArr9[i10];
            g6Var.f20669o = strArr[i10];
            if ((i6.h1(g6Var) && h6Var.f20707a.equals("Dark Blue")) || h6Var.f20707a.equals("Night")) {
                g6Var.f20660e = -14316059;
                g6Var.f20661f = -12422433;
                g6Var.f20662g = -8304937;
                g6Var.h = -6340950;
                if (h6Var.f20707a.equals("Night")) {
                    g6Var.f20670p = -0.57f;
                    g6Var.f20664j = -9666650L;
                    g6Var.f20665k = -13749173L;
                    g6Var.f20666l = -8883033L;
                    g6Var.f20667m = -13421992L;
                }
            }
            h6Var.f20708a0.put(g6Var.f20657a, g6Var);
            h6Var.f20710b0.add(g6Var);
        }
        h6Var.X = ((g6) h6Var.f20708a0.get(0)).f20659c;
    }

    public static void c(h6 h6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = h6Var.f20710b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = h6Var.f20710b0.size();
            for (int i10 = 0; i10 < size; i10++) {
                g6 g6Var = (g6) h6Var.f20710b0.get(i10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(h6Var.f20707a);
                sb2.append("_");
                h6Var.r(sharedPreferences, g6Var, a1.g.o(g6Var.f20657a, "_owp", sb2));
            }
            return;
        }
        h6Var.r(sharedPreferences, null, a1.g.t(new StringBuilder(), h6Var.f20707a, "_owp"));
    }

    public static h6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            h6 h6Var = new h6();
            h6Var.f20707a = jSONObject.getString("name");
            h6Var.f20709b = jSONObject.getString("path");
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
        } catch (Exception e7) {
            FileLog.e(e7);
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
        h6Var.f20707a = split[0];
        h6Var.f20709b = split[1];
        return h6Var;
    }

    public static void i(g6 g6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i14;
        g6Var.f20659c = themeSettings.accent_color;
        g6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i10 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        g6Var.f20660e = i10;
        if (themeSettings.message_colors.size() > 1) {
            i11 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        g6Var.f20661f = i11;
        if (g6Var.f20660e == i11) {
            g6Var.f20661f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        g6Var.f20662g = i12;
        if (themeSettings.message_colors.size() > 3) {
            i13 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i13 = 0;
        }
        g6Var.h = i13;
        g6Var.f20663i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            if (wallPaperSettings.background_color == 0) {
                g6Var.f20664j = 4294967296L;
            } else {
                g6Var.f20664j = i6.Y0(i14);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                g6Var.f20665k = 4294967296L;
            } else {
                g6Var.f20665k = i6.Y0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                g6Var.f20666l = 4294967296L;
            } else {
                g6Var.f20666l = i6.Y0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                g6Var.f20667m = 4294967296L;
            } else {
                g6Var.f20667m = i6.Y0(wallPaperSettings4.fourth_background_color);
            }
            g6Var.f20668n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                g6Var.f20669o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                g6Var.f20670p = wallPaperSettings5.intensity / 100.0f;
                g6Var.f20671q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f20723r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = dd0.g(this.f20723r, this.f20724s, i10, this.f20725w);
                } else {
                    int i11 = this.f20724s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f20723r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(x9.d(this.f20726x), new int[]{this.f20723r, this.f20724s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.f20723r);
                        canvas.drawColor(this.f20723r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.f20727y / 100.0f) * 255.0f));
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
                if (str.equals(this.f20718g0)) {
                    this.f20718g0 = null;
                    Utilities.globalQueue.postRunnable(new p(3, this, (File) objArr[1]));
                } else if (str.equals(FileLoader.getAttachFileName(this.F.document))) {
                    t();
                    if (i10 == i12) {
                        File file = new File(this.f20709b);
                        TLRPC.TL_theme tL_theme2 = this.F;
                        h6 l02 = i6.l0(file, tL_theme2.title, tL_theme2);
                        if (l02 != null && l02.f20711c != null && !new File(l02.f20711c).exists()) {
                            this.f20723r = l02.f20723r;
                            this.f20724s = l02.f20724s;
                            this.v = l02.v;
                            this.f20725w = l02.f20725w;
                            this.f20726x = l02.f20726x;
                            this.h = l02.h;
                            this.f20727y = l02.f20727y;
                            this.f20719h0 = l02.f20711c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = l02.f20714e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(l02.E).sendRequest(getwallpaper, new ai.v1(21, this, l02));
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
            LongSparseArray longSparseArray = this.f20713d0;
            g6 g6Var = (g6) longSparseArray.get(j3);
            if (g6Var != null) {
                return g6Var;
            }
            int i11 = this.f20715e0 + 1;
            this.f20715e0 = i11;
            g6 g6Var2 = new g6();
            i(g6Var2, themeSettings);
            g6Var2.f20658b = this;
            g6Var2.f20657a = i11;
            g6Var2.f20672r = tL_theme;
            g6Var2.f20674t = i10;
            longSparseArray.put(i11, g6Var2);
            return g6Var2;
        }
        g6 g6Var3 = (g6) this.f20712c0.get(j3);
        if (g6Var3 != null) {
            return g6Var3;
        }
        int i12 = this.f20717f0 + 1;
        this.f20717f0 = i12;
        g6 g6Var4 = new g6();
        i(g6Var4, themeSettings);
        g6Var4.f20658b = this;
        g6Var4.f20657a = i12;
        g6Var4.f20672r = tL_theme;
        g6Var4.f20674t = i10;
        this.f20708a0.put(i12, g6Var4);
        this.f20710b0.add(0, g6Var4);
        i6.E1(this);
        this.f20712c0.put(j3, g6Var4);
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
        return e(tL_theme.f20179id, themeSettings, tL_theme, i10, false);
    }

    public final String j(g6 g6Var, boolean z10) {
        String t10;
        String o9;
        if (g6Var == null) {
            g6Var = k(false);
        }
        if (g6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f20707a);
                sb3.append("_");
                o9 = a1.g.o(g6Var.f20657a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f20707a);
                sb4.append("_");
                o9 = a1.g.o(g6Var.f20657a, "_wp", sb4);
            }
            sb2.append(o9);
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            t10 = a1.g.t(new StringBuilder(), this.f20707a, "_wp_o");
        } else {
            t10 = a1.g.t(new StringBuilder(), this.f20707a, "_wp");
        }
        sb5.append(t10);
        sb5.append(Utilities.random.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final g6 k(boolean z10) {
        g6 g6Var;
        if (this.f20710b0 == null || (g6Var = (g6) this.f20708a0.get(this.Y)) == null) {
            return null;
        }
        if (z10) {
            int i10 = this.f20717f0 + 1;
            this.f20717f0 = i10;
            g6 g6Var2 = new g6();
            g6Var2.f20659c = g6Var.f20659c;
            g6Var2.d = g6Var.d;
            g6Var2.f20660e = g6Var.f20660e;
            g6Var2.f20661f = g6Var.f20661f;
            g6Var2.f20662g = g6Var.f20662g;
            g6Var2.h = g6Var.h;
            g6Var2.f20663i = g6Var.f20663i;
            g6Var2.f20664j = g6Var.f20664j;
            g6Var2.f20665k = g6Var.f20665k;
            g6Var2.f20666l = g6Var.f20666l;
            g6Var2.f20667m = g6Var.f20667m;
            g6Var2.f20668n = g6Var.f20668n;
            g6Var2.f20669o = g6Var.f20669o;
            g6Var2.f20670p = g6Var.f20670p;
            g6Var2.f20671q = g6Var.f20671q;
            g6Var2.f20658b = this;
            b6 b6Var = this.f20720i0;
            if (b6Var != null) {
                ?? obj = new Object();
                obj.f20467a = "";
                obj.f20468b = "";
                obj.f20469c = "";
                obj.f20469c = b6Var.f20469c;
                obj.d = b6Var.d;
                obj.f20470e = b6Var.f20470e;
                obj.f20471f = b6Var.f20471f;
                obj.f20472g = b6Var.f20472g;
                obj.h = b6Var.h;
                obj.f20473i = b6Var.f20473i;
                obj.f20474j = b6Var.f20474j;
                obj.f20475k = b6Var.f20475k;
                obj.f20480p = this;
                obj.f20481q = g6Var2;
                if (!TextUtils.isEmpty(b6Var.f20467a)) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), b6Var.f20467a);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String j3 = obj.f20480p.j(obj.f20481q, false);
                        obj.f20467a = j3;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, j3));
                    } catch (Exception e7) {
                        obj.f20467a = "";
                        FileLog.e(e7);
                    }
                } else {
                    obj.f20467a = "";
                }
                if (!TextUtils.isEmpty(b6Var.f20468b)) {
                    if (!b6Var.f20468b.equals(b6Var.f20467a)) {
                        try {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), b6Var.f20468b);
                            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                            String j10 = obj.f20480p.j(obj.f20481q, true);
                            obj.f20468b = j10;
                            AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j10));
                        } catch (Exception e10) {
                            obj.f20468b = "";
                            FileLog.e(e10);
                        }
                    } else {
                        obj.f20468b = obj.f20467a;
                    }
                } else {
                    obj.f20468b = "";
                }
                g6Var2.f20678y = obj;
            }
            this.Z = this.Y;
            g6Var2.f20657a = i10;
            this.Y = i10;
            this.f20720i0 = g6Var2.f20678y;
            this.f20708a0.put(i10, g6Var2);
            this.f20710b0.add(0, g6Var2);
            i6.E1(this);
            return g6Var2;
        }
        return g6Var;
    }

    public final int l(int i10) {
        g6 g6Var = (g6) this.f20708a0.get(i10);
        if (g6Var != null) {
            return g6Var.f20659c;
        }
        return 0;
    }

    public final String m() {
        if (this.F != null) {
            return "remote" + this.F.f20179id;
        }
        return this.f20707a;
    }

    public final String n() {
        if ("Blue".equals(this.f20707a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.f20707a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.f20707a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.f20707a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.f20707a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.F;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f20707a;
    }

    public final int o() {
        if (this.S && this.Y == i6.f20979n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == i6.f20979n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i10 = this.f20721j0;
        if (i10 != -1) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f20707a) && !"Night".equals(this.f20707a)) {
            if ("Blue".equals(this.f20707a) || "Arctic Blue".equals(this.f20707a) || "Day".equals(this.f20707a)) {
                this.f20721j0 = 0;
            }
        } else {
            this.f20721j0 = 1;
        }
        if (this.f20721j0 == -1) {
            i6.G(i6.R0(new File(this.f20709b), null, new String[1]), this);
        }
        if (this.f20721j0 != 1) {
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
                b6Var.f20467a = jSONObject.getString("wall");
                b6Var.f20468b = jSONObject.getString("owall");
                b6Var.d = jSONObject.getInt("pColor");
                b6Var.f20470e = jSONObject.getInt("pGrColor");
                b6Var.f20471f = jSONObject.optInt("pGrColor2");
                b6Var.f20472g = jSONObject.optInt("pGrColor3");
                b6Var.h = jSONObject.getInt("pGrAngle");
                b6Var.f20469c = jSONObject.getString("wallSlug");
                b6Var.f20473i = jSONObject.getBoolean("wBlur");
                b6Var.f20474j = jSONObject.getBoolean("wMotion");
                b6Var.f20475k = (float) jSONObject.getDouble("pIntensity");
                b6Var.f20480p = this;
                b6Var.f20481q = g6Var;
                if (g6Var != null) {
                    g6Var.f20678y = b6Var;
                } else {
                    this.f20720i0 = b6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    b6Var.f20469c = "d";
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
        i6.t1(true, false);
        if (this == i6.I && i6.M == null) {
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i10 = NotificationCenter.needSetDayNightTheme;
            if (this == i6.J) {
                z10 = true;
            } else {
                z10 = false;
            }
            globalInstance.lambda$postNotificationNameOnUIThread$1(i10, this, Boolean.valueOf(z10), null, -1, i6.rl);
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
            this.f20720i0 = k10.f20678y;
        }
    }

    public final void v(b6 b6Var) {
        if (this.f20720i0 != b6Var) {
            g6 k10 = k(false);
            b6 b6Var2 = this.f20720i0;
            if (b6Var2 != null) {
                b6.a(b6Var2);
            }
            if (b6Var != null) {
                b6Var.f20481q = k10;
                b6Var.f20480p = this;
                b6Var.c();
            }
            this.f20720i0 = b6Var;
            if (k10 != null) {
                k10.f20678y = b6Var;
            }
        }
    }

    public h6(h6 h6Var) {
        this.f20726x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f20713d0 = new LongSparseArray();
        this.f20715e0 = 0;
        this.f20717f0 = 100;
        this.f20721j0 = -1;
        this.f20707a = h6Var.f20707a;
        this.f20709b = h6Var.f20709b;
        this.f20711c = h6Var.f20711c;
        this.d = h6Var.d;
        this.f20714e = h6Var.f20714e;
        this.f20716f = h6Var.f20716f;
        this.h = h6Var.h;
        this.f20722n = h6Var.f20722n;
        this.f20723r = h6Var.f20723r;
        this.f20724s = h6Var.f20724s;
        this.v = h6Var.v;
        this.f20725w = h6Var.f20725w;
        this.f20726x = h6Var.f20726x;
        this.f20727y = h6Var.f20727y;
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
        this.f20708a0 = h6Var.f20708a0;
        this.f20710b0 = h6Var.f20710b0;
        this.f20712c0 = h6Var.f20712c0;
        this.f20717f0 = h6Var.f20717f0;
        this.f20718g0 = h6Var.f20718g0;
        this.f20719h0 = h6Var.f20719h0;
        this.f20720i0 = h6Var.f20720i0;
    }
}
