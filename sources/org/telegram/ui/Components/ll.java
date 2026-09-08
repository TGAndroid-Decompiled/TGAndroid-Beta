package org.telegram.ui.Components;
public final class ll implements Runnable {
    public final int f28220a;
    public final ChatAttachAlertPhotoLayout f28221b;

    public ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f28220a = i10;
        this.f28221b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f28220a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28221b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f23858q1;
                chatAttachAlertPhotoLayout.f28780b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f23902w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f23858q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f23888n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f23858q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f23888n0 = null;
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
