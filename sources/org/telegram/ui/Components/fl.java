package org.telegram.ui.Components;
public final class fl implements Runnable {
    public final int f24909a;
    public final ChatAttachAlertPhotoLayout f24910b;

    public fl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f24909a = i10;
        this.f24910b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f24909a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24910b;
        switch (i10) {
            case 0:
                boolean z4 = ChatAttachAlertPhotoLayout.f22867n1;
                chatAttachAlertPhotoLayout.f24282b.getContainer().removeView(chatAttachAlertPhotoLayout.M);
                chatAttachAlertPhotoLayout.M = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f22908w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.D.l();
                return;
            case 3:
                boolean z10 = ChatAttachAlertPhotoLayout.f22867n1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f22892k0 = null;
                return;
            case 4:
                boolean z11 = ChatAttachAlertPhotoLayout.f22867n1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f22892k0 = null;
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
