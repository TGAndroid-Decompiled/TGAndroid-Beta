package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c4 implements gg.a {
    public i6 f20316a;
    public TLRPC.TL_theme f20317b;
    public TLRPC.TL_chatThemeUniqueGift f20318c;
    public int d;
    public int f20319e = -1;
    public SparseIntArray f20320f;
    public String f20321g;
    public int h;
    public int f20322i;
    public int f20323j;
    public int f20324k;
    public int f20325l;
    public int f20326m;
    public int f20327n;
    public int f20328o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f20317b;
        if (tL_theme != null) {
            return tL_theme.f20006id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20318c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f20317b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20318c;
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
