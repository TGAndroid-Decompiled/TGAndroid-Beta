package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class a4 implements of.a {

    public f6 f22710a;

    public TLRPC.TL_theme f22711b;

    public TLRPC.TL_chatThemeUniqueGift f22712c;
    public int d;

    public int f22713e = -1;

    public SparseIntArray f22714f;

    public String f22715g;
    public int h;

    public int f22716i;

    public int f22717j;

    public int f22718k;

    public int f22719l;

    public int f22720m;

    public int f22721n;

    public int f22722o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f22711b;
        if (tL_theme != null) {
            return tL_theme.f22517id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f22712c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f22711b;
        if (tL_theme == null) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f22712c;
            if (tL_chatThemeUniqueGift != null) {
                arrayList = tL_chatThemeUniqueGift.theme_settings;
            }
            return null;
        }
        arrayList = tL_theme.settings;
        if (arrayList != null && i10 >= 0 && arrayList.size() > i10) {
            return arrayList.get(i10);
        }
        return null;
    }
}
