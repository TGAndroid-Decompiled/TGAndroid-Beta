package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.LaunchActivity;
public final class ul implements rv0 {
    public File f28887a;
    public boolean f28888b;
    public final org.telegram.ui.ActionBar.d6 f28889c;
    public final org.telegram.ui.ActionBar.c3 d;
    public final ChatAttachAlertPhotoLayout e;

    public ul(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.c3 c3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.f28889c = d6Var;
        this.d = c3Var;
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        em emVar = chatAttachAlertPhotoLayout.R;
        xi xiVar = chatAttachAlertPhotoLayout.f27362b;
        int i10 = xiVar.Q0;
        org.telegram.ui.ActionBar.m2 m2Var = xiVar.f30270f0;
        if ((i10 == 2 || (m2Var instanceof org.telegram.ui.wn)) && !chatAttachAlertPhotoLayout.f22182s0 && !xiVar.V && chatAttachAlertPhotoLayout.P != null && !xiVar.G) {
            if (m2Var == null) {
                m2Var = LaunchActivity.R();
            }
            if (m2Var != null && m2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.f22187w0) {
                    org.telegram.messenger.ok.p(R.string.GlobalAttachVideoRestricted, new yc(chatAttachAlertPhotoLayout.P, this.f28889c), null);
                    return false;
                } else if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.Q0 = true;
                    m2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                } else {
                    for (int i11 = 0; i11 < 2; i11++) {
                        chatAttachAlertPhotoLayout.S[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(tr.f28636f).start();
                    }
                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f22180r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                    tr trVar = tr.f28636f;
                    duration.setInterpolator(trVar).start();
                    chatAttachAlertPhotoLayout.f22178q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(trVar).start();
                    org.telegram.ui.ActionBar.m2 m2Var2 = xiVar.f30270f0;
                    if ((m2Var2 instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) m2Var2).v()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f28887a = AndroidUtilities.generateVideoPath(z10);
                    AndroidUtilities.updateViewVisibilityAnimated(emVar, true);
                    emVar.setText(AndroidUtilities.formatLongDuration(0));
                    chatAttachAlertPhotoLayout.f22159g0 = 0;
                    chatAttachAlertPhotoLayout.f22161h0 = new Runnable(this) {
                        public final ul f28598b;

                        {
                            this.f28598b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f28598b.e;
                                    if (chatAttachAlertPhotoLayout2.f22161h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f22159g0 + 1;
                                        chatAttachAlertPhotoLayout2.f22159g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f22161h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f28598b.e.f22161h0, 1000L);
                                    return;
                            }
                        }
                    };
                    AndroidUtilities.lockOrientation(m2Var.getParentActivity());
                    CameraController cameraController = CameraController.getInstance();
                    Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                    File file = this.f28887a;
                    if (xiVar.Q0 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cameraController.recordVideo(cameraSessionObject, file, z11, new s(this, 21), new Runnable(this) {
                        public final ul f28598b;

                        {
                            this.f28598b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f28598b.e;
                                    if (chatAttachAlertPhotoLayout2.f22161h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f22159g0 + 1;
                                        chatAttachAlertPhotoLayout2.f22159g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f22161h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f28598b.e.f22161h0, 1000L);
                                    return;
                            }
                        }
                    }, chatAttachAlertPhotoLayout.P);
                    chatAttachAlertPhotoLayout.f22167k0.a(sv0.f28357b);
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        xi xiVar = chatAttachAlertPhotoLayout.f27362b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f22167k0;
        if (!chatAttachAlertPhotoLayout.f22182s0 && (gmVar = chatAttachAlertPhotoLayout.P) != null && gmVar.getCameraSession() != null) {
            if (shutterButton.getState() == sv0.f28357b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(sv0.f28356a);
            } else if (!chatAttachAlertPhotoLayout.f22189x0) {
                org.telegram.messenger.ok.p(R.string.GlobalAttachPhotoRestricted, new yc(chatAttachAlertPhotoLayout.P, this.f28889c), null);
            } else {
                org.telegram.ui.ActionBar.m2 m2Var = xiVar.f30270f0;
                if ((m2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) m2Var).v()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(xiVar.f30270f0 instanceof org.telegram.ui.wn) && xiVar.Q0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f22182s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ci.ed(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
