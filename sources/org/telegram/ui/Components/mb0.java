package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class mb0 extends s4.t {
    public final yb0 S;

    public mb0(yb0 yb0Var) {
        super(true);
        this.S = yb0Var;
    }

    @Override
    public final boolean B1(int i10) {
        byte b10;
        yb0 yb0Var = this.S;
        MessageObject messageObject = yb0Var.f29298r.previewMessages.get(i10);
        MessageObject.GroupedMessages a2 = yb0.a(yb0Var, messageObject);
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
    public final void b0(of.e eVar, s4.z0 z0Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(eVar, z0Var);
            return;
        }
        try {
            super.b0(eVar, z0Var);
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new dq(this, 28));
        }
    }
}
