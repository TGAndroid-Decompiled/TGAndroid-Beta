package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class q3 implements ig.a {
    public j6 f28399a;
    public TLRPC.TL_theme f28400b;
    public TLRPC.TL_chatThemeUniqueGift f28401c;
    public int d;
    public int f28402e = -1;
    public SparseIntArray f28403f;
    public String f28404g;
    public int h;
    public int f28405i;
    public int f28406j;
    public int f28407k;
    public int f28408l;
    public int f28409m;
    public int f28410n;
    public int f28411o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f28400b;
        if (tL_theme != null) {
            return tL_theme.f27091id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f28401c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i7) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f28400b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f28401c;
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
