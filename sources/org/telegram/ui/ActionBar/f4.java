package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import bi.ab;
import bi.bb;
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
import org.telegram.ui.Cells.r6;
public final class f4 {
    public static final int[] h = {j6.f18184ra, j6.Aa, j6.Oh, j6.Nd, j6.Od, j6.Pd, j6.Qd, j6.Rd};
    public boolean f17714a;
    public boolean f17715b;
    public eg.b f17716c;
    public TLRPC.ChatTheme d;
    public String e;
    public final ArrayList f17717f;
    public final int f17718g;

    public f4(int i10) {
        this.f17717f = new ArrayList();
        this.f17718g = i10;
    }

    public static f4 a(int i10) {
        f4 f4Var = new f4(i10);
        f4Var.e = "❌";
        f4Var.f17716c = eg.b.d("❌");
        f4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        f4Var.f17715b = true;
        e4 e4Var = new e4();
        e4Var.f17670a = e(true);
        f4Var.f17717f.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.f17670a = e(false);
        f4Var.f17717f.add(e4Var2);
        return f4Var;
    }

    public static f4 c(int i10) {
        f4 f4Var = new f4(i10);
        f4Var.e = "🏠";
        f4Var.f17716c = eg.b.d("🏠");
        f4Var.d = TLRPC.ChatTheme.ofEmoticon(f4Var.e);
        e4 e4Var = new e4();
        e4Var.f17670a = j6.N0("Blue");
        e4Var.e = 99;
        f4Var.f17717f.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.f17670a = j6.N0("Day");
        e4Var2.e = 9;
        f4Var.f17717f.add(e4Var2);
        e4 e4Var3 = new e4();
        e4Var3.f17670a = j6.N0("Night");
        e4Var3.e = 0;
        f4Var.f17717f.add(e4Var3);
        e4 e4Var4 = new e4();
        e4Var4.f17670a = j6.N0("Dark Blue");
        e4Var4.e = 0;
        f4Var.f17717f.add(e4Var4);
        return f4Var;
    }

