package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class du extends org.telegram.ui.Components.lm0 {
    public final Context f35138c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f35139f = new ArrayList();
    public final fu h;

    public du(fu fuVar, Context context, HashMap hashMap) {
        this.h = fuVar;
        this.f35138c = context;
        for (List<au> list : hashMap.values()) {
            for (au auVar : list) {
                this.f35139f.add(auVar);
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
        au auVar = (au) this.e.get(i10);
        org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) b1Var.f44838a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(fu.V(auVar), caVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + auVar.f34086c;
        } else {
            str = null;
        }
        caVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(fu.U(this.f35138c));
    }
}
