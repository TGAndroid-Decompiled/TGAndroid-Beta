package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class de implements Runnable {
    public final int f25324a;
    public final ChatActivityEnterView f25325b;
    public final boolean f25326c;

    public de(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f25324a = i10;
        this.f25325b = chatActivityEnterView;
        this.f25326c = z10;
    }

    @Override
    public final void run() {
        rf rfVar;
        int i10 = this.f25324a;
        ChatActivityEnterView chatActivityEnterView = this.f25325b;
        boolean z10 = this.f25326c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f23734t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.S5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f23740u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.S5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f25325b;
                vd vdVar = chatActivityEnterView2.f23674i5;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean W0 = chatActivityEnterView2.W0(0, false, 0, true, 0L);
                if (!z10 && (rfVar = chatActivityEnterView2.L0) != null) {
                    rfVar.h(!W0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.f23668h5 = !W0;
                AndroidUtilities.cancelRunOnUIThread(vdVar);
                AndroidUtilities.runOnUIThread(vdVar, 500L);
                return;
        }
    }
}
