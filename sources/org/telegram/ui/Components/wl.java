package org.telegram.ui.Components;

import android.os.Build;
public final class wl implements Runnable {
    public final int f32151a;
    public final ChatAttachAlertPhotoLayout f32152b;

    public wl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f32151a = i10;
        this.f32152b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f32151a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32152b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f24080q1;
                chatAttachAlertPhotoLayout.f28176b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f24124w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f24080q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24110n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f24080q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24110n0 = null;
                return;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.f24080q1;
                ti tiVar = chatAttachAlertPhotoLayout.f28176b;
                if (f0.c.b(tiVar.f30549f0.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        tiVar.f30549f0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.i0();
                return;
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.f24080q1;
                ti tiVar2 = chatAttachAlertPhotoLayout.f28176b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        tiVar2.f30549f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        tiVar2.f30549f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
