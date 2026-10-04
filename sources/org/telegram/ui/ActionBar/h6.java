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
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.v9;
public final class h6 implements NotificationCenter.NotificationCenterDelegate {
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
    public String f20692a;
    public SparseArray f20693a0;
    public String f20694b;
    public ArrayList f20695b0;
    public String f20696c;
    public LongSparseArray f20697c0;
    public String d;
    public final LongSparseArray f20698d0;
    public String f20699e;
    public int f20700e0;
    public boolean f20701f;
    public int f20702f0;
    public String f20703g0;
    public boolean h;
    public String f20704h0;
    public a6 f20705i0;
    public int f20706j0;
    public boolean f20707n;
    public int f20708r;
    public int f20709s;
    public int v;
    public int f20710w;
    public int f20711x;
    public int f20712y;

    public h6() {
        this.f20711x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f20698d0 = new LongSparseArray();
        this.f20700e0 = 0;
        this.f20702f0 = 100;
        this.f20706j0 = -1;
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
            i14 = i6.X0(wallPaperSettings.background_color);
            int i16 = themeSettings.wallpaper.settings.second_background_color;
            j11 = 4294967296L;
            if (i16 == 0) {
                j3 = 4294967296L;
            } else {
                j3 = i6.X0(i16);
            }
            int i17 = themeSettings.wallpaper.settings.third_background_color;
            if (i17 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = i6.X0(i17);
            }
            int i18 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i18 != 0) {
                j11 = i6.X0(i18);
            }
            i15 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f7 = wallPaper2.settings.intensity / 100.0f;
                long j12 = j10;
                if (themeSettings.accent_color != f6Var.f20617c && themeSettings.outbox_accent_color == f6Var.d && i10 == f6Var.f20618e && i11 == f6Var.f20619f && i12 == f6Var.f20620g && i13 == f6Var.h && themeSettings.message_colors_animated == f6Var.f20621i && i14 == f6Var.f20622j && j3 == f6Var.f20623k && j12 == f6Var.f20624l && j11 == f6Var.f20625m && i15 == f6Var.f20626n && TextUtils.equals(str, f6Var.f20627o) && Math.abs(f7 - f6Var.f20628p) < 0.001d) {
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
        if (themeSettings.accent_color != f6Var.f20617c) {
        }
        return z10;
    }

