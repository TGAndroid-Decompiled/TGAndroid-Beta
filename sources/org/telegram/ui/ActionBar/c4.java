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
public final class c4 {
    public static final int[] h = {h6.f21254ra, h6.Aa, h6.Oh, h6.Nd, h6.Od, h6.Pd, h6.Qd, h6.Rd};
    public boolean f20726a;
    public boolean f20727b;
    public gg.b f20728c;
    public TLRPC.ChatTheme d;
    public String e;
    public final ArrayList f20729f;
    public final int f20730g;

    public c4(int i10) {
        this.f20729f = new ArrayList();
        this.f20730g = i10;
    }

    public static c4 a(int i10) {
        c4 c4Var = new c4(i10);
        c4Var.e = "❌";
        c4Var.f20728c = gg.b.d("❌");
        c4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        c4Var.f20727b = true;
        b4 b4Var = new b4();
        b4Var.f20695a = d(true);
        c4Var.f20729f.add(b4Var);
        b4 b4Var2 = new b4();
        b4Var2.f20695a = d(false);
        c4Var.f20729f.add(b4Var2);
        return c4Var;
    }

    public static c4 b(int i10) {
        c4 c4Var = new c4(i10);
        c4Var.e = "🏠";
        c4Var.f20728c = gg.b.d("🏠");
        c4Var.d = TLRPC.ChatTheme.ofEmoticon(c4Var.e);
        b4 b4Var = new b4();
        b4Var.f20695a = h6.O0("Blue");
        b4Var.e = 99;
        c4Var.f20729f.add(b4Var);
        b4 b4Var2 = new b4();
        b4Var2.f20695a = h6.O0("Day");
        b4Var2.e = 9;
        c4Var.f20729f.add(b4Var2);
        b4 b4Var3 = new b4();
        b4Var3.f20695a = h6.O0("Night");
        b4Var3.e = 0;
        c4Var.f20729f.add(b4Var3);
        b4 b4Var4 = new b4();
        b4Var4.f20695a = h6.O0("Dark Blue");
        b4Var4.e = 0;
        c4Var.f20729f.add(b4Var4);
        return c4Var;
    }

