package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class ii0 extends s4.t {
    public final mi0 S;

    public ii0(mi0 mi0Var) {
        super(true);
        this.S = mi0Var;
    }

    @Override
    public final boolean B1(int i10) {
        byte b10;
        mi0 mi0Var = this.S;
        MessageObject messageObject = (MessageObject) mi0Var.M.get((B() - 1) - i10);
        MessageObject.GroupedMessages k10 = mi0Var.k(messageObject);
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
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            return !((org.telegram.ui.Cells.u1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override
    public final int j(s4.y0 y0Var) {
        return B0(y0Var);
    }

    @Override
    public final int k(s4.y0 y0Var) {
        return C0(y0Var);
    }

    @Override
    public final int l(s4.y0 y0Var) {
        return D0(y0Var);
    }

    @Override
    public final boolean y0() {
        return true;
    }
}
