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
        ArrayList<TL_iv.PageBlock> arrayList = j1Var.f38410s.items;
        org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) j1Var.f38411w.f38080b.get(arrayList.get((arrayList.size() - i10) - 1));
        if (bjVar.f14775a != bjVar.f14776b && (b10 = bjVar.f14777c) == bjVar.d && b10 != 0) {
            int size = j1Var.f38411w.f38079a.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.messenger.bj bjVar2 = (org.telegram.messenger.bj) j1Var.f38411w.f38079a.get(i11);
                if (bjVar2 != bjVar) {
                    byte b11 = bjVar2.f14777c;
                    byte b12 = bjVar.f14777c;
                    if (b11 <= b12 && bjVar2.d >= b12) {
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
