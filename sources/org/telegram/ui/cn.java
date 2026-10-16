package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class cn implements Runnable {
    public final int f34732a;
    public final qn f34733b;
    public final MessageObject f34734c;

    public cn(qn qnVar, MessageObject messageObject, int i10) {
        this.f34732a = i10;
        this.f34733b = qnVar;
        this.f34734c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f34732a) {
            case 0:
                qn qnVar = this.f34733b;
                fo foVar = qnVar.f39190a;
                foVar.T7();
                UndoView undoView = foVar.y3;
                if (undoView != null) {
                    if (foVar.Y.getVisibility() == 0 && foVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    int i11 = i10;
                    MessageObject messageObject = this.f34734c;
                    undoView.k(0L, i11, messageObject.getDiceEmoji(), null, null, new cn(qnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                fo foVar2 = this.f34733b.f39190a;
                foVar2.f35858wb = this.f34734c.getId();
                foVar2.f35872xb = 0;
                return;
            default:
                fo foVar3 = this.f34733b.f39190a;
                if (foVar3.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f34734c.getDiceEmoji(), foVar3.T5, foVar3.f35739n5, foVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = foVar3.H8();
                    foVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
