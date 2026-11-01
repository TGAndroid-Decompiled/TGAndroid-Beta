package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x3 implements yf.a {
    public s6 f21516a;
    public TLRPC.TL_theme f21517b;
    public TLRPC.TL_chatThemeUniqueGift f21518c;
    public int d;
    public int e = -1;
    public SparseIntArray f21519f;
    public String f21520g;
    public int h;
    public int f21521i;
    public int f21522j;
    public int f21523k;
    public int f21524l;
    public int f21525m;
    public int f21526n;
    public int f21527o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f21517b;
        if (tL_theme != null) {
            return tL_theme.f19933id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f21518c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f21517b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f21518c;
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
