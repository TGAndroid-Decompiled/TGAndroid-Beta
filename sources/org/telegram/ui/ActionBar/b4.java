package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b4 implements gg.a {
    public g6 f20689a;
    public TLRPC.TL_theme f20690b;
    public TLRPC.TL_chatThemeUniqueGift f20691c;
    public int d;
    public int e = -1;
    public SparseIntArray f20692f;
    public String f20693g;
    public int h;
    public int f20694i;
    public int f20695j;
    public int f20696k;
    public int f20697l;
    public int f20698m;
    public int f20699n;
    public int f20700o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f20690b;
        if (tL_theme != null) {
            return tL_theme.f20410id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20691c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f20690b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20691c;
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
