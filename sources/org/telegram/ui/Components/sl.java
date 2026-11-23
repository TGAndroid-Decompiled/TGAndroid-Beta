package org.telegram.ui.Components;

import android.os.Build;
public final class sl implements Runnable {
    public final int f39613a;
    public final ChatAttachAlertPhotoLayout f39614b;

    public sl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f39613a = i7;
        this.f39614b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i7 = this.f39613a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39614b;
        switch (i7) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f32798r1;
                chatAttachAlertPhotoLayout.f37519b.f30179c.removeView(chatAttachAlertPhotoLayout.Q);
                chatAttachAlertPhotoLayout.Q = null;
                return;
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f32798r1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.f32829o0 = null;
                return;
            case 2:
                boolean z12 = ChatAttachAlertPhotoLayout.f32798r1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.f32829o0 = null;
                return;
            case 3:
                chatAttachAlertPhotoLayout.f32844x.setVisibility(8);
                return;
            case 4:
                chatAttachAlertPhotoLayout.H.f();
                return;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.f32798r1;
                ui uiVar = chatAttachAlertPhotoLayout.f37519b;
                if (f0.d.b(uiVar.f40367a2.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        uiVar.f40367a2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.l0();
                return;
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.f32798r1;
                ui uiVar2 = chatAttachAlertPhotoLayout.f37519b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        uiVar2.f40367a2.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        uiVar2.f40367a2.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
