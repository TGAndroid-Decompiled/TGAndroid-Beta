package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class e1 extends s4.s {
    public final j1 S;

    public e1(j1 j1Var) {
        super(true);
        this.S = j1Var;
    }

    @Override
    public final boolean B1(int i10) {
        byte b10;
        j1 j1Var = this.S;
        ArrayList<TL_iv.PageBlock> arrayList = j1Var.f38247s.items;
        org.telegram.messenger.cj cjVar = (org.telegram.messenger.cj) j1Var.f38248w.f37922b.get(arrayList.get((arrayList.size() - i10) - 1));
        if (cjVar.f15158a != cjVar.f15159b && (b10 = cjVar.f15160c) == cjVar.d && b10 != 0) {
            int size = j1Var.f38248w.f37921a.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.messenger.cj cjVar2 = (org.telegram.messenger.cj) j1Var.f38248w.f37921a.get(i11);
                if (cjVar2 != cjVar) {
                    byte b11 = cjVar2.f15160c;
                    byte b12 = cjVar.f15160c;
                    if (b11 <= b12 && cjVar2.d >= b12) {
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
