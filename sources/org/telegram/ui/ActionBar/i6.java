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
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.v9;
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
    public String f18941a;
    public SparseArray f18942a0;
    public String f18943b;
    public ArrayList f18944b0;
    public String f18945c;
    public LongSparseArray f18946c0;
    public String d;
    public final LongSparseArray f18947d0;
    public String e;
    public int f18948e0;
    public boolean f18949f;
    public int f18950f0;
    public String f18951g0;
    public boolean h;
    public String f18952h0;
    public b6 f18953i0;
    public int f18954j0;
    public boolean f18955n;
    public int f18956r;
    public int f18957s;
    public int v;
    public int f18958w;
    public int f18959x;
    public int f18960y;

    public i6() {
        this.f18959x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f18947d0 = new LongSparseArray();
        this.f18948e0 = 0;
        this.f18950f0 = 100;
        this.f18954j0 = -1;
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
                if (themeSettings.accent_color != g6Var.f18879c && themeSettings.outbox_accent_color == g6Var.d && i10 == g6Var.e && i11 == g6Var.f18880f && i12 == g6Var.f18881g && i13 == g6Var.h && themeSettings.message_colors_animated == g6Var.f18882i && i14 == g6Var.f18883j && j3 == g6Var.f18884k && j12 == g6Var.f18885l && j11 == g6Var.f18886m && i15 == g6Var.f18887n && TextUtils.equals(str, g6Var.f18888o) && Math.abs(f7 - g6Var.f18889p) < 0.001d) {
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
        if (themeSettings.accent_color != g6Var.f18879c) {
        }
        return z10;
    }

    public static void b(i6 i6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        i6Var.W = iArr.length;
        i6Var.f18944b0 = new ArrayList();
        i6Var.f18942a0 = new SparseArray();
        i6Var.f18946c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            g6 g6Var = new g6();
            g6Var.f18877a = iArr8[i10];
            if (j6.g1(g6Var)) {
                g6Var.f18898z = true;
            }
            g6Var.f18879c = iArr[i10];
            g6Var.f18878b = i6Var;
            g6Var.e = iArr2[i10];
            g6Var.f18880f = iArr3[i10];
            long j3 = iArr4[i10];
            g6Var.f18883j = j3;
            boolean z10 = i6Var.S;
            if (z10 && g6Var.f18877a == j6.f19240n) {
                g6Var.f18883j = 4294967296L;
            } else {
                g6Var.f18883j = j3;
            }
            if (z10 && g6Var.f18877a == j6.f19240n) {
                g6Var.f18884k = 4294967296L;
            } else {
                g6Var.f18884k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && g6Var.f18877a == j6.f19240n) {
                    g6Var.f18885l = 4294967296L;
                } else {
                    g6Var.f18885l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && g6Var.f18877a == j6.f19240n) {
                    g6Var.f18886m = 4294967296L;
                } else {
                    g6Var.f18886m = iArr7[i10];
                }
            }
            g6Var.f18889p = iArr10[i10] / 100.0f;
            g6Var.f18887n = iArr9[i10];
            g6Var.f18888o = strArr[i10];
            if ((j6.g1(g6Var) && i6Var.f18941a.equals("Dark Blue")) || i6Var.f18941a.equals("Night")) {
                g6Var.e = -14316059;
                g6Var.f18880f = -12422433;
                g6Var.f18881g = -8304937;
                g6Var.h = -6340950;
                if (i6Var.f18941a.equals("Night")) {
                    g6Var.f18889p = -0.57f;
                    g6Var.f18883j = -9666650L;
                    g6Var.f18884k = -13749173L;
                    g6Var.f18885l = -8883033L;
                    g6Var.f18886m = -13421992L;
                }
            }
            i6Var.f18942a0.put(g6Var.f18877a, g6Var);
            i6Var.f18944b0.add(g6Var);
        }
        i6Var.X = ((g6) i6Var.f18942a0.get(0)).f18879c;
    }

    public static void c(i6 i6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = i6Var.f18944b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = i6Var.f18944b0.size();
            for (int i10 = 0; i10 < size; i10++) {
                g6 g6Var = (g6) i6Var.f18944b0.get(i10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i6Var.f18941a);
                sb2.append("_");
                i6Var.r(sharedPreferences, g6Var, a4.a.n(g6Var.f18877a, "_owp", sb2));
            }
            return;
        }
        i6Var.r(sharedPreferences, null, a4.a.s(new StringBuilder(), i6Var.f18941a, "_owp"));
    }

    public static i6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            i6 i6Var = new i6();
            i6Var.f18941a = jSONObject.getString("name");
            i6Var.f18943b = jSONObject.getString("path");
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
        i6Var.f18941a = split[0];
        i6Var.f18943b = split[1];
        return i6Var;
    }

    public static void i(g6 g6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        g6Var.f18879c = themeSettings.accent_color;
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
        g6Var.f18880f = i11;
        if (g6Var.e == i11) {
            g6Var.f18880f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        g6Var.f18881g = i12;
        if (themeSettings.message_colors.size() > 3) {
            i13 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i13 = 0;
        }
        g6Var.h = i13;
        g6Var.f18882i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            int i14 = wallPaperSettings.background_color;
            if (i14 == 0) {
                g6Var.f18883j = 4294967296L;
            } else {
                g6Var.f18883j = j6.X0(i14);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                g6Var.f18884k = 4294967296L;
            } else {
                g6Var.f18884k = j6.X0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                g6Var.f18885l = 4294967296L;
            } else {
                g6Var.f18885l = j6.X0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                g6Var.f18886m = 4294967296L;
            } else {
                g6Var.f18886m = j6.X0(wallPaperSettings4.fourth_background_color);
            }
            g6Var.f18887n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                g6Var.f18888o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                g6Var.f18889p = wallPaperSettings5.intensity / 100.0f;
                g6Var.f18890q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f18956r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = lc0.g(this.f18956r, this.f18957s, i10, this.f18958w);
                } else {
                    int i11 = this.f18957s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f18956r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(v9.d(this.f18959x), new int[]{this.f18956r, this.f18957s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.f18956r);
                        canvas.drawColor(this.f18956r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.f18960y / 100.0f) * 255.0f));
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
                if (str.equals(this.f18951g0)) {
                    this.f18951g0 = null;
                    Utilities.globalQueue.postRunnable(new h6(0, this, (File) objArr[1]));
                } else if (str.equals(FileLoader.getAttachFileName(this.F.document))) {
                    t();
                    if (i10 == i12) {
                        File file = new File(this.f18943b);
                        TLRPC.TL_theme tL_theme2 = this.F;
                        i6 k02 = j6.k0(file, tL_theme2.title, tL_theme2);
                        if (k02 != null && k02.f18945c != null && !new File(k02.f18945c).exists()) {
                            this.f18956r = k02.f18956r;
                            this.f18957s = k02.f18957s;
                            this.v = k02.v;
                            this.f18958w = k02.f18958w;
                            this.f18959x = k02.f18959x;
                            this.h = k02.h;
                            this.f18960y = k02.f18960y;
                            this.f18952h0 = k02.f18945c;
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
            LongSparseArray longSparseArray = this.f18947d0;
            g6 g6Var = (g6) longSparseArray.get(j3);
            if (g6Var != null) {
                return g6Var;
            }
            int i11 = this.f18948e0 + 1;
            this.f18948e0 = i11;
            g6 g6Var2 = new g6();
            i(g6Var2, themeSettings);
            g6Var2.f18878b = this;
            g6Var2.f18877a = i11;
            g6Var2.f18891r = tL_theme;
            g6Var2.f18893t = i10;
            longSparseArray.put(i11, g6Var2);
            return g6Var2;
        }
        g6 g6Var3 = (g6) this.f18946c0.get(j3);
        if (g6Var3 != null) {
            return g6Var3;
        }
        int i12 = this.f18950f0 + 1;
        this.f18950f0 = i12;
        g6 g6Var4 = new g6();
        i(g6Var4, themeSettings);
        g6Var4.f18878b = this;
        g6Var4.f18877a = i12;
        g6Var4.f18891r = tL_theme;
        g6Var4.f18893t = i10;
        this.f18942a0.put(i12, g6Var4);
        this.f18944b0.add(0, g6Var4);
        j6.D1(this);
        this.f18946c0.put(j3, g6Var4);
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
        return e(tL_theme.f18433id, themeSettings, tL_theme, i10, false);
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
                sb3.append(this.f18941a);
                sb3.append("_");
                n10 = a4.a.n(g6Var.f18877a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f18941a);
                sb4.append("_");
                n10 = a4.a.n(g6Var.f18877a, "_wp", sb4);
            }
            sb2.append(n10);
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            s10 = a4.a.s(new StringBuilder(), this.f18941a, "_wp_o");
        } else {
            s10 = a4.a.s(new StringBuilder(), this.f18941a, "_wp");
        }
        sb5.append(s10);
        sb5.append(Utilities.random.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final g6 k(boolean z10) {
        g6 g6Var;
        if (this.f18944b0 == null || (g6Var = (g6) this.f18942a0.get(this.Y)) == null) {
            return null;
        }
        if (z10) {
            int i10 = this.f18950f0 + 1;
            this.f18950f0 = i10;
            g6 g6Var2 = new g6();
            g6Var2.f18879c = g6Var.f18879c;
            g6Var2.d = g6Var.d;
            g6Var2.e = g6Var.e;
            g6Var2.f18880f = g6Var.f18880f;
            g6Var2.f18881g = g6Var.f18881g;
            g6Var2.h = g6Var.h;
            g6Var2.f18882i = g6Var.f18882i;
            g6Var2.f18883j = g6Var.f18883j;
            g6Var2.f18884k = g6Var.f18884k;
            g6Var2.f18885l = g6Var.f18885l;
            g6Var2.f18886m = g6Var.f18886m;
            g6Var2.f18887n = g6Var.f18887n;
            g6Var2.f18888o = g6Var.f18888o;
            g6Var2.f18889p = g6Var.f18889p;
            g6Var2.f18890q = g6Var.f18890q;
            g6Var2.f18878b = this;
            b6 b6Var = this.f18953i0;
            if (b6Var != null) {
                ?? obj = new Object();
                obj.f18693a = "";
                obj.f18694b = "";
                obj.f18695c = "";
                obj.f18695c = b6Var.f18695c;
                obj.d = b6Var.d;
                obj.e = b6Var.e;
                obj.f18696f = b6Var.f18696f;
                obj.f18697g = b6Var.f18697g;
                obj.h = b6Var.h;
                obj.f18698i = b6Var.f18698i;
                obj.f18699j = b6Var.f18699j;
                obj.f18700k = b6Var.f18700k;
                obj.f18705p = this;
                obj.f18706q = g6Var2;
                if (!TextUtils.isEmpty(b6Var.f18693a)) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18693a);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String j3 = obj.f18705p.j(obj.f18706q, false);
                        obj.f18693a = j3;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, j3));
                    } catch (Exception e) {
                        obj.f18693a = "";
                        FileLog.e(e);
                    }
                } else {
                    obj.f18693a = "";
                }
                if (!TextUtils.isEmpty(b6Var.f18694b)) {
                    if (!b6Var.f18694b.equals(b6Var.f18693a)) {
                        try {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18694b);
                            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                            String j10 = obj.f18705p.j(obj.f18706q, true);
                            obj.f18694b = j10;
                            AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j10));
                        } catch (Exception e7) {
                            obj.f18694b = "";
                            FileLog.e(e7);
                        }
                    } else {
                        obj.f18694b = obj.f18693a;
                    }
                } else {
                    obj.f18694b = "";
                }
                g6Var2.f18897y = obj;
            }
            this.Z = this.Y;
            g6Var2.f18877a = i10;
            this.Y = i10;
            this.f18953i0 = g6Var2.f18897y;
            this.f18942a0.put(i10, g6Var2);
            this.f18944b0.add(0, g6Var2);
            j6.D1(this);
            return g6Var2;
        }
        return g6Var;
    }

    public final int l(int i10) {
        g6 g6Var = (g6) this.f18942a0.get(i10);
        if (g6Var != null) {
            return g6Var.f18879c;
        }
        return 0;
    }

    public final String m() {
        if (this.F != null) {
            return "remote" + this.F.f18433id;
        }
        return this.f18941a;
    }

    public final String n() {
        if ("Blue".equals(this.f18941a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.f18941a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.f18941a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.f18941a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.f18941a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.F;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f18941a;
    }

    public final int o() {
        if (this.S && this.Y == j6.f19240n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == j6.f19240n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i10 = this.f18954j0;
        if (i10 != -1) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f18941a) && !"Night".equals(this.f18941a)) {
            if ("Blue".equals(this.f18941a) || "Arctic Blue".equals(this.f18941a) || "Day".equals(this.f18941a)) {
                this.f18954j0 = 0;
            }
        } else {
            this.f18954j0 = 1;
        }
        if (this.f18954j0 == -1) {
            j6.G(j6.Q0(new File(this.f18943b), null, new String[1]), this);
        }
        if (this.f18954j0 != 1) {
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
                b6Var.f18693a = jSONObject.getString("wall");
                b6Var.f18694b = jSONObject.getString("owall");
                b6Var.d = jSONObject.getInt("pColor");
                b6Var.e = jSONObject.getInt("pGrColor");
                b6Var.f18696f = jSONObject.optInt("pGrColor2");
                b6Var.f18697g = jSONObject.optInt("pGrColor3");
                b6Var.h = jSONObject.getInt("pGrAngle");
                b6Var.f18695c = jSONObject.getString("wallSlug");
                b6Var.f18698i = jSONObject.getBoolean("wBlur");
                b6Var.f18699j = jSONObject.getBoolean("wMotion");
                b6Var.f18700k = (float) jSONObject.getDouble("pIntensity");
                b6Var.f18705p = this;
                b6Var.f18706q = g6Var;
                if (g6Var != null) {
                    g6Var.f18897y = b6Var;
                } else {
                    this.f18953i0 = b6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    b6Var.f18695c = "d";
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
        g6 k10 = k(false);
        if (k10 != null) {
            this.f18953i0 = k10.f18897y;
        }
    }

    public final void v(b6 b6Var) {
        if (this.f18953i0 != b6Var) {
            g6 k10 = k(false);
            b6 b6Var2 = this.f18953i0;
            if (b6Var2 != null) {
                b6.a(b6Var2);
            }
            if (b6Var != null) {
                b6Var.f18706q = k10;
                b6Var.f18705p = this;
                b6Var.c();
            }
            this.f18953i0 = b6Var;
            if (k10 != null) {
                k10.f18897y = b6Var;
            }
        }
    }

    public i6(i6 i6Var) {
        this.f18959x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f18947d0 = new LongSparseArray();
        this.f18948e0 = 0;
        this.f18950f0 = 100;
        this.f18954j0 = -1;
        this.f18941a = i6Var.f18941a;
        this.f18943b = i6Var.f18943b;
        this.f18945c = i6Var.f18945c;
        this.d = i6Var.d;
        this.e = i6Var.e;
        this.f18949f = i6Var.f18949f;
        this.h = i6Var.h;
        this.f18955n = i6Var.f18955n;
        this.f18956r = i6Var.f18956r;
        this.f18957s = i6Var.f18957s;
        this.v = i6Var.v;
        this.f18958w = i6Var.f18958w;
        this.f18959x = i6Var.f18959x;
        this.f18960y = i6Var.f18960y;
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
        this.f18942a0 = i6Var.f18942a0;
        this.f18944b0 = i6Var.f18944b0;
        this.f18946c0 = i6Var.f18946c0;
        this.f18950f0 = i6Var.f18950f0;
        this.f18951g0 = i6Var.f18951g0;
        this.f18952h0 = i6Var.f18952h0;
        this.f18953i0 = i6Var.f18953i0;
    }
}
