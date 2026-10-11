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
public final class q20 implements View.OnClickListener {
    public final int f41027a;
    public final g60 f41028b;

    public q20(g60 g60Var, int i10) {
        this.f41027a = i10;
        this.f41028b = g60Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        String string;
        int i12 = this.f41027a;
        int i13 = 0;
        g60 g60Var = this.f41028b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.u0 u0Var = g60Var.f37911k1;
                org.telegram.ui.ActionBar.e1 e1Var = g60Var.f37956v1;
                org.telegram.ui.ActionBar.e1 e1Var2 = g60Var.f37952u1;
                org.telegram.ui.ActionBar.e1 e1Var3 = g60Var.f37930p1;
                ChatObject.Call call = g60Var.f37869a1;
                if (call != null && !g60Var.a2.f32114b) {
                    if (call.call.join_muted) {
                        int i14 = org.telegram.ui.ActionBar.h6.f20867hg;
                        e1Var2.c(org.telegram.ui.ActionBar.h6.x0(null, i14, false), org.telegram.ui.ActionBar.h6.x0(null, i14, false));
                        e1Var2.setChecked(false);
                        int i15 = org.telegram.ui.ActionBar.h6.f21146wg;
                        e1Var.c(org.telegram.ui.ActionBar.h6.x0(null, i15, false), org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                        e1Var.setChecked(true);
                    } else {
                        int i16 = org.telegram.ui.ActionBar.h6.f21146wg;
                        e1Var2.c(org.telegram.ui.ActionBar.h6.x0(null, i16, false), org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                        e1Var2.setChecked(true);
                        int i17 = org.telegram.ui.ActionBar.h6.f20867hg;
                        e1Var.c(org.telegram.ui.ActionBar.h6.x0(null, i17, false), org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                        e1Var.setChecked(false);
                    }
                    g60Var.f37914l0 = false;
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
                    g60Var.J1();
                    u0Var.M(null, null);
                    return;
                }
                return;
            case 1:
                if (g60Var.s1()) {
                    if (tf.c.a(g60Var.f37903i0) > 0) {
                        org.telegram.ui.Components.voip.k1.n(g60Var.f37903i0);
                        g60Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.g5.A(g60Var.f37903i0, null, true).o();
                    return;
                } else if (AndroidUtilities.checkInlinePermissions(g60Var.f37903i0)) {
                    org.telegram.ui.Components.r30.f30318e0 = false;
                    g60Var.dismiss();
                    return;
                } else {
                    org.telegram.ui.Components.g5.z(g60Var.getContext()).o();
                    return;
                }
            case 2:
                g60Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = g60Var.f37903i0;
                    if (launchActivity != null) {
                        g60Var.f37903i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChatObject.Call call2 = g60Var.f37869a1;
                if (call2 != null && call2.recording) {
                    g60Var.H1(g60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 4:
                g40 g40Var = g60Var.H;
                if (g40Var.m()) {
                    g40Var.j();
                    return;
                } else {
                    g40Var.d();
                    return;
                }
            case 5:
                g60.F(g60Var);
                return;
            case 6:
                int Q0 = g60Var.Q0();
                if (Q0 > 0 && Q0 != Integer.MAX_VALUE) {
                    g60Var.Q.v0(0, Q0, null);
                }
                org.telegram.ui.Components.vu vuVar = g60Var.H.f24589a;
                vuVar.requestFocus();
                AndroidUtilities.showKeyboard(vuVar);
                return;
            case 7:
                ChatObject.Call call3 = g60Var.f37869a1;
                if (call3 != null && !call3.isScheduled() && !g60Var.s1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(g60Var.getContext(), false);
                        return;
                    }
                    return;
                }
                g60Var.k1(false);
                return;
            case 8:
                ChatObject.Call call4 = g60Var.f37869a1;
                if (call4 != null && call4.recording) {
                    g60Var.H1(g60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ChatObject.Call call5 = g60Var.f37869a1;
                if (call5 != null && call5.recording) {
                    g60Var.H1(g60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = g60Var.Y1;
                org.telegram.ui.Components.ek0 ek0Var = g60Var.G2;
                g60Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (g60Var.H2 == 18) {
                        g60Var.H2 = 39;
                        ek0Var.P(39);
                        ek0Var.start();
                    } else {
                        ek0Var.N(0, false, false);
                        g60Var.H2 = 18;
                        ek0Var.P(18);
                        ek0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.v vVar = (org.telegram.ui.Components.voip.v) arrayList.get(i18);
                        ChatObject.VideoParticipant videoParticipant = vVar.f32339w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.q qVar = vVar.f32310a;
                            if (vVar.J0 == null) {
                                vVar.K0 = false;
                                ImageView imageView = vVar.f32342x0;
                                if (imageView == null) {
                                    vVar.f32342x0 = new ImageView(vVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (qVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = qVar.f32276e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        vVar.f32342x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    vVar.f32342x0.setAlpha(0.0f);
                                } else {
                                    vVar.f32342x0.setAlpha(1.0f);
                                }
                                if (vVar.f32342x0.getParent() == null) {
                                    qVar.addView(vVar.f32342x0);
                                }
                                ((FrameLayout.LayoutParams) vVar.f32342x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                vVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.o(vVar, 1));
                                vVar.J0.addListener(new org.telegram.ui.Components.voip.t(vVar, 2));
                                vVar.J0.setDuration(400L);
                                vVar.J0.setInterpolator(org.telegram.ui.Components.is.f27451f);
                                vVar.J0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (g60Var.i1() != 1) {
                    i13 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i13 = 2;
                    }
                }
                g60Var.y3 = Integer.valueOf(i13);
                g60Var.O1(true, true);
                g60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.nd(g60Var, i13, 15));
                return;
        }
    }
}
