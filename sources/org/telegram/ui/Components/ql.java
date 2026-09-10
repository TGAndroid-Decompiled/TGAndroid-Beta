package org.telegram.ui.Components;
public final class ql implements Runnable {
    public final int f26443a;
    public final ChatAttachAlertPhotoLayout f26444b;

    public ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f26443a = i10;
        this.f26444b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f26443a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26444b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f20983q1;
                chatAttachAlertPhotoLayout.f26422b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f21027w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f20983q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f21013n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f20983q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f21013n0 = null;
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
