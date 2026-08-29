package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class sd implements Runnable {
    public final int f32624a;
    public final ChatActivityEnterView f32625b;
    public final boolean f32626c;

    public sd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f32624a = i10;
        this.f32625b = chatActivityEnterView;
        this.f32626c = z10;
    }

    @Override
    public final void run() {
        ff ffVar;
        int i10 = this.f32624a;
        ChatActivityEnterView chatActivityEnterView = this.f32625b;
        boolean z10 = this.f32626c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f26167o1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f26085i5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f26172p1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f26085i5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f32625b;
                ld ldVar = chatActivityEnterView2.A4;
                chatActivityEnterView2.I0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (!z10 && (ffVar = chatActivityEnterView2.H0) != null) {
                    ffVar.h(!T0);
                    chatActivityEnterView2.H0 = null;
                    return;
                }
                chatActivityEnterView2.f26229z4 = !T0;
                AndroidUtilities.cancelRunOnUIThread(ldVar);
                AndroidUtilities.runOnUIThread(ldVar, 500L);
                return;
        }
    }
}
