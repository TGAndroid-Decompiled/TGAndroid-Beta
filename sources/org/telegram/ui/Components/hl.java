package org.telegram.ui.Components;
public final class hl implements Runnable {
    public final int f27509a;
    public final ChatAttachAlertPhotoLayout f27510b;

    public hl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f27509a = i10;
        this.f27510b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f27509a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27510b;
        switch (i10) {
            case 0:
                boolean z4 = ChatAttachAlertPhotoLayout.f24736n1;
                chatAttachAlertPhotoLayout.f26546b.getContainer().removeView(chatAttachAlertPhotoLayout.M);
                chatAttachAlertPhotoLayout.M = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f24777w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.D.l();
                return;
            case 3:
                boolean z10 = ChatAttachAlertPhotoLayout.f24736n1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24761k0 = null;
                return;
            case 4:
                boolean z11 = ChatAttachAlertPhotoLayout.f24736n1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24761k0 = null;
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
