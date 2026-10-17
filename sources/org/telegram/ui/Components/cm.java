package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class cm implements xv0 {
    public File f25302a;
    public boolean f25303b;
    public final org.telegram.ui.ActionBar.d6 f25304c;
    public final org.telegram.ui.ActionBar.d3 d;
    public final ChatAttachAlertPhotoLayout e;

    public cm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.d3 d3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.f25304c = d6Var;
        this.d = d3Var;
    }

    public final void a() {
        om omVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        ti tiVar = chatAttachAlertPhotoLayout.f28238b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f24098k0;
        if (!chatAttachAlertPhotoLayout.f24113s0 && (omVar = chatAttachAlertPhotoLayout.P) != null && omVar.getCameraSession() != null) {
            if (shutterButton.getState() == yv0.f32761b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(yv0.f32760a);
            } else if (!chatAttachAlertPhotoLayout.f24120x0) {
                org.telegram.messenger.wh.q(R.string.GlobalAttachPhotoRestricted, new xc(chatAttachAlertPhotoLayout.P, this.f25304c), null);
            } else {
                org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30574f0;
                if ((n2Var instanceof org.telegram.ui.sn) && ((org.telegram.ui.sn) n2Var).x()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(tiVar.f30574f0 instanceof org.telegram.ui.sn) && tiVar.T0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f24113s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ei.oc(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
