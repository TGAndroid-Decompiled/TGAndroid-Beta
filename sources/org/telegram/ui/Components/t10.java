package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class t10 extends LinearLayout implements VoIPService.StateListener, org.telegram.messenger.ls {
    public boolean D;
    public float E;
    public float F;
    public TextView f38177a;
    public TextView f38178b;
    public org.telegram.ui.Components.voip.n2 f38179c;
    public org.telegram.ui.Components.voip.n2 d;
    public l9 f38180e;
    public RectF f38181f;
    public Paint h;
    public LinearGradient f38182n;
    public int f38183r;
    public float f38184s;
    public float f38185w;
    public boolean f38186x;
    public int f38187y;

    public final void a(float f10, float f11, int i7) {
        this.f38183r = i7;
        this.f38184s = f10;
        this.f38185w = f11;
        invalidate();
        this.f38186x = true;
    }

    public final void b(boolean z9) {
        VoIPService sharedInstance;
        boolean z10;
        boolean z11;
        float f10;
        int i7;
        org.telegram.ui.Components.voip.n2 n2Var = this.d;
        org.telegram.ui.Components.voip.n2 n2Var2 = this.f38179c;
        if (n2Var2 != null && n2Var != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            boolean isBluetoothOn = sharedInstance.isBluetoothOn();
            if (!isBluetoothOn && sharedInstance.isSpeakerphoneOn()) {
                z10 = true;
            } else {
                z10 = false;
            }
            n2Var2.b(z10, z9);
            if (isBluetoothOn) {
                z11 = z9;
                n2Var2.c(2131230916, -1, 0, 0.1f, true, org.telegram.messenger.hd.M0(2131743504, null), false, z11);
            } else {
                z11 = z9;
                if (z10) {
                    n2Var2.c(2131230924, -1, 0, 0.3f, true, org.telegram.messenger.hd.M0(2131743240, null), false, z11);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    n2Var2.c(2131230919, -1, 0, 0.1f, true, org.telegram.messenger.hd.M0(2131743502, null), false, z11);
                } else {
                    n2Var2.c(2131230924, -1, 0, 0.1f, true, org.telegram.messenger.hd.M0(2131743240, null), false, z11);
                }
            }
            if (sharedInstance.mutedByAdmin()) {
                n2Var.c(2131230925, -1, i0.a.o(-1, 76), 0.1f, true, org.telegram.messenger.hd.M0(2131743292, null), true, z11);
            } else {
                if (sharedInstance.isMicMute()) {
                    f10 = 0.3f;
                } else {
                    f10 = 0.15f;
                }
                int o4 = i0.a.o(-1, (int) (f10 * 255.0f));
                if (sharedInstance.isMicMute()) {
                    i7 = 2131743231;
                } else {
                    i7 = 2131743294;
                }
                n2Var.c(2131230925, -1, o4, 0.1f, true, org.telegram.messenger.hd.M0(i7, null), sharedInstance.isMicMute(), z11);
            }
            invalidate();
        }
    }

    public final void c() {
        String str;
        TextView textView = this.f38178b;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                textView.setText(org.telegram.messenger.hd.M0(2131743393, "VoipGroupConnecting"));
                return;
            }
            TLRPC.GroupCall groupCall = sharedInstance.groupCall.f25201b;
            if (groupCall.rtmp_stream) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            textView.setText(org.telegram.messenger.hd.G(groupCall.participants_count, str, new Object[0]));
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean mutedByAdmin;
        if (i7 == org.telegram.messenger.qs.f25082w2) {
            c();
            if (VoIPService.getSharedInstance() != null && (mutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin()) != this.D) {
                this.D = mutedByAdmin;
                invalidate();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        long j3;
        String str;
        float f10;
        org.telegram.messenger.r3 r3Var;
        int i7 = this.f38187y;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            int[] iArr = org.telegram.ui.ActionBar.k6.f28070p8;
            long j10 = 0;
            if (chat != null) {
                j3 = chat.f26952id;
            } else {
                j3 = 0;
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, iArr[w8.e(j3)], false);
            int[] iArr2 = org.telegram.ui.ActionBar.k6.f28090q8;
            if (chat != null) {
                j10 = chat.f26952id;
            }
            w8Var.i(x02, org.telegram.ui.ActionBar.k6.x0(null, iArr2[w8.e(j10)], false));
            w8Var.q(chat);
            if (chat != null) {
                this.f38180e.j(org.telegram.messenger.hc.e(chat.photo.photo_small), "50_50", w8Var, null);
            }
            if (sharedInstance.isConference() && (r3Var = sharedInstance.groupCall) != null) {
                if (r3Var.f25203e.size() == 1) {
                    str = org.telegram.messenger.hd.M0(2131751823, null);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 = 0; i10 < Math.min(3, sharedInstance.groupCall.f25203e.size()); i10++) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(org.telegram.messenger.m5.t(org.telegram.messenger.m5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.f25203e.get(i10)).peer)));
                    }
                    if (sharedInstance.groupCall.f25203e.size() > 3) {
                        sb2.append(" ");
                        sb2.append(org.telegram.messenger.hd.G(sharedInstance.groupCall.f25203e.size() - 3, "AndOther", new Object[0]));
                    }
                    str = sb2.toString();
                }
            } else if (!TextUtils.isEmpty(sharedInstance.groupCall.f25201b.title)) {
                str = sharedInstance.groupCall.f25201b.title;
            } else if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            if (str != null) {
                str = str.replace("\n", " ").replaceAll(" +", " ").trim();
            }
            this.f38177a.setText(str);
            c();
            sharedInstance.registerStateListener(this);
            if (VoIPService.getSharedInstance() != null) {
                this.D = VoIPService.getSharedInstance().mutedByAdmin();
            }
            float f11 = 0.0f;
            if (this.D) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.F = f10;
            this.E = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.D) ? 1.0f : 1.0f;
        }
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f25082w2);
        b(false);
    }

    @Override
    public final void onAudioSettingsChanged() {
        b(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z9) {
        org.telegram.messenger.voip.s0.c(this, z9);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        org.telegram.messenger.qs.f(this.f38187y).n(this, org.telegram.messenger.qs.f25082w2);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t10.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(230.0f), 1073741824), i10);
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.s0.d(this, i7, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z9) {
        org.telegram.messenger.voip.s0.e(this, z9);
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.s0.f(this, i7);
    }

    @Override
    public final void onStateChanged(int i7) {
        c();
    }

    @Override
    public final void onVideoAvailableChange(boolean z9) {
        org.telegram.messenger.voip.s0.h(this, z9);
    }
}
