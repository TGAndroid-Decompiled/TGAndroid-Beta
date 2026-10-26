package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class mt extends org.telegram.ui.Components.lm0 {
    public final Context f41654c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f41655f = new ArrayList();
    public final ot h;

    public mt(ot otVar, Context context, HashMap hashMap) {
        this.h = otVar;
        this.f41654c = context;
        for (List<jt> list : hashMap.values()) {
            for (jt jtVar : list) {
                this.f41655f.add(jtVar);
            }
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
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
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        jt jtVar = (jt) this.e.get(i10);
        org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) e1Var.f47738a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(ot.W(jtVar), gaVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + jtVar.f40745c;
        } else {
            str = null;
        }
        gaVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new s4.e1(ot.V(this.f41654c));
    }
}
