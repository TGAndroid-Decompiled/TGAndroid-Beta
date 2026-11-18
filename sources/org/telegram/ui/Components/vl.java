package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class vl implements kt0 {
    public File f40699a;
    public boolean f40700b;
    public final org.telegram.ui.ActionBar.i6 f40701c;
    public final FrameLayout d;
    public final ChatAttachAlertPhotoLayout f40702e;

    public vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f40702e = chatAttachAlertPhotoLayout;
        this.f40701c = i6Var;
        this.d = n2Var;
    }

    public final void a() {
        em emVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40702e;
        si siVar = chatAttachAlertPhotoLayout.f36766b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f32789l0;
        if (!chatAttachAlertPhotoLayout.f32803t0 && (emVar = chatAttachAlertPhotoLayout.Q) != null && emVar.getCameraSession() != null) {
            if (shutterButton.getState() == lt0.f37223b) {
                chatAttachAlertPhotoLayout.o0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.Q.getCameraSession(), false);
                shutterButton.a(lt0.f37222a);
            } else if (!chatAttachAlertPhotoLayout.f32811y0) {
                org.telegram.messenger.f3.o(null, 2131749367, new lc(chatAttachAlertPhotoLayout.Q, this.f40701c), null);
            } else {
                org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
                if ((h2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) h2Var).z()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File q02 = org.telegram.messenger.g0.q0(null, z10);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.Q.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.Q.getCameraSession();
                if (!(siVar.f39659a2 instanceof org.telegram.ui.bn) && siVar.O2 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f32803t0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), new hi.lb(this, q02, isSameTakePictureOrientation, 1));
                chatAttachAlertPhotoLayout.Q.startTakePictureAnimation(true);
            }
        }
    }
}