    public static c4 c(int i10, TLRPC.TL_theme tL_theme) {
        c4 c4Var = new c4(i10);
        String str = tL_theme.emoticon;
        c4Var.e = str;
        c4Var.f20728c = new gg.b(str, null);
        c4Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i11 = 0; i11 < tL_theme.settings.size(); i11++) {
            b4 b4Var = new b4();
            b4Var.f20696b = tL_theme;
            b4Var.d = i11;
            c4Var.f20729f.add(b4Var);
        }
        return c4Var;
    }

    public static g6 d(boolean z10) {
        g6 B0;
        String string;
        if (z10) {
            B0 = h6.J;
        } else {
            B0 = h6.B0();
        }
        if (z10 != B0.q()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            String str = "Blue";
            if (z10) {
                string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            } else {
                string = sharedPreferences.getString("lastDayTheme", "Blue");
            }
            B0 = h6.O0(string);
            if (B0 == null) {
                if (z10) {
                    str = "Dark Blue";
                }
                B0 = h6.O0(str);
            }
        }
        return new g6(B0);
    }

    public static int f(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null) {
            return h6.D0(i10);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i10);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return h6.D0(i10);
    }

    public static void p(g6 g6Var, int i10) {
        String str;
        String str2;
        SparseArray sparseArray;
        f6 f6Var;
        if (g6Var != null) {
            if (i10 < 0 || (sparseArray = g6Var.f20885a0) == null || ((f6Var = (f6) sparseArray.get(i10)) != null && !f6Var.f20856z)) {
                if (!g6Var.m().equals("Blue") || i10 != 99) {
                    if (!g6Var.m().equals("Day") || i10 != 9) {
                        if (!g6Var.m().equals("Night") || i10 != 0) {
                            if (g6Var.m().equals("Dark Blue") && i10 == 0) {
                                return;
                            }
                            boolean q6 = g6Var.q();
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
                            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().putString(str, g6Var.m()).putInt(str2, i10).apply();
                        }
                    }
                }
            }
        }
    }

    public final TLRPC.Document e() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return ag.e.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return MediaDataController.getInstance(this.f20730g).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray g(int i10, int i11) {
        f6 f6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        g6 g6Var;
        g6 O0;
        f6 f6Var2;
        ArrayList arrayList = this.f20729f;
        SparseIntArray sparseIntArray2 = ((b4) arrayList.get(i11)).f20698f;
        if (sparseIntArray2 != null) {
            return sparseIntArray2;
        }
        g6 i12 = i(i11);
        if (i12 == null) {
            int i13 = ((b4) arrayList.get(i11)).d;
            gg.a aVar = (gg.a) arrayList.get(i11);
            TLRPC.TL_theme tL_theme = ((b4) arrayList.get(i11)).f20696b;
            if (aVar != null) {
                O0 = h6.O0(h6.r0(((b4) aVar).b(i13)));
            } else {
                O0 = h6.O0("Blue");
            }
            if (O0 != null) {
                g6 g6Var2 = new g6(O0);
                if (aVar != null) {
                    b4 b4Var = (b4) aVar;
                    f6Var2 = g6Var2.e(b4Var.a(), b4Var.b(i13), tL_theme, i10, true);
                } else {
                    f6Var2 = null;
                }
                if (f6Var2 != null) {
                    g6Var2.u(f6Var2.f20835a);
                }
                f6Var = f6Var2;
                i12 = g6Var2;
            }
            f6Var = null;
        } else {
            SparseArray sparseArray = i12.f20885a0;
            if (sparseArray != null) {
                f6Var = (f6) sparseArray.get(((b4) arrayList.get(i11)).e);
            }
            f6Var = null;
        }
        if (i12 == null) {
            return sparseIntArray2;
        }
        String[] strArr = new String[1];
        if (i12.f20886b != null) {
            sparseIntArray = h6.R0(new File(i12.f20886b), null, strArr);
        } else {
            String str = i12.d;
            if (str != null) {
                sparseIntArray = h6.R0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        int i14 = 0;
        ((b4) arrayList.get(i11)).f20699g = strArr[0];
        if (f6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            f6Var.c(sparseIntArray, clone);
            gg.b bVar = this.f20728c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f11052b) && (g6Var = f6Var.f20836b) != null && g6Var.f20886b == null && !g6Var.q()) {
                f6.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray3 = h6.rl;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        ((b4) arrayList.get(i11)).f20698f = sparseIntArray4;
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
        return ((b4) this.f20729f.get(i10)).a();
    }

    public final g6 i(int i10) {
        return ((b4) this.f20729f.get(i10)).f20695a;
    }

    public final TLRPC.WallPaper j(int i10) {
        b4 b4Var = (b4) this.f20729f.get(i10);
        TLRPC.ThemeSettings b10 = b4Var.b(b4Var.d);
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
        if (!this.f20726a && !this.f20727b) {
            return false;
        }
        return true;
    }

    public final void m(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f20729f;
            if (i12 < arrayList.size()) {
                if (arrayList.get(i12) != null) {
                    SparseIntArray g10 = g(i10, i12);
                    ((b4) arrayList.get(i12)).h = f(g10, h6.f21254ra);
                    ((b4) arrayList.get(i12)).f20700i = f(g10, h6.Aa);
                    ((b4) arrayList.get(i12)).f20701j = f(g10, h6.Oh);
                    ((b4) arrayList.get(i12)).f20702k = g10.get(h6.Nd, 0);
                    ((b4) arrayList.get(i12)).f20703l = g10.get(h6.Od, 0);
                    ((b4) arrayList.get(i12)).f20704m = g10.get(h6.Pd, 0);
                    ((b4) arrayList.get(i12)).f20705n = g10.get(h6.Qd, 0);
                    ((b4) arrayList.get(i12)).f20706o = g10.get(h6.Rd, 0);
                    if (((b4) arrayList.get(i12)).f20695a != null && ((b4) arrayList.get(i12)).f20695a.m().equals("Blue")) {
                        if (((b4) arrayList.get(i12)).e >= 0) {
                            i11 = ((b4) arrayList.get(i12)).e;
                        } else {
                            i11 = ((b4) arrayList.get(i12)).f20695a.Y;
                        }
                        if (i11 == 99) {
                            ((b4) arrayList.get(i12)).f20702k = -2368069;
                            ((b4) arrayList.get(i12)).f20703l = -9722489;
                            ((b4) arrayList.get(i12)).f20704m = -2762611;
                            ((b4) arrayList.get(i12)).f20705n = -7817084;
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
        long j11 = j10.f20431id;
        c9 c9Var = new c9(resultCallback, h10, 1);
        boolean z10 = j10.pattern;
        int i11 = this.f20730g;
        ChatThemeController.getInstance(i11).loadWallpaperBitmap(j11, z10 ? 1 : 0, new a4(c9Var, j10, z10 ? 1 : 0, i11, j11));
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
                Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.f20730g).getWallpaperThumbBitmap(h10);
                File file = new File(ApplicationLoader.getFilesDirFixed(), r4.c.g(h10, "wallpaper_thumb_", ".png"));
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
                imageReceiver.setDelegate(new ai.f(resultCallback, h10, file, 3));
                ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
            }
        }
    }

    public c4(int i10, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f20729f = arrayList;
        this.f20730g = i10;
        this.f20726a = false;
        String str = tL_theme.emoticon;
        this.e = str;
        this.f20728c = new gg.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        b4 b4Var = new b4();
        b4Var.f20696b = tL_theme;
        b4Var.d = 0;
        arrayList.add(b4Var);
        b4 b4Var2 = new b4();
        b4Var2.f20696b = tL_theme;
        b4Var2.d = 1;
        arrayList.add(b4Var2);
    }

    public c4(int i10, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f20729f = arrayList;
        this.f20730g = i10;
        this.f20726a = false;
        this.e = tL_chatThemeUniqueGift.gift.slug;
        this.f20728c = gg.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        b4 b4Var = new b4();
        b4Var.f20697c = tL_chatThemeUniqueGift;
        b4Var.d = 0;
        arrayList.add(b4Var);
        b4 b4Var2 = new b4();
        b4Var2.f20697c = tL_chatThemeUniqueGift;
        b4Var2.d = 1;
        arrayList.add(b4Var2);
    }
}
