package org.telegram.ui.Components;
public final class gl implements Runnable {
    public final int f28911a;
    public final ChatAttachAlertPhotoLayout f28912b;

    public gl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f28911a = i10;
        this.f28912b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f28911a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28912b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f26252m1;
                chatAttachAlertPhotoLayout.f28403b.getContainer().removeView(chatAttachAlertPhotoLayout.L);
                chatAttachAlertPhotoLayout.L = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f26292w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.C.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f26252m1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f26275j0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f26252m1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f26275j0 = null;
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
