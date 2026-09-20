package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class aj0 extends g.p {
    public final dj0 f32108c;

    public aj0(dj0 dj0Var) {
        this.f32108c = dj0Var;
    }

    @Override
    public final int i(int i10) {
        dj0 dj0Var = this.f32108c;
        ArrayList arrayList = dj0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = dj0Var.l(messageObject);
        if (l4 != null) {
            return l4.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
