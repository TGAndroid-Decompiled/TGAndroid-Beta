package org.telegram.ui.Components;
public final class cl implements Runnable {
    public final int f27505a;
    public final ChatAttachAlertPhotoLayout f27506b;

    public cl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i9) {
        this.f27505a = i9;
        this.f27506b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i9 = this.f27505a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27506b;
        switch (i9) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f26241m1;
                chatAttachAlertPhotoLayout.f27493b.getContainer().removeView(chatAttachAlertPhotoLayout.L);
                chatAttachAlertPhotoLayout.L = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f26281w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.C.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f26241m1;
                chatAttachAlertPhotoLayout.s0(false);
                chatAttachAlertPhotoLayout.f26264j0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f26241m1;
                chatAttachAlertPhotoLayout.s0(false);
                chatAttachAlertPhotoLayout.f26264j0 = null;
                return;
            case 5:
                ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout);
                return;
            default:
                ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout);
                return;
        }
    }
}
