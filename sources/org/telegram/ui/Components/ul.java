package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.LaunchActivity;
public final class ul implements uv0 {
    public File f31390a;
    public boolean f31391b;
    public final org.telegram.ui.ActionBar.d6 f31392c;
    public final org.telegram.ui.ActionBar.d3 d;
    public final ChatAttachAlertPhotoLayout f31393e;

    public ul(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.d3 d3Var) {
        this.f31393e = chatAttachAlertPhotoLayout;
        this.f31392c = d6Var;
        this.d = d3Var;
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31393e;
        em emVar = chatAttachAlertPhotoLayout.R;
        xi xiVar = chatAttachAlertPhotoLayout.f29642b;
        int i10 = xiVar.Q0;
        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32812f0;
        if ((i10 == 2 || (n2Var instanceof org.telegram.ui.yn)) && !chatAttachAlertPhotoLayout.f24057s0 && !xiVar.V && chatAttachAlertPhotoLayout.P != null && !xiVar.G) {
            if (n2Var == null) {
                n2Var = LaunchActivity.R();
            }
            if (n2Var != null && n2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.f24062w0) {
                    org.telegram.messenger.ok.p(R.string.GlobalAttachVideoRestricted, new yc(chatAttachAlertPhotoLayout.P, this.f31392c), null);
                    return false;
                } else if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.Q0 = true;
                    n2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                } else {
                    for (int i11 = 0; i11 < 2; i11++) {
                        chatAttachAlertPhotoLayout.S[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(tr.f31140f).start();
                    }
                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f24055r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                    tr trVar = tr.f31140f;
                    duration.setInterpolator(trVar).start();
                    chatAttachAlertPhotoLayout.f24053q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(trVar).start();
                    org.telegram.ui.ActionBar.n2 n2Var2 = xiVar.f32812f0;
                    if ((n2Var2 instanceof org.telegram.ui.yn) && ((org.telegram.ui.yn) n2Var2).v()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f31390a = AndroidUtilities.generateVideoPath(z10);
                    AndroidUtilities.updateViewVisibilityAnimated(emVar, true);
                    emVar.setText(AndroidUtilities.formatLongDuration(0));
                    chatAttachAlertPhotoLayout.f24034g0 = 0;
                    chatAttachAlertPhotoLayout.f24036h0 = new Runnable(this) {
                        public final ul f31087b;

                        {
                            this.f31087b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f31087b.f31393e;
                                    if (chatAttachAlertPhotoLayout2.f24036h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f24034g0 + 1;
                                        chatAttachAlertPhotoLayout2.f24034g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24036h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f31087b.f31393e.f24036h0, 1000L);
                                    return;
                            }
                        }
                    };
                    AndroidUtilities.lockOrientation(n2Var.getParentActivity());
                    CameraController cameraController = CameraController.getInstance();
                    Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                    File file = this.f31390a;
                    if (xiVar.Q0 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cameraController.recordVideo(cameraSessionObject, file, z11, new s(this, 21), new Runnable(this) {
                        public final ul f31087b;

                        {
                            this.f31087b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f31087b.f31393e;
                                    if (chatAttachAlertPhotoLayout2.f24036h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f24034g0 + 1;
                                        chatAttachAlertPhotoLayout2.f24034g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24036h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f31087b.f31393e.f24036h0, 1000L);
                                    return;
                            }
                        }
                    }, chatAttachAlertPhotoLayout.P);
                    chatAttachAlertPhotoLayout.f24042k0.a(vv0.f32355b);
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31393e;
        xi xiVar = chatAttachAlertPhotoLayout.f29642b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f24042k0;
        if (!chatAttachAlertPhotoLayout.f24057s0 && (gmVar = chatAttachAlertPhotoLayout.P) != null && gmVar.getCameraSession() != null) {
            if (shutterButton.getState() == vv0.f32355b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(vv0.f32354a);
            } else if (!chatAttachAlertPhotoLayout.f24064x0) {
                org.telegram.messenger.ok.p(R.string.GlobalAttachPhotoRestricted, new yc(chatAttachAlertPhotoLayout.P, this.f31392c), null);
            } else {
                org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32812f0;
                if ((n2Var instanceof org.telegram.ui.yn) && ((org.telegram.ui.yn) n2Var).v()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(xiVar.f32812f0 instanceof org.telegram.ui.yn) && xiVar.Q0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f24057s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ci.dd(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
