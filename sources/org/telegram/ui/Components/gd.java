package org.telegram.ui.Components;
public final class gd implements Runnable {
    public final int f34057a;
    public final ChatActivityEnterView f34058b;
    public final boolean f34059c;

    public gd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i3) {
        this.f34057a = i3;
        this.f34058b = chatActivityEnterView;
        this.f34059c = z10;
    }

    @Override
    public final void run() {
        se seVar;
        int i3 = this.f34057a;
        ChatActivityEnterView chatActivityEnterView = this.f34058b;
        boolean z10 = this.f34059c;
        switch (i3) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f31204u1.setVisibility(8);
                    return;
                }
                int i10 = ChatActivityEnterView.f31082t5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f31209v1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f31082t5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f34058b;
                yc ycVar = chatActivityEnterView2.G4;
                chatActivityEnterView2.N0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView2.S0(false, 0, 0, 0L, true);
                if (!z10 && (seVar = chatActivityEnterView2.M0) != null) {
                    seVar.g(!S0);
                    chatActivityEnterView2.M0 = null;
                    return;
                }
                chatActivityEnterView2.F4 = !S0;
                org.telegram.messenger.g0.r(ycVar);
                org.telegram.messenger.g0.i3(ycVar, 500L);
                return;
        }
    }
}
