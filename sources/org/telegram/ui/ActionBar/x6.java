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
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.x9;
public final class x6 implements NotificationCenter.NotificationCenterDelegate {
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
    public String f23251a;
    public SparseArray f23252a0;
    public String f23253b;
    public ArrayList f23254b0;
    public String f23255c;
    public LongSparseArray f23256c0;
    public String d;
    public final LongSparseArray f23257d0;
    public String e;
    public int f23258e0;
    public boolean f23259f;
    public int f23260f0;
    public String f23261g0;
    public boolean h;
    public String f23262h0;
    public r6 f23263i0;
    public int f23264j0;
    public boolean f23265n;
    public int f23266r;
    public int f23267s;
    public int v;
    public int f23268w;
    public int f23269x;
    public int f23270y;

    public x6() {
        this.f23269x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f23257d0 = new LongSparseArray();
        this.f23258e0 = 0;
        this.f23260f0 = 100;
        this.f23264j0 = -1;
    }

    public static boolean a(w6 w6Var, TLRPC.ThemeSettings themeSettings) {
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
            i14 = y6.Z0(wallPaperSettings.background_color);
            int i16 = themeSettings.wallpaper.settings.second_background_color;
            j12 = 4294967296L;
            if (i16 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = y6.Z0(i16);
            }
            int i17 = themeSettings.wallpaper.settings.third_background_color;
            if (i17 == 0) {
                j11 = 4294967296L;
            } else {
                j11 = y6.Z0(i17);
            }
            int i18 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i18 != 0) {
                j12 = y6.Z0(i18);
            }
            i15 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f7 = wallPaper2.settings.intensity / 100.0f;
                long j13 = j11;
                if (themeSettings.accent_color != w6Var.f23217c && themeSettings.outbox_accent_color == w6Var.d && i10 == w6Var.e && i11 == w6Var.f23218f && i12 == w6Var.f23219g && i13 == w6Var.h && themeSettings.message_colors_animated == w6Var.f23220i && i14 == w6Var.f23221j && j10 == w6Var.f23222k && j13 == w6Var.f23223l && j12 == w6Var.f23224m && i15 == w6Var.f23225n && TextUtils.equals(str, w6Var.f23226o) && Math.abs(f7 - w6Var.f23227p) < 0.001d) {
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
        if (themeSettings.accent_color != w6Var.f23217c) {
        }
        return z10;
    }

