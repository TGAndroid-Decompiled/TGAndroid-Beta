package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class xl implements nt0 {
    public File f42163a;
    public boolean f42164b;
    public final org.telegram.ui.ActionBar.h6 f42165c;
    public final FrameLayout d;
    public final ChatAttachAlertPhotoLayout f42166e;

    public xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f42166e = chatAttachAlertPhotoLayout;
        this.f42165c = h6Var;
        this.d = m2Var;
    }

    public final void a() {
        gm gmVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f42166e;
        ui uiVar = chatAttachAlertPhotoLayout.f37520b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f32825l0;
        if (!chatAttachAlertPhotoLayout.f32839t0 && (gmVar = chatAttachAlertPhotoLayout.Q) != null && gmVar.getCameraSession() != null) {
            if (shutterButton.getState() == ot0.f38350b) {
                chatAttachAlertPhotoLayout.o0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.Q.getCameraSession(), false);
                shutterButton.a(ot0.f38349a);
            } else if (!chatAttachAlertPhotoLayout.f32847y0) {
                org.telegram.messenger.f3.o(null, 2131749366, new lc(chatAttachAlertPhotoLayout.Q, this.f42165c), null);
            } else {
                org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40368a2;
                if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).z()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File q02 = org.telegram.messenger.g0.q0(null, z10);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.Q.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.Q.getCameraSession();
                if (!(uiVar.f40368a2 instanceof org.telegram.ui.bn) && uiVar.O2 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f32839t0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), new hi.kb(this, q02, isSameTakePictureOrientation, 1));
                chatAttachAlertPhotoLayout.Q.startTakePictureAnimation(true);
            }
        }
    }
}
