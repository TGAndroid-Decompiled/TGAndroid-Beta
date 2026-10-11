package org.telegram.ui.Components;

import android.os.Build;
public final class cm implements Runnable {
    public final int f25241a;
    public final ChatAttachAlertPhotoLayout f25242b;

    public cm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f25241a = i10;
        this.f25242b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f25241a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25242b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f24013q1;
                chatAttachAlertPhotoLayout.f30161b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f24057w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f24013q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24043n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f24013q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24043n0 = null;
                return;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.f24013q1;
                yi yiVar = chatAttachAlertPhotoLayout.f30161b;
                if (f0.c.b(yiVar.f33216f0.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        yiVar.f33216f0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.i0();
                return;
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.f24013q1;
                yi yiVar2 = chatAttachAlertPhotoLayout.f30161b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        yiVar2.f33216f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        yiVar2.f33216f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
