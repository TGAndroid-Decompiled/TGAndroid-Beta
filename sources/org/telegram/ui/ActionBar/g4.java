package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class g4 implements hg.a {
    public x6 f22651a;
    public TLRPC.TL_theme f22652b;
    public TLRPC.TL_chatThemeUniqueGift f22653c;
    public int d;
    public int e = -1;
    public SparseIntArray f22654f;
    public String f22655g;
    public int h;
    public int f22656i;
    public int f22657j;
    public int f22658k;
    public int f22659l;
    public int f22660m;
    public int f22661n;
    public int f22662o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f22652b;
        if (tL_theme != null) {
            return tL_theme.f22167id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f22653c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f22652b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f22653c;
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
