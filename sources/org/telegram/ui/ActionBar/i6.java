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
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ra0;
public final class i6 implements is {
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
    public String f28698a;
    public int f28699a0;
    public String f28700b;
    public SparseArray f28701b0;
    public String f28702c;
    public ArrayList f28703c0;
    public String d;
    public LongSparseArray f28704d0;
    public String f28705e;
    public final LongSparseArray f28706e0;
    public boolean f28707f;
    public int f28708f0;
    public int f28709g0;
    public boolean h;
    public String f28710h0;
    public String f28711i0;
    public b6 f28712j0;
    public int f28713k0;
    public boolean f28714n;
    public int f28715r;
    public int f28716s;
    public int f28717w;
    public int f28718x;
    public int f28719y;

    public i6() {
        this.f28719y = 45;
        this.H = true;
        this.V = true;
        this.f28699a0 = -1;
        this.f28706e0 = new LongSparseArray();
        this.f28708f0 = 0;
        this.f28709g0 = 100;
        this.f28713k0 = -1;
    }

    public static boolean a(g6 g6Var, TLRPC.ThemeSettings themeSettings) {
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
            i13 = j6.a1(wallPaperSettings.background_color);
            int i15 = themeSettings.wallpaper.settings.second_background_color;
            j11 = 4294967296L;
            if (i15 == 0) {
                j3 = 4294967296L;
            } else {
                j3 = j6.a1(i15);
            }
            int i16 = themeSettings.wallpaper.settings.third_background_color;
            if (i16 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = j6.a1(i16);
            }
            int i17 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i17 != 0) {
                j11 = j6.a1(i17);
            }
            i14 = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
                long j12 = j10;
                if (themeSettings.accent_color != g6Var.f28604c && themeSettings.outbox_accent_color == g6Var.d && i7 == g6Var.f28605e && i10 == g6Var.f28606f && i11 == g6Var.f28607g && i12 == g6Var.h && themeSettings.message_colors_animated == g6Var.f28608i && i13 == g6Var.f28609j && j3 == g6Var.f28610k && j12 == g6Var.f28611l && j11 == g6Var.f28612m && i14 == g6Var.f28613n && TextUtils.equals(str, g6Var.f28614o) && Math.abs(f10 - g6Var.f28615p) < 0.001d) {
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
        if (themeSettings.accent_color != g6Var.f28604c) {
        }
        return z10;
    }

    public static void b(i6 i6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        i6Var.X = iArr.length;
        i6Var.f28703c0 = new ArrayList();
        i6Var.f28701b0 = new SparseArray();
        i6Var.f28704d0 = new LongSparseArray();
        for (int i7 = 0; i7 < iArr.length; i7++) {
            g6 g6Var = new g6();
            g6Var.f28602a = iArr8[i7];
            if (j6.l1(g6Var)) {
                g6Var.f28624z = true;
            }
            g6Var.f28604c = iArr[i7];
            g6Var.f28603b = i6Var;
            g6Var.f28605e = iArr2[i7];
            g6Var.f28606f = iArr3[i7];
            long j3 = iArr4[i7];
            g6Var.f28609j = j3;
            boolean z10 = i6Var.T;
            if (z10 && g6Var.f28602a == j6.f29025n) {
                g6Var.f28609j = 4294967296L;
            } else {
                g6Var.f28609j = j3;
            }
            if (z10 && g6Var.f28602a == j6.f29025n) {
                g6Var.f28610k = 4294967296L;
            } else {
                g6Var.f28610k = iArr5[i7];
            }
            if (iArr6 != null) {
                if (z10 && g6Var.f28602a == j6.f29025n) {
                    g6Var.f28611l = 4294967296L;
                } else {
                    g6Var.f28611l = iArr6[i7];
                }
            }
            if (iArr7 != null) {
                if (z10 && g6Var.f28602a == j6.f29025n) {
                    g6Var.f28612m = 4294967296L;
                } else {
                    g6Var.f28612m = iArr7[i7];
                }
            }
            g6Var.f28615p = iArr10[i7] / 100.0f;
            g6Var.f28613n = iArr9[i7];
            g6Var.f28614o = strArr[i7];
            if ((j6.l1(g6Var) && i6Var.f28698a.equals("Dark Blue")) || i6Var.f28698a.equals("Night")) {
                g6Var.f28605e = -14316059;
                g6Var.f28606f = -12422433;
                g6Var.f28607g = -8304937;
                g6Var.h = -6340950;
                if (i6Var.f28698a.equals("Night")) {
                    g6Var.f28615p = -0.57f;
                    g6Var.f28609j = -9666650L;
                    g6Var.f28610k = -13749173L;
                    g6Var.f28611l = -8883033L;
                    g6Var.f28612m = -13421992L;
                }
            }
            i6Var.f28701b0.put(g6Var.f28602a, g6Var);
            i6Var.f28703c0.add(g6Var);
        }
        i6Var.Y = ((g6) i6Var.f28701b0.get(0)).f28604c;
    }

