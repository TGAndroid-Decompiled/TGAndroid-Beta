package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c4 implements fg.a {
    public h6 f18756a;
    public TLRPC.TL_theme f18757b;
    public TLRPC.TL_chatThemeUniqueGift f18758c;
    public int d;
    public int e = -1;
    public SparseIntArray f18759f;
    public String f18760g;
    public int h;
    public int f18761i;
    public int f18762j;
    public int f18763k;
    public int f18764l;
    public int f18765m;
    public int f18766n;
    public int f18767o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f18757b;
        if (tL_theme != null) {
            return tL_theme.f18466id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18758c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f18757b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18758c;
            if (tL_chatThemeUniqueGift != null) {
                arrayList = tL_chatThemeUniqueGift.theme_settings;
            }
            return null;
        }
        if (arrayList != null && i10 >= 0 && arrayList.size() > i10) {
            return arrayList.get(i10);
        }
        return null;
    }
}
