package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x3 implements yf.a {
    public s6 f21515a;
    public TLRPC.TL_theme f21516b;
    public TLRPC.TL_chatThemeUniqueGift f21517c;
    public int d;
    public int e = -1;
    public SparseIntArray f21518f;
    public String f21519g;
    public int h;
    public int f21520i;
    public int f21521j;
    public int f21522k;
    public int f21523l;
    public int f21524m;
    public int f21525n;
    public int f21526o;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.f21516b;
        if (tL_theme != null) {
            return tL_theme.f19932id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f21517c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i10) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.f21516b;
        if (tL_theme != null) {
            arrayList = tL_theme.settings;
        } else {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.f21517c;
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
