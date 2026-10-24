package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class pt extends org.telegram.ui.Components.km0 {
    public final Context f40630c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f40631f = new ArrayList();
    public final rt h;

    public pt(rt rtVar, Context context, HashMap hashMap) {
        this.h = rtVar;
        this.f40630c = context;
        for (List<lt> list : hashMap.values()) {
            for (lt ltVar : list) {
                this.f40631f.add(ltVar);
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
        lt ltVar = (lt) this.e.get(i10);
        org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) b1Var.f46342a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(rt.V(ltVar), caVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + ltVar.f39377c;
        } else {
            str = null;
        }
        caVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(rt.U(this.f40630c));
    }
}