    public static void c(i6 i6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = i6Var.f28703c0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = i6Var.f28703c0.size();
            for (int i7 = 0; i7 < size; i7++) {
                g6 g6Var = (g6) i6Var.f28703c0.get(i7);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i6Var.f28698a);
                sb2.append("_");
                i6Var.r(sharedPreferences, g6Var, a8.p0.n(g6Var.f28602a, "_owp", sb2));
            }
            return;
        }
        i6Var.r(sharedPreferences, null, a8.p0.s(new StringBuilder(), i6Var.f28698a, "_owp"));
    }

    public static i6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            i6 i6Var = new i6();
            i6Var.f28698a = jSONObject.getString("name");
            i6Var.f28700b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                i6Var.F = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.v(jSONObject.getString("info")));
                i6Var.G = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                i6Var.H = jSONObject.getBoolean("loaded");
            }
            return i6Var;
        } catch (Exception e10) {
            a8.g(e10, true);
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
        i6Var.f28698a = split[0];
        i6Var.f28700b = split[1];
        return i6Var;
    }

    public static void i(g6 g6Var, TLRPC.ThemeSettings themeSettings) {
        int i7;
        int i10;
        int i11;
        int i12;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        g6Var.f28604c = themeSettings.accent_color;
        g6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i7 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i7 = 0;
        }
        g6Var.f28605e = i7;
        if (themeSettings.message_colors.size() > 1) {
            i10 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        g6Var.f28606f = i10;
        if (g6Var.f28605e == i10) {
            g6Var.f28606f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i11 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        g6Var.f28607g = i11;
        if (themeSettings.message_colors.size() > 3) {
            i12 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        g6Var.h = i12;
        g6Var.f28608i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            if (wallPaperSettings.background_color == 0) {
                g6Var.f28609j = 4294967296L;
            } else {
                g6Var.f28609j = j6.a1(i13);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                g6Var.f28610k = 4294967296L;
            } else {
                g6Var.f28610k = j6.a1(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                g6Var.f28611l = 4294967296L;
            } else {
                g6Var.f28611l = j6.a1(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                g6Var.f28612m = 4294967296L;
            } else {
                g6Var.f28612m = j6.a1(wallPaperSettings4.fourth_background_color);
            }
            g6Var.f28613n = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                g6Var.f28614o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                g6Var.f28615p = wallPaperSettings5.intensity / 100.0f;
                g6Var.f28616q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int V0;
        try {
            Bitmap e12 = org.telegram.messenger.g0.e1(org.telegram.messenger.g0.L(640.0f), org.telegram.messenger.g0.L(360.0f), file.getAbsolutePath(), null, 0);
            if (e12 != null && this.f28715r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(e12.getWidth(), e12.getHeight(), e12.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i7 = this.f28717w;
                if (i7 != 0) {
                    V0 = ra0.g(this.f28715r, this.f28716s, i7, this.f28718x);
                } else {
                    int i10 = this.f28716s;
                    if (i10 != 0) {
                        V0 = org.telegram.messenger.g0.w0(this.f28715r, i10);
                        GradientDrawable gradientDrawable = new GradientDrawable(h9.d(this.f28719y), new int[]{this.f28715r, this.f28716s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        V0 = org.telegram.messenger.g0.V0(this.f28715r, false);
                        canvas.drawColor(this.f28715r);
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
            if (this.f28717w != 0) {
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
        int i11 = ns.Y1;
        if (i7 == i11 || i7 == ns.Z1) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.G;
            if (tL_theme != null && tL_theme.document != null) {
                if (str.equals(this.f28710h0)) {
                    this.f28710h0 = null;
                    Utilities.f22416e.c(new oi.u4(23, this, (File) objArr[1]));
                } else if (str.equals(w7.r(null, this.G.document))) {
                    t();
                    if (i7 == i11) {
                        File file = new File(this.f28700b);
                        TLRPC.TL_theme tL_theme2 = this.G;
                        i6 m0 = j6.m0(file, tL_theme2.title, tL_theme2);
                        if (m0 != null && m0.f28702c != null && !new File(m0.f28702c).exists()) {
                            this.f28715r = m0.f28715r;
                            this.f28716s = m0.f28716s;
                            this.f28717w = m0.f28717w;
                            this.f28718x = m0.f28718x;
                            this.f28719y = m0.f28719y;
                            this.h = m0.h;
                            this.E = m0.E;
                            this.f28711i0 = m0.f28702c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = m0.f28705e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(m0.F).sendRequest(getwallpaper, new bi.v2(29, this, m0));
                            return;
                        }
                        s();
                    }
                }
            }
        }
    }

    public final g6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i7, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.f28706e0;
            g6 g6Var = (g6) longSparseArray.get(j3);
            if (g6Var != null) {
                return g6Var;
            }
            int i10 = this.f28708f0 + 1;
            this.f28708f0 = i10;
            g6 g6Var2 = new g6();
            i(g6Var2, themeSettings);
            g6Var2.f28603b = this;
            g6Var2.f28602a = i10;
            g6Var2.f28617r = tL_theme;
            g6Var2.f28619t = i7;
            longSparseArray.put(i10, g6Var2);
            return g6Var2;
        }
        g6 g6Var3 = (g6) this.f28704d0.get(j3);
        if (g6Var3 != null) {
            return g6Var3;
        }
        int i11 = this.f28709g0 + 1;
        this.f28709g0 = i11;
        g6 g6Var4 = new g6();
        i(g6Var4, themeSettings);
        g6Var4.f28603b = this;
        g6Var4.f28602a = i11;
        g6Var4.f28617r = tL_theme;
        g6Var4.f28619t = i7;
        this.f28701b0.put(i11, g6Var4);
        this.f28703c0.add(0, g6Var4);
        j6.J1(this);
        this.f28704d0.put(j3, g6Var4);
        return g6Var4;
    }

    public final g6 f(TLRPC.TL_theme tL_theme, int i7, int i10) {
        TLRPC.ThemeSettings themeSettings = null;
        if (tL_theme == null) {
            return null;
        }
        if (i10 < tL_theme.settings.size()) {
            themeSettings = tL_theme.settings.get(i10);
        }
        return e(tL_theme.f28190id, themeSettings, tL_theme, i7, false);
    }

    public final String j(g6 g6Var, boolean z10) {
        String s5;
        String n10;
        if (g6Var == null) {
            g6Var = k(false);
        }
        if (g6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f28698a);
                sb3.append("_");
                n10 = a8.p0.n(g6Var.f28602a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f28698a);
                sb4.append("_");
                n10 = a8.p0.n(g6Var.f28602a, "_wp", sb4);
            }
            sb2.append(n10);
            sb2.append(Utilities.f22414b.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            s5 = a8.p0.s(new StringBuilder(), this.f28698a, "_wp_o");
        } else {
            s5 = a8.p0.s(new StringBuilder(), this.f28698a, "_wp");
        }
        sb5.append(s5);
        sb5.append(Utilities.f22414b.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final g6 k(boolean z10) {
        g6 g6Var;
        if (this.f28703c0 == null || (g6Var = (g6) this.f28701b0.get(this.Z)) == null) {
            return null;
        }
        if (z10) {
            int i7 = this.f28709g0 + 1;
            this.f28709g0 = i7;
            g6 g6Var2 = new g6();
            g6Var2.f28604c = g6Var.f28604c;
            g6Var2.d = g6Var.d;
            g6Var2.f28605e = g6Var.f28605e;
            g6Var2.f28606f = g6Var.f28606f;
            g6Var2.f28607g = g6Var.f28607g;
            g6Var2.h = g6Var.h;
            g6Var2.f28608i = g6Var.f28608i;
            g6Var2.f28609j = g6Var.f28609j;
            g6Var2.f28610k = g6Var.f28610k;
            g6Var2.f28611l = g6Var.f28611l;
            g6Var2.f28612m = g6Var.f28612m;
            g6Var2.f28613n = g6Var.f28613n;
            g6Var2.f28614o = g6Var.f28614o;
            g6Var2.f28615p = g6Var.f28615p;
            g6Var2.f28616q = g6Var.f28616q;
            g6Var2.f28603b = this;
            b6 b6Var = this.f28712j0;
            if (b6Var != null) {
                ?? obj = new Object();
                obj.f28452a = "";
                obj.f28453b = "";
                obj.f28454c = "";
                obj.f28454c = b6Var.f28454c;
                obj.d = b6Var.d;
                obj.f28455e = b6Var.f28455e;
                obj.f28456f = b6Var.f28456f;
                obj.f28457g = b6Var.f28457g;
                obj.h = b6Var.h;
                obj.f28458i = b6Var.f28458i;
                obj.f28459j = b6Var.f28459j;
                obj.f28460k = b6Var.f28460k;
                obj.f28465p = this;
                obj.f28466q = g6Var2;
                if (!TextUtils.isEmpty(b6Var.f28452a)) {
                    try {
                        File file = new File(org.telegram.messenger.t0.h(), b6Var.f28452a);
                        File h = org.telegram.messenger.t0.h();
                        String j3 = obj.f28465p.j(obj.f28466q, false);
                        obj.f28452a = j3;
                        org.telegram.messenger.g0.E(file, new File(h, j3));
                    } catch (Exception e10) {
                        obj.f28452a = "";
                        a8.g(e10, true);
                    }
                } else {
                    obj.f28452a = "";
                }
                if (!TextUtils.isEmpty(b6Var.f28453b)) {
                    if (!b6Var.f28453b.equals(b6Var.f28452a)) {
                        try {
                            File file2 = new File(org.telegram.messenger.t0.h(), b6Var.f28453b);
                            File h7 = org.telegram.messenger.t0.h();
                            String j10 = obj.f28465p.j(obj.f28466q, true);
                            obj.f28453b = j10;
                            org.telegram.messenger.g0.E(file2, new File(h7, j10));
                        } catch (Exception e11) {
                            obj.f28453b = "";
                            a8.g(e11, true);
                        }
                    } else {
                        obj.f28453b = obj.f28452a;
                    }
                } else {
                    obj.f28453b = "";
                }
                g6Var2.f28623y = obj;
            }
            this.f28699a0 = this.Z;
            g6Var2.f28602a = i7;
            this.Z = i7;
            this.f28712j0 = g6Var2.f28623y;
            this.f28701b0.put(i7, g6Var2);
            this.f28703c0.add(0, g6Var2);
            j6.J1(this);
            return g6Var2;
        }
        return g6Var;
    }

    public final int l(int i7) {
        g6 g6Var = (g6) this.f28701b0.get(i7);
        if (g6Var != null) {
            return g6Var.f28604c;
        }
        return 0;
    }

    public final String m() {
        if (this.G != null) {
            return "remote" + this.G.f28190id;
        }
        return this.f28698a;
    }

    public final String n() {
        if ("Blue".equals(this.f28698a)) {
            return hd.M0(2131744186, null);
        }
        if ("Dark Blue".equals(this.f28698a)) {
            return hd.M0(2131744183, null);
        }
        if ("Arctic Blue".equals(this.f28698a)) {
            return hd.M0(2131744187, null);
        }
        if ("Day".equals(this.f28698a)) {
            return hd.M0(2131744182, null);
        }
        if ("Night".equals(this.f28698a)) {
            return hd.M0(2131744175, null);
        }
        TLRPC.TL_theme tL_theme = this.G;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f28698a;
    }

    public final int o() {
        if (this.T && this.Z == j6.f29025n) {
            return -3155485;
        }
        return this.M;
    }

    public final int p() {
        if (this.T && this.Z == j6.f29025n) {
            return -983328;
        }
        return this.S;
    }

    public final boolean q() {
        int i7 = this.f28713k0;
        if (i7 != -1) {
            if (i7 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f28698a) && !"Night".equals(this.f28698a)) {
            if ("Blue".equals(this.f28698a) || "Arctic Blue".equals(this.f28698a) || "Day".equals(this.f28698a)) {
                this.f28713k0 = 0;
            }
        } else {
            this.f28713k0 = 1;
        }
        if (this.f28713k0 == -1) {
            j6.H(j6.T0(new File(this.f28700b), null, new String[1]), this);
        }
        if (this.f28713k0 != 1) {
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
                b6Var.f28452a = jSONObject.getString("wall");
                b6Var.f28453b = jSONObject.getString("owall");
                b6Var.d = jSONObject.getInt("pColor");
                b6Var.f28455e = jSONObject.getInt("pGrColor");
                b6Var.f28456f = jSONObject.optInt("pGrColor2");
                b6Var.f28457g = jSONObject.optInt("pGrColor3");
                b6Var.h = jSONObject.getInt("pGrAngle");
                b6Var.f28454c = jSONObject.getString("wallSlug");
                b6Var.f28458i = jSONObject.getBoolean("wBlur");
                b6Var.f28459j = jSONObject.getBoolean("wMotion");
                b6Var.f28460k = (float) jSONObject.getDouble("pIntensity");
                b6Var.f28465p = this;
                b6Var.f28466q = g6Var;
                if (g6Var != null) {
                    g6Var.f28623y = b6Var;
                } else {
                    this.f28712j0 = b6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    b6Var.f28454c = "d";
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
        j6.y1(true, false);
        if (this == j6.I && j6.M == null) {
            if (this != j6.J) {
                z10 = false;
            }
            j6.K1(this, z10, -1, null);
        }
    }

    public final void t() {
        ns.f(this.F).n(this, ns.Y1);
        ns.f(this.F).n(this, ns.Z1);
    }

    public final void u(int i7) {
        this.Z = i7;
        g6 k10 = k(false);
        if (k10 != null) {
            this.f28712j0 = k10.f28623y;
        }
    }

    public final void v(b6 b6Var) {
        if (this.f28712j0 != b6Var) {
            g6 k10 = k(false);
            b6 b6Var2 = this.f28712j0;
            if (b6Var2 != null) {
                b6.a(b6Var2);
            }
            if (b6Var != null) {
                b6Var.f28466q = k10;
                b6Var.f28465p = this;
                b6Var.c();
            }
            this.f28712j0 = b6Var;
            if (k10 != null) {
                k10.f28623y = b6Var;
            }
        }
    }

    public i6(i6 i6Var) {
        this.f28719y = 45;
        this.H = true;
        this.V = true;
        this.f28699a0 = -1;
        this.f28706e0 = new LongSparseArray();
        this.f28708f0 = 0;
        this.f28709g0 = 100;
        this.f28713k0 = -1;
        this.f28698a = i6Var.f28698a;
        this.f28700b = i6Var.f28700b;
        this.f28702c = i6Var.f28702c;
        this.d = i6Var.d;
        this.f28705e = i6Var.f28705e;
        this.f28707f = i6Var.f28707f;
        this.h = i6Var.h;
        this.f28714n = i6Var.f28714n;
        this.f28715r = i6Var.f28715r;
        this.f28716s = i6Var.f28716s;
        this.f28717w = i6Var.f28717w;
        this.f28718x = i6Var.f28718x;
        this.f28719y = i6Var.f28719y;
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
        this.f28699a0 = i6Var.f28699a0;
        this.f28701b0 = i6Var.f28701b0;
        this.f28703c0 = i6Var.f28703c0;
        this.f28704d0 = i6Var.f28704d0;
        this.f28709g0 = i6Var.f28709g0;
        this.f28710h0 = i6Var.f28710h0;
        this.f28711i0 = i6Var.f28711i0;
        this.f28712j0 = i6Var.f28712j0;
    }
}
