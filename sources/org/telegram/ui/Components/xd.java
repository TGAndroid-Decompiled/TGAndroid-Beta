package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xd implements Runnable {
    public final int f29009a;
    public final ChatActivityEnterView f29010b;
    public final boolean f29011c;

    public xd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f29009a = i10;
        this.f29010b = chatActivityEnterView;
        this.f29011c = z10;
    }

    @Override
    public final void run() {
        of ofVar;
        int i10 = this.f29009a;
        ChatActivityEnterView chatActivityEnterView = this.f29010b;
        boolean z10 = this.f29011c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f20922s1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f20816m5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f20927t1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f20816m5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f29010b;
                qd qdVar = chatActivityEnterView2.E4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (!z10 && (ofVar = chatActivityEnterView2.L0) != null) {
                    ofVar.h(!T0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.D4 = !T0;
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                AndroidUtilities.runOnUIThread(qdVar, 500L);
                return;
        }
    }
}
