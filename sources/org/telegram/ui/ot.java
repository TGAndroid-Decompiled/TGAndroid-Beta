package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class ot extends org.telegram.ui.Components.vk0 {
    public final Context f41237c;
    public Timer d;
    public ArrayList f41238e;
    public final ArrayList f41239f = new ArrayList();
    public final qt h;

    public ot(qt qtVar, Context context, HashMap hashMap) {
        this.h = qtVar;
        this.f41237c = context;
        for (List<lt> list : hashMap.values()) {
            for (lt ltVar : list) {
                this.f41239f.add(ltVar);
            }
        }
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f41238e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i9) {
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        lt ltVar = (lt) this.f41238e.get(i9);
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) q1Var.f5501a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(qt.U(ltVar), baVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + ltVar.f40227c;
        } else {
            str = null;
        }
        baVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new f2.q1(qt.T(this.f41237c));
    }
}
