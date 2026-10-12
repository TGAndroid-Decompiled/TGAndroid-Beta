package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a4 implements fg.a {
    public g6 f20191a;
    public TLRPC.TL_theme f20192b;
    public TLRPC.TL_chatThemeUniqueGift f20193c;
    public int d;
    public int f20194e = -1;
    public SparseIntArray f20195f;
    public String f20196g;
    public int h;
    public int f20197i;
    public int f20198j;
    public int f20199k;
    public int f20200l;
    public int f20201m;
    public int f20202n;
    public int f20203o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f20192b;
        if (tL_theme != null) {
            return tL_theme.f19940id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20193c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f20192b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20193c;
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
