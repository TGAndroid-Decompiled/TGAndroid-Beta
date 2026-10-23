package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class yd implements Runnable {
    public final int f32902a;
    public final ChatActivityEnterView f32903b;
    public final boolean f32904c;

    public yd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f32902a = i10;
        this.f32903b = chatActivityEnterView;
        this.f32904c = z10;
    }

    @Override
    public final void run() {
        mf mfVar;
        int i10 = this.f32902a;
        ChatActivityEnterView chatActivityEnterView = this.f32903b;
        boolean z10 = this.f32904c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f24166t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f24050r5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f24171u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f24050r5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f32903b;
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
