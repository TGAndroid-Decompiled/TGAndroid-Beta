package org.telegram.ui.Components;

import android.os.Build;
public final class jl implements Runnable {
    public final int f36025a;
    public final ChatAttachAlertPhotoLayout f36026b;

    public jl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f36025a = i7;
        this.f36026b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i7 = this.f36025a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36026b;
        switch (i7) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f32365r1;
                chatAttachAlertPhotoLayout.f33609b.f29685c.removeView(chatAttachAlertPhotoLayout.Q);
                chatAttachAlertPhotoLayout.Q = null;
                return;
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f32365r1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.f32396o0 = null;
                return;
            case 2:
                boolean z12 = ChatAttachAlertPhotoLayout.f32365r1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.f32396o0 = null;
                return;
            case 3:
                chatAttachAlertPhotoLayout.f32411x.setVisibility(8);
                return;
            case 4:
                chatAttachAlertPhotoLayout.H.f();
                return;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.f32365r1;
                ki kiVar = chatAttachAlertPhotoLayout.f33609b;
                if (f0.d.b(kiVar.f36424a2.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        kiVar.f36424a2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.l0();
                return;
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.f32365r1;
                ki kiVar2 = chatAttachAlertPhotoLayout.f33609b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        kiVar2.f36424a2.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        kiVar2.f36424a2.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
