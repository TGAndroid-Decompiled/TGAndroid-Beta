package org.telegram.ui.Components;

import android.os.Build;
public final class ql implements Runnable {
    public final int f38825a;
    public final ChatAttachAlertPhotoLayout f38826b;

    public ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f38825a = i7;
        this.f38826b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i7 = this.f38825a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38826b;
        switch (i7) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f32762r1;
                chatAttachAlertPhotoLayout.f36766b.f30195c.removeView(chatAttachAlertPhotoLayout.Q);
                chatAttachAlertPhotoLayout.Q = null;
                return;
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f32762r1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.f32793o0 = null;
                return;
            case 2:
                boolean z12 = ChatAttachAlertPhotoLayout.f32762r1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.f32793o0 = null;
                return;
            case 3:
                chatAttachAlertPhotoLayout.f32808x.setVisibility(8);
                return;
            case 4:
                chatAttachAlertPhotoLayout.H.f();
                return;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.f32762r1;
                si siVar = chatAttachAlertPhotoLayout.f36766b;
                if (f0.d.b(siVar.f39659a2.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        siVar.f39659a2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.l0();
                return;
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.f32762r1;
                si siVar2 = chatAttachAlertPhotoLayout.f36766b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        siVar2.f39659a2.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        siVar2.f39659a2.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
