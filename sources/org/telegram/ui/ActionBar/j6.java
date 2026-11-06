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
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.qa0;
public final class j6 implements ls {
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
    public String f27626a;
    public SparseArray f27627a0;
    public String f27628b;
    public ArrayList f27629b0;
    public String f27630c;
    public LongSparseArray f27631c0;
    public String d;
    public final LongSparseArray f27632d0;
    public String f27633e;
    public int f27634e0;
    public boolean f27635f;
    public int f27636f0;
    public String f27637g0;
    public boolean h;
    public String f27638h0;
    public c6 f27639i0;
    public int f27640j0;
    public boolean f27641n;
    public int f27642r;
    public int f27643s;
    public int f27644w;
    public int f27645x;
    public int f27646y;

    public j6() {
        this.f27646y = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f27632d0 = new LongSparseArray();
        this.f27634e0 = 0;
        this.f27636f0 = 100;
        this.f27640j0 = -1;
    }

    public static boolean a(h6 h6Var, TLRPC.ThemeSettings themeSettings) {
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
            i13 = k6.a1(wallPaperSettings.background_color);
            int i15 = themeSettings.wallpaper.settings.second_background_color;
            j11 = 4294967296L;
            if (i15 == 0) {
                j3 = 4294967296L;
            } else {
                j3 = k6.a1(i15);
            }
            int i16 = themeSettings.wallpaper.settings.third_background_color;
            if (i16 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = k6.a1(i16);
            }
            int i17 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i17 != 0) {
                j11 = k6.a1(i17);
            }
            i14 = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            z9 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z10 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
                long j12 = j10;
                if (themeSettings.accent_color != h6Var.f27518c && themeSettings.outbox_accent_color == h6Var.d && i7 == h6Var.f27519e && i10 == h6Var.f27520f && i11 == h6Var.f27521g && i12 == h6Var.h && themeSettings.message_colors_animated == h6Var.f27522i && i13 == h6Var.f27523j && j3 == h6Var.f27524k && j12 == h6Var.f27525l && j11 == h6Var.f27526m && i14 == h6Var.f27527n && TextUtils.equals(str, h6Var.f27528o) && Math.abs(f10 - h6Var.f27529p) < 0.001d) {
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
        if (themeSettings.accent_color != h6Var.f27518c) {
        }
        return z9;
    }

    public static void b(j6 j6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        j6Var.W = iArr.length;
        j6Var.f27629b0 = new ArrayList();
        j6Var.f27627a0 = new SparseArray();
        j6Var.f27631c0 = new LongSparseArray();
        for (int i7 = 0; i7 < iArr.length; i7++) {
            h6 h6Var = new h6();
            h6Var.f27516a = iArr8[i7];
            if (k6.l1(h6Var)) {
                h6Var.f27538z = true;
            }
            h6Var.f27518c = iArr[i7];
            h6Var.f27517b = j6Var;
            h6Var.f27519e = iArr2[i7];
            h6Var.f27520f = iArr3[i7];
            long j3 = iArr4[i7];
            h6Var.f27523j = j3;
            boolean z9 = j6Var.S;
            if (z9 && h6Var.f27516a == k6.f28025n) {
                h6Var.f27523j = 4294967296L;
            } else {
                h6Var.f27523j = j3;
            }
            if (z9 && h6Var.f27516a == k6.f28025n) {
                h6Var.f27524k = 4294967296L;
            } else {
                h6Var.f27524k = iArr5[i7];
            }
            if (iArr6 != null) {
                if (z9 && h6Var.f27516a == k6.f28025n) {
                    h6Var.f27525l = 4294967296L;
                } else {
                    h6Var.f27525l = iArr6[i7];
                }
            }
            if (iArr7 != null) {
                if (z9 && h6Var.f27516a == k6.f28025n) {
                    h6Var.f27526m = 4294967296L;
                } else {
                    h6Var.f27526m = iArr7[i7];
                }
            }
            h6Var.f27529p = iArr10[i7] / 100.0f;
            h6Var.f27527n = iArr9[i7];
            h6Var.f27528o = strArr[i7];
            if ((k6.l1(h6Var) && j6Var.f27626a.equals("Dark Blue")) || j6Var.f27626a.equals("Night")) {
                h6Var.f27519e = -14316059;
                h6Var.f27520f = -12422433;
                h6Var.f27521g = -8304937;
                h6Var.h = -6340950;
                if (j6Var.f27626a.equals("Night")) {
                    h6Var.f27529p = -0.57f;
                    h6Var.f27523j = -9666650L;
                    h6Var.f27524k = -13749173L;
                    h6Var.f27525l = -8883033L;
                    h6Var.f27526m = -13421992L;
                }
            }
            j6Var.f27627a0.put(h6Var.f27516a, h6Var);
            j6Var.f27629b0.add(h6Var);
        }
        j6Var.X = ((h6) j6Var.f27627a0.get(0)).f27518c;
    }

