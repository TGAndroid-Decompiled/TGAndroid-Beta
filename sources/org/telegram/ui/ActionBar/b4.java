package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b4 implements gg.a {
    public g6 f20688a;
    public TLRPC.TL_theme f20689b;
    public TLRPC.TL_chatThemeUniqueGift f20690c;
    public int d;
    public int e = -1;
    public SparseIntArray f20691f;
    public String f20692g;
    public int h;
    public int f20693i;
    public int f20694j;
    public int f20695k;
    public int f20696l;
    public int f20697m;
    public int f20698n;
    public int f20699o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f20689b;
        if (tL_theme != null) {
            return tL_theme.f20409id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20690c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f20689b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20690c;
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
