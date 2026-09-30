package org.telegram.ui.Components;
public final class nl implements Runnable {
    public final int f26799a;
    public final ChatAttachAlertPhotoLayout f26800b;

    public nl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f26799a = i10;
        this.f26800b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f26799a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26800b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f22122q1;
                chatAttachAlertPhotoLayout.f27075b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f22166w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f22122q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f22152n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f22122q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f22152n0 = null;
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
