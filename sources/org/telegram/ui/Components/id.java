package org.telegram.ui.Components;
public final class id implements Runnable {
    public final int f34633a;
    public final ChatActivityEnterView f34634b;
    public final boolean f34635c;

    public id(ChatActivityEnterView chatActivityEnterView, boolean z9, int i7) {
        this.f34633a = i7;
        this.f34634b = chatActivityEnterView;
        this.f34635c = z9;
    }

    @Override
    public final void run() {
        ue ueVar;
        int i7 = this.f34633a;
        ChatActivityEnterView chatActivityEnterView = this.f34634b;
        boolean z9 = this.f34635c;
        switch (i7) {
            case 0:
                if (!z9) {
                    chatActivityEnterView.f31129t1.setVisibility(8);
                    return;
                }
                int i10 = ChatActivityEnterView.s5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z9) {
                    chatActivityEnterView.f31134u1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.s5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f34634b;
                ad adVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(false, 0, 0, 0L, true);
                if (!z9 && (ueVar = chatActivityEnterView2.L0) != null) {
                    ueVar.g(!T0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.E4 = !T0;
                org.telegram.messenger.g0.r(adVar);
                org.telegram.messenger.g0.i3(adVar, 500L);
                return;
        }
    }
}
