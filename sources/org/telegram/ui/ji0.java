package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ji0 extends g.o {
    public final mi0 f38263c;

    public ji0(mi0 mi0Var) {
        this.f38263c = mi0Var;
    }

    @Override
    public final int i(int i10) {
        mi0 mi0Var = this.f38263c;
        ArrayList arrayList = mi0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = mi0Var.l(messageObject);
        if (l4 != null) {
            return l4.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
