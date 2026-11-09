package org.telegram.ui.Components;

import android.os.Build;
public final class cl implements Runnable {
    public final int f32706a;
    public final ChatAttachAlertPhotoLayout f32707b;

    public cl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f32706a = i7;
        this.f32707b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i7 = this.f32706a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32707b;
        switch (i7) {
            case 0:
                boolean z9 = ChatAttachAlertPhotoLayout.f31193q1;
                chatAttachAlertPhotoLayout.f39071b.f28627c.removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f31193q1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.f31223n0 = null;
                return;
            case 2:
                boolean z11 = ChatAttachAlertPhotoLayout.f31193q1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.f31223n0 = null;
                return;
            case 3:
                chatAttachAlertPhotoLayout.f31238x.setVisibility(8);
                return;
            case 4:
                chatAttachAlertPhotoLayout.G.f();
                return;
            case 5:
                boolean z12 = ChatAttachAlertPhotoLayout.f31193q1;
                di diVar = chatAttachAlertPhotoLayout.f39071b;
                if (f0.d.b(diVar.W1.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        diVar.W1.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.l0();
                return;
            default:
                boolean z13 = ChatAttachAlertPhotoLayout.f31193q1;
                di diVar2 = chatAttachAlertPhotoLayout.f39071b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        diVar2.W1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        diVar2.W1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
