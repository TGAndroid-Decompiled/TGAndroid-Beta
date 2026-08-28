package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class ka0 extends f2.z {
    public final wa0 S;

    public ka0(wa0 wa0Var) {
        super(true);
        this.S = wa0Var;
    }

    @Override
    public final boolean B1(int i9) {
        byte b10;
        wa0 wa0Var = this.S;
        MessageObject messageObject = wa0Var.f34174r.previewMessages.get(i9);
        MessageObject.GroupedMessages a2 = wa0.a(wa0Var, messageObject);
        if (a2 != null) {
            MessageObject.GroupedMessagePosition position = a2.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = a2.posArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = a2.posArray.get(i10);
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
    public final void b0(f2.g1 g1Var, f2.n1 n1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(g1Var, n1Var);
            return;
        }
        try {
            super.b0(g1Var, n1Var);
        } catch (Exception e10) {
            FileLog.e(e10);
            AndroidUtilities.runOnUIThread(new np(this, 28));
        }
    }
}
