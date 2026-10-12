package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ek extends g.o {
    public final fo f35628c;

    public ek(fo foVar) {
        this.f35628c = foVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages c92;
        fo foVar = this.f35628c;
        rm rmVar = foVar.A0;
        int i12 = rmVar.J;
        if (i10 >= i12 && i10 < rmVar.K && (i11 = i10 - i12) >= 0 && i11 < rmVar.L().size() && (c92 = foVar.c9((messageObject = (MessageObject) foVar.A0.L().get(i11)))) != null) {
            return c92.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
