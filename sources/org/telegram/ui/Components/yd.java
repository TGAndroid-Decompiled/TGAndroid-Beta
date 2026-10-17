package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class yd implements Runnable {
    public final int f32611a;
    public final ChatActivityEnterView f32612b;
    public final boolean f32613c;

    public yd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f32611a = i10;
        this.f32612b = chatActivityEnterView;
        this.f32613c = z10;
    }

    @Override
    public final void run() {
        mf mfVar;
        int i10 = this.f32611a;
        ChatActivityEnterView chatActivityEnterView = this.f32612b;
        boolean z10 = this.f32613c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f24017t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f23904n5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f24022u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f23904n5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f32612b;
                rd rdVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean R0 = chatActivityEnterView2.R0(0, false, 0, true, 0L);
                if (!z10 && (mfVar = chatActivityEnterView2.L0) != null) {
                    mfVar.h(!R0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.E4 = !R0;
                AndroidUtilities.cancelRunOnUIThread(rdVar);
                AndroidUtilities.runOnUIThread(rdVar, 500L);
                return;
        }
    }
}
