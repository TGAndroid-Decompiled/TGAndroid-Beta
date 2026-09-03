package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.LaunchActivity;
public final class ol implements dv0 {
    public File f29802a;
    public boolean f29803b;
    public final org.telegram.ui.ActionBar.g6 f29804c;
    public final org.telegram.ui.ActionBar.f3 d;
    public final ChatAttachAlertPhotoLayout f29805e;

    public ol(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f3 f3Var) {
        this.f29805e = chatAttachAlertPhotoLayout;
        this.f29804c = g6Var;
        this.d = f3Var;
    }

    public final boolean a() {
        boolean z4;
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29805e;
        zl zlVar = chatAttachAlertPhotoLayout.O;
        mi miVar = chatAttachAlertPhotoLayout.f26590b;
        int i10 = miVar.N0;
        org.telegram.ui.ActionBar.p2 p2Var = miVar.f29058c0;
        if ((i10 == 2 || (p2Var instanceof org.telegram.ui.xn)) && !chatAttachAlertPhotoLayout.f24770p0 && !miVar.S && chatAttachAlertPhotoLayout.M != null && !miVar.D) {
            if (p2Var == null) {
                p2Var = LaunchActivity.R();
            }
            if (p2Var != null && p2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.f24776t0) {
                    org.telegram.messenger.y3.s(R.string.GlobalAttachVideoRestricted, new qc(chatAttachAlertPhotoLayout.M, this.f29804c), null);
                    return false;
                } else if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.N0 = true;
                    p2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                } else {
                    for (int i11 = 0; i11 < 2; i11++) {
                        chatAttachAlertPhotoLayout.P[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(pr.f30168f).start();
                    }
                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f24769o0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                    pr prVar = pr.f30168f;
                    duration.setInterpolator(prVar).start();
                    chatAttachAlertPhotoLayout.f24768n0.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
                    org.telegram.ui.ActionBar.p2 p2Var2 = miVar.f29058c0;
                    if ((p2Var2 instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var2).w()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.f29802a = AndroidUtilities.generateVideoPath(z4);
                    AndroidUtilities.updateViewVisibilityAnimated(zlVar, true);
                    zlVar.setText(AndroidUtilities.formatLongDuration(0));
                    chatAttachAlertPhotoLayout.f24749d0 = 0;
                    chatAttachAlertPhotoLayout.f24751e0 = new Runnable(this) {
                        public final ol f29513b;

                        {
                            this.f29513b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f29513b.f29805e;
                                    if (chatAttachAlertPhotoLayout2.f24751e0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f24749d0 + 1;
                                        chatAttachAlertPhotoLayout2.f24749d0 = i12;
                                        chatAttachAlertPhotoLayout2.O.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24751e0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f29513b.f29805e.f24751e0, 1000L);
                                    return;
                            }
                        }
                    };
                    AndroidUtilities.lockOrientation(p2Var.getParentActivity());
                    CameraController cameraController = CameraController.getInstance();
                    Object cameraSessionObject = chatAttachAlertPhotoLayout.M.getCameraSessionObject();
                    File file = this.f29802a;
                    if (miVar.N0 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cameraController.recordVideo(cameraSessionObject, file, z10, new t(this, 21), new Runnable(this) {
                        public final ol f29513b;

                        {
                            this.f29513b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f29513b.f29805e;
                                    if (chatAttachAlertPhotoLayout2.f24751e0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f24749d0 + 1;
                                        chatAttachAlertPhotoLayout2.f24749d0 = i12;
                                        chatAttachAlertPhotoLayout2.O.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24751e0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f29513b.f29805e.f24751e0, 1000L);
                                    return;
                            }
                        }
                    }, chatAttachAlertPhotoLayout.M);
                    chatAttachAlertPhotoLayout.f24757h0.a(ev0.f26681b);
                    chatAttachAlertPhotoLayout.M.runHaptic();
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        bm bmVar;
        boolean z4;
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29805e;
        mi miVar = chatAttachAlertPhotoLayout.f26590b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f24757h0;
        if (!chatAttachAlertPhotoLayout.f24770p0 && (bmVar = chatAttachAlertPhotoLayout.M) != null && bmVar.getCameraSession() != null) {
            if (shutterButton.getState() == ev0.f26681b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.M.getCameraSession(), false);
                shutterButton.a(ev0.f26680a);
            } else if (!chatAttachAlertPhotoLayout.f24777u0) {
                org.telegram.messenger.y3.s(R.string.GlobalAttachPhotoRestricted, new qc(chatAttachAlertPhotoLayout.M, this.f29804c), null);
            } else {
                org.telegram.ui.ActionBar.p2 p2Var = miVar.f29058c0;
                if ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).w()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z4, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.M.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.M.getCameraSession();
                if (!(miVar.f29058c0 instanceof org.telegram.ui.xn) && miVar.N0 != 2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                cameraSession.setFlipFront(z10);
                chatAttachAlertPhotoLayout.f24770p0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.M.getCameraSessionObject(), new ml(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.M.startTakePictureAnimation(true);
            }
        }
    }
}
