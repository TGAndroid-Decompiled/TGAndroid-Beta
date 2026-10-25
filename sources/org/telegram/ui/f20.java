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
public final class f20 implements View.OnClickListener {
    public final int f39240a;
    public final v50 f39241b;

    public f20(v50 v50Var, int i10) {
        this.f39240a = i10;
        this.f39241b = v50Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        String string;
        int i12 = this.f39240a;
        int i13 = 0;
        v50 v50Var = this.f39241b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.w0 w0Var = v50Var.f44649k1;
                org.telegram.ui.ActionBar.g1 g1Var = v50Var.f44694v1;
                org.telegram.ui.ActionBar.g1 g1Var2 = v50Var.f44690u1;
                org.telegram.ui.ActionBar.g1 g1Var3 = v50Var.f44668p1;
                ChatObject.Call call = v50Var.f44607a1;
                if (call != null && !v50Var.a2.f33900b) {
                    if (call.call.join_muted) {
                        int i14 = org.telegram.ui.ActionBar.y6.f23436hg;
                        g1Var2.d(org.telegram.ui.ActionBar.y6.x0(null, i14, false), org.telegram.ui.ActionBar.y6.x0(null, i14, false));
                        g1Var2.setChecked(false);
                        int i15 = org.telegram.ui.ActionBar.y6.f23719wg;
                        g1Var.d(org.telegram.ui.ActionBar.y6.x0(null, i15, false), org.telegram.ui.ActionBar.y6.x0(null, i15, false));
                        g1Var.setChecked(true);
                    } else {
                        int i16 = org.telegram.ui.ActionBar.y6.f23719wg;
                        g1Var2.d(org.telegram.ui.ActionBar.y6.x0(null, i16, false), org.telegram.ui.ActionBar.y6.x0(null, i16, false));
                        g1Var2.setChecked(true);
                        int i17 = org.telegram.ui.ActionBar.y6.f23436hg;
                        g1Var.d(org.telegram.ui.ActionBar.y6.x0(null, i17, false), org.telegram.ui.ActionBar.y6.x0(null, i17, false));
                        g1Var.setChecked(false);
                    }
                    v50Var.f44652l0 = false;
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
                    v50Var.J1();
                    w0Var.U(null, null);
                    return;
                }
                return;
            case 1:
                if (v50Var.r1()) {
                    if (vf.b.a(v50Var.f44640i0) > 0) {
                        org.telegram.ui.Components.voip.i1.n(v50Var.f44640i0);
                        v50Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.g5.A(v50Var.f44640i0, null, true).p();
                    return;
                } else if (AndroidUtilities.checkInlinePermissions(v50Var.f44640i0)) {
                    org.telegram.ui.Components.k30.f29785e0 = false;
                    v50Var.dismiss();
                    return;
                } else {
                    org.telegram.ui.Components.g5.z(v50Var.getContext()).p();
                    return;
                }
            case 2:
                v50Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = v50Var.f44640i0;
                    if (launchActivity != null) {
                        v50Var.f44640i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChatObject.Call call2 = v50Var.f44607a1;
                if (call2 != null && call2.recording) {
                    v50Var.H1(v50Var.O.getTitleTextView());
                    return;
                }
                return;
            case 4:
                u30 u30Var = v50Var.H;
                if (u30Var.m()) {
                    u30Var.j();
                    return;
                } else {
                    u30Var.d();
                    return;
                }
            case 5:
                v50.D(v50Var);
                return;
            case 6:
                int P0 = v50Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    v50Var.Q.w0(0, P0, null);
                }
                org.telegram.ui.Components.mu muVar = v50Var.H.f32323a;
                muVar.requestFocus();
                AndroidUtilities.showKeyboard(muVar);
                return;
            case 7:
                ChatObject.Call call3 = v50Var.f44607a1;
                if (call3 != null && !call3.isScheduled() && !v50Var.r1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(v50Var.getContext(), false);
                        return;
                    }
                    return;
                }
                v50Var.j1(false);
                return;
            case 8:
                ChatObject.Call call4 = v50Var.f44607a1;
                if (call4 != null && call4.recording) {
                    v50Var.H1(v50Var.O.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ChatObject.Call call5 = v50Var.f44607a1;
                if (call5 != null && call5.recording) {
                    v50Var.H1(v50Var.O.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = v50Var.Y1;
                org.telegram.ui.Components.xj0 xj0Var = v50Var.G2;
                v50Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (v50Var.H2 == 18) {
                        v50Var.H2 = 39;
                        xj0Var.P(39);
                        xj0Var.start();
                    } else {
                        xj0Var.N(0, false, false);
                        v50Var.H2 = 18;
                        xj0Var.P(18);
                        xj0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList.get(i18);
                        ChatObject.VideoParticipant videoParticipant = tVar.f34099w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.o oVar = tVar.f34071a;
                            if (tVar.J0 == null) {
                                tVar.K0 = false;
                                ImageView imageView = tVar.f34102x0;
                                if (imageView == null) {
                                    tVar.f34102x0 = new ImageView(tVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (oVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = oVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        tVar.f34102x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    tVar.f34102x0.setAlpha(0.0f);
                                } else {
                                    tVar.f34102x0.setAlpha(1.0f);
                                }
                                if (tVar.f34102x0.getParent() == null) {
                                    oVar.addView(tVar.f34102x0);
                                }
                                ((FrameLayout.LayoutParams) tVar.f34102x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                tVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(tVar, 1));
                                tVar.J0.addListener(new org.telegram.ui.Components.voip.r(tVar, 2));
                                tVar.J0.setDuration(400L);
                                tVar.J0.setInterpolator(org.telegram.ui.Components.ds.f27584f);
                                tVar.J0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (v50Var.h1() != 1) {
                    i13 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i13 = 2;
                    }
                }
                v50Var.y3 = Integer.valueOf(i13);
                v50Var.O1(true, true);
                v50Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h2(v50Var, i13, 15));
                return;
        }
    }
}
