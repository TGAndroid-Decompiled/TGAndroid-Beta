package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

public final class pm implements Runnable {

    public final int f41386a;

    public final dn f41387b;

    public final MessageObject f41388c;

    public pm(dn dnVar, MessageObject messageObject, int i10) {
        this.f41386a = i10;
        this.f41387b = dnVar;
        this.f41388c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f41386a) {
            case 0:
                dn dnVar = this.f41387b;
                rn rnVar = dnVar.f37446a;
                rnVar.Q7();
                UndoView undoView = rnVar.f42229u3;
                if (undoView != null) {
                    int i10 = (rnVar.U.getVisibility() != 0 || rnVar.N.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.f41388c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new pm(dnVar, messageObject, 2));
                    break;
                }
                break;
            case 1:
                rn rnVar2 = this.f41387b.f37446a;
                rnVar2.f42211sb = this.f41388c.getId();
                rnVar2.f42224tb = 0;
                break;
            default:
                rn rnVar3 = this.f41387b.f37446a;
                if (rnVar3.f7()) {
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(this.f41388c.getDiceEmoji(), rnVar3.P5, rnVar3.f42095j5, rnVar3.T3, null, false, null, null, null, true, 0, 0, null, false);
                    sendMessageParamsOf.sendMessageChatArguments = rnVar3.C8();
                    rnVar3.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
                }
                break;
        }
    }
}
