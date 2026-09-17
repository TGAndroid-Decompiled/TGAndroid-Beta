package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d4 implements fg.a {
    public i6 f18574a;
    public TLRPC.TL_theme f18575b;
    public TLRPC.TL_chatThemeUniqueGift f18576c;
    public int d;
    public int e = -1;
    public SparseIntArray f18577f;
    public String f18578g;
    public int h;
    public int f18579i;
    public int f18580j;
    public int f18581k;
    public int f18582l;
    public int f18583m;
    public int f18584n;
    public int f18585o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f18575b;
        if (tL_theme != null) {
            return tL_theme.f18258id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18576c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f18575b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18576c;
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
