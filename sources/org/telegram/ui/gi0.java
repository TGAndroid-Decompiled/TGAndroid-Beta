package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class gi0 extends f2.x {
    public final ki0 S;

    public gi0(ki0 ki0Var) {
        super(true);
        this.S = ki0Var;
    }

    @Override
    public final boolean B1(int i10) {
        byte b10;
        ki0 ki0Var = this.S;
        MessageObject messageObject = (MessageObject) ki0Var.J.get((B() - 1) - i10);
        MessageObject.GroupedMessages l10 = ki0Var.l(messageObject);
        if (l10 != null) {
            MessageObject.GroupedMessagePosition position = l10.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = l10.posArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = l10.posArray.get(i11);
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
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            return !((org.telegram.ui.Cells.s1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override
    public final int j(f2.k1 k1Var) {
        return B0(k1Var);
    }

    @Override
    public final int k(f2.k1 k1Var) {
        return C0(k1Var);
    }

    @Override
    public final int l(f2.k1 k1Var) {
        return D0(k1Var);
    }

    @Override
    public final boolean y0() {
        return true;
    }
}
