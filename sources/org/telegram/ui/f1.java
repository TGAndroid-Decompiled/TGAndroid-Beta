package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class f1 extends s4.t {
    public final k1 S;

    public f1(k1 k1Var) {
        super(true);
        this.S = k1Var;
    }

    @Override
    public final boolean B1(int i10) {
        byte b10;
        k1 k1Var = this.S;
        ArrayList<TL_iv.PageBlock> arrayList = k1Var.f37884s.items;
        MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) k1Var.v.f37476b.get(arrayList.get((arrayList.size() - i10) - 1));
        if (groupedMessagePosition.minX != groupedMessagePosition.maxX && (b10 = groupedMessagePosition.minY) == groupedMessagePosition.maxY && b10 != 0) {
            int size = k1Var.v.f37475a.size();
            for (int i11 = 0; i11 < size; i11++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) k1Var.v.f37475a.get(i11);
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
