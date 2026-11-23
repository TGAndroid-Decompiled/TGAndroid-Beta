package org.telegram.ui.Components;
public final class od implements Runnable {
    public final int f38133a;
    public final ChatActivityEnterView f38134b;
    public final boolean f38135c;

    public od(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7) {
        this.f38133a = i7;
        this.f38134b = chatActivityEnterView;
        this.f38135c = z10;
    }

    @Override
    public final void run() {
        org.telegram.ui.eg0 eg0Var;
        int i7 = this.f38133a;
        ChatActivityEnterView chatActivityEnterView = this.f38134b;
        boolean z10 = this.f38135c;
        switch (i7) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f32612j2.setVisibility(8);
                    return;
                }
                int i10 = ChatActivityEnterView.f32535s7;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f32619k2.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f32535s7;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f38134b;
                td tdVar = chatActivityEnterView2.f32586f6;
                chatActivityEnterView2.N0 = System.currentTimeMillis();
                boolean w12 = chatActivityEnterView2.w1(false, 0, 0, 0L, true);
                if (!z10 && (eg0Var = chatActivityEnterView2.M0) != null) {
                    eg0Var.h(!w12);
                    chatActivityEnterView2.M0 = null;
                    return;
                }
                chatActivityEnterView2.f32577e6 = !w12;
                org.telegram.messenger.g0.r(tdVar);
                org.telegram.messenger.g0.h3(tdVar, 500L);
                return;
        }
    }
}
