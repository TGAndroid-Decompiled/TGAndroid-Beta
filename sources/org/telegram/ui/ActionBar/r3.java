package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class r3 implements ig.a {
    public l6 f29924a;
    public TLRPC.TL_theme f29925b;
    public TLRPC.TL_chatThemeUniqueGift f29926c;
    public int d;
    public int f29927e = -1;
    public SparseIntArray f29928f;
    public String f29929g;
    public int h;
    public int f29930i;
    public int f29931j;
    public int f29932k;
    public int f29933l;
    public int f29934m;
    public int f29935n;
    public int f29936o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f29925b;
        if (tL_theme != null) {
            return tL_theme.f28537id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f29926c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i7) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f29925b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f29926c;
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
