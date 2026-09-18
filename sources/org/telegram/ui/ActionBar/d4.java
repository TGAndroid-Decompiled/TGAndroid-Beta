package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d4 implements fg.a {
    public i6 f18575a;
    public TLRPC.TL_theme f18576b;
    public TLRPC.TL_chatThemeUniqueGift f18577c;
    public int d;
    public int e = -1;
    public SparseIntArray f18578f;
    public String f18579g;
    public int h;
    public int f18580i;
    public int f18581j;
    public int f18582k;
    public int f18583l;
    public int f18584m;
    public int f18585n;
    public int f18586o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f18576b;
        if (tL_theme != null) {
            return tL_theme.f18258id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18577c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f18576b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18577c;
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
