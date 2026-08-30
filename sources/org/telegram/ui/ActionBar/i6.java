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
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.o9;
public final class i6 implements NotificationCenter.NotificationCenterDelegate {
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
    public String f19805a;
    public final LongSparseArray f19806a0;
    public String f19807b;
    public int f19808b0;
    public String f19809c;
    public int f19810c0;
    public String d;
    public String f19811d0;
    public String e;
    public String f19812e0;
    public boolean f19813f;
    public c6 f19814f0;
    public int f19815g0;
    public boolean h;
    public boolean f19816n;
    public int f19817r;
    public int f19818s;
    public int v;
    public int f19819w;
    public int f19820x;
    public int f19821y;

    public i6() {
        this.f19820x = 45;
        this.D = true;
        this.R = true;
        this.W = -1;
        this.f19806a0 = new LongSparseArray();
        this.f19808b0 = 0;
        this.f19810c0 = 100;
        this.f19815g0 = -1;
    }

    public static boolean a(h6 h6Var, TLRPC.ThemeSettings themeSettings) {
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
            i14 = j6.X0(wallPaperSettings.background_color);
            int i16 = themeSettings.wallpaper.settings.second_background_color;
            j12 = 4294967296L;
            if (i16 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = j6.X0(i16);
            }
            int i17 = themeSettings.wallpaper.settings.third_background_color;
            if (i17 == 0) {
                j11 = 4294967296L;
            } else {
                j11 = j6.X0(i17);
            }
            int i18 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i18 != 0) {
                j12 = j6.X0(i18);
            }
            i15 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z4 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z10 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
                long j13 = j11;
                if (themeSettings.accent_color != h6Var.f19763c && themeSettings.outbox_accent_color == h6Var.d && i10 == h6Var.e && i11 == h6Var.f19764f && i12 == h6Var.f19765g && i13 == h6Var.h && themeSettings.message_colors_animated == h6Var.f19766i && i14 == h6Var.f19767j && j10 == h6Var.f19768k && j13 == h6Var.f19769l && j12 == h6Var.f19770m && i15 == h6Var.f19771n && TextUtils.equals(str, h6Var.f19772o) && Math.abs(f10 - h6Var.f19773p) < 0.001d) {
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
        if (themeSettings.accent_color != h6Var.f19763c) {
        }
        return z4;
    }

