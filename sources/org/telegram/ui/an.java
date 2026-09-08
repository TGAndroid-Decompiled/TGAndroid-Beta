package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class an implements Runnable {
    public final int f34507a;
    public final on f34508b;
    public final MessageObject f34509c;

    public an(on onVar, MessageObject messageObject, int i10) {
        this.f34507a = i10;
        this.f34508b = onVar;
        this.f34509c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f34507a) {
            case 0:
                on onVar = this.f34508b;
                co coVar = onVar.f39310a;
                coVar.Q7();
                UndoView undoView = coVar.y3;
                if (undoView != null) {
                    if (coVar.Y.getVisibility() == 0 && coVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f34509c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new an(onVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                co coVar2 = this.f34508b.f39310a;
                coVar2.f35498wb = this.f34509c.getId();
                coVar2.f35511xb = 0;
                return;
            default:
                co coVar3 = this.f34508b.f39310a;
                if (coVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f34509c.getDiceEmoji(), coVar3.T5, coVar3.f35379n5, coVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = coVar3.C8();
                    coVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
