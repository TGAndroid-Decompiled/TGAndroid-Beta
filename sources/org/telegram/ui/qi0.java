package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class qi0 extends f2.v {
    public final ti0 f40511c;

    public qi0(ti0 ti0Var) {
        this.f40511c = ti0Var;
    }

    @Override
    public final int i(int i10) {
        ti0 ti0Var = this.f40511c;
        ArrayList arrayList = ti0Var.K;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l10 = ti0Var.l(messageObject);
        if (l10 != null) {
            return l10.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
