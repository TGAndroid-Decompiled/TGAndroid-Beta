package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;

public final class oa0 extends f2.y {
    public final ab0 S;

    public oa0(ab0 ab0Var) {
        super(true);
        this.S = ab0Var;
    }

    @Override
    public final boolean B1(int i10) {
        byte b10;
        ab0 ab0Var = this.S;
        MessageObject messageObject = ab0Var.f26718r.previewMessages.get(i10);
        MessageObject.GroupedMessages groupedMessagesA = ab0.a(ab0Var, messageObject);
        if (groupedMessagesA != null) {
            MessageObject.GroupedMessagePosition position = groupedMessagesA.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = groupedMessagesA.posArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = groupedMessagesA.posArray.get(i11);
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
        return false;
    }

    @Override
    public final void b0(f2.e1 e1Var, f2.l1 l1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(e1Var, l1Var);
            return;
        }
        try {
            super.b0(e1Var, l1Var);
        } catch (Exception e9) {
            FileLog.e(e9);
            AndroidUtilities.runOnUIThread(new lp(this, 28));
        }
    }
}
