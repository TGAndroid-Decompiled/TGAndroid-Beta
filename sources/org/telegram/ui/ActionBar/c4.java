package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import ci.o9;
import ci.p9;
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
public final class c4 {
    public static final int[] h = {i6.f21081ra, i6.Aa, i6.Oh, i6.Nd, i6.Od, i6.Pd, i6.Qd, i6.Rd};
    public boolean f20499a;
    public boolean f20500b;
    public fg.b f20501c;
    public TLRPC.ChatTheme d;
    public String f20502e;
    public final ArrayList f20503f;
    public final int f20504g;

    public c4(int i10) {
        this.f20503f = new ArrayList();
        this.f20504g = i10;
    }

    public static c4 a(int i10) {
        c4 c4Var = new c4(i10);
        c4Var.f20502e = "❌";
        c4Var.f20501c = fg.b.d("❌");
        c4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        c4Var.f20500b = true;
        b4 b4Var = new b4();
        b4Var.f20449a = e(true);
        c4Var.f20503f.add(b4Var);
        b4 b4Var2 = new b4();
        b4Var2.f20449a = e(false);
        c4Var.f20503f.add(b4Var2);
        return c4Var;
    }

    public static c4 c(int i10) {
        c4 c4Var = new c4(i10);
        c4Var.f20502e = "🏠";
        c4Var.f20501c = fg.b.d("🏠");
        c4Var.d = TLRPC.ChatTheme.ofEmoticon(c4Var.f20502e);
        b4 b4Var = new b4();
        b4Var.f20449a = i6.N0("Blue");
        b4Var.f20452e = 99;
        c4Var.f20503f.add(b4Var);
        b4 b4Var2 = new b4();
        b4Var2.f20449a = i6.N0("Day");
        b4Var2.f20452e = 9;
        c4Var.f20503f.add(b4Var2);
        b4 b4Var3 = new b4();
        b4Var3.f20449a = i6.N0("Night");
        b4Var3.f20452e = 0;
        c4Var.f20503f.add(b4Var3);
        b4 b4Var4 = new b4();
        b4Var4.f20449a = i6.N0("Dark Blue");
        b4Var4.f20452e = 0;
        c4Var.f20503f.add(b4Var4);
        return c4Var;
    }

