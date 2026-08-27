package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class ld implements Runnable {

    public final int f30360a;

    public final ChatActivityEnterView f30361b;

    public final boolean f30362c;

    public ld(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f30360a = i10;
        this.f30361b = chatActivityEnterView;
        this.f30362c = z10;
    }

    @Override
    public final void run() {
        ye yeVar;
        int i10 = this.f30360a;
        ChatActivityEnterView chatActivityEnterView = this.f30361b;
        boolean z10 = this.f30362c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f26152o1.setVisibility(8);
                } else {
                    int i11 = ChatActivityEnterView.f26070i5;
                    chatActivityEnterView.getClass();
                }
                break;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f26157p1.setVisibility(8);
                } else {
                    int i12 = ChatActivityEnterView.f26070i5;
                    chatActivityEnterView.getClass();
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f30361b;
                ed edVar = chatActivityEnterView2.A4;
                chatActivityEnterView2.I0 = System.currentTimeMillis();
                boolean zT0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (z10 || (yeVar = chatActivityEnterView2.H0) == null) {
                    chatActivityEnterView2.f26214z4 = !zT0;
                    AndroidUtilities.cancelRunOnUIThread(edVar);
                    AndroidUtilities.runOnUIThread(edVar, 500L);
                } else {
                    yeVar.h(!zT0);
                    chatActivityEnterView2.H0 = null;
                }
                break;
        }
    }
}
