package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class s3 implements ig.a {
    public m6 f29974a;
    public TLRPC.TL_theme f29975b;
    public TLRPC.TL_chatThemeUniqueGift f29976c;
    public int d;
    public int f29977e = -1;
    public SparseIntArray f29978f;
    public String f29979g;
    public int h;
    public int f29980i;
    public int f29981j;
    public int f29982k;
    public int f29983l;
    public int f29984m;
    public int f29985n;
    public int f29986o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f29975b;
        if (tL_theme != null) {
            return tL_theme.f28544id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f29976c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i7) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f29975b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f29976c;
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
