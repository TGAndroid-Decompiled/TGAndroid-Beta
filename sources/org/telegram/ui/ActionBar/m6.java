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
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.za0;
public final class m6 implements fs {
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
    public String f29320a;
    public int f29321a0;
    public String f29322b;
    public SparseArray f29323b0;
    public String f29324c;
    public ArrayList f29325c0;
    public String d;
    public LongSparseArray f29326d0;
    public String f29327e;
    public final LongSparseArray f29328e0;
    public boolean f29329f;
    public int f29330f0;
    public int f29331g0;
    public boolean h;
    public String f29332h0;
    public String f29333i0;
    public e6 f29334j0;
    public int f29335k0;
    public boolean f29336n;
    public int f29337r;
    public int f29338s;
    public int f29339w;
    public int f29340x;
    public int f29341y;

    public m6() {
        this.f29341y = 45;
        this.H = true;
        this.V = true;
        this.f29321a0 = -1;
        this.f29328e0 = new LongSparseArray();
        this.f29330f0 = 0;
        this.f29331g0 = 100;
        this.f29335k0 = -1;
    }

    public static boolean a(k6 k6Var, TLRPC.ThemeSettings themeSettings) {
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
            i13 = n6.a1(wallPaperSettings.background_color);
            int i15 = themeSettings.wallpaper.settings.second_background_color;
            j11 = 4294967296L;
            if (i15 == 0) {
                j3 = 4294967296L;
            } else {
                j3 = n6.a1(i15);
            }
            int i16 = themeSettings.wallpaper.settings.third_background_color;
            if (i16 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = n6.a1(i16);
            }
            int i17 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i17 != 0) {
                j11 = n6.a1(i17);
            }
            i14 = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
                long j12 = j10;
                if (themeSettings.accent_color != k6Var.f29226c && themeSettings.outbox_accent_color == k6Var.d && i7 == k6Var.f29227e && i10 == k6Var.f29228f && i11 == k6Var.f29229g && i12 == k6Var.h && themeSettings.message_colors_animated == k6Var.f29230i && i13 == k6Var.f29231j && j3 == k6Var.f29232k && j12 == k6Var.f29233l && j11 == k6Var.f29234m && i14 == k6Var.f29235n && TextUtils.equals(str, k6Var.f29236o) && Math.abs(f10 - k6Var.f29237p) < 0.001d) {
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
        if (themeSettings.accent_color != k6Var.f29226c) {
        }
        return z10;
    }

    public static void b(m6 m6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        m6Var.X = iArr.length;
        m6Var.f29325c0 = new ArrayList();
        m6Var.f29323b0 = new SparseArray();
        m6Var.f29326d0 = new LongSparseArray();
        for (int i7 = 0; i7 < iArr.length; i7++) {
            k6 k6Var = new k6();
            k6Var.f29224a = iArr8[i7];
            if (n6.l1(k6Var)) {
                k6Var.f29246z = true;
            }
            k6Var.f29226c = iArr[i7];
            k6Var.f29225b = m6Var;
            k6Var.f29227e = iArr2[i7];
            k6Var.f29228f = iArr3[i7];
            long j3 = iArr4[i7];
            k6Var.f29231j = j3;
            boolean z10 = m6Var.T;
            if (z10 && k6Var.f29224a == n6.f29627n) {
                k6Var.f29231j = 4294967296L;
            } else {
                k6Var.f29231j = j3;
            }
            if (z10 && k6Var.f29224a == n6.f29627n) {
                k6Var.f29232k = 4294967296L;
            } else {
                k6Var.f29232k = iArr5[i7];
            }
            if (iArr6 != null) {
                if (z10 && k6Var.f29224a == n6.f29627n) {
                    k6Var.f29233l = 4294967296L;
                } else {
                    k6Var.f29233l = iArr6[i7];
                }
            }
            if (iArr7 != null) {
                if (z10 && k6Var.f29224a == n6.f29627n) {
                    k6Var.f29234m = 4294967296L;
                } else {
                    k6Var.f29234m = iArr7[i7];
                }
            }
            k6Var.f29237p = iArr10[i7] / 100.0f;
            k6Var.f29235n = iArr9[i7];
            k6Var.f29236o = strArr[i7];
            if ((n6.l1(k6Var) && m6Var.f29320a.equals("Dark Blue")) || m6Var.f29320a.equals("Night")) {
                k6Var.f29227e = -14316059;
                k6Var.f29228f = -12422433;
                k6Var.f29229g = -8304937;
                k6Var.h = -6340950;
                if (m6Var.f29320a.equals("Night")) {
                    k6Var.f29237p = -0.57f;
                    k6Var.f29231j = -9666650L;
                    k6Var.f29232k = -13749173L;
                    k6Var.f29233l = -8883033L;
                    k6Var.f29234m = -13421992L;
                }
            }
            m6Var.f29323b0.put(k6Var.f29224a, k6Var);
            m6Var.f29325c0.add(k6Var);
        }
        m6Var.Y = ((k6) m6Var.f29323b0.get(0)).f29226c;
    }

