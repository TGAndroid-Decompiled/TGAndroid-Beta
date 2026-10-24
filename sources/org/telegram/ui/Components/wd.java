package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wd implements Runnable {
    public final int f32215a;
    public final ChatActivityEnterView f32216b;
    public final boolean f32217c;

    public wd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f32215a = i10;
        this.f32216b = chatActivityEnterView;
        this.f32217c = z10;
    }

    @Override
    public final void run() {
        kf kfVar;
        int i10 = this.f32215a;
        ChatActivityEnterView chatActivityEnterView = this.f32216b;
        boolean z10 = this.f32217c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f24167t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f24051r5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f24172u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f24051r5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f32216b;
                pd pdVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean R0 = chatActivityEnterView2.R0(0, false, 0, true, 0L);
                if (!z10 && (kfVar = chatActivityEnterView2.L0) != null) {
                    kfVar.g(!R0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.E4 = !R0;
                AndroidUtilities.cancelRunOnUIThread(pdVar);
                AndroidUtilities.runOnUIThread(pdVar, 500L);
                return;
        }
    }
}
