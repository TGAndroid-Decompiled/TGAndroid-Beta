package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ce implements Runnable {
    public final int f25356a;
    public final ChatActivityEnterView f25357b;
    public final boolean f25358c;

    public ce(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f25356a = i10;
        this.f25357b = chatActivityEnterView;
        this.f25358c = z10;
    }

    @Override
    public final void run() {
        pf pfVar;
        int i10 = this.f25356a;
        ChatActivityEnterView chatActivityEnterView = this.f25357b;
        boolean z10 = this.f25358c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f23963t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f23850n5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f23968u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f23850n5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f25357b;
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
