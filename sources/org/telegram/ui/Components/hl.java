package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class hl implements bt0 {
    public File f34350a;
    public boolean f34351b;
    public final org.telegram.ui.ActionBar.f6 f34352c;
    public final FrameLayout d;
    public final ChatAttachAlertPhotoLayout f34353e;

    public hl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.l2 l2Var) {
        this.f34353e = chatAttachAlertPhotoLayout;
        this.f34352c = f6Var;
        this.d = l2Var;
    }

    public final void a() {
        ql qlVar;
        boolean z9;
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34353e;
        di diVar = chatAttachAlertPhotoLayout.f38969b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f31209k0;
        if (!chatAttachAlertPhotoLayout.f31223s0 && (qlVar = chatAttachAlertPhotoLayout.P) != null && qlVar.getCameraSession() != null) {
            if (shutterButton.getState() == ct0.f32657b) {
                chatAttachAlertPhotoLayout.o0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(ct0.f32656a);
            } else if (!chatAttachAlertPhotoLayout.f31230x0) {
                org.telegram.messenger.k5.p(null, 2131749541, new hc(chatAttachAlertPhotoLayout.P, this.f34352c), null);
            } else {
                org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                if ((f2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var).z()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                File q02 = org.telegram.messenger.g0.q0(null, z9);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(diVar.W1 instanceof org.telegram.ui.an) && diVar.K2 != 2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                cameraSession.setFlipFront(z10);
                chatAttachAlertPhotoLayout.f31223s0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new fi.nb(this, q02, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
