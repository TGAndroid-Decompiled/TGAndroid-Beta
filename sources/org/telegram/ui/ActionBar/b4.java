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
import nh.q8;
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
    public static final int[] h = {g6.f23313ra, g6.Aa, g6.Oh, g6.Nd, g6.Od, g6.Pd, g6.Qd, g6.Rd};
    public boolean f22762a;
    public boolean f22763b;
    public qf.b f22764c;
    public TLRPC.ChatTheme d;
    public String f22765e;
    public final ArrayList f22766f;
    public final int f22767g;

    public b4(int i10) {
        this.f22766f = new ArrayList();
        this.f22767g = i10;
    }

    public static b4 a(int i10) {
        b4 b4Var = new b4(i10);
        b4Var.f22765e = "❌";
        b4Var.f22764c = qf.b.d("❌");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        b4Var.f22763b = true;
        a4 a4Var = new a4();
        a4Var.f22730a = e(true);
        b4Var.f22766f.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.f22730a = e(false);
        b4Var.f22766f.add(a4Var2);
        return b4Var;
    }

    public static b4 c(int i10) {
        b4 b4Var = new b4(i10);
        b4Var.f22765e = "🏠";
        b4Var.f22764c = qf.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.f22765e);
        a4 a4Var = new a4();
        a4Var.f22730a = g6.N0("Blue");
        a4Var.f22733e = 99;
        b4Var.f22766f.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.f22730a = g6.N0("Day");
        a4Var2.f22733e = 9;
        b4Var.f22766f.add(a4Var2);
        a4 a4Var3 = new a4();
        a4Var3.f22730a = g6.N0("Night");
        a4Var3.f22733e = 0;
        b4Var.f22766f.add(a4Var3);
        a4 a4Var4 = new a4();
        a4Var4.f22730a = g6.N0("Dark Blue");
        a4Var4.f22733e = 0;
        b4Var.f22766f.add(a4Var4);
        return b4Var;
    }

    public static b4 d(int i10, TLRPC.TL_theme tL_theme) {
        b4 b4Var = new b4(i10);
        String str = tL_theme.emoticon;
        b4Var.f22765e = str;
        b4Var.f22764c = new qf.b(str, null);
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i11 = 0; i11 < tL_theme.settings.size(); i11++) {
            a4 a4Var = new a4();
            a4Var.f22731b = tL_theme;
            a4Var.d = i11;
            b4Var.f22766f.add(a4Var);
        }
        return b4Var;
    }

    public static f6 e(boolean z10) {
        f6 A0;
        String string;
        if (z10) {
            A0 = g6.J;
        } else {
            A0 = g6.A0();
        }
        if (z10 != A0.q()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            String str = "Blue";
            if (z10) {
                string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            } else {
                string = sharedPreferences.getString("lastDayTheme", "Blue");
            }
            A0 = g6.N0(string);
            if (A0 == null) {
                if (z10) {
                    str = "Dark Blue";
                }
                A0 = g6.N0(str);
            }
        }
        return new f6(A0);
    }

    public static int g(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null) {
            return g6.C0(i10);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i10);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return g6.C0(i10);
    }

    public static void q(f6 f6Var, int i10) {
        String str;
        String str2;
        SparseArray sparseArray;
        e6 e6Var;
        if (f6Var != null) {
            if (i10 < 0 || (sparseArray = f6Var.W) == null || ((e6Var = (e6) sparseArray.get(i10)) != null && !e6Var.f22924z)) {
                if (!f6Var.m().equals("Blue") || i10 != 99) {
                    if (!f6Var.m().equals("Day") || i10 != 9) {
                        if (!f6Var.m().equals("Night") || i10 != 0) {
                            if (f6Var.m().equals("Dark Blue") && i10 == 0) {
                                return;
                            }
                            boolean q6 = f6Var.q();
                            if (q6) {
                                str = "lastDarkCustomTheme";
                            } else {
                                str = "lastDayCustomTheme";
                            }
                            if (q6) {
                                str2 = "lastDarkCustomThemeAccentId";
                            } else {
                                str2 = "lastDayCustomThemeAccentId";
                            }
                            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().putString(str, f6Var.m()).putInt(str2, i10).apply();
                        }
                    }
                }
            }
        }
    }

    public final SparseIntArray b(int i10, int i11) {
        e6 e6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        f6 f6Var;
        f6 j10 = j(i11);
        ArrayList arrayList = this.f22766f;
        if (j10 == null) {
            int i12 = ((a4) arrayList.get(i11)).d;
            a4 a4Var = (a4) ((qf.a) arrayList.get(i11));
            TLRPC.ThemeSettings b10 = a4Var.b(i12);
            TLRPC.TL_theme tL_theme = ((a4) arrayList.get(i11)).f22731b;
            f6 f6Var2 = new f6(g6.N0(g6.q0(b10)));
            e6Var = f6Var2.e(a4Var.a(), b10, tL_theme, i10, true);
            f6Var2.u(e6Var.f22902a);
            j10 = f6Var2;
        } else {
            SparseArray sparseArray = j10.W;
            if (sparseArray != null) {
                e6Var = (e6) sparseArray.get(((a4) arrayList.get(i11)).f22733e);
            } else {
                e6Var = null;
            }
        }
        String[] strArr = new String[1];
        if (j10.f22943b != null) {
            sparseIntArray = g6.Q0(new File(j10.f22943b), null, strArr);
        } else {
            String str = j10.d;
            if (str != null) {
                sparseIntArray = g6.Q0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        ((a4) arrayList.get(i11)).f22735g = strArr[0];
        if (e6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            e6Var.c(sparseIntArray, clone);
            qf.b bVar = this.f22764c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f46660b) && (f6Var = e6Var.f22903b) != null && f6Var.f22943b == null && !f6Var.q()) {
                e6.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray2 = g6.ol;
        for (int i13 = 0; i13 < sparseIntArray2.size(); i13++) {
            int keyAt = sparseIntArray2.keyAt(i13);
            int valueAt = sparseIntArray2.valueAt(i13);
            if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey));
            }
        }
        int[] iArr = g6.nl;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            if (sparseIntArray.indexOfKey(i14) < 0) {
                sparseIntArray.put(i14, iArr[i14]);
            }
        }
        return sparseIntArray;
    }

    public final TLRPC.Document f() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return kf.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return MediaDataController.getInstance(this.f22767g).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray h(int i10, int i11) {
        e6 e6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        f6 f6Var;
        f6 N0;
        e6 e6Var2;
        ArrayList arrayList = this.f22766f;
        SparseIntArray sparseIntArray2 = ((a4) arrayList.get(i11)).f22734f;
        if (sparseIntArray2 != null) {
            return sparseIntArray2;
        }
        f6 j10 = j(i11);
        if (j10 == null) {
            int i12 = ((a4) arrayList.get(i11)).d;
            qf.a aVar = (qf.a) arrayList.get(i11);
            TLRPC.TL_theme tL_theme = ((a4) arrayList.get(i11)).f22731b;
            if (aVar != null) {
                N0 = g6.N0(g6.q0(((a4) aVar).b(i12)));
            } else {
                N0 = g6.N0("Blue");
            }
            if (N0 != null) {
                f6 f6Var2 = new f6(N0);
                if (aVar != null) {
                    a4 a4Var = (a4) aVar;
                    e6Var2 = f6Var2.e(a4Var.a(), a4Var.b(i12), tL_theme, i10, true);
                } else {
                    e6Var2 = null;
                }
                if (e6Var2 != null) {
                    f6Var2.u(e6Var2.f22902a);
                }
                e6Var = e6Var2;
                j10 = f6Var2;
            }
            e6Var = null;
        } else {
            SparseArray sparseArray = j10.W;
            if (sparseArray != null) {
                e6Var = (e6) sparseArray.get(((a4) arrayList.get(i11)).f22733e);
            }
            e6Var = null;
        }
        if (j10 == null) {
            return sparseIntArray2;
        }
        String[] strArr = new String[1];
        if (j10.f22943b != null) {
            sparseIntArray = g6.Q0(new File(j10.f22943b), null, strArr);
        } else {
            String str = j10.d;
            if (str != null) {
                sparseIntArray = g6.Q0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        int i13 = 0;
        ((a4) arrayList.get(i11)).f22735g = strArr[0];
        if (e6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            e6Var.c(sparseIntArray, clone);
            qf.b bVar = this.f22764c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f46660b) && (f6Var = e6Var.f22903b) != null && f6Var.f22943b == null && !f6Var.q()) {
                e6.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray3 = g6.ol;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        ((a4) arrayList.get(i11)).f22734f = sparseIntArray4;
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
                FileLog.e(e10);
                return sparseIntArray4;
            }
        }
    }

    public final long i(int i10) {
        return ((a4) this.f22766f.get(i10)).a();
    }

    public final f6 j(int i10) {
        return ((a4) this.f22766f.get(i10)).f22730a;
    }

    public final TLRPC.WallPaper k(int i10) {
        a4 a4Var = (a4) this.f22766f.get(i10);
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
        if (!this.f22762a && !this.f22763b) {
            return false;
        }
        return true;
    }

    public final void n(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f22766f;
            if (i12 < arrayList.size()) {
                if (arrayList.get(i12) != null) {
                    SparseIntArray h10 = h(i10, i12);
                    ((a4) arrayList.get(i12)).h = g(h10, g6.f23313ra);
                    ((a4) arrayList.get(i12)).f22736i = g(h10, g6.Aa);
                    ((a4) arrayList.get(i12)).f22737j = g(h10, g6.Oh);
                    ((a4) arrayList.get(i12)).f22738k = h10.get(g6.Nd, 0);
                    ((a4) arrayList.get(i12)).f22739l = h10.get(g6.Od, 0);
                    ((a4) arrayList.get(i12)).f22740m = h10.get(g6.Pd, 0);
                    ((a4) arrayList.get(i12)).f22741n = h10.get(g6.Qd, 0);
                    ((a4) arrayList.get(i12)).f22742o = h10.get(g6.Rd, 0);
                    if (((a4) arrayList.get(i12)).f22730a != null && ((a4) arrayList.get(i12)).f22730a.m().equals("Blue")) {
                        if (((a4) arrayList.get(i12)).f22733e >= 0) {
                            i11 = ((a4) arrayList.get(i12)).f22733e;
                        } else {
                            i11 = ((a4) arrayList.get(i12)).f22730a.U;
                        }
                        if (i11 == 99) {
                            ((a4) arrayList.get(i12)).f22738k = -2368069;
                            ((a4) arrayList.get(i12)).f22739l = -9722489;
                            ((a4) arrayList.get(i12)).f22740m = -2762611;
                            ((a4) arrayList.get(i12)).f22741n = -7817084;
                        }
                    }
                }
                i12++;
            } else {
                return;
            }
        }
    }

    public final void o(int i10, ResultCallback resultCallback) {
        TLRPC.WallPaper k9 = k(i10);
        if (k9 == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        long i11 = i(i10);
        long j10 = k9.f22544id;
        q8 q8Var = new q8(resultCallback, i11, 1);
        boolean z10 = k9.pattern;
        int i12 = this.f22767g;
        ChatThemeController.getInstance(i12).loadWallpaperBitmap(j10, z10 ? 1 : 0, new z3(q8Var, k9, z10 ? 1 : 0, i12, j10));
    }

    public final void p(int i10, ResultCallback resultCallback) {
        TLRPC.WallPaper k9 = k(i10);
        if (k9 == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        } else {
            long i11 = i(i10);
            if (i11 == 0) {
                if (resultCallback != null) {
                    resultCallback.onComplete(null);
                }
            } else {
                Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.f22767g).getWallpaperThumbBitmap(i11);
                File file = new File(ApplicationLoader.getFilesDirFixed(), com.google.android.recaptcha.internal.a.l(i11, "wallpaper_thumb_", ".png"));
                if (wallpaperThumbBitmap == null && file.exists() && file.length() > 0) {
                    try {
                        wallpaperThumbBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (wallpaperThumbBitmap != null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(i11), wallpaperThumbBitmap));
                        return;
                    }
                    return;
                }
                TLRPC.Document document = k9.document;
                if (document == null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(i11), null));
                        return;
                    }
                    return;
                }
                ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 140), k9.document);
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setAllowLoadingOnAttachedOnly(false);
                imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                imageReceiver.setDelegate(new d9.a(resultCallback, i11, file, 6));
                ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
            }
        }
    }

    public b4(int i10, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f22766f = arrayList;
        this.f22767g = i10;
        this.f22762a = false;
        String str = tL_theme.emoticon;
        this.f22765e = str;
        this.f22764c = new qf.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        a4 a4Var = new a4();
        a4Var.f22731b = tL_theme;
        a4Var.d = 0;
        arrayList.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.f22731b = tL_theme;
        a4Var2.d = 1;
        arrayList.add(a4Var2);
    }

    public b4(int i10, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f22766f = arrayList;
        this.f22767g = i10;
        this.f22762a = false;
        this.f22765e = tL_chatThemeUniqueGift.gift.slug;
        this.f22764c = qf.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        a4 a4Var = new a4();
        a4Var.f22732c = tL_chatThemeUniqueGift;
        a4Var.d = 0;
        arrayList.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.f22732c = tL_chatThemeUniqueGift;
        a4Var2.d = 1;
        arrayList.add(a4Var2);
    }
}
