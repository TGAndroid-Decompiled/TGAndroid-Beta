package org.telegram.ui.Components;
public final class ll implements Runnable {
    public final int f25938a;
    public final ChatAttachAlertPhotoLayout f25939b;

    public ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f25938a = i10;
        this.f25939b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f25938a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25939b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f21895q1;
                chatAttachAlertPhotoLayout.f26461b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f21939w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f21895q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f21925n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f21895q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f21925n0 = null;
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
