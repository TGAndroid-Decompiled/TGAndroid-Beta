package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class zd implements Runnable {
    public final int f35319a;
    public final ChatActivityEnterView f35320b;
    public final boolean f35321c;

    public zd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f35319a = i10;
        this.f35320b = chatActivityEnterView;
        this.f35321c = z10;
    }

    @Override
    public final void run() {
        mf mfVar;
        int i10 = this.f35319a;
        ChatActivityEnterView chatActivityEnterView = this.f35320b;
        boolean z10 = this.f35321c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f25961t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f25845r5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f25966u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f25845r5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f35320b;
                sd sdVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean Q0 = chatActivityEnterView2.Q0(0, false, 0, true, 0L);
                if (!z10 && (mfVar = chatActivityEnterView2.L0) != null) {
                    mfVar.g(!Q0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.E4 = !Q0;
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                AndroidUtilities.runOnUIThread(sdVar, 500L);
                return;
        }
    }
}
