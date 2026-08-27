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
import lh.b9;
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
    public static final int[] h = {g6.f23305ra, g6.Aa, g6.Oh, g6.Nd, g6.Od, g6.Pd, g6.Qd, g6.Rd};

    public boolean f22780a;

    public boolean f22781b;

    public of.b f22782c;
    public TLRPC.ChatTheme d;

    public String f22783e;

    public final ArrayList f22784f;

    public final int f22785g;

    public b4(int i10) {
        this.f22784f = new ArrayList();
        this.f22785g = i10;
    }

    public static b4 a(int i10) {
        b4 b4Var = new b4(i10);
        b4Var.f22783e = "❌";
        b4Var.f22782c = of.b.d("❌");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        b4Var.f22781b = true;
        a4 a4Var = new a4();
        a4Var.f22710a = e(true);
        b4Var.f22784f.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.f22710a = e(false);
        b4Var.f22784f.add(a4Var2);
        return b4Var;
    }

    public static b4 c(int i10) {
        b4 b4Var = new b4(i10);
        b4Var.f22783e = "🏠";
        b4Var.f22782c = of.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.f22783e);
        a4 a4Var = new a4();
        a4Var.f22710a = g6.N0("Blue");
        a4Var.f22713e = 99;
        b4Var.f22784f.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.f22710a = g6.N0("Day");
        a4Var2.f22713e = 9;
        b4Var.f22784f.add(a4Var2);
        a4 a4Var3 = new a4();
        a4Var3.f22710a = g6.N0("Night");
        a4Var3.f22713e = 0;
        b4Var.f22784f.add(a4Var3);
        a4 a4Var4 = new a4();
        a4Var4.f22710a = g6.N0("Dark Blue");
        a4Var4.f22713e = 0;
        b4Var.f22784f.add(a4Var4);
        return b4Var;
    }

    public static b4 d(int i10, TLRPC.TL_theme tL_theme) {
        b4 b4Var = new b4(i10);
        String str = tL_theme.emoticon;
        b4Var.f22783e = str;
        b4Var.f22782c = new of.b(str, null);
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i11 = 0; i11 < tL_theme.settings.size(); i11++) {
            a4 a4Var = new a4();
            a4Var.f22711b = tL_theme;
            a4Var.d = i11;
            b4Var.f22784f.add(a4Var);
        }
        return b4Var;
    }

    public static f6 e(boolean z10) {
        f6 f6VarA0 = z10 ? g6.J : g6.A0();
        if (z10 != f6VarA0.q()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            f6VarA0 = g6.N0(z10 ? sharedPreferences.getString("lastDarkTheme", "Dark Blue") : sharedPreferences.getString("lastDayTheme", "Blue"));
            if (f6VarA0 == null) {
                f6VarA0 = g6.N0(z10 ? "Dark Blue" : "Blue");
            }
        }
        return new f6(f6VarA0);
    }

    public static int g(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null) {
            return g6.C0(i10);
        }
        try {
            int iIndexOfKey = sparseIntArray.indexOfKey(i10);
            if (iIndexOfKey >= 0) {
                return sparseIntArray.valueAt(iIndexOfKey);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        return g6.C0(i10);
    }

    public static void q(f6 f6Var, int i10) {
        SparseArray sparseArray;
        e6 e6Var;
        if (f6Var == null) {
            return;
        }
        if (i10 < 0 || (sparseArray = f6Var.W) == null || !((e6Var = (e6) sparseArray.get(i10)) == null || e6Var.f22905z)) {
            if (f6Var.m().equals("Blue") && i10 == 99) {
                return;
            }
            if (f6Var.m().equals("Day") && i10 == 9) {
                return;
            }
            if (f6Var.m().equals("Night") && i10 == 0) {
                return;
            }
            if (f6Var.m().equals("Dark Blue") && i10 == 0) {
                return;
            }
            boolean zQ = f6Var.q();
            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().putString(zQ ? "lastDarkCustomTheme" : "lastDayCustomTheme", f6Var.m()).putInt(zQ ? "lastDarkCustomThemeAccentId" : "lastDayCustomThemeAccentId", i10).apply();
        }
    }

    public final SparseIntArray b(int i10, int i11) {
        e6 e6VarE;
        SparseIntArray sparseIntArrayQ0;
        int iIndexOfKey;
        f6 f6Var;
        f6 f6VarJ = j(i11);
        ArrayList arrayList = this.f22784f;
        if (f6VarJ == null) {
            int i12 = ((a4) arrayList.get(i11)).d;
            a4 a4Var = (a4) ((of.a) arrayList.get(i11));
            TLRPC.ThemeSettings themeSettingsB = a4Var.b(i12);
            TLRPC.TL_theme tL_theme = ((a4) arrayList.get(i11)).f22711b;
            f6 f6Var2 = new f6(g6.N0(g6.q0(themeSettingsB)));
            e6VarE = f6Var2.e(a4Var.a(), themeSettingsB, tL_theme, i10, true);
            f6Var2.u(e6VarE.f22883a);
            f6VarJ = f6Var2;
        } else {
            SparseArray sparseArray = f6VarJ.W;
            e6VarE = sparseArray != null ? (e6) sparseArray.get(((a4) arrayList.get(i11)).f22713e) : null;
        }
        String[] strArr = new String[1];
        if (f6VarJ.f22943b != null) {
            sparseIntArrayQ0 = g6.Q0(new File(f6VarJ.f22943b), null, strArr);
        } else {
            String str = f6VarJ.d;
            sparseIntArrayQ0 = str != null ? g6.Q0(null, str, strArr) : new SparseIntArray();
        }
        a4 a4Var2 = (a4) arrayList.get(i11);
        a4Var2.f22715g = strArr[0];
        if (e6VarE != null) {
            SparseIntArray sparseIntArrayClone = sparseIntArrayQ0.clone();
            e6VarE.c(sparseIntArrayQ0, sparseIntArrayClone);
            of.b bVar = this.f22782c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f19442b) && (f6Var = e6VarE.f22884b) != null && f6Var.f22943b == null && !f6Var.q()) {
                e6.g(sparseIntArrayClone);
            }
            sparseIntArrayQ0 = sparseIntArrayClone;
        }
        SparseIntArray sparseIntArray = g6.ol;
        for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
            int iKeyAt = sparseIntArray.keyAt(i13);
            int iValueAt = sparseIntArray.valueAt(i13);
            if (sparseIntArrayQ0.indexOfKey(iKeyAt) < 0 && (iIndexOfKey = sparseIntArrayQ0.indexOfKey(iValueAt)) >= 0) {
                sparseIntArrayQ0.put(iKeyAt, sparseIntArrayQ0.valueAt(iIndexOfKey));
            }
        }
        int[] iArr = g6.nl;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            if (sparseIntArrayQ0.indexOfKey(i14) < 0) {
                sparseIntArrayQ0.put(i14, iArr[i14]);
            }
        }
        return sparseIntArrayQ0;
    }

    public final TLRPC.Document f() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return hf.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return MediaDataController.getInstance(this.f22785g).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray h(int i10, int i11) {
        e6 e6Var;
        SparseIntArray sparseIntArrayQ0;
        int iIndexOfKey;
        f6 f6Var;
        e6 e6VarE;
        ArrayList arrayList = this.f22784f;
        SparseIntArray sparseIntArray = ((a4) arrayList.get(i11)).f22714f;
        if (sparseIntArray != null) {
            return sparseIntArray;
        }
        f6 f6VarJ = j(i11);
        if (f6VarJ == null) {
            int i12 = ((a4) arrayList.get(i11)).d;
            of.a aVar = (of.a) arrayList.get(i11);
            TLRPC.TL_theme tL_theme = ((a4) arrayList.get(i11)).f22711b;
            f6 f6VarN0 = aVar != null ? g6.N0(g6.q0(((a4) aVar).b(i12))) : g6.N0("Blue");
            if (f6VarN0 != null) {
                f6 f6Var2 = new f6(f6VarN0);
                if (aVar != null) {
                    a4 a4Var = (a4) aVar;
                    e6VarE = f6Var2.e(a4Var.a(), a4Var.b(i12), tL_theme, i10, true);
                } else {
                    e6VarE = null;
                }
                if (e6VarE != null) {
                    f6Var2.u(e6VarE.f22883a);
                }
                e6Var = e6VarE;
                f6VarJ = f6Var2;
            } else {
                e6Var = null;
            }
        } else {
            SparseArray sparseArray = f6VarJ.W;
            if (sparseArray != null) {
                e6Var = (e6) sparseArray.get(((a4) arrayList.get(i11)).f22713e);
            } else {
                e6Var = null;
            }
        }
        if (f6VarJ == null) {
            return sparseIntArray;
        }
        String[] strArr = new String[1];
        if (f6VarJ.f22943b != null) {
            sparseIntArrayQ0 = g6.Q0(new File(f6VarJ.f22943b), null, strArr);
        } else {
            String str = f6VarJ.d;
            sparseIntArrayQ0 = str != null ? g6.Q0(null, str, strArr) : new SparseIntArray();
        }
        int i13 = 0;
        ((a4) arrayList.get(i11)).f22715g = strArr[0];
        if (e6Var != null) {
            SparseIntArray sparseIntArrayClone = sparseIntArrayQ0.clone();
            e6Var.c(sparseIntArrayQ0, sparseIntArrayClone);
            of.b bVar = this.f22782c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f19442b) && (f6Var = e6Var.f22884b) != null && f6Var.f22943b == null && !f6Var.q()) {
                e6.g(sparseIntArrayClone);
            }
            sparseIntArrayQ0 = sparseIntArrayClone;
        }
        SparseIntArray sparseIntArray2 = g6.ol;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        ((a4) arrayList.get(i11)).f22714f = sparseIntArray3;
        while (true) {
            try {
                int[] iArr = h;
                if (i13 >= iArr.length) {
                    return sparseIntArray3;
                }
                int i14 = iArr[i13];
                int iIndexOfKey2 = sparseIntArrayQ0.indexOfKey(i14);
                if (iIndexOfKey2 >= 0) {
                    sparseIntArray3.put(i14, sparseIntArrayQ0.valueAt(iIndexOfKey2));
                } else {
                    int i15 = sparseIntArray2.get(i14, -1);
                    if (i15 >= 0 && (iIndexOfKey = sparseIntArrayQ0.indexOfKey(i15)) >= 0) {
                        sparseIntArray3.put(i14, sparseIntArrayQ0.valueAt(iIndexOfKey));
                    }
                }
                i13++;
            } catch (Exception e9) {
                FileLog.e(e9);
                return sparseIntArray3;
            }
        }
    }

    public final long i(int i10) {
        return ((a4) this.f22784f.get(i10)).a();
    }

    public final f6 j(int i10) {
        return ((a4) this.f22784f.get(i10)).f22710a;
    }

    public final TLRPC.WallPaper k(int i10) {
        a4 a4Var = (a4) this.f22784f.get(i10);
        TLRPC.ThemeSettings themeSettingsB = a4Var.b(a4Var.d);
        if (themeSettingsB != null) {
            return themeSettingsB.wallpaper;
        }
        return null;
    }

    public final void l() {
        h(0, 0);
        h(0, 1);
    }

    public final boolean m() {
        return this.f22780a || this.f22781b;
    }

    public final void n(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f22784f;
            if (i11 >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i11) != null) {
                SparseIntArray sparseIntArrayH = h(i10, i11);
                ((a4) arrayList.get(i11)).h = g(sparseIntArrayH, g6.f23305ra);
                ((a4) arrayList.get(i11)).f22716i = g(sparseIntArrayH, g6.Aa);
                ((a4) arrayList.get(i11)).f22717j = g(sparseIntArrayH, g6.Oh);
                ((a4) arrayList.get(i11)).f22718k = sparseIntArrayH.get(g6.Nd, 0);
                ((a4) arrayList.get(i11)).f22719l = sparseIntArrayH.get(g6.Od, 0);
                ((a4) arrayList.get(i11)).f22720m = sparseIntArrayH.get(g6.Pd, 0);
                ((a4) arrayList.get(i11)).f22721n = sparseIntArrayH.get(g6.Qd, 0);
                ((a4) arrayList.get(i11)).f22722o = sparseIntArrayH.get(g6.Rd, 0);
                if (((a4) arrayList.get(i11)).f22710a != null && ((a4) arrayList.get(i11)).f22710a.m().equals("Blue")) {
                    if ((((a4) arrayList.get(i11)).f22713e >= 0 ? ((a4) arrayList.get(i11)).f22713e : ((a4) arrayList.get(i11)).f22710a.U) == 99) {
                        ((a4) arrayList.get(i11)).f22718k = -2368069;
                        ((a4) arrayList.get(i11)).f22719l = -9722489;
                        ((a4) arrayList.get(i11)).f22720m = -2762611;
                        ((a4) arrayList.get(i11)).f22721n = -7817084;
                    }
                }
            }
            i11++;
        }
    }

    public final void o(int i10, ResultCallback resultCallback) {
        TLRPC.WallPaper wallPaperK = k(i10);
        if (wallPaperK == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        long jI = i(i10);
        long j10 = wallPaperK.f22532id;
        b9 b9Var = new b9(resultCallback, jI, 1);
        boolean z10 = wallPaperK.pattern;
        int i11 = this.f22785g;
        ChatThemeController.getInstance(i11).loadWallpaperBitmap(j10, z10 ? 1 : 0, new z3(b9Var, wallPaperK, z10 ? 1 : 0, i11, j10));
    }

    public final void p(int i10, ResultCallback resultCallback) {
        TLRPC.WallPaper wallPaperK = k(i10);
        if (wallPaperK != null) {
            long jI = i(i10);
            if (jI != 0) {
                Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.f22785g).getWallpaperThumbBitmap(jI);
                File file = new File(ApplicationLoader.getFilesDirFixed(), com.google.android.recaptcha.internal.a.m(jI, "wallpaper_thumb_", ".png"));
                if (wallpaperThumbBitmap == null && file.exists() && file.length() > 0) {
                    try {
                        wallpaperThumbBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
                if (wallpaperThumbBitmap != null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(jI), wallpaperThumbBitmap));
                        return;
                    }
                    return;
                }
                TLRPC.Document document = wallPaperK.document;
                if (document == null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(jI), null));
                        return;
                    }
                    return;
                } else {
                    ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 140), wallPaperK.document);
                    ImageReceiver imageReceiver = new ImageReceiver();
                    imageReceiver.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                    imageReceiver.setDelegate(new c3.f(resultCallback, jI, file, 6));
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    return;
                }
            }
            if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        } else if (resultCallback != null) {
            resultCallback.onComplete(null);
        }
    }

    public b4(int i10, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f22784f = arrayList;
        this.f22785g = i10;
        this.f22780a = false;
        String str = tL_theme.emoticon;
        this.f22783e = str;
        this.f22782c = new of.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        a4 a4Var = new a4();
        a4Var.f22711b = tL_theme;
        a4Var.d = 0;
        arrayList.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.f22711b = tL_theme;
        a4Var2.d = 1;
        arrayList.add(a4Var2);
    }

    public b4(int i10, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f22784f = arrayList;
        this.f22785g = i10;
        this.f22780a = false;
        this.f22783e = tL_chatThemeUniqueGift.gift.slug;
        this.f22782c = of.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        a4 a4Var = new a4();
        a4Var.f22712c = tL_chatThemeUniqueGift;
        a4Var.d = 0;
        arrayList.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.f22712c = tL_chatThemeUniqueGift;
        a4Var2.d = 1;
        arrayList.add(a4Var2);
    }
}
