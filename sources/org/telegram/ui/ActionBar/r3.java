package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import fi.f8;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.ui;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class r3 {
    public static final int[] h = {k6.f28115ra, k6.f28057ob, k6.Ci, k6.Be, k6.Ce, k6.De, k6.Ee, k6.Fe};
    public boolean f28459a;
    public boolean f28460b;
    public ig.b f28461c;
    public TLRPC.ChatTheme d;
    public String f28462e;
    public final ArrayList f28463f;
    public final int f28464g;

    public r3(int i7) {
        this.f28463f = new ArrayList();
        this.f28464g = i7;
    }

    public static r3 a(int i7) {
        r3 r3Var = new r3(i7);
        r3Var.f28462e = "❌";
        r3Var.f28461c = ig.b.d("❌");
        r3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        r3Var.f28460b = true;
        q3 q3Var = new q3();
        q3Var.f28403a = d(true);
        r3Var.f28463f.add(q3Var);
        q3 q3Var2 = new q3();
        q3Var2.f28403a = d(false);
        r3Var.f28463f.add(q3Var2);
        return r3Var;
    }

    public static r3 b(int i7) {
        r3 r3Var = new r3(i7);
        r3Var.f28462e = "🏠";
        r3Var.f28461c = ig.b.d("🏠");
        r3Var.d = TLRPC.ChatTheme.ofEmoticon(r3Var.f28462e);
        q3 q3Var = new q3();
        q3Var.f28403a = k6.Q0("Blue");
        q3Var.f28406e = 99;
        r3Var.f28463f.add(q3Var);
        q3 q3Var2 = new q3();
        q3Var2.f28403a = k6.Q0("Day");
        q3Var2.f28406e = 9;
        r3Var.f28463f.add(q3Var2);
        q3 q3Var3 = new q3();
        q3Var3.f28403a = k6.Q0("Night");
        q3Var3.f28406e = 0;
        r3Var.f28463f.add(q3Var3);
        q3 q3Var4 = new q3();
        q3Var4.f28403a = k6.Q0("Dark Blue");
        q3Var4.f28406e = 0;
        r3Var.f28463f.add(q3Var4);
        return r3Var;
    }

    public static r3 c(int i7, TLRPC.TL_theme tL_theme) {
        r3 r3Var = new r3(i7);
        String str = tL_theme.emoticon;
        r3Var.f28462e = str;
        r3Var.f28461c = new ig.b(str, null);
        r3Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i10 = 0; i10 < tL_theme.settings.size(); i10++) {
            q3 q3Var = new q3();
            q3Var.f28404b = tL_theme;
            q3Var.d = i10;
            r3Var.f28463f.add(q3Var);
        }
        return r3Var;
    }

    public static j6 d(boolean z9) {
        j6 D0;
        String string;
        if (z9) {
            D0 = k6.J;
        } else {
            D0 = k6.D0();
        }
        if (z9 != D0.q()) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25566b.getSharedPreferences("themeconfig", 0);
            String str = "Blue";
            if (z9) {
                string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            } else {
                string = sharedPreferences.getString("lastDayTheme", "Blue");
            }
            D0 = k6.Q0(string);
            if (D0 == null) {
                if (z9) {
                    str = "Dark Blue";
                }
                D0 = k6.Q0(str);
            }
        }
        return new j6(D0);
    }

    public static int f(SparseIntArray sparseIntArray, int i7) {
        if (sparseIntArray == null) {
            return k6.F0(i7);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i7);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return k6.F0(i7);
    }

    public static void o(int i7, long j3, TLRPC.WallPaper wallPaper, c20 c20Var) {
        boolean z9 = wallPaper.pattern;
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i7);
        p3 p3Var = new p3(c20Var, wallPaper, z9 ? 1 : 0, i7, j3);
        if (!z9) {
            org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(p3Var, 2);
            if (f10.f21981c == 0) {
                j1Var.onComplete(null);
                return;
            }
            org.telegram.messenger.d4.f21977s.c(new org.telegram.messenger.b4(25, f10.g(j3), j1Var));
        } else if (z9) {
            File i10 = org.telegram.messenger.t0.i();
            Locale locale = Locale.US;
            org.telegram.messenger.d4.f21977s.c(new org.telegram.messenger.b4(18, new File(i10, rf.b.h(j3, "pattern_", ".pgm.gz")), p3Var));
        }
    }

    public static void q(j6 j6Var, int i7) {
        String str;
        String str2;
        SparseArray sparseArray;
        h6 h6Var;
        if (j6Var != null) {
            if (i7 < 0 || (sparseArray = j6Var.f27630a0) == null || ((h6Var = (h6) sparseArray.get(i7)) != null && !h6Var.f27541z)) {
                if (!j6Var.m().equals("Blue") || i7 != 99) {
                    if (!j6Var.m().equals("Day") || i7 != 9) {
                        if (!j6Var.m().equals("Night") || i7 != 0) {
                            if (j6Var.m().equals("Dark Blue") && i7 == 0) {
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
                            org.telegram.messenger.t0.f25566b.getSharedPreferences("themeconfig", 0).edit().putString(str, j6Var.m()).putInt(str2, i7).apply();
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
            return ui.b0(this.f28464g).T(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray g(int i7, int i10) {
        h6 h6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        j6 j6Var;
        j6 Q0;
        h6 h6Var2;
        ArrayList arrayList = this.f28463f;
        SparseIntArray sparseIntArray2 = ((q3) arrayList.get(i10)).f28407f;
        if (sparseIntArray2 != null) {
            return sparseIntArray2;
        }
        j6 i11 = i(i10);
        if (i11 == null) {
            int i12 = ((q3) arrayList.get(i10)).d;
            ig.a aVar = (ig.a) arrayList.get(i10);
            TLRPC.TL_theme tL_theme = ((q3) arrayList.get(i10)).f28404b;
            if (aVar != null) {
                Q0 = k6.Q0(k6.r0(((q3) aVar).b(i12)));
            } else {
                Q0 = k6.Q0("Blue");
            }
            if (Q0 != null) {
                j6 j6Var2 = new j6(Q0);
                if (aVar != null) {
                    q3 q3Var = (q3) aVar;
                    h6Var2 = j6Var2.e(q3Var.a(), q3Var.b(i12), tL_theme, i7, true);
                } else {
                    h6Var2 = null;
                }
                if (h6Var2 != null) {
                    j6Var2.u(h6Var2.f27519a);
                }
                h6Var = h6Var2;
                i11 = j6Var2;
            }
            h6Var = null;
        } else {
            SparseArray sparseArray = i11.f27630a0;
            if (sparseArray != null) {
                h6Var = (h6) sparseArray.get(((q3) arrayList.get(i10)).f28406e);
            }
            h6Var = null;
        }
        if (i11 == null) {
            return sparseIntArray2;
        }
        String[] strArr = new String[1];
        if (i11.f27631b != null) {
            sparseIntArray = k6.T0(new File(i11.f27631b), null, strArr);
        } else {
            String str = i11.d;
            if (str != null) {
                sparseIntArray = k6.T0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        int i13 = 0;
        ((q3) arrayList.get(i10)).f28408g = strArr[0];
        if (h6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            h6Var.d(sparseIntArray, clone);
            ig.b bVar = this.f28461c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f15477b) && (j6Var = h6Var.f27520b) != null && j6Var.f27631b == null && !j6Var.q()) {
                h6.h(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray3 = k6.fm;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        ((q3) arrayList.get(i10)).f28407f = sparseIntArray4;
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
        return ((q3) this.f28463f.get(i7)).a();
    }

    public final j6 i(int i7) {
        return ((q3) this.f28463f.get(i7)).f28403a;
    }

    public final TLRPC.WallPaper j(int i7) {
        q3 q3Var = (q3) this.f28463f.get(i7);
        TLRPC.ThemeSettings b10 = q3Var.b(q3Var.d);
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
        if (!this.f28459a && !this.f28460b) {
            return false;
        }
        return true;
    }

    public final void m(int i7) {
        int i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f28463f;
            if (i11 < arrayList.size()) {
                if (arrayList.get(i11) != null) {
                    SparseIntArray g10 = g(i7, i11);
                    ((q3) arrayList.get(i11)).h = f(g10, k6.f28115ra);
                    ((q3) arrayList.get(i11)).f28409i = f(g10, k6.f28057ob);
                    ((q3) arrayList.get(i11)).f28410j = f(g10, k6.Ci);
                    ((q3) arrayList.get(i11)).f28411k = g10.get(k6.Be, 0);
                    ((q3) arrayList.get(i11)).f28412l = g10.get(k6.Ce, 0);
                    ((q3) arrayList.get(i11)).f28413m = g10.get(k6.De, 0);
                    ((q3) arrayList.get(i11)).f28414n = g10.get(k6.Ee, 0);
                    ((q3) arrayList.get(i11)).f28415o = g10.get(k6.Fe, 0);
                    if (((q3) arrayList.get(i11)).f28403a != null && ((q3) arrayList.get(i11)).f28403a.m().equals("Blue")) {
                        if (((q3) arrayList.get(i11)).f28406e >= 0) {
                            i10 = ((q3) arrayList.get(i11)).f28406e;
                        } else {
                            i10 = ((q3) arrayList.get(i11)).f28403a.Y;
                        }
                        if (i10 == 99) {
                            ((q3) arrayList.get(i11)).f28411k = -2368069;
                            ((q3) arrayList.get(i11)).f28412l = -9722489;
                            ((q3) arrayList.get(i11)).f28413m = -2762611;
                            ((q3) arrayList.get(i11)).f28414n = -7817084;
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
        o(this.f28464g, j3.f27110id, j3, new f8(resultCallback, h7, 1));
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
                Bitmap bitmap = (Bitmap) org.telegram.messenger.d4.f(this.f28464g).f21979a.get(Long.valueOf(h7));
                File file = new File(org.telegram.messenger.t0.h(), rf.b.h(h7, "wallpaper_thumb_", ".png"));
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
                hc c10 = hc.c(w7.w(document.thumbs, 140, false, null, false), j3.document);
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.f21236z1 = false;
                imageReceiver.q0(c10, "120_140", null, null, null, 1);
                imageReceiver.f21195g1 = new bi.i(resultCallback, h7, file, 4);
                gc.D().M(imageReceiver, null);
            }
        }
    }

    public r3(int i7, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f28463f = arrayList;
        this.f28464g = i7;
        this.f28459a = false;
        String str = tL_theme.emoticon;
        this.f28462e = str;
        this.f28461c = new ig.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        q3 q3Var = new q3();
        q3Var.f28404b = tL_theme;
        q3Var.d = 0;
        arrayList.add(q3Var);
        q3 q3Var2 = new q3();
        q3Var2.f28404b = tL_theme;
        q3Var2.d = 1;
        arrayList.add(q3Var2);
    }

    public r3(int i7, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f28463f = arrayList;
        this.f28464g = i7;
        this.f28459a = false;
        this.f28462e = tL_chatThemeUniqueGift.gift.slug;
        this.f28461c = ig.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        q3 q3Var = new q3();
        q3Var.f28405c = tL_chatThemeUniqueGift;
        q3Var.d = 0;
        arrayList.add(q3Var);
        q3 q3Var2 = new q3();
        q3Var2.f28405c = tL_chatThemeUniqueGift;
        q3Var2.d = 1;
        arrayList.add(q3Var2);
    }
}
