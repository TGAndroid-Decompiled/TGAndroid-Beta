package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e4 implements gg.a {
    public j6 f20858a;
    public TLRPC.TL_theme f20859b;
    public TLRPC.TL_chatThemeUniqueGift f20860c;
    public int d;
    public int e = -1;
    public SparseIntArray f20861f;
    public String f20862g;
    public int h;
    public int f20863i;
    public int f20864j;
    public int f20865k;
    public int f20866l;
    public int f20867m;
    public int f20868n;
    public int f20869o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f20859b;
        if (tL_theme != null) {
            return tL_theme.f20481id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20860c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f20859b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f20860c;
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
