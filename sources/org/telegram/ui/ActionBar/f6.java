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
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.nb0;

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
        boolean z10;
        boolean z11;
        long jX0;
        long jX1;
        long jX2;
        String str;
        int iX0;
        int wallpaperRotation;
        float f10;
        TLRPC.WallPaperSettings wallPaperSettings;
        int iIntValue = themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
        int iIntValue2 = themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
        if (iIntValue == iIntValue2) {
            iIntValue2 = 0;
        }
        int iIntValue3 = themeSettings.message_colors.size() > 2 ? themeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
        int iIntValue4 = themeSettings.message_colors.size() > 3 ? (-16777216) | themeSettings.message_colors.get(3).intValue() : 0;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            iX0 = g6.X0(wallPaperSettings.background_color);
            int i10 = themeSettings.wallpaper.settings.second_background_color;
            jX0 = i10 == 0 ? 4294967296L : g6.X0(i10);
            int i11 = themeSettings.wallpaper.settings.third_background_color;
            jX1 = i11 == 0 ? 4294967296L : g6.X0(i11);
            int i12 = themeSettings.wallpaper.settings.fourth_background_color;
            jX2 = i12 != 0 ? g6.X0(i12) : 4294967296L;
            wallpaperRotation = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if ((wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) || !wallPaper2.pattern) {
                str = null;
            } else {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
            }
            return (themeSettings.accent_color != e6Var.f22885c && themeSettings.outbox_accent_color == e6Var.d && iIntValue == e6Var.f22886e && iIntValue2 == e6Var.f22887f && iIntValue3 == e6Var.f22888g && iIntValue4 == e6Var.h && themeSettings.message_colors_animated == e6Var.f22889i && ((long) iX0) == e6Var.f22890j && jX0 == e6Var.f22891k && jX1 == e6Var.f22892l && jX2 == e6Var.f22893m && wallpaperRotation == e6Var.f22894n && TextUtils.equals(str, e6Var.f22895o) && ((double) Math.abs(f10 - e6Var.f22896p)) < 0.001d) ? z11 : z10;
        }
        z10 = false;
        z11 = true;
        jX0 = 0;
        jX1 = 0;
        jX2 = 0;
        str = null;
        iX0 = 0;
        wallpaperRotation = 0;
        f10 = 0.0f;
        if (themeSettings.accent_color != e6Var.f22885c) {
        }
    }

    public static void b(f6 f6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        f6Var.S = iArr.length;
        f6Var.X = new ArrayList();
        f6Var.W = new SparseArray();
        f6Var.Y = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            e6 e6Var = new e6();
            e6Var.f22883a = iArr8[i10];
            if (g6.g1(e6Var)) {
                e6Var.f22905z = true;
            }
            e6Var.f22885c = iArr[i10];
            e6Var.f22884b = f6Var;
            e6Var.f22886e = iArr2[i10];
            e6Var.f22887f = iArr3[i10];
            long j10 = iArr4[i10];
            e6Var.f22890j = j10;
            boolean z10 = f6Var.O;
            if (z10 && e6Var.f22883a == g6.f23227n) {
                e6Var.f22890j = 4294967296L;
            } else {
                e6Var.f22890j = j10;
            }
            if (z10 && e6Var.f22883a == g6.f23227n) {
                e6Var.f22891k = 4294967296L;
            } else {
                e6Var.f22891k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && e6Var.f22883a == g6.f23227n) {
                    e6Var.f22892l = 4294967296L;
                } else {
                    e6Var.f22892l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && e6Var.f22883a == g6.f23227n) {
                    e6Var.f22893m = 4294967296L;
                } else {
                    e6Var.f22893m = iArr7[i10];
                }
            }
            e6Var.f22896p = iArr10[i10] / 100.0f;
            e6Var.f22894n = iArr9[i10];
            e6Var.f22895o = strArr[i10];
            if ((g6.g1(e6Var) && f6Var.f22941a.equals("Dark Blue")) || f6Var.f22941a.equals("Night")) {
                e6Var.f22886e = -14316059;
                e6Var.f22887f = -12422433;
                e6Var.f22888g = -8304937;
                e6Var.h = -6340950;
                if (f6Var.f22941a.equals("Night")) {
                    e6Var.f22896p = -0.57f;
                    e6Var.f22890j = -9666650L;
                    e6Var.f22891k = -13749173L;
                    e6Var.f22892l = -8883033L;
                    e6Var.f22893m = -13421992L;
                }
            }
            f6Var.W.put(e6Var.f22883a, e6Var);
            f6Var.X.add(e6Var);
        }
        f6Var.T = ((e6) f6Var.W.get(0)).f22885c;
    }

    public static void c(f6 f6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = f6Var.X;
        if (arrayList == null || arrayList.isEmpty()) {
            f6Var.r(sharedPreferences, null, a9.p.p(new StringBuilder(), f6Var.f22941a, "_owp"));
            return;
        }
        int size = f6Var.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            e6 e6Var = (e6) f6Var.X.get(i10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f6Var.f22941a);
            sb2.append("_");
            f6Var.r(sharedPreferences, e6Var, a9.p.k(e6Var.f22883a, "_owp", sb2));
        }
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
                try {
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                    f6Var.B = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (jSONObject.has("loaded")) {
                f6Var.C = jSONObject.getBoolean("loaded");
            }
            return f6Var;
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static f6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("\\|");
        if (strArrSplit.length != 2) {
            return null;
        }
        f6 f6Var = new f6();
        f6Var.f22941a = strArrSplit[0];
        f6Var.f22943b = strArrSplit[1];
        return f6Var;
    }

    public static void i(e6 e6Var, TLRPC.ThemeSettings themeSettings) {
        TLRPC.WallPaperSettings wallPaperSettings;
        e6Var.f22885c = themeSettings.accent_color;
        e6Var.d = themeSettings.outbox_accent_color;
        e6Var.f22886e = themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
        int iIntValue = themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
        e6Var.f22887f = iIntValue;
        if (e6Var.f22886e == iIntValue) {
            e6Var.f22887f = 0;
        }
        e6Var.f22888g = themeSettings.message_colors.size() > 2 ? themeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
        e6Var.h = themeSettings.message_colors.size() > 3 ? themeSettings.message_colors.get(3).intValue() | (-16777216) : 0;
        e6Var.f22889i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null) {
            return;
        }
        int i10 = wallPaperSettings.background_color;
        if (i10 == 0) {
            e6Var.f22890j = 4294967296L;
        } else {
            e6Var.f22890j = g6.X0(i10);
        }
        TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings2.flags & 16) == 0 || wallPaperSettings2.second_background_color != 0) {
            e6Var.f22891k = g6.X0(wallPaperSettings2.second_background_color);
        } else {
            e6Var.f22891k = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings3.flags & 32) == 0 || wallPaperSettings3.third_background_color != 0) {
            e6Var.f22892l = g6.X0(wallPaperSettings3.third_background_color);
        } else {
            e6Var.f22892l = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings4.flags & 64) == 0 || wallPaperSettings4.fourth_background_color != 0) {
            e6Var.f22893m = g6.X0(wallPaperSettings4.fourth_background_color);
        } else {
            e6Var.f22893m = 4294967296L;
        }
        e6Var.f22894n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
        TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
        if ((wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) || !wallPaper2.pattern) {
            return;
        }
        e6Var.f22895o = wallPaper2.slug;
        TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
        e6Var.f22896p = wallPaperSettings5.intensity / 100.0f;
        e6Var.f22897q = wallPaperSettings5.motion;
    }

    public final boolean d(File file, String str) {
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f22953r != 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = nb0.g(this.f22953r, this.f22954s, i10, this.f22955w);
                } else {
                    int i11 = this.f22954s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f22953r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(m9.d(this.f22956x), new int[]{this.f22953r, this.f22954s});
                        gradientDrawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
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
                scaledBitmap = bitmapCreateBitmap;
            }
            if (this.h) {
                scaledBitmap = Utilities.blurWallpaper(scaledBitmap);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            scaledBitmap.compress(this.v != 0 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (Throwable th) {
            FileLog.e(th);
            return false;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) throws Throwable {
        int i12 = NotificationCenter.fileLoaded;
        if (i10 == i12 || i10 == NotificationCenter.fileLoadFailed) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.B;
            if (tL_theme == null || tL_theme.document == null) {
                return;
            }
            if (str.equals(this.f22946c0)) {
                this.f22946c0 = null;
                Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.l0(8, this, (File) objArr[1]));
                return;
            }
            if (str.equals(FileLoader.getAttachFileName(this.B.document))) {
                t();
                if (i10 == i12) {
                    File file = new File(this.f22943b);
                    TLRPC.TL_theme tL_theme2 = this.B;
                    f6 f6VarK0 = g6.k0(file, tL_theme2.title, tL_theme2);
                    if (f6VarK0 == null || f6VarK0.f22945c == null || new File(f6VarK0.f22945c).exists()) {
                        s();
                        return;
                    }
                    this.f22953r = f6VarK0.f22953r;
                    this.f22954s = f6VarK0.f22954s;
                    this.v = f6VarK0.v;
                    this.f22955w = f6VarK0.f22955w;
                    this.f22956x = f6VarK0.f22956x;
                    this.h = f6VarK0.h;
                    this.f22957y = f6VarK0.f22957y;
                    this.f22947d0 = f6VarK0.f22945c;
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = f6VarK0.f22948e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(f6VarK0.A).sendRequest(getwallpaper, new cg.g0(25, this, f6VarK0));
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
            e6Var2.f22884b = this;
            e6Var2.f22883a = i11;
            e6Var2.f22898r = tL_theme;
            e6Var2.f22900t = i10;
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
        e6Var4.f22884b = this;
        e6Var4.f22883a = i12;
        e6Var4.f22898r = tL_theme;
        e6Var4.f22900t = i10;
        this.W.put(i12, e6Var4);
        this.X.add(0, e6Var4);
        g6.D1(this);
        this.Y.put(j10, e6Var4);
        return e6Var4;
    }

    public final e6 f(TLRPC.TL_theme tL_theme, int i10, int i11) {
        if (tL_theme == null) {
            return null;
        }
        return e(tL_theme.f22517id, i11 < tL_theme.settings.size() ? tL_theme.settings.get(i11) : null, tL_theme, i10, false);
    }

    public final String j(e6 e6Var, boolean z10) {
        String strK;
        if (e6Var == null) {
            e6Var = k(false);
        }
        if (e6Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? a9.p.p(new StringBuilder(), this.f22941a, "_wp_o") : a9.p.p(new StringBuilder(), this.f22941a, "_wp"));
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        if (z10) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f22941a);
            sb4.append("_");
            strK = a9.p.k(e6Var.f22883a, "_wp_o", sb4);
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f22941a);
            sb5.append("_");
            strK = a9.p.k(e6Var.f22883a, "_wp", sb5);
        }
        sb3.append(strK);
        sb3.append(Utilities.random.nextInt());
        sb3.append(".jpg");
        return sb3.toString();
    }

    public final e6 k(boolean z10) {
        e6 e6Var;
        if (this.X == null || (e6Var = (e6) this.W.get(this.U)) == null) {
            return null;
        }
        if (!z10) {
            return e6Var;
        }
        int i10 = this.f22944b0 + 1;
        this.f22944b0 = i10;
        e6 e6Var2 = new e6();
        e6Var2.f22885c = e6Var.f22885c;
        e6Var2.d = e6Var.d;
        e6Var2.f22886e = e6Var.f22886e;
        e6Var2.f22887f = e6Var.f22887f;
        e6Var2.f22888g = e6Var.f22888g;
        e6Var2.h = e6Var.h;
        e6Var2.f22889i = e6Var.f22889i;
        e6Var2.f22890j = e6Var.f22890j;
        e6Var2.f22891k = e6Var.f22891k;
        e6Var2.f22892l = e6Var.f22892l;
        e6Var2.f22893m = e6Var.f22893m;
        e6Var2.f22894n = e6Var.f22894n;
        e6Var2.f22895o = e6Var.f22895o;
        e6Var2.f22896p = e6Var.f22896p;
        e6Var2.f22897q = e6Var.f22897q;
        e6Var2.f22884b = this;
        z5 z5Var = this.f22949e0;
        if (z5Var != null) {
            z5 z5Var2 = new z5();
            z5Var2.f24005a = "";
            z5Var2.f24006b = "";
            z5Var2.f24007c = "";
            z5Var2.f24007c = z5Var.f24007c;
            z5Var2.d = z5Var.d;
            z5Var2.f24008e = z5Var.f24008e;
            z5Var2.f24009f = z5Var.f24009f;
            z5Var2.f24010g = z5Var.f24010g;
            z5Var2.h = z5Var.h;
            z5Var2.f24011i = z5Var.f24011i;
            z5Var2.f24012j = z5Var.f24012j;
            z5Var2.f24013k = z5Var.f24013k;
            z5Var2.f24018p = this;
            z5Var2.f24019q = e6Var2;
            if (TextUtils.isEmpty(z5Var.f24005a)) {
                z5Var2.f24005a = "";
            } else {
                try {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), z5Var.f24005a);
                    File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                    String strJ = z5Var2.f24018p.j(z5Var2.f24019q, false);
                    z5Var2.f24005a = strJ;
                    AndroidUtilities.copyFile(file, new File(filesDirFixed, strJ));
                } catch (Exception e9) {
                    z5Var2.f24005a = "";
                    FileLog.e(e9);
                }
            }
            if (TextUtils.isEmpty(z5Var.f24006b)) {
                z5Var2.f24006b = "";
            } else if (z5Var.f24006b.equals(z5Var.f24005a)) {
                z5Var2.f24006b = z5Var2.f24005a;
            } else {
                try {
                    File file2 = new File(ApplicationLoader.getFilesDirFixed(), z5Var.f24006b);
                    File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                    String strJ2 = z5Var2.f24018p.j(z5Var2.f24019q, true);
                    z5Var2.f24006b = strJ2;
                    AndroidUtilities.copyFile(file2, new File(filesDirFixed2, strJ2));
                } catch (Exception e10) {
                    z5Var2.f24006b = "";
                    FileLog.e(e10);
                }
            }
            e6Var2.f22904y = z5Var2;
        }
        this.V = this.U;
        e6Var2.f22883a = i10;
        this.U = i10;
        this.f22949e0 = e6Var2.f22904y;
        this.W.put(i10, e6Var2);
        this.X.add(0, e6Var2);
        g6.D1(this);
        return e6Var2;
    }

    public final int l(int i10) {
        e6 e6Var = (e6) this.W.get(i10);
        if (e6Var != null) {
            return e6Var.f22885c;
        }
        return 0;
    }

    public final String m() {
        if (this.B == null) {
            return this.f22941a;
        }
        return "remote" + this.B.f22517id;
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
        return tL_theme != null ? tL_theme.title : this.f22941a;
    }

    public final int o() {
        if (this.O && this.U == g6.f23227n) {
            return -3155485;
        }
        return this.H;
    }

    public final int p() {
        if (this.O && this.U == g6.f23227n) {
            return -983328;
        }
        return this.N;
    }

    public final boolean q() {
        int i10 = this.f22951f0;
        if (i10 != -1) {
            return i10 == 1;
        }
        if ("Dark Blue".equals(this.f22941a) || "Night".equals(this.f22941a)) {
            this.f22951f0 = 1;
        } else if ("Blue".equals(this.f22941a) || "Arctic Blue".equals(this.f22941a) || "Day".equals(this.f22941a)) {
            this.f22951f0 = 0;
        }
        if (this.f22951f0 == -1) {
            g6.G(g6.Q0(new File(this.f22943b), null, new String[1]), this);
        }
        return this.f22951f0 == 1;
    }

    public final void r(SharedPreferences sharedPreferences, e6 e6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            z5 z5Var = new z5();
            z5Var.f24005a = jSONObject.getString("wall");
            z5Var.f24006b = jSONObject.getString("owall");
            z5Var.d = jSONObject.getInt("pColor");
            z5Var.f24008e = jSONObject.getInt("pGrColor");
            z5Var.f24009f = jSONObject.optInt("pGrColor2");
            z5Var.f24010g = jSONObject.optInt("pGrColor3");
            z5Var.h = jSONObject.getInt("pGrAngle");
            z5Var.f24007c = jSONObject.getString("wallSlug");
            z5Var.f24011i = jSONObject.getBoolean("wBlur");
            z5Var.f24012j = jSONObject.getBoolean("wMotion");
            z5Var.f24013k = (float) jSONObject.getDouble("pIntensity");
            z5Var.f24018p = this;
            z5Var.f24019q = e6Var;
            if (e6Var != null) {
                e6Var.f22904y = z5Var;
            } else {
                this.f22949e0 = z5Var;
            }
            if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                z5Var.f24007c = "d";
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public final void s() throws Throwable {
        this.C = true;
        this.P = false;
        g6.s1(true, false);
        if (this == g6.I && g6.M == null) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, this, Boolean.valueOf(this == g6.J), null, -1, g6.ol);
        }
    }

    public final void t() {
        NotificationCenter.getInstance(this.A).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.A).removeObserver(this, NotificationCenter.fileLoadFailed);
    }

    public final void u(int i10) {
        this.U = i10;
        e6 e6VarK = k(false);
        if (e6VarK != null) {
            this.f22949e0 = e6VarK.f22904y;
        }
    }

    public final void v(z5 z5Var) {
        if (this.f22949e0 == z5Var) {
            return;
        }
        e6 e6VarK = k(false);
        z5 z5Var2 = this.f22949e0;
        if (z5Var2 != null) {
            z5.a(z5Var2);
        }
        if (z5Var != null) {
            z5Var.f24019q = e6VarK;
            z5Var.f24018p = this;
            z5Var.c();
        }
        this.f22949e0 = z5Var;
        if (e6VarK != null) {
            e6VarK.f22904y = z5Var;
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
