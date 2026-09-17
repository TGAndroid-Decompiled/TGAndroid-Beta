package org.telegram.ui.Components;
public final class ll implements Runnable {
    public final int f28194a;
    public final ChatAttachAlertPhotoLayout f28195b;

    public ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f28194a = i10;
        this.f28195b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f28194a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28195b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f23832q1;
                chatAttachAlertPhotoLayout.f28754b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f23876w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f23832q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f23862n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f23832q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f23862n0 = null;
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
