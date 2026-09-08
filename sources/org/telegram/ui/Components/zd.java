package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class zd implements Runnable {
    public final int f33163a;
    public final ChatActivityEnterView f33164b;
    public final boolean f33165c;

    public zd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f33163a = i10;
        this.f33164b = chatActivityEnterView;
        this.f33165c = z10;
    }

    @Override
    public final void run() {
        nf nfVar;
        int i10 = this.f33163a;
        ChatActivityEnterView chatActivityEnterView = this.f33164b;
        boolean z10 = this.f33165c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f23795s1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f23688m5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f23800t1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f23688m5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f33164b;
                sd sdVar = chatActivityEnterView2.E4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (!z10 && (nfVar = chatActivityEnterView2.L0) != null) {
                    nfVar.h(!T0);
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
