package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class ji0 extends s4.u {
    public final ni0 S;

    public ji0(ni0 ni0Var) {
        super(true);
        this.S = ni0Var;
    }

    @Override
    public final boolean C1(int i10) {
        byte b10;
        ni0 ni0Var = this.S;
        MessageObject messageObject = (MessageObject) ni0Var.M.get((B() - 1) - i10);
        MessageObject.GroupedMessages k10 = ni0Var.k(messageObject);
        if (k10 != null) {
            MessageObject.GroupedMessagePosition position = k10.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = k10.posArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = k10.posArray.get(i11);
                    if (groupedMessagePosition != position) {
                        byte b11 = groupedMessagePosition.minY;
                        byte b12 = position.minY;
                        if (b11 <= b12 && groupedMessagePosition.maxY >= b12) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean D1(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            return !((org.telegram.ui.Cells.s1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override
    public final int j(s4.b1 b1Var) {
        return B0(b1Var);
    }

    @Override
    public final int k(s4.b1 b1Var) {
        return C0(b1Var);
    }

    @Override
    public final int l(s4.b1 b1Var) {
        return D0(b1Var);
    }

    @Override
    public final boolean y0() {
        return true;
    }
}