    public static void b(h6 h6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        h6Var.W = iArr.length;
        h6Var.f20695b0 = new ArrayList();
        h6Var.f20693a0 = new SparseArray();
        h6Var.f20697c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            f6 f6Var = new f6();
            f6Var.f20615a = iArr8[i10];
            if (i6.g1(f6Var)) {
                f6Var.f20637z = true;
            }
            f6Var.f20617c = iArr[i10];
            f6Var.f20616b = h6Var;
            f6Var.f20618e = iArr2[i10];
            f6Var.f20619f = iArr3[i10];
            long j3 = iArr4[i10];
            f6Var.f20622j = j3;
            boolean z10 = h6Var.S;
            if (z10 && f6Var.f20615a == i6.f21001n) {
                f6Var.f20622j = 4294967296L;
            } else {
                f6Var.f20622j = j3;
            }
            if (z10 && f6Var.f20615a == i6.f21001n) {
                f6Var.f20623k = 4294967296L;
            } else {
                f6Var.f20623k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && f6Var.f20615a == i6.f21001n) {
                    f6Var.f20624l = 4294967296L;
                } else {
                    f6Var.f20624l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && f6Var.f20615a == i6.f21001n) {
                    f6Var.f20625m = 4294967296L;
                } else {
                    f6Var.f20625m = iArr7[i10];
                }
            }
            f6Var.f20628p = iArr10[i10] / 100.0f;
            f6Var.f20626n = iArr9[i10];
            f6Var.f20627o = strArr[i10];
            if ((i6.g1(f6Var) && h6Var.f20692a.equals("Dark Blue")) || h6Var.f20692a.equals("Night")) {
                f6Var.f20618e = -14316059;
                f6Var.f20619f = -12422433;
                f6Var.f20620g = -8304937;
                f6Var.h = -6340950;
                if (h6Var.f20692a.equals("Night")) {
                    f6Var.f20628p = -0.57f;
                    f6Var.f20622j = -9666650L;
                    f6Var.f20623k = -13749173L;
                    f6Var.f20624l = -8883033L;
                    f6Var.f20625m = -13421992L;
                }
            }
            h6Var.f20693a0.put(f6Var.f20615a, f6Var);
            h6Var.f20695b0.add(f6Var);
        }
        h6Var.X = ((f6) h6Var.f20693a0.get(0)).f20617c;
    }

    public static void c(h6 h6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = h6Var.f20695b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = h6Var.f20695b0.size();
            for (int i10 = 0; i10 < size; i10++) {
                f6 f6Var = (f6) h6Var.f20695b0.get(i10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(h6Var.f20692a);
                sb2.append("_");
                h6Var.r(sharedPreferences, f6Var, a4.a.o(f6Var.f20615a, "_owp", sb2));
            }
            return;
        }
        h6Var.r(sharedPreferences, null, a4.a.t(new StringBuilder(), h6Var.f20692a, "_owp"));
    }

    public static h6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            h6 h6Var = new h6();
            h6Var.f20692a = jSONObject.getString("name");
            h6Var.f20694b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                h6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                h6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                h6Var.G = jSONObject.getBoolean("loaded");
            }
            return h6Var;
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public static h6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        h6 h6Var = new h6();
        h6Var.f20692a = split[0];
        h6Var.f20694b = split[1];
        return h6Var;
    }

    public static void i(f6 f6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        f6Var.f20617c = themeSettings.accent_color;
        f6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i10 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        f6Var.f20618e = i10;
        if (themeSettings.message_colors.size() > 1) {
            i11 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        f6Var.f20619f = i11;
        if (f6Var.f20618e == i11) {
            f6Var.f20619f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        f6Var.f20620g = i12;
        if (themeSettings.message_colors.size() > 3) {
            i13 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i13 = 0;
        }
        f6Var.h = i13;
        f6Var.f20621i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            int i14 = wallPaperSettings.background_color;
            if (i14 == 0) {
                f6Var.f20622j = 4294967296L;
            } else {
                f6Var.f20622j = i6.X0(i14);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                f6Var.f20623k = 4294967296L;
            } else {
                f6Var.f20623k = i6.X0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                f6Var.f20624l = 4294967296L;
            } else {
                f6Var.f20624l = i6.X0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                f6Var.f20625m = 4294967296L;
            } else {
                f6Var.f20625m = i6.X0(wallPaperSettings4.fourth_background_color);
            }
            f6Var.f20626n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                f6Var.f20627o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                f6Var.f20628p = wallPaperSettings5.intensity / 100.0f;
                f6Var.f20629q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.f20708r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = pc0.g(this.f20708r, this.f20709s, i10, this.f20710w);
                } else {
                    int i11 = this.f20709s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.f20708r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(v9.d(this.f20711x), new int[]{this.f20708r, this.f20709s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.f20708r);
                        canvas.drawColor(this.f20708r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.f20712y / 100.0f) * 255.0f));
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
                if (str.equals(this.f20703g0)) {
                    this.f20703g0 = null;
                    Utilities.globalQueue.postRunnable(new g6(0, this, (File) objArr[1]));
                } else if (str.equals(FileLoader.getAttachFileName(this.F.document))) {
                    t();
                    if (i10 == i12) {
                        File file = new File(this.f20694b);
                        TLRPC.TL_theme tL_theme2 = this.F;
                        h6 k02 = i6.k0(file, tL_theme2.title, tL_theme2);
                        if (k02 != null && k02.f20696c != null && !new File(k02.f20696c).exists()) {
                            this.f20708r = k02.f20708r;
                            this.f20709s = k02.f20709s;
                            this.v = k02.v;
                            this.f20710w = k02.f20710w;
                            this.f20711x = k02.f20711x;
                            this.h = k02.h;
                            this.f20712y = k02.f20712y;
                            this.f20704h0 = k02.f20696c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = k02.f20699e;
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
            LongSparseArray longSparseArray = this.f20698d0;
            f6 f6Var = (f6) longSparseArray.get(j3);
            if (f6Var != null) {
                return f6Var;
            }
            int i11 = this.f20700e0 + 1;
            this.f20700e0 = i11;
            f6 f6Var2 = new f6();
            i(f6Var2, themeSettings);
            f6Var2.f20616b = this;
            f6Var2.f20615a = i11;
            f6Var2.f20630r = tL_theme;
            f6Var2.f20632t = i10;
            longSparseArray.put(i11, f6Var2);
            return f6Var2;
        }
        f6 f6Var3 = (f6) this.f20697c0.get(j3);
        if (f6Var3 != null) {
            return f6Var3;
        }
        int i12 = this.f20702f0 + 1;
        this.f20702f0 = i12;
        f6 f6Var4 = new f6();
        i(f6Var4, themeSettings);
        f6Var4.f20616b = this;
        f6Var4.f20615a = i12;
        f6Var4.f20630r = tL_theme;
        f6Var4.f20632t = i10;
        this.f20693a0.put(i12, f6Var4);
        this.f20695b0.add(0, f6Var4);
        i6.D1(this);
        this.f20697c0.put(j3, f6Var4);
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
        return e(tL_theme.f20179id, themeSettings, tL_theme, i10, false);
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
                sb3.append(this.f20692a);
                sb3.append("_");
                o9 = a4.a.o(f6Var.f20615a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f20692a);
                sb4.append("_");
                o9 = a4.a.o(f6Var.f20615a, "_wp", sb4);
            }
            sb2.append(o9);
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            t10 = a4.a.t(new StringBuilder(), this.f20692a, "_wp_o");
        } else {
            t10 = a4.a.t(new StringBuilder(), this.f20692a, "_wp");
        }
        sb5.append(t10);
        sb5.append(Utilities.random.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final f6 k(boolean z10) {
        f6 f6Var;
        if (this.f20695b0 == null || (f6Var = (f6) this.f20693a0.get(this.Y)) == null) {
            return null;
        }
        if (z10) {
            int i10 = this.f20702f0 + 1;
            this.f20702f0 = i10;
            f6 f6Var2 = new f6();
            f6Var2.f20617c = f6Var.f20617c;
            f6Var2.d = f6Var.d;
            f6Var2.f20618e = f6Var.f20618e;
            f6Var2.f20619f = f6Var.f20619f;
            f6Var2.f20620g = f6Var.f20620g;
            f6Var2.h = f6Var.h;
            f6Var2.f20621i = f6Var.f20621i;
            f6Var2.f20622j = f6Var.f20622j;
            f6Var2.f20623k = f6Var.f20623k;
            f6Var2.f20624l = f6Var.f20624l;
            f6Var2.f20625m = f6Var.f20625m;
            f6Var2.f20626n = f6Var.f20626n;
            f6Var2.f20627o = f6Var.f20627o;
            f6Var2.f20628p = f6Var.f20628p;
            f6Var2.f20629q = f6Var.f20629q;
            f6Var2.f20616b = this;
            a6 a6Var = this.f20705i0;
            if (a6Var != null) {
                ?? obj = new Object();
                obj.f20389a = "";
                obj.f20390b = "";
                obj.f20391c = "";
                obj.f20391c = a6Var.f20391c;
                obj.d = a6Var.d;
                obj.f20392e = a6Var.f20392e;
                obj.f20393f = a6Var.f20393f;
                obj.f20394g = a6Var.f20394g;
                obj.h = a6Var.h;
                obj.f20395i = a6Var.f20395i;
                obj.f20396j = a6Var.f20396j;
                obj.f20397k = a6Var.f20397k;
                obj.f20402p = this;
                obj.f20403q = f6Var2;
                if (!TextUtils.isEmpty(a6Var.f20389a)) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20389a);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String j3 = obj.f20402p.j(obj.f20403q, false);
                        obj.f20389a = j3;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, j3));
                    } catch (Exception e7) {
                        obj.f20389a = "";
                        FileLog.e(e7);
                    }
                } else {
                    obj.f20389a = "";
                }
                if (!TextUtils.isEmpty(a6Var.f20390b)) {
                    if (!a6Var.f20390b.equals(a6Var.f20389a)) {
                        try {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20390b);
                            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                            String j10 = obj.f20402p.j(obj.f20403q, true);
                            obj.f20390b = j10;
                            AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j10));
                        } catch (Exception e10) {
                            obj.f20390b = "";
                            FileLog.e(e10);
                        }
                    } else {
                        obj.f20390b = obj.f20389a;
                    }
                } else {
                    obj.f20390b = "";
                }
                f6Var2.f20636y = obj;
            }
            this.Z = this.Y;
            f6Var2.f20615a = i10;
            this.Y = i10;
            this.f20705i0 = f6Var2.f20636y;
            this.f20693a0.put(i10, f6Var2);
            this.f20695b0.add(0, f6Var2);
            i6.D1(this);
            return f6Var2;
        }
        return f6Var;
    }

    public final int l(int i10) {
        f6 f6Var = (f6) this.f20693a0.get(i10);
        if (f6Var != null) {
            return f6Var.f20617c;
        }
        return 0;
    }

    public final String m() {
        if (this.F != null) {
            return "remote" + this.F.f20179id;
        }
        return this.f20692a;
    }

    public final String n() {
        if ("Blue".equals(this.f20692a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.f20692a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.f20692a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.f20692a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.f20692a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.F;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f20692a;
    }

    public final int o() {
        if (this.S && this.Y == i6.f21001n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == i6.f21001n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i10 = this.f20706j0;
        if (i10 != -1) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f20692a) && !"Night".equals(this.f20692a)) {
            if ("Blue".equals(this.f20692a) || "Arctic Blue".equals(this.f20692a) || "Day".equals(this.f20692a)) {
                this.f20706j0 = 0;
            }
        } else {
            this.f20706j0 = 1;
        }
        if (this.f20706j0 == -1) {
            i6.G(i6.Q0(new File(this.f20694b), null, new String[1]), this);
        }
        if (this.f20706j0 != 1) {
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
                a6Var.f20389a = jSONObject.getString("wall");
                a6Var.f20390b = jSONObject.getString("owall");
                a6Var.d = jSONObject.getInt("pColor");
                a6Var.f20392e = jSONObject.getInt("pGrColor");
                a6Var.f20393f = jSONObject.optInt("pGrColor2");
                a6Var.f20394g = jSONObject.optInt("pGrColor3");
                a6Var.h = jSONObject.getInt("pGrAngle");
                a6Var.f20391c = jSONObject.getString("wallSlug");
                a6Var.f20395i = jSONObject.getBoolean("wBlur");
                a6Var.f20396j = jSONObject.getBoolean("wMotion");
                a6Var.f20397k = (float) jSONObject.getDouble("pIntensity");
                a6Var.f20402p = this;
                a6Var.f20403q = f6Var;
                if (f6Var != null) {
                    f6Var.f20636y = a6Var;
                } else {
                    this.f20705i0 = a6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    a6Var.f20391c = "d";
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
        i6.s1(true, false);
        if (this == i6.I && i6.M == null) {
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i10 = NotificationCenter.needSetDayNightTheme;
            if (this == i6.J) {
                z10 = true;
            } else {
                z10 = false;
            }
            globalInstance.lambda$postNotificationNameOnUIThread$1(i10, this, Boolean.valueOf(z10), null, -1, i6.ol);
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
            this.f20705i0 = k10.f20636y;
        }
    }

    public final void v(a6 a6Var) {
        if (this.f20705i0 != a6Var) {
            f6 k10 = k(false);
            a6 a6Var2 = this.f20705i0;
            if (a6Var2 != null) {
                a6.a(a6Var2);
            }
            if (a6Var != null) {
                a6Var.f20403q = k10;
                a6Var.f20402p = this;
                a6Var.c();
            }
            this.f20705i0 = a6Var;
            if (k10 != null) {
                k10.f20636y = a6Var;
            }
        }
    }

    public h6(h6 h6Var) {
        this.f20711x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f20698d0 = new LongSparseArray();
        this.f20700e0 = 0;
        this.f20702f0 = 100;
        this.f20706j0 = -1;
        this.f20692a = h6Var.f20692a;
        this.f20694b = h6Var.f20694b;
        this.f20696c = h6Var.f20696c;
        this.d = h6Var.d;
        this.f20699e = h6Var.f20699e;
        this.f20701f = h6Var.f20701f;
        this.h = h6Var.h;
        this.f20707n = h6Var.f20707n;
        this.f20708r = h6Var.f20708r;
        this.f20709s = h6Var.f20709s;
        this.v = h6Var.v;
        this.f20710w = h6Var.f20710w;
        this.f20711x = h6Var.f20711x;
        this.f20712y = h6Var.f20712y;
        this.E = h6Var.E;
        this.F = h6Var.F;
        this.G = h6Var.G;
        this.H = h6Var.H;
        this.I = h6Var.I;
        this.J = h6Var.J;
        this.K = h6Var.K;
        this.L = h6Var.L;
        this.M = h6Var.M;
        this.N = h6Var.N;
        this.O = h6Var.O;
        this.P = h6Var.P;
        this.Q = h6Var.Q;
        this.R = h6Var.R;
        this.S = h6Var.S;
        this.T = h6Var.T;
        this.U = h6Var.U;
        this.V = h6Var.V;
        this.W = h6Var.W;
        this.X = h6Var.X;
        this.Y = h6Var.Y;
        this.Z = h6Var.Z;
        this.f20693a0 = h6Var.f20693a0;
        this.f20695b0 = h6Var.f20695b0;
        this.f20697c0 = h6Var.f20697c0;
        this.f20702f0 = h6Var.f20702f0;
        this.f20703g0 = h6Var.f20703g0;
        this.f20704h0 = h6Var.f20704h0;
        this.f20705i0 = h6Var.f20705i0;
    }
}
