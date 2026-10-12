package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class bn implements Runnable {
    public final int f36209a;
    public final pn f36210b;
    public final MessageObject f36211c;

    public bn(pn pnVar, MessageObject messageObject, int i10) {
        this.f36209a = i10;
        this.f36210b = pnVar;
        this.f36211c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f36209a) {
            case 0:
                pn pnVar = this.f36210b;
                eo eoVar = pnVar.f41000a;
                eoVar.T7();
                UndoView undoView = eoVar.y3;
                if (undoView != null) {
                    if (eoVar.Y.getVisibility() == 0 && eoVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    int i11 = i10;
                    MessageObject messageObject = this.f36211c;
                    undoView.k(0L, i11, messageObject.getDiceEmoji(), null, null, new bn(pnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                eo eoVar2 = this.f36210b.f41000a;
                eoVar2.f37480wb = this.f36211c.getId();
                eoVar2.f37494xb = 0;
                return;
            default:
                eo eoVar3 = this.f36210b.f41000a;
                if (eoVar3.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f36211c.getDiceEmoji(), eoVar3.T5, eoVar3.f37361n5, eoVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = eoVar3.H8();
                    eoVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
