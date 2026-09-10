package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e4 implements eg.a {
    public i6 f17670a;
    public TLRPC.TL_theme f17671b;
    public TLRPC.TL_chatThemeUniqueGift f17672c;
    public int d;
    public int e = -1;
    public SparseIntArray f17673f;
    public String f17674g;
    public int h;
    public int f17675i;
    public int f17676j;
    public int f17677k;
    public int f17678l;
    public int f17679m;
    public int f17680n;
    public int f17681o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f17671b;
        if (tL_theme != null) {
            return tL_theme.f17332id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f17672c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f17671b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f17672c;
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
