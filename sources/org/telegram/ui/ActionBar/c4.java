package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c4 implements gg.a {
    public i6 f20343a;
    public TLRPC.TL_theme f20344b;
    public TLRPC.TL_chatThemeUniqueGift f20345c;
    public int d;
    public int f20346e = -1;
    public SparseIntArray f20347f;
    public String f20348g;
    public int h;
    public int f20349i;
    public int f20350j;
    public int f20351k;
    public int f20352l;
    public int f20353m;
    public int f20354n;
    public int f20355o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f20344b;
        if (tL_theme != null) {
            return tL_theme.f20033id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20345c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f20344b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20345c;
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
