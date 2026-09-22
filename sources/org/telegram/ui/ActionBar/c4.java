package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c4 implements fg.a {
    public i6 f18780a;
    public TLRPC.TL_theme f18781b;
    public TLRPC.TL_chatThemeUniqueGift f18782c;
    public int d;
    public int e = -1;
    public SparseIntArray f18783f;
    public String f18784g;
    public int h;
    public int f18785i;
    public int f18786j;
    public int f18787k;
    public int f18788l;
    public int f18789m;
    public int f18790n;
    public int f18791o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f18781b;
        if (tL_theme != null) {
            return tL_theme.f18480id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18782c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f18781b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18782c;
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
