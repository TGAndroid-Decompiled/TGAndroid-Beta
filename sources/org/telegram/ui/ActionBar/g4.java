package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class g4 implements hg.a {
    public x6 f22650a;
    public TLRPC.TL_theme f22651b;
    public TLRPC.TL_chatThemeUniqueGift f22652c;
    public int d;
    public int e = -1;
    public SparseIntArray f22653f;
    public String f22654g;
    public int h;
    public int f22655i;
    public int f22656j;
    public int f22657k;
    public int f22658l;
    public int f22659m;
    public int f22660n;
    public int f22661o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f22651b;
        if (tL_theme != null) {
            return tL_theme.f22166id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f22652c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f22651b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f22652c;
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
