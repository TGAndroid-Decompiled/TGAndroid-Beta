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
        ArrayList<TL_iv.PageBlock> arrayList = h1Var.f48192s.items;
        org.telegram.messenger.xi xiVar = (org.telegram.messenger.xi) h1Var.f48193w.f47868b.get(arrayList.get((arrayList.size() - i7) - 1));
        if (xiVar.f27882a != xiVar.f27883b && (b10 = xiVar.f27884c) == xiVar.d && b10 != 0) {
            int size = h1Var.f48193w.f47867a.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.xi xiVar2 = (org.telegram.messenger.xi) h1Var.f48193w.f47867a.get(i10);
                if (xiVar2 != xiVar) {
                    byte b11 = xiVar2.f27884c;
                    byte b12 = xiVar.f27884c;
                    if (b11 <= b12 && xiVar2.d >= b12) {
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
