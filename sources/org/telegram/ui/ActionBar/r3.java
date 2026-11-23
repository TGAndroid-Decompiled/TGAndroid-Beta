package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class r3 implements ig.a {
    public l6 f29958a;
    public TLRPC.TL_theme f29959b;
    public TLRPC.TL_chatThemeUniqueGift f29960c;
    public int d;
    public int f29961e = -1;
    public SparseIntArray f29962f;
    public String f29963g;
    public int h;
    public int f29964i;
    public int f29965j;
    public int f29966k;
    public int f29967l;
    public int f29968m;
    public int f29969n;
    public int f29970o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f29959b;
        if (tL_theme != null) {
            return tL_theme.f28573id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f29960c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i7) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f29959b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f29960c;
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
