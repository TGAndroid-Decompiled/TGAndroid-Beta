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
public final class a20 implements View.OnClickListener {
    public final int f35249a;
    public final q50 f35250b;

    public a20(q50 q50Var, int i10) {
        this.f35249a = i10;
        this.f35250b = q50Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        String string;
        int i12 = this.f35249a;
        int i13 = 0;
        q50 q50Var = this.f35250b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.u0 u0Var = q50Var.f40412k1;
                org.telegram.ui.ActionBar.e1 e1Var = q50Var.f40457v1;
                org.telegram.ui.ActionBar.e1 e1Var2 = q50Var.f40453u1;
                org.telegram.ui.ActionBar.e1 e1Var3 = q50Var.f40431p1;
                ChatObject.Call call = q50Var.f40370a1;
                if (call != null && !q50Var.a2.f31563b) {
                    if (call.call.join_muted) {
                        int i14 = org.telegram.ui.ActionBar.h6.f21066hg;
                        e1Var2.c(org.telegram.ui.ActionBar.h6.x0(null, i14, false), org.telegram.ui.ActionBar.h6.x0(null, i14, false));
                        e1Var2.setChecked(false);
                        int i15 = org.telegram.ui.ActionBar.h6.f21348wg;
                        e1Var.c(org.telegram.ui.ActionBar.h6.x0(null, i15, false), org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                        e1Var.setChecked(true);
                    } else {
                        int i16 = org.telegram.ui.ActionBar.h6.f21348wg;
                        e1Var2.c(org.telegram.ui.ActionBar.h6.x0(null, i16, false), org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                        e1Var2.setChecked(true);
                        int i17 = org.telegram.ui.ActionBar.h6.f21066hg;
                        e1Var.c(org.telegram.ui.ActionBar.h6.x0(null, i17, false), org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                        e1Var.setChecked(false);
                    }
                    q50Var.f40415l0 = false;
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
                    q50Var.J1();
                    u0Var.M(null, null);
                    return;
                }
                return;
            case 1:
                if (q50Var.s1()) {
                    if (uf.b.a(q50Var.f40403i0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(q50Var.f40403i0);
                        q50Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.f5.A(q50Var.f40403i0, null, true).o();
                    return;
                } else if (AndroidUtilities.checkInlinePermissions(q50Var.f40403i0)) {
                    org.telegram.ui.Components.i30.f27049e0 = false;
                    q50Var.dismiss();
                    return;
                } else {
                    org.telegram.ui.Components.f5.z(q50Var.getContext()).o();
                    return;
                }
            case 2:
                q50Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = q50Var.f40403i0;
                    if (launchActivity != null) {
                        q50Var.f40403i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChatObject.Call call2 = q50Var.f40370a1;
                if (call2 != null && call2.recording) {
                    q50Var.H1(q50Var.O.getTitleTextView());
                    return;
                }
                return;
            case 4:
                p30 p30Var = q50Var.H;
                if (p30Var.m()) {
                    p30Var.j();
                    return;
                } else {
                    p30Var.d();
                    return;
                }
            case 5:
                q50.E(q50Var);
                return;
            case 6:
                int Q0 = q50Var.Q0();
                if (Q0 > 0 && Q0 != Integer.MAX_VALUE) {
                    q50Var.Q.v0(0, Q0, null);
                }
                org.telegram.ui.Components.lu luVar = q50Var.H.f29697a;
                luVar.requestFocus();
                AndroidUtilities.showKeyboard(luVar);
                return;
            case 7:
                ChatObject.Call call3 = q50Var.f40370a1;
                if (call3 != null && !call3.isScheduled() && !q50Var.s1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(q50Var.getContext(), false);
                        return;
                    }
                    return;
                }
                q50Var.k1(false);
                return;
            case 8:
                ChatObject.Call call4 = q50Var.f40370a1;
                if (call4 != null && call4.recording) {
                    q50Var.H1(q50Var.O.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ChatObject.Call call5 = q50Var.f40370a1;
                if (call5 != null && call5.recording) {
                    q50Var.H1(q50Var.O.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = q50Var.Y1;
                org.telegram.ui.Components.uj0 uj0Var = q50Var.G2;
                q50Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (q50Var.H2 == 18) {
                        q50Var.H2 = 39;
                        uj0Var.P(39);
                        uj0Var.start();
                    } else {
                        uj0Var.N(0, false, false);
                        q50Var.H2 = 18;
                        uj0Var.P(18);
                        uj0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList.get(i18);
                        ChatObject.VideoParticipant videoParticipant = tVar.f31784w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.o oVar = tVar.f31756a;
                            if (tVar.J0 == null) {
                                tVar.K0 = false;
                                ImageView imageView = tVar.f31787x0;
                                if (imageView == null) {
                                    tVar.f31787x0 = new ImageView(tVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (oVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = oVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        tVar.f31787x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    tVar.f31787x0.setAlpha(0.0f);
                                } else {
                                    tVar.f31787x0.setAlpha(1.0f);
                                }
                                if (tVar.f31787x0.getParent() == null) {
                                    oVar.addView(tVar.f31787x0);
                                }
                                ((FrameLayout.LayoutParams) tVar.f31787x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                tVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(tVar, 1));
                                tVar.J0.addListener(new org.telegram.ui.Components.voip.r(tVar, 2));
                                tVar.J0.setDuration(400L);
                                tVar.J0.setInterpolator(org.telegram.ui.Components.bs.f25012f);
                                tVar.J0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (q50Var.i1() != 1) {
                    i13 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i13 = 2;
                    }
                }
                q50Var.y3 = Integer.valueOf(i13);
                q50Var.O1(true, true);
                q50Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e2(q50Var, i13, 16));
                return;
        }
    }
}
