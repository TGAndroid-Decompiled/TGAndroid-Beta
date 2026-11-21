package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class xl implements nt0 {
    public File f42170a;
    public boolean f42171b;
    public final org.telegram.ui.ActionBar.h6 f42172c;
    public final FrameLayout d;
    public final ChatAttachAlertPhotoLayout f42173e;

    public xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f42173e = chatAttachAlertPhotoLayout;
        this.f42172c = h6Var;
        this.d = m2Var;
    }

    public final void a() {
        gm gmVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f42173e;
        ui uiVar = chatAttachAlertPhotoLayout.f37521b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f32822l0;
        if (!chatAttachAlertPhotoLayout.f32836t0 && (gmVar = chatAttachAlertPhotoLayout.Q) != null && gmVar.getCameraSession() != null) {
            if (shutterButton.getState() == ot0.f38356b) {
                chatAttachAlertPhotoLayout.o0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.Q.getCameraSession(), false);
                shutterButton.a(ot0.f38355a);
            } else if (!chatAttachAlertPhotoLayout.f32844y0) {
                org.telegram.messenger.f3.o(null, 2131749366, new lc(chatAttachAlertPhotoLayout.Q, this.f42172c), null);
            } else {
                org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40375a2;
                if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).z()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File q02 = org.telegram.messenger.g0.q0(null, z10);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.Q.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.Q.getCameraSession();
                if (!(uiVar.f40375a2 instanceof org.telegram.ui.bn) && uiVar.O2 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f32836t0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), new hi.kb(this, q02, isSameTakePictureOrientation, 1));
                chatAttachAlertPhotoLayout.Q.startTakePictureAnimation(true);
            }
        }
    }
}
