package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a4 implements fg.a {
    public g6 f18711a;
    public TLRPC.TL_theme f18712b;
    public TLRPC.TL_chatThemeUniqueGift f18713c;
    public int d;
    public int e = -1;
    public SparseIntArray f18714f;
    public String f18715g;
    public int h;
    public int f18716i;
    public int f18717j;
    public int f18718k;
    public int f18719l;
    public int f18720m;
    public int f18721n;
    public int f18722o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f18712b;
        if (tL_theme != null) {
            return tL_theme.f18474id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18713c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f18712b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18713c;
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
