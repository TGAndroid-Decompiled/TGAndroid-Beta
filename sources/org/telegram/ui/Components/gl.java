package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class gl implements at0 {
    public File f34146a;
    public boolean f34147b;
    public final org.telegram.ui.ActionBar.e6 f34148c;
    public final FrameLayout d;
    public final ChatAttachAlertPhotoLayout f34149e;

    public gl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.j2 j2Var) {
        this.f34149e = chatAttachAlertPhotoLayout;
        this.f34148c = e6Var;
        this.d = j2Var;
    }

    public final void a() {
        pl plVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34149e;
        bi biVar = chatAttachAlertPhotoLayout.f38416b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f31284l0;
        if (!chatAttachAlertPhotoLayout.f31299t0 && (plVar = chatAttachAlertPhotoLayout.Q) != null && plVar.getCameraSession() != null) {
            if (shutterButton.getState() == bt0.f32394b) {
                chatAttachAlertPhotoLayout.o0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.Q.getCameraSession(), false);
                shutterButton.a(bt0.f32393a);
            } else if (!chatAttachAlertPhotoLayout.f31307y0) {
                org.telegram.messenger.k5.p(null, 2131749550, new fc(chatAttachAlertPhotoLayout.Q, this.f34148c), null);
            } else {
                org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                if ((d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).z()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File q02 = org.telegram.messenger.g0.q0(null, z10);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.Q.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.Q.getCameraSession();
                if (!(biVar.X1 instanceof org.telegram.ui.wm) && biVar.L2 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f31299t0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), new gi.nb(this, q02, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.Q.startTakePictureAnimation(true);
            }
        }
    }
}
