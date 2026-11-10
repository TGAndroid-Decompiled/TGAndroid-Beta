package org.telegram.ui.Components;
public final class hd implements Runnable {
    public final int f34309a;
    public final ChatActivityEnterView f34310b;
    public final boolean f34311c;

    public hd(ChatActivityEnterView chatActivityEnterView, boolean z9, int i7) {
        this.f34309a = i7;
        this.f34310b = chatActivityEnterView;
        this.f34311c = z9;
    }

    @Override
    public final void run() {
        te teVar;
        int i7 = this.f34309a;
        ChatActivityEnterView chatActivityEnterView = this.f34310b;
        boolean z9 = this.f34311c;
        switch (i7) {
            case 0:
                if (!z9) {
                    chatActivityEnterView.f31145t1.setVisibility(8);
                    return;
                }
                int i10 = ChatActivityEnterView.s5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z9) {
                    chatActivityEnterView.f31150u1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.s5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f34310b;
                zc zcVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(false, 0, 0, 0L, true);
                if (!z9 && (teVar = chatActivityEnterView2.L0) != null) {
                    teVar.g(!T0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.E4 = !T0;
                org.telegram.messenger.g0.r(zcVar);
                org.telegram.messenger.g0.i3(zcVar, 500L);
                return;
        }
    }
}
