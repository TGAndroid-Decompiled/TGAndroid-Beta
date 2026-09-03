package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d4 implements sf.a {
    public i6 f19596a;
    public TLRPC.TL_theme f19597b;
    public TLRPC.TL_chatThemeUniqueGift f19598c;
    public int d;
    public int e = -1;
    public SparseIntArray f19599f;
    public String f19600g;
    public int h;
    public int f19601i;
    public int f19602j;
    public int f19603k;
    public int f19604l;
    public int f19605m;
    public int f19606n;
    public int f19607o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f19597b;
        if (tL_theme != null) {
            return tL_theme.f19296id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f19598c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f19597b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f19598c;
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
