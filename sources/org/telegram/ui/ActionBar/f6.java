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
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.y9;
public final class f6 implements NotificationCenter.NotificationCenterDelegate {
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
    public String f19491a;
    public SparseArray f19492a0;
    public String f19493b;
    public ArrayList f19494b0;
    public String f19495c;
    public LongSparseArray f19496c0;
    public String d;
    public final LongSparseArray f19497d0;
    public String e;
    public int f19498e0;
    public boolean f19499f;
    public int f19500f0;
    public String f19501g0;
    public boolean h;
    public String f19502h0;
    public z5 f19503i0;
    public int f19504j0;
    public boolean f19505n;
    public int f19506r;
    public int f19507s;
    public int v;
    public int f19508w;
    public int f19509x;
    public int f19510y;

    public f6() {
        this.f19509x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f19497d0 = new LongSparseArray();
        this.f19498e0 = 0;
        this.f19500f0 = 100;
        this.f19504j0 = -1;
    }

    public static boolean a(e6 e6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        long j10;
        long j11;
        long j12;
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
            i14 = g6.Y0(wallPaperSettings.background_color);
            int i16 = themeSettings.wallpaper.settings.second_background_color;
            j12 = 4294967296L;
            if (i16 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = g6.Y0(i16);
            }
            int i17 = themeSettings.wallpaper.settings.third_background_color;
            if (i17 == 0) {
                j11 = 4294967296L;
            } else {
                j11 = g6.Y0(i17);
            }
            int i18 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i18 != 0) {
                j12 = g6.Y0(i18);
            }
            i15 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f7 = wallPaper2.settings.intensity / 100.0f;
                long j13 = j11;
                if (themeSettings.accent_color != e6Var.f19447c && themeSettings.outbox_accent_color == e6Var.d && i10 == e6Var.e && i11 == e6Var.f19448f && i12 == e6Var.f19449g && i13 == e6Var.h && themeSettings.message_colors_animated == e6Var.f19450i && i14 == e6Var.f19451j && j10 == e6Var.f19452k && j13 == e6Var.f19453l && j12 == e6Var.f19454m && i15 == e6Var.f19455n && TextUtils.equals(str, e6Var.f19456o) && Math.abs(f7 - e6Var.f19457p) < 0.001d) {
                    return z11;
                }
                return z10;
            }
        } else {
            z10 = false;
            z11 = true;
            j10 = 0;
            j11 = 0;
            j12 = 0;
            i14 = 0;
            i15 = 0;
        }
        str = null;
        f7 = 0.0f;
        long j132 = j11;
        if (themeSettings.accent_color != e6Var.f19447c) {
        }
        return z10;
    }

    public static void b(f6 f6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        f6Var.W = iArr.length;
        f6Var.f19494b0 = new ArrayList();
        f6Var.f19492a0 = new SparseArray();
        f6Var.f19496c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            e6 e6Var = new e6();
            e6Var.f19445a = iArr8[i10];
            if (g6.h1(e6Var)) {
                e6Var.f19466z = true;
            }
            e6Var.f19447c = iArr[i10];
            e6Var.f19446b = f6Var;
            e6Var.e = iArr2[i10];
            e6Var.f19448f = iArr3[i10];
            long j10 = iArr4[i10];
            e6Var.f19451j = j10;
            boolean z10 = f6Var.S;
            if (z10 && e6Var.f19445a == g6.f19777n) {
                e6Var.f19451j = 4294967296L;
            } else {
                e6Var.f19451j = j10;
            }
            if (z10 && e6Var.f19445a == g6.f19777n) {
                e6Var.f19452k = 4294967296L;
            } else {
                e6Var.f19452k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && e6Var.f19445a == g6.f19777n) {
                    e6Var.f19453l = 4294967296L;
                } else {
                    e6Var.f19453l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && e6Var.f19445a == g6.f19777n) {
                    e6Var.f19454m = 4294967296L;
                } else {
                    e6Var.f19454m = iArr7[i10];
                }
            }
            e6Var.f19457p = iArr10[i10] / 100.0f;
            e6Var.f19455n = iArr9[i10];
            e6Var.f19456o = strArr[i10];
            if ((g6.h1(e6Var) && f6Var.f19491a.equals("Dark Blue")) || f6Var.f19491a.equals("Night")) {
                e6Var.e = -14316059;
                e6Var.f19448f = -12422433;
                e6Var.f19449g = -8304937;
                e6Var.h = -6340950;
                if (f6Var.f19491a.equals("Night")) {
                    e6Var.f19457p = -0.57f;
                    e6Var.f19451j = -9666650L;
                    e6Var.f19452k = -13749173L;
                    e6Var.f19453l = -8883033L;
                    e6Var.f19454m = -13421992L;
                }
            }
            f6Var.f19492a0.put(e6Var.f19445a, e6Var);
            f6Var.f19494b0.add(e6Var);
        }
        f6Var.X = ((e6) f6Var.f19492a0.get(0)).f19447c;
    }

    public static void c(f6 f6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = f6Var.f19494b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = f6Var.f19494b0.size();
            for (int i10 = 0; i10 < size; i10++) {
                e6 e6Var = (e6) f6Var.f19494b0.get(i10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f6Var.f19491a);
                sb2.append("_");
                f6Var.r(sharedPreferences, e6Var, a1.g.n(e6Var.f19445a, "_owp", sb2));
            }
            return;
        }
        f6Var.r(sharedPreferences, null, a1.g.s(new StringBuilder(), f6Var.f19491a, "_owp"));
    }

    public static f6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            f6 f6Var = new f6();
            f6Var.f19491a = jSONObject.getString("name");
            f6Var.f19493b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                f6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                f6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                f6Var.G = jSONObject.getBoolean("loaded");
            }
            return f6Var;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static f6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        f6 f6Var = new f6();
        f6Var.f19491a = split[0];
        f6Var.f19493b = split[1];
        return f6Var;
    }

    public static void i(e6 e6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i14;
        e6Var.f19447c = themeSettings.accent_color;
        e6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i10 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        e6Var.e = i10;
        if (themeSettings.message_colors.size() > 1) {
            i11 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        e6Var.f19448f = i11;
        if (e6Var.e == i11) {
            e6Var.f19448f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        e6Var.f19449g = i12;
        if (themeSettings.message_colors.size() > 3) {
            i13 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i13 = 0;
        }
        e6Var.h = i13;
        e6Var.f19450i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            if (wallPaperSettings.background_color == 0) {
                e6Var.f19451j = 4294967296L;
            } else {
                e6Var.f19451j = g6.Y0(i14);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                e6Var.f19452k = 4294967296L;
            } else {
                e6Var.f19452k = g6.Y0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                e6Var.f19453l = 4294967296L;
            } else {
                e6Var.f19453l = g6.Y0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                e6Var.f19454m = 4294967296L;
            } else {
                e6Var.f19454m = g6.Y0(wallPaperSettings4.fourth_background_color);
            }
            e6Var.f19455n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                e6Var.f19456o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                e6Var.f19457p = wallPaperSettings5.intensity / 100.0f;
                e6Var.f19458q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f19506r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = cd0.g(this.f19506r, this.f19507s, i10, this.f19508w);
                } else {
                    int i11 = this.f19507s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f19506r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(y9.d(this.f19509x), new int[]{this.f19506r, this.f19507s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.f19506r);
                        canvas.drawColor(this.f19506r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.f19510y / 100.0f) * 255.0f));
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
                if (str.equals(this.f19501g0)) {
                    this.f19501g0 = null;
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.p0(9, this, (File) objArr[1]));
                } else if (str.equals(FileLoader.getAttachFileName(this.F.document))) {
                    t();
                    if (i10 == i12) {
                        File file = new File(this.f19493b);
                        TLRPC.TL_theme tL_theme2 = this.F;
                        f6 l02 = g6.l0(file, tL_theme2.title, tL_theme2);
                        if (l02 != null && l02.f19495c != null && !new File(l02.f19495c).exists()) {
                            this.f19506r = l02.f19506r;
                            this.f19507s = l02.f19507s;
                            this.v = l02.v;
                            this.f19508w = l02.f19508w;
                            this.f19509x = l02.f19509x;
                            this.h = l02.h;
                            this.f19510y = l02.f19510y;
                            this.f19502h0 = l02.f19495c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = l02.e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(l02.E).sendRequest(getwallpaper, new bi.m1(21, this, l02));
                            return;
                        }
                        s();
                    }
                }
            }
        }
    }

    public final e6 e(long j10, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.f19497d0;
            e6 e6Var = (e6) longSparseArray.get(j10);
            if (e6Var != null) {
                return e6Var;
            }
            int i11 = this.f19498e0 + 1;
            this.f19498e0 = i11;
            e6 e6Var2 = new e6();
            i(e6Var2, themeSettings);
            e6Var2.f19446b = this;
            e6Var2.f19445a = i11;
            e6Var2.f19459r = tL_theme;
            e6Var2.f19461t = i10;
            longSparseArray.put(i11, e6Var2);
            return e6Var2;
        }
        e6 e6Var3 = (e6) this.f19496c0.get(j10);
        if (e6Var3 != null) {
            return e6Var3;
        }
        int i12 = this.f19500f0 + 1;
        this.f19500f0 = i12;
        e6 e6Var4 = new e6();
        i(e6Var4, themeSettings);
        e6Var4.f19446b = this;
        e6Var4.f19445a = i12;
        e6Var4.f19459r = tL_theme;
        e6Var4.f19461t = i10;
        this.f19492a0.put(i12, e6Var4);
        this.f19494b0.add(0, e6Var4);
        g6.E1(this);
        this.f19496c0.put(j10, e6Var4);
        return e6Var4;
    }

    public final e6 f(TLRPC.TL_theme tL_theme, int i10, int i11) {
        TLRPC.ThemeSettings themeSettings = null;
        if (tL_theme == null) {
            return null;
        }
        if (i11 < tL_theme.settings.size()) {
            themeSettings = tL_theme.settings.get(i11);
        }
        return e(tL_theme.f19053id, themeSettings, tL_theme, i10, false);
    }

    public final String j(e6 e6Var, boolean z10) {
        String s10;
        String n10;
        if (e6Var == null) {
            e6Var = k(false);
        }
        if (e6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f19491a);
                sb3.append("_");
                n10 = a1.g.n(e6Var.f19445a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f19491a);
                sb4.append("_");
                n10 = a1.g.n(e6Var.f19445a, "_wp", sb4);
            }
            sb2.append(n10);
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            s10 = a1.g.s(new StringBuilder(), this.f19491a, "_wp_o");
        } else {
            s10 = a1.g.s(new StringBuilder(), this.f19491a, "_wp");
        }
        sb5.append(s10);
        sb5.append(Utilities.random.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final e6 k(boolean z10) {
        e6 e6Var;
        if (this.f19494b0 == null || (e6Var = (e6) this.f19492a0.get(this.Y)) == null) {
            return null;
        }
        if (z10) {
            int i10 = this.f19500f0 + 1;
            this.f19500f0 = i10;
            e6 e6Var2 = new e6();
            e6Var2.f19447c = e6Var.f19447c;
            e6Var2.d = e6Var.d;
            e6Var2.e = e6Var.e;
            e6Var2.f19448f = e6Var.f19448f;
            e6Var2.f19449g = e6Var.f19449g;
            e6Var2.h = e6Var.h;
            e6Var2.f19450i = e6Var.f19450i;
            e6Var2.f19451j = e6Var.f19451j;
            e6Var2.f19452k = e6Var.f19452k;
            e6Var2.f19453l = e6Var.f19453l;
            e6Var2.f19454m = e6Var.f19454m;
            e6Var2.f19455n = e6Var.f19455n;
            e6Var2.f19456o = e6Var.f19456o;
            e6Var2.f19457p = e6Var.f19457p;
            e6Var2.f19458q = e6Var.f19458q;
            e6Var2.f19446b = this;
            z5 z5Var = this.f19503i0;
            if (z5Var != null) {
                ?? obj = new Object();
                obj.f20547a = "";
                obj.f20548b = "";
                obj.f20549c = "";
                obj.f20549c = z5Var.f20549c;
                obj.d = z5Var.d;
                obj.e = z5Var.e;
                obj.f20550f = z5Var.f20550f;
                obj.f20551g = z5Var.f20551g;
                obj.h = z5Var.h;
                obj.f20552i = z5Var.f20552i;
                obj.f20553j = z5Var.f20553j;
                obj.f20554k = z5Var.f20554k;
                obj.f20559p = this;
                obj.f20560q = e6Var2;
                if (!TextUtils.isEmpty(z5Var.f20547a)) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), z5Var.f20547a);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String j10 = obj.f20559p.j(obj.f20560q, false);
                        obj.f20547a = j10;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, j10));
                    } catch (Exception e) {
                        obj.f20547a = "";
                        FileLog.e(e);
                    }
                } else {
                    obj.f20547a = "";
                }
                if (!TextUtils.isEmpty(z5Var.f20548b)) {
                    if (!z5Var.f20548b.equals(z5Var.f20547a)) {
                        try {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), z5Var.f20548b);
                            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                            String j11 = obj.f20559p.j(obj.f20560q, true);
                            obj.f20548b = j11;
                            AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j11));
                        } catch (Exception e7) {
                            obj.f20548b = "";
                            FileLog.e(e7);
                        }
                    } else {
                        obj.f20548b = obj.f20547a;
                    }
                } else {
                    obj.f20548b = "";
                }
                e6Var2.f19465y = obj;
            }
            this.Z = this.Y;
            e6Var2.f19445a = i10;
            this.Y = i10;
            this.f19503i0 = e6Var2.f19465y;
            this.f19492a0.put(i10, e6Var2);
            this.f19494b0.add(0, e6Var2);
            g6.E1(this);
            return e6Var2;
        }
        return e6Var;
    }

    public final int l(int i10) {
        e6 e6Var = (e6) this.f19492a0.get(i10);
        if (e6Var != null) {
            return e6Var.f19447c;
        }
        return 0;
    }

    public final String m() {
        if (this.F != null) {
            return "remote" + this.F.f19053id;
        }
        return this.f19491a;
    }

    public final String n() {
        if ("Blue".equals(this.f19491a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.f19491a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.f19491a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.f19491a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.f19491a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.F;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f19491a;
    }

    public final int o() {
        if (this.S && this.Y == g6.f19777n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == g6.f19777n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i10 = this.f19504j0;
        if (i10 != -1) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f19491a) && !"Night".equals(this.f19491a)) {
            if ("Blue".equals(this.f19491a) || "Arctic Blue".equals(this.f19491a) || "Day".equals(this.f19491a)) {
                this.f19504j0 = 0;
            }
        } else {
            this.f19504j0 = 1;
        }
        if (this.f19504j0 == -1) {
            g6.G(g6.R0(new File(this.f19493b), null, new String[1]), this);
        }
        if (this.f19504j0 != 1) {
            return false;
        }
        return true;
    }

    public final void r(SharedPreferences sharedPreferences, e6 e6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                z5 z5Var = new z5();
                z5Var.f20547a = jSONObject.getString("wall");
                z5Var.f20548b = jSONObject.getString("owall");
                z5Var.d = jSONObject.getInt("pColor");
                z5Var.e = jSONObject.getInt("pGrColor");
                z5Var.f20550f = jSONObject.optInt("pGrColor2");
                z5Var.f20551g = jSONObject.optInt("pGrColor3");
                z5Var.h = jSONObject.getInt("pGrAngle");
                z5Var.f20549c = jSONObject.getString("wallSlug");
                z5Var.f20552i = jSONObject.getBoolean("wBlur");
                z5Var.f20553j = jSONObject.getBoolean("wMotion");
                z5Var.f20554k = (float) jSONObject.getDouble("pIntensity");
                z5Var.f20559p = this;
                z5Var.f20560q = e6Var;
                if (e6Var != null) {
                    e6Var.f19465y = z5Var;
                } else {
                    this.f19503i0 = z5Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    z5Var.f20549c = "d";
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
        g6.t1(true, false);
        if (this == g6.I && g6.M == null) {
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i10 = NotificationCenter.needSetDayNightTheme;
            if (this == g6.J) {
                z10 = true;
            } else {
                z10 = false;
            }
            globalInstance.lambda$postNotificationNameOnUIThread$1(i10, this, Boolean.valueOf(z10), null, -1, g6.rl);
        }
    }

    public final void t() {
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.fileLoadFailed);
    }

    public final void u(int i10) {
        this.Y = i10;
        e6 k10 = k(false);
        if (k10 != null) {
            this.f19503i0 = k10.f19465y;
        }
    }

    public final void v(z5 z5Var) {
        if (this.f19503i0 != z5Var) {
            e6 k10 = k(false);
            z5 z5Var2 = this.f19503i0;
            if (z5Var2 != null) {
                z5.a(z5Var2);
            }
            if (z5Var != null) {
                z5Var.f20560q = k10;
                z5Var.f20559p = this;
                z5Var.c();
            }
            this.f19503i0 = z5Var;
            if (k10 != null) {
                k10.f19465y = z5Var;
            }
        }
    }

    public f6(f6 f6Var) {
        this.f19509x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f19497d0 = new LongSparseArray();
        this.f19498e0 = 0;
        this.f19500f0 = 100;
        this.f19504j0 = -1;
        this.f19491a = f6Var.f19491a;
        this.f19493b = f6Var.f19493b;
        this.f19495c = f6Var.f19495c;
        this.d = f6Var.d;
        this.e = f6Var.e;
        this.f19499f = f6Var.f19499f;
        this.h = f6Var.h;
        this.f19505n = f6Var.f19505n;
        this.f19506r = f6Var.f19506r;
        this.f19507s = f6Var.f19507s;
        this.v = f6Var.v;
        this.f19508w = f6Var.f19508w;
        this.f19509x = f6Var.f19509x;
        this.f19510y = f6Var.f19510y;
        this.E = f6Var.E;
        this.F = f6Var.F;
        this.G = f6Var.G;
        this.H = f6Var.H;
        this.I = f6Var.I;
        this.J = f6Var.J;
        this.K = f6Var.K;
        this.L = f6Var.L;
        this.M = f6Var.M;
        this.N = f6Var.N;
        this.O = f6Var.O;
        this.P = f6Var.P;
        this.Q = f6Var.Q;
        this.R = f6Var.R;
        this.S = f6Var.S;
        this.T = f6Var.T;
        this.U = f6Var.U;
        this.V = f6Var.V;
        this.W = f6Var.W;
        this.X = f6Var.X;
        this.Y = f6Var.Y;
        this.Z = f6Var.Z;
        this.f19492a0 = f6Var.f19492a0;
        this.f19494b0 = f6Var.f19494b0;
        this.f19496c0 = f6Var.f19496c0;
        this.f19500f0 = f6Var.f19500f0;
        this.f19501g0 = f6Var.f19501g0;
        this.f19502h0 = f6Var.f19502h0;
        this.f19503i0 = f6Var.f19503i0;
    }
}
