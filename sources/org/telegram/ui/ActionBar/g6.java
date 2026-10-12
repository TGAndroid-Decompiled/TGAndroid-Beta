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
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.x9;
public final class g6 implements NotificationCenter.NotificationCenterDelegate {
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
    public String f20428a;
    public SparseArray f20429a0;
    public String f20430b;
    public ArrayList f20431b0;
    public String f20432c;
    public LongSparseArray f20433c0;
    public String d;
    public final LongSparseArray f20434d0;
    public String f20435e;
    public int f20436e0;
    public boolean f20437f;
    public int f20438f0;
    public String f20439g0;
    public boolean h;
    public String f20440h0;
    public z5 f20441i0;
    public int f20442j0;
    public boolean f20443n;
    public int f20444r;
    public int f20445s;
    public int v;
    public int f20446w;
    public int f20447x;
    public int f20448y;

    public g6() {
        this.f20447x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f20434d0 = new LongSparseArray();
        this.f20436e0 = 0;
        this.f20438f0 = 100;
        this.f20442j0 = -1;
    }

    public static boolean a(e6 e6Var, TLRPC.ThemeSettings themeSettings) {
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
            i14 = h6.Y0(wallPaperSettings.background_color);
            int i16 = themeSettings.wallpaper.settings.second_background_color;
            j11 = 4294967296L;
            if (i16 == 0) {
                j3 = 4294967296L;
            } else {
                j3 = h6.Y0(i16);
            }
            int i17 = themeSettings.wallpaper.settings.third_background_color;
            if (i17 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = h6.Y0(i17);
            }
            int i18 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i18 != 0) {
                j11 = h6.Y0(i18);
            }
            i15 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f7 = wallPaper2.settings.intensity / 100.0f;
                long j12 = j10;
                if (themeSettings.accent_color != e6Var.f20351c && themeSettings.outbox_accent_color == e6Var.d && i10 == e6Var.f20352e && i11 == e6Var.f20353f && i12 == e6Var.f20354g && i13 == e6Var.h && themeSettings.message_colors_animated == e6Var.f20355i && i14 == e6Var.f20356j && j3 == e6Var.f20357k && j12 == e6Var.f20358l && j11 == e6Var.f20359m && i15 == e6Var.f20360n && TextUtils.equals(str, e6Var.f20361o) && Math.abs(f7 - e6Var.f20362p) < 0.001d) {
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
        if (themeSettings.accent_color != e6Var.f20351c) {
        }
        return z10;
    }

