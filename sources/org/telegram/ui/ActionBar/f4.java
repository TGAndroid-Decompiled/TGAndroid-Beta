package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import ei.c9;
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
    public static final int[] h = {k6.f21444ra, k6.Aa, k6.Oh, k6.Nd, k6.Od, k6.Pd, k6.Qd, k6.Rd};
    public boolean f20884a;
    public boolean f20885b;
    public gg.b f20886c;
    public TLRPC.ChatTheme d;
    public String e;
    public final ArrayList f20887f;
    public final int f20888g;

    public f4(int i10) {
        this.f20887f = new ArrayList();
        this.f20888g = i10;
    }

    public static f4 a(int i10) {
        f4 f4Var = new f4(i10);
        f4Var.e = "❌";
        f4Var.f20886c = gg.b.d("❌");
        f4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        f4Var.f20885b = true;
        e4 e4Var = new e4();
        e4Var.f20857a = d(true);
        f4Var.f20887f.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.f20857a = d(false);
        f4Var.f20887f.add(e4Var2);
        return f4Var;
    }

    public static f4 b(int i10) {
        f4 f4Var = new f4(i10);
        f4Var.e = "🏠";
        f4Var.f20886c = gg.b.d("🏠");
        f4Var.d = TLRPC.ChatTheme.ofEmoticon(f4Var.e);
        e4 e4Var = new e4();
        e4Var.f20857a = k6.P0("Blue");
        e4Var.e = 99;
        f4Var.f20887f.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.f20857a = k6.P0("Day");
        e4Var2.e = 9;
        f4Var.f20887f.add(e4Var2);
        e4 e4Var3 = new e4();
        e4Var3.f20857a = k6.P0("Night");
        e4Var3.e = 0;
        f4Var.f20887f.add(e4Var3);
        e4 e4Var4 = new e4();
        e4Var4.f20857a = k6.P0("Dark Blue");
        e4Var4.e = 0;
        f4Var.f20887f.add(e4Var4);
        return f4Var;
    }

    public static f4 c(int i10, TLRPC.TL_theme tL_theme) {
        f4 f4Var = new f4(i10);
        String str = tL_theme.emoticon;
        f4Var.e = str;
        f4Var.f20886c = new gg.b(str, null);
        f4Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i11 = 0; i11 < tL_theme.settings.size(); i11++) {
            e4 e4Var = new e4();
            e4Var.f20858b = tL_theme;
            e4Var.d = i11;
            f4Var.f20887f.add(e4Var);
        }
        return f4Var;
    }

    public static j6 d(boolean z10) {
        j6 C0;
        String string;
        if (z10) {
            C0 = k6.J;
        } else {
            C0 = k6.C0();
        }
        if (z10 != C0.q()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            String str = "Blue";
            if (z10) {
                string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            } else {
                string = sharedPreferences.getString("lastDayTheme", "Blue");
            }
            C0 = k6.P0(string);
            if (C0 == null) {
                if (z10) {
                    str = "Dark Blue";
                }
                C0 = k6.P0(str);
            }
        }
        return new j6(C0);
    }

    public static int f(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null) {
            return k6.E0(i10);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i10);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return k6.E0(i10);
    }

    public static void p(j6 j6Var, int i10) {
        String str;
        String str2;
        SparseArray sparseArray;
        i6 i6Var;
        if (j6Var != null) {
            if (i10 < 0 || (sparseArray = j6Var.f21020a0) == null || ((i6Var = (i6) sparseArray.get(i10)) != null && !i6Var.f20985z)) {
                if (!j6Var.m().equals("Blue") || i10 != 99) {
                    if (!j6Var.m().equals("Day") || i10 != 9) {
                        if (!j6Var.m().equals("Night") || i10 != 0) {
                            if (j6Var.m().equals("Dark Blue") && i10 == 0) {
                                return;
                            }
                            boolean q6 = j6Var.q();
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
                            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().putString(str, j6Var.m()).putInt(str2, i10).apply();
                        }
                    }
                }
            }
        }
    }

    public final TLRPC.Document e() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return ag.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return MediaDataController.getInstance(this.f20888g).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray g(int i10, int i11) {
        i6 i6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        j6 j6Var;
        j6 P0;
        i6 i6Var2;
        ArrayList arrayList = this.f20887f;
        SparseIntArray sparseIntArray2 = ((e4) arrayList.get(i11)).f20860f;
        if (sparseIntArray2 != null) {
            return sparseIntArray2;
        }
        j6 i12 = i(i11);
        if (i12 == null) {
            int i13 = ((e4) arrayList.get(i11)).d;
            gg.a aVar = (gg.a) arrayList.get(i11);
            TLRPC.TL_theme tL_theme = ((e4) arrayList.get(i11)).f20858b;
            if (aVar != null) {
                P0 = k6.P0(k6.r0(((e4) aVar).b(i13)));
            } else {
                P0 = k6.P0("Blue");
            }
            if (P0 != null) {
                j6 j6Var2 = new j6(P0);
                if (aVar != null) {
                    e4 e4Var = (e4) aVar;
                    i6Var2 = j6Var2.e(e4Var.a(), e4Var.b(i13), tL_theme, i10, true);
                } else {
                    i6Var2 = null;
                }
                if (i6Var2 != null) {
                    j6Var2.u(i6Var2.f20964a);
                }
                i6Var = i6Var2;
                i12 = j6Var2;
            }
            i6Var = null;
        } else {
            SparseArray sparseArray = i12.f21020a0;
            if (sparseArray != null) {
                i6Var = (i6) sparseArray.get(((e4) arrayList.get(i11)).e);
            }
            i6Var = null;
        }
        if (i12 == null) {
            return sparseIntArray2;
        }
        String[] strArr = new String[1];
        if (i12.f21021b != null) {
            sparseIntArray = k6.S0(new File(i12.f21021b), null, strArr);
        } else {
            String str = i12.d;
            if (str != null) {
                sparseIntArray = k6.S0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        int i14 = 0;
        ((e4) arrayList.get(i11)).f20861g = strArr[0];
        if (i6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            i6Var.c(sparseIntArray, clone);
            gg.b bVar = this.f20886c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f11068b) && (j6Var = i6Var.f20965b) != null && j6Var.f21021b == null && !j6Var.q()) {
                i6.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray3 = k6.rl;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        ((e4) arrayList.get(i11)).f20860f = sparseIntArray4;
        while (true) {
            try {
                int[] iArr = h;
                if (i14 < iArr.length) {
                    int i15 = iArr[i14];
                    int indexOfKey2 = sparseIntArray.indexOfKey(i15);
                    if (indexOfKey2 >= 0) {
                        sparseIntArray4.put(i15, sparseIntArray.valueAt(indexOfKey2));
                    } else {
                        int i16 = sparseIntArray3.get(i15, -1);
                        if (i16 >= 0 && (indexOfKey = sparseIntArray.indexOfKey(i16)) >= 0) {
                            sparseIntArray4.put(i15, sparseIntArray.valueAt(indexOfKey));
                        }
                    }
                    i14++;
                } else {
                    return sparseIntArray4;
                }
            } catch (Exception e) {
                FileLog.e(e);
                return sparseIntArray4;
            }
        }
    }

    public final long h(int i10) {
        return ((e4) this.f20887f.get(i10)).a();
    }

    public final j6 i(int i10) {
        return ((e4) this.f20887f.get(i10)).f20857a;
    }

    public final TLRPC.WallPaper j(int i10) {
        e4 e4Var = (e4) this.f20887f.get(i10);
        TLRPC.ThemeSettings b10 = e4Var.b(e4Var.d);
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
        if (!this.f20884a && !this.f20885b) {
            return false;
        }
        return true;
    }

    public final void m(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f20887f;
            if (i12 < arrayList.size()) {
                if (arrayList.get(i12) != null) {
                    SparseIntArray g10 = g(i10, i12);
                    ((e4) arrayList.get(i12)).h = f(g10, k6.f21444ra);
                    ((e4) arrayList.get(i12)).f20862i = f(g10, k6.Aa);
                    ((e4) arrayList.get(i12)).f20863j = f(g10, k6.Oh);
                    ((e4) arrayList.get(i12)).f20864k = g10.get(k6.Nd, 0);
                    ((e4) arrayList.get(i12)).f20865l = g10.get(k6.Od, 0);
                    ((e4) arrayList.get(i12)).f20866m = g10.get(k6.Pd, 0);
                    ((e4) arrayList.get(i12)).f20867n = g10.get(k6.Qd, 0);
                    ((e4) arrayList.get(i12)).f20868o = g10.get(k6.Rd, 0);
                    if (((e4) arrayList.get(i12)).f20857a != null && ((e4) arrayList.get(i12)).f20857a.m().equals("Blue")) {
                        if (((e4) arrayList.get(i12)).e >= 0) {
                            i11 = ((e4) arrayList.get(i12)).e;
                        } else {
                            i11 = ((e4) arrayList.get(i12)).f20857a.Y;
                        }
                        if (i11 == 99) {
                            ((e4) arrayList.get(i12)).f20864k = -2368069;
                            ((e4) arrayList.get(i12)).f20865l = -9722489;
                            ((e4) arrayList.get(i12)).f20866m = -2762611;
                            ((e4) arrayList.get(i12)).f20867n = -7817084;
                        }
                    }
                }
                i12++;
            } else {
                return;
            }
        }
    }

    public final void n(int i10, ResultCallback resultCallback) {
        TLRPC.WallPaper j10 = j(i10);
        if (j10 == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        long h10 = h(i10);
        long j11 = j10.f20495id;
        c9 c9Var = new c9(resultCallback, h10, 1);
        boolean z10 = j10.pattern;
        int i11 = this.f20888g;
        ChatThemeController.getInstance(i11).loadWallpaperBitmap(j11, z10 ? 1 : 0, new d4(c9Var, j10, z10 ? 1 : 0, i11, j11));
    }

    public final void o(int i10, ResultCallback resultCallback) {
        TLRPC.WallPaper j10 = j(i10);
        if (j10 == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        } else {
            long h10 = h(i10);
            if (h10 == 0) {
                if (resultCallback != null) {
                    resultCallback.onComplete(null);
                }
            } else {
                Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.f20888g).getWallpaperThumbBitmap(h10);
                File file = new File(ApplicationLoader.getFilesDirFixed(), org.telegram.ui.Cells.b1.k(h10, "wallpaper_thumb_", ".png"));
                if (wallpaperThumbBitmap == null && file.exists() && file.length() > 0) {
                    try {
                        wallpaperThumbBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (wallpaperThumbBitmap != null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(h10), wallpaperThumbBitmap));
                        return;
                    }
                    return;
                }
                TLRPC.Document document = j10.document;
                if (document == null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(h10), null));
                        return;
                    }
                    return;
                }
                ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 140), j10.document);
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setAllowLoadingOnAttachedOnly(false);
                imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                imageReceiver.setDelegate(new ai.f(resultCallback, h10, file, 4));
                ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
            }
        }
    }

    public f4(int i10, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f20887f = arrayList;
        this.f20888g = i10;
        this.f20884a = false;
        String str = tL_theme.emoticon;
        this.e = str;
        this.f20886c = new gg.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        e4 e4Var = new e4();
        e4Var.f20858b = tL_theme;
        e4Var.d = 0;
        arrayList.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.f20858b = tL_theme;
        e4Var2.d = 1;
        arrayList.add(e4Var2);
    }

    public f4(int i10, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f20887f = arrayList;
        this.f20888g = i10;
        this.f20884a = false;
        this.e = tL_chatThemeUniqueGift.gift.slug;
        this.f20886c = gg.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        e4 e4Var = new e4();
        e4Var.f20859c = tL_chatThemeUniqueGift;
        e4Var.d = 0;
        arrayList.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.f20859c = tL_chatThemeUniqueGift;
        e4Var2.d = 1;
        arrayList.add(e4Var2);
    }
}
