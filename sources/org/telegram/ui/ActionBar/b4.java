package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import ci.p9;
import ci.q9;
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
public final class b4 {
    public static final int[] h = {h6.f20822ra, h6.Aa, h6.Oh, h6.Nd, h6.Od, h6.Pd, h6.Qd, h6.Rd};
    public boolean f20239a;
    public boolean f20240b;
    public fg.b f20241c;
    public TLRPC.ChatTheme d;
    public String f20242e;
    public final ArrayList f20243f;
    public final int f20244g;

    public b4(int i10) {
        this.f20243f = new ArrayList();
        this.f20244g = i10;
    }

    public static b4 a(int i10) {
        b4 b4Var = new b4(i10);
        b4Var.f20242e = "❌";
        b4Var.f20241c = fg.b.d("❌");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        b4Var.f20240b = true;
        a4 a4Var = new a4();
        a4Var.f20190a = e(true);
        b4Var.f20243f.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.f20190a = e(false);
        b4Var.f20243f.add(a4Var2);
        return b4Var;
    }

    public static b4 c(int i10) {
        b4 b4Var = new b4(i10);
        b4Var.f20242e = "🏠";
        b4Var.f20241c = fg.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.f20242e);
        a4 a4Var = new a4();
        a4Var.f20190a = h6.O0("Blue");
        a4Var.f20193e = 99;
        b4Var.f20243f.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.f20190a = h6.O0("Day");
        a4Var2.f20193e = 9;
        b4Var.f20243f.add(a4Var2);
        a4 a4Var3 = new a4();
        a4Var3.f20190a = h6.O0("Night");
        a4Var3.f20193e = 0;
        b4Var.f20243f.add(a4Var3);
        a4 a4Var4 = new a4();
        a4Var4.f20190a = h6.O0("Dark Blue");
        a4Var4.f20193e = 0;
        b4Var.f20243f.add(a4Var4);
        return b4Var;
    }

    public static b4 d(int i10, TLRPC.TL_theme tL_theme) {
        b4 b4Var = new b4(i10);
        String str = tL_theme.emoticon;
        b4Var.f20242e = str;
        b4Var.f20241c = new fg.b(str, null);
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i11 = 0; i11 < tL_theme.settings.size(); i11++) {
            a4 a4Var = new a4();
            a4Var.f20191b = tL_theme;
            a4Var.d = i11;
            b4Var.f20243f.add(a4Var);
        }
        return b4Var;
    }

    public static g6 e(boolean z10) {
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

    public static int g(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null) {
            return h6.D0(i10);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i10);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        return h6.D0(i10);
    }

    public static void q(g6 g6Var, int i10) {
        String str;
        String str2;
        SparseArray sparseArray;
        e6 e6Var;
        if (g6Var != null) {
            if (i10 < 0 || (sparseArray = g6Var.f20429a0) == null || ((e6Var = (e6) sparseArray.get(i10)) != null && !e6Var.f20371z)) {
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

    public final SparseIntArray b(int i10, int i11) {
        e6 e6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        g6 g6Var;
        g6 j3 = j(i11);
        ArrayList arrayList = this.f20243f;
        if (j3 == null) {
            int i12 = ((a4) arrayList.get(i11)).d;
            a4 a4Var = (a4) ((fg.a) arrayList.get(i11));
            TLRPC.ThemeSettings b10 = a4Var.b(i12);
            TLRPC.TL_theme tL_theme = ((a4) arrayList.get(i11)).f20191b;
            g6 g6Var2 = new g6(h6.O0(h6.r0(b10)));
            e6Var = g6Var2.e(a4Var.a(), b10, tL_theme, i10, true);
            g6Var2.u(e6Var.f20349a);
            j3 = g6Var2;
        } else {
            SparseArray sparseArray = j3.f20429a0;
            if (sparseArray != null) {
                e6Var = (e6) sparseArray.get(((a4) arrayList.get(i11)).f20193e);
            } else {
                e6Var = null;
            }
        }
        String[] strArr = new String[1];
        if (j3.f20430b != null) {
            sparseIntArray = h6.R0(new File(j3.f20430b), null, strArr);
        } else {
            String str = j3.d;
            if (str != null) {
                sparseIntArray = h6.R0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        ((a4) arrayList.get(i11)).f20195g = strArr[0];
        if (e6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            e6Var.c(sparseIntArray, clone);
            fg.b bVar = this.f20241c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f9924b) && (g6Var = e6Var.f20350b) != null && g6Var.f20430b == null && !g6Var.q()) {
                e6.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray2 = h6.rl;
        for (int i13 = 0; i13 < sparseIntArray2.size(); i13++) {
            int keyAt = sparseIntArray2.keyAt(i13);
            int valueAt = sparseIntArray2.valueAt(i13);
            if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey));
            }
        }
        int[] iArr = h6.ql;
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
            return MediaDataController.getInstance(this.f20244g).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray h(int i10, int i11) {
        e6 e6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        g6 g6Var;
        g6 O0;
        e6 e6Var2;
        ArrayList arrayList = this.f20243f;
        SparseIntArray sparseIntArray2 = ((a4) arrayList.get(i11)).f20194f;
        if (sparseIntArray2 != null) {
            return sparseIntArray2;
        }
        g6 j3 = j(i11);
        if (j3 == null) {
            int i12 = ((a4) arrayList.get(i11)).d;
            fg.a aVar = (fg.a) arrayList.get(i11);
            TLRPC.TL_theme tL_theme = ((a4) arrayList.get(i11)).f20191b;
            if (aVar != null) {
                O0 = h6.O0(h6.r0(((a4) aVar).b(i12)));
            } else {
                O0 = h6.O0("Blue");
            }
            if (O0 != null) {
                g6 g6Var2 = new g6(O0);
                if (aVar != null) {
                    a4 a4Var = (a4) aVar;
                    e6Var2 = g6Var2.e(a4Var.a(), a4Var.b(i12), tL_theme, i10, true);
                } else {
                    e6Var2 = null;
                }
                if (e6Var2 != null) {
                    g6Var2.u(e6Var2.f20349a);
                }
                e6Var = e6Var2;
                j3 = g6Var2;
            }
            e6Var = null;
        } else {
            SparseArray sparseArray = j3.f20429a0;
            if (sparseArray != null) {
                e6Var = (e6) sparseArray.get(((a4) arrayList.get(i11)).f20193e);
            }
            e6Var = null;
        }
        if (j3 == null) {
            return sparseIntArray2;
        }
        String[] strArr = new String[1];
        if (j3.f20430b != null) {
            sparseIntArray = h6.R0(new File(j3.f20430b), null, strArr);
        } else {
            String str = j3.d;
            if (str != null) {
                sparseIntArray = h6.R0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        int i13 = 0;
        ((a4) arrayList.get(i11)).f20195g = strArr[0];
        if (e6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            e6Var.c(sparseIntArray, clone);
            fg.b bVar = this.f20241c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f9924b) && (g6Var = e6Var.f20350b) != null && g6Var.f20430b == null && !g6Var.q()) {
                e6.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray3 = h6.rl;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        ((a4) arrayList.get(i11)).f20194f = sparseIntArray4;
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
        return ((a4) this.f20243f.get(i10)).a();
    }

    public final g6 j(int i10) {
        return ((a4) this.f20243f.get(i10)).f20190a;
    }

    public final TLRPC.WallPaper k(int i10) {
        a4 a4Var = (a4) this.f20243f.get(i10);
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
        if (!this.f20239a && !this.f20240b) {
            return false;
        }
        return true;
    }

    public final void n(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f20243f;
            if (i12 < arrayList.size()) {
                if (arrayList.get(i12) != null) {
                    SparseIntArray h10 = h(i10, i12);
                    ((a4) arrayList.get(i12)).h = g(h10, h6.f20822ra);
                    ((a4) arrayList.get(i12)).f20196i = g(h10, h6.Aa);
                    ((a4) arrayList.get(i12)).f20197j = g(h10, h6.Oh);
                    ((a4) arrayList.get(i12)).f20198k = h10.get(h6.Nd, 0);
                    ((a4) arrayList.get(i12)).f20199l = h10.get(h6.Od, 0);
                    ((a4) arrayList.get(i12)).f20200m = h10.get(h6.Pd, 0);
                    ((a4) arrayList.get(i12)).f20201n = h10.get(h6.Qd, 0);
                    ((a4) arrayList.get(i12)).f20202o = h10.get(h6.Rd, 0);
                    if (((a4) arrayList.get(i12)).f20190a != null && ((a4) arrayList.get(i12)).f20190a.m().equals("Blue")) {
                        if (((a4) arrayList.get(i12)).f20193e >= 0) {
                            i11 = ((a4) arrayList.get(i12)).f20193e;
                        } else {
                            i11 = ((a4) arrayList.get(i12)).f20190a.Y;
                        }
                        if (i11 == 99) {
                            ((a4) arrayList.get(i12)).f20198k = -2368069;
                            ((a4) arrayList.get(i12)).f20199l = -9722489;
                            ((a4) arrayList.get(i12)).f20200m = -2762611;
                            ((a4) arrayList.get(i12)).f20201n = -7817084;
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
        long j3 = k10.f19954id;
        p9 p9Var = new p9(resultCallback, i11, 1);
        boolean z10 = k10.pattern;
        int i12 = this.f20244g;
        ChatThemeController.getInstance(i12).loadWallpaperBitmap(j3, z10 ? 1 : 0, new z3(p9Var, k10, z10 ? 1 : 0, i12, j3));
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
                Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.f20244g).getWallpaperThumbBitmap(i11);
                File file = new File(ApplicationLoader.getFilesDirFixed(), org.telegram.ui.Cells.c1.h(i11, "wallpaper_thumb_", ".png"));
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
                imageReceiver.setDelegate(new q9(resultCallback, i11, file, 2));
                ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
            }
        }
    }

    public b4(int i10, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f20243f = arrayList;
        this.f20244g = i10;
        this.f20239a = false;
        String str = tL_theme.emoticon;
        this.f20242e = str;
        this.f20241c = new fg.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        a4 a4Var = new a4();
        a4Var.f20191b = tL_theme;
        a4Var.d = 0;
        arrayList.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.f20191b = tL_theme;
        a4Var2.d = 1;
        arrayList.add(a4Var2);
    }

    public b4(int i10, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f20243f = arrayList;
        this.f20244g = i10;
        this.f20239a = false;
        this.f20242e = tL_chatThemeUniqueGift.gift.slug;
        this.f20241c = fg.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        a4 a4Var = new a4();
        a4Var.f20192c = tL_chatThemeUniqueGift;
        a4Var.d = 0;
        arrayList.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.f20192c = tL_chatThemeUniqueGift;
        a4Var2.d = 1;
        arrayList.add(a4Var2);
    }
}
