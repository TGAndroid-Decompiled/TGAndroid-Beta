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
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.v9;
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
    public String f18933a;
    public SparseArray f18934a0;
    public String f18935b;
    public ArrayList f18936b0;
    public String f18937c;
    public LongSparseArray f18938c0;
    public String d;
    public final LongSparseArray f18939d0;
    public String e;
    public int f18940e0;
    public boolean f18941f;
    public int f18942f0;
    public String f18943g0;
    public boolean h;
    public String f18944h0;
    public z5 f18945i0;
    public int f18946j0;
    public boolean f18947n;
    public int f18948r;
    public int f18949s;
    public int v;
    public int f18950w;
    public int f18951x;
    public int f18952y;

    public g6() {
        this.f18951x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f18939d0 = new LongSparseArray();
        this.f18940e0 = 0;
        this.f18942f0 = 100;
        this.f18946j0 = -1;
    }

    public static boolean a(f6 f6Var, TLRPC.ThemeSettings themeSettings) {
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
            i14 = h6.X0(wallPaperSettings.background_color);
            int i16 = themeSettings.wallpaper.settings.second_background_color;
            j11 = 4294967296L;
            if (i16 == 0) {
                j3 = 4294967296L;
            } else {
                j3 = h6.X0(i16);
            }
            int i17 = themeSettings.wallpaper.settings.third_background_color;
            if (i17 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = h6.X0(i17);
            }
            int i18 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i18 != 0) {
                j11 = h6.X0(i18);
            }
            i15 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f7 = wallPaper2.settings.intensity / 100.0f;
                long j12 = j10;
                if (themeSettings.accent_color != f6Var.f18888c && themeSettings.outbox_accent_color == f6Var.d && i10 == f6Var.e && i11 == f6Var.f18889f && i12 == f6Var.f18890g && i13 == f6Var.h && themeSettings.message_colors_animated == f6Var.f18891i && i14 == f6Var.f18892j && j3 == f6Var.f18893k && j12 == f6Var.f18894l && j11 == f6Var.f18895m && i15 == f6Var.f18896n && TextUtils.equals(str, f6Var.f18897o) && Math.abs(f7 - f6Var.f18898p) < 0.001d) {
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
        if (themeSettings.accent_color != f6Var.f18888c) {
        }
        return z10;
    }

    public static void b(g6 g6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        g6Var.W = iArr.length;
        g6Var.f18936b0 = new ArrayList();
        g6Var.f18934a0 = new SparseArray();
        g6Var.f18938c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            f6 f6Var = new f6();
            f6Var.f18886a = iArr8[i10];
            if (h6.g1(f6Var)) {
                f6Var.f18907z = true;
            }
            f6Var.f18888c = iArr[i10];
            f6Var.f18887b = g6Var;
            f6Var.e = iArr2[i10];
            f6Var.f18889f = iArr3[i10];
            long j3 = iArr4[i10];
            f6Var.f18892j = j3;
            boolean z10 = g6Var.S;
            if (z10 && f6Var.f18886a == h6.f19237n) {
                f6Var.f18892j = 4294967296L;
            } else {
                f6Var.f18892j = j3;
            }
            if (z10 && f6Var.f18886a == h6.f19237n) {
                f6Var.f18893k = 4294967296L;
            } else {
                f6Var.f18893k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && f6Var.f18886a == h6.f19237n) {
                    f6Var.f18894l = 4294967296L;
                } else {
                    f6Var.f18894l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && f6Var.f18886a == h6.f19237n) {
                    f6Var.f18895m = 4294967296L;
                } else {
                    f6Var.f18895m = iArr7[i10];
                }
            }
            f6Var.f18898p = iArr10[i10] / 100.0f;
            f6Var.f18896n = iArr9[i10];
            f6Var.f18897o = strArr[i10];
            if ((h6.g1(f6Var) && g6Var.f18933a.equals("Dark Blue")) || g6Var.f18933a.equals("Night")) {
                f6Var.e = -14316059;
                f6Var.f18889f = -12422433;
                f6Var.f18890g = -8304937;
                f6Var.h = -6340950;
                if (g6Var.f18933a.equals("Night")) {
                    f6Var.f18898p = -0.57f;
                    f6Var.f18892j = -9666650L;
                    f6Var.f18893k = -13749173L;
                    f6Var.f18894l = -8883033L;
                    f6Var.f18895m = -13421992L;
                }
            }
            g6Var.f18934a0.put(f6Var.f18886a, f6Var);
            g6Var.f18936b0.add(f6Var);
        }
        g6Var.X = ((f6) g6Var.f18934a0.get(0)).f18888c;
    }

    public static void c(g6 g6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = g6Var.f18936b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = g6Var.f18936b0.size();
            for (int i10 = 0; i10 < size; i10++) {
                f6 f6Var = (f6) g6Var.f18936b0.get(i10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(g6Var.f18933a);
                sb2.append("_");
                g6Var.r(sharedPreferences, f6Var, a4.a.o(f6Var.f18886a, "_owp", sb2));
            }
            return;
        }
        g6Var.r(sharedPreferences, null, a4.a.t(new StringBuilder(), g6Var.f18933a, "_owp"));
    }

    public static g6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            g6 g6Var = new g6();
            g6Var.f18933a = jSONObject.getString("name");
            g6Var.f18935b = jSONObject.getString("path");
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
        g6Var.f18933a = split[0];
        g6Var.f18935b = split[1];
        return g6Var;
    }

    public static void i(f6 f6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        f6Var.f18888c = themeSettings.accent_color;
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
        f6Var.f18889f = i11;
        if (f6Var.e == i11) {
            f6Var.f18889f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        f6Var.f18890g = i12;
        if (themeSettings.message_colors.size() > 3) {
            i13 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i13 = 0;
        }
        f6Var.h = i13;
        f6Var.f18891i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            int i14 = wallPaperSettings.background_color;
            if (i14 == 0) {
                f6Var.f18892j = 4294967296L;
            } else {
                f6Var.f18892j = h6.X0(i14);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                f6Var.f18893k = 4294967296L;
            } else {
                f6Var.f18893k = h6.X0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                f6Var.f18894l = 4294967296L;
            } else {
                f6Var.f18894l = h6.X0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                f6Var.f18895m = 4294967296L;
            } else {
                f6Var.f18895m = h6.X0(wallPaperSettings4.fourth_background_color);
            }
            f6Var.f18896n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                f6Var.f18897o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                f6Var.f18898p = wallPaperSettings5.intensity / 100.0f;
                f6Var.f18899q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f18948r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = mc0.g(this.f18948r, this.f18949s, i10, this.f18950w);
                } else {
                    int i11 = this.f18949s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f18948r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(v9.d(this.f18951x), new int[]{this.f18948r, this.f18949s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.f18948r);
                        canvas.drawColor(this.f18948r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.f18952y / 100.0f) * 255.0f));
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
                if (str.equals(this.f18943g0)) {
                    this.f18943g0 = null;
                    Utilities.globalQueue.postRunnable(new a6(1, this, (File) objArr[1]));
                } else if (str.equals(FileLoader.getAttachFileName(this.F.document))) {
                    t();
                    if (i10 == i12) {
                        File file = new File(this.f18935b);
                        TLRPC.TL_theme tL_theme2 = this.F;
                        g6 k02 = h6.k0(file, tL_theme2.title, tL_theme2);
                        if (k02 != null && k02.f18937c != null && !new File(k02.f18937c).exists()) {
                            this.f18948r = k02.f18948r;
                            this.f18949s = k02.f18949s;
                            this.v = k02.v;
                            this.f18950w = k02.f18950w;
                            this.f18951x = k02.f18951x;
                            this.h = k02.h;
                            this.f18952y = k02.f18952y;
                            this.f18944h0 = k02.f18937c;
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

    public final f6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.f18939d0;
            f6 f6Var = (f6) longSparseArray.get(j3);
            if (f6Var != null) {
                return f6Var;
            }
            int i11 = this.f18940e0 + 1;
            this.f18940e0 = i11;
            f6 f6Var2 = new f6();
            i(f6Var2, themeSettings);
            f6Var2.f18887b = this;
            f6Var2.f18886a = i11;
            f6Var2.f18900r = tL_theme;
            f6Var2.f18902t = i10;
            longSparseArray.put(i11, f6Var2);
            return f6Var2;
        }
        f6 f6Var3 = (f6) this.f18938c0.get(j3);
        if (f6Var3 != null) {
            return f6Var3;
        }
        int i12 = this.f18942f0 + 1;
        this.f18942f0 = i12;
        f6 f6Var4 = new f6();
        i(f6Var4, themeSettings);
        f6Var4.f18887b = this;
        f6Var4.f18886a = i12;
        f6Var4.f18900r = tL_theme;
        f6Var4.f18902t = i10;
        this.f18934a0.put(i12, f6Var4);
        this.f18936b0.add(0, f6Var4);
        h6.D1(this);
        this.f18938c0.put(j3, f6Var4);
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
        return e(tL_theme.f18473id, themeSettings, tL_theme, i10, false);
    }

    public final String j(f6 f6Var, boolean z10) {
        String t10;
        String o9;
        if (f6Var == null) {
            f6Var = k(false);
        }
        if (f6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f18933a);
                sb3.append("_");
                o9 = a4.a.o(f6Var.f18886a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f18933a);
                sb4.append("_");
                o9 = a4.a.o(f6Var.f18886a, "_wp", sb4);
            }
            sb2.append(o9);
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            t10 = a4.a.t(new StringBuilder(), this.f18933a, "_wp_o");
        } else {
            t10 = a4.a.t(new StringBuilder(), this.f18933a, "_wp");
        }
        sb5.append(t10);
        sb5.append(Utilities.random.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final f6 k(boolean z10) {
        f6 f6Var;
        if (this.f18936b0 == null || (f6Var = (f6) this.f18934a0.get(this.Y)) == null) {
            return null;
        }
        if (z10) {
            int i10 = this.f18942f0 + 1;
            this.f18942f0 = i10;
            f6 f6Var2 = new f6();
            f6Var2.f18888c = f6Var.f18888c;
            f6Var2.d = f6Var.d;
            f6Var2.e = f6Var.e;
            f6Var2.f18889f = f6Var.f18889f;
            f6Var2.f18890g = f6Var.f18890g;
            f6Var2.h = f6Var.h;
            f6Var2.f18891i = f6Var.f18891i;
            f6Var2.f18892j = f6Var.f18892j;
            f6Var2.f18893k = f6Var.f18893k;
            f6Var2.f18894l = f6Var.f18894l;
            f6Var2.f18895m = f6Var.f18895m;
            f6Var2.f18896n = f6Var.f18896n;
            f6Var2.f18897o = f6Var.f18897o;
            f6Var2.f18898p = f6Var.f18898p;
            f6Var2.f18899q = f6Var.f18899q;
            f6Var2.f18887b = this;
            z5 z5Var = this.f18945i0;
            if (z5Var != null) {
                ?? obj = new Object();
                obj.f19959a = "";
                obj.f19960b = "";
                obj.f19961c = "";
                obj.f19961c = z5Var.f19961c;
                obj.d = z5Var.d;
                obj.e = z5Var.e;
                obj.f19962f = z5Var.f19962f;
                obj.f19963g = z5Var.f19963g;
                obj.h = z5Var.h;
                obj.f19964i = z5Var.f19964i;
                obj.f19965j = z5Var.f19965j;
                obj.f19966k = z5Var.f19966k;
                obj.f19971p = this;
                obj.f19972q = f6Var2;
                if (!TextUtils.isEmpty(z5Var.f19959a)) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), z5Var.f19959a);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String j3 = obj.f19971p.j(obj.f19972q, false);
                        obj.f19959a = j3;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, j3));
                    } catch (Exception e) {
                        obj.f19959a = "";
                        FileLog.e(e);
                    }
                } else {
                    obj.f19959a = "";
                }
                if (!TextUtils.isEmpty(z5Var.f19960b)) {
                    if (!z5Var.f19960b.equals(z5Var.f19959a)) {
                        try {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), z5Var.f19960b);
                            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                            String j10 = obj.f19971p.j(obj.f19972q, true);
                            obj.f19960b = j10;
                            AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j10));
                        } catch (Exception e7) {
                            obj.f19960b = "";
                            FileLog.e(e7);
                        }
                    } else {
                        obj.f19960b = obj.f19959a;
                    }
                } else {
                    obj.f19960b = "";
                }
                f6Var2.f18906y = obj;
            }
            this.Z = this.Y;
            f6Var2.f18886a = i10;
            this.Y = i10;
            this.f18945i0 = f6Var2.f18906y;
            this.f18934a0.put(i10, f6Var2);
            this.f18936b0.add(0, f6Var2);
            h6.D1(this);
            return f6Var2;
        }
        return f6Var;
    }

    public final int l(int i10) {
        f6 f6Var = (f6) this.f18934a0.get(i10);
        if (f6Var != null) {
            return f6Var.f18888c;
        }
        return 0;
    }

    public final String m() {
        if (this.F != null) {
            return "remote" + this.F.f18473id;
        }
        return this.f18933a;
    }

    public final String n() {
        if ("Blue".equals(this.f18933a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.f18933a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.f18933a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.f18933a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.f18933a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.F;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f18933a;
    }

    public final int o() {
        if (this.S && this.Y == h6.f19237n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == h6.f19237n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i10 = this.f18946j0;
        if (i10 != -1) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f18933a) && !"Night".equals(this.f18933a)) {
            if ("Blue".equals(this.f18933a) || "Arctic Blue".equals(this.f18933a) || "Day".equals(this.f18933a)) {
                this.f18946j0 = 0;
            }
        } else {
            this.f18946j0 = 1;
        }
        if (this.f18946j0 == -1) {
            h6.G(h6.Q0(new File(this.f18935b), null, new String[1]), this);
        }
        if (this.f18946j0 != 1) {
            return false;
        }
        return true;
    }

    public final void r(SharedPreferences sharedPreferences, f6 f6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                z5 z5Var = new z5();
                z5Var.f19959a = jSONObject.getString("wall");
                z5Var.f19960b = jSONObject.getString("owall");
                z5Var.d = jSONObject.getInt("pColor");
                z5Var.e = jSONObject.getInt("pGrColor");
                z5Var.f19962f = jSONObject.optInt("pGrColor2");
                z5Var.f19963g = jSONObject.optInt("pGrColor3");
                z5Var.h = jSONObject.getInt("pGrAngle");
                z5Var.f19961c = jSONObject.getString("wallSlug");
                z5Var.f19964i = jSONObject.getBoolean("wBlur");
                z5Var.f19965j = jSONObject.getBoolean("wMotion");
                z5Var.f19966k = (float) jSONObject.getDouble("pIntensity");
                z5Var.f19971p = this;
                z5Var.f19972q = f6Var;
                if (f6Var != null) {
                    f6Var.f18906y = z5Var;
                } else {
                    this.f18945i0 = z5Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    z5Var.f19961c = "d";
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
        h6.s1(true, false);
        if (this == h6.I && h6.M == null) {
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i10 = NotificationCenter.needSetDayNightTheme;
            if (this == h6.J) {
                z10 = true;
            } else {
                z10 = false;
            }
            globalInstance.lambda$postNotificationNameOnUIThread$1(i10, this, Boolean.valueOf(z10), null, -1, h6.ol);
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
            this.f18945i0 = k10.f18906y;
        }
    }

    public final void v(z5 z5Var) {
        if (this.f18945i0 != z5Var) {
            f6 k10 = k(false);
            z5 z5Var2 = this.f18945i0;
            if (z5Var2 != null) {
                z5.a(z5Var2);
            }
            if (z5Var != null) {
                z5Var.f19972q = k10;
                z5Var.f19971p = this;
                z5Var.c();
            }
            this.f18945i0 = z5Var;
            if (k10 != null) {
                k10.f18906y = z5Var;
            }
        }
    }

    public g6(g6 g6Var) {
        this.f18951x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f18939d0 = new LongSparseArray();
        this.f18940e0 = 0;
        this.f18942f0 = 100;
        this.f18946j0 = -1;
        this.f18933a = g6Var.f18933a;
        this.f18935b = g6Var.f18935b;
        this.f18937c = g6Var.f18937c;
        this.d = g6Var.d;
        this.e = g6Var.e;
        this.f18941f = g6Var.f18941f;
        this.h = g6Var.h;
        this.f18947n = g6Var.f18947n;
        this.f18948r = g6Var.f18948r;
        this.f18949s = g6Var.f18949s;
        this.v = g6Var.v;
        this.f18950w = g6Var.f18950w;
        this.f18951x = g6Var.f18951x;
        this.f18952y = g6Var.f18952y;
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
        this.f18934a0 = g6Var.f18934a0;
        this.f18936b0 = g6Var.f18936b0;
        this.f18938c0 = g6Var.f18938c0;
        this.f18942f0 = g6Var.f18942f0;
        this.f18943g0 = g6Var.f18943g0;
        this.f18944h0 = g6Var.f18944h0;
        this.f18945i0 = g6Var.f18945i0;
    }
}
