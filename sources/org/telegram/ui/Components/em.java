package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class em implements cw0 {
    public File f24426a;
    public boolean f24427b;
    public final org.telegram.ui.ActionBar.c6 f24428c;
    public final org.telegram.ui.ActionBar.c3 d;
    public final ChatAttachAlertPhotoLayout e;

    public em(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.c3 c3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.f24428c = c6Var;
        this.d = c3Var;
    }

    public final void a() {
        qm qmVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        vi viVar = chatAttachAlertPhotoLayout.f27360b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f22743k0;
        if (!chatAttachAlertPhotoLayout.f22758s0 && (qmVar = chatAttachAlertPhotoLayout.P) != null && qmVar.getCameraSession() != null) {
            if (shutterButton.getState() == dw0.f24191b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(dw0.f24190a);
            } else if (!chatAttachAlertPhotoLayout.f22765x0) {
                org.telegram.messenger.sk.q(R.string.GlobalAttachPhotoRestricted, new zc(chatAttachAlertPhotoLayout.P, this.f24428c), null);
            } else {
                org.telegram.ui.ActionBar.m2 m2Var = viVar.f29672f0;
                if ((m2Var instanceof org.telegram.ui.fo) && ((org.telegram.ui.fo) m2Var).x()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(viVar.f29672f0 instanceof org.telegram.ui.fo) && viVar.T0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f22758s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new di.cd(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
