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
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.la0;
public final class j6 implements cs {
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
    public String f27675a;
    public int f27676a0;
    public String f27677b;
    public SparseArray f27678b0;
    public String f27679c;
    public ArrayList f27680c0;
    public String d;
    public LongSparseArray f27681d0;
    public String f27682e;
    public final LongSparseArray f27683e0;
    public boolean f27684f;
    public int f27685f0;
    public int f27686g0;
    public boolean h;
    public String f27687h0;
    public String f27688i0;
    public b6 f27689j0;
    public int f27690k0;
    public boolean f27691n;
    public int f27692r;
    public int f27693s;
    public int f27694w;
    public int f27695x;
    public int f27696y;

    public j6() {
        this.f27696y = 45;
        this.H = true;
        this.V = true;
        this.f27676a0 = -1;
        this.f27683e0 = new LongSparseArray();
        this.f27685f0 = 0;
        this.f27686g0 = 100;
        this.f27690k0 = -1;
    }

    public static boolean a(g6 g6Var, TLRPC.ThemeSettings themeSettings) {
        int i3;
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        long j10;
        long j11;
        long j12;
        int i13;
        int i14;
        String str;
        float f10;
        TLRPC.WallPaperSettings wallPaperSettings;
        if (themeSettings.message_colors.size() > 0) {
            i3 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i3 = 0;
        }
        if (themeSettings.message_colors.size() > 1) {
            i10 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        if (i3 == i10) {
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
            i13 = k6.a1(wallPaperSettings.background_color);
            int i15 = themeSettings.wallpaper.settings.second_background_color;
            j12 = 4294967296L;
            if (i15 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = k6.a1(i15);
            }
            int i16 = themeSettings.wallpaper.settings.third_background_color;
            if (i16 == 0) {
                j11 = 4294967296L;
            } else {
                j11 = k6.a1(i16);
            }
            int i17 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i17 != 0) {
                j12 = k6.a1(i17);
            }
            i14 = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
                long j13 = j11;
                if (themeSettings.accent_color != g6Var.f27527c && themeSettings.outbox_accent_color == g6Var.d && i3 == g6Var.f27528e && i10 == g6Var.f27529f && i11 == g6Var.f27530g && i12 == g6Var.h && themeSettings.message_colors_animated == g6Var.f27531i && i13 == g6Var.f27532j && j10 == g6Var.f27533k && j13 == g6Var.f27534l && j12 == g6Var.f27535m && i14 == g6Var.f27536n && TextUtils.equals(str, g6Var.f27537o) && Math.abs(f10 - g6Var.f27538p) < 0.001d) {
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
            i13 = 0;
            i14 = 0;
        }
        str = null;
        f10 = 0.0f;
        long j132 = j11;
        if (themeSettings.accent_color != g6Var.f27527c) {
        }
        return z10;
    }

    public static void b(j6 j6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        j6Var.X = iArr.length;
        j6Var.f27680c0 = new ArrayList();
        j6Var.f27678b0 = new SparseArray();
        j6Var.f27681d0 = new LongSparseArray();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            g6 g6Var = new g6();
            g6Var.f27525a = iArr8[i3];
            if (k6.l1(g6Var)) {
                g6Var.f27547z = true;
            }
            g6Var.f27527c = iArr[i3];
            g6Var.f27526b = j6Var;
            g6Var.f27528e = iArr2[i3];
            g6Var.f27529f = iArr3[i3];
            long j10 = iArr4[i3];
            g6Var.f27532j = j10;
            boolean z10 = j6Var.T;
            if (z10 && g6Var.f27525a == k6.f28056n) {
                g6Var.f27532j = 4294967296L;
            } else {
                g6Var.f27532j = j10;
            }
            if (z10 && g6Var.f27525a == k6.f28056n) {
                g6Var.f27533k = 4294967296L;
            } else {
                g6Var.f27533k = iArr5[i3];
            }
            if (iArr6 != null) {
                if (z10 && g6Var.f27525a == k6.f28056n) {
                    g6Var.f27534l = 4294967296L;
                } else {
                    g6Var.f27534l = iArr6[i3];
                }
            }
            if (iArr7 != null) {
                if (z10 && g6Var.f27525a == k6.f28056n) {
                    g6Var.f27535m = 4294967296L;
                } else {
                    g6Var.f27535m = iArr7[i3];
                }
            }
            g6Var.f27538p = iArr10[i3] / 100.0f;
            g6Var.f27536n = iArr9[i3];
            g6Var.f27537o = strArr[i3];
            if ((k6.l1(g6Var) && j6Var.f27675a.equals("Dark Blue")) || j6Var.f27675a.equals("Night")) {
                g6Var.f27528e = -14316059;
                g6Var.f27529f = -12422433;
                g6Var.f27530g = -8304937;
                g6Var.h = -6340950;
                if (j6Var.f27675a.equals("Night")) {
                    g6Var.f27538p = -0.57f;
                    g6Var.f27532j = -9666650L;
                    g6Var.f27533k = -13749173L;
                    g6Var.f27534l = -8883033L;
                    g6Var.f27535m = -13421992L;
                }
            }
            j6Var.f27678b0.put(g6Var.f27525a, g6Var);
            j6Var.f27680c0.add(g6Var);
        }
        j6Var.Y = ((g6) j6Var.f27678b0.get(0)).f27527c;
    }

