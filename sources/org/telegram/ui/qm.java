package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class qm implements Runnable {
    public final int f41750a;
    public final fn f41751b;
    public final MessageObject f41752c;

    public qm(fn fnVar, MessageObject messageObject, int i10) {
        this.f41750a = i10;
        this.f41751b = fnVar;
        this.f41752c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f41750a) {
            case 0:
                fn fnVar = this.f41751b;
                tn tnVar = fnVar.f38212a;
                tnVar.Q7();
                UndoView undoView = tnVar.f42989u3;
                if (undoView != null) {
                    if (tnVar.U.getVisibility() == 0 && tnVar.N.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f41752c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new qm(fnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                tn tnVar2 = this.f41751b.f38212a;
                tnVar2.f42971sb = this.f41752c.getId();
                tnVar2.f42984tb = 0;
                return;
            default:
                tn tnVar3 = this.f41751b.f38212a;
                if (tnVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f41752c.getDiceEmoji(), tnVar3.P5, tnVar3.f42856j5, tnVar3.T3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = tnVar3.C8();
                    tnVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
