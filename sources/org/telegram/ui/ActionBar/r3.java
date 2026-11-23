package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class r3 implements ig.a {
    public m6 f30020a;
    public TLRPC.TL_theme f30021b;
    public TLRPC.TL_chatThemeUniqueGift f30022c;
    public int d;
    public int f30023e = -1;
    public SparseIntArray f30024f;
    public String f30025g;
    public int h;
    public int f30026i;
    public int f30027j;
    public int f30028k;
    public int f30029l;
    public int f30030m;
    public int f30031n;
    public int f30032o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f30021b;
        if (tL_theme != null) {
            return tL_theme.f28631id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f30022c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i7) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f30021b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f30022c;
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
