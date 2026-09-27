package org.telegram.ui.Components;
public final class nl implements Runnable {
    public final int f26854a;
    public final ChatAttachAlertPhotoLayout f26855b;

    public nl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f26854a = i10;
        this.f26855b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f26854a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26855b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f22123q1;
                chatAttachAlertPhotoLayout.f27104b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f22167w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f22123q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f22153n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f22123q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f22153n0 = null;
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
