package org.telegram.ui.Components;

import android.os.Build;
public final class xl implements Runnable {
    public final int f34791a;
    public final ChatAttachAlertPhotoLayout f34792b;

    public xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f34791a = i10;
        this.f34792b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f34791a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34792b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f26017q1;
                chatAttachAlertPhotoLayout.f30254b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f26061w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f26017q1;
                chatAttachAlertPhotoLayout.u0(false);
                chatAttachAlertPhotoLayout.f26047n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f26017q1;
                chatAttachAlertPhotoLayout.u0(false);
                chatAttachAlertPhotoLayout.f26047n0 = null;
                return;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.f26017q1;
                ti tiVar = chatAttachAlertPhotoLayout.f30254b;
                if (f0.c.b(tiVar.f32990f0.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        tiVar.f32990f0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.j0();
                return;
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.f26017q1;
                ti tiVar2 = chatAttachAlertPhotoLayout.f30254b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        tiVar2.f32990f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        tiVar2.f32990f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
