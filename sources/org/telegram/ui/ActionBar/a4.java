package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a4 implements fg.a {
    public g6 f18695a;
    public TLRPC.TL_theme f18696b;
    public TLRPC.TL_chatThemeUniqueGift f18697c;
    public int d;
    public int e = -1;
    public SparseIntArray f18698f;
    public String f18699g;
    public int h;
    public int f18700i;
    public int f18701j;
    public int f18702k;
    public int f18703l;
    public int f18704m;
    public int f18705n;
    public int f18706o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f18696b;
        if (tL_theme != null) {
            return tL_theme.f18458id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18697c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f18696b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18697c;
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
