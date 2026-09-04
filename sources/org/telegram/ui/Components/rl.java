package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.LaunchActivity;
public final class rl implements cv0 {
    public File f30041a;
    public boolean f30042b;
    public final org.telegram.ui.ActionBar.f6 f30043c;
    public final org.telegram.ui.ActionBar.d3 d;
    public final ChatAttachAlertPhotoLayout f30044e;

    public rl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.d3 d3Var) {
        this.f30044e = chatAttachAlertPhotoLayout;
        this.f30043c = f6Var;
        this.d = d3Var;
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30044e;
        bm bmVar = chatAttachAlertPhotoLayout.R;
        vi viVar = chatAttachAlertPhotoLayout.f28753b;
        int i10 = viVar.Q0;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f31279f0;
        if ((i10 == 2 || (n2Var instanceof org.telegram.ui.co)) && !chatAttachAlertPhotoLayout.f23871s0 && !viVar.V && chatAttachAlertPhotoLayout.P != null && !viVar.G) {
            if (n2Var == null) {
                n2Var = LaunchActivity.R();
            }
            if (n2Var != null && n2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.f23876w0) {
                    org.telegram.messenger.w1.p(R.string.GlobalAttachVideoRestricted, new yc(chatAttachAlertPhotoLayout.P, this.f30043c), null);
                    return false;
                } else if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.Q0 = true;
                    n2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                } else {
                    for (int i11 = 0; i11 < 2; i11++) {
                        chatAttachAlertPhotoLayout.S[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(pr.f29466f).start();
                    }
                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f23869r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                    pr prVar = pr.f29466f;
                    duration.setInterpolator(prVar).start();
                    chatAttachAlertPhotoLayout.f23867q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
                    org.telegram.ui.ActionBar.n2 n2Var2 = viVar.f31279f0;
                    if ((n2Var2 instanceof org.telegram.ui.co) && ((org.telegram.ui.co) n2Var2).v()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f30041a = AndroidUtilities.generateVideoPath(z10);
                    AndroidUtilities.updateViewVisibilityAnimated(bmVar, true);
                    bmVar.setText(AndroidUtilities.formatLongDuration(0));
                    chatAttachAlertPhotoLayout.f23848g0 = 0;
                    chatAttachAlertPhotoLayout.f23850h0 = new Runnable(this) {
                        public final rl f29760b;

                        {
                            this.f29760b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f29760b.f30044e;
                                    if (chatAttachAlertPhotoLayout2.f23850h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f23848g0 + 1;
                                        chatAttachAlertPhotoLayout2.f23848g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f23850h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f29760b.f30044e.f23850h0, 1000L);
                                    return;
                            }
                        }
                    };
                    AndroidUtilities.lockOrientation(n2Var.getParentActivity());
                    CameraController cameraController = CameraController.getInstance();
                    Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                    File file = this.f30041a;
                    if (viVar.Q0 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cameraController.recordVideo(cameraSessionObject, file, z11, new t(this, 21), new Runnable(this) {
                        public final rl f29760b;

                        {
                            this.f29760b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f29760b.f30044e;
                                    if (chatAttachAlertPhotoLayout2.f23850h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f23848g0 + 1;
                                        chatAttachAlertPhotoLayout2.f23848g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f23850h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f29760b.f30044e.f23850h0, 1000L);
                                    return;
                            }
                        }
                    }, chatAttachAlertPhotoLayout.P);
                    chatAttachAlertPhotoLayout.f23856k0.a(dv0.f25469b);
                    chatAttachAlertPhotoLayout.P.runHaptic();
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        dm dmVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30044e;
        vi viVar = chatAttachAlertPhotoLayout.f28753b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f23856k0;
        if (!chatAttachAlertPhotoLayout.f23871s0 && (dmVar = chatAttachAlertPhotoLayout.P) != null && dmVar.getCameraSession() != null) {
            if (shutterButton.getState() == dv0.f25469b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(dv0.f25468a);
            } else if (!chatAttachAlertPhotoLayout.f23878x0) {
                org.telegram.messenger.w1.p(R.string.GlobalAttachPhotoRestricted, new yc(chatAttachAlertPhotoLayout.P, this.f30043c), null);
            } else {
                org.telegram.ui.ActionBar.n2 n2Var = viVar.f31279f0;
                if ((n2Var instanceof org.telegram.ui.co) && ((org.telegram.ui.co) n2Var).v()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(viVar.f31279f0 instanceof org.telegram.ui.co) && viVar.Q0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f23871s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new di.hd(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
