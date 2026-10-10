package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class im implements hw0 {
    public File f27408a;
    public boolean f27409b;
    public final org.telegram.ui.ActionBar.e6 f27410c;
    public final org.telegram.ui.ActionBar.d3 d;
    public final ChatAttachAlertPhotoLayout f27411e;

    public im(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.d3 d3Var) {
        this.f27411e = chatAttachAlertPhotoLayout;
        this.f27410c = e6Var;
        this.d = d3Var;
    }

    public final void a() {
        um umVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27411e;
        yi yiVar = chatAttachAlertPhotoLayout.f30211b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f24050k0;
        if (!chatAttachAlertPhotoLayout.f24065s0 && (umVar = chatAttachAlertPhotoLayout.P) != null && umVar.getCameraSession() != null) {
            if (shutterButton.getState() == iw0.f27463b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(iw0.f27462a);
            } else if (!chatAttachAlertPhotoLayout.f24072x0) {
                org.telegram.messenger.bi.q(R.string.GlobalAttachPhotoRestricted, new ad(chatAttachAlertPhotoLayout.P, this.f27410c), null);
            } else {
                org.telegram.ui.ActionBar.n2 n2Var = yiVar.f33235f0;
                if ((n2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) n2Var).v()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(yiVar.f33235f0 instanceof org.telegram.ui.zn) && yiVar.T0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f24065s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ci.ed(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
