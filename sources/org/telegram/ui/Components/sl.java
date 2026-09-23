package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.LaunchActivity;
public final class sl implements dv0 {
    public File f27948a;
    public boolean f27949b;
    public final org.telegram.ui.ActionBar.d6 f27950c;
    public final org.telegram.ui.ActionBar.d3 d;
    public final ChatAttachAlertPhotoLayout e;

    public sl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.d3 d3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.f27950c = d6Var;
        this.d = d3Var;
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        cm cmVar = chatAttachAlertPhotoLayout.R;
        wi wiVar = chatAttachAlertPhotoLayout.f26744b;
        int i10 = wiVar.Q0;
        org.telegram.ui.ActionBar.n2 n2Var = wiVar.f29665f0;
        if ((i10 == 2 || (n2Var instanceof org.telegram.ui.xn)) && !chatAttachAlertPhotoLayout.f21909s0 && !wiVar.V && chatAttachAlertPhotoLayout.P != null && !wiVar.G) {
            if (n2Var == null) {
                n2Var = LaunchActivity.R();
            }
            if (n2Var != null && n2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.f21914w0) {
                    org.telegram.messenger.z0.p(R.string.GlobalAttachVideoRestricted, new xc(chatAttachAlertPhotoLayout.P, this.f27950c), null);
                    return false;
                } else if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.Q0 = true;
                    n2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                } else {
                    for (int i11 = 0; i11 < 2; i11++) {
                        chatAttachAlertPhotoLayout.S[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(rr.f27701f).start();
                    }
                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f21907r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                    rr rrVar = rr.f27701f;
                    duration.setInterpolator(rrVar).start();
                    chatAttachAlertPhotoLayout.f21905q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(rrVar).start();
                    org.telegram.ui.ActionBar.n2 n2Var2 = wiVar.f29665f0;
                    if ((n2Var2 instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) n2Var2).v()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f27948a = AndroidUtilities.generateVideoPath(z10);
                    AndroidUtilities.updateViewVisibilityAnimated(cmVar, true);
                    cmVar.setText(AndroidUtilities.formatLongDuration(0));
                    chatAttachAlertPhotoLayout.f21886g0 = 0;
                    chatAttachAlertPhotoLayout.f21888h0 = new Runnable(this) {
                        public final sl f27663b;

                        {
                            this.f27663b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f27663b.e;
                                    if (chatAttachAlertPhotoLayout2.f21888h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f21886g0 + 1;
                                        chatAttachAlertPhotoLayout2.f21886g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f21888h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f27663b.e.f21888h0, 1000L);
                                    return;
                            }
                        }
                    };
                    AndroidUtilities.lockOrientation(n2Var.getParentActivity());
                    CameraController cameraController = CameraController.getInstance();
                    Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                    File file = this.f27948a;
                    if (wiVar.Q0 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cameraController.recordVideo(cameraSessionObject, file, z11, new s(this, 21), new Runnable(this) {
                        public final sl f27663b;

                        {
                            this.f27663b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f27663b.e;
                                    if (chatAttachAlertPhotoLayout2.f21888h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f21886g0 + 1;
                                        chatAttachAlertPhotoLayout2.f21886g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f21888h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f27663b.e.f21888h0, 1000L);
                                    return;
                            }
                        }
                    }, chatAttachAlertPhotoLayout.P);
                    chatAttachAlertPhotoLayout.f21894k0.a(ev0.f23751b);
                    chatAttachAlertPhotoLayout.P.runHaptic();
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        em emVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        wi wiVar = chatAttachAlertPhotoLayout.f26744b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f21894k0;
        if (!chatAttachAlertPhotoLayout.f21909s0 && (emVar = chatAttachAlertPhotoLayout.P) != null && emVar.getCameraSession() != null) {
            if (shutterButton.getState() == ev0.f23751b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(ev0.f23750a);
            } else if (!chatAttachAlertPhotoLayout.f21916x0) {
                org.telegram.messenger.z0.p(R.string.GlobalAttachPhotoRestricted, new xc(chatAttachAlertPhotoLayout.P, this.f27950c), null);
            } else {
                org.telegram.ui.ActionBar.n2 n2Var = wiVar.f29665f0;
                if ((n2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) n2Var).v()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(wiVar.f29665f0 instanceof org.telegram.ui.xn) && wiVar.Q0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f21909s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ci.ed(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
