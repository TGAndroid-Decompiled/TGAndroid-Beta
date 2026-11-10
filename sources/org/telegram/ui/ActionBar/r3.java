package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class r3 implements ig.a {
    public l6 f28465a;
    public TLRPC.TL_theme f28466b;
    public TLRPC.TL_chatThemeUniqueGift f28467c;
    public int d;
    public int f28468e = -1;
    public SparseIntArray f28469f;
    public String f28470g;
    public int h;
    public int f28471i;
    public int f28472j;
    public int f28473k;
    public int f28474l;
    public int f28475m;
    public int f28476n;
    public int f28477o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f28466b;
        if (tL_theme != null) {
            return tL_theme.f27099id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f28467c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i7) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f28466b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f28467c;
            if (tL_chatThemeUniqueGift != null) {
                arrayList = tL_chatThemeUniqueGift.theme_settings;
            }
            return null;
        }
        if (arrayList != null && i7 >= 0 && arrayList.size() > i7) {
            return arrayList.get(i7);
        }
        return null;
    }
}
