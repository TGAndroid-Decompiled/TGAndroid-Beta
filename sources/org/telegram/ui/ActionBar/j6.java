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
import org.telegram.ui.Components.yc0;
public final class j6 implements NotificationCenter.NotificationCenterDelegate {
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
    public String f21019a;
    public SparseArray f21020a0;
    public String f21021b;
    public ArrayList f21022b0;
    public String f21023c;
    public LongSparseArray f21024c0;
    public String d;
    public final LongSparseArray f21025d0;
    public String e;
    public int f21026e0;
    public boolean f21027f;
    public int f21028f0;
    public String f21029g0;
    public boolean h;
    public String f21030h0;
    public d6 f21031i0;
    public int f21032j0;
    public boolean f21033n;
    public int f21034r;
    public int f21035s;
    public int v;
    public int f21036w;
    public int f21037x;
    public int f21038y;

    public j6() {
        this.f21037x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f21025d0 = new LongSparseArray();
        this.f21026e0 = 0;
        this.f21028f0 = 100;
        this.f21032j0 = -1;
    }

    public static boolean a(i6 i6Var, TLRPC.ThemeSettings themeSettings) {
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
            i14 = k6.Z0(wallPaperSettings.background_color);
            int i16 = themeSettings.wallpaper.settings.second_background_color;
            j12 = 4294967296L;
            if (i16 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = k6.Z0(i16);
            }
            int i17 = themeSettings.wallpaper.settings.third_background_color;
            if (i17 == 0) {
                j11 = 4294967296L;
            } else {
                j11 = k6.Z0(i17);
            }
            int i18 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i18 != 0) {
                j12 = k6.Z0(i18);
            }
            i15 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f7 = wallPaper2.settings.intensity / 100.0f;
                long j13 = j11;
                if (themeSettings.accent_color != i6Var.f20966c && themeSettings.outbox_accent_color == i6Var.d && i10 == i6Var.e && i11 == i6Var.f20967f && i12 == i6Var.f20968g && i13 == i6Var.h && themeSettings.message_colors_animated == i6Var.f20969i && i14 == i6Var.f20970j && j10 == i6Var.f20971k && j13 == i6Var.f20972l && j12 == i6Var.f20973m && i15 == i6Var.f20974n && TextUtils.equals(str, i6Var.f20975o) && Math.abs(f7 - i6Var.f20976p) < 0.001d) {
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
        if (themeSettings.accent_color != i6Var.f20966c) {
        }
        return z10;
    }

