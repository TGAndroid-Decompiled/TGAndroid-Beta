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
public final class n20 implements View.OnClickListener {
    public final int f36433a;
    public final c60 f36434b;

    public n20(c60 c60Var, int i10) {
        this.f36433a = i10;
        this.f36434b = c60Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        String string;
        int i12 = this.f36433a;
        int i13 = 0;
        c60 c60Var = this.f36434b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.w0 w0Var = c60Var.f33128h1;
                org.telegram.ui.ActionBar.g1 g1Var = c60Var.f33173s1;
                org.telegram.ui.ActionBar.g1 g1Var2 = c60Var.f33168r1;
                org.telegram.ui.ActionBar.g1 g1Var3 = c60Var.f33146m1;
                ChatObject.Call call = c60Var.X0;
                if (call != null && !c60Var.X1.f29713b) {
                    if (call.call.join_muted) {
                        int i14 = org.telegram.ui.ActionBar.j6.f19987hg;
                        g1Var2.c(org.telegram.ui.ActionBar.j6.w0(null, i14, false), org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                        g1Var2.setChecked(false);
                        int i15 = org.telegram.ui.ActionBar.j6.f20254wg;
                        g1Var.c(org.telegram.ui.ActionBar.j6.w0(null, i15, false), org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                        g1Var.setChecked(true);
                    } else {
                        int i16 = org.telegram.ui.ActionBar.j6.f20254wg;
                        g1Var2.c(org.telegram.ui.ActionBar.j6.w0(null, i16, false), org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                        g1Var2.setChecked(true);
                        int i17 = org.telegram.ui.ActionBar.j6.f19987hg;
                        g1Var.c(org.telegram.ui.ActionBar.j6.w0(null, i17, false), org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                        g1Var.setChecked(false);
                    }
                    c60Var.f33131i0 = false;
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
                    c60Var.I1();
                    w0Var.M(null, null);
                    return;
                }
                return;
            case 1:
                if (c60Var.r1()) {
                    if (ff.d.a(c60Var.f33119f0) > 0) {
                        org.telegram.ui.Components.voip.g1.n(c60Var.f33119f0);
                        c60Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.z4.B(c60Var.f33119f0, null, true).o();
                    return;
                } else if (AndroidUtilities.checkInlinePermissions(c60Var.f33119f0)) {
                    org.telegram.ui.Components.a30.f23278b0 = false;
                    c60Var.dismiss();
                    return;
                } else {
                    org.telegram.ui.Components.z4.A(c60Var.getContext()).o();
                    return;
                }
            case 2:
                c60Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = c60Var.f33119f0;
                    if (launchActivity != null) {
                        c60Var.f33119f0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChatObject.Call call2 = c60Var.X0;
                if (call2 != null && call2.recording) {
                    c60Var.G1(c60Var.L.getTitleTextView());
                    return;
                }
                return;
            case 4:
                d40 d40Var = c60Var.E;
                if (d40Var.m()) {
                    d40Var.j();
                    return;
                } else {
                    d40Var.d();
                    return;
                }
            case 5:
                c60.D(c60Var);
                return;
            case 6:
                int P0 = c60Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    c60Var.N.v0(0, P0, null);
                }
                org.telegram.ui.Components.yt ytVar = c60Var.E.f24367a;
                ytVar.requestFocus();
                AndroidUtilities.showKeyboard(ytVar);
                return;
            case 7:
                ChatObject.Call call3 = c60Var.X0;
                if (call3 != null && !call3.isScheduled() && !c60Var.r1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(c60Var.getContext(), false);
                        return;
                    }
                    return;
                }
                c60Var.j1(false);
                return;
            case 8:
                ChatObject.Call call4 = c60Var.X0;
                if (call4 != null && call4.recording) {
                    c60Var.G1(c60Var.L.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ChatObject.Call call5 = c60Var.X0;
                if (call5 != null && call5.recording) {
                    c60Var.G1(c60Var.L.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = c60Var.V1;
                org.telegram.ui.Components.gj0 gj0Var = c60Var.D2;
                c60Var.X1.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (c60Var.E2 == 18) {
                        c60Var.E2 = 39;
                        gj0Var.N(39);
                        gj0Var.start();
                    } else {
                        gj0Var.L(0, false, false);
                        c60Var.E2 = 18;
                        gj0Var.N(18);
                        gj0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList.get(i18);
                        ChatObject.VideoParticipant videoParticipant = tVar.f29947w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.o oVar = tVar.f29919a;
                            if (tVar.G0 == null) {
                                tVar.H0 = false;
                                ImageView imageView = tVar.f29945u0;
                                if (imageView == null) {
                                    tVar.f29945u0 = new ImageView(tVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (oVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = oVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        tVar.f29945u0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    tVar.f29945u0.setAlpha(0.0f);
                                } else {
                                    tVar.f29945u0.setAlpha(1.0f);
                                }
                                if (tVar.f29945u0.getParent() == null) {
                                    oVar.addView(tVar.f29945u0);
                                }
                                ((FrameLayout.LayoutParams) tVar.f29945u0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                tVar.G0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(tVar, 1));
                                tVar.G0.addListener(new org.telegram.ui.Components.voip.r(tVar, 2));
                                tVar.G0.setDuration(400L);
                                tVar.G0.setInterpolator(org.telegram.ui.Components.nr.f27346f);
                                tVar.G0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (c60Var.h1() != 1) {
                    i13 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i13 = 2;
                    }
                }
                c60Var.f33187v3 = Integer.valueOf(i13);
                c60Var.N1(true, true);
                c60Var.f33187v3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hm(c60Var, i13, 12));
                return;
        }
    }
}
