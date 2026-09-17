package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class an implements Runnable {
    public final int f34481a;
    public final on f34482b;
    public final MessageObject f34483c;

    public an(on onVar, MessageObject messageObject, int i10) {
        this.f34481a = i10;
        this.f34482b = onVar;
        this.f34483c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f34481a) {
            case 0:
                on onVar = this.f34482b;
                co coVar = onVar.f39284a;
                coVar.Q7();
                UndoView undoView = coVar.y3;
                if (undoView != null) {
                    if (coVar.Y.getVisibility() == 0 && coVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f34483c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new an(onVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                co coVar2 = this.f34482b.f39284a;
                coVar2.f35472wb = this.f34483c.getId();
                coVar2.f35485xb = 0;
                return;
            default:
                co coVar3 = this.f34482b.f39284a;
                if (coVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f34483c.getDiceEmoji(), coVar3.T5, coVar3.f35353n5, coVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = coVar3.C8();
                    coVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
