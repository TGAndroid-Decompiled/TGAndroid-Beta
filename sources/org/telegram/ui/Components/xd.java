package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xd implements Runnable {
    public final int f29919a;
    public final ChatActivityEnterView f29920b;
    public final boolean f29921c;

    public xd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f29919a = i10;
        this.f29920b = chatActivityEnterView;
        this.f29921c = z10;
    }

    @Override
    public final void run() {
        kf kfVar;
        int i10 = this.f29919a;
        ChatActivityEnterView chatActivityEnterView = this.f29920b;
        boolean z10 = this.f29921c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f21837s1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f21731m5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f21842t1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f21731m5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f29920b;
                qd qdVar = chatActivityEnterView2.E4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (!z10 && (kfVar = chatActivityEnterView2.L0) != null) {
                    kfVar.h(!T0);
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
