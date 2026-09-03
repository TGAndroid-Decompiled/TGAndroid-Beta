package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e4 implements tf.a {
    public j6 f21312a;
    public TLRPC.TL_theme f21313b;
    public TLRPC.TL_chatThemeUniqueGift f21314c;
    public int d;
    public int f21315e = -1;
    public SparseIntArray f21316f;
    public String f21317g;
    public int h;
    public int f21318i;
    public int f21319j;
    public int f21320k;
    public int f21321l;
    public int f21322m;
    public int f21323n;
    public int f21324o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f21313b;
        if (tL_theme != null) {
            return tL_theme.f20982id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f21314c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f21313b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f21314c;
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
