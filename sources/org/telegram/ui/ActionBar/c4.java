package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c4 implements fg.a {
    public i6 f18765a;
    public TLRPC.TL_theme f18766b;
    public TLRPC.TL_chatThemeUniqueGift f18767c;
    public int d;
    public int e = -1;
    public SparseIntArray f18768f;
    public String f18769g;
    public int h;
    public int f18770i;
    public int f18771j;
    public int f18772k;
    public int f18773l;
    public int f18774m;
    public int f18775n;
    public int f18776o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f18766b;
        if (tL_theme != null) {
            return tL_theme.f18465id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18767c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f18766b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18767c;
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
