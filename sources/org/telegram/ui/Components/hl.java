package org.telegram.ui.Components;

import android.os.Build;
public final class hl implements Runnable {
    public final int f26812a;
    public final ChatAttachAlertPhotoLayout f26813b;

    public hl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f26812a = i10;
        this.f26813b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f26812a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26813b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f23846q1;
                chatAttachAlertPhotoLayout.f30964b.f21590c.removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                return;
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f23846q1;
                chatAttachAlertPhotoLayout.u0(false);
                chatAttachAlertPhotoLayout.f23876n0 = null;
                return;
            case 2:
                boolean z12 = ChatAttachAlertPhotoLayout.f23846q1;
                chatAttachAlertPhotoLayout.u0(false);
                chatAttachAlertPhotoLayout.f23876n0 = null;
                return;
            case 3:
                chatAttachAlertPhotoLayout.f23892x.setVisibility(8);
                return;
            case 4:
                chatAttachAlertPhotoLayout.G.f();
                return;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.f23846q1;
                bi biVar = chatAttachAlertPhotoLayout.f30964b;
                if (f0.c.b(biVar.W1.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        biVar.W1.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.j0();
                return;
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.f23846q1;
                bi biVar2 = chatAttachAlertPhotoLayout.f30964b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        biVar2.W1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        biVar2.W1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
