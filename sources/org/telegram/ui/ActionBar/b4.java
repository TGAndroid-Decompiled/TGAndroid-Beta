package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b4 implements fg.a {
    public h6 f20459a;
    public TLRPC.TL_theme f20460b;
    public TLRPC.TL_chatThemeUniqueGift f20461c;
    public int d;
    public int f20462e = -1;
    public SparseIntArray f20463f;
    public String f20464g;
    public int h;
    public int f20465i;
    public int f20466j;
    public int f20467k;
    public int f20468l;
    public int f20469m;
    public int f20470n;
    public int f20471o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f20460b;
        if (tL_theme != null) {
            return tL_theme.f20184id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20461c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f20460b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20461c;
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
