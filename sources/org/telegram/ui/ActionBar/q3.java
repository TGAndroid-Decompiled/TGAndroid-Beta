package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class q3 implements ig.a {
    public j6 f28403a;
    public TLRPC.TL_theme f28404b;
    public TLRPC.TL_chatThemeUniqueGift f28405c;
    public int d;
    public int f28406e = -1;
    public SparseIntArray f28407f;
    public String f28408g;
    public int h;
    public int f28409i;
    public int f28410j;
    public int f28411k;
    public int f28412l;
    public int f28413m;
    public int f28414n;
    public int f28415o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f28404b;
        if (tL_theme != null) {
            return tL_theme.f27095id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f28405c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i7) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f28404b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f28405c;
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
