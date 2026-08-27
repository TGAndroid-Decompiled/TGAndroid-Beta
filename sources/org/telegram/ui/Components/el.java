package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.LaunchActivity;

public final class el implements nu0 {

    public File f28075a;

    public boolean f28076b;

    public final org.telegram.ui.ActionBar.c6 f28077c;
    public final org.telegram.ui.ActionBar.c3 d;

    public final ChatAttachAlertPhotoLayout f28078e;

    public el(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.c3 c3Var) {
        this.f28078e = chatAttachAlertPhotoLayout;
        this.f28077c = c6Var;
        this.d = c3Var;
    }

    public final boolean a() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28078e;
        ol olVar = chatAttachAlertPhotoLayout.N;
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        int i10 = giVar.M0;
        org.telegram.ui.ActionBar.n2 n2VarR = giVar.f28635b0;
        if ((i10 == 2 || (n2VarR instanceof org.telegram.ui.rn)) && !chatAttachAlertPhotoLayout.f26267o0 && !giVar.R && chatAttachAlertPhotoLayout.L != null && !giVar.C) {
            if (n2VarR == null) {
                n2VarR = LaunchActivity.R();
            }
            if (n2VarR != null && n2VarR.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.f26273s0) {
                    org.telegram.messenger.y1.r(R.string.GlobalAttachVideoRestricted, new mc(chatAttachAlertPhotoLayout.L, this.f28077c), null);
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.M0 = true;
                    n2VarR.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                }
                for (int i11 = 0; i11 < 2; i11++) {
                    chatAttachAlertPhotoLayout.O[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(er.f28122f).start();
                }
                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f26266n0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                er erVar = er.f28122f;
                duration.setInterpolator(erVar).start();
                chatAttachAlertPhotoLayout.m0.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar).start();
                org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
                this.f28075a = AndroidUtilities.generateVideoPath((n2Var instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var).x());
                AndroidUtilities.updateViewVisibilityAnimated(olVar, true);
                olVar.setText(AndroidUtilities.formatLongDuration(0));
                chatAttachAlertPhotoLayout.f26246c0 = 0;
                final int i12 = 0;
                chatAttachAlertPhotoLayout.f26248d0 = new Runnable(this) {

                    public final el f27790b;

                    {
                        this.f27790b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i12) {
                            case 0:
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f27790b.f28078e;
                                if (chatAttachAlertPhotoLayout2.f26248d0 != null) {
                                    int i13 = chatAttachAlertPhotoLayout2.f26246c0 + 1;
                                    chatAttachAlertPhotoLayout2.f26246c0 = i13;
                                    chatAttachAlertPhotoLayout2.N.setText(AndroidUtilities.formatLongDuration(i13));
                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f26248d0, 1000L);
                                    break;
                                }
                                break;
                            default:
                                AndroidUtilities.runOnUIThread(this.f27790b.f28078e.f26248d0, 1000L);
                                break;
                        }
                    }
                };
                AndroidUtilities.lockOrientation(n2VarR.getParentActivity());
                final int i13 = 1;
                CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.L.getCameraSessionObject(), this.f28075a, giVar.M0 != 0, new s(this, 21), new Runnable(this) {

                    public final el f27790b;

                    {
                        this.f27790b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i13) {
                            case 0:
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f27790b.f28078e;
                                if (chatAttachAlertPhotoLayout2.f26248d0 != null) {
                                    int i14 = chatAttachAlertPhotoLayout2.f26246c0 + 1;
                                    chatAttachAlertPhotoLayout2.f26246c0 = i14;
                                    chatAttachAlertPhotoLayout2.N.setText(AndroidUtilities.formatLongDuration(i14));
                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f26248d0, 1000L);
                                    break;
                                }
                                break;
                            default:
                                AndroidUtilities.runOnUIThread(this.f27790b.f28078e.f26248d0, 1000L);
                                break;
                        }
                    }
                }, chatAttachAlertPhotoLayout.L);
                chatAttachAlertPhotoLayout.f26254g0.a(ou0.f31411b);
                chatAttachAlertPhotoLayout.L.runHaptic();
                return true;
            }
        }
        return false;
    }

    public final void b() {
        ql qlVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28078e;
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f26254g0;
        if (chatAttachAlertPhotoLayout.f26267o0 || (qlVar = chatAttachAlertPhotoLayout.L) == null || qlVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == ou0.f31411b) {
            chatAttachAlertPhotoLayout.l0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.L.getCameraSession(), false);
            shutterButton.a(ou0.f31410a);
        } else {
            if (!chatAttachAlertPhotoLayout.f26274t0) {
                org.telegram.messenger.y1.r(R.string.GlobalAttachPhotoRestricted, new mc(chatAttachAlertPhotoLayout.L, this.f28077c), null);
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
            File fileGeneratePicturePath = AndroidUtilities.generatePicturePath((n2Var instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var).x(), null);
            boolean zIsSameTakePictureOrientation = chatAttachAlertPhotoLayout.L.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.L.getCameraSession().setFlipFront((giVar.f28635b0 instanceof org.telegram.ui.rn) || giVar.M0 == 2);
            chatAttachAlertPhotoLayout.f26267o0 = CameraController.getInstance().takePicture(fileGeneratePicturePath, false, chatAttachAlertPhotoLayout.L.getCameraSessionObject(), new lh.kc(this, fileGeneratePicturePath, zIsSameTakePictureOrientation));
            chatAttachAlertPhotoLayout.L.startTakePictureAnimation(true);
        }
    }
}
