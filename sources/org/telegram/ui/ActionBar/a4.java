package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a4 implements fg.a {
    public g6 f20190a;
    public TLRPC.TL_theme f20191b;
    public TLRPC.TL_chatThemeUniqueGift f20192c;
    public int d;
    public int f20193e = -1;
    public SparseIntArray f20194f;
    public String f20195g;
    public int h;
    public int f20196i;
    public int f20197j;
    public int f20198k;
    public int f20199l;
    public int f20200m;
    public int f20201n;
    public int f20202o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f20191b;
        if (tL_theme != null) {
            return tL_theme.f19939id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20192c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f20191b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20192c;
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
