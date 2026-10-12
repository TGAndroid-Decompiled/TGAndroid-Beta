package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ae implements Runnable {
    public final int f23534a;
    public final ChatActivityEnterView f23535b;
    public final boolean f23536c;

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f23534a = i10;
        this.f23535b = chatActivityEnterView;
        this.f23536c = z10;
    }

    @Override
    public final void run() {
        of ofVar;
        int i10 = this.f23534a;
        ChatActivityEnterView chatActivityEnterView = this.f23535b;
        boolean z10 = this.f23536c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f22962t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f22849n5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f22967u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f22849n5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f23535b;
                td tdVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean R0 = chatActivityEnterView2.R0(0, false, 0, true, 0L);
                if (!z10 && (ofVar = chatActivityEnterView2.L0) != null) {
                    ofVar.h(!R0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.E4 = !R0;
                AndroidUtilities.cancelRunOnUIThread(tdVar);
                AndroidUtilities.runOnUIThread(tdVar, 500L);
                return;
        }
    }
}
