package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import gi.e8;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.ac;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.messenger.w7;
import org.telegram.messenger.zb;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class p3 {
    public static final int[] h = {k6.f28143ra, k6.f28086ob, k6.Ci, k6.Be, k6.Ce, k6.De, k6.Ee, k6.Fe};
    public boolean f28419a;
    public boolean f28420b;
    public jg.b f28421c;
    public TLRPC.ChatTheme d;
    public String f28422e;
    public final ArrayList f28423f;
    public final int f28424g;

    public p3(int i3) {
        this.f28423f = new ArrayList();
        this.f28424g = i3;
    }

    public static p3 a(int i3) {
        p3 p3Var = new p3(i3);
        p3Var.f28422e = "❌";
        p3Var.f28421c = jg.b.d("❌");
        p3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        p3Var.f28420b = true;
        o3 o3Var = new o3();
        o3Var.f28382a = d(true);
        p3Var.f28423f.add(o3Var);
        o3 o3Var2 = new o3();
        o3Var2.f28382a = d(false);
        p3Var.f28423f.add(o3Var2);
        return p3Var;
    }

    public static p3 b(int i3) {
        p3 p3Var = new p3(i3);
        p3Var.f28422e = "🏠";
        p3Var.f28421c = jg.b.d("🏠");
        p3Var.d = TLRPC.ChatTheme.ofEmoticon(p3Var.f28422e);
        o3 o3Var = new o3();
        o3Var.f28382a = k6.Q0("Blue");
        o3Var.f28385e = 99;
        p3Var.f28423f.add(o3Var);
        o3 o3Var2 = new o3();
        o3Var2.f28382a = k6.Q0("Day");
        o3Var2.f28385e = 9;
        p3Var.f28423f.add(o3Var2);
        o3 o3Var3 = new o3();
        o3Var3.f28382a = k6.Q0("Night");
        o3Var3.f28385e = 0;
        p3Var.f28423f.add(o3Var3);
        o3 o3Var4 = new o3();
        o3Var4.f28382a = k6.Q0("Dark Blue");
        o3Var4.f28385e = 0;
        p3Var.f28423f.add(o3Var4);
        return p3Var;
    }

    public static p3 c(int i3, TLRPC.TL_theme tL_theme) {
        p3 p3Var = new p3(i3);
        String str = tL_theme.emoticon;
        p3Var.f28422e = str;
        p3Var.f28421c = new jg.b(str, null);
        p3Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i10 = 0; i10 < tL_theme.settings.size(); i10++) {
            o3 o3Var = new o3();
            o3Var.f28383b = tL_theme;
            o3Var.d = i10;
            p3Var.f28423f.add(o3Var);
        }
        return p3Var;
    }

    public static j6 d(boolean z10) {
        j6 D0;
        String string;
        if (z10) {
            D0 = k6.J;
        } else {
            D0 = k6.D0();
        }
        if (z10 != D0.q()) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("themeconfig", 0);
            String str = "Blue";
            if (z10) {
                string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            } else {
                string = sharedPreferences.getString("lastDayTheme", "Blue");
            }
            D0 = k6.Q0(string);
            if (D0 == null) {
                if (z10) {
                    str = "Dark Blue";
                }
                D0 = k6.Q0(str);
            }
        }
        return new j6(D0);
    }

    public static int f(SparseIntArray sparseIntArray, int i3) {
        if (sparseIntArray == null) {
            return k6.F0(i3);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i3);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return k6.F0(i3);
    }

    public static void o(int i3, long j10, TLRPC.WallPaper wallPaper, u10 u10Var) {
        boolean z10 = wallPaper.pattern;
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i3);
        n3 n3Var = new n3(u10Var, wallPaper, z10 ? 1 : 0, i3, j10);
        if (!z10) {
            org.telegram.messenger.p1 p1Var = new org.telegram.messenger.p1(n3Var, 2);
            if (f10.f22142c == 0) {
                p1Var.onComplete(null);
                return;
            }
            org.telegram.messenger.d4.f22138s.c(new org.telegram.messenger.b4(25, f10.g(j10), p1Var));
        } else if (z10) {
            File i10 = org.telegram.messenger.t0.i();
            Locale locale = Locale.US;
            org.telegram.messenger.d4.f22138s.c(new org.telegram.messenger.b4(18, new File(i10, t4.c.e(j10, "pattern_", ".pgm.gz")), n3Var));
        }
    }

    public static void q(j6 j6Var, int i3) {
        String str;
        String str2;
        SparseArray sparseArray;
        g6 g6Var;
        if (j6Var != null) {
            if (i3 < 0 || (sparseArray = j6Var.f27678b0) == null || ((g6Var = (g6) sparseArray.get(i3)) != null && !g6Var.f27547z)) {
                if (!j6Var.m().equals("Blue") || i3 != 99) {
                    if (!j6Var.m().equals("Day") || i3 != 9) {
                        if (!j6Var.m().equals("Night") || i3 != 0) {
                            if (j6Var.m().equals("Dark Blue") && i3 == 0) {
                                return;
                            }
                            boolean q10 = j6Var.q();
                            if (q10) {
                                str = "lastDarkCustomTheme";
                            } else {
                                str = "lastDayCustomTheme";
                            }
                            if (q10) {
                                str2 = "lastDarkCustomThemeAccentId";
                            } else {
                                str2 = "lastDayCustomThemeAccentId";
                            }
                            org.telegram.messenger.t0.f25457b.getSharedPreferences("themeconfig", 0).edit().putString(str, j6Var.m()).putInt(str2, i3).apply();
                        }
                    }
                }
            }
        }
    }

    public final TLRPC.Document e() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return dg.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return li.b0(this.f28424g).T(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray g(int i3, int i10) {
        g6 g6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        j6 j6Var;
        j6 Q0;
        g6 g6Var2;
        ArrayList arrayList = this.f28423f;
        SparseIntArray sparseIntArray2 = ((o3) arrayList.get(i10)).f28386f;
        if (sparseIntArray2 != null) {
            return sparseIntArray2;
        }
        j6 i11 = i(i10);
        if (i11 == null) {
            int i12 = ((o3) arrayList.get(i10)).d;
            jg.a aVar = (jg.a) arrayList.get(i10);
            TLRPC.TL_theme tL_theme = ((o3) arrayList.get(i10)).f28383b;
            if (aVar != null) {
                Q0 = k6.Q0(k6.r0(((o3) aVar).b(i12)));
            } else {
                Q0 = k6.Q0("Blue");
            }
            if (Q0 != null) {
                j6 j6Var2 = new j6(Q0);
                if (aVar != null) {
                    o3 o3Var = (o3) aVar;
                    g6Var2 = j6Var2.e(o3Var.a(), o3Var.b(i12), tL_theme, i3, true);
                } else {
                    g6Var2 = null;
                }
                if (g6Var2 != null) {
                    j6Var2.u(g6Var2.f27525a);
                }
                g6Var = g6Var2;
                i11 = j6Var2;
            }
            g6Var = null;
        } else {
            SparseArray sparseArray = i11.f27678b0;
            if (sparseArray != null) {
                g6Var = (g6) sparseArray.get(((o3) arrayList.get(i10)).f28385e);
            }
            g6Var = null;
        }
        if (i11 == null) {
            return sparseIntArray2;
        }
        String[] strArr = new String[1];
        if (i11.f27677b != null) {
            sparseIntArray = k6.T0(new File(i11.f27677b), null, strArr);
        } else {
            String str = i11.d;
            if (str != null) {
                sparseIntArray = k6.T0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        int i13 = 0;
        ((o3) arrayList.get(i10)).f28387g = strArr[0];
        if (g6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            g6Var.d(sparseIntArray, clone);
            jg.b bVar = this.f28421c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f16249b) && (j6Var = g6Var.f27526b) != null && j6Var.f27677b == null && !j6Var.q()) {
                g6.h(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray3 = k6.fm;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        ((o3) arrayList.get(i10)).f28386f = sparseIntArray4;
        while (true) {
            try {
                int[] iArr = h;
                if (i13 < iArr.length) {
                    int i14 = iArr[i13];
                    int indexOfKey2 = sparseIntArray.indexOfKey(i14);
                    if (indexOfKey2 >= 0) {
                        sparseIntArray4.put(i14, sparseIntArray.valueAt(indexOfKey2));
                    } else {
                        int i15 = sparseIntArray3.get(i14, -1);
                        if (i15 >= 0 && (indexOfKey = sparseIntArray.indexOfKey(i15)) >= 0) {
                            sparseIntArray4.put(i14, sparseIntArray.valueAt(indexOfKey));
                        }
                    }
                    i13++;
                } else {
                    return sparseIntArray4;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return sparseIntArray4;
            }
        }
    }

    public final long h(int i3) {
        return ((o3) this.f28423f.get(i3)).a();
    }

    public final j6 i(int i3) {
        return ((o3) this.f28423f.get(i3)).f28382a;
    }

    public final TLRPC.WallPaper j(int i3) {
        o3 o3Var = (o3) this.f28423f.get(i3);
        TLRPC.ThemeSettings b10 = o3Var.b(o3Var.d);
        if (b10 != null) {
            return b10.wallpaper;
        }
        return null;
    }

    public final void k() {
        g(0, 0);
        g(0, 1);
    }

    public final boolean l() {
        if (!this.f28419a && !this.f28420b) {
            return false;
        }
        return true;
    }

    public final void m(int i3) {
        int i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f28423f;
            if (i11 < arrayList.size()) {
                if (arrayList.get(i11) != null) {
                    SparseIntArray g7 = g(i3, i11);
                    ((o3) arrayList.get(i11)).h = f(g7, k6.f28143ra);
                    ((o3) arrayList.get(i11)).f28388i = f(g7, k6.f28086ob);
                    ((o3) arrayList.get(i11)).f28389j = f(g7, k6.Ci);
                    ((o3) arrayList.get(i11)).f28390k = g7.get(k6.Be, 0);
                    ((o3) arrayList.get(i11)).f28391l = g7.get(k6.Ce, 0);
                    ((o3) arrayList.get(i11)).f28392m = g7.get(k6.De, 0);
                    ((o3) arrayList.get(i11)).f28393n = g7.get(k6.Ee, 0);
                    ((o3) arrayList.get(i11)).f28394o = g7.get(k6.Fe, 0);
                    if (((o3) arrayList.get(i11)).f28382a != null && ((o3) arrayList.get(i11)).f28382a.m().equals("Blue")) {
                        if (((o3) arrayList.get(i11)).f28385e >= 0) {
                            i10 = ((o3) arrayList.get(i11)).f28385e;
                        } else {
                            i10 = ((o3) arrayList.get(i11)).f28382a.Z;
                        }
                        if (i10 == 99) {
                            ((o3) arrayList.get(i11)).f28390k = -2368069;
                            ((o3) arrayList.get(i11)).f28391l = -9722489;
                            ((o3) arrayList.get(i11)).f28392m = -2762611;
                            ((o3) arrayList.get(i11)).f28393n = -7817084;
                        }
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final void n(int i3, ResultCallback resultCallback) {
        TLRPC.WallPaper j10 = j(i3);
        if (j10 == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        long h7 = h(i3);
        o(this.f28424g, j10.f27155id, j10, new e8(resultCallback, h7, 1));
    }

    public final void p(int i3, ResultCallback resultCallback) {
        TLRPC.WallPaper j10 = j(i3);
        if (j10 == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        } else {
            long h7 = h(i3);
            if (h7 == 0) {
                if (resultCallback != null) {
                    resultCallback.onComplete(null);
                }
            } else {
                Bitmap bitmap = (Bitmap) org.telegram.messenger.d4.f(this.f28424g).f22140a.get(Long.valueOf(h7));
                File file = new File(org.telegram.messenger.t0.h(), t4.c.e(h7, "wallpaper_thumb_", ".png"));
                if (bitmap == null && file.exists() && file.length() > 0) {
                    try {
                        bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                if (bitmap != null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(h7), bitmap));
                        return;
                    }
                    return;
                }
                TLRPC.Document document = j10.document;
                if (document == null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(h7), null));
                        return;
                    }
                    return;
                }
                ac c2 = ac.c(w7.w(document.thumbs, 140, false, null, false), j10.document);
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.A1 = false;
                imageReceiver.q0(c2, "120_140", null, null, null, 1);
                imageReceiver.f21247h1 = new ci.i(resultCallback, h7, file, 4);
                zb.D().M(imageReceiver, null);
            }
        }
    }

    public p3(int i3, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f28423f = arrayList;
        this.f28424g = i3;
        this.f28419a = false;
        String str = tL_theme.emoticon;
        this.f28422e = str;
        this.f28421c = new jg.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        o3 o3Var = new o3();
        o3Var.f28383b = tL_theme;
        o3Var.d = 0;
        arrayList.add(o3Var);
        o3 o3Var2 = new o3();
        o3Var2.f28383b = tL_theme;
        o3Var2.d = 1;
        arrayList.add(o3Var2);
    }

    public p3(int i3, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f28423f = arrayList;
        this.f28424g = i3;
        this.f28419a = false;
        this.f28422e = tL_chatThemeUniqueGift.gift.slug;
        this.f28421c = jg.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        o3 o3Var = new o3();
        o3Var.f28384c = tL_chatThemeUniqueGift;
        o3Var.d = 0;
        arrayList.add(o3Var);
        o3 o3Var2 = new o3();
        o3Var2.f28384c = tL_chatThemeUniqueGift;
        o3Var2.d = 1;
        arrayList.add(o3Var2);
    }
}
