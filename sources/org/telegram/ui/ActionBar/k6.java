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
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ra0;
public final class k6 implements ls {
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
    public String f27736a;
    public SparseArray f27737a0;
    public String f27738b;
    public ArrayList f27739b0;
    public String f27740c;
    public LongSparseArray f27741c0;
    public String d;
    public final LongSparseArray f27742d0;
    public String f27743e;
    public int f27744e0;
    public boolean f27745f;
    public int f27746f0;
    public String f27747g0;
    public boolean h;
    public String f27748h0;
    public d6 f27749i0;
    public int f27750j0;
    public boolean f27751n;
    public int f27752r;
    public int f27753s;
    public int f27754w;
    public int f27755x;
    public int f27756y;

    public k6() {
        this.f27756y = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f27742d0 = new LongSparseArray();
        this.f27744e0 = 0;
        this.f27746f0 = 100;
        this.f27750j0 = -1;
    }

    public static boolean a(i6 i6Var, TLRPC.ThemeSettings themeSettings) {
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
            i13 = l6.a1(wallPaperSettings.background_color);
            int i15 = themeSettings.wallpaper.settings.second_background_color;
            j11 = 4294967296L;
            if (i15 == 0) {
                j3 = 4294967296L;
            } else {
                j3 = l6.a1(i15);
            }
            int i16 = themeSettings.wallpaper.settings.third_background_color;
            if (i16 == 0) {
                j10 = 4294967296L;
            } else {
                j10 = l6.a1(i16);
            }
            int i17 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i17 != 0) {
                j11 = l6.a1(i17);
            }
            i14 = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            z9 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z10 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
                long j12 = j10;
                if (themeSettings.accent_color != i6Var.f27573c && themeSettings.outbox_accent_color == i6Var.d && i7 == i6Var.f27574e && i10 == i6Var.f27575f && i11 == i6Var.f27576g && i12 == i6Var.h && themeSettings.message_colors_animated == i6Var.f27577i && i13 == i6Var.f27578j && j3 == i6Var.f27579k && j12 == i6Var.f27580l && j11 == i6Var.f27581m && i14 == i6Var.f27582n && TextUtils.equals(str, i6Var.f27583o) && Math.abs(f10 - i6Var.f27584p) < 0.001d) {
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
        if (themeSettings.accent_color != i6Var.f27573c) {
        }
        return z9;
    }

    public static void b(k6 k6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        k6Var.W = iArr.length;
        k6Var.f27739b0 = new ArrayList();
        k6Var.f27737a0 = new SparseArray();
        k6Var.f27741c0 = new LongSparseArray();
        for (int i7 = 0; i7 < iArr.length; i7++) {
            i6 i6Var = new i6();
            i6Var.f27571a = iArr8[i7];
            if (l6.l1(i6Var)) {
                i6Var.f27593z = true;
            }
            i6Var.f27573c = iArr[i7];
            i6Var.f27572b = k6Var;
            i6Var.f27574e = iArr2[i7];
            i6Var.f27575f = iArr3[i7];
            long j3 = iArr4[i7];
            i6Var.f27578j = j3;
            boolean z9 = k6Var.S;
            if (z9 && i6Var.f27571a == l6.f28041n) {
                i6Var.f27578j = 4294967296L;
            } else {
                i6Var.f27578j = j3;
            }
            if (z9 && i6Var.f27571a == l6.f28041n) {
                i6Var.f27579k = 4294967296L;
            } else {
                i6Var.f27579k = iArr5[i7];
            }
            if (iArr6 != null) {
                if (z9 && i6Var.f27571a == l6.f28041n) {
                    i6Var.f27580l = 4294967296L;
                } else {
                    i6Var.f27580l = iArr6[i7];
                }
            }
            if (iArr7 != null) {
                if (z9 && i6Var.f27571a == l6.f28041n) {
                    i6Var.f27581m = 4294967296L;
                } else {
                    i6Var.f27581m = iArr7[i7];
                }
            }
            i6Var.f27584p = iArr10[i7] / 100.0f;
            i6Var.f27582n = iArr9[i7];
            i6Var.f27583o = strArr[i7];
            if ((l6.l1(i6Var) && k6Var.f27736a.equals("Dark Blue")) || k6Var.f27736a.equals("Night")) {
                i6Var.f27574e = -14316059;
                i6Var.f27575f = -12422433;
                i6Var.f27576g = -8304937;
                i6Var.h = -6340950;
                if (k6Var.f27736a.equals("Night")) {
                    i6Var.f27584p = -0.57f;
                    i6Var.f27578j = -9666650L;
                    i6Var.f27579k = -13749173L;
                    i6Var.f27580l = -8883033L;
                    i6Var.f27581m = -13421992L;
                }
            }
            k6Var.f27737a0.put(i6Var.f27571a, i6Var);
            k6Var.f27739b0.add(i6Var);
        }
        k6Var.X = ((i6) k6Var.f27737a0.get(0)).f27573c;
    }

