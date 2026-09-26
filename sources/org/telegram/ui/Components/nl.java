package org.telegram.ui.Components;
public final class nl implements Runnable {
    public final int f26833a;
    public final ChatAttachAlertPhotoLayout f26834b;

    public nl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f26833a = i10;
        this.f26834b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f26833a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26834b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f22120q1;
                chatAttachAlertPhotoLayout.f27043b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f22164w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f22120q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f22150n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f22120q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f22150n0 = null;
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
