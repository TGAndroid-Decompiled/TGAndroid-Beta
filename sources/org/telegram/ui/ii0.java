package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ii0 extends g.o {
    public final li0 f38007c;

    public ii0(li0 li0Var) {
        this.f38007c = li0Var;
    }

    @Override
    public final int i(int i10) {
        li0 li0Var = this.f38007c;
        ArrayList arrayList = li0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = li0Var.l(messageObject);
        if (l4 != null) {
            return l4.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
