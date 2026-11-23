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
public final class e20 extends LinearLayout implements VoIPService.StateListener, org.telegram.messenger.fs {
    public boolean E;
    public float F;
    public float G;
    public TextView f34541a;
    public TextView f34542b;
    public org.telegram.ui.Components.voip.r2 f34543c;
    public org.telegram.ui.Components.voip.r2 d;
    public p9 f34544e;
    public RectF f34545f;
    public Paint h;
    public LinearGradient f34546n;
    public int f34547r;
    public float f34548s;
    public float f34549w;
    public boolean f34550x;
    public int f34551y;

    public final void a(float f10, float f11, int i7) {
        this.f34547r = i7;
        this.f34548s = f10;
        this.f34549w = f11;
        invalidate();
        this.f34550x = true;
    }

    public final void b(boolean z10) {
        VoIPService sharedInstance;
        boolean z11;
        boolean z12;
        float f10;
        int i7;
        org.telegram.ui.Components.voip.r2 r2Var = this.d;
        org.telegram.ui.Components.voip.r2 r2Var2 = this.f34543c;
        if (r2Var2 != null && r2Var != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            boolean isBluetoothOn = sharedInstance.isBluetoothOn();
            if (!isBluetoothOn && sharedInstance.isSpeakerphoneOn()) {
                z11 = true;
            } else {
                z11 = false;
            }
            r2Var2.b(z11, z10);
            if (isBluetoothOn) {
                z12 = z10;
                r2Var2.c(2131230916, -1, 0, 0.1f, true, org.telegram.messenger.gd.N0(2131743253, null), false, z12);
            } else {
                z12 = z10;
                if (z11) {
                    r2Var2.c(2131230924, -1, 0, 0.3f, true, org.telegram.messenger.gd.N0(2131742989, null), false, z12);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    r2Var2.c(2131230919, -1, 0, 0.1f, true, org.telegram.messenger.gd.N0(2131743251, null), false, z12);
                } else {
                    r2Var2.c(2131230924, -1, 0, 0.1f, true, org.telegram.messenger.gd.N0(2131742989, null), false, z12);
                }
            }
            if (sharedInstance.mutedByAdmin()) {
                r2Var.c(2131230925, -1, i0.a.o(-1, 76), 0.1f, true, org.telegram.messenger.gd.N0(2131743041, null), true, z12);
            } else {
                if (sharedInstance.isMicMute()) {
                    f10 = 0.3f;
                } else {
                    f10 = 0.15f;
                }
                int o4 = i0.a.o(-1, (int) (f10 * 255.0f));
                if (sharedInstance.isMicMute()) {
                    i7 = 2131742980;
                } else {
                    i7 = 2131743043;
                }
                r2Var.c(2131230925, -1, o4, 0.1f, true, org.telegram.messenger.gd.N0(i7, null), sharedInstance.isMicMute(), z12);
            }
            invalidate();
        }
    }

    public final void c() {
        String str;
        TextView textView = this.f34542b;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                textView.setText(org.telegram.messenger.gd.N0(2131743142, "VoipGroupConnecting"));
                return;
            }
            TLRPC.GroupCall groupCall = sharedInstance.groupCall.f27034b;
            if (groupCall.rtmp_stream) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            textView.setText(org.telegram.messenger.gd.G(groupCall.participants_count, str, new Object[0]));
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean mutedByAdmin;
        if (i7 == org.telegram.messenger.ks.f25312w2) {
            c();
            if (VoIPService.getSharedInstance() != null && (mutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin()) != this.E) {
                this.E = mutedByAdmin;
                invalidate();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        long j3;
        String str;
        float f10;
        org.telegram.messenger.t3 t3Var;
        int i7 = this.f34551y;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            a9 a9Var = new a9((org.telegram.ui.ActionBar.i6) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            int[] iArr = org.telegram.ui.ActionBar.n6.f29673p8;
            long j10 = 0;
            if (chat != null) {
                j3 = chat.f28492id;
            } else {
                j3 = 0;
            }
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, iArr[a9.e(j3)], false);
            int[] iArr2 = org.telegram.ui.ActionBar.n6.f29693q8;
            if (chat != null) {
                j10 = chat.f28492id;
            }
            a9Var.i(x02, org.telegram.ui.ActionBar.n6.x0(null, iArr2[a9.e(j10)], false));
            a9Var.q(chat);
            if (chat != null) {
                this.f34544e.j(org.telegram.messenger.fc.e(chat.photo.photo_small), "50_50", a9Var, null);
            }
            if (sharedInstance.isConference() && (t3Var = sharedInstance.groupCall) != null) {
                if (t3Var.f27036e.size() == 1) {
                    str = org.telegram.messenger.gd.N0(2131751811, null);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 = 0; i10 < Math.min(3, sharedInstance.groupCall.f27036e.size()); i10++) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(org.telegram.messenger.n5.t(org.telegram.messenger.n5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.f27036e.get(i10)).peer)));
                    }
                    if (sharedInstance.groupCall.f27036e.size() > 3) {
                        sb2.append(" ");
                        sb2.append(org.telegram.messenger.gd.G(sharedInstance.groupCall.f27036e.size() - 3, "AndOther", new Object[0]));
                    }
                    str = sb2.toString();
                }
            } else if (!TextUtils.isEmpty(sharedInstance.groupCall.f27034b.title)) {
                str = sharedInstance.groupCall.f27034b.title;
            } else if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            if (str != null) {
                str = str.replace("\n", " ").replaceAll(" +", " ").trim();
            }
            this.f34541a.setText(str);
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
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.f25312w2);
        b(false);
    }

    @Override
    public final void onAudioSettingsChanged() {
        b(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.t0.c(this, z10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        org.telegram.messenger.ks.f(this.f34551y).n(this, org.telegram.messenger.ks.f25312w2);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e20.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(230.0f), 1073741824), i10);
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.t0.d(this, i7, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.t0.f(this, i7);
    }

    @Override
    public final void onStateChanged(int i7) {
        c();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }
}
