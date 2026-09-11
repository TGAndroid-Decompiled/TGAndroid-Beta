package org.telegram.ui.Components;
public final class ll implements Runnable {
    public final int f28193a;
    public final ChatAttachAlertPhotoLayout f28194b;

    public ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f28193a = i10;
        this.f28194b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f28193a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28194b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f23831q1;
                chatAttachAlertPhotoLayout.f28753b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f23875w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f23831q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f23861n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f23831q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f23861n0 = null;
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