    public static void b(i6 i6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        i6Var.T = iArr.length;
        i6Var.Y = new ArrayList();
        i6Var.X = new SparseArray();
        i6Var.Z = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            h6 h6Var = new h6();
            h6Var.f19761a = iArr8[i10];
            if (j6.g1(h6Var)) {
                h6Var.f19782z = true;
            }
            h6Var.f19763c = iArr[i10];
            h6Var.f19762b = i6Var;
            h6Var.e = iArr2[i10];
            h6Var.f19764f = iArr3[i10];
            long j10 = iArr4[i10];
            h6Var.f19767j = j10;
            boolean z4 = i6Var.P;
            if (z4 && h6Var.f19761a == j6.f20078n) {
                h6Var.f19767j = 4294967296L;
            } else {
                h6Var.f19767j = j10;
            }
            if (z4 && h6Var.f19761a == j6.f20078n) {
                h6Var.f19768k = 4294967296L;
            } else {
                h6Var.f19768k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z4 && h6Var.f19761a == j6.f20078n) {
                    h6Var.f19769l = 4294967296L;
                } else {
                    h6Var.f19769l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z4 && h6Var.f19761a == j6.f20078n) {
                    h6Var.f19770m = 4294967296L;
                } else {
                    h6Var.f19770m = iArr7[i10];
                }
            }
            h6Var.f19773p = iArr10[i10] / 100.0f;
            h6Var.f19771n = iArr9[i10];
            h6Var.f19772o = strArr[i10];
            if ((j6.g1(h6Var) && i6Var.f19805a.equals("Dark Blue")) || i6Var.f19805a.equals("Night")) {
                h6Var.e = -14316059;
                h6Var.f19764f = -12422433;
                h6Var.f19765g = -8304937;
                h6Var.h = -6340950;
                if (i6Var.f19805a.equals("Night")) {
                    h6Var.f19773p = -0.57f;
                    h6Var.f19767j = -9666650L;
                    h6Var.f19768k = -13749173L;
                    h6Var.f19769l = -8883033L;
                    h6Var.f19770m = -13421992L;
                }
            }
            i6Var.X.put(h6Var.f19761a, h6Var);
            i6Var.Y.add(h6Var);
        }
        i6Var.U = ((h6) i6Var.X.get(0)).f19763c;
    }

    public static void c(i6 i6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = i6Var.Y;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = i6Var.Y.size();
            for (int i10 = 0; i10 < size; i10++) {
                h6 h6Var = (h6) i6Var.Y.get(i10);
                StringBuilder sb = new StringBuilder();
                sb.append(i6Var.f19805a);
                sb.append("_");
                i6Var.r(sharedPreferences, h6Var, android.support.v4.media.a.m(h6Var.f19761a, "_owp", sb));
            }
            return;
        }
        i6Var.r(sharedPreferences, null, android.support.v4.media.a.r(new StringBuilder(), i6Var.f19805a, "_owp"));
    }

    public static i6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            i6 i6Var = new i6();
            i6Var.f19805a = jSONObject.getString("name");
            i6Var.f19807b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                i6Var.B = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                i6Var.C = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                i6Var.D = jSONObject.getBoolean("loaded");
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
        i6Var.f19805a = split[0];
        i6Var.f19807b = split[1];
        return i6Var;
    }

    public static void i(h6 h6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        h6Var.f19763c = themeSettings.accent_color;
        h6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i10 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        h6Var.e = i10;
        if (themeSettings.message_colors.size() > 1) {
            i11 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        h6Var.f19764f = i11;
        if (h6Var.e == i11) {
            h6Var.f19764f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        h6Var.f19765g = i12;
        if (themeSettings.message_colors.size() > 3) {
            i13 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i13 = 0;
        }
        h6Var.h = i13;
        h6Var.f19766i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            int i14 = wallPaperSettings.background_color;
            if (i14 == 0) {
                h6Var.f19767j = 4294967296L;
            } else {
                h6Var.f19767j = j6.X0(i14);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                h6Var.f19768k = 4294967296L;
            } else {
                h6Var.f19768k = j6.X0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                h6Var.f19769l = 4294967296L;
            } else {
                h6Var.f19769l = j6.X0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                h6Var.f19770m = 4294967296L;
            } else {
                h6Var.f19770m = j6.X0(wallPaperSettings4.fourth_background_color);
            }
            h6Var.f19771n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                h6Var.f19772o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                h6Var.f19773p = wallPaperSettings5.intensity / 100.0f;
                h6Var.f19774q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f19817r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = dc0.g(this.f19817r, this.f19818s, i10, this.f19819w);
                } else {
                    int i11 = this.f19818s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f19817r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(o9.d(this.f19820x), new int[]{this.f19817r, this.f19818s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.f19817r);
                        canvas.drawColor(this.f19817r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.f19821y / 100.0f) * 255.0f));
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
                if (str.equals(this.f19811d0)) {
                    this.f19811d0 = null;
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.b(14, this, (File) objArr[1]));
                } else if (str.equals(FileLoader.getAttachFileName(this.C.document))) {
                    t();
                    if (i10 == i12) {
                        File file = new File(this.f19807b);
                        TLRPC.TL_theme tL_theme2 = this.C;
                        i6 k02 = j6.k0(file, tL_theme2.title, tL_theme2);
                        if (k02 != null && k02.f19809c != null && !new File(k02.f19809c).exists()) {
                            this.f19817r = k02.f19817r;
                            this.f19818s = k02.f19818s;
                            this.v = k02.v;
                            this.f19819w = k02.f19819w;
                            this.f19820x = k02.f19820x;
                            this.h = k02.h;
                            this.f19821y = k02.f19821y;
                            this.f19812e0 = k02.f19809c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = k02.e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(k02.B).sendRequest(getwallpaper, new dg.d3(21, this, k02));
                            return;
                        }
                        s();
                    }
                }
            }
        }
    }

    public final h6 e(long j10, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z4) {
        if (z4) {
            LongSparseArray longSparseArray = this.f19806a0;
            h6 h6Var = (h6) longSparseArray.get(j10);
            if (h6Var != null) {
                return h6Var;
            }
            int i11 = this.f19808b0 + 1;
            this.f19808b0 = i11;
            h6 h6Var2 = new h6();
            i(h6Var2, themeSettings);
            h6Var2.f19762b = this;
            h6Var2.f19761a = i11;
            h6Var2.f19775r = tL_theme;
            h6Var2.f19777t = i10;
            longSparseArray.put(i11, h6Var2);
            return h6Var2;
        }
        h6 h6Var3 = (h6) this.Z.get(j10);
        if (h6Var3 != null) {
            return h6Var3;
        }
        int i12 = this.f19810c0 + 1;
        this.f19810c0 = i12;
        h6 h6Var4 = new h6();
        i(h6Var4, themeSettings);
        h6Var4.f19762b = this;
        h6Var4.f19761a = i12;
        h6Var4.f19775r = tL_theme;
        h6Var4.f19777t = i10;
        this.X.put(i12, h6Var4);
        this.Y.add(0, h6Var4);
        j6.D1(this);
        this.Z.put(j10, h6Var4);
        return h6Var4;
    }

    public final h6 f(TLRPC.TL_theme tL_theme, int i10, int i11) {
        TLRPC.ThemeSettings themeSettings = null;
        if (tL_theme == null) {
            return null;
        }
        if (i11 < tL_theme.settings.size()) {
            themeSettings = tL_theme.settings.get(i11);
        }
        return e(tL_theme.f19321id, themeSettings, tL_theme, i10, false);
    }

    public final String j(h6 h6Var, boolean z4) {
        String r10;
        String m9;
        if (h6Var == null) {
            h6Var = k(false);
        }
        if (h6Var != null) {
            StringBuilder sb = new StringBuilder();
            if (z4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f19805a);
                sb2.append("_");
                m9 = android.support.v4.media.a.m(h6Var.f19761a, "_wp_o", sb2);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f19805a);
                sb3.append("_");
                m9 = android.support.v4.media.a.m(h6Var.f19761a, "_wp", sb3);
            }
            sb.append(m9);
            sb.append(Utilities.random.nextInt());
            sb.append(".jpg");
            return sb.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        if (z4) {
            r10 = android.support.v4.media.a.r(new StringBuilder(), this.f19805a, "_wp_o");
        } else {
            r10 = android.support.v4.media.a.r(new StringBuilder(), this.f19805a, "_wp");
        }
        sb4.append(r10);
        sb4.append(Utilities.random.nextInt());
        sb4.append(".jpg");
        return sb4.toString();
    }

    public final h6 k(boolean z4) {
        h6 h6Var;
        if (this.Y == null || (h6Var = (h6) this.X.get(this.V)) == null) {
            return null;
        }
        if (z4) {
            int i10 = this.f19810c0 + 1;
            this.f19810c0 = i10;
            h6 h6Var2 = new h6();
            h6Var2.f19763c = h6Var.f19763c;
            h6Var2.d = h6Var.d;
            h6Var2.e = h6Var.e;
            h6Var2.f19764f = h6Var.f19764f;
            h6Var2.f19765g = h6Var.f19765g;
            h6Var2.h = h6Var.h;
            h6Var2.f19766i = h6Var.f19766i;
            h6Var2.f19767j = h6Var.f19767j;
            h6Var2.f19768k = h6Var.f19768k;
            h6Var2.f19769l = h6Var.f19769l;
            h6Var2.f19770m = h6Var.f19770m;
            h6Var2.f19771n = h6Var.f19771n;
            h6Var2.f19772o = h6Var.f19772o;
            h6Var2.f19773p = h6Var.f19773p;
            h6Var2.f19774q = h6Var.f19774q;
            h6Var2.f19762b = this;
            c6 c6Var = this.f19814f0;
            if (c6Var != null) {
                ?? obj = new Object();
                obj.f19554a = "";
                obj.f19555b = "";
                obj.f19556c = "";
                obj.f19556c = c6Var.f19556c;
                obj.d = c6Var.d;
                obj.e = c6Var.e;
                obj.f19557f = c6Var.f19557f;
                obj.f19558g = c6Var.f19558g;
                obj.h = c6Var.h;
                obj.f19559i = c6Var.f19559i;
                obj.f19560j = c6Var.f19560j;
                obj.f19561k = c6Var.f19561k;
                obj.f19566p = this;
                obj.f19567q = h6Var2;
                if (!TextUtils.isEmpty(c6Var.f19554a)) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), c6Var.f19554a);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String j10 = obj.f19566p.j(obj.f19567q, false);
                        obj.f19554a = j10;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, j10));
                    } catch (Exception e) {
                        obj.f19554a = "";
                        FileLog.e(e);
                    }
                } else {
                    obj.f19554a = "";
                }
                if (!TextUtils.isEmpty(c6Var.f19555b)) {
                    if (!c6Var.f19555b.equals(c6Var.f19554a)) {
                        try {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), c6Var.f19555b);
                            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                            String j11 = obj.f19566p.j(obj.f19567q, true);
                            obj.f19555b = j11;
                            AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j11));
                        } catch (Exception e6) {
                            obj.f19555b = "";
                            FileLog.e(e6);
                        }
                    } else {
                        obj.f19555b = obj.f19554a;
                    }
                } else {
                    obj.f19555b = "";
                }
                h6Var2.f19781y = obj;
            }
            this.W = this.V;
            h6Var2.f19761a = i10;
            this.V = i10;
            this.f19814f0 = h6Var2.f19781y;
            this.X.put(i10, h6Var2);
            this.Y.add(0, h6Var2);
            j6.D1(this);
            return h6Var2;
        }
        return h6Var;
    }

    public final int l(int i10) {
        h6 h6Var = (h6) this.X.get(i10);
        if (h6Var != null) {
            return h6Var.f19763c;
        }
        return 0;
    }

    public final String m() {
        if (this.C != null) {
            return "remote" + this.C.f19321id;
        }
        return this.f19805a;
    }

    public final String n() {
        if ("Blue".equals(this.f19805a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.f19805a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.f19805a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.f19805a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.f19805a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.C;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f19805a;
    }

    public final int o() {
        if (this.P && this.V == j6.f20078n) {
            return -3155485;
        }
        return this.I;
    }

    public final int p() {
        if (this.P && this.V == j6.f20078n) {
            return -983328;
        }
        return this.O;
    }

    public final boolean q() {
        int i10 = this.f19815g0;
        if (i10 != -1) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f19805a) && !"Night".equals(this.f19805a)) {
            if ("Blue".equals(this.f19805a) || "Arctic Blue".equals(this.f19805a) || "Day".equals(this.f19805a)) {
                this.f19815g0 = 0;
            }
        } else {
            this.f19815g0 = 1;
        }
        if (this.f19815g0 == -1) {
            j6.G(j6.Q0(new File(this.f19807b), null, new String[1]), this);
        }
        if (this.f19815g0 != 1) {
            return false;
        }
        return true;
    }

    public final void r(SharedPreferences sharedPreferences, h6 h6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                c6 c6Var = new c6();
                c6Var.f19554a = jSONObject.getString("wall");
                c6Var.f19555b = jSONObject.getString("owall");
                c6Var.d = jSONObject.getInt("pColor");
                c6Var.e = jSONObject.getInt("pGrColor");
                c6Var.f19557f = jSONObject.optInt("pGrColor2");
                c6Var.f19558g = jSONObject.optInt("pGrColor3");
                c6Var.h = jSONObject.getInt("pGrAngle");
                c6Var.f19556c = jSONObject.getString("wallSlug");
                c6Var.f19559i = jSONObject.getBoolean("wBlur");
                c6Var.f19560j = jSONObject.getBoolean("wMotion");
                c6Var.f19561k = (float) jSONObject.getDouble("pIntensity");
                c6Var.f19566p = this;
                c6Var.f19567q = h6Var;
                if (h6Var != null) {
                    h6Var.f19781y = c6Var;
                } else {
                    this.f19814f0 = c6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    c6Var.f19556c = "d";
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
        j6.s1(true, false);
        if (this == j6.I && j6.M == null) {
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i10 = NotificationCenter.needSetDayNightTheme;
            if (this == j6.J) {
                z4 = true;
            } else {
                z4 = false;
            }
            globalInstance.lambda$postNotificationNameOnUIThread$1(i10, this, Boolean.valueOf(z4), null, -1, j6.ol);
        }
    }

    public final void t() {
        NotificationCenter.getInstance(this.B).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.B).removeObserver(this, NotificationCenter.fileLoadFailed);
    }

    public final void u(int i10) {
        this.V = i10;
        h6 k10 = k(false);
        if (k10 != null) {
            this.f19814f0 = k10.f19781y;
        }
    }

    public final void v(c6 c6Var) {
        if (this.f19814f0 != c6Var) {
            h6 k10 = k(false);
            c6 c6Var2 = this.f19814f0;
            if (c6Var2 != null) {
                c6.a(c6Var2);
            }
            if (c6Var != null) {
                c6Var.f19567q = k10;
                c6Var.f19566p = this;
                c6Var.c();
            }
            this.f19814f0 = c6Var;
            if (k10 != null) {
                k10.f19781y = c6Var;
            }
        }
    }

    public i6(i6 i6Var) {
        this.f19820x = 45;
        this.D = true;
        this.R = true;
        this.W = -1;
        this.f19806a0 = new LongSparseArray();
        this.f19808b0 = 0;
        this.f19810c0 = 100;
        this.f19815g0 = -1;
        this.f19805a = i6Var.f19805a;
        this.f19807b = i6Var.f19807b;
        this.f19809c = i6Var.f19809c;
        this.d = i6Var.d;
        this.e = i6Var.e;
        this.f19813f = i6Var.f19813f;
        this.h = i6Var.h;
        this.f19816n = i6Var.f19816n;
        this.f19817r = i6Var.f19817r;
        this.f19818s = i6Var.f19818s;
        this.v = i6Var.v;
        this.f19819w = i6Var.f19819w;
        this.f19820x = i6Var.f19820x;
        this.f19821y = i6Var.f19821y;
        this.B = i6Var.B;
        this.C = i6Var.C;
        this.D = i6Var.D;
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
        this.f19810c0 = i6Var.f19810c0;
        this.f19811d0 = i6Var.f19811d0;
        this.f19812e0 = i6Var.f19812e0;
        this.f19814f0 = i6Var.f19814f0;
    }
}
