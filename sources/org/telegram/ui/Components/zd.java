package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class zd implements Runnable {
    public final int f30565a;
    public final ChatActivityEnterView f30566b;
    public final boolean f30567c;

    public zd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f30565a = i10;
        this.f30566b = chatActivityEnterView;
        this.f30567c = z10;
    }

    @Override
    public final void run() {
        mf mfVar;
        int i10 = this.f30565a;
        ChatActivityEnterView chatActivityEnterView = this.f30566b;
        boolean z10 = this.f30567c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f21808s1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f21701n5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f21813t1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f21701n5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f30566b;
                sd sdVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean U0 = chatActivityEnterView2.U0(0, false, 0, true, 0L);
                if (!z10 && (mfVar = chatActivityEnterView2.L0) != null) {
                    mfVar.h(!U0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.E4 = !U0;
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                AndroidUtilities.runOnUIThread(sdVar, 500L);
                return;
        }
    }
}
