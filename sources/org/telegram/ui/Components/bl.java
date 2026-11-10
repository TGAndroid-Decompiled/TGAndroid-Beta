package org.telegram.ui.Components;

import android.os.Build;
public final class bl implements Runnable {
    public final int f32281a;
    public final ChatAttachAlertPhotoLayout f32282b;

    public bl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f32281a = i7;
        this.f32282b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i7 = this.f32281a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32282b;
        switch (i7) {
            case 0:
                boolean z9 = ChatAttachAlertPhotoLayout.f31204q1;
                chatAttachAlertPhotoLayout.f38656b.f28675c.removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f31204q1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.f31234n0 = null;
                return;
            case 2:
                boolean z11 = ChatAttachAlertPhotoLayout.f31204q1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.f31234n0 = null;
                return;
            case 3:
                chatAttachAlertPhotoLayout.f31249x.setVisibility(8);
                return;
            case 4:
                chatAttachAlertPhotoLayout.G.f();
                return;
            case 5:
                boolean z12 = ChatAttachAlertPhotoLayout.f31204q1;
                ci ciVar = chatAttachAlertPhotoLayout.f38656b;
                if (f0.d.b(ciVar.Z1.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        ciVar.Z1.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.l0();
                return;
            default:
                boolean z13 = ChatAttachAlertPhotoLayout.f31204q1;
                ci ciVar2 = chatAttachAlertPhotoLayout.f38656b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        ciVar2.Z1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        ciVar2.Z1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
