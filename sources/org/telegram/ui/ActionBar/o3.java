package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class o3 implements ig.a {
    public i6 f29436a;
    public TLRPC.TL_theme f29437b;
    public TLRPC.TL_chatThemeUniqueGift f29438c;
    public int d;
    public int f29439e = -1;
    public SparseIntArray f29440f;
    public String f29441g;
    public int h;
    public int f29442i;
    public int f29443j;
    public int f29444k;
    public int f29445l;
    public int f29446m;
    public int f29447n;
    public int f29448o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f29437b;
        if (tL_theme != null) {
            return tL_theme.f28190id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f29438c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i7) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f29437b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f29438c;
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