    public static void b(x6 x6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        x6Var.W = iArr.length;
        x6Var.f23254b0 = new ArrayList();
        x6Var.f23252a0 = new SparseArray();
        x6Var.f23256c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            w6 w6Var = new w6();
            w6Var.f23215a = iArr8[i10];
            if (y6.j1(w6Var)) {
                w6Var.f23236z = true;
            }
            w6Var.f23217c = iArr[i10];
            w6Var.f23216b = x6Var;
            w6Var.e = iArr2[i10];
            w6Var.f23218f = iArr3[i10];
            long j10 = iArr4[i10];
            w6Var.f23221j = j10;
            boolean z10 = x6Var.S;
            if (z10 && w6Var.f23215a == y6.f23533n) {
                w6Var.f23221j = 4294967296L;
            } else {
                w6Var.f23221j = j10;
            }
            if (z10 && w6Var.f23215a == y6.f23533n) {
                w6Var.f23222k = 4294967296L;
            } else {
                w6Var.f23222k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && w6Var.f23215a == y6.f23533n) {
                    w6Var.f23223l = 4294967296L;
                } else {
                    w6Var.f23223l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && w6Var.f23215a == y6.f23533n) {
                    w6Var.f23224m = 4294967296L;
                } else {
                    w6Var.f23224m = iArr7[i10];
                }
            }
            w6Var.f23227p = iArr10[i10] / 100.0f;
            w6Var.f23225n = iArr9[i10];
            w6Var.f23226o = strArr[i10];
            if ((y6.j1(w6Var) && x6Var.f23251a.equals("Dark Blue")) || x6Var.f23251a.equals("Night")) {
                w6Var.e = -14316059;
                w6Var.f23218f = -12422433;
                w6Var.f23219g = -8304937;
                w6Var.h = -6340950;
                if (x6Var.f23251a.equals("Night")) {
                    w6Var.f23227p = -0.57f;
                    w6Var.f23221j = -9666650L;
                    w6Var.f23222k = -13749173L;
                    w6Var.f23223l = -8883033L;
                    w6Var.f23224m = -13421992L;
                }
            }
            x6Var.f23252a0.put(w6Var.f23215a, w6Var);
            x6Var.f23254b0.add(w6Var);
        }
        x6Var.X = ((w6) x6Var.f23252a0.get(0)).f23217c;
    }

    public static void c(x6 x6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = x6Var.f23254b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = x6Var.f23254b0.size();
            for (int i10 = 0; i10 < size; i10++) {
                w6 w6Var = (w6) x6Var.f23254b0.get(i10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(x6Var.f23251a);
                sb2.append("_");
                x6Var.r(sharedPreferences, w6Var, a1.g.n(w6Var.f23215a, "_owp", sb2));
            }
            return;
        }
        x6Var.r(sharedPreferences, null, a1.g.s(new StringBuilder(), x6Var.f23251a, "_owp"));
    }

    public static x6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            x6 x6Var = new x6();
            x6Var.f23251a = jSONObject.getString("name");
            x6Var.f23253b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                x6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                x6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                x6Var.G = jSONObject.getBoolean("loaded");
            }
            return x6Var;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static x6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        x6 x6Var = new x6();
        x6Var.f23251a = split[0];
        x6Var.f23253b = split[1];
        return x6Var;
    }

    public static void i(w6 w6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i14;
        w6Var.f23217c = themeSettings.accent_color;
        w6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i10 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        w6Var.e = i10;
        if (themeSettings.message_colors.size() > 1) {
            i11 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        w6Var.f23218f = i11;
        if (w6Var.e == i11) {
            w6Var.f23218f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        w6Var.f23219g = i12;
        if (themeSettings.message_colors.size() > 3) {
            i13 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i13 = 0;
        }
        w6Var.h = i13;
        w6Var.f23220i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            if (wallPaperSettings.background_color == 0) {
                w6Var.f23221j = 4294967296L;
            } else {
                w6Var.f23221j = y6.Z0(i14);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                w6Var.f23222k = 4294967296L;
            } else {
                w6Var.f23222k = y6.Z0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                w6Var.f23223l = 4294967296L;
            } else {
                w6Var.f23223l = y6.Z0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                w6Var.f23224m = 4294967296L;
            } else {
                w6Var.f23224m = y6.Z0(wallPaperSettings4.fourth_background_color);
            }
            w6Var.f23225n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                w6Var.f23226o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                w6Var.f23227p = wallPaperSettings5.intensity / 100.0f;
                w6Var.f23228q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f23266r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = uc0.g(this.f23266r, this.f23267s, i10, this.f23268w);
                } else {
                    int i11 = this.f23267s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f23266r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(x9.d(this.f23269x), new int[]{this.f23266r, this.f23267s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.f23266r);
                        canvas.drawColor(this.f23266r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.f23270y / 100.0f) * 255.0f));
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
                if (str.equals(this.f23261g0)) {
                    this.f23261g0 = null;
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.m0(9, this, (File) objArr[1]));
                } else if (str.equals(FileLoader.getAttachFileName(this.F.document))) {
                    t();
                    if (i10 == i12) {
                        File file = new File(this.f23253b);
                        TLRPC.TL_theme tL_theme2 = this.F;
                        x6 l02 = y6.l0(file, tL_theme2.title, tL_theme2);
                        if (l02 != null && l02.f23255c != null && !new File(l02.f23255c).exists()) {
                            this.f23266r = l02.f23266r;
                            this.f23267s = l02.f23267s;
                            this.v = l02.v;
                            this.f23268w = l02.f23268w;
                            this.f23269x = l02.f23269x;
                            this.h = l02.h;
                            this.f23270y = l02.f23270y;
                            this.f23262h0 = l02.f23255c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = l02.e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(l02.E).sendRequest(getwallpaper, new bi.j(29, this, l02));
                            return;
                        }
                        s();
                    }
                }
            }
        }
    }

    public final w6 e(long j10, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.f23257d0;
            w6 w6Var = (w6) longSparseArray.get(j10);
            if (w6Var != null) {
                return w6Var;
            }
            int i11 = this.f23258e0 + 1;
            this.f23258e0 = i11;
            w6 w6Var2 = new w6();
            i(w6Var2, themeSettings);
            w6Var2.f23216b = this;
            w6Var2.f23215a = i11;
            w6Var2.f23229r = tL_theme;
            w6Var2.f23231t = i10;
            longSparseArray.put(i11, w6Var2);
            return w6Var2;
        }
        w6 w6Var3 = (w6) this.f23256c0.get(j10);
        if (w6Var3 != null) {
            return w6Var3;
        }
        int i12 = this.f23260f0 + 1;
        this.f23260f0 = i12;
        w6 w6Var4 = new w6();
        i(w6Var4, themeSettings);
        w6Var4.f23216b = this;
        w6Var4.f23215a = i12;
        w6Var4.f23229r = tL_theme;
        w6Var4.f23231t = i10;
        this.f23252a0.put(i12, w6Var4);
        this.f23254b0.add(0, w6Var4);
        y6.G1(this);
        this.f23256c0.put(j10, w6Var4);
        return w6Var4;
    }

    public final w6 f(TLRPC.TL_theme tL_theme, int i10, int i11) {
        TLRPC.ThemeSettings themeSettings = null;
        if (tL_theme == null) {
            return null;
        }
        if (i11 < tL_theme.settings.size()) {
            themeSettings = tL_theme.settings.get(i11);
        }
        return e(tL_theme.f22166id, themeSettings, tL_theme, i10, false);
    }

    public final String j(w6 w6Var, boolean z10) {
        String s10;
        String n10;
        if (w6Var == null) {
            w6Var = k(false);
        }
        if (w6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f23251a);
                sb3.append("_");
                n10 = a1.g.n(w6Var.f23215a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f23251a);
                sb4.append("_");
                n10 = a1.g.n(w6Var.f23215a, "_wp", sb4);
            }
            sb2.append(n10);
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            s10 = a1.g.s(new StringBuilder(), this.f23251a, "_wp_o");
        } else {
            s10 = a1.g.s(new StringBuilder(), this.f23251a, "_wp");
        }
        sb5.append(s10);
        sb5.append(Utilities.random.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final w6 k(boolean z10) {
        w6 w6Var;
        if (this.f23254b0 == null || (w6Var = (w6) this.f23252a0.get(this.Y)) == null) {
            return null;
        }
        if (z10) {
            int i10 = this.f23260f0 + 1;
            this.f23260f0 = i10;
            w6 w6Var2 = new w6();
            w6Var2.f23217c = w6Var.f23217c;
            w6Var2.d = w6Var.d;
            w6Var2.e = w6Var.e;
            w6Var2.f23218f = w6Var.f23218f;
            w6Var2.f23219g = w6Var.f23219g;
            w6Var2.h = w6Var.h;
            w6Var2.f23220i = w6Var.f23220i;
            w6Var2.f23221j = w6Var.f23221j;
            w6Var2.f23222k = w6Var.f23222k;
            w6Var2.f23223l = w6Var.f23223l;
            w6Var2.f23224m = w6Var.f23224m;
            w6Var2.f23225n = w6Var.f23225n;
            w6Var2.f23226o = w6Var.f23226o;
            w6Var2.f23227p = w6Var.f23227p;
            w6Var2.f23228q = w6Var.f23228q;
            w6Var2.f23216b = this;
            r6 r6Var = this.f23263i0;
            if (r6Var != null) {
                ?? obj = new Object();
                obj.f23050a = "";
                obj.f23051b = "";
                obj.f23052c = "";
                obj.f23052c = r6Var.f23052c;
                obj.d = r6Var.d;
                obj.e = r6Var.e;
                obj.f23053f = r6Var.f23053f;
                obj.f23054g = r6Var.f23054g;
                obj.h = r6Var.h;
                obj.f23055i = r6Var.f23055i;
                obj.f23056j = r6Var.f23056j;
                obj.f23057k = r6Var.f23057k;
                obj.f23062p = this;
                obj.f23063q = w6Var2;
                if (!TextUtils.isEmpty(r6Var.f23050a)) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), r6Var.f23050a);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String j10 = obj.f23062p.j(obj.f23063q, false);
                        obj.f23050a = j10;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, j10));
                    } catch (Exception e) {
                        obj.f23050a = "";
                        FileLog.e(e);
                    }
                } else {
                    obj.f23050a = "";
                }
                if (!TextUtils.isEmpty(r6Var.f23051b)) {
                    if (!r6Var.f23051b.equals(r6Var.f23050a)) {
                        try {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), r6Var.f23051b);
                            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                            String j11 = obj.f23062p.j(obj.f23063q, true);
                            obj.f23051b = j11;
                            AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j11));
                        } catch (Exception e10) {
                            obj.f23051b = "";
                            FileLog.e(e10);
                        }
                    } else {
                        obj.f23051b = obj.f23050a;
                    }
                } else {
                    obj.f23051b = "";
                }
                w6Var2.f23235y = obj;
            }
            this.Z = this.Y;
            w6Var2.f23215a = i10;
            this.Y = i10;
            this.f23263i0 = w6Var2.f23235y;
            this.f23252a0.put(i10, w6Var2);
            this.f23254b0.add(0, w6Var2);
            y6.G1(this);
            return w6Var2;
        }
        return w6Var;
    }

    public final int l(int i10) {
        w6 w6Var = (w6) this.f23252a0.get(i10);
        if (w6Var != null) {
            return w6Var.f23217c;
        }
        return 0;
    }

    public final String m() {
        if (this.F != null) {
            return "remote" + this.F.f22166id;
        }
        return this.f23251a;
    }

    public final String n() {
        if ("Blue".equals(this.f23251a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.f23251a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.f23251a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.f23251a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.f23251a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.F;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f23251a;
    }

    public final int o() {
        if (this.S && this.Y == y6.f23533n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == y6.f23533n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i10 = this.f23264j0;
        if (i10 != -1) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f23251a) && !"Night".equals(this.f23251a)) {
            if ("Blue".equals(this.f23251a) || "Arctic Blue".equals(this.f23251a) || "Day".equals(this.f23251a)) {
                this.f23264j0 = 0;
            }
        } else {
            this.f23264j0 = 1;
        }
        if (this.f23264j0 == -1) {
            y6.G(y6.S0(new File(this.f23253b), null, new String[1]), this);
        }
        if (this.f23264j0 != 1) {
            return false;
        }
        return true;
    }

    public final void r(SharedPreferences sharedPreferences, w6 w6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                r6 r6Var = new r6();
                r6Var.f23050a = jSONObject.getString("wall");
                r6Var.f23051b = jSONObject.getString("owall");
                r6Var.d = jSONObject.getInt("pColor");
                r6Var.e = jSONObject.getInt("pGrColor");
                r6Var.f23053f = jSONObject.optInt("pGrColor2");
                r6Var.f23054g = jSONObject.optInt("pGrColor3");
                r6Var.h = jSONObject.getInt("pGrAngle");
                r6Var.f23052c = jSONObject.getString("wallSlug");
                r6Var.f23055i = jSONObject.getBoolean("wBlur");
                r6Var.f23056j = jSONObject.getBoolean("wMotion");
                r6Var.f23057k = (float) jSONObject.getDouble("pIntensity");
                r6Var.f23062p = this;
                r6Var.f23063q = w6Var;
                if (w6Var != null) {
                    w6Var.f23235y = r6Var;
                } else {
                    this.f23263i0 = r6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    r6Var.f23052c = "d";
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void s() {
        boolean z10 = true;
        this.G = true;
        this.T = false;
        y6.v1(true, false);
        if (this == y6.I && y6.M == null) {
            if (this != y6.J) {
                z10 = false;
            }
            y6.H1(this, z10, -1, null);
        }
    }

    public final void t() {
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.fileLoadFailed);
    }

    public final void u(int i10) {
        this.Y = i10;
        w6 k10 = k(false);
        if (k10 != null) {
            this.f23263i0 = k10.f23235y;
        }
    }

    public final void v(r6 r6Var) {
        if (this.f23263i0 != r6Var) {
            w6 k10 = k(false);
            r6 r6Var2 = this.f23263i0;
            if (r6Var2 != null) {
                r6.a(r6Var2);
            }
            if (r6Var != null) {
                r6Var.f23063q = k10;
                r6Var.f23062p = this;
                r6Var.c();
            }
            this.f23263i0 = r6Var;
            if (k10 != null) {
                k10.f23235y = r6Var;
            }
        }
    }

    public x6(x6 x6Var) {
        this.f23269x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f23257d0 = new LongSparseArray();
        this.f23258e0 = 0;
        this.f23260f0 = 100;
        this.f23264j0 = -1;
        this.f23251a = x6Var.f23251a;
        this.f23253b = x6Var.f23253b;
        this.f23255c = x6Var.f23255c;
        this.d = x6Var.d;
        this.e = x6Var.e;
        this.f23259f = x6Var.f23259f;
        this.h = x6Var.h;
        this.f23265n = x6Var.f23265n;
        this.f23266r = x6Var.f23266r;
        this.f23267s = x6Var.f23267s;
        this.v = x6Var.v;
        this.f23268w = x6Var.f23268w;
        this.f23269x = x6Var.f23269x;
        this.f23270y = x6Var.f23270y;
        this.E = x6Var.E;
        this.F = x6Var.F;
        this.G = x6Var.G;
        this.H = x6Var.H;
        this.I = x6Var.I;
        this.J = x6Var.J;
        this.K = x6Var.K;
        this.L = x6Var.L;
        this.M = x6Var.M;
        this.N = x6Var.N;
        this.O = x6Var.O;
        this.P = x6Var.P;
        this.Q = x6Var.Q;
        this.R = x6Var.R;
        this.S = x6Var.S;
        this.T = x6Var.T;
        this.U = x6Var.U;
        this.V = x6Var.V;
        this.W = x6Var.W;
        this.X = x6Var.X;
        this.Y = x6Var.Y;
        this.Z = x6Var.Z;
        this.f23252a0 = x6Var.f23252a0;
        this.f23254b0 = x6Var.f23254b0;
        this.f23256c0 = x6Var.f23256c0;
        this.f23260f0 = x6Var.f23260f0;
        this.f23261g0 = x6Var.f23261g0;
        this.f23262h0 = x6Var.f23262h0;
        this.f23263i0 = x6Var.f23263i0;
    }
}