    public static void c(k6 k6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = k6Var.f27739b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = k6Var.f27739b0.size();
            for (int i7 = 0; i7 < size; i7++) {
                i6 i6Var = (i6) k6Var.f27739b0.get(i7);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(k6Var.f27736a);
                sb2.append("_");
                k6Var.r(sharedPreferences, i6Var, a8.p0.n(i6Var.f27571a, "_owp", sb2));
            }
            return;
        }
        k6Var.r(sharedPreferences, null, a8.p0.s(new StringBuilder(), k6Var.f27736a, "_owp"));
    }

    public static k6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            k6 k6Var = new k6();
            k6Var.f27736a = jSONObject.getString("name");
            k6Var.f27738b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                k6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.v(jSONObject.getString("info")));
                k6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                k6Var.G = jSONObject.getBoolean("loaded");
            }
            return k6Var;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static k6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        k6 k6Var = new k6();
        k6Var.f27736a = split[0];
        k6Var.f27738b = split[1];
        return k6Var;
    }

    public static void i(i6 i6Var, TLRPC.ThemeSettings themeSettings) {
        int i7;
        int i10;
        int i11;
        int i12;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        i6Var.f27573c = themeSettings.accent_color;
        i6Var.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i7 = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i7 = 0;
        }
        i6Var.f27574e = i7;
        if (themeSettings.message_colors.size() > 1) {
            i10 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i10 = 0;
        }
        i6Var.f27575f = i10;
        if (i6Var.f27574e == i10) {
            i6Var.f27575f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i11 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i11 = 0;
        }
        i6Var.f27576g = i11;
        if (themeSettings.message_colors.size() > 3) {
            i12 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i12 = 0;
        }
        i6Var.h = i12;
        i6Var.f27577i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            if (wallPaperSettings.background_color == 0) {
                i6Var.f27578j = 4294967296L;
            } else {
                i6Var.f27578j = l6.a1(i13);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                i6Var.f27579k = 4294967296L;
            } else {
                i6Var.f27579k = l6.a1(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                i6Var.f27580l = 4294967296L;
            } else {
                i6Var.f27580l = l6.a1(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                i6Var.f27581m = 4294967296L;
            } else {
                i6Var.f27581m = l6.a1(wallPaperSettings4.fourth_background_color);
            }
            i6Var.f27582n = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                i6Var.f27583o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                i6Var.f27584p = wallPaperSettings5.intensity / 100.0f;
                i6Var.f27585q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean d(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int V0;
        try {
            Bitmap e12 = org.telegram.messenger.g0.e1(org.telegram.messenger.g0.L(640.0f), org.telegram.messenger.g0.L(360.0f), file.getAbsolutePath(), null, 0);
            if (e12 != null && this.f27752r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(e12.getWidth(), e12.getHeight(), e12.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i7 = this.f27754w;
                if (i7 != 0) {
                    V0 = ra0.g(this.f27752r, this.f27753s, i7, this.f27755x);
                } else {
                    int i10 = this.f27753s;
                    if (i10 != 0) {
                        V0 = org.telegram.messenger.g0.w0(this.f27752r, i10);
                        GradientDrawable gradientDrawable = new GradientDrawable(k9.d(this.f27756y), new int[]{this.f27752r, this.f27753s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        V0 = org.telegram.messenger.g0.V0(this.f27752r, false);
                        canvas.drawColor(this.f27752r);
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
            if (this.f27754w != 0) {
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
                if (str.equals(this.f27747g0)) {
                    this.f27747g0 = null;
                    Utilities.f21336e.c(new p(4, this, (File) objArr[1]));
                } else if (str.equals(w7.r(null, this.F.document))) {
                    t();
                    if (i7 == i11) {
                        File file = new File(this.f27738b);
                        TLRPC.TL_theme tL_theme2 = this.F;
                        k6 m0 = l6.m0(file, tL_theme2.title, tL_theme2);
                        if (m0 != null && m0.f27740c != null && !new File(m0.f27740c).exists()) {
                            this.f27752r = m0.f27752r;
                            this.f27753s = m0.f27753s;
                            this.f27754w = m0.f27754w;
                            this.f27755x = m0.f27755x;
                            this.f27756y = m0.f27756y;
                            this.h = m0.h;
                            this.D = m0.D;
                            this.f27748h0 = m0.f27740c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = m0.f27743e;
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

    public final i6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i7, boolean z9) {
        if (z9) {
            LongSparseArray longSparseArray = this.f27742d0;
            i6 i6Var = (i6) longSparseArray.get(j3);
            if (i6Var != null) {
                return i6Var;
            }
            int i10 = this.f27744e0 + 1;
            this.f27744e0 = i10;
            i6 i6Var2 = new i6();
            i(i6Var2, themeSettings);
            i6Var2.f27572b = this;
            i6Var2.f27571a = i10;
            i6Var2.f27586r = tL_theme;
            i6Var2.f27588t = i7;
            longSparseArray.put(i10, i6Var2);
            return i6Var2;
        }
        i6 i6Var3 = (i6) this.f27741c0.get(j3);
        if (i6Var3 != null) {
            return i6Var3;
        }
        int i11 = this.f27746f0 + 1;
        this.f27746f0 = i11;
        i6 i6Var4 = new i6();
        i(i6Var4, themeSettings);
        i6Var4.f27572b = this;
        i6Var4.f27571a = i11;
        i6Var4.f27586r = tL_theme;
        i6Var4.f27588t = i7;
        this.f27737a0.put(i11, i6Var4);
        this.f27739b0.add(0, i6Var4);
        l6.J1(this);
        this.f27741c0.put(j3, i6Var4);
        return i6Var4;
    }

    public final i6 f(TLRPC.TL_theme tL_theme, int i7, int i10) {
        TLRPC.ThemeSettings themeSettings = null;
        if (tL_theme == null) {
            return null;
        }
        if (i10 < tL_theme.settings.size()) {
            themeSettings = tL_theme.settings.get(i10);
        }
        return e(tL_theme.f27095id, themeSettings, tL_theme, i7, false);
    }

    public final String j(i6 i6Var, boolean z9) {
        String s5;
        String n10;
        if (i6Var == null) {
            i6Var = k(false);
        }
        if (i6Var != null) {
            StringBuilder sb2 = new StringBuilder();
            if (z9) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f27736a);
                sb3.append("_");
                n10 = a8.p0.n(i6Var.f27571a, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f27736a);
                sb4.append("_");
                n10 = a8.p0.n(i6Var.f27571a, "_wp", sb4);
            }
            sb2.append(n10);
            sb2.append(Utilities.f21334b.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z9) {
            s5 = a8.p0.s(new StringBuilder(), this.f27736a, "_wp_o");
        } else {
            s5 = a8.p0.s(new StringBuilder(), this.f27736a, "_wp");
        }
        sb5.append(s5);
        sb5.append(Utilities.f21334b.nextInt());
        sb5.append(".jpg");
        return sb5.toString();
    }

    public final i6 k(boolean z9) {
        i6 i6Var;
        if (this.f27739b0 == null || (i6Var = (i6) this.f27737a0.get(this.Y)) == null) {
            return null;
        }
        if (z9) {
            int i7 = this.f27746f0 + 1;
            this.f27746f0 = i7;
            i6 i6Var2 = new i6();
            i6Var2.f27573c = i6Var.f27573c;
            i6Var2.d = i6Var.d;
            i6Var2.f27574e = i6Var.f27574e;
            i6Var2.f27575f = i6Var.f27575f;
            i6Var2.f27576g = i6Var.f27576g;
            i6Var2.h = i6Var.h;
            i6Var2.f27577i = i6Var.f27577i;
            i6Var2.f27578j = i6Var.f27578j;
            i6Var2.f27579k = i6Var.f27579k;
            i6Var2.f27580l = i6Var.f27580l;
            i6Var2.f27581m = i6Var.f27581m;
            i6Var2.f27582n = i6Var.f27582n;
            i6Var2.f27583o = i6Var.f27583o;
            i6Var2.f27584p = i6Var.f27584p;
            i6Var2.f27585q = i6Var.f27585q;
            i6Var2.f27572b = this;
            d6 d6Var = this.f27749i0;
            if (d6Var != null) {
                ?? obj = new Object();
                obj.f27428a = "";
                obj.f27429b = "";
                obj.f27430c = "";
                obj.f27430c = d6Var.f27430c;
                obj.d = d6Var.d;
                obj.f27431e = d6Var.f27431e;
                obj.f27432f = d6Var.f27432f;
                obj.f27433g = d6Var.f27433g;
                obj.h = d6Var.h;
                obj.f27434i = d6Var.f27434i;
                obj.f27435j = d6Var.f27435j;
                obj.f27436k = d6Var.f27436k;
                obj.f27441p = this;
                obj.f27442q = i6Var2;
                if (!TextUtils.isEmpty(d6Var.f27428a)) {
                    try {
                        File file = new File(org.telegram.messenger.t0.h(), d6Var.f27428a);
                        File h = org.telegram.messenger.t0.h();
                        String j3 = obj.f27441p.j(obj.f27442q, false);
                        obj.f27428a = j3;
                        org.telegram.messenger.g0.E(file, new File(h, j3));
                    } catch (Exception e10) {
                        obj.f27428a = "";
                        a8.g(e10, true);
                    }
                } else {
                    obj.f27428a = "";
                }
                if (!TextUtils.isEmpty(d6Var.f27429b)) {
                    if (!d6Var.f27429b.equals(d6Var.f27428a)) {
                        try {
                            File file2 = new File(org.telegram.messenger.t0.h(), d6Var.f27429b);
                            File h7 = org.telegram.messenger.t0.h();
                            String j10 = obj.f27441p.j(obj.f27442q, true);
                            obj.f27429b = j10;
                            org.telegram.messenger.g0.E(file2, new File(h7, j10));
                        } catch (Exception e11) {
                            obj.f27429b = "";
                            a8.g(e11, true);
                        }
                    } else {
                        obj.f27429b = obj.f27428a;
                    }
                } else {
                    obj.f27429b = "";
                }
                i6Var2.f27592y = obj;
            }
            this.Z = this.Y;
            i6Var2.f27571a = i7;
            this.Y = i7;
            this.f27749i0 = i6Var2.f27592y;
            this.f27737a0.put(i7, i6Var2);
            this.f27739b0.add(0, i6Var2);
            l6.J1(this);
            return i6Var2;
        }
        return i6Var;
    }

    public final int l(int i7) {
        i6 i6Var = (i6) this.f27737a0.get(i7);
        if (i6Var != null) {
            return i6Var.f27573c;
        }
        return 0;
    }

    public final String m() {
        if (this.F != null) {
            return "remote" + this.F.f27095id;
        }
        return this.f27736a;
    }

    public final String n() {
        if ("Blue".equals(this.f27736a)) {
            return id.M0(2131744186, null);
        }
        if ("Dark Blue".equals(this.f27736a)) {
            return id.M0(2131744183, null);
        }
        if ("Arctic Blue".equals(this.f27736a)) {
            return id.M0(2131744187, null);
        }
        if ("Day".equals(this.f27736a)) {
            return id.M0(2131744182, null);
        }
        if ("Night".equals(this.f27736a)) {
            return id.M0(2131744175, null);
        }
        TLRPC.TL_theme tL_theme = this.F;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.f27736a;
    }

    public final int o() {
        if (this.S && this.Y == l6.f28041n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == l6.f28041n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i7 = this.f27750j0;
        if (i7 != -1) {
            if (i7 != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.f27736a) && !"Night".equals(this.f27736a)) {
            if ("Blue".equals(this.f27736a) || "Arctic Blue".equals(this.f27736a) || "Day".equals(this.f27736a)) {
                this.f27750j0 = 0;
            }
        } else {
            this.f27750j0 = 1;
        }
        if (this.f27750j0 == -1) {
            l6.H(l6.T0(new File(this.f27738b), null, new String[1]), this);
        }
        if (this.f27750j0 != 1) {
            return false;
        }
        return true;
    }

    public final void r(SharedPreferences sharedPreferences, i6 i6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                d6 d6Var = new d6();
                d6Var.f27428a = jSONObject.getString("wall");
                d6Var.f27429b = jSONObject.getString("owall");
                d6Var.d = jSONObject.getInt("pColor");
                d6Var.f27431e = jSONObject.getInt("pGrColor");
                d6Var.f27432f = jSONObject.optInt("pGrColor2");
                d6Var.f27433g = jSONObject.optInt("pGrColor3");
                d6Var.h = jSONObject.getInt("pGrAngle");
                d6Var.f27430c = jSONObject.getString("wallSlug");
                d6Var.f27434i = jSONObject.getBoolean("wBlur");
                d6Var.f27435j = jSONObject.getBoolean("wMotion");
                d6Var.f27436k = (float) jSONObject.getDouble("pIntensity");
                d6Var.f27441p = this;
                d6Var.f27442q = i6Var;
                if (i6Var != null) {
                    i6Var.f27592y = d6Var;
                } else {
                    this.f27749i0 = d6Var;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    d6Var.f27430c = "d";
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
        l6.y1(true, false);
        if (this == l6.I && l6.M == null) {
            if (this != l6.J) {
                z9 = false;
            }
            l6.K1(this, z9, -1, null);
        }
    }

    public final void t() {
        qs.f(this.E).n(this, qs.Y1);
        qs.f(this.E).n(this, qs.Z1);
    }

    public final void u(int i7) {
        this.Y = i7;
        i6 k10 = k(false);
        if (k10 != null) {
            this.f27749i0 = k10.f27592y;
        }
    }

    public final void v(d6 d6Var) {
        if (this.f27749i0 != d6Var) {
            i6 k10 = k(false);
            d6 d6Var2 = this.f27749i0;
            if (d6Var2 != null) {
                d6.a(d6Var2);
            }
            if (d6Var != null) {
                d6Var.f27442q = k10;
                d6Var.f27441p = this;
                d6Var.c();
            }
            this.f27749i0 = d6Var;
            if (k10 != null) {
                k10.f27592y = d6Var;
            }
        }
    }

    public k6(k6 k6Var) {
        this.f27756y = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.f27742d0 = new LongSparseArray();
        this.f27744e0 = 0;
        this.f27746f0 = 100;
        this.f27750j0 = -1;
        this.f27736a = k6Var.f27736a;
        this.f27738b = k6Var.f27738b;
        this.f27740c = k6Var.f27740c;
        this.d = k6Var.d;
        this.f27743e = k6Var.f27743e;
        this.f27745f = k6Var.f27745f;
        this.h = k6Var.h;
        this.f27751n = k6Var.f27751n;
        this.f27752r = k6Var.f27752r;
        this.f27753s = k6Var.f27753s;
        this.f27754w = k6Var.f27754w;
        this.f27755x = k6Var.f27755x;
        this.f27756y = k6Var.f27756y;
        this.D = k6Var.D;
        this.E = k6Var.E;
        this.F = k6Var.F;
        this.G = k6Var.G;
        this.H = k6Var.H;
        this.I = k6Var.I;
        this.J = k6Var.J;
        this.K = k6Var.K;
        this.L = k6Var.L;
        this.M = k6Var.M;
        this.N = k6Var.N;
        this.O = k6Var.O;
        this.P = k6Var.P;
        this.Q = k6Var.Q;
        this.R = k6Var.R;
        this.S = k6Var.S;
        this.T = k6Var.T;
        this.U = k6Var.U;
        this.V = k6Var.V;
        this.W = k6Var.W;
        this.X = k6Var.X;
        this.Y = k6Var.Y;
        this.Z = k6Var.Z;
        this.f27737a0 = k6Var.f27737a0;
        this.f27739b0 = k6Var.f27739b0;
        this.f27741c0 = k6Var.f27741c0;
        this.f27746f0 = k6Var.f27746f0;
        this.f27747g0 = k6Var.f27747g0;
        this.f27748h0 = k6Var.f27748h0;
        this.f27749i0 = k6Var.f27749i0;
    }
}
