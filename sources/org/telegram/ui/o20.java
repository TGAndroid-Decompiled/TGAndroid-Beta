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
public final class o20 implements View.OnClickListener {
    public final int f39563a;
    public final d60 f39564b;

    public o20(d60 d60Var, int i10) {
        this.f39563a = i10;
        this.f39564b = d60Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        String string;
        int i12 = this.f39563a;
        int i13 = 0;
        d60 d60Var = this.f39564b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.w0 w0Var = d60Var.f36042h1;
                org.telegram.ui.ActionBar.g1 g1Var = d60Var.f36087s1;
                org.telegram.ui.ActionBar.g1 g1Var2 = d60Var.f36082r1;
                org.telegram.ui.ActionBar.g1 g1Var3 = d60Var.f36060m1;
                ChatObject.Call call = d60Var.X0;
                if (call != null && !d60Var.X1.f32140b) {
                    if (call.call.join_muted) {
                        int i14 = org.telegram.ui.ActionBar.k6.f21741hg;
                        g1Var2.c(org.telegram.ui.ActionBar.k6.w0(null, i14, false), org.telegram.ui.ActionBar.k6.w0(null, i14, false));
                        g1Var2.setChecked(false);
                        int i15 = org.telegram.ui.ActionBar.k6.f22008wg;
                        g1Var.c(org.telegram.ui.ActionBar.k6.w0(null, i15, false), org.telegram.ui.ActionBar.k6.w0(null, i15, false));
                        g1Var.setChecked(true);
                    } else {
                        int i16 = org.telegram.ui.ActionBar.k6.f22008wg;
                        g1Var2.c(org.telegram.ui.ActionBar.k6.w0(null, i16, false), org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                        g1Var2.setChecked(true);
                        int i17 = org.telegram.ui.ActionBar.k6.f21741hg;
                        g1Var.c(org.telegram.ui.ActionBar.k6.w0(null, i17, false), org.telegram.ui.ActionBar.k6.w0(null, i17, false));
                        g1Var.setChecked(false);
                    }
                    d60Var.f36045i0 = false;
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
                    d60Var.I1();
                    w0Var.M(null, null);
                    return;
                }
                return;
            case 1:
                if (d60Var.r1()) {
                    if (ff.d.a(d60Var.f36033f0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(d60Var.f36033f0);
                        d60Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.z4.B(d60Var.f36033f0, null, true).o();
                    return;
                } else if (AndroidUtilities.checkInlinePermissions(d60Var.f36033f0)) {
                    org.telegram.ui.Components.c30.f25770b0 = false;
                    d60Var.dismiss();
                    return;
                } else {
                    org.telegram.ui.Components.z4.A(d60Var.getContext()).o();
                    return;
                }
            case 2:
                d60Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = d60Var.f36033f0;
                    if (launchActivity != null) {
                        d60Var.f36033f0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChatObject.Call call2 = d60Var.X0;
                if (call2 != null && call2.recording) {
                    d60Var.G1(d60Var.L.getTitleTextView());
                    return;
                }
                return;
            case 4:
                e40 e40Var = d60Var.E;
                if (e40Var.m()) {
                    e40Var.j();
                    return;
                } else {
                    e40Var.d();
                    return;
                }
            case 5:
                d60.D(d60Var);
                return;
            case 6:
                int P0 = d60Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    d60Var.N.v0(0, P0, null);
                }
                org.telegram.ui.Components.au auVar = d60Var.E.f27001a;
                auVar.requestFocus();
                AndroidUtilities.showKeyboard(auVar);
                return;
            case 7:
                ChatObject.Call call3 = d60Var.X0;
                if (call3 != null && !call3.isScheduled() && !d60Var.r1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(d60Var.getContext(), false);
                        return;
                    }
                    return;
                }
                d60Var.j1(false);
                return;
            case 8:
                ChatObject.Call call4 = d60Var.X0;
                if (call4 != null && call4.recording) {
                    d60Var.G1(d60Var.L.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ChatObject.Call call5 = d60Var.X0;
                if (call5 != null && call5.recording) {
                    d60Var.G1(d60Var.L.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = d60Var.V1;
                org.telegram.ui.Components.ij0 ij0Var = d60Var.D2;
                d60Var.X1.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (d60Var.E2 == 18) {
                        d60Var.E2 = 39;
                        ij0Var.N(39);
                        ij0Var.start();
                    } else {
                        ij0Var.L(0, false, false);
                        d60Var.E2 = 18;
                        ij0Var.N(18);
                        ij0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList.get(i18);
                        ChatObject.VideoParticipant videoParticipant = uVar.f32389w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.p pVar = uVar.f32360a;
                            if (uVar.G0 == null) {
                                uVar.H0 = false;
                                ImageView imageView = uVar.f32387u0;
                                if (imageView == null) {
                                    uVar.f32387u0 = new ImageView(uVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (pVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = pVar.f32352e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        uVar.f32387u0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    uVar.f32387u0.setAlpha(0.0f);
                                } else {
                                    uVar.f32387u0.setAlpha(1.0f);
                                }
                                if (uVar.f32387u0.getParent() == null) {
                                    pVar.addView(uVar.f32387u0);
                                }
                                ((FrameLayout.LayoutParams) uVar.f32387u0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                uVar.G0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(uVar, 1));
                                uVar.G0.addListener(new org.telegram.ui.Components.voip.s(uVar, 2));
                                uVar.G0.setDuration(400L);
                                uVar.G0.setInterpolator(org.telegram.ui.Components.pr.f30183f);
                                uVar.G0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (d60Var.h1() != 1) {
                    i13 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i13 = 2;
                    }
                }
                d60Var.f36101v3 = Integer.valueOf(i13);
                d60Var.N1(true, true);
                d60Var.f36101v3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jm(d60Var, i13, 12));
                return;
        }
    }
}
