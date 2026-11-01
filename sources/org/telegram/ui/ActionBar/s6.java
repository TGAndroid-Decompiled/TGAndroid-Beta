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
import org.telegram.messenger.at;
import org.telegram.messenger.b8;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.vs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.jb0;
public final class s6 implements vs {
    public int D;
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
    public String f20802a;
    public SparseArray f20803a0;
    public String f20804b;
    public ArrayList f20805b0;
    public String f20806c;
    public LongSparseArray f20807c0;
    public String d;
    public final LongSparseArray f20808d0;
    public String e;
    public int f20809e0;
    public boolean f20810f;
    public int f20811f0;
    public String f20812g0;
    public boolean h;
    public String f20813h0;
    public m6 f20814i0;
    public int f20815j0;
    public boolean f20816n;
    public int f20817r;
    public int f20818s;
    public int f20819w;
    public int f20820x;
    public int f20821y;

    public s6() {
        this.f20821y = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f20808d0 = new LongSparseArray();
        this.f20809e0 = 0;
        this.f20811f0 = 100;
        this.f20815j0 = -1;
    }

    public static boolean a(r6 r6Var, TLRPC.ThemeSettings themeSettings) {
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
            i14 = t6.a1(wallPaperSettings.background_color);
            int i16 = themeSettings.wallpaper.settings.second_background_color;
            j12 = 4294967296L;
            if (i16 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = t6.a1(i16);
            }
            int i17 = themeSettings.wallpaper.settings.third_background_color;
            if (i17 == 0) {
                j11 = 4294967296L;
            } else {
                j11 = t6.a1(i17);
            }
            int i18 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i18 != 0) {
                j12 = t6.a1(i18);
            }
            i15 = org.telegram.messenger.i0.s1(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f7 = wallPaper2.settings.intensity / 100.0f;
                long j13 = j11;
                if (themeSettings.accent_color != r6Var.f20733c && themeSettings.outbox_accent_color == r6Var.d && i10 == r6Var.e && i11 == r6Var.f20734f && i12 == r6Var.f20735g && i13 == r6Var.h && themeSettings.message_colors_animated == r6Var.f20736i && i14 == r6Var.f20737j && j10 == r6Var.f20738k && j13 == r6Var.f20739l && j12 == r6Var.f20740m && i15 == r6Var.f20741n && TextUtils.equals(str, r6Var.f20742o) && Math.abs(f7 - r6Var.f20743p) < 0.001d) {
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
        if (themeSettings.accent_color != r6Var.f20733c) {
        }
        return z10;
    }

    public static void b(s6 s6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        s6Var.W = iArr.length;
        s6Var.f20805b0 = new ArrayList();
        s6Var.f20803a0 = new SparseArray();
        s6Var.f20807c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            r6 r6Var = new r6();
            r6Var.f20731a = iArr8[i10];
            if (t6.l1(r6Var)) {
                r6Var.f20752z = true;
            }
            r6Var.f20733c = iArr[i10];
            r6Var.f20732b = s6Var;
            r6Var.e = iArr2[i10];
            r6Var.f20734f = iArr3[i10];
            long j10 = iArr4[i10];
            r6Var.f20737j = j10;
            boolean z10 = s6Var.S;
            if (z10 && r6Var.f20731a == t6.f21109n) {
                r6Var.f20737j = 4294967296L;
            } else {
                r6Var.f20737j = j10;
            }
            if (z10 && r6Var.f20731a == t6.f21109n) {
                r6Var.f20738k = 4294967296L;
            } else {
                r6Var.f20738k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && r6Var.f20731a == t6.f21109n) {
                    r6Var.f20739l = 4294967296L;
                } else {
                    r6Var.f20739l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && r6Var.f20731a == t6.f21109n) {
                    r6Var.f20740m = 4294967296L;
                } else {
                    r6Var.f20740m = iArr7[i10];
                }
            }
            r6Var.f20743p = iArr10[i10] / 100.0f;
            r6Var.f20741n = iArr9[i10];
            r6Var.f20742o = strArr[i10];
            if ((t6.l1(r6Var) && s6Var.f20802a.equals("Dark Blue")) || s6Var.f20802a.equals("Night")) {
                r6Var.e = -14316059;
                r6Var.f20734f = -12422433;
                r6Var.f20735g = -8304937;
                r6Var.h = -6340950;
                if (s6Var.f20802a.equals("Night")) {
                    r6Var.f20743p = -0.57f;
                    r6Var.f20737j = -9666650L;
                    r6Var.f20738k = -13749173L;
                    r6Var.f20739l = -8883033L;
                    r6Var.f20740m = -13421992L;
                }
            }
            s6Var.f20803a0.put(r6Var.f20731a, r6Var);
            s6Var.f20805b0.add(r6Var);
        }
        s6Var.X = ((r6) s6Var.f20803a0.get(0)).f20733c;
    }

    public static void c(s6 s6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = s6Var.f20805b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = s6Var.f20805b0.size();
            for (int i10 = 0; i10 < size; i10++) {
                r6 r6Var = (r6) s6Var.f20805b0.get(i10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(s6Var.f20802a);
                sb2.append("_");
                s6Var.r(sharedPreferences, r6Var, a1.g.p(sb2, r6Var.f20731a, "_owp"));
            }
            return;
        }
        s6Var.r(sharedPreferences, null, a1.g.r(new StringBuilder(), s6Var.f20802a, "_owp"));
    }

    public static s6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            s6 s6Var = new s6();
            s6Var.f20802a = jSONObject.getString("name");
            s6Var.f20804b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                s6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.v(jSONObject.getString("info")));
                s6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                s6Var.G = jSONObject.getBoolean("loaded");
            }
            return s6Var;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static s6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        s6 s6Var = new s6();
        s6Var.f20802a = split[0];
        s6Var.f20804b = split[1];
        return s6Var;
    }

    public static void i(r6 r6Var, TLRPC.ThemeSettings themeSettings) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i14;
        r6Var.f20733c = themeSettings.accent_color;
        r6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i10 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        r6Var.e = i10;
        if (themeSettings.message_colors.size() > 1) {
            i11 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        r6Var.f20734f = i11;
        if (r6Var.e == i11) {
            r6Var.f20734f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i12 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        r6Var.f20735g = i12;
        if (themeSettings.message_colors.size() > 3) {
            i13 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i13 = 0;
        }
        r6Var.h = i13;
        r6Var.f20736i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            if (wallPaperSettings.background_color == 0) {
                r6Var.f20737j = 4294967296L;
            } else {
                r6Var.f20737j = t6.a1(i14);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                r6Var.f20738k = 4294967296L;
            } else {
                r6Var.f20738k = t6.a1(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                r6Var.f20739l = 4294967296L;
            } else {
                r6Var.f20739l = t6.a1(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                r6Var.f20740m = 4294967296L;
            } else {
                r6Var.f20740m = t6.a1(wallPaperSettings4.fourth_background_color);
            }
            r6Var.f20741n = org.telegram.messenger.i0.s1(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                r6Var.f20742o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                r6Var.f20743p = wallPaperSettings5.intensity / 100.0f;
                r6Var.f20744q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int V0;
        try {
            Bitmap e12 = org.telegram.messenger.i0.e1(org.telegram.messenger.i0.L(640.0f), org.telegram.messenger.i0.L(360.0f), file.getAbsolutePath(), null, 0);
            if (e12 != null && this.f20817r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(e12.getWidth(), e12.getHeight(), e12.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.f20819w;
                if (i10 != 0) {
                    V0 = jb0.g(this.f20817r, this.f20818s, i10, this.f20820x);
                } else {
                    int i11 = this.f20818s;
                    if (i11 != 0) {
                        V0 = org.telegram.messenger.i0.w0(this.f20817r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(f9.d(this.f20821y), new int[]{this.f20817r, this.f20818s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        V0 = org.telegram.messenger.i0.V0(this.f20817r, false);
                        canvas.drawColor(this.f20817r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(V0, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.D / 100.0f) * 255.0f));
                canvas.drawBitmap(e12, 0.0f, 0.0f, paint);
                canvas.setBitmap(null);
                e12 = createBitmap;
            }
            if (this.h) {
                e12 = Utilities.e(e12);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            if (this.f20819w != 0) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
            e12.compress(compressFormat, 87, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (Throwable th2) {
            f8.g(th2, true);
            return false;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = at.Y1;
        if (i10 == i12 || i10 == at.Z1) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.F;
            if (tL_theme != null && tL_theme.document != null) {
                if (str.equals(this.f20812g0)) {
                    this.f20812g0 = null;
                    Utilities.e.c(new mh.k(28, this, (File) objArr[1]));
                } else if (str.equals(b8.r(null, this.F.document))) {
                    t();
                    if (i10 == i12) {
                        File file = new File(this.f20804b);
                        TLRPC.TL_theme tL_theme2 = this.F;
                        s6 m0 = t6.m0(file, tL_theme2.title, tL_theme2);
                        if (m0 != null && m0.f20806c != null && !new File(m0.f20806c).exists()) {
                            this.f20817r = m0.f20817r;
                            this.f20818s = m0.f20818s;
                            this.f20819w = m0.f20819w;
                            this.f20820x = m0.f20820x;
                            this.f20821y = m0.f20821y;
                            this.h = m0.h;
                            this.D = m0.D;
                            this.f20813h0 = m0.f20806c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = m0.e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(m0.E).sendRequest(getwallpaper, new ag.k0(11, this, m0));
                            return;
                        }
                        s();
                    }
                }
            }
        }
    }

    public final r6 e(long j10, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.f20808d0;
            r6 r6Var = (r6) longSparseArray.get(j10);
            if (r6Var != null) {
                return r6Var;
            }
            int i11 = this.f20809e0 + 1;
            this.f20809e0 = i11;
            r6 r6Var2 = new r6();
            i(r6Var2, themeSettings);
            r6Var2.f20732b = this;
            r6Var2.f20731a = i11;
            r6Var2.f20745r = tL_theme;
            r6Var2.f20747t = i10;
            longSparseArray.put(i11, r6Var2);
            return r6Var2;
        }
        r6 r6Var3 = (r6) this.f20807c0.get(j10);
        if (r6Var3 != null) {
            return r6Var3;
        }
        int i12 = this.f20811f0 + 1;
        this.f20811f0 = i12;
        r6 r6Var4 = new r6();
        i(r6Var4, themeSettings);
        r6Var4.f20732b = this;
        r6Var4.f20731a = i12;
        r6Var4.f20745r = tL_theme;
        r6Var4.f20747t = i10;
        this.f20803a0.put(i12, r6Var4);
        this.f20805b0.add(0, r6Var4);
        t6.J1(this);
        this.f20807c0.put(j10, r6Var4);
        return r6Var4;
    }

    public final r6 f(TLRPC.TL_theme tL_theme, int i10, int i11) {
        TLRPC.ThemeSettings themeSettings = null;
        if (tL_theme == null) {
            return null;
        }
        if (i11 < tL_theme.settings.size()) {
            themeSettings = tL_theme.settings.get(i11);
        }
        return e(tL_theme.f19933id, themeSettings, tL_theme, i10, false);
    }

    public final String j(r6 r6Var, boolean z10) {
        String r10;
        String p5;
        if (r6Var == null) {
            r6Var = k(false);
        }
        if (r6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f20802a);
                sb3.append("_");
                p5 = a1.g.p(sb3, r6Var.f20731a, "_wp_o");
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f20802a);
                sb4.append("_");
                p5 = a1.g.p(sb4, r6Var.f20731a, "_wp");
            }
            sb2.append(p5);
            sb2.append(Utilities.f14520b.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z10) {
            r10 = a1.g.r(new StringBuilder(), this.f20802a, "_wp_o");
        } else {
            r10 = a1.g.r(new StringBuilder(), this.f20802a, "_wp");
        }
        sb5.append(r10);
        sb5.append(Utilities.f14520b.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final r6 k(boolean z10) {
        r6 r6Var;
        if (this.f20805b0 == null || (r6Var = (r6) this.f20803a0.get(this.Y)) == null) {
            return null;
        }
        if (z10) {
            int i10 = this.f20811f0 + 1;
            this.f20811f0 = i10;
            r6 r6Var2 = new r6();
            r6Var2.f20733c = r6Var.f20733c;
            r6Var2.d = r6Var.d;
            r6Var2.e = r6Var.e;
            r6Var2.f20734f = r6Var.f20734f;
            r6Var2.f20735g = r6Var.f20735g;
            r6Var2.h = r6Var.h;
            r6Var2.f20736i = r6Var.f20736i;
            r6Var2.f20737j = r6Var.f20737j;
            r6Var2.f20738k = r6Var.f20738k;
            r6Var2.f20739l = r6Var.f20739l;
            r6Var2.f20740m = r6Var.f20740m;
            r6Var2.f20741n = r6Var.f20741n;
            r6Var2.f20742o = r6Var.f20742o;
            r6Var2.f20743p = r6Var.f20743p;
            r6Var2.f20744q = r6Var.f20744q;
            r6Var2.f20732b = this;
            m6 m6Var = this.f20814i0;
            if (m6Var != null) {
                ?? obj = new Object();
                obj.f20589a = "";
                obj.f20590b = "";
                obj.f20591c = "";
                obj.f20591c = m6Var.f20591c;
                obj.d = m6Var.d;
                obj.e = m6Var.e;
                obj.f20592f = m6Var.f20592f;
                obj.f20593g = m6Var.f20593g;
                obj.h = m6Var.h;
                obj.f20594i = m6Var.f20594i;
                obj.f20595j = m6Var.f20595j;
                obj.f20596k = m6Var.f20596k;
                obj.f20601p = this;
                obj.f20602q = r6Var2;
                if (!TextUtils.isEmpty(m6Var.f20589a)) {
                    try {
                        File file = new File(org.telegram.messenger.w0.h(), m6Var.f20589a);
                        File h = org.telegram.messenger.w0.h();
                        String j10 = obj.f20601p.j(obj.f20602q, false);
                        obj.f20589a = j10;
                        org.telegram.messenger.i0.E(file, new File(h, j10));
                    } catch (Exception e) {
                        obj.f20589a = "";
                        f8.g(e, true);
                    }
                } else {
                    obj.f20589a = "";
                }
                if (!TextUtils.isEmpty(m6Var.f20590b)) {
                    if (!m6Var.f20590b.equals(m6Var.f20589a)) {
                        try {
                            File file2 = new File(org.telegram.messenger.w0.h(), m6Var.f20590b);
                            File h10 = org.telegram.messenger.w0.h();
                            String j11 = obj.f20601p.j(obj.f20602q, true);
                            obj.f20590b = j11;
                            org.telegram.messenger.i0.E(file2, new File(h10, j11));
                        } catch (Exception e7) {
                            obj.f20590b = "";
                            f8.g(e7, true);
                        }
                    } else {
                        obj.f20590b = obj.f20589a;
                    }
                } else {
                    obj.f20590b = "";
                }
                r6Var2.f20751y = obj;
            }
            this.Z = this.Y;
            r6Var2.f20731a = i10;
            this.Y = i10;
            this.f20814i0 = r6Var2.f20751y;
            this.f20803a0.put(i10, r6Var2);
            this.f20805b0.add(0, r6Var2);
            t6.J1(this);
            return r6Var2;
        }
        return r6Var;
    }

    public final int l(int i10) {
        r6 r6Var = (r6) this.f20803a0.get(i10);
        if (r6Var != null) {
            return r6Var.f20733c;
        }
        return 0;
    }

    public final String m() {
        if (this.F != null) {
            return "remote" + this.F.f19933id;
        }
        return this.f20802a;
    }

    public final String n() {
        if ("Blue".equals(this.f20802a)) {
            return dd.L0(2131744211, null);
        }
        if ("Dark Blue".equals(this.f20802a)) {
            return dd.L0(2131744208, null);
        }
        if ("Arctic Blue".equals(this.f20802a)) {
            return dd.L0(2131744212, null);
        }
        if ("Day".equals(this.f20802a)) {
            return dd.L0(2131744207, null);
        }
        if ("Night".equals(this.f20802a)) {
            return dd.L0(2131744200, null);
        }
        TLRPC.TL_theme tL_theme = this.F;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f20802a;
    }

    public final int o() {
        if (this.S && this.Y == t6.f21109n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == t6.f21109n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i10 = this.f20815j0;
        if (i10 != -1) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f20802a) && !"Night".equals(this.f20802a)) {
            if ("Blue".equals(this.f20802a) || "Arctic Blue".equals(this.f20802a) || "Day".equals(this.f20802a)) {
                this.f20815j0 = 0;
            }
        } else {
            this.f20815j0 = 1;
        }
        if (this.f20815j0 == -1) {
            t6.H(t6.T0(new File(this.f20804b), null, new String[1]), this);
        }
        if (this.f20815j0 != 1) {
            return false;
        }
        return true;
    }

    public final void r(SharedPreferences sharedPreferences, r6 r6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                m6 m6Var = new m6();
                m6Var.f20589a = jSONObject.getString("wall");
                m6Var.f20590b = jSONObject.getString("owall");
                m6Var.d = jSONObject.getInt("pColor");
                m6Var.e = jSONObject.getInt("pGrColor");
                m6Var.f20592f = jSONObject.optInt("pGrColor2");
                m6Var.f20593g = jSONObject.optInt("pGrColor3");
                m6Var.h = jSONObject.getInt("pGrAngle");
                m6Var.f20591c = jSONObject.getString("wallSlug");
                m6Var.f20594i = jSONObject.getBoolean("wBlur");
                m6Var.f20595j = jSONObject.getBoolean("wMotion");
                m6Var.f20596k = (float) jSONObject.getDouble("pIntensity");
                m6Var.f20601p = this;
                m6Var.f20602q = r6Var;
                if (r6Var != null) {
                    r6Var.f20751y = m6Var;
                } else {
                    this.f20814i0 = m6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    m6Var.f20591c = "d";
                }
            }
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    public final void s() {
        boolean z10 = true;
        this.G = true;
        this.T = false;
        t6.y1(true, false);
        if (this == t6.I && t6.M == null) {
            if (this != t6.J) {
                z10 = false;
            }
            t6.K1(this, z10, -1, null);
        }
    }

    public final void t() {
        at.f(this.E).n(this, at.Y1);
        at.f(this.E).n(this, at.Z1);
    }

    public final void u(int i10) {
        this.Y = i10;
        r6 k10 = k(false);
        if (k10 != null) {
            this.f20814i0 = k10.f20751y;
        }
    }

    public final void v(m6 m6Var) {
        if (this.f20814i0 != m6Var) {
            r6 k10 = k(false);
            m6 m6Var2 = this.f20814i0;
            if (m6Var2 != null) {
                m6.a(m6Var2);
            }
            if (m6Var != null) {
                m6Var.f20602q = k10;
                m6Var.f20601p = this;
                m6Var.c();
            }
            this.f20814i0 = m6Var;
            if (k10 != null) {
                k10.f20751y = m6Var;
            }
        }
    }

    public s6(s6 s6Var) {
        this.f20821y = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f20808d0 = new LongSparseArray();
        this.f20809e0 = 0;
        this.f20811f0 = 100;
        this.f20815j0 = -1;
        this.f20802a = s6Var.f20802a;
        this.f20804b = s6Var.f20804b;
        this.f20806c = s6Var.f20806c;
        this.d = s6Var.d;
        this.e = s6Var.e;
        this.f20810f = s6Var.f20810f;
        this.h = s6Var.h;
        this.f20816n = s6Var.f20816n;
        this.f20817r = s6Var.f20817r;
        this.f20818s = s6Var.f20818s;
        this.f20819w = s6Var.f20819w;
        this.f20820x = s6Var.f20820x;
        this.f20821y = s6Var.f20821y;
        this.D = s6Var.D;
        this.E = s6Var.E;
        this.F = s6Var.F;
        this.G = s6Var.G;
        this.H = s6Var.H;
        this.I = s6Var.I;
        this.J = s6Var.J;
        this.K = s6Var.K;
        this.L = s6Var.L;
        this.M = s6Var.M;
        this.N = s6Var.N;
        this.O = s6Var.O;
        this.P = s6Var.P;
        this.Q = s6Var.Q;
        this.R = s6Var.R;
        this.S = s6Var.S;
        this.T = s6Var.T;
        this.U = s6Var.U;
        this.V = s6Var.V;
        this.W = s6Var.W;
        this.X = s6Var.X;
        this.Y = s6Var.Y;
        this.Z = s6Var.Z;
        this.f20803a0 = s6Var.f20803a0;
        this.f20805b0 = s6Var.f20805b0;
        this.f20807c0 = s6Var.f20807c0;
        this.f20811f0 = s6Var.f20811f0;
        this.f20812g0 = s6Var.f20812g0;
        this.f20813h0 = s6Var.f20813h0;
        this.f20814i0 = s6Var.f20814i0;
    }
}
