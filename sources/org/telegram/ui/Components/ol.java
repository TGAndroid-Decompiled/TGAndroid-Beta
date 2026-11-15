package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class ol implements ct0 {
    public File f38016a;
    public boolean f38017b;
    public final org.telegram.ui.ActionBar.e6 f38018c;
    public final FrameLayout d;
    public final ChatAttachAlertPhotoLayout f38019e;

    public ol(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f38019e = chatAttachAlertPhotoLayout;
        this.f38018c = e6Var;
        this.d = k2Var;
    }

    public final void a() {
        xl xlVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38019e;
        ki kiVar = chatAttachAlertPhotoLayout.f33609b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f32392l0;
        if (!chatAttachAlertPhotoLayout.f32406t0 && (xlVar = chatAttachAlertPhotoLayout.Q) != null && xlVar.getCameraSession() != null) {
            if (shutterButton.getState() == dt0.f34050b) {
                chatAttachAlertPhotoLayout.o0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.Q.getCameraSession(), false);
                shutterButton.a(dt0.f34049a);
            } else if (!chatAttachAlertPhotoLayout.f32414y0) {
                org.telegram.messenger.k5.o(null, 2131749542, new cc(chatAttachAlertPhotoLayout.Q, this.f38018c), null);
            } else {
                org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36424a2;
                if ((e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).z()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File q02 = org.telegram.messenger.g0.q0(null, z10);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.Q.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.Q.getCameraSession();
                if (!(kiVar.f36424a2 instanceof org.telegram.ui.an) && kiVar.O2 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f32406t0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), new hi.kb(this, q02, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.Q.startTakePictureAnimation(true);
            }
        }
    }
}
