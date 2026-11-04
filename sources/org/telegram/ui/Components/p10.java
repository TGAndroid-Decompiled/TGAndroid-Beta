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
public final class p10 extends LinearLayout implements VoIPService.StateListener, org.telegram.messenger.cs {
    public boolean E;
    public float F;
    public float G;
    public TextView f37018a;
    public TextView f37019b;
    public org.telegram.ui.Components.voip.c2 f37020c;
    public org.telegram.ui.Components.voip.c2 d;
    public k9 f37021e;
    public RectF f37022f;
    public Paint h;
    public LinearGradient f37023n;
    public int f37024r;
    public float f37025s;
    public float f37026w;
    public boolean f37027x;
    public int f37028y;

    public final void a(float f10, float f11, int i3) {
        this.f37024r = i3;
        this.f37025s = f10;
        this.f37026w = f11;
        invalidate();
        this.f37027x = true;
    }

    public final void b(boolean z10) {
        VoIPService sharedInstance;
        boolean z11;
        boolean z12;
        float f10;
        int i3;
        org.telegram.ui.Components.voip.c2 c2Var = this.d;
        org.telegram.ui.Components.voip.c2 c2Var2 = this.f37020c;
        if (c2Var2 != null && c2Var != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            boolean isBluetoothOn = sharedInstance.isBluetoothOn();
            if (!isBluetoothOn && sharedInstance.isSpeakerphoneOn()) {
                z11 = true;
            } else {
                z11 = false;
            }
            c2Var2.b(z11, z10);
            if (isBluetoothOn) {
                z12 = z10;
                c2Var2.c(2131230916, -1, 0, 0.1f, true, org.telegram.messenger.bd.M0(2131743513, null), false, z12);
            } else {
                z12 = z10;
                if (z11) {
                    c2Var2.c(2131230924, -1, 0, 0.3f, true, org.telegram.messenger.bd.M0(2131743249, null), false, z12);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    c2Var2.c(2131230919, -1, 0, 0.1f, true, org.telegram.messenger.bd.M0(2131743511, null), false, z12);
                } else {
                    c2Var2.c(2131230924, -1, 0, 0.1f, true, org.telegram.messenger.bd.M0(2131743249, null), false, z12);
                }
            }
            if (sharedInstance.mutedByAdmin()) {
                c2Var.c(2131230925, -1, i0.a.o(-1, 76), 0.1f, true, org.telegram.messenger.bd.M0(2131743301, null), true, z12);
            } else {
                if (sharedInstance.isMicMute()) {
                    f10 = 0.3f;
                } else {
                    f10 = 0.15f;
                }
                int o10 = i0.a.o(-1, (int) (f10 * 255.0f));
                if (sharedInstance.isMicMute()) {
                    i3 = 2131743240;
                } else {
                    i3 = 2131743303;
                }
                c2Var.c(2131230925, -1, o10, 0.1f, true, org.telegram.messenger.bd.M0(i3, null), sharedInstance.isMicMute(), z12);
            }
            invalidate();
        }
    }

    public final void c() {
        String str;
        TextView textView = this.f37019b;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                textView.setText(org.telegram.messenger.bd.M0(2131743402, "VoipGroupConnecting"));
                return;
            }
            TLRPC.GroupCall groupCall = sharedInstance.groupCall.f25049b;
            if (groupCall.rtmp_stream) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            textView.setText(org.telegram.messenger.bd.G(groupCall.participants_count, str, new Object[0]));
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        boolean mutedByAdmin;
        if (i3 == org.telegram.messenger.hs.f23328w2) {
            c();
            if (VoIPService.getSharedInstance() != null && (mutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin()) != this.E) {
                this.E = mutedByAdmin;
                invalidate();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        long j10;
        String str;
        float f10;
        org.telegram.messenger.r3 r3Var;
        int i3 = this.f37028y;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            int[] iArr = org.telegram.ui.ActionBar.k6.f28103p8;
            long j11 = 0;
            if (chat != null) {
                j10 = chat.f27001id;
            } else {
                j10 = 0;
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, iArr[u8.e(j10)], false);
            int[] iArr2 = org.telegram.ui.ActionBar.k6.f28123q8;
            if (chat != null) {
                j11 = chat.f27001id;
            }
            u8Var.i(x02, org.telegram.ui.ActionBar.k6.x0(null, iArr2[u8.e(j11)], false));
            u8Var.q(chat);
            if (chat != null) {
                this.f37021e.j(org.telegram.messenger.ac.e(chat.photo.photo_small), "50_50", u8Var, null);
            }
            if (sharedInstance.isConference() && (r3Var = sharedInstance.groupCall) != null) {
                if (r3Var.f25051e.size() == 1) {
                    str = org.telegram.messenger.bd.M0(2131751823, null);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 = 0; i10 < Math.min(3, sharedInstance.groupCall.f25051e.size()); i10++) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(org.telegram.messenger.m5.t(org.telegram.messenger.m5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.f25051e.get(i10)).peer)));
                    }
                    if (sharedInstance.groupCall.f25051e.size() > 3) {
                        sb2.append(" ");
                        sb2.append(org.telegram.messenger.bd.G(sharedInstance.groupCall.f25051e.size() - 3, "AndOther", new Object[0]));
                    }
                    str = sb2.toString();
                }
            } else if (!TextUtils.isEmpty(sharedInstance.groupCall.f25049b.title)) {
                str = sharedInstance.groupCall.f25049b.title;
            } else if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            if (str != null) {
                str = str.replace("\n", " ").replaceAll(" +", " ").trim();
            }
            this.f37018a.setText(str);
            c();
            sharedInstance.registerStateListener(this);
            if (VoIPService.getSharedInstance() != null) {
                this.E = VoIPService.getSharedInstance().mutedByAdmin();
            }
            float f11 = 0.0f;
            if (this.E) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.G = f10;
            this.F = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.E) ? 1.0f : 1.0f;
        }
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23328w2);
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
    public final void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.s0.c(this, z10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        org.telegram.messenger.hs.f(this.f37028y).n(this, org.telegram.messenger.hs.f23328w2);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p10.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(230.0f), 1073741824), i10);
    }

    @Override
    public final void onMediaStateUpdated(int i3, int i10) {
        org.telegram.messenger.voip.s0.d(this, i3, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.s0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i3) {
        org.telegram.messenger.voip.s0.f(this, i3);
    }

    @Override
    public final void onStateChanged(int i3) {
        c();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.s0.h(this, z10);
    }
}
