package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class s3 implements ig.a {
    public m6 f29972a;
    public TLRPC.TL_theme f29973b;
    public TLRPC.TL_chatThemeUniqueGift f29974c;
    public int d;
    public int f29975e = -1;
    public SparseIntArray f29976f;
    public String f29977g;
    public int h;
    public int f29978i;
    public int f29979j;
    public int f29980k;
    public int f29981l;
    public int f29982m;
    public int f29983n;
    public int f29984o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f29973b;
        if (tL_theme != null) {
            return tL_theme.f28542id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f29974c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i7) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f29973b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f29974c;
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
