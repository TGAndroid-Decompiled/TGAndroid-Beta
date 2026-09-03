package org.telegram.ui.Components;
public final class hl implements Runnable {
    public final int f27558a;
    public final ChatAttachAlertPhotoLayout f27559b;

    public hl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f27558a = i10;
        this.f27559b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f27558a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27559b;
        switch (i10) {
            case 0:
                boolean z4 = ChatAttachAlertPhotoLayout.f24738n1;
                chatAttachAlertPhotoLayout.f26590b.getContainer().removeView(chatAttachAlertPhotoLayout.M);
                chatAttachAlertPhotoLayout.M = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f24779w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.D.l();
                return;
            case 3:
                boolean z10 = ChatAttachAlertPhotoLayout.f24738n1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24763k0 = null;
                return;
            case 4:
                boolean z11 = ChatAttachAlertPhotoLayout.f24738n1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24763k0 = null;
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
