package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b4 implements fg.a {
    public g6 f18486a;
    public TLRPC.TL_theme f18487b;
    public TLRPC.TL_chatThemeUniqueGift f18488c;
    public int d;
    public int e = -1;
    public SparseIntArray f18489f;
    public String f18490g;
    public int h;
    public int f18491i;
    public int f18492j;
    public int f18493k;
    public int f18494l;
    public int f18495m;
    public int f18496n;
    public int f18497o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f18487b;
        if (tL_theme != null) {
            return tL_theme.f18220id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18488c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f18487b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f18488c;
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
