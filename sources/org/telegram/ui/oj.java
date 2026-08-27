package org.telegram.ui;

import org.telegram.messenger.MessageObject;

public final class oj extends f2.w {

    public final rn f41119c;

    public oj(rn rnVar) {
        this.f41119c = rnVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages groupedMessagesX8;
        rn rnVar = this.f41119c;
        dm dmVar = rnVar.f42252w0;
        int i12 = dmVar.F;
        if (i10 < i12 || i10 >= dmVar.G || (i11 = i10 - i12) < 0 || i11 >= dmVar.L().size() || (groupedMessagesX8 = rnVar.X8((messageObject = (MessageObject) rnVar.f42252w0.L().get(i11)))) == null) {
            return 1000;
        }
        return groupedMessagesX8.getPosition(messageObject).spanSize;
    }
}
