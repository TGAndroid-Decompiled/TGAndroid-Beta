package org.telegram.ui.Components;
public final class fd implements Runnable {
    public final int f34584a;
    public final ChatActivityEnterView f34585b;
    public final boolean f34586c;

    public fd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7) {
        this.f34584a = i7;
        this.f34585b = chatActivityEnterView;
        this.f34586c = z10;
    }

    @Override
    public final void run() {
        org.telegram.ui.bg0 bg0Var;
        int i7 = this.f34584a;
        ChatActivityEnterView chatActivityEnterView = this.f34585b;
        boolean z10 = this.f34586c;
        switch (i7) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f32164b2.setVisibility(8);
                    return;
                }
                int i10 = ChatActivityEnterView.N6;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f32172c2.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.N6;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f34585b;
                uc ucVar = chatActivityEnterView2.X5;
                chatActivityEnterView2.N0 = System.currentTimeMillis();
                boolean k12 = chatActivityEnterView2.k1(false, 0, 0, 0L, true);
                if (!z10 && (bg0Var = chatActivityEnterView2.M0) != null) {
                    bg0Var.h(!k12);
                    chatActivityEnterView2.M0 = null;
                    return;
                }
                chatActivityEnterView2.W5 = !k12;
                org.telegram.messenger.g0.r(ucVar);
                org.telegram.messenger.g0.i3(ucVar, 500L);
                return;
        }
    }
}
