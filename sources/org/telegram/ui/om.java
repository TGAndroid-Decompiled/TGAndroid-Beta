package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class om implements Runnable {
    public final int f39928a;
    public final cn f39929b;
    public final MessageObject f39930c;

    public om(cn cnVar, MessageObject messageObject, int i10) {
        this.f39928a = i10;
        this.f39929b = cnVar;
        this.f39930c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39928a) {
            case 0:
                cn cnVar = this.f39929b;
                qn qnVar = cnVar.f36015a;
                qnVar.T7();
                UndoView undoView = qnVar.y3;
                if (undoView != null) {
                    if (qnVar.Y.getVisibility() == 0 && qnVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    int i11 = i10;
                    MessageObject messageObject = this.f39930c;
                    undoView.k(0L, i11, messageObject.getDiceEmoji(), null, null, new om(cnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                qn qnVar2 = this.f39929b.f36015a;
                qnVar2.f40902wb = this.f39930c.getId();
                qnVar2.f40916xb = 0;
                return;
            default:
                qn qnVar3 = this.f39929b.f36015a;
                if (qnVar3.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f39930c.getDiceEmoji(), qnVar3.T5, qnVar3.f40783n5, qnVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = qnVar3.H8();
                    qnVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
