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
public final class f4 {
    public static final int[] h = {k6.f21918ra, k6.Aa, k6.Oh, k6.Nd, k6.Od, k6.Pd, k6.Qd, k6.Rd};
    public boolean f21360a;
    public boolean f21361b;
    public tf.b f21362c;
    public TLRPC.ChatTheme d;
    public String f21363e;
    public final ArrayList f21364f;
    public final int f21365g;

    public f4(int i10) {
        this.f21364f = new ArrayList();
        this.f21365g = i10;
    }

    public static f4 a(int i10) {
        f4 f4Var = new f4(i10);
        f4Var.f21363e = "❌";
        f4Var.f21362c = tf.b.d("❌");
        f4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        f4Var.f21361b = true;
        e4 e4Var = new e4();
        e4Var.f21312a = e(true);
        f4Var.f21364f.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.f21312a = e(false);
        f4Var.f21364f.add(e4Var2);
        return f4Var;
    }

    public static f4 c(int i10) {
        f4 f4Var = new f4(i10);
        f4Var.f21363e = "🏠";
        f4Var.f21362c = tf.b.d("🏠");
        f4Var.d = TLRPC.ChatTheme.ofEmoticon(f4Var.f21363e);
        e4 e4Var = new e4();
        e4Var.f21312a = k6.N0("Blue");
        e4Var.f21315e = 99;
        f4Var.f21364f.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.f21312a = k6.N0("Day");
        e4Var2.f21315e = 9;
        f4Var.f21364f.add(e4Var2);
        e4 e4Var3 = new e4();
        e4Var3.f21312a = k6.N0("Night");
        e4Var3.f21315e = 0;
        f4Var.f21364f.add(e4Var3);
        e4 e4Var4 = new e4();
        e4Var4.f21312a = k6.N0("Dark Blue");
        e4Var4.f21315e = 0;
        f4Var.f21364f.add(e4Var4);
        return f4Var;
    }

