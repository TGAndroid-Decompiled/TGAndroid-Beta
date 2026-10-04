package org.telegram.ui.Components;
public final class ol implements Runnable {
    public final int f29396a;
    public final ChatAttachAlertPhotoLayout f29397b;

    public ol(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f29396a = i10;
        this.f29397b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f29396a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29397b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f24017q1;
                chatAttachAlertPhotoLayout.f29642b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f24061w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f24017q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24047n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f24017q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24047n0 = null;
                return;
            case 5:
                ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout);
                return;
            default:
                ChatAttachAlertPhotoLayout.M(chatAttachAlertPhotoLayout);
                return;
        }
    }
}