    public static void b(g6 g6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        g6Var.W = iArr.length;
        g6Var.f20431b0 = new ArrayList();
        g6Var.f20429a0 = new SparseArray();
        g6Var.f20433c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            e6 e6Var = new e6();
            e6Var.f20349a = iArr8[i10];
            if (h6.h1(e6Var)) {
                e6Var.f20371z = true;
            }
            e6Var.f20351c = iArr[i10];
            e6Var.f20350b = g6Var;
            e6Var.f20352e = iArr2[i10];
            e6Var.f20353f = iArr3[i10];
            long j3 = iArr4[i10];
            e6Var.f20356j = j3;
            boolean z10 = g6Var.S;
            if (z10 && e6Var.f20349a == h6.f20737n) {
                e6Var.f20356j = 4294967296L;
            } else {
                e6Var.f20356j = j3;
            }
            if (z10 && e6Var.f20349a == h6.f20737n) {
                e6Var.f20357k = 4294967296L;
            } else {
                e6Var.f20357k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && e6Var.f20349a == h6.f20737n) {
                    e6Var.f20358l = 4294967296L;
                } else {
                    e6Var.f20358l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && e6Var.f20349a == h6.f20737n) {
                    e6Var.f20359m = 4294967296L;
                } else {
                    e6Var.f20359m = iArr7[i10];
                }
            }
            e6Var.f20362p = iArr10[i10] / 100.0f;
            e6Var.f20360n = iArr9[i10];
            e6Var.f20361o = strArr[i10];
            if ((h6.h1(e6Var) && g6Var.f20428a.equals("Dark Blue")) || g6Var.f20428a.equals("Night")) {
                e6Var.f20352e = -14316059;
                e6Var.f20353f = -12422433;
                e6Var.f20354g = -8304937;
                e6Var.h = -6340950;
                if (g6Var.f20428a.equals("Night")) {
                    e6Var.f20362p = -0.57f;
                    e6Var.f20356j = -9666650L;
                    e6Var.f20357k = -13749173L;
                    e6Var.f20358l = -8883033L;
                    e6Var.f20359m = -13421992L;
                }
            }
            g6Var.f20429a0.put(e6Var.f20349a, e6Var);
            g6Var.f20431b0.add(e6Var);
        }
        g6Var.X = ((e6) g6Var.f20429a0.get(0)).f20351c;
    }

    public static void c(g6 g6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = g6Var.f20431b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = g6Var.f20431b0.size();
            for (int i10 = 0; i10 < size; i10++) {
                e6 e6Var = (e6) g6Var.f20431b0.get(i10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(g6Var.f20428a);
                sb2.append("_");
                g6Var.r(sharedPreferences, e6Var, a1.g.o(e6Var.f20349a, "_owp", sb2));
            }
            return;
        }
        g6Var.r(sharedPreferences, null, a1.g.t(new StringBuilder(), g6Var.f20428a, "_owp"));
    }

    public static g6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            g6 g6Var = new g6();
            g6Var.f20428a = jSONObject.getString("name");
            g6Var.f20430b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                g6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                g6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                g6Var.G = jSONObject.getBoolean("loaded");
            }
            return g6Var;
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public static g6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        g6 g6Var = new g6();
        g6Var.f20428a = split[0];
        g6Var.f20430b = split[1];
        return g6Var;
    }

    public static void i(e6 e6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i14;
        e6Var.f20351c = themeSettings.accent_color;
        e6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i10 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        e6Var.f20352e = i10;
        if (themeSettings.message_colors.size() > 1) {
            i11 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        e6Var.f20353f = i11;
        if (e6Var.f20352e == i11) {
            e6Var.f20353f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        e6Var.f20354g = i12;
        if (themeSettings.message_colors.size() > 3) {
            i13 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i13 = 0;
        }
        e6Var.h = i13;
        e6Var.f20355i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            if (wallPaperSettings.background_color == 0) {
                e6Var.f20356j = 4294967296L;
            } else {
                e6Var.f20356j = h6.Y0(i14);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                e6Var.f20357k = 4294967296L;
            } else {
                e6Var.f20357k = h6.Y0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                e6Var.f20358l = 4294967296L;
            } else {
                e6Var.f20358l = h6.Y0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                e6Var.f20359m = 4294967296L;
            } else {
                e6Var.f20359m = h6.Y0(wallPaperSettings4.fourth_background_color);
            }
            e6Var.f20360n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                e6Var.f20361o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                e6Var.f20362p = wallPaperSettings5.intensity / 100.0f;
                e6Var.f20363q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f20444r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = gd0.g(this.f20444r, this.f20445s, i10, this.f20446w);
                } else {
                    int i11 = this.f20445s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f20444r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(x9.d(this.f20447x), new int[]{this.f20444r, this.f20445s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.f20444r);
                        canvas.drawColor(this.f20444r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.f20448y / 100.0f) * 255.0f));
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
                if (str.equals(this.f20439g0)) {
                    this.f20439g0 = null;
                    Utilities.globalQueue.postRunnable(new f6(0, this, (File) objArr[1]));
                } else if (str.equals(FileLoader.getAttachFileName(this.F.document))) {
                    t();
                    if (i10 == i12) {
                        File file = new File(this.f20430b);
                        TLRPC.TL_theme tL_theme2 = this.F;
                        g6 l02 = h6.l0(file, tL_theme2.title, tL_theme2);
                        if (l02 != null && l02.f20432c != null && !new File(l02.f20432c).exists()) {
                            this.f20444r = l02.f20444r;
                            this.f20445s = l02.f20445s;
                            this.v = l02.v;
                            this.f20446w = l02.f20446w;
                            this.f20447x = l02.f20447x;
                            this.h = l02.h;
                            this.f20448y = l02.f20448y;
                            this.f20440h0 = l02.f20432c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = l02.f20435e;
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

    public final e6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.f20434d0;
            e6 e6Var = (e6) longSparseArray.get(j3);
            if (e6Var != null) {
                return e6Var;
            }
            int i11 = this.f20436e0 + 1;
            this.f20436e0 = i11;
            e6 e6Var2 = new e6();
            i(e6Var2, themeSettings);
            e6Var2.f20350b = this;
            e6Var2.f20349a = i11;
            e6Var2.f20364r = tL_theme;
            e6Var2.f20366t = i10;
            longSparseArray.put(i11, e6Var2);
            return e6Var2;
        }
        e6 e6Var3 = (e6) this.f20433c0.get(j3);
        if (e6Var3 != null) {
            return e6Var3;
        }
        int i12 = this.f20438f0 + 1;
        this.f20438f0 = i12;
        e6 e6Var4 = new e6();
        i(e6Var4, themeSettings);
        e6Var4.f20350b = this;
        e6Var4.f20349a = i12;
        e6Var4.f20364r = tL_theme;
        e6Var4.f20366t = i10;
        this.f20429a0.put(i12, e6Var4);
        this.f20431b0.add(0, e6Var4);
        h6.E1(this);
        this.f20433c0.put(j3, e6Var4);
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
        return e(tL_theme.f19939id, themeSettings, tL_theme, i10, false);
    }

    public final String j(e6 e6Var, boolean z10) {
        String t10;
        String o9;
        if (e6Var == null) {
            e6Var = k(false);
        }
        if (e6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f20428a);
                sb3.append("_");
                o9 = a1.g.o(e6Var.f20349a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f20428a);
                sb4.append("_");
                o9 = a1.g.o(e6Var.f20349a, "_wp", sb4);
            }
            sb2.append(o9);
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            t10 = a1.g.t(new StringBuilder(), this.f20428a, "_wp_o");
        } else {
            t10 = a1.g.t(new StringBuilder(), this.f20428a, "_wp");
        }
        sb5.append(t10);
        sb5.append(Utilities.random.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final e6 k(boolean z10) {
        e6 e6Var;
        if (this.f20431b0 == null || (e6Var = (e6) this.f20429a0.get(this.Y)) == null) {
            return null;
        }
        if (z10) {
            int i10 = this.f20438f0 + 1;
            this.f20438f0 = i10;
            e6 e6Var2 = new e6();
            e6Var2.f20351c = e6Var.f20351c;
            e6Var2.d = e6Var.d;
            e6Var2.f20352e = e6Var.f20352e;
            e6Var2.f20353f = e6Var.f20353f;
            e6Var2.f20354g = e6Var.f20354g;
            e6Var2.h = e6Var.h;
            e6Var2.f20355i = e6Var.f20355i;
            e6Var2.f20356j = e6Var.f20356j;
            e6Var2.f20357k = e6Var.f20357k;
            e6Var2.f20358l = e6Var.f20358l;
            e6Var2.f20359m = e6Var.f20359m;
            e6Var2.f20360n = e6Var.f20360n;
            e6Var2.f20361o = e6Var.f20361o;
            e6Var2.f20362p = e6Var.f20362p;
            e6Var2.f20363q = e6Var.f20363q;
            e6Var2.f20350b = this;
            z5 z5Var = this.f20441i0;
            if (z5Var != null) {
                ?? obj = new Object();
                obj.f21495a = "";
                obj.f21496b = "";
                obj.f21497c = "";
                obj.f21497c = z5Var.f21497c;
                obj.d = z5Var.d;
                obj.f21498e = z5Var.f21498e;
                obj.f21499f = z5Var.f21499f;
                obj.f21500g = z5Var.f21500g;
                obj.h = z5Var.h;
                obj.f21501i = z5Var.f21501i;
                obj.f21502j = z5Var.f21502j;
                obj.f21503k = z5Var.f21503k;
                obj.f21508p = this;
                obj.f21509q = e6Var2;
                if (!TextUtils.isEmpty(z5Var.f21495a)) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), z5Var.f21495a);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String j3 = obj.f21508p.j(obj.f21509q, false);
                        obj.f21495a = j3;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, j3));
                    } catch (Exception e7) {
                        obj.f21495a = "";
                        FileLog.e(e7);
                    }
                } else {
                    obj.f21495a = "";
                }
                if (!TextUtils.isEmpty(z5Var.f21496b)) {
                    if (!z5Var.f21496b.equals(z5Var.f21495a)) {
                        try {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), z5Var.f21496b);
                            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                            String j10 = obj.f21508p.j(obj.f21509q, true);
                            obj.f21496b = j10;
                            AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j10));
                        } catch (Exception e10) {
                            obj.f21496b = "";
                            FileLog.e(e10);
                        }
                    } else {
                        obj.f21496b = obj.f21495a;
                    }
                } else {
                    obj.f21496b = "";
                }
                e6Var2.f20370y = obj;
            }
            this.Z = this.Y;
            e6Var2.f20349a = i10;
            this.Y = i10;
            this.f20441i0 = e6Var2.f20370y;
            this.f20429a0.put(i10, e6Var2);
            this.f20431b0.add(0, e6Var2);
            h6.E1(this);
            return e6Var2;
        }
        return e6Var;
    }

    public final int l(int i10) {
        e6 e6Var = (e6) this.f20429a0.get(i10);
        if (e6Var != null) {
            return e6Var.f20351c;
        }
        return 0;
    }

    public final String m() {
        if (this.F != null) {
            return "remote" + this.F.f19939id;
        }
        return this.f20428a;
    }

    public final String n() {
        if ("Blue".equals(this.f20428a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.f20428a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.f20428a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.f20428a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.f20428a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.F;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f20428a;
    }

    public final int o() {
        if (this.S && this.Y == h6.f20737n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == h6.f20737n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i10 = this.f20442j0;
        if (i10 != -1) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f20428a) && !"Night".equals(this.f20428a)) {
            if ("Blue".equals(this.f20428a) || "Arctic Blue".equals(this.f20428a) || "Day".equals(this.f20428a)) {
                this.f20442j0 = 0;
            }
        } else {
            this.f20442j0 = 1;
        }
        if (this.f20442j0 == -1) {
            h6.G(h6.R0(new File(this.f20430b), null, new String[1]), this);
        }
        if (this.f20442j0 != 1) {
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
                z5Var.f21495a = jSONObject.getString("wall");
                z5Var.f21496b = jSONObject.getString("owall");
                z5Var.d = jSONObject.getInt("pColor");
                z5Var.f21498e = jSONObject.getInt("pGrColor");
                z5Var.f21499f = jSONObject.optInt("pGrColor2");
                z5Var.f21500g = jSONObject.optInt("pGrColor3");
                z5Var.h = jSONObject.getInt("pGrAngle");
                z5Var.f21497c = jSONObject.getString("wallSlug");
                z5Var.f21501i = jSONObject.getBoolean("wBlur");
                z5Var.f21502j = jSONObject.getBoolean("wMotion");
                z5Var.f21503k = (float) jSONObject.getDouble("pIntensity");
                z5Var.f21508p = this;
                z5Var.f21509q = e6Var;
                if (e6Var != null) {
                    e6Var.f20370y = z5Var;
                } else {
                    this.f20441i0 = z5Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    z5Var.f21497c = "d";
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
        h6.t1(true, false);
        if (this == h6.I && h6.M == null) {
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i10 = NotificationCenter.needSetDayNightTheme;
            if (this == h6.J) {
                z10 = true;
            } else {
                z10 = false;
            }
            globalInstance.lambda$postNotificationNameOnUIThread$1(i10, this, Boolean.valueOf(z10), null, -1, h6.rl);
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
            this.f20441i0 = k10.f20370y;
        }
    }

    public final void v(z5 z5Var) {
        if (this.f20441i0 != z5Var) {
            e6 k10 = k(false);
            z5 z5Var2 = this.f20441i0;
            if (z5Var2 != null) {
                z5.a(z5Var2);
            }
            if (z5Var != null) {
                z5Var.f21509q = k10;
                z5Var.f21508p = this;
                z5Var.c();
            }
            this.f20441i0 = z5Var;
            if (k10 != null) {
                k10.f20370y = z5Var;
            }
        }
    }

    public g6(g6 g6Var) {
        this.f20447x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f20434d0 = new LongSparseArray();
        this.f20436e0 = 0;
        this.f20438f0 = 100;
        this.f20442j0 = -1;
        this.f20428a = g6Var.f20428a;
        this.f20430b = g6Var.f20430b;
        this.f20432c = g6Var.f20432c;
        this.d = g6Var.d;
        this.f20435e = g6Var.f20435e;
        this.f20437f = g6Var.f20437f;
        this.h = g6Var.h;
        this.f20443n = g6Var.f20443n;
        this.f20444r = g6Var.f20444r;
        this.f20445s = g6Var.f20445s;
        this.v = g6Var.v;
        this.f20446w = g6Var.f20446w;
        this.f20447x = g6Var.f20447x;
        this.f20448y = g6Var.f20448y;
        this.E = g6Var.E;
        this.F = g6Var.F;
        this.G = g6Var.G;
        this.H = g6Var.H;
        this.I = g6Var.I;
        this.J = g6Var.J;
        this.K = g6Var.K;
        this.L = g6Var.L;
        this.M = g6Var.M;
        this.N = g6Var.N;
        this.O = g6Var.O;
        this.P = g6Var.P;
        this.Q = g6Var.Q;
        this.R = g6Var.R;
        this.S = g6Var.S;
        this.T = g6Var.T;
        this.U = g6Var.U;
        this.V = g6Var.V;
        this.W = g6Var.W;
        this.X = g6Var.X;
        this.Y = g6Var.Y;
        this.Z = g6Var.Z;
        this.f20429a0 = g6Var.f20429a0;
        this.f20431b0 = g6Var.f20431b0;
        this.f20433c0 = g6Var.f20433c0;
        this.f20438f0 = g6Var.f20438f0;
        this.f20439g0 = g6Var.f20439g0;
        this.f20440h0 = g6Var.f20440h0;
        this.f20441i0 = g6Var.f20441i0;
    }
}
