package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class au extends org.telegram.ui.Components.ll0 {
    public final Context f31979c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f31980f = new ArrayList();
    public final cu h;

    public au(cu cuVar, Context context, HashMap hashMap) {
        this.h = cuVar;
        this.f31979c = context;
        for (List<xt> list : hashMap.values()) {
            for (xt xtVar : list) {
                this.f31980f.add(xtVar);
            }
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.e;
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
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        xt xtVar = (xt) this.e.get(i10);
        org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) c1Var.f42697a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(cu.V(xtVar), eaVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + xtVar.f39697c;
        } else {
            str = null;
        }
        eaVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(cu.U(this.f31979c));
    }
}
