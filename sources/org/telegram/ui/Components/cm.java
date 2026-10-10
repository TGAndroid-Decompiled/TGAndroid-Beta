package org.telegram.ui.Components;

import android.os.Build;
public final class cm implements Runnable {
    public final int f25323a;
    public final ChatAttachAlertPhotoLayout f25324b;

    public cm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f25323a = i10;
        this.f25324b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f25323a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25324b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f24025q1;
                chatAttachAlertPhotoLayout.f30211b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f24069w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f24025q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24055n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f24025q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24055n0 = null;
                return;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.f24025q1;
                yi yiVar = chatAttachAlertPhotoLayout.f30211b;
                if (f0.c.b(yiVar.f33235f0.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        yiVar.f33235f0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.i0();
                return;
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.f24025q1;
                yi yiVar2 = chatAttachAlertPhotoLayout.f30211b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        yiVar2.f33235f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        yiVar2.f33235f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