    public static void c(j6 j6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = j6Var.f27680c0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = j6Var.f27680c0.size();
            for (int i3 = 0; i3 < size; i3++) {
                g6 g6Var = (g6) j6Var.f27680c0.get(i3);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j6Var.f27675a);
                sb2.append("_");
                j6Var.r(sharedPreferences, g6Var, a1.g.o(g6Var.f27525a, "_owp", sb2));
            }
            return;
        }
        j6Var.r(sharedPreferences, null, a1.g.s(new StringBuilder(), j6Var.f27675a, "_owp"));
    }

    public static j6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            j6 j6Var = new j6();
            j6Var.f27675a = jSONObject.getString("name");
            j6Var.f27677b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                j6Var.F = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.v(jSONObject.getString("info")));
                j6Var.G = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                j6Var.H = jSONObject.getBoolean("loaded");
            }
            return j6Var;
        } catch (Exception e10) {
            a8.g(e10, true);
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
        j6Var.f27675a = split[0];
        j6Var.f27677b = split[1];
        return j6Var;
    }

    public static void i(g6 g6Var, TLRPC.ThemeSettings themeSettings) {
        int i3;
        int i10;
        int i11;
        int i12;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        g6Var.f27527c = themeSettings.accent_color;
        g6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i3 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i3 = 0;
        }
        g6Var.f27528e = i3;
        if (themeSettings.message_colors.size() > 1) {
            i10 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        g6Var.f27529f = i10;
        if (g6Var.f27528e == i10) {
            g6Var.f27529f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i11 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        g6Var.f27530g = i11;
        if (themeSettings.message_colors.size() > 3) {
            i12 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        g6Var.h = i12;
        g6Var.f27531i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            if (wallPaperSettings.background_color == 0) {
                g6Var.f27532j = 4294967296L;
            } else {
                g6Var.f27532j = k6.a1(i13);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                g6Var.f27533k = 4294967296L;
            } else {
                g6Var.f27533k = k6.a1(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                g6Var.f27534l = 4294967296L;
            } else {
                g6Var.f27534l = k6.a1(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                g6Var.f27535m = 4294967296L;
            } else {
                g6Var.f27535m = k6.a1(wallPaperSettings4.fourth_background_color);
            }
            g6Var.f27536n = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                g6Var.f27537o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                g6Var.f27538p = wallPaperSettings5.intensity / 100.0f;
                g6Var.f27539q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int V0;
        try {
            Bitmap e12 = org.telegram.messenger.g0.e1(org.telegram.messenger.g0.L(640.0f), org.telegram.messenger.g0.L(360.0f), file.getAbsolutePath(), null, 0);
            if (e12 != null && this.f27692r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(e12.getWidth(), e12.getHeight(), e12.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i3 = this.f27694w;
                if (i3 != 0) {
                    V0 = la0.g(this.f27692r, this.f27693s, i3, this.f27695x);
                } else {
                    int i10 = this.f27693s;
                    if (i10 != 0) {
                        V0 = org.telegram.messenger.g0.w0(this.f27692r, i10);
                        GradientDrawable gradientDrawable = new GradientDrawable(j9.d(this.f27696y), new int[]{this.f27692r, this.f27693s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        V0 = org.telegram.messenger.g0.V0(this.f27692r, false);
                        canvas.drawColor(this.f27692r);
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
            if (this.f27694w != 0) {
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
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.Y1;
        if (i3 == i11 || i3 == hs.Z1) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.G;
            if (tL_theme != null && tL_theme.document != null) {
                if (str.equals(this.f27687h0)) {
                    this.f27687h0 = null;
                    Utilities.f21387e.c(new org.telegram.messenger.voip.l0(9, this, (File) objArr[1]));
                } else if (str.equals(w7.r(null, this.G.document))) {
                    t();
                    if (i3 == i11) {
                        File file = new File(this.f27677b);
                        TLRPC.TL_theme tL_theme2 = this.G;
                        j6 m0 = k6.m0(file, tL_theme2.title, tL_theme2);
                        if (m0 != null && m0.f27679c != null && !new File(m0.f27679c).exists()) {
                            this.f27692r = m0.f27692r;
                            this.f27693s = m0.f27693s;
                            this.f27694w = m0.f27694w;
                            this.f27695x = m0.f27695x;
                            this.f27696y = m0.f27696y;
                            this.h = m0.h;
                            this.E = m0.E;
                            this.f27688i0 = m0.f27679c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = m0.f27682e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(m0.F).sendRequest(getwallpaper, new h6(0, this, m0));
                            return;
                        }
                        s();
                    }
                }
            }
        }
    }

    public final g6 e(long j10, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i3, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.f27683e0;
            g6 g6Var = (g6) longSparseArray.get(j10);
            if (g6Var != null) {
                return g6Var;
            }
            int i10 = this.f27685f0 + 1;
            this.f27685f0 = i10;
            g6 g6Var2 = new g6();
            i(g6Var2, themeSettings);
            g6Var2.f27526b = this;
            g6Var2.f27525a = i10;
            g6Var2.f27540r = tL_theme;
            g6Var2.f27542t = i3;
            longSparseArray.put(i10, g6Var2);
            return g6Var2;
        }
        g6 g6Var3 = (g6) this.f27681d0.get(j10);
        if (g6Var3 != null) {
            return g6Var3;
        }
        int i11 = this.f27686g0 + 1;
        this.f27686g0 = i11;
        g6 g6Var4 = new g6();
        i(g6Var4, themeSettings);
        g6Var4.f27526b = this;
        g6Var4.f27525a = i11;
        g6Var4.f27540r = tL_theme;
        g6Var4.f27542t = i3;
        this.f27678b0.put(i11, g6Var4);
        this.f27680c0.add(0, g6Var4);
        k6.J1(this);
        this.f27681d0.put(j10, g6Var4);
        return g6Var4;
    }

    public final g6 f(TLRPC.TL_theme tL_theme, int i3, int i10) {
        TLRPC.ThemeSettings themeSettings = null;
        if (tL_theme == null) {
            return null;
        }
        if (i10 < tL_theme.settings.size()) {
            themeSettings = tL_theme.settings.get(i10);
        }
        return e(tL_theme.f27140id, themeSettings, tL_theme, i3, false);
    }

    public final String j(g6 g6Var, boolean z10) {
        String s6;
        String o10;
        if (g6Var == null) {
            g6Var = k(false);
        }
        if (g6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f27675a);
                sb3.append("_");
                o10 = a1.g.o(g6Var.f27525a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f27675a);
                sb4.append("_");
                o10 = a1.g.o(g6Var.f27525a, "_wp", sb4);
            }
            sb2.append(o10);
            sb2.append(Utilities.f21385b.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            s6 = a1.g.s(new StringBuilder(), this.f27675a, "_wp_o");
        } else {
            s6 = a1.g.s(new StringBuilder(), this.f27675a, "_wp");
        }
        sb5.append(s6);
        sb5.append(Utilities.f21385b.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final g6 k(boolean z10) {
        g6 g6Var;
        if (this.f27680c0 == null || (g6Var = (g6) this.f27678b0.get(this.Z)) == null) {
            return null;
        }
        if (z10) {
            int i3 = this.f27686g0 + 1;
            this.f27686g0 = i3;
            g6 g6Var2 = new g6();
            g6Var2.f27527c = g6Var.f27527c;
            g6Var2.d = g6Var.d;
            g6Var2.f27528e = g6Var.f27528e;
            g6Var2.f27529f = g6Var.f27529f;
            g6Var2.f27530g = g6Var.f27530g;
            g6Var2.h = g6Var.h;
            g6Var2.f27531i = g6Var.f27531i;
            g6Var2.f27532j = g6Var.f27532j;
            g6Var2.f27533k = g6Var.f27533k;
            g6Var2.f27534l = g6Var.f27534l;
            g6Var2.f27535m = g6Var.f27535m;
            g6Var2.f27536n = g6Var.f27536n;
            g6Var2.f27537o = g6Var.f27537o;
            g6Var2.f27538p = g6Var.f27538p;
            g6Var2.f27539q = g6Var.f27539q;
            g6Var2.f27526b = this;
            b6 b6Var = this.f27689j0;
            if (b6Var != null) {
                ?? obj = new Object();
                obj.f27422a = "";
                obj.f27423b = "";
                obj.f27424c = "";
                obj.f27424c = b6Var.f27424c;
                obj.d = b6Var.d;
                obj.f27425e = b6Var.f27425e;
                obj.f27426f = b6Var.f27426f;
                obj.f27427g = b6Var.f27427g;
                obj.h = b6Var.h;
                obj.f27428i = b6Var.f27428i;
                obj.f27429j = b6Var.f27429j;
                obj.f27430k = b6Var.f27430k;
                obj.f27435p = this;
                obj.f27436q = g6Var2;
                if (!TextUtils.isEmpty(b6Var.f27422a)) {
                    try {
                        File file = new File(org.telegram.messenger.t0.h(), b6Var.f27422a);
                        File h = org.telegram.messenger.t0.h();
                        String j10 = obj.f27435p.j(obj.f27436q, false);
                        obj.f27422a = j10;
                        org.telegram.messenger.g0.E(file, new File(h, j10));
                    } catch (Exception e10) {
                        obj.f27422a = "";
                        a8.g(e10, true);
                    }
                } else {
                    obj.f27422a = "";
                }
                if (!TextUtils.isEmpty(b6Var.f27423b)) {
                    if (!b6Var.f27423b.equals(b6Var.f27422a)) {
                        try {
                            File file2 = new File(org.telegram.messenger.t0.h(), b6Var.f27423b);
                            File h7 = org.telegram.messenger.t0.h();
                            String j11 = obj.f27435p.j(obj.f27436q, true);
                            obj.f27423b = j11;
                            org.telegram.messenger.g0.E(file2, new File(h7, j11));
                        } catch (Exception e11) {
                            obj.f27423b = "";
                            a8.g(e11, true);
                        }
                    } else {
                        obj.f27423b = obj.f27422a;
                    }
                } else {
                    obj.f27423b = "";
                }
                g6Var2.f27546y = obj;
            }
            this.f27676a0 = this.Z;
            g6Var2.f27525a = i3;
            this.Z = i3;
            this.f27689j0 = g6Var2.f27546y;
            this.f27678b0.put(i3, g6Var2);
            this.f27680c0.add(0, g6Var2);
            k6.J1(this);
            return g6Var2;
        }
        return g6Var;
    }

    public final int l(int i3) {
        g6 g6Var = (g6) this.f27678b0.get(i3);
        if (g6Var != null) {
            return g6Var.f27527c;
        }
        return 0;
    }

    public final String m() {
        if (this.G != null) {
            return "remote" + this.G.f27140id;
        }
        return this.f27675a;
    }

    public final String n() {
        if ("Blue".equals(this.f27675a)) {
            return bd.M0(2131744196, null);
        }
        if ("Dark Blue".equals(this.f27675a)) {
            return bd.M0(2131744193, null);
        }
        if ("Arctic Blue".equals(this.f27675a)) {
            return bd.M0(2131744197, null);
        }
        if ("Day".equals(this.f27675a)) {
            return bd.M0(2131744192, null);
        }
        if ("Night".equals(this.f27675a)) {
            return bd.M0(2131744185, null);
        }
        TLRPC.TL_theme tL_theme = this.G;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f27675a;
    }

    public final int o() {
        if (this.T && this.Z == k6.f28056n) {
            return -3155485;
        }
        return this.M;
    }

    public final int p() {
        if (this.T && this.Z == k6.f28056n) {
            return -983328;
        }
        return this.S;
    }

    public final boolean q() {
        int i3 = this.f27690k0;
        if (i3 != -1) {
            if (i3 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f27675a) && !"Night".equals(this.f27675a)) {
            if ("Blue".equals(this.f27675a) || "Arctic Blue".equals(this.f27675a) || "Day".equals(this.f27675a)) {
                this.f27690k0 = 0;
            }
        } else {
            this.f27690k0 = 1;
        }
        if (this.f27690k0 == -1) {
            k6.H(k6.T0(new File(this.f27677b), null, new String[1]), this);
        }
        if (this.f27690k0 != 1) {
            return false;
        }
        return true;
    }

    public final void r(SharedPreferences sharedPreferences, g6 g6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                b6 b6Var = new b6();
                b6Var.f27422a = jSONObject.getString("wall");
                b6Var.f27423b = jSONObject.getString("owall");
                b6Var.d = jSONObject.getInt("pColor");
                b6Var.f27425e = jSONObject.getInt("pGrColor");
                b6Var.f27426f = jSONObject.optInt("pGrColor2");
                b6Var.f27427g = jSONObject.optInt("pGrColor3");
                b6Var.h = jSONObject.getInt("pGrAngle");
                b6Var.f27424c = jSONObject.getString("wallSlug");
                b6Var.f27428i = jSONObject.getBoolean("wBlur");
                b6Var.f27429j = jSONObject.getBoolean("wMotion");
                b6Var.f27430k = (float) jSONObject.getDouble("pIntensity");
                b6Var.f27435p = this;
                b6Var.f27436q = g6Var;
                if (g6Var != null) {
                    g6Var.f27546y = b6Var;
                } else {
                    this.f27689j0 = b6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    b6Var.f27424c = "d";
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
        k6.y1(true, false);
        if (this == k6.I && k6.M == null) {
            if (this != k6.J) {
                z10 = false;
            }
            k6.K1(this, z10, -1, null);
        }
    }

    public final void t() {
        hs.f(this.F).n(this, hs.Y1);
        hs.f(this.F).n(this, hs.Z1);
    }

    public final void u(int i3) {
        this.Z = i3;
        g6 k10 = k(false);
        if (k10 != null) {
            this.f27689j0 = k10.f27546y;
        }
    }

    public final void v(b6 b6Var) {
        if (this.f27689j0 != b6Var) {
            g6 k10 = k(false);
            b6 b6Var2 = this.f27689j0;
            if (b6Var2 != null) {
                b6.a(b6Var2);
            }
            if (b6Var != null) {
                b6Var.f27436q = k10;
                b6Var.f27435p = this;
                b6Var.c();
            }
            this.f27689j0 = b6Var;
            if (k10 != null) {
                k10.f27546y = b6Var;
            }
        }
    }

    public j6(j6 j6Var) {
        this.f27696y = 45;
        this.H = true;
        this.V = true;
        this.f27676a0 = -1;
        this.f27683e0 = new LongSparseArray();
        this.f27685f0 = 0;
        this.f27686g0 = 100;
        this.f27690k0 = -1;
        this.f27675a = j6Var.f27675a;
        this.f27677b = j6Var.f27677b;
        this.f27679c = j6Var.f27679c;
        this.d = j6Var.d;
        this.f27682e = j6Var.f27682e;
        this.f27684f = j6Var.f27684f;
        this.h = j6Var.h;
        this.f27691n = j6Var.f27691n;
        this.f27692r = j6Var.f27692r;
        this.f27693s = j6Var.f27693s;
        this.f27694w = j6Var.f27694w;
        this.f27695x = j6Var.f27695x;
        this.f27696y = j6Var.f27696y;
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
        this.f27676a0 = j6Var.f27676a0;
        this.f27678b0 = j6Var.f27678b0;
        this.f27680c0 = j6Var.f27680c0;
        this.f27681d0 = j6Var.f27681d0;
        this.f27686g0 = j6Var.f27686g0;
        this.f27687h0 = j6Var.f27687h0;
        this.f27688i0 = j6Var.f27688i0;
        this.f27689j0 = j6Var.f27689j0;
    }
}
