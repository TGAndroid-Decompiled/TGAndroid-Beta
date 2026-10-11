package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ak extends g.o {
    public final zn f36138c;

    public ak(zn znVar) {
        this.f36138c = znVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages c92;
        zn znVar = this.f36138c;
        mm mmVar = znVar.A0;
        int i12 = mmVar.J;
        if (i10 >= i12 && i10 < mmVar.K && (i11 = i10 - i12) >= 0 && i11 < mmVar.L().size() && (c92 = znVar.c9((messageObject = (MessageObject) znVar.A0.L().get(i11)))) != null) {
            return c92.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
