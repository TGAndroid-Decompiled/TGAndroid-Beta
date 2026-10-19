package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class mt extends org.telegram.ui.Components.hm0 {
    public final Context f39345c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f39346f = new ArrayList();
    public final ot h;

    public mt(ot otVar, Context context, HashMap hashMap) {
        this.h = otVar;
        this.f39345c = context;
        for (List<ht> list : hashMap.values()) {
            for (ht htVar : list) {
                this.f39346f.add(htVar);
            }
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
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
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        ht htVar = (ht) this.e.get(i10);
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) b1Var.f45910a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(ot.V(htVar), baVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + htVar.f37808c;
        } else {
            str = null;
        }
        baVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(ot.U(this.f39345c));
    }
}