    public static void b(j6 j6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        j6Var.W = iArr.length;
        j6Var.f21022b0 = new ArrayList();
        j6Var.f21020a0 = new SparseArray();
        j6Var.f21024c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            i6 i6Var = new i6();
            i6Var.f20964a = iArr8[i10];
            if (k6.j1(i6Var)) {
                i6Var.f20985z = true;
            }
            i6Var.f20966c = iArr[i10];
            i6Var.f20965b = j6Var;
            i6Var.e = iArr2[i10];
            i6Var.f20967f = iArr3[i10];
            long j10 = iArr4[i10];
            i6Var.f20970j = j10;
            boolean z10 = j6Var.S;
            if (z10 && i6Var.f20964a == k6.f21359n) {
                i6Var.f20970j = 4294967296L;
            } else {
                i6Var.f20970j = j10;
            }
            if (z10 && i6Var.f20964a == k6.f21359n) {
                i6Var.f20971k = 4294967296L;
            } else {
                i6Var.f20971k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && i6Var.f20964a == k6.f21359n) {
                    i6Var.f20972l = 4294967296L;
                } else {
                    i6Var.f20972l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && i6Var.f20964a == k6.f21359n) {
                    i6Var.f20973m = 4294967296L;
                } else {
                    i6Var.f20973m = iArr7[i10];
                }
            }
            i6Var.f20976p = iArr10[i10] / 100.0f;
            i6Var.f20974n = iArr9[i10];
            i6Var.f20975o = strArr[i10];
            if ((k6.j1(i6Var) && j6Var.f21019a.equals("Dark Blue")) || j6Var.f21019a.equals("Night")) {
                i6Var.e = -14316059;
                i6Var.f20967f = -12422433;
                i6Var.f20968g = -8304937;
                i6Var.h = -6340950;
                if (j6Var.f21019a.equals("Night")) {
                    i6Var.f20976p = -0.57f;
                    i6Var.f20970j = -9666650L;
                    i6Var.f20971k = -13749173L;
                    i6Var.f20972l = -8883033L;
                    i6Var.f20973m = -13421992L;
                }
            }
            j6Var.f21020a0.put(i6Var.f20964a, i6Var);
            j6Var.f21022b0.add(i6Var);
        }
        j6Var.X = ((i6) j6Var.f21020a0.get(0)).f20966c;
    }

    public static void c(j6 j6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = j6Var.f21022b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = j6Var.f21022b0.size();
            for (int i10 = 0; i10 < size; i10++) {
                i6 i6Var = (i6) j6Var.f21022b0.get(i10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j6Var.f21019a);
                sb2.append("_");
                j6Var.r(sharedPreferences, i6Var, a1.g.n(i6Var.f20964a, "_owp", sb2));
            }
            return;
        }
        j6Var.r(sharedPreferences, null, a1.g.s(new StringBuilder(), j6Var.f21019a, "_owp"));
    }

    public static j6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            j6 j6Var = new j6();
            j6Var.f21019a = jSONObject.getString("name");
            j6Var.f21021b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                j6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                j6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                j6Var.G = jSONObject.getBoolean("loaded");
            }
            return j6Var;
        } catch (Exception e) {
            FileLog.e(e);
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
        j6Var.f21019a = split[0];
        j6Var.f21021b = split[1];
        return j6Var;
    }

    public static void i(i6 i6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i14;
        i6Var.f20966c = themeSettings.accent_color;
        i6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i10 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        i6Var.e = i10;
        if (themeSettings.message_colors.size() > 1) {
            i11 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        i6Var.f20967f = i11;
        if (i6Var.e == i11) {
            i6Var.f20967f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        i6Var.f20968g = i12;
        if (themeSettings.message_colors.size() > 3) {
            i13 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i13 = 0;
        }
        i6Var.h = i13;
        i6Var.f20969i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            if (wallPaperSettings.background_color == 0) {
                i6Var.f20970j = 4294967296L;
            } else {
                i6Var.f20970j = k6.Z0(i14);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                i6Var.f20971k = 4294967296L;
            } else {
                i6Var.f20971k = k6.Z0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                i6Var.f20972l = 4294967296L;
            } else {
                i6Var.f20972l = k6.Z0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                i6Var.f20973m = 4294967296L;
            } else {
                i6Var.f20973m = k6.Z0(wallPaperSettings4.fourth_background_color);
            }
            i6Var.f20974n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                i6Var.f20975o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                i6Var.f20976p = wallPaperSettings5.intensity / 100.0f;
                i6Var.f20977q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f21034r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = yc0.g(this.f21034r, this.f21035s, i10, this.f21036w);
                } else {
                    int i11 = this.f21035s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f21034r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(v9.d(this.f21037x), new int[]{this.f21034r, this.f21035s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.f21034r);
                        canvas.drawColor(this.f21034r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.f21038y / 100.0f) * 255.0f));
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
                if (str.equals(this.f21029g0)) {
                    this.f21029g0 = null;
                    Utilities.globalQueue.postRunnable(new m4.z(28, this, (File) objArr[1]));
                } else if (str.equals(FileLoader.getAttachFileName(this.F.document))) {
                    t();
                    if (i10 == i12) {
                        File file = new File(this.f21021b);
                        TLRPC.TL_theme tL_theme2 = this.F;
                        j6 l02 = k6.l0(file, tL_theme2.title, tL_theme2);
                        if (l02 != null && l02.f21023c != null && !new File(l02.f21023c).exists()) {
                            this.f21034r = l02.f21034r;
                            this.f21035s = l02.f21035s;
                            this.v = l02.v;
                            this.f21036w = l02.f21036w;
                            this.f21037x = l02.f21037x;
                            this.h = l02.h;
                            this.f21038y = l02.f21038y;
                            this.f21030h0 = l02.f21023c;
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

    public final i6 e(long j10, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.f21025d0;
            i6 i6Var = (i6) longSparseArray.get(j10);
            if (i6Var != null) {
                return i6Var;
            }
            int i11 = this.f21026e0 + 1;
            this.f21026e0 = i11;
            i6 i6Var2 = new i6();
            i(i6Var2, themeSettings);
            i6Var2.f20965b = this;
            i6Var2.f20964a = i11;
            i6Var2.f20978r = tL_theme;
            i6Var2.f20980t = i10;
            longSparseArray.put(i11, i6Var2);
            return i6Var2;
        }
        i6 i6Var3 = (i6) this.f21024c0.get(j10);
        if (i6Var3 != null) {
            return i6Var3;
        }
        int i12 = this.f21028f0 + 1;
        this.f21028f0 = i12;
        i6 i6Var4 = new i6();
        i(i6Var4, themeSettings);
        i6Var4.f20965b = this;
        i6Var4.f20964a = i12;
        i6Var4.f20978r = tL_theme;
        i6Var4.f20980t = i10;
        this.f21020a0.put(i12, i6Var4);
        this.f21022b0.add(0, i6Var4);
        k6.G1(this);
        this.f21024c0.put(j10, i6Var4);
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
        return e(tL_theme.f20480id, themeSettings, tL_theme, i10, false);
    }

    public final String j(i6 i6Var, boolean z10) {
        String s10;
        String n10;
        if (i6Var == null) {
            i6Var = k(false);
        }
        if (i6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f21019a);
                sb3.append("_");
                n10 = a1.g.n(i6Var.f20964a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f21019a);
                sb4.append("_");
                n10 = a1.g.n(i6Var.f20964a, "_wp", sb4);
            }
            sb2.append(n10);
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            s10 = a1.g.s(new StringBuilder(), this.f21019a, "_wp_o");
        } else {
            s10 = a1.g.s(new StringBuilder(), this.f21019a, "_wp");
        }
        sb5.append(s10);
        sb5.append(Utilities.random.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final i6 k(boolean z10) {
        i6 i6Var;
        if (this.f21022b0 == null || (i6Var = (i6) this.f21020a0.get(this.Y)) == null) {
            return null;
        }
        if (z10) {
            int i10 = this.f21028f0 + 1;
            this.f21028f0 = i10;
            i6 i6Var2 = new i6();
            i6Var2.f20966c = i6Var.f20966c;
            i6Var2.d = i6Var.d;
            i6Var2.e = i6Var.e;
            i6Var2.f20967f = i6Var.f20967f;
            i6Var2.f20968g = i6Var.f20968g;
            i6Var2.h = i6Var.h;
            i6Var2.f20969i = i6Var.f20969i;
            i6Var2.f20970j = i6Var.f20970j;
            i6Var2.f20971k = i6Var.f20971k;
            i6Var2.f20972l = i6Var.f20972l;
            i6Var2.f20973m = i6Var.f20973m;
            i6Var2.f20974n = i6Var.f20974n;
            i6Var2.f20975o = i6Var.f20975o;
            i6Var2.f20976p = i6Var.f20976p;
            i6Var2.f20977q = i6Var.f20977q;
            i6Var2.f20965b = this;
            d6 d6Var = this.f21031i0;
            if (d6Var != null) {
                ?? obj = new Object();
                obj.f20815a = "";
                obj.f20816b = "";
                obj.f20817c = "";
                obj.f20817c = d6Var.f20817c;
                obj.d = d6Var.d;
                obj.e = d6Var.e;
                obj.f20818f = d6Var.f20818f;
                obj.f20819g = d6Var.f20819g;
                obj.h = d6Var.h;
                obj.f20820i = d6Var.f20820i;
                obj.f20821j = d6Var.f20821j;
                obj.f20822k = d6Var.f20822k;
                obj.f20827p = this;
                obj.f20828q = i6Var2;
                if (!TextUtils.isEmpty(d6Var.f20815a)) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), d6Var.f20815a);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String j10 = obj.f20827p.j(obj.f20828q, false);
                        obj.f20815a = j10;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, j10));
                    } catch (Exception e) {
                        obj.f20815a = "";
                        FileLog.e(e);
                    }
                } else {
                    obj.f20815a = "";
                }
                if (!TextUtils.isEmpty(d6Var.f20816b)) {
                    if (!d6Var.f20816b.equals(d6Var.f20815a)) {
                        try {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), d6Var.f20816b);
                            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                            String j11 = obj.f20827p.j(obj.f20828q, true);
                            obj.f20816b = j11;
                            AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j11));
                        } catch (Exception e7) {
                            obj.f20816b = "";
                            FileLog.e(e7);
                        }
                    } else {
                        obj.f20816b = obj.f20815a;
                    }
                } else {
                    obj.f20816b = "";
                }
                i6Var2.f20984y = obj;
            }
            this.Z = this.Y;
            i6Var2.f20964a = i10;
            this.Y = i10;
            this.f21031i0 = i6Var2.f20984y;
            this.f21020a0.put(i10, i6Var2);
            this.f21022b0.add(0, i6Var2);
            k6.G1(this);
            return i6Var2;
        }
        return i6Var;
    }

    public final int l(int i10) {
        i6 i6Var = (i6) this.f21020a0.get(i10);
        if (i6Var != null) {
            return i6Var.f20966c;
        }
        return 0;
    }

    public final String m() {
        if (this.F != null) {
            return "remote" + this.F.f20480id;
        }
        return this.f21019a;
    }

    public final String n() {
        if ("Blue".equals(this.f21019a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.f21019a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.f21019a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.f21019a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.f21019a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.F;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f21019a;
    }

    public final int o() {
        if (this.S && this.Y == k6.f21359n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == k6.f21359n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i10 = this.f21032j0;
        if (i10 != -1) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f21019a) && !"Night".equals(this.f21019a)) {
            if ("Blue".equals(this.f21019a) || "Arctic Blue".equals(this.f21019a) || "Day".equals(this.f21019a)) {
                this.f21032j0 = 0;
            }
        } else {
            this.f21032j0 = 1;
        }
        if (this.f21032j0 == -1) {
            k6.G(k6.S0(new File(this.f21021b), null, new String[1]), this);
        }
        if (this.f21032j0 != 1) {
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
                d6Var.f20815a = jSONObject.getString("wall");
                d6Var.f20816b = jSONObject.getString("owall");
                d6Var.d = jSONObject.getInt("pColor");
                d6Var.e = jSONObject.getInt("pGrColor");
                d6Var.f20818f = jSONObject.optInt("pGrColor2");
                d6Var.f20819g = jSONObject.optInt("pGrColor3");
                d6Var.h = jSONObject.getInt("pGrAngle");
                d6Var.f20817c = jSONObject.getString("wallSlug");
                d6Var.f20820i = jSONObject.getBoolean("wBlur");
                d6Var.f20821j = jSONObject.getBoolean("wMotion");
                d6Var.f20822k = (float) jSONObject.getDouble("pIntensity");
                d6Var.f20827p = this;
                d6Var.f20828q = i6Var;
                if (i6Var != null) {
                    i6Var.f20984y = d6Var;
                } else {
                    this.f21031i0 = d6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    d6Var.f20817c = "d";
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
        k6.v1(true, false);
        if (this == k6.I && k6.M == null) {
            if (this != k6.J) {
                z10 = false;
            }
            k6.H1(this, z10, -1, null);
        }
    }

    public final void t() {
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.fileLoadFailed);
    }

    public final void u(int i10) {
        this.Y = i10;
        i6 k10 = k(false);
        if (k10 != null) {
            this.f21031i0 = k10.f20984y;
        }
    }

    public final void v(d6 d6Var) {
        if (this.f21031i0 != d6Var) {
            i6 k10 = k(false);
            d6 d6Var2 = this.f21031i0;
            if (d6Var2 != null) {
                d6.a(d6Var2);
            }
            if (d6Var != null) {
                d6Var.f20828q = k10;
                d6Var.f20827p = this;
                d6Var.c();
            }
            this.f21031i0 = d6Var;
            if (k10 != null) {
                k10.f20984y = d6Var;
            }
        }
    }

    public j6(j6 j6Var) {
        this.f21037x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f21025d0 = new LongSparseArray();
        this.f21026e0 = 0;
        this.f21028f0 = 100;
        this.f21032j0 = -1;
        this.f21019a = j6Var.f21019a;
        this.f21021b = j6Var.f21021b;
        this.f21023c = j6Var.f21023c;
        this.d = j6Var.d;
        this.e = j6Var.e;
        this.f21027f = j6Var.f21027f;
        this.h = j6Var.h;
        this.f21033n = j6Var.f21033n;
        this.f21034r = j6Var.f21034r;
        this.f21035s = j6Var.f21035s;
        this.v = j6Var.v;
        this.f21036w = j6Var.f21036w;
        this.f21037x = j6Var.f21037x;
        this.f21038y = j6Var.f21038y;
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
        this.f21020a0 = j6Var.f21020a0;
        this.f21022b0 = j6Var.f21022b0;
        this.f21024c0 = j6Var.f21024c0;
        this.f21028f0 = j6Var.f21028f0;
        this.f21029g0 = j6Var.f21029g0;
        this.f21030h0 = j6Var.f21030h0;
        this.f21031i0 = j6Var.f21031i0;
    }
}
