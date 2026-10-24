package org.telegram.ui.Components;

import android.os.Build;
public final class ul implements Runnable {
    public final int f31157a;
    public final ChatAttachAlertPhotoLayout f31158b;

    public ul(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f31157a = i10;
        this.f31158b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f31157a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31158b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f24223q1;
                chatAttachAlertPhotoLayout.f27704b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f24267w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f24223q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24253n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f24223q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f24253n0 = null;
                return;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.f24223q1;
                ri riVar = chatAttachAlertPhotoLayout.f27704b;
                if (f0.c.b(riVar.f30146f0.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        riVar.f30146f0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.i0();
                return;
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.f24223q1;
                ri riVar2 = chatAttachAlertPhotoLayout.f27704b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        riVar2.f30146f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        riVar2.f30146f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
