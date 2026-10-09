package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class im implements gw0 {
    public File f27431a;
    public boolean f27432b;
    public final org.telegram.ui.ActionBar.e6 f27433c;
    public final org.telegram.ui.ActionBar.d3 d;
    public final ChatAttachAlertPhotoLayout f27434e;

    public im(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.d3 d3Var) {
        this.f27434e = chatAttachAlertPhotoLayout;
        this.f27433c = e6Var;
        this.d = d3Var;
    }

    public final void a() {
        um umVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27434e;
        yi yiVar = chatAttachAlertPhotoLayout.f30173b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f24046k0;
        if (!chatAttachAlertPhotoLayout.f24061s0 && (umVar = chatAttachAlertPhotoLayout.P) != null && umVar.getCameraSession() != null) {
            if (shutterButton.getState() == hw0.f27146b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(hw0.f27145a);
            } else if (!chatAttachAlertPhotoLayout.f24068x0) {
                org.telegram.messenger.bi.q(R.string.GlobalAttachPhotoRestricted, new ad(chatAttachAlertPhotoLayout.P, this.f27433c), null);
            } else {
                org.telegram.ui.ActionBar.n2 n2Var = yiVar.f33228f0;
                if ((n2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) n2Var).v()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(yiVar.f33228f0 instanceof org.telegram.ui.zn) && yiVar.T0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f24061s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ci.ed(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
