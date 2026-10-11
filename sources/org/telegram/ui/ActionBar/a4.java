package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a4 implements fg.a {
    public g6 f20417a;
    public TLRPC.TL_theme f20418b;
    public TLRPC.TL_chatThemeUniqueGift f20419c;
    public int d;
    public int f20420e = -1;
    public SparseIntArray f20421f;
    public String f20422g;
    public int h;
    public int f20423i;
    public int f20424j;
    public int f20425k;
    public int f20426l;
    public int f20427m;
    public int f20428n;
    public int f20429o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f20418b;
        if (tL_theme != null) {
            return tL_theme.f20169id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20419c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f20418b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20419c;
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
