package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class yd implements Runnable {
    public final int f32637a;
    public final ChatActivityEnterView f32638b;
    public final boolean f32639c;

    public yd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f32637a = i10;
        this.f32638b = chatActivityEnterView;
        this.f32639c = z10;
    }

    @Override
    public final void run() {
        mf mfVar;
        int i10 = this.f32637a;
        ChatActivityEnterView chatActivityEnterView = this.f32638b;
        boolean z10 = this.f32639c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f24021t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f23908n5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f24026u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f23908n5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f32638b;
                rd rdVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean R0 = chatActivityEnterView2.R0(0, false, 0, true, 0L);
                if (!z10 && (mfVar = chatActivityEnterView2.L0) != null) {
                    mfVar.g(!R0);
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
