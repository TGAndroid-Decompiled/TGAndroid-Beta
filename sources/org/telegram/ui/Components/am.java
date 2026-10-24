package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class am implements bw0 {
    public File f24749a;
    public boolean f24750b;
    public final org.telegram.ui.ActionBar.g6 f24751c;
    public final org.telegram.ui.ActionBar.e3 d;
    public final ChatAttachAlertPhotoLayout e;

    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.e3 e3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.f24751c = g6Var;
        this.d = e3Var;
    }

    public final void a() {
        mm mmVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        ri riVar = chatAttachAlertPhotoLayout.f27704b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f24248k0;
        if (!chatAttachAlertPhotoLayout.f24263s0 && (mmVar = chatAttachAlertPhotoLayout.P) != null && mmVar.getCameraSession() != null) {
            if (shutterButton.getState() == cw0.f25480b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(cw0.f25479a);
            } else if (!chatAttachAlertPhotoLayout.f24270x0) {
                org.telegram.messenger.tl.q(R.string.GlobalAttachPhotoRestricted, new vc(chatAttachAlertPhotoLayout.P, this.f24751c), null);
            } else {
                org.telegram.ui.ActionBar.o2 o2Var = riVar.f30146f0;
                if ((o2Var instanceof org.telegram.ui.sn) && ((org.telegram.ui.sn) o2Var).x()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(riVar.f30146f0 instanceof org.telegram.ui.sn) && riVar.T0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f24263s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ei.oc(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
