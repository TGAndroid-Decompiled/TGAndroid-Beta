package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class db0 extends f2.x {
    public final qb0 S;

    public db0(qb0 qb0Var) {
        super(true);
        this.S = qb0Var;
    }

    @Override
    public final boolean B1(int i10) {
        byte b10;
        qb0 qb0Var = this.S;
        MessageObject messageObject = qb0Var.f28107r.previewMessages.get(i10);
        MessageObject.GroupedMessages a2 = qb0.a(qb0Var, messageObject);
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
    public final void b0(bf.f fVar, f2.i1 i1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(fVar, i1Var);
            return;
        }
        try {
            super.b0(fVar, i1Var);
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new vp(this, 28));
        }
    }
}
