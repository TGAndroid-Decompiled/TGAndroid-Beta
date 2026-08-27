package org.telegram.ui.Components;

public final class yk implements Runnable {

    public final int f34914a;

    public final ChatAttachAlertPhotoLayout f34915b;

    public yk(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f34914a = i10;
        this.f34915b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f34914a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34915b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f26237m1;
                chatAttachAlertPhotoLayout.f34900b.getContainer().removeView(chatAttachAlertPhotoLayout.L);
                chatAttachAlertPhotoLayout.L = null;
                break;
            case 1:
                chatAttachAlertPhotoLayout.f26277w.setVisibility(8);
                break;
            case 2:
                chatAttachAlertPhotoLayout.C.l();
                break;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f26237m1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f26260j0 = null;
                break;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f26237m1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f26260j0 = null;
                break;
            case 5:
                ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout);
                break;
            default:
                ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout);
                break;
        }
    }
}
