package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class hi0 extends f2.v {
    public final ki0 f38941c;

    public hi0(ki0 ki0Var) {
        this.f38941c = ki0Var;
    }

    @Override
    public final int i(int i10) {
        ki0 ki0Var = this.f38941c;
        ArrayList arrayList = ki0Var.J;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l10 = ki0Var.l(messageObject);
        if (l10 != null) {
            return l10.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
