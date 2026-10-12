package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class au extends org.telegram.ui.Components.vm0 {
    public final Context f35977c;
    public Timer d;
    public ArrayList f35978e;
    public final ArrayList f35979f = new ArrayList();
    public final cu h;

    public au(cu cuVar, Context context, HashMap hashMap) {
        this.h = cuVar;
        this.f35977c = context;
        for (List<xt> list : hashMap.values()) {
            for (xt xtVar : list) {
                this.f35979f.add(xtVar);
            }
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f35978e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        String str;
        xt xtVar = (xt) this.f35978e.get(i10);
        org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) d1Var.f47889a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(cu.V(xtVar), caVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + xtVar.f44158c;
        } else {
            str = null;
        }
        caVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(cu.U(this.f35977c));
    }
}
