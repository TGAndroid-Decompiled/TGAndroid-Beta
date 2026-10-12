package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ek extends g.o {
    public final eo f37162c;

    public ek(eo eoVar) {
        this.f37162c = eoVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages c92;
        eo eoVar = this.f37162c;
        qm qmVar = eoVar.A0;
        int i12 = qmVar.J;
        if (i10 >= i12 && i10 < qmVar.K && (i11 = i10 - i12) >= 0 && i11 < qmVar.L().size() && (c92 = eoVar.c9((messageObject = (MessageObject) eoVar.A0.L().get(i11)))) != null) {
            return c92.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
