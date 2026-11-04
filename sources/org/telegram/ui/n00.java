package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.media.projection.MediaProjectionManager;
import android.provider.Settings;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLRPC;
public final class n00 implements View.OnClickListener {
    public final int f47846a;
    public final x30 f47847b;

    public n00(x30 x30Var, int i3) {
        this.f47846a = i3;
        this.f47847b = x30Var;
    }

    @Override
    public final void onClick(View view) {
        String M0;
        int i3 = this.f47846a;
        int i10 = 2;
        x30 x30Var = this.f47847b;
        switch (i3) {
            case 0:
                org.telegram.ui.ActionBar.q0 q0Var = x30Var.f51724c3;
                org.telegram.ui.ActionBar.y0 y0Var = x30Var.f51770n3;
                org.telegram.ui.ActionBar.y0 y0Var2 = x30Var.f51765m3;
                org.telegram.ui.ActionBar.y0 y0Var3 = x30Var.f51744h3;
                org.telegram.messenger.r3 r3Var = x30Var.S2;
                if (r3Var != null && !x30Var.S3.f39670b) {
                    if (r3Var.f25049b.join_muted) {
                        int i11 = org.telegram.ui.ActionBar.k6.Vg;
                        y0Var2.d(org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false));
                        y0Var2.setChecked(false);
                        int i12 = org.telegram.ui.ActionBar.k6.f28017kh;
                        y0Var.d(org.telegram.ui.ActionBar.k6.x0(null, i12, false), org.telegram.ui.ActionBar.k6.x0(null, i12, false));
                        y0Var.setChecked(true);
                    } else {
                        int i13 = org.telegram.ui.ActionBar.k6.f28017kh;
                        y0Var2.d(org.telegram.ui.ActionBar.k6.x0(null, i13, false), org.telegram.ui.ActionBar.k6.x0(null, i13, false));
                        y0Var2.setChecked(true);
                        int i14 = org.telegram.ui.ActionBar.k6.Vg;
                        y0Var.d(org.telegram.ui.ActionBar.k6.x0(null, i14, false), org.telegram.ui.ActionBar.k6.x0(null, i14, false));
                        y0Var.setChecked(false);
                    }
                    x30Var.f51727d2 = false;
                    q0Var.t(1);
                    q0Var.t(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            y0Var3.setIcon(2131232425);
                            if (VoIPService.getSharedInstance().currentBluetoothDeviceName != null) {
                                M0 = VoIPService.getSharedInstance().currentBluetoothDeviceName;
                            } else {
                                M0 = org.telegram.messenger.bd.M0(2131743513, null);
                            }
                            y0Var3.setSubtext(M0);
                        } else {
                            int i15 = 2131743510;
                            int i16 = 2131232428;
                            if (currentAudioRoute == 0) {
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i16 = 2131232426;
                                }
                                y0Var3.setIcon(i16);
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i15 = 2131743511;
                                }
                                y0Var3.setSubtext(org.telegram.messenger.bd.M0(i15, null));
                            } else if (currentAudioRoute == 1) {
                                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                    y0Var3.setIcon(2131232430);
                                    y0Var3.setSubtext(org.telegram.messenger.bd.M0(2131743509, null));
                                } else {
                                    y0Var3.setIcon(2131232428);
                                    y0Var3.setSubtext(org.telegram.messenger.bd.M0(2131743510, null));
                                }
                            }
                        }
                    }
                    x30Var.L1();
                    q0Var.U(null, null);
                    return;
                }
                return;
            case 1:
                if (x30Var.t1()) {
                    if (xf.b.a(x30Var.f51716a2) > 0) {
                        org.telegram.ui.Components.voip.s0.h(x30Var.f51716a2);
                        x30Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.t4.A(x30Var.f51716a2, null, true).p();
                    return;
                }
                LaunchActivity launchActivity = x30Var.f51716a2;
                Typeface typeface = org.telegram.messenger.g0.f22580a;
                if (Settings.canDrawOverlays(launchActivity)) {
                    org.telegram.ui.Components.l10.f35546f0 = false;
                    x30Var.dismiss();
                    return;
                }
                org.telegram.ui.Components.t4.z(x30Var.getContext()).p();
                return;
            case 2:
                x30Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity2 = x30Var.f51716a2;
                    if (launchActivity2 != null) {
                        x30Var.f51716a2.startActivityForResult(((MediaProjectionManager) launchActivity2.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.r3 r3Var2 = x30Var.S2;
                if (r3Var2 != null && r3Var2.f25067w) {
                    x30Var.J1(x30Var.G1.getTitleTextView());
                    return;
                }
                return;
            case 4:
                c20 c20Var = x30Var.f51822z1;
                if (c20Var.m()) {
                    c20Var.j();
                    return;
                } else {
                    c20Var.d();
                    return;
                }
            case 5:
                Editable text = x30Var.f51822z1.getText();
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = text.toString();
                tL_textWithEntities.entities = org.telegram.messenger.li.b0(x30Var.f28583a).W(new CharSequence[]{text}, true, true);
                x30Var.C1(tL_textWithEntities);
                return;
            case 6:
                int R0 = x30Var.R0();
                if (R0 > 0 && R0 != Integer.MAX_VALUE) {
                    x30Var.I1.w0(0, R0, null);
                }
                org.telegram.ui.Components.dt dtVar = x30Var.f51822z1.f35188a;
                dtVar.requestFocus();
                org.telegram.messenger.g0.K3(dtVar);
                return;
            case 7:
                org.telegram.messenger.r3 r3Var3 = x30Var.S2;
                if (r3Var3 != null && !r3Var3.j() && !x30Var.t1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(x30Var.getContext(), false);
                        return;
                    }
                    return;
                }
                x30Var.l1(false);
                return;
            case 8:
                org.telegram.messenger.r3 r3Var4 = x30Var.S2;
                if (r3Var4 != null && r3Var4.f25067w) {
                    x30Var.J1(x30Var.G1.getTitleTextView());
                    return;
                }
                return;
            case 9:
                org.telegram.messenger.r3 r3Var5 = x30Var.S2;
                if (r3Var5 != null && r3Var5.f25067w) {
                    x30Var.J1(x30Var.G1.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = x30Var.Q3;
                org.telegram.ui.Components.ch0 ch0Var = x30Var.f51821y4;
                x30Var.S3.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (x30Var.f51825z4 == 18) {
                        x30Var.f51825z4 = 39;
                        ch0Var.P(39);
                        ch0Var.start();
                    } else {
                        ch0Var.N(0, false, false);
                        x30Var.f51825z4 = 18;
                        ch0Var.P(18);
                        ch0Var.start();
                    }
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) arrayList.get(i17);
                        org.telegram.messenger.s3 s3Var = rVar.f39577x;
                        if (s3Var.f25270a.self && !s3Var.f25271b) {
                            org.telegram.ui.Components.voip.n nVar = rVar.f39546a;
                            if (rVar.K0 == null) {
                                rVar.L0 = false;
                                ImageView imageView = rVar.f39580y0;
                                if (imageView == null) {
                                    rVar.f39580y0 = new ImageView(rVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (nVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = nVar.f39737e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        rVar.f39580y0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    rVar.f39580y0.setAlpha(0.0f);
                                } else {
                                    rVar.f39580y0.setAlpha(1.0f);
                                }
                                if (rVar.f39580y0.getParent() == null) {
                                    nVar.addView(rVar.f39580y0);
                                }
                                ((FrameLayout.LayoutParams) rVar.f39580y0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                rVar.K0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.m(rVar, 1));
                                rVar.K0.addListener(new org.telegram.ui.Components.voip.p(rVar, 2));
                                rVar.K0.setDuration(400L);
                                rVar.K0.setInterpolator(org.telegram.ui.Components.xq.f40452f);
                                rVar.K0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (x30Var.j1() != 1) {
                    i10 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 == null || !sharedInstance3.isBluetoothHeadsetConnected()) {
                        i10 = 0;
                    }
                }
                x30Var.f51786q5 = Integer.valueOf(i10);
                x30Var.Q1(true, true);
                x30Var.f51786q5 = null;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.o2(x30Var, i10, 13));
                return;
        }
    }
}
