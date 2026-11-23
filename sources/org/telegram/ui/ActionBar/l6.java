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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.p9;
public final class l6 implements gs {
    public int E;
    public int F;
    public TLRPC.TL_theme G;
    public boolean H;
    public String I;
    public String J;
    public TLRPC.InputFile K;
    public TLRPC.InputFile L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public String f29198a;
    public int f29199a0;
    public String f29200b;
    public SparseArray f29201b0;
    public String f29202c;
    public ArrayList f29203c0;
    public String d;
    public LongSparseArray f29204d0;
    public String f29205e;
    public final LongSparseArray f29206e0;
    public boolean f29207f;
    public int f29208f0;
    public int f29209g0;
    public boolean h;
    public String f29210h0;
    public String f29211i0;
    public d6 f29212j0;
    public int f29213k0;
    public boolean f29214n;
    public int f29215r;
    public int f29216s;
    public int f29217w;
    public int f29218x;
    public int f29219y;

    public l6() {
        this.f29219y = 45;
        this.H = true;
        this.V = true;
        this.f29199a0 = -1;
        this.f29206e0 = new LongSparseArray();
        this.f29208f0 = 0;
        this.f29209g0 = 100;
        this.f29213k0 = -1;
    }

    public static boolean a(j6 j6Var, TLRPC.ThemeSettings themeSettings) {
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        long j3;
        long j10;
        long j11;
        int i13;
        int i14;
        String str;
        float f10;
        TLRPC.WallPaperSettings wallPaperSettings;
        if (themeSettings.message_colors.size() > 0) {
            i7 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i7 = 0;
        }
        if (themeSettings.message_colors.size() > 1) {
            i10 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        if (i7 == i10) {
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
            i13 = m6.a1(wallPaperSettings.background_color);
            int i15 = themeSettings.wallpaper.settings.second_background_color;
            j11 = 4294967296L;
            if (i15 == 0) {
                j3 = 4294967296L;
            } else {
                j3 = m6.a1(i15);
            }
            int i16 = themeSettings.wallpaper.settings.third_background_color;
            if (i16 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = m6.a1(i16);
            }
            int i17 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i17 != 0) {
                j11 = m6.a1(i17);
            }
            i14 = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
                long j12 = j10;
                if (themeSettings.accent_color != j6Var.f29064c && themeSettings.outbox_accent_color == j6Var.d && i7 == j6Var.f29065e && i10 == j6Var.f29066f && i11 == j6Var.f29067g && i12 == j6Var.h && themeSettings.message_colors_animated == j6Var.f29068i && i13 == j6Var.f29069j && j3 == j6Var.f29070k && j12 == j6Var.f29071l && j11 == j6Var.f29072m && i14 == j6Var.f29073n && TextUtils.equals(str, j6Var.f29074o) && Math.abs(f10 - j6Var.f29075p) < 0.001d) {
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
            i13 = 0;
            i14 = 0;
        }
        str = null;
        f10 = 0.0f;
        long j122 = j10;
        if (themeSettings.accent_color != j6Var.f29064c) {
        }
        return z10;
    }

    public static void b(l6 l6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        l6Var.X = iArr.length;
        l6Var.f29203c0 = new ArrayList();
        l6Var.f29201b0 = new SparseArray();
        l6Var.f29204d0 = new LongSparseArray();
        for (int i7 = 0; i7 < iArr.length; i7++) {
            j6 j6Var = new j6();
            j6Var.f29062a = iArr8[i7];
            if (m6.l1(j6Var)) {
                j6Var.f29084z = true;
            }
            j6Var.f29064c = iArr[i7];
            j6Var.f29063b = l6Var;
            j6Var.f29065e = iArr2[i7];
            j6Var.f29066f = iArr3[i7];
            long j3 = iArr4[i7];
            j6Var.f29069j = j3;
            boolean z10 = l6Var.T;
            if (z10 && j6Var.f29062a == m6.f29523n) {
                j6Var.f29069j = 4294967296L;
            } else {
                j6Var.f29069j = j3;
            }
            if (z10 && j6Var.f29062a == m6.f29523n) {
                j6Var.f29070k = 4294967296L;
            } else {
                j6Var.f29070k = iArr5[i7];
            }
            if (iArr6 != null) {
                if (z10 && j6Var.f29062a == m6.f29523n) {
                    j6Var.f29071l = 4294967296L;
                } else {
                    j6Var.f29071l = iArr6[i7];
                }
            }
            if (iArr7 != null) {
                if (z10 && j6Var.f29062a == m6.f29523n) {
                    j6Var.f29072m = 4294967296L;
                } else {
                    j6Var.f29072m = iArr7[i7];
                }
            }
            j6Var.f29075p = iArr10[i7] / 100.0f;
            j6Var.f29073n = iArr9[i7];
            j6Var.f29074o = strArr[i7];
            if ((m6.l1(j6Var) && l6Var.f29198a.equals("Dark Blue")) || l6Var.f29198a.equals("Night")) {
                j6Var.f29065e = -14316059;
                j6Var.f29066f = -12422433;
                j6Var.f29067g = -8304937;
                j6Var.h = -6340950;
                if (l6Var.f29198a.equals("Night")) {
                    j6Var.f29075p = -0.57f;
                    j6Var.f29069j = -9666650L;
                    j6Var.f29070k = -13749173L;
                    j6Var.f29071l = -8883033L;
                    j6Var.f29072m = -13421992L;
                }
            }
            l6Var.f29201b0.put(j6Var.f29062a, j6Var);
            l6Var.f29203c0.add(j6Var);
        }
        l6Var.Y = ((j6) l6Var.f29201b0.get(0)).f29064c;
    }

    public static void c(l6 l6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = l6Var.f29203c0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = l6Var.f29203c0.size();
            for (int i7 = 0; i7 < size; i7++) {
                j6 j6Var = (j6) l6Var.f29203c0.get(i7);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(l6Var.f29198a);
                sb2.append("_");
                l6Var.r(sharedPreferences, j6Var, a8.p0.n(j6Var.f29062a, "_owp", sb2));
            }
            return;
        }
        l6Var.r(sharedPreferences, null, a8.p0.s(new StringBuilder(), l6Var.f29198a, "_owp"));
    }

