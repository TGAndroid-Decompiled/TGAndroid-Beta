package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class ot extends org.telegram.ui.Components.mm0 {
    public final Context f42186c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f42187f = new ArrayList();
    public final qt h;

    public ot(qt qtVar, Context context, HashMap hashMap) {
        this.h = qtVar;
        this.f42186c = context;
        for (List<lt> list : hashMap.values()) {
            for (lt ltVar : list) {
                this.f42187f.add(ltVar);
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
        lt ltVar = (lt) this.e.get(i10);
        org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) e1Var.f47773a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(qt.W(ltVar), gaVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + ltVar.f41260c;
        } else {
            str = null;
        }
        gaVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new s4.e1(qt.V(this.f42186c));
    }
}
