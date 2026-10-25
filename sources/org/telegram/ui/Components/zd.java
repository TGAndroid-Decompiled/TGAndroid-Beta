package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class zd implements Runnable {
    public final int f35303a;
    public final ChatActivityEnterView f35304b;
    public final boolean f35305c;

    public zd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f35303a = i10;
        this.f35304b = chatActivityEnterView;
        this.f35305c = z10;
    }

    @Override
    public final void run() {
        mf mfVar;
        int i10 = this.f35303a;
        ChatActivityEnterView chatActivityEnterView = this.f35304b;
        boolean z10 = this.f35305c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f25957t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f25841r5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f25962u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f25841r5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f35304b;
                sd sdVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean R0 = chatActivityEnterView2.R0(0, false, 0, true, 0L);
                if (!z10 && (mfVar = chatActivityEnterView2.L0) != null) {
                    mfVar.g(!R0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.E4 = !R0;
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                AndroidUtilities.runOnUIThread(sdVar, 500L);
                return;
        }
    }
}
