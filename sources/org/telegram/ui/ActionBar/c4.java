package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c4 implements fg.a {
    public h6 f18546a;
    public TLRPC.TL_theme f18547b;
    public TLRPC.TL_chatThemeUniqueGift f18548c;
    public int d;
    public int e = -1;
    public SparseIntArray f18549f;
    public String f18550g;
    public int h;
    public int f18551i;
    public int f18552j;
    public int f18553k;
    public int f18554l;
    public int f18555m;
    public int f18556n;
    public int f18557o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f18547b;
        if (tL_theme != null) {
            return tL_theme.f18246id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18548c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f18547b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18548c;
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
