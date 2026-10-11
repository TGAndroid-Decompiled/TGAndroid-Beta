package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class ec0 extends s4.t {
    public final qc0 S;

    public ec0(qc0 qc0Var) {
        super(true);
        this.S = qc0Var;
    }

    @Override
    public final boolean B1(int i10) {
        byte b10;
        qc0 qc0Var = this.S;
        MessageObject messageObject = qc0Var.f30136r.previewMessages.get(i10);
        MessageObject.GroupedMessages a2 = qc0.a(qc0Var, messageObject);
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
    public final boolean C1(View view) {
        return false;
    }

    @Override
    public final void b0(pf.e eVar, s4.a1 a1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(eVar, a1Var);
            return;
        }
        try {
            super.b0(eVar, a1Var);
        } catch (Exception e7) {
            FileLog.e(e7);
            AndroidUtilities.runOnUIThread(new nq(this, 28));
        }
    }
}
