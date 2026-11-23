package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class c1 extends v4.u {
    public final h1 S;

    public c1(h1 h1Var) {
        super(true);
        this.S = h1Var;
    }

    @Override
    public final boolean B1(int i7) {
        byte b10;
        h1 h1Var = this.S;
        ArrayList<TL_iv.PageBlock> arrayList = h1Var.f48201s.items;
        org.telegram.messenger.yi yiVar = (org.telegram.messenger.yi) h1Var.f48202w.f47904b.get(arrayList.get((arrayList.size() - i7) - 1));
        if (yiVar.f28092a != yiVar.f28093b && (b10 = yiVar.f28094c) == yiVar.d && b10 != 0) {
            int size = h1Var.f48202w.f47903a.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.yi yiVar2 = (org.telegram.messenger.yi) h1Var.f48202w.f47903a.get(i10);
                if (yiVar2 != yiVar) {
                    byte b11 = yiVar2.f28094c;
                    byte b12 = yiVar.f28094c;
                    if (b11 <= b12 && yiVar2.d >= b12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean C1(View view) {
        return false;
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
