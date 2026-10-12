package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class de implements Runnable {
    public final int f25332a;
    public final ChatActivityEnterView f25333b;
    public final boolean f25334c;

    public de(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f25332a = i10;
        this.f25333b = chatActivityEnterView;
        this.f25334c = z10;
    }

    @Override
    public final void run() {
        rf rfVar;
        int i10 = this.f25332a;
        ChatActivityEnterView chatActivityEnterView = this.f25333b;
        boolean z10 = this.f25334c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f23733t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.Q5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f23739u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.Q5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f25333b;
                ud udVar = chatActivityEnterView2.f23673i5;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean W0 = chatActivityEnterView2.W0(0, false, 0, true, 0L);
                if (!z10 && (rfVar = chatActivityEnterView2.L0) != null) {
                    rfVar.h(!W0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.f23667h5 = !W0;
                AndroidUtilities.cancelRunOnUIThread(udVar);
                AndroidUtilities.runOnUIThread(udVar, 500L);
                return;
        }
    }
}
