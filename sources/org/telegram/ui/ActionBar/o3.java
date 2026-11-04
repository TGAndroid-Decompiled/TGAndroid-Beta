package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class o3 implements jg.a {
    public j6 f28382a;
    public TLRPC.TL_theme f28383b;
    public TLRPC.TL_chatThemeUniqueGift f28384c;
    public int d;
    public int f28385e = -1;
    public SparseIntArray f28386f;
    public String f28387g;
    public int h;
    public int f28388i;
    public int f28389j;
    public int f28390k;
    public int f28391l;
    public int f28392m;
    public int f28393n;
    public int f28394o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f28383b;
        if (tL_theme != null) {
            return tL_theme.f27140id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f28384c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i3) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f28383b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f28384c;
            if (tL_chatThemeUniqueGift != null) {
                arrayList = tL_chatThemeUniqueGift.theme_settings;
            }
            return null;
        }
        if (arrayList != null && i3 >= 0 && arrayList.size() > i3) {
            return arrayList.get(i3);
        }
        return null;
    }
}
