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
public final class c20 implements View.OnClickListener {
    public final int f35809a;
    public final s50 f35810b;

    public c20(s50 s50Var, int i10) {
        this.f35809a = i10;
        this.f35810b = s50Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        String string;
        int i12 = this.f35809a;
        int i13 = 0;
        s50 s50Var = this.f35810b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.u0 u0Var = s50Var.f40976k1;
                org.telegram.ui.ActionBar.e1 e1Var = s50Var.f41021v1;
                org.telegram.ui.ActionBar.e1 e1Var2 = s50Var.f41017u1;
                org.telegram.ui.ActionBar.e1 e1Var3 = s50Var.f40995p1;
                ChatObject.Call call = s50Var.f40934a1;
                if (call != null && !s50Var.a2.f31561b) {
                    if (call.call.join_muted) {
                        int i14 = org.telegram.ui.ActionBar.h6.f21072hg;
                        e1Var2.c(org.telegram.ui.ActionBar.h6.x0(null, i14, false), org.telegram.ui.ActionBar.h6.x0(null, i14, false));
                        e1Var2.setChecked(false);
                        int i15 = org.telegram.ui.ActionBar.h6.f21354wg;
                        e1Var.c(org.telegram.ui.ActionBar.h6.x0(null, i15, false), org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                        e1Var.setChecked(true);
                    } else {
                        int i16 = org.telegram.ui.ActionBar.h6.f21354wg;
                        e1Var2.c(org.telegram.ui.ActionBar.h6.x0(null, i16, false), org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                        e1Var2.setChecked(true);
                        int i17 = org.telegram.ui.ActionBar.h6.f21072hg;
                        e1Var.c(org.telegram.ui.ActionBar.h6.x0(null, i17, false), org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                        e1Var.setChecked(false);
                    }
                    s50Var.f40979l0 = false;
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
                    s50Var.J1();
                    u0Var.M(null, null);
                    return;
                }
                return;
            case 1:
                if (s50Var.s1()) {
                    if (uf.b.a(s50Var.f40967i0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(s50Var.f40967i0);
                        s50Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.f5.A(s50Var.f40967i0, null, true).o();
                    return;
                } else if (AndroidUtilities.checkInlinePermissions(s50Var.f40967i0)) {
                    org.telegram.ui.Components.i30.f27057e0 = false;
                    s50Var.dismiss();
                    return;
                } else {
                    org.telegram.ui.Components.f5.z(s50Var.getContext()).o();
                    return;
                }
            case 2:
                s50Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = s50Var.f40967i0;
                    if (launchActivity != null) {
                        s50Var.f40967i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChatObject.Call call2 = s50Var.f40934a1;
                if (call2 != null && call2.recording) {
                    s50Var.H1(s50Var.O.getTitleTextView());
                    return;
                }
                return;
            case 4:
                r30 r30Var = s50Var.H;
                if (r30Var.m()) {
                    r30Var.j();
                    return;
                } else {
                    r30Var.d();
                    return;
                }
            case 5:
                s50.F(s50Var);
                return;
            case 6:
                int Q0 = s50Var.Q0();
                if (Q0 > 0 && Q0 != Integer.MAX_VALUE) {
                    s50Var.Q.v0(0, Q0, null);
                }
                org.telegram.ui.Components.lu luVar = s50Var.H.f29749a;
                luVar.requestFocus();
                AndroidUtilities.showKeyboard(luVar);
                return;
            case 7:
                ChatObject.Call call3 = s50Var.f40934a1;
                if (call3 != null && !call3.isScheduled() && !s50Var.s1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(s50Var.getContext(), false);
                        return;
                    }
                    return;
                }
                s50Var.k1(false);
                return;
            case 8:
                ChatObject.Call call4 = s50Var.f40934a1;
                if (call4 != null && call4.recording) {
                    s50Var.H1(s50Var.O.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ChatObject.Call call5 = s50Var.f40934a1;
                if (call5 != null && call5.recording) {
                    s50Var.H1(s50Var.O.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = s50Var.Y1;
                org.telegram.ui.Components.uj0 uj0Var = s50Var.G2;
                s50Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (s50Var.H2 == 18) {
                        s50Var.H2 = 39;
                        uj0Var.P(39);
                        uj0Var.start();
                    } else {
                        uj0Var.N(0, false, false);
                        s50Var.H2 = 18;
                        uj0Var.P(18);
                        uj0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList.get(i18);
                        ChatObject.VideoParticipant videoParticipant = tVar.f31782w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.o oVar = tVar.f31754a;
                            if (tVar.J0 == null) {
                                tVar.K0 = false;
                                ImageView imageView = tVar.f31785x0;
                                if (imageView == null) {
                                    tVar.f31785x0 = new ImageView(tVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (oVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = oVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        tVar.f31785x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    tVar.f31785x0.setAlpha(0.0f);
                                } else {
                                    tVar.f31785x0.setAlpha(1.0f);
                                }
                                if (tVar.f31785x0.getParent() == null) {
                                    oVar.addView(tVar.f31785x0);
                                }
                                ((FrameLayout.LayoutParams) tVar.f31785x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                tVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(tVar, 1));
                                tVar.J0.addListener(new org.telegram.ui.Components.voip.r(tVar, 2));
                                tVar.J0.setDuration(400L);
                                tVar.J0.setInterpolator(org.telegram.ui.Components.bs.f25037f);
                                tVar.J0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (s50Var.i1() != 1) {
                    i13 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i13 = 2;
                    }
                }
                s50Var.y3 = Integer.valueOf(i13);
                s50Var.O1(true, true);
                s50Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e2(s50Var, i13, 16));
                return;
        }
    }
}
