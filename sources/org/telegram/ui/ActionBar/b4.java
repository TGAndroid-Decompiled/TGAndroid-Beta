package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b4 implements gg.a {
    public g6 f20695a;
    public TLRPC.TL_theme f20696b;
    public TLRPC.TL_chatThemeUniqueGift f20697c;
    public int d;
    public int e = -1;
    public SparseIntArray f20698f;
    public String f20699g;
    public int h;
    public int f20700i;
    public int f20701j;
    public int f20702k;
    public int f20703l;
    public int f20704m;
    public int f20705n;
    public int f20706o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f20696b;
        if (tL_theme != null) {
            return tL_theme.f20416id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20697c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f20696b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20697c;
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
