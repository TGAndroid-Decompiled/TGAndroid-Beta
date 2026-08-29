package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class pj extends f2.v {
    public final tn f41427c;

    public pj(tn tnVar) {
        this.f41427c = tnVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        tn tnVar = this.f41427c;
        em emVar = tnVar.f43013w0;
        int i12 = emVar.F;
        if (i10 >= i12 && i10 < emVar.G && (i11 = i10 - i12) >= 0 && i11 < emVar.L().size() && (X8 = tnVar.X8((messageObject = (MessageObject) tnVar.f43013w0.L().get(i11)))) != null) {
            return X8.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
