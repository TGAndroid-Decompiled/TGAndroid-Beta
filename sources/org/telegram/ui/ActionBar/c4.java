package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c4 implements fg.a {
    public i6 f18733a;
    public TLRPC.TL_theme f18734b;
    public TLRPC.TL_chatThemeUniqueGift f18735c;
    public int d;
    public int e = -1;
    public SparseIntArray f18736f;
    public String f18737g;
    public int h;
    public int f18738i;
    public int f18739j;
    public int f18740k;
    public int f18741l;
    public int f18742m;
    public int f18743n;
    public int f18744o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f18734b;
        if (tL_theme != null) {
            return tL_theme.f18433id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18735c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f18734b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18735c;
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
