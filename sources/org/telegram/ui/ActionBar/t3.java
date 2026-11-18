package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import hi.d8;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.ri;
import org.telegram.messenger.w7;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class t3 {
    public static final int[] h = {n6.f29657ra, n6.f29658rb, n6.Fi, n6.Ee, n6.Fe, n6.Ge, n6.He, n6.Ie};
    public boolean f29997a;
    public boolean f29998b;
    public ig.b f29999c;
    public TLRPC.ChatTheme d;
    public String f30000e;
    public final ArrayList f30001f;
    public final int f30002g;

    public t3(int i7) {
        this.f30001f = new ArrayList();
        this.f30002g = i7;
    }

    public static t3 a(int i7) {
        t3 t3Var = new t3(i7);
        t3Var.f30000e = "❌";
        t3Var.f29999c = ig.b.d("❌");
        t3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        t3Var.f29998b = true;
        s3 s3Var = new s3();
        s3Var.f29972a = d(true);
        t3Var.f30001f.add(s3Var);
        s3 s3Var2 = new s3();
        s3Var2.f29972a = d(false);
        t3Var.f30001f.add(s3Var2);
        return t3Var;
    }

    public static t3 b(int i7) {
        t3 t3Var = new t3(i7);
        t3Var.f30000e = "🏠";
        t3Var.f29999c = ig.b.d("🏠");
        t3Var.d = TLRPC.ChatTheme.ofEmoticon(t3Var.f30000e);
        s3 s3Var = new s3();
        s3Var.f29972a = n6.Q0("Blue");
        s3Var.f29975e = 99;
        t3Var.f30001f.add(s3Var);
        s3 s3Var2 = new s3();
        s3Var2.f29972a = n6.Q0("Day");
        s3Var2.f29975e = 9;
        t3Var.f30001f.add(s3Var2);
        s3 s3Var3 = new s3();
        s3Var3.f29972a = n6.Q0("Night");
        s3Var3.f29975e = 0;
        t3Var.f30001f.add(s3Var3);
        s3 s3Var4 = new s3();
        s3Var4.f29972a = n6.Q0("Dark Blue");
        s3Var4.f29975e = 0;
        t3Var.f30001f.add(s3Var4);
        return t3Var;
    }

    public static t3 c(int i7, TLRPC.TL_theme tL_theme) {
        t3 t3Var = new t3(i7);
        String str = tL_theme.emoticon;
        t3Var.f30000e = str;
        t3Var.f29999c = new ig.b(str, null);
        t3Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i10 = 0; i10 < tL_theme.settings.size(); i10++) {
            s3 s3Var = new s3();
            s3Var.f29973b = tL_theme;
            s3Var.d = i10;
            t3Var.f30001f.add(s3Var);
        }
        return t3Var;
    }

    public static m6 d(boolean z10) {
        m6 D0;
        String string;
        if (z10) {
            D0 = n6.J;
        } else {
            D0 = n6.D0();
        }
        if (z10 != D0.q()) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26913b.getSharedPreferences("themeconfig", 0);
            String str = "Blue";
            if (z10) {
                string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            } else {
                string = sharedPreferences.getString("lastDayTheme", "Blue");
            }
            D0 = n6.Q0(string);
            if (D0 == null) {
                if (z10) {
                    str = "Dark Blue";
                }
                D0 = n6.Q0(str);
            }
        }
        return new m6(D0);
    }

    public static int f(SparseIntArray sparseIntArray, int i7) {
        if (sparseIntArray == null) {
            return n6.F0(i7);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i7);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return n6.F0(i7);
    }

    public static void o(int i7, long j3, TLRPC.WallPaper wallPaper, x10 x10Var) {
        boolean z10 = wallPaper.pattern;
        org.telegram.messenger.f4 f10 = org.telegram.messenger.f4.f(i7);
        r3 r3Var = new r3(x10Var, wallPaper, z10 ? 1 : 0, i7, j3);
        if (!z10) {
            org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(r3Var, 2);
            if (f10.f23832c == 0) {
                j1Var.onComplete(null);
                return;
            }
            org.telegram.messenger.f4.f23828s.c(new org.telegram.messenger.w3(25, f10.g(j3), j1Var));
        } else if (z10) {
            File i10 = org.telegram.messenger.t0.i();
            Locale locale = Locale.US;
            org.telegram.messenger.f4.f23828s.c(new org.telegram.messenger.w3(18, new File(i10, p5.c.j(j3, "pattern_", ".pgm.gz")), r3Var));
        }
    }

    public static void q(m6 m6Var, int i7) {
        String str;
        String str2;
        SparseArray sparseArray;
        k6 k6Var;
        if (m6Var != null) {
            if (i7 < 0 || (sparseArray = m6Var.f29250b0) == null || ((k6Var = (k6) sparseArray.get(i7)) != null && !k6Var.f29190z)) {
                if (!m6Var.m().equals("Blue") || i7 != 99) {
                    if (!m6Var.m().equals("Day") || i7 != 9) {
                        if (!m6Var.m().equals("Night") || i7 != 0) {
                            if (m6Var.m().equals("Dark Blue") && i7 == 0) {
                                return;
                            }
                            boolean q10 = m6Var.q();
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
                            org.telegram.messenger.t0.f26913b.getSharedPreferences("themeconfig", 0).edit().putString(str, m6Var.m()).putInt(str2, i7).apply();
                        }
                    }
                }
            }
        }
    }

    public final TLRPC.Document e() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return cg.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return ri.d0(this.f30002g).V(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray g(int i7, int i10) {
        k6 k6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        m6 m6Var;
        m6 Q0;
        k6 k6Var2;
        ArrayList arrayList = this.f30001f;
        SparseIntArray sparseIntArray2 = ((s3) arrayList.get(i10)).f29976f;
        if (sparseIntArray2 != null) {
            return sparseIntArray2;
        }
        m6 i11 = i(i10);
        if (i11 == null) {
            int i12 = ((s3) arrayList.get(i10)).d;
            ig.a aVar = (ig.a) arrayList.get(i10);
            TLRPC.TL_theme tL_theme = ((s3) arrayList.get(i10)).f29973b;
            if (aVar != null) {
                Q0 = n6.Q0(n6.r0(((s3) aVar).b(i12)));
            } else {
                Q0 = n6.Q0("Blue");
            }
            if (Q0 != null) {
                m6 m6Var2 = new m6(Q0);
                if (aVar != null) {
                    s3 s3Var = (s3) aVar;
                    k6Var2 = m6Var2.e(s3Var.a(), s3Var.b(i12), tL_theme, i7, true);
                } else {
                    k6Var2 = null;
                }
                if (k6Var2 != null) {
                    m6Var2.u(k6Var2.f29168a);
                }
                k6Var = k6Var2;
                i11 = m6Var2;
            }
            k6Var = null;
        } else {
            SparseArray sparseArray = i11.f29250b0;
            if (sparseArray != null) {
                k6Var = (k6) sparseArray.get(((s3) arrayList.get(i10)).f29975e);
            }
            k6Var = null;
        }
        if (i11 == null) {
            return sparseIntArray2;
        }
        String[] strArr = new String[1];
        if (i11.f29249b != null) {
            sparseIntArray = n6.T0(new File(i11.f29249b), null, strArr);
        } else {
            String str = i11.d;
            if (str != null) {
                sparseIntArray = n6.T0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        int i13 = 0;
        ((s3) arrayList.get(i10)).f29977g = strArr[0];
        if (k6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            k6Var.d(sparseIntArray, clone);
            ig.b bVar = this.f29999c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f16247b) && (m6Var = k6Var.f29169b) != null && m6Var.f29249b == null && !m6Var.q()) {
                k6.h(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray3 = n6.im;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        ((s3) arrayList.get(i10)).f29976f = sparseIntArray4;
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

    public final long h(int i7) {
        return ((s3) this.f30001f.get(i7)).a();
    }

    public final m6 i(int i7) {
        return ((s3) this.f30001f.get(i7)).f29972a;
    }

    public final TLRPC.WallPaper j(int i7) {
        s3 s3Var = (s3) this.f30001f.get(i7);
        TLRPC.ThemeSettings b10 = s3Var.b(s3Var.d);
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
        if (!this.f29997a && !this.f29998b) {
            return false;
        }
        return true;
    }

    public final void m(int i7) {
        int i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f30001f;
            if (i11 < arrayList.size()) {
                if (arrayList.get(i11) != null) {
                    SparseIntArray g10 = g(i7, i11);
                    ((s3) arrayList.get(i11)).h = f(g10, n6.f29657ra);
                    ((s3) arrayList.get(i11)).f29978i = f(g10, n6.f29658rb);
                    ((s3) arrayList.get(i11)).f29979j = f(g10, n6.Fi);
                    ((s3) arrayList.get(i11)).f29980k = g10.get(n6.Ee, 0);
                    ((s3) arrayList.get(i11)).f29981l = g10.get(n6.Fe, 0);
                    ((s3) arrayList.get(i11)).f29982m = g10.get(n6.Ge, 0);
                    ((s3) arrayList.get(i11)).f29983n = g10.get(n6.He, 0);
                    ((s3) arrayList.get(i11)).f29984o = g10.get(n6.Ie, 0);
                    if (((s3) arrayList.get(i11)).f29972a != null && ((s3) arrayList.get(i11)).f29972a.m().equals("Blue")) {
                        if (((s3) arrayList.get(i11)).f29975e >= 0) {
                            i10 = ((s3) arrayList.get(i11)).f29975e;
                        } else {
                            i10 = ((s3) arrayList.get(i11)).f29972a.Z;
                        }
                        if (i10 == 99) {
                            ((s3) arrayList.get(i11)).f29980k = -2368069;
                            ((s3) arrayList.get(i11)).f29981l = -9722489;
                            ((s3) arrayList.get(i11)).f29982m = -2762611;
                            ((s3) arrayList.get(i11)).f29983n = -7817084;
                        }
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final void n(int i7, ResultCallback resultCallback) {
        TLRPC.WallPaper j3 = j(i7);
        if (j3 == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        long h7 = h(i7);
        o(this.f30002g, j3.f28557id, j3, new d8(resultCallback, h7, 2));
    }

    public final void p(int i7, ResultCallback resultCallback) {
        TLRPC.WallPaper j3 = j(i7);
        if (j3 == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        } else {
            long h7 = h(i7);
            if (h7 == 0) {
                if (resultCallback != null) {
                    resultCallback.onComplete(null);
                }
            } else {
                Bitmap bitmap = (Bitmap) org.telegram.messenger.f4.f(this.f30002g).f23830a.get(Long.valueOf(h7));
                File file = new File(org.telegram.messenger.t0.h(), p5.c.j(h7, "wallpaper_thumb_", ".png"));
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
                TLRPC.Document document = j3.document;
                if (document == null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(h7), null));
                        return;
                    }
                    return;
                }
                fc c10 = fc.c(w7.w(document.thumbs, 140, false, null, false), j3.document);
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.A1 = false;
                imageReceiver.q0(c10, "120_140", null, null, null, 1);
                imageReceiver.f22639h1 = new di.h(resultCallback, h7, file, 5);
                ec.D().M(imageReceiver, null);
            }
        }
    }

    public t3(int i7, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f30001f = arrayList;
        this.f30002g = i7;
        this.f29997a = false;
        String str = tL_theme.emoticon;
        this.f30000e = str;
        this.f29999c = new ig.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        s3 s3Var = new s3();
        s3Var.f29973b = tL_theme;
        s3Var.d = 0;
        arrayList.add(s3Var);
        s3 s3Var2 = new s3();
        s3Var2.f29973b = tL_theme;
        s3Var2.d = 1;
        arrayList.add(s3Var2);
    }

    public t3(int i7, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f30001f = arrayList;
        this.f30002g = i7;
        this.f29997a = false;
        this.f30000e = tL_chatThemeUniqueGift.gift.slug;
        this.f29999c = ig.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        s3 s3Var = new s3();
        s3Var.f29974c = tL_chatThemeUniqueGift;
        s3Var.d = 0;
        arrayList.add(s3Var);
        s3 s3Var2 = new s3();
        s3Var2.f29974c = tL_chatThemeUniqueGift;
        s3Var2.d = 1;
        arrayList.add(s3Var2);
    }
}
