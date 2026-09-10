package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class bn implements Runnable {
    public final int f31295a;
    public final pn f31296b;
    public final MessageObject f31297c;

    public bn(pn pnVar, MessageObject messageObject, int i10) {
        this.f31295a = i10;
        this.f31296b = pnVar;
        this.f31297c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f31295a) {
            case 0:
                pn pnVar = this.f31296b;
                eo eoVar = pnVar.f35881a;
                eoVar.Q7();
                UndoView undoView = eoVar.y3;
                if (undoView != null) {
                    if (eoVar.Y.getVisibility() == 0 && eoVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f31297c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new bn(pnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                eo eoVar2 = this.f31296b.f35881a;
                eoVar2.f32540wb = this.f31297c.getId();
                eoVar2.f32553xb = 0;
                return;
            default:
                eo eoVar3 = this.f31296b.f35881a;
                if (eoVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f31297c.getDiceEmoji(), eoVar3.T5, eoVar3.f32421n5, eoVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = eoVar3.C8();
                    eoVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
