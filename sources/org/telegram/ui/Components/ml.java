package org.telegram.ui.Components;
public final class ml implements Runnable {
    public final int f26530a;
    public final ChatAttachAlertPhotoLayout f26531b;

    public ml(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f26530a = i10;
        this.f26531b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f26530a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26531b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f22106q1;
                chatAttachAlertPhotoLayout.f27083b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f22150w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f22106q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f22136n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f22106q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f22136n0 = null;
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
