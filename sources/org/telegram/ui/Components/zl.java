package org.telegram.ui.Components;

import android.os.Build;
public final class zl implements Runnable {
    public final int f31895a;
    public final ChatAttachAlertPhotoLayout f31896b;

    public zl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f31895a = i10;
        this.f31896b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f31895a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31896b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f23018q1;
                chatAttachAlertPhotoLayout.f27671b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                chatAttachAlertPhotoLayout.f23062w.setVisibility(8);
                return;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                return;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.f23018q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f23048n0 = null;
                return;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.f23018q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.f23048n0 = null;
                return;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.f23018q1;
                vi viVar = chatAttachAlertPhotoLayout.f27671b;
                if (f0.c.b(viVar.f30001f0.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        viVar.f30001f0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.i0();
                return;
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.f23018q1;
                vi viVar2 = chatAttachAlertPhotoLayout.f27671b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        viVar2.f30001f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        viVar2.f30001f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
