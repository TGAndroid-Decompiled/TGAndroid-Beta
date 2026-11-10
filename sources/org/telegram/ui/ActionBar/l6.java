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
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.qa0;
public final class l6 implements ls {
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
    public String f27765a;
    public SparseArray f27766a0;
    public String f27767b;
    public ArrayList f27768b0;
    public String f27769c;
    public LongSparseArray f27770c0;
    public String d;
    public final LongSparseArray f27771d0;
    public String f27772e;
    public int f27773e0;
    public boolean f27774f;
    public int f27775f0;
    public String f27776g0;
    public boolean h;
    public String f27777h0;
    public e6 f27778i0;
    public int f27779j0;
    public boolean f27780n;
    public int f27781r;
    public int f27782s;
    public int f27783w;
    public int f27784x;
    public int f27785y;

    public l6() {
        this.f27785y = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f27771d0 = new LongSparseArray();
        this.f27773e0 = 0;
        this.f27775f0 = 100;
        this.f27779j0 = -1;
    }

    public static boolean a(j6 j6Var, TLRPC.ThemeSettings themeSettings) {
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z9;
        boolean z10;
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
            z9 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z10 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
                long j12 = j10;
                if (themeSettings.accent_color != j6Var.f27611c && themeSettings.outbox_accent_color == j6Var.d && i7 == j6Var.f27612e && i10 == j6Var.f27613f && i11 == j6Var.f27614g && i12 == j6Var.h && themeSettings.message_colors_animated == j6Var.f27615i && i13 == j6Var.f27616j && j3 == j6Var.f27617k && j12 == j6Var.f27618l && j11 == j6Var.f27619m && i14 == j6Var.f27620n && TextUtils.equals(str, j6Var.f27621o) && Math.abs(f10 - j6Var.f27622p) < 0.001d) {
                    return z10;
                }
                return z9;
            }
        } else {
            z9 = false;
            z10 = true;
            j3 = 0;
            j10 = 0;
            j11 = 0;
            i13 = 0;
            i14 = 0;
        }
        str = null;
        f10 = 0.0f;
        long j122 = j10;
        if (themeSettings.accent_color != j6Var.f27611c) {
        }
        return z9;
    }

    public static void b(l6 l6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        l6Var.W = iArr.length;
        l6Var.f27768b0 = new ArrayList();
        l6Var.f27766a0 = new SparseArray();
        l6Var.f27770c0 = new LongSparseArray();
        for (int i7 = 0; i7 < iArr.length; i7++) {
            j6 j6Var = new j6();
            j6Var.f27609a = iArr8[i7];
            if (m6.l1(j6Var)) {
                j6Var.f27631z = true;
            }
            j6Var.f27611c = iArr[i7];
            j6Var.f27610b = l6Var;
            j6Var.f27612e = iArr2[i7];
            j6Var.f27613f = iArr3[i7];
            long j3 = iArr4[i7];
            j6Var.f27616j = j3;
            boolean z9 = l6Var.S;
            if (z9 && j6Var.f27609a == m6.f28066n) {
                j6Var.f27616j = 4294967296L;
            } else {
                j6Var.f27616j = j3;
            }
            if (z9 && j6Var.f27609a == m6.f28066n) {
                j6Var.f27617k = 4294967296L;
            } else {
                j6Var.f27617k = iArr5[i7];
            }
            if (iArr6 != null) {
                if (z9 && j6Var.f27609a == m6.f28066n) {
                    j6Var.f27618l = 4294967296L;
                } else {
                    j6Var.f27618l = iArr6[i7];
                }
            }
            if (iArr7 != null) {
                if (z9 && j6Var.f27609a == m6.f28066n) {
                    j6Var.f27619m = 4294967296L;
                } else {
                    j6Var.f27619m = iArr7[i7];
                }
            }
            j6Var.f27622p = iArr10[i7] / 100.0f;
            j6Var.f27620n = iArr9[i7];
            j6Var.f27621o = strArr[i7];
            if ((m6.l1(j6Var) && l6Var.f27765a.equals("Dark Blue")) || l6Var.f27765a.equals("Night")) {
                j6Var.f27612e = -14316059;
                j6Var.f27613f = -12422433;
                j6Var.f27614g = -8304937;
                j6Var.h = -6340950;
                if (l6Var.f27765a.equals("Night")) {
                    j6Var.f27622p = -0.57f;
                    j6Var.f27616j = -9666650L;
                    j6Var.f27617k = -13749173L;
                    j6Var.f27618l = -8883033L;
                    j6Var.f27619m = -13421992L;
                }
            }
            l6Var.f27766a0.put(j6Var.f27609a, j6Var);
            l6Var.f27768b0.add(j6Var);
        }
        l6Var.X = ((j6) l6Var.f27766a0.get(0)).f27611c;
    }

    public static void c(l6 l6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = l6Var.f27768b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = l6Var.f27768b0.size();
            for (int i7 = 0; i7 < size; i7++) {
                j6 j6Var = (j6) l6Var.f27768b0.get(i7);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(l6Var.f27765a);
                sb2.append("_");
                l6Var.r(sharedPreferences, j6Var, a8.p0.n(j6Var.f27609a, "_owp", sb2));
            }
            return;
        }
        l6Var.r(sharedPreferences, null, a8.p0.s(new StringBuilder(), l6Var.f27765a, "_owp"));
    }

    public static l6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            l6 l6Var = new l6();
            l6Var.f27765a = jSONObject.getString("name");
            l6Var.f27767b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                l6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.v(jSONObject.getString("info")));
                l6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                l6Var.G = jSONObject.getBoolean("loaded");
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
        l6Var.f27765a = split[0];
        l6Var.f27767b = split[1];
        return l6Var;
    }

    public static void i(j6 j6Var, TLRPC.ThemeSettings themeSettings) {
        int i7;
        int i10;
        int i11;
        int i12;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        j6Var.f27611c = themeSettings.accent_color;
        j6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i7 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i7 = 0;
        }
        j6Var.f27612e = i7;
        if (themeSettings.message_colors.size() > 1) {
            i10 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        j6Var.f27613f = i10;
        if (j6Var.f27612e == i10) {
            j6Var.f27613f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i11 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        j6Var.f27614g = i11;
        if (themeSettings.message_colors.size() > 3) {
            i12 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        j6Var.h = i12;
        j6Var.f27615i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            if (wallPaperSettings.background_color == 0) {
                j6Var.f27616j = 4294967296L;
            } else {
                j6Var.f27616j = m6.a1(i13);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                j6Var.f27617k = 4294967296L;
            } else {
                j6Var.f27617k = m6.a1(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                j6Var.f27618l = 4294967296L;
            } else {
                j6Var.f27618l = m6.a1(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                j6Var.f27619m = 4294967296L;
            } else {
                j6Var.f27619m = m6.a1(wallPaperSettings4.fourth_background_color);
            }
            j6Var.f27620n = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                j6Var.f27621o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                j6Var.f27622p = wallPaperSettings5.intensity / 100.0f;
                j6Var.f27623q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int V0;
        try {
            Bitmap e12 = org.telegram.messenger.g0.e1(org.telegram.messenger.g0.L(640.0f), org.telegram.messenger.g0.L(360.0f), file.getAbsolutePath(), null, 0);
            if (e12 != null && this.f27781r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(e12.getWidth(), e12.getHeight(), e12.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i7 = this.f27783w;
                if (i7 != 0) {
                    V0 = qa0.g(this.f27781r, this.f27782s, i7, this.f27784x);
                } else {
                    int i10 = this.f27782s;
                    if (i10 != 0) {
                        V0 = org.telegram.messenger.g0.w0(this.f27781r, i10);
                        GradientDrawable gradientDrawable = new GradientDrawable(j9.d(this.f27785y), new int[]{this.f27781r, this.f27782s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        V0 = org.telegram.messenger.g0.V0(this.f27781r, false);
                        canvas.drawColor(this.f27781r);
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
            if (this.f27783w != 0) {
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
        int i11 = qs.Y1;
        if (i7 == i11 || i7 == qs.Z1) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.F;
            if (tL_theme != null && tL_theme.document != null) {
                if (str.equals(this.f27776g0)) {
                    this.f27776g0 = null;
                    Utilities.f21341e.c(new c(5, this, (File) objArr[1]));
                } else if (str.equals(w7.r(null, this.F.document))) {
                    t();
                    if (i7 == i11) {
                        File file = new File(this.f27767b);
                        TLRPC.TL_theme tL_theme2 = this.F;
                        l6 m0 = m6.m0(file, tL_theme2.title, tL_theme2);
                        if (m0 != null && m0.f27769c != null && !new File(m0.f27769c).exists()) {
                            this.f27781r = m0.f27781r;
                            this.f27782s = m0.f27782s;
                            this.f27783w = m0.f27783w;
                            this.f27784x = m0.f27784x;
                            this.f27785y = m0.f27785y;
                            this.h = m0.h;
                            this.D = m0.D;
                            this.f27777h0 = m0.f27769c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = m0.f27772e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(m0.E).sendRequest(getwallpaper, new bi.j(27, this, m0));
                            return;
                        }
                        s();
                    }
                }
            }
        }
    }

    public final j6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i7, boolean z9) {
        if (z9) {
            LongSparseArray longSparseArray = this.f27771d0;
            j6 j6Var = (j6) longSparseArray.get(j3);
            if (j6Var != null) {
                return j6Var;
            }
            int i10 = this.f27773e0 + 1;
            this.f27773e0 = i10;
            j6 j6Var2 = new j6();
            i(j6Var2, themeSettings);
            j6Var2.f27610b = this;
            j6Var2.f27609a = i10;
            j6Var2.f27624r = tL_theme;
            j6Var2.f27626t = i7;
            longSparseArray.put(i10, j6Var2);
            return j6Var2;
        }
        j6 j6Var3 = (j6) this.f27770c0.get(j3);
        if (j6Var3 != null) {
            return j6Var3;
        }
        int i11 = this.f27775f0 + 1;
        this.f27775f0 = i11;
        j6 j6Var4 = new j6();
        i(j6Var4, themeSettings);
        j6Var4.f27610b = this;
        j6Var4.f27609a = i11;
        j6Var4.f27624r = tL_theme;
        j6Var4.f27626t = i7;
        this.f27766a0.put(i11, j6Var4);
        this.f27768b0.add(0, j6Var4);
        m6.J1(this);
        this.f27770c0.put(j3, j6Var4);
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
        return e(tL_theme.f27099id, themeSettings, tL_theme, i7, false);
    }

    public final String j(j6 j6Var, boolean z9) {
        String s5;
        String n10;
        if (j6Var == null) {
            j6Var = k(false);
        }
        if (j6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z9) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f27765a);
                sb3.append("_");
                n10 = a8.p0.n(j6Var.f27609a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f27765a);
                sb4.append("_");
                n10 = a8.p0.n(j6Var.f27609a, "_wp", sb4);
            }
            sb2.append(n10);
            sb2.append(Utilities.f21339b.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z9) {
            s5 = a8.p0.s(new StringBuilder(), this.f27765a, "_wp_o");
        } else {
            s5 = a8.p0.s(new StringBuilder(), this.f27765a, "_wp");
        }
        sb5.append(s5);
        sb5.append(Utilities.f21339b.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final j6 k(boolean z9) {
        j6 j6Var;
        if (this.f27768b0 == null || (j6Var = (j6) this.f27766a0.get(this.Y)) == null) {
            return null;
        }
        if (z9) {
            int i7 = this.f27775f0 + 1;
            this.f27775f0 = i7;
            j6 j6Var2 = new j6();
            j6Var2.f27611c = j6Var.f27611c;
            j6Var2.d = j6Var.d;
            j6Var2.f27612e = j6Var.f27612e;
            j6Var2.f27613f = j6Var.f27613f;
            j6Var2.f27614g = j6Var.f27614g;
            j6Var2.h = j6Var.h;
            j6Var2.f27615i = j6Var.f27615i;
            j6Var2.f27616j = j6Var.f27616j;
            j6Var2.f27617k = j6Var.f27617k;
            j6Var2.f27618l = j6Var.f27618l;
            j6Var2.f27619m = j6Var.f27619m;
            j6Var2.f27620n = j6Var.f27620n;
            j6Var2.f27621o = j6Var.f27621o;
            j6Var2.f27622p = j6Var.f27622p;
            j6Var2.f27623q = j6Var.f27623q;
            j6Var2.f27610b = this;
            e6 e6Var = this.f27778i0;
            if (e6Var != null) {
                ?? obj = new Object();
                obj.f27448a = "";
                obj.f27449b = "";
                obj.f27450c = "";
                obj.f27450c = e6Var.f27450c;
                obj.d = e6Var.d;
                obj.f27451e = e6Var.f27451e;
                obj.f27452f = e6Var.f27452f;
                obj.f27453g = e6Var.f27453g;
                obj.h = e6Var.h;
                obj.f27454i = e6Var.f27454i;
                obj.f27455j = e6Var.f27455j;
                obj.f27456k = e6Var.f27456k;
                obj.f27461p = this;
                obj.f27462q = j6Var2;
                if (!TextUtils.isEmpty(e6Var.f27448a)) {
                    try {
                        File file = new File(org.telegram.messenger.t0.h(), e6Var.f27448a);
                        File h = org.telegram.messenger.t0.h();
                        String j3 = obj.f27461p.j(obj.f27462q, false);
                        obj.f27448a = j3;
                        org.telegram.messenger.g0.E(file, new File(h, j3));
                    } catch (Exception e10) {
                        obj.f27448a = "";
                        a8.g(e10, true);
                    }
                } else {
                    obj.f27448a = "";
                }
                if (!TextUtils.isEmpty(e6Var.f27449b)) {
                    if (!e6Var.f27449b.equals(e6Var.f27448a)) {
                        try {
                            File file2 = new File(org.telegram.messenger.t0.h(), e6Var.f27449b);
                            File h7 = org.telegram.messenger.t0.h();
                            String j10 = obj.f27461p.j(obj.f27462q, true);
                            obj.f27449b = j10;
                            org.telegram.messenger.g0.E(file2, new File(h7, j10));
                        } catch (Exception e11) {
                            obj.f27449b = "";
                            a8.g(e11, true);
                        }
                    } else {
                        obj.f27449b = obj.f27448a;
                    }
                } else {
                    obj.f27449b = "";
                }
                j6Var2.f27630y = obj;
            }
            this.Z = this.Y;
            j6Var2.f27609a = i7;
            this.Y = i7;
            this.f27778i0 = j6Var2.f27630y;
            this.f27766a0.put(i7, j6Var2);
            this.f27768b0.add(0, j6Var2);
            m6.J1(this);
            return j6Var2;
        }
        return j6Var;
    }

    public final int l(int i7) {
        j6 j6Var = (j6) this.f27766a0.get(i7);
        if (j6Var != null) {
            return j6Var.f27611c;
        }
        return 0;
    }

    public final String m() {
        if (this.F != null) {
            return "remote" + this.F.f27099id;
        }
        return this.f27765a;
    }

    public final String n() {
        if ("Blue".equals(this.f27765a)) {
            return id.M0(2131744186, null);
        }
        if ("Dark Blue".equals(this.f27765a)) {
            return id.M0(2131744183, null);
        }
        if ("Arctic Blue".equals(this.f27765a)) {
            return id.M0(2131744187, null);
        }
        if ("Day".equals(this.f27765a)) {
            return id.M0(2131744182, null);
        }
        if ("Night".equals(this.f27765a)) {
            return id.M0(2131744175, null);
        }
        TLRPC.TL_theme tL_theme = this.F;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f27765a;
    }

    public final int o() {
        if (this.S && this.Y == m6.f28066n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == m6.f28066n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i7 = this.f27779j0;
        if (i7 != -1) {
            if (i7 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f27765a) && !"Night".equals(this.f27765a)) {
            if ("Blue".equals(this.f27765a) || "Arctic Blue".equals(this.f27765a) || "Day".equals(this.f27765a)) {
                this.f27779j0 = 0;
            }
        } else {
            this.f27779j0 = 1;
        }
        if (this.f27779j0 == -1) {
            m6.H(m6.T0(new File(this.f27767b), null, new String[1]), this);
        }
        if (this.f27779j0 != 1) {
            return false;
        }
        return true;
    }

    public final void r(SharedPreferences sharedPreferences, j6 j6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                e6 e6Var = new e6();
                e6Var.f27448a = jSONObject.getString("wall");
                e6Var.f27449b = jSONObject.getString("owall");
                e6Var.d = jSONObject.getInt("pColor");
                e6Var.f27451e = jSONObject.getInt("pGrColor");
                e6Var.f27452f = jSONObject.optInt("pGrColor2");
                e6Var.f27453g = jSONObject.optInt("pGrColor3");
                e6Var.h = jSONObject.getInt("pGrAngle");
                e6Var.f27450c = jSONObject.getString("wallSlug");
                e6Var.f27454i = jSONObject.getBoolean("wBlur");
                e6Var.f27455j = jSONObject.getBoolean("wMotion");
                e6Var.f27456k = (float) jSONObject.getDouble("pIntensity");
                e6Var.f27461p = this;
                e6Var.f27462q = j6Var;
                if (j6Var != null) {
                    j6Var.f27630y = e6Var;
                } else {
                    this.f27778i0 = e6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    e6Var.f27450c = "d";
                }
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public final void s() {
        boolean z9 = true;
        this.G = true;
        this.T = false;
        m6.y1(true, false);
        if (this == m6.I && m6.M == null) {
            if (this != m6.J) {
                z9 = false;
            }
            m6.K1(this, z9, -1, null);
        }
    }

    public final void t() {
        qs.f(this.E).n(this, qs.Y1);
        qs.f(this.E).n(this, qs.Z1);
    }

    public final void u(int i7) {
        this.Y = i7;
        j6 k10 = k(false);
        if (k10 != null) {
            this.f27778i0 = k10.f27630y;
        }
    }

    public final void v(e6 e6Var) {
        if (this.f27778i0 != e6Var) {
            j6 k10 = k(false);
            e6 e6Var2 = this.f27778i0;
            if (e6Var2 != null) {
                e6.a(e6Var2);
            }
            if (e6Var != null) {
                e6Var.f27462q = k10;
                e6Var.f27461p = this;
                e6Var.c();
            }
            this.f27778i0 = e6Var;
            if (k10 != null) {
                k10.f27630y = e6Var;
            }
        }
    }

    public l6(l6 l6Var) {
        this.f27785y = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f27771d0 = new LongSparseArray();
        this.f27773e0 = 0;
        this.f27775f0 = 100;
        this.f27779j0 = -1;
        this.f27765a = l6Var.f27765a;
        this.f27767b = l6Var.f27767b;
        this.f27769c = l6Var.f27769c;
        this.d = l6Var.d;
        this.f27772e = l6Var.f27772e;
        this.f27774f = l6Var.f27774f;
        this.h = l6Var.h;
        this.f27780n = l6Var.f27780n;
        this.f27781r = l6Var.f27781r;
        this.f27782s = l6Var.f27782s;
        this.f27783w = l6Var.f27783w;
        this.f27784x = l6Var.f27784x;
        this.f27785y = l6Var.f27785y;
        this.D = l6Var.D;
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
        this.f27766a0 = l6Var.f27766a0;
        this.f27768b0 = l6Var.f27768b0;
        this.f27770c0 = l6Var.f27770c0;
        this.f27775f0 = l6Var.f27775f0;
        this.f27776g0 = l6Var.f27776g0;
        this.f27777h0 = l6Var.f27777h0;
        this.f27778i0 = l6Var.f27778i0;
    }
}
