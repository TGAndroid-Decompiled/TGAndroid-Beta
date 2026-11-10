package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class c1 extends v4.t {
    public final h1 S;

    public c1(h1 h1Var) {
        super(true);
        this.S = h1Var;
    }

    @Override
    public final boolean B1(int i7) {
        byte b10;
        h1 h1Var = this.S;
        ArrayList<TL_iv.PageBlock> arrayList = h1Var.f46198s.items;
        org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) h1Var.f46199w.f45903b.get(arrayList.get((arrayList.size() - i7) - 1));
        if (ajVar.f21446a != ajVar.f21447b && (b10 = ajVar.f21448c) == ajVar.d && b10 != 0) {
            int size = h1Var.f46199w.f45902a.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.aj ajVar2 = (org.telegram.messenger.aj) h1Var.f46199w.f45902a.get(i10);
                if (ajVar2 != ajVar) {
                    byte b11 = ajVar2.f21448c;
                    byte b12 = ajVar.f21448c;
                    if (b11 <= b12 && ajVar2.d >= b12) {
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
