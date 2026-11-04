package org.telegram.ui.Components;

import android.os.Build;
public final class al implements Runnable {
    public final int f31870a;
    public final ChatAttachAlertPhotoLayout f31871b;

    public al(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i3) {
        this.f31870a = i3;
        this.f31871b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i3 = this.f31870a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31871b;
        switch (i3) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f31258r1;
                chatAttachAlertPhotoLayout.f38416b.f28589c.removeView(chatAttachAlertPhotoLayout.Q);
                chatAttachAlertPhotoLayout.Q = null;
                return;
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f31258r1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.f31289o0 = null;
                return;
            case 2:
                boolean z12 = ChatAttachAlertPhotoLayout.f31258r1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.f31289o0 = null;
                return;
            case 3:
                chatAttachAlertPhotoLayout.f31304x.setVisibility(8);
                return;
            case 4:
                chatAttachAlertPhotoLayout.H.f();
                return;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.f31258r1;
                bi biVar = chatAttachAlertPhotoLayout.f38416b;
                if (f0.d.b(biVar.X1.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        biVar.X1.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.l0();
                return;
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.f31258r1;
                bi biVar2 = chatAttachAlertPhotoLayout.f38416b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        biVar2.X1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        biVar2.X1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
