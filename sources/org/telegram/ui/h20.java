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
public final class h20 implements View.OnClickListener {
    public final int f39757a;
    public final x50 f39758b;

    public h20(x50 x50Var, int i10) {
        this.f39757a = i10;
        this.f39758b = x50Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        String string;
        int i12 = this.f39757a;
        int i13 = 0;
        x50 x50Var = this.f39758b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.w0 w0Var = x50Var.f45533k1;
                org.telegram.ui.ActionBar.g1 g1Var = x50Var.f45578v1;
                org.telegram.ui.ActionBar.g1 g1Var2 = x50Var.f45574u1;
                org.telegram.ui.ActionBar.g1 g1Var3 = x50Var.f45552p1;
                ChatObject.Call call = x50Var.f45491a1;
                if (call != null && !x50Var.a2.f34008b) {
                    if (call.call.join_muted) {
                        int i14 = org.telegram.ui.ActionBar.y6.f23439hg;
                        g1Var2.d(org.telegram.ui.ActionBar.y6.x0(null, i14, false), org.telegram.ui.ActionBar.y6.x0(null, i14, false));
                        g1Var2.setChecked(false);
                        int i15 = org.telegram.ui.ActionBar.y6.f23722wg;
                        g1Var.d(org.telegram.ui.ActionBar.y6.x0(null, i15, false), org.telegram.ui.ActionBar.y6.x0(null, i15, false));
                        g1Var.setChecked(true);
                    } else {
                        int i16 = org.telegram.ui.ActionBar.y6.f23722wg;
                        g1Var2.d(org.telegram.ui.ActionBar.y6.x0(null, i16, false), org.telegram.ui.ActionBar.y6.x0(null, i16, false));
                        g1Var2.setChecked(true);
                        int i17 = org.telegram.ui.ActionBar.y6.f23439hg;
                        g1Var.d(org.telegram.ui.ActionBar.y6.x0(null, i17, false), org.telegram.ui.ActionBar.y6.x0(null, i17, false));
                        g1Var.setChecked(false);
                    }
                    x50Var.f45536l0 = false;
                    w0Var.t(1);
                    w0Var.t(2);
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
                    x50Var.J1();
                    w0Var.U(null, null);
                    return;
                }
                return;
            case 1:
                if (x50Var.r1()) {
                    if (vf.b.a(x50Var.f45524i0) > 0) {
                        org.telegram.ui.Components.voip.i1.n(x50Var.f45524i0);
                        x50Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.g5.A(x50Var.f45524i0, null, true).p();
                    return;
                } else if (AndroidUtilities.checkInlinePermissions(x50Var.f45524i0)) {
                    org.telegram.ui.Components.k30.f29836e0 = false;
                    x50Var.dismiss();
                    return;
                } else {
                    org.telegram.ui.Components.g5.z(x50Var.getContext()).p();
                    return;
                }
            case 2:
                x50Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = x50Var.f45524i0;
                    if (launchActivity != null) {
                        x50Var.f45524i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChatObject.Call call2 = x50Var.f45491a1;
                if (call2 != null && call2.recording) {
                    x50Var.H1(x50Var.O.getTitleTextView());
                    return;
                }
                return;
            case 4:
                w30 w30Var = x50Var.H;
                if (w30Var.m()) {
                    w30Var.j();
                    return;
                } else {
                    w30Var.d();
                    return;
                }
            case 5:
                x50.D(x50Var);
                return;
            case 6:
                int P0 = x50Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    x50Var.Q.w0(0, P0, null);
                }
                org.telegram.ui.Components.mu muVar = x50Var.H.f32365a;
                muVar.requestFocus();
                AndroidUtilities.showKeyboard(muVar);
                return;
            case 7:
                ChatObject.Call call3 = x50Var.f45491a1;
                if (call3 != null && !call3.isScheduled() && !x50Var.r1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(x50Var.getContext(), false);
                        return;
                    }
                    return;
                }
                x50Var.j1(false);
                return;
            case 8:
                ChatObject.Call call4 = x50Var.f45491a1;
                if (call4 != null && call4.recording) {
                    x50Var.H1(x50Var.O.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ChatObject.Call call5 = x50Var.f45491a1;
                if (call5 != null && call5.recording) {
                    x50Var.H1(x50Var.O.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = x50Var.Y1;
                org.telegram.ui.Components.yj0 yj0Var = x50Var.G2;
                x50Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (x50Var.H2 == 18) {
                        x50Var.H2 = 39;
                        yj0Var.P(39);
                        yj0Var.start();
                    } else {
                        yj0Var.N(0, false, false);
                        x50Var.H2 = 18;
                        yj0Var.P(18);
                        yj0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList.get(i18);
                        ChatObject.VideoParticipant videoParticipant = tVar.f34207w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.o oVar = tVar.f34179a;
                            if (tVar.J0 == null) {
                                tVar.K0 = false;
                                ImageView imageView = tVar.f34210x0;
                                if (imageView == null) {
                                    tVar.f34210x0 = new ImageView(tVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (oVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = oVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        tVar.f34210x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    tVar.f34210x0.setAlpha(0.0f);
                                } else {
                                    tVar.f34210x0.setAlpha(1.0f);
                                }
                                if (tVar.f34210x0.getParent() == null) {
                                    oVar.addView(tVar.f34210x0);
                                }
                                ((FrameLayout.LayoutParams) tVar.f34210x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                tVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(tVar, 1));
                                tVar.J0.addListener(new org.telegram.ui.Components.voip.r(tVar, 2));
                                tVar.J0.setDuration(400L);
                                tVar.J0.setInterpolator(org.telegram.ui.Components.ds.f27530f);
                                tVar.J0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (x50Var.h1() != 1) {
                    i13 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i13 = 2;
                    }
                }
                x50Var.y3 = Integer.valueOf(i13);
                x50Var.O1(true, true);
                x50Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h2(x50Var, i13, 15));
                return;
        }
    }
}
