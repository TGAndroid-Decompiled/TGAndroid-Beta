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
public final class d20 implements View.OnClickListener {
    public final int f36485a;
    public final u50 f36486b;

    public d20(u50 u50Var, int i10) {
        this.f36485a = i10;
        this.f36486b = u50Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        String string;
        int i12 = this.f36485a;
        int i13 = 0;
        u50 u50Var = this.f36486b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.u0 u0Var = u50Var.f42213k1;
                org.telegram.ui.ActionBar.e1 e1Var = u50Var.f42258v1;
                org.telegram.ui.ActionBar.e1 e1Var2 = u50Var.f42254u1;
                org.telegram.ui.ActionBar.e1 e1Var3 = u50Var.f42232p1;
                ChatObject.Call call = u50Var.f42171a1;
                if (call != null && !u50Var.a2.f31700b) {
                    if (call.call.join_muted) {
                        int i14 = org.telegram.ui.ActionBar.k6.f21262hg;
                        e1Var2.d(org.telegram.ui.ActionBar.k6.x0(null, i14, false), org.telegram.ui.ActionBar.k6.x0(null, i14, false));
                        e1Var2.setChecked(false);
                        int i15 = org.telegram.ui.ActionBar.k6.f21544wg;
                        e1Var.d(org.telegram.ui.ActionBar.k6.x0(null, i15, false), org.telegram.ui.ActionBar.k6.x0(null, i15, false));
                        e1Var.setChecked(true);
                    } else {
                        int i16 = org.telegram.ui.ActionBar.k6.f21544wg;
                        e1Var2.d(org.telegram.ui.ActionBar.k6.x0(null, i16, false), org.telegram.ui.ActionBar.k6.x0(null, i16, false));
                        e1Var2.setChecked(true);
                        int i17 = org.telegram.ui.ActionBar.k6.f21262hg;
                        e1Var.d(org.telegram.ui.ActionBar.k6.x0(null, i17, false), org.telegram.ui.ActionBar.k6.x0(null, i17, false));
                        e1Var.setChecked(false);
                    }
                    u50Var.f42216l0 = false;
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
                    u50Var.J1();
                    u0Var.M(null, null);
                    return;
                }
                return;
            case 1:
                if (u50Var.r1()) {
                    if (uf.b.a(u50Var.f42204i0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(u50Var.f42204i0);
                        u50Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.f5.B(u50Var.f42204i0, null, true).p();
                    return;
                } else if (AndroidUtilities.checkInlinePermissions(u50Var.f42204i0)) {
                    org.telegram.ui.Components.i30.f27185e0 = false;
                    u50Var.dismiss();
                    return;
                } else {
                    org.telegram.ui.Components.f5.A(u50Var.getContext()).p();
                    return;
                }
            case 2:
                u50Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = u50Var.f42204i0;
                    if (launchActivity != null) {
                        u50Var.f42204i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChatObject.Call call2 = u50Var.f42171a1;
                if (call2 != null && call2.recording) {
                    u50Var.H1(u50Var.O.getTitleTextView());
                    return;
                }
                return;
            case 4:
                s30 s30Var = u50Var.H;
                if (s30Var.m()) {
                    s30Var.j();
                    return;
                } else {
                    s30Var.d();
                    return;
                }
            case 5:
                u50.D(u50Var);
                return;
            case 6:
                int P0 = u50Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    u50Var.Q.v0(0, P0, null);
                }
                org.telegram.ui.Components.lu luVar = u50Var.H.f29989a;
                luVar.requestFocus();
                AndroidUtilities.showKeyboard(luVar);
                return;
            case 7:
                ChatObject.Call call3 = u50Var.f42171a1;
                if (call3 != null && !call3.isScheduled() && !u50Var.r1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(u50Var.getContext(), false);
                        return;
                    }
                    return;
                }
                u50Var.j1(false);
                return;
            case 8:
                ChatObject.Call call4 = u50Var.f42171a1;
                if (call4 != null && call4.recording) {
                    u50Var.H1(u50Var.O.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ChatObject.Call call5 = u50Var.f42171a1;
                if (call5 != null && call5.recording) {
                    u50Var.H1(u50Var.O.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = u50Var.Y1;
                org.telegram.ui.Components.yj0 yj0Var = u50Var.G2;
                u50Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (u50Var.H2 == 18) {
                        u50Var.H2 = 39;
                        yj0Var.P(39);
                        yj0Var.start();
                    } else {
                        yj0Var.N(0, false, false);
                        u50Var.H2 = 18;
                        yj0Var.P(18);
                        yj0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList.get(i18);
                        ChatObject.VideoParticipant videoParticipant = tVar.f31921w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.o oVar = tVar.f31893a;
                            if (tVar.J0 == null) {
                                tVar.K0 = false;
                                ImageView imageView = tVar.f31924x0;
                                if (imageView == null) {
                                    tVar.f31924x0 = new ImageView(tVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (oVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = oVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        tVar.f31924x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    tVar.f31924x0.setAlpha(0.0f);
                                } else {
                                    tVar.f31924x0.setAlpha(1.0f);
                                }
                                if (tVar.f31924x0.getParent() == null) {
                                    oVar.addView(tVar.f31924x0);
                                }
                                ((FrameLayout.LayoutParams) tVar.f31924x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                tVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(tVar, 1));
                                tVar.J0.addListener(new org.telegram.ui.Components.voip.r(tVar, 2));
                                tVar.J0.setDuration(400L);
                                tVar.J0.setInterpolator(org.telegram.ui.Components.bs.f25133f);
                                tVar.J0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (u50Var.h1() != 1) {
                    i13 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i13 = 2;
                    }
                }
                u50Var.y3 = Integer.valueOf(i13);
                u50Var.O1(true, true);
                u50Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.d2(u50Var, i13, 16));
                return;
        }
    }
}
