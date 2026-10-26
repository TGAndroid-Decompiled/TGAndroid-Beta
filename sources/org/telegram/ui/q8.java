package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class q8 implements View.OnClickListener {
    public final int f42759a;
    public final o9 f42760b;

    public q8(o9 o9Var, int i10) {
        this.f42759a = i10;
        this.f42760b = o9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42759a) {
            case 0:
                Long l4 = (Long) view.getTag();
                o9 o9Var = this.f42760b;
                ChatObject.Call groupCall = o9Var.getMessagesController().getGroupCall(l4.longValue(), false);
                TLRPC.Chat chat = o9Var.getMessagesController().getChat(l4);
                o9Var.L = chat;
                if (groupCall != null) {
                    org.telegram.ui.Components.voip.g2.l(chat, null, false, null, o9Var.getParentActivity(), o9Var, o9Var.getAccountInstance());
                    return;
                }
                o9Var.M = l4;
                o9Var.getMessagesController().loadFullChat(l4.longValue(), 0, true);
                return;
            default:
                Bundle i10 = a1.g.i("isCall", true);
                o9 o9Var2 = this.f42760b;
                o9Var2.presentFragment(new h9(i10, o9Var2.getCurrentAccount(), o9Var2));
                return;
        }
    }
}
