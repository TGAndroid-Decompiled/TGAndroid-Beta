package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class q3 implements ig.a {
    public j6 f28400a;
    public TLRPC.TL_theme f28401b;
    public TLRPC.TL_chatThemeUniqueGift f28402c;
    public int d;
    public int f28403e = -1;
    public SparseIntArray f28404f;
    public String f28405g;
    public int h;
    public int f28406i;
    public int f28407j;
    public int f28408k;
    public int f28409l;
    public int f28410m;
    public int f28411n;
    public int f28412o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f28401b;
        if (tL_theme != null) {
            return tL_theme.f27092id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f28402c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i7) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f28401b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f28402c;
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
