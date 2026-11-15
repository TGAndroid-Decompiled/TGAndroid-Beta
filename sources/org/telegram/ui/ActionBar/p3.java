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
import org.telegram.messenger.fc;
import org.telegram.messenger.gc;
import org.telegram.messenger.si;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class p3 {
    public static final int[] h = {j6.f29112ra, j6.f29113rb, j6.Fi, j6.Ee, j6.Fe, j6.Ge, j6.He, j6.Ie};
    public boolean f29470a;
    public boolean f29471b;
    public ig.b f29472c;
    public TLRPC.ChatTheme d;
    public String f29473e;
    public final ArrayList f29474f;
    public final int f29475g;

    public p3(int i7) {
        this.f29474f = new ArrayList();
        this.f29475g = i7;
    }

    public static p3 a(int i7) {
        p3 p3Var = new p3(i7);
        p3Var.f29473e = "❌";
        p3Var.f29472c = ig.b.d("❌");
        p3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        p3Var.f29471b = true;
        o3 o3Var = new o3();
        o3Var.f29436a = d(true);
        p3Var.f29474f.add(o3Var);
        o3 o3Var2 = new o3();
        o3Var2.f29436a = d(false);
        p3Var.f29474f.add(o3Var2);
        return p3Var;
    }

    public static p3 b(int i7) {
        p3 p3Var = new p3(i7);
        p3Var.f29473e = "🏠";
        p3Var.f29472c = ig.b.d("🏠");
        p3Var.d = TLRPC.ChatTheme.ofEmoticon(p3Var.f29473e);
        o3 o3Var = new o3();
        o3Var.f29436a = j6.Q0("Blue");
        o3Var.f29439e = 99;
        p3Var.f29474f.add(o3Var);
        o3 o3Var2 = new o3();
        o3Var2.f29436a = j6.Q0("Day");
        o3Var2.f29439e = 9;
        p3Var.f29474f.add(o3Var2);
        o3 o3Var3 = new o3();
        o3Var3.f29436a = j6.Q0("Night");
        o3Var3.f29439e = 0;
        p3Var.f29474f.add(o3Var3);
        o3 o3Var4 = new o3();
        o3Var4.f29436a = j6.Q0("Dark Blue");
        o3Var4.f29439e = 0;
        p3Var.f29474f.add(o3Var4);
        return p3Var;
    }

    public static p3 c(int i7, TLRPC.TL_theme tL_theme) {
        p3 p3Var = new p3(i7);
        String str = tL_theme.emoticon;
        p3Var.f29473e = str;
        p3Var.f29472c = new ig.b(str, null);
        p3Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i10 = 0; i10 < tL_theme.settings.size(); i10++) {
            o3 o3Var = new o3();
            o3Var.f29437b = tL_theme;
            o3Var.d = i10;
            p3Var.f29474f.add(o3Var);
        }
        return p3Var;
    }

    public static i6 d(boolean z10) {
        i6 D0;
        String string;
        if (z10) {
            D0 = j6.J;
        } else {
            D0 = j6.D0();
        }
        if (z10 != D0.q()) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26600b.getSharedPreferences("themeconfig", 0);
            String str = "Blue";
            if (z10) {
                string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            } else {
                string = sharedPreferences.getString("lastDayTheme", "Blue");
            }
            D0 = j6.Q0(string);
            if (D0 == null) {
                if (z10) {
                    str = "Dark Blue";
                }
                D0 = j6.Q0(str);
            }
        }
        return new i6(D0);
    }

    public static int f(SparseIntArray sparseIntArray, int i7) {
        if (sparseIntArray == null) {
            return j6.F0(i7);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i7);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return j6.F0(i7);
    }

    public static void o(int i7, long j3, TLRPC.WallPaper wallPaper, z10 z10Var) {
        boolean z10 = wallPaper.pattern;
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i7);
        n3 n3Var = new n3(z10Var, wallPaper, z10 ? 1 : 0, i7, j3);
        if (!z10) {
            org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(n3Var, 2);
            if (f10.f23026c == 0) {
                j1Var.onComplete(null);
                return;
            }
            org.telegram.messenger.d4.f23022s.c(new org.telegram.messenger.b4(25, f10.g(j3), j1Var));
        } else if (z10) {
            File i10 = org.telegram.messenger.t0.i();
            Locale locale = Locale.US;
            org.telegram.messenger.d4.f23022s.c(new org.telegram.messenger.b4(18, new File(i10, r.b.j(j3, "pattern_", ".pgm.gz")), n3Var));
        }
    }

    public static void q(i6 i6Var, int i7) {
        String str;
        String str2;
        SparseArray sparseArray;
        g6 g6Var;
        if (i6Var != null) {
            if (i7 < 0 || (sparseArray = i6Var.f28701b0) == null || ((g6Var = (g6) sparseArray.get(i7)) != null && !g6Var.f28624z)) {
                if (!i6Var.m().equals("Blue") || i7 != 99) {
                    if (!i6Var.m().equals("Day") || i7 != 9) {
                        if (!i6Var.m().equals("Night") || i7 != 0) {
                            if (i6Var.m().equals("Dark Blue") && i7 == 0) {
                                return;
                            }
                            boolean q10 = i6Var.q();
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
                            org.telegram.messenger.t0.f26600b.getSharedPreferences("themeconfig", 0).edit().putString(str, i6Var.m()).putInt(str2, i7).apply();
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
            return si.b0(this.f29475g).T(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray g(int i7, int i10) {
        g6 g6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        i6 i6Var;
        i6 Q0;
        g6 g6Var2;
        ArrayList arrayList = this.f29474f;
        SparseIntArray sparseIntArray2 = ((o3) arrayList.get(i10)).f29440f;
        if (sparseIntArray2 != null) {
            return sparseIntArray2;
        }
        i6 i11 = i(i10);
        if (i11 == null) {
            int i12 = ((o3) arrayList.get(i10)).d;
            ig.a aVar = (ig.a) arrayList.get(i10);
            TLRPC.TL_theme tL_theme = ((o3) arrayList.get(i10)).f29437b;
            if (aVar != null) {
                Q0 = j6.Q0(j6.r0(((o3) aVar).b(i12)));
            } else {
                Q0 = j6.Q0("Blue");
            }
            if (Q0 != null) {
                i6 i6Var2 = new i6(Q0);
                if (aVar != null) {
                    o3 o3Var = (o3) aVar;
                    g6Var2 = i6Var2.e(o3Var.a(), o3Var.b(i12), tL_theme, i7, true);
                } else {
                    g6Var2 = null;
                }
                if (g6Var2 != null) {
                    i6Var2.u(g6Var2.f28602a);
                }
                g6Var = g6Var2;
                i11 = i6Var2;
            }
            g6Var = null;
        } else {
            SparseArray sparseArray = i11.f28701b0;
            if (sparseArray != null) {
                g6Var = (g6) sparseArray.get(((o3) arrayList.get(i10)).f29439e);
            }
            g6Var = null;
        }
        if (i11 == null) {
            return sparseIntArray2;
        }
        String[] strArr = new String[1];
        if (i11.f28700b != null) {
            sparseIntArray = j6.T0(new File(i11.f28700b), null, strArr);
        } else {
            String str = i11.d;
            if (str != null) {
                sparseIntArray = j6.T0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        int i13 = 0;
        ((o3) arrayList.get(i10)).f29441g = strArr[0];
        if (g6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            g6Var.d(sparseIntArray, clone);
            ig.b bVar = this.f29472c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f15934b) && (i6Var = g6Var.f28603b) != null && i6Var.f28700b == null && !i6Var.q()) {
                g6.h(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray3 = j6.im;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        ((o3) arrayList.get(i10)).f29440f = sparseIntArray4;
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
        return ((o3) this.f29474f.get(i7)).a();
    }

    public final i6 i(int i7) {
        return ((o3) this.f29474f.get(i7)).f29436a;
    }

    public final TLRPC.WallPaper j(int i7) {
        o3 o3Var = (o3) this.f29474f.get(i7);
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
        if (!this.f29470a && !this.f29471b) {
            return false;
        }
        return true;
    }

    public final void m(int i7) {
        int i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f29474f;
            if (i11 < arrayList.size()) {
                if (arrayList.get(i11) != null) {
                    SparseIntArray g10 = g(i7, i11);
                    ((o3) arrayList.get(i11)).h = f(g10, j6.f29112ra);
                    ((o3) arrayList.get(i11)).f29442i = f(g10, j6.f29113rb);
                    ((o3) arrayList.get(i11)).f29443j = f(g10, j6.Fi);
                    ((o3) arrayList.get(i11)).f29444k = g10.get(j6.Ee, 0);
                    ((o3) arrayList.get(i11)).f29445l = g10.get(j6.Fe, 0);
                    ((o3) arrayList.get(i11)).f29446m = g10.get(j6.Ge, 0);
                    ((o3) arrayList.get(i11)).f29447n = g10.get(j6.He, 0);
                    ((o3) arrayList.get(i11)).f29448o = g10.get(j6.Ie, 0);
                    if (((o3) arrayList.get(i11)).f29436a != null && ((o3) arrayList.get(i11)).f29436a.m().equals("Blue")) {
                        if (((o3) arrayList.get(i11)).f29439e >= 0) {
                            i10 = ((o3) arrayList.get(i11)).f29439e;
                        } else {
                            i10 = ((o3) arrayList.get(i11)).f29436a.Z;
                        }
                        if (i10 == 99) {
                            ((o3) arrayList.get(i11)).f29444k = -2368069;
                            ((o3) arrayList.get(i11)).f29445l = -9722489;
                            ((o3) arrayList.get(i11)).f29446m = -2762611;
                            ((o3) arrayList.get(i11)).f29447n = -7817084;
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
        o(this.f29475g, j3.f28205id, j3, new d8(resultCallback, h7, 2));
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
                Bitmap bitmap = (Bitmap) org.telegram.messenger.d4.f(this.f29475g).f23024a.get(Long.valueOf(h7));
                File file = new File(org.telegram.messenger.t0.h(), r.b.j(h7, "wallpaper_thumb_", ".png"));
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
                gc c10 = gc.c(w7.w(document.thumbs, 140, false, null, false), j3.document);
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.A1 = false;
                imageReceiver.q0(c10, "120_140", null, null, null, 1);
                imageReceiver.f22276h1 = new di.h(resultCallback, h7, file, 4);
                fc.D().M(imageReceiver, null);
            }
        }
    }

    public p3(int i7, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f29474f = arrayList;
        this.f29475g = i7;
        this.f29470a = false;
        String str = tL_theme.emoticon;
        this.f29473e = str;
        this.f29472c = new ig.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        o3 o3Var = new o3();
        o3Var.f29437b = tL_theme;
        o3Var.d = 0;
        arrayList.add(o3Var);
        o3 o3Var2 = new o3();
        o3Var2.f29437b = tL_theme;
        o3Var2.d = 1;
        arrayList.add(o3Var2);
    }

    public p3(int i7, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f29474f = arrayList;
        this.f29475g = i7;
        this.f29470a = false;
        this.f29473e = tL_chatThemeUniqueGift.gift.slug;
        this.f29472c = ig.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        o3 o3Var = new o3();
        o3Var.f29438c = tL_chatThemeUniqueGift;
        o3Var.d = 0;
        arrayList.add(o3Var);
        o3 o3Var2 = new o3();
        o3Var2.f29438c = tL_chatThemeUniqueGift;
        o3Var2.d = 1;
        arrayList.add(o3Var2);
    }
}
