package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class om implements Runnable {
    public final int f41196a;
    public final cn f41197b;
    public final MessageObject f41198c;

    public om(cn cnVar, MessageObject messageObject, int i9) {
        this.f41196a = i9;
        this.f41197b = cnVar;
        this.f41198c = messageObject;
    }

    @Override
    public final void run() {
        int i9;
        switch (this.f41196a) {
            case 0:
                cn cnVar = this.f41197b;
                qn qnVar = cnVar.f37236a;
                qnVar.Q7();
                UndoView undoView = qnVar.f42093u3;
                if (undoView != null) {
                    if (qnVar.U.getVisibility() == 0 && qnVar.N.getVisibility() != 0) {
                        i9 = 16;
                    } else {
                        i9 = 17;
                    }
                    MessageObject messageObject = this.f41198c;
                    undoView.k(0L, i9, messageObject.getDiceEmoji(), null, null, new om(cnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                qn qnVar2 = this.f41197b.f37236a;
                qnVar2.f42075sb = this.f41198c.getId();
                qnVar2.f42088tb = 0;
                return;
            default:
                qn qnVar3 = this.f41197b.f37236a;
                if (qnVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f41198c.getDiceEmoji(), qnVar3.P5, qnVar3.f41959j5, qnVar3.T3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = qnVar3.C8();
                    qnVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
