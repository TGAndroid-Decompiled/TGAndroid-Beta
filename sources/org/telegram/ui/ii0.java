package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ii0 extends f2.x {
    public final li0 f39166c;

    public ii0(li0 li0Var) {
        this.f39166c = li0Var;
    }

    @Override
    public final int i(int i9) {
        li0 li0Var = this.f39166c;
        ArrayList arrayList = li0Var.J;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i9);
        MessageObject.GroupedMessages l10 = li0Var.l(messageObject);
        if (l10 != null) {
            return l10.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