    public static void c(j6 j6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = j6Var.f27629b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = j6Var.f27629b0.size();
            for (int i7 = 0; i7 < size; i7++) {
                h6 h6Var = (h6) j6Var.f27629b0.get(i7);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j6Var.f27626a);
                sb2.append("_");
                j6Var.r(sharedPreferences, h6Var, a8.p0.n(h6Var.f27516a, "_owp", sb2));
            }
            return;
        }
        j6Var.r(sharedPreferences, null, a8.p0.s(new StringBuilder(), j6Var.f27626a, "_owp"));
    }

    public static j6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            j6 j6Var = new j6();
            j6Var.f27626a = jSONObject.getString("name");
            j6Var.f27628b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                j6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.v(jSONObject.getString("info")));
                j6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                j6Var.G = jSONObject.getBoolean("loaded");
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
        j6Var.f27626a = split[0];
        j6Var.f27628b = split[1];
        return j6Var;
    }

    public static void i(h6 h6Var, TLRPC.ThemeSettings themeSettings) {
        int i7;
        int i10;
        int i11;
        int i12;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        h6Var.f27518c = themeSettings.accent_color;
        h6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i7 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i7 = 0;
        }
        h6Var.f27519e = i7;
        if (themeSettings.message_colors.size() > 1) {
            i10 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        h6Var.f27520f = i10;
        if (h6Var.f27519e == i10) {
            h6Var.f27520f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i11 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        h6Var.f27521g = i11;
        if (themeSettings.message_colors.size() > 3) {
            i12 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        h6Var.h = i12;
        h6Var.f27522i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            if (wallPaperSettings.background_color == 0) {
                h6Var.f27523j = 4294967296L;
            } else {
                h6Var.f27523j = k6.a1(i13);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                h6Var.f27524k = 4294967296L;
            } else {
                h6Var.f27524k = k6.a1(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                h6Var.f27525l = 4294967296L;
            } else {
                h6Var.f27525l = k6.a1(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                h6Var.f27526m = 4294967296L;
            } else {
                h6Var.f27526m = k6.a1(wallPaperSettings4.fourth_background_color);
            }
            h6Var.f27527n = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                h6Var.f27528o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                h6Var.f27529p = wallPaperSettings5.intensity / 100.0f;
                h6Var.f27530q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int V0;
        try {
            Bitmap e12 = org.telegram.messenger.g0.e1(org.telegram.messenger.g0.L(640.0f), org.telegram.messenger.g0.L(360.0f), file.getAbsolutePath(), null, 0);
            if (e12 != null && this.f27642r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(e12.getWidth(), e12.getHeight(), e12.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i7 = this.f27644w;
                if (i7 != 0) {
                    V0 = qa0.g(this.f27642r, this.f27643s, i7, this.f27645x);
                } else {
                    int i10 = this.f27643s;
                    if (i10 != 0) {
                        V0 = org.telegram.messenger.g0.w0(this.f27642r, i10);
                        GradientDrawable gradientDrawable = new GradientDrawable(k9.d(this.f27646y), new int[]{this.f27642r, this.f27643s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        V0 = org.telegram.messenger.g0.V0(this.f27642r, false);
                        canvas.drawColor(this.f27642r);
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
            if (this.f27644w != 0) {
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
                if (str.equals(this.f27637g0)) {
                    this.f27637g0 = null;
                    Utilities.f21333e.c(new p(4, this, (File) objArr[1]));
                } else if (str.equals(w7.r(null, this.F.document))) {
                    t();
                    if (i7 == i11) {
                        File file = new File(this.f27628b);
                        TLRPC.TL_theme tL_theme2 = this.F;
                        j6 m0 = k6.m0(file, tL_theme2.title, tL_theme2);
                        if (m0 != null && m0.f27630c != null && !new File(m0.f27630c).exists()) {
                            this.f27642r = m0.f27642r;
                            this.f27643s = m0.f27643s;
                            this.f27644w = m0.f27644w;
                            this.f27645x = m0.f27645x;
                            this.f27646y = m0.f27646y;
                            this.h = m0.h;
                            this.D = m0.D;
                            this.f27638h0 = m0.f27630c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = m0.f27633e;
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

    public final h6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i7, boolean z9) {
        if (z9) {
            LongSparseArray longSparseArray = this.f27632d0;
            h6 h6Var = (h6) longSparseArray.get(j3);
            if (h6Var != null) {
                return h6Var;
            }
            int i10 = this.f27634e0 + 1;
            this.f27634e0 = i10;
            h6 h6Var2 = new h6();
            i(h6Var2, themeSettings);
            h6Var2.f27517b = this;
            h6Var2.f27516a = i10;
            h6Var2.f27531r = tL_theme;
            h6Var2.f27533t = i7;
            longSparseArray.put(i10, h6Var2);
            return h6Var2;
        }
        h6 h6Var3 = (h6) this.f27631c0.get(j3);
        if (h6Var3 != null) {
            return h6Var3;
        }
        int i11 = this.f27636f0 + 1;
        this.f27636f0 = i11;
        h6 h6Var4 = new h6();
        i(h6Var4, themeSettings);
        h6Var4.f27517b = this;
        h6Var4.f27516a = i11;
        h6Var4.f27531r = tL_theme;
        h6Var4.f27533t = i7;
        this.f27627a0.put(i11, h6Var4);
        this.f27629b0.add(0, h6Var4);
        k6.J1(this);
        this.f27631c0.put(j3, h6Var4);
        return h6Var4;
    }

    public final h6 f(TLRPC.TL_theme tL_theme, int i7, int i10) {
        TLRPC.ThemeSettings themeSettings = null;
        if (tL_theme == null) {
            return null;
        }
        if (i10 < tL_theme.settings.size()) {
            themeSettings = tL_theme.settings.get(i10);
        }
        return e(tL_theme.f27092id, themeSettings, tL_theme, i7, false);
    }

    public final String j(h6 h6Var, boolean z9) {
        String s5;
        String n10;
        if (h6Var == null) {
            h6Var = k(false);
        }
        if (h6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z9) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f27626a);
                sb3.append("_");
                n10 = a8.p0.n(h6Var.f27516a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f27626a);
                sb4.append("_");
                n10 = a8.p0.n(h6Var.f27516a, "_wp", sb4);
            }
            sb2.append(n10);
            sb2.append(Utilities.f21331b.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z9) {
            s5 = a8.p0.s(new StringBuilder(), this.f27626a, "_wp_o");
        } else {
            s5 = a8.p0.s(new StringBuilder(), this.f27626a, "_wp");
        }
        sb5.append(s5);
        sb5.append(Utilities.f21331b.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final h6 k(boolean z9) {
        h6 h6Var;
        if (this.f27629b0 == null || (h6Var = (h6) this.f27627a0.get(this.Y)) == null) {
            return null;
        }
        if (z9) {
            int i7 = this.f27636f0 + 1;
            this.f27636f0 = i7;
            h6 h6Var2 = new h6();
            h6Var2.f27518c = h6Var.f27518c;
            h6Var2.d = h6Var.d;
            h6Var2.f27519e = h6Var.f27519e;
            h6Var2.f27520f = h6Var.f27520f;
            h6Var2.f27521g = h6Var.f27521g;
            h6Var2.h = h6Var.h;
            h6Var2.f27522i = h6Var.f27522i;
            h6Var2.f27523j = h6Var.f27523j;
            h6Var2.f27524k = h6Var.f27524k;
            h6Var2.f27525l = h6Var.f27525l;
            h6Var2.f27526m = h6Var.f27526m;
            h6Var2.f27527n = h6Var.f27527n;
            h6Var2.f27528o = h6Var.f27528o;
            h6Var2.f27529p = h6Var.f27529p;
            h6Var2.f27530q = h6Var.f27530q;
            h6Var2.f27517b = this;
            c6 c6Var = this.f27639i0;
            if (c6Var != null) {
                ?? obj = new Object();
                obj.f27399a = "";
                obj.f27400b = "";
                obj.f27401c = "";
                obj.f27401c = c6Var.f27401c;
                obj.d = c6Var.d;
                obj.f27402e = c6Var.f27402e;
                obj.f27403f = c6Var.f27403f;
                obj.f27404g = c6Var.f27404g;
                obj.h = c6Var.h;
                obj.f27405i = c6Var.f27405i;
                obj.f27406j = c6Var.f27406j;
                obj.f27407k = c6Var.f27407k;
                obj.f27412p = this;
                obj.f27413q = h6Var2;
                if (!TextUtils.isEmpty(c6Var.f27399a)) {
                    try {
                        File file = new File(org.telegram.messenger.t0.h(), c6Var.f27399a);
                        File h = org.telegram.messenger.t0.h();
                        String j3 = obj.f27412p.j(obj.f27413q, false);
                        obj.f27399a = j3;
                        org.telegram.messenger.g0.E(file, new File(h, j3));
                    } catch (Exception e10) {
                        obj.f27399a = "";
                        a8.g(e10, true);
                    }
                } else {
                    obj.f27399a = "";
                }
                if (!TextUtils.isEmpty(c6Var.f27400b)) {
                    if (!c6Var.f27400b.equals(c6Var.f27399a)) {
                        try {
                            File file2 = new File(org.telegram.messenger.t0.h(), c6Var.f27400b);
                            File h7 = org.telegram.messenger.t0.h();
                            String j10 = obj.f27412p.j(obj.f27413q, true);
                            obj.f27400b = j10;
                            org.telegram.messenger.g0.E(file2, new File(h7, j10));
                        } catch (Exception e11) {
                            obj.f27400b = "";
                            a8.g(e11, true);
                        }
                    } else {
                        obj.f27400b = obj.f27399a;
                    }
                } else {
                    obj.f27400b = "";
                }
                h6Var2.f27537y = obj;
            }
            this.Z = this.Y;
            h6Var2.f27516a = i7;
            this.Y = i7;
            this.f27639i0 = h6Var2.f27537y;
            this.f27627a0.put(i7, h6Var2);
            this.f27629b0.add(0, h6Var2);
            k6.J1(this);
            return h6Var2;
        }
        return h6Var;
    }

    public final int l(int i7) {
        h6 h6Var = (h6) this.f27627a0.get(i7);
        if (h6Var != null) {
            return h6Var.f27518c;
        }
        return 0;
    }

    public final String m() {
        if (this.F != null) {
            return "remote" + this.F.f27092id;
        }
        return this.f27626a;
    }

    public final String n() {
        if ("Blue".equals(this.f27626a)) {
            return hd.M0(2131744187, null);
        }
        if ("Dark Blue".equals(this.f27626a)) {
            return hd.M0(2131744184, null);
        }
        if ("Arctic Blue".equals(this.f27626a)) {
            return hd.M0(2131744188, null);
        }
        if ("Day".equals(this.f27626a)) {
            return hd.M0(2131744183, null);
        }
        if ("Night".equals(this.f27626a)) {
            return hd.M0(2131744176, null);
        }
        TLRPC.TL_theme tL_theme = this.F;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f27626a;
    }

    public final int o() {
        if (this.S && this.Y == k6.f28025n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == k6.f28025n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i7 = this.f27640j0;
        if (i7 != -1) {
            if (i7 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f27626a) && !"Night".equals(this.f27626a)) {
            if ("Blue".equals(this.f27626a) || "Arctic Blue".equals(this.f27626a) || "Day".equals(this.f27626a)) {
                this.f27640j0 = 0;
            }
        } else {
            this.f27640j0 = 1;
        }
        if (this.f27640j0 == -1) {
            k6.H(k6.T0(new File(this.f27628b), null, new String[1]), this);
        }
        if (this.f27640j0 != 1) {
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
                c6Var.f27399a = jSONObject.getString("wall");
                c6Var.f27400b = jSONObject.getString("owall");
                c6Var.d = jSONObject.getInt("pColor");
                c6Var.f27402e = jSONObject.getInt("pGrColor");
                c6Var.f27403f = jSONObject.optInt("pGrColor2");
                c6Var.f27404g = jSONObject.optInt("pGrColor3");
                c6Var.h = jSONObject.getInt("pGrAngle");
                c6Var.f27401c = jSONObject.getString("wallSlug");
                c6Var.f27405i = jSONObject.getBoolean("wBlur");
                c6Var.f27406j = jSONObject.getBoolean("wMotion");
                c6Var.f27407k = (float) jSONObject.getDouble("pIntensity");
                c6Var.f27412p = this;
                c6Var.f27413q = h6Var;
                if (h6Var != null) {
                    h6Var.f27537y = c6Var;
                } else {
                    this.f27639i0 = c6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    c6Var.f27401c = "d";
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
        k6.y1(true, false);
        if (this == k6.I && k6.M == null) {
            if (this != k6.J) {
                z9 = false;
            }
            k6.K1(this, z9, -1, null);
        }
    }

    public final void t() {
        qs.f(this.E).n(this, qs.Y1);
        qs.f(this.E).n(this, qs.Z1);
    }

    public final void u(int i7) {
        this.Y = i7;
        h6 k10 = k(false);
        if (k10 != null) {
            this.f27639i0 = k10.f27537y;
        }
    }

    public final void v(c6 c6Var) {
        if (this.f27639i0 != c6Var) {
            h6 k10 = k(false);
            c6 c6Var2 = this.f27639i0;
            if (c6Var2 != null) {
                c6.a(c6Var2);
            }
            if (c6Var != null) {
                c6Var.f27413q = k10;
                c6Var.f27412p = this;
                c6Var.c();
            }
            this.f27639i0 = c6Var;
            if (k10 != null) {
                k10.f27537y = c6Var;
            }
        }
    }

    public j6(j6 j6Var) {
        this.f27646y = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f27632d0 = new LongSparseArray();
        this.f27634e0 = 0;
        this.f27636f0 = 100;
        this.f27640j0 = -1;
        this.f27626a = j6Var.f27626a;
        this.f27628b = j6Var.f27628b;
        this.f27630c = j6Var.f27630c;
        this.d = j6Var.d;
        this.f27633e = j6Var.f27633e;
        this.f27635f = j6Var.f27635f;
        this.h = j6Var.h;
        this.f27641n = j6Var.f27641n;
        this.f27642r = j6Var.f27642r;
        this.f27643s = j6Var.f27643s;
        this.f27644w = j6Var.f27644w;
        this.f27645x = j6Var.f27645x;
        this.f27646y = j6Var.f27646y;
        this.D = j6Var.D;
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
        this.f27627a0 = j6Var.f27627a0;
        this.f27629b0 = j6Var.f27629b0;
        this.f27631c0 = j6Var.f27631c0;
        this.f27636f0 = j6Var.f27636f0;
        this.f27637g0 = j6Var.f27637g0;
        this.f27638h0 = j6Var.f27638h0;
        this.f27639i0 = j6Var.f27639i0;
    }
}