    public static void c(m6 m6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = m6Var.f29325c0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = m6Var.f29325c0.size();
            for (int i7 = 0; i7 < size; i7++) {
                k6 k6Var = (k6) m6Var.f29325c0.get(i7);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m6Var.f29320a);
                sb2.append("_");
                m6Var.r(sharedPreferences, k6Var, a8.p0.n(k6Var.f29224a, "_owp", sb2));
            }
            return;
        }
        m6Var.r(sharedPreferences, null, a8.p0.s(new StringBuilder(), m6Var.f29320a, "_owp"));
    }

    public static m6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            m6 m6Var = new m6();
            m6Var.f29320a = jSONObject.getString("name");
            m6Var.f29322b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                m6Var.F = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.v(jSONObject.getString("info")));
                m6Var.G = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                m6Var.H = jSONObject.getBoolean("loaded");
            }
            return m6Var;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static m6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        m6 m6Var = new m6();
        m6Var.f29320a = split[0];
        m6Var.f29322b = split[1];
        return m6Var;
    }

    public static void i(k6 k6Var, TLRPC.ThemeSettings themeSettings) {
        int i7;
        int i10;
        int i11;
        int i12;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        k6Var.f29226c = themeSettings.accent_color;
        k6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i7 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i7 = 0;
        }
        k6Var.f29227e = i7;
        if (themeSettings.message_colors.size() > 1) {
            i10 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        k6Var.f29228f = i10;
        if (k6Var.f29227e == i10) {
            k6Var.f29228f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i11 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        k6Var.f29229g = i11;
        if (themeSettings.message_colors.size() > 3) {
            i12 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        k6Var.h = i12;
        k6Var.f29230i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            if (wallPaperSettings.background_color == 0) {
                k6Var.f29231j = 4294967296L;
            } else {
                k6Var.f29231j = n6.a1(i13);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                k6Var.f29232k = 4294967296L;
            } else {
                k6Var.f29232k = n6.a1(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                k6Var.f29233l = 4294967296L;
            } else {
                k6Var.f29233l = n6.a1(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                k6Var.f29234m = 4294967296L;
            } else {
                k6Var.f29234m = n6.a1(wallPaperSettings4.fourth_background_color);
            }
            k6Var.f29235n = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                k6Var.f29236o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                k6Var.f29237p = wallPaperSettings5.intensity / 100.0f;
                k6Var.f29238q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int V0;
        try {
            Bitmap e12 = org.telegram.messenger.g0.e1(org.telegram.messenger.g0.L(640.0f), org.telegram.messenger.g0.L(360.0f), file.getAbsolutePath(), null, 0);
            if (e12 != null && this.f29337r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(e12.getWidth(), e12.getHeight(), e12.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i7 = this.f29339w;
                if (i7 != 0) {
                    V0 = za0.g(this.f29337r, this.f29338s, i7, this.f29340x);
                } else {
                    int i10 = this.f29338s;
                    if (i10 != 0) {
                        V0 = org.telegram.messenger.g0.w0(this.f29337r, i10);
                        GradientDrawable gradientDrawable = new GradientDrawable(o9.d(this.f29341y), new int[]{this.f29337r, this.f29338s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        V0 = org.telegram.messenger.g0.V0(this.f29337r, false);
                        canvas.drawColor(this.f29337r);
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
            if (this.f29339w != 0) {
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
        int i11 = ks.Y1;
        if (i7 == i11 || i7 == ks.Z1) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.G;
            if (tL_theme != null && tL_theme.document != null) {
                if (str.equals(this.f29332h0)) {
                    this.f29332h0 = null;
                    Utilities.f22877e.c(new z1(8, this, (File) objArr[1]));
                } else if (str.equals(w7.r(null, this.G.document))) {
                    t();
                    if (i7 == i11) {
                        File file = new File(this.f29322b);
                        TLRPC.TL_theme tL_theme2 = this.G;
                        m6 m0 = n6.m0(file, tL_theme2.title, tL_theme2);
                        if (m0 != null && m0.f29324c != null && !new File(m0.f29324c).exists()) {
                            this.f29337r = m0.f29337r;
                            this.f29338s = m0.f29338s;
                            this.f29339w = m0.f29339w;
                            this.f29340x = m0.f29340x;
                            this.f29341y = m0.f29341y;
                            this.h = m0.h;
                            this.E = m0.E;
                            this.f29333i0 = m0.f29324c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = m0.f29327e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(m0.F).sendRequest(getwallpaper, new f6(this, m0, 1));
                            return;
                        }
                        s();
                    }
                }
            }
        }
    }

    public final k6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i7, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.f29328e0;
            k6 k6Var = (k6) longSparseArray.get(j3);
            if (k6Var != null) {
                return k6Var;
            }
            int i10 = this.f29330f0 + 1;
            this.f29330f0 = i10;
            k6 k6Var2 = new k6();
            i(k6Var2, themeSettings);
            k6Var2.f29225b = this;
            k6Var2.f29224a = i10;
            k6Var2.f29239r = tL_theme;
            k6Var2.f29241t = i7;
            longSparseArray.put(i10, k6Var2);
            return k6Var2;
        }
        k6 k6Var3 = (k6) this.f29326d0.get(j3);
        if (k6Var3 != null) {
            return k6Var3;
        }
        int i11 = this.f29331g0 + 1;
        this.f29331g0 = i11;
        k6 k6Var4 = new k6();
        i(k6Var4, themeSettings);
        k6Var4.f29225b = this;
        k6Var4.f29224a = i11;
        k6Var4.f29239r = tL_theme;
        k6Var4.f29241t = i7;
        this.f29323b0.put(i11, k6Var4);
        this.f29325c0.add(0, k6Var4);
        n6.J1(this);
        this.f29326d0.put(j3, k6Var4);
        return k6Var4;
    }

    public final k6 f(TLRPC.TL_theme tL_theme, int i7, int i10) {
        TLRPC.ThemeSettings themeSettings = null;
        if (tL_theme == null) {
            return null;
        }
        if (i10 < tL_theme.settings.size()) {
            themeSettings = tL_theme.settings.get(i10);
        }
        return e(tL_theme.f28631id, themeSettings, tL_theme, i7, false);
    }

    public final String j(k6 k6Var, boolean z10) {
        String s5;
        String n10;
        if (k6Var == null) {
            k6Var = k(false);
        }
        if (k6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f29320a);
                sb3.append("_");
                n10 = a8.p0.n(k6Var.f29224a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f29320a);
                sb4.append("_");
                n10 = a8.p0.n(k6Var.f29224a, "_wp", sb4);
            }
            sb2.append(n10);
            sb2.append(Utilities.f22875b.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            s5 = a8.p0.s(new StringBuilder(), this.f29320a, "_wp_o");
        } else {
            s5 = a8.p0.s(new StringBuilder(), this.f29320a, "_wp");
        }
        sb5.append(s5);
        sb5.append(Utilities.f22875b.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final k6 k(boolean z10) {
        k6 k6Var;
        if (this.f29325c0 == null || (k6Var = (k6) this.f29323b0.get(this.Z)) == null) {
            return null;
        }
        if (z10) {
            int i7 = this.f29331g0 + 1;
            this.f29331g0 = i7;
            k6 k6Var2 = new k6();
            k6Var2.f29226c = k6Var.f29226c;
            k6Var2.d = k6Var.d;
            k6Var2.f29227e = k6Var.f29227e;
            k6Var2.f29228f = k6Var.f29228f;
            k6Var2.f29229g = k6Var.f29229g;
            k6Var2.h = k6Var.h;
            k6Var2.f29230i = k6Var.f29230i;
            k6Var2.f29231j = k6Var.f29231j;
            k6Var2.f29232k = k6Var.f29232k;
            k6Var2.f29233l = k6Var.f29233l;
            k6Var2.f29234m = k6Var.f29234m;
            k6Var2.f29235n = k6Var.f29235n;
            k6Var2.f29236o = k6Var.f29236o;
            k6Var2.f29237p = k6Var.f29237p;
            k6Var2.f29238q = k6Var.f29238q;
            k6Var2.f29225b = this;
            e6 e6Var = this.f29334j0;
            if (e6Var != null) {
                ?? obj = new Object();
                obj.f28980a = "";
                obj.f28981b = "";
                obj.f28982c = "";
                obj.f28982c = e6Var.f28982c;
                obj.d = e6Var.d;
                obj.f28983e = e6Var.f28983e;
                obj.f28984f = e6Var.f28984f;
                obj.f28985g = e6Var.f28985g;
                obj.h = e6Var.h;
                obj.f28986i = e6Var.f28986i;
                obj.f28987j = e6Var.f28987j;
                obj.f28988k = e6Var.f28988k;
                obj.f28993p = this;
                obj.f28994q = k6Var2;
                if (!TextUtils.isEmpty(e6Var.f28980a)) {
                    try {
                        File file = new File(org.telegram.messenger.t0.h(), e6Var.f28980a);
                        File h = org.telegram.messenger.t0.h();
                        String j3 = obj.f28993p.j(obj.f28994q, false);
                        obj.f28980a = j3;
                        org.telegram.messenger.g0.E(file, new File(h, j3));
                    } catch (Exception e10) {
                        obj.f28980a = "";
                        a8.g(e10, true);
                    }
                } else {
                    obj.f28980a = "";
                }
                if (!TextUtils.isEmpty(e6Var.f28981b)) {
                    if (!e6Var.f28981b.equals(e6Var.f28980a)) {
                        try {
                            File file2 = new File(org.telegram.messenger.t0.h(), e6Var.f28981b);
                            File h7 = org.telegram.messenger.t0.h();
                            String j10 = obj.f28993p.j(obj.f28994q, true);
                            obj.f28981b = j10;
                            org.telegram.messenger.g0.E(file2, new File(h7, j10));
                        } catch (Exception e11) {
                            obj.f28981b = "";
                            a8.g(e11, true);
                        }
                    } else {
                        obj.f28981b = obj.f28980a;
                    }
                } else {
                    obj.f28981b = "";
                }
                k6Var2.f29245y = obj;
            }
            this.f29321a0 = this.Z;
            k6Var2.f29224a = i7;
            this.Z = i7;
            this.f29334j0 = k6Var2.f29245y;
            this.f29323b0.put(i7, k6Var2);
            this.f29325c0.add(0, k6Var2);
            n6.J1(this);
            return k6Var2;
        }
        return k6Var;
    }

    public final int l(int i7) {
        k6 k6Var = (k6) this.f29323b0.get(i7);
        if (k6Var != null) {
            return k6Var.f29226c;
        }
        return 0;
    }

    public final String m() {
        if (this.G != null) {
            return "remote" + this.G.f28631id;
        }
        return this.f29320a;
    }

    public final String n() {
        if ("Blue".equals(this.f29320a)) {
            return gd.N0(2131743941, null);
        }
        if ("Dark Blue".equals(this.f29320a)) {
            return gd.N0(2131743938, null);
        }
        if ("Arctic Blue".equals(this.f29320a)) {
            return gd.N0(2131743942, null);
        }
        if ("Day".equals(this.f29320a)) {
            return gd.N0(2131743937, null);
        }
        if ("Night".equals(this.f29320a)) {
            return gd.N0(2131743930, null);
        }
        TLRPC.TL_theme tL_theme = this.G;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f29320a;
    }

    public final int o() {
        if (this.T && this.Z == n6.f29627n) {
            return -3155485;
        }
        return this.M;
    }

    public final int p() {
        if (this.T && this.Z == n6.f29627n) {
            return -983328;
        }
        return this.S;
    }

    public final boolean q() {
        int i7 = this.f29335k0;
        if (i7 != -1) {
            if (i7 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f29320a) && !"Night".equals(this.f29320a)) {
            if ("Blue".equals(this.f29320a) || "Arctic Blue".equals(this.f29320a) || "Day".equals(this.f29320a)) {
                this.f29335k0 = 0;
            }
        } else {
            this.f29335k0 = 1;
        }
        if (this.f29335k0 == -1) {
            n6.H(n6.T0(new File(this.f29322b), null, new String[1]), this);
        }
        if (this.f29335k0 != 1) {
            return false;
        }
        return true;
    }

    public final void r(SharedPreferences sharedPreferences, k6 k6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                e6 e6Var = new e6();
                e6Var.f28980a = jSONObject.getString("wall");
                e6Var.f28981b = jSONObject.getString("owall");
                e6Var.d = jSONObject.getInt("pColor");
                e6Var.f28983e = jSONObject.getInt("pGrColor");
                e6Var.f28984f = jSONObject.optInt("pGrColor2");
                e6Var.f28985g = jSONObject.optInt("pGrColor3");
                e6Var.h = jSONObject.getInt("pGrAngle");
                e6Var.f28982c = jSONObject.getString("wallSlug");
                e6Var.f28986i = jSONObject.getBoolean("wBlur");
                e6Var.f28987j = jSONObject.getBoolean("wMotion");
                e6Var.f28988k = (float) jSONObject.getDouble("pIntensity");
                e6Var.f28993p = this;
                e6Var.f28994q = k6Var;
                if (k6Var != null) {
                    k6Var.f29245y = e6Var;
                } else {
                    this.f29334j0 = e6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    e6Var.f28982c = "d";
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
        n6.y1(true, false);
        if (this == n6.I && n6.M == null) {
            if (this != n6.J) {
                z10 = false;
            }
            n6.K1(this, z10, -1, null);
        }
    }

    public final void t() {
        ks.f(this.F).n(this, ks.Y1);
        ks.f(this.F).n(this, ks.Z1);
    }

    public final void u(int i7) {
        this.Z = i7;
        k6 k10 = k(false);
        if (k10 != null) {
            this.f29334j0 = k10.f29245y;
        }
    }

    public final void v(e6 e6Var) {
        if (this.f29334j0 != e6Var) {
            k6 k10 = k(false);
            e6 e6Var2 = this.f29334j0;
            if (e6Var2 != null) {
                e6.a(e6Var2);
            }
            if (e6Var != null) {
                e6Var.f28994q = k10;
                e6Var.f28993p = this;
                e6Var.c();
            }
            this.f29334j0 = e6Var;
            if (k10 != null) {
                k10.f29245y = e6Var;
            }
        }
    }

    public m6(m6 m6Var) {
        this.f29341y = 45;
        this.H = true;
        this.V = true;
        this.f29321a0 = -1;
        this.f29328e0 = new LongSparseArray();
        this.f29330f0 = 0;
        this.f29331g0 = 100;
        this.f29335k0 = -1;
        this.f29320a = m6Var.f29320a;
        this.f29322b = m6Var.f29322b;
        this.f29324c = m6Var.f29324c;
        this.d = m6Var.d;
        this.f29327e = m6Var.f29327e;
        this.f29329f = m6Var.f29329f;
        this.h = m6Var.h;
        this.f29336n = m6Var.f29336n;
        this.f29337r = m6Var.f29337r;
        this.f29338s = m6Var.f29338s;
        this.f29339w = m6Var.f29339w;
        this.f29340x = m6Var.f29340x;
        this.f29341y = m6Var.f29341y;
        this.E = m6Var.E;
        this.F = m6Var.F;
        this.G = m6Var.G;
        this.H = m6Var.H;
        this.I = m6Var.I;
        this.J = m6Var.J;
        this.K = m6Var.K;
        this.L = m6Var.L;
        this.M = m6Var.M;
        this.N = m6Var.N;
        this.O = m6Var.O;
        this.P = m6Var.P;
        this.Q = m6Var.Q;
        this.R = m6Var.R;
        this.S = m6Var.S;
        this.T = m6Var.T;
        this.U = m6Var.U;
        this.V = m6Var.V;
        this.W = m6Var.W;
        this.X = m6Var.X;
        this.Y = m6Var.Y;
        this.Z = m6Var.Z;
        this.f29321a0 = m6Var.f29321a0;
        this.f29323b0 = m6Var.f29323b0;
        this.f29325c0 = m6Var.f29325c0;
        this.f29326d0 = m6Var.f29326d0;
        this.f29331g0 = m6Var.f29331g0;
        this.f29332h0 = m6Var.f29332h0;
        this.f29333i0 = m6Var.f29333i0;
        this.f29334j0 = m6Var.f29334j0;
    }
}
