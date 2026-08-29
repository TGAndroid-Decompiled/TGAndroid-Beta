package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a4 implements qf.a {
    public f6 f22730a;
    public TLRPC.TL_theme f22731b;
    public TLRPC.TL_chatThemeUniqueGift f22732c;
    public int d;
    public int f22733e = -1;
    public SparseIntArray f22734f;
    public String f22735g;
    public int h;
    public int f22736i;
    public int f22737j;
    public int f22738k;
    public int f22739l;
    public int f22740m;
    public int f22741n;
    public int f22742o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f22731b;
        if (tL_theme != null) {
            return tL_theme.f22529id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f22732c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f22731b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f22732c;
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