    public static c4 d(int i10, TLRPC.TL_theme tL_theme) {
        c4 c4Var = new c4(i10);
        String str = tL_theme.emoticon;
        c4Var.f20502e = str;
        c4Var.f20501c = new fg.b(str, null);
        c4Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i11 = 0; i11 < tL_theme.settings.size(); i11++) {
            b4 b4Var = new b4();
            b4Var.f20450b = tL_theme;
            b4Var.d = i11;
            c4Var.f20503f.add(b4Var);
        }
        return c4Var;
    }

    public static h6 e(boolean z10) {
        h6 A0;
        String string;
        if (z10) {
            A0 = i6.J;
        } else {
            A0 = i6.A0();
        }
        if (z10 != A0.q()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            String str = "Blue";
            if (z10) {
                string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            } else {
                string = sharedPreferences.getString("lastDayTheme", "Blue");
            }
            A0 = i6.N0(string);
            if (A0 == null) {
                if (z10) {
                    str = "Dark Blue";
                }
                A0 = i6.N0(str);
            }
        }
        return new h6(A0);
    }

    public static int g(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null) {
            return i6.C0(i10);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i10);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        return i6.C0(i10);
    }

    public static void q(h6 h6Var, int i10) {
        String str;
        String str2;
        SparseArray sparseArray;
        f6 f6Var;
        if (h6Var != null) {
            if (i10 < 0 || (sparseArray = h6Var.f20688a0) == null || ((f6Var = (f6) sparseArray.get(i10)) != null && !f6Var.f20632z)) {
                if (!h6Var.m().equals("Blue") || i10 != 99) {
                    if (!h6Var.m().equals("Day") || i10 != 9) {
                        if (!h6Var.m().equals("Night") || i10 != 0) {
                            if (h6Var.m().equals("Dark Blue") && i10 == 0) {
                                return;
                            }
                            boolean q6 = h6Var.q();
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
                            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().putString(str, h6Var.m()).putInt(str2, i10).apply();
                        }
                    }
                }
            }
        }
    }

    public final SparseIntArray b(int i10, int i11) {
        f6 f6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        h6 h6Var;
        h6 j3 = j(i11);
        ArrayList arrayList = this.f20503f;
        if (j3 == null) {
            int i12 = ((b4) arrayList.get(i11)).d;
            b4 b4Var = (b4) ((fg.a) arrayList.get(i11));
            TLRPC.ThemeSettings b10 = b4Var.b(i12);
            TLRPC.TL_theme tL_theme = ((b4) arrayList.get(i11)).f20450b;
            h6 h6Var2 = new h6(i6.N0(i6.q0(b10)));
            f6Var = h6Var2.e(b4Var.a(), b10, tL_theme, i10, true);
            h6Var2.u(f6Var.f20610a);
            j3 = h6Var2;
        } else {
            SparseArray sparseArray = j3.f20688a0;
            if (sparseArray != null) {
                f6Var = (f6) sparseArray.get(((b4) arrayList.get(i11)).f20452e);
            } else {
                f6Var = null;
            }
        }
        String[] strArr = new String[1];
        if (j3.f20689b != null) {
            sparseIntArray = i6.Q0(new File(j3.f20689b), null, strArr);
        } else {
            String str = j3.d;
            if (str != null) {
                sparseIntArray = i6.Q0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        ((b4) arrayList.get(i11)).f20454g = strArr[0];
        if (f6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            f6Var.c(sparseIntArray, clone);
            fg.b bVar = this.f20501c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f9849b) && (h6Var = f6Var.f20611b) != null && h6Var.f20689b == null && !h6Var.q()) {
                f6.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray2 = i6.ol;
        for (int i13 = 0; i13 < sparseIntArray2.size(); i13++) {
            int keyAt = sparseIntArray2.keyAt(i13);
            int valueAt = sparseIntArray2.valueAt(i13);
            if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey));
            }
        }
        int[] iArr = i6.nl;
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
            return zf.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return MediaDataController.getInstance(this.f20504g).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray h(int i10, int i11) {
        f6 f6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        h6 h6Var;
        h6 N0;
        f6 f6Var2;
        ArrayList arrayList = this.f20503f;
        SparseIntArray sparseIntArray2 = ((b4) arrayList.get(i11)).f20453f;
        if (sparseIntArray2 != null) {
            return sparseIntArray2;
        }
        h6 j3 = j(i11);
        if (j3 == null) {
            int i12 = ((b4) arrayList.get(i11)).d;
            fg.a aVar = (fg.a) arrayList.get(i11);
            TLRPC.TL_theme tL_theme = ((b4) arrayList.get(i11)).f20450b;
            if (aVar != null) {
                N0 = i6.N0(i6.q0(((b4) aVar).b(i12)));
            } else {
                N0 = i6.N0("Blue");
            }
            if (N0 != null) {
                h6 h6Var2 = new h6(N0);
                if (aVar != null) {
                    b4 b4Var = (b4) aVar;
                    f6Var2 = h6Var2.e(b4Var.a(), b4Var.b(i12), tL_theme, i10, true);
                } else {
                    f6Var2 = null;
                }
                if (f6Var2 != null) {
                    h6Var2.u(f6Var2.f20610a);
                }
                f6Var = f6Var2;
                j3 = h6Var2;
            }
            f6Var = null;
        } else {
            SparseArray sparseArray = j3.f20688a0;
            if (sparseArray != null) {
                f6Var = (f6) sparseArray.get(((b4) arrayList.get(i11)).f20452e);
            }
            f6Var = null;
        }
        if (j3 == null) {
            return sparseIntArray2;
        }
        String[] strArr = new String[1];
        if (j3.f20689b != null) {
            sparseIntArray = i6.Q0(new File(j3.f20689b), null, strArr);
        } else {
            String str = j3.d;
            if (str != null) {
                sparseIntArray = i6.Q0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        int i13 = 0;
        ((b4) arrayList.get(i11)).f20454g = strArr[0];
        if (f6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            f6Var.c(sparseIntArray, clone);
            fg.b bVar = this.f20501c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f9849b) && (h6Var = f6Var.f20611b) != null && h6Var.f20689b == null && !h6Var.q()) {
                f6.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray3 = i6.ol;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        ((b4) arrayList.get(i11)).f20453f = sparseIntArray4;
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
            } catch (Exception e7) {
                FileLog.e(e7);
                return sparseIntArray4;
            }
        }
    }

    public final long i(int i10) {
        return ((b4) this.f20503f.get(i10)).a();
    }

    public final h6 j(int i10) {
        return ((b4) this.f20503f.get(i10)).f20449a;
    }

    public final TLRPC.WallPaper k(int i10) {
        b4 b4Var = (b4) this.f20503f.get(i10);
        TLRPC.ThemeSettings b10 = b4Var.b(b4Var.d);
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
        if (!this.f20499a && !this.f20500b) {
            return false;
        }
        return true;
    }

    public final void n(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f20503f;
            if (i12 < arrayList.size()) {
                if (arrayList.get(i12) != null) {
                    SparseIntArray h10 = h(i10, i12);
                    ((b4) arrayList.get(i12)).h = g(h10, i6.f21081ra);
                    ((b4) arrayList.get(i12)).f20455i = g(h10, i6.Aa);
                    ((b4) arrayList.get(i12)).f20456j = g(h10, i6.Oh);
                    ((b4) arrayList.get(i12)).f20457k = h10.get(i6.Nd, 0);
                    ((b4) arrayList.get(i12)).f20458l = h10.get(i6.Od, 0);
                    ((b4) arrayList.get(i12)).f20459m = h10.get(i6.Pd, 0);
                    ((b4) arrayList.get(i12)).f20460n = h10.get(i6.Qd, 0);
                    ((b4) arrayList.get(i12)).f20461o = h10.get(i6.Rd, 0);
                    if (((b4) arrayList.get(i12)).f20449a != null && ((b4) arrayList.get(i12)).f20449a.m().equals("Blue")) {
                        if (((b4) arrayList.get(i12)).f20452e >= 0) {
                            i11 = ((b4) arrayList.get(i12)).f20452e;
                        } else {
                            i11 = ((b4) arrayList.get(i12)).f20449a.Y;
                        }
                        if (i11 == 99) {
                            ((b4) arrayList.get(i12)).f20457k = -2368069;
                            ((b4) arrayList.get(i12)).f20458l = -9722489;
                            ((b4) arrayList.get(i12)).f20459m = -2762611;
                            ((b4) arrayList.get(i12)).f20460n = -7817084;
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
        long j3 = k10.f20189id;
        o9 o9Var = new o9(resultCallback, i11, 1);
        boolean z10 = k10.pattern;
        int i12 = this.f20504g;
        ChatThemeController.getInstance(i12).loadWallpaperBitmap(j3, z10 ? 1 : 0, new a4(o9Var, k10, z10 ? 1 : 0, i12, j3));
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
                Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.f20504g).getWallpaperThumbBitmap(i11);
                File file = new File(ApplicationLoader.getFilesDirFixed(), org.telegram.ui.Cells.c1.j(i11, "wallpaper_thumb_", ".png"));
                if (wallpaperThumbBitmap == null && file.exists() && file.length() > 0) {
                    try {
                        wallpaperThumbBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
                imageReceiver.setDelegate(new p9(resultCallback, i11, file, 2));
                ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
            }
        }
    }

    public c4(int i10, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f20503f = arrayList;
        this.f20504g = i10;
        this.f20499a = false;
        String str = tL_theme.emoticon;
        this.f20502e = str;
        this.f20501c = new fg.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        b4 b4Var = new b4();
        b4Var.f20450b = tL_theme;
        b4Var.d = 0;
        arrayList.add(b4Var);
        b4 b4Var2 = new b4();
        b4Var2.f20450b = tL_theme;
        b4Var2.d = 1;
        arrayList.add(b4Var2);
    }

    public c4(int i10, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f20503f = arrayList;
        this.f20504g = i10;
        this.f20499a = false;
        this.f20502e = tL_chatThemeUniqueGift.gift.slug;
        this.f20501c = fg.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        b4 b4Var = new b4();
        b4Var.f20451c = tL_chatThemeUniqueGift;
        b4Var.d = 0;
        arrayList.add(b4Var);
        b4 b4Var2 = new b4();
        b4Var2.f20451c = tL_chatThemeUniqueGift;
        b4Var2.d = 1;
        arrayList.add(b4Var2);
    }
}
