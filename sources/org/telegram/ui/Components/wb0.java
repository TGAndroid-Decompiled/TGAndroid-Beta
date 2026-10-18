package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class wb0 extends s4.t {
    public final ic0 S;

    public wb0(ic0 ic0Var) {
        super(true);
        this.S = ic0Var;
    }

    @Override
    public final boolean B1(int i10) {
        byte b10;
        ic0 ic0Var = this.S;
        MessageObject messageObject = ic0Var.f27188r.previewMessages.get(i10);
        MessageObject.GroupedMessages a2 = ic0.a(ic0Var, messageObject);
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
    public final void b0(qf.e eVar, s4.y0 y0Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(eVar, y0Var);
            return;
        }
        try {
            super.b0(eVar, y0Var);
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new hq(this, 29));
        }
    }
}
