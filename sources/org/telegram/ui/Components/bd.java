package org.telegram.ui.Components;
public final class bd implements Runnable {
    public final int f24607a;
    public final ChatActivityEnterView f24608b;
    public final boolean f24609c;

    public bd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f24607a = i10;
        this.f24608b = chatActivityEnterView;
        this.f24609c = z10;
    }

    @Override
    public final void run() {
        pe peVar;
        int i10 = this.f24607a;
        ChatActivityEnterView chatActivityEnterView = this.f24608b;
        boolean z10 = this.f24609c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f23789t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f23672s5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f23794u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f23672s5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24608b;
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
