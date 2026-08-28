package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class mj extends f2.x {
    public final qn f40479c;

    public mj(qn qnVar) {
        this.f40479c = qnVar;
    }

    @Override
    public final int i(int i9) {
        int i10;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        qn qnVar = this.f40479c;
        bm bmVar = qnVar.f42114w0;
        int i11 = bmVar.F;
        if (i9 >= i11 && i9 < bmVar.G && (i10 = i9 - i11) >= 0 && i10 < bmVar.L().size() && (X8 = qnVar.X8((messageObject = (MessageObject) qnVar.f42114w0.L().get(i10)))) != null) {
            return X8.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
