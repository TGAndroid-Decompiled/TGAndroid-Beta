package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a4 implements nf.a {
    public e6 f22714a;
    public TLRPC.TL_theme f22715b;
    public TLRPC.TL_chatThemeUniqueGift f22716c;
    public int d;
    public int f22717e = -1;
    public SparseIntArray f22718f;
    public String f22719g;
    public int h;
    public int f22720i;
    public int f22721j;
    public int f22722k;
    public int f22723l;
    public int f22724m;
    public int f22725n;
    public int f22726o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f22715b;
        if (tL_theme != null) {
            return tL_theme.f22517id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f22716c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i9) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f22715b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f22716c;
            if (tL_chatThemeUniqueGift != null) {
                arrayList = tL_chatThemeUniqueGift.theme_settings;
            }
            return null;
        }
        if (arrayList != null && i9 >= 0 && arrayList.size() > i9) {
            return arrayList.get(i9);
        }
        return null;
    }
}
