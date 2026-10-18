package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class ot extends org.telegram.ui.Components.hm0 {
    public final Context f39901c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f39902f = new ArrayList();
    public final qt h;

    public ot(qt qtVar, Context context, HashMap hashMap) {
        this.h = qtVar;
        this.f39901c = context;
        for (List<kt> list : hashMap.values()) {
            for (kt ktVar : list) {
                this.f39902f.add(ktVar);
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
        kt ktVar = (kt) this.e.get(i10);
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) b1Var.f45958a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(qt.V(ktVar), baVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + ktVar.f38671c;
        } else {
            str = null;
        }
        baVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(qt.U(this.f39901c));
    }
}
