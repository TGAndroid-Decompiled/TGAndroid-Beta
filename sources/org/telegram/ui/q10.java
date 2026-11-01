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
public final class q10 implements View.OnClickListener {
    public final int f40653a;
    public final a50 f40654b;

    public q10(a50 a50Var, int i10) {
        this.f40653a = i10;
        this.f40654b = a50Var;
    }

    @Override
    public final void onClick(View view) {
        String L0;
        int i10 = this.f40653a;
        int i11 = 2;
        a50 a50Var = this.f40654b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.t0 t0Var = a50Var.f35583b3;
                org.telegram.ui.ActionBar.b1 b1Var = a50Var.f35630m3;
                org.telegram.ui.ActionBar.b1 b1Var2 = a50Var.f35626l3;
                org.telegram.ui.ActionBar.b1 b1Var3 = a50Var.f35603g3;
                org.telegram.messenger.u3 u3Var = a50Var.R2;
                if (u3Var != null && !a50Var.R3.f31792b) {
                    if (u3Var.f18361b.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.t6.Vg;
                        b1Var2.d(org.telegram.ui.ActionBar.t6.x0(null, i12, false), org.telegram.ui.ActionBar.t6.x0(null, i12, false));
                        b1Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.t6.f21070kh;
                        b1Var.d(org.telegram.ui.ActionBar.t6.x0(null, i13, false), org.telegram.ui.ActionBar.t6.x0(null, i13, false));
                        b1Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.t6.f21070kh;
                        b1Var2.d(org.telegram.ui.ActionBar.t6.x0(null, i14, false), org.telegram.ui.ActionBar.t6.x0(null, i14, false));
                        b1Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.t6.Vg;
                        b1Var.d(org.telegram.ui.ActionBar.t6.x0(null, i15, false), org.telegram.ui.ActionBar.t6.x0(null, i15, false));
                        b1Var.setChecked(false);
                    }
                    a50Var.f35586c2 = false;
                    t0Var.t(1);
                    t0Var.t(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            b1Var3.setIcon(2131232424);
                            if (VoIPService.getSharedInstance().currentBluetoothDeviceName != null) {
                                L0 = VoIPService.getSharedInstance().currentBluetoothDeviceName;
                            } else {
                                L0 = org.telegram.messenger.dd.L0(2131743529, null);
                            }
                            b1Var3.setSubtext(L0);
                        } else {
                            int i16 = 2131743526;
                            int i17 = 2131232427;
                            if (currentAudioRoute == 0) {
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i17 = 2131232425;
                                }
                                b1Var3.setIcon(i17);
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i16 = 2131743527;
                                }
                                b1Var3.setSubtext(org.telegram.messenger.dd.L0(i16, null));
                            } else if (currentAudioRoute == 1) {
                                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                    b1Var3.setIcon(2131232429);
                                    b1Var3.setSubtext(org.telegram.messenger.dd.L0(2131743525, null));
                                } else {
                                    b1Var3.setIcon(2131232427);
                                    b1Var3.setSubtext(org.telegram.messenger.dd.L0(2131743526, null));
                                }
                            }
                        }
                    }
                    a50Var.L1();
                    t0Var.U(null, null);
                    return;
                }
                return;
            case 1:
                if (a50Var.t1()) {
                    if (mf.b.a(a50Var.Z1) > 0) {
                        org.telegram.ui.Components.voip.t0.h(a50Var.Z1);
                        a50Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.s4.A(a50Var.Z1, null, true).p();
                    return;
                }
                LaunchActivity launchActivity = a50Var.Z1;
                Typeface typeface = org.telegram.messenger.i0.f16145a;
                if (Settings.canDrawOverlays(launchActivity)) {
                    org.telegram.ui.Components.g20.f26297e0 = false;
                    a50Var.dismiss();
                    return;
                }
                org.telegram.ui.Components.s4.z(a50Var.getContext()).p();
                return;
            case 2:
                a50Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity2 = a50Var.Z1;
                    if (launchActivity2 != null) {
                        a50Var.Z1.startActivityForResult(((MediaProjectionManager) launchActivity2.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.u3 u3Var2 = a50Var.R2;
                if (u3Var2 != null && u3Var2.f18378w) {
                    a50Var.J1(a50Var.F1.getTitleTextView());
                    return;
                }
                return;
            case 4:
                f30 f30Var = a50Var.f35683y1;
                if (f30Var.m()) {
                    f30Var.j();
                    return;
                } else {
                    f30Var.d();
                    return;
                }
            case 5:
                Editable text = a50Var.f35683y1.getText();
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = text.toString();
                tL_textWithEntities.entities = org.telegram.messenger.vi.b0(a50Var.f21584a).W(new CharSequence[]{text}, true, true);
                a50Var.C1(tL_textWithEntities);
                return;
            case 6:
                int R0 = a50Var.R0();
                if (R0 > 0 && R0 != Integer.MAX_VALUE) {
                    a50Var.H1.w0(0, R0, null);
                }
                org.telegram.ui.Components.rt rtVar = a50Var.f35683y1.f32308a;
                rtVar.requestFocus();
                org.telegram.messenger.i0.J3(rtVar);
                return;
            case 7:
                org.telegram.messenger.u3 u3Var3 = a50Var.R2;
                if (u3Var3 != null && !u3Var3.j() && !a50Var.t1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(a50Var.getContext(), false);
                        return;
                    }
                    return;
                }
                a50Var.l1(false);
                return;
            case 8:
                org.telegram.messenger.u3 u3Var4 = a50Var.R2;
                if (u3Var4 != null && u3Var4.f18378w) {
                    a50Var.J1(a50Var.F1.getTitleTextView());
                    return;
                }
                return;
            case 9:
                org.telegram.messenger.u3 u3Var5 = a50Var.R2;
                if (u3Var5 != null && u3Var5.f18378w) {
                    a50Var.J1(a50Var.F1.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = a50Var.P3;
                org.telegram.ui.Components.ci0 ci0Var = a50Var.f35682x4;
                a50Var.R3.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (a50Var.f35685y4 == 18) {
                        a50Var.f35685y4 = 39;
                        ci0Var.P(39);
                        ci0Var.start();
                    } else {
                        ci0Var.N(0, false, false);
                        a50Var.f35685y4 = 18;
                        ci0Var.P(18);
                        ci0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) arrayList.get(i18);
                        org.telegram.messenger.v3 v3Var = rVar.f31693x;
                        if (v3Var.f18588a.self && !v3Var.f18589b) {
                            org.telegram.ui.Components.voip.n nVar = rVar.f31663a;
                            if (rVar.J0 == null) {
                                rVar.K0 = false;
                                ImageView imageView = rVar.f31694x0;
                                if (imageView == null) {
                                    rVar.f31694x0 = new ImageView(rVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (nVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = nVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        rVar.f31694x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    rVar.f31694x0.setAlpha(0.0f);
                                } else {
                                    rVar.f31694x0.setAlpha(1.0f);
                                }
                                if (rVar.f31694x0.getParent() == null) {
                                    nVar.addView(rVar.f31694x0);
                                }
                                ((FrameLayout.LayoutParams) rVar.f31694x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                rVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.m(rVar, 1));
                                rVar.J0.addListener(new org.telegram.ui.Components.voip.p(rVar, 2));
                                rVar.J0.setDuration(400L);
                                rVar.J0.setInterpolator(org.telegram.ui.Components.gr.f26523f);
                                rVar.J0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (a50Var.j1() != 1) {
                    i11 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 == null || !sharedInstance3.isBluetoothHeadsetConnected()) {
                        i11 = 0;
                    }
                }
                a50Var.p5 = Integer.valueOf(i11);
                a50Var.Q1(true, true);
                a50Var.p5 = null;
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.qq(a50Var, i11, 8));
                return;
        }
    }
}
