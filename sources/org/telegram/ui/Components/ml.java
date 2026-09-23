package org.telegram.ui.Components;
public final class ml implements Runnable {
    public final int f26191a;
    public final ChatAttachAlertPhotoLayout f26192b;

    public ml(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f26191a = i10;
        this.f26192b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f26191a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26192b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f21869q1;
                chatAttachAlertPhotoLayout.f26744b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f21913w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f21869q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f21899n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f21869q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f21899n0 = null;
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
