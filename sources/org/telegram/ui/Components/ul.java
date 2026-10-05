package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.LaunchActivity;
public final class ul implements vv0 {
    public File f31451a;
    public boolean f31452b;
    public final org.telegram.ui.ActionBar.d6 f31453c;
    public final org.telegram.ui.ActionBar.d3 d;
    public final ChatAttachAlertPhotoLayout f31454e;

    public ul(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.d3 d3Var) {
        this.f31454e = chatAttachAlertPhotoLayout;
        this.f31453c = d6Var;
        this.d = d3Var;
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31454e;
        em emVar = chatAttachAlertPhotoLayout.R;
        xi xiVar = chatAttachAlertPhotoLayout.f29741b;
        int i10 = xiVar.Q0;
        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32910f0;
        if ((i10 == 2 || (n2Var instanceof org.telegram.ui.yn)) && !chatAttachAlertPhotoLayout.f24065s0 && !xiVar.V && chatAttachAlertPhotoLayout.P != null && !xiVar.G) {
            if (n2Var == null) {
                n2Var = LaunchActivity.R();
            }
            if (n2Var != null && n2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.f24070w0) {
                    org.telegram.messenger.bi.o(R.string.GlobalAttachVideoRestricted, new yc(chatAttachAlertPhotoLayout.P, this.f31453c), null);
                    return false;
                } else if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.Q0 = true;
                    n2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                } else {
                    for (int i11 = 0; i11 < 2; i11++) {
                        chatAttachAlertPhotoLayout.S[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(tr.f31215f).start();
                    }
                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f24063r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                    tr trVar = tr.f31215f;
                    duration.setInterpolator(trVar).start();
                    chatAttachAlertPhotoLayout.f24061q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(trVar).start();
                    org.telegram.ui.ActionBar.n2 n2Var2 = xiVar.f32910f0;
                    if ((n2Var2 instanceof org.telegram.ui.yn) && ((org.telegram.ui.yn) n2Var2).v()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f31451a = AndroidUtilities.generateVideoPath(z10);
                    AndroidUtilities.updateViewVisibilityAnimated(emVar, true);
                    emVar.setText(AndroidUtilities.formatLongDuration(0));
                    chatAttachAlertPhotoLayout.f24042g0 = 0;
                    chatAttachAlertPhotoLayout.f24044h0 = new Runnable(this) {
                        public final ul f31181b;

                        {
                            this.f31181b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f31181b.f31454e;
                                    if (chatAttachAlertPhotoLayout2.f24044h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f24042g0 + 1;
                                        chatAttachAlertPhotoLayout2.f24042g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24044h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f31181b.f31454e.f24044h0, 1000L);
                                    return;
                            }
                        }
                    };
                    AndroidUtilities.lockOrientation(n2Var.getParentActivity());
                    CameraController cameraController = CameraController.getInstance();
                    Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                    File file = this.f31451a;
                    if (xiVar.Q0 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cameraController.recordVideo(cameraSessionObject, file, z11, new s(this, 21), new Runnable(this) {
                        public final ul f31181b;

                        {
                            this.f31181b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f31181b.f31454e;
                                    if (chatAttachAlertPhotoLayout2.f24044h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f24042g0 + 1;
                                        chatAttachAlertPhotoLayout2.f24042g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24044h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f31181b.f31454e.f24044h0, 1000L);
                                    return;
                            }
                        }
                    }, chatAttachAlertPhotoLayout.P);
                    chatAttachAlertPhotoLayout.f24050k0.a(wv0.f32721b);
                    chatAttachAlertPhotoLayout.P.runHaptic();
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        gm gmVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31454e;
        xi xiVar = chatAttachAlertPhotoLayout.f29741b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f24050k0;
        if (!chatAttachAlertPhotoLayout.f24065s0 && (gmVar = chatAttachAlertPhotoLayout.P) != null && gmVar.getCameraSession() != null) {
            if (shutterButton.getState() == wv0.f32721b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(wv0.f32720a);
            } else if (!chatAttachAlertPhotoLayout.f24072x0) {
                org.telegram.messenger.bi.o(R.string.GlobalAttachPhotoRestricted, new yc(chatAttachAlertPhotoLayout.P, this.f31453c), null);
            } else {
                org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32910f0;
                if ((n2Var instanceof org.telegram.ui.yn) && ((org.telegram.ui.yn) n2Var).v()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(xiVar.f32910f0 instanceof org.telegram.ui.yn) && xiVar.Q0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f24065s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ci.dd(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
