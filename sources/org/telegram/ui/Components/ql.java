package org.telegram.ui.Components;

import android.os.Build;
public final class ql implements Runnable {
    public final int f38902a;
    public final ChatAttachAlertPhotoLayout f38903b;

    public ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f38902a = i7;
        this.f38903b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i7 = this.f38902a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38903b;
        switch (i7) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f32862r1;
                chatAttachAlertPhotoLayout.f37135b.f30229c.removeView(chatAttachAlertPhotoLayout.Q);
                chatAttachAlertPhotoLayout.Q = null;
                return;
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f32862r1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.f32893o0 = null;
                return;
            case 2:
                boolean z12 = ChatAttachAlertPhotoLayout.f32862r1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.f32893o0 = null;
                return;
            case 3:
                chatAttachAlertPhotoLayout.f32908x.setVisibility(8);
                return;
            case 4:
                chatAttachAlertPhotoLayout.H.f();
                return;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.f32862r1;
                ti tiVar = chatAttachAlertPhotoLayout.f37135b;
                if (f0.d.b(tiVar.f39956a2.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        tiVar.f39956a2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.l0();
                return;
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.f32862r1;
                ti tiVar2 = chatAttachAlertPhotoLayout.f37135b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        tiVar2.f39956a2.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        tiVar2.f39956a2.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
