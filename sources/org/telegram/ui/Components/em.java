package org.telegram.ui.Components;

import android.os.Build;
public final class em implements Runnable {
    public final int f25728a;
    public final ChatAttachAlertPhotoLayout f25729b;

    public em(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f25728a = i10;
        this.f25729b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f25728a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25729b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f23798q1;
                chatAttachAlertPhotoLayout.f30574b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f23842w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f23798q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f23828n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f23798q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f23828n0 = null;
                return;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.f23798q1;
                aj ajVar = chatAttachAlertPhotoLayout.f30574b;
                if (f0.c.b(ajVar.f24342f0.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        ajVar.f24342f0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.i0();
                return;
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.f23798q1;
                aj ajVar2 = chatAttachAlertPhotoLayout.f30574b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        ajVar2.f24342f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        ajVar2.f24342f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
