package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.projection.MediaProjectionManager;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLRPC;
public final class p00 implements View.OnClickListener {
    public final int f48588a;
    public final c40 f48589b;

    public p00(c40 c40Var, int i7) {
        this.f48588a = i7;
        this.f48589b = c40Var;
    }

    @Override
    public final void onClick(View view) {
        String M0;
        int i7 = this.f48588a;
        int i10 = 2;
        c40 c40Var = this.f48589b;
        switch (i7) {
            case 0:
                if (c40Var.u1()) {
                    org.telegram.ui.Components.voip.g1.k(c40Var.Z1);
                    return;
                }
                org.telegram.ui.Components.p10.f36846f0 = false;
                c40Var.dismiss();
                return;
            case 1:
                c40Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = c40Var.Z1;
                    if (launchActivity != null) {
                        c40Var.Z1.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.r3 r3Var = c40Var.R2;
                if (r3Var != null && r3Var.f25219w) {
                    c40Var.M1(c40Var.F1.getTitleTextView());
                    return;
                }
                return;
            case 3:
                h20 h20Var = c40Var.f44627y1;
                if (h20Var.m()) {
                    h20Var.j();
                    return;
                } else {
                    h20Var.d();
                    return;
                }
            case 4:
                Editable text = c40Var.f44627y1.getText();
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = text.toString();
                tL_textWithEntities.entities = org.telegram.messenger.ui.b0(c40Var.f28612a).W(new CharSequence[]{text}, true, true);
                c40Var.F1(tL_textWithEntities);
                return;
            case 5:
                int R0 = c40Var.R0();
                if (R0 > 0 && R0 != Integer.MAX_VALUE) {
                    c40Var.H1.w0(0, R0, null);
                }
                org.telegram.ui.Components.et etVar = c40Var.f44627y1.f35413a;
                etVar.requestFocus();
                org.telegram.messenger.g0.K3(etVar);
                return;
            case 6:
                org.telegram.messenger.r3 r3Var2 = c40Var.R2;
                if (r3Var2 != null && !r3Var2.j() && !c40Var.u1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(c40Var.getContext(), false);
                        return;
                    }
                    return;
                }
                c40Var.m1(false);
                return;
            case 7:
                org.telegram.messenger.r3 r3Var3 = c40Var.R2;
                if (r3Var3 != null && r3Var3.f25219w) {
                    c40Var.M1(c40Var.F1.getTitleTextView());
                    return;
                }
                return;
            case 8:
                org.telegram.messenger.r3 r3Var4 = c40Var.R2;
                if (r3Var4 != null && r3Var4.f25219w) {
                    c40Var.M1(c40Var.F1.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ArrayList arrayList = c40Var.P3;
                org.telegram.ui.Components.zg0 zg0Var = c40Var.f44626x4;
                c40Var.R3.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (c40Var.f44630y4 == 18) {
                        c40Var.f44630y4 = 39;
                        zg0Var.P(39);
                        zg0Var.start();
                    } else {
                        zg0Var.N(0, false, false);
                        c40Var.f44630y4 = 18;
                        zg0Var.P(18);
                        zg0Var.start();
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) arrayList.get(i11);
                        org.telegram.messenger.s3 s3Var = yVar.f39603x;
                        if (s3Var.f25405a.self && !s3Var.f25406b) {
                            org.telegram.ui.Components.voip.u uVar = yVar.f39572a;
                            if (yVar.J0 == null) {
                                yVar.K0 = false;
                                ImageView imageView = yVar.f39604x0;
                                if (imageView == null) {
                                    yVar.f39604x0 = new ImageView(yVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (uVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = uVar.f39284e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        yVar.f39604x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    yVar.f39604x0.setAlpha(0.0f);
                                } else {
                                    yVar.f39604x0.setAlpha(1.0f);
                                }
                                if (yVar.f39604x0.getParent() == null) {
                                    uVar.addView(yVar.f39604x0);
                                }
                                ((FrameLayout.LayoutParams) yVar.f39604x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                yVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.t(yVar, 1));
                                yVar.J0.addListener(new org.telegram.ui.Components.voip.w(yVar, 2));
                                yVar.J0.setDuration(400L);
                                yVar.J0.setInterpolator(org.telegram.ui.Components.xq.f40310f);
                                yVar.J0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            case 10:
                if (c40Var.k1() != 1) {
                    i10 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 == null || !sharedInstance3.isBluetoothHeadsetConnected()) {
                        i10 = 0;
                    }
                }
                c40Var.f44591p5 = Integer.valueOf(i10);
                c40Var.T1(true, true);
                c40Var.f44591p5 = null;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.r2(c40Var, i10, 13));
                return;
            default:
                org.telegram.ui.ActionBar.r0 r0Var = c40Var.f44530b3;
                org.telegram.ui.ActionBar.z0 z0Var = c40Var.f44576m3;
                org.telegram.ui.ActionBar.z0 z0Var2 = c40Var.f44571l3;
                org.telegram.ui.ActionBar.z0 z0Var3 = c40Var.f44549g3;
                org.telegram.messenger.r3 r3Var5 = c40Var.R2;
                if (r3Var5 != null && !c40Var.R3.f39240b) {
                    if (r3Var5.f25201b.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.k6.Vg;
                        z0Var2.d(org.telegram.ui.ActionBar.k6.x0(null, i12, false), org.telegram.ui.ActionBar.k6.x0(null, i12, false));
                        z0Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.k6.f27987kh;
                        z0Var.d(org.telegram.ui.ActionBar.k6.x0(null, i13, false), org.telegram.ui.ActionBar.k6.x0(null, i13, false));
                        z0Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.k6.f27987kh;
                        z0Var2.d(org.telegram.ui.ActionBar.k6.x0(null, i14, false), org.telegram.ui.ActionBar.k6.x0(null, i14, false));
                        z0Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.k6.Vg;
                        z0Var.d(org.telegram.ui.ActionBar.k6.x0(null, i15, false), org.telegram.ui.ActionBar.k6.x0(null, i15, false));
                        z0Var.setChecked(false);
                    }
                    c40Var.f44533c2 = false;
                    r0Var.t(1);
                    r0Var.t(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            z0Var3.setIcon(2131232425);
                            if (VoIPService.getSharedInstance().currentBluetoothDeviceName != null) {
                                M0 = VoIPService.getSharedInstance().currentBluetoothDeviceName;
                            } else {
                                M0 = org.telegram.messenger.hd.M0(2131743504, null);
                            }
                            z0Var3.setSubtext(M0);
                        } else {
                            int i16 = 2131743501;
                            int i17 = 2131232428;
                            if (currentAudioRoute == 0) {
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i17 = 2131232426;
                                }
                                z0Var3.setIcon(i17);
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i16 = 2131743502;
                                }
                                z0Var3.setSubtext(org.telegram.messenger.hd.M0(i16, null));
                            } else if (currentAudioRoute == 1) {
                                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                    z0Var3.setIcon(2131232430);
                                    z0Var3.setSubtext(org.telegram.messenger.hd.M0(2131743500, null));
                                } else {
                                    z0Var3.setIcon(2131232428);
                                    z0Var3.setSubtext(org.telegram.messenger.hd.M0(2131743501, null));
                                }
                            }
                        }
                    }
                    c40Var.O1();
                    r0Var.U(null, null);
                    return;
                }
                return;
        }
    }
}
