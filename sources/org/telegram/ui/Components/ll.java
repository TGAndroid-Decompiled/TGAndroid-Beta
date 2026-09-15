package org.telegram.ui.Components;
public final class ll implements Runnable {
    public final int f25935a;
    public final ChatAttachAlertPhotoLayout f25936b;

    public ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f25935a = i10;
        this.f25936b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f25935a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25936b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f21898q1;
                chatAttachAlertPhotoLayout.f26462b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f21942w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f21898q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f21928n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f21898q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f21928n0 = null;
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
