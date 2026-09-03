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
public final class e4 {
    public static final int[] h = {j6.f20136ra, j6.Aa, j6.Oh, j6.Nd, j6.Od, j6.Pd, j6.Qd, j6.Rd};
    public boolean f19638a;
    public boolean f19639b;
    public sf.b f19640c;
    public TLRPC.ChatTheme d;
    public String e;
    public final ArrayList f19641f;
    public final int f19642g;

    public e4(int i10) {
        this.f19641f = new ArrayList();
        this.f19642g = i10;
    }

    public static e4 a(int i10) {
        e4 e4Var = new e4(i10);
        e4Var.e = "❌";
        e4Var.f19640c = sf.b.d("❌");
        e4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        e4Var.f19639b = true;
        d4 d4Var = new d4();
        d4Var.f19596a = e(true);
        e4Var.f19641f.add(d4Var);
        d4 d4Var2 = new d4();
        d4Var2.f19596a = e(false);
        e4Var.f19641f.add(d4Var2);
        return e4Var;
    }

    public static e4 c(int i10) {
        e4 e4Var = new e4(i10);
        e4Var.e = "🏠";
        e4Var.f19640c = sf.b.d("🏠");
        e4Var.d = TLRPC.ChatTheme.ofEmoticon(e4Var.e);
        d4 d4Var = new d4();
        d4Var.f19596a = j6.N0("Blue");
        d4Var.e = 99;
        e4Var.f19641f.add(d4Var);
        d4 d4Var2 = new d4();
        d4Var2.f19596a = j6.N0("Day");
        d4Var2.e = 9;
        e4Var.f19641f.add(d4Var2);
        d4 d4Var3 = new d4();
        d4Var3.f19596a = j6.N0("Night");
        d4Var3.e = 0;
        e4Var.f19641f.add(d4Var3);
        d4 d4Var4 = new d4();
        d4Var4.f19596a = j6.N0("Dark Blue");
        d4Var4.e = 0;
        e4Var.f19641f.add(d4Var4);
        return e4Var;
    }

