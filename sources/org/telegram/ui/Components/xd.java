package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xd implements Runnable {
    public final int f29916a;
    public final ChatActivityEnterView f29917b;
    public final boolean f29918c;

    public xd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f29916a = i10;
        this.f29917b = chatActivityEnterView;
        this.f29918c = z10;
    }

    @Override
    public final void run() {
        kf kfVar;
        int i10 = this.f29916a;
        ChatActivityEnterView chatActivityEnterView = this.f29917b;
        boolean z10 = this.f29918c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f21834s1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f21727n5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f21839t1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f21727n5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f29917b;
                qd qdVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean U0 = chatActivityEnterView2.U0(0, false, 0, true, 0L);
                if (!z10 && (kfVar = chatActivityEnterView2.L0) != null) {
                    kfVar.h(!U0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.E4 = !U0;
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                AndroidUtilities.runOnUIThread(qdVar, 500L);
                return;
        }
    }
}
