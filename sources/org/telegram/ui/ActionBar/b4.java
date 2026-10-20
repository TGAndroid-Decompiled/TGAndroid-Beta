package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b4 implements gg.a {
    public g6 f20692a;
    public TLRPC.TL_theme f20693b;
    public TLRPC.TL_chatThemeUniqueGift f20694c;
    public int d;
    public int e = -1;
    public SparseIntArray f20695f;
    public String f20696g;
    public int h;
    public int f20697i;
    public int f20698j;
    public int f20699k;
    public int f20700l;
    public int f20701m;
    public int f20702n;
    public int f20703o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f20693b;
        if (tL_theme != null) {
            return tL_theme.f20413id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20694c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f20693b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20694c;
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
