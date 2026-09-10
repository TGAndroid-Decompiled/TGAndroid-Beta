package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ak extends g.p {
    public final eo f31023c;

    public ak(eo eoVar) {
        this.f31023c = eoVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        eo eoVar = this.f31023c;
        pm pmVar = eoVar.A0;
        int i12 = pmVar.J;
        if (i10 >= i12 && i10 < pmVar.K && (i11 = i10 - i12) >= 0 && i11 < pmVar.L().size() && (X8 = eoVar.X8((messageObject = (MessageObject) eoVar.A0.L().get(i11)))) != null) {
            return X8.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
