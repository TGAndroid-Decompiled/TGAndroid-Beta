package org.telegram.ui.Components;
public final class bd implements Runnable {
    public final int f24707a;
    public final ChatActivityEnterView f24708b;
    public final boolean f24709c;

    public bd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f24707a = i10;
        this.f24708b = chatActivityEnterView;
        this.f24709c = z10;
    }

    @Override
    public final void run() {
        pe peVar;
        int i10 = this.f24707a;
        ChatActivityEnterView chatActivityEnterView = this.f24708b;
        boolean z10 = this.f24709c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f23790t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f23673s5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f23795u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f23673s5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24708b;
                tc tcVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean R0 = chatActivityEnterView2.R0(false, 0, 0, 0L, true);
                if (!z10 && (peVar = chatActivityEnterView2.L0) != null) {
                    peVar.g(!R0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.E4 = !R0;
                org.telegram.messenger.i0.r(tcVar);
                org.telegram.messenger.i0.h3(tcVar, 500L);
                return;
        }
    }
}