    public static l6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            l6 l6Var = new l6();
            l6Var.f29198a = jSONObject.getString("name");
            l6Var.f29200b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                l6Var.F = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.v(jSONObject.getString("info")));
                l6Var.G = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                l6Var.H = jSONObject.getBoolean("loaded");
            }
            return l6Var;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static l6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        l6 l6Var = new l6();
        l6Var.f29198a = split[0];
        l6Var.f29200b = split[1];
        return l6Var;
    }

    public static void i(j6 j6Var, TLRPC.ThemeSettings themeSettings) {
        int i7;
        int i10;
        int i11;
        int i12;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        j6Var.f29064c = themeSettings.accent_color;
        j6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i7 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i7 = 0;
        }
        j6Var.f29065e = i7;
        if (themeSettings.message_colors.size() > 1) {
            i10 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        j6Var.f29066f = i10;
        if (j6Var.f29065e == i10) {
            j6Var.f29066f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i11 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        j6Var.f29067g = i11;
        if (themeSettings.message_colors.size() > 3) {
            i12 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        j6Var.h = i12;
        j6Var.f29068i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            if (wallPaperSettings.background_color == 0) {
                j6Var.f29069j = 4294967296L;
            } else {
                j6Var.f29069j = m6.a1(i13);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                j6Var.f29070k = 4294967296L;
            } else {
                j6Var.f29070k = m6.a1(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                j6Var.f29071l = 4294967296L;
            } else {
                j6Var.f29071l = m6.a1(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                j6Var.f29072m = 4294967296L;
            } else {
                j6Var.f29072m = m6.a1(wallPaperSettings4.fourth_background_color);
            }
            j6Var.f29073n = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                j6Var.f29074o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                j6Var.f29075p = wallPaperSettings5.intensity / 100.0f;
                j6Var.f29076q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int V0;
        try {
            Bitmap e12 = org.telegram.messenger.g0.e1(org.telegram.messenger.g0.L(640.0f), org.telegram.messenger.g0.L(360.0f), file.getAbsolutePath(), null, 0);
            if (e12 != null && this.f29215r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(e12.getWidth(), e12.getHeight(), e12.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i7 = this.f29217w;
                if (i7 != 0) {
                    V0 = cb0.g(this.f29215r, this.f29216s, i7, this.f29218x);
                } else {
                    int i10 = this.f29216s;
                    if (i10 != 0) {
                        V0 = org.telegram.messenger.g0.w0(this.f29215r, i10);
                        GradientDrawable gradientDrawable = new GradientDrawable(p9.d(this.f29219y), new int[]{this.f29215r, this.f29216s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        V0 = org.telegram.messenger.g0.V0(this.f29215r, false);
                        canvas.drawColor(this.f29215r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(V0, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.E / 100.0f) * 255.0f));
                canvas.drawBitmap(e12, 0.0f, 0.0f, paint);
                canvas.setBitmap(null);
                e12 = createBitmap;
            }
            if (this.h) {
                e12 = Utilities.e(e12);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            if (this.f29217w != 0) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
            e12.compress(compressFormat, 87, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (Throwable th2) {
            a8.g(th2, true);
            return false;
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ls.Y1;
        if (i7 == i11 || i7 == ls.Z1) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.G;
            if (tL_theme != null && tL_theme.document != null) {
                if (str.equals(this.f29210h0)) {
                    this.f29210h0 = null;
                    Utilities.f22774e.c(new z1(8, this, (File) objArr[1]));
                } else if (str.equals(w7.r(null, this.G.document))) {
                    t();
                    if (i7 == i11) {
                        File file = new File(this.f29200b);
                        TLRPC.TL_theme tL_theme2 = this.G;
                        l6 m0 = m6.m0(file, tL_theme2.title, tL_theme2);
                        if (m0 != null && m0.f29202c != null && !new File(m0.f29202c).exists()) {
                            this.f29215r = m0.f29215r;
                            this.f29216s = m0.f29216s;
                            this.f29217w = m0.f29217w;
                            this.f29218x = m0.f29218x;
                            this.f29219y = m0.f29219y;
                            this.h = m0.h;
                            this.E = m0.E;
                            this.f29211i0 = m0.f29202c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = m0.f29205e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(m0.F).sendRequest(getwallpaper, new e6(this, m0, 1));
                            return;
                        }
                        s();
                    }
                }
            }
        }
    }

    public final j6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i7, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.f29206e0;
            j6 j6Var = (j6) longSparseArray.get(j3);
            if (j6Var != null) {
                return j6Var;
            }
            int i10 = this.f29208f0 + 1;
            this.f29208f0 = i10;
            j6 j6Var2 = new j6();
            i(j6Var2, themeSettings);
            j6Var2.f29063b = this;
            j6Var2.f29062a = i10;
            j6Var2.f29077r = tL_theme;
            j6Var2.f29079t = i7;
            longSparseArray.put(i10, j6Var2);
            return j6Var2;
        }
        j6 j6Var3 = (j6) this.f29204d0.get(j3);
        if (j6Var3 != null) {
            return j6Var3;
        }
        int i11 = this.f29209g0 + 1;
        this.f29209g0 = i11;
        j6 j6Var4 = new j6();
        i(j6Var4, themeSettings);
        j6Var4.f29063b = this;
        j6Var4.f29062a = i11;
        j6Var4.f29077r = tL_theme;
        j6Var4.f29079t = i7;
        this.f29201b0.put(i11, j6Var4);
        this.f29203c0.add(0, j6Var4);
        m6.J1(this);
        this.f29204d0.put(j3, j6Var4);
        return j6Var4;
    }

    public final j6 f(TLRPC.TL_theme tL_theme, int i7, int i10) {
        TLRPC.ThemeSettings themeSettings = null;
        if (tL_theme == null) {
            return null;
        }
        if (i10 < tL_theme.settings.size()) {
            themeSettings = tL_theme.settings.get(i10);
        }
        return e(tL_theme.f28537id, themeSettings, tL_theme, i7, false);
    }

    public final String j(j6 j6Var, boolean z10) {
        String s5;
        String n10;
        if (j6Var == null) {
            j6Var = k(false);
        }
        if (j6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f29198a);
                sb3.append("_");
                n10 = a8.p0.n(j6Var.f29062a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f29198a);
                sb4.append("_");
                n10 = a8.p0.n(j6Var.f29062a, "_wp", sb4);
            }
            sb2.append(n10);
            sb2.append(Utilities.f22772b.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            s5 = a8.p0.s(new StringBuilder(), this.f29198a, "_wp_o");
        } else {
            s5 = a8.p0.s(new StringBuilder(), this.f29198a, "_wp");
        }
        sb5.append(s5);
        sb5.append(Utilities.f22772b.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final j6 k(boolean z10) {
        j6 j6Var;
        if (this.f29203c0 == null || (j6Var = (j6) this.f29201b0.get(this.Z)) == null) {
            return null;
        }
        if (z10) {
            int i7 = this.f29209g0 + 1;
            this.f29209g0 = i7;
            j6 j6Var2 = new j6();
            j6Var2.f29064c = j6Var.f29064c;
            j6Var2.d = j6Var.d;
            j6Var2.f29065e = j6Var.f29065e;
            j6Var2.f29066f = j6Var.f29066f;
            j6Var2.f29067g = j6Var.f29067g;
            j6Var2.h = j6Var.h;
            j6Var2.f29068i = j6Var.f29068i;
            j6Var2.f29069j = j6Var.f29069j;
            j6Var2.f29070k = j6Var.f29070k;
            j6Var2.f29071l = j6Var.f29071l;
            j6Var2.f29072m = j6Var.f29072m;
            j6Var2.f29073n = j6Var.f29073n;
            j6Var2.f29074o = j6Var.f29074o;
            j6Var2.f29075p = j6Var.f29075p;
            j6Var2.f29076q = j6Var.f29076q;
            j6Var2.f29063b = this;
            d6 d6Var = this.f29212j0;
            if (d6Var != null) {
                ?? obj = new Object();
                obj.f28849a = "";
                obj.f28850b = "";
                obj.f28851c = "";
                obj.f28851c = d6Var.f28851c;
                obj.d = d6Var.d;
                obj.f28852e = d6Var.f28852e;
                obj.f28853f = d6Var.f28853f;
                obj.f28854g = d6Var.f28854g;
                obj.h = d6Var.h;
                obj.f28855i = d6Var.f28855i;
                obj.f28856j = d6Var.f28856j;
                obj.f28857k = d6Var.f28857k;
                obj.f28862p = this;
                obj.f28863q = j6Var2;
                if (!TextUtils.isEmpty(d6Var.f28849a)) {
                    try {
                        File file = new File(org.telegram.messenger.t0.h(), d6Var.f28849a);
                        File h = org.telegram.messenger.t0.h();
                        String j3 = obj.f28862p.j(obj.f28863q, false);
                        obj.f28849a = j3;
                        org.telegram.messenger.g0.E(file, new File(h, j3));
                    } catch (Exception e10) {
                        obj.f28849a = "";
                        a8.g(e10, true);
                    }
                } else {
                    obj.f28849a = "";
                }
                if (!TextUtils.isEmpty(d6Var.f28850b)) {
                    if (!d6Var.f28850b.equals(d6Var.f28849a)) {
                        try {
                            File file2 = new File(org.telegram.messenger.t0.h(), d6Var.f28850b);
                            File h7 = org.telegram.messenger.t0.h();
                            String j10 = obj.f28862p.j(obj.f28863q, true);
                            obj.f28850b = j10;
                            org.telegram.messenger.g0.E(file2, new File(h7, j10));
                        } catch (Exception e11) {
                            obj.f28850b = "";
                            a8.g(e11, true);
                        }
                    } else {
                        obj.f28850b = obj.f28849a;
                    }
                } else {
                    obj.f28850b = "";
                }
                j6Var2.f29083y = obj;
            }
            this.f29199a0 = this.Z;
            j6Var2.f29062a = i7;
            this.Z = i7;
            this.f29212j0 = j6Var2.f29083y;
            this.f29201b0.put(i7, j6Var2);
            this.f29203c0.add(0, j6Var2);
            m6.J1(this);
            return j6Var2;
        }
        return j6Var;
    }

    public final int l(int i7) {
        j6 j6Var = (j6) this.f29201b0.get(i7);
        if (j6Var != null) {
            return j6Var.f29064c;
        }
        return 0;
    }

    public final String m() {
        if (this.G != null) {
            return "remote" + this.G.f28537id;
        }
        return this.f29198a;
    }

    public final String n() {
        if ("Blue".equals(this.f29198a)) {
            return hd.N0(2131743945, null);
        }
        if ("Dark Blue".equals(this.f29198a)) {
            return hd.N0(2131743942, null);
        }
        if ("Arctic Blue".equals(this.f29198a)) {
            return hd.N0(2131743946, null);
        }
        if ("Day".equals(this.f29198a)) {
            return hd.N0(2131743941, null);
        }
        if ("Night".equals(this.f29198a)) {
            return hd.N0(2131743934, null);
        }
        TLRPC.TL_theme tL_theme = this.G;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f29198a;
    }

    public final int o() {
        if (this.T && this.Z == m6.f29523n) {
            return -3155485;
        }
        return this.M;
    }

    public final int p() {
        if (this.T && this.Z == m6.f29523n) {
            return -983328;
        }
        return this.S;
    }

    public final boolean q() {
        int i7 = this.f29213k0;
        if (i7 != -1) {
            if (i7 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f29198a) && !"Night".equals(this.f29198a)) {
            if ("Blue".equals(this.f29198a) || "Arctic Blue".equals(this.f29198a) || "Day".equals(this.f29198a)) {
                this.f29213k0 = 0;
            }
        } else {
            this.f29213k0 = 1;
        }
        if (this.f29213k0 == -1) {
            m6.H(m6.T0(new File(this.f29200b), null, new String[1]), this);
        }
        if (this.f29213k0 != 1) {
            return false;
        }
        return true;
    }

    public final void r(SharedPreferences sharedPreferences, j6 j6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                d6 d6Var = new d6();
                d6Var.f28849a = jSONObject.getString("wall");
                d6Var.f28850b = jSONObject.getString("owall");
                d6Var.d = jSONObject.getInt("pColor");
                d6Var.f28852e = jSONObject.getInt("pGrColor");
                d6Var.f28853f = jSONObject.optInt("pGrColor2");
                d6Var.f28854g = jSONObject.optInt("pGrColor3");
                d6Var.h = jSONObject.getInt("pGrAngle");
                d6Var.f28851c = jSONObject.getString("wallSlug");
                d6Var.f28855i = jSONObject.getBoolean("wBlur");
                d6Var.f28856j = jSONObject.getBoolean("wMotion");
                d6Var.f28857k = (float) jSONObject.getDouble("pIntensity");
                d6Var.f28862p = this;
                d6Var.f28863q = j6Var;
                if (j6Var != null) {
                    j6Var.f29083y = d6Var;
                } else {
                    this.f29212j0 = d6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    d6Var.f28851c = "d";
                }
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public final void s() {
        boolean z10 = true;
        this.H = true;
        this.U = false;
        m6.y1(true, false);
        if (this == m6.I && m6.M == null) {
            if (this != m6.J) {
                z10 = false;
            }
            m6.K1(this, z10, -1, null);
        }
    }

    public final void t() {
        ls.f(this.F).n(this, ls.Y1);
        ls.f(this.F).n(this, ls.Z1);
    }

    public final void u(int i7) {
        this.Z = i7;
        j6 k10 = k(false);
        if (k10 != null) {
            this.f29212j0 = k10.f29083y;
        }
    }

    public final void v(d6 d6Var) {
        if (this.f29212j0 != d6Var) {
            j6 k10 = k(false);
            d6 d6Var2 = this.f29212j0;
            if (d6Var2 != null) {
                d6.a(d6Var2);
            }
            if (d6Var != null) {
                d6Var.f28863q = k10;
                d6Var.f28862p = this;
                d6Var.c();
            }
            this.f29212j0 = d6Var;
            if (k10 != null) {
                k10.f29083y = d6Var;
            }
        }
    }

    public l6(l6 l6Var) {
        this.f29219y = 45;
        this.H = true;
        this.V = true;
        this.f29199a0 = -1;
        this.f29206e0 = new LongSparseArray();
        this.f29208f0 = 0;
        this.f29209g0 = 100;
        this.f29213k0 = -1;
        this.f29198a = l6Var.f29198a;
        this.f29200b = l6Var.f29200b;
        this.f29202c = l6Var.f29202c;
        this.d = l6Var.d;
        this.f29205e = l6Var.f29205e;
        this.f29207f = l6Var.f29207f;
        this.h = l6Var.h;
        this.f29214n = l6Var.f29214n;
        this.f29215r = l6Var.f29215r;
        this.f29216s = l6Var.f29216s;
        this.f29217w = l6Var.f29217w;
        this.f29218x = l6Var.f29218x;
        this.f29219y = l6Var.f29219y;
        this.E = l6Var.E;
        this.F = l6Var.F;
        this.G = l6Var.G;
        this.H = l6Var.H;
        this.I = l6Var.I;
        this.J = l6Var.J;
        this.K = l6Var.K;
        this.L = l6Var.L;
        this.M = l6Var.M;
        this.N = l6Var.N;
        this.O = l6Var.O;
        this.P = l6Var.P;
        this.Q = l6Var.Q;
        this.R = l6Var.R;
        this.S = l6Var.S;
        this.T = l6Var.T;
        this.U = l6Var.U;
        this.V = l6Var.V;
        this.W = l6Var.W;
        this.X = l6Var.X;
        this.Y = l6Var.Y;
        this.Z = l6Var.Z;
        this.f29199a0 = l6Var.f29199a0;
        this.f29201b0 = l6Var.f29201b0;
        this.f29203c0 = l6Var.f29203c0;
        this.f29204d0 = l6Var.f29204d0;
        this.f29209g0 = l6Var.f29209g0;
        this.f29210h0 = l6Var.f29210h0;
        this.f29211i0 = l6Var.f29211i0;
        this.f29212j0 = l6Var.f29212j0;
    }
}
