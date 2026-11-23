package org.telegram.ui.Components;
public final class od implements Runnable {
    public final int f38127a;
    public final ChatActivityEnterView f38128b;
    public final boolean f38129c;

    public od(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7) {
        this.f38127a = i7;
        this.f38128b = chatActivityEnterView;
        this.f38129c = z10;
    }

    @Override
    public final void run() {
        org.telegram.ui.dg0 dg0Var;
        int i7 = this.f38127a;
        ChatActivityEnterView chatActivityEnterView = this.f38128b;
        boolean z10 = this.f38129c;
        switch (i7) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f32710j2.setVisibility(8);
                    return;
                }
                int i10 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f32717k2.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f38128b;
                td tdVar = chatActivityEnterView2.f32684f6;
                chatActivityEnterView2.N0 = System.currentTimeMillis();
                boolean x12 = chatActivityEnterView2.x1(false, 0, 0, 0L, true);
                if (!z10 && (dg0Var = chatActivityEnterView2.M0) != null) {
                    dg0Var.h(!x12);
                    chatActivityEnterView2.M0 = null;
                    return;
                }
                chatActivityEnterView2.f32675e6 = !x12;
                org.telegram.messenger.g0.r(tdVar);
                org.telegram.messenger.g0.h3(tdVar, 500L);
                return;
        }
    }
}
