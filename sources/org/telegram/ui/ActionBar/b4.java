package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b4 implements fg.a {
    public h6 f20454a;
    public TLRPC.TL_theme f20455b;
    public TLRPC.TL_chatThemeUniqueGift f20456c;
    public int d;
    public int f20457e = -1;
    public SparseIntArray f20458f;
    public String f20459g;
    public int h;
    public int f20460i;
    public int f20461j;
    public int f20462k;
    public int f20463l;
    public int f20464m;
    public int f20465n;
    public int f20466o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f20455b;
        if (tL_theme != null) {
            return tL_theme.f20179id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20456c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f20455b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20456c;
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
