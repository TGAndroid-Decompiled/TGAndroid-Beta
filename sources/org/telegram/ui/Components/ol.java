package org.telegram.ui.Components;
public final class ol implements Runnable {
    public final int f29502a;
    public final ChatAttachAlertPhotoLayout f29503b;

    public ol(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f29502a = i10;
        this.f29503b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f29502a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29503b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f24025q1;
                chatAttachAlertPhotoLayout.f29741b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f24069w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f24025q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24055n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f24025q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24055n0 = null;
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
