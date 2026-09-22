package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class zd implements Runnable {
    public final int f30872a;
    public final ChatActivityEnterView f30873b;
    public final boolean f30874c;

    public zd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f30872a = i10;
        this.f30873b = chatActivityEnterView;
        this.f30874c = z10;
    }

    @Override
    public final void run() {
        mf mfVar;
        int i10 = this.f30872a;
        ChatActivityEnterView chatActivityEnterView = this.f30873b;
        boolean z10 = this.f30874c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f22079t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f21967n5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f22084u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f21967n5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f30873b;
                sd sdVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (!z10 && (mfVar = chatActivityEnterView2.L0) != null) {
                    mfVar.h(!T0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.E4 = !T0;
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                AndroidUtilities.runOnUIThread(sdVar, 500L);
                return;
        }
    }
}
