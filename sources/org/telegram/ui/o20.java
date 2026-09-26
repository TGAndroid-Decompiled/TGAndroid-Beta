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
    public final int f36036a;
    public final d60 f36037b;

    public o20(d60 d60Var, int i10) {
        this.f36036a = i10;
        this.f36037b = d60Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        String string;
        int i12 = this.f36036a;
        int i13 = 0;
        d60 d60Var = this.f36037b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.u0 u0Var = d60Var.f32976k1;
                org.telegram.ui.ActionBar.e1 e1Var = d60Var.f33021v1;
                org.telegram.ui.ActionBar.e1 e1Var2 = d60Var.f33017u1;
                org.telegram.ui.ActionBar.e1 e1Var3 = d60Var.f32995p1;
                ChatObject.Call call = d60Var.f32935a1;
                if (call != null && !d60Var.a2.f29461b) {
                    if (call.call.join_muted) {
                        int i14 = org.telegram.ui.ActionBar.h6.f19138hg;
                        e1Var2.c(org.telegram.ui.ActionBar.h6.w0(null, i14, false), org.telegram.ui.ActionBar.h6.w0(null, i14, false));
                        e1Var2.setChecked(false);
                        int i15 = org.telegram.ui.ActionBar.h6.f19416wg;
                        e1Var.c(org.telegram.ui.ActionBar.h6.w0(null, i15, false), org.telegram.ui.ActionBar.h6.w0(null, i15, false));
                        e1Var.setChecked(true);
                    } else {
                        int i16 = org.telegram.ui.ActionBar.h6.f19416wg;
                        e1Var2.c(org.telegram.ui.ActionBar.h6.w0(null, i16, false), org.telegram.ui.ActionBar.h6.w0(null, i16, false));
                        e1Var2.setChecked(true);
                        int i17 = org.telegram.ui.ActionBar.h6.f19138hg;
                        e1Var.c(org.telegram.ui.ActionBar.h6.w0(null, i17, false), org.telegram.ui.ActionBar.h6.w0(null, i17, false));
                        e1Var.setChecked(false);
                    }
                    d60Var.f32979l0 = false;
                    u0Var.r(1);
                    u0Var.r(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            e1Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            if (VoIPService.getSharedInstance().currentBluetoothDeviceName != null) {
                                string = VoIPService.getSharedInstance().currentBluetoothDeviceName;
                            } else {
                                string = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                            }
                            e1Var3.setSubtext(string);
                        } else if (currentAudioRoute == 0) {
                            if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                i10 = R.drawable.msg_voice_headphones;
                            } else {
                                i10 = R.drawable.msg_voice_phone;
                            }
                            e1Var3.setIcon(i10);
                            if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                i11 = R.string.VoipAudioRoutingHeadset;
                            } else {
                                i11 = R.string.VoipAudioRoutingPhone;
                            }
                            e1Var3.setSubtext(LocaleController.getString(i11));
                        } else if (currentAudioRoute == 1) {
                            if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                e1Var3.setIcon(R.drawable.msg_voice_speaker);
                                e1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
                            } else {
                                e1Var3.setIcon(R.drawable.msg_voice_phone);
                                e1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingPhone));
                            }
                        }
                    }
                    d60Var.I1();
                    u0Var.M(null, null);
                    return;
                }
                return;
            case 1:
                if (d60Var.r1()) {
                    if (sf.c.a(d60Var.f32968i0) > 0) {
                        org.telegram.ui.Components.voip.k1.n(d60Var.f32968i0);
                        d60Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.e5.B(d60Var.f32968i0, null, true).o();
                    return;
                } else if (AndroidUtilities.checkInlinePermissions(d60Var.f32968i0)) {
                    org.telegram.ui.Components.a30.f22571e0 = false;
                    d60Var.dismiss();
                    return;
                } else {
                    org.telegram.ui.Components.e5.A(d60Var.getContext()).o();
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
                    LaunchActivity launchActivity = d60Var.f32968i0;
                    if (launchActivity != null) {
                        d60Var.f32968i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChatObject.Call call2 = d60Var.f32935a1;
                if (call2 != null && call2.recording) {
                    d60Var.G1(d60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 4:
                d40 d40Var = d60Var.H;
                if (d40Var.m()) {
                    d40Var.j();
                    return;
                } else {
                    d40Var.d();
                    return;
                }
            case 5:
                d60.E(d60Var);
                return;
            case 6:
                int P0 = d60Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    d60Var.Q.v0(0, P0, null);
                }
                org.telegram.ui.Components.fu fuVar = d60Var.H.f25880a;
                fuVar.requestFocus();
                AndroidUtilities.showKeyboard(fuVar);
                return;
            case 7:
                ChatObject.Call call3 = d60Var.f32935a1;
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
                ChatObject.Call call4 = d60Var.f32935a1;
                if (call4 != null && call4.recording) {
                    d60Var.G1(d60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ChatObject.Call call5 = d60Var.f32935a1;
                if (call5 != null && call5.recording) {
                    d60Var.G1(d60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = d60Var.Y1;
                org.telegram.ui.Components.ij0 ij0Var = d60Var.G2;
                d60Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (d60Var.H2 == 18) {
                        d60Var.H2 = 39;
                        ij0Var.P(39);
                        ij0Var.start();
                    } else {
                        ij0Var.N(0, false, false);
                        d60Var.H2 = 18;
                        ij0Var.P(18);
                        ij0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList.get(i18);
                        ChatObject.VideoParticipant videoParticipant = uVar.f29670w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.p pVar = uVar.f29642a;
                            if (uVar.J0 == null) {
                                uVar.K0 = false;
                                ImageView imageView = uVar.f29673x0;
                                if (imageView == null) {
                                    uVar.f29673x0 = new ImageView(uVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (pVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = pVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        uVar.f29673x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    uVar.f29673x0.setAlpha(0.0f);
                                } else {
                                    uVar.f29673x0.setAlpha(1.0f);
                                }
                                if (uVar.f29673x0.getParent() == null) {
                                    pVar.addView(uVar.f29673x0);
                                }
                                ((FrameLayout.LayoutParams) uVar.f29673x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                uVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(uVar, 1));
                                uVar.J0.addListener(new org.telegram.ui.Components.voip.s(uVar, 2));
                                uVar.J0.setDuration(400L);
                                uVar.J0.setInterpolator(org.telegram.ui.Components.rr.f28030f);
                                uVar.J0.start();
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
                d60Var.y3 = Integer.valueOf(i13);
                d60Var.N1(true, true);
                d60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ld(d60Var, i13, 14));
                return;
        }
    }
}
