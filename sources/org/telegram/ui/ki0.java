package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

public final class ki0 extends f2.w {

    public final ni0 f39766c;

    public ki0(ni0 ni0Var) {
        this.f39766c = ni0Var;
    }

    @Override
    public final int i(int i10) {
        ni0 ni0Var = this.f39766c;
        ArrayList arrayList = ni0Var.J;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages groupedMessagesL = ni0Var.l(messageObject);
        if (groupedMessagesL != null) {
            return groupedMessagesL.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
