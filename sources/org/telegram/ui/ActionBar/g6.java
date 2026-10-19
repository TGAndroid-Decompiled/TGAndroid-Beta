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
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.wc0;
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
    public String f20880a;
    public SparseArray f20881a0;
    public String f20882b;
    public ArrayList f20883b0;
    public String f20884c;
    public LongSparseArray f20885c0;
    public String d;
    public final LongSparseArray f20886d0;
    public String e;
    public int f20887e0;
    public boolean f20888f;
    public int f20889f0;
    public String f20890g0;
    public boolean h;
    public String f20891h0;
    public a6 f20892i0;
    public int f20893j0;
    public boolean f20894n;
    public int f20895r;
    public int f20896s;
    public int v;
    public int f20897w;
    public int f20898x;
    public int f20899y;

    public g6() {
        this.f20898x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f20886d0 = new LongSparseArray();
        this.f20887e0 = 0;
        this.f20889f0 = 100;
        this.f20893j0 = -1;
    }

    public static boolean a(f6 f6Var, TLRPC.ThemeSettings themeSettings) {
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
            i14 = h6.Y0(wallPaperSettings.background_color);
            int i16 = themeSettings.wallpaper.settings.second_background_color;
            j12 = 4294967296L;
            if (i16 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = h6.Y0(i16);
            }
            int i17 = themeSettings.wallpaper.settings.third_background_color;
            if (i17 == 0) {
                j11 = 4294967296L;
            } else {
                j11 = h6.Y0(i17);
            }
            int i18 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i18 != 0) {
                j12 = h6.Y0(i18);
            }
            i15 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f7 = wallPaper2.settings.intensity / 100.0f;
                long j13 = j11;
                if (themeSettings.accent_color != f6Var.f20833c && themeSettings.outbox_accent_color == f6Var.d && i10 == f6Var.e && i11 == f6Var.f20834f && i12 == f6Var.f20835g && i13 == f6Var.h && themeSettings.message_colors_animated == f6Var.f20836i && i14 == f6Var.f20837j && j10 == f6Var.f20838k && j13 == f6Var.f20839l && j12 == f6Var.f20840m && i15 == f6Var.f20841n && TextUtils.equals(str, f6Var.f20842o) && Math.abs(f7 - f6Var.f20843p) < 0.001d) {
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
        if (themeSettings.accent_color != f6Var.f20833c) {
        }
        return z10;
    }

    public static void b(g6 g6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        g6Var.W = iArr.length;
        g6Var.f20883b0 = new ArrayList();
        g6Var.f20881a0 = new SparseArray();
        g6Var.f20885c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            f6 f6Var = new f6();
            f6Var.f20831a = iArr8[i10];
            if (h6.h1(f6Var)) {
                f6Var.f20852z = true;
            }
            f6Var.f20833c = iArr[i10];
            f6Var.f20832b = g6Var;
            f6Var.e = iArr2[i10];
            f6Var.f20834f = iArr3[i10];
            long j10 = iArr4[i10];
            f6Var.f20837j = j10;
            boolean z10 = g6Var.S;
            if (z10 && f6Var.f20831a == h6.f21165n) {
                f6Var.f20837j = 4294967296L;
            } else {
                f6Var.f20837j = j10;
            }
            if (z10 && f6Var.f20831a == h6.f21165n) {
                f6Var.f20838k = 4294967296L;
            } else {
                f6Var.f20838k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && f6Var.f20831a == h6.f21165n) {
                    f6Var.f20839l = 4294967296L;
                } else {
                    f6Var.f20839l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && f6Var.f20831a == h6.f21165n) {
                    f6Var.f20840m = 4294967296L;
                } else {
                    f6Var.f20840m = iArr7[i10];
                }
            }
            f6Var.f20843p = iArr10[i10] / 100.0f;
            f6Var.f20841n = iArr9[i10];
            f6Var.f20842o = strArr[i10];
            if ((h6.h1(f6Var) && g6Var.f20880a.equals("Dark Blue")) || g6Var.f20880a.equals("Night")) {
                f6Var.e = -14316059;
                f6Var.f20834f = -12422433;
                f6Var.f20835g = -8304937;
                f6Var.h = -6340950;
                if (g6Var.f20880a.equals("Night")) {
                    f6Var.f20843p = -0.57f;
                    f6Var.f20837j = -9666650L;
                    f6Var.f20838k = -13749173L;
                    f6Var.f20839l = -8883033L;
                    f6Var.f20840m = -13421992L;
                }
            }
            g6Var.f20881a0.put(f6Var.f20831a, f6Var);
            g6Var.f20883b0.add(f6Var);
        }
        g6Var.X = ((f6) g6Var.f20881a0.get(0)).f20833c;
    }

    public static void c(g6 g6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = g6Var.f20883b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = g6Var.f20883b0.size();
            for (int i10 = 0; i10 < size; i10++) {
                f6 f6Var = (f6) g6Var.f20883b0.get(i10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(g6Var.f20880a);
                sb2.append("_");
                g6Var.r(sharedPreferences, f6Var, a1.g.n(f6Var.f20831a, "_owp", sb2));
            }
            return;
        }
        g6Var.r(sharedPreferences, null, a1.g.s(new StringBuilder(), g6Var.f20880a, "_owp"));
    }

    public static g6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            g6 g6Var = new g6();
            g6Var.f20880a = jSONObject.getString("name");
            g6Var.f20882b = jSONObject.getString("path");
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
        } catch (Exception e) {
            FileLog.e(e);
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
        g6Var.f20880a = split[0];
        g6Var.f20882b = split[1];
        return g6Var;
    }

    public static void i(f6 f6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i14;
        f6Var.f20833c = themeSettings.accent_color;
        f6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i10 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        f6Var.e = i10;
        if (themeSettings.message_colors.size() > 1) {
            i11 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        f6Var.f20834f = i11;
        if (f6Var.e == i11) {
            f6Var.f20834f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        f6Var.f20835g = i12;
        if (themeSettings.message_colors.size() > 3) {
            i13 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i13 = 0;
        }
        f6Var.h = i13;
        f6Var.f20836i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            if (wallPaperSettings.background_color == 0) {
                f6Var.f20837j = 4294967296L;
            } else {
                f6Var.f20837j = h6.Y0(i14);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                f6Var.f20838k = 4294967296L;
            } else {
                f6Var.f20838k = h6.Y0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                f6Var.f20839l = 4294967296L;
            } else {
                f6Var.f20839l = h6.Y0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                f6Var.f20840m = 4294967296L;
            } else {
                f6Var.f20840m = h6.Y0(wallPaperSettings4.fourth_background_color);
            }
            f6Var.f20841n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                f6Var.f20842o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                f6Var.f20843p = wallPaperSettings5.intensity / 100.0f;
                f6Var.f20844q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f20895r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = wc0.g(this.f20895r, this.f20896s, i10, this.f20897w);
                } else {
                    int i11 = this.f20896s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f20895r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(v9.d(this.f20898x), new int[]{this.f20895r, this.f20896s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.f20895r);
                        canvas.drawColor(this.f20895r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.f20899y / 100.0f) * 255.0f));
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
                if (str.equals(this.f20890g0)) {
                    this.f20890g0 = null;
                    Utilities.globalQueue.postRunnable(new m4.z(28, this, (File) objArr[1]));
                } else if (str.equals(FileLoader.getAttachFileName(this.F.document))) {
                    t();
                    if (i10 == i12) {
                        File file = new File(this.f20882b);
                        TLRPC.TL_theme tL_theme2 = this.F;
                        g6 l02 = h6.l0(file, tL_theme2.title, tL_theme2);
                        if (l02 != null && l02.f20884c != null && !new File(l02.f20884c).exists()) {
                            this.f20895r = l02.f20895r;
                            this.f20896s = l02.f20896s;
                            this.v = l02.v;
                            this.f20897w = l02.f20897w;
                            this.f20898x = l02.f20898x;
                            this.h = l02.h;
                            this.f20899y = l02.f20899y;
                            this.f20891h0 = l02.f20884c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = l02.e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(l02.E).sendRequest(getwallpaper, new ai.g(28, this, l02));
                            return;
                        }
                        s();
                    }
                }
            }
        }
    }

    public final f6 e(long j10, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.f20886d0;
            f6 f6Var = (f6) longSparseArray.get(j10);
            if (f6Var != null) {
                return f6Var;
            }
            int i11 = this.f20887e0 + 1;
            this.f20887e0 = i11;
            f6 f6Var2 = new f6();
            i(f6Var2, themeSettings);
            f6Var2.f20832b = this;
            f6Var2.f20831a = i11;
            f6Var2.f20845r = tL_theme;
            f6Var2.f20847t = i10;
            longSparseArray.put(i11, f6Var2);
            return f6Var2;
        }
        f6 f6Var3 = (f6) this.f20885c0.get(j10);
        if (f6Var3 != null) {
            return f6Var3;
        }
        int i12 = this.f20889f0 + 1;
        this.f20889f0 = i12;
        f6 f6Var4 = new f6();
        i(f6Var4, themeSettings);
        f6Var4.f20832b = this;
        f6Var4.f20831a = i12;
        f6Var4.f20845r = tL_theme;
        f6Var4.f20847t = i10;
        this.f20881a0.put(i12, f6Var4);
        this.f20883b0.add(0, f6Var4);
        h6.E1(this);
        this.f20885c0.put(j10, f6Var4);
        return f6Var4;
    }

    public final f6 f(TLRPC.TL_theme tL_theme, int i10, int i11) {
        TLRPC.ThemeSettings themeSettings = null;
        if (tL_theme == null) {
            return null;
        }
        if (i11 < tL_theme.settings.size()) {
            themeSettings = tL_theme.settings.get(i11);
        }
        return e(tL_theme.f20412id, themeSettings, tL_theme, i10, false);
    }

    public final String j(f6 f6Var, boolean z10) {
        String s10;
        String n10;
        if (f6Var == null) {
            f6Var = k(false);
        }
        if (f6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f20880a);
                sb3.append("_");
                n10 = a1.g.n(f6Var.f20831a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f20880a);
                sb4.append("_");
                n10 = a1.g.n(f6Var.f20831a, "_wp", sb4);
            }
            sb2.append(n10);
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            s10 = a1.g.s(new StringBuilder(), this.f20880a, "_wp_o");
        } else {
            s10 = a1.g.s(new StringBuilder(), this.f20880a, "_wp");
        }
        sb5.append(s10);
        sb5.append(Utilities.random.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final f6 k(boolean z10) {
        f6 f6Var;
        if (this.f20883b0 == null || (f6Var = (f6) this.f20881a0.get(this.Y)) == null) {
            return null;
        }
        if (z10) {
            int i10 = this.f20889f0 + 1;
            this.f20889f0 = i10;
            f6 f6Var2 = new f6();
            f6Var2.f20833c = f6Var.f20833c;
            f6Var2.d = f6Var.d;
            f6Var2.e = f6Var.e;
            f6Var2.f20834f = f6Var.f20834f;
            f6Var2.f20835g = f6Var.f20835g;
            f6Var2.h = f6Var.h;
            f6Var2.f20836i = f6Var.f20836i;
            f6Var2.f20837j = f6Var.f20837j;
            f6Var2.f20838k = f6Var.f20838k;
            f6Var2.f20839l = f6Var.f20839l;
            f6Var2.f20840m = f6Var.f20840m;
            f6Var2.f20841n = f6Var.f20841n;
            f6Var2.f20842o = f6Var.f20842o;
            f6Var2.f20843p = f6Var.f20843p;
            f6Var2.f20844q = f6Var.f20844q;
            f6Var2.f20832b = this;
            a6 a6Var = this.f20892i0;
            if (a6Var != null) {
                ?? obj = new Object();
                obj.f20616a = "";
                obj.f20617b = "";
                obj.f20618c = "";
                obj.f20618c = a6Var.f20618c;
                obj.d = a6Var.d;
                obj.e = a6Var.e;
                obj.f20619f = a6Var.f20619f;
                obj.f20620g = a6Var.f20620g;
                obj.h = a6Var.h;
                obj.f20621i = a6Var.f20621i;
                obj.f20622j = a6Var.f20622j;
                obj.f20623k = a6Var.f20623k;
                obj.f20628p = this;
                obj.f20629q = f6Var2;
                if (!TextUtils.isEmpty(a6Var.f20616a)) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20616a);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String j10 = obj.f20628p.j(obj.f20629q, false);
                        obj.f20616a = j10;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, j10));
                    } catch (Exception e) {
                        obj.f20616a = "";
                        FileLog.e(e);
                    }
                } else {
                    obj.f20616a = "";
                }
                if (!TextUtils.isEmpty(a6Var.f20617b)) {
                    if (!a6Var.f20617b.equals(a6Var.f20616a)) {
                        try {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20617b);
                            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                            String j11 = obj.f20628p.j(obj.f20629q, true);
                            obj.f20617b = j11;
                            AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j11));
                        } catch (Exception e7) {
                            obj.f20617b = "";
                            FileLog.e(e7);
                        }
                    } else {
                        obj.f20617b = obj.f20616a;
                    }
                } else {
                    obj.f20617b = "";
                }
                f6Var2.f20851y = obj;
            }
            this.Z = this.Y;
            f6Var2.f20831a = i10;
            this.Y = i10;
            this.f20892i0 = f6Var2.f20851y;
            this.f20881a0.put(i10, f6Var2);
            this.f20883b0.add(0, f6Var2);
            h6.E1(this);
            return f6Var2;
        }
        return f6Var;
    }

    public final int l(int i10) {
        f6 f6Var = (f6) this.f20881a0.get(i10);
        if (f6Var != null) {
            return f6Var.f20833c;
        }
        return 0;
    }

    public final String m() {
        if (this.F != null) {
            return "remote" + this.F.f20412id;
        }
        return this.f20880a;
    }

    public final String n() {
        if ("Blue".equals(this.f20880a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.f20880a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.f20880a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.f20880a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.f20880a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.F;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f20880a;
    }

    public final int o() {
        if (this.S && this.Y == h6.f21165n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == h6.f21165n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i10 = this.f20893j0;
        if (i10 != -1) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f20880a) && !"Night".equals(this.f20880a)) {
            if ("Blue".equals(this.f20880a) || "Arctic Blue".equals(this.f20880a) || "Day".equals(this.f20880a)) {
                this.f20893j0 = 0;
            }
        } else {
            this.f20893j0 = 1;
        }
        if (this.f20893j0 == -1) {
            h6.G(h6.R0(new File(this.f20882b), null, new String[1]), this);
        }
        if (this.f20893j0 != 1) {
            return false;
        }
        return true;
    }

    public final void r(SharedPreferences sharedPreferences, f6 f6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                a6 a6Var = new a6();
                a6Var.f20616a = jSONObject.getString("wall");
                a6Var.f20617b = jSONObject.getString("owall");
                a6Var.d = jSONObject.getInt("pColor");
                a6Var.e = jSONObject.getInt("pGrColor");
                a6Var.f20619f = jSONObject.optInt("pGrColor2");
                a6Var.f20620g = jSONObject.optInt("pGrColor3");
                a6Var.h = jSONObject.getInt("pGrAngle");
                a6Var.f20618c = jSONObject.getString("wallSlug");
                a6Var.f20621i = jSONObject.getBoolean("wBlur");
                a6Var.f20622j = jSONObject.getBoolean("wMotion");
                a6Var.f20623k = (float) jSONObject.getDouble("pIntensity");
                a6Var.f20628p = this;
                a6Var.f20629q = f6Var;
                if (f6Var != null) {
                    f6Var.f20851y = a6Var;
                } else {
                    this.f20892i0 = a6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    a6Var.f20618c = "d";
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
        f6 k10 = k(false);
        if (k10 != null) {
            this.f20892i0 = k10.f20851y;
        }
    }

    public final void v(a6 a6Var) {
        if (this.f20892i0 != a6Var) {
            f6 k10 = k(false);
            a6 a6Var2 = this.f20892i0;
            if (a6Var2 != null) {
                a6.a(a6Var2);
            }
            if (a6Var != null) {
                a6Var.f20629q = k10;
                a6Var.f20628p = this;
                a6Var.c();
            }
            this.f20892i0 = a6Var;
            if (k10 != null) {
                k10.f20851y = a6Var;
            }
        }
    }

    public g6(g6 g6Var) {
        this.f20898x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f20886d0 = new LongSparseArray();
        this.f20887e0 = 0;
        this.f20889f0 = 100;
        this.f20893j0 = -1;
        this.f20880a = g6Var.f20880a;
        this.f20882b = g6Var.f20882b;
        this.f20884c = g6Var.f20884c;
        this.d = g6Var.d;
        this.e = g6Var.e;
        this.f20888f = g6Var.f20888f;
        this.h = g6Var.h;
        this.f20894n = g6Var.f20894n;
        this.f20895r = g6Var.f20895r;
        this.f20896s = g6Var.f20896s;
        this.v = g6Var.v;
        this.f20897w = g6Var.f20897w;
        this.f20898x = g6Var.f20898x;
        this.f20899y = g6Var.f20899y;
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
        this.f20881a0 = g6Var.f20881a0;
        this.f20883b0 = g6Var.f20883b0;
        this.f20885c0 = g6Var.f20885c0;
        this.f20889f0 = g6Var.f20889f0;
        this.f20890g0 = g6Var.f20890g0;
        this.f20891h0 = g6Var.f20891h0;
        this.f20892i0 = g6Var.f20892i0;
    }
}
