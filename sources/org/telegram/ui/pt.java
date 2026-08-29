package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class pt extends org.telegram.ui.Components.il0 {
    public final Context f41459c;
    public Timer d;
    public ArrayList f41460e;
    public final ArrayList f41461f = new ArrayList();
    public final rt h;

    public pt(rt rtVar, Context context, HashMap hashMap) {
        this.h = rtVar;
        this.f41459c = context;
        for (List<lt> list : hashMap.values()) {
            for (lt ltVar : list) {
                this.f41461f.add(ltVar);
            }
        }
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f41460e;
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
    public final void v(f2.n1 n1Var, int i10) {
        String str;
        lt ltVar = (lt) this.f41460e.get(i10);
        org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) n1Var.f6432a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(rt.V(ltVar), y9Var.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + ltVar.f40274c;
        } else {
            str = null;
        }
        y9Var.c(replaceEmoji, str, false, false);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new f2.n1(rt.U(this.f41459c));
    }
}
