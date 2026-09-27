package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.LaunchActivity;
public final class tl implements qv0 {
    public File f28628a;
    public boolean f28629b;
    public final org.telegram.ui.ActionBar.e6 f28630c;
    public final org.telegram.ui.ActionBar.e3 d;
    public final ChatAttachAlertPhotoLayout e;

    public tl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.e3 e3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.f28630c = e6Var;
        this.d = e3Var;
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        dm dmVar = chatAttachAlertPhotoLayout.R;
        wi wiVar = chatAttachAlertPhotoLayout.f27104b;
        int i10 = wiVar.Q0;
        org.telegram.ui.ActionBar.o2 o2Var = wiVar.f29962f0;
        if ((i10 == 2 || (o2Var instanceof org.telegram.ui.xn)) && !chatAttachAlertPhotoLayout.f22163s0 && !wiVar.V && chatAttachAlertPhotoLayout.P != null && !wiVar.G) {
            if (o2Var == null) {
                o2Var = LaunchActivity.R();
            }
            if (o2Var != null && o2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.f22168w0) {
                    org.telegram.messenger.qk.p(R.string.GlobalAttachVideoRestricted, new xc(chatAttachAlertPhotoLayout.P, this.f28630c), null);
                    return false;
                } else if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.Q0 = true;
                    o2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                } else {
                    for (int i11 = 0; i11 < 2; i11++) {
                        chatAttachAlertPhotoLayout.S[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(sr.f28359f).start();
                    }
                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f22161r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                    sr srVar = sr.f28359f;
                    duration.setInterpolator(srVar).start();
                    chatAttachAlertPhotoLayout.f22159q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(srVar).start();
                    org.telegram.ui.ActionBar.o2 o2Var2 = wiVar.f29962f0;
                    if ((o2Var2 instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) o2Var2).v()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f28628a = AndroidUtilities.generateVideoPath(z10);
                    AndroidUtilities.updateViewVisibilityAnimated(dmVar, true);
                    dmVar.setText(AndroidUtilities.formatLongDuration(0));
                    chatAttachAlertPhotoLayout.f22140g0 = 0;
                    chatAttachAlertPhotoLayout.f22142h0 = new Runnable(this) {
                        public final tl f28328b;

                        {
                            this.f28328b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f28328b.e;
                                    if (chatAttachAlertPhotoLayout2.f22142h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f22140g0 + 1;
                                        chatAttachAlertPhotoLayout2.f22140g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f22142h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f28328b.e.f22142h0, 1000L);
                                    return;
                            }
                        }
                    };
                    AndroidUtilities.lockOrientation(o2Var.getParentActivity());
                    CameraController cameraController = CameraController.getInstance();
                    Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                    File file = this.f28628a;
                    if (wiVar.Q0 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cameraController.recordVideo(cameraSessionObject, file, z11, new s(this, 21), new Runnable(this) {
                        public final tl f28328b;

                        {
                            this.f28328b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f28328b.e;
                                    if (chatAttachAlertPhotoLayout2.f22142h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f22140g0 + 1;
                                        chatAttachAlertPhotoLayout2.f22140g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f22142h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f28328b.e.f22142h0, 1000L);
                                    return;
                            }
                        }
                    }, chatAttachAlertPhotoLayout.P);
                    chatAttachAlertPhotoLayout.f22148k0.a(rv0.f28100b);
                    chatAttachAlertPhotoLayout.P.runHaptic();
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        fm fmVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        wi wiVar = chatAttachAlertPhotoLayout.f27104b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f22148k0;
        if (!chatAttachAlertPhotoLayout.f22163s0 && (fmVar = chatAttachAlertPhotoLayout.P) != null && fmVar.getCameraSession() != null) {
            if (shutterButton.getState() == rv0.f28100b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(rv0.f28099a);
            } else if (!chatAttachAlertPhotoLayout.f22170x0) {
                org.telegram.messenger.qk.p(R.string.GlobalAttachPhotoRestricted, new xc(chatAttachAlertPhotoLayout.P, this.f28630c), null);
            } else {
                org.telegram.ui.ActionBar.o2 o2Var = wiVar.f29962f0;
                if ((o2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) o2Var).v()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(wiVar.f29962f0 instanceof org.telegram.ui.xn) && wiVar.Q0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f22163s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ci.dd(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