    public static f4 d(int i10, TLRPC.TL_theme tL_theme) {
        f4 f4Var = new f4(i10);
        String str = tL_theme.emoticon;
        f4Var.f21363e = str;
        f4Var.f21362c = new tf.b(str, null);
        f4Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i11 = 0; i11 < tL_theme.settings.size(); i11++) {
            e4 e4Var = new e4();
            e4Var.f21313b = tL_theme;
            e4Var.d = i11;
            f4Var.f21364f.add(e4Var);
        }
        return f4Var;
    }

    public static j6 e(boolean z4) {
        j6 A0;
        String string;
        if (z4) {
            A0 = k6.J;
        } else {
            A0 = k6.A0();
        }
        if (z4 != A0.q()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            String str = "Blue";
            if (z4) {
                string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            } else {
                string = sharedPreferences.getString("lastDayTheme", "Blue");
            }
            A0 = k6.N0(string);
            if (A0 == null) {
                if (z4) {
                    str = "Dark Blue";
                }
                A0 = k6.N0(str);
            }
        }
        return new j6(A0);
    }

    public static int g(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null) {
            return k6.C0(i10);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i10);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        return k6.C0(i10);
    }

    public static void q(j6 j6Var, int i10) {
        String str;
        String str2;
        SparseArray sparseArray;
        i6 i6Var;
        if (j6Var != null) {
            if (i10 < 0 || (sparseArray = j6Var.X) == null || ((i6Var = (i6) sparseArray.get(i10)) != null && !i6Var.f21491z)) {
                if (!j6Var.m().equals("Blue") || i10 != 99) {
                    if (!j6Var.m().equals("Day") || i10 != 9) {
                        if (!j6Var.m().equals("Night") || i10 != 0) {
                            if (j6Var.m().equals("Dark Blue") && i10 == 0) {
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
                            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().putString(str, j6Var.m()).putInt(str2, i10).apply();
                        }
                    }
                }
            }
        }
    }

    public final SparseIntArray b(int i10, int i11) {
        i6 i6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        j6 j6Var;
        j6 j10 = j(i11);
        ArrayList arrayList = this.f21364f;
        if (j10 == null) {
            int i12 = ((e4) arrayList.get(i11)).d;
            e4 e4Var = (e4) ((tf.a) arrayList.get(i11));
            TLRPC.ThemeSettings b10 = e4Var.b(i12);
            TLRPC.TL_theme tL_theme = ((e4) arrayList.get(i11)).f21313b;
            j6 j6Var2 = new j6(k6.N0(k6.q0(b10)));
            i6Var = j6Var2.e(e4Var.a(), b10, tL_theme, i10, true);
            j6Var2.u(i6Var.f21469a);
            j10 = j6Var2;
        } else {
            SparseArray sparseArray = j10.X;
            if (sparseArray != null) {
                i6Var = (i6) sparseArray.get(((e4) arrayList.get(i11)).f21315e);
            } else {
                i6Var = null;
            }
        }
        String[] strArr = new String[1];
        if (j10.f21507b != null) {
            sparseIntArray = k6.Q0(new File(j10.f21507b), null, strArr);
        } else {
            String str = j10.d;
            if (str != null) {
                sparseIntArray = k6.Q0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        ((e4) arrayList.get(i11)).f21317g = strArr[0];
        if (i6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            i6Var.c(sparseIntArray, clone);
            tf.b bVar = this.f21362c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f48115b) && (j6Var = i6Var.f21470b) != null && j6Var.f21507b == null && !j6Var.q()) {
                i6.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray2 = k6.ol;
        for (int i13 = 0; i13 < sparseIntArray2.size(); i13++) {
            int keyAt = sparseIntArray2.keyAt(i13);
            int valueAt = sparseIntArray2.valueAt(i13);
            if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey));
            }
        }
        int[] iArr = k6.nl;
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
            return mf.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return MediaDataController.getInstance(this.f21365g).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray h(int i10, int i11) {
        i6 i6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        j6 j6Var;
        j6 N0;
        i6 i6Var2;
        ArrayList arrayList = this.f21364f;
        SparseIntArray sparseIntArray2 = ((e4) arrayList.get(i11)).f21316f;
        if (sparseIntArray2 != null) {
            return sparseIntArray2;
        }
        j6 j10 = j(i11);
        if (j10 == null) {
            int i12 = ((e4) arrayList.get(i11)).d;
            tf.a aVar = (tf.a) arrayList.get(i11);
            TLRPC.TL_theme tL_theme = ((e4) arrayList.get(i11)).f21313b;
            if (aVar != null) {
                N0 = k6.N0(k6.q0(((e4) aVar).b(i12)));
            } else {
                N0 = k6.N0("Blue");
            }
            if (N0 != null) {
                j6 j6Var2 = new j6(N0);
                if (aVar != null) {
                    e4 e4Var = (e4) aVar;
                    i6Var2 = j6Var2.e(e4Var.a(), e4Var.b(i12), tL_theme, i10, true);
                } else {
                    i6Var2 = null;
                }
                if (i6Var2 != null) {
                    j6Var2.u(i6Var2.f21469a);
                }
                i6Var = i6Var2;
                j10 = j6Var2;
            }
            i6Var = null;
        } else {
            SparseArray sparseArray = j10.X;
            if (sparseArray != null) {
                i6Var = (i6) sparseArray.get(((e4) arrayList.get(i11)).f21315e);
            }
            i6Var = null;
        }
        if (j10 == null) {
            return sparseIntArray2;
        }
        String[] strArr = new String[1];
        if (j10.f21507b != null) {
            sparseIntArray = k6.Q0(new File(j10.f21507b), null, strArr);
        } else {
            String str = j10.d;
            if (str != null) {
                sparseIntArray = k6.Q0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        int i13 = 0;
        ((e4) arrayList.get(i11)).f21317g = strArr[0];
        if (i6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            i6Var.c(sparseIntArray, clone);
            tf.b bVar = this.f21362c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f48115b) && (j6Var = i6Var.f21470b) != null && j6Var.f21507b == null && !j6Var.q()) {
                i6.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray3 = k6.ol;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        ((e4) arrayList.get(i11)).f21316f = sparseIntArray4;
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
            } catch (Exception e6) {
                FileLog.e(e6);
                return sparseIntArray4;
            }
        }
    }

    public final long i(int i10) {
        return ((e4) this.f21364f.get(i10)).a();
    }

    public final j6 j(int i10) {
        return ((e4) this.f21364f.get(i10)).f21312a;
    }

    public final TLRPC.WallPaper k(int i10) {
        e4 e4Var = (e4) this.f21364f.get(i10);
        TLRPC.ThemeSettings b10 = e4Var.b(e4Var.d);
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
        if (!this.f21360a && !this.f21361b) {
            return false;
        }
        return true;
    }

    public final void n(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f21364f;
            if (i12 < arrayList.size()) {
                if (arrayList.get(i12) != null) {
                    SparseIntArray h9 = h(i10, i12);
                    ((e4) arrayList.get(i12)).h = g(h9, k6.f21918ra);
                    ((e4) arrayList.get(i12)).f21318i = g(h9, k6.Aa);
                    ((e4) arrayList.get(i12)).f21319j = g(h9, k6.Oh);
                    ((e4) arrayList.get(i12)).f21320k = h9.get(k6.Nd, 0);
                    ((e4) arrayList.get(i12)).f21321l = h9.get(k6.Od, 0);
                    ((e4) arrayList.get(i12)).f21322m = h9.get(k6.Pd, 0);
                    ((e4) arrayList.get(i12)).f21323n = h9.get(k6.Qd, 0);
                    ((e4) arrayList.get(i12)).f21324o = h9.get(k6.Rd, 0);
                    if (((e4) arrayList.get(i12)).f21312a != null && ((e4) arrayList.get(i12)).f21312a.m().equals("Blue")) {
                        if (((e4) arrayList.get(i12)).f21315e >= 0) {
                            i11 = ((e4) arrayList.get(i12)).f21315e;
                        } else {
                            i11 = ((e4) arrayList.get(i12)).f21312a.V;
                        }
                        if (i11 == 99) {
                            ((e4) arrayList.get(i12)).f21320k = -2368069;
                            ((e4) arrayList.get(i12)).f21321l = -9722489;
                            ((e4) arrayList.get(i12)).f21322m = -2762611;
                            ((e4) arrayList.get(i12)).f21323n = -7817084;
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
        TLRPC.WallPaper k10 = k(i10);
        if (k10 == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        long i11 = i(i10);
        long j10 = k10.f20997id;
        b4 b4Var = new b4(resultCallback, i11, 0);
        boolean z4 = k10.pattern;
        int i12 = this.f21365g;
        ChatThemeController.getInstance(i12).loadWallpaperBitmap(j10, z4 ? 1 : 0, new c4(b4Var, k10, z4 ? 1 : 0, i12, j10));
    }

    public final void p(int i10, ResultCallback resultCallback) {
        TLRPC.WallPaper k10 = k(i10);
        if (k10 == null) {
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
                Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.f21365g).getWallpaperThumbBitmap(i11);
                File file = new File(ApplicationLoader.getFilesDirFixed(), e2.c.i(i11, "wallpaper_thumb_", ".png"));
                if (wallpaperThumbBitmap == null && file.exists() && file.length() > 0) {
                    try {
                        wallpaperThumbBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                if (wallpaperThumbBitmap != null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(i11), wallpaperThumbBitmap));
                        return;
                    }
                    return;
                }
                TLRPC.Document document = k10.document;
                if (document == null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(i11), null));
                        return;
                    }
                    return;
                }
                ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 140), k10.document);
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setAllowLoadingOnAttachedOnly(false);
                imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                imageReceiver.setDelegate(new e3.f(resultCallback, i11, file, 5));
                ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
            }
        }
    }

    public f4(int i10, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f21364f = arrayList;
        this.f21365g = i10;
        this.f21360a = false;
        String str = tL_theme.emoticon;
        this.f21363e = str;
        this.f21362c = new tf.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        e4 e4Var = new e4();
        e4Var.f21313b = tL_theme;
        e4Var.d = 0;
        arrayList.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.f21313b = tL_theme;
        e4Var2.d = 1;
        arrayList.add(e4Var2);
    }

    public f4(int i10, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f21364f = arrayList;
        this.f21365g = i10;
        this.f21360a = false;
        this.f21363e = tL_chatThemeUniqueGift.gift.slug;
        this.f21362c = tf.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        e4 e4Var = new e4();
        e4Var.f21314c = tL_chatThemeUniqueGift;
        e4Var.d = 0;
        arrayList.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.f21314c = tL_chatThemeUniqueGift;
        e4Var2.d = 1;
        arrayList.add(e4Var2);
    }
}
