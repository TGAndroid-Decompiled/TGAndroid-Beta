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
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.n9;
public final class e6 implements NotificationCenter.NotificationCenterDelegate {
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
    public String f22906a;
    public int f22907a0;
    public String f22908b;
    public int f22909b0;
    public String f22910c;
    public String f22911c0;
    public String d;
    public String f22912d0;
    public String f22913e;
    public y5 f22914e0;
    public boolean f22915f;
    public int f22916f0;
    public boolean h;
    public boolean f22917n;
    public int f22918r;
    public int f22919s;
    public int v;
    public int f22920w;
    public int f22921x;
    public int f22922y;

    public e6() {
        this.f22921x = 45;
        this.C = true;
        this.Q = true;
        this.V = -1;
        this.Z = new LongSparseArray();
        this.f22907a0 = 0;
        this.f22909b0 = 100;
        this.f22916f0 = -1;
    }

    public static boolean a(d6 d6Var, TLRPC.ThemeSettings themeSettings) {
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        long j10;
        long j11;
        long j12;
        String str;
        int i13;
        int i14;
        float f10;
        TLRPC.WallPaperSettings wallPaperSettings;
        if (themeSettings.message_colors.size() > 0) {
            i9 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i9 = 0;
        }
        if (themeSettings.message_colors.size() > 1) {
            i10 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        if (i9 == i10) {
            i10 = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i11 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        if (themeSettings.message_colors.size() > 3) {
            i12 = (-16777216) | themeSettings.message_colors.get(3).intValue();
        } else {
            i12 = 0;
        }
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            i13 = f6.X0(wallPaperSettings.background_color);
            int i15 = themeSettings.wallpaper.settings.second_background_color;
            j12 = 4294967296L;
            if (i15 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = f6.X0(i15);
            }
            int i16 = themeSettings.wallpaper.settings.third_background_color;
            if (i16 == 0) {
                j11 = 4294967296L;
            } else {
                j11 = f6.X0(i16);
            }
            int i17 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i17 != 0) {
                j12 = f6.X0(i17);
            }
            i14 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
                long j13 = j11;
                if (themeSettings.accent_color != d6Var.f22868c && themeSettings.outbox_accent_color == d6Var.d && i9 == d6Var.f22869e && i10 == d6Var.f22870f && i11 == d6Var.f22871g && i12 == d6Var.h && themeSettings.message_colors_animated == d6Var.f22872i && i13 == d6Var.f22873j && j10 == d6Var.f22874k && j13 == d6Var.f22875l && j12 == d6Var.f22876m && i14 == d6Var.f22877n && TextUtils.equals(str, d6Var.f22878o) && Math.abs(f10 - d6Var.f22879p) < 0.001d) {
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
            i13 = 0;
            i14 = 0;
        }
        f10 = 0.0f;
        long j132 = j11;
        if (themeSettings.accent_color != d6Var.f22868c) {
        }
        return z10;
    }

    public static void b(e6 e6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        e6Var.S = iArr.length;
        e6Var.X = new ArrayList();
        e6Var.W = new SparseArray();
        e6Var.Y = new LongSparseArray();
        for (int i9 = 0; i9 < iArr.length; i9++) {
            d6 d6Var = new d6();
            d6Var.f22866a = iArr8[i9];
            if (f6.g1(d6Var)) {
                d6Var.f22888z = true;
            }
            d6Var.f22868c = iArr[i9];
            d6Var.f22867b = e6Var;
            d6Var.f22869e = iArr2[i9];
            d6Var.f22870f = iArr3[i9];
            long j10 = iArr4[i9];
            d6Var.f22873j = j10;
            boolean z10 = e6Var.O;
            if (z10 && d6Var.f22866a == f6.f23172n) {
                d6Var.f22873j = 4294967296L;
            } else {
                d6Var.f22873j = j10;
            }
            if (z10 && d6Var.f22866a == f6.f23172n) {
                d6Var.f22874k = 4294967296L;
            } else {
                d6Var.f22874k = iArr5[i9];
            }
            if (iArr6 != null) {
                if (z10 && d6Var.f22866a == f6.f23172n) {
                    d6Var.f22875l = 4294967296L;
                } else {
                    d6Var.f22875l = iArr6[i9];
                }
            }
            if (iArr7 != null) {
                if (z10 && d6Var.f22866a == f6.f23172n) {
                    d6Var.f22876m = 4294967296L;
                } else {
                    d6Var.f22876m = iArr7[i9];
                }
            }
            d6Var.f22879p = iArr10[i9] / 100.0f;
            d6Var.f22877n = iArr9[i9];
            d6Var.f22878o = strArr[i9];
            if ((f6.g1(d6Var) && e6Var.f22906a.equals("Dark Blue")) || e6Var.f22906a.equals("Night")) {
                d6Var.f22869e = -14316059;
                d6Var.f22870f = -12422433;
                d6Var.f22871g = -8304937;
                d6Var.h = -6340950;
                if (e6Var.f22906a.equals("Night")) {
                    d6Var.f22879p = -0.57f;
                    d6Var.f22873j = -9666650L;
                    d6Var.f22874k = -13749173L;
                    d6Var.f22875l = -8883033L;
                    d6Var.f22876m = -13421992L;
                }
            }
            e6Var.W.put(d6Var.f22866a, d6Var);
            e6Var.X.add(d6Var);
        }
        e6Var.T = ((d6) e6Var.W.get(0)).f22868c;
    }

    public static void c(e6 e6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = e6Var.X;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = e6Var.X.size();
            for (int i9 = 0; i9 < size; i9++) {
                d6 d6Var = (d6) e6Var.X.get(i9);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e6Var.f22906a);
                sb2.append("_");
                e6Var.r(sharedPreferences, d6Var, aa.d.l(d6Var.f22866a, "_owp", sb2));
            }
            return;
        }
        e6Var.r(sharedPreferences, null, aa.d.r(new StringBuilder(), e6Var.f22906a, "_owp"));
    }

    public static e6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            e6 e6Var = new e6();
            e6Var.f22906a = jSONObject.getString("name");
            e6Var.f22908b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                e6Var.A = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                e6Var.B = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                e6Var.C = jSONObject.getBoolean("loaded");
            }
            return e6Var;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static e6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        e6 e6Var = new e6();
        e6Var.f22906a = split[0];
        e6Var.f22908b = split[1];
        return e6Var;
    }

    public static void i(d6 d6Var, TLRPC.ThemeSettings themeSettings) {
        int i9;
        int i10;
        int i11;
        int i12;
        TLRPC.WallPaperSettings wallPaperSettings;
        d6Var.f22868c = themeSettings.accent_color;
        d6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i9 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i9 = 0;
        }
        d6Var.f22869e = i9;
        if (themeSettings.message_colors.size() > 1) {
            i10 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        d6Var.f22870f = i10;
        if (d6Var.f22869e == i10) {
            d6Var.f22870f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i11 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        d6Var.f22871g = i11;
        if (themeSettings.message_colors.size() > 3) {
            i12 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        d6Var.h = i12;
        d6Var.f22872i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            int i13 = wallPaperSettings.background_color;
            if (i13 == 0) {
                d6Var.f22873j = 4294967296L;
            } else {
                d6Var.f22873j = f6.X0(i13);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                d6Var.f22874k = 4294967296L;
            } else {
                d6Var.f22874k = f6.X0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                d6Var.f22875l = 4294967296L;
            } else {
                d6Var.f22875l = f6.X0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                d6Var.f22876m = 4294967296L;
            } else {
                d6Var.f22876m = f6.X0(wallPaperSettings4.fourth_background_color);
            }
            d6Var.f22877n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                d6Var.f22878o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                d6Var.f22879p = wallPaperSettings5.intensity / 100.0f;
                d6Var.f22880q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f22918r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i9 = this.v;
                if (i9 != 0) {
                    patternColor = jb0.g(this.f22918r, this.f22919s, i9, this.f22920w);
                } else {
                    int i10 = this.f22919s;
                    if (i10 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f22918r, i10);
                        GradientDrawable gradientDrawable = new GradientDrawable(n9.d(this.f22921x), new int[]{this.f22918r, this.f22919s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.f22918r);
                        canvas.drawColor(this.f22918r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.f22922y / 100.0f) * 255.0f));
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
        } catch (Throwable th) {
            FileLog.e(th);
            return false;
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.fileLoaded;
        if (i9 == i11 || i9 == NotificationCenter.fileLoadFailed) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.B;
            if (tL_theme != null && tL_theme.document != null) {
                if (str.equals(this.f22911c0)) {
                    this.f22911c0 = null;
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.l0(8, this, (File) objArr[1]));
                } else if (str.equals(FileLoader.getAttachFileName(this.B.document))) {
                    t();
                    if (i9 == i11) {
                        File file = new File(this.f22908b);
                        TLRPC.TL_theme tL_theme2 = this.B;
                        e6 k02 = f6.k0(file, tL_theme2.title, tL_theme2);
                        if (k02 != null && k02.f22910c != null && !new File(k02.f22910c).exists()) {
                            this.f22918r = k02.f22918r;
                            this.f22919s = k02.f22919s;
                            this.v = k02.v;
                            this.f22920w = k02.f22920w;
                            this.f22921x = k02.f22921x;
                            this.h = k02.h;
                            this.f22922y = k02.f22922y;
                            this.f22912d0 = k02.f22910c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = k02.f22913e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(k02.A).sendRequest(getwallpaper, new bg.j0(28, this, k02));
                            return;
                        }
                        s();
                    }
                }
            }
        }
    }

    public final d6 e(long j10, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i9, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.Z;
            d6 d6Var = (d6) longSparseArray.get(j10);
            if (d6Var != null) {
                return d6Var;
            }
            int i10 = this.f22907a0 + 1;
            this.f22907a0 = i10;
            d6 d6Var2 = new d6();
            i(d6Var2, themeSettings);
            d6Var2.f22867b = this;
            d6Var2.f22866a = i10;
            d6Var2.f22881r = tL_theme;
            d6Var2.f22883t = i9;
            longSparseArray.put(i10, d6Var2);
            return d6Var2;
        }
        d6 d6Var3 = (d6) this.Y.get(j10);
        if (d6Var3 != null) {
            return d6Var3;
        }
        int i11 = this.f22909b0 + 1;
        this.f22909b0 = i11;
        d6 d6Var4 = new d6();
        i(d6Var4, themeSettings);
        d6Var4.f22867b = this;
        d6Var4.f22866a = i11;
        d6Var4.f22881r = tL_theme;
        d6Var4.f22883t = i9;
        this.W.put(i11, d6Var4);
        this.X.add(0, d6Var4);
        f6.D1(this);
        this.Y.put(j10, d6Var4);
        return d6Var4;
    }

    public final d6 f(TLRPC.TL_theme tL_theme, int i9, int i10) {
        TLRPC.ThemeSettings themeSettings = null;
        if (tL_theme == null) {
            return null;
        }
        if (i10 < tL_theme.settings.size()) {
            themeSettings = tL_theme.settings.get(i10);
        }
        return e(tL_theme.f22517id, themeSettings, tL_theme, i9, false);
    }

    public final String j(d6 d6Var, boolean z10) {
        String r10;
        String l10;
        if (d6Var == null) {
            d6Var = k(false);
        }
        if (d6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f22906a);
                sb3.append("_");
                l10 = aa.d.l(d6Var.f22866a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f22906a);
                sb4.append("_");
                l10 = aa.d.l(d6Var.f22866a, "_wp", sb4);
            }
            sb2.append(l10);
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            r10 = aa.d.r(new StringBuilder(), this.f22906a, "_wp_o");
        } else {
            r10 = aa.d.r(new StringBuilder(), this.f22906a, "_wp");
        }
        sb5.append(r10);
        sb5.append(Utilities.random.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final d6 k(boolean z10) {
        d6 d6Var;
        if (this.X == null || (d6Var = (d6) this.W.get(this.U)) == null) {
            return null;
        }
        if (z10) {
            int i9 = this.f22909b0 + 1;
            this.f22909b0 = i9;
            d6 d6Var2 = new d6();
            d6Var2.f22868c = d6Var.f22868c;
            d6Var2.d = d6Var.d;
            d6Var2.f22869e = d6Var.f22869e;
            d6Var2.f22870f = d6Var.f22870f;
            d6Var2.f22871g = d6Var.f22871g;
            d6Var2.h = d6Var.h;
            d6Var2.f22872i = d6Var.f22872i;
            d6Var2.f22873j = d6Var.f22873j;
            d6Var2.f22874k = d6Var.f22874k;
            d6Var2.f22875l = d6Var.f22875l;
            d6Var2.f22876m = d6Var.f22876m;
            d6Var2.f22877n = d6Var.f22877n;
            d6Var2.f22878o = d6Var.f22878o;
            d6Var2.f22879p = d6Var.f22879p;
            d6Var2.f22880q = d6Var.f22880q;
            d6Var2.f22867b = this;
            y5 y5Var = this.f22914e0;
            if (y5Var != null) {
                ?? obj = new Object();
                obj.f23980a = "";
                obj.f23981b = "";
                obj.f23982c = "";
                obj.f23982c = y5Var.f23982c;
                obj.d = y5Var.d;
                obj.f23983e = y5Var.f23983e;
                obj.f23984f = y5Var.f23984f;
                obj.f23985g = y5Var.f23985g;
                obj.h = y5Var.h;
                obj.f23986i = y5Var.f23986i;
                obj.f23987j = y5Var.f23987j;
                obj.f23988k = y5Var.f23988k;
                obj.f23993p = this;
                obj.f23994q = d6Var2;
                if (!TextUtils.isEmpty(y5Var.f23980a)) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), y5Var.f23980a);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String j10 = obj.f23993p.j(obj.f23994q, false);
                        obj.f23980a = j10;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, j10));
                    } catch (Exception e10) {
                        obj.f23980a = "";
                        FileLog.e(e10);
                    }
                } else {
                    obj.f23980a = "";
                }
                if (!TextUtils.isEmpty(y5Var.f23981b)) {
                    if (!y5Var.f23981b.equals(y5Var.f23980a)) {
                        try {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), y5Var.f23981b);
                            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                            String j11 = obj.f23993p.j(obj.f23994q, true);
                            obj.f23981b = j11;
                            AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j11));
                        } catch (Exception e11) {
                            obj.f23981b = "";
                            FileLog.e(e11);
                        }
                    } else {
                        obj.f23981b = obj.f23980a;
                    }
                } else {
                    obj.f23981b = "";
                }
                d6Var2.f22887y = obj;
            }
            this.V = this.U;
            d6Var2.f22866a = i9;
            this.U = i9;
            this.f22914e0 = d6Var2.f22887y;
            this.W.put(i9, d6Var2);
            this.X.add(0, d6Var2);
            f6.D1(this);
            return d6Var2;
        }
        return d6Var;
    }

    public final int l(int i9) {
        d6 d6Var = (d6) this.W.get(i9);
        if (d6Var != null) {
            return d6Var.f22868c;
        }
        return 0;
    }

    public final String m() {
        if (this.B != null) {
            return "remote" + this.B.f22517id;
        }
        return this.f22906a;
    }

    public final String n() {
        if ("Blue".equals(this.f22906a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.f22906a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.f22906a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.f22906a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.f22906a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.B;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f22906a;
    }

    public final int o() {
        if (this.O && this.U == f6.f23172n) {
            return -3155485;
        }
        return this.H;
    }

    public final int p() {
        if (this.O && this.U == f6.f23172n) {
            return -983328;
        }
        return this.N;
    }

    public final boolean q() {
        int i9 = this.f22916f0;
        if (i9 != -1) {
            if (i9 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f22906a) && !"Night".equals(this.f22906a)) {
            if ("Blue".equals(this.f22906a) || "Arctic Blue".equals(this.f22906a) || "Day".equals(this.f22906a)) {
                this.f22916f0 = 0;
            }
        } else {
            this.f22916f0 = 1;
        }
        if (this.f22916f0 == -1) {
            f6.G(f6.Q0(new File(this.f22908b), null, new String[1]), this);
        }
        if (this.f22916f0 != 1) {
            return false;
        }
        return true;
    }

    public final void r(SharedPreferences sharedPreferences, d6 d6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                y5 y5Var = new y5();
                y5Var.f23980a = jSONObject.getString("wall");
                y5Var.f23981b = jSONObject.getString("owall");
                y5Var.d = jSONObject.getInt("pColor");
                y5Var.f23983e = jSONObject.getInt("pGrColor");
                y5Var.f23984f = jSONObject.optInt("pGrColor2");
                y5Var.f23985g = jSONObject.optInt("pGrColor3");
                y5Var.h = jSONObject.getInt("pGrAngle");
                y5Var.f23982c = jSONObject.getString("wallSlug");
                y5Var.f23986i = jSONObject.getBoolean("wBlur");
                y5Var.f23987j = jSONObject.getBoolean("wMotion");
                y5Var.f23988k = (float) jSONObject.getDouble("pIntensity");
                y5Var.f23993p = this;
                y5Var.f23994q = d6Var;
                if (d6Var != null) {
                    d6Var.f22887y = y5Var;
                } else {
                    this.f22914e0 = y5Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    y5Var.f23982c = "d";
                }
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public final void s() {
        boolean z10;
        this.C = true;
        this.P = false;
        f6.s1(true, false);
        if (this == f6.I && f6.M == null) {
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i9 = NotificationCenter.needSetDayNightTheme;
            if (this == f6.J) {
                z10 = true;
            } else {
                z10 = false;
            }
            globalInstance.lambda$postNotificationNameOnUIThread$1(i9, this, Boolean.valueOf(z10), null, -1, f6.ol);
        }
    }

    public final void t() {
        NotificationCenter.getInstance(this.A).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.A).removeObserver(this, NotificationCenter.fileLoadFailed);
    }

    public final void u(int i9) {
        this.U = i9;
        d6 k10 = k(false);
        if (k10 != null) {
            this.f22914e0 = k10.f22887y;
        }
    }

    public final void v(y5 y5Var) {
        if (this.f22914e0 != y5Var) {
            d6 k10 = k(false);
            y5 y5Var2 = this.f22914e0;
            if (y5Var2 != null) {
                y5.a(y5Var2);
            }
            if (y5Var != null) {
                y5Var.f23994q = k10;
                y5Var.f23993p = this;
                y5Var.c();
            }
            this.f22914e0 = y5Var;
            if (k10 != null) {
                k10.f22887y = y5Var;
            }
        }
    }

    public e6(e6 e6Var) {
        this.f22921x = 45;
        this.C = true;
        this.Q = true;
        this.V = -1;
        this.Z = new LongSparseArray();
        this.f22907a0 = 0;
        this.f22909b0 = 100;
        this.f22916f0 = -1;
        this.f22906a = e6Var.f22906a;
        this.f22908b = e6Var.f22908b;
        this.f22910c = e6Var.f22910c;
        this.d = e6Var.d;
        this.f22913e = e6Var.f22913e;
        this.f22915f = e6Var.f22915f;
        this.h = e6Var.h;
        this.f22917n = e6Var.f22917n;
        this.f22918r = e6Var.f22918r;
        this.f22919s = e6Var.f22919s;
        this.v = e6Var.v;
        this.f22920w = e6Var.f22920w;
        this.f22921x = e6Var.f22921x;
        this.f22922y = e6Var.f22922y;
        this.A = e6Var.A;
        this.B = e6Var.B;
        this.C = e6Var.C;
        this.D = e6Var.D;
        this.E = e6Var.E;
        this.F = e6Var.F;
        this.G = e6Var.G;
        this.H = e6Var.H;
        this.I = e6Var.I;
        this.J = e6Var.J;
        this.K = e6Var.K;
        this.L = e6Var.L;
        this.M = e6Var.M;
        this.N = e6Var.N;
        this.O = e6Var.O;
        this.P = e6Var.P;
        this.Q = e6Var.Q;
        this.R = e6Var.R;
        this.S = e6Var.S;
        this.T = e6Var.T;
        this.U = e6Var.U;
        this.V = e6Var.V;
        this.W = e6Var.W;
        this.X = e6Var.X;
        this.Y = e6Var.Y;
        this.f22909b0 = e6Var.f22909b0;
        this.f22911c0 = e6Var.f22911c0;
        this.f22912d0 = e6Var.f22912d0;
        this.f22914e0 = e6Var.f22914e0;
    }
}
