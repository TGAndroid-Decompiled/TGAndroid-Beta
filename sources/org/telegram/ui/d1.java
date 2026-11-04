package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class d1 extends u4.t {
    public final i1 S;

    public d1(i1 i1Var) {
        super(true);
        this.S = i1Var;
    }

    @Override
    public final boolean B1(int i3) {
        byte b10;
        i1 i1Var = this.S;
        ArrayList<TL_iv.PageBlock> arrayList = i1Var.f46030s.items;
        org.telegram.messenger.ri riVar = (org.telegram.messenger.ri) i1Var.f46031w.f45773b.get(arrayList.get((arrayList.size() - i3) - 1));
        if (riVar.f25140a != riVar.f25141b && (b10 = riVar.f25142c) == riVar.d && b10 != 0) {
            int size = i1Var.f46031w.f45772a.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.ri riVar2 = (org.telegram.messenger.ri) i1Var.f46031w.f45772a.get(i10);
                if (riVar2 != riVar) {
                    byte b11 = riVar2.f25142c;
                    byte b12 = riVar.f25142c;
                    if (b11 <= b12 && riVar2.d >= b12) {
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
