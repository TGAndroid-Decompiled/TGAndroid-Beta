package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a4 implements gg.a {
    public f6 f19296a;
    public TLRPC.TL_theme f19297b;
    public TLRPC.TL_chatThemeUniqueGift f19298c;
    public int d;
    public int e = -1;
    public SparseIntArray f19299f;
    public String f19300g;
    public int h;
    public int f19301i;
    public int f19302j;
    public int f19303k;
    public int f19304l;
    public int f19305m;
    public int f19306n;
    public int f19307o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f19297b;
        if (tL_theme != null) {
            return tL_theme.f19053id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f19298c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f19297b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f19298c;
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
