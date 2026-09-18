package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class yd implements Runnable {
    public final int f30553a;
    public final ChatActivityEnterView f30554b;
    public final boolean f30555c;

    public yd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f30553a = i10;
        this.f30554b = chatActivityEnterView;
        this.f30555c = z10;
    }

    @Override
    public final void run() {
        mf mfVar;
        int i10 = this.f30553a;
        ChatActivityEnterView chatActivityEnterView = this.f30554b;
        boolean z10 = this.f30555c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f22023s1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f21917m5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f22028t1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f21917m5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f30554b;
                rd rdVar = chatActivityEnterView2.E4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (!z10 && (mfVar = chatActivityEnterView2.L0) != null) {
                    mfVar.h(!T0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.D4 = !T0;
                AndroidUtilities.cancelRunOnUIThread(rdVar);
                AndroidUtilities.runOnUIThread(rdVar, 500L);
                return;
        }
    }
}
