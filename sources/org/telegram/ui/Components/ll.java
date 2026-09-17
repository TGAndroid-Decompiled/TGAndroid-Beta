package org.telegram.ui.Components;
public final class ll implements Runnable {
    public final int f28221a;
    public final ChatAttachAlertPhotoLayout f28222b;

    public ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f28221a = i10;
        this.f28222b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f28221a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28222b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f23859q1;
                chatAttachAlertPhotoLayout.f28781b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f23903w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f23859q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f23889n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f23859q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f23889n0 = null;
                return;
            case 5:
                ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout);
                return;
            default:
                ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout);
                return;
        }
    }
}
