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
public final class k20 extends LinearLayout implements VoIPService.StateListener, org.telegram.messenger.us {
    public boolean D;
    public float E;
    public float F;
    public TextView f27612a;
    public TextView f27613b;
    public org.telegram.ui.Components.voip.b2 f27614c;
    public org.telegram.ui.Components.voip.b2 d;
    public g9 e;
    public RectF f27615f;
    public Paint h;
    public LinearGradient f27616n;
    public int f27617r;
    public float f27618s;
    public float f27619w;
    public boolean f27620x;
    public int f27621y;

    public final void a(float f7, float f10, int i10) {
        this.f27617r = i10;
        this.f27618s = f7;
        this.f27619w = f10;
        invalidate();
        this.f27620x = true;
    }

    public final void b(boolean z10) {
        VoIPService sharedInstance;
        boolean z11;
        boolean z12;
        float f7;
        int i10;
        org.telegram.ui.Components.voip.b2 b2Var = this.d;
        org.telegram.ui.Components.voip.b2 b2Var2 = this.f27614c;
        if (b2Var2 != null && b2Var != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            boolean isBluetoothOn = sharedInstance.isBluetoothOn();
            if (!isBluetoothOn && sharedInstance.isSpeakerphoneOn()) {
                z11 = true;
            } else {
                z11 = false;
            }
            b2Var2.b(z11, z10);
            if (isBluetoothOn) {
                z12 = z10;
                b2Var2.c(2131230916, -1, 0, 0.1f, true, org.telegram.messenger.cd.L0(2131743529, null), false, z12);
            } else {
                z12 = z10;
                if (z11) {
                    b2Var2.c(2131230924, -1, 0, 0.3f, true, org.telegram.messenger.cd.L0(2131743265, null), false, z12);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    b2Var2.c(2131230919, -1, 0, 0.1f, true, org.telegram.messenger.cd.L0(2131743527, null), false, z12);
                } else {
                    b2Var2.c(2131230924, -1, 0, 0.1f, true, org.telegram.messenger.cd.L0(2131743265, null), false, z12);
                }
            }
            if (sharedInstance.mutedByAdmin()) {
                b2Var.c(2131230925, -1, i0.b.o(-1, 76), 0.1f, true, org.telegram.messenger.cd.L0(2131743317, null), true, z12);
            } else {
                if (sharedInstance.isMicMute()) {
                    f7 = 0.3f;
                } else {
                    f7 = 0.15f;
                }
                int o10 = i0.b.o(-1, (int) (f7 * 255.0f));
                if (sharedInstance.isMicMute()) {
                    i10 = 2131743256;
                } else {
                    i10 = 2131743319;
                }
                b2Var.c(2131230925, -1, o10, 0.1f, true, org.telegram.messenger.cd.L0(i10, null), sharedInstance.isMicMute(), z12);
            }
            invalidate();
        }
    }

    public final void c() {
        String str;
        TextView textView = this.f27613b;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                textView.setText(org.telegram.messenger.cd.L0(2131743418, "VoipGroupConnecting"));
                return;
            }
            TLRPC.GroupCall groupCall = sharedInstance.groupCall.f18228b;
            if (groupCall.rtmp_stream) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            textView.setText(org.telegram.messenger.cd.G(groupCall.participants_count, str, new Object[0]));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean mutedByAdmin;
        if (i10 == org.telegram.messenger.zs.f19713w2) {
            c();
            if (VoIPService.getSharedInstance() != null && (mutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin()) != this.D) {
                this.D = mutedByAdmin;
                invalidate();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        long j10;
        String str;
        float f7;
        org.telegram.messenger.u3 u3Var;
        int i10 = this.f27621y;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            int[] iArr = org.telegram.ui.ActionBar.t6.f21154p8;
            long j11 = 0;
            if (chat != null) {
                j10 = chat.f19793id;
            } else {
                j10 = 0;
            }
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, iArr[r8.e(j10)], false);
            int[] iArr2 = org.telegram.ui.ActionBar.t6.f21171q8;
            if (chat != null) {
                j11 = chat.f19793id;
            }
            r8Var.i(x02, org.telegram.ui.ActionBar.t6.x0(null, iArr2[r8.e(j11)], false));
            r8Var.q(chat);
            if (chat != null) {
                this.e.j(org.telegram.messenger.ic.e(chat.photo.photo_small), "50_50", r8Var, null);
            }
            if (sharedInstance.isConference() && (u3Var = sharedInstance.groupCall) != null) {
                if (u3Var.e.size() == 1) {
                    str = org.telegram.messenger.cd.L0(2131751823, null);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < Math.min(3, sharedInstance.groupCall.e.size()); i11++) {
                        if (i11 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(org.telegram.messenger.o5.t(org.telegram.messenger.o5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.e.get(i11)).peer)));
                    }
                    if (sharedInstance.groupCall.e.size() > 3) {
                        sb2.append(" ");
                        sb2.append(org.telegram.messenger.cd.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
                    }
                    str = sb2.toString();
                }
            } else if (!TextUtils.isEmpty(sharedInstance.groupCall.f18228b.title)) {
                str = sharedInstance.groupCall.f18228b.title;
            } else if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            if (str != null) {
                str = str.replace("\n", " ").replaceAll(" +", " ").trim();
            }
            this.f27612a.setText(str);
            c();
            sharedInstance.registerStateListener(this);
            if (VoIPService.getSharedInstance() != null) {
                this.D = VoIPService.getSharedInstance().mutedByAdmin();
            }
            float f10 = 0.0f;
            if (this.D) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.F = f7;
            this.E = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.D) ? 1.0f : 1.0f;
        }
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.f19713w2);
        b(false);
    }

    @Override
    public final void onAudioSettingsChanged() {
        b(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.y0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.y0.c(this, z10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        org.telegram.messenger.zs.f(this.f27621y).n(this, org.telegram.messenger.zs.f19713w2);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k20.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(230.0f), 1073741824), i11);
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.y0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.y0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.y0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        c();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.y0.h(this, z10);
    }
}
