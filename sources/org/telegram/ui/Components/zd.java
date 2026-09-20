package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class zd implements Runnable {
    public final int f30801a;
    public final ChatActivityEnterView f30802b;
    public final boolean f30803c;

    public zd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f30801a = i10;
        this.f30802b = chatActivityEnterView;
        this.f30803c = z10;
    }

    @Override
    public final void run() {
        mf mfVar;
        int i10 = this.f30801a;
        ChatActivityEnterView chatActivityEnterView = this.f30802b;
        boolean z10 = this.f30803c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f22058s1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f21952m5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f22063t1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f21952m5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f30802b;
                sd sdVar = chatActivityEnterView2.E4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (!z10 && (mfVar = chatActivityEnterView2.L0) != null) {
                    mfVar.h(!T0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.D4 = !T0;
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                AndroidUtilities.runOnUIThread(sdVar, 500L);
                return;
        }
    }
}
