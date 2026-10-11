package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class im implements iw0 {
    public File f27391a;
    public boolean f27392b;
    public final org.telegram.ui.ActionBar.d6 f27393c;
    public final org.telegram.ui.ActionBar.c3 d;
    public final ChatAttachAlertPhotoLayout f27394e;

    public im(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.c3 c3Var) {
        this.f27394e = chatAttachAlertPhotoLayout;
        this.f27393c = d6Var;
        this.d = c3Var;
    }

    public final void a() {
        um umVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27394e;
        yi yiVar = chatAttachAlertPhotoLayout.f30161b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f24038k0;
        if (!chatAttachAlertPhotoLayout.f24053s0 && (umVar = chatAttachAlertPhotoLayout.P) != null && umVar.getCameraSession() != null) {
            if (shutterButton.getState() == jw0.f27769b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(jw0.f27768a);
            } else if (!chatAttachAlertPhotoLayout.f24060x0) {
                org.telegram.messenger.ai.q(R.string.GlobalAttachPhotoRestricted, new ad(chatAttachAlertPhotoLayout.P, this.f27393c), null);
            } else {
                org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33216f0;
                if ((m2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) m2Var).v()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(yiVar.f33216f0 instanceof org.telegram.ui.zn) && yiVar.T0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f24053s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ci.ed(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
