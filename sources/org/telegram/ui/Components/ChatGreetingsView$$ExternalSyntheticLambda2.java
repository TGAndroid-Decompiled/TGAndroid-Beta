package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

public final class ChatGreetingsView$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final int $r8$classId;
    public final ChatGreetingsView f$0;
    public final TLRPC.Document f$1;

    public ChatGreetingsView$$ExternalSyntheticLambda2(ChatGreetingsView chatGreetingsView, TLRPC.Document document, int i) {
        this.$r8$classId = i;
        this.f$0 = chatGreetingsView;
        this.f$1 = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ChatGreetingsView.Listener listener = this.f$0.listener;
                if (listener != null) {
                    listener.onGreetings(this.f$1);
                }
                break;
            default:
                ChatGreetingsView.Listener listener2 = this.f$0.listener;
                if (listener2 != null) {
                    listener2.onGreetings(this.f$1);
                }
                break;
        }
    }
}
