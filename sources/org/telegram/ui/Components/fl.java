package org.telegram.ui.Components;
public final class fl implements Runnable {
    public final int f24896a;
    public final ChatAttachAlertPhotoLayout f24897b;

    public fl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f24896a = i10;
        this.f24897b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f24896a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24897b;
        switch (i10) {
            case 0:
                boolean z4 = ChatAttachAlertPhotoLayout.f22894n1;
                chatAttachAlertPhotoLayout.f24278b.getContainer().removeView(chatAttachAlertPhotoLayout.M);
                chatAttachAlertPhotoLayout.M = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f22935w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.D.l();
                return;
            case 3:
                boolean z10 = ChatAttachAlertPhotoLayout.f22894n1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f22919k0 = null;
                return;
            case 4:
                boolean z11 = ChatAttachAlertPhotoLayout.f22894n1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f22919k0 = null;
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
