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
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.yb0;
public final class f6 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public TLRPC.TL_theme B;
    public boolean C;
    public String D;
    public String E;
    public TLRPC.InputFile F;
    public TLRPC.InputFile G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public SparseArray W;
    public ArrayList X;
    public LongSparseArray Y;
    public final LongSparseArray Z;
    public String f22941a;
    public int f22942a0;
    public String f22943b;
    public int f22944b0;
    public String f22945c;
    public String f22946c0;
    public String d;
    public String f22947d0;
    public String f22948e;
    public z5 f22949e0;
    public boolean f22950f;
    public int f22951f0;
    public boolean h;
    public boolean f22952n;
    public int f22953r;
    public int f22954s;
    public int v;
    public int f22955w;
    public int f22956x;
    public int f22957y;

    public f6() {
        this.f22956x = 45;
        this.C = true;
        this.Q = true;
        this.V = -1;
        this.Z = new LongSparseArray();
        this.f22942a0 = 0;
        this.f22944b0 = 100;
        this.f22951f0 = -1;
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
        String str;
        int i14;
        int i15;
        float f9;
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
            i14 = g6.X0(wallPaperSettings.background_color);
            int i16 = themeSettings.wallpaper.settings.second_background_color;
            j12 = 4294967296L;
            if (i16 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = g6.X0(i16);
            }
            int i17 = themeSettings.wallpaper.settings.third_background_color;
            if (i17 == 0) {
                j11 = 4294967296L;
            } else {
                j11 = g6.X0(i17);
            }
            int i18 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i18 != 0) {
                j12 = g6.X0(i18);
            }
            i15 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f9 = wallPaper2.settings.intensity / 100.0f;
                long j13 = j11;
                if (themeSettings.accent_color != e6Var.f22904c && themeSettings.outbox_accent_color == e6Var.d && i10 == e6Var.f22905e && i11 == e6Var.f22906f && i12 == e6Var.f22907g && i13 == e6Var.h && themeSettings.message_colors_animated == e6Var.f22908i && i14 == e6Var.f22909j && j10 == e6Var.f22910k && j13 == e6Var.f22911l && j12 == e6Var.f22912m && i15 == e6Var.f22913n && TextUtils.equals(str, e6Var.f22914o) && Math.abs(f9 - e6Var.f22915p) < 0.001d) {
                    return z11;
                }
                return z10;
            }
            str = null;
        } else {
            z10 = false;
            z11 = true;
            j10 = 0;
            j11 = 0;
            j12 = 0;
            str = null;
            i14 = 0;
            i15 = 0;
        }
        f9 = 0.0f;
        long j132 = j11;
        if (themeSettings.accent_color != e6Var.f22904c) {
        }
        return z10;
    }

    public static void b(f6 f6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        f6Var.S = iArr.length;
        f6Var.X = new ArrayList();
        f6Var.W = new SparseArray();
        f6Var.Y = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            e6 e6Var = new e6();
            e6Var.f22902a = iArr8[i10];
            if (g6.g1(e6Var)) {
                e6Var.f22924z = true;
            }
            e6Var.f22904c = iArr[i10];
            e6Var.f22903b = f6Var;
            e6Var.f22905e = iArr2[i10];
            e6Var.f22906f = iArr3[i10];
            long j10 = iArr4[i10];
            e6Var.f22909j = j10;
            boolean z10 = f6Var.O;
            if (z10 && e6Var.f22902a == g6.f23234n) {
                e6Var.f22909j = 4294967296L;
            } else {
                e6Var.f22909j = j10;
            }
            if (z10 && e6Var.f22902a == g6.f23234n) {
                e6Var.f22910k = 4294967296L;
            } else {
                e6Var.f22910k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && e6Var.f22902a == g6.f23234n) {
                    e6Var.f22911l = 4294967296L;
                } else {
                    e6Var.f22911l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && e6Var.f22902a == g6.f23234n) {
                    e6Var.f22912m = 4294967296L;
                } else {
                    e6Var.f22912m = iArr7[i10];
                }
            }
            e6Var.f22915p = iArr10[i10] / 100.0f;
            e6Var.f22913n = iArr9[i10];
            e6Var.f22914o = strArr[i10];
            if ((g6.g1(e6Var) && f6Var.f22941a.equals("Dark Blue")) || f6Var.f22941a.equals("Night")) {
                e6Var.f22905e = -14316059;
                e6Var.f22906f = -12422433;
                e6Var.f22907g = -8304937;
                e6Var.h = -6340950;
                if (f6Var.f22941a.equals("Night")) {
                    e6Var.f22915p = -0.57f;
                    e6Var.f22909j = -9666650L;
                    e6Var.f22910k = -13749173L;
                    e6Var.f22911l = -8883033L;
                    e6Var.f22912m = -13421992L;
                }
            }
            f6Var.W.put(e6Var.f22902a, e6Var);
            f6Var.X.add(e6Var);
        }
        f6Var.T = ((e6) f6Var.W.get(0)).f22904c;
    }

    public static void c(f6 f6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = f6Var.X;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = f6Var.X.size();
            for (int i10 = 0; i10 < size; i10++) {
                e6 e6Var = (e6) f6Var.X.get(i10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f6Var.f22941a);
                sb2.append("_");
                f6Var.r(sharedPreferences, e6Var, a4.w.l(e6Var.f22902a, "_owp", sb2));
            }
            return;
        }
        f6Var.r(sharedPreferences, null, a4.w.q(new StringBuilder(), f6Var.f22941a, "_owp"));
    }

    public static f6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            f6 f6Var = new f6();
            f6Var.f22941a = jSONObject.getString("name");
            f6Var.f22943b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                f6Var.A = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                f6Var.B = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                f6Var.C = jSONObject.getBoolean("loaded");
            }
            return f6Var;
        } catch (Exception e10) {
            FileLog.e(e10);
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
        f6Var.f22941a = split[0];
        f6Var.f22943b = split[1];
        return f6Var;
    }

    public static void i(e6 e6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        e6Var.f22904c = themeSettings.accent_color;
        e6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i10 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        e6Var.f22905e = i10;
        if (themeSettings.message_colors.size() > 1) {
            i11 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        e6Var.f22906f = i11;
        if (e6Var.f22905e == i11) {
            e6Var.f22906f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        e6Var.f22907g = i12;
        if (themeSettings.message_colors.size() > 3) {
            i13 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i13 = 0;
        }
        e6Var.h = i13;
        e6Var.f22908i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            int i14 = wallPaperSettings.background_color;
            if (i14 == 0) {
                e6Var.f22909j = 4294967296L;
            } else {
                e6Var.f22909j = g6.X0(i14);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                e6Var.f22910k = 4294967296L;
            } else {
                e6Var.f22910k = g6.X0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                e6Var.f22911l = 4294967296L;
            } else {
                e6Var.f22911l = g6.X0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                e6Var.f22912m = 4294967296L;
            } else {
                e6Var.f22912m = g6.X0(wallPaperSettings4.fourth_background_color);
            }
            e6Var.f22913n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                e6Var.f22914o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                e6Var.f22915p = wallPaperSettings5.intensity / 100.0f;
                e6Var.f22916q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f22953r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = yb0.g(this.f22953r, this.f22954s, i10, this.f22955w);
                } else {
                    int i11 = this.f22954s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f22953r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(s9.d(this.f22956x), new int[]{this.f22953r, this.f22954s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.f22953r);
                        canvas.drawColor(this.f22953r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.f22957y / 100.0f) * 255.0f));
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
            TLRPC.TL_theme tL_theme = this.B;
            if (tL_theme != null && tL_theme.document != null) {
                if (str.equals(this.f22946c0)) {
                    this.f22946c0 = null;
                    Utilities.globalQueue.postRunnable(new c(5, this, (File) objArr[1]));
                } else if (str.equals(FileLoader.getAttachFileName(this.B.document))) {
                    t();
                    if (i10 == i12) {
                        File file = new File(this.f22943b);
                        TLRPC.TL_theme tL_theme2 = this.B;
                        f6 k02 = g6.k0(file, tL_theme2.title, tL_theme2);
                        if (k02 != null && k02.f22945c != null && !new File(k02.f22945c).exists()) {
                            this.f22953r = k02.f22953r;
                            this.f22954s = k02.f22954s;
                            this.v = k02.v;
                            this.f22955w = k02.f22955w;
                            this.f22956x = k02.f22956x;
                            this.h = k02.h;
                            this.f22957y = k02.f22957y;
                            this.f22947d0 = k02.f22945c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = k02.f22948e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(k02.A).sendRequest(getwallpaper, new bg.h3(24, this, k02));
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
            LongSparseArray longSparseArray = this.Z;
            e6 e6Var = (e6) longSparseArray.get(j10);
            if (e6Var != null) {
                return e6Var;
            }
            int i11 = this.f22942a0 + 1;
            this.f22942a0 = i11;
            e6 e6Var2 = new e6();
            i(e6Var2, themeSettings);
            e6Var2.f22903b = this;
            e6Var2.f22902a = i11;
            e6Var2.f22917r = tL_theme;
            e6Var2.f22919t = i10;
            longSparseArray.put(i11, e6Var2);
            return e6Var2;
        }
        e6 e6Var3 = (e6) this.Y.get(j10);
        if (e6Var3 != null) {
            return e6Var3;
        }
        int i12 = this.f22944b0 + 1;
        this.f22944b0 = i12;
        e6 e6Var4 = new e6();
        i(e6Var4, themeSettings);
        e6Var4.f22903b = this;
        e6Var4.f22902a = i12;
        e6Var4.f22917r = tL_theme;
        e6Var4.f22919t = i10;
        this.W.put(i12, e6Var4);
        this.X.add(0, e6Var4);
        g6.D1(this);
        this.Y.put(j10, e6Var4);
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
        return e(tL_theme.f22529id, themeSettings, tL_theme, i10, false);
    }

    public final String j(e6 e6Var, boolean z10) {
        String q6;
        String l10;
        if (e6Var == null) {
            e6Var = k(false);
        }
        if (e6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f22941a);
                sb3.append("_");
                l10 = a4.w.l(e6Var.f22902a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f22941a);
                sb4.append("_");
                l10 = a4.w.l(e6Var.f22902a, "_wp", sb4);
            }
            sb2.append(l10);
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            q6 = a4.w.q(new StringBuilder(), this.f22941a, "_wp_o");
        } else {
            q6 = a4.w.q(new StringBuilder(), this.f22941a, "_wp");
        }
        sb5.append(q6);
        sb5.append(Utilities.random.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final e6 k(boolean z10) {
        e6 e6Var;
        if (this.X == null || (e6Var = (e6) this.W.get(this.U)) == null) {
            return null;
        }
        if (z10) {
            int i10 = this.f22944b0 + 1;
            this.f22944b0 = i10;
            e6 e6Var2 = new e6();
            e6Var2.f22904c = e6Var.f22904c;
            e6Var2.d = e6Var.d;
            e6Var2.f22905e = e6Var.f22905e;
            e6Var2.f22906f = e6Var.f22906f;
            e6Var2.f22907g = e6Var.f22907g;
            e6Var2.h = e6Var.h;
            e6Var2.f22908i = e6Var.f22908i;
            e6Var2.f22909j = e6Var.f22909j;
            e6Var2.f22910k = e6Var.f22910k;
            e6Var2.f22911l = e6Var.f22911l;
            e6Var2.f22912m = e6Var.f22912m;
            e6Var2.f22913n = e6Var.f22913n;
            e6Var2.f22914o = e6Var.f22914o;
            e6Var2.f22915p = e6Var.f22915p;
            e6Var2.f22916q = e6Var.f22916q;
            e6Var2.f22903b = this;
            z5 z5Var = this.f22949e0;
            if (z5Var != null) {
                ?? obj = new Object();
                obj.f24018a = "";
                obj.f24019b = "";
                obj.f24020c = "";
                obj.f24020c = z5Var.f24020c;
                obj.d = z5Var.d;
                obj.f24021e = z5Var.f24021e;
                obj.f24022f = z5Var.f24022f;
                obj.f24023g = z5Var.f24023g;
                obj.h = z5Var.h;
                obj.f24024i = z5Var.f24024i;
                obj.f24025j = z5Var.f24025j;
                obj.f24026k = z5Var.f24026k;
                obj.f24031p = this;
                obj.f24032q = e6Var2;
                if (!TextUtils.isEmpty(z5Var.f24018a)) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), z5Var.f24018a);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String j10 = obj.f24031p.j(obj.f24032q, false);
                        obj.f24018a = j10;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, j10));
                    } catch (Exception e10) {
                        obj.f24018a = "";
                        FileLog.e(e10);
                    }
                } else {
                    obj.f24018a = "";
                }
                if (!TextUtils.isEmpty(z5Var.f24019b)) {
                    if (!z5Var.f24019b.equals(z5Var.f24018a)) {
                        try {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), z5Var.f24019b);
                            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                            String j11 = obj.f24031p.j(obj.f24032q, true);
                            obj.f24019b = j11;
                            AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j11));
                        } catch (Exception e11) {
                            obj.f24019b = "";
                            FileLog.e(e11);
                        }
                    } else {
                        obj.f24019b = obj.f24018a;
                    }
                } else {
                    obj.f24019b = "";
                }
                e6Var2.f22923y = obj;
            }
            this.V = this.U;
            e6Var2.f22902a = i10;
            this.U = i10;
            this.f22949e0 = e6Var2.f22923y;
            this.W.put(i10, e6Var2);
            this.X.add(0, e6Var2);
            g6.D1(this);
            return e6Var2;
        }
        return e6Var;
    }

    public final int l(int i10) {
        e6 e6Var = (e6) this.W.get(i10);
        if (e6Var != null) {
            return e6Var.f22904c;
        }
        return 0;
    }

    public final String m() {
        if (this.B != null) {
            return "remote" + this.B.f22529id;
        }
        return this.f22941a;
    }

    public final String n() {
        if ("Blue".equals(this.f22941a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.f22941a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.f22941a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.f22941a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.f22941a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.B;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f22941a;
    }

    public final int o() {
        if (this.O && this.U == g6.f23234n) {
            return -3155485;
        }
        return this.H;
    }

    public final int p() {
        if (this.O && this.U == g6.f23234n) {
            return -983328;
        }
        return this.N;
    }

    public final boolean q() {
        int i10 = this.f22951f0;
        if (i10 != -1) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f22941a) && !"Night".equals(this.f22941a)) {
            if ("Blue".equals(this.f22941a) || "Arctic Blue".equals(this.f22941a) || "Day".equals(this.f22941a)) {
                this.f22951f0 = 0;
            }
        } else {
            this.f22951f0 = 1;
        }
        if (this.f22951f0 == -1) {
            g6.G(g6.Q0(new File(this.f22943b), null, new String[1]), this);
        }
        if (this.f22951f0 != 1) {
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
                z5Var.f24018a = jSONObject.getString("wall");
                z5Var.f24019b = jSONObject.getString("owall");
                z5Var.d = jSONObject.getInt("pColor");
                z5Var.f24021e = jSONObject.getInt("pGrColor");
                z5Var.f24022f = jSONObject.optInt("pGrColor2");
                z5Var.f24023g = jSONObject.optInt("pGrColor3");
                z5Var.h = jSONObject.getInt("pGrAngle");
                z5Var.f24020c = jSONObject.getString("wallSlug");
                z5Var.f24024i = jSONObject.getBoolean("wBlur");
                z5Var.f24025j = jSONObject.getBoolean("wMotion");
                z5Var.f24026k = (float) jSONObject.getDouble("pIntensity");
                z5Var.f24031p = this;
                z5Var.f24032q = e6Var;
                if (e6Var != null) {
                    e6Var.f22923y = z5Var;
                } else {
                    this.f22949e0 = z5Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    z5Var.f24020c = "d";
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void s() {
        boolean z10;
        this.C = true;
        this.P = false;
        g6.s1(true, false);
        if (this == g6.I && g6.M == null) {
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i10 = NotificationCenter.needSetDayNightTheme;
            if (this == g6.J) {
                z10 = true;
            } else {
                z10 = false;
            }
            globalInstance.lambda$postNotificationNameOnUIThread$1(i10, this, Boolean.valueOf(z10), null, -1, g6.ol);
        }
    }

    public final void t() {
        NotificationCenter.getInstance(this.A).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.A).removeObserver(this, NotificationCenter.fileLoadFailed);
    }

    public final void u(int i10) {
        this.U = i10;
        e6 k9 = k(false);
        if (k9 != null) {
            this.f22949e0 = k9.f22923y;
        }
    }

    public final void v(z5 z5Var) {
        if (this.f22949e0 != z5Var) {
            e6 k9 = k(false);
            z5 z5Var2 = this.f22949e0;
            if (z5Var2 != null) {
                z5.a(z5Var2);
            }
            if (z5Var != null) {
                z5Var.f24032q = k9;
                z5Var.f24031p = this;
                z5Var.c();
            }
            this.f22949e0 = z5Var;
            if (k9 != null) {
                k9.f22923y = z5Var;
            }
        }
    }

    public f6(f6 f6Var) {
        this.f22956x = 45;
        this.C = true;
        this.Q = true;
        this.V = -1;
        this.Z = new LongSparseArray();
        this.f22942a0 = 0;
        this.f22944b0 = 100;
        this.f22951f0 = -1;
        this.f22941a = f6Var.f22941a;
        this.f22943b = f6Var.f22943b;
        this.f22945c = f6Var.f22945c;
        this.d = f6Var.d;
        this.f22948e = f6Var.f22948e;
        this.f22950f = f6Var.f22950f;
        this.h = f6Var.h;
        this.f22952n = f6Var.f22952n;
        this.f22953r = f6Var.f22953r;
        this.f22954s = f6Var.f22954s;
        this.v = f6Var.v;
        this.f22955w = f6Var.f22955w;
        this.f22956x = f6Var.f22956x;
        this.f22957y = f6Var.f22957y;
        this.A = f6Var.A;
        this.B = f6Var.B;
        this.C = f6Var.C;
        this.D = f6Var.D;
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
        this.f22944b0 = f6Var.f22944b0;
        this.f22946c0 = f6Var.f22946c0;
        this.f22947d0 = f6Var.f22947d0;
        this.f22949e0 = f6Var.f22949e0;
    }
}
