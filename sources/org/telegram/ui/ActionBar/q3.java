package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class q3 implements ig.a {
    public k6 f28408a;
    public TLRPC.TL_theme f28409b;
    public TLRPC.TL_chatThemeUniqueGift f28410c;
    public int d;
    public int f28411e = -1;
    public SparseIntArray f28412f;
    public String f28413g;
    public int h;
    public int f28414i;
    public int f28415j;
    public int f28416k;
    public int f28417l;
    public int f28418m;
    public int f28419n;
    public int f28420o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f28409b;
        if (tL_theme != null) {
            return tL_theme.f27095id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f28410c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i7) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f28409b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f28410c;
            if (tL_chatThemeUniqueGift != null) {
                arrayList = tL_chatThemeUniqueGift.theme_settings;
            }
            return null;
        }
        if (arrayList != null && i7 >= 0 && arrayList.size() > i7) {
            return arrayList.get(i7);
        }
        return null;
    }
}
