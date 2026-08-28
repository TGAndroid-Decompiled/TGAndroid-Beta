package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class od implements Runnable {
    public final int f31360a;
    public final ChatActivityEnterView f31361b;
    public final boolean f31362c;

    public od(ChatActivityEnterView chatActivityEnterView, boolean z10, int i9) {
        this.f31360a = i9;
        this.f31361b = chatActivityEnterView;
        this.f31362c = z10;
    }

    @Override
    public final void run() {
        cf cfVar;
        int i9 = this.f31360a;
        ChatActivityEnterView chatActivityEnterView = this.f31361b;
        boolean z10 = this.f31362c;
        switch (i9) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f26156o1.setVisibility(8);
                    return;
                }
                int i10 = ChatActivityEnterView.f26074i5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f26161p1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f26074i5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f31361b;
                hd hdVar = chatActivityEnterView2.A4;
                chatActivityEnterView2.I0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (!z10 && (cfVar = chatActivityEnterView2.H0) != null) {
                    cfVar.h(!T0);
                    chatActivityEnterView2.H0 = null;
                    return;
                }
                chatActivityEnterView2.f26218z4 = !T0;
                AndroidUtilities.cancelRunOnUIThread(hdVar);
                AndroidUtilities.runOnUIThread(hdVar, 500L);
                return;
        }
    }
}
