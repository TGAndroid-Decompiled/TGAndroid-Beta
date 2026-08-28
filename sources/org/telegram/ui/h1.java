package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class h1 extends f2.z {
    public final m1 S;

    public h1(m1 m1Var) {
        super(true);
        this.S = m1Var;
    }

    @Override
    public final boolean B1(int i9) {
        byte b10;
        m1 m1Var = this.S;
        ArrayList<TL_iv.PageBlock> arrayList = m1Var.f40291s.items;
        MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) m1Var.v.f39966b.get(arrayList.get((arrayList.size() - i9) - 1));
        if (groupedMessagePosition.minX != groupedMessagePosition.maxX && (b10 = groupedMessagePosition.minY) == groupedMessagePosition.maxY && b10 != 0) {
            int size = m1Var.v.f39965a.size();
            for (int i10 = 0; i10 < size; i10++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) m1Var.v.f39965a.get(i10);
                if (groupedMessagePosition2 != groupedMessagePosition) {
                    byte b11 = groupedMessagePosition2.minY;
                    byte b12 = groupedMessagePosition.minY;
                    if (b11 <= b12 && groupedMessagePosition2.maxY >= b12) {
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
