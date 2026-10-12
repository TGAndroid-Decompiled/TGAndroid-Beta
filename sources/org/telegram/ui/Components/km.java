package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class km implements mw0 {
    public File f27893a;
    public boolean f27894b;
    public final org.telegram.ui.ActionBar.c6 f27895c;
    public final org.telegram.ui.ActionBar.c3 d;
    public final ChatAttachAlertPhotoLayout f27896e;

    public km(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.c3 c3Var) {
        this.f27896e = chatAttachAlertPhotoLayout;
        this.f27895c = c6Var;
        this.d = c3Var;
    }

    public final void a() {
        wm wmVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27896e;
        aj ajVar = chatAttachAlertPhotoLayout.f30574b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f23823k0;
        if (!chatAttachAlertPhotoLayout.f23838s0 && (wmVar = chatAttachAlertPhotoLayout.P) != null && wmVar.getCameraSession() != null) {
            if (shutterButton.getState() == nw0.f28978b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(nw0.f28977a);
            } else if (!chatAttachAlertPhotoLayout.f23845x0) {
                org.telegram.messenger.am.q(R.string.GlobalAttachPhotoRestricted, new zc(chatAttachAlertPhotoLayout.P, this.f27895c), null);
            } else {
                org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24342f0;
                if ((m2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) m2Var).v()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(ajVar.f24342f0 instanceof org.telegram.ui.eo) && ajVar.T0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f23838s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ci.ed(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