    public static f4 d(int i10, TLRPC.TL_theme tL_theme) {
        f4 f4Var = new f4(i10);
        String str = tL_theme.emoticon;
        f4Var.e = str;
        f4Var.f17716c = new eg.b(str, null);
        f4Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i11 = 0; i11 < tL_theme.settings.size(); i11++) {
            e4 e4Var = new e4();
            e4Var.f17671b = tL_theme;
            e4Var.d = i11;
            f4Var.f17717f.add(e4Var);
        }
        return f4Var;
    }

    public static i6 e(boolean z10) {
        i6 A0;
        String string;
        if (z10) {
            A0 = j6.J;
        } else {
            A0 = j6.A0();
        }
        if (z10 != A0.q()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            String str = "Blue";
            if (z10) {
                string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            } else {
                string = sharedPreferences.getString("lastDayTheme", "Blue");
            }
            A0 = j6.N0(string);
            if (A0 == null) {
                if (z10) {
                    str = "Dark Blue";
                }
                A0 = j6.N0(str);
            }
        }
        return new i6(A0);
    }

    public static int g(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null) {
            return j6.C0(i10);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i10);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return j6.C0(i10);
    }

    public static void q(i6 i6Var, int i10) {
        String str;
        String str2;
        SparseArray sparseArray;
        h6 h6Var;
        if (i6Var != null) {
            if (i10 < 0 || (sparseArray = i6Var.f17835a0) == null || ((h6Var = (h6) sparseArray.get(i10)) != null && !h6Var.f17813z)) {
                if (!i6Var.m().equals("Blue") || i10 != 99) {
                    if (!i6Var.m().equals("Day") || i10 != 9) {
                        if (!i6Var.m().equals("Night") || i10 != 0) {
                            if (i6Var.m().equals("Dark Blue") && i10 == 0) {
                                return;
                            }
                            boolean q6 = i6Var.q();
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
                            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().putString(str, i6Var.m()).putInt(str2, i10).apply();
                        }
                    }
                }
            }
        }
    }

    public final SparseIntArray b(int i10, int i11) {
        h6 h6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        i6 i6Var;
        i6 j3 = j(i11);
        ArrayList arrayList = this.f17717f;
        if (j3 == null) {
            int i12 = ((e4) arrayList.get(i11)).d;
            e4 e4Var = (e4) ((eg.a) arrayList.get(i11));
            TLRPC.ThemeSettings b10 = e4Var.b(i12);
            TLRPC.TL_theme tL_theme = ((e4) arrayList.get(i11)).f17671b;
            i6 i6Var2 = new i6(j6.N0(j6.q0(b10)));
            h6Var = i6Var2.e(e4Var.a(), b10, tL_theme, i10, true);
            i6Var2.u(h6Var.f17792a);
            j3 = i6Var2;
        } else {
            SparseArray sparseArray = j3.f17835a0;
            if (sparseArray != null) {
                h6Var = (h6) sparseArray.get(((e4) arrayList.get(i11)).e);
            } else {
                h6Var = null;
            }
        }
        String[] strArr = new String[1];
        if (j3.f17836b != null) {
            sparseIntArray = j6.Q0(new File(j3.f17836b), null, strArr);
        } else {
            String str = j3.d;
            if (str != null) {
                sparseIntArray = j6.Q0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        ((e4) arrayList.get(i11)).f17674g = strArr[0];
        if (h6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            h6Var.c(sparseIntArray, clone);
            eg.b bVar = this.f17716c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f7511b) && (i6Var = h6Var.f17793b) != null && i6Var.f17836b == null && !i6Var.q()) {
                h6.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray2 = j6.ol;
        for (int i13 = 0; i13 < sparseIntArray2.size(); i13++) {
            int keyAt = sparseIntArray2.keyAt(i13);
            int valueAt = sparseIntArray2.valueAt(i13);
            if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey));
            }
        }
        int[] iArr = j6.nl;
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
            return yf.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return MediaDataController.getInstance(this.f17718g).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray h(int i10, int i11) {
        h6 h6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        i6 i6Var;
        i6 N0;
        h6 h6Var2;
        ArrayList arrayList = this.f17717f;
        SparseIntArray sparseIntArray2 = ((e4) arrayList.get(i11)).f17673f;
        if (sparseIntArray2 != null) {
            return sparseIntArray2;
        }
        i6 j3 = j(i11);
        if (j3 == null) {
            int i12 = ((e4) arrayList.get(i11)).d;
            eg.a aVar = (eg.a) arrayList.get(i11);
            TLRPC.TL_theme tL_theme = ((e4) arrayList.get(i11)).f17671b;
            if (aVar != null) {
                N0 = j6.N0(j6.q0(((e4) aVar).b(i12)));
            } else {
                N0 = j6.N0("Blue");
            }
            if (N0 != null) {
                i6 i6Var2 = new i6(N0);
                if (aVar != null) {
                    e4 e4Var = (e4) aVar;
                    h6Var2 = i6Var2.e(e4Var.a(), e4Var.b(i12), tL_theme, i10, true);
                } else {
                    h6Var2 = null;
                }
                if (h6Var2 != null) {
                    i6Var2.u(h6Var2.f17792a);
                }
                h6Var = h6Var2;
                j3 = i6Var2;
            }
            h6Var = null;
        } else {
            SparseArray sparseArray = j3.f17835a0;
            if (sparseArray != null) {
                h6Var = (h6) sparseArray.get(((e4) arrayList.get(i11)).e);
            }
            h6Var = null;
        }
        if (j3 == null) {
            return sparseIntArray2;
        }
        String[] strArr = new String[1];
        if (j3.f17836b != null) {
            sparseIntArray = j6.Q0(new File(j3.f17836b), null, strArr);
        } else {
            String str = j3.d;
            if (str != null) {
                sparseIntArray = j6.Q0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        int i13 = 0;
        ((e4) arrayList.get(i11)).f17674g = strArr[0];
        if (h6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            h6Var.c(sparseIntArray, clone);
            eg.b bVar = this.f17716c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f7511b) && (i6Var = h6Var.f17793b) != null && i6Var.f17836b == null && !i6Var.q()) {
                h6.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray3 = j6.ol;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        ((e4) arrayList.get(i11)).f17673f = sparseIntArray4;
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
            } catch (Exception e) {
                FileLog.e(e);
                return sparseIntArray4;
            }
        }
    }

    public final long i(int i10) {
        return ((e4) this.f17717f.get(i10)).a();
    }

    public final i6 j(int i10) {
        return ((e4) this.f17717f.get(i10)).f17670a;
    }

    public final TLRPC.WallPaper k(int i10) {
        e4 e4Var = (e4) this.f17717f.get(i10);
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
        if (!this.f17714a && !this.f17715b) {
            return false;
        }
        return true;
    }

    public final void n(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f17717f;
            if (i12 < arrayList.size()) {
                if (arrayList.get(i12) != null) {
                    SparseIntArray h10 = h(i10, i12);
                    ((e4) arrayList.get(i12)).h = g(h10, j6.f18184ra);
                    ((e4) arrayList.get(i12)).f17675i = g(h10, j6.Aa);
                    ((e4) arrayList.get(i12)).f17676j = g(h10, j6.Oh);
                    ((e4) arrayList.get(i12)).f17677k = h10.get(j6.Nd, 0);
                    ((e4) arrayList.get(i12)).f17678l = h10.get(j6.Od, 0);
                    ((e4) arrayList.get(i12)).f17679m = h10.get(j6.Pd, 0);
                    ((e4) arrayList.get(i12)).f17680n = h10.get(j6.Qd, 0);
                    ((e4) arrayList.get(i12)).f17681o = h10.get(j6.Rd, 0);
                    if (((e4) arrayList.get(i12)).f17670a != null && ((e4) arrayList.get(i12)).f17670a.m().equals("Blue")) {
                        if (((e4) arrayList.get(i12)).e >= 0) {
                            i11 = ((e4) arrayList.get(i12)).e;
                        } else {
                            i11 = ((e4) arrayList.get(i12)).f17670a.Y;
                        }
                        if (i11 == 99) {
                            ((e4) arrayList.get(i12)).f17677k = -2368069;
                            ((e4) arrayList.get(i12)).f17678l = -9722489;
                            ((e4) arrayList.get(i12)).f17679m = -2762611;
                            ((e4) arrayList.get(i12)).f17680n = -7817084;
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
        long j3 = k10.f17347id;
        ab abVar = new ab(resultCallback, i11, 1);
        boolean z10 = k10.pattern;
        int i12 = this.f17718g;
        ChatThemeController.getInstance(i12).loadWallpaperBitmap(j3, z10 ? 1 : 0, new d4(abVar, k10, z10 ? 1 : 0, i12, j3));
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
                Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.f17718g).getWallpaperThumbBitmap(i11);
                File file = new File(ApplicationLoader.getFilesDirFixed(), r6.h(i11, "wallpaper_thumb_", ".png"));
                if (wallpaperThumbBitmap == null && file.exists() && file.length() > 0) {
                    try {
                        wallpaperThumbBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    } catch (Exception e) {
                        FileLog.e(e);
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
                imageReceiver.setDelegate(new bb(resultCallback, i11, file, 2));
                ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
            }
        }
    }

    public f4(int i10, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f17717f = arrayList;
        this.f17718g = i10;
        this.f17714a = false;
        String str = tL_theme.emoticon;
        this.e = str;
        this.f17716c = new eg.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        e4 e4Var = new e4();
        e4Var.f17671b = tL_theme;
        e4Var.d = 0;
        arrayList.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.f17671b = tL_theme;
        e4Var2.d = 1;
        arrayList.add(e4Var2);
    }

    public f4(int i10, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f17717f = arrayList;
        this.f17718g = i10;
        this.f17714a = false;
        this.e = tL_chatThemeUniqueGift.gift.slug;
        this.f17716c = eg.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        e4 e4Var = new e4();
        e4Var.f17672c = tL_chatThemeUniqueGift;
        e4Var.d = 0;
        arrayList.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.f17672c = tL_chatThemeUniqueGift;
        e4Var2.d = 1;
        arrayList.add(e4Var2);
    }
}
