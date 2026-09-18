package org.telegram.ui.Components;
public final class ll implements Runnable {
    public final int f25927a;
    public final ChatAttachAlertPhotoLayout f25928b;

    public ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f25927a = i10;
        this.f25928b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f25927a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25928b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f21911q1;
                chatAttachAlertPhotoLayout.f26463b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f21955w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f21911q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f21941n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f21911q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f21941n0 = null;
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
