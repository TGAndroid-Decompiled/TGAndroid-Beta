package org.telegram.ui.Components;
public final class ol implements Runnable {
    public final int f27117a;
    public final ChatAttachAlertPhotoLayout f27118b;

    public ol(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f27117a = i10;
        this.f27118b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f27117a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27118b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f22142q1;
                chatAttachAlertPhotoLayout.f27362b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f22186w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f22142q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f22172n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f22142q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f22172n0 = null;
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
