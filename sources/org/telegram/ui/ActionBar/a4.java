package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a4 implements fg.a {
    public g6 f18726a;
    public TLRPC.TL_theme f18727b;
    public TLRPC.TL_chatThemeUniqueGift f18728c;
    public int d;
    public int e = -1;
    public SparseIntArray f18729f;
    public String f18730g;
    public int h;
    public int f18731i;
    public int f18732j;
    public int f18733k;
    public int f18734l;
    public int f18735m;
    public int f18736n;
    public int f18737o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f18727b;
        if (tL_theme != null) {
            return tL_theme.f18489id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18728c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f18727b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18728c;
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
