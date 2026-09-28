package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a4 implements fg.a {
    public g6 f18710a;
    public TLRPC.TL_theme f18711b;
    public TLRPC.TL_chatThemeUniqueGift f18712c;
    public int d;
    public int e = -1;
    public SparseIntArray f18713f;
    public String f18714g;
    public int h;
    public int f18715i;
    public int f18716j;
    public int f18717k;
    public int f18718l;
    public int f18719m;
    public int f18720n;
    public int f18721o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f18711b;
        if (tL_theme != null) {
            return tL_theme.f18473id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18712c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f18711b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18712c;
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
