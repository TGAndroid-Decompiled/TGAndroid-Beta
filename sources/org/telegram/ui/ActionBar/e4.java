package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e4 implements gg.a {
    public j6 f20857a;
    public TLRPC.TL_theme f20858b;
    public TLRPC.TL_chatThemeUniqueGift f20859c;
    public int d;
    public int e = -1;
    public SparseIntArray f20860f;
    public String f20861g;
    public int h;
    public int f20862i;
    public int f20863j;
    public int f20864k;
    public int f20865l;
    public int f20866m;
    public int f20867n;
    public int f20868o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f20858b;
        if (tL_theme != null) {
            return tL_theme.f20480id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20859c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f20858b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20859c;
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
