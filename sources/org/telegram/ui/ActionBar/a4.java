package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a4 implements fg.a {
    public g6 f20453a;
    public TLRPC.TL_theme f20454b;
    public TLRPC.TL_chatThemeUniqueGift f20455c;
    public int d;
    public int f20456e = -1;
    public SparseIntArray f20457f;
    public String f20458g;
    public int h;
    public int f20459i;
    public int f20460j;
    public int f20461k;
    public int f20462l;
    public int f20463m;
    public int f20464n;
    public int f20465o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f20454b;
        if (tL_theme != null) {
            return tL_theme.f20205id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20455c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f20454b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20455c;
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
