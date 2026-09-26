package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a4 implements fg.a {
    public g6 f18709a;
    public TLRPC.TL_theme f18710b;
    public TLRPC.TL_chatThemeUniqueGift f18711c;
    public int d;
    public int e = -1;
    public SparseIntArray f18712f;
    public String f18713g;
    public int h;
    public int f18714i;
    public int f18715j;
    public int f18716k;
    public int f18717l;
    public int f18718m;
    public int f18719n;
    public int f18720o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f18710b;
        if (tL_theme != null) {
            return tL_theme.f18472id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18711c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f18710b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18711c;
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
