package org.telegram.ui.Components;

import android.os.Build;
public final class cm implements Runnable {
    public final int f25385a;
    public final ChatAttachAlertPhotoLayout f25386b;

    public cm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f25385a = i10;
        this.f25386b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f25385a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25386b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f24049q1;
                chatAttachAlertPhotoLayout.f30245b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f24093w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f24049q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24079n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f24049q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24079n0 = null;
                return;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.f24049q1;
                yi yiVar = chatAttachAlertPhotoLayout.f30245b;
                if (f0.c.b(yiVar.f33289f0.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        yiVar.f33289f0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.i0();
                return;
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.f24049q1;
                yi yiVar2 = chatAttachAlertPhotoLayout.f30245b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        yiVar2.f33289f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        yiVar2.f33289f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
