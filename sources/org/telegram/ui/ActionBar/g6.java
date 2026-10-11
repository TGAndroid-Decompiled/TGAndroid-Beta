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
import org.telegram.ui.Components.dd0;
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
    public String f20655a;
    public SparseArray f20656a0;
    public String f20657b;
    public ArrayList f20658b0;
    public String f20659c;
    public LongSparseArray f20660c0;
    public String d;
    public final LongSparseArray f20661d0;
    public String f20662e;
    public int f20663e0;
    public boolean f20664f;
    public int f20665f0;
    public String f20666g0;
    public boolean h;
    public String f20667h0;
    public z5 f20668i0;
    public int f20669j0;
    public boolean f20670n;
    public int f20671r;
    public int f20672s;
    public int v;
    public int f20673w;
    public int f20674x;
    public int f20675y;

    public g6() {
        this.f20674x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f20661d0 = new LongSparseArray();
        this.f20663e0 = 0;
        this.f20665f0 = 100;
        this.f20669j0 = -1;
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
                if (themeSettings.accent_color != f6Var.f20608c && themeSettings.outbox_accent_color == f6Var.d && i10 == f6Var.f20609e && i11 == f6Var.f20610f && i12 == f6Var.f20611g && i13 == f6Var.h && themeSettings.message_colors_animated == f6Var.f20612i && i14 == f6Var.f20613j && j3 == f6Var.f20614k && j12 == f6Var.f20615l && j11 == f6Var.f20616m && i15 == f6Var.f20617n && TextUtils.equals(str, f6Var.f20618o) && Math.abs(f7 - f6Var.f20619p) < 0.001d) {
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
        if (themeSettings.accent_color != f6Var.f20608c) {
        }
        return z10;
    }

    public static void b(g6 g6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        g6Var.W = iArr.length;
        g6Var.f20658b0 = new ArrayList();
        g6Var.f20656a0 = new SparseArray();
        g6Var.f20660c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            f6 f6Var = new f6();
            f6Var.f20606a = iArr8[i10];
            if (h6.h1(f6Var)) {
                f6Var.f20628z = true;
            }
            f6Var.f20608c = iArr[i10];
            f6Var.f20607b = g6Var;
            f6Var.f20609e = iArr2[i10];
            f6Var.f20610f = iArr3[i10];
            long j3 = iArr4[i10];
            f6Var.f20613j = j3;
            boolean z10 = g6Var.S;
            if (z10 && f6Var.f20606a == h6.f20964n) {
                f6Var.f20613j = 4294967296L;
            } else {
                f6Var.f20613j = j3;
            }
            if (z10 && f6Var.f20606a == h6.f20964n) {
                f6Var.f20614k = 4294967296L;
            } else {
                f6Var.f20614k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && f6Var.f20606a == h6.f20964n) {
                    f6Var.f20615l = 4294967296L;
                } else {
                    f6Var.f20615l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && f6Var.f20606a == h6.f20964n) {
                    f6Var.f20616m = 4294967296L;
                } else {
                    f6Var.f20616m = iArr7[i10];
                }
            }
            f6Var.f20619p = iArr10[i10] / 100.0f;
            f6Var.f20617n = iArr9[i10];
            f6Var.f20618o = strArr[i10];
            if ((h6.h1(f6Var) && g6Var.f20655a.equals("Dark Blue")) || g6Var.f20655a.equals("Night")) {
                f6Var.f20609e = -14316059;
                f6Var.f20610f = -12422433;
                f6Var.f20611g = -8304937;
                f6Var.h = -6340950;
                if (g6Var.f20655a.equals("Night")) {
                    f6Var.f20619p = -0.57f;
                    f6Var.f20613j = -9666650L;
                    f6Var.f20614k = -13749173L;
                    f6Var.f20615l = -8883033L;
                    f6Var.f20616m = -13421992L;
                }
            }
            g6Var.f20656a0.put(f6Var.f20606a, f6Var);
            g6Var.f20658b0.add(f6Var);
        }
        g6Var.X = ((f6) g6Var.f20656a0.get(0)).f20608c;
    }

    public static void c(g6 g6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = g6Var.f20658b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = g6Var.f20658b0.size();
            for (int i10 = 0; i10 < size; i10++) {
                f6 f6Var = (f6) g6Var.f20658b0.get(i10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(g6Var.f20655a);
                sb2.append("_");
                g6Var.r(sharedPreferences, f6Var, a1.g.o(f6Var.f20606a, "_owp", sb2));
            }
            return;
        }
        g6Var.r(sharedPreferences, null, a1.g.t(new StringBuilder(), g6Var.f20655a, "_owp"));
    }

    public static g6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            g6 g6Var = new g6();
            g6Var.f20655a = jSONObject.getString("name");
            g6Var.f20657b = jSONObject.getString("path");
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
        g6Var.f20655a = split[0];
        g6Var.f20657b = split[1];
        return g6Var;
    }

    public static void i(f6 f6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i14;
        f6Var.f20608c = themeSettings.accent_color;
        f6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i10 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        f6Var.f20609e = i10;
        if (themeSettings.message_colors.size() > 1) {
            i11 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        f6Var.f20610f = i11;
        if (f6Var.f20609e == i11) {
            f6Var.f20610f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        f6Var.f20611g = i12;
        if (themeSettings.message_colors.size() > 3) {
            i13 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i13 = 0;
        }
        f6Var.h = i13;
        f6Var.f20612i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            if (wallPaperSettings.background_color == 0) {
                f6Var.f20613j = 4294967296L;
            } else {
                f6Var.f20613j = h6.Y0(i14);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                f6Var.f20614k = 4294967296L;
            } else {
                f6Var.f20614k = h6.Y0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                f6Var.f20615l = 4294967296L;
            } else {
                f6Var.f20615l = h6.Y0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                f6Var.f20616m = 4294967296L;
            } else {
                f6Var.f20616m = h6.Y0(wallPaperSettings4.fourth_background_color);
            }
            f6Var.f20617n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                f6Var.f20618o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                f6Var.f20619p = wallPaperSettings5.intensity / 100.0f;
                f6Var.f20620q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f20671r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = dd0.g(this.f20671r, this.f20672s, i10, this.f20673w);
                } else {
                    int i11 = this.f20672s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f20671r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(x9.d(this.f20674x), new int[]{this.f20671r, this.f20672s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.f20671r);
                        canvas.drawColor(this.f20671r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.f20675y / 100.0f) * 255.0f));
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
                if (str.equals(this.f20666g0)) {
                    this.f20666g0 = null;
                    Utilities.globalQueue.postRunnable(new a6(2, this, (File) objArr[1]));
                } else if (str.equals(FileLoader.getAttachFileName(this.F.document))) {
                    t();
                    if (i10 == i12) {
                        File file = new File(this.f20657b);
                        TLRPC.TL_theme tL_theme2 = this.F;
                        g6 l02 = h6.l0(file, tL_theme2.title, tL_theme2);
                        if (l02 != null && l02.f20659c != null && !new File(l02.f20659c).exists()) {
                            this.f20671r = l02.f20671r;
                            this.f20672s = l02.f20672s;
                            this.v = l02.v;
                            this.f20673w = l02.f20673w;
                            this.f20674x = l02.f20674x;
                            this.h = l02.h;
                            this.f20675y = l02.f20675y;
                            this.f20667h0 = l02.f20659c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = l02.f20662e;
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

    public final f6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.f20661d0;
            f6 f6Var = (f6) longSparseArray.get(j3);
            if (f6Var != null) {
                return f6Var;
            }
            int i11 = this.f20663e0 + 1;
            this.f20663e0 = i11;
            f6 f6Var2 = new f6();
            i(f6Var2, themeSettings);
            f6Var2.f20607b = this;
            f6Var2.f20606a = i11;
            f6Var2.f20621r = tL_theme;
            f6Var2.f20623t = i10;
            longSparseArray.put(i11, f6Var2);
            return f6Var2;
        }
        f6 f6Var3 = (f6) this.f20660c0.get(j3);
        if (f6Var3 != null) {
            return f6Var3;
        }
        int i12 = this.f20665f0 + 1;
        this.f20665f0 = i12;
        f6 f6Var4 = new f6();
        i(f6Var4, themeSettings);
        f6Var4.f20607b = this;
        f6Var4.f20606a = i12;
        f6Var4.f20621r = tL_theme;
        f6Var4.f20623t = i10;
        this.f20656a0.put(i12, f6Var4);
        this.f20658b0.add(0, f6Var4);
        h6.E1(this);
        this.f20660c0.put(j3, f6Var4);
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
        return e(tL_theme.f20169id, themeSettings, tL_theme, i10, false);
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
                sb3.append(this.f20655a);
                sb3.append("_");
                o9 = a1.g.o(f6Var.f20606a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f20655a);
                sb4.append("_");
                o9 = a1.g.o(f6Var.f20606a, "_wp", sb4);
            }
            sb2.append(o9);
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            t10 = a1.g.t(new StringBuilder(), this.f20655a, "_wp_o");
        } else {
            t10 = a1.g.t(new StringBuilder(), this.f20655a, "_wp");
        }
        sb5.append(t10);
        sb5.append(Utilities.random.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final f6 k(boolean z10) {
        f6 f6Var;
        if (this.f20658b0 == null || (f6Var = (f6) this.f20656a0.get(this.Y)) == null) {
            return null;
        }
        if (z10) {
            int i10 = this.f20665f0 + 1;
            this.f20665f0 = i10;
            f6 f6Var2 = new f6();
            f6Var2.f20608c = f6Var.f20608c;
            f6Var2.d = f6Var.d;
            f6Var2.f20609e = f6Var.f20609e;
            f6Var2.f20610f = f6Var.f20610f;
            f6Var2.f20611g = f6Var.f20611g;
            f6Var2.h = f6Var.h;
            f6Var2.f20612i = f6Var.f20612i;
            f6Var2.f20613j = f6Var.f20613j;
            f6Var2.f20614k = f6Var.f20614k;
            f6Var2.f20615l = f6Var.f20615l;
            f6Var2.f20616m = f6Var.f20616m;
            f6Var2.f20617n = f6Var.f20617n;
            f6Var2.f20618o = f6Var.f20618o;
            f6Var2.f20619p = f6Var.f20619p;
            f6Var2.f20620q = f6Var.f20620q;
            f6Var2.f20607b = this;
            z5 z5Var = this.f20668i0;
            if (z5Var != null) {
                ?? obj = new Object();
                obj.f21721a = "";
                obj.f21722b = "";
                obj.f21723c = "";
                obj.f21723c = z5Var.f21723c;
                obj.d = z5Var.d;
                obj.f21724e = z5Var.f21724e;
                obj.f21725f = z5Var.f21725f;
                obj.f21726g = z5Var.f21726g;
                obj.h = z5Var.h;
                obj.f21727i = z5Var.f21727i;
                obj.f21728j = z5Var.f21728j;
                obj.f21729k = z5Var.f21729k;
                obj.f21734p = this;
                obj.f21735q = f6Var2;
                if (!TextUtils.isEmpty(z5Var.f21721a)) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), z5Var.f21721a);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String j3 = obj.f21734p.j(obj.f21735q, false);
                        obj.f21721a = j3;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, j3));
                    } catch (Exception e7) {
                        obj.f21721a = "";
                        FileLog.e(e7);
                    }
                } else {
                    obj.f21721a = "";
                }
                if (!TextUtils.isEmpty(z5Var.f21722b)) {
                    if (!z5Var.f21722b.equals(z5Var.f21721a)) {
                        try {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), z5Var.f21722b);
                            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                            String j10 = obj.f21734p.j(obj.f21735q, true);
                            obj.f21722b = j10;
                            AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j10));
                        } catch (Exception e10) {
                            obj.f21722b = "";
                            FileLog.e(e10);
                        }
                    } else {
                        obj.f21722b = obj.f21721a;
                    }
                } else {
                    obj.f21722b = "";
                }
                f6Var2.f20627y = obj;
            }
            this.Z = this.Y;
            f6Var2.f20606a = i10;
            this.Y = i10;
            this.f20668i0 = f6Var2.f20627y;
            this.f20656a0.put(i10, f6Var2);
            this.f20658b0.add(0, f6Var2);
            h6.E1(this);
            return f6Var2;
        }
        return f6Var;
    }

    public final int l(int i10) {
        f6 f6Var = (f6) this.f20656a0.get(i10);
        if (f6Var != null) {
            return f6Var.f20608c;
        }
        return 0;
    }

    public final String m() {
        if (this.F != null) {
            return "remote" + this.F.f20169id;
        }
        return this.f20655a;
    }

    public final String n() {
        if ("Blue".equals(this.f20655a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.f20655a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.f20655a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.f20655a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.f20655a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.F;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f20655a;
    }

    public final int o() {
        if (this.S && this.Y == h6.f20964n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == h6.f20964n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i10 = this.f20669j0;
        if (i10 != -1) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f20655a) && !"Night".equals(this.f20655a)) {
            if ("Blue".equals(this.f20655a) || "Arctic Blue".equals(this.f20655a) || "Day".equals(this.f20655a)) {
                this.f20669j0 = 0;
            }
        } else {
            this.f20669j0 = 1;
        }
        if (this.f20669j0 == -1) {
            h6.G(h6.R0(new File(this.f20657b), null, new String[1]), this);
        }
        if (this.f20669j0 != 1) {
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
                z5Var.f21721a = jSONObject.getString("wall");
                z5Var.f21722b = jSONObject.getString("owall");
                z5Var.d = jSONObject.getInt("pColor");
                z5Var.f21724e = jSONObject.getInt("pGrColor");
                z5Var.f21725f = jSONObject.optInt("pGrColor2");
                z5Var.f21726g = jSONObject.optInt("pGrColor3");
                z5Var.h = jSONObject.getInt("pGrAngle");
                z5Var.f21723c = jSONObject.getString("wallSlug");
                z5Var.f21727i = jSONObject.getBoolean("wBlur");
                z5Var.f21728j = jSONObject.getBoolean("wMotion");
                z5Var.f21729k = (float) jSONObject.getDouble("pIntensity");
                z5Var.f21734p = this;
                z5Var.f21735q = f6Var;
                if (f6Var != null) {
                    f6Var.f20627y = z5Var;
                } else {
                    this.f20668i0 = z5Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    z5Var.f21723c = "d";
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
            this.f20668i0 = k10.f20627y;
        }
    }

    public final void v(z5 z5Var) {
        if (this.f20668i0 != z5Var) {
            f6 k10 = k(false);
            z5 z5Var2 = this.f20668i0;
            if (z5Var2 != null) {
                z5.a(z5Var2);
            }
            if (z5Var != null) {
                z5Var.f21735q = k10;
                z5Var.f21734p = this;
                z5Var.c();
            }
            this.f20668i0 = z5Var;
            if (k10 != null) {
                k10.f20627y = z5Var;
            }
        }
    }

    public g6(g6 g6Var) {
        this.f20674x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f20661d0 = new LongSparseArray();
        this.f20663e0 = 0;
        this.f20665f0 = 100;
        this.f20669j0 = -1;
        this.f20655a = g6Var.f20655a;
        this.f20657b = g6Var.f20657b;
        this.f20659c = g6Var.f20659c;
        this.d = g6Var.d;
        this.f20662e = g6Var.f20662e;
        this.f20664f = g6Var.f20664f;
        this.h = g6Var.h;
        this.f20670n = g6Var.f20670n;
        this.f20671r = g6Var.f20671r;
        this.f20672s = g6Var.f20672s;
        this.v = g6Var.v;
        this.f20673w = g6Var.f20673w;
        this.f20674x = g6Var.f20674x;
        this.f20675y = g6Var.f20675y;
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
        this.f20656a0 = g6Var.f20656a0;
        this.f20658b0 = g6Var.f20658b0;
        this.f20660c0 = g6Var.f20660c0;
        this.f20665f0 = g6Var.f20665f0;
        this.f20666g0 = g6Var.f20666g0;
        this.f20667h0 = g6Var.f20667h0;
        this.f20668i0 = g6Var.f20668i0;
    }
}
