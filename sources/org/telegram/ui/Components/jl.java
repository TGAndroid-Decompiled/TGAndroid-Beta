package org.telegram.ui.Components;

import android.os.Build;
public final class jl implements Runnable {
    public final int f36035a;
    public final ChatAttachAlertPhotoLayout f36036b;

    public jl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f36035a = i7;
        this.f36036b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i7 = this.f36035a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36036b;
        switch (i7) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f32365r1;
                chatAttachAlertPhotoLayout.f33607b.f29685c.removeView(chatAttachAlertPhotoLayout.Q);
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
                ki kiVar = chatAttachAlertPhotoLayout.f33607b;
                if (f0.d.b(kiVar.f36436a2.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        kiVar.f36436a2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.l0();
                return;
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.f32365r1;
                ki kiVar2 = chatAttachAlertPhotoLayout.f33607b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        kiVar2.f36436a2.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        kiVar2.f36436a2.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
