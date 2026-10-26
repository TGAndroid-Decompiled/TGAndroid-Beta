package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class vb0 extends s4.u {
    public final hc0 S;

    public vb0(hc0 hc0Var) {
        super(true);
        this.S = hc0Var;
    }

    @Override
    public final boolean C1(int i10) {
        byte b10;
        hc0 hc0Var = this.S;
        MessageObject messageObject = hc0Var.f28922r.previewMessages.get(i10);
        MessageObject.GroupedMessages a2 = hc0.a(hc0Var, messageObject);
        if (a2 != null) {
            MessageObject.GroupedMessagePosition position = a2.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = a2.posArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = a2.posArray.get(i11);
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
        return false;
    }

    @Override
    public final void b0(rf.e eVar, s4.b1 b1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(eVar, b1Var);
            return;
        }
        try {
            super.b0(eVar, b1Var);
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new wa0(this, 1));
        }
    }
}
