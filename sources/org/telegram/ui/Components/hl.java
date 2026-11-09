package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class hl implements dt0 {
    public File f34329a;
    public boolean f34330b;
    public final org.telegram.ui.ActionBar.g6 f34331c;
    public final FrameLayout d;
    public final ChatAttachAlertPhotoLayout f34332e;

    public hl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.l2 l2Var) {
        this.f34332e = chatAttachAlertPhotoLayout;
        this.f34331c = g6Var;
        this.d = l2Var;
    }

    public final void a() {
        ql qlVar;
        boolean z9;
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34332e;
        di diVar = chatAttachAlertPhotoLayout.f39071b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f31218k0;
        if (!chatAttachAlertPhotoLayout.f31232s0 && (qlVar = chatAttachAlertPhotoLayout.P) != null && qlVar.getCameraSession() != null) {
            if (shutterButton.getState() == et0.f33495b) {
                chatAttachAlertPhotoLayout.o0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(et0.f33494a);
            } else if (!chatAttachAlertPhotoLayout.f31239x0) {
                org.telegram.messenger.k5.p(null, 2131749542, new hc(chatAttachAlertPhotoLayout.P, this.f34331c), null);
            } else {
                org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                if ((f2Var instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var).z()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                File q02 = org.telegram.messenger.g0.q0(null, z9);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(diVar.W1 instanceof org.telegram.ui.cn) && diVar.K2 != 2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                cameraSession.setFlipFront(z10);
                chatAttachAlertPhotoLayout.f31232s0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new fi.nb(this, q02, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
