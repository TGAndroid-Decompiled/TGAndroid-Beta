package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e4 implements tf.a {
    public j6 f21310a;
    public TLRPC.TL_theme f21311b;
    public TLRPC.TL_chatThemeUniqueGift f21312c;
    public int d;
    public int f21313e = -1;
    public SparseIntArray f21314f;
    public String f21315g;
    public int h;
    public int f21316i;
    public int f21317j;
    public int f21318k;
    public int f21319l;
    public int f21320m;
    public int f21321n;
    public int f21322o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f21311b;
        if (tL_theme != null) {
            return tL_theme.f20980id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f21312c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f21311b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f21312c;
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
