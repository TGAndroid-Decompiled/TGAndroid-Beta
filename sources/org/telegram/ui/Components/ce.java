package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ce implements Runnable {
    public final int f25320a;
    public final ChatActivityEnterView f25321b;
    public final boolean f25322c;

    public ce(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f25320a = i10;
        this.f25321b = chatActivityEnterView;
        this.f25322c = z10;
    }

    @Override
    public final void run() {
        pf pfVar;
        int i10 = this.f25320a;
        ChatActivityEnterView chatActivityEnterView = this.f25321b;
        boolean z10 = this.f25322c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f23991t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f23878n5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f23996u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f23878n5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f25321b;
                vd vdVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean R0 = chatActivityEnterView2.R0(0, false, 0, true, 0L);
                if (!z10 && (pfVar = chatActivityEnterView2.L0) != null) {
                    pfVar.h(!R0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.E4 = !R0;
                AndroidUtilities.cancelRunOnUIThread(vdVar);
                AndroidUtilities.runOnUIThread(vdVar, 500L);
                return;
        }
    }
}
