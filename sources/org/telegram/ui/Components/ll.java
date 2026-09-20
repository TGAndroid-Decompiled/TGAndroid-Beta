package org.telegram.ui.Components;
public final class ll implements Runnable {
    public final int f26176a;
    public final ChatAttachAlertPhotoLayout f26177b;

    public ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f26176a = i10;
        this.f26177b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f26176a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26177b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f22119q1;
                chatAttachAlertPhotoLayout.f26655b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f22163w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f22119q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f22149n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f22119q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f22149n0 = null;
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
