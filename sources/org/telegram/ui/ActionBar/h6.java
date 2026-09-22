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
    public String f18727a;
    public SparseArray f18728a0;
    public String f18729b;
    public ArrayList f18730b0;
    public String f18731c;
    public LongSparseArray f18732c0;
    public String d;
    public final LongSparseArray f18733d0;
    public String e;
    public int f18734e0;
    public boolean f18735f;
    public int f18736f0;
    public String f18737g0;
    public boolean h;
    public String f18738h0;
    public b6 f18739i0;
    public int f18740j0;
    public boolean f18741n;
    public int f18742r;
    public int f18743s;
    public int v;
    public int f18744w;
    public int f18745x;
    public int f18746y;

    public h6() {
        this.f18745x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f18733d0 = new LongSparseArray();
        this.f18734e0 = 0;
        this.f18736f0 = 100;
        this.f18740j0 = -1;
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
                if (themeSettings.accent_color != g6Var.f18692c && themeSettings.outbox_accent_color == g6Var.d && i10 == g6Var.e && i11 == g6Var.f18693f && i12 == g6Var.f18694g && i13 == g6Var.h && themeSettings.message_colors_animated == g6Var.f18695i && i14 == g6Var.f18696j && j3 == g6Var.f18697k && j12 == g6Var.f18698l && j11 == g6Var.f18699m && i15 == g6Var.f18700n && TextUtils.equals(str, g6Var.f18701o) && Math.abs(f7 - g6Var.f18702p) < 0.001d) {
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
        if (themeSettings.accent_color != g6Var.f18692c) {
        }
        return z10;
    }

    public static void b(h6 h6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        h6Var.W = iArr.length;
        h6Var.f18730b0 = new ArrayList();
        h6Var.f18728a0 = new SparseArray();
        h6Var.f18732c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            g6 g6Var = new g6();
            g6Var.f18690a = iArr8[i10];
            if (i6.g1(g6Var)) {
                g6Var.f18711z = true;
            }
            g6Var.f18692c = iArr[i10];
            g6Var.f18691b = h6Var;
            g6Var.e = iArr2[i10];
            g6Var.f18693f = iArr3[i10];
            long j3 = iArr4[i10];
            g6Var.f18696j = j3;
            boolean z10 = h6Var.S;
            if (z10 && g6Var.f18690a == i6.f19011n) {
                g6Var.f18696j = 4294967296L;
            } else {
                g6Var.f18696j = j3;
            }
            if (z10 && g6Var.f18690a == i6.f19011n) {
                g6Var.f18697k = 4294967296L;
            } else {
                g6Var.f18697k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && g6Var.f18690a == i6.f19011n) {
                    g6Var.f18698l = 4294967296L;
                } else {
                    g6Var.f18698l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && g6Var.f18690a == i6.f19011n) {
                    g6Var.f18699m = 4294967296L;
                } else {
                    g6Var.f18699m = iArr7[i10];
                }
            }
            g6Var.f18702p = iArr10[i10] / 100.0f;
            g6Var.f18700n = iArr9[i10];
            g6Var.f18701o = strArr[i10];
            if ((i6.g1(g6Var) && h6Var.f18727a.equals("Dark Blue")) || h6Var.f18727a.equals("Night")) {
                g6Var.e = -14316059;
                g6Var.f18693f = -12422433;
                g6Var.f18694g = -8304937;
                g6Var.h = -6340950;
                if (h6Var.f18727a.equals("Night")) {
                    g6Var.f18702p = -0.57f;
                    g6Var.f18696j = -9666650L;
                    g6Var.f18697k = -13749173L;
                    g6Var.f18698l = -8883033L;
                    g6Var.f18699m = -13421992L;
                }
            }
            h6Var.f18728a0.put(g6Var.f18690a, g6Var);
            h6Var.f18730b0.add(g6Var);
        }
        h6Var.X = ((g6) h6Var.f18728a0.get(0)).f18692c;
    }

    public static void c(h6 h6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = h6Var.f18730b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = h6Var.f18730b0.size();
            for (int i10 = 0; i10 < size; i10++) {
                g6 g6Var = (g6) h6Var.f18730b0.get(i10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(h6Var.f18727a);
                sb2.append("_");
                h6Var.r(sharedPreferences, g6Var, a4.a.o(g6Var.f18690a, "_owp", sb2));
            }
            return;
        }
        h6Var.r(sharedPreferences, null, a4.a.t(new StringBuilder(), h6Var.f18727a, "_owp"));
    }

    public static h6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            h6 h6Var = new h6();
            h6Var.f18727a = jSONObject.getString("name");
            h6Var.f18729b = jSONObject.getString("path");
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
        h6Var.f18727a = split[0];
        h6Var.f18729b = split[1];
        return h6Var;
    }

    public static void i(g6 g6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        g6Var.f18692c = themeSettings.accent_color;
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
        g6Var.f18693f = i11;
        if (g6Var.e == i11) {
            g6Var.f18693f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        g6Var.f18694g = i12;
        if (themeSettings.message_colors.size() > 3) {
            i13 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i13 = 0;
        }
        g6Var.h = i13;
        g6Var.f18695i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            int i14 = wallPaperSettings.background_color;
            if (i14 == 0) {
                g6Var.f18696j = 4294967296L;
            } else {
                g6Var.f18696j = i6.X0(i14);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                g6Var.f18697k = 4294967296L;
            } else {
                g6Var.f18697k = i6.X0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                g6Var.f18698l = 4294967296L;
            } else {
                g6Var.f18698l = i6.X0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                g6Var.f18699m = 4294967296L;
            } else {
                g6Var.f18699m = i6.X0(wallPaperSettings4.fourth_background_color);
            }
            g6Var.f18700n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                g6Var.f18701o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                g6Var.f18702p = wallPaperSettings5.intensity / 100.0f;
                g6Var.f18703q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f18742r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = cc0.g(this.f18742r, this.f18743s, i10, this.f18744w);
                } else {
                    int i11 = this.f18743s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f18742r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(t9.d(this.f18745x), new int[]{this.f18742r, this.f18743s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.f18742r);
                        canvas.drawColor(this.f18742r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.f18746y / 100.0f) * 255.0f));
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
                if (str.equals(this.f18737g0)) {
                    this.f18737g0 = null;
                    Utilities.globalQueue.postRunnable(new m4.g0(26, this, (File) objArr[1]));
                } else if (str.equals(FileLoader.getAttachFileName(this.F.document))) {
                    t();
                    if (i10 == i12) {
                        File file = new File(this.f18729b);
                        TLRPC.TL_theme tL_theme2 = this.F;
                        h6 k02 = i6.k0(file, tL_theme2.title, tL_theme2);
                        if (k02 != null && k02.f18731c != null && !new File(k02.f18731c).exists()) {
                            this.f18742r = k02.f18742r;
                            this.f18743s = k02.f18743s;
                            this.v = k02.v;
                            this.f18744w = k02.f18744w;
                            this.f18745x = k02.f18745x;
                            this.h = k02.h;
                            this.f18746y = k02.f18746y;
                            this.f18738h0 = k02.f18731c;
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
            LongSparseArray longSparseArray = this.f18733d0;
            g6 g6Var = (g6) longSparseArray.get(j3);
            if (g6Var != null) {
                return g6Var;
            }
            int i11 = this.f18734e0 + 1;
            this.f18734e0 = i11;
            g6 g6Var2 = new g6();
            i(g6Var2, themeSettings);
            g6Var2.f18691b = this;
            g6Var2.f18690a = i11;
            g6Var2.f18704r = tL_theme;
            g6Var2.f18706t = i10;
            longSparseArray.put(i11, g6Var2);
            return g6Var2;
        }
        g6 g6Var3 = (g6) this.f18732c0.get(j3);
        if (g6Var3 != null) {
            return g6Var3;
        }
        int i12 = this.f18736f0 + 1;
        this.f18736f0 = i12;
        g6 g6Var4 = new g6();
        i(g6Var4, themeSettings);
        g6Var4.f18691b = this;
        g6Var4.f18690a = i12;
        g6Var4.f18704r = tL_theme;
        g6Var4.f18706t = i10;
        this.f18728a0.put(i12, g6Var4);
        this.f18730b0.add(0, g6Var4);
        i6.D1(this);
        this.f18732c0.put(j3, g6Var4);
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
        return e(tL_theme.f18246id, themeSettings, tL_theme, i10, false);
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
                sb3.append(this.f18727a);
                sb3.append("_");
                o9 = a4.a.o(g6Var.f18690a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f18727a);
                sb4.append("_");
                o9 = a4.a.o(g6Var.f18690a, "_wp", sb4);
            }
            sb2.append(o9);
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            t10 = a4.a.t(new StringBuilder(), this.f18727a, "_wp_o");
        } else {
            t10 = a4.a.t(new StringBuilder(), this.f18727a, "_wp");
        }
        sb5.append(t10);
        sb5.append(Utilities.random.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final g6 k(boolean z10) {
        g6 g6Var;
        if (this.f18730b0 == null || (g6Var = (g6) this.f18728a0.get(this.Y)) == null) {
            return null;
        }
        if (z10) {
            int i10 = this.f18736f0 + 1;
            this.f18736f0 = i10;
            g6 g6Var2 = new g6();
            g6Var2.f18692c = g6Var.f18692c;
            g6Var2.d = g6Var.d;
            g6Var2.e = g6Var.e;
            g6Var2.f18693f = g6Var.f18693f;
            g6Var2.f18694g = g6Var.f18694g;
            g6Var2.h = g6Var.h;
            g6Var2.f18695i = g6Var.f18695i;
            g6Var2.f18696j = g6Var.f18696j;
            g6Var2.f18697k = g6Var.f18697k;
            g6Var2.f18698l = g6Var.f18698l;
            g6Var2.f18699m = g6Var.f18699m;
            g6Var2.f18700n = g6Var.f18700n;
            g6Var2.f18701o = g6Var.f18701o;
            g6Var2.f18702p = g6Var.f18702p;
            g6Var2.f18703q = g6Var.f18703q;
            g6Var2.f18691b = this;
            b6 b6Var = this.f18739i0;
            if (b6Var != null) {
                ?? obj = new Object();
                obj.f18506a = "";
                obj.f18507b = "";
                obj.f18508c = "";
                obj.f18508c = b6Var.f18508c;
                obj.d = b6Var.d;
                obj.e = b6Var.e;
                obj.f18509f = b6Var.f18509f;
                obj.f18510g = b6Var.f18510g;
                obj.h = b6Var.h;
                obj.f18511i = b6Var.f18511i;
                obj.f18512j = b6Var.f18512j;
                obj.f18513k = b6Var.f18513k;
                obj.f18518p = this;
                obj.f18519q = g6Var2;
                if (!TextUtils.isEmpty(b6Var.f18506a)) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18506a);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String j3 = obj.f18518p.j(obj.f18519q, false);
                        obj.f18506a = j3;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, j3));
                    } catch (Exception e) {
                        obj.f18506a = "";
                        FileLog.e(e);
                    }
                } else {
                    obj.f18506a = "";
                }
                if (!TextUtils.isEmpty(b6Var.f18507b)) {
                    if (!b6Var.f18507b.equals(b6Var.f18506a)) {
                        try {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18507b);
                            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                            String j10 = obj.f18518p.j(obj.f18519q, true);
                            obj.f18507b = j10;
                            AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j10));
                        } catch (Exception e7) {
                            obj.f18507b = "";
                            FileLog.e(e7);
                        }
                    } else {
                        obj.f18507b = obj.f18506a;
                    }
                } else {
                    obj.f18507b = "";
                }
                g6Var2.f18710y = obj;
            }
            this.Z = this.Y;
            g6Var2.f18690a = i10;
            this.Y = i10;
            this.f18739i0 = g6Var2.f18710y;
            this.f18728a0.put(i10, g6Var2);
            this.f18730b0.add(0, g6Var2);
            i6.D1(this);
            return g6Var2;
        }
        return g6Var;
    }

    public final int l(int i10) {
        g6 g6Var = (g6) this.f18728a0.get(i10);
        if (g6Var != null) {
            return g6Var.f18692c;
        }
        return 0;
    }

    public final String m() {
        if (this.F != null) {
            return "remote" + this.F.f18246id;
        }
        return this.f18727a;
    }

    public final String n() {
        if ("Blue".equals(this.f18727a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.f18727a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.f18727a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.f18727a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.f18727a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.F;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f18727a;
    }

    public final int o() {
        if (this.S && this.Y == i6.f19011n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == i6.f19011n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i10 = this.f18740j0;
        if (i10 != -1) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f18727a) && !"Night".equals(this.f18727a)) {
            if ("Blue".equals(this.f18727a) || "Arctic Blue".equals(this.f18727a) || "Day".equals(this.f18727a)) {
                this.f18740j0 = 0;
            }
        } else {
            this.f18740j0 = 1;
        }
        if (this.f18740j0 == -1) {
            i6.G(i6.Q0(new File(this.f18729b), null, new String[1]), this);
        }
        if (this.f18740j0 != 1) {
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
                b6Var.f18506a = jSONObject.getString("wall");
                b6Var.f18507b = jSONObject.getString("owall");
                b6Var.d = jSONObject.getInt("pColor");
                b6Var.e = jSONObject.getInt("pGrColor");
                b6Var.f18509f = jSONObject.optInt("pGrColor2");
                b6Var.f18510g = jSONObject.optInt("pGrColor3");
                b6Var.h = jSONObject.getInt("pGrAngle");
                b6Var.f18508c = jSONObject.getString("wallSlug");
                b6Var.f18511i = jSONObject.getBoolean("wBlur");
                b6Var.f18512j = jSONObject.getBoolean("wMotion");
                b6Var.f18513k = (float) jSONObject.getDouble("pIntensity");
                b6Var.f18518p = this;
                b6Var.f18519q = g6Var;
                if (g6Var != null) {
                    g6Var.f18710y = b6Var;
                } else {
                    this.f18739i0 = b6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    b6Var.f18508c = "d";
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
            this.f18739i0 = k10.f18710y;
        }
    }

    public final void v(b6 b6Var) {
        if (this.f18739i0 != b6Var) {
            g6 k10 = k(false);
            b6 b6Var2 = this.f18739i0;
            if (b6Var2 != null) {
                b6.a(b6Var2);
            }
            if (b6Var != null) {
                b6Var.f18519q = k10;
                b6Var.f18518p = this;
                b6Var.c();
            }
            this.f18739i0 = b6Var;
            if (k10 != null) {
                k10.f18710y = b6Var;
            }
        }
    }

    public h6(h6 h6Var) {
        this.f18745x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f18733d0 = new LongSparseArray();
        this.f18734e0 = 0;
        this.f18736f0 = 100;
        this.f18740j0 = -1;
        this.f18727a = h6Var.f18727a;
        this.f18729b = h6Var.f18729b;
        this.f18731c = h6Var.f18731c;
        this.d = h6Var.d;
        this.e = h6Var.e;
        this.f18735f = h6Var.f18735f;
        this.h = h6Var.h;
        this.f18741n = h6Var.f18741n;
        this.f18742r = h6Var.f18742r;
        this.f18743s = h6Var.f18743s;
        this.v = h6Var.v;
        this.f18744w = h6Var.f18744w;
        this.f18745x = h6Var.f18745x;
        this.f18746y = h6Var.f18746y;
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
        this.f18728a0 = h6Var.f18728a0;
        this.f18730b0 = h6Var.f18730b0;
        this.f18732c0 = h6Var.f18732c0;
        this.f18736f0 = h6Var.f18736f0;
        this.f18737g0 = h6Var.f18737g0;
        this.f18738h0 = h6Var.f18738h0;
        this.f18739i0 = h6Var.f18739i0;
    }
}
