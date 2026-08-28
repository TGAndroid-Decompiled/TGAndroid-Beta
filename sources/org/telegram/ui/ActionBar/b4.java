package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.util.ArrayList;
import kh.e9;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class b4 {
    public static final int[] h = {f6.f23252ra, f6.Aa, f6.Oh, f6.Nd, f6.Od, f6.Pd, f6.Qd, f6.Rd};
    public boolean f22748a;
    public boolean f22749b;
    public nf.b f22750c;
    public TLRPC.ChatTheme d;
    public String f22751e;
    public final ArrayList f22752f;
    public final int f22753g;

    public b4(int i9) {
        this.f22752f = new ArrayList();
        this.f22753g = i9;
    }

    public static b4 a(int i9) {
        b4 b4Var = new b4(i9);
        b4Var.f22751e = "❌";
        b4Var.f22750c = nf.b.d("❌");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        b4Var.f22749b = true;
        a4 a4Var = new a4();
        a4Var.f22714a = e(true);
        b4Var.f22752f.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.f22714a = e(false);
        b4Var.f22752f.add(a4Var2);
        return b4Var;
    }

    public static b4 c(int i9) {
        b4 b4Var = new b4(i9);
        b4Var.f22751e = "🏠";
        b4Var.f22750c = nf.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.f22751e);
        a4 a4Var = new a4();
        a4Var.f22714a = f6.N0("Blue");
        a4Var.f22717e = 99;
        b4Var.f22752f.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.f22714a = f6.N0("Day");
        a4Var2.f22717e = 9;
        b4Var.f22752f.add(a4Var2);
        a4 a4Var3 = new a4();
        a4Var3.f22714a = f6.N0("Night");
        a4Var3.f22717e = 0;
        b4Var.f22752f.add(a4Var3);
        a4 a4Var4 = new a4();
        a4Var4.f22714a = f6.N0("Dark Blue");
        a4Var4.f22717e = 0;
        b4Var.f22752f.add(a4Var4);
        return b4Var;
    }

    public static b4 d(int i9, TLRPC.TL_theme tL_theme) {
        b4 b4Var = new b4(i9);
        String str = tL_theme.emoticon;
        b4Var.f22751e = str;
        b4Var.f22750c = new nf.b(str, null);
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i10 = 0; i10 < tL_theme.settings.size(); i10++) {
            a4 a4Var = new a4();
            a4Var.f22715b = tL_theme;
            a4Var.d = i10;
            b4Var.f22752f.add(a4Var);
        }
        return b4Var;
    }

    public static e6 e(boolean z10) {
        e6 A0;
        String string;
        if (z10) {
            A0 = f6.J;
        } else {
            A0 = f6.A0();
        }
        if (z10 != A0.q()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            String str = "Blue";
            if (z10) {
                string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            } else {
                string = sharedPreferences.getString("lastDayTheme", "Blue");
            }
            A0 = f6.N0(string);
            if (A0 == null) {
                if (z10) {
                    str = "Dark Blue";
                }
                A0 = f6.N0(str);
            }
        }
        return new e6(A0);
    }

    public static int g(SparseIntArray sparseIntArray, int i9) {
        if (sparseIntArray == null) {
            return f6.C0(i9);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i9);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return f6.C0(i9);
    }

    public static void q(e6 e6Var, int i9) {
        String str;
        String str2;
        SparseArray sparseArray;
        d6 d6Var;
        if (e6Var != null) {
            if (i9 < 0 || (sparseArray = e6Var.W) == null || ((d6Var = (d6) sparseArray.get(i9)) != null && !d6Var.f22888z)) {
                if (!e6Var.m().equals("Blue") || i9 != 99) {
                    if (!e6Var.m().equals("Day") || i9 != 9) {
                        if (!e6Var.m().equals("Night") || i9 != 0) {
                            if (e6Var.m().equals("Dark Blue") && i9 == 0) {
                                return;
                            }
                            boolean q10 = e6Var.q();
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
                            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().putString(str, e6Var.m()).putInt(str2, i9).apply();
                        }
                    }
                }
            }
        }
    }

    public final SparseIntArray b(int i9, int i10) {
        d6 d6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        e6 e6Var;
        e6 j10 = j(i10);
        ArrayList arrayList = this.f22752f;
        if (j10 == null) {
            int i11 = ((a4) arrayList.get(i10)).d;
            a4 a4Var = (a4) ((nf.a) arrayList.get(i10));
            TLRPC.ThemeSettings b10 = a4Var.b(i11);
            TLRPC.TL_theme tL_theme = ((a4) arrayList.get(i10)).f22715b;
            e6 e6Var2 = new e6(f6.N0(f6.q0(b10)));
            d6Var = e6Var2.e(a4Var.a(), b10, tL_theme, i9, true);
            e6Var2.u(d6Var.f22866a);
            j10 = e6Var2;
        } else {
            SparseArray sparseArray = j10.W;
            if (sparseArray != null) {
                d6Var = (d6) sparseArray.get(((a4) arrayList.get(i10)).f22717e);
            } else {
                d6Var = null;
            }
        }
        String[] strArr = new String[1];
        if (j10.f22908b != null) {
            sparseIntArray = f6.Q0(new File(j10.f22908b), null, strArr);
        } else {
            String str = j10.d;
            if (str != null) {
                sparseIntArray = f6.Q0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        ((a4) arrayList.get(i10)).f22719g = strArr[0];
        if (d6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            d6Var.c(sparseIntArray, clone);
            nf.b bVar = this.f22750c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f18593b) && (e6Var = d6Var.f22867b) != null && e6Var.f22908b == null && !e6Var.q()) {
                d6.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray2 = f6.ol;
        for (int i12 = 0; i12 < sparseIntArray2.size(); i12++) {
            int keyAt = sparseIntArray2.keyAt(i12);
            int valueAt = sparseIntArray2.valueAt(i12);
            if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey));
            }
        }
        int[] iArr = f6.nl;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            if (sparseIntArray.indexOfKey(i13) < 0) {
                sparseIntArray.put(i13, iArr[i13]);
            }
        }
        return sparseIntArray;
    }

    public final TLRPC.Document f() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return gf.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return MediaDataController.getInstance(this.f22753g).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray h(int i9, int i10) {
        d6 d6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        e6 e6Var;
        e6 N0;
        d6 d6Var2;
        ArrayList arrayList = this.f22752f;
        SparseIntArray sparseIntArray2 = ((a4) arrayList.get(i10)).f22718f;
        if (sparseIntArray2 != null) {
            return sparseIntArray2;
        }
        e6 j10 = j(i10);
        if (j10 == null) {
            int i11 = ((a4) arrayList.get(i10)).d;
            nf.a aVar = (nf.a) arrayList.get(i10);
            TLRPC.TL_theme tL_theme = ((a4) arrayList.get(i10)).f22715b;
            if (aVar != null) {
                N0 = f6.N0(f6.q0(((a4) aVar).b(i11)));
            } else {
                N0 = f6.N0("Blue");
            }
            if (N0 != null) {
                e6 e6Var2 = new e6(N0);
                if (aVar != null) {
                    a4 a4Var = (a4) aVar;
                    d6Var2 = e6Var2.e(a4Var.a(), a4Var.b(i11), tL_theme, i9, true);
                } else {
                    d6Var2 = null;
                }
                if (d6Var2 != null) {
                    e6Var2.u(d6Var2.f22866a);
                }
                d6Var = d6Var2;
                j10 = e6Var2;
            }
            d6Var = null;
        } else {
            SparseArray sparseArray = j10.W;
            if (sparseArray != null) {
                d6Var = (d6) sparseArray.get(((a4) arrayList.get(i10)).f22717e);
            }
            d6Var = null;
        }
        if (j10 == null) {
            return sparseIntArray2;
        }
        String[] strArr = new String[1];
        if (j10.f22908b != null) {
            sparseIntArray = f6.Q0(new File(j10.f22908b), null, strArr);
        } else {
            String str = j10.d;
            if (str != null) {
                sparseIntArray = f6.Q0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        int i12 = 0;
        ((a4) arrayList.get(i10)).f22719g = strArr[0];
        if (d6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            d6Var.c(sparseIntArray, clone);
            nf.b bVar = this.f22750c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f18593b) && (e6Var = d6Var.f22867b) != null && e6Var.f22908b == null && !e6Var.q()) {
                d6.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray3 = f6.ol;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        ((a4) arrayList.get(i10)).f22718f = sparseIntArray4;
        while (true) {
            try {
                int[] iArr = h;
                if (i12 < iArr.length) {
                    int i13 = iArr[i12];
                    int indexOfKey2 = sparseIntArray.indexOfKey(i13);
                    if (indexOfKey2 >= 0) {
                        sparseIntArray4.put(i13, sparseIntArray.valueAt(indexOfKey2));
                    } else {
                        int i14 = sparseIntArray3.get(i13, -1);
                        if (i14 >= 0 && (indexOfKey = sparseIntArray.indexOfKey(i14)) >= 0) {
                            sparseIntArray4.put(i13, sparseIntArray.valueAt(indexOfKey));
                        }
                    }
                    i12++;
                } else {
                    return sparseIntArray4;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return sparseIntArray4;
            }
        }
    }

    public final long i(int i9) {
        return ((a4) this.f22752f.get(i9)).a();
    }

    public final e6 j(int i9) {
        return ((a4) this.f22752f.get(i9)).f22714a;
    }

    public final TLRPC.WallPaper k(int i9) {
        a4 a4Var = (a4) this.f22752f.get(i9);
        TLRPC.ThemeSettings b10 = a4Var.b(a4Var.d);
        if (b10 != null) {
            return b10.wallpaper;
        }
        return null;
    }

    public final void l() {
        h(0, 0);
        h(0, 1);
    }

    public final boolean m() {
        if (!this.f22748a && !this.f22749b) {
            return false;
        }
        return true;
    }

    public final void n(int i9) {
        int i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f22752f;
            if (i11 < arrayList.size()) {
                if (arrayList.get(i11) != null) {
                    SparseIntArray h10 = h(i9, i11);
                    ((a4) arrayList.get(i11)).h = g(h10, f6.f23252ra);
                    ((a4) arrayList.get(i11)).f22720i = g(h10, f6.Aa);
                    ((a4) arrayList.get(i11)).f22721j = g(h10, f6.Oh);
                    ((a4) arrayList.get(i11)).f22722k = h10.get(f6.Nd, 0);
                    ((a4) arrayList.get(i11)).f22723l = h10.get(f6.Od, 0);
                    ((a4) arrayList.get(i11)).f22724m = h10.get(f6.Pd, 0);
                    ((a4) arrayList.get(i11)).f22725n = h10.get(f6.Qd, 0);
                    ((a4) arrayList.get(i11)).f22726o = h10.get(f6.Rd, 0);
                    if (((a4) arrayList.get(i11)).f22714a != null && ((a4) arrayList.get(i11)).f22714a.m().equals("Blue")) {
                        if (((a4) arrayList.get(i11)).f22717e >= 0) {
                            i10 = ((a4) arrayList.get(i11)).f22717e;
                        } else {
                            i10 = ((a4) arrayList.get(i11)).f22714a.U;
                        }
                        if (i10 == 99) {
                            ((a4) arrayList.get(i11)).f22722k = -2368069;
                            ((a4) arrayList.get(i11)).f22723l = -9722489;
                            ((a4) arrayList.get(i11)).f22724m = -2762611;
                            ((a4) arrayList.get(i11)).f22725n = -7817084;
                        }
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final void o(int i9, ResultCallback resultCallback) {
        TLRPC.WallPaper k10 = k(i9);
        if (k10 == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        long i10 = i(i9);
        long j10 = k10.f22532id;
        e9 e9Var = new e9(resultCallback, i10, 1);
        boolean z10 = k10.pattern;
        int i11 = this.f22753g;
        ChatThemeController.getInstance(i11).loadWallpaperBitmap(j10, z10 ? 1 : 0, new z3(e9Var, k10, z10 ? 1 : 0, i11, j10));
    }

    public final void p(int i9, ResultCallback resultCallback) {
        TLRPC.WallPaper k10 = k(i9);
        if (k10 == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        } else {
            long i10 = i(i9);
            if (i10 == 0) {
                if (resultCallback != null) {
                    resultCallback.onComplete(null);
                }
            } else {
                Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.f22753g).getWallpaperThumbBitmap(i10);
                File file = new File(ApplicationLoader.getFilesDirFixed(), aa.d.n(i10, "wallpaper_thumb_", ".png"));
                if (wallpaperThumbBitmap == null && file.exists() && file.length() > 0) {
                    try {
                        wallpaperThumbBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (wallpaperThumbBitmap != null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(i10), wallpaperThumbBitmap));
                        return;
                    }
                    return;
                }
                TLRPC.Document document = k10.document;
                if (document == null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(i10), null));
                        return;
                    }
                    return;
                }
                ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 140), k10.document);
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setAllowLoadingOnAttachedOnly(false);
                imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                imageReceiver.setDelegate(new b9.a(resultCallback, i10, file, 6));
                ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
            }
        }
    }

    public b4(int i9, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f22752f = arrayList;
        this.f22753g = i9;
        this.f22748a = false;
        String str = tL_theme.emoticon;
        this.f22751e = str;
        this.f22750c = new nf.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        a4 a4Var = new a4();
        a4Var.f22715b = tL_theme;
        a4Var.d = 0;
        arrayList.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.f22715b = tL_theme;
        a4Var2.d = 1;
        arrayList.add(a4Var2);
    }

    public b4(int i9, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f22752f = arrayList;
        this.f22753g = i9;
        this.f22748a = false;
        this.f22751e = tL_chatThemeUniqueGift.gift.slug;
        this.f22750c = nf.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        a4 a4Var = new a4();
        a4Var.f22716c = tL_chatThemeUniqueGift;
        a4Var.d = 0;
        arrayList.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.f22716c = tL_chatThemeUniqueGift;
        a4Var2.d = 1;
        arrayList.add(a4Var2);
    }
}