    public static e4 d(int i10, TLRPC.TL_theme tL_theme) {
        e4 e4Var = new e4(i10);
        String str = tL_theme.emoticon;
        e4Var.e = str;
        e4Var.f19640c = new sf.b(str, null);
        e4Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i11 = 0; i11 < tL_theme.settings.size(); i11++) {
            d4 d4Var = new d4();
            d4Var.f19597b = tL_theme;
            d4Var.d = i11;
            e4Var.f19641f.add(d4Var);
        }
        return e4Var;
    }

    public static i6 e(boolean z4) {
        i6 A0;
        String string;
        if (z4) {
            A0 = j6.J;
        } else {
            A0 = j6.A0();
        }
        if (z4 != A0.q()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            String str = "Blue";
            if (z4) {
                string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            } else {
                string = sharedPreferences.getString("lastDayTheme", "Blue");
            }
            A0 = j6.N0(string);
            if (A0 == null) {
                if (z4) {
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
            if (i10 < 0 || (sparseArray = i6Var.X) == null || ((h6Var = (h6) sparseArray.get(i10)) != null && !h6Var.f19757z)) {
                if (!i6Var.m().equals("Blue") || i10 != 99) {
                    if (!i6Var.m().equals("Day") || i10 != 9) {
                        if (!i6Var.m().equals("Night") || i10 != 0) {
                            if (i6Var.m().equals("Dark Blue") && i10 == 0) {
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
        i6 j10 = j(i11);
        ArrayList arrayList = this.f19641f;
        if (j10 == null) {
            int i12 = ((d4) arrayList.get(i11)).d;
            d4 d4Var = (d4) ((sf.a) arrayList.get(i11));
            TLRPC.ThemeSettings b10 = d4Var.b(i12);
            TLRPC.TL_theme tL_theme = ((d4) arrayList.get(i11)).f19597b;
            i6 i6Var2 = new i6(j6.N0(j6.q0(b10)));
            h6Var = i6Var2.e(d4Var.a(), b10, tL_theme, i10, true);
            i6Var2.u(h6Var.f19736a);
            j10 = i6Var2;
        } else {
            SparseArray sparseArray = j10.X;
            if (sparseArray != null) {
                h6Var = (h6) sparseArray.get(((d4) arrayList.get(i11)).e);
            } else {
                h6Var = null;
            }
        }
        String[] strArr = new String[1];
        if (j10.f19782b != null) {
            sparseIntArray = j6.Q0(new File(j10.f19782b), null, strArr);
        } else {
            String str = j10.d;
            if (str != null) {
                sparseIntArray = j6.Q0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        ((d4) arrayList.get(i11)).f19600g = strArr[0];
        if (h6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            h6Var.c(sparseIntArray, clone);
            sf.b bVar = this.f19640c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f44368b) && (i6Var = h6Var.f19737b) != null && i6Var.f19782b == null && !i6Var.q()) {
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
            return lf.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return MediaDataController.getInstance(this.f19642g).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.d).emoticon);
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
        ArrayList arrayList = this.f19641f;
        SparseIntArray sparseIntArray2 = ((d4) arrayList.get(i11)).f19599f;
        if (sparseIntArray2 != null) {
            return sparseIntArray2;
        }
        i6 j10 = j(i11);
        if (j10 == null) {
            int i12 = ((d4) arrayList.get(i11)).d;
            sf.a aVar = (sf.a) arrayList.get(i11);
            TLRPC.TL_theme tL_theme = ((d4) arrayList.get(i11)).f19597b;
            if (aVar != null) {
                N0 = j6.N0(j6.q0(((d4) aVar).b(i12)));
            } else {
                N0 = j6.N0("Blue");
            }
            if (N0 != null) {
                i6 i6Var2 = new i6(N0);
                if (aVar != null) {
                    d4 d4Var = (d4) aVar;
                    h6Var2 = i6Var2.e(d4Var.a(), d4Var.b(i12), tL_theme, i10, true);
                } else {
                    h6Var2 = null;
                }
                if (h6Var2 != null) {
                    i6Var2.u(h6Var2.f19736a);
                }
                h6Var = h6Var2;
                j10 = i6Var2;
            }
            h6Var = null;
        } else {
            SparseArray sparseArray = j10.X;
            if (sparseArray != null) {
                h6Var = (h6) sparseArray.get(((d4) arrayList.get(i11)).e);
            }
            h6Var = null;
        }
        if (j10 == null) {
            return sparseIntArray2;
        }
        String[] strArr = new String[1];
        if (j10.f19782b != null) {
            sparseIntArray = j6.Q0(new File(j10.f19782b), null, strArr);
        } else {
            String str = j10.d;
            if (str != null) {
                sparseIntArray = j6.Q0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        int i13 = 0;
        ((d4) arrayList.get(i11)).f19600g = strArr[0];
        if (h6Var != null) {
            SparseIntArray clone = sparseIntArray.clone();
            h6Var.c(sparseIntArray, clone);
            sf.b bVar = this.f19640c;
            if (bVar != null && !TextUtils.isEmpty(bVar.f44368b) && (i6Var = h6Var.f19737b) != null && i6Var.f19782b == null && !i6Var.q()) {
                h6.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray3 = j6.ol;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        ((d4) arrayList.get(i11)).f19599f = sparseIntArray4;
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
        return ((d4) this.f19641f.get(i10)).a();
    }

    public final i6 j(int i10) {
        return ((d4) this.f19641f.get(i10)).f19596a;
    }

    public final TLRPC.WallPaper k(int i10) {
        d4 d4Var = (d4) this.f19641f.get(i10);
        TLRPC.ThemeSettings b10 = d4Var.b(d4Var.d);
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
        if (!this.f19638a && !this.f19639b) {
            return false;
        }
        return true;
    }

    public final void n(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f19641f;
            if (i12 < arrayList.size()) {
                if (arrayList.get(i12) != null) {
                    SparseIntArray h9 = h(i10, i12);
                    ((d4) arrayList.get(i12)).h = g(h9, j6.f20136ra);
                    ((d4) arrayList.get(i12)).f19601i = g(h9, j6.Aa);
                    ((d4) arrayList.get(i12)).f19602j = g(h9, j6.Oh);
                    ((d4) arrayList.get(i12)).f19603k = h9.get(j6.Nd, 0);
                    ((d4) arrayList.get(i12)).f19604l = h9.get(j6.Od, 0);
                    ((d4) arrayList.get(i12)).f19605m = h9.get(j6.Pd, 0);
                    ((d4) arrayList.get(i12)).f19606n = h9.get(j6.Qd, 0);
                    ((d4) arrayList.get(i12)).f19607o = h9.get(j6.Rd, 0);
                    if (((d4) arrayList.get(i12)).f19596a != null && ((d4) arrayList.get(i12)).f19596a.m().equals("Blue")) {
                        if (((d4) arrayList.get(i12)).e >= 0) {
                            i11 = ((d4) arrayList.get(i12)).e;
                        } else {
                            i11 = ((d4) arrayList.get(i12)).f19596a.V;
                        }
                        if (i11 == 99) {
                            ((d4) arrayList.get(i12)).f19603k = -2368069;
                            ((d4) arrayList.get(i12)).f19604l = -9722489;
                            ((d4) arrayList.get(i12)).f19605m = -2762611;
                            ((d4) arrayList.get(i12)).f19606n = -7817084;
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
        long j10 = k10.f19311id;
        a4 a4Var = new a4(resultCallback, i11, 0);
        boolean z4 = k10.pattern;
        int i12 = this.f19642g;
        ChatThemeController.getInstance(i12).loadWallpaperBitmap(j10, z4 ? 1 : 0, new b4(a4Var, k10, z4 ? 1 : 0, i12, j10));
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
                Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.f19642g).getWallpaperThumbBitmap(i11);
                File file = new File(ApplicationLoader.getFilesDirFixed(), e2.c.i(i11, "wallpaper_thumb_", ".png"));
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
                imageReceiver.setDelegate(new e3.f(resultCallback, i11, file, 5));
                ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
            }
        }
    }

    public e4(int i10, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f19641f = arrayList;
        this.f19642g = i10;
        this.f19638a = false;
        String str = tL_theme.emoticon;
        this.e = str;
        this.f19640c = new sf.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        d4 d4Var = new d4();
        d4Var.f19597b = tL_theme;
        d4Var.d = 0;
        arrayList.add(d4Var);
        d4 d4Var2 = new d4();
        d4Var2.f19597b = tL_theme;
        d4Var2.d = 1;
        arrayList.add(d4Var2);
    }

    public e4(int i10, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f19641f = arrayList;
        this.f19642g = i10;
        this.f19638a = false;
        this.e = tL_chatThemeUniqueGift.gift.slug;
        this.f19640c = sf.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        d4 d4Var = new d4();
        d4Var.f19598c = tL_chatThemeUniqueGift;
        d4Var.d = 0;
        arrayList.add(d4Var);
        d4 d4Var2 = new d4();
        d4Var2.f19598c = tL_chatThemeUniqueGift;
        d4Var2.d = 1;
        arrayList.add(d4Var2);
    }
}
