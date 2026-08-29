package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.projection.MediaProjectionManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
public final class b20 implements View.OnClickListener {
    public final int f36659a;
    public final r50 f36660b;

    public b20(r50 r50Var, int i10) {
        this.f36659a = i10;
        this.f36660b = r50Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        String string;
        int i12 = this.f36659a;
        int i13 = 0;
        r50 r50Var = this.f36660b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.w0 w0Var = r50Var.f41895g1;
                org.telegram.ui.ActionBar.g1 g1Var = r50Var.f41939r1;
                org.telegram.ui.ActionBar.g1 g1Var2 = r50Var.f41934q1;
                org.telegram.ui.ActionBar.g1 g1Var3 = r50Var.l1;
                ChatObject.Call call = r50Var.W0;
                if (call != null && !r50Var.W1.f33796b) {
                    if (call.call.join_muted) {
                        int i14 = org.telegram.ui.ActionBar.g6.f23143hg;
                        g1Var2.c(org.telegram.ui.ActionBar.g6.w0(null, i14, false), org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                        g1Var2.setChecked(false);
                        int i15 = org.telegram.ui.ActionBar.g6.f23411wg;
                        g1Var.c(org.telegram.ui.ActionBar.g6.w0(null, i15, false), org.telegram.ui.ActionBar.g6.w0(null, i15, false));
                        g1Var.setChecked(true);
                    } else {
                        int i16 = org.telegram.ui.ActionBar.g6.f23411wg;
                        g1Var2.c(org.telegram.ui.ActionBar.g6.w0(null, i16, false), org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                        g1Var2.setChecked(true);
                        int i17 = org.telegram.ui.ActionBar.g6.f23143hg;
                        g1Var.c(org.telegram.ui.ActionBar.g6.w0(null, i17, false), org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                        g1Var.setChecked(false);
                    }
                    r50Var.f41898h0 = false;
                    w0Var.r(1);
                    w0Var.r(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            g1Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            if (VoIPService.getSharedInstance().currentBluetoothDeviceName != null) {
                                string = VoIPService.getSharedInstance().currentBluetoothDeviceName;
                            } else {
                                string = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                            }
                            g1Var3.setSubtext(string);
                        } else if (currentAudioRoute == 0) {
                            if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                i10 = R.drawable.msg_voice_headphones;
                            } else {
                                i10 = R.drawable.msg_voice_phone;
                            }
                            g1Var3.setIcon(i10);
                            if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                i11 = R.string.VoipAudioRoutingHeadset;
                            } else {
                                i11 = R.string.VoipAudioRoutingPhone;
                            }
                            g1Var3.setSubtext(LocaleController.getString(i11));
                        } else if (currentAudioRoute == 1) {
                            if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                g1Var3.setIcon(R.drawable.msg_voice_speaker);
                                g1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
                            } else {
                                g1Var3.setIcon(R.drawable.msg_voice_phone);
                                g1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingPhone));
                            }
                        }
                    }
                    r50Var.I1();
                    w0Var.M(null, null);
                    return;
                }
                return;
            case 1:
                if (r50Var.r1()) {
                    if (df.d.a(r50Var.f41885e0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(r50Var.f41885e0);
                        r50Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.c5.B(r50Var.f41885e0, null, true).o();
                    return;
                } else if (AndroidUtilities.checkInlinePermissions(r50Var.f41885e0)) {
                    org.telegram.ui.Components.w20.f34274a0 = false;
                    r50Var.dismiss();
                    return;
                } else {
                    org.telegram.ui.Components.c5.A(r50Var.getContext()).o();
                    return;
                }
            case 2:
                r50Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = r50Var.f41885e0;
                    if (launchActivity != null) {
                        r50Var.f41885e0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChatObject.Call call2 = r50Var.W0;
                if (call2 != null && call2.recording) {
                    r50Var.G1(r50Var.K.getTitleTextView());
                    return;
                }
                return;
            case 4:
                r30 r30Var = r50Var.D;
                if (r30Var.m()) {
                    r30Var.j();
                    return;
                } else {
                    r30Var.d();
                    return;
                }
            case 5:
                r50.D(r50Var);
                return;
            case 6:
                int P0 = r50Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    r50Var.M.v0(0, P0, null);
                }
                org.telegram.ui.Components.vt vtVar = r50Var.D.f26882a;
                vtVar.requestFocus();
                AndroidUtilities.showKeyboard(vtVar);
                return;
            case 7:
                ChatObject.Call call3 = r50Var.W0;
                if (call3 != null && !call3.isScheduled() && !r50Var.r1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(r50Var.getContext(), false);
                        return;
                    }
                    return;
                }
                r50Var.j1(false);
                return;
            case 8:
                ChatObject.Call call4 = r50Var.W0;
                if (call4 != null && call4.recording) {
                    r50Var.G1(r50Var.K.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ChatObject.Call call5 = r50Var.W0;
                if (call5 != null && call5.recording) {
                    r50Var.G1(r50Var.K.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = r50Var.U1;
                org.telegram.ui.Components.xi0 xi0Var = r50Var.C2;
                r50Var.W1.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (r50Var.D2 == 18) {
                        r50Var.D2 = 39;
                        xi0Var.N(39);
                        xi0Var.start();
                    } else {
                        xi0Var.L(0, false, false);
                        r50Var.D2 = 18;
                        xi0Var.N(18);
                        xi0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList.get(i18);
                        ChatObject.VideoParticipant videoParticipant = uVar.f34043w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.p pVar = uVar.f34014a;
                            if (uVar.F0 == null) {
                                uVar.G0 = false;
                                ImageView imageView = uVar.f34040t0;
                                if (imageView == null) {
                                    uVar.f34040t0 = new ImageView(uVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (pVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = pVar.f34057e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        uVar.f34040t0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    uVar.f34040t0.setAlpha(0.0f);
                                } else {
                                    uVar.f34040t0.setAlpha(1.0f);
                                }
                                if (uVar.f34040t0.getParent() == null) {
                                    pVar.addView(uVar.f34040t0);
                                }
                                ((FrameLayout.LayoutParams) uVar.f34040t0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                uVar.F0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(uVar, 1));
                                uVar.F0.addListener(new org.telegram.ui.Components.voip.s(uVar, 2));
                                uVar.F0.setDuration(400L);
                                uVar.F0.setInterpolator(org.telegram.ui.Components.jr.f29800f);
                                uVar.F0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (r50Var.h1() != 1) {
                    i13 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i13 = 2;
                    }
                }
                r50Var.f41954u3 = Integer.valueOf(i13);
                r50Var.N1(true, true);
                r50Var.f41954u3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i8(r50Var, i13, 15));
                return;
        }
    }
}
