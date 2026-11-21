package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class r3 implements ig.a {
    public l6 f29955a;
    public TLRPC.TL_theme f29956b;
    public TLRPC.TL_chatThemeUniqueGift f29957c;
    public int d;
    public int f29958e = -1;
    public SparseIntArray f29959f;
    public String f29960g;
    public int h;
    public int f29961i;
    public int f29962j;
    public int f29963k;
    public int f29964l;
    public int f29965m;
    public int f29966n;
    public int f29967o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f29956b;
        if (tL_theme != null) {
            return tL_theme.f28570id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f29957c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i7) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f29956b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f29957c;
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
