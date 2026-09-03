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
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.o9;
public final class j6 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public TLRPC.TL_theme C;
    public boolean D;
    public String E;
    public String F;
    public TLRPC.InputFile G;
    public TLRPC.InputFile H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public SparseArray X;
    public ArrayList Y;
    public LongSparseArray Z;
    public String f21505a;
    public final LongSparseArray f21506a0;
    public String f21507b;
    public int f21508b0;
    public String f21509c;
    public int f21510c0;
    public String d;
    public String f21511d0;
    public String f21512e;
    public String f21513e0;
    public boolean f21514f;
    public d6 f21515f0;
    public int f21516g0;
    public boolean h;
    public boolean f21517n;
    public int f21518r;
    public int f21519s;
    public int v;
    public int f21520w;
    public int f21521x;
    public int f21522y;

    public j6() {
        this.f21521x = 45;
        this.D = true;
        this.R = true;
        this.W = -1;
        this.f21506a0 = new LongSparseArray();
        this.f21508b0 = 0;
        this.f21510c0 = 100;
        this.f21516g0 = -1;
    }

    public static boolean a(i6 i6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z4;
        boolean z10;
        long j10;
        long j11;
        long j12;
        String str;
        int i14;
        int i15;
        float f10;
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
            i14 = k6.X0(wallPaperSettings.background_color);
            int i16 = themeSettings.wallpaper.settings.second_background_color;
            j12 = 4294967296L;
            if (i16 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = k6.X0(i16);
            }
            int i17 = themeSettings.wallpaper.settings.third_background_color;
            if (i17 == 0) {
                j11 = 4294967296L;
            } else {
                j11 = k6.X0(i17);
            }
            int i18 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i18 != 0) {
                j12 = k6.X0(i18);
            }
            i15 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z4 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z10 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
                long j13 = j11;
                if (themeSettings.accent_color != i6Var.f21471c && themeSettings.outbox_accent_color == i6Var.d && i10 == i6Var.f21472e && i11 == i6Var.f21473f && i12 == i6Var.f21474g && i13 == i6Var.h && themeSettings.message_colors_animated == i6Var.f21475i && i14 == i6Var.f21476j && j10 == i6Var.f21477k && j13 == i6Var.f21478l && j12 == i6Var.f21479m && i15 == i6Var.f21480n && TextUtils.equals(str, i6Var.f21481o) && Math.abs(f10 - i6Var.f21482p) < 0.001d) {
                    return z10;
                }
                return z4;
            }
            str = null;
        } else {
            z4 = false;
            z10 = true;
            j10 = 0;
            j11 = 0;
            j12 = 0;
            str = null;
            i14 = 0;
            i15 = 0;
        }
        f10 = 0.0f;
        long j132 = j11;
        if (themeSettings.accent_color != i6Var.f21471c) {
        }
        return z4;
    }

    public static void b(j6 j6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        j6Var.T = iArr.length;
        j6Var.Y = new ArrayList();
        j6Var.X = new SparseArray();
        j6Var.Z = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            i6 i6Var = new i6();
            i6Var.f21469a = iArr8[i10];
            if (k6.g1(i6Var)) {
                i6Var.f21491z = true;
            }
            i6Var.f21471c = iArr[i10];
            i6Var.f21470b = j6Var;
            i6Var.f21472e = iArr2[i10];
            i6Var.f21473f = iArr3[i10];
            long j10 = iArr4[i10];
            i6Var.f21476j = j10;
            boolean z4 = j6Var.P;
            if (z4 && i6Var.f21469a == k6.f21834n) {
                i6Var.f21476j = 4294967296L;
            } else {
                i6Var.f21476j = j10;
            }
            if (z4 && i6Var.f21469a == k6.f21834n) {
                i6Var.f21477k = 4294967296L;
            } else {
                i6Var.f21477k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z4 && i6Var.f21469a == k6.f21834n) {
                    i6Var.f21478l = 4294967296L;
                } else {
                    i6Var.f21478l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z4 && i6Var.f21469a == k6.f21834n) {
                    i6Var.f21479m = 4294967296L;
                } else {
                    i6Var.f21479m = iArr7[i10];
                }
            }
            i6Var.f21482p = iArr10[i10] / 100.0f;
            i6Var.f21480n = iArr9[i10];
            i6Var.f21481o = strArr[i10];
            if ((k6.g1(i6Var) && j6Var.f21505a.equals("Dark Blue")) || j6Var.f21505a.equals("Night")) {
                i6Var.f21472e = -14316059;
                i6Var.f21473f = -12422433;
                i6Var.f21474g = -8304937;
                i6Var.h = -6340950;
                if (j6Var.f21505a.equals("Night")) {
                    i6Var.f21482p = -0.57f;
                    i6Var.f21476j = -9666650L;
                    i6Var.f21477k = -13749173L;
                    i6Var.f21478l = -8883033L;
                    i6Var.f21479m = -13421992L;
                }
            }
            j6Var.X.put(i6Var.f21469a, i6Var);
            j6Var.Y.add(i6Var);
        }
        j6Var.U = ((i6) j6Var.X.get(0)).f21471c;
    }

    public static void c(j6 j6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = j6Var.Y;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = j6Var.Y.size();
            for (int i10 = 0; i10 < size; i10++) {
                i6 i6Var = (i6) j6Var.Y.get(i10);
                StringBuilder sb = new StringBuilder();
                sb.append(j6Var.f21505a);
                sb.append("_");
                j6Var.r(sharedPreferences, i6Var, android.support.v4.media.a.m(i6Var.f21469a, "_owp", sb));
            }
            return;
        }
        j6Var.r(sharedPreferences, null, android.support.v4.media.a.r(new StringBuilder(), j6Var.f21505a, "_owp"));
    }

    public static j6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            j6 j6Var = new j6();
            j6Var.f21505a = jSONObject.getString("name");
            j6Var.f21507b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                j6Var.B = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                j6Var.C = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                j6Var.D = jSONObject.getBoolean("loaded");
            }
            return j6Var;
        } catch (Exception e6) {
            FileLog.e(e6);
            return null;
        }
    }

    public static j6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        j6 j6Var = new j6();
        j6Var.f21505a = split[0];
        j6Var.f21507b = split[1];
        return j6Var;
    }

    public static void i(i6 i6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        i6Var.f21471c = themeSettings.accent_color;
        i6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i10 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        i6Var.f21472e = i10;
        if (themeSettings.message_colors.size() > 1) {
            i11 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        i6Var.f21473f = i11;
        if (i6Var.f21472e == i11) {
            i6Var.f21473f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        i6Var.f21474g = i12;
        if (themeSettings.message_colors.size() > 3) {
            i13 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i13 = 0;
        }
        i6Var.h = i13;
        i6Var.f21475i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            int i14 = wallPaperSettings.background_color;
            if (i14 == 0) {
                i6Var.f21476j = 4294967296L;
            } else {
                i6Var.f21476j = k6.X0(i14);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                i6Var.f21477k = 4294967296L;
            } else {
                i6Var.f21477k = k6.X0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                i6Var.f21478l = 4294967296L;
            } else {
                i6Var.f21478l = k6.X0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                i6Var.f21479m = 4294967296L;
            } else {
                i6Var.f21479m = k6.X0(wallPaperSettings4.fourth_background_color);
            }
            i6Var.f21480n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                i6Var.f21481o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                i6Var.f21482p = wallPaperSettings5.intensity / 100.0f;
                i6Var.f21483q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f21518r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = fc0.g(this.f21518r, this.f21519s, i10, this.f21520w);
                } else {
                    int i11 = this.f21519s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f21518r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(o9.d(this.f21521x), new int[]{this.f21518r, this.f21519s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.f21518r);
                        canvas.drawColor(this.f21518r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.f21522y / 100.0f) * 255.0f));
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
            TLRPC.TL_theme tL_theme = this.C;
            if (tL_theme != null && tL_theme.document != null) {
                if (str.equals(this.f21511d0)) {
                    this.f21511d0 = null;
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.h(12, this, (File) objArr[1]));
                } else if (str.equals(FileLoader.getAttachFileName(this.C.document))) {
                    t();
                    if (i10 == i12) {
                        File file = new File(this.f21507b);
                        TLRPC.TL_theme tL_theme2 = this.C;
                        j6 k02 = k6.k0(file, tL_theme2.title, tL_theme2);
                        if (k02 != null && k02.f21509c != null && !new File(k02.f21509c).exists()) {
                            this.f21518r = k02.f21518r;
                            this.f21519s = k02.f21519s;
                            this.v = k02.v;
                            this.f21520w = k02.f21520w;
                            this.f21521x = k02.f21521x;
                            this.h = k02.h;
                            this.f21522y = k02.f21522y;
                            this.f21513e0 = k02.f21509c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = k02.f21512e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(k02.B).sendRequest(getwallpaper, new eg.b3(21, this, k02));
                            return;
                        }
                        s();
                    }
                }
            }
        }
    }

    public final i6 e(long j10, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z4) {
        if (z4) {
            LongSparseArray longSparseArray = this.f21506a0;
            i6 i6Var = (i6) longSparseArray.get(j10);
            if (i6Var != null) {
                return i6Var;
            }
            int i11 = this.f21508b0 + 1;
            this.f21508b0 = i11;
            i6 i6Var2 = new i6();
            i(i6Var2, themeSettings);
            i6Var2.f21470b = this;
            i6Var2.f21469a = i11;
            i6Var2.f21484r = tL_theme;
            i6Var2.f21486t = i10;
            longSparseArray.put(i11, i6Var2);
            return i6Var2;
        }
        i6 i6Var3 = (i6) this.Z.get(j10);
        if (i6Var3 != null) {
            return i6Var3;
        }
        int i12 = this.f21510c0 + 1;
        this.f21510c0 = i12;
        i6 i6Var4 = new i6();
        i(i6Var4, themeSettings);
        i6Var4.f21470b = this;
        i6Var4.f21469a = i12;
        i6Var4.f21484r = tL_theme;
        i6Var4.f21486t = i10;
        this.X.put(i12, i6Var4);
        this.Y.add(0, i6Var4);
        k6.D1(this);
        this.Z.put(j10, i6Var4);
        return i6Var4;
    }

    public final i6 f(TLRPC.TL_theme tL_theme, int i10, int i11) {
        TLRPC.ThemeSettings themeSettings = null;
        if (tL_theme == null) {
            return null;
        }
        if (i11 < tL_theme.settings.size()) {
            themeSettings = tL_theme.settings.get(i11);
        }
        return e(tL_theme.f20982id, themeSettings, tL_theme, i10, false);
    }

    public final String j(i6 i6Var, boolean z4) {
        String r10;
        String m9;
        if (i6Var == null) {
            i6Var = k(false);
        }
        if (i6Var != null) {
            StringBuilder sb = new StringBuilder();
            if (z4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f21505a);
                sb2.append("_");
                m9 = android.support.v4.media.a.m(i6Var.f21469a, "_wp_o", sb2);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f21505a);
                sb3.append("_");
                m9 = android.support.v4.media.a.m(i6Var.f21469a, "_wp", sb3);
            }
            sb.append(m9);
            sb.append(Utilities.random.nextInt());
            sb.append(".jpg");
            return sb.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        if (z4) {
            r10 = android.support.v4.media.a.r(new StringBuilder(), this.f21505a, "_wp_o");
        } else {
            r10 = android.support.v4.media.a.r(new StringBuilder(), this.f21505a, "_wp");
        }
        sb4.append(r10);
        sb4.append(Utilities.random.nextInt());
        sb4.append(".jpg");
        return sb4.toString();
    }

    public final i6 k(boolean z4) {
        i6 i6Var;
        if (this.Y == null || (i6Var = (i6) this.X.get(this.V)) == null) {
            return null;
        }
        if (z4) {
            int i10 = this.f21510c0 + 1;
            this.f21510c0 = i10;
            i6 i6Var2 = new i6();
            i6Var2.f21471c = i6Var.f21471c;
            i6Var2.d = i6Var.d;
            i6Var2.f21472e = i6Var.f21472e;
            i6Var2.f21473f = i6Var.f21473f;
            i6Var2.f21474g = i6Var.f21474g;
            i6Var2.h = i6Var.h;
            i6Var2.f21475i = i6Var.f21475i;
            i6Var2.f21476j = i6Var.f21476j;
            i6Var2.f21477k = i6Var.f21477k;
            i6Var2.f21478l = i6Var.f21478l;
            i6Var2.f21479m = i6Var.f21479m;
            i6Var2.f21480n = i6Var.f21480n;
            i6Var2.f21481o = i6Var.f21481o;
            i6Var2.f21482p = i6Var.f21482p;
            i6Var2.f21483q = i6Var.f21483q;
            i6Var2.f21470b = this;
            d6 d6Var = this.f21515f0;
            if (d6Var != null) {
                ?? obj = new Object();
                obj.f21284a = "";
                obj.f21285b = "";
                obj.f21286c = "";
                obj.f21286c = d6Var.f21286c;
                obj.d = d6Var.d;
                obj.f21287e = d6Var.f21287e;
                obj.f21288f = d6Var.f21288f;
                obj.f21289g = d6Var.f21289g;
                obj.h = d6Var.h;
                obj.f21290i = d6Var.f21290i;
                obj.f21291j = d6Var.f21291j;
                obj.f21292k = d6Var.f21292k;
                obj.f21297p = this;
                obj.f21298q = i6Var2;
                if (!TextUtils.isEmpty(d6Var.f21284a)) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), d6Var.f21284a);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String j10 = obj.f21297p.j(obj.f21298q, false);
                        obj.f21284a = j10;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, j10));
                    } catch (Exception e6) {
                        obj.f21284a = "";
                        FileLog.e(e6);
                    }
                } else {
                    obj.f21284a = "";
                }
                if (!TextUtils.isEmpty(d6Var.f21285b)) {
                    if (!d6Var.f21285b.equals(d6Var.f21284a)) {
                        try {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), d6Var.f21285b);
                            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                            String j11 = obj.f21297p.j(obj.f21298q, true);
                            obj.f21285b = j11;
                            AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j11));
                        } catch (Exception e10) {
                            obj.f21285b = "";
                            FileLog.e(e10);
                        }
                    } else {
                        obj.f21285b = obj.f21284a;
                    }
                } else {
                    obj.f21285b = "";
                }
                i6Var2.f21490y = obj;
            }
            this.W = this.V;
            i6Var2.f21469a = i10;
            this.V = i10;
            this.f21515f0 = i6Var2.f21490y;
            this.X.put(i10, i6Var2);
            this.Y.add(0, i6Var2);
            k6.D1(this);
            return i6Var2;
        }
        return i6Var;
    }

    public final int l(int i10) {
        i6 i6Var = (i6) this.X.get(i10);
        if (i6Var != null) {
            return i6Var.f21471c;
        }
        return 0;
    }

    public final String m() {
        if (this.C != null) {
            return "remote" + this.C.f20982id;
        }
        return this.f21505a;
    }

    public final String n() {
        if ("Blue".equals(this.f21505a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.f21505a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.f21505a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.f21505a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.f21505a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.C;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f21505a;
    }

    public final int o() {
        if (this.P && this.V == k6.f21834n) {
            return -3155485;
        }
        return this.I;
    }

    public final int p() {
        if (this.P && this.V == k6.f21834n) {
            return -983328;
        }
        return this.O;
    }

    public final boolean q() {
        int i10 = this.f21516g0;
        if (i10 != -1) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f21505a) && !"Night".equals(this.f21505a)) {
            if ("Blue".equals(this.f21505a) || "Arctic Blue".equals(this.f21505a) || "Day".equals(this.f21505a)) {
                this.f21516g0 = 0;
            }
        } else {
            this.f21516g0 = 1;
        }
        if (this.f21516g0 == -1) {
            k6.G(k6.Q0(new File(this.f21507b), null, new String[1]), this);
        }
        if (this.f21516g0 != 1) {
            return false;
        }
        return true;
    }

    public final void r(SharedPreferences sharedPreferences, i6 i6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                d6 d6Var = new d6();
                d6Var.f21284a = jSONObject.getString("wall");
                d6Var.f21285b = jSONObject.getString("owall");
                d6Var.d = jSONObject.getInt("pColor");
                d6Var.f21287e = jSONObject.getInt("pGrColor");
                d6Var.f21288f = jSONObject.optInt("pGrColor2");
                d6Var.f21289g = jSONObject.optInt("pGrColor3");
                d6Var.h = jSONObject.getInt("pGrAngle");
                d6Var.f21286c = jSONObject.getString("wallSlug");
                d6Var.f21290i = jSONObject.getBoolean("wBlur");
                d6Var.f21291j = jSONObject.getBoolean("wMotion");
                d6Var.f21292k = (float) jSONObject.getDouble("pIntensity");
                d6Var.f21297p = this;
                d6Var.f21298q = i6Var;
                if (i6Var != null) {
                    i6Var.f21490y = d6Var;
                } else {
                    this.f21515f0 = d6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    d6Var.f21286c = "d";
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void s() {
        boolean z4;
        this.D = true;
        this.Q = false;
        k6.s1(true, false);
        if (this == k6.I && k6.M == null) {
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i10 = NotificationCenter.needSetDayNightTheme;
            if (this == k6.J) {
                z4 = true;
            } else {
                z4 = false;
            }
            globalInstance.lambda$postNotificationNameOnUIThread$1(i10, this, Boolean.valueOf(z4), null, -1, k6.ol);
        }
    }

    public final void t() {
        NotificationCenter.getInstance(this.B).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.B).removeObserver(this, NotificationCenter.fileLoadFailed);
    }

    public final void u(int i10) {
        this.V = i10;
        i6 k10 = k(false);
        if (k10 != null) {
            this.f21515f0 = k10.f21490y;
        }
    }

    public final void v(d6 d6Var) {
        if (this.f21515f0 != d6Var) {
            i6 k10 = k(false);
            d6 d6Var2 = this.f21515f0;
            if (d6Var2 != null) {
                d6.a(d6Var2);
            }
            if (d6Var != null) {
                d6Var.f21298q = k10;
                d6Var.f21297p = this;
                d6Var.c();
            }
            this.f21515f0 = d6Var;
            if (k10 != null) {
                k10.f21490y = d6Var;
            }
        }
    }

    public j6(j6 j6Var) {
        this.f21521x = 45;
        this.D = true;
        this.R = true;
        this.W = -1;
        this.f21506a0 = new LongSparseArray();
        this.f21508b0 = 0;
        this.f21510c0 = 100;
        this.f21516g0 = -1;
        this.f21505a = j6Var.f21505a;
        this.f21507b = j6Var.f21507b;
        this.f21509c = j6Var.f21509c;
        this.d = j6Var.d;
        this.f21512e = j6Var.f21512e;
        this.f21514f = j6Var.f21514f;
        this.h = j6Var.h;
        this.f21517n = j6Var.f21517n;
        this.f21518r = j6Var.f21518r;
        this.f21519s = j6Var.f21519s;
        this.v = j6Var.v;
        this.f21520w = j6Var.f21520w;
        this.f21521x = j6Var.f21521x;
        this.f21522y = j6Var.f21522y;
        this.B = j6Var.B;
        this.C = j6Var.C;
        this.D = j6Var.D;
        this.E = j6Var.E;
        this.F = j6Var.F;
        this.G = j6Var.G;
        this.H = j6Var.H;
        this.I = j6Var.I;
        this.J = j6Var.J;
        this.K = j6Var.K;
        this.L = j6Var.L;
        this.M = j6Var.M;
        this.N = j6Var.N;
        this.O = j6Var.O;
        this.P = j6Var.P;
        this.Q = j6Var.Q;
        this.R = j6Var.R;
        this.S = j6Var.S;
        this.T = j6Var.T;
        this.U = j6Var.U;
        this.V = j6Var.V;
        this.W = j6Var.W;
        this.X = j6Var.X;
        this.Y = j6Var.Y;
        this.Z = j6Var.Z;
        this.f21510c0 = j6Var.f21510c0;
        this.f21511d0 = j6Var.f21511d0;
        this.f21513e0 = j6Var.f21513e0;
        this.f21515f0 = j6Var.f21515f0;
    }
}
