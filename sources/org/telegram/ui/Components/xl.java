package org.telegram.ui.Components;

import android.os.Build;
public final class xl implements Runnable {
    public final int f34769a;
    public final ChatAttachAlertPhotoLayout f34770b;

    public xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f34769a = i10;
        this.f34770b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f34769a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34770b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f26013q1;
                chatAttachAlertPhotoLayout.f30213b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f26057w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f26013q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f26043n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f26013q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f26043n0 = null;
                return;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.f26013q1;
                ti tiVar = chatAttachAlertPhotoLayout.f30213b;
                if (f0.c.b(tiVar.f33018f0.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        tiVar.f33018f0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.i0();
                return;
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.f26013q1;
                ti tiVar2 = chatAttachAlertPhotoLayout.f30213b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        tiVar2.f33018f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        tiVar2.f33018f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
