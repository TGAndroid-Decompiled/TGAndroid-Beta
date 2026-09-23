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
    public final int f36252a;
    public final f60 f36253b;

    public q20(f60 f60Var, int i10) {
        this.f36252a = i10;
        this.f36253b = f60Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        String string;
        int i12 = this.f36252a;
        int i13 = 0;
        f60 f60Var = this.f36253b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.v0 v0Var = f60Var.f33140k1;
                org.telegram.ui.ActionBar.f1 f1Var = f60Var.f33185v1;
                org.telegram.ui.ActionBar.f1 f1Var2 = f60Var.f33181u1;
                org.telegram.ui.ActionBar.f1 f1Var3 = f60Var.f33159p1;
                ChatObject.Call call = f60Var.f33099a1;
                if (call != null && !f60Var.a2.f29029b) {
                    if (call.call.join_muted) {
                        int i14 = org.telegram.ui.ActionBar.h6.f18868hg;
                        f1Var2.c(org.telegram.ui.ActionBar.h6.w0(null, i14, false), org.telegram.ui.ActionBar.h6.w0(null, i14, false));
                        f1Var2.setChecked(false);
                        int i15 = org.telegram.ui.ActionBar.h6.f19144wg;
                        f1Var.c(org.telegram.ui.ActionBar.h6.w0(null, i15, false), org.telegram.ui.ActionBar.h6.w0(null, i15, false));
                        f1Var.setChecked(true);
                    } else {
                        int i16 = org.telegram.ui.ActionBar.h6.f19144wg;
                        f1Var2.c(org.telegram.ui.ActionBar.h6.w0(null, i16, false), org.telegram.ui.ActionBar.h6.w0(null, i16, false));
                        f1Var2.setChecked(true);
                        int i17 = org.telegram.ui.ActionBar.h6.f18868hg;
                        f1Var.c(org.telegram.ui.ActionBar.h6.w0(null, i17, false), org.telegram.ui.ActionBar.h6.w0(null, i17, false));
                        f1Var.setChecked(false);
                    }
                    f60Var.f33143l0 = false;
                    v0Var.r(1);
                    v0Var.r(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            f1Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            if (VoIPService.getSharedInstance().currentBluetoothDeviceName != null) {
                                string = VoIPService.getSharedInstance().currentBluetoothDeviceName;
                            } else {
                                string = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                            }
                            f1Var3.setSubtext(string);
                        } else if (currentAudioRoute == 0) {
                            if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                i10 = R.drawable.msg_voice_headphones;
                            } else {
                                i10 = R.drawable.msg_voice_phone;
                            }
                            f1Var3.setIcon(i10);
                            if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                i11 = R.string.VoipAudioRoutingHeadset;
                            } else {
                                i11 = R.string.VoipAudioRoutingPhone;
                            }
                            f1Var3.setSubtext(LocaleController.getString(i11));
                        } else if (currentAudioRoute == 1) {
                            if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                f1Var3.setIcon(R.drawable.msg_voice_speaker);
                                f1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
                            } else {
                                f1Var3.setIcon(R.drawable.msg_voice_phone);
                                f1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingPhone));
                            }
                        }
                    }
                    f60Var.I1();
                    v0Var.M(null, null);
                    return;
                }
                return;
            case 1:
                if (f60Var.r1()) {
                    if (sf.c.a(f60Var.f33132i0) > 0) {
                        org.telegram.ui.Components.voip.j1.n(f60Var.f33132i0);
                        f60Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.e5.B(f60Var.f33132i0, null, true).o();
                    return;
                } else if (AndroidUtilities.checkInlinePermissions(f60Var.f33132i0)) {
                    org.telegram.ui.Components.a30.f22334e0 = false;
                    f60Var.dismiss();
                    return;
                } else {
                    org.telegram.ui.Components.e5.A(f60Var.getContext()).o();
                    return;
                }
            case 2:
                f60Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = f60Var.f33132i0;
                    if (launchActivity != null) {
                        f60Var.f33132i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChatObject.Call call2 = f60Var.f33099a1;
                if (call2 != null && call2.recording) {
                    f60Var.G1(f60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 4:
                f40 f40Var = f60Var.H;
                if (f40Var.m()) {
                    f40Var.j();
                    return;
                } else {
                    f40Var.d();
                    return;
                }
            case 5:
                f60.E(f60Var);
                return;
            case 6:
                int P0 = f60Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    f60Var.Q.v0(0, P0, null);
                }
                org.telegram.ui.Components.fu fuVar = f60Var.H.f25693a;
                fuVar.requestFocus();
                AndroidUtilities.showKeyboard(fuVar);
                return;
            case 7:
                ChatObject.Call call3 = f60Var.f33099a1;
                if (call3 != null && !call3.isScheduled() && !f60Var.r1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(f60Var.getContext(), false);
                        return;
                    }
                    return;
                }
                f60Var.j1(false);
                return;
            case 8:
                ChatObject.Call call4 = f60Var.f33099a1;
                if (call4 != null && call4.recording) {
                    f60Var.G1(f60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ChatObject.Call call5 = f60Var.f33099a1;
                if (call5 != null && call5.recording) {
                    f60Var.G1(f60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = f60Var.Y1;
                org.telegram.ui.Components.yi0 yi0Var = f60Var.G2;
                f60Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (f60Var.H2 == 18) {
                        f60Var.H2 = 39;
                        yi0Var.P(39);
                        yi0Var.start();
                    } else {
                        yi0Var.N(0, false, false);
                        f60Var.H2 = 18;
                        yi0Var.P(18);
                        yi0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList.get(i18);
                        ChatObject.VideoParticipant videoParticipant = uVar.f29239w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.p pVar = uVar.f29211a;
                            if (uVar.J0 == null) {
                                uVar.K0 = false;
                                ImageView imageView = uVar.f29242x0;
                                if (imageView == null) {
                                    uVar.f29242x0 = new ImageView(uVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (pVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = pVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        uVar.f29242x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    uVar.f29242x0.setAlpha(0.0f);
                                } else {
                                    uVar.f29242x0.setAlpha(1.0f);
                                }
                                if (uVar.f29242x0.getParent() == null) {
                                    pVar.addView(uVar.f29242x0);
                                }
                                ((FrameLayout.LayoutParams) uVar.f29242x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                uVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(uVar, 1));
                                uVar.J0.addListener(new org.telegram.ui.Components.voip.s(uVar, 2));
                                uVar.J0.setDuration(400L);
                                uVar.J0.setInterpolator(org.telegram.ui.Components.rr.f27701f);
                                uVar.J0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (f60Var.h1() != 1) {
                    i13 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i13 = 2;
                    }
                }
                f60Var.y3 = Integer.valueOf(i13);
                f60Var.N1(true, true);
                f60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kd(f60Var, i13, 14));
                return;
        }
    }
}
