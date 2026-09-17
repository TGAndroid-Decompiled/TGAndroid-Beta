package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class an implements Runnable {
    public final int f34508a;
    public final on f34509b;
    public final MessageObject f34510c;

    public an(on onVar, MessageObject messageObject, int i10) {
        this.f34508a = i10;
        this.f34509b = onVar;
        this.f34510c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f34508a) {
            case 0:
                on onVar = this.f34509b;
                co coVar = onVar.f39311a;
                coVar.Q7();
                UndoView undoView = coVar.y3;
                if (undoView != null) {
                    if (coVar.Y.getVisibility() == 0 && coVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f34510c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new an(onVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                co coVar2 = this.f34509b.f39311a;
                coVar2.f35499wb = this.f34510c.getId();
                coVar2.f35512xb = 0;
                return;
            default:
                co coVar3 = this.f34509b.f39311a;
                if (coVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f34510c.getDiceEmoji(), coVar3.T5, coVar3.f35380n5, coVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = coVar3.C8();
                    coVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
